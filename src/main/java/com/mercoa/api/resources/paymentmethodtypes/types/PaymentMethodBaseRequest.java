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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PaymentMethodBaseRequest.Builder.class)
public final class PaymentMethodBaseRequest implements IPaymentMethodBaseRequest {
    private final Optional<Boolean> defaultSource;

    private final Optional<Boolean> defaultDestination;

    private final Map<String, Object> additionalProperties;

    private PaymentMethodBaseRequest(
            Optional<Boolean> defaultSource,
            Optional<Boolean> defaultDestination,
            Map<String, Object> additionalProperties) {
        this.defaultSource = defaultSource;
        this.defaultDestination = defaultDestination;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If true, this payment method will be set as the default source. Only one payment method can be set as the default source. If another payment method is already set as the default source, it will be unset.
     */
    @JsonProperty("defaultSource")
    @java.lang.Override
    public Optional<Boolean> getDefaultSource() {
        return defaultSource;
    }

    /**
     * @return If true, this payment method will be set as the default destination. Only one payment method can be set as the default destination. If another payment method is already set as the default destination, it will be unset.
     */
    @JsonProperty("defaultDestination")
    @java.lang.Override
    public Optional<Boolean> getDefaultDestination() {
        return defaultDestination;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PaymentMethodBaseRequest && equalTo((PaymentMethodBaseRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PaymentMethodBaseRequest other) {
        return defaultSource.equals(other.defaultSource) && defaultDestination.equals(other.defaultDestination);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.defaultSource, this.defaultDestination);
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
        private Optional<Boolean> defaultSource = Optional.empty();

        private Optional<Boolean> defaultDestination = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(PaymentMethodBaseRequest other) {
            defaultSource(other.getDefaultSource());
            defaultDestination(other.getDefaultDestination());
            return this;
        }

        @JsonSetter(value = "defaultSource", nulls = Nulls.SKIP)
        public Builder defaultSource(Optional<Boolean> defaultSource) {
            this.defaultSource = defaultSource;
            return this;
        }

        public Builder defaultSource(Boolean defaultSource) {
            this.defaultSource = Optional.of(defaultSource);
            return this;
        }

        @JsonSetter(value = "defaultDestination", nulls = Nulls.SKIP)
        public Builder defaultDestination(Optional<Boolean> defaultDestination) {
            this.defaultDestination = defaultDestination;
            return this;
        }

        public Builder defaultDestination(Boolean defaultDestination) {
            this.defaultDestination = Optional.of(defaultDestination);
            return this;
        }

        public PaymentMethodBaseRequest build() {
            return new PaymentMethodBaseRequest(defaultSource, defaultDestination, additionalProperties);
        }
    }
}
