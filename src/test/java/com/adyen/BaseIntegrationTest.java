/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2021 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen;

import org.junit.ClassRule;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.images.builder.ImageFromDockerfile;

import java.io.File;

public class BaseIntegrationTest {

    // define path to OpenAPI file
    private final static String OPENAPI_FILE = "src/test/resources/CheckoutService-v70.yaml";

    // load testcontainer
    @ClassRule
    public static GenericContainer container = new GenericContainer(
            new ImageFromDockerfile("my-test-cont", false)
                    .withFileFromFile("openapi.yaml", new File(OPENAPI_FILE))
                    .withFileFromFile("Dockerfile", new File("src/test/resources/Dockerfile"))
    )
            .withExposedPorts(8080);

}
