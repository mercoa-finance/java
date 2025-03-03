/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = AssociatedApprovalAction.Builder.class)
public final class AssociatedApprovalAction {
    private final String userId;

    private final ApproverAction action;

    private final Map<String, Object> additionalProperties;

    private AssociatedApprovalAction(String userId, ApproverAction action, Map<String, Object> additionalProperties) {
        this.userId = userId;
        this.action = action;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("action")
    public ApproverAction getAction() {
        return action;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AssociatedApprovalAction && equalTo((AssociatedApprovalAction) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AssociatedApprovalAction other) {
        return userId.equals(other.userId) && action.equals(other.action);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.userId, this.action);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        ActionStage userId(@NotNull String userId);

        Builder from(AssociatedApprovalAction other);
    }

    public interface ActionStage {
        _FinalStage action(@NotNull ApproverAction action);
    }

    public interface _FinalStage {
        AssociatedApprovalAction build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, ActionStage, _FinalStage {
        private String userId;

        private ApproverAction action;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AssociatedApprovalAction other) {
            userId(other.getUserId());
            action(other.getAction());
            return this;
        }

        @java.lang.Override
        @JsonSetter("userId")
        public ActionStage userId(@NotNull String userId) {
            this.userId = Objects.requireNonNull(userId, "userId must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("action")
        public _FinalStage action(@NotNull ApproverAction action) {
            this.action = Objects.requireNonNull(action, "action must not be null");
            return this;
        }

        @java.lang.Override
        public AssociatedApprovalAction build() {
            return new AssociatedApprovalAction(userId, action, additionalProperties);
        }
    }
}
