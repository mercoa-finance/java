/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitygroup;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.MediaTypes;
import com.mercoa.api.core.MercoaApiException;
import com.mercoa.api.core.MercoaException;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.core.Suppliers;
import com.mercoa.api.resources.entitygroup.invoice.InvoiceClient;
import com.mercoa.api.resources.entitygroup.requests.EntityGroupFindRequest;
import com.mercoa.api.resources.entitygroup.user.UserClient;
import com.mercoa.api.resources.entitygrouptypes.types.EntityGroupFindResponse;
import com.mercoa.api.resources.entitygrouptypes.types.EntityGroupRequest;
import com.mercoa.api.resources.entitygrouptypes.types.EntityGroupResponse;
import java.io.IOException;
import java.util.function.Supplier;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class EntityGroupClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<UserClient> userClient;

    protected final Supplier<InvoiceClient> invoiceClient;

    public EntityGroupClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.userClient = Suppliers.memoize(() -> new UserClient(clientOptions));
        this.invoiceClient = Suppliers.memoize(() -> new InvoiceClient(clientOptions));
    }

    /**
     * Get all entity groups. If using a JWT, will return all groups the entity is part of. If using an API key, will return all groups for the organization.
     */
    public EntityGroupFindResponse getAll() {
        return getAll(EntityGroupFindRequest.builder().build());
    }

    /**
     * Get all entity groups. If using a JWT, will return all groups the entity is part of. If using an API key, will return all groups for the organization.
     */
    public EntityGroupFindResponse getAll(EntityGroupFindRequest request) {
        return getAll(request, null);
    }

    /**
     * Get all entity groups. If using a JWT, will return all groups the entity is part of. If using an API key, will return all groups for the organization.
     */
    public EntityGroupFindResponse getAll(EntityGroupFindRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entityGroups");
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
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), EntityGroupFindResponse.class);
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
     * Create an entity group
     */
    public EntityGroupResponse create(EntityGroupRequest request) {
        return create(request, null);
    }

    /**
     * Create an entity group
     */
    public EntityGroupResponse create(EntityGroupRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entityGroup")
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), EntityGroupResponse.class);
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
     * Get an entity group
     */
    public EntityGroupResponse get(String entityGroupId) {
        return get(entityGroupId, null);
    }

    /**
     * Get an entity group
     */
    public EntityGroupResponse get(String entityGroupId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entityGroup")
                .addPathSegment(entityGroupId)
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), EntityGroupResponse.class);
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
     * Update an entity group
     */
    public EntityGroupResponse update(String entityGroupId, EntityGroupRequest request) {
        return update(entityGroupId, request, null);
    }

    /**
     * Update an entity group
     */
    public EntityGroupResponse update(String entityGroupId, EntityGroupRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entityGroup")
                .addPathSegment(entityGroupId)
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), EntityGroupResponse.class);
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
     * Delete an entity group
     */
    public void delete(String entityGroupId) {
        delete(entityGroupId, null);
    }

    /**
     * Delete an entity group
     */
    public void delete(String entityGroupId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entityGroup")
                .addPathSegment(entityGroupId)
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

    public UserClient user() {
        return this.userClient.get();
    }

    public InvoiceClient invoice() {
        return this.invoiceClient.get();
    }
}
