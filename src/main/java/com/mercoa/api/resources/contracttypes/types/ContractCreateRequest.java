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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ContractCreateRequest.Builder.class)
public final class ContractCreateRequest {
    private final String summary;

    private final List<ContractRecurrenceCreateRequest> recurrences;

    private final String creatorEntityId;

    private final Optional<String> payerId;

    private final Optional<String> vendorId;

    private final Map<String, Object> additionalProperties;

    private ContractCreateRequest(
            String summary,
            List<ContractRecurrenceCreateRequest> recurrences,
            String creatorEntityId,
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
    public String getSummary() {
        return summary;
    }

    /**
     * @return Recurrences defining the contract's fee schedule.
     */
    @JsonProperty("recurrences")
    public List<ContractRecurrenceCreateRequest> getRecurrences() {
        return recurrences;
    }

    /**
     * @return ID of the entity that created the contract
     */
    @JsonProperty("creatorEntityId")
    public String getCreatorEntityId() {
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
        return other instanceof ContractCreateRequest && equalTo((ContractCreateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ContractCreateRequest other) {
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

    public static SummaryStage builder() {
        return new Builder();
    }

    public interface SummaryStage {
        CreatorEntityIdStage summary(String summary);

        Builder from(ContractCreateRequest other);
    }

    public interface CreatorEntityIdStage {
        _FinalStage creatorEntityId(String creatorEntityId);
    }

    public interface _FinalStage {
        ContractCreateRequest build();

        _FinalStage recurrences(List<ContractRecurrenceCreateRequest> recurrences);

        _FinalStage addRecurrences(ContractRecurrenceCreateRequest recurrences);

        _FinalStage addAllRecurrences(List<ContractRecurrenceCreateRequest> recurrences);

        _FinalStage payerId(Optional<String> payerId);

        _FinalStage payerId(String payerId);

        _FinalStage vendorId(Optional<String> vendorId);

        _FinalStage vendorId(String vendorId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SummaryStage, CreatorEntityIdStage, _FinalStage {
        private String summary;

        private String creatorEntityId;

        private Optional<String> vendorId = Optional.empty();

        private Optional<String> payerId = Optional.empty();

        private List<ContractRecurrenceCreateRequest> recurrences = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ContractCreateRequest other) {
            summary(other.getSummary());
            recurrences(other.getRecurrences());
            creatorEntityId(other.getCreatorEntityId());
            payerId(other.getPayerId());
            vendorId(other.getVendorId());
            return this;
        }

        /**
         * <p>Natural language summary of the contract</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("summary")
        public CreatorEntityIdStage summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * <p>ID of the entity that created the contract</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("creatorEntityId")
        public _FinalStage creatorEntityId(String creatorEntityId) {
            this.creatorEntityId = creatorEntityId;
            return this;
        }

        /**
         * <p>ID of the vendor entity for this contract</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage vendorId(String vendorId) {
            this.vendorId = Optional.ofNullable(vendorId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "vendorId", nulls = Nulls.SKIP)
        public _FinalStage vendorId(Optional<String> vendorId) {
            this.vendorId = vendorId;
            return this;
        }

        /**
         * <p>ID of the payer entity for this contract</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage payerId(String payerId) {
            this.payerId = Optional.ofNullable(payerId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "payerId", nulls = Nulls.SKIP)
        public _FinalStage payerId(Optional<String> payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * <p>Recurrences defining the contract's fee schedule.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllRecurrences(List<ContractRecurrenceCreateRequest> recurrences) {
            this.recurrences.addAll(recurrences);
            return this;
        }

        /**
         * <p>Recurrences defining the contract's fee schedule.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addRecurrences(ContractRecurrenceCreateRequest recurrences) {
            this.recurrences.add(recurrences);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "recurrences", nulls = Nulls.SKIP)
        public _FinalStage recurrences(List<ContractRecurrenceCreateRequest> recurrences) {
            this.recurrences.clear();
            this.recurrences.addAll(recurrences);
            return this;
        }

        @java.lang.Override
        public ContractCreateRequest build() {
            return new ContractCreateRequest(
                    summary, recurrences, creatorEntityId, payerId, vendorId, additionalProperties);
        }
    }
}
