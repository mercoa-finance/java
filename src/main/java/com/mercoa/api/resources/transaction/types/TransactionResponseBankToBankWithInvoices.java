/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.transaction.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.entitytypes.types.CounterpartyResponse;
import com.mercoa.api.resources.invoicetypes.types.InvoiceFeesResponse;
import com.mercoa.api.resources.invoicetypes.types.InvoiceResponse;
import com.mercoa.api.resources.invoicetypes.types.PaymentDestinationOptions;
import com.mercoa.api.resources.paymentmethodtypes.types.PaymentMethodResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TransactionResponseBankToBankWithInvoices.Builder.class)
public final class TransactionResponseBankToBankWithInvoices implements ITransactionResponseAchBase {
    private final Optional<TransactionFailureReason> failureReason;

    private final String id;

    private final TransactionStatus status;

    private final int amount;

    private final String currency;

    private final String payerId;

    private final CounterpartyResponse payer;

    private final PaymentMethodResponse paymentSource;

    private final String paymentSourceId;

    private final String vendorId;

    private final CounterpartyResponse vendor;

    private final PaymentMethodResponse paymentDestination;

    private final String paymentDestinationId;

    private final Optional<PaymentDestinationOptions> paymentDestinationOptions;

    private final Optional<InvoiceFeesResponse> fees;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final List<InvoiceResponse> invoices;

    private final Map<String, Object> additionalProperties;

