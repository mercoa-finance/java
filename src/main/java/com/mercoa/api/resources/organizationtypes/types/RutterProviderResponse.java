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
@JsonDeserialize(builder = RutterProviderResponse.Builder.class)
public final class RutterProviderResponse {
    private final boolean hasClientId;

    private final boolean hasClientSecret;

    private final Map<String, Object> additionalProperties;

    private RutterProviderResponse(
            boolean hasClientId, boolean hasClientSecret, Map<String, Object> additionalProperties) {
        this.hasClientId = hasClientId;
        this.hasClientSecret = hasClientSecret;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("hasClientId")
    public boolean getHasClientId() {
        return hasClientId;
    }

    @JsonProperty("hasClientSecret")
    public boolean getHasClientSecret() {
        return hasClientSecret;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RutterProviderResponse && equalTo((RutterProviderResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RutterProviderResponse other) {
        return hasClientId == other.hasClientId && hasClientSecret == other.hasClientSecret;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.hasClientId, this.hasClientSecret);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static HasClientIdStage builder() {
        return new Builder();
    }

    public interface HasClientIdStage {
        HasClientSecretStage hasClientId(boolean hasClientId);

        Builder from(RutterProviderResponse other);
    }

    public interface HasClientSecretStage {
        _FinalStage hasClientSecret(boolean hasClientSecret);
    }

    public interface _FinalStage {
        RutterProviderResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements HasClientIdStage, HasClientSecretStage, _FinalStage {
        private boolean hasClientId;

        private boolean hasClientSecret;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(RutterProviderResponse other) {
            hasClientId(other.getHasClientId());
            hasClientSecret(other.getHasClientSecret());
            return this;
        }

        @java.lang.Override
        @JsonSetter("hasClientId")
        public HasClientSecretStage hasClientId(boolean hasClientId) {
            this.hasClientId = hasClientId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("hasClientSecret")
        public _FinalStage hasClientSecret(boolean hasClientSecret) {
            this.hasClientSecret = hasClientSecret;
            return this;
        }

        @java.lang.Override
        public RutterProviderResponse build() {
            return new RutterProviderResponse(hasClientId, hasClientSecret, additionalProperties);
        }
    }
}
