/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.contract.requests;

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
@JsonDeserialize(builder = ApplyInvoiceFeedbackRequest.Builder.class)
public final class ApplyInvoiceFeedbackRequest {
    private final String feedback;

    private final String invoiceId;

    private final Map<String, Object> additionalProperties;

    private ApplyInvoiceFeedbackRequest(String feedback, String invoiceId, Map<String, Object> additionalProperties) {
        this.feedback = feedback;
        this.invoiceId = invoiceId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Natural language feedback to apply to the invoice
     */
    @JsonProperty("feedback")
    public String getFeedback() {
        return feedback;
    }

    /**
     * @return ID of the invoice to apply feedback to
     */
    @JsonProperty("invoiceId")
    public String getInvoiceId() {
        return invoiceId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ApplyInvoiceFeedbackRequest && equalTo((ApplyInvoiceFeedbackRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ApplyInvoiceFeedbackRequest other) {
        return feedback.equals(other.feedback) && invoiceId.equals(other.invoiceId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.feedback, this.invoiceId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static FeedbackStage builder() {
        return new Builder();
    }

    public interface FeedbackStage {
        InvoiceIdStage feedback(@NotNull String feedback);

        Builder from(ApplyInvoiceFeedbackRequest other);
    }

    public interface InvoiceIdStage {
        _FinalStage invoiceId(@NotNull String invoiceId);
    }

    public interface _FinalStage {
        ApplyInvoiceFeedbackRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements FeedbackStage, InvoiceIdStage, _FinalStage {
        private String feedback;

        private String invoiceId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ApplyInvoiceFeedbackRequest other) {
            feedback(other.getFeedback());
            invoiceId(other.getInvoiceId());
            return this;
        }

        /**
         * <p>Natural language feedback to apply to the invoice</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("feedback")
        public InvoiceIdStage feedback(@NotNull String feedback) {
            this.feedback = Objects.requireNonNull(feedback, "feedback must not be null");
            return this;
        }

        /**
         * <p>ID of the invoice to apply feedback to</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("invoiceId")
        public _FinalStage invoiceId(@NotNull String invoiceId) {
            this.invoiceId = Objects.requireNonNull(invoiceId, "invoiceId must not be null");
            return this;
        }

        @java.lang.Override
        public ApplyInvoiceFeedbackRequest build() {
            return new ApplyInvoiceFeedbackRequest(feedback, invoiceId, additionalProperties);
        }
    }
}
