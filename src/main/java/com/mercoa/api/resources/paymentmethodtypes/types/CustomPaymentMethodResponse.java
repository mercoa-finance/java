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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CustomPaymentMethodResponse.Builder.class)
public final class CustomPaymentMethodResponse implements IPaymentMethodBaseResponse {
    private final String id;

    private final boolean isDefaultSource;

    private final boolean isDefaultDestination;

    private final List<CurrencyCode> supportedCurrencies;

    private final Optional<String> externalAccountingSystemId;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final String foreignId;

    private final Optional<String> accountName;

    private final Optional<String> accountNumber;

    private final String schemaId;

    private final CustomPaymentMethodSchemaResponse schema;

    private final Map<String, String> data;

    private final Map<String, Object> additionalProperties;

    private CustomPaymentMethodResponse(
            String id,
            boolean isDefaultSource,
            boolean isDefaultDestination,
            List<CurrencyCode> supportedCurrencies,
            Optional<String> externalAccountingSystemId,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            String foreignId,
            Optional<String> accountName,
            Optional<String> accountNumber,
            String schemaId,
            CustomPaymentMethodSchemaResponse schema,
            Map<String, String> data,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.isDefaultSource = isDefaultSource;
        this.isDefaultDestination = isDefaultDestination;
        this.supportedCurrencies = supportedCurrencies;
        this.externalAccountingSystemId = externalAccountingSystemId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.foreignId = foreignId;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.schemaId = schemaId;
        this.schema = schema;
        this.data = data;
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

    /**
     * @return ID for this payment method in the external accounting system (e.g Rutter or Codat)
     */
    @JsonProperty("externalAccountingSystemId")
    @java.lang.Override
    public Optional<String> getExternalAccountingSystemId() {
        return externalAccountingSystemId;
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

    /**
     * @return ID for this payment method in your system
     */
    @JsonProperty("foreignId")
    public String getForeignId() {
        return foreignId;
    }

    @JsonProperty("accountName")
    public Optional<String> getAccountName() {
        return accountName;
    }

    @JsonProperty("accountNumber")
    public Optional<String> getAccountNumber() {
        return accountNumber;
    }

    /**
     * @return Payment method schema used for this payment method. Defines the fields that this payment method contains.
     */
    @JsonProperty("schemaId")
    public String getSchemaId() {
        return schemaId;
    }

    @JsonProperty("schema")
    public CustomPaymentMethodSchemaResponse getSchema() {
        return schema;
    }

    /**
     * @return Object of key/value pairs that matches the keys in the linked payment method schema.
     */
    @JsonProperty("data")
    public Map<String, String> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CustomPaymentMethodResponse && equalTo((CustomPaymentMethodResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CustomPaymentMethodResponse other) {
        return id.equals(other.id)
                && isDefaultSource == other.isDefaultSource
                && isDefaultDestination == other.isDefaultDestination
                && supportedCurrencies.equals(other.supportedCurrencies)
                && externalAccountingSystemId.equals(other.externalAccountingSystemId)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && foreignId.equals(other.foreignId)
                && accountName.equals(other.accountName)
                && accountNumber.equals(other.accountNumber)
                && schemaId.equals(other.schemaId)
                && schema.equals(other.schema)
                && data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.isDefaultSource,
                this.isDefaultDestination,
                this.supportedCurrencies,
                this.externalAccountingSystemId,
                this.createdAt,
                this.updatedAt,
                this.foreignId,
                this.accountName,
                this.accountNumber,
                this.schemaId,
                this.schema,
                this.data);
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

        Builder from(CustomPaymentMethodResponse other);
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
        ForeignIdStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface ForeignIdStage {
        SchemaIdStage foreignId(String foreignId);
    }

    public interface SchemaIdStage {
        SchemaStage schemaId(String schemaId);
    }

    public interface SchemaStage {
        _FinalStage schema(CustomPaymentMethodSchemaResponse schema);
    }

    public interface _FinalStage {
        CustomPaymentMethodResponse build();

        _FinalStage supportedCurrencies(List<CurrencyCode> supportedCurrencies);

        _FinalStage addSupportedCurrencies(CurrencyCode supportedCurrencies);

        _FinalStage addAllSupportedCurrencies(List<CurrencyCode> supportedCurrencies);

        _FinalStage externalAccountingSystemId(Optional<String> externalAccountingSystemId);

        _FinalStage externalAccountingSystemId(String externalAccountingSystemId);

        _FinalStage accountName(Optional<String> accountName);

        _FinalStage accountName(String accountName);

        _FinalStage accountNumber(Optional<String> accountNumber);

        _FinalStage accountNumber(String accountNumber);

        _FinalStage data(Map<String, String> data);

        _FinalStage putAllData(Map<String, String> data);

        _FinalStage data(String key, String value);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    IsDefaultSourceStage,
                    IsDefaultDestinationStage,
                    CreatedAtStage,
                    UpdatedAtStage,
                    ForeignIdStage,
                    SchemaIdStage,
                    SchemaStage,
                    _FinalStage {
        private String id;

        private boolean isDefaultSource;

        private boolean isDefaultDestination;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private String foreignId;

        private String schemaId;

        private CustomPaymentMethodSchemaResponse schema;

        private Map<String, String> data = new LinkedHashMap<>();

        private Optional<String> accountNumber = Optional.empty();

        private Optional<String> accountName = Optional.empty();

        private Optional<String> externalAccountingSystemId = Optional.empty();

        private List<CurrencyCode> supportedCurrencies = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CustomPaymentMethodResponse other) {
            id(other.getId());
            isDefaultSource(other.getIsDefaultSource());
            isDefaultDestination(other.getIsDefaultDestination());
            supportedCurrencies(other.getSupportedCurrencies());
            externalAccountingSystemId(other.getExternalAccountingSystemId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            foreignId(other.getForeignId());
            accountName(other.getAccountName());
            accountNumber(other.getAccountNumber());
            schemaId(other.getSchemaId());
            schema(other.getSchema());
            data(other.getData());
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
        public ForeignIdStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>ID for this payment method in your system</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("foreignId")
        public SchemaIdStage foreignId(String foreignId) {
            this.foreignId = foreignId;
            return this;
        }

        /**
         * <p>Payment method schema used for this payment method. Defines the fields that this payment method contains.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("schemaId")
        public SchemaStage schemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("schema")
        public _FinalStage schema(CustomPaymentMethodSchemaResponse schema) {
            this.schema = schema;
            return this;
        }

        /**
         * <p>Object of key/value pairs that matches the keys in the linked payment method schema.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage data(String key, String value) {
            this.data.put(key, value);
            return this;
        }

        /**
         * <p>Object of key/value pairs that matches the keys in the linked payment method schema.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage putAllData(Map<String, String> data) {
            this.data.putAll(data);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(Map<String, String> data) {
            this.data.clear();
            this.data.putAll(data);
            return this;
        }

        @java.lang.Override
        public _FinalStage accountNumber(String accountNumber) {
            this.accountNumber = Optional.of(accountNumber);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "accountNumber", nulls = Nulls.SKIP)
        public _FinalStage accountNumber(Optional<String> accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        @java.lang.Override
        public _FinalStage accountName(String accountName) {
            this.accountName = Optional.of(accountName);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "accountName", nulls = Nulls.SKIP)
        public _FinalStage accountName(Optional<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>ID for this payment method in the external accounting system (e.g Rutter or Codat)</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage externalAccountingSystemId(String externalAccountingSystemId) {
            this.externalAccountingSystemId = Optional.of(externalAccountingSystemId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "externalAccountingSystemId", nulls = Nulls.SKIP)
        public _FinalStage externalAccountingSystemId(Optional<String> externalAccountingSystemId) {
            this.externalAccountingSystemId = externalAccountingSystemId;
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
        public CustomPaymentMethodResponse build() {
            return new CustomPaymentMethodResponse(
                    id,
                    isDefaultSource,
                    isDefaultDestination,
                    supportedCurrencies,
                    externalAccountingSystemId,
                    createdAt,
                    updatedAt,
                    foreignId,
                    accountName,
                    accountNumber,
                    schemaId,
                    schema,
                    data,
                    additionalProperties);
        }
    }
}
