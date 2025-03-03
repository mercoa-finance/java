/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.webhooks.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.invoicetypes.types.BulkInvoiceCreationFromObjectResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = BulkInvoiceCreationWebhook.Builder.class)
public final class BulkInvoiceCreationWebhook {
    private final String eventType;

    private final List<BulkInvoiceCreationFromObjectResponse> data;

    private final Map<String, Object> additionalProperties;

    private BulkInvoiceCreationWebhook(
            String eventType,
            List<BulkInvoiceCreationFromObjectResponse> data,
            Map<String, Object> additionalProperties) {
        this.eventType = eventType;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("eventType")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("data")
    public List<BulkInvoiceCreationFromObjectResponse> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BulkInvoiceCreationWebhook && equalTo((BulkInvoiceCreationWebhook) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BulkInvoiceCreationWebhook other) {
        return eventType.equals(other.eventType) && data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.eventType, this.data);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EventTypeStage builder() {
        return new Builder();
    }

    public interface EventTypeStage {
        _FinalStage eventType(@NotNull String eventType);

        Builder from(BulkInvoiceCreationWebhook other);
    }

    public interface _FinalStage {
        BulkInvoiceCreationWebhook build();

        _FinalStage data(List<BulkInvoiceCreationFromObjectResponse> data);

        _FinalStage addData(BulkInvoiceCreationFromObjectResponse data);

        _FinalStage addAllData(List<BulkInvoiceCreationFromObjectResponse> data);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EventTypeStage, _FinalStage {
        private String eventType;

        private List<BulkInvoiceCreationFromObjectResponse> data = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(BulkInvoiceCreationWebhook other) {
            eventType(other.getEventType());
            data(other.getData());
            return this;
        }

        @java.lang.Override
        @JsonSetter("eventType")
        public _FinalStage eventType(@NotNull String eventType) {
            this.eventType = Objects.requireNonNull(eventType, "eventType must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllData(List<BulkInvoiceCreationFromObjectResponse> data) {
            this.data.addAll(data);
            return this;
        }

        @java.lang.Override
        public _FinalStage addData(BulkInvoiceCreationFromObjectResponse data) {
            this.data.add(data);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(List<BulkInvoiceCreationFromObjectResponse> data) {
            this.data.clear();
            this.data.addAll(data);
            return this;
        }

        @java.lang.Override
        public BulkInvoiceCreationWebhook build() {
            return new BulkInvoiceCreationWebhook(eventType, data, additionalProperties);
        }
    }
}
