/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.customizationtypes.types;

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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = OcrCustomizationRequest.Builder.class)
public final class OcrCustomizationRequest {
    private final Optional<Boolean> lineItems;

    private final Optional<Boolean> collapseLineItems;

    private final Optional<Boolean> invoiceMetadata;

    private final Optional<Boolean> lineItemMetadata;

    private final Optional<Boolean> lineItemGlAccountId;

    private final Optional<Boolean> predictMetadata;

    private final Optional<Boolean> taxAndShippingAsLineItems;

    private final Optional<Boolean> splitDocuments;

    private final Map<String, Object> additionalProperties;

    private OcrCustomizationRequest(
            Optional<Boolean> lineItems,
            Optional<Boolean> collapseLineItems,
            Optional<Boolean> invoiceMetadata,
            Optional<Boolean> lineItemMetadata,
            Optional<Boolean> lineItemGlAccountId,
            Optional<Boolean> predictMetadata,
            Optional<Boolean> taxAndShippingAsLineItems,
            Optional<Boolean> splitDocuments,
            Map<String, Object> additionalProperties) {
        this.lineItems = lineItems;
        this.collapseLineItems = collapseLineItems;
        this.invoiceMetadata = invoiceMetadata;
        this.lineItemMetadata = lineItemMetadata;
        this.lineItemGlAccountId = lineItemGlAccountId;
        this.predictMetadata = predictMetadata;
        this.taxAndShippingAsLineItems = taxAndShippingAsLineItems;
        this.splitDocuments = splitDocuments;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Extract line items from the invoice. Defaults to true.
     */
    @JsonProperty("lineItems")
    public Optional<Boolean> getLineItems() {
        return lineItems;
    }

    /**
     * @return If true, the line items will be collapsed into a single line item. Defaults to false.
     */
    @JsonProperty("collapseLineItems")
    public Optional<Boolean> getCollapseLineItems() {
        return collapseLineItems;
    }

    /**
     * @return Pull custom metadata at the invoice level. Defaults to true.
     */
    @JsonProperty("invoiceMetadata")
    public Optional<Boolean> getInvoiceMetadata() {
        return invoiceMetadata;
    }

    /**
     * @return Pull custom metadata at the line item level. Defaults to true.
     */
    @JsonProperty("lineItemMetadata")
    public Optional<Boolean> getLineItemMetadata() {
        return lineItemMetadata;
    }

    /**
     * @return Pull GL Account ID at the line item level. Defaults to true.
     */
    @JsonProperty("lineItemGlAccountId")
    public Optional<Boolean> getLineItemGlAccountId() {
        return lineItemGlAccountId;
    }

    /**
     * @return Use AI to predict metadata from historical data. Defaults to true.
     */
    @JsonProperty("predictMetadata")
    public Optional<Boolean> getPredictMetadata() {
        return predictMetadata;
    }

    /**
     * @return Pull tax and shipping information as line items. Defaults to true. If false, tax and shipping will extracted as invoice level fields.
     */
    @JsonProperty("taxAndShippingAsLineItems")
    public Optional<Boolean> getTaxAndShippingAsLineItems() {
        return taxAndShippingAsLineItems;
    }

    /**
     * @return Use AI to intelligently split documents into multiple subdocuments. Defaults to false.
     */
    @JsonProperty("splitDocuments")
    public Optional<Boolean> getSplitDocuments() {
        return splitDocuments;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OcrCustomizationRequest && equalTo((OcrCustomizationRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(OcrCustomizationRequest other) {
        return lineItems.equals(other.lineItems)
                && collapseLineItems.equals(other.collapseLineItems)
                && invoiceMetadata.equals(other.invoiceMetadata)
                && lineItemMetadata.equals(other.lineItemMetadata)
                && lineItemGlAccountId.equals(other.lineItemGlAccountId)
                && predictMetadata.equals(other.predictMetadata)
                && taxAndShippingAsLineItems.equals(other.taxAndShippingAsLineItems)
                && splitDocuments.equals(other.splitDocuments);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.lineItems,
                this.collapseLineItems,
                this.invoiceMetadata,
                this.lineItemMetadata,
                this.lineItemGlAccountId,
                this.predictMetadata,
                this.taxAndShippingAsLineItems,
                this.splitDocuments);
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
        private Optional<Boolean> lineItems = Optional.empty();

        private Optional<Boolean> collapseLineItems = Optional.empty();

        private Optional<Boolean> invoiceMetadata = Optional.empty();

        private Optional<Boolean> lineItemMetadata = Optional.empty();

        private Optional<Boolean> lineItemGlAccountId = Optional.empty();

        private Optional<Boolean> predictMetadata = Optional.empty();

        private Optional<Boolean> taxAndShippingAsLineItems = Optional.empty();

        private Optional<Boolean> splitDocuments = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(OcrCustomizationRequest other) {
            lineItems(other.getLineItems());
            collapseLineItems(other.getCollapseLineItems());
            invoiceMetadata(other.getInvoiceMetadata());
            lineItemMetadata(other.getLineItemMetadata());
            lineItemGlAccountId(other.getLineItemGlAccountId());
            predictMetadata(other.getPredictMetadata());
            taxAndShippingAsLineItems(other.getTaxAndShippingAsLineItems());
            splitDocuments(other.getSplitDocuments());
            return this;
        }

        @JsonSetter(value = "lineItems", nulls = Nulls.SKIP)
        public Builder lineItems(Optional<Boolean> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        public Builder lineItems(Boolean lineItems) {
            this.lineItems = Optional.ofNullable(lineItems);
            return this;
        }

        @JsonSetter(value = "collapseLineItems", nulls = Nulls.SKIP)
        public Builder collapseLineItems(Optional<Boolean> collapseLineItems) {
            this.collapseLineItems = collapseLineItems;
            return this;
        }

        public Builder collapseLineItems(Boolean collapseLineItems) {
            this.collapseLineItems = Optional.ofNullable(collapseLineItems);
            return this;
        }

        @JsonSetter(value = "invoiceMetadata", nulls = Nulls.SKIP)
        public Builder invoiceMetadata(Optional<Boolean> invoiceMetadata) {
            this.invoiceMetadata = invoiceMetadata;
            return this;
        }

        public Builder invoiceMetadata(Boolean invoiceMetadata) {
            this.invoiceMetadata = Optional.ofNullable(invoiceMetadata);
            return this;
        }

        @JsonSetter(value = "lineItemMetadata", nulls = Nulls.SKIP)
        public Builder lineItemMetadata(Optional<Boolean> lineItemMetadata) {
            this.lineItemMetadata = lineItemMetadata;
            return this;
        }

        public Builder lineItemMetadata(Boolean lineItemMetadata) {
            this.lineItemMetadata = Optional.ofNullable(lineItemMetadata);
            return this;
        }

        @JsonSetter(value = "lineItemGlAccountId", nulls = Nulls.SKIP)
        public Builder lineItemGlAccountId(Optional<Boolean> lineItemGlAccountId) {
            this.lineItemGlAccountId = lineItemGlAccountId;
            return this;
        }

        public Builder lineItemGlAccountId(Boolean lineItemGlAccountId) {
            this.lineItemGlAccountId = Optional.ofNullable(lineItemGlAccountId);
            return this;
        }

        @JsonSetter(value = "predictMetadata", nulls = Nulls.SKIP)
        public Builder predictMetadata(Optional<Boolean> predictMetadata) {
            this.predictMetadata = predictMetadata;
            return this;
        }

        public Builder predictMetadata(Boolean predictMetadata) {
            this.predictMetadata = Optional.ofNullable(predictMetadata);
            return this;
        }

        @JsonSetter(value = "taxAndShippingAsLineItems", nulls = Nulls.SKIP)
        public Builder taxAndShippingAsLineItems(Optional<Boolean> taxAndShippingAsLineItems) {
            this.taxAndShippingAsLineItems = taxAndShippingAsLineItems;
            return this;
        }

        public Builder taxAndShippingAsLineItems(Boolean taxAndShippingAsLineItems) {
            this.taxAndShippingAsLineItems = Optional.ofNullable(taxAndShippingAsLineItems);
            return this;
        }

        @JsonSetter(value = "splitDocuments", nulls = Nulls.SKIP)
        public Builder splitDocuments(Optional<Boolean> splitDocuments) {
            this.splitDocuments = splitDocuments;
            return this;
        }

        public Builder splitDocuments(Boolean splitDocuments) {
            this.splitDocuments = Optional.ofNullable(splitDocuments);
            return this;
        }

        public OcrCustomizationRequest build() {
            return new OcrCustomizationRequest(
                    lineItems,
                    collapseLineItems,
                    invoiceMetadata,
                    lineItemMetadata,
                    lineItemGlAccountId,
                    predictMetadata,
                    taxAndShippingAsLineItems,
                    splitDocuments,
                    additionalProperties);
        }
    }
}
