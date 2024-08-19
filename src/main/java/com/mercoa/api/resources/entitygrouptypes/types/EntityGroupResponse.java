/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitygrouptypes.types;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EntityGroupResponse.Builder.class)
public final class EntityGroupResponse {
    private final String id;

    private final Optional<String> foreignId;

    private final Optional<String> name;

    private final Optional<String> emailToName;

    private final List<EntityResponse> entities;

    private final Map<String, Object> additionalProperties;

    private EntityGroupResponse(
            String id,
            Optional<String> foreignId,
            Optional<String> name,
            Optional<String> emailToName,
            List<EntityResponse> entities,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.foreignId = foreignId;
        this.name = name;
        this.emailToName = emailToName;
        this.entities = entities;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("foreignId")
    public Optional<String> getForeignId() {
        return foreignId;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("emailToName")
    public Optional<String> getEmailToName() {
        return emailToName;
    }

    @JsonProperty("entities")
    public List<EntityResponse> getEntities() {
        return entities;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityGroupResponse && equalTo((EntityGroupResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityGroupResponse other) {
        return id.equals(other.id)
                && foreignId.equals(other.foreignId)
                && name.equals(other.name)
                && emailToName.equals(other.emailToName)
                && entities.equals(other.entities);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.foreignId, this.name, this.emailToName, this.entities);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        _FinalStage id(String id);

        Builder from(EntityGroupResponse other);
    }

    public interface _FinalStage {
        EntityGroupResponse build();

        _FinalStage foreignId(Optional<String> foreignId);

        _FinalStage foreignId(String foreignId);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage emailToName(Optional<String> emailToName);

        _FinalStage emailToName(String emailToName);

        _FinalStage entities(List<EntityResponse> entities);

        _FinalStage addEntities(EntityResponse entities);

        _FinalStage addAllEntities(List<EntityResponse> entities);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, _FinalStage {
        private String id;

        private List<EntityResponse> entities = new ArrayList<>();

        private Optional<String> emailToName = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> foreignId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EntityGroupResponse other) {
            id(other.getId());
            foreignId(other.getForeignId());
            name(other.getName());
            emailToName(other.getEmailToName());
            entities(other.getEntities());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public _FinalStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllEntities(List<EntityResponse> entities) {
            this.entities.addAll(entities);
            return this;
        }

        @java.lang.Override
        public _FinalStage addEntities(EntityResponse entities) {
            this.entities.add(entities);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "entities", nulls = Nulls.SKIP)
        public _FinalStage entities(List<EntityResponse> entities) {
            this.entities.clear();
            this.entities.addAll(entities);
            return this;
        }

        @java.lang.Override
        public _FinalStage emailToName(String emailToName) {
            this.emailToName = Optional.of(emailToName);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "emailToName", nulls = Nulls.SKIP)
        public _FinalStage emailToName(Optional<String> emailToName) {
            this.emailToName = emailToName;
            return this;
        }

        @java.lang.Override
        public _FinalStage name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        public _FinalStage foreignId(String foreignId) {
            this.foreignId = Optional.of(foreignId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "foreignId", nulls = Nulls.SKIP)
        public _FinalStage foreignId(Optional<String> foreignId) {
            this.foreignId = foreignId;
            return this;
        }

        @java.lang.Override
        public EntityGroupResponse build() {
            return new EntityGroupResponse(id, foreignId, name, emailToName, entities, additionalProperties);
        }
    }
}
