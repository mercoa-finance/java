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
@JsonDeserialize(builder = ProfileResponse.Builder.class)
public final class ProfileResponse {
    private final Optional<BusinessProfileResponse> business;

    private final Optional<IndividualProfileResponse> individual;

    private final Map<String, Object> additionalProperties;

    private ProfileResponse(
            Optional<BusinessProfileResponse> business,
            Optional<IndividualProfileResponse> individual,
            Map<String, Object> additionalProperties) {
        this.business = business;
        this.individual = individual;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Will be set if the entity is a business
     */
    @JsonProperty("business")
    public Optional<BusinessProfileResponse> getBusiness() {
        return business;
    }

    /**
     * @return Will be set if the entity is a individual
     */
    @JsonProperty("individual")
    public Optional<IndividualProfileResponse> getIndividual() {
        return individual;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ProfileResponse && equalTo((ProfileResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ProfileResponse other) {
        return business.equals(other.business) && individual.equals(other.individual);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.business, this.individual);
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
        private Optional<BusinessProfileResponse> business = Optional.empty();

        private Optional<IndividualProfileResponse> individual = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ProfileResponse other) {
            business(other.getBusiness());
            individual(other.getIndividual());
            return this;
        }

        @JsonSetter(value = "business", nulls = Nulls.SKIP)
        public Builder business(Optional<BusinessProfileResponse> business) {
            this.business = business;
            return this;
        }

        public Builder business(BusinessProfileResponse business) {
            this.business = Optional.ofNullable(business);
            return this;
        }

        @JsonSetter(value = "individual", nulls = Nulls.SKIP)
        public Builder individual(Optional<IndividualProfileResponse> individual) {
            this.individual = individual;
            return this;
        }

        public Builder individual(IndividualProfileResponse individual) {
            this.individual = Optional.ofNullable(individual);
            return this;
        }

        public ProfileResponse build() {
            return new ProfileResponse(business, individual, additionalProperties);
        }
    }
}
