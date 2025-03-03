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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CompleteMicroDepositsRequest.Builder.class)
public final class CompleteMicroDepositsRequest {
    private final List<Integer> amounts;

    private final Map<String, Object> additionalProperties;

    private CompleteMicroDepositsRequest(List<Integer> amounts, Map<String, Object> additionalProperties) {
        this.amounts = amounts;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The amounts of the micro deposits in cents
     */
    @JsonProperty("amounts")
    public List<Integer> getAmounts() {
        return amounts;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CompleteMicroDepositsRequest && equalTo((CompleteMicroDepositsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CompleteMicroDepositsRequest other) {
        return amounts.equals(other.amounts);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.amounts);
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
        private List<Integer> amounts = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CompleteMicroDepositsRequest other) {
            amounts(other.getAmounts());
            return this;
        }

        @JsonSetter(value = "amounts", nulls = Nulls.SKIP)
        public Builder amounts(List<Integer> amounts) {
            this.amounts.clear();
            this.amounts.addAll(amounts);
            return this;
        }

        public Builder addAmounts(Integer amounts) {
            this.amounts.add(amounts);
            return this;
        }

        public Builder addAllAmounts(List<Integer> amounts) {
            this.amounts.addAll(amounts);
            return this;
        }

        public CompleteMicroDepositsRequest build() {
            return new CompleteMicroDepositsRequest(amounts, additionalProperties);
        }
    }
}
