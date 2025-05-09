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
import com.mercoa.api.resources.entitytypes.types.CounterpartyResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ContractResponse.Builder.class)
public final class ContractResponse {
    private final String id;

    private final String summary;

    private final List<ContractRecurrenceResponse> recurrences;

    private final Optional<String> nextInvoiceDate;

    private final String creatorEntityId;

    private final Optional<String> payerId;

    private final Optional<CounterpartyResponse> payer;

    private final Optional<String> vendorId;

    private final Optional<CounterpartyResponse> vendor;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Map<String, Object> additionalProperties;

    private ContractResponse(
            String id,
            String summary,
            List<ContractRecurrenceResponse> recurrences,
            Optional<String> nextInvoiceDate,
            String creatorEntityId,
            Optional<String> payerId,
            Optional<CounterpartyResponse> payer,
            Optional<String> vendorId,
            Optional<CounterpartyResponse> vendor,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.summary = summary;
        this.recurrences = recurrences;
        this.nextInvoiceDate = nextInvoiceDate;
        this.creatorEntityId = creatorEntityId;
        this.payerId = payerId;
        this.payer = payer;
        this.vendorId = vendorId;
        this.vendor = vendor;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return Natural language summary of the contract
     */
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * @return Recurrences defining the contract's fee schedule
     */
    @JsonProperty("recurrences")
    public List<ContractRecurrenceResponse> getRecurrences() {
        return recurrences;
    }

    /**
     * @return Date of the next invoice to be created from the contract
     */
    @JsonProperty("nextInvoiceDate")
    public Optional<String> getNextInvoiceDate() {
        return nextInvoiceDate;
    }

    /**
     * @return The ID of the entity who created this contract
     */
    @JsonProperty("creatorEntityId")
    public String getCreatorEntityId() {
        return creatorEntityId;
    }

    /**
     * @return The ID of the payer entity for this contract
     */
    @JsonProperty("payerId")
    public Optional<String> getPayerId() {
        return payerId;
    }

    /**
     * @return The payer entity for this contract
     */
    @JsonProperty("payer")
    public Optional<CounterpartyResponse> getPayer() {
        return payer;
    }

    /**
     * @return The ID of the vendor entity for this contract
     */
    @JsonProperty("vendorId")
    public Optional<String> getVendorId() {
        return vendorId;
    }

    /**
     * @return The vendor entity for this contract
     */
    @JsonProperty("vendor")
    public Optional<CounterpartyResponse> getVendor() {
        return vendor;
    }

    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ContractResponse && equalTo((ContractResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ContractResponse other) {
        return id.equals(other.id)
                && summary.equals(other.summary)
                && recurrences.equals(other.recurrences)
                && nextInvoiceDate.equals(other.nextInvoiceDate)
                && creatorEntityId.equals(other.creatorEntityId)
                && payerId.equals(other.payerId)
                && payer.equals(other.payer)
                && vendorId.equals(other.vendorId)
                && vendor.equals(other.vendor)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.summary,
                this.recurrences,
                this.nextInvoiceDate,
                this.creatorEntityId,
                this.payerId,
                this.payer,
                this.vendorId,
                this.vendor,
                this.createdAt,
                this.updatedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        SummaryStage id(@NotNull String id);

        Builder from(ContractResponse other);
    }

    public interface SummaryStage {
        CreatorEntityIdStage summary(@NotNull String summary);
    }

    public interface CreatorEntityIdStage {
        CreatedAtStage creatorEntityId(@NotNull String creatorEntityId);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(@NotNull OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        ContractResponse build();

        _FinalStage recurrences(List<ContractRecurrenceResponse> recurrences);

        _FinalStage addRecurrences(ContractRecurrenceResponse recurrences);

        _FinalStage addAllRecurrences(List<ContractRecurrenceResponse> recurrences);

        _FinalStage nextInvoiceDate(Optional<String> nextInvoiceDate);

        _FinalStage nextInvoiceDate(String nextInvoiceDate);

        _FinalStage payerId(Optional<String> payerId);

        _FinalStage payerId(String payerId);

        _FinalStage payer(Optional<CounterpartyResponse> payer);

        _FinalStage payer(CounterpartyResponse payer);

        _FinalStage vendorId(Optional<String> vendorId);

        _FinalStage vendorId(String vendorId);

        _FinalStage vendor(Optional<CounterpartyResponse> vendor);

        _FinalStage vendor(CounterpartyResponse vendor);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage, SummaryStage, CreatorEntityIdStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private String id;

        private String summary;

        private String creatorEntityId;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<CounterpartyResponse> vendor = Optional.empty();

        private Optional<String> vendorId = Optional.empty();

        private Optional<CounterpartyResponse> payer = Optional.empty();

        private Optional<String> payerId = Optional.empty();

        private Optional<String> nextInvoiceDate = Optional.empty();

        private List<ContractRecurrenceResponse> recurrences = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ContractResponse other) {
            id(other.getId());
            summary(other.getSummary());
            recurrences(other.getRecurrences());
            nextInvoiceDate(other.getNextInvoiceDate());
            creatorEntityId(other.getCreatorEntityId());
            payerId(other.getPayerId());
            payer(other.getPayer());
            vendorId(other.getVendorId());
            vendor(other.getVendor());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public SummaryStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * <p>Natural language summary of the contract</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("summary")
        public CreatorEntityIdStage summary(@NotNull String summary) {
            this.summary = Objects.requireNonNull(summary, "summary must not be null");
            return this;
        }

        /**
         * <p>The ID of the entity who created this contract</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("creatorEntityId")
        public CreatedAtStage creatorEntityId(@NotNull String creatorEntityId) {
            this.creatorEntityId = Objects.requireNonNull(creatorEntityId, "creatorEntityId must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt, "createdAt must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(@NotNull OffsetDateTime updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt, "updatedAt must not be null");
            return this;
        }

        /**
         * <p>The vendor entity for this contract</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage vendor(CounterpartyResponse vendor) {
            this.vendor = Optional.ofNullable(vendor);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "vendor", nulls = Nulls.SKIP)
        public _FinalStage vendor(Optional<CounterpartyResponse> vendor) {
            this.vendor = vendor;
            return this;
        }

        /**
         * <p>The ID of the vendor entity for this contract</p>
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
         * <p>The payer entity for this contract</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage payer(CounterpartyResponse payer) {
            this.payer = Optional.ofNullable(payer);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "payer", nulls = Nulls.SKIP)
        public _FinalStage payer(Optional<CounterpartyResponse> payer) {
            this.payer = payer;
            return this;
        }

        /**
         * <p>The ID of the payer entity for this contract</p>
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
         * <p>Date of the next invoice to be created from the contract</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage nextInvoiceDate(String nextInvoiceDate) {
            this.nextInvoiceDate = Optional.ofNullable(nextInvoiceDate);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "nextInvoiceDate", nulls = Nulls.SKIP)
        public _FinalStage nextInvoiceDate(Optional<String> nextInvoiceDate) {
            this.nextInvoiceDate = nextInvoiceDate;
            return this;
        }

        /**
         * <p>Recurrences defining the contract's fee schedule</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllRecurrences(List<ContractRecurrenceResponse> recurrences) {
            this.recurrences.addAll(recurrences);
            return this;
        }

        /**
         * <p>Recurrences defining the contract's fee schedule</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addRecurrences(ContractRecurrenceResponse recurrences) {
            this.recurrences.add(recurrences);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "recurrences", nulls = Nulls.SKIP)
        public _FinalStage recurrences(List<ContractRecurrenceResponse> recurrences) {
            this.recurrences.clear();
            this.recurrences.addAll(recurrences);
            return this;
        }

        @java.lang.Override
        public ContractResponse build() {
            return new ContractResponse(
                    id,
                    summary,
                    recurrences,
                    nextInvoiceDate,
                    creatorEntityId,
                    payerId,
                    payer,
                    vendorId,
                    vendor,
                    createdAt,
                    updatedAt,
                    additionalProperties);
        }
    }
}
