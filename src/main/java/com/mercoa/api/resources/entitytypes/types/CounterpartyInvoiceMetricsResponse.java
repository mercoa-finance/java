/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitytypes.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CounterpartyInvoiceMetricsResponse.Builder.class)
public final class CounterpartyInvoiceMetricsResponse {
    private final int totalCount;

    private final double totalAmount;

    private final List<CounterpartyInvoiceMetricsStatusResponse> statuses;

    private final Map<String, Object> additionalProperties;

    private CounterpartyInvoiceMetricsResponse(
            int totalCount,
            double totalAmount,
            List<CounterpartyInvoiceMetricsStatusResponse> statuses,
            Map<String, Object> additionalProperties) {
        this.totalCount = totalCount;
        this.totalAmount = totalAmount;
        this.statuses = statuses;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("totalCount")
    public int getTotalCount() {
        return totalCount;
    }

    @JsonProperty("totalAmount")
    public double getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("statuses")
    public List<CounterpartyInvoiceMetricsStatusResponse> getStatuses() {
        return statuses;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CounterpartyInvoiceMetricsResponse
                && equalTo((CounterpartyInvoiceMetricsResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CounterpartyInvoiceMetricsResponse other) {
        return totalCount == other.totalCount && totalAmount == other.totalAmount && statuses.equals(other.statuses);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.totalCount, this.totalAmount, this.statuses);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TotalCountStage builder() {
        return new Builder();
    }

    public interface TotalCountStage {
        TotalAmountStage totalCount(int totalCount);

        Builder from(CounterpartyInvoiceMetricsResponse other);
    }

    public interface TotalAmountStage {
        _FinalStage totalAmount(double totalAmount);
    }

    public interface _FinalStage {
        CounterpartyInvoiceMetricsResponse build();

        _FinalStage statuses(List<CounterpartyInvoiceMetricsStatusResponse> statuses);

        _FinalStage addStatuses(CounterpartyInvoiceMetricsStatusResponse statuses);

        _FinalStage addAllStatuses(List<CounterpartyInvoiceMetricsStatusResponse> statuses);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TotalCountStage, TotalAmountStage, _FinalStage {
        private int totalCount;

        private double totalAmount;

        private List<CounterpartyInvoiceMetricsStatusResponse> statuses = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CounterpartyInvoiceMetricsResponse other) {
            totalCount(other.getTotalCount());
            totalAmount(other.getTotalAmount());
            statuses(other.getStatuses());
            return this;
        }

        @java.lang.Override
        @JsonSetter("totalCount")
        public TotalAmountStage totalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        @java.lang.Override
        @JsonSetter("totalAmount")
        public _FinalStage totalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllStatuses(List<CounterpartyInvoiceMetricsStatusResponse> statuses) {
            this.statuses.addAll(statuses);
            return this;
        }

        @java.lang.Override
        public _FinalStage addStatuses(CounterpartyInvoiceMetricsStatusResponse statuses) {
            this.statuses.add(statuses);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "statuses", nulls = Nulls.SKIP)
        public _FinalStage statuses(List<CounterpartyInvoiceMetricsStatusResponse> statuses) {
            this.statuses.clear();
            this.statuses.addAll(statuses);
            return this;
        }

        @java.lang.Override
        public CounterpartyInvoiceMetricsResponse build() {
            return new CounterpartyInvoiceMetricsResponse(totalCount, totalAmount, statuses, additionalProperties);
        }
    }
}
