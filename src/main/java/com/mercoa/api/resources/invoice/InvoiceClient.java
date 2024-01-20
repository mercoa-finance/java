/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoice;

import com.mercoa.api.core.ApiError;
import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.core.Suppliers;
import com.mercoa.api.resources.invoice.approval.ApprovalClient;
import com.mercoa.api.resources.invoice.comment.CommentClient;
import com.mercoa.api.resources.invoice.document.DocumentClient;
import com.mercoa.api.resources.invoice.requests.GetAllInvoicesRequest;
import com.mercoa.api.resources.invoice.requests.GetInvoice;
import com.mercoa.api.resources.invoice.requests.SendPayerEmail;
import com.mercoa.api.resources.invoicetypes.types.DocumentResponse;
import com.mercoa.api.resources.invoicetypes.types.FindInvoiceResponse;
import com.mercoa.api.resources.invoicetypes.types.InvoiceRequest;
import com.mercoa.api.resources.invoicetypes.types.InvoiceResponse;
import java.io.IOException;
import java.util.function.Supplier;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class InvoiceClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<ApprovalClient> approvalClient;

    protected final Supplier<CommentClient> commentClient;

    protected final Supplier<DocumentClient> documentClient;

    public InvoiceClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.approvalClient = Suppliers.memoize(() -> new ApprovalClient(clientOptions));
        this.commentClient = Suppliers.memoize(() -> new CommentClient(clientOptions));
        this.documentClient = Suppliers.memoize(() -> new DocumentClient(clientOptions));
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
        if (request.getIncludeFees().isPresent()) {
            httpUrl.addQueryParameter(
                    "includeFees", request.getIncludeFees().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), FindInvoiceResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Search invoices for all entities in the organization
     */
    public FindInvoiceResponse find(GetAllInvoicesRequest request) {
        return find(request, null);
    }

    public InvoiceResponse create() {
        return create(InvoiceRequest.builder().build());
    }

    public InvoiceResponse create(InvoiceRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
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
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), InvoiceResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public InvoiceResponse create(InvoiceRequest request) {
        return create(request, null);
    }

    public InvoiceResponse get(String invoiceId) {
        return get(invoiceId, GetInvoice.builder().build());
    }

    public InvoiceResponse get(String invoiceId, GetInvoice request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
                .addPathSegment(invoiceId);
        if (request.getIncludeFees().isPresent()) {
            httpUrl.addQueryParameter(
                    "includeFees", request.getIncludeFees().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), InvoiceResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public InvoiceResponse get(String invoiceId, GetInvoice request) {
        return get(invoiceId, request, null);
    }

    public InvoiceResponse update(String invoiceId) {
        return update(invoiceId, InvoiceRequest.builder().build());
    }

    public InvoiceResponse update(String invoiceId, InvoiceRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
                .addPathSegment(invoiceId)
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
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
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), InvoiceResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public InvoiceResponse update(String invoiceId, InvoiceRequest request) {
        return update(invoiceId, request, null);
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
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return;
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Only invoices in the DRAFT and NEW status can be deleted.
     */
    public void delete(String invoiceId) {
        delete(invoiceId, null);
    }

    /**
     * Get temporary link for payer to send payment
     */
    public String getPayerLink(String invoiceId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
                .addPathSegment(invoiceId)
                .addPathSegments("payerLink")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), String.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get temporary link for payer to send payment
     */
    public String getPayerLink(String invoiceId) {
        return getPayerLink(invoiceId, null);
    }

    /**
     * Trigger email to payer inviting them to make payment
     */
    public void sendPayerEmail(String invoiceId) {
        sendPayerEmail(invoiceId, SendPayerEmail.builder().build());
    }

    /**
     * Trigger email to payer inviting them to make payment
     */
    public void sendPayerEmail(String invoiceId, SendPayerEmail request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
                .addPathSegment(invoiceId)
                .addPathSegments("sendPayerEmail");
        if (request.getAttachInvoice().isPresent()) {
            httpUrl.addQueryParameter(
                    "attachInvoice", request.getAttachInvoice().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("POST", RequestBody.create("", null))
                .headers(Headers.of(clientOptions.headers(requestOptions)));
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return;
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Trigger email to payer inviting them to make payment
     */
    public void sendPayerEmail(String invoiceId, SendPayerEmail request) {
        sendPayerEmail(invoiceId, request, null);
    }

    /**
     * Get temporary link for vendor to accept payment
     */
    public String getVendorLink(String invoiceId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
                .addPathSegment(invoiceId)
                .addPathSegments("vendorLink")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), String.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get temporary link for vendor to accept payment
     */
    public String getVendorLink(String invoiceId) {
        return getVendorLink(invoiceId, null);
    }

    /**
     * Trigger email to vendor inviting them into the vendor portal
     */
    public void sendVendorEmail(String invoiceId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
                .addPathSegment(invoiceId)
                .addPathSegments("sendVendorEmail")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", RequestBody.create("", null))
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return;
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Trigger email to vendor inviting them into the vendor portal
     */
    public void sendVendorEmail(String invoiceId) {
        sendVendorEmail(invoiceId, null);
    }

    /**
     * Generate a PDF of the invoice
     */
    public DocumentResponse generateInvoicePdf(String invoiceId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
                .addPathSegment(invoiceId)
                .addPathSegments("pdf/generate")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), DocumentResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Generate a PDF of the invoice
     */
    public DocumentResponse generateInvoicePdf(String invoiceId) {
        return generateInvoicePdf(invoiceId, null);
    }

    /**
     * Get a printable PDF of the check. This will only work for SCHEDULED invoices that have a check as the disbursement method. Once the PDF has been generated, it will no longer be possible to mail the check. The invoice will be marked as PAID as soon as the check is generated.
     */
    public DocumentResponse generateCheckPdf(String invoiceId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
                .addPathSegment(invoiceId)
                .addPathSegments("check/generate")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), DocumentResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get a printable PDF of the check. This will only work for SCHEDULED invoices that have a check as the disbursement method. Once the PDF has been generated, it will no longer be possible to mail the check. The invoice will be marked as PAID as soon as the check is generated.
     */
    public DocumentResponse generateCheckPdf(String invoiceId) {
        return generateCheckPdf(invoiceId, null);
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
}
