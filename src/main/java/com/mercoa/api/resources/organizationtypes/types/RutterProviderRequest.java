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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = RutterProviderRequest.Builder.class)
public final class RutterProviderRequest {
    private final String clientId;

    private final String clientSecret;

    private final Map<String, Object> additionalProperties;

    private RutterProviderRequest(String clientId, String clientSecret, Map<String, Object> additionalProperties) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    @JsonProperty("clientSecret")
    public String getClientSecret() {
        return clientSecret;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RutterProviderRequest && equalTo((RutterProviderRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RutterProviderRequest other) {
        return clientId.equals(other.clientId) && clientSecret.equals(other.clientSecret);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.clientId, this.clientSecret);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ClientIdStage builder() {
        return new Builder();
    }

    public interface ClientIdStage {
        ClientSecretStage clientId(@NotNull String clientId);

        Builder from(RutterProviderRequest other);
    }

    public interface ClientSecretStage {
        _FinalStage clientSecret(@NotNull String clientSecret);
    }

    public interface _FinalStage {
        RutterProviderRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ClientIdStage, ClientSecretStage, _FinalStage {
        private String clientId;

        private String clientSecret;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(RutterProviderRequest other) {
            clientId(other.getClientId());
            clientSecret(other.getClientSecret());
            return this;
        }

        @java.lang.Override
        @JsonSetter("clientId")
        public ClientSecretStage clientId(@NotNull String clientId) {
            this.clientId = Objects.requireNonNull(clientId, "clientId must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("clientSecret")
        public _FinalStage clientSecret(@NotNull String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret, "clientSecret must not be null");
            return this;
        }

        @java.lang.Override
        public RutterProviderRequest build() {
            return new RutterProviderRequest(clientId, clientSecret, additionalProperties);
        }
    }
}
