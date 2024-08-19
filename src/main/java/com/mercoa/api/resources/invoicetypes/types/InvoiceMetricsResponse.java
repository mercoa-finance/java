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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = InvoiceMetricsResponse.Builder.class)
public final class InvoiceMetricsResponse {
    private final double totalAmount;

    private final int totalCount;

    private final double averageAmount;

    private final CurrencyCode currency;

    private final Optional<Map<String, InvoiceMetricsPerDateResponse>> dates;

    private final Map<String, Object> additionalProperties;

    private InvoiceMetricsResponse(
            double totalAmount,
            int totalCount,
            double averageAmount,
            CurrencyCode currency,
            Optional<Map<String, InvoiceMetricsPerDateResponse>> dates,
            Map<String, Object> additionalProperties) {
        this.totalAmount = totalAmount;
        this.totalCount = totalCount;
        this.averageAmount = averageAmount;
        this.currency = currency;
        this.dates = dates;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("totalAmount")
    public double getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("totalCount")
    public int getTotalCount() {
        return totalCount;
    }

    @JsonProperty("averageAmount")
    public double getAverageAmount() {
        return averageAmount;
    }

    @JsonProperty("currency")
    public CurrencyCode getCurrency() {
        return currency;
    }

    @JsonProperty("dates")
    public Optional<Map<String, InvoiceMetricsPerDateResponse>> getDates() {
        return dates;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof InvoiceMetricsResponse && equalTo((InvoiceMetricsResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(InvoiceMetricsResponse other) {
        return totalAmount == other.totalAmount
                && totalCount == other.totalCount
                && averageAmount == other.averageAmount
                && currency.equals(other.currency)
                && dates.equals(other.dates);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.totalAmount, this.totalCount, this.averageAmount, this.currency, this.dates);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TotalAmountStage builder() {
        return new Builder();
    }

    public interface TotalAmountStage {
        TotalCountStage totalAmount(double totalAmount);

        Builder from(InvoiceMetricsResponse other);
    }

    public interface TotalCountStage {
        AverageAmountStage totalCount(int totalCount);
    }

    public interface AverageAmountStage {
        CurrencyStage averageAmount(double averageAmount);
    }

    public interface CurrencyStage {
        _FinalStage currency(CurrencyCode currency);
    }

    public interface _FinalStage {
        InvoiceMetricsResponse build();

        _FinalStage dates(Optional<Map<String, InvoiceMetricsPerDateResponse>> dates);

        _FinalStage dates(Map<String, InvoiceMetricsPerDateResponse> dates);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TotalAmountStage, TotalCountStage, AverageAmountStage, CurrencyStage, _FinalStage {
        private double totalAmount;

        private int totalCount;

        private double averageAmount;

        private CurrencyCode currency;

        private Optional<Map<String, InvoiceMetricsPerDateResponse>> dates = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(InvoiceMetricsResponse other) {
            totalAmount(other.getTotalAmount());
            totalCount(other.getTotalCount());
            averageAmount(other.getAverageAmount());
            currency(other.getCurrency());
            dates(other.getDates());
            return this;
        }

        @java.lang.Override
        @JsonSetter("totalAmount")
        public TotalCountStage totalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        @java.lang.Override
        @JsonSetter("totalCount")
        public AverageAmountStage totalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        @java.lang.Override
        @JsonSetter("averageAmount")
        public CurrencyStage averageAmount(double averageAmount) {
            this.averageAmount = averageAmount;
            return this;
        }

        @java.lang.Override
        @JsonSetter("currency")
        public _FinalStage currency(CurrencyCode currency) {
            this.currency = currency;
            return this;
        }

        @java.lang.Override
        public _FinalStage dates(Map<String, InvoiceMetricsPerDateResponse> dates) {
            this.dates = Optional.ofNullable(dates);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "dates", nulls = Nulls.SKIP)
        public _FinalStage dates(Optional<Map<String, InvoiceMetricsPerDateResponse>> dates) {
            this.dates = dates;
            return this;
        }

        @java.lang.Override
        public InvoiceMetricsResponse build() {
            return new InvoiceMetricsResponse(
                    totalAmount, totalCount, averageAmount, currency, dates, additionalProperties);
        }
    }
}
