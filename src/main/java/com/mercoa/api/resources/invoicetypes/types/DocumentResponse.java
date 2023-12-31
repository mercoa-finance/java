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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DocumentResponse.Builder.class)
public final class DocumentResponse {
    private final String mimeType;

    private final String uri;

    private final Map<String, Object> additionalProperties;

    private DocumentResponse(String mimeType, String uri, Map<String, Object> additionalProperties) {
        this.mimeType = mimeType;
        this.uri = uri;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DocumentResponse && equalTo((DocumentResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DocumentResponse other) {
        return mimeType.equals(other.mimeType) && uri.equals(other.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.mimeType, this.uri);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MimeTypeStage builder() {
        return new Builder();
    }

    public interface MimeTypeStage {
        UriStage mimeType(String mimeType);

        Builder from(DocumentResponse other);
    }

    public interface UriStage {
        _FinalStage uri(String uri);
    }

    public interface _FinalStage {
        DocumentResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MimeTypeStage, UriStage, _FinalStage {
        private String mimeType;

        private String uri;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(DocumentResponse other) {
            mimeType(other.getMimeType());
            uri(other.getUri());
            return this;
        }

        @Override
        @JsonSetter("mimeType")
        public UriStage mimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        @Override
        @JsonSetter("uri")
        public _FinalStage uri(String uri) {
            this.uri = uri;
            return this;
        }

        @Override
        public DocumentResponse build() {
            return new DocumentResponse(mimeType, uri, additionalProperties);
        }
    }
}
