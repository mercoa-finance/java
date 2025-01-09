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
@JsonDeserialize(builder = BulkEntityCreationFromObjectResponse.Builder.class)
public final class BulkEntityCreationFromObjectResponse {
    private final Optional<String> id;

    private final Optional<String> error;

    private final Map<String, Object> additionalProperties;

    private BulkEntityCreationFromObjectResponse(
            Optional<String> id, Optional<String> error, Map<String, Object> additionalProperties) {
        this.id = id;
        this.error = error;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The ID of the entity that was created. If the entity was not created, this will be undefined
     */
    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return The error message if the entity was not created
     */
    @JsonProperty("error")
    public Optional<String> getError() {
        return error;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BulkEntityCreationFromObjectResponse
                && equalTo((BulkEntityCreationFromObjectResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BulkEntityCreationFromObjectResponse other) {
        return id.equals(other.id) && error.equals(other.error);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.error);
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
        private Optional<String> id = Optional.empty();

        private Optional<String> error = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(BulkEntityCreationFromObjectResponse other) {
            id(other.getId());
            error(other.getError());
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.ofNullable(id);
            return this;
        }

        @JsonSetter(value = "error", nulls = Nulls.SKIP)
        public Builder error(Optional<String> error) {
            this.error = error;
            return this;
        }

        public Builder error(String error) {
            this.error = Optional.ofNullable(error);
            return this;
        }

        public BulkEntityCreationFromObjectResponse build() {
            return new BulkEntityCreationFromObjectResponse(id, error, additionalProperties);
        }
    }
}