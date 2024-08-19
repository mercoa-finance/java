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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.paymentmethodtypes.types.CurrencyCode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = InvoiceMetricsPerDateResponse.Builder.class)
public final class InvoiceMetricsPerDateResponse {
    private final OffsetDateTime date;

    private final double totalAmount;

    private final int totalCount;

    private final double averageAmount;

    private final CurrencyCode currency;

    private final Map<String, Object> additionalProperties;

    private InvoiceMetricsPerDateResponse(
            OffsetDateTime date,
            double totalAmount,
            int totalCount,
            double averageAmount,
            CurrencyCode currency,
            Map<String, Object> additionalProperties) {
        this.date = date;
        this.totalAmount = totalAmount;
        this.totalCount = totalCount;
        this.averageAmount = averageAmount;
        this.currency = currency;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("date")
    public OffsetDateTime getDate() {
        return date;
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

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof InvoiceMetricsPerDateResponse && equalTo((InvoiceMetricsPerDateResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(InvoiceMetricsPerDateResponse other) {
        return date.equals(other.date)
                && totalAmount == other.totalAmount
                && totalCount == other.totalCount
                && averageAmount == other.averageAmount
                && currency.equals(other.currency);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.date, this.totalAmount, this.totalCount, this.averageAmount, this.currency);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DateStage builder() {
        return new Builder();
    }

    public interface DateStage {
        TotalAmountStage date(OffsetDateTime date);

        Builder from(InvoiceMetricsPerDateResponse other);
    }

    public interface TotalAmountStage {
        TotalCountStage totalAmount(double totalAmount);
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
        InvoiceMetricsPerDateResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements DateStage, TotalAmountStage, TotalCountStage, AverageAmountStage, CurrencyStage, _FinalStage {
        private OffsetDateTime date;

        private double totalAmount;

        private int totalCount;

        private double averageAmount;

        private CurrencyCode currency;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(InvoiceMetricsPerDateResponse other) {
            date(other.getDate());
            totalAmount(other.getTotalAmount());
            totalCount(other.getTotalCount());
            averageAmount(other.getAverageAmount());
            currency(other.getCurrency());
            return this;
        }

        @java.lang.Override
        @JsonSetter("date")
        public TotalAmountStage date(OffsetDateTime date) {
            this.date = date;
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
        public InvoiceMetricsPerDateResponse build() {
            return new InvoiceMetricsPerDateResponse(
                    date, totalAmount, totalCount, averageAmount, currency, additionalProperties);
        }
    }
}
