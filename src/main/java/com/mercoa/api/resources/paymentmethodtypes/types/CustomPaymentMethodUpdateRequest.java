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
@JsonDeserialize(builder = CustomPaymentMethodUpdateRequest.Builder.class)
public final class CustomPaymentMethodUpdateRequest implements IPaymentMethodBaseRequest {
    private final Optional<Boolean> defaultSource;

    private final Optional<Boolean> defaultDestination;

    private final Optional<String> externalAccountingSystemId;

    private final Optional<Boolean> frozen;

    private final Optional<Map<String, String>> metadata;

    private final Optional<String> foreignId;

    private final Optional<String> accountName;

    private final Optional<String> accountNumber;

    private final Optional<Double> availableBalance;

    private final Optional<String> schemaId;

    private final Optional<Map<String, String>> data;

    private final Map<String, Object> additionalProperties;

    private CustomPaymentMethodUpdateRequest(
            Optional<Boolean> defaultSource,
            Optional<Boolean> defaultDestination,
            Optional<String> externalAccountingSystemId,
            Optional<Boolean> frozen,
            Optional<Map<String, String>> metadata,
            Optional<String> foreignId,
            Optional<String> accountName,
            Optional<String> accountNumber,
            Optional<Double> availableBalance,
            Optional<String> schemaId,
            Optional<Map<String, String>> data,
            Map<String, Object> additionalProperties) {
        this.defaultSource = defaultSource;
        this.defaultDestination = defaultDestination;
        this.externalAccountingSystemId = externalAccountingSystemId;
        this.frozen = frozen;
        this.metadata = metadata;
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
    public Optional<String> getSchemaId() {
        return schemaId;
    }

    /**
     * @return Object of key/value pairs that matches the keys in the linked payment method schema.
     */
    @JsonProperty("data")
    public Optional<Map<String, String>> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CustomPaymentMethodUpdateRequest && equalTo((CustomPaymentMethodUpdateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CustomPaymentMethodUpdateRequest other) {
        return defaultSource.equals(other.defaultSource)
                && defaultDestination.equals(other.defaultDestination)
                && externalAccountingSystemId.equals(other.externalAccountingSystemId)
                && frozen.equals(other.frozen)
                && metadata.equals(other.metadata)
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

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<Boolean> defaultSource = Optional.empty();

        private Optional<Boolean> defaultDestination = Optional.empty();

        private Optional<String> externalAccountingSystemId = Optional.empty();

        private Optional<Boolean> frozen = Optional.empty();

        private Optional<Map<String, String>> metadata = Optional.empty();

        private Optional<String> foreignId = Optional.empty();

        private Optional<String> accountName = Optional.empty();

        private Optional<String> accountNumber = Optional.empty();

        private Optional<Double> availableBalance = Optional.empty();

        private Optional<String> schemaId = Optional.empty();

        private Optional<Map<String, String>> data = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CustomPaymentMethodUpdateRequest other) {
            defaultSource(other.getDefaultSource());
            defaultDestination(other.getDefaultDestination());
            externalAccountingSystemId(other.getExternalAccountingSystemId());
            frozen(other.getFrozen());
            metadata(other.getMetadata());
            foreignId(other.getForeignId());
            accountName(other.getAccountName());
            accountNumber(other.getAccountNumber());
            availableBalance(other.getAvailableBalance());
            schemaId(other.getSchemaId());
            data(other.getData());
            return this;
        }

        @JsonSetter(value = "defaultSource", nulls = Nulls.SKIP)
        public Builder defaultSource(Optional<Boolean> defaultSource) {
            this.defaultSource = defaultSource;
            return this;
        }

        public Builder defaultSource(Boolean defaultSource) {
            this.defaultSource = Optional.ofNullable(defaultSource);
            return this;
        }

        @JsonSetter(value = "defaultDestination", nulls = Nulls.SKIP)
        public Builder defaultDestination(Optional<Boolean> defaultDestination) {
            this.defaultDestination = defaultDestination;
            return this;
        }

        public Builder defaultDestination(Boolean defaultDestination) {
            this.defaultDestination = Optional.ofNullable(defaultDestination);
            return this;
        }

        @JsonSetter(value = "externalAccountingSystemId", nulls = Nulls.SKIP)
        public Builder externalAccountingSystemId(Optional<String> externalAccountingSystemId) {
            this.externalAccountingSystemId = externalAccountingSystemId;
            return this;
        }

        public Builder externalAccountingSystemId(String externalAccountingSystemId) {
            this.externalAccountingSystemId = Optional.ofNullable(externalAccountingSystemId);
            return this;
        }

        @JsonSetter(value = "frozen", nulls = Nulls.SKIP)
        public Builder frozen(Optional<Boolean> frozen) {
            this.frozen = frozen;
            return this;
        }

        public Builder frozen(Boolean frozen) {
            this.frozen = Optional.ofNullable(frozen);
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<Map<String, String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String, String> metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @JsonSetter(value = "foreignId", nulls = Nulls.SKIP)
        public Builder foreignId(Optional<String> foreignId) {
            this.foreignId = foreignId;
            return this;
        }

        public Builder foreignId(String foreignId) {
            this.foreignId = Optional.ofNullable(foreignId);
            return this;
        }

        @JsonSetter(value = "accountName", nulls = Nulls.SKIP)
        public Builder accountName(Optional<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Optional.ofNullable(accountName);
            return this;
        }

        @JsonSetter(value = "accountNumber", nulls = Nulls.SKIP)
        public Builder accountNumber(Optional<String> accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder accountNumber(String accountNumber) {
            this.accountNumber = Optional.ofNullable(accountNumber);
            return this;
        }

        @JsonSetter(value = "availableBalance", nulls = Nulls.SKIP)
        public Builder availableBalance(Optional<Double> availableBalance) {
            this.availableBalance = availableBalance;
            return this;
        }

        public Builder availableBalance(Double availableBalance) {
            this.availableBalance = Optional.ofNullable(availableBalance);
            return this;
        }

        @JsonSetter(value = "schemaId", nulls = Nulls.SKIP)
        public Builder schemaId(Optional<String> schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        public Builder schemaId(String schemaId) {
            this.schemaId = Optional.ofNullable(schemaId);
            return this;
        }

        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public Builder data(Optional<Map<String, String>> data) {
            this.data = data;
            return this;
        }

        public Builder data(Map<String, String> data) {
            this.data = Optional.ofNullable(data);
            return this;
        }

        public CustomPaymentMethodUpdateRequest build() {
            return new CustomPaymentMethodUpdateRequest(
                    defaultSource,
                    defaultDestination,
                    externalAccountingSystemId,
                    frozen,
                    metadata,
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
