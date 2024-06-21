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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CustomPaymentMethodSchemaRequest.Builder.class)
public final class CustomPaymentMethodSchemaRequest {
    private final String name;

    private final boolean isSource;

    private final boolean isDestination;

    private final Optional<Integer> estimatedProcessingTime;

    private final Optional<List<CurrencyCode>> supportedCurrencies;

    private final List<CustomPaymentMethodSchemaField> fields;

    private final Map<String, Object> additionalProperties;

    private CustomPaymentMethodSchemaRequest(
            String name,
            boolean isSource,
            boolean isDestination,
            Optional<Integer> estimatedProcessingTime,
            Optional<List<CurrencyCode>> supportedCurrencies,
            List<CustomPaymentMethodSchemaField> fields,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.isSource = isSource;
        this.isDestination = isDestination;
        this.estimatedProcessingTime = estimatedProcessingTime;
        this.supportedCurrencies = supportedCurrencies;
        this.fields = fields;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return This payment method can be used as a payment source for an invoice
     */
    @JsonProperty("isSource")
    public boolean getIsSource() {
        return isSource;
    }

    /**
     * @return This payment method can be used as a payment destination for an invoice
     */
    @JsonProperty("isDestination")
    public boolean getIsDestination() {
        return isDestination;
    }

    /**
     * @return Estimated time in days for this payment method to process a payments. Set as 0 for same-day payment methods, -1 for unknown processing time.
     */
    @JsonProperty("estimatedProcessingTime")
    public Optional<Integer> getEstimatedProcessingTime() {
        return estimatedProcessingTime;
    }

    /**
     * @return List of currencies that this payment method supports. If not provided, the payment method will support only USD.
     */
    @JsonProperty("supportedCurrencies")
    public Optional<List<CurrencyCode>> getSupportedCurrencies() {
        return supportedCurrencies;
    }

    @JsonProperty("fields")
    public List<CustomPaymentMethodSchemaField> getFields() {
        return fields;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CustomPaymentMethodSchemaRequest && equalTo((CustomPaymentMethodSchemaRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CustomPaymentMethodSchemaRequest other) {
        return name.equals(other.name)
                && isSource == other.isSource
                && isDestination == other.isDestination
                && estimatedProcessingTime.equals(other.estimatedProcessingTime)
                && supportedCurrencies.equals(other.supportedCurrencies)
                && fields.equals(other.fields);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.isSource,
                this.isDestination,
                this.estimatedProcessingTime,
                this.supportedCurrencies,
                this.fields);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        IsSourceStage name(String name);

        Builder from(CustomPaymentMethodSchemaRequest other);
    }

    public interface IsSourceStage {
        IsDestinationStage isSource(boolean isSource);
    }

    public interface IsDestinationStage {
        _FinalStage isDestination(boolean isDestination);
    }

    public interface _FinalStage {
        CustomPaymentMethodSchemaRequest build();

        _FinalStage estimatedProcessingTime(Optional<Integer> estimatedProcessingTime);

        _FinalStage estimatedProcessingTime(Integer estimatedProcessingTime);

        _FinalStage supportedCurrencies(Optional<List<CurrencyCode>> supportedCurrencies);

        _FinalStage supportedCurrencies(List<CurrencyCode> supportedCurrencies);

        _FinalStage fields(List<CustomPaymentMethodSchemaField> fields);

        _FinalStage addFields(CustomPaymentMethodSchemaField fields);

        _FinalStage addAllFields(List<CustomPaymentMethodSchemaField> fields);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, IsSourceStage, IsDestinationStage, _FinalStage {
        private String name;

        private boolean isSource;

        private boolean isDestination;

        private List<CustomPaymentMethodSchemaField> fields = new ArrayList<>();

        private Optional<List<CurrencyCode>> supportedCurrencies = Optional.empty();

        private Optional<Integer> estimatedProcessingTime = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CustomPaymentMethodSchemaRequest other) {
            name(other.getName());
            isSource(other.getIsSource());
            isDestination(other.getIsDestination());
            estimatedProcessingTime(other.getEstimatedProcessingTime());
            supportedCurrencies(other.getSupportedCurrencies());
            fields(other.getFields());
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public IsSourceStage name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This payment method can be used as a payment source for an invoice</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("isSource")
        public IsDestinationStage isSource(boolean isSource) {
            this.isSource = isSource;
            return this;
        }

        /**
         * <p>This payment method can be used as a payment destination for an invoice</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("isDestination")
        public _FinalStage isDestination(boolean isDestination) {
            this.isDestination = isDestination;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllFields(List<CustomPaymentMethodSchemaField> fields) {
            this.fields.addAll(fields);
            return this;
        }

        @java.lang.Override
        public _FinalStage addFields(CustomPaymentMethodSchemaField fields) {
            this.fields.add(fields);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "fields", nulls = Nulls.SKIP)
        public _FinalStage fields(List<CustomPaymentMethodSchemaField> fields) {
            this.fields.clear();
            this.fields.addAll(fields);
            return this;
        }

        /**
         * <p>List of currencies that this payment method supports. If not provided, the payment method will support only USD.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage supportedCurrencies(List<CurrencyCode> supportedCurrencies) {
            this.supportedCurrencies = Optional.of(supportedCurrencies);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "supportedCurrencies", nulls = Nulls.SKIP)
        public _FinalStage supportedCurrencies(Optional<List<CurrencyCode>> supportedCurrencies) {
            this.supportedCurrencies = supportedCurrencies;
            return this;
        }

        /**
         * <p>Estimated time in days for this payment method to process a payments. Set as 0 for same-day payment methods, -1 for unknown processing time.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage estimatedProcessingTime(Integer estimatedProcessingTime) {
            this.estimatedProcessingTime = Optional.of(estimatedProcessingTime);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "estimatedProcessingTime", nulls = Nulls.SKIP)
        public _FinalStage estimatedProcessingTime(Optional<Integer> estimatedProcessingTime) {
            this.estimatedProcessingTime = estimatedProcessingTime;
            return this;
        }

        @java.lang.Override
        public CustomPaymentMethodSchemaRequest build() {
            return new CustomPaymentMethodSchemaRequest(
                    name,
                    isSource,
                    isDestination,
                    estimatedProcessingTime,
                    supportedCurrencies,
                    fields,
                    additionalProperties);
        }
    }
}
