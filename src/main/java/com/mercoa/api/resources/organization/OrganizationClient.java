/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.organization;

import com.mercoa.api.core.ApiError;
import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.MediaTypes;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.core.Suppliers;
import com.mercoa.api.resources.organization.notificationconfiguration.NotificationConfigurationClient;
import com.mercoa.api.resources.organization.requests.GetEmailLogRequest;
import com.mercoa.api.resources.organization.requests.GetOrganizationRequest;
import com.mercoa.api.resources.organizationtypes.types.EmailLogResponse;
import com.mercoa.api.resources.organizationtypes.types.OrganizationRequest;
import com.mercoa.api.resources.organizationtypes.types.OrganizationResponse;
import java.io.IOException;
import java.util.function.Supplier;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OrganizationClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<NotificationConfigurationClient> notificationConfigurationClient;

    public OrganizationClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.notificationConfigurationClient =
                Suppliers.memoize(() -> new NotificationConfigurationClient(clientOptions));
    }

    /**
     * Get current organization information
     */
    public OrganizationResponse get() {
        return get(GetOrganizationRequest.builder().build());
    }

    /**
     * Get current organization information
     */
    public OrganizationResponse get(GetOrganizationRequest request) {
        return get(request, null);
    }

    /**
     * Get current organization information
     */
    public OrganizationResponse get(GetOrganizationRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("organization");
        if (request.getPaymentMethods().isPresent()) {
            httpUrl.addQueryParameter(
                    "paymentMethods", request.getPaymentMethods().get().toString());
        }
        if (request.getEmailProvider().isPresent()) {
            httpUrl.addQueryParameter(
                    "emailProvider", request.getEmailProvider().get().toString());
        }
        if (request.getColorScheme().isPresent()) {
            httpUrl.addQueryParameter(
                    "colorScheme", request.getColorScheme().get().toString());
        }
        if (request.getPayeeOnboardingOptions().isPresent()) {
            httpUrl.addQueryParameter(
                    "payeeOnboardingOptions",
                    request.getPayeeOnboardingOptions().get().toString());
        }
        if (request.getPayorOnboardingOptions().isPresent()) {
            httpUrl.addQueryParameter(
                    "payorOnboardingOptions",
                    request.getPayorOnboardingOptions().get().toString());
        }
        if (request.getMetadataSchema().isPresent()) {
            httpUrl.addQueryParameter(
                    "metadataSchema", request.getMetadataSchema().get().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), OrganizationResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Update current organization
     */
    public OrganizationResponse update() {
        return update(OrganizationRequest.builder().build());
    }

    /**
     * Update current organization
     */
    public OrganizationResponse update(OrganizationRequest request) {
        return update(request, null);
    }

    /**
     * Update current organization
     */
    public OrganizationResponse update(OrganizationRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("organization")
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
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), OrganizationResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get log of all emails sent to this organization. Content format subject to change.
     */
    public EmailLogResponse emailLog() {
        return emailLog(GetEmailLogRequest.builder().build());
    }

    /**
     * Get log of all emails sent to this organization. Content format subject to change.
     */
    public EmailLogResponse emailLog(GetEmailLogRequest request) {
        return emailLog(request, null);
    }

    /**
     * Get log of all emails sent to this organization. Content format subject to change.
     */
    public EmailLogResponse emailLog(GetEmailLogRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("organization/emailLog");
        if (request.getStartDate().isPresent()) {
            httpUrl.addQueryParameter("startDate", request.getStartDate().get().toString());
        }
        if (request.getEndDate().isPresent()) {
            httpUrl.addQueryParameter("endDate", request.getEndDate().get().toString());
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
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), EmailLogResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public NotificationConfigurationClient notificationConfiguration() {
        return this.notificationConfigurationClient.get();
    }
}
