/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoice.paymentlinks;

import com.mercoa.api.core.ApiError;
import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.resources.invoice.paymentlinks.requests.SendPayerEmail;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class PaymentLinksClient {
    protected final ClientOptions clientOptions;

    public PaymentLinksClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Get temporary link for payer to send payment
     */
    public String getPayerLink(String invoiceId) {
        return getPayerLink(invoiceId, null);
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
     * Trigger email to payer inviting them to make payment
     */
    public void sendPayerEmail(String invoiceId) {
        sendPayerEmail(invoiceId, SendPayerEmail.builder().build());
    }

    /**
     * Trigger email to payer inviting them to make payment
     */
    public void sendPayerEmail(String invoiceId, SendPayerEmail request) {
        sendPayerEmail(invoiceId, request, null);
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
     * Get temporary link for vendor to accept payment
     */
    public String getVendorLink(String invoiceId) {
        return getVendorLink(invoiceId, null);
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
     * Trigger email to vendor inviting them into the vendor portal
     */
    public void sendVendorEmail(String invoiceId) {
        sendVendorEmail(invoiceId, null);
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
}
