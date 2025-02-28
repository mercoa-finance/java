/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.collectiontypes.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ActionBase.Builder.class)
public final class ActionBase implements IActionBase {
    private final String id;

    private final OffsetDateTime scheduledExecutionTime;

    private final ActionStatus status;

    private final Map<String, Object> additionalProperties;

    private ActionBase(
            String id,
            OffsetDateTime scheduledExecutionTime,
            ActionStatus status,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.scheduledExecutionTime = scheduledExecutionTime;
        this.status = status;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    @java.lang.Override
    public String getId() {
        return id;
    }

    /**
     * @return The UTC timestamp for when this action is scheduled for execution. Actual execution may be delayed by a few minutes due to processing time.
     */
    @JsonProperty("scheduledExecutionTime")
    @java.lang.Override
    public OffsetDateTime getScheduledExecutionTime() {
        return scheduledExecutionTime;
    }

    /**
     * @return The current lifecycle state of the action. SUGGESTED actions are pending approval, APPROVED actions will be executed, and COMPLETED actions have been executed.
     */
    @JsonProperty("status")
    @java.lang.Override
    public ActionStatus getStatus() {
        return status;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionBase && equalTo((ActionBase) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ActionBase other) {
        return id.equals(other.id)
                && scheduledExecutionTime.equals(other.scheduledExecutionTime)
                && status.equals(other.status);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.scheduledExecutionTime, this.status);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        ScheduledExecutionTimeStage id(String id);

        Builder from(ActionBase other);
    }

    public interface ScheduledExecutionTimeStage {
        StatusStage scheduledExecutionTime(OffsetDateTime scheduledExecutionTime);
    }

    public interface StatusStage {
        _FinalStage status(ActionStatus status);
    }

    public interface _FinalStage {
        ActionBase build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, ScheduledExecutionTimeStage, StatusStage, _FinalStage {
        private String id;

        private OffsetDateTime scheduledExecutionTime;

        private ActionStatus status;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ActionBase other) {
            id(other.getId());
            scheduledExecutionTime(other.getScheduledExecutionTime());
            status(other.getStatus());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public ScheduledExecutionTimeStage id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The UTC timestamp for when this action is scheduled for execution. Actual execution may be delayed by a few minutes due to processing time.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("scheduledExecutionTime")
        public StatusStage scheduledExecutionTime(OffsetDateTime scheduledExecutionTime) {
            this.scheduledExecutionTime = scheduledExecutionTime;
            return this;
        }

        /**
         * <p>The current lifecycle state of the action. SUGGESTED actions are pending approval, APPROVED actions will be executed, and COMPLETED actions have been executed.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("status")
        public _FinalStage status(ActionStatus status) {
            this.status = status;
            return this;
        }

        @java.lang.Override
        public ActionBase build() {
            return new ActionBase(id, scheduledExecutionTime, status, additionalProperties);
        }
    }
}
