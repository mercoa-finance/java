/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.paymentmethods.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.paymentmethodtypes.types.PaymentMethodType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = FindPaymentMethodsRequest.Builder.class)
public final class FindPaymentMethodsRequest {
    private final Optional<Integer> limit;

    private final Optional<String> startingAfter;

    private final Optional<PaymentMethodType> type;

    private final Optional<String> entityId;

    private final Map<String, Object> additionalProperties;

    private FindPaymentMethodsRequest(
            Optional<Integer> limit,
            Optional<String> startingAfter,
            Optional<PaymentMethodType> type,
            Optional<String> entityId,
            Map<String, Object> additionalProperties) {
        this.limit = limit;
        this.startingAfter = startingAfter;
        this.type = type;
        this.entityId = entityId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Number of payment methods to return. Limit can range between 1 and 100, and the default is 10.
     */
    @JsonProperty("limit")
    public Optional<Integer> getLimit() {
        return limit;
    }

    /**
     * @return The ID of the payment method to start after. If not provided, the first page of payment methods will be returned.
     */
    @JsonProperty("startingAfter")
    public Optional<String> getStartingAfter() {
        return startingAfter;
    }

    /**
     * @return Type of payment method to filter
     */
    @JsonProperty("type")
    public Optional<PaymentMethodType> getType() {
        return type;
    }

    /**
     * @return Entity ID to filter
     */
    @JsonProperty("entityId")
    public Optional<String> getEntityId() {
        return entityId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FindPaymentMethodsRequest && equalTo((FindPaymentMethodsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FindPaymentMethodsRequest other) {
        return limit.equals(other.limit)
                && startingAfter.equals(other.startingAfter)
                && type.equals(other.type)
                && entityId.equals(other.entityId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.limit, this.startingAfter, this.type, this.entityId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<Integer> limit = Optional.empty();

        private Optional<String> startingAfter = Optional.empty();

        private Optional<PaymentMethodType> type = Optional.empty();

        private Optional<String> entityId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(FindPaymentMethodsRequest other) {
            limit(other.getLimit());
            startingAfter(other.getStartingAfter());
            type(other.getType());
            entityId(other.getEntityId());
            return this;
        }

        @JsonSetter(value = "limit", nulls = Nulls.SKIP)
        public Builder limit(Optional<Integer> limit) {
            this.limit = limit;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        @JsonSetter(value = "startingAfter", nulls = Nulls.SKIP)
        public Builder startingAfter(Optional<String> startingAfter) {
            this.startingAfter = startingAfter;
            return this;
        }

        public Builder startingAfter(String startingAfter) {
            this.startingAfter = Optional.ofNullable(startingAfter);
            return this;
        }

        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public Builder type(Optional<PaymentMethodType> type) {
            this.type = type;
            return this;
        }

        public Builder type(PaymentMethodType type) {
            this.type = Optional.ofNullable(type);
            return this;
        }

        @JsonSetter(value = "entityId", nulls = Nulls.SKIP)
        public Builder entityId(Optional<String> entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder entityId(String entityId) {
            this.entityId = Optional.ofNullable(entityId);
            return this;
        }

        public FindPaymentMethodsRequest build() {
            return new FindPaymentMethodsRequest(limit, startingAfter, type, entityId, additionalProperties);
        }
    }
}
