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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = OcrCustomizationResponse.Builder.class)
public final class OcrCustomizationResponse {
    private final boolean lineItems;

    private final boolean collapseLineItems;

    private final boolean invoiceMetadata;

    private final boolean lineItemMetadata;

    private final boolean lineItemGlAccountId;

    private final boolean predictMetadata;

    private final boolean taxAndShippingAsLineItems;

    private final Map<String, Object> additionalProperties;

    private OcrCustomizationResponse(
            boolean lineItems,
            boolean collapseLineItems,
            boolean invoiceMetadata,
            boolean lineItemMetadata,
            boolean lineItemGlAccountId,
            boolean predictMetadata,
            boolean taxAndShippingAsLineItems,
            Map<String, Object> additionalProperties) {
        this.lineItems = lineItems;
        this.collapseLineItems = collapseLineItems;
        this.invoiceMetadata = invoiceMetadata;
        this.lineItemMetadata = lineItemMetadata;
        this.lineItemGlAccountId = lineItemGlAccountId;
        this.predictMetadata = predictMetadata;
        this.taxAndShippingAsLineItems = taxAndShippingAsLineItems;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Extract line items from the invoice. Defaults to true.
     */
    @JsonProperty("lineItems")
    public boolean getLineItems() {
        return lineItems;
    }

    /**
     * @return If true, the line items will be collapsed into a single line item. Defaults to false.
     */
    @JsonProperty("collapseLineItems")
    public boolean getCollapseLineItems() {
        return collapseLineItems;
    }

    /**
     * @return Pull custom metadata at the invoice level. Defaults to true.
     */
    @JsonProperty("invoiceMetadata")
    public boolean getInvoiceMetadata() {
        return invoiceMetadata;
    }

    /**
     * @return Pull custom metadata at the line item level. Defaults to true.
     */
    @JsonProperty("lineItemMetadata")
    public boolean getLineItemMetadata() {
        return lineItemMetadata;
    }

    /**
     * @return Pull GL Account ID at the line item level. Defaults to true.
     */
    @JsonProperty("lineItemGlAccountId")
    public boolean getLineItemGlAccountId() {
        return lineItemGlAccountId;
    }

    /**
     * @return Use AI to predict metadata from historical data. Defaults to true.
     */
    @JsonProperty("predictMetadata")
    public boolean getPredictMetadata() {
        return predictMetadata;
    }

    /**
     * @return Pull tax and shipping information as line items. Defaults to true. If false, tax and shipping will extracted as invoice level fields.
     */
    @JsonProperty("taxAndShippingAsLineItems")
    public boolean getTaxAndShippingAsLineItems() {
        return taxAndShippingAsLineItems;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OcrCustomizationResponse && equalTo((OcrCustomizationResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(OcrCustomizationResponse other) {
        return lineItems == other.lineItems
                && collapseLineItems == other.collapseLineItems
                && invoiceMetadata == other.invoiceMetadata
                && lineItemMetadata == other.lineItemMetadata
                && lineItemGlAccountId == other.lineItemGlAccountId
                && predictMetadata == other.predictMetadata
                && taxAndShippingAsLineItems == other.taxAndShippingAsLineItems;
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
                this.taxAndShippingAsLineItems);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LineItemsStage builder() {
        return new Builder();
    }

    public interface LineItemsStage {
        CollapseLineItemsStage lineItems(boolean lineItems);

        Builder from(OcrCustomizationResponse other);
    }

    public interface CollapseLineItemsStage {
        InvoiceMetadataStage collapseLineItems(boolean collapseLineItems);
    }

    public interface InvoiceMetadataStage {
        LineItemMetadataStage invoiceMetadata(boolean invoiceMetadata);
    }

    public interface LineItemMetadataStage {
        LineItemGlAccountIdStage lineItemMetadata(boolean lineItemMetadata);
    }

    public interface LineItemGlAccountIdStage {
        PredictMetadataStage lineItemGlAccountId(boolean lineItemGlAccountId);
    }

    public interface PredictMetadataStage {
        TaxAndShippingAsLineItemsStage predictMetadata(boolean predictMetadata);
    }

    public interface TaxAndShippingAsLineItemsStage {
        _FinalStage taxAndShippingAsLineItems(boolean taxAndShippingAsLineItems);
    }

    public interface _FinalStage {
        OcrCustomizationResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements LineItemsStage,
                    CollapseLineItemsStage,
                    InvoiceMetadataStage,
                    LineItemMetadataStage,
                    LineItemGlAccountIdStage,
                    PredictMetadataStage,
                    TaxAndShippingAsLineItemsStage,
                    _FinalStage {
        private boolean lineItems;

        private boolean collapseLineItems;

        private boolean invoiceMetadata;

        private boolean lineItemMetadata;

        private boolean lineItemGlAccountId;

        private boolean predictMetadata;

        private boolean taxAndShippingAsLineItems;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(OcrCustomizationResponse other) {
            lineItems(other.getLineItems());
            collapseLineItems(other.getCollapseLineItems());
            invoiceMetadata(other.getInvoiceMetadata());
            lineItemMetadata(other.getLineItemMetadata());
            lineItemGlAccountId(other.getLineItemGlAccountId());
            predictMetadata(other.getPredictMetadata());
            taxAndShippingAsLineItems(other.getTaxAndShippingAsLineItems());
            return this;
        }

        /**
         * <p>Extract line items from the invoice. Defaults to true.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("lineItems")
        public CollapseLineItemsStage lineItems(boolean lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        /**
         * <p>If true, the line items will be collapsed into a single line item. Defaults to false.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("collapseLineItems")
        public InvoiceMetadataStage collapseLineItems(boolean collapseLineItems) {
            this.collapseLineItems = collapseLineItems;
            return this;
        }

        /**
         * <p>Pull custom metadata at the invoice level. Defaults to true.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("invoiceMetadata")
        public LineItemMetadataStage invoiceMetadata(boolean invoiceMetadata) {
            this.invoiceMetadata = invoiceMetadata;
            return this;
        }

        /**
         * <p>Pull custom metadata at the line item level. Defaults to true.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("lineItemMetadata")
        public LineItemGlAccountIdStage lineItemMetadata(boolean lineItemMetadata) {
            this.lineItemMetadata = lineItemMetadata;
            return this;
        }

        /**
         * <p>Pull GL Account ID at the line item level. Defaults to true.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("lineItemGlAccountId")
        public PredictMetadataStage lineItemGlAccountId(boolean lineItemGlAccountId) {
            this.lineItemGlAccountId = lineItemGlAccountId;
            return this;
        }

        /**
         * <p>Use AI to predict metadata from historical data. Defaults to true.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("predictMetadata")
        public TaxAndShippingAsLineItemsStage predictMetadata(boolean predictMetadata) {
            this.predictMetadata = predictMetadata;
            return this;
        }

        /**
         * <p>Pull tax and shipping information as line items. Defaults to true. If false, tax and shipping will extracted as invoice level fields.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("taxAndShippingAsLineItems")
        public _FinalStage taxAndShippingAsLineItems(boolean taxAndShippingAsLineItems) {
            this.taxAndShippingAsLineItems = taxAndShippingAsLineItems;
            return this;
        }

        @java.lang.Override
        public OcrCustomizationResponse build() {
            return new OcrCustomizationResponse(
                    lineItems,
                    collapseLineItems,
                    invoiceMetadata,
                    lineItemMetadata,
                    lineItemGlAccountId,
                    predictMetadata,
                    taxAndShippingAsLineItems,
                    additionalProperties);
        }
    }
}