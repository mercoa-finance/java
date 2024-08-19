/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.externalaccountingsystem.types;

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
@JsonDeserialize(builder = CodatCompanyCreationRequest.Builder.class)
public final class CodatCompanyCreationRequest {
    private final Optional<String> companyId;

    private final Map<String, Object> additionalProperties;

    private CodatCompanyCreationRequest(Optional<String> companyId, Map<String, Object> additionalProperties) {
        this.companyId = companyId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If the company already exists in Codat, provide the company ID to link the company to the entity. If the company does not exist, leave this field blank and Codat will create a new company.
     */
    @JsonProperty("companyId")
    public Optional<String> getCompanyId() {
        return companyId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CodatCompanyCreationRequest && equalTo((CodatCompanyCreationRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CodatCompanyCreationRequest other) {
        return companyId.equals(other.companyId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.companyId);
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
        private Optional<String> companyId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CodatCompanyCreationRequest other) {
            companyId(other.getCompanyId());
            return this;
        }

        @JsonSetter(value = "companyId", nulls = Nulls.SKIP)
        public Builder companyId(Optional<String> companyId) {
            this.companyId = companyId;
            return this;
        }

        public Builder companyId(String companyId) {
            this.companyId = Optional.ofNullable(companyId);
            return this;
        }

        public CodatCompanyCreationRequest build() {
            return new CodatCompanyCreationRequest(companyId, additionalProperties);
        }
    }
}
