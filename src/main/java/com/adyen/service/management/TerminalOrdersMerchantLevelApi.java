/*
 * Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.management;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.management.BillingEntitiesResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.management.ShippingLocation;
import com.adyen.model.management.ShippingLocationsResponse;
import com.adyen.model.management.TerminalModelsResponse;
import com.adyen.model.management.TerminalOrder;
import com.adyen.model.management.TerminalOrderRequest;
import com.adyen.model.management.TerminalOrdersResponse;
import com.adyen.model.management.TerminalProductsResponse;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TerminalOrdersMerchantLevelApi extends Service {

    public static final String API_VERSION = "3";

    protected String baseURL;

    /**
    * Terminal orders - merchant level constructor in {@link com.adyen.service.management package}.
    * @param client {@link Client } (required)
    */
    public TerminalOrdersMerchantLevelApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://management-test.adyen.com/v3");
    }

    /**
    * Terminal orders - merchant level constructor in {@link com.adyen.service.management package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public TerminalOrdersMerchantLevelApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Cancel an order
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param orderId {@link String } The unique identifier of the order. (required)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder cancelOrder(String merchantId, String orderId) throws ApiException, IOException {
        return cancelOrder(merchantId, orderId, null);
    }

    /**
    * Cancel an order
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param orderId {@link String } The unique identifier of the order. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder cancelOrder(String merchantId, String orderId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        if (orderId == null) {
            throw new IllegalArgumentException("Please provide the orderId path parameter");
        }
        pathParams.put("orderId", orderId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/terminalOrders/{orderId}/cancel", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return TerminalOrder.fromJson(jsonResult);
    }

    /**
    * Create an order
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param terminalOrderRequest {@link TerminalOrderRequest }  (required)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder createOrder(String merchantId, TerminalOrderRequest terminalOrderRequest) throws ApiException, IOException {
        return createOrder(merchantId, terminalOrderRequest, null);
    }

    /**
    * Create an order
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param terminalOrderRequest {@link TerminalOrderRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder createOrder(String merchantId, TerminalOrderRequest terminalOrderRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);

        String requestBody = terminalOrderRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/terminalOrders", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return TerminalOrder.fromJson(jsonResult);
    }

    /**
    * Create a shipping location
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param shippingLocation {@link ShippingLocation }  (required)
    * @return {@link ShippingLocation }
    * @throws ApiException if fails to make API call
    */
    public ShippingLocation createShippingLocation(String merchantId, ShippingLocation shippingLocation) throws ApiException, IOException {
        return createShippingLocation(merchantId, shippingLocation, null);
    }

    /**
    * Create a shipping location
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param shippingLocation {@link ShippingLocation }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ShippingLocation }
    * @throws ApiException if fails to make API call
    */
    public ShippingLocation createShippingLocation(String merchantId, ShippingLocation shippingLocation, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);

        String requestBody = shippingLocation.toJson();
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/shippingLocations", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return ShippingLocation.fromJson(jsonResult);
    }

    /**
    * Get an order
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param orderId {@link String } The unique identifier of the order. (required)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder getOrder(String merchantId, String orderId) throws ApiException, IOException {
        return getOrder(merchantId, orderId, null);
    }

    /**
    * Get an order
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param orderId {@link String } The unique identifier of the order. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder getOrder(String merchantId, String orderId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        if (orderId == null) {
            throw new IllegalArgumentException("Please provide the orderId path parameter");
        }
        pathParams.put("orderId", orderId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/terminalOrders/{orderId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return TerminalOrder.fromJson(jsonResult);
    }

    /**
    * Get a list of billing entities
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @return {@link BillingEntitiesResponse }
    * @throws ApiException if fails to make API call
    */
    public BillingEntitiesResponse listBillingEntities(String merchantId) throws ApiException, IOException {
        return listBillingEntities(merchantId, null,  null);
    }

    /**
    * Get a list of billing entities
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param name {@link String } Query: The name of the billing entity. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link BillingEntitiesResponse }
    * @throws ApiException if fails to make API call
    */
    public BillingEntitiesResponse listBillingEntities(String merchantId, String name, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (name != null) {
        queryParams.put("name", name);
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/billingEntities", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return BillingEntitiesResponse.fromJson(jsonResult);
    }

    /**
    * Get a list of orders
    *
    * @param merchantId {@link String }  (required)
    * @return {@link TerminalOrdersResponse }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrdersResponse listOrders(String merchantId) throws ApiException, IOException {
        return listOrders(merchantId, null,  null,  null,  null,  null);
    }

    /**
    * Get a list of orders
    *
    * @param merchantId {@link String }  (required)
    * @param customerOrderReference {@link String } Query: Your purchase order number. (optional)
    * @param status {@link String } Query: The order status. Possible values (not case-sensitive): Placed, Confirmed, Cancelled, Shipped, Delivered. (optional)
    * @param offset {@link Integer } Query: The number of orders to skip. (optional)
    * @param limit {@link Integer } Query: The number of orders to return. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalOrdersResponse }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrdersResponse listOrders(String merchantId, String customerOrderReference, String status, Integer offset, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (customerOrderReference != null) {
        queryParams.put("customerOrderReference", customerOrderReference);
        }
        if (status != null) {
        queryParams.put("status", status);
        }
        if (offset != null) {
        queryParams.put("offset", offset.toString());
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/terminalOrders", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return TerminalOrdersResponse.fromJson(jsonResult);
    }

    /**
    * Get a list of shipping locations
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @return {@link ShippingLocationsResponse }
    * @throws ApiException if fails to make API call
    */
    public ShippingLocationsResponse listShippingLocations(String merchantId) throws ApiException, IOException {
        return listShippingLocations(merchantId, null,  null,  null,  null);
    }

    /**
    * Get a list of shipping locations
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param name {@link String } Query: The name of the shipping location. (optional)
    * @param offset {@link Integer } Query: The number of locations to skip. (optional)
    * @param limit {@link Integer } Query: The number of locations to return. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ShippingLocationsResponse }
    * @throws ApiException if fails to make API call
    */
    public ShippingLocationsResponse listShippingLocations(String merchantId, String name, Integer offset, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (name != null) {
        queryParams.put("name", name);
        }
        if (offset != null) {
        queryParams.put("offset", offset.toString());
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/shippingLocations", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return ShippingLocationsResponse.fromJson(jsonResult);
    }

    /**
    * Get a list of terminal models
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @return {@link TerminalModelsResponse }
    * @throws ApiException if fails to make API call
    */
    public TerminalModelsResponse listTerminalModels(String merchantId) throws ApiException, IOException {
        return listTerminalModels(merchantId, null);
    }

    /**
    * Get a list of terminal models
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalModelsResponse }
    * @throws ApiException if fails to make API call
    */
    public TerminalModelsResponse listTerminalModels(String merchantId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/terminalModels", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return TerminalModelsResponse.fromJson(jsonResult);
    }

    /**
    * Get a list of terminal products
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param country {@link String } The country to return products for, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. For example, **US** (required)
    * @return {@link TerminalProductsResponse }
    * @throws ApiException if fails to make API call
    */
    public TerminalProductsResponse listTerminalProducts(String merchantId, String country) throws ApiException, IOException {
        return listTerminalProducts(merchantId, country,  null,  null,  null,  null);
    }

    /**
    * Get a list of terminal products
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param country {@link String } Query: The country to return products for, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. For example, **US** (required)
    * @param terminalModelId {@link String } Query: The terminal model to return products for. Use the ID returned in the [GET &#x60;/terminalModels&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/merchants/{merchantId}/terminalModels) response. For example, **Verifone.M400** (optional)
    * @param offset {@link Integer } Query: The number of products to skip. (optional)
    * @param limit {@link Integer } Query: The number of products to return. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalProductsResponse }
    * @throws ApiException if fails to make API call
    */
    public TerminalProductsResponse listTerminalProducts(String merchantId, String country, String terminalModelId, Integer offset, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (country != null) {
        queryParams.put("country", country);
        }
        if (terminalModelId != null) {
        queryParams.put("terminalModelId", terminalModelId);
        }
        if (offset != null) {
        queryParams.put("offset", offset.toString());
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/terminalProducts", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return TerminalProductsResponse.fromJson(jsonResult);
    }

    /**
    * Update an order
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param orderId {@link String } The unique identifier of the order. (required)
    * @param terminalOrderRequest {@link TerminalOrderRequest }  (required)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder updateOrder(String merchantId, String orderId, TerminalOrderRequest terminalOrderRequest) throws ApiException, IOException {
        return updateOrder(merchantId, orderId, terminalOrderRequest, null);
    }

    /**
    * Update an order
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param orderId {@link String } The unique identifier of the order. (required)
    * @param terminalOrderRequest {@link TerminalOrderRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder updateOrder(String merchantId, String orderId, TerminalOrderRequest terminalOrderRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        if (orderId == null) {
            throw new IllegalArgumentException("Please provide the orderId path parameter");
        }
        pathParams.put("orderId", orderId);

        String requestBody = terminalOrderRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/terminalOrders/{orderId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return TerminalOrder.fromJson(jsonResult);
    }
}
