/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.user.notificationpolicy;

import com.fasterxml.jackson.core.type.TypeReference;
import com.mercoa.api.core.ApiError;
import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.MediaTypes;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.resources.entitytypes.types.NotificationType;
import com.mercoa.api.resources.entitytypes.types.UserNotificationPolicyRequest;
import com.mercoa.api.resources.entitytypes.types.UserNotificationPolicyResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class NotificationPolicyClient {
    protected final ClientOptions clientOptions;

    public NotificationPolicyClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Retrieve all notification policies associated with this entity user
     */
    public List<UserNotificationPolicyResponse> getAll(String entityId, String userId) {
        return getAll(entityId, userId, null);
    }

    /**
     * Retrieve all notification policies associated with this entity user
     */
    public List<UserNotificationPolicyResponse> getAll(String entityId, String userId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("user")
                .addPathSegment(userId)
                .addPathSegments("notification-policies")
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
                        response.body().string(), new TypeReference<List<UserNotificationPolicyResponse>>() {});
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Retrieve notification policy associated with this entity user
     */
    public UserNotificationPolicyResponse get(String entityId, String userId, NotificationType notificationType) {
        return get(entityId, userId, notificationType, null);
    }

    /**
     * Retrieve notification policy associated with this entity user
     */
    public UserNotificationPolicyResponse get(
            String entityId, String userId, NotificationType notificationType, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("user")
                .addPathSegment(userId)
                .addPathSegments("notification-policy")
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
                        response.body().string(), UserNotificationPolicyResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Update notification policy associated with this entity user
     */
    public UserNotificationPolicyResponse update(String entityId, String userId, NotificationType notificationType) {
        return update(
                entityId,
                userId,
                notificationType,
                UserNotificationPolicyRequest.builder().build());
    }

    /**
     * Update notification policy associated with this entity user
     */
    public UserNotificationPolicyResponse update(
            String entityId, String userId, NotificationType notificationType, UserNotificationPolicyRequest request) {
        return update(entityId, userId, notificationType, request, null);
    }

    /**
     * Update notification policy associated with this entity user
     */
    public UserNotificationPolicyResponse update(
            String entityId,
            String userId,
            NotificationType notificationType,
            UserNotificationPolicyRequest request,
            RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("user")
                .addPathSegment(userId)
                .addPathSegments("notification-policy")
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
                        response.body().string(), UserNotificationPolicyResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
