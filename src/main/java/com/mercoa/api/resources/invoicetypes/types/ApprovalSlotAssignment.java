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
@JsonDeserialize(builder = ApprovalSlotAssignment.Builder.class)
public final class ApprovalSlotAssignment {
    private final String approvalSlotId;

    private final String assignedUserId;

    private final Map<String, Object> additionalProperties;

    private ApprovalSlotAssignment(
            String approvalSlotId, String assignedUserId, Map<String, Object> additionalProperties) {
        this.approvalSlotId = approvalSlotId;
        this.assignedUserId = assignedUserId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The identifier for the approval slot this user is assigned to.
     */
    @JsonProperty("approvalSlotId")
    public String getApprovalSlotId() {
        return approvalSlotId;
    }

    /**
     * @return The ID of the user who is assigned to the approval slot. To assign all eligible users to an approval slot, use &quot;ANY&quot;.
     */
    @JsonProperty("assignedUserId")
    public String getAssignedUserId() {
        return assignedUserId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ApprovalSlotAssignment && equalTo((ApprovalSlotAssignment) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ApprovalSlotAssignment other) {
        return approvalSlotId.equals(other.approvalSlotId) && assignedUserId.equals(other.assignedUserId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.approvalSlotId, this.assignedUserId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ApprovalSlotIdStage builder() {
        return new Builder();
    }

    public interface ApprovalSlotIdStage {
        AssignedUserIdStage approvalSlotId(@NotNull String approvalSlotId);

        Builder from(ApprovalSlotAssignment other);
    }

    public interface AssignedUserIdStage {
        _FinalStage assignedUserId(@NotNull String assignedUserId);
    }

    public interface _FinalStage {
        ApprovalSlotAssignment build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ApprovalSlotIdStage, AssignedUserIdStage, _FinalStage {
        private String approvalSlotId;

        private String assignedUserId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ApprovalSlotAssignment other) {
            approvalSlotId(other.getApprovalSlotId());
            assignedUserId(other.getAssignedUserId());
            return this;
        }

        /**
         * <p>The identifier for the approval slot this user is assigned to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("approvalSlotId")
        public AssignedUserIdStage approvalSlotId(@NotNull String approvalSlotId) {
            this.approvalSlotId = Objects.requireNonNull(approvalSlotId, "approvalSlotId must not be null");
            return this;
        }

        /**
         * <p>The ID of the user who is assigned to the approval slot. To assign all eligible users to an approval slot, use &quot;ANY&quot;.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("assignedUserId")
        public _FinalStage assignedUserId(@NotNull String assignedUserId) {
            this.assignedUserId = Objects.requireNonNull(assignedUserId, "assignedUserId must not be null");
            return this;
        }

        @java.lang.Override
        public ApprovalSlotAssignment build() {
            return new ApprovalSlotAssignment(approvalSlotId, assignedUserId, additionalProperties);
        }
    }
}
