/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitygroup.invoice.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.commons.types.OrderDirection;
import com.mercoa.api.resources.invoicetypes.types.ApproverAction;
import com.mercoa.api.resources.invoicetypes.types.InvoiceDateFilter;
import com.mercoa.api.resources.invoicetypes.types.InvoiceMetadataFilter;
import com.mercoa.api.resources.invoicetypes.types.InvoiceOrderByField;
import com.mercoa.api.resources.invoicetypes.types.InvoiceStatus;
import com.mercoa.api.resources.invoicetypes.types.PaymentType;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = EntityGetInvoicesRequest.Builder.class)
public final class EntityGetInvoicesRequest {
    private final Optional<Boolean> excludePayables;

    private final Optional<Boolean> excludeReceivables;

    private final Optional<OffsetDateTime> startDate;

    private final Optional<OffsetDateTime> endDate;

    private final Optional<InvoiceDateFilter> dateType;

    private final Optional<InvoiceOrderByField> orderBy;

    private final Optional<OrderDirection> orderDirection;

    private final Optional<Integer> limit;

    private final Optional<String> startingAfter;

    private final Optional<InvoiceMetadataFilter> metadata;

    private final Optional<String> search;

    private final Optional<String> payerId;

    private final Optional<String> vendorId;

    private final Optional<String> approverId;

    private final Optional<ApproverAction> approverAction;

    private final Optional<String> invoiceId;

    private final Optional<InvoiceStatus> status;

    private final Optional<List<PaymentType>> paymentType;

    private final Map<String, Object> additionalProperties;

