/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.contracttypes.types;

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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ContractUpdateRequest.Builder.class)
public final class ContractUpdateRequest {
    private final Optional<String> summary;

    private final Optional<List<ContractRecurrenceCreateRequest>> recurrences;

    private final Optional<String> creatorEntityId;

    private final Optional<String> payerId;

    private final Optional<String> vendorId;

    private final Map<String, Object> additionalProperties;

    private ContractUpdateRequest(
            Optional<String> summary,
            Optional<List<ContractRecurrenceCreateRequest>> recurrences,
            Optional<String> creatorEntityId,
            Optional<String> payerId,
            Optional<String> vendorId,
            Map<String, Object> additionalProperties) {
        this.summary = summary;
        this.recurrences = recurrences;
        this.creatorEntityId = creatorEntityId;
        this.payerId = payerId;
        this.vendorId = vendorId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Natural language summary of the contract
     */
    @JsonProperty("summary")
    public Optional<String> getSummary() {
        return summary;
    }

    /**
     * @return Recurrences defining the contract's fee schedule. Please note that setting this will overwrite all existing recurrences.
     */
    @JsonProperty("recurrences")
    public Optional<List<ContractRecurrenceCreateRequest>> getRecurrences() {
        return recurrences;
    }

    /**
     * @return ID of the entity that created the contract
     */
    @JsonProperty("creatorEntityId")
    public Optional<String> getCreatorEntityId() {
        return creatorEntityId;
    }

    /**
     * @return ID of the payer entity for this contract
     */
    @JsonProperty("payerId")
    public Optional<String> getPayerId() {
        return payerId;
    }

    /**
     * @return ID of the vendor entity for this contract
     */
    @JsonProperty("vendorId")
    public Optional<String> getVendorId() {
        return vendorId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ContractUpdateRequest && equalTo((ContractUpdateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ContractUpdateRequest other) {
        return summary.equals(other.summary)
                && recurrences.equals(other.recurrences)
                && creatorEntityId.equals(other.creatorEntityId)
                && payerId.equals(other.payerId)
                && vendorId.equals(other.vendorId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.summary, this.recurrences, this.creatorEntityId, this.payerId, this.vendorId);
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
        private Optional<String> summary = Optional.empty();

        private Optional<List<ContractRecurrenceCreateRequest>> recurrences = Optional.empty();

        private Optional<String> creatorEntityId = Optional.empty();

        private Optional<String> payerId = Optional.empty();

        private Optional<String> vendorId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ContractUpdateRequest other) {
            summary(other.getSummary());
            recurrences(other.getRecurrences());
            creatorEntityId(other.getCreatorEntityId());
            payerId(other.getPayerId());
            vendorId(other.getVendorId());
            return this;
        }

        @JsonSetter(value = "summary", nulls = Nulls.SKIP)
        public Builder summary(Optional<String> summary) {
            this.summary = summary;
            return this;
        }

        public Builder summary(String summary) {
            this.summary = Optional.ofNullable(summary);
            return this;
        }

        @JsonSetter(value = "recurrences", nulls = Nulls.SKIP)
        public Builder recurrences(Optional<List<ContractRecurrenceCreateRequest>> recurrences) {
            this.recurrences = recurrences;
            return this;
        }

        public Builder recurrences(List<ContractRecurrenceCreateRequest> recurrences) {
            this.recurrences = Optional.ofNullable(recurrences);
            return this;
        }

        @JsonSetter(value = "creatorEntityId", nulls = Nulls.SKIP)
        public Builder creatorEntityId(Optional<String> creatorEntityId) {
            this.creatorEntityId = creatorEntityId;
            return this;
        }

        public Builder creatorEntityId(String creatorEntityId) {
            this.creatorEntityId = Optional.ofNullable(creatorEntityId);
            return this;
        }

        @JsonSetter(value = "payerId", nulls = Nulls.SKIP)
        public Builder payerId(Optional<String> payerId) {
            this.payerId = payerId;
            return this;
        }

        public Builder payerId(String payerId) {
            this.payerId = Optional.ofNullable(payerId);
            return this;
        }

        @JsonSetter(value = "vendorId", nulls = Nulls.SKIP)
        public Builder vendorId(Optional<String> vendorId) {
            this.vendorId = vendorId;
            return this;
        }

        public Builder vendorId(String vendorId) {
            this.vendorId = Optional.ofNullable(vendorId);
            return this;
        }

        public ContractUpdateRequest build() {
            return new ContractUpdateRequest(
                    summary, recurrences, creatorEntityId, payerId, vendorId, additionalProperties);
        }
    }
}
