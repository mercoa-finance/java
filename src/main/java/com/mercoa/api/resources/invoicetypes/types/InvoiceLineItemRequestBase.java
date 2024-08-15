/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.paymentmethodtypes.types.CurrencyCode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = InvoiceLineItemRequestBase.Builder.class)
public final class InvoiceLineItemRequestBase implements IInvoiceLineItemRequestBase {
    private final Optional<CurrencyCode> currency;

    private final Optional<String> name;

    private final Optional<Double> quantity;

    private final Optional<Double> unitPrice;

    private final Optional<OffsetDateTime> serviceStartDate;

    private final Optional<OffsetDateTime> serviceEndDate;

    private final Optional<Map<String, String>> metadata;

    private final Optional<String> glAccountId;

    private final Map<String, Object> additionalProperties;

    private InvoiceLineItemRequestBase(
            Optional<CurrencyCode> currency,
            Optional<String> name,
            Optional<Double> quantity,
            Optional<Double> unitPrice,
            Optional<OffsetDateTime> serviceStartDate,
            Optional<OffsetDateTime> serviceEndDate,
            Optional<Map<String, String>> metadata,
            Optional<String> glAccountId,
            Map<String, Object> additionalProperties) {
        this.currency = currency;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.serviceStartDate = serviceStartDate;
        this.serviceEndDate = serviceEndDate;
        this.metadata = metadata;
        this.glAccountId = glAccountId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Currency code for the amount. Defaults to USD.
     */
    @JsonProperty("currency")
    @java.lang.Override
    public Optional<CurrencyCode> getCurrency() {
        return currency;
    }

    @JsonProperty("name")
    @java.lang.Override
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("quantity")
    @java.lang.Override
    public Optional<Double> getQuantity() {
        return quantity;
    }

    /**
     * @return Unit price of the line item in major units. If the entered amount has more decimal places than the currency supports, trailing decimals will be truncated.
     */
    @JsonProperty("unitPrice")
    @java.lang.Override
    public Optional<Double> getUnitPrice() {
        return unitPrice;
    }

    @JsonProperty("serviceStartDate")
    @java.lang.Override
    public Optional<OffsetDateTime> getServiceStartDate() {
        return serviceStartDate;
    }

    @JsonProperty("serviceEndDate")
    @java.lang.Override
    public Optional<OffsetDateTime> getServiceEndDate() {
        return serviceEndDate;
    }

    @JsonProperty("metadata")
    @java.lang.Override
    public Optional<Map<String, String>> getMetadata() {
        return metadata;
    }

    /**
     * @return ID of general ledger account associated with this line item.
     */
    @JsonProperty("glAccountId")
    @java.lang.Override
    public Optional<String> getGlAccountId() {
        return glAccountId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof InvoiceLineItemRequestBase && equalTo((InvoiceLineItemRequestBase) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(InvoiceLineItemRequestBase other) {
        return currency.equals(other.currency)
                && name.equals(other.name)
                && quantity.equals(other.quantity)
                && unitPrice.equals(other.unitPrice)
                && serviceStartDate.equals(other.serviceStartDate)
                && serviceEndDate.equals(other.serviceEndDate)
                && metadata.equals(other.metadata)
                && glAccountId.equals(other.glAccountId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.currency,
                this.name,
                this.quantity,
                this.unitPrice,
                this.serviceStartDate,
                this.serviceEndDate,
                this.metadata,
                this.glAccountId);
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
        private Optional<CurrencyCode> currency = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<Double> quantity = Optional.empty();

        private Optional<Double> unitPrice = Optional.empty();

        private Optional<OffsetDateTime> serviceStartDate = Optional.empty();

        private Optional<OffsetDateTime> serviceEndDate = Optional.empty();

        private Optional<Map<String, String>> metadata = Optional.empty();

        private Optional<String> glAccountId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(InvoiceLineItemRequestBase other) {
            currency(other.getCurrency());
            name(other.getName());
            quantity(other.getQuantity());
            unitPrice(other.getUnitPrice());
            serviceStartDate(other.getServiceStartDate());
            serviceEndDate(other.getServiceEndDate());
            metadata(other.getMetadata());
            glAccountId(other.getGlAccountId());
            return this;
        }

        @JsonSetter(value = "currency", nulls = Nulls.SKIP)
        public Builder currency(Optional<CurrencyCode> currency) {
            this.currency = currency;
            return this;
        }

        public Builder currency(CurrencyCode currency) {
            this.currency = Optional.of(currency);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @JsonSetter(value = "quantity", nulls = Nulls.SKIP)
        public Builder quantity(Optional<Double> quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder quantity(Double quantity) {
            this.quantity = Optional.of(quantity);
            return this;
        }

        @JsonSetter(value = "unitPrice", nulls = Nulls.SKIP)
        public Builder unitPrice(Optional<Double> unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public Builder unitPrice(Double unitPrice) {
            this.unitPrice = Optional.of(unitPrice);
            return this;
        }

        @JsonSetter(value = "serviceStartDate", nulls = Nulls.SKIP)
        public Builder serviceStartDate(Optional<OffsetDateTime> serviceStartDate) {
            this.serviceStartDate = serviceStartDate;
            return this;
        }

        public Builder serviceStartDate(OffsetDateTime serviceStartDate) {
            this.serviceStartDate = Optional.of(serviceStartDate);
            return this;
        }

        @JsonSetter(value = "serviceEndDate", nulls = Nulls.SKIP)
        public Builder serviceEndDate(Optional<OffsetDateTime> serviceEndDate) {
            this.serviceEndDate = serviceEndDate;
            return this;
        }

        public Builder serviceEndDate(OffsetDateTime serviceEndDate) {
            this.serviceEndDate = Optional.of(serviceEndDate);
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<Map<String, String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String, String> metadata) {
            this.metadata = Optional.of(metadata);
            return this;
        }

        @JsonSetter(value = "glAccountId", nulls = Nulls.SKIP)
        public Builder glAccountId(Optional<String> glAccountId) {
            this.glAccountId = glAccountId;
            return this;
        }

        public Builder glAccountId(String glAccountId) {
            this.glAccountId = Optional.of(glAccountId);
            return this;
        }

        public InvoiceLineItemRequestBase build() {
            return new InvoiceLineItemRequestBase(
                    currency,
                    name,
                    quantity,
                    unitPrice,
                    serviceStartDate,
                    serviceEndDate,
                    metadata,
                    glAccountId,
                    additionalProperties);
        }
    }
}
