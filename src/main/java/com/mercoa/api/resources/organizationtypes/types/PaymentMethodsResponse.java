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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = PaymentMethodsResponse.Builder.class)
public final class PaymentMethodsResponse {
    private final List<PaymentRailResponse> payerPayments;

    private final List<PaymentRailResponse> backupDisbursements;

    private final List<PaymentRailResponse> vendorDisbursements;

    private final Map<String, Object> additionalProperties;

    private PaymentMethodsResponse(
            List<PaymentRailResponse> payerPayments,
            List<PaymentRailResponse> backupDisbursements,
            List<PaymentRailResponse> vendorDisbursements,
            Map<String, Object> additionalProperties) {
        this.payerPayments = payerPayments;
        this.backupDisbursements = backupDisbursements;
        this.vendorDisbursements = vendorDisbursements;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return List of payment methods that can be used to pay invoices.
     */
    @JsonProperty("payerPayments")
    public List<PaymentRailResponse> getPayerPayments() {
        return payerPayments;
    }

    /**
     * @return List of payment methods that can be created by a payor to send disbursements.
     */
    @JsonProperty("backupDisbursements")
    public List<PaymentRailResponse> getBackupDisbursements() {
        return backupDisbursements;
    }

    /**
     * @return List of payment methods that can be created by a payee to receive disbursements.
     */
    @JsonProperty("vendorDisbursements")
    public List<PaymentRailResponse> getVendorDisbursements() {
        return vendorDisbursements;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PaymentMethodsResponse && equalTo((PaymentMethodsResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PaymentMethodsResponse other) {
        return payerPayments.equals(other.payerPayments)
                && backupDisbursements.equals(other.backupDisbursements)
                && vendorDisbursements.equals(other.vendorDisbursements);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.payerPayments, this.backupDisbursements, this.vendorDisbursements);
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
        private List<PaymentRailResponse> payerPayments = new ArrayList<>();

        private List<PaymentRailResponse> backupDisbursements = new ArrayList<>();

        private List<PaymentRailResponse> vendorDisbursements = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(PaymentMethodsResponse other) {
            payerPayments(other.getPayerPayments());
            backupDisbursements(other.getBackupDisbursements());
            vendorDisbursements(other.getVendorDisbursements());
            return this;
        }

        @JsonSetter(value = "payerPayments", nulls = Nulls.SKIP)
        public Builder payerPayments(List<PaymentRailResponse> payerPayments) {
            this.payerPayments.clear();
            this.payerPayments.addAll(payerPayments);
            return this;
        }

        public Builder addPayerPayments(PaymentRailResponse payerPayments) {
            this.payerPayments.add(payerPayments);
            return this;
        }

        public Builder addAllPayerPayments(List<PaymentRailResponse> payerPayments) {
            this.payerPayments.addAll(payerPayments);
            return this;
        }

        @JsonSetter(value = "backupDisbursements", nulls = Nulls.SKIP)
        public Builder backupDisbursements(List<PaymentRailResponse> backupDisbursements) {
            this.backupDisbursements.clear();
            this.backupDisbursements.addAll(backupDisbursements);
            return this;
        }

        public Builder addBackupDisbursements(PaymentRailResponse backupDisbursements) {
            this.backupDisbursements.add(backupDisbursements);
            return this;
        }

        public Builder addAllBackupDisbursements(List<PaymentRailResponse> backupDisbursements) {
            this.backupDisbursements.addAll(backupDisbursements);
            return this;
        }

        @JsonSetter(value = "vendorDisbursements", nulls = Nulls.SKIP)
        public Builder vendorDisbursements(List<PaymentRailResponse> vendorDisbursements) {
            this.vendorDisbursements.clear();
            this.vendorDisbursements.addAll(vendorDisbursements);
            return this;
        }

        public Builder addVendorDisbursements(PaymentRailResponse vendorDisbursements) {
            this.vendorDisbursements.add(vendorDisbursements);
            return this;
        }

        public Builder addAllVendorDisbursements(List<PaymentRailResponse> vendorDisbursements) {
            this.vendorDisbursements.addAll(vendorDisbursements);
            return this;
        }

        public PaymentMethodsResponse build() {
            return new PaymentMethodsResponse(
                    payerPayments, backupDisbursements, vendorDisbursements, additionalProperties);
        }
    }
}
