/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.counterparty;

import com.mercoa.api.core.ApiError;
import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.MediaTypes;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.resources.entity.counterparty.requests.FindPayeeCounterpartiesRequest;
import com.mercoa.api.resources.entity.counterparty.requests.FindPayorCounterpartiesRequest;
import com.mercoa.api.resources.entitytypes.types.EntityAddPayeesRequest;
import com.mercoa.api.resources.entitytypes.types.EntityAddPayorsRequest;
import com.mercoa.api.resources.entitytypes.types.EntityHidePayeesRequest;
import com.mercoa.api.resources.entitytypes.types.EntityHidePayorsRequest;
import com.mercoa.api.resources.entitytypes.types.FindCounterpartiesResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class CounterpartyClient {
    protected final ClientOptions clientOptions;

    public CounterpartyClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Find payee counterparties. This endpoint lets you find vendors linked to the entity.
     */
    public FindCounterpartiesResponse findPayees(String entityId) {
        return findPayees(entityId, FindPayeeCounterpartiesRequest.builder().build());
    }

    /**
     * Find payee counterparties. This endpoint lets you find vendors linked to the entity.
     */
    public FindCounterpartiesResponse findPayees(String entityId, FindPayeeCounterpartiesRequest request) {
        return findPayees(entityId, request, null);
    }

    /**
     * Find payee counterparties. This endpoint lets you find vendors linked to the entity.
     */
    public FindCounterpartiesResponse findPayees(
            String entityId, FindPayeeCounterpartiesRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("counterparties/payees");
        if (request.getName().isPresent()) {
            httpUrl.addQueryParameter("name", request.getName().get());
        }
        if (request.getNetworkType().isPresent()) {
            httpUrl.addQueryParameter(
                    "networkType", request.getNetworkType().get().toString());
        }
        if (request.getPaymentMethods().isPresent()) {
            httpUrl.addQueryParameter(
                    "paymentMethods", request.getPaymentMethods().get().toString());
        }
        if (request.getInvoiceMetrics().isPresent()) {
            httpUrl.addQueryParameter(
                    "invoiceMetrics", request.getInvoiceMetrics().get().toString());
        }
        if (request.getLogo().isPresent()) {
            httpUrl.addQueryParameter("logo", request.getLogo().get().toString());
        }
        if (request.getCounterpartyId().isPresent()) {
            httpUrl.addQueryParameter(
                    "counterpartyId", request.getCounterpartyId().get());
        }
        if (request.getLimit().isPresent()) {
            httpUrl.addQueryParameter("limit", request.getLimit().get().toString());
        }
        if (request.getStartingAfter().isPresent()) {
            httpUrl.addQueryParameter(
                    "startingAfter", request.getStartingAfter().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
                client = clientOptions.httpClientWithTimeout(requestOptions);
            }
            Response response = client.newCall(okhttpRequest).execute();
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), FindCounterpartiesResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(
                            responseBody != null ? responseBody.string() : "{}", Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Find payor counterparties. This endpoint lets you find customers linked to the entity.
     */
    public FindCounterpartiesResponse findPayors(String entityId) {
        return findPayors(entityId, FindPayorCounterpartiesRequest.builder().build());
    }

    /**
     * Find payor counterparties. This endpoint lets you find customers linked to the entity.
     */
    public FindCounterpartiesResponse findPayors(String entityId, FindPayorCounterpartiesRequest request) {
        return findPayors(entityId, request, null);
    }

    /**
     * Find payor counterparties. This endpoint lets you find customers linked to the entity.
     */
    public FindCounterpartiesResponse findPayors(
            String entityId, FindPayorCounterpartiesRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("counterparties/payors");
        if (request.getName().isPresent()) {
            httpUrl.addQueryParameter("name", request.getName().get());
        }
        if (request.getNetworkType().isPresent()) {
            httpUrl.addQueryParameter(
                    "networkType", request.getNetworkType().get().toString());
        }
        if (request.getPaymentMethods().isPresent()) {
            httpUrl.addQueryParameter(
                    "paymentMethods", request.getPaymentMethods().get().toString());
        }
        if (request.getInvoiceMetrics().isPresent()) {
            httpUrl.addQueryParameter(
                    "invoiceMetrics", request.getInvoiceMetrics().get().toString());
        }
        if (request.getLogo().isPresent()) {
            httpUrl.addQueryParameter("logo", request.getLogo().get().toString());
        }
        if (request.getCounterpartyId().isPresent()) {
            httpUrl.addQueryParameter(
                    "counterpartyId", request.getCounterpartyId().get());
        }
        if (request.getLimit().isPresent()) {
            httpUrl.addQueryParameter("limit", request.getLimit().get().toString());
        }
        if (request.getStartingAfter().isPresent()) {
            httpUrl.addQueryParameter(
                    "startingAfter", request.getStartingAfter().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
                client = clientOptions.httpClientWithTimeout(requestOptions);
            }
            Response response = client.newCall(okhttpRequest).execute();
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), FindCounterpartiesResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(
                            responseBody != null ? responseBody.string() : "{}", Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Create association between Entity and a given list of Payees. If a Payee has previously been archived, unarchive the Payee.
     */
    public void addPayees(String entityId, EntityAddPayeesRequest request) {
        addPayees(entityId, request, null);
    }

    /**
     * Create association between Entity and a given list of Payees. If a Payee has previously been archived, unarchive the Payee.
     */
    public void addPayees(String entityId, EntityAddPayeesRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("addPayees")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
                client = clientOptions.httpClientWithTimeout(requestOptions);
            }
            Response response = client.newCall(okhttpRequest).execute();
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return;
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(
                            responseBody != null ? responseBody.string() : "{}", Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Marks Payees as unsearchable by Entity via Counterparty search. Invoices associated with these Payees will still be searchable via Invoice search.
     */
    public void hidePayees(String entityId, EntityHidePayeesRequest request) {
        hidePayees(entityId, request, null);
    }

    /**
     * Marks Payees as unsearchable by Entity via Counterparty search. Invoices associated with these Payees will still be searchable via Invoice search.
     */
    public void hidePayees(String entityId, EntityHidePayeesRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("hidePayees")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
                client = clientOptions.httpClientWithTimeout(requestOptions);
            }
            Response response = client.newCall(okhttpRequest).execute();
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return;
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(
                            responseBody != null ? responseBody.string() : "{}", Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Create association between Entity and a given list of Payors. If a Payor has previously been archived, unarchive the Payor.
     */
    public void addPayors(String entityId, EntityAddPayorsRequest request) {
        addPayors(entityId, request, null);
    }

    /**
     * Create association between Entity and a given list of Payors. If a Payor has previously been archived, unarchive the Payor.
     */
    public void addPayors(String entityId, EntityAddPayorsRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("addPayors")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
                client = clientOptions.httpClientWithTimeout(requestOptions);
            }
            Response response = client.newCall(okhttpRequest).execute();
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return;
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(
                            responseBody != null ? responseBody.string() : "{}", Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Marks Payors as unsearchable by Entity via Counterparty search. Invoices associated with these Payors will still be searchable via Invoice search.
     */
    public void hidePayors(String entityId, EntityHidePayorsRequest request) {
        hidePayors(entityId, request, null);
    }

    /**
     * Marks Payors as unsearchable by Entity via Counterparty search. Invoices associated with these Payors will still be searchable via Invoice search.
     */
    public void hidePayors(String entityId, EntityHidePayorsRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("hidePayors")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
                client = clientOptions.httpClientWithTimeout(requestOptions);
            }
            Response response = client.newCall(okhttpRequest).execute();
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return;
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(
                            responseBody != null ? responseBody.string() : "{}", Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
