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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.entitytypes.types.EntityUserResponse;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CommentResponse.Builder.class)
public final class CommentResponse {
    private final String id;

    private final String text;

    private final Optional<EntityUserResponse> user;

    private final Optional<AssociatedApprovalAction> associatedApprovalAction;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Map<String, Object> additionalProperties;

    private CommentResponse(
            String id,
            String text,
            Optional<EntityUserResponse> user,
            Optional<AssociatedApprovalAction> associatedApprovalAction,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.text = text;
        this.user = user;
        this.associatedApprovalAction = associatedApprovalAction;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("user")
    public Optional<EntityUserResponse> getUser() {
        return user;
    }

    /**
     * @return If an approval action has triggered the generation of this comment, returns the associated approval action and actor
     */
    @JsonProperty("associatedApprovalAction")
    public Optional<AssociatedApprovalAction> getAssociatedApprovalAction() {
        return associatedApprovalAction;
    }

    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CommentResponse && equalTo((CommentResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CommentResponse other) {
        return id.equals(other.id)
                && text.equals(other.text)
                && user.equals(other.user)
                && associatedApprovalAction.equals(other.associatedApprovalAction)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id, this.text, this.user, this.associatedApprovalAction, this.createdAt, this.updatedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        TextStage id(String id);

        Builder from(CommentResponse other);
    }

    public interface TextStage {
        CreatedAtStage text(String text);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        CommentResponse build();

        _FinalStage user(Optional<EntityUserResponse> user);

        _FinalStage user(EntityUserResponse user);

        _FinalStage associatedApprovalAction(Optional<AssociatedApprovalAction> associatedApprovalAction);

        _FinalStage associatedApprovalAction(AssociatedApprovalAction associatedApprovalAction);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, TextStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private String id;

        private String text;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<AssociatedApprovalAction> associatedApprovalAction = Optional.empty();

        private Optional<EntityUserResponse> user = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CommentResponse other) {
            id(other.getId());
            text(other.getText());
            user(other.getUser());
            associatedApprovalAction(other.getAssociatedApprovalAction());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public TextStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("text")
        public CreatedAtStage text(String text) {
            this.text = text;
            return this;
        }

        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>If an approval action has triggered the generation of this comment, returns the associated approval action and actor</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage associatedApprovalAction(AssociatedApprovalAction associatedApprovalAction) {
            this.associatedApprovalAction = Optional.ofNullable(associatedApprovalAction);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "associatedApprovalAction", nulls = Nulls.SKIP)
        public _FinalStage associatedApprovalAction(Optional<AssociatedApprovalAction> associatedApprovalAction) {
            this.associatedApprovalAction = associatedApprovalAction;
            return this;
        }

        @java.lang.Override
        public _FinalStage user(EntityUserResponse user) {
            this.user = Optional.ofNullable(user);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "user", nulls = Nulls.SKIP)
        public _FinalStage user(Optional<EntityUserResponse> user) {
            this.user = user;
            return this;
        }

        @java.lang.Override
        public CommentResponse build() {
            return new CommentResponse(
                    id, text, user, associatedApprovalAction, createdAt, updatedAt, additionalProperties);
        }
    }
}
