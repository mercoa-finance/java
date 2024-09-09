/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.counterparty.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.entitytypes.types.CounterpartyNetworkType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = FindPayeeCounterpartiesRequest.Builder.class)
public final class FindPayeeCounterpartiesRequest {
    private final Optional<String> name;

    private final Optional<CounterpartyNetworkType> networkType;

    private final Optional<Boolean> paymentMethods;

    private final Optional<Boolean> invoiceMetrics;

    private final Optional<String> counterpartyId;

    private final Optional<Boolean> returnMetadata;

    private final Optional<Integer> limit;

    private final Optional<String> startingAfter;

    private final Map<String, Object> additionalProperties;

    private FindPayeeCounterpartiesRequest(
            Optional<String> name,
            Optional<CounterpartyNetworkType> networkType,
            Optional<Boolean> paymentMethods,
            Optional<Boolean> invoiceMetrics,
            Optional<String> counterpartyId,
            Optional<Boolean> returnMetadata,
            Optional<Integer> limit,
            Optional<String> startingAfter,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.networkType = networkType;
        this.paymentMethods = paymentMethods;
        this.invoiceMetrics = invoiceMetrics;
        this.counterpartyId = counterpartyId;
        this.returnMetadata = returnMetadata;
        this.limit = limit;
        this.startingAfter = startingAfter;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Filter by counterparty name
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return Filter by network type. By default, only ENTITY counterparties are returned.
     */
    @JsonProperty("networkType")
    public Optional<CounterpartyNetworkType> getNetworkType() {
        return networkType;
    }

    /**
     * @return If true, will include counterparty payment methods as part of the response
     */
    @JsonProperty("paymentMethods")
    public Optional<Boolean> getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * @return If true, will include counterparty invoice metrics as part of the response
     */
    @JsonProperty("invoiceMetrics")
    public Optional<Boolean> getInvoiceMetrics() {
        return invoiceMetrics;
    }

    /**
     * @return Filter by counterparty ids (Foreign ID is supported)
     */
    @JsonProperty("counterpartyId")
    public Optional<String> getCounterpartyId() {
        return counterpartyId;
    }

    /**
     * @return If true, will return simple key/value metadata for the counterparties.
     */
    @JsonProperty("returnMetadata")
    public Optional<Boolean> getReturnMetadata() {
        return returnMetadata;
    }

    /**
     * @return Number of counterparties to return. Limit can range between 1 and 100, and the default is 10.
     */
    @JsonProperty("limit")
    public Optional<Integer> getLimit() {
        return limit;
    }

    /**
     * @return The ID of the counterparties to start after. If not provided, the first page of counterparties will be returned.
     */
    @JsonProperty("startingAfter")
    public Optional<String> getStartingAfter() {
        return startingAfter;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FindPayeeCounterpartiesRequest && equalTo((FindPayeeCounterpartiesRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FindPayeeCounterpartiesRequest other) {
        return name.equals(other.name)
                && networkType.equals(other.networkType)
                && paymentMethods.equals(other.paymentMethods)
                && invoiceMetrics.equals(other.invoiceMetrics)
                && counterpartyId.equals(other.counterpartyId)
                && returnMetadata.equals(other.returnMetadata)
                && limit.equals(other.limit)
                && startingAfter.equals(other.startingAfter);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.networkType,
                this.paymentMethods,
                this.invoiceMetrics,
                this.counterpartyId,
                this.returnMetadata,
                this.limit,
                this.startingAfter);
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
        private Optional<String> name = Optional.empty();

        private Optional<CounterpartyNetworkType> networkType = Optional.empty();

        private Optional<Boolean> paymentMethods = Optional.empty();

        private Optional<Boolean> invoiceMetrics = Optional.empty();

        private Optional<String> counterpartyId = Optional.empty();

        private Optional<Boolean> returnMetadata = Optional.empty();

        private Optional<Integer> limit = Optional.empty();

        private Optional<String> startingAfter = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(FindPayeeCounterpartiesRequest other) {
            name(other.getName());
            networkType(other.getNetworkType());
            paymentMethods(other.getPaymentMethods());
            invoiceMetrics(other.getInvoiceMetrics());
            counterpartyId(other.getCounterpartyId());
            returnMetadata(other.getReturnMetadata());
            limit(other.getLimit());
            startingAfter(other.getStartingAfter());
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @JsonSetter(value = "networkType", nulls = Nulls.SKIP)
        public Builder networkType(Optional<CounterpartyNetworkType> networkType) {
            this.networkType = networkType;
            return this;
        }

        public Builder networkType(CounterpartyNetworkType networkType) {
            this.networkType = Optional.ofNullable(networkType);
            return this;
        }

        @JsonSetter(value = "paymentMethods", nulls = Nulls.SKIP)
        public Builder paymentMethods(Optional<Boolean> paymentMethods) {
            this.paymentMethods = paymentMethods;
            return this;
        }

        public Builder paymentMethods(Boolean paymentMethods) {
            this.paymentMethods = Optional.ofNullable(paymentMethods);
            return this;
        }

        @JsonSetter(value = "invoiceMetrics", nulls = Nulls.SKIP)
        public Builder invoiceMetrics(Optional<Boolean> invoiceMetrics) {
            this.invoiceMetrics = invoiceMetrics;
            return this;
        }

        public Builder invoiceMetrics(Boolean invoiceMetrics) {
            this.invoiceMetrics = Optional.ofNullable(invoiceMetrics);
            return this;
        }

        @JsonSetter(value = "counterpartyId", nulls = Nulls.SKIP)
        public Builder counterpartyId(Optional<String> counterpartyId) {
            this.counterpartyId = counterpartyId;
            return this;
        }

        public Builder counterpartyId(String counterpartyId) {
            this.counterpartyId = Optional.ofNullable(counterpartyId);
            return this;
        }

        @JsonSetter(value = "returnMetadata", nulls = Nulls.SKIP)
        public Builder returnMetadata(Optional<Boolean> returnMetadata) {
            this.returnMetadata = returnMetadata;
            return this;
        }

        public Builder returnMetadata(Boolean returnMetadata) {
            this.returnMetadata = Optional.ofNullable(returnMetadata);
            return this;
        }

        @JsonSetter(value = "limit", nulls = Nulls.SKIP)
        public Builder limit(Optional<Integer> limit) {
            this.limit = limit;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        @JsonSetter(value = "startingAfter", nulls = Nulls.SKIP)
        public Builder startingAfter(Optional<String> startingAfter) {
            this.startingAfter = startingAfter;
            return this;
        }

        public Builder startingAfter(String startingAfter) {
            this.startingAfter = Optional.ofNullable(startingAfter);
            return this;
        }

        public FindPayeeCounterpartiesRequest build() {
            return new FindPayeeCounterpartiesRequest(
                    name,
                    networkType,
                    paymentMethods,
                    invoiceMetrics,
                    counterpartyId,
                    returnMetadata,
                    limit,
                    startingAfter,
                    additionalProperties);
        }
    }
}
