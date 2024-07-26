/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.paymentmethodtypes.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.entitytypes.types.EntityResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PaymentMethodWithEntityResponse.Builder.class)
public final class PaymentMethodWithEntityResponse {
    private final PaymentMethodResponse paymentMethod;

    private final EntityResponse entity;

    private final Map<String, Object> additionalProperties;

    private PaymentMethodWithEntityResponse(
            PaymentMethodResponse paymentMethod, EntityResponse entity, Map<String, Object> additionalProperties) {
        this.paymentMethod = paymentMethod;
        this.entity = entity;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("paymentMethod")
    public PaymentMethodResponse getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("entity")
    public EntityResponse getEntity() {
        return entity;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PaymentMethodWithEntityResponse && equalTo((PaymentMethodWithEntityResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PaymentMethodWithEntityResponse other) {
        return paymentMethod.equals(other.paymentMethod) && entity.equals(other.entity);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.paymentMethod, this.entity);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static PaymentMethodStage builder() {
        return new Builder();
    }

    public interface PaymentMethodStage {
        EntityStage paymentMethod(PaymentMethodResponse paymentMethod);

        Builder from(PaymentMethodWithEntityResponse other);
    }

    public interface EntityStage {
        _FinalStage entity(EntityResponse entity);
    }

    public interface _FinalStage {
        PaymentMethodWithEntityResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements PaymentMethodStage, EntityStage, _FinalStage {
        private PaymentMethodResponse paymentMethod;

        private EntityResponse entity;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PaymentMethodWithEntityResponse other) {
            paymentMethod(other.getPaymentMethod());
            entity(other.getEntity());
            return this;
        }

        @java.lang.Override
        @JsonSetter("paymentMethod")
        public EntityStage paymentMethod(PaymentMethodResponse paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        @java.lang.Override
        @JsonSetter("entity")
        public _FinalStage entity(EntityResponse entity) {
            this.entity = entity;
            return this;
        }

        @java.lang.Override
        public PaymentMethodWithEntityResponse build() {
            return new PaymentMethodWithEntityResponse(paymentMethod, entity, additionalProperties);
        }
    }
}