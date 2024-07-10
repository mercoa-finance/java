/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.paymentmethodtypes.types.CurrencyCode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = InvoiceRequestBase.Builder.class)
public final class InvoiceRequestBase implements IInvoiceRequestBase {
    private final Optional<InvoiceStatus> status;

    private final Optional<Double> amount;

    private final Optional<CurrencyCode> currency;

    private final Optional<OffsetDateTime> invoiceDate;

    private final Optional<OffsetDateTime> deductionDate;

    private final Optional<OffsetDateTime> settlementDate;

    private final Optional<OffsetDateTime> dueDate;

    private final Optional<String> invoiceNumber;

    private final Optional<String> noteToSelf;

    private final Optional<OffsetDateTime> serviceStartDate;

    private final Optional<OffsetDateTime> serviceEndDate;

    private final Optional<String> payerId;

    private final Optional<String> paymentSourceId;

    private final Optional<String> vendorId;

    private final Optional<String> paymentDestinationId;

    private final Optional<PaymentDestinationOptions> paymentDestinationOptions;

    private final Optional<List<ApprovalSlotAssignment>> approvers;

    private final Optional<List<InvoiceLineItemRequest>> lineItems;

    private final Optional<Map<String, String>> metadata;

    private final Optional<String> foreignId;

    private final Optional<String> document;

    private final Optional<String> uploadedImage;

    private final Optional<String> creatorUserId;

    private final Optional<InvoiceFailureType> failureType;

    private final Optional<InvoiceFeesRequest> fees;

    private final Map<String, Object> additionalProperties;

