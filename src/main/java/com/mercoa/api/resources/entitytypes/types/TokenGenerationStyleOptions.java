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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TokenGenerationStyleOptions.Builder.class)
public final class TokenGenerationStyleOptions {
    private final String primaryColor;

    private final Map<String, Object> additionalProperties;

    private TokenGenerationStyleOptions(String primaryColor, Map<String, Object> additionalProperties) {
        this.primaryColor = primaryColor;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("primaryColor")
    public String getPrimaryColor() {
        return primaryColor;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TokenGenerationStyleOptions && equalTo((TokenGenerationStyleOptions) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TokenGenerationStyleOptions other) {
        return primaryColor.equals(other.primaryColor);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.primaryColor);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static PrimaryColorStage builder() {
        return new Builder();
    }

    public interface PrimaryColorStage {
        _FinalStage primaryColor(String primaryColor);

        Builder from(TokenGenerationStyleOptions other);
    }

    public interface _FinalStage {
        TokenGenerationStyleOptions build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements PrimaryColorStage, _FinalStage {
        private String primaryColor;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TokenGenerationStyleOptions other) {
            primaryColor(other.getPrimaryColor());
            return this;
        }

        @java.lang.Override
        @JsonSetter("primaryColor")
        public _FinalStage primaryColor(String primaryColor) {
            this.primaryColor = primaryColor;
            return this;
        }

        @java.lang.Override
        public TokenGenerationStyleOptions build() {
            return new TokenGenerationStyleOptions(primaryColor, additionalProperties);
        }
    }
}
