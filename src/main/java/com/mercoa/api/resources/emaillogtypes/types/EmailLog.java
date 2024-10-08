/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.emaillogtypes.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = EmailLog.Builder.class)
public final class EmailLog {
    private final String id;

    private final String subject;

    private final String from;

    private final String to;

    private final String htmlBody;

    private final String textBody;

    private final OffsetDateTime createdAt;

    private final Optional<String> invoiceId;

    private final Map<String, Object> additionalProperties;

    private EmailLog(
            String id,
            String subject,
            String from,
            String to,
            String htmlBody,
            String textBody,
            OffsetDateTime createdAt,
            Optional<String> invoiceId,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.subject = subject;
        this.from = from;
        this.to = to;
        this.htmlBody = htmlBody;
        this.textBody = textBody;
        this.createdAt = createdAt;
        this.invoiceId = invoiceId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    @JsonProperty("htmlBody")
    public String getHtmlBody() {
        return htmlBody;
    }

    @JsonProperty("textBody")
    public String getTextBody() {
        return textBody;
    }

    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("invoiceId")
    public Optional<String> getInvoiceId() {
        return invoiceId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EmailLog && equalTo((EmailLog) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EmailLog other) {
        return id.equals(other.id)
                && subject.equals(other.subject)
                && from.equals(other.from)
                && to.equals(other.to)
                && htmlBody.equals(other.htmlBody)
                && textBody.equals(other.textBody)
                && createdAt.equals(other.createdAt)
                && invoiceId.equals(other.invoiceId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.subject,
                this.from,
                this.to,
                this.htmlBody,
                this.textBody,
                this.createdAt,
                this.invoiceId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        SubjectStage id(String id);

        Builder from(EmailLog other);
    }

    public interface SubjectStage {
        FromStage subject(String subject);
    }

    public interface FromStage {
        ToStage from(String from);
    }

    public interface ToStage {
        HtmlBodyStage to(String to);
    }

    public interface HtmlBodyStage {
        TextBodyStage htmlBody(String htmlBody);
    }

    public interface TextBodyStage {
        CreatedAtStage textBody(String textBody);
    }

    public interface CreatedAtStage {
        _FinalStage createdAt(OffsetDateTime createdAt);
    }

    public interface _FinalStage {
        EmailLog build();

        _FinalStage invoiceId(Optional<String> invoiceId);

        _FinalStage invoiceId(String invoiceId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    SubjectStage,
                    FromStage,
                    ToStage,
                    HtmlBodyStage,
                    TextBodyStage,
                    CreatedAtStage,
                    _FinalStage {
        private String id;

        private String subject;

        private String from;

        private String to;

        private String htmlBody;

        private String textBody;

        private OffsetDateTime createdAt;

        private Optional<String> invoiceId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EmailLog other) {
            id(other.getId());
            subject(other.getSubject());
            from(other.getFrom());
            to(other.getTo());
            htmlBody(other.getHtmlBody());
            textBody(other.getTextBody());
            createdAt(other.getCreatedAt());
            invoiceId(other.getInvoiceId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public SubjectStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("subject")
        public FromStage subject(String subject) {
            this.subject = subject;
            return this;
        }

        @java.lang.Override
        @JsonSetter("from")
        public ToStage from(String from) {
            this.from = from;
            return this;
        }

        @java.lang.Override
        @JsonSetter("to")
        public HtmlBodyStage to(String to) {
            this.to = to;
            return this;
        }

        @java.lang.Override
        @JsonSetter("htmlBody")
        public TextBodyStage htmlBody(String htmlBody) {
            this.htmlBody = htmlBody;
            return this;
        }

        @java.lang.Override
        @JsonSetter("textBody")
        public CreatedAtStage textBody(String textBody) {
            this.textBody = textBody;
            return this;
        }

        @java.lang.Override
        @JsonSetter("createdAt")
        public _FinalStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        public _FinalStage invoiceId(String invoiceId) {
            this.invoiceId = Optional.ofNullable(invoiceId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "invoiceId", nulls = Nulls.SKIP)
        public _FinalStage invoiceId(Optional<String> invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        @java.lang.Override
        public EmailLog build() {
            return new EmailLog(id, subject, from, to, htmlBody, textBody, createdAt, invoiceId, additionalProperties);
        }
    }
}
