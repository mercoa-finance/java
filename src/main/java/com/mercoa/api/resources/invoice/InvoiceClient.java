/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.MediaTypes;
import com.mercoa.api.core.MercoaApiException;
import com.mercoa.api.core.MercoaException;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.core.Suppliers;
import com.mercoa.api.resources.invoice.approval.ApprovalClient;
import com.mercoa.api.resources.invoice.comment.CommentClient;
import com.mercoa.api.resources.invoice.document.DocumentClient;
import com.mercoa.api.resources.invoice.lineitem.LineItemClient;
import com.mercoa.api.resources.invoice.paymentlinks.PaymentLinksClient;
import com.mercoa.api.resources.invoice.requests.GetAllInvoicesRequest;
import com.mercoa.api.resources.invoicetypes.types.FindInvoiceResponse;
import com.mercoa.api.resources.invoicetypes.types.InvoiceCreationRequest;
import com.mercoa.api.resources.invoicetypes.types.InvoiceResponse;
import com.mercoa.api.resources.invoicetypes.types.InvoiceUpdateRequest;
import java.io.IOException;
import java.util.function.Supplier;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class InvoiceClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<LineItemClient> lineItemClient;

    protected final Supplier<ApprovalClient> approvalClient;

    protected final Supplier<CommentClient> commentClient;

    protected final Supplier<DocumentClient> documentClient;

    protected final Supplier<PaymentLinksClient> paymentLinksClient;

    public InvoiceClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.lineItemClient = Suppliers.memoize(() -> new LineItemClient(clientOptions));
        this.approvalClient = Suppliers.memoize(() -> new ApprovalClient(clientOptions));
        this.commentClient = Suppliers.memoize(() -> new CommentClient(clientOptions));
        this.documentClient = Suppliers.memoize(() -> new DocumentClient(clientOptions));
        this.paymentLinksClient = Suppliers.memoize(() -> new PaymentLinksClient(clientOptions));
    }

    /**
     * Search invoices for all entities in the organization
     */
    public FindInvoiceResponse find() {
        return find(GetAllInvoicesRequest.builder().build());
    }

    /**
     * Search invoices for all entities in the organization
     */
    public FindInvoiceResponse find(GetAllInvoicesRequest request) {
        return find(request, null);
    }

    /**
     * Search invoices for all entities in the organization
     */
    public FindInvoiceResponse find(GetAllInvoicesRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoices");
        if (request.getEntityId().isPresent()) {
            httpUrl.addQueryParameter("entityId", request.getEntityId().get());
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
        if (request.getSearch().isPresent()) {
            httpUrl.addQueryParameter("search", request.getSearch().get());
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

    public InvoiceResponse create(InvoiceCreationRequest request) {
        return create(request, null);
    }

    public InvoiceResponse create(InvoiceCreationRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), InvoiceResponse.class);
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

    public InvoiceResponse get(String invoiceId) {
        return get(invoiceId, null);
    }

    public InvoiceResponse get(String invoiceId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
                .addPathSegment(invoiceId)
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), InvoiceResponse.class);
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

    public InvoiceResponse update(String invoiceId) {
        return update(invoiceId, InvoiceUpdateRequest.builder().build());
    }

    public InvoiceResponse update(String invoiceId, InvoiceUpdateRequest request) {
        return update(invoiceId, request, null);
    }

    public InvoiceResponse update(String invoiceId, InvoiceUpdateRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
                .addPathSegment(invoiceId)
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), InvoiceResponse.class);
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
     * Only invoices in the DRAFT and NEW status can be deleted.
     */
    public void delete(String invoiceId) {
        delete(invoiceId, null);
    }

    /**
     * Only invoices in the DRAFT and NEW status can be deleted.
     */
    public void delete(String invoiceId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
                .addPathSegment(invoiceId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
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

    public LineItemClient lineItem() {
        return this.lineItemClient.get();
    }

    public ApprovalClient approval() {
        return this.approvalClient.get();
    }

    public CommentClient comment() {
        return this.commentClient.get();
    }

    public DocumentClient document() {
        return this.documentClient.get();
    }

    public PaymentLinksClient paymentLinks() {
        return this.paymentLinksClient.get();
    }
}
