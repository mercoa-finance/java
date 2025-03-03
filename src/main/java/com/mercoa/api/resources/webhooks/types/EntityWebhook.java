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
import com.mercoa.api.resources.entitytypes.types.EntityResponse;
import com.mercoa.api.resources.entitytypes.types.EntityUserResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = EntityWebhook.Builder.class)
public final class EntityWebhook {
    private final String eventType;

    private final EntityResponse entity;

    private final Optional<EntityUserResponse> user;

    private final Map<String, Object> additionalProperties;

    private EntityWebhook(
            String eventType,
            EntityResponse entity,
            Optional<EntityUserResponse> user,
            Map<String, Object> additionalProperties) {
        this.eventType = eventType;
        this.entity = entity;
        this.user = user;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("eventType")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("entity")
    public EntityResponse getEntity() {
        return entity;
    }

    /**
     * @return User who initiated the change.
     */
    @JsonProperty("user")
    public Optional<EntityUserResponse> getUser() {
        return user;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityWebhook && equalTo((EntityWebhook) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityWebhook other) {
        return eventType.equals(other.eventType) && entity.equals(other.entity) && user.equals(other.user);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.eventType, this.entity, this.user);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EventTypeStage builder() {
        return new Builder();
    }

    public interface EventTypeStage {
        EntityStage eventType(@NotNull String eventType);

        Builder from(EntityWebhook other);
    }

    public interface EntityStage {
        _FinalStage entity(@NotNull EntityResponse entity);
    }

    public interface _FinalStage {
        EntityWebhook build();

        _FinalStage user(Optional<EntityUserResponse> user);

        _FinalStage user(EntityUserResponse user);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EventTypeStage, EntityStage, _FinalStage {
        private String eventType;

        private EntityResponse entity;

        private Optional<EntityUserResponse> user = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EntityWebhook other) {
            eventType(other.getEventType());
            entity(other.getEntity());
            user(other.getUser());
            return this;
        }

        @java.lang.Override
        @JsonSetter("eventType")
        public EntityStage eventType(@NotNull String eventType) {
            this.eventType = Objects.requireNonNull(eventType, "eventType must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("entity")
        public _FinalStage entity(@NotNull EntityResponse entity) {
            this.entity = Objects.requireNonNull(entity, "entity must not be null");
            return this;
        }

        /**
         * <p>User who initiated the change.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage user(EntityUserResponse user) {
            this.user = Optional.ofNullable(user);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "user", nulls = Nulls.SKIP)
        public _FinalStage user(Optional<EntityUserResponse> user) {
            this.user = user;
            return this;
        }

        @java.lang.Override
        public EntityWebhook build() {
            return new EntityWebhook(eventType, entity, user, additionalProperties);
        }
    }
}
