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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CustomPaymentMethodRequest.Builder.class)
public final class CustomPaymentMethodRequest implements IPaymentMethodBaseRequest {
    private final Optional<Boolean> defaultSource;

    private final Optional<Boolean> defaultDestination;

    private final Optional<String> externalAccountingSystemId;

    private final Optional<Boolean> frozen;

    private final Optional<Map<String, String>> metadata;

    private final Optional<Boolean> confirmedByEntity;

    private final Optional<String> foreignId;

    private final Optional<String> accountName;

    private final Optional<String> accountNumber;

    private final Optional<Double> availableBalance;

    private final String schemaId;

    private final Map<String, String> data;

    private final Map<String, Object> additionalProperties;

    private CustomPaymentMethodRequest(
            Optional<Boolean> defaultSource,
            Optional<Boolean> defaultDestination,
            Optional<String> externalAccountingSystemId,
            Optional<Boolean> frozen,
            Optional<Map<String, String>> metadata,
            Optional<Boolean> confirmedByEntity,
            Optional<String> foreignId,
            Optional<String> accountName,
            Optional<String> accountNumber,
            Optional<Double> availableBalance,
            String schemaId,
            Map<String, String> data,
            Map<String, Object> additionalProperties) {
        this.defaultSource = defaultSource;
        this.defaultDestination = defaultDestination;
        this.externalAccountingSystemId = externalAccountingSystemId;
        this.frozen = frozen;
        this.metadata = metadata;
        this.confirmedByEntity = confirmedByEntity;
        this.foreignId = foreignId;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.availableBalance = availableBalance;
        this.schemaId = schemaId;
        this.data = data;
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
     * @return (ALPHA, MAY BE REMOVED) Indicate whether the payment method has been verified by the entity. This is useful if another entity has added this payment method to this entity, and you want the owner of the payment method to verify it is correct.
     */
    @JsonProperty("confirmedByEntity")
    @java.lang.Override
    public Optional<Boolean> getConfirmedByEntity() {
        return confirmedByEntity;
    }

    /**
     * @return ID for this payment method in your system
     */
    @JsonProperty("foreignId")
    public Optional<String> getForeignId() {
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
     * @return The available balance for this payment method.
     */
    @JsonProperty("availableBalance")
    public Optional<Double> getAvailableBalance() {
        return availableBalance;
    }

    /**
     * @return Payment method schema used for this payment method. Defines the fields that this payment method contains.
     */
    @JsonProperty("schemaId")
    public String getSchemaId() {
        return schemaId;
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
        return other instanceof CustomPaymentMethodRequest && equalTo((CustomPaymentMethodRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CustomPaymentMethodRequest other) {
        return defaultSource.equals(other.defaultSource)
                && defaultDestination.equals(other.defaultDestination)
                && externalAccountingSystemId.equals(other.externalAccountingSystemId)
                && frozen.equals(other.frozen)
                && metadata.equals(other.metadata)
                && confirmedByEntity.equals(other.confirmedByEntity)
                && foreignId.equals(other.foreignId)
                && accountName.equals(other.accountName)
                && accountNumber.equals(other.accountNumber)
                && availableBalance.equals(other.availableBalance)
                && schemaId.equals(other.schemaId)
                && data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.defaultSource,
                this.defaultDestination,
                this.externalAccountingSystemId,
                this.frozen,
                this.metadata,
                this.confirmedByEntity,
                this.foreignId,
                this.accountName,
                this.accountNumber,
                this.availableBalance,
                this.schemaId,
                this.data);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SchemaIdStage builder() {
        return new Builder();
    }

    public interface SchemaIdStage {
        _FinalStage schemaId(@NotNull String schemaId);

        Builder from(CustomPaymentMethodRequest other);
    }

    public interface _FinalStage {
        CustomPaymentMethodRequest build();

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

        _FinalStage confirmedByEntity(Optional<Boolean> confirmedByEntity);

        _FinalStage confirmedByEntity(Boolean confirmedByEntity);

        _FinalStage foreignId(Optional<String> foreignId);

        _FinalStage foreignId(String foreignId);

        _FinalStage accountName(Optional<String> accountName);

        _FinalStage accountName(String accountName);

        _FinalStage accountNumber(Optional<String> accountNumber);

        _FinalStage accountNumber(String accountNumber);

        _FinalStage availableBalance(Optional<Double> availableBalance);

        _FinalStage availableBalance(Double availableBalance);

        _FinalStage data(Map<String, String> data);

        _FinalStage putAllData(Map<String, String> data);

        _FinalStage data(String key, String value);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SchemaIdStage, _FinalStage {
        private String schemaId;

        private Map<String, String> data = new LinkedHashMap<>();

        private Optional<Double> availableBalance = Optional.empty();

        private Optional<String> accountNumber = Optional.empty();

        private Optional<String> accountName = Optional.empty();

        private Optional<String> foreignId = Optional.empty();

        private Optional<Boolean> confirmedByEntity = Optional.empty();

        private Optional<Map<String, String>> metadata = Optional.empty();

        private Optional<Boolean> frozen = Optional.empty();

        private Optional<String> externalAccountingSystemId = Optional.empty();

        private Optional<Boolean> defaultDestination = Optional.empty();

        private Optional<Boolean> defaultSource = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CustomPaymentMethodRequest other) {
            defaultSource(other.getDefaultSource());
            defaultDestination(other.getDefaultDestination());
            externalAccountingSystemId(other.getExternalAccountingSystemId());
            frozen(other.getFrozen());
            metadata(other.getMetadata());
            confirmedByEntity(other.getConfirmedByEntity());
            foreignId(other.getForeignId());
            accountName(other.getAccountName());
            accountNumber(other.getAccountNumber());
            availableBalance(other.getAvailableBalance());
            schemaId(other.getSchemaId());
            data(other.getData());
            return this;
        }

        /**
         * <p>Payment method schema used for this payment method. Defines the fields that this payment method contains.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("schemaId")
        public _FinalStage schemaId(@NotNull String schemaId) {
            this.schemaId = Objects.requireNonNull(schemaId, "schemaId must not be null");
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

        /**
         * <p>The available balance for this payment method.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage availableBalance(Double availableBalance) {
            this.availableBalance = Optional.ofNullable(availableBalance);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "availableBalance", nulls = Nulls.SKIP)
        public _FinalStage availableBalance(Optional<Double> availableBalance) {
            this.availableBalance = availableBalance;
            return this;
        }

        @java.lang.Override
        public _FinalStage accountNumber(String accountNumber) {
            this.accountNumber = Optional.ofNullable(accountNumber);
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
            this.accountName = Optional.ofNullable(accountName);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "accountName", nulls = Nulls.SKIP)
        public _FinalStage accountName(Optional<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>ID for this payment method in your system</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage foreignId(String foreignId) {
            this.foreignId = Optional.ofNullable(foreignId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "foreignId", nulls = Nulls.SKIP)
        public _FinalStage foreignId(Optional<String> foreignId) {
            this.foreignId = foreignId;
            return this;
        }

        /**
         * <p>(ALPHA, MAY BE REMOVED) Indicate whether the payment method has been verified by the entity. This is useful if another entity has added this payment method to this entity, and you want the owner of the payment method to verify it is correct.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage confirmedByEntity(Boolean confirmedByEntity) {
            this.confirmedByEntity = Optional.ofNullable(confirmedByEntity);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "confirmedByEntity", nulls = Nulls.SKIP)
        public _FinalStage confirmedByEntity(Optional<Boolean> confirmedByEntity) {
            this.confirmedByEntity = confirmedByEntity;
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
        public CustomPaymentMethodRequest build() {
            return new CustomPaymentMethodRequest(
                    defaultSource,
                    defaultDestination,
                    externalAccountingSystemId,
                    frozen,
                    metadata,
                    confirmedByEntity,
                    foreignId,
                    accountName,
                    accountNumber,
                    availableBalance,
                    schemaId,
                    data,
                    additionalProperties);
        }
    }
}
