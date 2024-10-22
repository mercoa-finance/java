/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.paymentmethod.bankaccount;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.MediaTypes;
import com.mercoa.api.core.MercoaApiException;
import com.mercoa.api.core.MercoaException;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.resources.entity.paymentmethod.bankaccount.requests.AddAccelerationFundsRequest;
import com.mercoa.api.resources.entity.paymentmethod.bankaccount.requests.CompleteMicroDepositsRequest;
import com.mercoa.api.resources.entity.paymentmethod.bankaccount.requests.RemoveAccelerationFundsRequest;
import com.mercoa.api.resources.entitytypes.types.AccelerationFundsResponse;
import com.mercoa.api.resources.paymentmethodtypes.types.PaymentMethodResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class BankAccountClient {
    protected final ClientOptions clientOptions;

    public BankAccountClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Initiate micro deposits for a bank account
     */
    public PaymentMethodResponse initiateMicroDeposits(String entityId, String paymentMethodId) {
        return initiateMicroDeposits(entityId, paymentMethodId, null);
    }

    /**
     * Initiate micro deposits for a bank account
     */
    public PaymentMethodResponse initiateMicroDeposits(
            String entityId, String paymentMethodId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("paymentMethod")
                .addPathSegment(paymentMethodId)
                .addPathSegments("micro-deposits")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", RequestBody.create("", null))
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), PaymentMethodResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new MercoaApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new MercoaException("Network error executing HTTP request", e);
        }
    }

    /**
     * Complete micro deposit verification
     */
    public PaymentMethodResponse completeMicroDeposits(
            String entityId, String paymentMethodId, CompleteMicroDepositsRequest request) {
        return completeMicroDeposits(entityId, paymentMethodId, request, null);
    }

    /**
     * Complete micro deposit verification
     */
    public PaymentMethodResponse completeMicroDeposits(
            String entityId,
            String paymentMethodId,
            CompleteMicroDepositsRequest request,
            RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("paymentMethod")
                .addPathSegment(paymentMethodId)
                .addPathSegments("micro-deposits")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new MercoaException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("PUT", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), PaymentMethodResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new MercoaApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new MercoaException("Network error executing HTTP request", e);
        }
    }

    /**
     * Get the available and pending balance of this entity's acceleration funds. The specified payment method must be a bank account.
     */
    public AccelerationFundsResponse getAccelerationFunds(String entityId, String paymentMethodId) {
        return getAccelerationFunds(entityId, paymentMethodId, null);
    }

    /**
     * Get the available and pending balance of this entity's acceleration funds. The specified payment method must be a bank account.
     */
    public AccelerationFundsResponse getAccelerationFunds(
            String entityId, String paymentMethodId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("paymentMethod")
                .addPathSegment(paymentMethodId)
                .addPathSegments("acceleration-funds")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), AccelerationFundsResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new MercoaApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new MercoaException("Network error executing HTTP request", e);
        }
    }

    /**
     * Add acceleration funds to this entity from a bank account (this transfer is D+2). The specified payment method must be a bank account.
     */
    public void addAccelerationFunds(String entityId, String paymentMethodId, AddAccelerationFundsRequest request) {
        addAccelerationFunds(entityId, paymentMethodId, request, null);
    }

    /**
     * Add acceleration funds to this entity from a bank account (this transfer is D+2). The specified payment method must be a bank account.
     */
    public void addAccelerationFunds(
            String entityId,
            String paymentMethodId,
            AddAccelerationFundsRequest request,
            RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("paymentMethod")
                .addPathSegment(paymentMethodId)
                .addPathSegments("add-acceleration-funds")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new MercoaException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return;
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new MercoaApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new MercoaException("Network error executing HTTP request", e);
        }
    }

    /**
     * Remove acceleration funds from this entity to a bank account (this transfer is D+0). The specified payment method must be a bank account.
     */
    public void removeAccelerationFunds(
            String entityId, String paymentMethodId, RemoveAccelerationFundsRequest request) {
        removeAccelerationFunds(entityId, paymentMethodId, request, null);
    }

    /**
     * Remove acceleration funds from this entity to a bank account (this transfer is D+0). The specified payment method must be a bank account.
     */
    public void removeAccelerationFunds(
            String entityId,
            String paymentMethodId,
            RemoveAccelerationFundsRequest request,
            RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("paymentMethod")
                .addPathSegment(paymentMethodId)
                .addPathSegments("remove-acceleration-funds")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new MercoaException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return;
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new MercoaApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new MercoaException("Network error executing HTTP request", e);
        }
    }
}
