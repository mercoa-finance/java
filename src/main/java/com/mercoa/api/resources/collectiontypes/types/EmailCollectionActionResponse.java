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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = EmailCollectionActionResponse.Builder.class)
public final class EmailCollectionActionResponse implements IActionBase {
    private final String id;

    private final OffsetDateTime scheduledExecutionTime;

    private final ActionStatus status;

    private final String subject;

    private final String body;

    private final Map<String, Object> additionalProperties;

    private EmailCollectionActionResponse(
            String id,
            OffsetDateTime scheduledExecutionTime,
            ActionStatus status,
            String subject,
            String body,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.scheduledExecutionTime = scheduledExecutionTime;
        this.status = status;
        this.subject = subject;
        this.body = body;
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

    /**
     * @return The subject of the email
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * @return The body of the email in plaintext
     */
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EmailCollectionActionResponse && equalTo((EmailCollectionActionResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EmailCollectionActionResponse other) {
        return id.equals(other.id)
                && scheduledExecutionTime.equals(other.scheduledExecutionTime)
                && status.equals(other.status)
                && subject.equals(other.subject)
                && body.equals(other.body);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.scheduledExecutionTime, this.status, this.subject, this.body);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        ScheduledExecutionTimeStage id(@NotNull String id);

        Builder from(EmailCollectionActionResponse other);
    }

    public interface ScheduledExecutionTimeStage {
        StatusStage scheduledExecutionTime(@NotNull OffsetDateTime scheduledExecutionTime);
    }

    public interface StatusStage {
        SubjectStage status(@NotNull ActionStatus status);
    }

    public interface SubjectStage {
        BodyStage subject(@NotNull String subject);
    }

    public interface BodyStage {
        _FinalStage body(@NotNull String body);
    }

    public interface _FinalStage {
        EmailCollectionActionResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage, ScheduledExecutionTimeStage, StatusStage, SubjectStage, BodyStage, _FinalStage {
        private String id;

        private OffsetDateTime scheduledExecutionTime;

        private ActionStatus status;

        private String subject;

        private String body;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EmailCollectionActionResponse other) {
            id(other.getId());
            scheduledExecutionTime(other.getScheduledExecutionTime());
            status(other.getStatus());
            subject(other.getSubject());
            body(other.getBody());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public ScheduledExecutionTimeStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * <p>The UTC timestamp for when this action is scheduled for execution. Actual execution may be delayed by a few minutes due to processing time.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("scheduledExecutionTime")
        public StatusStage scheduledExecutionTime(@NotNull OffsetDateTime scheduledExecutionTime) {
            this.scheduledExecutionTime =
                    Objects.requireNonNull(scheduledExecutionTime, "scheduledExecutionTime must not be null");
            return this;
        }

        /**
         * <p>The current lifecycle state of the action. SUGGESTED actions are pending approval, APPROVED actions will be executed, and COMPLETED actions have been executed.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("status")
        public SubjectStage status(@NotNull ActionStatus status) {
            this.status = Objects.requireNonNull(status, "status must not be null");
            return this;
        }

        /**
         * <p>The subject of the email</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("subject")
        public BodyStage subject(@NotNull String subject) {
            this.subject = Objects.requireNonNull(subject, "subject must not be null");
            return this;
        }

        /**
         * <p>The body of the email in plaintext</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("body")
        public _FinalStage body(@NotNull String body) {
            this.body = Objects.requireNonNull(body, "body must not be null");
            return this;
        }

        @java.lang.Override
        public EmailCollectionActionResponse build() {
            return new EmailCollectionActionResponse(
                    id, scheduledExecutionTime, status, subject, body, additionalProperties);
        }
    }
}
