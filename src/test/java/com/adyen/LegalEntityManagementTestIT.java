package com.adyen;

import com.adyen.enums.Environment;
import com.adyen.model.legalentitymanagement.*;
import com.adyen.service.legalentitymanagement.HostedOnboardingApi;
import com.adyen.service.legalentitymanagement.LegalEntitiesApi;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.images.builder.ImageFromDockerfile;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LegalEntityManagementTestIT {

    private static Client client;
    private static String uri;

    // define path to OpenAPI file
    private final static String OPENAPI_FILE = "src/test/resources/LegalEntityService-v3.yaml";

    // load testcontainer
    @ClassRule
    public static GenericContainer container = new GenericContainer(
            new ImageFromDockerfile("my-test-cont", false)
                    .withFileFromFile("openapi.yaml", new File(OPENAPI_FILE))
                    .withFileFromFile("Dockerfile", new File("src/test/resources/Dockerfile"))
    )
            .withExposedPorts(8080);

    @BeforeClass
    public static void setup() {
        // init client
        client = new Client("Your X-API-KEY", Environment.TEST);
        // define testcontainer uri
        uri = "http://" + container.getHost() + ":" + container.getFirstMappedPort();
    }

    @Test
    public void LegalEntitiesCreateTest() throws Exception {
        LegalEntitiesApi service = new LegalEntitiesApi(client, uri);

        LegalEntityInfoRequiredType request = new LegalEntityInfoRequiredType();
        request.type(LegalEntityInfoRequiredType.TypeEnum.INDIVIDUAL);
        request.individual(
                new Individual().residentialAddress(
                        new Address()
                                .city("Amsterdam")
                                .country("NL")
                                .postalCode("1011DJ")
                                .street("Simon Carmiggeltstraat 6 - 50")
                )
                        .name(new Name()
                                .firstName("Shelly")
                                .lastName("Eller"))
                        .birthData(new BirthData()
                                .dateOfBirth("1990-06-21"))
                        .email("s.eller@example.com")
        );

        LegalEntity response = service.createLegalEntity(request);

        assertEquals(LegalEntity.TypeEnum.INDIVIDUAL, response.getType());
        assertEquals("LE00000000000000000000001", response.getId());
    }

    @Test
    public void LegalEntitiesCreateOnboardingLinkTest() throws Exception {
        HostedOnboardingApi service = new HostedOnboardingApi(client, uri);

        OnboardingLinkInfo request = new OnboardingLinkInfo()
                .themeId("YOUR_THEME_ID")
                .redirectUrl("https://your.redirect-url.com/")
                .locale("nl-NL");

        OnboardingLink response = service.getLinkToAdyenhostedOnboardingPage("AH001", request);

        assertNotNull(response.getUrl());
    }
}
