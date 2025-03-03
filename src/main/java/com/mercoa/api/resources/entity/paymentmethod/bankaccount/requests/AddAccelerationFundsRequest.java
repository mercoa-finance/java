/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.paymentmethod.bankaccount.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.paymentmethodtypes.types.CurrencyCode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = AddAccelerationFundsRequest.Builder.class)
public final class AddAccelerationFundsRequest {
    private final double amount;

    private final CurrencyCode currency;

    private final Map<String, Object> additionalProperties;

    private AddAccelerationFundsRequest(
            double amount, CurrencyCode currency, Map<String, Object> additionalProperties) {
        this.amount = amount;
        this.currency = currency;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The amount of the acceleration funds to add. If the entered amount has more decimal places than the currency supports, trailing decimals will be truncated.
     */
    @JsonProperty("amount")
    public double getAmount() {
        return amount;
    }

    /**
     * @return The currency of the acceleration funds to add.
     */
    @JsonProperty("currency")
    public CurrencyCode getCurrency() {
        return currency;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AddAccelerationFundsRequest && equalTo((AddAccelerationFundsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AddAccelerationFundsRequest other) {
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
        CurrencyStage amount(double amount);

        Builder from(AddAccelerationFundsRequest other);
    }

    public interface CurrencyStage {
        _FinalStage currency(@NotNull CurrencyCode currency);
    }

    public interface _FinalStage {
        AddAccelerationFundsRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AmountStage, CurrencyStage, _FinalStage {
        private double amount;

        private CurrencyCode currency;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AddAccelerationFundsRequest other) {
            amount(other.getAmount());
            currency(other.getCurrency());
            return this;
        }

        /**
         * <p>The amount of the acceleration funds to add. If the entered amount has more decimal places than the currency supports, trailing decimals will be truncated.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("amount")
        public CurrencyStage amount(double amount) {
            this.amount = amount;
            return this;
        }

        /**
         * <p>The currency of the acceleration funds to add.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("currency")
        public _FinalStage currency(@NotNull CurrencyCode currency) {
            this.currency = Objects.requireNonNull(currency, "currency must not be null");
            return this;
        }

        @java.lang.Override
        public AddAccelerationFundsRequest build() {
            return new AddAccelerationFundsRequest(amount, currency, additionalProperties);
        }
    }
}
