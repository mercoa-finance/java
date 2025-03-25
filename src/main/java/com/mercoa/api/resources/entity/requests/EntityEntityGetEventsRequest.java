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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = EntityEntityGetEventsRequest.Builder.class)
public final class EntityEntityGetEventsRequest {
    private final Optional<OffsetDateTime> startDate;

    private final Optional<OffsetDateTime> endDate;

    private final Optional<Integer> limit;

    private final Optional<String> startingAfter;

    private final Map<String, Object> additionalProperties;

    private EntityEntityGetEventsRequest(
            Optional<OffsetDateTime> startDate,
            Optional<OffsetDateTime> endDate,
            Optional<Integer> limit,
            Optional<String> startingAfter,
            Map<String, Object> additionalProperties) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.limit = limit;
        this.startingAfter = startingAfter;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Start date filter. If not provided, events from the start of time will be returned.
     */
    @JsonProperty("startDate")
    public Optional<OffsetDateTime> getStartDate() {
        return startDate;
    }

    /**
     * @return End date filter. If not provided, events to the end of time will be returned.
     */
    @JsonProperty("endDate")
    public Optional<OffsetDateTime> getEndDate() {
        return endDate;
    }

    /**
     * @return Number of events to return. Limit can range between 1 and 100, and the default is 50.
     */
    @JsonProperty("limit")
    public Optional<Integer> getLimit() {
        return limit;
    }

    /**
     * @return The ID of the event to start after. If not provided, the first page of events will be returned.
     */
    @JsonProperty("startingAfter")
    public Optional<String> getStartingAfter() {
        return startingAfter;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityEntityGetEventsRequest && equalTo((EntityEntityGetEventsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityEntityGetEventsRequest other) {
        return startDate.equals(other.startDate)
                && endDate.equals(other.endDate)
                && limit.equals(other.limit)
                && startingAfter.equals(other.startingAfter);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.startDate, this.endDate, this.limit, this.startingAfter);
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
        private Optional<OffsetDateTime> startDate = Optional.empty();

        private Optional<OffsetDateTime> endDate = Optional.empty();

        private Optional<Integer> limit = Optional.empty();

        private Optional<String> startingAfter = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EntityEntityGetEventsRequest other) {
            startDate(other.getStartDate());
            endDate(other.getEndDate());
            limit(other.getLimit());
            startingAfter(other.getStartingAfter());
            return this;
        }

        @JsonSetter(value = "startDate", nulls = Nulls.SKIP)
        public Builder startDate(Optional<OffsetDateTime> startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        @JsonSetter(value = "endDate", nulls = Nulls.SKIP)
        public Builder endDate(Optional<OffsetDateTime> endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder endDate(OffsetDateTime endDate) {
            this.endDate = Optional.ofNullable(endDate);
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

        public EntityEntityGetEventsRequest build() {
            return new EntityEntityGetEventsRequest(startDate, endDate, limit, startingAfter, additionalProperties);
        }
    }
}
