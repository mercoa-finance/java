/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.organizationtypes.types;

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
@JsonDeserialize(builder = BusinessOnboardingOptionsRequest.Builder.class)
public final class BusinessOnboardingOptionsRequest implements ICommonOnboardingOptionsRequest {
    private final Optional<OnboardingOptionRequest> termsOfService;

    private final Optional<OnboardingOptionRequest> email;

    private final Optional<OnboardingOptionRequest> name;

    private final Optional<OnboardingOptionRequest> address;

    private final Optional<OnboardingOptionRequest> phone;

    private final Optional<OnboardingOptionRequest> tenNinetyNine;

    private final Optional<OnboardingOptionRequest> w9;

    private final Optional<OnboardingOptionRequest> bankStatement;

    private final Optional<OnboardingOptionRequest> type;

    private final Optional<OnboardingOptionRequest> doingBusinessAs;

    private final Optional<OnboardingOptionRequest> ein;

    private final Optional<OnboardingOptionRequest> mcc;

    private final Optional<OnboardingOptionRequest> formationDate;

    private final Optional<OnboardingOptionRequest> website;

    private final Optional<OnboardingOptionRequest> description;

    private final Optional<OnboardingOptionRequest> representatives;

    private final Optional<OnboardingOptionRequest> logo;

    private final Optional<OnboardingOptionRequest> averageTransactionSize;

    private final Optional<OnboardingOptionRequest> averageMonthlyTransactionVolume;

    private final Optional<OnboardingOptionRequest> maxTransactionSize;

    private final Map<String, Object> additionalProperties;

