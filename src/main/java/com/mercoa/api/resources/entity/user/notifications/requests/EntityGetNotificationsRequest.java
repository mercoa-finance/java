/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.user.notifications.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.commons.types.OrderDirection;
import com.mercoa.api.resources.entitytypes.types.NotificationType;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EntityGetNotificationsRequest.Builder.class)
public final class EntityGetNotificationsRequest {
    private final Optional<OffsetDateTime> startDate;

    private final Optional<OffsetDateTime> endDate;

    private final Optional<OrderDirection> orderDirection;

    private final Optional<Integer> limit;

    private final Optional<String> startingAfter;

    private final Optional<NotificationType> notificationType;

    private final Map<String, Object> additionalProperties;

    private EntityGetNotificationsRequest(
            Optional<OffsetDateTime> startDate,
            Optional<OffsetDateTime> endDate,
            Optional<OrderDirection> orderDirection,
            Optional<Integer> limit,
            Optional<String> startingAfter,
            Optional<NotificationType> notificationType,
            Map<String, Object> additionalProperties) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.orderDirection = orderDirection;
        this.limit = limit;
        this.startingAfter = startingAfter;
        this.notificationType = notificationType;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Start date for notification created on date filter.
     */
    @JsonProperty("startDate")
    public Optional<OffsetDateTime> getStartDate() {
        return startDate;
    }

    /**
     * @return End date for notification created date filter.
     */
    @JsonProperty("endDate")
    public Optional<OffsetDateTime> getEndDate() {
        return endDate;
    }

    /**
     * @return Direction to order notifications by. Defaults to asc.
     */
    @JsonProperty("orderDirection")
    public Optional<OrderDirection> getOrderDirection() {
        return orderDirection;
    }

    /**
     * @return Number of invoices to return. Limit can range between 1 and 100, and the default is 10.
     */
    @JsonProperty("limit")
    public Optional<Integer> getLimit() {
        return limit;
    }

    /**
     * @return The ID of the notification to start after. If not provided, the first page of invoices will be returned.
     */
    @JsonProperty("startingAfter")
    public Optional<String> getStartingAfter() {
        return startingAfter;
    }

    /**
     * @return The type of notification to filter by.
     */
    @JsonProperty("notificationType")
    public Optional<NotificationType> getNotificationType() {
        return notificationType;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityGetNotificationsRequest && equalTo((EntityGetNotificationsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityGetNotificationsRequest other) {
        return startDate.equals(other.startDate)
                && endDate.equals(other.endDate)
                && orderDirection.equals(other.orderDirection)
                && limit.equals(other.limit)
                && startingAfter.equals(other.startingAfter)
                && notificationType.equals(other.notificationType);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.startDate,
                this.endDate,
                this.orderDirection,
                this.limit,
                this.startingAfter,
                this.notificationType);
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

        private Optional<OrderDirection> orderDirection = Optional.empty();

        private Optional<Integer> limit = Optional.empty();

        private Optional<String> startingAfter = Optional.empty();

        private Optional<NotificationType> notificationType = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EntityGetNotificationsRequest other) {
            startDate(other.getStartDate());
            endDate(other.getEndDate());
            orderDirection(other.getOrderDirection());
            limit(other.getLimit());
            startingAfter(other.getStartingAfter());
            notificationType(other.getNotificationType());
            return this;
        }

        @JsonSetter(value = "startDate", nulls = Nulls.SKIP)
        public Builder startDate(Optional<OffsetDateTime> startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            this.startDate = Optional.of(startDate);
            return this;
        }

        @JsonSetter(value = "endDate", nulls = Nulls.SKIP)
        public Builder endDate(Optional<OffsetDateTime> endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder endDate(OffsetDateTime endDate) {
            this.endDate = Optional.of(endDate);
            return this;
        }

        @JsonSetter(value = "orderDirection", nulls = Nulls.SKIP)
        public Builder orderDirection(Optional<OrderDirection> orderDirection) {
            this.orderDirection = orderDirection;
            return this;
        }

        public Builder orderDirection(OrderDirection orderDirection) {
            this.orderDirection = Optional.of(orderDirection);
            return this;
        }

        @JsonSetter(value = "limit", nulls = Nulls.SKIP)
        public Builder limit(Optional<Integer> limit) {
            this.limit = limit;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = Optional.of(limit);
            return this;
        }

        @JsonSetter(value = "startingAfter", nulls = Nulls.SKIP)
        public Builder startingAfter(Optional<String> startingAfter) {
            this.startingAfter = startingAfter;
            return this;
        }

        public Builder startingAfter(String startingAfter) {
            this.startingAfter = Optional.of(startingAfter);
            return this;
        }

        @JsonSetter(value = "notificationType", nulls = Nulls.SKIP)
        public Builder notificationType(Optional<NotificationType> notificationType) {
            this.notificationType = notificationType;
            return this;
        }

        public Builder notificationType(NotificationType notificationType) {
            this.notificationType = Optional.of(notificationType);
            return this;
        }

        public EntityGetNotificationsRequest build() {
            return new EntityGetNotificationsRequest(
                    startDate, endDate, orderDirection, limit, startingAfter, notificationType, additionalProperties);
        }
    }
}
