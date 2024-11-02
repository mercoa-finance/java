/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoice.paymentlinks;

import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.MercoaApiException;
import com.mercoa.api.core.MercoaException;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.resources.invoice.paymentlinks.requests.PayerLinkRequest;
import com.mercoa.api.resources.invoice.paymentlinks.requests.SendPayerEmail;
import com.mercoa.api.resources.invoice.paymentlinks.requests.VendorLinkRequest;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class PaymentLinksClient {
    protected final ClientOptions clientOptions;

    public PaymentLinksClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Get temporary link for payer to send payment
     */
    public String getPayerLink(String invoiceId) {
        return getPayerLink(invoiceId, PayerLinkRequest.builder().build());
    }

    /**
     * Get temporary link for payer to send payment
     */
    public String getPayerLink(String invoiceId, PayerLinkRequest request) {
        return getPayerLink(invoiceId, request, null);
    }

    /**
     * Get temporary link for payer to send payment
     */
    public String getPayerLink(String invoiceId, PayerLinkRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
                .addPathSegment(invoiceId)
                .addPathSegments("payerLink");
        if (request.getExpiresIn().isPresent()) {
            httpUrl.addQueryParameter("expiresIn", request.getExpiresIn().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), String.class);
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
     * Get temporary link for vendor to accept payment
     */
    public String getVendorLink(String invoiceId) {
        return getVendorLink(invoiceId, VendorLinkRequest.builder().build());
    }

    /**
     * Get temporary link for vendor to accept payment
     */
    public String getVendorLink(String invoiceId, VendorLinkRequest request) {
        return getVendorLink(invoiceId, request, null);
    }

    /**
     * Get temporary link for vendor to accept payment
     */
    public String getVendorLink(String invoiceId, VendorLinkRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invoice")
                .addPathSegment(invoiceId)
                .addPathSegments("vendorLink");
        if (request.getExpiresIn().isPresent()) {
            httpUrl.addQueryParameter("expiresIn", request.getExpiresIn().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), String.class);
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
