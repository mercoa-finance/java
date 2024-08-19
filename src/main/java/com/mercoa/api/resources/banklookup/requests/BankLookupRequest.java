/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.banklookup.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = BankLookupRequest.Builder.class)
public final class BankLookupRequest {
    private final String routingNumber;

    private final Map<String, Object> additionalProperties;

    private BankLookupRequest(String routingNumber, Map<String, Object> additionalProperties) {
        this.routingNumber = routingNumber;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Routing number to validate
     */
    @JsonProperty("routingNumber")
    public String getRoutingNumber() {
        return routingNumber;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BankLookupRequest && equalTo((BankLookupRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BankLookupRequest other) {
        return routingNumber.equals(other.routingNumber);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.routingNumber);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RoutingNumberStage builder() {
        return new Builder();
    }

    public interface RoutingNumberStage {
        _FinalStage routingNumber(String routingNumber);

        Builder from(BankLookupRequest other);
    }

    public interface _FinalStage {
        BankLookupRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements RoutingNumberStage, _FinalStage {
        private String routingNumber;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(BankLookupRequest other) {
            routingNumber(other.getRoutingNumber());
            return this;
        }

        /**
         * <p>Routing number to validate</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("routingNumber")
        public _FinalStage routingNumber(String routingNumber) {
            this.routingNumber = routingNumber;
            return this;
        }

        @java.lang.Override
        public BankLookupRequest build() {
            return new BankLookupRequest(routingNumber, additionalProperties);
        }
    }
}