    private EntityGetInvoicesRequest(
            Optional<Boolean> excludePayables,
            Optional<Boolean> excludeReceivables,
            Optional<OffsetDateTime> startDate,
            Optional<OffsetDateTime> endDate,
            Optional<InvoiceDateFilter> dateType,
            Optional<InvoiceOrderByField> orderBy,
            Optional<OrderDirection> orderDirection,
            Optional<Integer> limit,
            Optional<String> startingAfter,
            Optional<InvoiceMetadataFilter> metadata,
            Optional<String> search,
            Optional<String> payerId,
            Optional<String> vendorId,
            Optional<String> approverId,
            Optional<ApproverAction> approverAction,
            Optional<String> invoiceId,
            Optional<InvoiceStatus> status,
            Optional<List<PaymentType>> paymentType,
            Map<String, Object> additionalProperties) {
        this.excludePayables = excludePayables;
        this.excludeReceivables = excludeReceivables;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dateType = dateType;
        this.orderBy = orderBy;
        this.orderDirection = orderDirection;
        this.limit = limit;
        this.startingAfter = startingAfter;
        this.metadata = metadata;
        this.search = search;
        this.payerId = payerId;
        this.vendorId = vendorId;
        this.approverId = approverId;
        this.approverAction = approverAction;
        this.invoiceId = invoiceId;
        this.status = status;
        this.paymentType = paymentType;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Return only invoices that are receivable by the entity.
     */
    @JsonProperty("excludePayables")
    public Optional<Boolean> getExcludePayables() {
        return excludePayables;
    }

    /**
     * @return Return only invoices that are payable by the entity.
     */
    @JsonProperty("excludeReceivables")
    public Optional<Boolean> getExcludeReceivables() {
        return excludeReceivables;
    }

    /**
     * @return Start date for invoice created on date filter.
     */
    @JsonProperty("startDate")
    public Optional<OffsetDateTime> getStartDate() {
        return startDate;
    }

    /**
     * @return End date for invoice created date filter.
     */
    @JsonProperty("endDate")
    public Optional<OffsetDateTime> getEndDate() {
        return endDate;
    }

    /**
     * @return Type of date to filter by if startDate and endDate filters are provided. Defaults to CREATED_AT.
     */
    @JsonProperty("dateType")
    public Optional<InvoiceDateFilter> getDateType() {
        return dateType;
    }

    /**
     * @return Field to order invoices by. Defaults to CREATED_AT.
     */
    @JsonProperty("orderBy")
    public Optional<InvoiceOrderByField> getOrderBy() {
        return orderBy;
    }

    /**
     * @return Direction to order invoices by. Defaults to asc.
     */
    @JsonProperty("orderDirection")
    public Optional<OrderDirection> getOrderDirection() {
        return orderDirection;
    }

    /**
     * @return Number of invoices to return. Limit can range between 1 and 100, and the default is 10.
     */
    @JsonProperty("limit")
    public Optional<Integer> getLimit() {
        return limit;
    }

    /**
     * @return The ID of the invoice to start after. If not provided, the first page of invoices will be returned.
     */
    @JsonProperty("startingAfter")
    public Optional<String> getStartingAfter() {
        return startingAfter;
    }

    /**
     * @return Filter invoices by metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
     */
    @JsonProperty("metadata")
    public Optional<InvoiceMetadataFilter> getMetadata() {
        return metadata;
    }

    /**
     * @return Find invoices by vendor name, invoice number, or amount. Partial matches are supported.
     */
    @JsonProperty("search")
    public Optional<String> getSearch() {
        return search;
    }

    /**
     * @return Filter invoices by payer ID.
     */
    @JsonProperty("payerId")
    public Optional<String> getPayerId() {
        return payerId;
    }

    /**
     * @return Filter invoices by vendor ID.
     */
    @JsonProperty("vendorId")
    public Optional<String> getVendorId() {
        return vendorId;
    }

    /**
     * @return Filter invoices by assigned approver user ID.
     */
    @JsonProperty("approverId")
    public Optional<String> getApproverId() {
        return approverId;
    }

    /**
     * @return Filter invoices by approver action. Needs to be used with approverId. For example, if you want to find all invoices that have been approved by a specific user, you would use approverId and approverAction=APPROVE.
     */
    @JsonProperty("approverAction")
    public Optional<ApproverAction> getApproverAction() {
        return approverAction;
    }

    /**
     * @return Filter invoices by invoice ID.
     */
    @JsonProperty("invoiceId")
    public Optional<String> getInvoiceId() {
        return invoiceId;
    }

    /**
     * @return Invoice status to filter on.
     */
    @JsonProperty("status")
    public Optional<InvoiceStatus> getStatus() {
        return status;
    }

    /**
     * @return Filter invoices by recurring status
     */
    @JsonProperty("paymentType")
    public Optional<List<PaymentType>> getPaymentType() {
        return paymentType;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityGetInvoicesRequest && equalTo((EntityGetInvoicesRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityGetInvoicesRequest other) {
        return excludePayables.equals(other.excludePayables)
                && excludeReceivables.equals(other.excludeReceivables)
                && startDate.equals(other.startDate)
                && endDate.equals(other.endDate)
                && dateType.equals(other.dateType)
                && orderBy.equals(other.orderBy)
                && orderDirection.equals(other.orderDirection)
                && limit.equals(other.limit)
                && startingAfter.equals(other.startingAfter)
                && metadata.equals(other.metadata)
                && search.equals(other.search)
                && payerId.equals(other.payerId)
                && vendorId.equals(other.vendorId)
                && approverId.equals(other.approverId)
                && approverAction.equals(other.approverAction)
                && invoiceId.equals(other.invoiceId)
                && status.equals(other.status)
                && paymentType.equals(other.paymentType);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.excludePayables,
                this.excludeReceivables,
                this.startDate,
                this.endDate,
                this.dateType,
                this.orderBy,
                this.orderDirection,
                this.limit,
                this.startingAfter,
                this.metadata,
                this.search,
                this.payerId,
                this.vendorId,
                this.approverId,
                this.approverAction,
                this.invoiceId,
                this.status,
                this.paymentType);
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
        private Optional<Boolean> excludePayables = Optional.empty();

        private Optional<Boolean> excludeReceivables = Optional.empty();

        private Optional<OffsetDateTime> startDate = Optional.empty();

        private Optional<OffsetDateTime> endDate = Optional.empty();

        private Optional<InvoiceDateFilter> dateType = Optional.empty();

        private Optional<InvoiceOrderByField> orderBy = Optional.empty();

        private Optional<OrderDirection> orderDirection = Optional.empty();

        private Optional<Integer> limit = Optional.empty();

        private Optional<String> startingAfter = Optional.empty();

        private Optional<InvoiceMetadataFilter> metadata = Optional.empty();

        private Optional<String> search = Optional.empty();

        private Optional<String> payerId = Optional.empty();

        private Optional<String> vendorId = Optional.empty();

        private Optional<String> approverId = Optional.empty();

        private Optional<ApproverAction> approverAction = Optional.empty();

        private Optional<String> invoiceId = Optional.empty();

        private Optional<InvoiceStatus> status = Optional.empty();

        private Optional<List<PaymentType>> paymentType = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EntityGetInvoicesRequest other) {
            excludePayables(other.getExcludePayables());
            excludeReceivables(other.getExcludeReceivables());
            startDate(other.getStartDate());
            endDate(other.getEndDate());
            dateType(other.getDateType());
            orderBy(other.getOrderBy());
            orderDirection(other.getOrderDirection());
            limit(other.getLimit());
            startingAfter(other.getStartingAfter());
            metadata(other.getMetadata());
            search(other.getSearch());
            payerId(other.getPayerId());
            vendorId(other.getVendorId());
            approverId(other.getApproverId());
            approverAction(other.getApproverAction());
            invoiceId(other.getInvoiceId());
            status(other.getStatus());
            paymentType(other.getPaymentType());
            return this;
        }

        @JsonSetter(value = "excludePayables", nulls = Nulls.SKIP)
        public Builder excludePayables(Optional<Boolean> excludePayables) {
            this.excludePayables = excludePayables;
            return this;
        }

        public Builder excludePayables(Boolean excludePayables) {
            this.excludePayables = Optional.ofNullable(excludePayables);
            return this;
        }

        @JsonSetter(value = "excludeReceivables", nulls = Nulls.SKIP)
        public Builder excludeReceivables(Optional<Boolean> excludeReceivables) {
            this.excludeReceivables = excludeReceivables;
            return this;
        }

        public Builder excludeReceivables(Boolean excludeReceivables) {
            this.excludeReceivables = Optional.ofNullable(excludeReceivables);
            return this;
        }

        @JsonSetter(value = "startDate", nulls = Nulls.SKIP)
        public Builder startDate(Optional<OffsetDateTime> startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        @JsonSetter(value = "endDate", nulls = Nulls.SKIP)
        public Builder endDate(Optional<OffsetDateTime> endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder endDate(OffsetDateTime endDate) {
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        @JsonSetter(value = "dateType", nulls = Nulls.SKIP)
        public Builder dateType(Optional<InvoiceDateFilter> dateType) {
            this.dateType = dateType;
            return this;
        }

        public Builder dateType(InvoiceDateFilter dateType) {
            this.dateType = Optional.ofNullable(dateType);
            return this;
        }

        @JsonSetter(value = "orderBy", nulls = Nulls.SKIP)
        public Builder orderBy(Optional<InvoiceOrderByField> orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Builder orderBy(InvoiceOrderByField orderBy) {
            this.orderBy = Optional.ofNullable(orderBy);
            return this;
        }

        @JsonSetter(value = "orderDirection", nulls = Nulls.SKIP)
        public Builder orderDirection(Optional<OrderDirection> orderDirection) {
            this.orderDirection = orderDirection;
            return this;
        }

        public Builder orderDirection(OrderDirection orderDirection) {
            this.orderDirection = Optional.ofNullable(orderDirection);
            return this;
        }

        @JsonSetter(value = "limit", nulls = Nulls.SKIP)
        public Builder limit(Optional<Integer> limit) {
            this.limit = limit;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        @JsonSetter(value = "startingAfter", nulls = Nulls.SKIP)
        public Builder startingAfter(Optional<String> startingAfter) {
            this.startingAfter = startingAfter;
            return this;
        }

        public Builder startingAfter(String startingAfter) {
            this.startingAfter = Optional.ofNullable(startingAfter);
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<InvoiceMetadataFilter> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(InvoiceMetadataFilter metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @JsonSetter(value = "search", nulls = Nulls.SKIP)
        public Builder search(Optional<String> search) {
            this.search = search;
            return this;
        }

        public Builder search(String search) {
            this.search = Optional.ofNullable(search);
            return this;
        }

        @JsonSetter(value = "payerId", nulls = Nulls.SKIP)
        public Builder payerId(Optional<String> payerId) {
            this.payerId = payerId;
            return this;
        }

        public Builder payerId(String payerId) {
            this.payerId = Optional.ofNullable(payerId);
            return this;
        }

        @JsonSetter(value = "vendorId", nulls = Nulls.SKIP)
        public Builder vendorId(Optional<String> vendorId) {
            this.vendorId = vendorId;
            return this;
        }

        public Builder vendorId(String vendorId) {
            this.vendorId = Optional.ofNullable(vendorId);
            return this;
        }

        @JsonSetter(value = "approverId", nulls = Nulls.SKIP)
        public Builder approverId(Optional<String> approverId) {
            this.approverId = approverId;
            return this;
        }

        public Builder approverId(String approverId) {
            this.approverId = Optional.ofNullable(approverId);
            return this;
        }

        @JsonSetter(value = "approverAction", nulls = Nulls.SKIP)
        public Builder approverAction(Optional<ApproverAction> approverAction) {
            this.approverAction = approverAction;
            return this;
        }

        public Builder approverAction(ApproverAction approverAction) {
            this.approverAction = Optional.ofNullable(approverAction);
            return this;
        }

        @JsonSetter(value = "invoiceId", nulls = Nulls.SKIP)
        public Builder invoiceId(Optional<String> invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public Builder invoiceId(String invoiceId) {
            this.invoiceId = Optional.ofNullable(invoiceId);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<InvoiceStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(InvoiceStatus status) {
            this.status = Optional.ofNullable(status);
            return this;
        }

        @JsonSetter(value = "paymentType", nulls = Nulls.SKIP)
        public Builder paymentType(Optional<List<PaymentType>> paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public Builder paymentType(List<PaymentType> paymentType) {
            this.paymentType = Optional.ofNullable(paymentType);
            return this;
        }

        public EntityGetInvoicesRequest build() {
            return new EntityGetInvoicesRequest(
                    excludePayables,
                    excludeReceivables,
                    startDate,
                    endDate,
                    dateType,
                    orderBy,
                    orderDirection,
                    limit,
                    startingAfter,
                    metadata,
                    search,
                    payerId,
                    vendorId,
                    approverId,
                    approverAction,
                    invoiceId,
                    status,
                    paymentType,
                    additionalProperties);
        }
    }
}
