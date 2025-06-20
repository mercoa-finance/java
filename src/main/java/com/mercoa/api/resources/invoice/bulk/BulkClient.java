/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoice.bulk;

import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.MediaTypes;
import com.mercoa.api.core.MercoaApiException;
import com.mercoa.api.core.MercoaException;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.QueryStringMapper;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.resources.invoice.bulk.requests.BulkInvoiceApprovalRequest;
import com.mercoa.api.resources.invoice.bulk.requests.BulkInvoiceCreationRequest;
import com.mercoa.api.resources.invoice.bulk.requests.BulkInvoiceUpdateRequest;
import com.mercoa.api.resources.invoicetypes.types.BulkInvoiceApprovalResponse;
import com.mercoa.api.resources.invoicetypes.types.BulkInvoiceCreationResponse;
import com.mercoa.api.resources.invoicetypes.types.BulkInvoiceUpdateResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class BulkClient {
    protected final ClientOptions clientOptions;

    public BulkClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Create multiple invoices in bulk. This endpoint will process synchronously and return a list of invoices that were created or failed to create.
     */
    public BulkInvoiceCreationResponse create(BulkInvoiceCreationRequest request) {
        return create(request, null);
    }

    /**
     * Create multiple invoices in bulk. This endpoint will process synchronously and return a list of invoices that were created or failed to create.
     */
    public BulkInvoiceCreationResponse create(BulkInvoiceCreationRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoices");
        if (request.getEmitWebhooks().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "emitWebhooks", request.getEmitWebhooks().get().toString(), false);
        }
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request.getBody()), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), BulkInvoiceCreationResponse.class);
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
     * Update multiple invoices in bulk. This endpoint will process synchronously and return a list of invoices that were updated or failed to update.
     */
    public BulkInvoiceUpdateResponse update(BulkInvoiceUpdateRequest request) {
        return update(request, null);
    }

    /**
     * Update multiple invoices in bulk. This endpoint will process synchronously and return a list of invoices that were updated or failed to update.
     */
    public BulkInvoiceUpdateResponse update(BulkInvoiceUpdateRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoices");
        if (request.getEmitWebhooks().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "emitWebhooks", request.getEmitWebhooks().get().toString(), false);
        }
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request.getBody()), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("PUT", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), BulkInvoiceUpdateResponse.class);
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
     * Approve multiple invoices in bulk. This endpoint will process synchronously and return a list of invoices that were approved or failed to approve.
     */
    public BulkInvoiceApprovalResponse approve(BulkInvoiceApprovalRequest request) {
        return approve(request, null);
    }

    /**
     * Approve multiple invoices in bulk. This endpoint will process synchronously and return a list of invoices that were approved or failed to approve.
     */
    public BulkInvoiceApprovalResponse approve(BulkInvoiceApprovalRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoices/approve");
        if (request.getEmitWebhooks().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "emitWebhooks", request.getEmitWebhooks().get().toString(), false);
        }
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request.getBody()), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), BulkInvoiceApprovalResponse.class);
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
