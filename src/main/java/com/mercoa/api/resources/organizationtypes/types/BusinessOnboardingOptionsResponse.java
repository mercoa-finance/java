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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = BusinessOnboardingOptionsResponse.Builder.class)
public final class BusinessOnboardingOptionsResponse implements ICommonOnboardingOptionsResponse {
    private final OnboardingOptionResponse termsOfService;

    private final OnboardingOptionResponse email;

    private final OnboardingOptionResponse name;

    private final OnboardingOptionResponse address;

    private final OnboardingOptionResponse phone;

    private final OnboardingOptionResponse tenNinetyNine;

    private final OnboardingOptionResponse w9;

    private final OnboardingOptionResponse bankStatement;

    private final OnboardingOptionResponse type;

    private final OnboardingOptionResponse doingBusinessAs;

    private final OnboardingOptionResponse ein;

    private final OnboardingOptionResponse mcc;

    private final OnboardingOptionResponse formationDate;

    private final OnboardingOptionResponse website;

    private final OnboardingOptionResponse description;

    private final OnboardingOptionResponse representatives;

    private final OnboardingOptionResponse logo;

    private final OnboardingOptionResponse averageTransactionSize;

    private final OnboardingOptionResponse averageMonthlyTransactionVolume;

    private final OnboardingOptionResponse maxTransactionSize;

    private final Map<String, Object> additionalProperties;

