/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.ocr.types;

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
@JsonDeserialize(builder = OcrAsyncResponse.Builder.class)
public final class OcrAsyncResponse {
    private final String jobId;

    private final Map<String, Object> additionalProperties;

    private OcrAsyncResponse(String jobId, Map<String, Object> additionalProperties) {
        this.jobId = jobId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("jobId")
    public String getJobId() {
        return jobId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OcrAsyncResponse && equalTo((OcrAsyncResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(OcrAsyncResponse other) {
        return jobId.equals(other.jobId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.jobId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static JobIdStage builder() {
        return new Builder();
    }

    public interface JobIdStage {
        _FinalStage jobId(String jobId);

        Builder from(OcrAsyncResponse other);
    }

    public interface _FinalStage {
        OcrAsyncResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements JobIdStage, _FinalStage {
        private String jobId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(OcrAsyncResponse other) {
            jobId(other.getJobId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("jobId")
        public _FinalStage jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        @java.lang.Override
        public OcrAsyncResponse build() {
            return new OcrAsyncResponse(jobId, additionalProperties);
        }
    }
}
