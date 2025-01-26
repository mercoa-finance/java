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
import com.mercoa.api.resources.invoicetypes.types.CheckDeliveryMethod;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CheckPaymentMethodCustomizationRequest.Builder.class)
public final class CheckPaymentMethodCustomizationRequest implements IGenericPaymentMethodCustomizationRequest {
    private final boolean disabled;

    private final Optional<CheckDeliveryMethod> defaultDeliveryMethod;

    private final Optional<Boolean> printDescription;

    private final Map<String, Object> additionalProperties;

    private CheckPaymentMethodCustomizationRequest(
            boolean disabled,
            Optional<CheckDeliveryMethod> defaultDeliveryMethod,
            Optional<Boolean> printDescription,
            Map<String, Object> additionalProperties) {
        this.disabled = disabled;
        this.defaultDeliveryMethod = defaultDeliveryMethod;
        this.printDescription = printDescription;
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
    public Optional<CheckDeliveryMethod> getDefaultDeliveryMethod() {
        return defaultDeliveryMethod;
    }

    /**
     * @return If true, the check will be printed with the description.
     */
    @JsonProperty("printDescription")
    public Optional<Boolean> getPrintDescription() {
        return printDescription;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CheckPaymentMethodCustomizationRequest
                && equalTo((CheckPaymentMethodCustomizationRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CheckPaymentMethodCustomizationRequest other) {
        return disabled == other.disabled
                && defaultDeliveryMethod.equals(other.defaultDeliveryMethod)
                && printDescription.equals(other.printDescription);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.disabled, this.defaultDeliveryMethod, this.printDescription);
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

        Builder from(CheckPaymentMethodCustomizationRequest other);
    }

    public interface _FinalStage {
        CheckPaymentMethodCustomizationRequest build();

        _FinalStage defaultDeliveryMethod(Optional<CheckDeliveryMethod> defaultDeliveryMethod);

        _FinalStage defaultDeliveryMethod(CheckDeliveryMethod defaultDeliveryMethod);

        _FinalStage printDescription(Optional<Boolean> printDescription);

        _FinalStage printDescription(Boolean printDescription);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DisabledStage, _FinalStage {
        private boolean disabled;

        private Optional<Boolean> printDescription = Optional.empty();

        private Optional<CheckDeliveryMethod> defaultDeliveryMethod = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CheckPaymentMethodCustomizationRequest other) {
            disabled(other.getDisabled());
            defaultDeliveryMethod(other.getDefaultDeliveryMethod());
            printDescription(other.getPrintDescription());
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
         * <p>If true, the check will be printed with the description.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage printDescription(Boolean printDescription) {
            this.printDescription = Optional.ofNullable(printDescription);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "printDescription", nulls = Nulls.SKIP)
        public _FinalStage printDescription(Optional<Boolean> printDescription) {
            this.printDescription = printDescription;
            return this;
        }

        /**
         * <p>The default delivery method for this payment method.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage defaultDeliveryMethod(CheckDeliveryMethod defaultDeliveryMethod) {
            this.defaultDeliveryMethod = Optional.ofNullable(defaultDeliveryMethod);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "defaultDeliveryMethod", nulls = Nulls.SKIP)
        public _FinalStage defaultDeliveryMethod(Optional<CheckDeliveryMethod> defaultDeliveryMethod) {
            this.defaultDeliveryMethod = defaultDeliveryMethod;
            return this;
        }

        @java.lang.Override
        public CheckPaymentMethodCustomizationRequest build() {
            return new CheckPaymentMethodCustomizationRequest(
                    disabled, defaultDeliveryMethod, printDescription, additionalProperties);
        }
    }
}
