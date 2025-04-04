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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CommentRequest.Builder.class)
public final class CommentRequest {
    private final String text;

    private final Optional<String> userId;

    private final Map<String, Object> additionalProperties;

    private CommentRequest(String text, Optional<String> userId, Map<String, Object> additionalProperties) {
        this.text = text;
        this.userId = userId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * @return The ID or the Foreign ID of the user who created the comment.
     */
    @JsonProperty("userId")
    public Optional<String> getUserId() {
        return userId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CommentRequest && equalTo((CommentRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CommentRequest other) {
        return text.equals(other.text) && userId.equals(other.userId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.text, this.userId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TextStage builder() {
        return new Builder();
    }

    public interface TextStage {
        _FinalStage text(@NotNull String text);

        Builder from(CommentRequest other);
    }

    public interface _FinalStage {
        CommentRequest build();

        _FinalStage userId(Optional<String> userId);

        _FinalStage userId(String userId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TextStage, _FinalStage {
        private String text;

        private Optional<String> userId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CommentRequest other) {
            text(other.getText());
            userId(other.getUserId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("text")
        public _FinalStage text(@NotNull String text) {
            this.text = Objects.requireNonNull(text, "text must not be null");
            return this;
        }

        /**
         * <p>The ID or the Foreign ID of the user who created the comment.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage userId(String userId) {
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "userId", nulls = Nulls.SKIP)
        public _FinalStage userId(Optional<String> userId) {
            this.userId = userId;
            return this;
        }

        @java.lang.Override
        public CommentRequest build() {
            return new CommentRequest(text, userId, additionalProperties);
        }
    }
}
