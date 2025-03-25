/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.user.notifications;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.MediaTypes;
import com.mercoa.api.core.MercoaApiException;
import com.mercoa.api.core.MercoaException;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.QueryStringMapper;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.resources.entity.user.notifications.requests.EntityGetNotificationsRequest;
import com.mercoa.api.resources.entitytypes.types.FindNotificationResponse;
import com.mercoa.api.resources.entitytypes.types.NotificationResponse;
import com.mercoa.api.resources.entitytypes.types.NotificationUpdateRequest;
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

public class AsyncNotificationsClient {
    protected final ClientOptions clientOptions;

    public AsyncNotificationsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public CompletableFuture<FindNotificationResponse> find(String entityId, String userId) {
        return find(entityId, userId, EntityGetNotificationsRequest.builder().build());
    }

    public CompletableFuture<FindNotificationResponse> find(
            String entityId, String userId, EntityGetNotificationsRequest request) {
        return find(entityId, userId, request, null);
    }

    public CompletableFuture<FindNotificationResponse> find(
            String entityId, String userId, EntityGetNotificationsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("user")
                .addPathSegment(userId)
                .addPathSegments("notifications");
        if (request.getStartDate().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "startDate", request.getStartDate().get().toString(), false);
        }
        if (request.getEndDate().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "endDate", request.getEndDate().get().toString(), false);
        }
        if (request.getOrderDirection().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "orderDirection", request.getOrderDirection().get().toString(), false);
        }
        if (request.getLimit().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "limit", request.getLimit().get().toString(), false);
        }
        if (request.getStartingAfter().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "startingAfter", request.getStartingAfter().get(), false);
        }
        if (request.getNotificationType().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl,
                    "notificationType",
                    request.getNotificationType().get().toString(),
                    false);
        }
        if (request.getStatus().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "status", request.getStatus().get().toString(), false);
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
        CompletableFuture<FindNotificationResponse> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(ObjectMappers.JSON_MAPPER.readValue(
                                responseBody.string(), FindNotificationResponse.class));
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

    public CompletableFuture<NotificationResponse> get(String entityId, String userId, String notificationId) {
        return get(entityId, userId, notificationId, null);
    }

    public CompletableFuture<NotificationResponse> get(
            String entityId, String userId, String notificationId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("user")
                .addPathSegment(userId)
                .addPathSegments("notification")
                .addPathSegment(notificationId)
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
        CompletableFuture<NotificationResponse> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), NotificationResponse.class));
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
     * Update the status of a notification.
     */
    public CompletableFuture<NotificationResponse> update(String entityId, String userId, String notificationId) {
        return update(
                entityId,
                userId,
                notificationId,
                NotificationUpdateRequest.builder().build());
    }

    /**
     * Update the status of a notification.
     */
    public CompletableFuture<NotificationResponse> update(
            String entityId, String userId, String notificationId, NotificationUpdateRequest request) {
        return update(entityId, userId, notificationId, request, null);
    }

    /**
     * Update the status of a notification.
     */
    public CompletableFuture<NotificationResponse> update(
            String entityId,
            String userId,
            String notificationId,
            NotificationUpdateRequest request,
            RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("user")
                .addPathSegment(userId)
                .addPathSegments("notification")
                .addPathSegment(notificationId)
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
                .method("PUT", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<NotificationResponse> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), NotificationResponse.class));
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
