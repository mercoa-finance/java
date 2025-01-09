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
import com.mercoa.api.resources.invoicetypes.types.InvoiceDateFilter;
import com.mercoa.api.resources.invoicetypes.types.InvoiceMetricsGroupBy;
import com.mercoa.api.resources.invoicetypes.types.InvoiceMetricsPerDateFrequency;
import com.mercoa.api.resources.invoicetypes.types.InvoiceMetricsPerDateGroupBy;
import com.mercoa.api.resources.invoicetypes.types.InvoiceStatus;
import com.mercoa.api.resources.paymentmethodtypes.types.CurrencyCode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = GroupInvoiceMetricsRequest.Builder.class)
public final class GroupInvoiceMetricsRequest {
    private final Optional<String> search;

    private final Optional<Boolean> excludePayables;

    private final Optional<Boolean> excludeReceivables;

    private final Optional<InvoiceMetricsPerDateGroupBy> returnByDate;

    private final Optional<InvoiceMetricsPerDateFrequency> returnByDateFrequency;

    private final Optional<InvoiceMetricsGroupBy> groupBy;

    private final Optional<String> payerId;

    private final Optional<String> vendorId;

    private final Optional<String> approverId;

    private final Optional<String> invoiceId;

    private final Optional<InvoiceStatus> status;

    private final Optional<OffsetDateTime> startDate;

    private final Optional<OffsetDateTime> endDate;

    private final Optional<InvoiceDateFilter> dateType;

    private final Optional<CurrencyCode> currency;

    private final Map<String, Object> additionalProperties;

