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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = UtilityPaymentMethodRequest.Builder.class)
public final class UtilityPaymentMethodRequest implements IPaymentMethodBaseRequest {
    private final Optional<Boolean> defaultSource;

    private final Optional<Boolean> defaultDestination;

    private final Optional<String> externalAccountingSystemId;

    private final Optional<Boolean> frozen;

    private final Optional<Map<String, String>> metadata;

    private final String utilityId;

    private final Map<String, Object> additionalProperties;

    private UtilityPaymentMethodRequest(
            Optional<Boolean> defaultSource,
            Optional<Boolean> defaultDestination,
            Optional<String> externalAccountingSystemId,
            Optional<Boolean> frozen,
            Optional<Map<String, String>> metadata,
            String utilityId,
            Map<String, Object> additionalProperties) {
        this.defaultSource = defaultSource;
        this.defaultDestination = defaultDestination;
        this.externalAccountingSystemId = externalAccountingSystemId;
        this.frozen = frozen;
        this.metadata = metadata;
        this.utilityId = utilityId;
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

    /**
     * @return ID for this payment method in the external accounting system (e.g Rutter or Codat)
     */
    @JsonProperty("externalAccountingSystemId")
    @java.lang.Override
    public Optional<String> getExternalAccountingSystemId() {
        return externalAccountingSystemId;
    }

    /**
     * @return If true, this payment method will be frozen. Frozen payment methods cannot be used for payments, but will still be returned in API responses.
     */
    @JsonProperty("frozen")
    @java.lang.Override
    public Optional<Boolean> getFrozen() {
        return frozen;
    }

    /**
     * @return Metadata associated with this payment method.
     */
    @JsonProperty("metadata")
    @java.lang.Override
    public Optional<Map<String, String>> getMetadata() {
        return metadata;
    }

    /**
     * @return The ID of the utility that this payment method is linked to.
     */
    @JsonProperty("utilityId")
    public String getUtilityId() {
        return utilityId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UtilityPaymentMethodRequest && equalTo((UtilityPaymentMethodRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UtilityPaymentMethodRequest other) {
        return defaultSource.equals(other.defaultSource)
                && defaultDestination.equals(other.defaultDestination)
                && externalAccountingSystemId.equals(other.externalAccountingSystemId)
                && frozen.equals(other.frozen)
                && metadata.equals(other.metadata)
                && utilityId.equals(other.utilityId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.defaultSource,
                this.defaultDestination,
                this.externalAccountingSystemId,
                this.frozen,
                this.metadata,
                this.utilityId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UtilityIdStage builder() {
        return new Builder();
    }

    public interface UtilityIdStage {
        _FinalStage utilityId(String utilityId);

        Builder from(UtilityPaymentMethodRequest other);
    }

    public interface _FinalStage {
        UtilityPaymentMethodRequest build();

        _FinalStage defaultSource(Optional<Boolean> defaultSource);

        _FinalStage defaultSource(Boolean defaultSource);

        _FinalStage defaultDestination(Optional<Boolean> defaultDestination);

        _FinalStage defaultDestination(Boolean defaultDestination);

        _FinalStage externalAccountingSystemId(Optional<String> externalAccountingSystemId);

        _FinalStage externalAccountingSystemId(String externalAccountingSystemId);

        _FinalStage frozen(Optional<Boolean> frozen);

        _FinalStage frozen(Boolean frozen);

        _FinalStage metadata(Optional<Map<String, String>> metadata);

        _FinalStage metadata(Map<String, String> metadata);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UtilityIdStage, _FinalStage {
        private String utilityId;

        private Optional<Map<String, String>> metadata = Optional.empty();

        private Optional<Boolean> frozen = Optional.empty();

        private Optional<String> externalAccountingSystemId = Optional.empty();

        private Optional<Boolean> defaultDestination = Optional.empty();

        private Optional<Boolean> defaultSource = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UtilityPaymentMethodRequest other) {
            defaultSource(other.getDefaultSource());
            defaultDestination(other.getDefaultDestination());
            externalAccountingSystemId(other.getExternalAccountingSystemId());
            frozen(other.getFrozen());
            metadata(other.getMetadata());
            utilityId(other.getUtilityId());
            return this;
        }

        /**
         * <p>The ID of the utility that this payment method is linked to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("utilityId")
        public _FinalStage utilityId(String utilityId) {
            this.utilityId = utilityId;
            return this;
        }

        /**
         * <p>Metadata associated with this payment method.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage metadata(Map<String, String> metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<Map<String, String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>If true, this payment method will be frozen. Frozen payment methods cannot be used for payments, but will still be returned in API responses.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage frozen(Boolean frozen) {
            this.frozen = Optional.ofNullable(frozen);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "frozen", nulls = Nulls.SKIP)
        public _FinalStage frozen(Optional<Boolean> frozen) {
            this.frozen = frozen;
            return this;
        }

        /**
         * <p>ID for this payment method in the external accounting system (e.g Rutter or Codat)</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage externalAccountingSystemId(String externalAccountingSystemId) {
            this.externalAccountingSystemId = Optional.ofNullable(externalAccountingSystemId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "externalAccountingSystemId", nulls = Nulls.SKIP)
        public _FinalStage externalAccountingSystemId(Optional<String> externalAccountingSystemId) {
            this.externalAccountingSystemId = externalAccountingSystemId;
            return this;
        }

        /**
         * <p>If true, this payment method will be set as the default destination. Only one payment method can be set as the default destination. If another payment method is already set as the default destination, it will be unset.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage defaultDestination(Boolean defaultDestination) {
            this.defaultDestination = Optional.ofNullable(defaultDestination);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "defaultDestination", nulls = Nulls.SKIP)
        public _FinalStage defaultDestination(Optional<Boolean> defaultDestination) {
            this.defaultDestination = defaultDestination;
            return this;
        }

        /**
         * <p>If true, this payment method will be set as the default source. Only one payment method can be set as the default source. If another payment method is already set as the default source, it will be unset.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage defaultSource(Boolean defaultSource) {
            this.defaultSource = Optional.ofNullable(defaultSource);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "defaultSource", nulls = Nulls.SKIP)
        public _FinalStage defaultSource(Optional<Boolean> defaultSource) {
            this.defaultSource = defaultSource;
            return this;
        }

        @java.lang.Override
        public UtilityPaymentMethodRequest build() {
            return new UtilityPaymentMethodRequest(
                    defaultSource,
                    defaultDestination,
                    externalAccountingSystemId,
                    frozen,
                    metadata,
                    utilityId,
                    additionalProperties);
        }
    }
}
