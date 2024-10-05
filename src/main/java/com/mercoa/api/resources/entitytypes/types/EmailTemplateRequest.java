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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = EmailTemplateRequest.Builder.class)
public final class EmailTemplateRequest {
    private final EmailTemplateType templateType;

    private final String name;

    private final String subject;

    private final String content;

    private final Optional<Boolean> isDefault;

    private final Map<String, Object> additionalProperties;

    private EmailTemplateRequest(
            EmailTemplateType templateType,
            String name,
            String subject,
            String content,
            Optional<Boolean> isDefault,
            Map<String, Object> additionalProperties) {
        this.templateType = templateType;
        this.name = name;
        this.subject = subject;
        this.content = content;
        this.isDefault = isDefault;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("templateType")
    public EmailTemplateType getTemplateType() {
        return templateType;
    }

    /**
     * @return The name of the email template.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return The subject of the email template.
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * @return The HTML content of the email template.
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     * @return If true, this email template will be used as the default template for new invoices.
     */
    @JsonProperty("isDefault")
    public Optional<Boolean> getIsDefault() {
        return isDefault;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EmailTemplateRequest && equalTo((EmailTemplateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EmailTemplateRequest other) {
        return templateType.equals(other.templateType)
                && name.equals(other.name)
                && subject.equals(other.subject)
                && content.equals(other.content)
                && isDefault.equals(other.isDefault);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.templateType, this.name, this.subject, this.content, this.isDefault);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TemplateTypeStage builder() {
        return new Builder();
    }

    public interface TemplateTypeStage {
        NameStage templateType(EmailTemplateType templateType);

        Builder from(EmailTemplateRequest other);
    }

    public interface NameStage {
        SubjectStage name(String name);
    }

    public interface SubjectStage {
        ContentStage subject(String subject);
    }

    public interface ContentStage {
        _FinalStage content(String content);
    }

    public interface _FinalStage {
        EmailTemplateRequest build();

        _FinalStage isDefault(Optional<Boolean> isDefault);

        _FinalStage isDefault(Boolean isDefault);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TemplateTypeStage, NameStage, SubjectStage, ContentStage, _FinalStage {
        private EmailTemplateType templateType;

        private String name;

        private String subject;

        private String content;

        private Optional<Boolean> isDefault = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EmailTemplateRequest other) {
            templateType(other.getTemplateType());
            name(other.getName());
            subject(other.getSubject());
            content(other.getContent());
            isDefault(other.getIsDefault());
            return this;
        }

        @java.lang.Override
        @JsonSetter("templateType")
        public NameStage templateType(EmailTemplateType templateType) {
            this.templateType = templateType;
            return this;
        }

        /**
         * <p>The name of the email template.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public SubjectStage name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The subject of the email template.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("subject")
        public ContentStage subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
         * <p>The HTML content of the email template.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("content")
        public _FinalStage content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>If true, this email template will be used as the default template for new invoices.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage isDefault(Boolean isDefault) {
            this.isDefault = Optional.ofNullable(isDefault);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "isDefault", nulls = Nulls.SKIP)
        public _FinalStage isDefault(Optional<Boolean> isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        @java.lang.Override
        public EmailTemplateRequest build() {
            return new EmailTemplateRequest(templateType, name, subject, content, isDefault, additionalProperties);
        }
    }
}