    private GroupInvoiceMetricsRequest(
            Optional<String> search,
            Optional<Boolean> excludePayables,
            Optional<Boolean> excludeReceivables,
            Optional<InvoiceMetricsPerDateGroupBy> returnByDate,
            Optional<InvoiceMetricsPerDateFrequency> returnByDateFrequency,
            Optional<InvoiceMetricsGroupBy> groupBy,
            Optional<String> payerId,
            Optional<String> vendorId,
            Optional<String> approverId,
            Optional<String> invoiceId,
            Optional<InvoiceStatus> status,
            Optional<OffsetDateTime> startDate,
            Optional<OffsetDateTime> endDate,
            Optional<InvoiceDateFilter> dateType,
            Optional<CurrencyCode> currency,
            Map<String, Object> additionalProperties) {
        this.search = search;
        this.excludePayables = excludePayables;
        this.excludeReceivables = excludeReceivables;
        this.returnByDate = returnByDate;
        this.returnByDateFrequency = returnByDateFrequency;
        this.groupBy = groupBy;
        this.payerId = payerId;
        this.vendorId = vendorId;
        this.approverId = approverId;
        this.invoiceId = invoiceId;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dateType = dateType;
        this.currency = currency;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Find invoices by vendor name, invoice number, or amount. Partial matches are supported.
     */
    @JsonProperty("search")
    public Optional<String> getSearch() {
        return search;
    }

    /**
     * @return Only return invoices that are not payable by the entity. This will return only invoices that are receivable by the entity.
     */
    @JsonProperty("excludePayables")
    public Optional<Boolean> getExcludePayables() {
        return excludePayables;
    }

    /**
     * @return Only return invoices that are not receivable by the entity. This will return only invoices that are payable by the entity.
     */
    @JsonProperty("excludeReceivables")
    public Optional<Boolean> getExcludeReceivables() {
        return excludeReceivables;
    }

    /**
     * @return Return invoice metrics grouped by date.
     */
    @JsonProperty("returnByDate")
    public Optional<InvoiceMetricsPerDateGroupBy> getReturnByDate() {
        return returnByDate;
    }

    /**
     * @return Return invoice metrics grouped by date. Defaults to daily.
     */
    @JsonProperty("returnByDateFrequency")
    public Optional<InvoiceMetricsPerDateFrequency> getReturnByDateFrequency() {
        return returnByDateFrequency;
    }

    /**
     * @return Return invoice metrics grouped by.
     */
    @JsonProperty("groupBy")
    public Optional<InvoiceMetricsGroupBy> getGroupBy() {
        return groupBy;
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
     * @return Filter invoices by invoice ID or invoice foreign ID.
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

    /**
     * @return Start date filter. Defaults to CREATED_AT unless specified the dateType is specified
     */
    @JsonProperty("startDate")
    public Optional<OffsetDateTime> getStartDate() {
        return startDate;
    }

    /**
     * @return End date filter. Defaults to CREATED_AT unless specified the dateType is specified
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
     * @return Currency to filter on
     */
    @JsonProperty("currency")
    public Optional<CurrencyCode> getCurrency() {
        return currency;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GroupInvoiceMetricsRequest && equalTo((GroupInvoiceMetricsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GroupInvoiceMetricsRequest other) {
        return search.equals(other.search)
                && excludePayables.equals(other.excludePayables)
                && excludeReceivables.equals(other.excludeReceivables)
                && returnByDate.equals(other.returnByDate)
                && returnByDateFrequency.equals(other.returnByDateFrequency)
                && groupBy.equals(other.groupBy)
                && payerId.equals(other.payerId)
                && vendorId.equals(other.vendorId)
                && approverId.equals(other.approverId)
                && invoiceId.equals(other.invoiceId)
                && status.equals(other.status)
                && startDate.equals(other.startDate)
                && endDate.equals(other.endDate)
                && dateType.equals(other.dateType)
                && currency.equals(other.currency);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.search,
                this.excludePayables,
                this.excludeReceivables,
                this.returnByDate,
                this.returnByDateFrequency,
                this.groupBy,
                this.payerId,
                this.vendorId,
                this.approverId,
                this.invoiceId,
                this.status,
                this.startDate,
                this.endDate,
                this.dateType,
                this.currency);
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
        private Optional<String> search = Optional.empty();

        private Optional<Boolean> excludePayables = Optional.empty();

        private Optional<Boolean> excludeReceivables = Optional.empty();

        private Optional<InvoiceMetricsPerDateGroupBy> returnByDate = Optional.empty();

        private Optional<InvoiceMetricsPerDateFrequency> returnByDateFrequency = Optional.empty();

        private Optional<InvoiceMetricsGroupBy> groupBy = Optional.empty();

        private Optional<String> payerId = Optional.empty();

        private Optional<String> vendorId = Optional.empty();

        private Optional<String> approverId = Optional.empty();

        private Optional<String> invoiceId = Optional.empty();

        private Optional<InvoiceStatus> status = Optional.empty();

        private Optional<OffsetDateTime> startDate = Optional.empty();

        private Optional<OffsetDateTime> endDate = Optional.empty();

        private Optional<InvoiceDateFilter> dateType = Optional.empty();

        private Optional<CurrencyCode> currency = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GroupInvoiceMetricsRequest other) {
            search(other.getSearch());
            excludePayables(other.getExcludePayables());
            excludeReceivables(other.getExcludeReceivables());
            returnByDate(other.getReturnByDate());
            returnByDateFrequency(other.getReturnByDateFrequency());
            groupBy(other.getGroupBy());
            payerId(other.getPayerId());
            vendorId(other.getVendorId());
            approverId(other.getApproverId());
            invoiceId(other.getInvoiceId());
            status(other.getStatus());
            startDate(other.getStartDate());
            endDate(other.getEndDate());
            dateType(other.getDateType());
            currency(other.getCurrency());
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

        @JsonSetter(value = "returnByDate", nulls = Nulls.SKIP)
        public Builder returnByDate(Optional<InvoiceMetricsPerDateGroupBy> returnByDate) {
            this.returnByDate = returnByDate;
            return this;
        }

        public Builder returnByDate(InvoiceMetricsPerDateGroupBy returnByDate) {
            this.returnByDate = Optional.ofNullable(returnByDate);
            return this;
        }

        @JsonSetter(value = "returnByDateFrequency", nulls = Nulls.SKIP)
        public Builder returnByDateFrequency(Optional<InvoiceMetricsPerDateFrequency> returnByDateFrequency) {
            this.returnByDateFrequency = returnByDateFrequency;
            return this;
        }

        public Builder returnByDateFrequency(InvoiceMetricsPerDateFrequency returnByDateFrequency) {
            this.returnByDateFrequency = Optional.ofNullable(returnByDateFrequency);
            return this;
        }

        @JsonSetter(value = "groupBy", nulls = Nulls.SKIP)
        public Builder groupBy(Optional<InvoiceMetricsGroupBy> groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        public Builder groupBy(InvoiceMetricsGroupBy groupBy) {
            this.groupBy = Optional.ofNullable(groupBy);
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

        @JsonSetter(value = "currency", nulls = Nulls.SKIP)
        public Builder currency(Optional<CurrencyCode> currency) {
            this.currency = currency;
            return this;
        }

        public Builder currency(CurrencyCode currency) {
            this.currency = Optional.ofNullable(currency);
            return this;
        }

        public GroupInvoiceMetricsRequest build() {
            return new GroupInvoiceMetricsRequest(
                    search,
                    excludePayables,
                    excludeReceivables,
                    returnByDate,
                    returnByDateFrequency,
                    groupBy,
                    payerId,
                    vendorId,
                    approverId,
                    invoiceId,
                    status,
                    startDate,
                    endDate,
                    dateType,
                    currency,
                    additionalProperties);
        }
    }
}
