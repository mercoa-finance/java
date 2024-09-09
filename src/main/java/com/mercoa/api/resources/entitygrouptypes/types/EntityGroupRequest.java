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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = EntityGroupRequest.Builder.class)
public final class EntityGroupRequest implements IEntityGroupEntityUpdateRequest {
    private final Optional<List<String>> entityIds;

    private final Optional<String> foreignId;

    private final Optional<String> name;

    private final Optional<String> emailToName;

    private final Optional<Map<String, String>> metadata;

    private final Map<String, Object> additionalProperties;

    private EntityGroupRequest(
            Optional<List<String>> entityIds,
            Optional<String> foreignId,
            Optional<String> name,
            Optional<String> emailToName,
            Optional<Map<String, String>> metadata,
            Map<String, Object> additionalProperties) {
        this.entityIds = entityIds;
        this.foreignId = foreignId;
        this.name = name;
        this.emailToName = emailToName;
        this.metadata = metadata;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return List of entity IDs or foreign IDs
     */
    @JsonProperty("entityIds")
    @java.lang.Override
    public Optional<List<String>> getEntityIds() {
        return entityIds;
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

    /**
     * @return Metadata key/value pairs to associate with this group. Will overwrite existing metadata.
     */
    @JsonProperty("metadata")
    public Optional<Map<String, String>> getMetadata() {
        return metadata;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityGroupRequest && equalTo((EntityGroupRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityGroupRequest other) {
        return entityIds.equals(other.entityIds)
                && foreignId.equals(other.foreignId)
                && name.equals(other.name)
                && emailToName.equals(other.emailToName)
                && metadata.equals(other.metadata);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.entityIds, this.foreignId, this.name, this.emailToName, this.metadata);
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
        private Optional<List<String>> entityIds = Optional.empty();

        private Optional<String> foreignId = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> emailToName = Optional.empty();

        private Optional<Map<String, String>> metadata = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EntityGroupRequest other) {
            entityIds(other.getEntityIds());
            foreignId(other.getForeignId());
            name(other.getName());
            emailToName(other.getEmailToName());
            metadata(other.getMetadata());
            return this;
        }

        @JsonSetter(value = "entityIds", nulls = Nulls.SKIP)
        public Builder entityIds(Optional<List<String>> entityIds) {
            this.entityIds = entityIds;
            return this;
        }

        public Builder entityIds(List<String> entityIds) {
            this.entityIds = Optional.ofNullable(entityIds);
            return this;
        }

        @JsonSetter(value = "foreignId", nulls = Nulls.SKIP)
        public Builder foreignId(Optional<String> foreignId) {
            this.foreignId = foreignId;
            return this;
        }

        public Builder foreignId(String foreignId) {
            this.foreignId = Optional.ofNullable(foreignId);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @JsonSetter(value = "emailToName", nulls = Nulls.SKIP)
        public Builder emailToName(Optional<String> emailToName) {
            this.emailToName = emailToName;
            return this;
        }

        public Builder emailToName(String emailToName) {
            this.emailToName = Optional.ofNullable(emailToName);
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<Map<String, String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String, String> metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public EntityGroupRequest build() {
            return new EntityGroupRequest(entityIds, foreignId, name, emailToName, metadata, additionalProperties);
        }
    }
}
