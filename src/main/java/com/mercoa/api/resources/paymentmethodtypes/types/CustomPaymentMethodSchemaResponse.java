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
@JsonDeserialize(builder = CustomPaymentMethodSchemaResponse.Builder.class)
public final class CustomPaymentMethodSchemaResponse {
    private final String id;

    private final String name;

    private final boolean isSource;

    private final boolean isDestination;

    private final List<CurrencyCode> supportedCurrencies;

    private final List<CustomPaymentMethodSchemaField> fields;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Map<String, Object> additionalProperties;

    private CustomPaymentMethodSchemaResponse(
            String id,
            String name,
            boolean isSource,
            boolean isDestination,
            List<CurrencyCode> supportedCurrencies,
            List<CustomPaymentMethodSchemaField> fields,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.name = name;
        this.isSource = isSource;
        this.isDestination = isDestination;
        this.supportedCurrencies = supportedCurrencies;
        this.fields = fields;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
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
     * @return List of currencies that this payment method supports.
     */
    @JsonProperty("supportedCurrencies")
    public List<CurrencyCode> getSupportedCurrencies() {
        return supportedCurrencies;
    }

    @JsonProperty("fields")
    public List<CustomPaymentMethodSchemaField> getFields() {
        return fields;
    }

    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CustomPaymentMethodSchemaResponse && equalTo((CustomPaymentMethodSchemaResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CustomPaymentMethodSchemaResponse other) {
        return id.equals(other.id)
                && name.equals(other.name)
                && isSource == other.isSource
                && isDestination == other.isDestination
                && supportedCurrencies.equals(other.supportedCurrencies)
                && fields.equals(other.fields)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.name,
                this.isSource,
                this.isDestination,
                this.supportedCurrencies,
                this.fields,
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
        NameStage id(String id);

        Builder from(CustomPaymentMethodSchemaResponse other);
    }

    public interface NameStage {
        IsSourceStage name(String name);
    }

    public interface IsSourceStage {
        IsDestinationStage isSource(boolean isSource);
    }

    public interface IsDestinationStage {
        CreatedAtStage isDestination(boolean isDestination);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        CustomPaymentMethodSchemaResponse build();

        _FinalStage supportedCurrencies(List<CurrencyCode> supportedCurrencies);

        _FinalStage addSupportedCurrencies(CurrencyCode supportedCurrencies);

        _FinalStage addAllSupportedCurrencies(List<CurrencyCode> supportedCurrencies);

        _FinalStage fields(List<CustomPaymentMethodSchemaField> fields);

        _FinalStage addFields(CustomPaymentMethodSchemaField fields);

        _FinalStage addAllFields(List<CustomPaymentMethodSchemaField> fields);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    NameStage,
                    IsSourceStage,
                    IsDestinationStage,
                    CreatedAtStage,
                    UpdatedAtStage,
                    _FinalStage {
        private String id;

        private String name;

        private boolean isSource;

        private boolean isDestination;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private List<CustomPaymentMethodSchemaField> fields = new ArrayList<>();

        private List<CurrencyCode> supportedCurrencies = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CustomPaymentMethodSchemaResponse other) {
            id(other.getId());
            name(other.getName());
            isSource(other.getIsSource());
            isDestination(other.getIsDestination());
            supportedCurrencies(other.getSupportedCurrencies());
            fields(other.getFields());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public NameStage id(String id) {
            this.id = id;
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
        public CreatedAtStage isDestination(boolean isDestination) {
            this.isDestination = isDestination;
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
         * <p>List of currencies that this payment method supports.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllSupportedCurrencies(List<CurrencyCode> supportedCurrencies) {
            this.supportedCurrencies.addAll(supportedCurrencies);
            return this;
        }

        /**
         * <p>List of currencies that this payment method supports.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
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
        public CustomPaymentMethodSchemaResponse build() {
            return new CustomPaymentMethodSchemaResponse(
                    id,
                    name,
                    isSource,
                    isDestination,
                    supportedCurrencies,
                    fields,
                    createdAt,
                    updatedAt,
                    additionalProperties);
        }
    }
}
