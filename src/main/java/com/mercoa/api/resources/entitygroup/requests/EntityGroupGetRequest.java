/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitygroup.requests;

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
@JsonDeserialize(builder = EntityGroupGetRequest.Builder.class)
public final class EntityGroupGetRequest {
    private final Optional<Boolean> entityMetadata;

    private final Map<String, Object> additionalProperties;

    private EntityGroupGetRequest(Optional<Boolean> entityMetadata, Map<String, Object> additionalProperties) {
        this.entityMetadata = entityMetadata;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If true, will return simple key/value metadata for entities in the group. For more complex metadata, use the Metadata API.
     */
    @JsonProperty("entityMetadata")
    public Optional<Boolean> getEntityMetadata() {
        return entityMetadata;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityGroupGetRequest && equalTo((EntityGroupGetRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityGroupGetRequest other) {
        return entityMetadata.equals(other.entityMetadata);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.entityMetadata);
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
        private Optional<Boolean> entityMetadata = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EntityGroupGetRequest other) {
            entityMetadata(other.getEntityMetadata());
            return this;
        }

        @JsonSetter(value = "entityMetadata", nulls = Nulls.SKIP)
        public Builder entityMetadata(Optional<Boolean> entityMetadata) {
            this.entityMetadata = entityMetadata;
            return this;
        }

        public Builder entityMetadata(Boolean entityMetadata) {
            this.entityMetadata = Optional.ofNullable(entityMetadata);
            return this;
        }

        public EntityGroupGetRequest build() {
            return new EntityGroupGetRequest(entityMetadata, additionalProperties);
        }
    }
}