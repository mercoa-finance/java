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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = EntityMetadataUpdatedWebhook.Builder.class)
public final class EntityMetadataUpdatedWebhook {
    private final String eventType;

    private final String entityId;

    private final Optional<String> foreignId;

    private final String key;

    private final List<String> value;

    private final Map<String, Object> additionalProperties;

    private EntityMetadataUpdatedWebhook(
            String eventType,
            String entityId,
            Optional<String> foreignId,
            String key,
            List<String> value,
            Map<String, Object> additionalProperties) {
        this.eventType = eventType;
        this.entityId = entityId;
        this.foreignId = foreignId;
        this.key = key;
        this.value = value;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The type of the event.
     */
    @JsonProperty("eventType")
    public String getEventType() {
        return eventType;
    }

    /**
     * @return The ID of the entity that was updated.
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * @return Foreign ID associated with the entity.
     */
    @JsonProperty("foreignId")
    public Optional<String> getForeignId() {
        return foreignId;
    }

    /**
     * @return The key of the metadata that was updated.
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * @return A list of new values for the metadata.
     */
    @JsonProperty("value")
    public List<String> getValue() {
        return value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityMetadataUpdatedWebhook && equalTo((EntityMetadataUpdatedWebhook) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityMetadataUpdatedWebhook other) {
        return eventType.equals(other.eventType)
                && entityId.equals(other.entityId)
                && foreignId.equals(other.foreignId)
                && key.equals(other.key)
                && value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.eventType, this.entityId, this.foreignId, this.key, this.value);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EventTypeStage builder() {
        return new Builder();
    }

    public interface EventTypeStage {
        EntityIdStage eventType(@NotNull String eventType);

        Builder from(EntityMetadataUpdatedWebhook other);
    }

    public interface EntityIdStage {
        KeyStage entityId(@NotNull String entityId);
    }

    public interface KeyStage {
        _FinalStage key(@NotNull String key);
    }

    public interface _FinalStage {
        EntityMetadataUpdatedWebhook build();

        _FinalStage foreignId(Optional<String> foreignId);

        _FinalStage foreignId(String foreignId);

        _FinalStage value(List<String> value);

        _FinalStage addValue(String value);

        _FinalStage addAllValue(List<String> value);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EventTypeStage, EntityIdStage, KeyStage, _FinalStage {
        private String eventType;

        private String entityId;

        private String key;

        private List<String> value = new ArrayList<>();

        private Optional<String> foreignId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EntityMetadataUpdatedWebhook other) {
            eventType(other.getEventType());
            entityId(other.getEntityId());
            foreignId(other.getForeignId());
            key(other.getKey());
            value(other.getValue());
            return this;
        }

        /**
         * <p>The type of the event.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("eventType")
        public EntityIdStage eventType(@NotNull String eventType) {
            this.eventType = Objects.requireNonNull(eventType, "eventType must not be null");
            return this;
        }

        /**
         * <p>The ID of the entity that was updated.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("entityId")
        public KeyStage entityId(@NotNull String entityId) {
            this.entityId = Objects.requireNonNull(entityId, "entityId must not be null");
            return this;
        }

        /**
         * <p>The key of the metadata that was updated.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("key")
        public _FinalStage key(@NotNull String key) {
            this.key = Objects.requireNonNull(key, "key must not be null");
            return this;
        }

        /**
         * <p>A list of new values for the metadata.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllValue(List<String> value) {
            this.value.addAll(value);
            return this;
        }

        /**
         * <p>A list of new values for the metadata.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addValue(String value) {
            this.value.add(value);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "value", nulls = Nulls.SKIP)
        public _FinalStage value(List<String> value) {
            this.value.clear();
            this.value.addAll(value);
            return this;
        }

        /**
         * <p>Foreign ID associated with the entity.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage foreignId(String foreignId) {
            this.foreignId = Optional.ofNullable(foreignId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "foreignId", nulls = Nulls.SKIP)
        public _FinalStage foreignId(Optional<String> foreignId) {
            this.foreignId = foreignId;
            return this;
        }

        @java.lang.Override
        public EntityMetadataUpdatedWebhook build() {
            return new EntityMetadataUpdatedWebhook(eventType, entityId, foreignId, key, value, additionalProperties);
        }
    }
}
