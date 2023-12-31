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
import com.mercoa.api.resources.invoicetypes.types.InvoiceStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TokenGenerationInvoiceOptions.Builder.class)
public final class TokenGenerationInvoiceOptions {
    private final List<InvoiceStatus> status;

    private final Map<String, Object> additionalProperties;

    private TokenGenerationInvoiceOptions(List<InvoiceStatus> status, Map<String, Object> additionalProperties) {
        this.status = status;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("status")
    public List<InvoiceStatus> getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TokenGenerationInvoiceOptions && equalTo((TokenGenerationInvoiceOptions) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TokenGenerationInvoiceOptions other) {
        return status.equals(other.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.status);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private List<InvoiceStatus> status = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TokenGenerationInvoiceOptions other) {
            status(other.getStatus());
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(List<InvoiceStatus> status) {
            this.status.clear();
            this.status.addAll(status);
            return this;
        }

        public Builder addStatus(InvoiceStatus status) {
            this.status.add(status);
            return this;
        }

        public Builder addAllStatus(List<InvoiceStatus> status) {
            this.status.addAll(status);
            return this;
        }

        public TokenGenerationInvoiceOptions build() {
            return new TokenGenerationInvoiceOptions(status, additionalProperties);
        }
    }
}
