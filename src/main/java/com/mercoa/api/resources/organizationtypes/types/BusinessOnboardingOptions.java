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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = BusinessOnboardingOptions.Builder.class)
public final class BusinessOnboardingOptions {
    private final OnboardingOption termsOfService;

    private final OnboardingOption email;

    private final OnboardingOption name;

    private final OnboardingOption type;

    private final OnboardingOption doingBusinessAs;

    private final OnboardingOption ein;

    private final OnboardingOption address;

    private final OnboardingOption phone;

    private final OnboardingOption formationDate;

    private final OnboardingOption website;

    private final OnboardingOption description;

    private final OnboardingOption representatives;

    private final Map<String, Object> additionalProperties;

    private BusinessOnboardingOptions(
            OnboardingOption termsOfService,
            OnboardingOption email,
            OnboardingOption name,
            OnboardingOption type,
            OnboardingOption doingBusinessAs,
            OnboardingOption ein,
            OnboardingOption address,
            OnboardingOption phone,
            OnboardingOption formationDate,
            OnboardingOption website,
            OnboardingOption description,
            OnboardingOption representatives,
            Map<String, Object> additionalProperties) {
        this.termsOfService = termsOfService;
        this.email = email;
        this.name = name;
        this.type = type;
        this.doingBusinessAs = doingBusinessAs;
        this.ein = ein;
        this.address = address;
        this.phone = phone;
        this.formationDate = formationDate;
        this.website = website;
        this.description = description;
        this.representatives = representatives;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("termsOfService")
    public OnboardingOption getTermsOfService() {
        return termsOfService;
    }

    @JsonProperty("email")
    public OnboardingOption getEmail() {
        return email;
    }

    @JsonProperty("name")
    public OnboardingOption getName() {
        return name;
    }

    @JsonProperty("type")
    public OnboardingOption getType() {
        return type;
    }

    @JsonProperty("doingBusinessAs")
    public OnboardingOption getDoingBusinessAs() {
        return doingBusinessAs;
    }

    @JsonProperty("ein")
    public OnboardingOption getEin() {
        return ein;
    }

    @JsonProperty("address")
    public OnboardingOption getAddress() {
        return address;
    }

    @JsonProperty("phone")
    public OnboardingOption getPhone() {
        return phone;
    }

    @JsonProperty("formationDate")
    public OnboardingOption getFormationDate() {
        return formationDate;
    }

    @JsonProperty("website")
    public OnboardingOption getWebsite() {
        return website;
    }

    @JsonProperty("description")
    public OnboardingOption getDescription() {
        return description;
    }

    @JsonProperty("representatives")
    public OnboardingOption getRepresentatives() {
        return representatives;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BusinessOnboardingOptions && equalTo((BusinessOnboardingOptions) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BusinessOnboardingOptions other) {
        return termsOfService.equals(other.termsOfService)
                && email.equals(other.email)
                && name.equals(other.name)
                && type.equals(other.type)
                && doingBusinessAs.equals(other.doingBusinessAs)
                && ein.equals(other.ein)
                && address.equals(other.address)
                && phone.equals(other.phone)
                && formationDate.equals(other.formationDate)
                && website.equals(other.website)
                && description.equals(other.description)
                && representatives.equals(other.representatives);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.termsOfService,
                this.email,
                this.name,
                this.type,
                this.doingBusinessAs,
                this.ein,
                this.address,
                this.phone,
                this.formationDate,
                this.website,
                this.description,
                this.representatives);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TermsOfServiceStage builder() {
        return new Builder();
    }

    public interface TermsOfServiceStage {
        EmailStage termsOfService(OnboardingOption termsOfService);

        Builder from(BusinessOnboardingOptions other);
    }

    public interface EmailStage {
        NameStage email(OnboardingOption email);
    }

    public interface NameStage {
        TypeStage name(OnboardingOption name);
    }

    public interface TypeStage {
        DoingBusinessAsStage type(OnboardingOption type);
    }

    public interface DoingBusinessAsStage {
        EinStage doingBusinessAs(OnboardingOption doingBusinessAs);
    }

    public interface EinStage {
        AddressStage ein(OnboardingOption ein);
    }

    public interface AddressStage {
        PhoneStage address(OnboardingOption address);
    }

    public interface PhoneStage {
        FormationDateStage phone(OnboardingOption phone);
    }

    public interface FormationDateStage {
        WebsiteStage formationDate(OnboardingOption formationDate);
    }

    public interface WebsiteStage {
        DescriptionStage website(OnboardingOption website);
    }

    public interface DescriptionStage {
        RepresentativesStage description(OnboardingOption description);
    }

    public interface RepresentativesStage {
        _FinalStage representatives(OnboardingOption representatives);
    }

    public interface _FinalStage {
        BusinessOnboardingOptions build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TermsOfServiceStage,
                    EmailStage,
                    NameStage,
                    TypeStage,
                    DoingBusinessAsStage,
                    EinStage,
                    AddressStage,
                    PhoneStage,
                    FormationDateStage,
                    WebsiteStage,
                    DescriptionStage,
                    RepresentativesStage,
                    _FinalStage {
        private OnboardingOption termsOfService;

        private OnboardingOption email;

        private OnboardingOption name;

        private OnboardingOption type;

        private OnboardingOption doingBusinessAs;

        private OnboardingOption ein;

        private OnboardingOption address;

        private OnboardingOption phone;

        private OnboardingOption formationDate;

        private OnboardingOption website;

        private OnboardingOption description;

        private OnboardingOption representatives;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(BusinessOnboardingOptions other) {
            termsOfService(other.getTermsOfService());
            email(other.getEmail());
            name(other.getName());
            type(other.getType());
            doingBusinessAs(other.getDoingBusinessAs());
            ein(other.getEin());
            address(other.getAddress());
            phone(other.getPhone());
            formationDate(other.getFormationDate());
            website(other.getWebsite());
            description(other.getDescription());
            representatives(other.getRepresentatives());
            return this;
        }

        @Override
        @JsonSetter("termsOfService")
        public EmailStage termsOfService(OnboardingOption termsOfService) {
            this.termsOfService = termsOfService;
            return this;
        }

        @Override
        @JsonSetter("email")
        public NameStage email(OnboardingOption email) {
            this.email = email;
            return this;
        }

        @Override
        @JsonSetter("name")
        public TypeStage name(OnboardingOption name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("type")
        public DoingBusinessAsStage type(OnboardingOption type) {
            this.type = type;
            return this;
        }

        @Override
        @JsonSetter("doingBusinessAs")
        public EinStage doingBusinessAs(OnboardingOption doingBusinessAs) {
            this.doingBusinessAs = doingBusinessAs;
            return this;
        }

        @Override
        @JsonSetter("ein")
        public AddressStage ein(OnboardingOption ein) {
            this.ein = ein;
            return this;
        }

        @Override
        @JsonSetter("address")
        public PhoneStage address(OnboardingOption address) {
            this.address = address;
            return this;
        }

        @Override
        @JsonSetter("phone")
        public FormationDateStage phone(OnboardingOption phone) {
            this.phone = phone;
            return this;
        }

        @Override
        @JsonSetter("formationDate")
        public WebsiteStage formationDate(OnboardingOption formationDate) {
            this.formationDate = formationDate;
            return this;
        }

        @Override
        @JsonSetter("website")
        public DescriptionStage website(OnboardingOption website) {
            this.website = website;
            return this;
        }

        @Override
        @JsonSetter("description")
        public RepresentativesStage description(OnboardingOption description) {
            this.description = description;
            return this;
        }

        @Override
        @JsonSetter("representatives")
        public _FinalStage representatives(OnboardingOption representatives) {
            this.representatives = representatives;
            return this;
        }

        @Override
        public BusinessOnboardingOptions build() {
            return new BusinessOnboardingOptions(
                    termsOfService,
                    email,
                    name,
                    type,
                    doingBusinessAs,
                    ein,
                    address,
                    phone,
                    formationDate,
                    website,
                    description,
                    representatives,
                    additionalProperties);
        }
    }
}
