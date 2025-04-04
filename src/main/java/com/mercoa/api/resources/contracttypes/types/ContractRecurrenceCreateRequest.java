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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ContractRecurrenceCreateRequest.Builder.class)
public final class ContractRecurrenceCreateRequest {
    private final String rrule;

    private final String justification;

    private final String filteredContractSummary;

    private final ContractInvoiceSchema invoiceSchema;

    private final Map<String, Object> additionalProperties;

    private ContractRecurrenceCreateRequest(
            String rrule,
            String justification,
            String filteredContractSummary,
            ContractInvoiceSchema invoiceSchema,
            Map<String, Object> additionalProperties) {
        this.rrule = rrule;
        this.justification = justification;
        this.filteredContractSummary = filteredContractSummary;
        this.invoiceSchema = invoiceSchema;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return RFC 5545 RRULE string
     */
    @JsonProperty("rrule")
    public String getRrule() {
        return rrule;
    }

    /**
     * @return Natural language justification for the recurrence
     */
    @JsonProperty("justification")
    public String getJustification() {
        return justification;
    }

    /**
     * @return Natural language summary of the contract, filtered to only include information relevant to the recurrence
     */
    @JsonProperty("filteredContractSummary")
    public String getFilteredContractSummary() {
        return filteredContractSummary;
    }

    /**
     * @return Schema of the invoices to be created by this recurrence
     */
    @JsonProperty("invoiceSchema")
    public ContractInvoiceSchema getInvoiceSchema() {
        return invoiceSchema;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ContractRecurrenceCreateRequest && equalTo((ContractRecurrenceCreateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ContractRecurrenceCreateRequest other) {
        return rrule.equals(other.rrule)
                && justification.equals(other.justification)
                && filteredContractSummary.equals(other.filteredContractSummary)
                && invoiceSchema.equals(other.invoiceSchema);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.rrule, this.justification, this.filteredContractSummary, this.invoiceSchema);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RruleStage builder() {
        return new Builder();
    }

    public interface RruleStage {
        JustificationStage rrule(@NotNull String rrule);

        Builder from(ContractRecurrenceCreateRequest other);
    }

    public interface JustificationStage {
        FilteredContractSummaryStage justification(@NotNull String justification);
    }

    public interface FilteredContractSummaryStage {
        InvoiceSchemaStage filteredContractSummary(@NotNull String filteredContractSummary);
    }

    public interface InvoiceSchemaStage {
        _FinalStage invoiceSchema(@NotNull ContractInvoiceSchema invoiceSchema);
    }

    public interface _FinalStage {
        ContractRecurrenceCreateRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements RruleStage, JustificationStage, FilteredContractSummaryStage, InvoiceSchemaStage, _FinalStage {
        private String rrule;

        private String justification;

        private String filteredContractSummary;

        private ContractInvoiceSchema invoiceSchema;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ContractRecurrenceCreateRequest other) {
            rrule(other.getRrule());
            justification(other.getJustification());
            filteredContractSummary(other.getFilteredContractSummary());
            invoiceSchema(other.getInvoiceSchema());
            return this;
        }

        /**
         * <p>RFC 5545 RRULE string</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("rrule")
        public JustificationStage rrule(@NotNull String rrule) {
            this.rrule = Objects.requireNonNull(rrule, "rrule must not be null");
            return this;
        }

        /**
         * <p>Natural language justification for the recurrence</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("justification")
        public FilteredContractSummaryStage justification(@NotNull String justification) {
            this.justification = Objects.requireNonNull(justification, "justification must not be null");
            return this;
        }

        /**
         * <p>Natural language summary of the contract, filtered to only include information relevant to the recurrence</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("filteredContractSummary")
        public InvoiceSchemaStage filteredContractSummary(@NotNull String filteredContractSummary) {
            this.filteredContractSummary =
                    Objects.requireNonNull(filteredContractSummary, "filteredContractSummary must not be null");
            return this;
        }

        /**
         * <p>Schema of the invoices to be created by this recurrence</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("invoiceSchema")
        public _FinalStage invoiceSchema(@NotNull ContractInvoiceSchema invoiceSchema) {
            this.invoiceSchema = Objects.requireNonNull(invoiceSchema, "invoiceSchema must not be null");
            return this;
        }

        @java.lang.Override
        public ContractRecurrenceCreateRequest build() {
            return new ContractRecurrenceCreateRequest(
                    rrule, justification, filteredContractSummary, invoiceSchema, additionalProperties);
        }
    }
}
