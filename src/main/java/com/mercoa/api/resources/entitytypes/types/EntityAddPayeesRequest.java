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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EntityAddPayeesRequest.Builder.class)
public final class EntityAddPayeesRequest {
    private final List<String> payees;

    private final Map<String, Object> additionalProperties;

    private EntityAddPayeesRequest(List<String> payees, Map<String, Object> additionalProperties) {
        this.payees = payees;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return List of payee entity IDs to associate with the entity
     */
    @JsonProperty("payees")
    public List<String> getPayees() {
        return payees;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityAddPayeesRequest && equalTo((EntityAddPayeesRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityAddPayeesRequest other) {
        return payees.equals(other.payees);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.payees);
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
        private List<String> payees = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EntityAddPayeesRequest other) {
            payees(other.getPayees());
            return this;
        }

        @JsonSetter(value = "payees", nulls = Nulls.SKIP)
        public Builder payees(List<String> payees) {
            this.payees.clear();
            this.payees.addAll(payees);
            return this;
        }

        public Builder addPayees(String payees) {
            this.payees.add(payees);
            return this;
        }

        public Builder addAllPayees(List<String> payees) {
            this.payees.addAll(payees);
            return this;
        }

        public EntityAddPayeesRequest build() {
            return new EntityAddPayeesRequest(payees, additionalProperties);
        }
    }
}
