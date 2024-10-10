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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CounterpartyEventWebhook.Builder.class)
public final class CounterpartyEventWebhook {
    private final String eventType;

    private final String entityId;

    private final String counterpartyId;

    private final Map<String, Object> additionalProperties;

    private CounterpartyEventWebhook(
            String eventType, String entityId, String counterpartyId, Map<String, Object> additionalProperties) {
        this.eventType = eventType;
        this.entityId = entityId;
        this.counterpartyId = counterpartyId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("eventType")
    public String getEventType() {
        return eventType;
    }

    /**
     * @return The ID of the entity that owns the counterparty relationship
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * @return The ID of the counterparty
     */
    @JsonProperty("counterpartyId")
    public String getCounterpartyId() {
        return counterpartyId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CounterpartyEventWebhook && equalTo((CounterpartyEventWebhook) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CounterpartyEventWebhook other) {
        return eventType.equals(other.eventType)
                && entityId.equals(other.entityId)
                && counterpartyId.equals(other.counterpartyId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.eventType, this.entityId, this.counterpartyId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EventTypeStage builder() {
        return new Builder();
    }

    public interface EventTypeStage {
        EntityIdStage eventType(String eventType);

        Builder from(CounterpartyEventWebhook other);
    }

    public interface EntityIdStage {
        CounterpartyIdStage entityId(String entityId);
    }

    public interface CounterpartyIdStage {
        _FinalStage counterpartyId(String counterpartyId);
    }

    public interface _FinalStage {
        CounterpartyEventWebhook build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EventTypeStage, EntityIdStage, CounterpartyIdStage, _FinalStage {
        private String eventType;

        private String entityId;

        private String counterpartyId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CounterpartyEventWebhook other) {
            eventType(other.getEventType());
            entityId(other.getEntityId());
            counterpartyId(other.getCounterpartyId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("eventType")
        public EntityIdStage eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The ID of the entity that owns the counterparty relationship</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("entityId")
        public CounterpartyIdStage entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>The ID of the counterparty</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("counterpartyId")
        public _FinalStage counterpartyId(String counterpartyId) {
            this.counterpartyId = counterpartyId;
            return this;
        }

        @java.lang.Override
        public CounterpartyEventWebhook build() {
            return new CounterpartyEventWebhook(eventType, entityId, counterpartyId, additionalProperties);
        }
    }
}