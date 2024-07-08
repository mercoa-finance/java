/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoice.requests;

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
import com.mercoa.api.resources.invoicetypes.types.InvoiceMetadataFilter;
import com.mercoa.api.resources.invoicetypes.types.InvoiceOrderByField;
import com.mercoa.api.resources.invoicetypes.types.InvoiceStatus;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GetAllInvoicesRequest.Builder.class)
public final class GetAllInvoicesRequest {
    private final Optional<String> entityId;

    private final Optional<OffsetDateTime> startDate;

    private final Optional<OffsetDateTime> endDate;

    private final Optional<InvoiceOrderByField> orderBy;

    private final Optional<OrderDirection> orderDirection;

    private final Optional<Integer> limit;

    private final Optional<String> startingAfter;

    private final Optional<String> search;

    private final Optional<InvoiceMetadataFilter> metadata;

    private final Optional<String> payerId;

    private final Optional<String> vendorId;

    private final Optional<String> approverId;

    private final Optional<ApproverAction> approverAction;

    private final Optional<String> invoiceId;

    private final Optional<InvoiceStatus> status;

    private final Map<String, Object> additionalProperties;

    private GetAllInvoicesRequest(
            Optional<String> entityId,
            Optional<OffsetDateTime> startDate,
            Optional<OffsetDateTime> endDate,
            Optional<InvoiceOrderByField> orderBy,
            Optional<OrderDirection> orderDirection,
            Optional<Integer> limit,
            Optional<String> startingAfter,
            Optional<String> search,
            Optional<InvoiceMetadataFilter> metadata,
            Optional<String> payerId,
            Optional<String> vendorId,
            Optional<String> approverId,
            Optional<ApproverAction> approverAction,
            Optional<String> invoiceId,
            Optional<InvoiceStatus> status,
            Map<String, Object> additionalProperties) {
        this.entityId = entityId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.orderBy = orderBy;
        this.orderDirection = orderDirection;
        this.limit = limit;
        this.startingAfter = startingAfter;
        this.search = search;
        this.metadata = metadata;
        this.payerId = payerId;
        this.vendorId = vendorId;
        this.approverId = approverId;
        this.approverAction = approverAction;
        this.invoiceId = invoiceId;
        this.status = status;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Filter invoices by the ID of the entity that created the invoice.
     */
    @JsonProperty("entityId")
    public Optional<String> getEntityId() {
        return entityId;
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
     * @return Find invoices by vendor name, invoice number, or amount. Partial matches are supported.
     */
    @JsonProperty("search")
    public Optional<String> getSearch() {
        return search;
    }

    /**
     * @return Filter invoices by metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
     */
    @JsonProperty("metadata")
    public Optional<InvoiceMetadataFilter> getMetadata() {
        return metadata;
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
     * @return Invoice status to filter on
     */
    @JsonProperty("status")
    public Optional<InvoiceStatus> getStatus() {
        return status;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetAllInvoicesRequest && equalTo((GetAllInvoicesRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetAllInvoicesRequest other) {
        return entityId.equals(other.entityId)
                && startDate.equals(other.startDate)
                && endDate.equals(other.endDate)
                && orderBy.equals(other.orderBy)
                && orderDirection.equals(other.orderDirection)
                && limit.equals(other.limit)
                && startingAfter.equals(other.startingAfter)
                && search.equals(other.search)
                && metadata.equals(other.metadata)
                && payerId.equals(other.payerId)
                && vendorId.equals(other.vendorId)
                && approverId.equals(other.approverId)
                && approverAction.equals(other.approverAction)
                && invoiceId.equals(other.invoiceId)
                && status.equals(other.status);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.entityId,
                this.startDate,
                this.endDate,
                this.orderBy,
                this.orderDirection,
                this.limit,
                this.startingAfter,
                this.search,
                this.metadata,
                this.payerId,
                this.vendorId,
                this.approverId,
                this.approverAction,
                this.invoiceId,
                this.status);
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
        private Optional<String> entityId = Optional.empty();

        private Optional<OffsetDateTime> startDate = Optional.empty();

        private Optional<OffsetDateTime> endDate = Optional.empty();

        private Optional<InvoiceOrderByField> orderBy = Optional.empty();

        private Optional<OrderDirection> orderDirection = Optional.empty();

        private Optional<Integer> limit = Optional.empty();

        private Optional<String> startingAfter = Optional.empty();

        private Optional<String> search = Optional.empty();

        private Optional<InvoiceMetadataFilter> metadata = Optional.empty();

        private Optional<String> payerId = Optional.empty();

        private Optional<String> vendorId = Optional.empty();

        private Optional<String> approverId = Optional.empty();

        private Optional<ApproverAction> approverAction = Optional.empty();

        private Optional<String> invoiceId = Optional.empty();

        private Optional<InvoiceStatus> status = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GetAllInvoicesRequest other) {
            entityId(other.getEntityId());
            startDate(other.getStartDate());
            endDate(other.getEndDate());
            orderBy(other.getOrderBy());
            orderDirection(other.getOrderDirection());
            limit(other.getLimit());
            startingAfter(other.getStartingAfter());
            search(other.getSearch());
            metadata(other.getMetadata());
            payerId(other.getPayerId());
            vendorId(other.getVendorId());
            approverId(other.getApproverId());
            approverAction(other.getApproverAction());
            invoiceId(other.getInvoiceId());
            status(other.getStatus());
            return this;
        }

        @JsonSetter(value = "entityId", nulls = Nulls.SKIP)
        public Builder entityId(Optional<String> entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder entityId(String entityId) {
            this.entityId = Optional.of(entityId);
            return this;
        }

        @JsonSetter(value = "startDate", nulls = Nulls.SKIP)
        public Builder startDate(Optional<OffsetDateTime> startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            this.startDate = Optional.of(startDate);
            return this;
        }

        @JsonSetter(value = "endDate", nulls = Nulls.SKIP)
        public Builder endDate(Optional<OffsetDateTime> endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder endDate(OffsetDateTime endDate) {
            this.endDate = Optional.of(endDate);
            return this;
        }

        @JsonSetter(value = "orderBy", nulls = Nulls.SKIP)
        public Builder orderBy(Optional<InvoiceOrderByField> orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Builder orderBy(InvoiceOrderByField orderBy) {
            this.orderBy = Optional.of(orderBy);
            return this;
        }

        @JsonSetter(value = "orderDirection", nulls = Nulls.SKIP)
        public Builder orderDirection(Optional<OrderDirection> orderDirection) {
            this.orderDirection = orderDirection;
            return this;
        }

        public Builder orderDirection(OrderDirection orderDirection) {
            this.orderDirection = Optional.of(orderDirection);
            return this;
        }

        @JsonSetter(value = "limit", nulls = Nulls.SKIP)
        public Builder limit(Optional<Integer> limit) {
            this.limit = limit;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = Optional.of(limit);
            return this;
        }

        @JsonSetter(value = "startingAfter", nulls = Nulls.SKIP)
        public Builder startingAfter(Optional<String> startingAfter) {
            this.startingAfter = startingAfter;
            return this;
        }

        public Builder startingAfter(String startingAfter) {
            this.startingAfter = Optional.of(startingAfter);
            return this;
        }

        @JsonSetter(value = "search", nulls = Nulls.SKIP)
        public Builder search(Optional<String> search) {
            this.search = search;
            return this;
        }

        public Builder search(String search) {
            this.search = Optional.of(search);
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<InvoiceMetadataFilter> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(InvoiceMetadataFilter metadata) {
            this.metadata = Optional.of(metadata);
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

        @JsonSetter(value = "vendorId", nulls = Nulls.SKIP)
        public Builder vendorId(Optional<String> vendorId) {
            this.vendorId = vendorId;
            return this;
        }

        public Builder vendorId(String vendorId) {
            this.vendorId = Optional.of(vendorId);
            return this;
        }

        @JsonSetter(value = "approverId", nulls = Nulls.SKIP)
        public Builder approverId(Optional<String> approverId) {
            this.approverId = approverId;
            return this;
        }

        public Builder approverId(String approverId) {
            this.approverId = Optional.of(approverId);
            return this;
        }

        @JsonSetter(value = "approverAction", nulls = Nulls.SKIP)
        public Builder approverAction(Optional<ApproverAction> approverAction) {
            this.approverAction = approverAction;
            return this;
        }

        public Builder approverAction(ApproverAction approverAction) {
            this.approverAction = Optional.of(approverAction);
            return this;
        }

        @JsonSetter(value = "invoiceId", nulls = Nulls.SKIP)
        public Builder invoiceId(Optional<String> invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public Builder invoiceId(String invoiceId) {
            this.invoiceId = Optional.of(invoiceId);
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

        public GetAllInvoicesRequest build() {
            return new GetAllInvoicesRequest(
                    entityId,
                    startDate,
                    endDate,
                    orderBy,
                    orderDirection,
                    limit,
                    startingAfter,
                    search,
                    metadata,
                    payerId,
                    vendorId,
                    approverId,
                    approverAction,
                    invoiceId,
                    status,
                    additionalProperties);
        }
    }
}
