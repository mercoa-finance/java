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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.invoicetypes.types.InvoiceStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CounterpartyInvoiceMetricsStatusResponse.Builder.class)
public final class CounterpartyInvoiceMetricsStatusResponse {
    private final InvoiceStatus status;

    private final int totalCount;

    private final double totalAmount;

    private final Map<String, Object> additionalProperties;

    private CounterpartyInvoiceMetricsStatusResponse(
            InvoiceStatus status, int totalCount, double totalAmount, Map<String, Object> additionalProperties) {
        this.status = status;
        this.totalCount = totalCount;
        this.totalAmount = totalAmount;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("status")
    public InvoiceStatus getStatus() {
        return status;
    }

    @JsonProperty("totalCount")
    public int getTotalCount() {
        return totalCount;
    }

    @JsonProperty("totalAmount")
    public double getTotalAmount() {
        return totalAmount;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CounterpartyInvoiceMetricsStatusResponse
                && equalTo((CounterpartyInvoiceMetricsStatusResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CounterpartyInvoiceMetricsStatusResponse other) {
        return status.equals(other.status) && totalCount == other.totalCount && totalAmount == other.totalAmount;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.status, this.totalCount, this.totalAmount);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static StatusStage builder() {
        return new Builder();
    }

    public interface StatusStage {
        TotalCountStage status(InvoiceStatus status);

        Builder from(CounterpartyInvoiceMetricsStatusResponse other);
    }

    public interface TotalCountStage {
        TotalAmountStage totalCount(int totalCount);
    }

    public interface TotalAmountStage {
        _FinalStage totalAmount(double totalAmount);
    }

    public interface _FinalStage {
        CounterpartyInvoiceMetricsStatusResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements StatusStage, TotalCountStage, TotalAmountStage, _FinalStage {
        private InvoiceStatus status;

        private int totalCount;

        private double totalAmount;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CounterpartyInvoiceMetricsStatusResponse other) {
            status(other.getStatus());
            totalCount(other.getTotalCount());
            totalAmount(other.getTotalAmount());
            return this;
        }

        @java.lang.Override
        @JsonSetter("status")
        public TotalCountStage status(InvoiceStatus status) {
            this.status = status;
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
        public CounterpartyInvoiceMetricsStatusResponse build() {
            return new CounterpartyInvoiceMetricsStatusResponse(status, totalCount, totalAmount, additionalProperties);
        }
    }
}
