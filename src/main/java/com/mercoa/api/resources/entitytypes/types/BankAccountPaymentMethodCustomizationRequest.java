/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitytypes.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.invoicetypes.types.BankDeliveryMethod;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = BankAccountPaymentMethodCustomizationRequest.Builder.class)
public final class BankAccountPaymentMethodCustomizationRequest implements IGenericPaymentMethodCustomizationRequest {
    private final boolean disabled;

    private final Optional<BankDeliveryMethod> defaultDeliveryMethod;

    private final Map<String, Object> additionalProperties;

    private BankAccountPaymentMethodCustomizationRequest(
            boolean disabled,
            Optional<BankDeliveryMethod> defaultDeliveryMethod,
            Map<String, Object> additionalProperties) {
        this.disabled = disabled;
        this.defaultDeliveryMethod = defaultDeliveryMethod;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If true, this method will will not be available to the entity.
     */
    @JsonProperty("disabled")
    @java.lang.Override
    public boolean getDisabled() {
        return disabled;
    }

    /**
     * @return The default delivery method for this payment method.
     */
    @JsonProperty("defaultDeliveryMethod")
    public Optional<BankDeliveryMethod> getDefaultDeliveryMethod() {
        return defaultDeliveryMethod;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BankAccountPaymentMethodCustomizationRequest
                && equalTo((BankAccountPaymentMethodCustomizationRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BankAccountPaymentMethodCustomizationRequest other) {
        return disabled == other.disabled && defaultDeliveryMethod.equals(other.defaultDeliveryMethod);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.disabled, this.defaultDeliveryMethod);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DisabledStage builder() {
        return new Builder();
    }

    public interface DisabledStage {
        _FinalStage disabled(boolean disabled);

        Builder from(BankAccountPaymentMethodCustomizationRequest other);
    }

    public interface _FinalStage {
        BankAccountPaymentMethodCustomizationRequest build();

        _FinalStage defaultDeliveryMethod(Optional<BankDeliveryMethod> defaultDeliveryMethod);

        _FinalStage defaultDeliveryMethod(BankDeliveryMethod defaultDeliveryMethod);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DisabledStage, _FinalStage {
        private boolean disabled;

        private Optional<BankDeliveryMethod> defaultDeliveryMethod = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(BankAccountPaymentMethodCustomizationRequest other) {
            disabled(other.getDisabled());
            defaultDeliveryMethod(other.getDefaultDeliveryMethod());
            return this;
        }

        /**
         * <p>If true, this method will will not be available to the entity.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("disabled")
        public _FinalStage disabled(boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * <p>The default delivery method for this payment method.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage defaultDeliveryMethod(BankDeliveryMethod defaultDeliveryMethod) {
            this.defaultDeliveryMethod = Optional.ofNullable(defaultDeliveryMethod);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "defaultDeliveryMethod", nulls = Nulls.SKIP)
        public _FinalStage defaultDeliveryMethod(Optional<BankDeliveryMethod> defaultDeliveryMethod) {
            this.defaultDeliveryMethod = defaultDeliveryMethod;
            return this;
        }

        @java.lang.Override
        public BankAccountPaymentMethodCustomizationRequest build() {
            return new BankAccountPaymentMethodCustomizationRequest(
                    disabled, defaultDeliveryMethod, additionalProperties);
        }
    }
}
