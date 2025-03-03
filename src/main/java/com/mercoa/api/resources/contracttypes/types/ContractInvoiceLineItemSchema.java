/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.contracttypes.types;

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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ContractInvoiceLineItemSchema.Builder.class)
public final class ContractInvoiceLineItemSchema {
    private final String name;

    private final Optional<Double> unitPrice;

    private final Optional<CurrencyCode> currency;

    private final Optional<Double> quantity;

    private final Map<String, Object> additionalProperties;

    private ContractInvoiceLineItemSchema(
            String name,
            Optional<Double> unitPrice,
            Optional<CurrencyCode> currency,
            Optional<Double> quantity,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.currency = currency;
        this.quantity = quantity;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Name of the line item
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return Unit price of the line item
     */
    @JsonProperty("unitPrice")
    public Optional<Double> getUnitPrice() {
        return unitPrice;
    }

    /**
     * @return ISO 4217 currency code
     */
    @JsonProperty("currency")
    public Optional<CurrencyCode> getCurrency() {
        return currency;
    }

    /**
     * @return Quantity of the line item
     */
    @JsonProperty("quantity")
    public Optional<Double> getQuantity() {
        return quantity;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ContractInvoiceLineItemSchema && equalTo((ContractInvoiceLineItemSchema) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ContractInvoiceLineItemSchema other) {
        return name.equals(other.name)
                && unitPrice.equals(other.unitPrice)
                && currency.equals(other.currency)
                && quantity.equals(other.quantity);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.unitPrice, this.currency, this.quantity);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        _FinalStage name(@NotNull String name);

        Builder from(ContractInvoiceLineItemSchema other);
    }

    public interface _FinalStage {
        ContractInvoiceLineItemSchema build();

        _FinalStage unitPrice(Optional<Double> unitPrice);

        _FinalStage unitPrice(Double unitPrice);

        _FinalStage currency(Optional<CurrencyCode> currency);

        _FinalStage currency(CurrencyCode currency);

        _FinalStage quantity(Optional<Double> quantity);

        _FinalStage quantity(Double quantity);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, _FinalStage {
        private String name;

        private Optional<Double> quantity = Optional.empty();

        private Optional<CurrencyCode> currency = Optional.empty();

        private Optional<Double> unitPrice = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ContractInvoiceLineItemSchema other) {
            name(other.getName());
            unitPrice(other.getUnitPrice());
            currency(other.getCurrency());
            quantity(other.getQuantity());
            return this;
        }

        /**
         * <p>Name of the line item</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public _FinalStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        /**
         * <p>Quantity of the line item</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage quantity(Double quantity) {
            this.quantity = Optional.ofNullable(quantity);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "quantity", nulls = Nulls.SKIP)
        public _FinalStage quantity(Optional<Double> quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>ISO 4217 currency code</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage currency(CurrencyCode currency) {
            this.currency = Optional.ofNullable(currency);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "currency", nulls = Nulls.SKIP)
        public _FinalStage currency(Optional<CurrencyCode> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * <p>Unit price of the line item</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage unitPrice(Double unitPrice) {
            this.unitPrice = Optional.ofNullable(unitPrice);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "unitPrice", nulls = Nulls.SKIP)
        public _FinalStage unitPrice(Optional<Double> unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        @java.lang.Override
        public ContractInvoiceLineItemSchema build() {
            return new ContractInvoiceLineItemSchema(name, unitPrice, currency, quantity, additionalProperties);
        }
    }
}
