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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = EmailMessageResponse.Builder.class)
public final class EmailMessageResponse {
    private final String subject;

    private final String text;

    private final Map<String, Object> additionalProperties;

    private EmailMessageResponse(String subject, String text, Map<String, Object> additionalProperties) {
        this.subject = subject;
        this.text = text;
        this.additionalProperties = additionalProperties;
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
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EmailMessageResponse && equalTo((EmailMessageResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EmailMessageResponse other) {
        return subject.equals(other.subject) && text.equals(other.text);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.subject, this.text);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SubjectStage builder() {
        return new Builder();
    }

    public interface SubjectStage {
        TextStage subject(@NotNull String subject);

        Builder from(EmailMessageResponse other);
    }

    public interface TextStage {
        _FinalStage text(@NotNull String text);
    }

    public interface _FinalStage {
        EmailMessageResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SubjectStage, TextStage, _FinalStage {
        private String subject;

        private String text;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EmailMessageResponse other) {
            subject(other.getSubject());
            text(other.getText());
            return this;
        }

        /**
         * <p>The subject of the email</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("subject")
        public TextStage subject(@NotNull String subject) {
            this.subject = Objects.requireNonNull(subject, "subject must not be null");
            return this;
        }

        /**
         * <p>The body of the email in plaintext</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("text")
        public _FinalStage text(@NotNull String text) {
            this.text = Objects.requireNonNull(text, "text must not be null");
            return this;
        }

        @java.lang.Override
        public EmailMessageResponse build() {
            return new EmailMessageResponse(subject, text, additionalProperties);
        }
    }
}
