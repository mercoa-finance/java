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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = EntityGroupAddEntitiesRequest.Builder.class)
public final class EntityGroupAddEntitiesRequest {
    private final List<String> entityIds;

    private final Optional<EntityIdOrBoolean> copyUsersFrom;

    private final Map<String, Object> additionalProperties;

    private EntityGroupAddEntitiesRequest(
            List<String> entityIds,
            Optional<EntityIdOrBoolean> copyUsersFrom,
            Map<String, Object> additionalProperties) {
        this.entityIds = entityIds;
        this.copyUsersFrom = copyUsersFrom;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return List of entity IDs or foreign IDs to add to the group
     */
    @JsonProperty("entityIds")
    public List<String> getEntityIds() {
        return entityIds;
    }

    /**
     * @return Entity ID / foreign ID of an entity currently in the group to copy users and roles from OR a boolean defining if users should be copied to the new entities.
     * <p>If not provided or false, users and roles will not be copied.
     * If true, users and roles will be copied from the first entity the group.
     * If a valid ID is provided, users and roles will be copied from the corresponding provided entity in the group.</p>
     * <p>Note: If users copied, any preexisting users will be left alone, and users with the same foreign ID will not be copied.</p>
     */
    @JsonProperty("copyUsersFrom")
    public Optional<EntityIdOrBoolean> getCopyUsersFrom() {
        return copyUsersFrom;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityGroupAddEntitiesRequest && equalTo((EntityGroupAddEntitiesRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityGroupAddEntitiesRequest other) {
        return entityIds.equals(other.entityIds) && copyUsersFrom.equals(other.copyUsersFrom);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.entityIds, this.copyUsersFrom);
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
        private List<String> entityIds = new ArrayList<>();

        private Optional<EntityIdOrBoolean> copyUsersFrom = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EntityGroupAddEntitiesRequest other) {
            entityIds(other.getEntityIds());
            copyUsersFrom(other.getCopyUsersFrom());
            return this;
        }

        @JsonSetter(value = "entityIds", nulls = Nulls.SKIP)
        public Builder entityIds(List<String> entityIds) {
            this.entityIds.clear();
            this.entityIds.addAll(entityIds);
            return this;
        }

        public Builder addEntityIds(String entityIds) {
            this.entityIds.add(entityIds);
            return this;
        }

        public Builder addAllEntityIds(List<String> entityIds) {
            this.entityIds.addAll(entityIds);
            return this;
        }

        @JsonSetter(value = "copyUsersFrom", nulls = Nulls.SKIP)
        public Builder copyUsersFrom(Optional<EntityIdOrBoolean> copyUsersFrom) {
            this.copyUsersFrom = copyUsersFrom;
            return this;
        }

        public Builder copyUsersFrom(EntityIdOrBoolean copyUsersFrom) {
            this.copyUsersFrom = Optional.ofNullable(copyUsersFrom);
            return this;
        }

        public EntityGroupAddEntitiesRequest build() {
            return new EntityGroupAddEntitiesRequest(entityIds, copyUsersFrom, additionalProperties);
        }
    }
}
