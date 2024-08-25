/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.requests;

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
@JsonDeserialize(builder = EntityGetRequest.Builder.class)
public final class EntityGetRequest {
    private final Optional<Boolean> metadata;

    private final Map<String, Object> additionalProperties;

    private EntityGetRequest(Optional<Boolean> metadata, Map<String, Object> additionalProperties) {
        this.metadata = metadata;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If true, will return simple key/value metadata for the entity. For more complex metadata, use the Metadata API.
     */
    @JsonProperty("metadata")
    public Optional<Boolean> getMetadata() {
        return metadata;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityGetRequest && equalTo((EntityGetRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityGetRequest other) {
        return metadata.equals(other.metadata);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.metadata);
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
        private Optional<Boolean> metadata = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EntityGetRequest other) {
            metadata(other.getMetadata());
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<Boolean> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(Boolean metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public EntityGetRequest build() {
            return new EntityGetRequest(metadata, additionalProperties);
        }
    }
}
