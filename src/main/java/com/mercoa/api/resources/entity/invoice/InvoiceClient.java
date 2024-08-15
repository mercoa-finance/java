/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.invoice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.MercoaApiException;
import com.mercoa.api.core.MercoaException;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.resources.entity.invoice.requests.EntityGetInvoicesRequest;
import com.mercoa.api.resources.entity.invoice.requests.InvoiceMetricsRequest;
import com.mercoa.api.resources.invoicetypes.types.FindInvoiceResponse;
import com.mercoa.api.resources.invoicetypes.types.InvoiceMetricsResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class InvoiceClient {
    protected final ClientOptions clientOptions;

    public InvoiceClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Get invoices for an entity with the given filters.
     */
    public FindInvoiceResponse find(String entityId) {
        return find(entityId, EntityGetInvoicesRequest.builder().build());
    }

    /**
     * Get invoices for an entity with the given filters.
     */
    public FindInvoiceResponse find(String entityId, EntityGetInvoicesRequest request) {
        return find(entityId, request, null);
    }

    /**
     * Get invoices for an entity with the given filters.
     */
    public FindInvoiceResponse find(String entityId, EntityGetInvoicesRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("invoices");
        if (request.getExcludePayables().isPresent()) {
            httpUrl.addQueryParameter(
                    "excludePayables", request.getExcludePayables().get().toString());
        }
        if (request.getExcludeReceivables().isPresent()) {
            httpUrl.addQueryParameter(
                    "excludeReceivables", request.getExcludeReceivables().get().toString());
        }
        if (request.getStartDate().isPresent()) {
            httpUrl.addQueryParameter("startDate", request.getStartDate().get().toString());
        }
        if (request.getEndDate().isPresent()) {
            httpUrl.addQueryParameter("endDate", request.getEndDate().get().toString());
        }
        if (request.getDateType().isPresent()) {
            httpUrl.addQueryParameter("dateType", request.getDateType().get().toString());
        }
        if (request.getOrderBy().isPresent()) {
            httpUrl.addQueryParameter("orderBy", request.getOrderBy().get().toString());
        }
        if (request.getOrderDirection().isPresent()) {
            httpUrl.addQueryParameter(
                    "orderDirection", request.getOrderDirection().get().toString());
        }
        if (request.getLimit().isPresent()) {
            httpUrl.addQueryParameter("limit", request.getLimit().get().toString());
        }
        if (request.getStartingAfter().isPresent()) {
            httpUrl.addQueryParameter(
                    "startingAfter", request.getStartingAfter().get());
        }
        if (request.getMetadata().isPresent()) {
            httpUrl.addQueryParameter("metadata", request.getMetadata().get().toString());
        }
        if (request.getLineItemMetadata().isPresent()) {
            httpUrl.addQueryParameter(
                    "lineItemMetadata", request.getLineItemMetadata().get().toString());
        }
        if (request.getLineItemGlAccountId().isPresent()) {
            httpUrl.addQueryParameter(
                    "lineItemGlAccountId", request.getLineItemGlAccountId().get());
        }
        if (request.getSearch().isPresent()) {
            httpUrl.addQueryParameter("search", request.getSearch().get());
        }
        if (request.getPayerId().isPresent()) {
            httpUrl.addQueryParameter("payerId", request.getPayerId().get());
        }
        if (request.getVendorId().isPresent()) {
            httpUrl.addQueryParameter("vendorId", request.getVendorId().get());
        }
        if (request.getApproverId().isPresent()) {
            httpUrl.addQueryParameter("approverId", request.getApproverId().get());
        }
        if (request.getApproverAction().isPresent()) {
            httpUrl.addQueryParameter(
                    "approverAction", request.getApproverAction().get().toString());
        }
        if (request.getInvoiceId().isPresent()) {
            httpUrl.addQueryParameter("invoiceId", request.getInvoiceId().get());
        }
        if (request.getStatus().isPresent()) {
            httpUrl.addQueryParameter("status", request.getStatus().get().toString());
        }
        if (request.getPaymentType().isPresent()) {
            httpUrl.addQueryParameter(
                    "paymentType", request.getPaymentType().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), FindInvoiceResponse.class);
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
     * Get invoice metrics for an entity with the given filters. Invoices will be grouped by currency. If none of excludePayables, excludeReceivables, payerId, vendorId, or invoiceId status filters are provided, excludeReceivables will be set to true.
     */
    public List<InvoiceMetricsResponse> metrics(String entityId) {
        return metrics(entityId, InvoiceMetricsRequest.builder().build());
    }

    /**
     * Get invoice metrics for an entity with the given filters. Invoices will be grouped by currency. If none of excludePayables, excludeReceivables, payerId, vendorId, or invoiceId status filters are provided, excludeReceivables will be set to true.
     */
    public List<InvoiceMetricsResponse> metrics(String entityId, InvoiceMetricsRequest request) {
        return metrics(entityId, request, null);
    }

    /**
     * Get invoice metrics for an entity with the given filters. Invoices will be grouped by currency. If none of excludePayables, excludeReceivables, payerId, vendorId, or invoiceId status filters are provided, excludeReceivables will be set to true.
     */
    public List<InvoiceMetricsResponse> metrics(
            String entityId, InvoiceMetricsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("invoice-metrics");
        if (request.getSearch().isPresent()) {
            httpUrl.addQueryParameter("search", request.getSearch().get());
        }
        if (request.getExcludePayables().isPresent()) {
            httpUrl.addQueryParameter(
                    "excludePayables", request.getExcludePayables().get().toString());
        }
        if (request.getExcludeReceivables().isPresent()) {
            httpUrl.addQueryParameter(
                    "excludeReceivables", request.getExcludeReceivables().get().toString());
        }
        if (request.getReturnByDate().isPresent()) {
            httpUrl.addQueryParameter(
                    "returnByDate", request.getReturnByDate().get().toString());
        }
        if (request.getPayerId().isPresent()) {
            httpUrl.addQueryParameter("payerId", request.getPayerId().get());
        }
        if (request.getVendorId().isPresent()) {
            httpUrl.addQueryParameter("vendorId", request.getVendorId().get());
        }
        if (request.getApproverId().isPresent()) {
            httpUrl.addQueryParameter("approverId", request.getApproverId().get());
        }
        if (request.getInvoiceId().isPresent()) {
            httpUrl.addQueryParameter("invoiceId", request.getInvoiceId().get());
        }
        if (request.getStatus().isPresent()) {
            httpUrl.addQueryParameter("status", request.getStatus().get().toString());
        }
        if (request.getStartDate().isPresent()) {
            httpUrl.addQueryParameter("startDate", request.getStartDate().get().toString());
        }
        if (request.getEndDate().isPresent()) {
            httpUrl.addQueryParameter("endDate", request.getEndDate().get().toString());
        }
        if (request.getDateType().isPresent()) {
            httpUrl.addQueryParameter("dateType", request.getDateType().get().toString());
        }
        if (request.getDueDateStart().isPresent()) {
            httpUrl.addQueryParameter(
                    "dueDateStart", request.getDueDateStart().get().toString());
        }
        if (request.getDueDateEnd().isPresent()) {
            httpUrl.addQueryParameter(
                    "dueDateEnd", request.getDueDateEnd().get().toString());
        }
        if (request.getCreatedDateStart().isPresent()) {
            httpUrl.addQueryParameter(
                    "createdDateStart", request.getCreatedDateStart().get().toString());
        }
        if (request.getCreatedDateEnd().isPresent()) {
            httpUrl.addQueryParameter(
                    "createdDateEnd", request.getCreatedDateEnd().get().toString());
        }
        if (request.getCurrency().isPresent()) {
            httpUrl.addQueryParameter("currency", request.getCurrency().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), new TypeReference<List<InvoiceMetricsResponse>>() {});
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
