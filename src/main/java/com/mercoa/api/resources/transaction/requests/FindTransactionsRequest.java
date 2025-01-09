/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.transaction.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.invoicetypes.types.MetadataFilter;
import com.mercoa.api.resources.transaction.types.TransactionStatus;
import com.mercoa.api.resources.transaction.types.TransactionType;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = FindTransactionsRequest.Builder.class)
public final class FindTransactionsRequest {
    private final Optional<String> entityId;

    private final Optional<OffsetDateTime> startDate;

    private final Optional<OffsetDateTime> endDate;

    private final Optional<Integer> limit;

    private final Optional<String> startingAfter;

    private final Optional<String> search;

    private final Optional<MetadataFilter> metadata;

    private final Optional<MetadataFilter> lineItemMetadata;

    private final Optional<String> lineItemGlAccountId;

    private final Optional<String> payerId;

    private final Optional<String> vendorId;

    private final Optional<String> creatorUserId;

    private final Optional<String> invoiceId;

    private final Optional<String> transactionId;

    private final Optional<TransactionStatus> status;

    private final Optional<TransactionType> transactionType;

    private final Map<String, Object> additionalProperties;

    private FindTransactionsRequest(
            Optional<String> entityId,
            Optional<OffsetDateTime> startDate,
            Optional<OffsetDateTime> endDate,
            Optional<Integer> limit,
            Optional<String> startingAfter,
            Optional<String> search,
            Optional<MetadataFilter> metadata,
            Optional<MetadataFilter> lineItemMetadata,
            Optional<String> lineItemGlAccountId,
            Optional<String> payerId,
            Optional<String> vendorId,
            Optional<String> creatorUserId,
            Optional<String> invoiceId,
            Optional<String> transactionId,
            Optional<TransactionStatus> status,
            Optional<TransactionType> transactionType,
            Map<String, Object> additionalProperties) {
        this.entityId = entityId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.limit = limit;
        this.startingAfter = startingAfter;
        this.search = search;
        this.metadata = metadata;
        this.lineItemMetadata = lineItemMetadata;
        this.lineItemGlAccountId = lineItemGlAccountId;
        this.payerId = payerId;
        this.vendorId = vendorId;
        this.creatorUserId = creatorUserId;
        this.invoiceId = invoiceId;
        this.transactionId = transactionId;
        this.status = status;
        this.transactionType = transactionType;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Filter transactions by the ID or foreign ID of the entity that is the payer or the vendor of the invoice that created the transaction.
     */
    @JsonProperty("entityId")
    public Optional<String> getEntityId() {
        return entityId;
    }

    /**
     * @return CREATED_AT Start date filter.
     */
    @JsonProperty("startDate")
    public Optional<OffsetDateTime> getStartDate() {
        return startDate;
    }

    /**
     * @return CREATED_AT End date filter.
     */
    @JsonProperty("endDate")
    public Optional<OffsetDateTime> getEndDate() {
        return endDate;
    }

    /**
     * @return Number of transactions to return. Limit can range between 1 and 100, and the default is 10.
     */
    @JsonProperty("limit")
    public Optional<Integer> getLimit() {
        return limit;
    }

    /**
     * @return The ID of the transactions to start after. If not provided, the first page of transactions will be returned.
     */
    @JsonProperty("startingAfter")
    public Optional<String> getStartingAfter() {
        return startingAfter;
    }

    /**
     * @return Find transactions by vendor name, invoice number, or amount. Partial matches are supported.
     */
    @JsonProperty("search")
    public Optional<String> getSearch() {
        return search;
    }

    /**
     * @return Filter transactions by invoice metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
     */
    @JsonProperty("metadata")
    public Optional<MetadataFilter> getMetadata() {
        return metadata;
    }

    /**
     * @return Filter transactions by invoice line item metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
     */
    @JsonProperty("lineItemMetadata")
    public Optional<MetadataFilter> getLineItemMetadata() {
        return lineItemMetadata;
    }

    /**
     * @return Filter transactions by invoice line item GL account ID. Each filter will be applied as an OR condition. Duplicate keys will be ignored.
     */
    @JsonProperty("lineItemGlAccountId")
    public Optional<String> getLineItemGlAccountId() {
        return lineItemGlAccountId;
    }

    /**
     * @return Filter transactions by payer ID or payer foreign ID.
     */
    @JsonProperty("payerId")
    public Optional<String> getPayerId() {
        return payerId;
    }

    /**
     * @return Filter transactions by vendor ID or vendor foreign ID.
     */
    @JsonProperty("vendorId")
    public Optional<String> getVendorId() {
        return vendorId;
    }

    /**
     * @return Filter transactions by the ID or foreign ID of the user that created the invoice that created the transaction.
     */
    @JsonProperty("creatorUserId")
    public Optional<String> getCreatorUserId() {
        return creatorUserId;
    }

    /**
     * @return Filter transactions by invoice ID. Does not support foreign ID.
     */
    @JsonProperty("invoiceId")
    public Optional<String> getInvoiceId() {
        return invoiceId;
    }

    /**
     * @return Filter transactions by transaction ID.
     */
    @JsonProperty("transactionId")
    public Optional<String> getTransactionId() {
        return transactionId;
    }

    /**
     * @return Transaction status to filter on
     */
    @JsonProperty("status")
    public Optional<TransactionStatus> getStatus() {
        return status;
    }

    /**
     * @return Filter transactions by transaction type
     */
    @JsonProperty("transactionType")
    public Optional<TransactionType> getTransactionType() {
        return transactionType;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FindTransactionsRequest && equalTo((FindTransactionsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FindTransactionsRequest other) {
        return entityId.equals(other.entityId)
                && startDate.equals(other.startDate)
                && endDate.equals(other.endDate)
                && limit.equals(other.limit)
                && startingAfter.equals(other.startingAfter)
                && search.equals(other.search)
                && metadata.equals(other.metadata)
                && lineItemMetadata.equals(other.lineItemMetadata)
                && lineItemGlAccountId.equals(other.lineItemGlAccountId)
                && payerId.equals(other.payerId)
                && vendorId.equals(other.vendorId)
                && creatorUserId.equals(other.creatorUserId)
                && invoiceId.equals(other.invoiceId)
                && transactionId.equals(other.transactionId)
                && status.equals(other.status)
                && transactionType.equals(other.transactionType);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.entityId,
                this.startDate,
                this.endDate,
                this.limit,
                this.startingAfter,
                this.search,
                this.metadata,
                this.lineItemMetadata,
                this.lineItemGlAccountId,
                this.payerId,
                this.vendorId,
                this.creatorUserId,
                this.invoiceId,
                this.transactionId,
                this.status,
                this.transactionType);
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

        private Optional<Integer> limit = Optional.empty();

        private Optional<String> startingAfter = Optional.empty();

        private Optional<String> search = Optional.empty();

        private Optional<MetadataFilter> metadata = Optional.empty();

        private Optional<MetadataFilter> lineItemMetadata = Optional.empty();

        private Optional<String> lineItemGlAccountId = Optional.empty();

        private Optional<String> payerId = Optional.empty();

        private Optional<String> vendorId = Optional.empty();

        private Optional<String> creatorUserId = Optional.empty();

        private Optional<String> invoiceId = Optional.empty();

        private Optional<String> transactionId = Optional.empty();

        private Optional<TransactionStatus> status = Optional.empty();

        private Optional<TransactionType> transactionType = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(FindTransactionsRequest other) {
            entityId(other.getEntityId());
            startDate(other.getStartDate());
            endDate(other.getEndDate());
            limit(other.getLimit());
            startingAfter(other.getStartingAfter());
            search(other.getSearch());
            metadata(other.getMetadata());
            lineItemMetadata(other.getLineItemMetadata());
            lineItemGlAccountId(other.getLineItemGlAccountId());
            payerId(other.getPayerId());
            vendorId(other.getVendorId());
            creatorUserId(other.getCreatorUserId());
            invoiceId(other.getInvoiceId());
            transactionId(other.getTransactionId());
            status(other.getStatus());
            transactionType(other.getTransactionType());
            return this;
        }

        @JsonSetter(value = "entityId", nulls = Nulls.SKIP)
        public Builder entityId(Optional<String> entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder entityId(String entityId) {
            this.entityId = Optional.ofNullable(entityId);
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

        @JsonSetter(value = "search", nulls = Nulls.SKIP)
        public Builder search(Optional<String> search) {
            this.search = search;
            return this;
        }

        public Builder search(String search) {
            this.search = Optional.ofNullable(search);
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<MetadataFilter> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(MetadataFilter metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @JsonSetter(value = "lineItemMetadata", nulls = Nulls.SKIP)
        public Builder lineItemMetadata(Optional<MetadataFilter> lineItemMetadata) {
            this.lineItemMetadata = lineItemMetadata;
            return this;
        }

        public Builder lineItemMetadata(MetadataFilter lineItemMetadata) {
            this.lineItemMetadata = Optional.ofNullable(lineItemMetadata);
            return this;
        }

        @JsonSetter(value = "lineItemGlAccountId", nulls = Nulls.SKIP)
        public Builder lineItemGlAccountId(Optional<String> lineItemGlAccountId) {
            this.lineItemGlAccountId = lineItemGlAccountId;
            return this;
        }

        public Builder lineItemGlAccountId(String lineItemGlAccountId) {
            this.lineItemGlAccountId = Optional.ofNullable(lineItemGlAccountId);
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

        @JsonSetter(value = "creatorUserId", nulls = Nulls.SKIP)
        public Builder creatorUserId(Optional<String> creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }

        public Builder creatorUserId(String creatorUserId) {
            this.creatorUserId = Optional.ofNullable(creatorUserId);
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

        @JsonSetter(value = "transactionId", nulls = Nulls.SKIP)
        public Builder transactionId(Optional<String> transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public Builder transactionId(String transactionId) {
            this.transactionId = Optional.ofNullable(transactionId);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<TransactionStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(TransactionStatus status) {
            this.status = Optional.ofNullable(status);
            return this;
        }

        @JsonSetter(value = "transactionType", nulls = Nulls.SKIP)
        public Builder transactionType(Optional<TransactionType> transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        public Builder transactionType(TransactionType transactionType) {
            this.transactionType = Optional.ofNullable(transactionType);
            return this;
        }

        public FindTransactionsRequest build() {
            return new FindTransactionsRequest(
                    entityId,
                    startDate,
                    endDate,
                    limit,
                    startingAfter,
                    search,
                    metadata,
                    lineItemMetadata,
                    lineItemGlAccountId,
                    payerId,
                    vendorId,
                    creatorUserId,
                    invoiceId,
                    transactionId,
                    status,
                    transactionType,
                    additionalProperties);
        }
    }
}