    private TransactionResponseBankToBankWithInvoices(
            Optional<TransactionFailureReason> failureReason,
            String id,
            TransactionStatus status,
            int amount,
            String currency,
            String payerId,
            CounterpartyResponse payer,
            PaymentMethodResponse paymentSource,
            String paymentSourceId,
            String vendorId,
            CounterpartyResponse vendor,
            PaymentMethodResponse paymentDestination,
            String paymentDestinationId,
            Optional<PaymentDestinationOptions> paymentDestinationOptions,
            Optional<InvoiceFeesResponse> fees,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            List<InvoiceResponse> invoices,
            Map<String, Object> additionalProperties) {
        this.failureReason = failureReason;
        this.id = id;
        this.status = status;
        this.amount = amount;
        this.currency = currency;
        this.payerId = payerId;
        this.payer = payer;
        this.paymentSource = paymentSource;
        this.paymentSourceId = paymentSourceId;
        this.vendorId = vendorId;
        this.vendor = vendor;
        this.paymentDestination = paymentDestination;
        this.paymentDestinationId = paymentDestinationId;
        this.paymentDestinationOptions = paymentDestinationOptions;
        this.fees = fees;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.invoices = invoices;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If the invoice failed to be paid, this field will be populated with the reason of failure.
     */
    @JsonProperty("failureReason")
    @java.lang.Override
    public Optional<TransactionFailureReason> getFailureReason() {
        return failureReason;
    }

    @JsonProperty("id")
    @java.lang.Override
    public String getId() {
        return id;
    }

    @JsonProperty("status")
    @java.lang.Override
    public TransactionStatus getStatus() {
        return status;
    }

    @JsonProperty("amount")
    @java.lang.Override
    public int getAmount() {
        return amount;
    }

    @JsonProperty("currency")
    @java.lang.Override
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("payerId")
    @java.lang.Override
    public String getPayerId() {
        return payerId;
    }

    @JsonProperty("payer")
    @java.lang.Override
    public CounterpartyResponse getPayer() {
        return payer;
    }

    @JsonProperty("paymentSource")
    @java.lang.Override
    public PaymentMethodResponse getPaymentSource() {
        return paymentSource;
    }

    @JsonProperty("paymentSourceId")
    @java.lang.Override
    public String getPaymentSourceId() {
        return paymentSourceId;
    }

    @JsonProperty("vendorId")
    @java.lang.Override
    public String getVendorId() {
        return vendorId;
    }

    @JsonProperty("vendor")
    @java.lang.Override
    public CounterpartyResponse getVendor() {
        return vendor;
    }

    @JsonProperty("paymentDestination")
    @java.lang.Override
    public PaymentMethodResponse getPaymentDestination() {
        return paymentDestination;
    }

    @JsonProperty("paymentDestinationId")
    @java.lang.Override
    public String getPaymentDestinationId() {
        return paymentDestinationId;
    }

    @JsonProperty("paymentDestinationOptions")
    @java.lang.Override
    public Optional<PaymentDestinationOptions> getPaymentDestinationOptions() {
        return paymentDestinationOptions;
    }

    @JsonProperty("fees")
    @java.lang.Override
    public Optional<InvoiceFeesResponse> getFees() {
        return fees;
    }

    @JsonProperty("createdAt")
    @java.lang.Override
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updatedAt")
    @java.lang.Override
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @return Invoices associated with this transaction
     */
    @JsonProperty("invoices")
    public List<InvoiceResponse> getInvoices() {
        return invoices;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TransactionResponseBankToBankWithInvoices
                && equalTo((TransactionResponseBankToBankWithInvoices) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TransactionResponseBankToBankWithInvoices other) {
        return failureReason.equals(other.failureReason)
                && id.equals(other.id)
                && status.equals(other.status)
                && amount == other.amount
                && currency.equals(other.currency)
                && payerId.equals(other.payerId)
                && payer.equals(other.payer)
                && paymentSource.equals(other.paymentSource)
                && paymentSourceId.equals(other.paymentSourceId)
                && vendorId.equals(other.vendorId)
                && vendor.equals(other.vendor)
                && paymentDestination.equals(other.paymentDestination)
                && paymentDestinationId.equals(other.paymentDestinationId)
                && paymentDestinationOptions.equals(other.paymentDestinationOptions)
                && fees.equals(other.fees)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && invoices.equals(other.invoices);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.failureReason,
                this.id,
                this.status,
                this.amount,
                this.currency,
                this.payerId,
                this.payer,
                this.paymentSource,
                this.paymentSourceId,
                this.vendorId,
                this.vendor,
                this.paymentDestination,
                this.paymentDestinationId,
                this.paymentDestinationOptions,
                this.fees,
                this.createdAt,
                this.updatedAt,
                this.invoices);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        StatusStage id(String id);

        Builder from(TransactionResponseBankToBankWithInvoices other);
    }

    public interface StatusStage {
        AmountStage status(TransactionStatus status);
    }

    public interface AmountStage {
        CurrencyStage amount(int amount);
    }

    public interface CurrencyStage {
        PayerIdStage currency(String currency);
    }

    public interface PayerIdStage {
        PayerStage payerId(String payerId);
    }

    public interface PayerStage {
        PaymentSourceStage payer(CounterpartyResponse payer);
    }

    public interface PaymentSourceStage {
        PaymentSourceIdStage paymentSource(PaymentMethodResponse paymentSource);
    }

    public interface PaymentSourceIdStage {
        VendorIdStage paymentSourceId(String paymentSourceId);
    }

    public interface VendorIdStage {
        VendorStage vendorId(String vendorId);
    }

    public interface VendorStage {
        PaymentDestinationStage vendor(CounterpartyResponse vendor);
    }

    public interface PaymentDestinationStage {
        PaymentDestinationIdStage paymentDestination(PaymentMethodResponse paymentDestination);
    }

    public interface PaymentDestinationIdStage {
        CreatedAtStage paymentDestinationId(String paymentDestinationId);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        TransactionResponseBankToBankWithInvoices build();

        _FinalStage failureReason(Optional<TransactionFailureReason> failureReason);

        _FinalStage failureReason(TransactionFailureReason failureReason);

        _FinalStage paymentDestinationOptions(Optional<PaymentDestinationOptions> paymentDestinationOptions);

        _FinalStage paymentDestinationOptions(PaymentDestinationOptions paymentDestinationOptions);

        _FinalStage fees(Optional<InvoiceFeesResponse> fees);

        _FinalStage fees(InvoiceFeesResponse fees);

        _FinalStage invoices(List<InvoiceResponse> invoices);

        _FinalStage addInvoices(InvoiceResponse invoices);

        _FinalStage addAllInvoices(List<InvoiceResponse> invoices);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    StatusStage,
                    AmountStage,
                    CurrencyStage,
                    PayerIdStage,
                    PayerStage,
                    PaymentSourceStage,
                    PaymentSourceIdStage,
                    VendorIdStage,
                    VendorStage,
                    PaymentDestinationStage,
                    PaymentDestinationIdStage,
                    CreatedAtStage,
                    UpdatedAtStage,
                    _FinalStage {
        private String id;

        private TransactionStatus status;

        private int amount;

        private String currency;

        private String payerId;

        private CounterpartyResponse payer;

        private PaymentMethodResponse paymentSource;

        private String paymentSourceId;

        private String vendorId;

        private CounterpartyResponse vendor;

        private PaymentMethodResponse paymentDestination;

        private String paymentDestinationId;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private List<InvoiceResponse> invoices = new ArrayList<>();

        private Optional<InvoiceFeesResponse> fees = Optional.empty();

        private Optional<PaymentDestinationOptions> paymentDestinationOptions = Optional.empty();

        private Optional<TransactionFailureReason> failureReason = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TransactionResponseBankToBankWithInvoices other) {
            failureReason(other.getFailureReason());
            id(other.getId());
            status(other.getStatus());
            amount(other.getAmount());
            currency(other.getCurrency());
            payerId(other.getPayerId());
            payer(other.getPayer());
            paymentSource(other.getPaymentSource());
            paymentSourceId(other.getPaymentSourceId());
            vendorId(other.getVendorId());
            vendor(other.getVendor());
            paymentDestination(other.getPaymentDestination());
            paymentDestinationId(other.getPaymentDestinationId());
            paymentDestinationOptions(other.getPaymentDestinationOptions());
            fees(other.getFees());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            invoices(other.getInvoices());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public StatusStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("status")
        public AmountStage status(TransactionStatus status) {
            this.status = status;
            return this;
        }

        @java.lang.Override
        @JsonSetter("amount")
        public CurrencyStage amount(int amount) {
            this.amount = amount;
            return this;
        }

        @java.lang.Override
        @JsonSetter("currency")
        public PayerIdStage currency(String currency) {
            this.currency = currency;
            return this;
        }

        @java.lang.Override
        @JsonSetter("payerId")
        public PayerStage payerId(String payerId) {
            this.payerId = payerId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("payer")
        public PaymentSourceStage payer(CounterpartyResponse payer) {
            this.payer = payer;
            return this;
        }

        @java.lang.Override
        @JsonSetter("paymentSource")
        public PaymentSourceIdStage paymentSource(PaymentMethodResponse paymentSource) {
            this.paymentSource = paymentSource;
            return this;
        }

        @java.lang.Override
        @JsonSetter("paymentSourceId")
        public VendorIdStage paymentSourceId(String paymentSourceId) {
            this.paymentSourceId = paymentSourceId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("vendorId")
        public VendorStage vendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("vendor")
        public PaymentDestinationStage vendor(CounterpartyResponse vendor) {
            this.vendor = vendor;
            return this;
        }

        @java.lang.Override
        @JsonSetter("paymentDestination")
        public PaymentDestinationIdStage paymentDestination(PaymentMethodResponse paymentDestination) {
            this.paymentDestination = paymentDestination;
            return this;
        }

        @java.lang.Override
        @JsonSetter("paymentDestinationId")
        public CreatedAtStage paymentDestinationId(String paymentDestinationId) {
            this.paymentDestinationId = paymentDestinationId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>Invoices associated with this transaction</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllInvoices(List<InvoiceResponse> invoices) {
            this.invoices.addAll(invoices);
            return this;
        }

        /**
         * <p>Invoices associated with this transaction</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addInvoices(InvoiceResponse invoices) {
            this.invoices.add(invoices);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "invoices", nulls = Nulls.SKIP)
        public _FinalStage invoices(List<InvoiceResponse> invoices) {
            this.invoices.clear();
            this.invoices.addAll(invoices);
            return this;
        }

        @java.lang.Override
        public _FinalStage fees(InvoiceFeesResponse fees) {
            this.fees = Optional.ofNullable(fees);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "fees", nulls = Nulls.SKIP)
        public _FinalStage fees(Optional<InvoiceFeesResponse> fees) {
            this.fees = fees;
            return this;
        }

        @java.lang.Override
        public _FinalStage paymentDestinationOptions(PaymentDestinationOptions paymentDestinationOptions) {
            this.paymentDestinationOptions = Optional.ofNullable(paymentDestinationOptions);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "paymentDestinationOptions", nulls = Nulls.SKIP)
        public _FinalStage paymentDestinationOptions(Optional<PaymentDestinationOptions> paymentDestinationOptions) {
            this.paymentDestinationOptions = paymentDestinationOptions;
            return this;
        }

        /**
         * <p>If the invoice failed to be paid, this field will be populated with the reason of failure.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage failureReason(TransactionFailureReason failureReason) {
            this.failureReason = Optional.ofNullable(failureReason);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "failureReason", nulls = Nulls.SKIP)
        public _FinalStage failureReason(Optional<TransactionFailureReason> failureReason) {
            this.failureReason = failureReason;
            return this;
        }

        @java.lang.Override
        public TransactionResponseBankToBankWithInvoices build() {
            return new TransactionResponseBankToBankWithInvoices(
                    failureReason,
                    id,
                    status,
                    amount,
                    currency,
                    payerId,
                    payer,
                    paymentSource,
                    paymentSourceId,
                    vendorId,
                    vendor,
                    paymentDestination,
                    paymentDestinationId,
                    paymentDestinationOptions,
                    fees,
                    createdAt,
                    updatedAt,
                    invoices,
                    additionalProperties);
        }
    }
}