    private InvoiceRequestBase(
            Optional<InvoiceStatus> status,
            Optional<Double> amount,
            Optional<CurrencyCode> currency,
            Optional<OffsetDateTime> invoiceDate,
            Optional<OffsetDateTime> deductionDate,
            Optional<OffsetDateTime> settlementDate,
            Optional<OffsetDateTime> dueDate,
            Optional<String> invoiceNumber,
            Optional<String> noteToSelf,
            Optional<OffsetDateTime> serviceStartDate,
            Optional<OffsetDateTime> serviceEndDate,
            Optional<String> payerId,
            Optional<String> paymentSourceId,
            Optional<String> vendorId,
            Optional<String> paymentDestinationId,
            Optional<PaymentDestinationOptions> paymentDestinationOptions,
            Optional<List<ApprovalSlotAssignment>> approvers,
            Optional<List<InvoiceLineItemRequest>> lineItems,
            Optional<Map<String, String>> metadata,
            Optional<String> foreignId,
            Optional<String> document,
            Optional<String> uploadedImage,
            Optional<String> creatorUserId,
            Optional<InvoiceFailureType> failureType,
            Optional<InvoiceFeesRequest> fees,
            Map<String, Object> additionalProperties) {
        this.status = status;
        this.amount = amount;
        this.currency = currency;
        this.invoiceDate = invoiceDate;
        this.deductionDate = deductionDate;
        this.settlementDate = settlementDate;
        this.dueDate = dueDate;
        this.invoiceNumber = invoiceNumber;
        this.noteToSelf = noteToSelf;
        this.serviceStartDate = serviceStartDate;
        this.serviceEndDate = serviceEndDate;
        this.payerId = payerId;
        this.paymentSourceId = paymentSourceId;
        this.vendorId = vendorId;
        this.paymentDestinationId = paymentDestinationId;
        this.paymentDestinationOptions = paymentDestinationOptions;
        this.approvers = approvers;
        this.lineItems = lineItems;
        this.metadata = metadata;
        this.foreignId = foreignId;
        this.document = document;
        this.uploadedImage = uploadedImage;
        this.creatorUserId = creatorUserId;
        this.failureType = failureType;
        this.fees = fees;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("status")
    @java.lang.Override
    public Optional<InvoiceStatus> getStatus() {
        return status;
    }

    /**
     * @return Total amount of invoice in major units. If the entered amount has more decimal places than the currency supports, trailing decimals will be truncated.
     */
    @JsonProperty("amount")
    @java.lang.Override
    public Optional<Double> getAmount() {
        return amount;
    }

    /**
     * @return Currency code for the amount. Defaults to USD.
     */
    @JsonProperty("currency")
    @java.lang.Override
    public Optional<CurrencyCode> getCurrency() {
        return currency;
    }

    /**
     * @return Date the invoice was issued.
     */
    @JsonProperty("invoiceDate")
    @java.lang.Override
    public Optional<OffsetDateTime> getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * @return Date when funds are scheduled to be deducted from payer's account.
     */
    @JsonProperty("deductionDate")
    @java.lang.Override
    public Optional<OffsetDateTime> getDeductionDate() {
        return deductionDate;
    }

    /**
     * @return Date of funds settlement.
     */
    @JsonProperty("settlementDate")
    @java.lang.Override
    public Optional<OffsetDateTime> getSettlementDate() {
        return settlementDate;
    }

    /**
     * @return Due date of invoice.
     */
    @JsonProperty("dueDate")
    @java.lang.Override
    public Optional<OffsetDateTime> getDueDate() {
        return dueDate;
    }

    @JsonProperty("invoiceNumber")
    @java.lang.Override
    public Optional<String> getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * @return Note to self or memo on invoice.
     */
    @JsonProperty("noteToSelf")
    @java.lang.Override
    public Optional<String> getNoteToSelf() {
        return noteToSelf;
    }

    @JsonProperty("serviceStartDate")
    @java.lang.Override
    public Optional<OffsetDateTime> getServiceStartDate() {
        return serviceStartDate;
    }

    @JsonProperty("serviceEndDate")
    @java.lang.Override
    public Optional<OffsetDateTime> getServiceEndDate() {
        return serviceEndDate;
    }

    @JsonProperty("payerId")
    @java.lang.Override
    public Optional<String> getPayerId() {
        return payerId;
    }

    /**
     * @return ID of payment source for this invoice. If not provided, will attempt to use the default payment source for the payer when creating an invoice if a default payment source exists for the payer.
     */
    @JsonProperty("paymentSourceId")
    @java.lang.Override
    public Optional<String> getPaymentSourceId() {
        return paymentSourceId;
    }

    @JsonProperty("vendorId")
    @java.lang.Override
    public Optional<String> getVendorId() {
        return vendorId;
    }

    /**
     * @return ID of payment destination for this invoice. If not provided, will attempt to use the default payment destination for the vendor when creating an invoice if a default payment destination exists for the vendor.
     */
    @JsonProperty("paymentDestinationId")
    @java.lang.Override
    public Optional<String> getPaymentDestinationId() {
        return paymentDestinationId;
    }

    /**
     * @return Options for the payment destination. Depending on the payment destination, this may include things such as check delivery method.
     */
    @JsonProperty("paymentDestinationOptions")
    @java.lang.Override
    public Optional<PaymentDestinationOptions> getPaymentDestinationOptions() {
        return paymentDestinationOptions;
    }

    /**
     * @return Set approvers for this invoice.
     */
    @JsonProperty("approvers")
    @java.lang.Override
    public Optional<List<ApprovalSlotAssignment>> getApprovers() {
        return approvers;
    }

    @JsonProperty("lineItems")
    @java.lang.Override
    public Optional<List<InvoiceLineItemRequest>> getLineItems() {
        return lineItems;
    }

    /**
     * @return Metadata associated with this invoice. You can specify up to 10 keys, with key names up to 40 characters long and values up to 200 characters long.
     */
    @JsonProperty("metadata")
    @java.lang.Override
    public Optional<Map<String, String>> getMetadata() {
        return metadata;
    }

    /**
     * @return The ID used to identify this invoice in your system. This ID must be unique within each creatorEntity in your system, e.g. two invoices with the same creatorEntity may not have the same foreign ID.
     */
    @JsonProperty("foreignId")
    @java.lang.Override
    public Optional<String> getForeignId() {
        return foreignId;
    }

    /**
     * @return Base64 encoded image or PDF of invoice document. PNG, JPG, WEBP, and PDF are supported. 10MB max. If the invoice already has a document, this will add a new document to the invoice.
     */
    @JsonProperty("document")
    @java.lang.Override
    public Optional<String> getDocument() {
        return document;
    }

    /**
     * @return DEPRECATED. Use document field instead.
     */
    @JsonProperty("uploadedImage")
    @java.lang.Override
    public Optional<String> getUploadedImage() {
        return uploadedImage;
    }

    /**
     * @return ID of entity user who created this invoice.
     */
    @JsonProperty("creatorUserId")
    @java.lang.Override
    public Optional<String> getCreatorUserId() {
        return creatorUserId;
    }

    /**
     * @return If the invoice failed to be paid, indicate the failure reason. Only applicable for invoices with custom payment methods.
     */
    @JsonProperty("failureType")
    @java.lang.Override
    public Optional<InvoiceFailureType> getFailureType() {
        return failureType;
    }

    /**
     * @return If using a custom payment method, you can override the default fees for this invoice. If not provided, the default fees for the custom payment method will be used.
     */
    @JsonProperty("fees")
    @java.lang.Override
    public Optional<InvoiceFeesRequest> getFees() {
        return fees;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof InvoiceRequestBase && equalTo((InvoiceRequestBase) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(InvoiceRequestBase other) {
        return status.equals(other.status)
                && amount.equals(other.amount)
                && currency.equals(other.currency)
                && invoiceDate.equals(other.invoiceDate)
                && deductionDate.equals(other.deductionDate)
                && settlementDate.equals(other.settlementDate)
                && dueDate.equals(other.dueDate)
                && invoiceNumber.equals(other.invoiceNumber)
                && noteToSelf.equals(other.noteToSelf)
                && serviceStartDate.equals(other.serviceStartDate)
                && serviceEndDate.equals(other.serviceEndDate)
                && payerId.equals(other.payerId)
                && paymentSourceId.equals(other.paymentSourceId)
                && vendorId.equals(other.vendorId)
                && paymentDestinationId.equals(other.paymentDestinationId)
                && paymentDestinationOptions.equals(other.paymentDestinationOptions)
                && approvers.equals(other.approvers)
                && lineItems.equals(other.lineItems)
                && metadata.equals(other.metadata)
                && foreignId.equals(other.foreignId)
                && document.equals(other.document)
                && uploadedImage.equals(other.uploadedImage)
                && creatorUserId.equals(other.creatorUserId)
                && failureType.equals(other.failureType)
                && fees.equals(other.fees);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.status,
                this.amount,
                this.currency,
                this.invoiceDate,
                this.deductionDate,
                this.settlementDate,
                this.dueDate,
                this.invoiceNumber,
                this.noteToSelf,
                this.serviceStartDate,
                this.serviceEndDate,
                this.payerId,
                this.paymentSourceId,
                this.vendorId,
                this.paymentDestinationId,
                this.paymentDestinationOptions,
                this.approvers,
                this.lineItems,
                this.metadata,
                this.foreignId,
                this.document,
                this.uploadedImage,
                this.creatorUserId,
                this.failureType,
                this.fees);
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
        private Optional<InvoiceStatus> status = Optional.empty();

        private Optional<Double> amount = Optional.empty();

        private Optional<CurrencyCode> currency = Optional.empty();

        private Optional<OffsetDateTime> invoiceDate = Optional.empty();

        private Optional<OffsetDateTime> deductionDate = Optional.empty();

        private Optional<OffsetDateTime> settlementDate = Optional.empty();

        private Optional<OffsetDateTime> dueDate = Optional.empty();

        private Optional<String> invoiceNumber = Optional.empty();

        private Optional<String> noteToSelf = Optional.empty();

        private Optional<OffsetDateTime> serviceStartDate = Optional.empty();

        private Optional<OffsetDateTime> serviceEndDate = Optional.empty();

        private Optional<String> payerId = Optional.empty();

        private Optional<String> paymentSourceId = Optional.empty();

        private Optional<String> vendorId = Optional.empty();

        private Optional<String> paymentDestinationId = Optional.empty();

        private Optional<PaymentDestinationOptions> paymentDestinationOptions = Optional.empty();

        private Optional<List<ApprovalSlotAssignment>> approvers = Optional.empty();

        private Optional<List<InvoiceLineItemRequest>> lineItems = Optional.empty();

        private Optional<Map<String, String>> metadata = Optional.empty();

        private Optional<String> foreignId = Optional.empty();

        private Optional<String> document = Optional.empty();

        private Optional<String> uploadedImage = Optional.empty();

        private Optional<String> creatorUserId = Optional.empty();

        private Optional<InvoiceFailureType> failureType = Optional.empty();

        private Optional<InvoiceFeesRequest> fees = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(InvoiceRequestBase other) {
            status(other.getStatus());
            amount(other.getAmount());
            currency(other.getCurrency());
            invoiceDate(other.getInvoiceDate());
            deductionDate(other.getDeductionDate());
            settlementDate(other.getSettlementDate());
            dueDate(other.getDueDate());
            invoiceNumber(other.getInvoiceNumber());
            noteToSelf(other.getNoteToSelf());
            serviceStartDate(other.getServiceStartDate());
            serviceEndDate(other.getServiceEndDate());
            payerId(other.getPayerId());
            paymentSourceId(other.getPaymentSourceId());
            vendorId(other.getVendorId());
            paymentDestinationId(other.getPaymentDestinationId());
            paymentDestinationOptions(other.getPaymentDestinationOptions());
            approvers(other.getApprovers());
            lineItems(other.getLineItems());
            metadata(other.getMetadata());
            foreignId(other.getForeignId());
            document(other.getDocument());
            uploadedImage(other.getUploadedImage());
            creatorUserId(other.getCreatorUserId());
            failureType(other.getFailureType());
            fees(other.getFees());
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<InvoiceStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(InvoiceStatus status) {
            this.status = Optional.of(status);
            return this;
        }

        @JsonSetter(value = "amount", nulls = Nulls.SKIP)
        public Builder amount(Optional<Double> amount) {
            this.amount = amount;
            return this;
        }

        public Builder amount(Double amount) {
            this.amount = Optional.of(amount);
            return this;
        }

        @JsonSetter(value = "currency", nulls = Nulls.SKIP)
        public Builder currency(Optional<CurrencyCode> currency) {
            this.currency = currency;
            return this;
        }

        public Builder currency(CurrencyCode currency) {
            this.currency = Optional.of(currency);
            return this;
        }

        @JsonSetter(value = "invoiceDate", nulls = Nulls.SKIP)
        public Builder invoiceDate(Optional<OffsetDateTime> invoiceDate) {
            this.invoiceDate = invoiceDate;
            return this;
        }

        public Builder invoiceDate(OffsetDateTime invoiceDate) {
            this.invoiceDate = Optional.of(invoiceDate);
            return this;
        }

        @JsonSetter(value = "deductionDate", nulls = Nulls.SKIP)
        public Builder deductionDate(Optional<OffsetDateTime> deductionDate) {
            this.deductionDate = deductionDate;
            return this;
        }

        public Builder deductionDate(OffsetDateTime deductionDate) {
            this.deductionDate = Optional.of(deductionDate);
            return this;
        }

        @JsonSetter(value = "settlementDate", nulls = Nulls.SKIP)
        public Builder settlementDate(Optional<OffsetDateTime> settlementDate) {
            this.settlementDate = settlementDate;
            return this;
        }

        public Builder settlementDate(OffsetDateTime settlementDate) {
            this.settlementDate = Optional.of(settlementDate);
            return this;
        }

        @JsonSetter(value = "dueDate", nulls = Nulls.SKIP)
        public Builder dueDate(Optional<OffsetDateTime> dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Builder dueDate(OffsetDateTime dueDate) {
            this.dueDate = Optional.of(dueDate);
            return this;
        }

        @JsonSetter(value = "invoiceNumber", nulls = Nulls.SKIP)
        public Builder invoiceNumber(Optional<String> invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
            return this;
        }

        public Builder invoiceNumber(String invoiceNumber) {
            this.invoiceNumber = Optional.of(invoiceNumber);
            return this;
        }

        @JsonSetter(value = "noteToSelf", nulls = Nulls.SKIP)
        public Builder noteToSelf(Optional<String> noteToSelf) {
            this.noteToSelf = noteToSelf;
            return this;
        }

        public Builder noteToSelf(String noteToSelf) {
            this.noteToSelf = Optional.of(noteToSelf);
            return this;
        }

        @JsonSetter(value = "serviceStartDate", nulls = Nulls.SKIP)
        public Builder serviceStartDate(Optional<OffsetDateTime> serviceStartDate) {
            this.serviceStartDate = serviceStartDate;
            return this;
        }

        public Builder serviceStartDate(OffsetDateTime serviceStartDate) {
            this.serviceStartDate = Optional.of(serviceStartDate);
            return this;
        }

        @JsonSetter(value = "serviceEndDate", nulls = Nulls.SKIP)
        public Builder serviceEndDate(Optional<OffsetDateTime> serviceEndDate) {
            this.serviceEndDate = serviceEndDate;
            return this;
        }

        public Builder serviceEndDate(OffsetDateTime serviceEndDate) {
            this.serviceEndDate = Optional.of(serviceEndDate);
            return this;
        }

        @JsonSetter(value = "payerId", nulls = Nulls.SKIP)
        public Builder payerId(Optional<String> payerId) {
            this.payerId = payerId;
            return this;
        }

        public Builder payerId(String payerId) {
            this.payerId = Optional.of(payerId);
            return this;
        }

        @JsonSetter(value = "paymentSourceId", nulls = Nulls.SKIP)
        public Builder paymentSourceId(Optional<String> paymentSourceId) {
            this.paymentSourceId = paymentSourceId;
            return this;
        }

        public Builder paymentSourceId(String paymentSourceId) {
            this.paymentSourceId = Optional.of(paymentSourceId);
            return this;
        }

        @JsonSetter(value = "vendorId", nulls = Nulls.SKIP)
        public Builder vendorId(Optional<String> vendorId) {
            this.vendorId = vendorId;
            return this;
        }

        public Builder vendorId(String vendorId) {
            this.vendorId = Optional.of(vendorId);
            return this;
        }

        @JsonSetter(value = "paymentDestinationId", nulls = Nulls.SKIP)
        public Builder paymentDestinationId(Optional<String> paymentDestinationId) {
            this.paymentDestinationId = paymentDestinationId;
            return this;
        }

        public Builder paymentDestinationId(String paymentDestinationId) {
            this.paymentDestinationId = Optional.of(paymentDestinationId);
            return this;
        }

        @JsonSetter(value = "paymentDestinationOptions", nulls = Nulls.SKIP)
        public Builder paymentDestinationOptions(Optional<PaymentDestinationOptions> paymentDestinationOptions) {
            this.paymentDestinationOptions = paymentDestinationOptions;
            return this;
        }

        public Builder paymentDestinationOptions(PaymentDestinationOptions paymentDestinationOptions) {
            this.paymentDestinationOptions = Optional.of(paymentDestinationOptions);
            return this;
        }

        @JsonSetter(value = "approvers", nulls = Nulls.SKIP)
        public Builder approvers(Optional<List<ApprovalSlotAssignment>> approvers) {
            this.approvers = approvers;
            return this;
        }

        public Builder approvers(List<ApprovalSlotAssignment> approvers) {
            this.approvers = Optional.of(approvers);
            return this;
        }

        @JsonSetter(value = "lineItems", nulls = Nulls.SKIP)
        public Builder lineItems(Optional<List<InvoiceLineItemRequest>> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        public Builder lineItems(List<InvoiceLineItemRequest> lineItems) {
            this.lineItems = Optional.of(lineItems);
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<Map<String, String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String, String> metadata) {
            this.metadata = Optional.of(metadata);
            return this;
        }

        @JsonSetter(value = "foreignId", nulls = Nulls.SKIP)
        public Builder foreignId(Optional<String> foreignId) {
            this.foreignId = foreignId;
            return this;
        }

        public Builder foreignId(String foreignId) {
            this.foreignId = Optional.of(foreignId);
            return this;
        }

        @JsonSetter(value = "document", nulls = Nulls.SKIP)
        public Builder document(Optional<String> document) {
            this.document = document;
            return this;
        }

        public Builder document(String document) {
            this.document = Optional.of(document);
            return this;
        }

        @JsonSetter(value = "uploadedImage", nulls = Nulls.SKIP)
        public Builder uploadedImage(Optional<String> uploadedImage) {
            this.uploadedImage = uploadedImage;
            return this;
        }

        public Builder uploadedImage(String uploadedImage) {
            this.uploadedImage = Optional.of(uploadedImage);
            return this;
        }

        @JsonSetter(value = "creatorUserId", nulls = Nulls.SKIP)
        public Builder creatorUserId(Optional<String> creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }

        public Builder creatorUserId(String creatorUserId) {
            this.creatorUserId = Optional.of(creatorUserId);
            return this;
        }

        @JsonSetter(value = "failureType", nulls = Nulls.SKIP)
        public Builder failureType(Optional<InvoiceFailureType> failureType) {
            this.failureType = failureType;
            return this;
        }

        public Builder failureType(InvoiceFailureType failureType) {
            this.failureType = Optional.of(failureType);
            return this;
        }

        @JsonSetter(value = "fees", nulls = Nulls.SKIP)
        public Builder fees(Optional<InvoiceFeesRequest> fees) {
            this.fees = fees;
            return this;
        }

        public Builder fees(InvoiceFeesRequest fees) {
            this.fees = Optional.of(fees);
            return this;
        }

        public InvoiceRequestBase build() {
            return new InvoiceRequestBase(
                    status,
                    amount,
                    currency,
                    invoiceDate,
                    deductionDate,
                    settlementDate,
                    dueDate,
                    invoiceNumber,
                    noteToSelf,
                    serviceStartDate,
                    serviceEndDate,
                    payerId,
                    paymentSourceId,
                    vendorId,
                    paymentDestinationId,
                    paymentDestinationOptions,
                    approvers,
                    lineItems,
                    metadata,
                    foreignId,
                    document,
                    uploadedImage,
                    creatorUserId,
                    failureType,
                    fees,
                    additionalProperties);
        }
    }
}
