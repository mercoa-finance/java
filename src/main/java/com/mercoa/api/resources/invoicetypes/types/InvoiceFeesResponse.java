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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = InvoiceFeesResponse.Builder.class)
public final class InvoiceFeesResponse {
    private final double sourcePaymentMethodFee;

    private final double sourcePlatformMarkupFee;

    private final double destinationPaymentMethodFee;

    private final double destinationPlatformMarkupFee;

    private final Map<String, Object> additionalProperties;

    private InvoiceFeesResponse(
            double sourcePaymentMethodFee,
            double sourcePlatformMarkupFee,
            double destinationPaymentMethodFee,
            double destinationPlatformMarkupFee,
            Map<String, Object> additionalProperties) {
        this.sourcePaymentMethodFee = sourcePaymentMethodFee;
        this.sourcePlatformMarkupFee = sourcePlatformMarkupFee;
        this.destinationPaymentMethodFee = destinationPaymentMethodFee;
        this.destinationPlatformMarkupFee = destinationPlatformMarkupFee;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Fee charged for processing the source payment method. For example, credit card interchange and acquiring fees.
     */
    @JsonProperty("sourcePaymentMethodFee")
    public double getSourcePaymentMethodFee() {
        return sourcePaymentMethodFee;
    }

    /**
     * @return Additional fee charged to the payer.
     */
    @JsonProperty("sourcePlatformMarkupFee")
    public double getSourcePlatformMarkupFee() {
        return sourcePlatformMarkupFee;
    }

    /**
     * @return Fee charged for processing the destination payment method. For example, postage for a check payment.
     */
    @JsonProperty("destinationPaymentMethodFee")
    public double getDestinationPaymentMethodFee() {
        return destinationPaymentMethodFee;
    }

    /**
     * @return Additional fee charged to the payee.
     */
    @JsonProperty("destinationPlatformMarkupFee")
    public double getDestinationPlatformMarkupFee() {
        return destinationPlatformMarkupFee;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof InvoiceFeesResponse && equalTo((InvoiceFeesResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(InvoiceFeesResponse other) {
        return sourcePaymentMethodFee == other.sourcePaymentMethodFee
                && sourcePlatformMarkupFee == other.sourcePlatformMarkupFee
                && destinationPaymentMethodFee == other.destinationPaymentMethodFee
                && destinationPlatformMarkupFee == other.destinationPlatformMarkupFee;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.sourcePaymentMethodFee,
                this.sourcePlatformMarkupFee,
                this.destinationPaymentMethodFee,
                this.destinationPlatformMarkupFee);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SourcePaymentMethodFeeStage builder() {
        return new Builder();
    }

    public interface SourcePaymentMethodFeeStage {
        SourcePlatformMarkupFeeStage sourcePaymentMethodFee(double sourcePaymentMethodFee);

        Builder from(InvoiceFeesResponse other);
    }

    public interface SourcePlatformMarkupFeeStage {
        DestinationPaymentMethodFeeStage sourcePlatformMarkupFee(double sourcePlatformMarkupFee);
    }

    public interface DestinationPaymentMethodFeeStage {
        DestinationPlatformMarkupFeeStage destinationPaymentMethodFee(double destinationPaymentMethodFee);
    }

    public interface DestinationPlatformMarkupFeeStage {
        _FinalStage destinationPlatformMarkupFee(double destinationPlatformMarkupFee);
    }

    public interface _FinalStage {
        InvoiceFeesResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements SourcePaymentMethodFeeStage,
                    SourcePlatformMarkupFeeStage,
                    DestinationPaymentMethodFeeStage,
                    DestinationPlatformMarkupFeeStage,
                    _FinalStage {
        private double sourcePaymentMethodFee;

        private double sourcePlatformMarkupFee;

        private double destinationPaymentMethodFee;

        private double destinationPlatformMarkupFee;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(InvoiceFeesResponse other) {
            sourcePaymentMethodFee(other.getSourcePaymentMethodFee());
            sourcePlatformMarkupFee(other.getSourcePlatformMarkupFee());
            destinationPaymentMethodFee(other.getDestinationPaymentMethodFee());
            destinationPlatformMarkupFee(other.getDestinationPlatformMarkupFee());
            return this;
        }

        /**
         * <p>Fee charged for processing the source payment method. For example, credit card interchange and acquiring fees.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("sourcePaymentMethodFee")
        public SourcePlatformMarkupFeeStage sourcePaymentMethodFee(double sourcePaymentMethodFee) {
            this.sourcePaymentMethodFee = sourcePaymentMethodFee;
            return this;
        }

        /**
         * <p>Additional fee charged to the payer.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("sourcePlatformMarkupFee")
        public DestinationPaymentMethodFeeStage sourcePlatformMarkupFee(double sourcePlatformMarkupFee) {
            this.sourcePlatformMarkupFee = sourcePlatformMarkupFee;
            return this;
        }

        /**
         * <p>Fee charged for processing the destination payment method. For example, postage for a check payment.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("destinationPaymentMethodFee")
        public DestinationPlatformMarkupFeeStage destinationPaymentMethodFee(double destinationPaymentMethodFee) {
            this.destinationPaymentMethodFee = destinationPaymentMethodFee;
            return this;
        }

        /**
         * <p>Additional fee charged to the payee.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("destinationPlatformMarkupFee")
        public _FinalStage destinationPlatformMarkupFee(double destinationPlatformMarkupFee) {
            this.destinationPlatformMarkupFee = destinationPlatformMarkupFee;
            return this;
        }

        @Override
        public InvoiceFeesResponse build() {
            return new InvoiceFeesResponse(
                    sourcePaymentMethodFee,
                    sourcePlatformMarkupFee,
                    destinationPaymentMethodFee,
                    destinationPlatformMarkupFee,
                    additionalProperties);
        }
    }
}
