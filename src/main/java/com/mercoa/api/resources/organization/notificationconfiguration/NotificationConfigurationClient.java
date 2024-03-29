/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.organization.notificationconfiguration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.mercoa.api.core.ApiError;
import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.MediaTypes;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.resources.entitytypes.types.NotificationType;
import com.mercoa.api.resources.organizationtypes.types.NotificationConfigurationRequest;
import com.mercoa.api.resources.organizationtypes.types.NotificationConfigurationResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class NotificationConfigurationClient {
    protected final ClientOptions clientOptions;

    public NotificationConfigurationClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Retrieve all notification configurations
     */
    public List<NotificationConfigurationResponse> getAll() {
        return getAll(null);
    }

    /**
     * Retrieve all notification configurations
     */
    public List<NotificationConfigurationResponse> getAll(RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("organization")
                .addPathSegments("notification-configurations")
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), new TypeReference<List<NotificationConfigurationResponse>>() {});
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Retrieve notification configuration for this notification type
     */
    public NotificationConfigurationResponse get(NotificationType notificationType) {
        return get(notificationType, null);
    }

    /**
     * Retrieve notification configuration for this notification type
     */
    public NotificationConfigurationResponse get(NotificationType notificationType, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("organization")
                .addPathSegments("notification-configuration")
                .addPathSegment(notificationType.toString())
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), NotificationConfigurationResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Update notification configuration for this notification type
     */
    public NotificationConfigurationResponse update(
            NotificationType notificationType, NotificationConfigurationRequest request) {
        return update(notificationType, request, null);
    }

    /**
     * Update notification configuration for this notification type
     */
    public NotificationConfigurationResponse update(
            NotificationType notificationType,
            NotificationConfigurationRequest request,
            RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("organization")
                .addPathSegments("notification-configuration")
                .addPathSegment(notificationType.toString())
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), NotificationConfigurationResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reset notification configuration for this notification type
     */
    public void reset(NotificationType notificationType) {
        reset(notificationType, null);
    }

    /**
     * Reset notification configuration for this notification type
     */
    public void reset(NotificationType notificationType, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("organization")
                .addPathSegments("notification-configuration")
                .addPathSegment(notificationType.toString())
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
}