    private BusinessOnboardingOptionsResponse(
            OnboardingOptionResponse termsOfService,
            OnboardingOptionResponse email,
            OnboardingOptionResponse name,
            OnboardingOptionResponse address,
            OnboardingOptionResponse phone,
            OnboardingOptionResponse tenNinetyNine,
            OnboardingOptionResponse w9,
            OnboardingOptionResponse bankStatement,
            OnboardingOptionResponse type,
            OnboardingOptionResponse doingBusinessAs,
            OnboardingOptionResponse ein,
            OnboardingOptionResponse mcc,
            OnboardingOptionResponse formationDate,
            OnboardingOptionResponse website,
            OnboardingOptionResponse description,
            OnboardingOptionResponse representatives,
            OnboardingOptionResponse logo,
            OnboardingOptionResponse averageTransactionSize,
            OnboardingOptionResponse averageMonthlyTransactionVolume,
            OnboardingOptionResponse maxTransactionSize,
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
    public OnboardingOptionResponse getTermsOfService() {
        return termsOfService;
    }

    @JsonProperty("email")
    @java.lang.Override
    public OnboardingOptionResponse getEmail() {
        return email;
    }

    @JsonProperty("name")
    @java.lang.Override
    public OnboardingOptionResponse getName() {
        return name;
    }

    @JsonProperty("address")
    @java.lang.Override
    public OnboardingOptionResponse getAddress() {
        return address;
    }

    @JsonProperty("phone")
    @java.lang.Override
    public OnboardingOptionResponse getPhone() {
        return phone;
    }

    @JsonProperty("tenNinetyNine")
    @java.lang.Override
    public OnboardingOptionResponse getTenNinetyNine() {
        return tenNinetyNine;
    }

    @JsonProperty("w9")
    @java.lang.Override
    public OnboardingOptionResponse getW9() {
        return w9;
    }

    @JsonProperty("bankStatement")
    @java.lang.Override
    public OnboardingOptionResponse getBankStatement() {
        return bankStatement;
    }

    @JsonProperty("type")
    public OnboardingOptionResponse getType() {
        return type;
    }

    @JsonProperty("doingBusinessAs")
    public OnboardingOptionResponse getDoingBusinessAs() {
        return doingBusinessAs;
    }

    @JsonProperty("ein")
    public OnboardingOptionResponse getEin() {
        return ein;
    }

    @JsonProperty("mcc")
    public OnboardingOptionResponse getMcc() {
        return mcc;
    }

    @JsonProperty("formationDate")
    public OnboardingOptionResponse getFormationDate() {
        return formationDate;
    }

    @JsonProperty("website")
    public OnboardingOptionResponse getWebsite() {
        return website;
    }

    @JsonProperty("description")
    public OnboardingOptionResponse getDescription() {
        return description;
    }

    @JsonProperty("representatives")
    public OnboardingOptionResponse getRepresentatives() {
        return representatives;
    }

    @JsonProperty("logo")
    public OnboardingOptionResponse getLogo() {
        return logo;
    }

    @JsonProperty("averageTransactionSize")
    public OnboardingOptionResponse getAverageTransactionSize() {
        return averageTransactionSize;
    }

    @JsonProperty("averageMonthlyTransactionVolume")
    public OnboardingOptionResponse getAverageMonthlyTransactionVolume() {
        return averageMonthlyTransactionVolume;
    }

    @JsonProperty("maxTransactionSize")
    public OnboardingOptionResponse getMaxTransactionSize() {
        return maxTransactionSize;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BusinessOnboardingOptionsResponse && equalTo((BusinessOnboardingOptionsResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BusinessOnboardingOptionsResponse other) {
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

    public static TermsOfServiceStage builder() {
        return new Builder();
    }

    public interface TermsOfServiceStage {
        EmailStage termsOfService(@NotNull OnboardingOptionResponse termsOfService);

        Builder from(BusinessOnboardingOptionsResponse other);
    }

    public interface EmailStage {
        NameStage email(@NotNull OnboardingOptionResponse email);
    }

    public interface NameStage {
        AddressStage name(@NotNull OnboardingOptionResponse name);
    }

    public interface AddressStage {
        PhoneStage address(@NotNull OnboardingOptionResponse address);
    }

    public interface PhoneStage {
        TenNinetyNineStage phone(@NotNull OnboardingOptionResponse phone);
    }

    public interface TenNinetyNineStage {
        W9Stage tenNinetyNine(@NotNull OnboardingOptionResponse tenNinetyNine);
    }

    public interface W9Stage {
        BankStatementStage w9(@NotNull OnboardingOptionResponse w9);
    }

    public interface BankStatementStage {
        TypeStage bankStatement(@NotNull OnboardingOptionResponse bankStatement);
    }

    public interface TypeStage {
        DoingBusinessAsStage type(@NotNull OnboardingOptionResponse type);
    }

    public interface DoingBusinessAsStage {
        EinStage doingBusinessAs(@NotNull OnboardingOptionResponse doingBusinessAs);
    }

    public interface EinStage {
        MccStage ein(@NotNull OnboardingOptionResponse ein);
    }

    public interface MccStage {
        FormationDateStage mcc(@NotNull OnboardingOptionResponse mcc);
    }

    public interface FormationDateStage {
        WebsiteStage formationDate(@NotNull OnboardingOptionResponse formationDate);
    }

    public interface WebsiteStage {
        DescriptionStage website(@NotNull OnboardingOptionResponse website);
    }

    public interface DescriptionStage {
        RepresentativesStage description(@NotNull OnboardingOptionResponse description);
    }

    public interface RepresentativesStage {
        LogoStage representatives(@NotNull OnboardingOptionResponse representatives);
    }

    public interface LogoStage {
        AverageTransactionSizeStage logo(@NotNull OnboardingOptionResponse logo);
    }

    public interface AverageTransactionSizeStage {
        AverageMonthlyTransactionVolumeStage averageTransactionSize(
                @NotNull OnboardingOptionResponse averageTransactionSize);
    }

    public interface AverageMonthlyTransactionVolumeStage {
        MaxTransactionSizeStage averageMonthlyTransactionVolume(
                @NotNull OnboardingOptionResponse averageMonthlyTransactionVolume);
    }

    public interface MaxTransactionSizeStage {
        _FinalStage maxTransactionSize(@NotNull OnboardingOptionResponse maxTransactionSize);
    }

    public interface _FinalStage {
        BusinessOnboardingOptionsResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TermsOfServiceStage,
                    EmailStage,
                    NameStage,
                    AddressStage,
                    PhoneStage,
                    TenNinetyNineStage,
                    W9Stage,
                    BankStatementStage,
                    TypeStage,
                    DoingBusinessAsStage,
                    EinStage,
                    MccStage,
                    FormationDateStage,
                    WebsiteStage,
                    DescriptionStage,
                    RepresentativesStage,
                    LogoStage,
                    AverageTransactionSizeStage,
                    AverageMonthlyTransactionVolumeStage,
                    MaxTransactionSizeStage,
                    _FinalStage {
        private OnboardingOptionResponse termsOfService;

        private OnboardingOptionResponse email;

        private OnboardingOptionResponse name;

        private OnboardingOptionResponse address;

        private OnboardingOptionResponse phone;

        private OnboardingOptionResponse tenNinetyNine;

        private OnboardingOptionResponse w9;

        private OnboardingOptionResponse bankStatement;

        private OnboardingOptionResponse type;

        private OnboardingOptionResponse doingBusinessAs;

        private OnboardingOptionResponse ein;

        private OnboardingOptionResponse mcc;

        private OnboardingOptionResponse formationDate;

        private OnboardingOptionResponse website;

        private OnboardingOptionResponse description;

        private OnboardingOptionResponse representatives;

        private OnboardingOptionResponse logo;

        private OnboardingOptionResponse averageTransactionSize;

        private OnboardingOptionResponse averageMonthlyTransactionVolume;

        private OnboardingOptionResponse maxTransactionSize;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(BusinessOnboardingOptionsResponse other) {
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

        @java.lang.Override
        @JsonSetter("termsOfService")
        public EmailStage termsOfService(@NotNull OnboardingOptionResponse termsOfService) {
            this.termsOfService = Objects.requireNonNull(termsOfService, "termsOfService must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("email")
        public NameStage email(@NotNull OnboardingOptionResponse email) {
            this.email = Objects.requireNonNull(email, "email must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public AddressStage name(@NotNull OnboardingOptionResponse name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("address")
        public PhoneStage address(@NotNull OnboardingOptionResponse address) {
            this.address = Objects.requireNonNull(address, "address must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("phone")
        public TenNinetyNineStage phone(@NotNull OnboardingOptionResponse phone) {
            this.phone = Objects.requireNonNull(phone, "phone must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("tenNinetyNine")
        public W9Stage tenNinetyNine(@NotNull OnboardingOptionResponse tenNinetyNine) {
            this.tenNinetyNine = Objects.requireNonNull(tenNinetyNine, "tenNinetyNine must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("w9")
        public BankStatementStage w9(@NotNull OnboardingOptionResponse w9) {
            this.w9 = Objects.requireNonNull(w9, "w9 must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("bankStatement")
        public TypeStage bankStatement(@NotNull OnboardingOptionResponse bankStatement) {
            this.bankStatement = Objects.requireNonNull(bankStatement, "bankStatement must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("type")
        public DoingBusinessAsStage type(@NotNull OnboardingOptionResponse type) {
            this.type = Objects.requireNonNull(type, "type must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("doingBusinessAs")
        public EinStage doingBusinessAs(@NotNull OnboardingOptionResponse doingBusinessAs) {
            this.doingBusinessAs = Objects.requireNonNull(doingBusinessAs, "doingBusinessAs must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("ein")
        public MccStage ein(@NotNull OnboardingOptionResponse ein) {
            this.ein = Objects.requireNonNull(ein, "ein must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("mcc")
        public FormationDateStage mcc(@NotNull OnboardingOptionResponse mcc) {
            this.mcc = Objects.requireNonNull(mcc, "mcc must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("formationDate")
        public WebsiteStage formationDate(@NotNull OnboardingOptionResponse formationDate) {
            this.formationDate = Objects.requireNonNull(formationDate, "formationDate must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("website")
        public DescriptionStage website(@NotNull OnboardingOptionResponse website) {
            this.website = Objects.requireNonNull(website, "website must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("description")
        public RepresentativesStage description(@NotNull OnboardingOptionResponse description) {
            this.description = Objects.requireNonNull(description, "description must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("representatives")
        public LogoStage representatives(@NotNull OnboardingOptionResponse representatives) {
            this.representatives = Objects.requireNonNull(representatives, "representatives must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("logo")
        public AverageTransactionSizeStage logo(@NotNull OnboardingOptionResponse logo) {
            this.logo = Objects.requireNonNull(logo, "logo must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("averageTransactionSize")
        public AverageMonthlyTransactionVolumeStage averageTransactionSize(
                @NotNull OnboardingOptionResponse averageTransactionSize) {
            this.averageTransactionSize =
                    Objects.requireNonNull(averageTransactionSize, "averageTransactionSize must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("averageMonthlyTransactionVolume")
        public MaxTransactionSizeStage averageMonthlyTransactionVolume(
                @NotNull OnboardingOptionResponse averageMonthlyTransactionVolume) {
            this.averageMonthlyTransactionVolume = Objects.requireNonNull(
                    averageMonthlyTransactionVolume, "averageMonthlyTransactionVolume must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("maxTransactionSize")
        public _FinalStage maxTransactionSize(@NotNull OnboardingOptionResponse maxTransactionSize) {
            this.maxTransactionSize = Objects.requireNonNull(maxTransactionSize, "maxTransactionSize must not be null");
            return this;
        }

        @java.lang.Override
        public BusinessOnboardingOptionsResponse build() {
            return new BusinessOnboardingOptionsResponse(
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
