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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = EntityCustomizationResponse.Builder.class)
public final class EntityCustomizationResponse {
    private final List<MetadataCustomizationRequest> metadata;

    private final List<PaymentMethodCustomizationRequest> paymentSource;

    private final List<PaymentMethodCustomizationRequest> backupDisbursement;

    private final List<PaymentMethodCustomizationRequest> paymentDestination;

    private final Map<String, Object> additionalProperties;

    private EntityCustomizationResponse(
            List<MetadataCustomizationRequest> metadata,
            List<PaymentMethodCustomizationRequest> paymentSource,
            List<PaymentMethodCustomizationRequest> backupDisbursement,
            List<PaymentMethodCustomizationRequest> paymentDestination,
            Map<String, Object> additionalProperties) {
        this.metadata = metadata;
        this.paymentSource = paymentSource;
        this.backupDisbursement = backupDisbursement;
        this.paymentDestination = paymentDestination;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("metadata")
    public List<MetadataCustomizationRequest> getMetadata() {
        return metadata;
    }

    @JsonProperty("paymentSource")
    public List<PaymentMethodCustomizationRequest> getPaymentSource() {
        return paymentSource;
    }

    @JsonProperty("backupDisbursement")
    public List<PaymentMethodCustomizationRequest> getBackupDisbursement() {
        return backupDisbursement;
    }

    @JsonProperty("paymentDestination")
    public List<PaymentMethodCustomizationRequest> getPaymentDestination() {
        return paymentDestination;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityCustomizationResponse && equalTo((EntityCustomizationResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityCustomizationResponse other) {
        return metadata.equals(other.metadata)
                && paymentSource.equals(other.paymentSource)
                && backupDisbursement.equals(other.backupDisbursement)
                && paymentDestination.equals(other.paymentDestination);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.metadata, this.paymentSource, this.backupDisbursement, this.paymentDestination);
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
        private List<MetadataCustomizationRequest> metadata = new ArrayList<>();

        private List<PaymentMethodCustomizationRequest> paymentSource = new ArrayList<>();

        private List<PaymentMethodCustomizationRequest> backupDisbursement = new ArrayList<>();

        private List<PaymentMethodCustomizationRequest> paymentDestination = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EntityCustomizationResponse other) {
            metadata(other.getMetadata());
            paymentSource(other.getPaymentSource());
            backupDisbursement(other.getBackupDisbursement());
            paymentDestination(other.getPaymentDestination());
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(List<MetadataCustomizationRequest> metadata) {
            this.metadata.clear();
            this.metadata.addAll(metadata);
            return this;
        }

        public Builder addMetadata(MetadataCustomizationRequest metadata) {
            this.metadata.add(metadata);
            return this;
        }

        public Builder addAllMetadata(List<MetadataCustomizationRequest> metadata) {
            this.metadata.addAll(metadata);
            return this;
        }

        @JsonSetter(value = "paymentSource", nulls = Nulls.SKIP)
        public Builder paymentSource(List<PaymentMethodCustomizationRequest> paymentSource) {
            this.paymentSource.clear();
            this.paymentSource.addAll(paymentSource);
            return this;
        }

        public Builder addPaymentSource(PaymentMethodCustomizationRequest paymentSource) {
            this.paymentSource.add(paymentSource);
            return this;
        }

        public Builder addAllPaymentSource(List<PaymentMethodCustomizationRequest> paymentSource) {
            this.paymentSource.addAll(paymentSource);
            return this;
        }

        @JsonSetter(value = "backupDisbursement", nulls = Nulls.SKIP)
        public Builder backupDisbursement(List<PaymentMethodCustomizationRequest> backupDisbursement) {
            this.backupDisbursement.clear();
            this.backupDisbursement.addAll(backupDisbursement);
            return this;
        }

        public Builder addBackupDisbursement(PaymentMethodCustomizationRequest backupDisbursement) {
            this.backupDisbursement.add(backupDisbursement);
            return this;
        }

        public Builder addAllBackupDisbursement(List<PaymentMethodCustomizationRequest> backupDisbursement) {
            this.backupDisbursement.addAll(backupDisbursement);
            return this;
        }

        @JsonSetter(value = "paymentDestination", nulls = Nulls.SKIP)
        public Builder paymentDestination(List<PaymentMethodCustomizationRequest> paymentDestination) {
            this.paymentDestination.clear();
            this.paymentDestination.addAll(paymentDestination);
            return this;
        }

        public Builder addPaymentDestination(PaymentMethodCustomizationRequest paymentDestination) {
            this.paymentDestination.add(paymentDestination);
            return this;
        }

        public Builder addAllPaymentDestination(List<PaymentMethodCustomizationRequest> paymentDestination) {
            this.paymentDestination.addAll(paymentDestination);
            return this;
        }

        public EntityCustomizationResponse build() {
            return new EntityCustomizationResponse(
                    metadata, paymentSource, backupDisbursement, paymentDestination, additionalProperties);
        }
    }
}
