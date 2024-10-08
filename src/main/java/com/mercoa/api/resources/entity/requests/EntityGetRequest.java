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
    private final Optional<String> returnMetadata;

    private final Map<String, Object> additionalProperties;

    private EntityGetRequest(Optional<String> returnMetadata, Map<String, Object> additionalProperties) {
        this.returnMetadata = returnMetadata;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Return simple key/value metadata for the specified keys for the entities. For more complex metadata, use the Metadata API.
     */
    @JsonProperty("returnMetadata")
    public Optional<String> getReturnMetadata() {
        return returnMetadata;
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
        return returnMetadata.equals(other.returnMetadata);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.returnMetadata);
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
        private Optional<String> returnMetadata = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EntityGetRequest other) {
            returnMetadata(other.getReturnMetadata());
            return this;
        }

        @JsonSetter(value = "returnMetadata", nulls = Nulls.SKIP)
        public Builder returnMetadata(Optional<String> returnMetadata) {
            this.returnMetadata = returnMetadata;
            return this;
        }

        public Builder returnMetadata(String returnMetadata) {
            this.returnMetadata = Optional.ofNullable(returnMetadata);
            return this;
        }

        public EntityGetRequest build() {
            return new EntityGetRequest(returnMetadata, additionalProperties);
        }
    }
}
