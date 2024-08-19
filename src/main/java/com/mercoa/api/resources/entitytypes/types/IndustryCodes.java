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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = IndustryCodes.Builder.class)
public final class IndustryCodes {
    private final Optional<String> mcc;

    private final Map<String, Object> additionalProperties;

    private IndustryCodes(Optional<String> mcc, Map<String, Object> additionalProperties) {
        this.mcc = mcc;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("mcc")
    public Optional<String> getMcc() {
        return mcc;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof IndustryCodes && equalTo((IndustryCodes) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(IndustryCodes other) {
        return mcc.equals(other.mcc);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.mcc);
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
        private Optional<String> mcc = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(IndustryCodes other) {
            mcc(other.getMcc());
            return this;
        }

        @JsonSetter(value = "mcc", nulls = Nulls.SKIP)
        public Builder mcc(Optional<String> mcc) {
            this.mcc = mcc;
            return this;
        }

        public Builder mcc(String mcc) {
            this.mcc = Optional.ofNullable(mcc);
            return this;
        }

        public IndustryCodes build() {
            return new IndustryCodes(mcc, additionalProperties);
        }
    }
}
