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
import java.util.concurrent.CompletableFuture;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

public class AsyncBankAccountClient {
    protected final ClientOptions clientOptions;

    public AsyncBankAccountClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Initiate micro deposits for a bank account
     */
    public CompletableFuture<PaymentMethodResponse> initiateMicroDeposits(String entityId, String paymentMethodId) {
        return initiateMicroDeposits(entityId, paymentMethodId, null);
    }

    /**
     * Initiate micro deposits for a bank account
     */
    public CompletableFuture<PaymentMethodResponse> initiateMicroDeposits(
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
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<PaymentMethodResponse> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(ObjectMappers.JSON_MAPPER.readValue(
                                responseBody.string(), PaymentMethodResponse.class));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    future.completeExceptionally(new MercoaApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class)));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new MercoaException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new MercoaException("Network error executing HTTP request", e));
            }
        });
        return future;
    }

    /**
     * Complete micro deposit verification
     */
    public CompletableFuture<PaymentMethodResponse> completeMicroDeposits(
            String entityId, String paymentMethodId, CompleteMicroDepositsRequest request) {
        return completeMicroDeposits(entityId, paymentMethodId, request, null);
    }

    /**
     * Complete micro deposit verification
     */
    public CompletableFuture<PaymentMethodResponse> completeMicroDeposits(
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
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<PaymentMethodResponse> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(ObjectMappers.JSON_MAPPER.readValue(
                                responseBody.string(), PaymentMethodResponse.class));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    future.completeExceptionally(new MercoaApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class)));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new MercoaException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new MercoaException("Network error executing HTTP request", e));
            }
        });
        return future;
    }

    /**
     * Get the available and pending balance of this entity's acceleration funds. The specified payment method must be a bank account.
     */
    public CompletableFuture<AccelerationFundsResponse> getAccelerationFunds(String entityId, String paymentMethodId) {
        return getAccelerationFunds(entityId, paymentMethodId, null);
    }

    /**
     * Get the available and pending balance of this entity's acceleration funds. The specified payment method must be a bank account.
     */
    public CompletableFuture<AccelerationFundsResponse> getAccelerationFunds(
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
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<AccelerationFundsResponse> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(ObjectMappers.JSON_MAPPER.readValue(
                                responseBody.string(), AccelerationFundsResponse.class));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    future.completeExceptionally(new MercoaApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class)));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new MercoaException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new MercoaException("Network error executing HTTP request", e));
            }
        });
        return future;
    }

    /**
     * Add acceleration funds to this entity from a bank account (this transfer is D+2). The specified payment method must be a bank account.
     */
    public CompletableFuture<Void> addAccelerationFunds(
            String entityId, String paymentMethodId, AddAccelerationFundsRequest request) {
        return addAccelerationFunds(entityId, paymentMethodId, request, null);
    }

    /**
     * Add acceleration funds to this entity from a bank account (this transfer is D+2). The specified payment method must be a bank account.
     */
    public CompletableFuture<Void> addAccelerationFunds(
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
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<Void> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(null);
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    future.completeExceptionally(new MercoaApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class)));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new MercoaException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new MercoaException("Network error executing HTTP request", e));
            }
        });
        return future;
    }

    /**
     * Remove acceleration funds from this entity to a bank account (this transfer is D+0). The specified payment method must be a bank account.
     */
    public CompletableFuture<Void> removeAccelerationFunds(
            String entityId, String paymentMethodId, RemoveAccelerationFundsRequest request) {
        return removeAccelerationFunds(entityId, paymentMethodId, request, null);
    }

    /**
     * Remove acceleration funds from this entity to a bank account (this transfer is D+0). The specified payment method must be a bank account.
     */
    public CompletableFuture<Void> removeAccelerationFunds(
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
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<Void> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(null);
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    future.completeExceptionally(new MercoaApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class)));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new MercoaException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new MercoaException("Network error executing HTTP request", e));
            }
        });
        return future;
    }
}
