/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.counterparty.vendorcredit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.MediaTypes;
import com.mercoa.api.core.MercoaApiException;
import com.mercoa.api.core.MercoaException;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.QueryStringMapper;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.resources.entity.counterparty.vendorcredit.requests.CalculateVendorCreditUsageRequest;
import com.mercoa.api.resources.vendorcredittypes.types.CalculateVendorCreditUsageResponse;
import com.mercoa.api.resources.vendorcredittypes.types.FindVendorCreditResponse;
import com.mercoa.api.resources.vendorcredittypes.types.VendorCreditRequest;
import com.mercoa.api.resources.vendorcredittypes.types.VendorCreditResponse;
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

public class AsyncVendorCreditClient {
    protected final ClientOptions clientOptions;

    public AsyncVendorCreditClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public CompletableFuture<FindVendorCreditResponse> getAll(String entityId, String counterpartyId) {
        return getAll(entityId, counterpartyId, null);
    }

    public CompletableFuture<FindVendorCreditResponse> getAll(
            String entityId, String counterpartyId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("counterparty")
                .addPathSegment(counterpartyId)
                .addPathSegments("vendor-credits")
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
        CompletableFuture<FindVendorCreditResponse> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(ObjectMappers.JSON_MAPPER.readValue(
                                responseBody.string(), FindVendorCreditResponse.class));
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

    public CompletableFuture<VendorCreditResponse> get(String entityId, String counterpartyId, String vendorCreditId) {
        return get(entityId, counterpartyId, vendorCreditId, null);
    }

    public CompletableFuture<VendorCreditResponse> get(
            String entityId, String counterpartyId, String vendorCreditId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("counterparty")
                .addPathSegment(counterpartyId)
                .addPathSegments("vendor-credit")
                .addPathSegment(vendorCreditId)
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
        CompletableFuture<VendorCreditResponse> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), VendorCreditResponse.class));
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

    public CompletableFuture<VendorCreditResponse> create(
            String entityId, String counterpartyId, VendorCreditRequest request) {
        return create(entityId, counterpartyId, request, null);
    }

    public CompletableFuture<VendorCreditResponse> create(
            String entityId, String counterpartyId, VendorCreditRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("counterparty")
                .addPathSegment(counterpartyId)
                .addPathSegments("vendor-credit")
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
        CompletableFuture<VendorCreditResponse> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), VendorCreditResponse.class));
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

    public CompletableFuture<Void> delete(String entityId, String counterpartyId, String vendorCreditId) {
        return delete(entityId, counterpartyId, vendorCreditId, null);
    }

    public CompletableFuture<Void> delete(
            String entityId, String counterpartyId, String vendorCreditId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("counterparty")
                .addPathSegment(counterpartyId)
                .addPathSegments("vendor-credit")
                .addPathSegment(vendorCreditId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
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
     * Estimate the usage of vendor credits on an invoice of a given amount
     */
    public CompletableFuture<CalculateVendorCreditUsageResponse> estimateUsage(
            String entityId, String counterpartyId, CalculateVendorCreditUsageRequest request) {
        return estimateUsage(entityId, counterpartyId, request, null);
    }

    /**
     * Estimate the usage of vendor credits on an invoice of a given amount
     */
    public CompletableFuture<CalculateVendorCreditUsageResponse> estimateUsage(
            String entityId,
            String counterpartyId,
            CalculateVendorCreditUsageRequest request,
            RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("counterparty")
                .addPathSegment(counterpartyId)
                .addPathSegments("vendor-credits/estimate-usage");
        QueryStringMapper.addQueryParameter(httpUrl, "amount", Double.toString(request.getAmount()), false);
        if (request.getCurrency().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "currency", request.getCurrency().get().toString(), false);
        }
        if (request.getExcludedInvoiceIds().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl,
                    "excludedInvoiceIds",
                    request.getExcludedInvoiceIds().get().toString(),
                    false);
        }
        if (request.getIncludedVendorCreditIds().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl,
                    "includedVendorCreditIds",
                    request.getIncludedVendorCreditIds().get().toString(),
                    false);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<CalculateVendorCreditUsageResponse> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(ObjectMappers.JSON_MAPPER.readValue(
                                responseBody.string(), CalculateVendorCreditUsageResponse.class));
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
