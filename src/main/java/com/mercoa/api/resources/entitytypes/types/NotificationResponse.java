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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = NotificationResponse.Builder.class)
public final class NotificationResponse {
    private final String id;

    private final Optional<String> invoiceId;

    private final NotificationType type;

    private final NotificationStatus status;

    private final OffsetDateTime createdAt;

    private final Map<String, Object> additionalProperties;

    private NotificationResponse(
            String id,
            Optional<String> invoiceId,
            NotificationType type,
            NotificationStatus status,
            OffsetDateTime createdAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.invoiceId = invoiceId;
        this.type = type;
        this.status = status;
        this.createdAt = createdAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return The invoice ID that this notification is related to. This field is only present for notifications related to invoices.
     */
    @JsonProperty("invoiceId")
    public Optional<String> getInvoiceId() {
        return invoiceId;
    }

    @JsonProperty("type")
    public NotificationType getType() {
        return type;
    }

    @JsonProperty("status")
    public NotificationStatus getStatus() {
        return status;
    }

    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NotificationResponse && equalTo((NotificationResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NotificationResponse other) {
        return id.equals(other.id)
                && invoiceId.equals(other.invoiceId)
                && type.equals(other.type)
                && status.equals(other.status)
                && createdAt.equals(other.createdAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.invoiceId, this.type, this.status, this.createdAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        TypeStage id(String id);

        Builder from(NotificationResponse other);
    }

    public interface TypeStage {
        StatusStage type(NotificationType type);
    }

    public interface StatusStage {
        CreatedAtStage status(NotificationStatus status);
    }

    public interface CreatedAtStage {
        _FinalStage createdAt(OffsetDateTime createdAt);
    }

    public interface _FinalStage {
        NotificationResponse build();

        _FinalStage invoiceId(Optional<String> invoiceId);

        _FinalStage invoiceId(String invoiceId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, TypeStage, StatusStage, CreatedAtStage, _FinalStage {
        private String id;

        private NotificationType type;

        private NotificationStatus status;

        private OffsetDateTime createdAt;

        private Optional<String> invoiceId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(NotificationResponse other) {
            id(other.getId());
            invoiceId(other.getInvoiceId());
            type(other.getType());
            status(other.getStatus());
            createdAt(other.getCreatedAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public TypeStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("type")
        public StatusStage type(NotificationType type) {
            this.type = type;
            return this;
        }

        @java.lang.Override
        @JsonSetter("status")
        public CreatedAtStage status(NotificationStatus status) {
            this.status = status;
            return this;
        }

        @java.lang.Override
        @JsonSetter("createdAt")
        public _FinalStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The invoice ID that this notification is related to. This field is only present for notifications related to invoices.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage invoiceId(String invoiceId) {
            this.invoiceId = Optional.of(invoiceId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "invoiceId", nulls = Nulls.SKIP)
        public _FinalStage invoiceId(Optional<String> invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        @java.lang.Override
        public NotificationResponse build() {
            return new NotificationResponse(id, invoiceId, type, status, createdAt, additionalProperties);
        }
    }
}
