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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EntityGroupUserEntityRequest.Builder.class)
public final class EntityGroupUserEntityRequest implements IEntityGroupUserEntityRequest {
    private final List<String> roles;

    private final String entityId;

    private final Map<String, Object> additionalProperties;

    private EntityGroupUserEntityRequest(
            List<String> roles, String entityId, Map<String, Object> additionalProperties) {
        this.roles = roles;
        this.entityId = entityId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return List of roles. A role can be any string. For example: &quot;payer&quot;, &quot;approver&quot;, &quot;viewer&quot;
     */
    @JsonProperty("roles")
    @java.lang.Override
    public List<String> getRoles() {
        return roles;
    }

    /**
     * @return The IDs of the entities that these roles applies to.
     */
    @JsonProperty("entityId")
    @java.lang.Override
    public String getEntityId() {
        return entityId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityGroupUserEntityRequest && equalTo((EntityGroupUserEntityRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityGroupUserEntityRequest other) {
        return roles.equals(other.roles) && entityId.equals(other.entityId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.roles, this.entityId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EntityIdStage builder() {
        return new Builder();
    }

    public interface EntityIdStage {
        _FinalStage entityId(String entityId);

        Builder from(EntityGroupUserEntityRequest other);
    }

    public interface _FinalStage {
        EntityGroupUserEntityRequest build();

        _FinalStage roles(List<String> roles);

        _FinalStage addRoles(String roles);

        _FinalStage addAllRoles(List<String> roles);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EntityIdStage, _FinalStage {
        private String entityId;

        private List<String> roles = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EntityGroupUserEntityRequest other) {
            roles(other.getRoles());
            entityId(other.getEntityId());
            return this;
        }

        /**
         * <p>The IDs of the entities that these roles applies to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("entityId")
        public _FinalStage entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>List of roles. A role can be any string. For example: &quot;payer&quot;, &quot;approver&quot;, &quot;viewer&quot;</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllRoles(List<String> roles) {
            this.roles.addAll(roles);
            return this;
        }

        /**
         * <p>List of roles. A role can be any string. For example: &quot;payer&quot;, &quot;approver&quot;, &quot;viewer&quot;</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addRoles(String roles) {
            this.roles.add(roles);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "roles", nulls = Nulls.SKIP)
        public _FinalStage roles(List<String> roles) {
            this.roles.clear();
            this.roles.addAll(roles);
            return this;
        }

        @java.lang.Override
        public EntityGroupUserEntityRequest build() {
            return new EntityGroupUserEntityRequest(roles, entityId, additionalProperties);
        }
    }
}
