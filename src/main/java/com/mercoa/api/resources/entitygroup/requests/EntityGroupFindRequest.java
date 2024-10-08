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
@JsonDeserialize(builder = EntityGroupFindRequest.Builder.class)
public final class EntityGroupFindRequest {
    private final Optional<Integer> limit;

    private final Optional<String> startingAfter;

    private final Map<String, Object> additionalProperties;

    private EntityGroupFindRequest(
            Optional<Integer> limit, Optional<String> startingAfter, Map<String, Object> additionalProperties) {
        this.limit = limit;
        this.startingAfter = startingAfter;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The maximum number of results to return. Defaults to 1. Max is 10.
     */
    @JsonProperty("limit")
    public Optional<Integer> getLimit() {
        return limit;
    }

    @JsonProperty("startingAfter")
    public Optional<String> getStartingAfter() {
        return startingAfter;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityGroupFindRequest && equalTo((EntityGroupFindRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityGroupFindRequest other) {
        return limit.equals(other.limit) && startingAfter.equals(other.startingAfter);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.limit, this.startingAfter);
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
        private Optional<Integer> limit = Optional.empty();

        private Optional<String> startingAfter = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EntityGroupFindRequest other) {
            limit(other.getLimit());
            startingAfter(other.getStartingAfter());
            return this;
        }

        @JsonSetter(value = "limit", nulls = Nulls.SKIP)
        public Builder limit(Optional<Integer> limit) {
            this.limit = limit;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        @JsonSetter(value = "startingAfter", nulls = Nulls.SKIP)
        public Builder startingAfter(Optional<String> startingAfter) {
            this.startingAfter = startingAfter;
            return this;
        }

        public Builder startingAfter(String startingAfter) {
            this.startingAfter = Optional.ofNullable(startingAfter);
            return this;
        }

        public EntityGroupFindRequest build() {
            return new EntityGroupFindRequest(limit, startingAfter, additionalProperties);
        }
    }
}
