/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.organizationtypes.types;

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
@JsonDeserialize(builder = GenericPaymentRailRequest.Builder.class)
public final class GenericPaymentRailRequest implements IGenericPaymentRailRequest {
    private final Optional<String> name;

    private final boolean active;

    private final Map<String, Object> additionalProperties;

    private GenericPaymentRailRequest(Optional<String> name, boolean active, Map<String, Object> additionalProperties) {
        this.name = name;
        this.active = active;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("name")
    @java.lang.Override
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("active")
    @java.lang.Override
    public boolean getActive() {
        return active;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GenericPaymentRailRequest && equalTo((GenericPaymentRailRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GenericPaymentRailRequest other) {
        return name.equals(other.name) && active == other.active;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.active);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ActiveStage builder() {
        return new Builder();
    }

    public interface ActiveStage {
        _FinalStage active(boolean active);

        Builder from(GenericPaymentRailRequest other);
    }

    public interface _FinalStage {
        GenericPaymentRailRequest build();

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActiveStage, _FinalStage {
        private boolean active;

        private Optional<String> name = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(GenericPaymentRailRequest other) {
            name(other.getName());
            active(other.getActive());
            return this;
        }

        @java.lang.Override
        @JsonSetter("active")
        public _FinalStage active(boolean active) {
            this.active = active;
            return this;
        }

        @java.lang.Override
        public _FinalStage name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        public GenericPaymentRailRequest build() {
            return new GenericPaymentRailRequest(name, active, additionalProperties);
        }
    }
}
