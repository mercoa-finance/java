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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ContractInvoiceSchema.Builder.class)
public final class ContractInvoiceSchema {
    private final List<ContractInvoiceLineItemSchema> lineItems;

    private final Map<String, Object> additionalProperties;

    private ContractInvoiceSchema(
            List<ContractInvoiceLineItemSchema> lineItems, Map<String, Object> additionalProperties) {
        this.lineItems = lineItems;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Line items in the invoice
     */
    @JsonProperty("lineItems")
    public List<ContractInvoiceLineItemSchema> getLineItems() {
        return lineItems;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ContractInvoiceSchema && equalTo((ContractInvoiceSchema) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ContractInvoiceSchema other) {
        return lineItems.equals(other.lineItems);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.lineItems);
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
        private List<ContractInvoiceLineItemSchema> lineItems = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ContractInvoiceSchema other) {
            lineItems(other.getLineItems());
            return this;
        }

        @JsonSetter(value = "lineItems", nulls = Nulls.SKIP)
        public Builder lineItems(List<ContractInvoiceLineItemSchema> lineItems) {
            this.lineItems.clear();
            this.lineItems.addAll(lineItems);
            return this;
        }

        public Builder addLineItems(ContractInvoiceLineItemSchema lineItems) {
            this.lineItems.add(lineItems);
            return this;
        }

        public Builder addAllLineItems(List<ContractInvoiceLineItemSchema> lineItems) {
            this.lineItems.addAll(lineItems);
            return this;
        }

        public ContractInvoiceSchema build() {
            return new ContractInvoiceSchema(lineItems, additionalProperties);
        }
    }
}
