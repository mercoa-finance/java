/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.organizationtypes.types;

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
@JsonDeserialize(builder = EmailProviderResponse.Builder.class)
public final class EmailProviderResponse {
    private final EmailSenderResponse sender;

    private final String inboxDomain;

    private final Map<String, Object> additionalProperties;

    private EmailProviderResponse(
            EmailSenderResponse sender, String inboxDomain, Map<String, Object> additionalProperties) {
        this.sender = sender;
        this.inboxDomain = inboxDomain;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("sender")
    public EmailSenderResponse getSender() {
        return sender;
    }

    @JsonProperty("inboxDomain")
    public String getInboxDomain() {
        return inboxDomain;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EmailProviderResponse && equalTo((EmailProviderResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EmailProviderResponse other) {
        return sender.equals(other.sender) && inboxDomain.equals(other.inboxDomain);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.sender, this.inboxDomain);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SenderStage builder() {
        return new Builder();
    }

    public interface SenderStage {
        InboxDomainStage sender(EmailSenderResponse sender);

        Builder from(EmailProviderResponse other);
    }

    public interface InboxDomainStage {
        _FinalStage inboxDomain(String inboxDomain);
    }

    public interface _FinalStage {
        EmailProviderResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SenderStage, InboxDomainStage, _FinalStage {
        private EmailSenderResponse sender;

        private String inboxDomain;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EmailProviderResponse other) {
            sender(other.getSender());
            inboxDomain(other.getInboxDomain());
            return this;
        }

        @java.lang.Override
        @JsonSetter("sender")
        public InboxDomainStage sender(EmailSenderResponse sender) {
            this.sender = sender;
            return this;
        }

        @java.lang.Override
        @JsonSetter("inboxDomain")
        public _FinalStage inboxDomain(String inboxDomain) {
            this.inboxDomain = inboxDomain;
            return this;
        }

        @java.lang.Override
        public EmailProviderResponse build() {
            return new EmailProviderResponse(sender, inboxDomain, additionalProperties);
        }
    }
}
