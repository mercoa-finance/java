/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.paymentmethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.mercoa.api.core.ApiError;
import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.resources.entity.paymentmethod.requests.CompleteMicroDepositsRequest;
import com.mercoa.api.resources.entity.paymentmethod.requests.GetAllPaymentMethodsRequest;
import com.mercoa.api.resources.paymentmethodtypes.types.PaymentMethodBalanceResponse;
import com.mercoa.api.resources.paymentmethodtypes.types.PaymentMethodRequest;
import com.mercoa.api.resources.paymentmethodtypes.types.PaymentMethodResponse;
import com.mercoa.api.resources.paymentmethodtypes.types.PaymentMethodUpdateRequest;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class PaymentMethodClient {
    protected final ClientOptions clientOptions;

    public PaymentMethodClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public List<PaymentMethodResponse> getAll(String entityId) {
        return getAll(entityId, GetAllPaymentMethodsRequest.builder().build());
    }

    public List<PaymentMethodResponse> getAll(
            String entityId, GetAllPaymentMethodsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("paymentMethods");
        if (request.getType().isPresent()) {
            httpUrl.addQueryParameter("type", request.getType().get().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), new TypeReference<List<PaymentMethodResponse>>() {});
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<PaymentMethodResponse> getAll(String entityId, GetAllPaymentMethodsRequest request) {
        return getAll(entityId, request, null);
    }

    public PaymentMethodResponse create(String entityId, PaymentMethodRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("paymentMethod")
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), PaymentMethodResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PaymentMethodResponse create(String entityId, PaymentMethodRequest request) {
        return create(entityId, request, null);
    }

    public PaymentMethodResponse get(String entityId, String paymentMethodId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("paymentMethod")
                .addPathSegment(paymentMethodId)
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), PaymentMethodResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PaymentMethodResponse get(String entityId, String paymentMethodId) {
        return get(entityId, paymentMethodId, null);
    }

    /**
     * Only custom payment methods can be updated.
     */
    public PaymentMethodResponse update(
            String entityId,
            String paymentMethodId,
            PaymentMethodUpdateRequest request,
            RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("paymentMethod")
                .addPathSegment(paymentMethodId)
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
                .method("PUT", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), PaymentMethodResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Only custom payment methods can be updated.
     */
    public PaymentMethodResponse update(String entityId, String paymentMethodId, PaymentMethodUpdateRequest request) {
        return update(entityId, paymentMethodId, request, null);
    }

    /**
     * Mark a payment method as inactive. This will not remove the payment method from the system, but will prevent it from being used in the future.
     */
    public void delete(String entityId, String paymentMethodId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("paymentMethod")
                .addPathSegment(paymentMethodId)
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
     * Mark a payment method as inactive. This will not remove the payment method from the system, but will prevent it from being used in the future.
     */
    public void delete(String entityId, String paymentMethodId) {
        delete(entityId, paymentMethodId, null);
    }

    /**
     * Initiate micro deposits for a bank account
     */
    public PaymentMethodResponse initiateMicroDeposits(
            String entityId, String paymentMethodId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("paymentMethod")
                .addPathSegment(paymentMethodId)
                .addPathSegments("micro-deposits")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", RequestBody.create("", null))
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), PaymentMethodResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Initiate micro deposits for a bank account
     */
    public PaymentMethodResponse initiateMicroDeposits(String entityId, String paymentMethodId) {
        return initiateMicroDeposits(entityId, paymentMethodId, null);
    }

    /**
     * Complete micro deposit verification
     */
    public PaymentMethodResponse completeMicroDeposits(
            String entityId,
            String paymentMethodId,
            CompleteMicroDepositsRequest request,
            RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("paymentMethod")
                .addPathSegment(paymentMethodId)
                .addPathSegments("micro-deposits")
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
                .method("PUT", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), PaymentMethodResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Complete micro deposit verification
     */
    public PaymentMethodResponse completeMicroDeposits(
            String entityId, String paymentMethodId, CompleteMicroDepositsRequest request) {
        return completeMicroDeposits(entityId, paymentMethodId, request, null);
    }

    /**
     * Get the available balance of a payment method. Only bank accounts added with Plaid are supported. This endpoint will return a cached value and will refresh the balance when called.
     */
    public PaymentMethodBalanceResponse getBalance(
            String entityId, String paymentMethodId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("paymentMethod")
                .addPathSegment(paymentMethodId)
                .addPathSegments("balance")
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
                        response.body().string(), PaymentMethodBalanceResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get the available balance of a payment method. Only bank accounts added with Plaid are supported. This endpoint will return a cached value and will refresh the balance when called.
     */
    public PaymentMethodBalanceResponse getBalance(String entityId, String paymentMethodId) {
        return getBalance(entityId, paymentMethodId, null);
    }
}
