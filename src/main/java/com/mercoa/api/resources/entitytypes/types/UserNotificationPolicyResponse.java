/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitytypes.types;

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
@JsonDeserialize(builder = UserNotificationPolicyResponse.Builder.class)
public final class UserNotificationPolicyResponse {
    private final boolean disabled;

    private final NotificationType type;

    private final Map<String, Object> additionalProperties;

    private UserNotificationPolicyResponse(
            boolean disabled, NotificationType type, Map<String, Object> additionalProperties) {
        this.disabled = disabled;
        this.type = type;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return True if the selected notification type is disabled for this user
     */
    @JsonProperty("disabled")
    public boolean getDisabled() {
        return disabled;
    }

    @JsonProperty("type")
    public NotificationType getType() {
        return type;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserNotificationPolicyResponse && equalTo((UserNotificationPolicyResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserNotificationPolicyResponse other) {
        return disabled == other.disabled && type.equals(other.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.disabled, this.type);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DisabledStage builder() {
        return new Builder();
    }

    public interface DisabledStage {
        TypeStage disabled(boolean disabled);

        Builder from(UserNotificationPolicyResponse other);
    }

    public interface TypeStage {
        _FinalStage type(NotificationType type);
    }

    public interface _FinalStage {
        UserNotificationPolicyResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DisabledStage, TypeStage, _FinalStage {
        private boolean disabled;

        private NotificationType type;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(UserNotificationPolicyResponse other) {
            disabled(other.getDisabled());
            type(other.getType());
            return this;
        }

        /**
         * <p>True if the selected notification type is disabled for this user</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("disabled")
        public TypeStage disabled(boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        @Override
        @JsonSetter("type")
        public _FinalStage type(NotificationType type) {
            this.type = type;
            return this;
        }

        @Override
        public UserNotificationPolicyResponse build() {
            return new UserNotificationPolicyResponse(disabled, type, additionalProperties);
        }
    }
}
