package com.adyen;

import com.adyen.enums.Environment;
import com.adyen.model.checkout.*;
import com.adyen.service.checkout.ModificationsApi;
import com.adyen.service.checkout.PaymentsApi;
import com.adyen.service.checkout.UtilityApi;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckoutTestIT extends BaseIntegrationTest {

    private static Client client;
    private static String uri;

    @BeforeClass
    public static void setup() {
        // init client
        client = new Client("Your X-API-KEY", Environment.TEST);
        // define testcontainer uri
        uri = "http://" + container.getHost() + ":" + container.getFirstMappedPort();
    }

    @Test
    public void TestApplePaySessionsSuccessCall() throws Exception {
        UtilityApi checkout = new UtilityApi(client, uri);

        ApplePaySessionRequest createApplePaySessionRequest = new ApplePaySessionRequest();
        createApplePaySessionRequest.setDisplayName("YOUR_MERCHANT_NAME");
        createApplePaySessionRequest.setDomainName("YOUR_DOMAIN_NAME");
        createApplePaySessionRequest.setMerchantIdentifier("YOUR_MERCHANT_ID");

        ApplePaySessionResponse applePaySessionResponse = checkout.getApplePaySession(createApplePaySessionRequest);

        assertEquals("eyJ2Z...", applePaySessionResponse.getData());
    }

    @Test
    public void TestCancelAuthorisedPayment() throws Exception {
        ModificationsApi checkout = new ModificationsApi(client, uri);

        StandalonePaymentCancelRequest createStandalonePaymentCancelRequest  = new StandalonePaymentCancelRequest();
        createStandalonePaymentCancelRequest.setMerchantAccount("YOUR_MERCHANT_ACCOUNT");
        createStandalonePaymentCancelRequest.setReference("YOUR_UNIQUE_REFERENCE_FOR_THE_CANCELLATION");
        createStandalonePaymentCancelRequest.setPaymentReference("YOUR_UNIQUE_REFERENCE_FOR_THE_PAYMENT");

        StandalonePaymentCancelResponse standalonePaymentCancelResource = checkout.cancelAuthorisedPayment(createStandalonePaymentCancelRequest);

        assertEquals(StandalonePaymentCancelResponse.StatusEnum.RECEIVED, standalonePaymentCancelResource.getStatus());
        assertEquals("993617894906488A", standalonePaymentCancelResource.getPspReference());

    }

    @Test
    public void TestCardDetailsRequestSuccess() throws Exception {
        PaymentsApi checkout = new PaymentsApi(client, uri);

        CardDetailsRequest cardDetailsRequest = new CardDetailsRequest();
        cardDetailsRequest.setCardNumber("411111");
        cardDetailsRequest.setMerchantAccount("YOUR_MERCHANT_ACCOUNT");

        CardDetailsResponse cardDetailsResponse = checkout.cardDetails(cardDetailsRequest);

        assertEquals(2, cardDetailsResponse.getBrands().size());
        assertEquals("visa", cardDetailsResponse.getBrands().get(0).getType());
        assertEquals(true, cardDetailsResponse.getBrands().get(0).getSupported());
    }

    @Test
    public void TestDonationsSuccessCall() throws Exception {
        PaymentsApi checkout = new PaymentsApi(client, uri);

        DonationPaymentRequest paymentDonationRequest = new DonationPaymentRequest();
        Amount amount = new Amount().currency("EUR").value(1000L);
        paymentDonationRequest.setAmount(amount);
        paymentDonationRequest.setReference("YOUR_DONATION_REFERENCE");
        CardDetails cardDetails = new CardDetails().type(CardDetails.TypeEnum.SCHEME);
        paymentDonationRequest.paymentMethod(new CheckoutPaymentMethod(cardDetails));
        paymentDonationRequest.setDonationToken("YOUR_DONATION_TOKEN");
        paymentDonationRequest.setDonationOriginalPspReference("991559660454807J");
        paymentDonationRequest.setDonationAccount("CHARITY_ACCOUNT");
        paymentDonationRequest.setReturnUrl("https://your-company.com/...");
        paymentDonationRequest.setMerchantAccount("YOUR_MERCHANT_ACCOUNT");
        paymentDonationRequest.setShopperInteraction(DonationPaymentRequest.ShopperInteractionEnum.CONTAUTH);

        DonationPaymentResponse donationResponse = checkout.donations(paymentDonationRequest);

        assertEquals(PaymentResponse.ResultCodeEnum.AUTHORISED ,donationResponse.getPayment().getResultCode());
        assertEquals("UNIQUE_RESOURCE_ID", donationResponse.getId());
        assertEquals(DonationPaymentResponse.StatusEnum.COMPLETED, donationResponse.getStatus());
    }
}
