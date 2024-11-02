/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoice.paymentlinks.requests;

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
@JsonDeserialize(builder = VendorLinkRequest.Builder.class)
public final class VendorLinkRequest {
    private final Optional<String> expiresIn;

    private final Map<String, Object> additionalProperties;

    private VendorLinkRequest(Optional<String> expiresIn, Map<String, Object> additionalProperties) {
        this.expiresIn = expiresIn;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Expressed in seconds or a string describing a time span. The default is 30d.
     */
    @JsonProperty("expiresIn")
    public Optional<String> getExpiresIn() {
        return expiresIn;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof VendorLinkRequest && equalTo((VendorLinkRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(VendorLinkRequest other) {
        return expiresIn.equals(other.expiresIn);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.expiresIn);
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
        private Optional<String> expiresIn = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(VendorLinkRequest other) {
            expiresIn(other.getExpiresIn());
            return this;
        }

        @JsonSetter(value = "expiresIn", nulls = Nulls.SKIP)
        public Builder expiresIn(Optional<String> expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        public Builder expiresIn(String expiresIn) {
            this.expiresIn = Optional.ofNullable(expiresIn);
            return this;
        }

        public VendorLinkRequest build() {
            return new VendorLinkRequest(expiresIn, additionalProperties);
        }
    }
}
