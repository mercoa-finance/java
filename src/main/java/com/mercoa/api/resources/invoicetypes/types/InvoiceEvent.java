/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = InvoiceEvent.Builder.class)
public final class InvoiceEvent {
    private final List<String> webhookIds;

    private final InvoiceUpdateRequest data;

    private final Optional<String> userId;

    private final OffsetDateTime createdAt;

    private final Optional<String> ipAddress;

    private final Optional<InvoiceStatus> status;

    private final Map<String, Object> additionalProperties;

    private InvoiceEvent(
            List<String> webhookIds,
            InvoiceUpdateRequest data,
            Optional<String> userId,
            OffsetDateTime createdAt,
            Optional<String> ipAddress,
            Optional<InvoiceStatus> status,
            Map<String, Object> additionalProperties) {
        this.webhookIds = webhookIds;
        this.data = data;
        this.userId = userId;
        this.createdAt = createdAt;
        this.ipAddress = ipAddress;
        this.status = status;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("webhookIds")
    public List<String> getWebhookIds() {
        return webhookIds;
    }

    @JsonProperty("data")
    public InvoiceUpdateRequest getData() {
        return data;
    }

    /**
     * @return The ID of the user who triggered this event
     */
    @JsonProperty("userId")
    public Optional<String> getUserId() {
        return userId;
    }

    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("ipAddress")
    public Optional<String> getIpAddress() {
        return ipAddress;
    }

    @JsonProperty("status")
    public Optional<InvoiceStatus> getStatus() {
        return status;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof InvoiceEvent && equalTo((InvoiceEvent) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(InvoiceEvent other) {
        return webhookIds.equals(other.webhookIds)
                && data.equals(other.data)
                && userId.equals(other.userId)
                && createdAt.equals(other.createdAt)
                && ipAddress.equals(other.ipAddress)
                && status.equals(other.status);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.webhookIds, this.data, this.userId, this.createdAt, this.ipAddress, this.status);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DataStage builder() {
        return new Builder();
    }

    public interface DataStage {
        CreatedAtStage data(InvoiceUpdateRequest data);

        Builder from(InvoiceEvent other);
    }

    public interface CreatedAtStage {
        _FinalStage createdAt(OffsetDateTime createdAt);
    }

    public interface _FinalStage {
        InvoiceEvent build();

        _FinalStage webhookIds(List<String> webhookIds);

        _FinalStage addWebhookIds(String webhookIds);

        _FinalStage addAllWebhookIds(List<String> webhookIds);

        _FinalStage userId(Optional<String> userId);

        _FinalStage userId(String userId);

        _FinalStage ipAddress(Optional<String> ipAddress);

        _FinalStage ipAddress(String ipAddress);

        _FinalStage status(Optional<InvoiceStatus> status);

        _FinalStage status(InvoiceStatus status);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DataStage, CreatedAtStage, _FinalStage {
        private InvoiceUpdateRequest data;

        private OffsetDateTime createdAt;

        private Optional<InvoiceStatus> status = Optional.empty();

        private Optional<String> ipAddress = Optional.empty();

        private Optional<String> userId = Optional.empty();

        private List<String> webhookIds = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(InvoiceEvent other) {
            webhookIds(other.getWebhookIds());
            data(other.getData());
            userId(other.getUserId());
            createdAt(other.getCreatedAt());
            ipAddress(other.getIpAddress());
            status(other.getStatus());
            return this;
        }

        @java.lang.Override
        @JsonSetter("data")
        public CreatedAtStage data(InvoiceUpdateRequest data) {
            this.data = data;
            return this;
        }

        @java.lang.Override
        @JsonSetter("createdAt")
        public _FinalStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        public _FinalStage status(InvoiceStatus status) {
            this.status = Optional.ofNullable(status);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public _FinalStage status(Optional<InvoiceStatus> status) {
            this.status = status;
            return this;
        }

        @java.lang.Override
        public _FinalStage ipAddress(String ipAddress) {
            this.ipAddress = Optional.ofNullable(ipAddress);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "ipAddress", nulls = Nulls.SKIP)
        public _FinalStage ipAddress(Optional<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * <p>The ID of the user who triggered this event</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage userId(String userId) {
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "userId", nulls = Nulls.SKIP)
        public _FinalStage userId(Optional<String> userId) {
            this.userId = userId;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllWebhookIds(List<String> webhookIds) {
            this.webhookIds.addAll(webhookIds);
            return this;
        }

        @java.lang.Override
        public _FinalStage addWebhookIds(String webhookIds) {
            this.webhookIds.add(webhookIds);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "webhookIds", nulls = Nulls.SKIP)
        public _FinalStage webhookIds(List<String> webhookIds) {
            this.webhookIds.clear();
            this.webhookIds.addAll(webhookIds);
            return this;
        }

        @java.lang.Override
        public InvoiceEvent build() {
            return new InvoiceEvent(webhookIds, data, userId, createdAt, ipAddress, status, additionalProperties);
        }
    }
}
