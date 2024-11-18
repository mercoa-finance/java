/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.counterparty.vendorcredit.requests;

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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CalculateVendorCreditUsageRequest.Builder.class)
public final class CalculateVendorCreditUsageRequest {
    private final double amount;

    private final Optional<CurrencyCode> currency;

    private final Map<String, Object> additionalProperties;

    private CalculateVendorCreditUsageRequest(
            double amount, Optional<CurrencyCode> currency, Map<String, Object> additionalProperties) {
        this.amount = amount;
        this.currency = currency;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The amount of the invoice to calculate vendor credit usage for.
     */
    @JsonProperty("amount")
    public double getAmount() {
        return amount;
    }

    /**
     * @return The currency of the invoice to calculate vendor credit usage for. Defaults to USD.
     */
    @JsonProperty("currency")
    public Optional<CurrencyCode> getCurrency() {
        return currency;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CalculateVendorCreditUsageRequest && equalTo((CalculateVendorCreditUsageRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CalculateVendorCreditUsageRequest other) {
        return amount == other.amount && currency.equals(other.currency);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.amount, this.currency);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AmountStage builder() {
        return new Builder();
    }

    public interface AmountStage {
        _FinalStage amount(double amount);

        Builder from(CalculateVendorCreditUsageRequest other);
    }

    public interface _FinalStage {
        CalculateVendorCreditUsageRequest build();

        _FinalStage currency(Optional<CurrencyCode> currency);

        _FinalStage currency(CurrencyCode currency);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AmountStage, _FinalStage {
        private double amount;

        private Optional<CurrencyCode> currency = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CalculateVendorCreditUsageRequest other) {
            amount(other.getAmount());
            currency(other.getCurrency());
            return this;
        }

        /**
         * <p>The amount of the invoice to calculate vendor credit usage for.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("amount")
        public _FinalStage amount(double amount) {
            this.amount = amount;
            return this;
        }

        /**
         * <p>The currency of the invoice to calculate vendor credit usage for. Defaults to USD.</p>
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

        @java.lang.Override
        public CalculateVendorCreditUsageRequest build() {
            return new CalculateVendorCreditUsageRequest(amount, currency, additionalProperties);
        }
    }
}
