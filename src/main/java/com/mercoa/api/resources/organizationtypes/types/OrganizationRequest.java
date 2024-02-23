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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = OrganizationRequest.Builder.class)
public final class OrganizationRequest {
    private final Optional<String> name;

    private final Optional<String> logo;

    private final Optional<String> websiteUrl;

    private final Optional<String> supportEmail;

    private final Optional<PaymentMethodsRequest> paymentMethods;

    private final Optional<EmailProviderRequest> emailProvider;

    private final Optional<ExternalAccountingSystemProviderRequest> externalAccountingSystemProvider;

    private final Optional<ColorSchemeRequest> colorScheme;

    private final Optional<OnboardingOptionsRequest> payeeOnboardingOptions;

    private final Optional<OnboardingOptionsRequest> payorOnboardingOptions;

    private final Optional<List<MetadataSchema>> metadataSchema;

    private final Map<String, Object> additionalProperties;

    private OrganizationRequest(
            Optional<String> name,
            Optional<String> logo,
            Optional<String> websiteUrl,
            Optional<String> supportEmail,
            Optional<PaymentMethodsRequest> paymentMethods,
            Optional<EmailProviderRequest> emailProvider,
            Optional<ExternalAccountingSystemProviderRequest> externalAccountingSystemProvider,
            Optional<ColorSchemeRequest> colorScheme,
            Optional<OnboardingOptionsRequest> payeeOnboardingOptions,
            Optional<OnboardingOptionsRequest> payorOnboardingOptions,
            Optional<List<MetadataSchema>> metadataSchema,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.logo = logo;
        this.websiteUrl = websiteUrl;
        this.supportEmail = supportEmail;
        this.paymentMethods = paymentMethods;
        this.emailProvider = emailProvider;
        this.externalAccountingSystemProvider = externalAccountingSystemProvider;
        this.colorScheme = colorScheme;
        this.payeeOnboardingOptions = payeeOnboardingOptions;
        this.payorOnboardingOptions = payorOnboardingOptions;
        this.metadataSchema = metadataSchema;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("logo")
    public Optional<String> getLogo() {
        return logo;
    }

    @JsonProperty("websiteUrl")
    public Optional<String> getWebsiteUrl() {
        return websiteUrl;
    }

    @JsonProperty("supportEmail")
    public Optional<String> getSupportEmail() {
        return supportEmail;
    }

    @JsonProperty("paymentMethods")
    public Optional<PaymentMethodsRequest> getPaymentMethods() {
        return paymentMethods;
    }

    @JsonProperty("emailProvider")
    public Optional<EmailProviderRequest> getEmailProvider() {
        return emailProvider;
    }

    @JsonProperty("externalAccountingSystemProvider")
    public Optional<ExternalAccountingSystemProviderRequest> getExternalAccountingSystemProvider() {
        return externalAccountingSystemProvider;
    }

    @JsonProperty("colorScheme")
    public Optional<ColorSchemeRequest> getColorScheme() {
        return colorScheme;
    }

    @JsonProperty("payeeOnboardingOptions")
    public Optional<OnboardingOptionsRequest> getPayeeOnboardingOptions() {
        return payeeOnboardingOptions;
    }

    @JsonProperty("payorOnboardingOptions")
    public Optional<OnboardingOptionsRequest> getPayorOnboardingOptions() {
        return payorOnboardingOptions;
    }

    @JsonProperty("metadataSchema")
    public Optional<List<MetadataSchema>> getMetadataSchema() {
        return metadataSchema;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OrganizationRequest && equalTo((OrganizationRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(OrganizationRequest other) {
        return name.equals(other.name)
                && logo.equals(other.logo)
                && websiteUrl.equals(other.websiteUrl)
                && supportEmail.equals(other.supportEmail)
                && paymentMethods.equals(other.paymentMethods)
                && emailProvider.equals(other.emailProvider)
                && externalAccountingSystemProvider.equals(other.externalAccountingSystemProvider)
                && colorScheme.equals(other.colorScheme)
                && payeeOnboardingOptions.equals(other.payeeOnboardingOptions)
                && payorOnboardingOptions.equals(other.payorOnboardingOptions)
                && metadataSchema.equals(other.metadataSchema);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.logo,
                this.websiteUrl,
                this.supportEmail,
                this.paymentMethods,
                this.emailProvider,
                this.externalAccountingSystemProvider,
                this.colorScheme,
                this.payeeOnboardingOptions,
                this.payorOnboardingOptions,
                this.metadataSchema);
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
        private Optional<String> name = Optional.empty();

        private Optional<String> logo = Optional.empty();

        private Optional<String> websiteUrl = Optional.empty();

        private Optional<String> supportEmail = Optional.empty();

        private Optional<PaymentMethodsRequest> paymentMethods = Optional.empty();

        private Optional<EmailProviderRequest> emailProvider = Optional.empty();

        private Optional<ExternalAccountingSystemProviderRequest> externalAccountingSystemProvider = Optional.empty();

        private Optional<ColorSchemeRequest> colorScheme = Optional.empty();

        private Optional<OnboardingOptionsRequest> payeeOnboardingOptions = Optional.empty();

        private Optional<OnboardingOptionsRequest> payorOnboardingOptions = Optional.empty();

        private Optional<List<MetadataSchema>> metadataSchema = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(OrganizationRequest other) {
            name(other.getName());
            logo(other.getLogo());
            websiteUrl(other.getWebsiteUrl());
            supportEmail(other.getSupportEmail());
            paymentMethods(other.getPaymentMethods());
            emailProvider(other.getEmailProvider());
            externalAccountingSystemProvider(other.getExternalAccountingSystemProvider());
            colorScheme(other.getColorScheme());
            payeeOnboardingOptions(other.getPayeeOnboardingOptions());
            payorOnboardingOptions(other.getPayorOnboardingOptions());
            metadataSchema(other.getMetadataSchema());
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @JsonSetter(value = "logo", nulls = Nulls.SKIP)
        public Builder logo(Optional<String> logo) {
            this.logo = logo;
            return this;
        }

        public Builder logo(String logo) {
            this.logo = Optional.of(logo);
            return this;
        }

        @JsonSetter(value = "websiteUrl", nulls = Nulls.SKIP)
        public Builder websiteUrl(Optional<String> websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }

        public Builder websiteUrl(String websiteUrl) {
            this.websiteUrl = Optional.of(websiteUrl);
            return this;
        }

        @JsonSetter(value = "supportEmail", nulls = Nulls.SKIP)
        public Builder supportEmail(Optional<String> supportEmail) {
            this.supportEmail = supportEmail;
            return this;
        }

        public Builder supportEmail(String supportEmail) {
            this.supportEmail = Optional.of(supportEmail);
            return this;
        }

        @JsonSetter(value = "paymentMethods", nulls = Nulls.SKIP)
        public Builder paymentMethods(Optional<PaymentMethodsRequest> paymentMethods) {
            this.paymentMethods = paymentMethods;
            return this;
        }

        public Builder paymentMethods(PaymentMethodsRequest paymentMethods) {
            this.paymentMethods = Optional.of(paymentMethods);
            return this;
        }

        @JsonSetter(value = "emailProvider", nulls = Nulls.SKIP)
        public Builder emailProvider(Optional<EmailProviderRequest> emailProvider) {
            this.emailProvider = emailProvider;
            return this;
        }

        public Builder emailProvider(EmailProviderRequest emailProvider) {
            this.emailProvider = Optional.of(emailProvider);
            return this;
        }

        @JsonSetter(value = "externalAccountingSystemProvider", nulls = Nulls.SKIP)
        public Builder externalAccountingSystemProvider(
                Optional<ExternalAccountingSystemProviderRequest> externalAccountingSystemProvider) {
            this.externalAccountingSystemProvider = externalAccountingSystemProvider;
            return this;
        }

        public Builder externalAccountingSystemProvider(
                ExternalAccountingSystemProviderRequest externalAccountingSystemProvider) {
            this.externalAccountingSystemProvider = Optional.of(externalAccountingSystemProvider);
            return this;
        }

        @JsonSetter(value = "colorScheme", nulls = Nulls.SKIP)
        public Builder colorScheme(Optional<ColorSchemeRequest> colorScheme) {
            this.colorScheme = colorScheme;
            return this;
        }

        public Builder colorScheme(ColorSchemeRequest colorScheme) {
            this.colorScheme = Optional.of(colorScheme);
            return this;
        }

        @JsonSetter(value = "payeeOnboardingOptions", nulls = Nulls.SKIP)
        public Builder payeeOnboardingOptions(Optional<OnboardingOptionsRequest> payeeOnboardingOptions) {
            this.payeeOnboardingOptions = payeeOnboardingOptions;
            return this;
        }

        public Builder payeeOnboardingOptions(OnboardingOptionsRequest payeeOnboardingOptions) {
            this.payeeOnboardingOptions = Optional.of(payeeOnboardingOptions);
            return this;
        }

        @JsonSetter(value = "payorOnboardingOptions", nulls = Nulls.SKIP)
        public Builder payorOnboardingOptions(Optional<OnboardingOptionsRequest> payorOnboardingOptions) {
            this.payorOnboardingOptions = payorOnboardingOptions;
            return this;
        }

        public Builder payorOnboardingOptions(OnboardingOptionsRequest payorOnboardingOptions) {
            this.payorOnboardingOptions = Optional.of(payorOnboardingOptions);
            return this;
        }

        @JsonSetter(value = "metadataSchema", nulls = Nulls.SKIP)
        public Builder metadataSchema(Optional<List<MetadataSchema>> metadataSchema) {
            this.metadataSchema = metadataSchema;
            return this;
        }

        public Builder metadataSchema(List<MetadataSchema> metadataSchema) {
            this.metadataSchema = Optional.of(metadataSchema);
            return this;
        }

        public OrganizationRequest build() {
            return new OrganizationRequest(
                    name,
                    logo,
                    websiteUrl,
                    supportEmail,
                    paymentMethods,
                    emailProvider,
                    externalAccountingSystemProvider,
                    colorScheme,
                    payeeOnboardingOptions,
                    payorOnboardingOptions,
                    metadataSchema,
                    additionalProperties);
        }
    }
}
