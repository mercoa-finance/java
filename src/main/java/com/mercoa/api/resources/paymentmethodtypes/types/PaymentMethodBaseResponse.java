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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PaymentMethodBaseResponse.Builder.class)
public final class PaymentMethodBaseResponse implements IPaymentMethodBaseResponse {
    private final String id;

    private final boolean isDefaultSource;

    private final boolean isDefaultDestination;

    private final List<CurrencyCode> supportedCurrencies;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Map<String, Object> additionalProperties;

    private PaymentMethodBaseResponse(
            String id,
            boolean isDefaultSource,
            boolean isDefaultDestination,
            List<CurrencyCode> supportedCurrencies,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.isDefaultSource = isDefaultSource;
        this.isDefaultDestination = isDefaultDestination;
        this.supportedCurrencies = supportedCurrencies;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    @java.lang.Override
    public String getId() {
        return id;
    }

    /**
     * @return Indicates whether this payment method is the default source for the entity
     */
    @JsonProperty("isDefaultSource")
    @java.lang.Override
    public boolean getIsDefaultSource() {
        return isDefaultSource;
    }

    /**
     * @return Indicates whether this payment method is the default destination for the entity
     */
    @JsonProperty("isDefaultDestination")
    @java.lang.Override
    public boolean getIsDefaultDestination() {
        return isDefaultDestination;
    }

    @JsonProperty("supportedCurrencies")
    @java.lang.Override
    public List<CurrencyCode> getSupportedCurrencies() {
        return supportedCurrencies;
    }

    @JsonProperty("createdAt")
    @java.lang.Override
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updatedAt")
    @java.lang.Override
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PaymentMethodBaseResponse && equalTo((PaymentMethodBaseResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PaymentMethodBaseResponse other) {
        return id.equals(other.id)
                && isDefaultSource == other.isDefaultSource
                && isDefaultDestination == other.isDefaultDestination
                && supportedCurrencies.equals(other.supportedCurrencies)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.isDefaultSource,
                this.isDefaultDestination,
                this.supportedCurrencies,
                this.createdAt,
                this.updatedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        IsDefaultSourceStage id(String id);

        Builder from(PaymentMethodBaseResponse other);
    }

    public interface IsDefaultSourceStage {
        IsDefaultDestinationStage isDefaultSource(boolean isDefaultSource);
    }

    public interface IsDefaultDestinationStage {
        CreatedAtStage isDefaultDestination(boolean isDefaultDestination);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        PaymentMethodBaseResponse build();

        _FinalStage supportedCurrencies(List<CurrencyCode> supportedCurrencies);

        _FinalStage addSupportedCurrencies(CurrencyCode supportedCurrencies);

        _FinalStage addAllSupportedCurrencies(List<CurrencyCode> supportedCurrencies);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    IsDefaultSourceStage,
                    IsDefaultDestinationStage,
                    CreatedAtStage,
                    UpdatedAtStage,
                    _FinalStage {
        private String id;

        private boolean isDefaultSource;

        private boolean isDefaultDestination;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private List<CurrencyCode> supportedCurrencies = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PaymentMethodBaseResponse other) {
            id(other.getId());
            isDefaultSource(other.getIsDefaultSource());
            isDefaultDestination(other.getIsDefaultDestination());
            supportedCurrencies(other.getSupportedCurrencies());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public IsDefaultSourceStage id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Indicates whether this payment method is the default source for the entity</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("isDefaultSource")
        public IsDefaultDestinationStage isDefaultSource(boolean isDefaultSource) {
            this.isDefaultSource = isDefaultSource;
            return this;
        }

        /**
         * <p>Indicates whether this payment method is the default destination for the entity</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("isDefaultDestination")
        public CreatedAtStage isDefaultDestination(boolean isDefaultDestination) {
            this.isDefaultDestination = isDefaultDestination;
            return this;
        }

        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllSupportedCurrencies(List<CurrencyCode> supportedCurrencies) {
            this.supportedCurrencies.addAll(supportedCurrencies);
            return this;
        }

        @java.lang.Override
        public _FinalStage addSupportedCurrencies(CurrencyCode supportedCurrencies) {
            this.supportedCurrencies.add(supportedCurrencies);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "supportedCurrencies", nulls = Nulls.SKIP)
        public _FinalStage supportedCurrencies(List<CurrencyCode> supportedCurrencies) {
            this.supportedCurrencies.clear();
            this.supportedCurrencies.addAll(supportedCurrencies);
            return this;
        }

        @java.lang.Override
        public PaymentMethodBaseResponse build() {
            return new PaymentMethodBaseResponse(
                    id,
                    isDefaultSource,
                    isDefaultDestination,
                    supportedCurrencies,
                    createdAt,
                    updatedAt,
                    additionalProperties);
        }
    }
}
