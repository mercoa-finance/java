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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = WorkflowCustomizationRequest.Builder.class)
public final class WorkflowCustomizationRequest {
    private final Optional<Boolean> autoAdvanceInvoiceStatus;

    private final Map<String, Object> additionalProperties;

    private WorkflowCustomizationRequest(
            Optional<Boolean> autoAdvanceInvoiceStatus, Map<String, Object> additionalProperties) {
        this.autoAdvanceInvoiceStatus = autoAdvanceInvoiceStatus;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If true, the invoice will be automatically advanced to the furthest stage in the payment workflow. For example, if the invoice is APPROVED, but has all necessary data to move to SCHEDULED, it will be advanced to SCHEDULED.
     */
    @JsonProperty("autoAdvanceInvoiceStatus")
    public Optional<Boolean> getAutoAdvanceInvoiceStatus() {
        return autoAdvanceInvoiceStatus;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WorkflowCustomizationRequest && equalTo((WorkflowCustomizationRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(WorkflowCustomizationRequest other) {
        return autoAdvanceInvoiceStatus.equals(other.autoAdvanceInvoiceStatus);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.autoAdvanceInvoiceStatus);
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
        private Optional<Boolean> autoAdvanceInvoiceStatus = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(WorkflowCustomizationRequest other) {
            autoAdvanceInvoiceStatus(other.getAutoAdvanceInvoiceStatus());
            return this;
        }

        @JsonSetter(value = "autoAdvanceInvoiceStatus", nulls = Nulls.SKIP)
        public Builder autoAdvanceInvoiceStatus(Optional<Boolean> autoAdvanceInvoiceStatus) {
            this.autoAdvanceInvoiceStatus = autoAdvanceInvoiceStatus;
            return this;
        }

        public Builder autoAdvanceInvoiceStatus(Boolean autoAdvanceInvoiceStatus) {
            this.autoAdvanceInvoiceStatus = Optional.ofNullable(autoAdvanceInvoiceStatus);
            return this;
        }

        public WorkflowCustomizationRequest build() {
            return new WorkflowCustomizationRequest(autoAdvanceInvoiceStatus, additionalProperties);
        }
    }
}