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
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EntityAddPayorsRequest.Builder.class)
public final class EntityAddPayorsRequest {
    private final List<String> payors;

    private final Optional<List<CounterpartyCustomizationRequest>> customizations;

    private final Map<String, Object> additionalProperties;

    private EntityAddPayorsRequest(
            List<String> payors,
            Optional<List<CounterpartyCustomizationRequest>> customizations,
            Map<String, Object> additionalProperties) {
        this.payors = payors;
        this.customizations = customizations;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return List of payor entity IDs to associate with the entity
     */
    @JsonProperty("payors")
    public List<String> getPayors() {
        return payors;
    }

    /**
     * @return List of customizations to apply to the payors. If the payor is not currently a counterparty of the entity, the counterparty will be created with the provided customizations.
     */
    @JsonProperty("customizations")
    public Optional<List<CounterpartyCustomizationRequest>> getCustomizations() {
        return customizations;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityAddPayorsRequest && equalTo((EntityAddPayorsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityAddPayorsRequest other) {
        return payors.equals(other.payors) && customizations.equals(other.customizations);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.payors, this.customizations);
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
        private List<String> payors = new ArrayList<>();

        private Optional<List<CounterpartyCustomizationRequest>> customizations = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EntityAddPayorsRequest other) {
            payors(other.getPayors());
            customizations(other.getCustomizations());
            return this;
        }

        @JsonSetter(value = "payors", nulls = Nulls.SKIP)
        public Builder payors(List<String> payors) {
            this.payors.clear();
            this.payors.addAll(payors);
            return this;
        }

        public Builder addPayors(String payors) {
            this.payors.add(payors);
            return this;
        }

        public Builder addAllPayors(List<String> payors) {
            this.payors.addAll(payors);
            return this;
        }

        @JsonSetter(value = "customizations", nulls = Nulls.SKIP)
        public Builder customizations(Optional<List<CounterpartyCustomizationRequest>> customizations) {
            this.customizations = customizations;
            return this;
        }

        public Builder customizations(List<CounterpartyCustomizationRequest> customizations) {
            this.customizations = Optional.of(customizations);
            return this;
        }

        public EntityAddPayorsRequest build() {
            return new EntityAddPayorsRequest(payors, customizations, additionalProperties);
        }
    }
}