    private BusinessOnboardingOptionsRequest(
            Optional<OnboardingOptionRequest> termsOfService,
            Optional<OnboardingOptionRequest> email,
            Optional<OnboardingOptionRequest> name,
            Optional<OnboardingOptionRequest> address,
            Optional<OnboardingOptionRequest> phone,
            Optional<OnboardingOptionRequest> tenNinetyNine,
            Optional<OnboardingOptionRequest> w9,
            Optional<OnboardingOptionRequest> bankStatement,
            Optional<OnboardingOptionRequest> type,
            Optional<OnboardingOptionRequest> doingBusinessAs,
            Optional<OnboardingOptionRequest> ein,
            Optional<OnboardingOptionRequest> mcc,
            Optional<OnboardingOptionRequest> formationDate,
            Optional<OnboardingOptionRequest> website,
            Optional<OnboardingOptionRequest> description,
            Optional<OnboardingOptionRequest> representatives,
            Optional<OnboardingOptionRequest> logo,
            Optional<OnboardingOptionRequest> averageTransactionSize,
            Optional<OnboardingOptionRequest> averageMonthlyTransactionVolume,
            Optional<OnboardingOptionRequest> maxTransactionSize,
            Map<String, Object> additionalProperties) {
        this.termsOfService = termsOfService;
        this.email = email;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.tenNinetyNine = tenNinetyNine;
        this.w9 = w9;
        this.bankStatement = bankStatement;
        this.type = type;
        this.doingBusinessAs = doingBusinessAs;
        this.ein = ein;
        this.mcc = mcc;
        this.formationDate = formationDate;
        this.website = website;
        this.description = description;
        this.representatives = representatives;
        this.logo = logo;
        this.averageTransactionSize = averageTransactionSize;
        this.averageMonthlyTransactionVolume = averageMonthlyTransactionVolume;
        this.maxTransactionSize = maxTransactionSize;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("termsOfService")
    @java.lang.Override
    public Optional<OnboardingOptionRequest> getTermsOfService() {
        return termsOfService;
    }

    @JsonProperty("email")
    @java.lang.Override
    public Optional<OnboardingOptionRequest> getEmail() {
        return email;
    }

    @JsonProperty("name")
    @java.lang.Override
    public Optional<OnboardingOptionRequest> getName() {
        return name;
    }

    @JsonProperty("address")
    @java.lang.Override
    public Optional<OnboardingOptionRequest> getAddress() {
        return address;
    }

    @JsonProperty("phone")
    @java.lang.Override
    public Optional<OnboardingOptionRequest> getPhone() {
        return phone;
    }

    @JsonProperty("tenNinetyNine")
    @java.lang.Override
    public Optional<OnboardingOptionRequest> getTenNinetyNine() {
        return tenNinetyNine;
    }

    @JsonProperty("w9")
    @java.lang.Override
    public Optional<OnboardingOptionRequest> getW9() {
        return w9;
    }

    @JsonProperty("bankStatement")
    @java.lang.Override
    public Optional<OnboardingOptionRequest> getBankStatement() {
        return bankStatement;
    }

    @JsonProperty("type")
    public Optional<OnboardingOptionRequest> getType() {
        return type;
    }

    @JsonProperty("doingBusinessAs")
    public Optional<OnboardingOptionRequest> getDoingBusinessAs() {
        return doingBusinessAs;
    }

    @JsonProperty("ein")
    public Optional<OnboardingOptionRequest> getEin() {
        return ein;
    }

    @JsonProperty("mcc")
    public Optional<OnboardingOptionRequest> getMcc() {
        return mcc;
    }

    @JsonProperty("formationDate")
    public Optional<OnboardingOptionRequest> getFormationDate() {
        return formationDate;
    }

    @JsonProperty("website")
    public Optional<OnboardingOptionRequest> getWebsite() {
        return website;
    }

    @JsonProperty("description")
    public Optional<OnboardingOptionRequest> getDescription() {
        return description;
    }

    @JsonProperty("representatives")
    public Optional<OnboardingOptionRequest> getRepresentatives() {
        return representatives;
    }

    @JsonProperty("logo")
    public Optional<OnboardingOptionRequest> getLogo() {
        return logo;
    }

    @JsonProperty("averageTransactionSize")
    public Optional<OnboardingOptionRequest> getAverageTransactionSize() {
        return averageTransactionSize;
    }

    @JsonProperty("averageMonthlyTransactionVolume")
    public Optional<OnboardingOptionRequest> getAverageMonthlyTransactionVolume() {
        return averageMonthlyTransactionVolume;
    }

    @JsonProperty("maxTransactionSize")
    public Optional<OnboardingOptionRequest> getMaxTransactionSize() {
        return maxTransactionSize;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BusinessOnboardingOptionsRequest && equalTo((BusinessOnboardingOptionsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BusinessOnboardingOptionsRequest other) {
        return termsOfService.equals(other.termsOfService)
                && email.equals(other.email)
                && name.equals(other.name)
                && address.equals(other.address)
                && phone.equals(other.phone)
                && tenNinetyNine.equals(other.tenNinetyNine)
                && w9.equals(other.w9)
                && bankStatement.equals(other.bankStatement)
                && type.equals(other.type)
                && doingBusinessAs.equals(other.doingBusinessAs)
                && ein.equals(other.ein)
                && mcc.equals(other.mcc)
                && formationDate.equals(other.formationDate)
                && website.equals(other.website)
                && description.equals(other.description)
                && representatives.equals(other.representatives)
                && logo.equals(other.logo)
                && averageTransactionSize.equals(other.averageTransactionSize)
                && averageMonthlyTransactionVolume.equals(other.averageMonthlyTransactionVolume)
                && maxTransactionSize.equals(other.maxTransactionSize);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.termsOfService,
                this.email,
                this.name,
                this.address,
                this.phone,
                this.tenNinetyNine,
                this.w9,
                this.bankStatement,
                this.type,
                this.doingBusinessAs,
                this.ein,
                this.mcc,
                this.formationDate,
                this.website,
                this.description,
                this.representatives,
                this.logo,
                this.averageTransactionSize,
                this.averageMonthlyTransactionVolume,
                this.maxTransactionSize);
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
        private Optional<OnboardingOptionRequest> termsOfService = Optional.empty();

        private Optional<OnboardingOptionRequest> email = Optional.empty();

        private Optional<OnboardingOptionRequest> name = Optional.empty();

        private Optional<OnboardingOptionRequest> address = Optional.empty();

        private Optional<OnboardingOptionRequest> phone = Optional.empty();

        private Optional<OnboardingOptionRequest> tenNinetyNine = Optional.empty();

        private Optional<OnboardingOptionRequest> w9 = Optional.empty();

        private Optional<OnboardingOptionRequest> bankStatement = Optional.empty();

        private Optional<OnboardingOptionRequest> type = Optional.empty();

        private Optional<OnboardingOptionRequest> doingBusinessAs = Optional.empty();

        private Optional<OnboardingOptionRequest> ein = Optional.empty();

        private Optional<OnboardingOptionRequest> mcc = Optional.empty();

        private Optional<OnboardingOptionRequest> formationDate = Optional.empty();

        private Optional<OnboardingOptionRequest> website = Optional.empty();

        private Optional<OnboardingOptionRequest> description = Optional.empty();

        private Optional<OnboardingOptionRequest> representatives = Optional.empty();

        private Optional<OnboardingOptionRequest> logo = Optional.empty();

        private Optional<OnboardingOptionRequest> averageTransactionSize = Optional.empty();

        private Optional<OnboardingOptionRequest> averageMonthlyTransactionVolume = Optional.empty();

        private Optional<OnboardingOptionRequest> maxTransactionSize = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(BusinessOnboardingOptionsRequest other) {
            termsOfService(other.getTermsOfService());
            email(other.getEmail());
            name(other.getName());
            address(other.getAddress());
            phone(other.getPhone());
            tenNinetyNine(other.getTenNinetyNine());
            w9(other.getW9());
            bankStatement(other.getBankStatement());
            type(other.getType());
            doingBusinessAs(other.getDoingBusinessAs());
            ein(other.getEin());
            mcc(other.getMcc());
            formationDate(other.getFormationDate());
            website(other.getWebsite());
            description(other.getDescription());
            representatives(other.getRepresentatives());
            logo(other.getLogo());
            averageTransactionSize(other.getAverageTransactionSize());
            averageMonthlyTransactionVolume(other.getAverageMonthlyTransactionVolume());
            maxTransactionSize(other.getMaxTransactionSize());
            return this;
        }

        @JsonSetter(value = "termsOfService", nulls = Nulls.SKIP)
        public Builder termsOfService(Optional<OnboardingOptionRequest> termsOfService) {
            this.termsOfService = termsOfService;
            return this;
        }

        public Builder termsOfService(OnboardingOptionRequest termsOfService) {
            this.termsOfService = Optional.ofNullable(termsOfService);
            return this;
        }

        @JsonSetter(value = "email", nulls = Nulls.SKIP)
        public Builder email(Optional<OnboardingOptionRequest> email) {
            this.email = email;
            return this;
        }

        public Builder email(OnboardingOptionRequest email) {
            this.email = Optional.ofNullable(email);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<OnboardingOptionRequest> name) {
            this.name = name;
            return this;
        }

        public Builder name(OnboardingOptionRequest name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @JsonSetter(value = "address", nulls = Nulls.SKIP)
        public Builder address(Optional<OnboardingOptionRequest> address) {
            this.address = address;
            return this;
        }

        public Builder address(OnboardingOptionRequest address) {
            this.address = Optional.ofNullable(address);
            return this;
        }

        @JsonSetter(value = "phone", nulls = Nulls.SKIP)
        public Builder phone(Optional<OnboardingOptionRequest> phone) {
            this.phone = phone;
            return this;
        }

        public Builder phone(OnboardingOptionRequest phone) {
            this.phone = Optional.ofNullable(phone);
            return this;
        }

        @JsonSetter(value = "tenNinetyNine", nulls = Nulls.SKIP)
        public Builder tenNinetyNine(Optional<OnboardingOptionRequest> tenNinetyNine) {
            this.tenNinetyNine = tenNinetyNine;
            return this;
        }

        public Builder tenNinetyNine(OnboardingOptionRequest tenNinetyNine) {
            this.tenNinetyNine = Optional.ofNullable(tenNinetyNine);
            return this;
        }

        @JsonSetter(value = "w9", nulls = Nulls.SKIP)
        public Builder w9(Optional<OnboardingOptionRequest> w9) {
            this.w9 = w9;
            return this;
        }

        public Builder w9(OnboardingOptionRequest w9) {
            this.w9 = Optional.ofNullable(w9);
            return this;
        }

        @JsonSetter(value = "bankStatement", nulls = Nulls.SKIP)
        public Builder bankStatement(Optional<OnboardingOptionRequest> bankStatement) {
            this.bankStatement = bankStatement;
            return this;
        }

        public Builder bankStatement(OnboardingOptionRequest bankStatement) {
            this.bankStatement = Optional.ofNullable(bankStatement);
            return this;
        }

        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public Builder type(Optional<OnboardingOptionRequest> type) {
            this.type = type;
            return this;
        }

        public Builder type(OnboardingOptionRequest type) {
            this.type = Optional.ofNullable(type);
            return this;
        }

        @JsonSetter(value = "doingBusinessAs", nulls = Nulls.SKIP)
        public Builder doingBusinessAs(Optional<OnboardingOptionRequest> doingBusinessAs) {
            this.doingBusinessAs = doingBusinessAs;
            return this;
        }

        public Builder doingBusinessAs(OnboardingOptionRequest doingBusinessAs) {
            this.doingBusinessAs = Optional.ofNullable(doingBusinessAs);
            return this;
        }

        @JsonSetter(value = "ein", nulls = Nulls.SKIP)
        public Builder ein(Optional<OnboardingOptionRequest> ein) {
            this.ein = ein;
            return this;
        }

        public Builder ein(OnboardingOptionRequest ein) {
            this.ein = Optional.ofNullable(ein);
            return this;
        }

        @JsonSetter(value = "mcc", nulls = Nulls.SKIP)
        public Builder mcc(Optional<OnboardingOptionRequest> mcc) {
            this.mcc = mcc;
            return this;
        }

        public Builder mcc(OnboardingOptionRequest mcc) {
            this.mcc = Optional.ofNullable(mcc);
            return this;
        }

        @JsonSetter(value = "formationDate", nulls = Nulls.SKIP)
        public Builder formationDate(Optional<OnboardingOptionRequest> formationDate) {
            this.formationDate = formationDate;
            return this;
        }

        public Builder formationDate(OnboardingOptionRequest formationDate) {
            this.formationDate = Optional.ofNullable(formationDate);
            return this;
        }

        @JsonSetter(value = "website", nulls = Nulls.SKIP)
        public Builder website(Optional<OnboardingOptionRequest> website) {
            this.website = website;
            return this;
        }

        public Builder website(OnboardingOptionRequest website) {
            this.website = Optional.ofNullable(website);
            return this;
        }

        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public Builder description(Optional<OnboardingOptionRequest> description) {
            this.description = description;
            return this;
        }

        public Builder description(OnboardingOptionRequest description) {
            this.description = Optional.ofNullable(description);
            return this;
        }

        @JsonSetter(value = "representatives", nulls = Nulls.SKIP)
        public Builder representatives(Optional<OnboardingOptionRequest> representatives) {
            this.representatives = representatives;
            return this;
        }

        public Builder representatives(OnboardingOptionRequest representatives) {
            this.representatives = Optional.ofNullable(representatives);
            return this;
        }

        @JsonSetter(value = "logo", nulls = Nulls.SKIP)
        public Builder logo(Optional<OnboardingOptionRequest> logo) {
            this.logo = logo;
            return this;
        }

        public Builder logo(OnboardingOptionRequest logo) {
            this.logo = Optional.ofNullable(logo);
            return this;
        }

        @JsonSetter(value = "averageTransactionSize", nulls = Nulls.SKIP)
        public Builder averageTransactionSize(Optional<OnboardingOptionRequest> averageTransactionSize) {
            this.averageTransactionSize = averageTransactionSize;
            return this;
        }

        public Builder averageTransactionSize(OnboardingOptionRequest averageTransactionSize) {
            this.averageTransactionSize = Optional.ofNullable(averageTransactionSize);
            return this;
        }

        @JsonSetter(value = "averageMonthlyTransactionVolume", nulls = Nulls.SKIP)
        public Builder averageMonthlyTransactionVolume(
                Optional<OnboardingOptionRequest> averageMonthlyTransactionVolume) {
            this.averageMonthlyTransactionVolume = averageMonthlyTransactionVolume;
            return this;
        }

        public Builder averageMonthlyTransactionVolume(OnboardingOptionRequest averageMonthlyTransactionVolume) {
            this.averageMonthlyTransactionVolume = Optional.ofNullable(averageMonthlyTransactionVolume);
            return this;
        }

        @JsonSetter(value = "maxTransactionSize", nulls = Nulls.SKIP)
        public Builder maxTransactionSize(Optional<OnboardingOptionRequest> maxTransactionSize) {
            this.maxTransactionSize = maxTransactionSize;
            return this;
        }

        public Builder maxTransactionSize(OnboardingOptionRequest maxTransactionSize) {
            this.maxTransactionSize = Optional.ofNullable(maxTransactionSize);
            return this;
        }

        public BusinessOnboardingOptionsRequest build() {
            return new BusinessOnboardingOptionsRequest(
                    termsOfService,
                    email,
                    name,
                    address,
                    phone,
                    tenNinetyNine,
                    w9,
                    bankStatement,
                    type,
                    doingBusinessAs,
                    ein,
                    mcc,
                    formationDate,
                    website,
                    description,
                    representatives,
                    logo,
                    averageTransactionSize,
                    averageMonthlyTransactionVolume,
                    maxTransactionSize,
                    additionalProperties);
        }
    }
}
