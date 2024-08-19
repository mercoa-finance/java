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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = FindInvoiceResponse.Builder.class)
public final class FindInvoiceResponse {
    private final int count;

    private final boolean hasMore;

    private final List<InvoiceResponse> data;

    private final Map<String, Object> additionalProperties;

    private FindInvoiceResponse(
            int count, boolean hasMore, List<InvoiceResponse> data, Map<String, Object> additionalProperties) {
        this.count = count;
        this.hasMore = hasMore;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Total number of notifications for the given start and end date filters. This value is not limited by the limit parameter. It is provided so that you can determine how many pages of results are available.
     */
    @JsonProperty("count")
    public int getCount() {
        return count;
    }

    /**
     * @return True if there are more notifications available for the given start and end date filters.
     */
    @JsonProperty("hasMore")
    public boolean getHasMore() {
        return hasMore;
    }

    @JsonProperty("data")
    public List<InvoiceResponse> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FindInvoiceResponse && equalTo((FindInvoiceResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FindInvoiceResponse other) {
        return count == other.count && hasMore == other.hasMore && data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.count, this.hasMore, this.data);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CountStage builder() {
        return new Builder();
    }

    public interface CountStage {
        HasMoreStage count(int count);

        Builder from(FindInvoiceResponse other);
    }

    public interface HasMoreStage {
        _FinalStage hasMore(boolean hasMore);
    }

    public interface _FinalStage {
        FindInvoiceResponse build();

        _FinalStage data(List<InvoiceResponse> data);

        _FinalStage addData(InvoiceResponse data);

        _FinalStage addAllData(List<InvoiceResponse> data);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CountStage, HasMoreStage, _FinalStage {
        private int count;

        private boolean hasMore;

        private List<InvoiceResponse> data = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(FindInvoiceResponse other) {
            count(other.getCount());
            hasMore(other.getHasMore());
            data(other.getData());
            return this;
        }

        /**
         * <p>Total number of notifications for the given start and end date filters. This value is not limited by the limit parameter. It is provided so that you can determine how many pages of results are available.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("count")
        public HasMoreStage count(int count) {
            this.count = count;
            return this;
        }

        /**
         * <p>True if there are more notifications available for the given start and end date filters.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("hasMore")
        public _FinalStage hasMore(boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllData(List<InvoiceResponse> data) {
            this.data.addAll(data);
            return this;
        }

        @java.lang.Override
        public _FinalStage addData(InvoiceResponse data) {
            this.data.add(data);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(List<InvoiceResponse> data) {
            this.data.clear();
            this.data.addAll(data);
            return this;
        }

        @java.lang.Override
        public FindInvoiceResponse build() {
            return new FindInvoiceResponse(count, hasMore, data, additionalProperties);
        }
    }
}
