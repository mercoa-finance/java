/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.customizationtypes.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = FeeCustomizationDetailRequest.Builder.class)
public final class FeeCustomizationDetailRequest {
    private final Optional<FeeCustomizationRailRequest> source;

    private final Optional<FeeCustomizationRailRequest> destination;

    private final Map<String, Object> additionalProperties;

    private FeeCustomizationDetailRequest(
            Optional<FeeCustomizationRailRequest> source,
            Optional<FeeCustomizationRailRequest> destination,
            Map<String, Object> additionalProperties) {
        this.source = source;
        this.destination = destination;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Fees to be applied to the source of the transaction.
     */
    @JsonProperty("source")
    public Optional<FeeCustomizationRailRequest> getSource() {
        return source;
    }

    /**
     * @return Fees to be applied to the destination of the transaction.
     */
    @JsonProperty("destination")
    public Optional<FeeCustomizationRailRequest> getDestination() {
        return destination;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FeeCustomizationDetailRequest && equalTo((FeeCustomizationDetailRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FeeCustomizationDetailRequest other) {
        return source.equals(other.source) && destination.equals(other.destination);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.source, this.destination);
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
        private Optional<FeeCustomizationRailRequest> source = Optional.empty();

        private Optional<FeeCustomizationRailRequest> destination = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(FeeCustomizationDetailRequest other) {
            source(other.getSource());
            destination(other.getDestination());
            return this;
        }

        @JsonSetter(value = "source", nulls = Nulls.SKIP)
        public Builder source(Optional<FeeCustomizationRailRequest> source) {
            this.source = source;
            return this;
        }

        public Builder source(FeeCustomizationRailRequest source) {
            this.source = Optional.ofNullable(source);
            return this;
        }

        @JsonSetter(value = "destination", nulls = Nulls.SKIP)
        public Builder destination(Optional<FeeCustomizationRailRequest> destination) {
            this.destination = destination;
            return this;
        }

        public Builder destination(FeeCustomizationRailRequest destination) {
            this.destination = Optional.ofNullable(destination);
            return this;
        }

        public FeeCustomizationDetailRequest build() {
            return new FeeCustomizationDetailRequest(source, destination, additionalProperties);
        }
    }
}
