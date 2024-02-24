/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity;

import com.mercoa.api.core.ApiError;
import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.MediaTypes;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.core.Suppliers;
import com.mercoa.api.resources.entity.approvalpolicy.ApprovalPolicyClient;
import com.mercoa.api.resources.entity.counterparty.CounterpartyClient;
import com.mercoa.api.resources.entity.externalaccountingsystem.ExternalAccountingSystemClient;
import com.mercoa.api.resources.entity.invoice.InvoiceClient;
import com.mercoa.api.resources.entity.metadata.MetadataClient;
import com.mercoa.api.resources.entity.notificationpolicy.NotificationPolicyClient;
import com.mercoa.api.resources.entity.paymentmethod.PaymentMethodClient;
import com.mercoa.api.resources.entity.representative.RepresentativeClient;
import com.mercoa.api.resources.entity.requests.FindEntities;
import com.mercoa.api.resources.entity.requests.GenerateOnboardingLink;
import com.mercoa.api.resources.entity.requests.SendOnboardingLink;
import com.mercoa.api.resources.entity.user.UserClient;
import com.mercoa.api.resources.entitytypes.types.EntityRequest;
import com.mercoa.api.resources.entitytypes.types.EntityResponse;
import com.mercoa.api.resources.entitytypes.types.EntityUpdateRequest;
import com.mercoa.api.resources.entitytypes.types.FindEntityResponse;
import com.mercoa.api.resources.entitytypes.types.TokenGenerationOptions;
import java.io.IOException;
import java.util.function.Supplier;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class EntityClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<UserClient> userClient;

    protected final Supplier<ApprovalPolicyClient> approvalPolicyClient;

    protected final Supplier<CounterpartyClient> counterpartyClient;

    protected final Supplier<ExternalAccountingSystemClient> externalAccountingSystemClient;

    protected final Supplier<InvoiceClient> invoiceClient;

    protected final Supplier<MetadataClient> metadataClient;

    protected final Supplier<NotificationPolicyClient> notificationPolicyClient;

    protected final Supplier<PaymentMethodClient> paymentMethodClient;

    protected final Supplier<RepresentativeClient> representativeClient;

    public EntityClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.userClient = Suppliers.memoize(() -> new UserClient(clientOptions));
        this.approvalPolicyClient = Suppliers.memoize(() -> new ApprovalPolicyClient(clientOptions));
        this.counterpartyClient = Suppliers.memoize(() -> new CounterpartyClient(clientOptions));
        this.externalAccountingSystemClient =
                Suppliers.memoize(() -> new ExternalAccountingSystemClient(clientOptions));
        this.invoiceClient = Suppliers.memoize(() -> new InvoiceClient(clientOptions));
        this.metadataClient = Suppliers.memoize(() -> new MetadataClient(clientOptions));
        this.notificationPolicyClient = Suppliers.memoize(() -> new NotificationPolicyClient(clientOptions));
        this.paymentMethodClient = Suppliers.memoize(() -> new PaymentMethodClient(clientOptions));
        this.representativeClient = Suppliers.memoize(() -> new RepresentativeClient(clientOptions));
    }

    /**
     * Search all entities with the given filters. If no filters are provided, all entities will be returned.
     */
    public FindEntityResponse find() {
        return find(FindEntities.builder().build());
    }

    /**
     * Search all entities with the given filters. If no filters are provided, all entities will be returned.
     */
    public FindEntityResponse find(FindEntities request) {
        return find(request, null);
    }

    /**
     * Search all entities with the given filters. If no filters are provided, all entities will be returned.
     */
    public FindEntityResponse find(FindEntities request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity");
        if (request.getPaymentMethods().isPresent()) {
            httpUrl.addQueryParameter(
                    "paymentMethods", request.getPaymentMethods().get().toString());
        }
        if (request.getIsCustomer().isPresent()) {
            httpUrl.addQueryParameter(
                    "isCustomer", request.getIsCustomer().get().toString());
        }
        if (request.getForeignId().isPresent()) {
            httpUrl.addQueryParameter("foreignId", request.getForeignId().get());
        }
        if (request.getStatus().isPresent()) {
            httpUrl.addQueryParameter("status", request.getStatus().get().toString());
        }
        if (request.getIsPayee().isPresent()) {
            httpUrl.addQueryParameter("isPayee", request.getIsPayee().get().toString());
        }
        if (request.getIsPayor().isPresent()) {
            httpUrl.addQueryParameter("isPayor", request.getIsPayor().get().toString());
        }
        if (request.getName().isPresent()) {
            httpUrl.addQueryParameter("name", request.getName().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), FindEntityResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public EntityResponse create(EntityRequest request) {
        return create(request, null);
    }

    public EntityResponse create(EntityRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), EntityResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public EntityResponse get(String entityId) {
        return get(entityId, null);
    }

    public EntityResponse get(String entityId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), EntityResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public EntityResponse update(String entityId) {
        return update(entityId, EntityUpdateRequest.builder().build());
    }

    public EntityResponse update(String entityId, EntityUpdateRequest request) {
        return update(entityId, request, null);
    }

    public EntityResponse update(String entityId, EntityUpdateRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), EntityResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(String entityId) {
        delete(entityId, null);
    }

    public void delete(String entityId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
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
     * This endpoint is used to indicate acceptance of Mercoa's terms of service for an entity. Send a request to this endpoint only after the entity has accepted the Mercoa ToS. Entities must accept Mercoa ToS before they can be send or pay invoices using Mercoa's payment rails.
     */
    public void acceptTermsOfService(String entityId) {
        acceptTermsOfService(entityId, null);
    }

    /**
     * This endpoint is used to indicate acceptance of Mercoa's terms of service for an entity. Send a request to this endpoint only after the entity has accepted the Mercoa ToS. Entities must accept Mercoa ToS before they can be send or pay invoices using Mercoa's payment rails.
     */
    public void acceptTermsOfService(String entityId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("accept-tos")
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
     * This endpoint is used to initiate KYB for an entity.
     * Send a request to this endpoint only after the entity has accepted the Mercoa ToS,
     * all representatives have been added, and all required fields have been filled out.
     */
    public void initiateKyb(String entityId) {
        initiateKyb(entityId, null);
    }

    /**
     * This endpoint is used to initiate KYB for an entity.
     * Send a request to this endpoint only after the entity has accepted the Mercoa ToS,
     * all representatives have been added, and all required fields have been filled out.
     */
    public void initiateKyb(String entityId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("request-kyb")
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
     * Generate a JWT token for an entity with the given options. This token can be used to authenticate the entity in the Mercoa API and iFrame.
     */
    public String getToken(String entityId) {
        return getToken(entityId, TokenGenerationOptions.builder().build());
    }

    /**
     * Generate a JWT token for an entity with the given options. This token can be used to authenticate the entity in the Mercoa API and iFrame.
     */
    public String getToken(String entityId, TokenGenerationOptions request) {
        return getToken(entityId, request, null);
    }

    /**
     * Generate a JWT token for an entity with the given options. This token can be used to authenticate the entity in the Mercoa API and iFrame.
     */
    public String getToken(String entityId, TokenGenerationOptions request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("token")
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
     * Get a Plaid link token for an entity. This token can be used to add a bank account to the entity using Plaid Link.
     */
    public String plaidLinkToken(String entityId) {
        return plaidLinkToken(entityId, null);
    }

    /**
     * Get a Plaid link token for an entity. This token can be used to add a bank account to the entity using Plaid Link.
     */
    public String plaidLinkToken(String entityId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("plaidLinkToken")
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
     * Generate an onboarding link for the entity.
     */
    public String getOnboardingLink(String entityId, GenerateOnboardingLink request) {
        return getOnboardingLink(entityId, request, null);
    }

    /**
     * Generate an onboarding link for the entity.
     */
    public String getOnboardingLink(String entityId, GenerateOnboardingLink request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("onboarding");
        httpUrl.addQueryParameter("type", request.getType().toString());
        if (request.getExpiresIn().isPresent()) {
            httpUrl.addQueryParameter("expiresIn", request.getExpiresIn().get());
        }
        if (request.getConnectedEntityId().isPresent()) {
            httpUrl.addQueryParameter(
                    "connectedEntityId", request.getConnectedEntityId().get());
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
     * Send an email with a onboarding link to the entity. The email will be sent to the email address associated with the entity.
     */
    public void sendOnboardingLink(String entityId, SendOnboardingLink request) {
        sendOnboardingLink(entityId, request, null);
    }

    /**
     * Send an email with a onboarding link to the entity. The email will be sent to the email address associated with the entity.
     */
    public void sendOnboardingLink(String entityId, SendOnboardingLink request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entity")
                .addPathSegment(entityId)
                .addPathSegments("onboarding");
        httpUrl.addQueryParameter("type", request.getType().toString());
        if (request.getExpiresIn().isPresent()) {
            httpUrl.addQueryParameter("expiresIn", request.getExpiresIn().get());
        }
        if (request.getConnectedEntityId().isPresent()) {
            httpUrl.addQueryParameter(
                    "connectedEntityId", request.getConnectedEntityId().get());
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

    public UserClient user() {
        return this.userClient.get();
    }

    public ApprovalPolicyClient approvalPolicy() {
        return this.approvalPolicyClient.get();
    }

    public CounterpartyClient counterparty() {
        return this.counterpartyClient.get();
    }

    public ExternalAccountingSystemClient externalAccountingSystem() {
        return this.externalAccountingSystemClient.get();
    }

    public InvoiceClient invoice() {
        return this.invoiceClient.get();
    }

    public MetadataClient metadata() {
        return this.metadataClient.get();
    }

    public NotificationPolicyClient notificationPolicy() {
        return this.notificationPolicyClient.get();
    }

    public PaymentMethodClient paymentMethod() {
        return this.paymentMethodClient.get();
    }

    public RepresentativeClient representative() {
        return this.representativeClient.get();
    }
}
