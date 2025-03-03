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
import com.mercoa.api.resources.commons.types.Address;
import com.mercoa.api.resources.commons.types.PhoneNumber;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = BusinessProfileResponse.Builder.class)
public final class BusinessProfileResponse {
    private final Optional<String> email;

    private final String legalBusinessName;

    private final Optional<BusinessType> businessType;

    private final Optional<PhoneNumber> phone;

    private final Optional<String> doingBusinessAs;

    private final Optional<String> website;

    private final Optional<String> description;

    private final Optional<Address> address;

    private final Optional<Boolean> ownersProvided;

    private final boolean taxIdProvided;

    private final Optional<TaxId> taxId;

    private final Optional<OffsetDateTime> formationDate;

    private final Optional<IndustryCodes> industryCodes;

    private final Optional<Double> averageMonthlyTransactionVolume;

    private final Optional<Double> averageTransactionSize;

    private final Optional<Double> maxTransactionSize;

    private final Map<String, Object> additionalProperties;

    private BusinessProfileResponse(
            Optional<String> email,
            String legalBusinessName,
            Optional<BusinessType> businessType,
            Optional<PhoneNumber> phone,
            Optional<String> doingBusinessAs,
            Optional<String> website,
            Optional<String> description,
            Optional<Address> address,
            Optional<Boolean> ownersProvided,
            boolean taxIdProvided,
            Optional<TaxId> taxId,
            Optional<OffsetDateTime> formationDate,
            Optional<IndustryCodes> industryCodes,
            Optional<Double> averageMonthlyTransactionVolume,
            Optional<Double> averageTransactionSize,
            Optional<Double> maxTransactionSize,
            Map<String, Object> additionalProperties) {
        this.email = email;
        this.legalBusinessName = legalBusinessName;
        this.businessType = businessType;
        this.phone = phone;
        this.doingBusinessAs = doingBusinessAs;
        this.website = website;
        this.description = description;
        this.address = address;
        this.ownersProvided = ownersProvided;
        this.taxIdProvided = taxIdProvided;
        this.taxId = taxId;
        this.formationDate = formationDate;
        this.industryCodes = industryCodes;
        this.averageMonthlyTransactionVolume = averageMonthlyTransactionVolume;
        this.averageTransactionSize = averageTransactionSize;
        this.maxTransactionSize = maxTransactionSize;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    @JsonProperty("legalBusinessName")
    public String getLegalBusinessName() {
        return legalBusinessName;
    }

    @JsonProperty("businessType")
    public Optional<BusinessType> getBusinessType() {
        return businessType;
    }

    @JsonProperty("phone")
    public Optional<PhoneNumber> getPhone() {
        return phone;
    }

    @JsonProperty("doingBusinessAs")
    public Optional<String> getDoingBusinessAs() {
        return doingBusinessAs;
    }

    @JsonProperty("website")
    public Optional<String> getWebsite() {
        return website;
    }

    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    @JsonProperty("address")
    public Optional<Address> getAddress() {
        return address;
    }

    /**
     * @return True if all representatives have been provided for this business.
     */
    @JsonProperty("ownersProvided")
    public Optional<Boolean> getOwnersProvided() {
        return ownersProvided;
    }

    @JsonProperty("taxIDProvided")
    public boolean getTaxIdProvided() {
        return taxIdProvided;
    }

    @JsonProperty("taxId")
    public Optional<TaxId> getTaxId() {
        return taxId;
    }

    @JsonProperty("formationDate")
    public Optional<OffsetDateTime> getFormationDate() {
        return formationDate;
    }

    @JsonProperty("industryCodes")
    public Optional<IndustryCodes> getIndustryCodes() {
        return industryCodes;
    }

    @JsonProperty("averageMonthlyTransactionVolume")
    public Optional<Double> getAverageMonthlyTransactionVolume() {
        return averageMonthlyTransactionVolume;
    }

    @JsonProperty("averageTransactionSize")
    public Optional<Double> getAverageTransactionSize() {
        return averageTransactionSize;
    }

    @JsonProperty("maxTransactionSize")
    public Optional<Double> getMaxTransactionSize() {
        return maxTransactionSize;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BusinessProfileResponse && equalTo((BusinessProfileResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BusinessProfileResponse other) {
        return email.equals(other.email)
                && legalBusinessName.equals(other.legalBusinessName)
                && businessType.equals(other.businessType)
                && phone.equals(other.phone)
                && doingBusinessAs.equals(other.doingBusinessAs)
                && website.equals(other.website)
                && description.equals(other.description)
                && address.equals(other.address)
                && ownersProvided.equals(other.ownersProvided)
                && taxIdProvided == other.taxIdProvided
                && taxId.equals(other.taxId)
                && formationDate.equals(other.formationDate)
                && industryCodes.equals(other.industryCodes)
                && averageMonthlyTransactionVolume.equals(other.averageMonthlyTransactionVolume)
                && averageTransactionSize.equals(other.averageTransactionSize)
                && maxTransactionSize.equals(other.maxTransactionSize);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.email,
                this.legalBusinessName,
                this.businessType,
                this.phone,
                this.doingBusinessAs,
                this.website,
                this.description,
                this.address,
                this.ownersProvided,
                this.taxIdProvided,
                this.taxId,
                this.formationDate,
                this.industryCodes,
                this.averageMonthlyTransactionVolume,
                this.averageTransactionSize,
                this.maxTransactionSize);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LegalBusinessNameStage builder() {
        return new Builder();
    }

    public interface LegalBusinessNameStage {
        TaxIdProvidedStage legalBusinessName(@NotNull String legalBusinessName);

        Builder from(BusinessProfileResponse other);
    }

    public interface TaxIdProvidedStage {
        _FinalStage taxIdProvided(boolean taxIdProvided);
    }

    public interface _FinalStage {
        BusinessProfileResponse build();

        _FinalStage email(Optional<String> email);

        _FinalStage email(String email);

        _FinalStage businessType(Optional<BusinessType> businessType);

        _FinalStage businessType(BusinessType businessType);

        _FinalStage phone(Optional<PhoneNumber> phone);

        _FinalStage phone(PhoneNumber phone);

        _FinalStage doingBusinessAs(Optional<String> doingBusinessAs);

        _FinalStage doingBusinessAs(String doingBusinessAs);

        _FinalStage website(Optional<String> website);

        _FinalStage website(String website);

        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);

        _FinalStage address(Optional<Address> address);

        _FinalStage address(Address address);

        _FinalStage ownersProvided(Optional<Boolean> ownersProvided);

        _FinalStage ownersProvided(Boolean ownersProvided);

        _FinalStage taxId(Optional<TaxId> taxId);

        _FinalStage taxId(TaxId taxId);

        _FinalStage formationDate(Optional<OffsetDateTime> formationDate);

        _FinalStage formationDate(OffsetDateTime formationDate);

        _FinalStage industryCodes(Optional<IndustryCodes> industryCodes);

        _FinalStage industryCodes(IndustryCodes industryCodes);

        _FinalStage averageMonthlyTransactionVolume(Optional<Double> averageMonthlyTransactionVolume);

        _FinalStage averageMonthlyTransactionVolume(Double averageMonthlyTransactionVolume);

        _FinalStage averageTransactionSize(Optional<Double> averageTransactionSize);

        _FinalStage averageTransactionSize(Double averageTransactionSize);

        _FinalStage maxTransactionSize(Optional<Double> maxTransactionSize);

        _FinalStage maxTransactionSize(Double maxTransactionSize);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LegalBusinessNameStage, TaxIdProvidedStage, _FinalStage {
        private String legalBusinessName;

        private boolean taxIdProvided;

        private Optional<Double> maxTransactionSize = Optional.empty();

        private Optional<Double> averageTransactionSize = Optional.empty();

        private Optional<Double> averageMonthlyTransactionVolume = Optional.empty();

        private Optional<IndustryCodes> industryCodes = Optional.empty();

        private Optional<OffsetDateTime> formationDate = Optional.empty();

        private Optional<TaxId> taxId = Optional.empty();

        private Optional<Boolean> ownersProvided = Optional.empty();

        private Optional<Address> address = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> website = Optional.empty();

        private Optional<String> doingBusinessAs = Optional.empty();

        private Optional<PhoneNumber> phone = Optional.empty();

        private Optional<BusinessType> businessType = Optional.empty();

        private Optional<String> email = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(BusinessProfileResponse other) {
            email(other.getEmail());
            legalBusinessName(other.getLegalBusinessName());
            businessType(other.getBusinessType());
            phone(other.getPhone());
            doingBusinessAs(other.getDoingBusinessAs());
            website(other.getWebsite());
            description(other.getDescription());
            address(other.getAddress());
            ownersProvided(other.getOwnersProvided());
            taxIdProvided(other.getTaxIdProvided());
            taxId(other.getTaxId());
            formationDate(other.getFormationDate());
            industryCodes(other.getIndustryCodes());
            averageMonthlyTransactionVolume(other.getAverageMonthlyTransactionVolume());
            averageTransactionSize(other.getAverageTransactionSize());
            maxTransactionSize(other.getMaxTransactionSize());
            return this;
        }

        @java.lang.Override
        @JsonSetter("legalBusinessName")
        public TaxIdProvidedStage legalBusinessName(@NotNull String legalBusinessName) {
            this.legalBusinessName = Objects.requireNonNull(legalBusinessName, "legalBusinessName must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("taxIDProvided")
        public _FinalStage taxIdProvided(boolean taxIdProvided) {
            this.taxIdProvided = taxIdProvided;
            return this;
        }

        @java.lang.Override
        public _FinalStage maxTransactionSize(Double maxTransactionSize) {
            this.maxTransactionSize = Optional.ofNullable(maxTransactionSize);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "maxTransactionSize", nulls = Nulls.SKIP)
        public _FinalStage maxTransactionSize(Optional<Double> maxTransactionSize) {
            this.maxTransactionSize = maxTransactionSize;
            return this;
        }

        @java.lang.Override
        public _FinalStage averageTransactionSize(Double averageTransactionSize) {
            this.averageTransactionSize = Optional.ofNullable(averageTransactionSize);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "averageTransactionSize", nulls = Nulls.SKIP)
        public _FinalStage averageTransactionSize(Optional<Double> averageTransactionSize) {
            this.averageTransactionSize = averageTransactionSize;
            return this;
        }

        @java.lang.Override
        public _FinalStage averageMonthlyTransactionVolume(Double averageMonthlyTransactionVolume) {
            this.averageMonthlyTransactionVolume = Optional.ofNullable(averageMonthlyTransactionVolume);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "averageMonthlyTransactionVolume", nulls = Nulls.SKIP)
        public _FinalStage averageMonthlyTransactionVolume(Optional<Double> averageMonthlyTransactionVolume) {
            this.averageMonthlyTransactionVolume = averageMonthlyTransactionVolume;
            return this;
        }

        @java.lang.Override
        public _FinalStage industryCodes(IndustryCodes industryCodes) {
            this.industryCodes = Optional.ofNullable(industryCodes);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "industryCodes", nulls = Nulls.SKIP)
        public _FinalStage industryCodes(Optional<IndustryCodes> industryCodes) {
            this.industryCodes = industryCodes;
            return this;
        }

        @java.lang.Override
        public _FinalStage formationDate(OffsetDateTime formationDate) {
            this.formationDate = Optional.ofNullable(formationDate);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "formationDate", nulls = Nulls.SKIP)
        public _FinalStage formationDate(Optional<OffsetDateTime> formationDate) {
            this.formationDate = formationDate;
            return this;
        }

        @java.lang.Override
        public _FinalStage taxId(TaxId taxId) {
            this.taxId = Optional.ofNullable(taxId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "taxId", nulls = Nulls.SKIP)
        public _FinalStage taxId(Optional<TaxId> taxId) {
            this.taxId = taxId;
            return this;
        }

        /**
         * <p>True if all representatives have been provided for this business.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage ownersProvided(Boolean ownersProvided) {
            this.ownersProvided = Optional.ofNullable(ownersProvided);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "ownersProvided", nulls = Nulls.SKIP)
        public _FinalStage ownersProvided(Optional<Boolean> ownersProvided) {
            this.ownersProvided = ownersProvided;
            return this;
        }

        @java.lang.Override
        public _FinalStage address(Address address) {
            this.address = Optional.ofNullable(address);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "address", nulls = Nulls.SKIP)
        public _FinalStage address(Optional<Address> address) {
            this.address = address;
            return this;
        }

        @java.lang.Override
        public _FinalStage description(String description) {
            this.description = Optional.ofNullable(description);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public _FinalStage description(Optional<String> description) {
            this.description = description;
            return this;
        }

        @java.lang.Override
        public _FinalStage website(String website) {
            this.website = Optional.ofNullable(website);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "website", nulls = Nulls.SKIP)
        public _FinalStage website(Optional<String> website) {
            this.website = website;
            return this;
        }

        @java.lang.Override
        public _FinalStage doingBusinessAs(String doingBusinessAs) {
            this.doingBusinessAs = Optional.ofNullable(doingBusinessAs);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "doingBusinessAs", nulls = Nulls.SKIP)
        public _FinalStage doingBusinessAs(Optional<String> doingBusinessAs) {
            this.doingBusinessAs = doingBusinessAs;
            return this;
        }

        @java.lang.Override
        public _FinalStage phone(PhoneNumber phone) {
            this.phone = Optional.ofNullable(phone);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "phone", nulls = Nulls.SKIP)
        public _FinalStage phone(Optional<PhoneNumber> phone) {
            this.phone = phone;
            return this;
        }

        @java.lang.Override
        public _FinalStage businessType(BusinessType businessType) {
            this.businessType = Optional.ofNullable(businessType);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "businessType", nulls = Nulls.SKIP)
        public _FinalStage businessType(Optional<BusinessType> businessType) {
            this.businessType = businessType;
            return this;
        }

        @java.lang.Override
        public _FinalStage email(String email) {
            this.email = Optional.ofNullable(email);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "email", nulls = Nulls.SKIP)
        public _FinalStage email(Optional<String> email) {
            this.email = email;
            return this;
        }

        @java.lang.Override
        public BusinessProfileResponse build() {
            return new BusinessProfileResponse(
                    email,
                    legalBusinessName,
                    businessType,
                    phone,
                    doingBusinessAs,
                    website,
                    description,
                    address,
                    ownersProvided,
                    taxIdProvided,
                    taxId,
                    formationDate,
                    industryCodes,
                    averageMonthlyTransactionVolume,
                    averageTransactionSize,
                    maxTransactionSize,
                    additionalProperties);
        }
    }
}
