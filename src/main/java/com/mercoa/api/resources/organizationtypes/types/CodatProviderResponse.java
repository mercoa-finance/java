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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CodatProviderResponse.Builder.class)
public final class CodatProviderResponse {
    private final boolean hasApiKey;

    private final Map<String, Object> additionalProperties;

    private CodatProviderResponse(boolean hasApiKey, Map<String, Object> additionalProperties) {
        this.hasApiKey = hasApiKey;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("hasApiKey")
    public boolean getHasApiKey() {
        return hasApiKey;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CodatProviderResponse && equalTo((CodatProviderResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CodatProviderResponse other) {
        return hasApiKey == other.hasApiKey;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.hasApiKey);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static HasApiKeyStage builder() {
        return new Builder();
    }

    public interface HasApiKeyStage {
        _FinalStage hasApiKey(boolean hasApiKey);

        Builder from(CodatProviderResponse other);
    }

    public interface _FinalStage {
        CodatProviderResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements HasApiKeyStage, _FinalStage {
        private boolean hasApiKey;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CodatProviderResponse other) {
            hasApiKey(other.getHasApiKey());
            return this;
        }

        @java.lang.Override
        @JsonSetter("hasApiKey")
        public _FinalStage hasApiKey(boolean hasApiKey) {
            this.hasApiKey = hasApiKey;
            return this;
        }

        @java.lang.Override
        public CodatProviderResponse build() {
            return new CodatProviderResponse(hasApiKey, additionalProperties);
        }
    }
}
