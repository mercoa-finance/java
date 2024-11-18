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

    private final OcrCustomizationRequest ocr;

    private final NotificationCustomizationRequest notifications;

    private final Map<String, Object> additionalProperties;

    private EntityCustomizationResponse(
            List<MetadataCustomizationRequest> metadata,
            List<PaymentMethodCustomizationRequest> paymentSource,
            List<PaymentMethodCustomizationRequest> backupDisbursement,
            List<PaymentMethodCustomizationRequest> paymentDestination,
            OcrCustomizationRequest ocr,
            NotificationCustomizationRequest notifications,
            Map<String, Object> additionalProperties) {
        this.metadata = metadata;
        this.paymentSource = paymentSource;
        this.backupDisbursement = backupDisbursement;
        this.paymentDestination = paymentDestination;
        this.ocr = ocr;
        this.notifications = notifications;
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

    @JsonProperty("ocr")
    public OcrCustomizationRequest getOcr() {
        return ocr;
    }

    @JsonProperty("notifications")
    public NotificationCustomizationRequest getNotifications() {
        return notifications;
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
                && paymentDestination.equals(other.paymentDestination)
                && ocr.equals(other.ocr)
                && notifications.equals(other.notifications);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.metadata,
                this.paymentSource,
                this.backupDisbursement,
                this.paymentDestination,
                this.ocr,
                this.notifications);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OcrStage builder() {
        return new Builder();
    }

    public interface OcrStage {
        NotificationsStage ocr(OcrCustomizationRequest ocr);

        Builder from(EntityCustomizationResponse other);
    }

    public interface NotificationsStage {
        _FinalStage notifications(NotificationCustomizationRequest notifications);
    }

    public interface _FinalStage {
        EntityCustomizationResponse build();

        _FinalStage metadata(List<MetadataCustomizationRequest> metadata);

        _FinalStage addMetadata(MetadataCustomizationRequest metadata);

        _FinalStage addAllMetadata(List<MetadataCustomizationRequest> metadata);

        _FinalStage paymentSource(List<PaymentMethodCustomizationRequest> paymentSource);

        _FinalStage addPaymentSource(PaymentMethodCustomizationRequest paymentSource);

        _FinalStage addAllPaymentSource(List<PaymentMethodCustomizationRequest> paymentSource);

        _FinalStage backupDisbursement(List<PaymentMethodCustomizationRequest> backupDisbursement);

        _FinalStage addBackupDisbursement(PaymentMethodCustomizationRequest backupDisbursement);

        _FinalStage addAllBackupDisbursement(List<PaymentMethodCustomizationRequest> backupDisbursement);

        _FinalStage paymentDestination(List<PaymentMethodCustomizationRequest> paymentDestination);

        _FinalStage addPaymentDestination(PaymentMethodCustomizationRequest paymentDestination);

        _FinalStage addAllPaymentDestination(List<PaymentMethodCustomizationRequest> paymentDestination);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OcrStage, NotificationsStage, _FinalStage {
        private OcrCustomizationRequest ocr;

        private NotificationCustomizationRequest notifications;

        private List<PaymentMethodCustomizationRequest> paymentDestination = new ArrayList<>();

        private List<PaymentMethodCustomizationRequest> backupDisbursement = new ArrayList<>();

        private List<PaymentMethodCustomizationRequest> paymentSource = new ArrayList<>();

        private List<MetadataCustomizationRequest> metadata = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EntityCustomizationResponse other) {
            metadata(other.getMetadata());
            paymentSource(other.getPaymentSource());
            backupDisbursement(other.getBackupDisbursement());
            paymentDestination(other.getPaymentDestination());
            ocr(other.getOcr());
            notifications(other.getNotifications());
            return this;
        }

        @java.lang.Override
        @JsonSetter("ocr")
        public NotificationsStage ocr(OcrCustomizationRequest ocr) {
            this.ocr = ocr;
            return this;
        }

        @java.lang.Override
        @JsonSetter("notifications")
        public _FinalStage notifications(NotificationCustomizationRequest notifications) {
            this.notifications = notifications;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllPaymentDestination(List<PaymentMethodCustomizationRequest> paymentDestination) {
            this.paymentDestination.addAll(paymentDestination);
            return this;
        }

        @java.lang.Override
        public _FinalStage addPaymentDestination(PaymentMethodCustomizationRequest paymentDestination) {
            this.paymentDestination.add(paymentDestination);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "paymentDestination", nulls = Nulls.SKIP)
        public _FinalStage paymentDestination(List<PaymentMethodCustomizationRequest> paymentDestination) {
            this.paymentDestination.clear();
            this.paymentDestination.addAll(paymentDestination);
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllBackupDisbursement(List<PaymentMethodCustomizationRequest> backupDisbursement) {
            this.backupDisbursement.addAll(backupDisbursement);
            return this;
        }

        @java.lang.Override
        public _FinalStage addBackupDisbursement(PaymentMethodCustomizationRequest backupDisbursement) {
            this.backupDisbursement.add(backupDisbursement);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "backupDisbursement", nulls = Nulls.SKIP)
        public _FinalStage backupDisbursement(List<PaymentMethodCustomizationRequest> backupDisbursement) {
            this.backupDisbursement.clear();
            this.backupDisbursement.addAll(backupDisbursement);
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllPaymentSource(List<PaymentMethodCustomizationRequest> paymentSource) {
            this.paymentSource.addAll(paymentSource);
            return this;
        }

        @java.lang.Override
        public _FinalStage addPaymentSource(PaymentMethodCustomizationRequest paymentSource) {
            this.paymentSource.add(paymentSource);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "paymentSource", nulls = Nulls.SKIP)
        public _FinalStage paymentSource(List<PaymentMethodCustomizationRequest> paymentSource) {
            this.paymentSource.clear();
            this.paymentSource.addAll(paymentSource);
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllMetadata(List<MetadataCustomizationRequest> metadata) {
            this.metadata.addAll(metadata);
            return this;
        }

        @java.lang.Override
        public _FinalStage addMetadata(MetadataCustomizationRequest metadata) {
            this.metadata.add(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(List<MetadataCustomizationRequest> metadata) {
            this.metadata.clear();
            this.metadata.addAll(metadata);
            return this;
        }

        @java.lang.Override
        public EntityCustomizationResponse build() {
            return new EntityCustomizationResponse(
                    metadata,
                    paymentSource,
                    backupDisbursement,
                    paymentDestination,
                    ocr,
                    notifications,
                    additionalProperties);
        }
    }
}
