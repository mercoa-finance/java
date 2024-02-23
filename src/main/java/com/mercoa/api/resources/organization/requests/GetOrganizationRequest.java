/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.organization.requests;

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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GetOrganizationRequest.Builder.class)
public final class GetOrganizationRequest {
    private final Optional<Boolean> paymentMethods;

    private final Optional<Boolean> emailProvider;

    private final Optional<Boolean> colorScheme;

    private final Optional<Boolean> payeeOnboardingOptions;

    private final Optional<Boolean> payorOnboardingOptions;

    private final Optional<Boolean> metadataSchema;

    private final Map<String, Object> additionalProperties;

    private GetOrganizationRequest(
            Optional<Boolean> paymentMethods,
            Optional<Boolean> emailProvider,
            Optional<Boolean> colorScheme,
            Optional<Boolean> payeeOnboardingOptions,
            Optional<Boolean> payorOnboardingOptions,
            Optional<Boolean> metadataSchema,
            Map<String, Object> additionalProperties) {
        this.paymentMethods = paymentMethods;
        this.emailProvider = emailProvider;
        this.colorScheme = colorScheme;
        this.payeeOnboardingOptions = payeeOnboardingOptions;
        this.payorOnboardingOptions = payorOnboardingOptions;
        this.metadataSchema = metadataSchema;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return include supported payment methods in response
     */
    @JsonProperty("paymentMethods")
    public Optional<Boolean> getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * @return include email provider info in response
     */
    @JsonProperty("emailProvider")
    public Optional<Boolean> getEmailProvider() {
        return emailProvider;
    }

    /**
     * @return include color scheme info in response
     */
    @JsonProperty("colorScheme")
    public Optional<Boolean> getColorScheme() {
        return colorScheme;
    }

    /**
     * @return include payee onboarding options in response
     */
    @JsonProperty("payeeOnboardingOptions")
    public Optional<Boolean> getPayeeOnboardingOptions() {
        return payeeOnboardingOptions;
    }

    /**
     * @return include payor onboarding options in response
     */
    @JsonProperty("payorOnboardingOptions")
    public Optional<Boolean> getPayorOnboardingOptions() {
        return payorOnboardingOptions;
    }

    /**
     * @return include metadata schema in response
     */
    @JsonProperty("metadataSchema")
    public Optional<Boolean> getMetadataSchema() {
        return metadataSchema;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetOrganizationRequest && equalTo((GetOrganizationRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetOrganizationRequest other) {
        return paymentMethods.equals(other.paymentMethods)
                && emailProvider.equals(other.emailProvider)
                && colorScheme.equals(other.colorScheme)
                && payeeOnboardingOptions.equals(other.payeeOnboardingOptions)
                && payorOnboardingOptions.equals(other.payorOnboardingOptions)
                && metadataSchema.equals(other.metadataSchema);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.paymentMethods,
                this.emailProvider,
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
        private Optional<Boolean> paymentMethods = Optional.empty();

        private Optional<Boolean> emailProvider = Optional.empty();

        private Optional<Boolean> colorScheme = Optional.empty();

        private Optional<Boolean> payeeOnboardingOptions = Optional.empty();

        private Optional<Boolean> payorOnboardingOptions = Optional.empty();

        private Optional<Boolean> metadataSchema = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GetOrganizationRequest other) {
            paymentMethods(other.getPaymentMethods());
            emailProvider(other.getEmailProvider());
            colorScheme(other.getColorScheme());
            payeeOnboardingOptions(other.getPayeeOnboardingOptions());
            payorOnboardingOptions(other.getPayorOnboardingOptions());
            metadataSchema(other.getMetadataSchema());
            return this;
        }

        @JsonSetter(value = "paymentMethods", nulls = Nulls.SKIP)
        public Builder paymentMethods(Optional<Boolean> paymentMethods) {
            this.paymentMethods = paymentMethods;
            return this;
        }

        public Builder paymentMethods(Boolean paymentMethods) {
            this.paymentMethods = Optional.of(paymentMethods);
            return this;
        }

        @JsonSetter(value = "emailProvider", nulls = Nulls.SKIP)
        public Builder emailProvider(Optional<Boolean> emailProvider) {
            this.emailProvider = emailProvider;
            return this;
        }

        public Builder emailProvider(Boolean emailProvider) {
            this.emailProvider = Optional.of(emailProvider);
            return this;
        }

        @JsonSetter(value = "colorScheme", nulls = Nulls.SKIP)
        public Builder colorScheme(Optional<Boolean> colorScheme) {
            this.colorScheme = colorScheme;
            return this;
        }

        public Builder colorScheme(Boolean colorScheme) {
            this.colorScheme = Optional.of(colorScheme);
            return this;
        }

        @JsonSetter(value = "payeeOnboardingOptions", nulls = Nulls.SKIP)
        public Builder payeeOnboardingOptions(Optional<Boolean> payeeOnboardingOptions) {
            this.payeeOnboardingOptions = payeeOnboardingOptions;
            return this;
        }

        public Builder payeeOnboardingOptions(Boolean payeeOnboardingOptions) {
            this.payeeOnboardingOptions = Optional.of(payeeOnboardingOptions);
            return this;
        }

        @JsonSetter(value = "payorOnboardingOptions", nulls = Nulls.SKIP)
        public Builder payorOnboardingOptions(Optional<Boolean> payorOnboardingOptions) {
            this.payorOnboardingOptions = payorOnboardingOptions;
            return this;
        }

        public Builder payorOnboardingOptions(Boolean payorOnboardingOptions) {
            this.payorOnboardingOptions = Optional.of(payorOnboardingOptions);
            return this;
        }

        @JsonSetter(value = "metadataSchema", nulls = Nulls.SKIP)
        public Builder metadataSchema(Optional<Boolean> metadataSchema) {
            this.metadataSchema = metadataSchema;
            return this;
        }

        public Builder metadataSchema(Boolean metadataSchema) {
            this.metadataSchema = Optional.of(metadataSchema);
            return this;
        }

        public GetOrganizationRequest build() {
            return new GetOrganizationRequest(
                    paymentMethods,
                    emailProvider,
                    colorScheme,
                    payeeOnboardingOptions,
                    payorOnboardingOptions,
                    metadataSchema,
                    additionalProperties);
        }
    }
}
