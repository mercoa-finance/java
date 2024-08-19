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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = UserNotificationPolicyResponse.Builder.class)
public final class UserNotificationPolicyResponse {
    private final boolean disabled;

    private final boolean digest;

    private final boolean immediate;

    private final NotificationType type;

    private final Map<String, Object> additionalProperties;

    private UserNotificationPolicyResponse(
            boolean disabled,
            boolean digest,
            boolean immediate,
            NotificationType type,
            Map<String, Object> additionalProperties) {
        this.disabled = disabled;
        this.digest = digest;
        this.immediate = immediate;
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

    /**
     * @return True if the selected notification type is sent as a digest.
     */
    @JsonProperty("digest")
    public boolean getDigest() {
        return digest;
    }

    /**
     * @return True if the selected notification type is sent immediately.
     */
    @JsonProperty("immediate")
    public boolean getImmediate() {
        return immediate;
    }

    @JsonProperty("type")
    public NotificationType getType() {
        return type;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserNotificationPolicyResponse && equalTo((UserNotificationPolicyResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserNotificationPolicyResponse other) {
        return disabled == other.disabled
                && digest == other.digest
                && immediate == other.immediate
                && type.equals(other.type);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.disabled, this.digest, this.immediate, this.type);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DisabledStage builder() {
        return new Builder();
    }

    public interface DisabledStage {
        DigestStage disabled(boolean disabled);

        Builder from(UserNotificationPolicyResponse other);
    }

    public interface DigestStage {
        ImmediateStage digest(boolean digest);
    }

    public interface ImmediateStage {
        TypeStage immediate(boolean immediate);
    }

    public interface TypeStage {
        _FinalStage type(NotificationType type);
    }

    public interface _FinalStage {
        UserNotificationPolicyResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DisabledStage, DigestStage, ImmediateStage, TypeStage, _FinalStage {
        private boolean disabled;

        private boolean digest;

        private boolean immediate;

        private NotificationType type;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UserNotificationPolicyResponse other) {
            disabled(other.getDisabled());
            digest(other.getDigest());
            immediate(other.getImmediate());
            type(other.getType());
            return this;
        }

        /**
         * <p>True if the selected notification type is disabled for this user</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("disabled")
        public DigestStage disabled(boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * <p>True if the selected notification type is sent as a digest.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("digest")
        public ImmediateStage digest(boolean digest) {
            this.digest = digest;
            return this;
        }

        /**
         * <p>True if the selected notification type is sent immediately.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("immediate")
        public TypeStage immediate(boolean immediate) {
            this.immediate = immediate;
            return this;
        }

        @java.lang.Override
        @JsonSetter("type")
        public _FinalStage type(NotificationType type) {
            this.type = type;
            return this;
        }

        @java.lang.Override
        public UserNotificationPolicyResponse build() {
            return new UserNotificationPolicyResponse(disabled, digest, immediate, type, additionalProperties);
        }
    }
}
