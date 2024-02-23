/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.fees.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.invoicetypes.types.PaymentDestinationOptions;
import com.mercoa.api.resources.paymentmethodtypes.types.CurrencyCode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CalculateFeesRequest.Builder.class)
public final class CalculateFeesRequest {
    private final double amount;

    private final Optional<CurrencyCode> currency;

    private final String paymentSourceId;

    private final String paymentDestinationId;

    private final Optional<PaymentDestinationOptions> paymentDestinationOptions;

    private final Map<String, Object> additionalProperties;

    private CalculateFeesRequest(
            double amount,
            Optional<CurrencyCode> currency,
            String paymentSourceId,
            String paymentDestinationId,
            Optional<PaymentDestinationOptions> paymentDestinationOptions,
            Map<String, Object> additionalProperties) {
        this.amount = amount;
        this.currency = currency;
        this.paymentSourceId = paymentSourceId;
        this.paymentDestinationId = paymentDestinationId;
        this.paymentDestinationOptions = paymentDestinationOptions;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Total amount in major units. If the entered amount has more decimal places than the currency supports, trailing decimals will be truncated.
     */
    @JsonProperty("amount")
    public double getAmount() {
        return amount;
    }

    /**
     * @return Currency code for the amount. Defaults to USD.
     */
    @JsonProperty("currency")
    public Optional<CurrencyCode> getCurrency() {
        return currency;
    }

    /**
     * @return ID of payment source.
     */
    @JsonProperty("paymentSourceId")
    public String getPaymentSourceId() {
        return paymentSourceId;
    }

    /**
     * @return ID of payment destination.
     */
    @JsonProperty("paymentDestinationId")
    public String getPaymentDestinationId() {
        return paymentDestinationId;
    }

    /**
     * @return Options for the payment destination. Depending on the payment destination, this may include things such as check delivery method.
     */
    @JsonProperty("paymentDestinationOptions")
    public Optional<PaymentDestinationOptions> getPaymentDestinationOptions() {
        return paymentDestinationOptions;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CalculateFeesRequest && equalTo((CalculateFeesRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CalculateFeesRequest other) {
        return amount == other.amount
                && currency.equals(other.currency)
                && paymentSourceId.equals(other.paymentSourceId)
                && paymentDestinationId.equals(other.paymentDestinationId)
                && paymentDestinationOptions.equals(other.paymentDestinationOptions);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.amount,
                this.currency,
                this.paymentSourceId,
                this.paymentDestinationId,
                this.paymentDestinationOptions);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AmountStage builder() {
        return new Builder();
    }

    public interface AmountStage {
        PaymentSourceIdStage amount(double amount);

        Builder from(CalculateFeesRequest other);
    }

    public interface PaymentSourceIdStage {
        PaymentDestinationIdStage paymentSourceId(String paymentSourceId);
    }

    public interface PaymentDestinationIdStage {
        _FinalStage paymentDestinationId(String paymentDestinationId);
    }

    public interface _FinalStage {
        CalculateFeesRequest build();

        _FinalStage currency(Optional<CurrencyCode> currency);

        _FinalStage currency(CurrencyCode currency);

        _FinalStage paymentDestinationOptions(Optional<PaymentDestinationOptions> paymentDestinationOptions);

        _FinalStage paymentDestinationOptions(PaymentDestinationOptions paymentDestinationOptions);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AmountStage, PaymentSourceIdStage, PaymentDestinationIdStage, _FinalStage {
        private double amount;

        private String paymentSourceId;

        private String paymentDestinationId;

        private Optional<PaymentDestinationOptions> paymentDestinationOptions = Optional.empty();

        private Optional<CurrencyCode> currency = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CalculateFeesRequest other) {
            amount(other.getAmount());
            currency(other.getCurrency());
            paymentSourceId(other.getPaymentSourceId());
            paymentDestinationId(other.getPaymentDestinationId());
            paymentDestinationOptions(other.getPaymentDestinationOptions());
            return this;
        }

        /**
         * <p>Total amount in major units. If the entered amount has more decimal places than the currency supports, trailing decimals will be truncated.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("amount")
        public PaymentSourceIdStage amount(double amount) {
            this.amount = amount;
            return this;
        }

        /**
         * <p>ID of payment source.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("paymentSourceId")
        public PaymentDestinationIdStage paymentSourceId(String paymentSourceId) {
            this.paymentSourceId = paymentSourceId;
            return this;
        }

        /**
         * <p>ID of payment destination.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("paymentDestinationId")
        public _FinalStage paymentDestinationId(String paymentDestinationId) {
            this.paymentDestinationId = paymentDestinationId;
            return this;
        }

        /**
         * <p>Options for the payment destination. Depending on the payment destination, this may include things such as check delivery method.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage paymentDestinationOptions(PaymentDestinationOptions paymentDestinationOptions) {
            this.paymentDestinationOptions = Optional.of(paymentDestinationOptions);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "paymentDestinationOptions", nulls = Nulls.SKIP)
        public _FinalStage paymentDestinationOptions(Optional<PaymentDestinationOptions> paymentDestinationOptions) {
            this.paymentDestinationOptions = paymentDestinationOptions;
            return this;
        }

        /**
         * <p>Currency code for the amount. Defaults to USD.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage currency(CurrencyCode currency) {
            this.currency = Optional.of(currency);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "currency", nulls = Nulls.SKIP)
        public _FinalStage currency(Optional<CurrencyCode> currency) {
            this.currency = currency;
            return this;
        }

        @java.lang.Override
        public CalculateFeesRequest build() {
            return new CalculateFeesRequest(
                    amount,
                    currency,
                    paymentSourceId,
                    paymentDestinationId,
                    paymentDestinationOptions,
                    additionalProperties);
        }
    }
}
