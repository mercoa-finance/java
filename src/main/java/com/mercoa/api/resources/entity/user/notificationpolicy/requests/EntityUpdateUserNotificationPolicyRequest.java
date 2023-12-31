/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.user.notificationpolicy.requests;

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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EntityUpdateUserNotificationPolicyRequest.Builder.class)
public final class EntityUpdateUserNotificationPolicyRequest {
    private final boolean disabled;

    private final Map<String, Object> additionalProperties;

    private EntityUpdateUserNotificationPolicyRequest(boolean disabled, Map<String, Object> additionalProperties) {
        this.disabled = disabled;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("disabled")
    public boolean getDisabled() {
        return disabled;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityUpdateUserNotificationPolicyRequest
                && equalTo((EntityUpdateUserNotificationPolicyRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityUpdateUserNotificationPolicyRequest other) {
        return disabled == other.disabled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.disabled);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DisabledStage builder() {
        return new Builder();
    }

    public interface DisabledStage {
        _FinalStage disabled(boolean disabled);

        Builder from(EntityUpdateUserNotificationPolicyRequest other);
    }

    public interface _FinalStage {
        EntityUpdateUserNotificationPolicyRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DisabledStage, _FinalStage {
        private boolean disabled;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(EntityUpdateUserNotificationPolicyRequest other) {
            disabled(other.getDisabled());
            return this;
        }

        @Override
        @JsonSetter("disabled")
        public _FinalStage disabled(boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        @Override
        public EntityUpdateUserNotificationPolicyRequest build() {
            return new EntityUpdateUserNotificationPolicyRequest(disabled, additionalProperties);
        }
    }
}
