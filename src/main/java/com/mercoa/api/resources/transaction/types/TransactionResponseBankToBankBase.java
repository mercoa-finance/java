/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.transaction.types;

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
@JsonDeserialize(builder = TransactionResponseBankToBankBase.Builder.class)
public final class TransactionResponseBankToBankBase
        implements ITransactionResponseBankToBankBase, ITransactionResponseBase {
    private final Optional<TransactionFailureReason> failureReason;

    private final String id;

    private final TransactionStatus status;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Map<String, Object> additionalProperties;

    private TransactionResponseBankToBankBase(
            Optional<TransactionFailureReason> failureReason,
            String id,
            TransactionStatus status,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Map<String, Object> additionalProperties) {
        this.failureReason = failureReason;
        this.id = id;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If the invoice failed to be paid, this field will be populated with the reason of failure.
     */
    @JsonProperty("failureReason")
    @java.lang.Override
    public Optional<TransactionFailureReason> getFailureReason() {
        return failureReason;
    }

    @JsonProperty("id")
    @java.lang.Override
    public String getId() {
        return id;
    }

    @JsonProperty("status")
    @java.lang.Override
    public TransactionStatus getStatus() {
        return status;
    }

    @JsonProperty("createdAt")
    @java.lang.Override
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updatedAt")
    @java.lang.Override
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TransactionResponseBankToBankBase && equalTo((TransactionResponseBankToBankBase) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TransactionResponseBankToBankBase other) {
        return failureReason.equals(other.failureReason)
                && id.equals(other.id)
                && status.equals(other.status)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.failureReason, this.id, this.status, this.createdAt, this.updatedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        StatusStage id(String id);

        Builder from(TransactionResponseBankToBankBase other);
    }

    public interface StatusStage {
        CreatedAtStage status(TransactionStatus status);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        TransactionResponseBankToBankBase build();

        _FinalStage failureReason(Optional<TransactionFailureReason> failureReason);

        _FinalStage failureReason(TransactionFailureReason failureReason);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, StatusStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private String id;

        private TransactionStatus status;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<TransactionFailureReason> failureReason = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TransactionResponseBankToBankBase other) {
            failureReason(other.getFailureReason());
            id(other.getId());
            status(other.getStatus());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public StatusStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("status")
        public CreatedAtStage status(TransactionStatus status) {
            this.status = status;
            return this;
        }

        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>If the invoice failed to be paid, this field will be populated with the reason of failure.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage failureReason(TransactionFailureReason failureReason) {
            this.failureReason = Optional.ofNullable(failureReason);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "failureReason", nulls = Nulls.SKIP)
        public _FinalStage failureReason(Optional<TransactionFailureReason> failureReason) {
            this.failureReason = failureReason;
            return this;
        }

        @java.lang.Override
        public TransactionResponseBankToBankBase build() {
            return new TransactionResponseBankToBankBase(
                    failureReason, id, status, createdAt, updatedAt, additionalProperties);
        }
    }
}
