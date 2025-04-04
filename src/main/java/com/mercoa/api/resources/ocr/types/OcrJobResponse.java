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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = OcrJobResponse.Builder.class)
public final class OcrJobResponse {
    private final String jobId;

    private final Optional<List<String>> linkedJobIds;

    private final OcrJobStatus status;

    private final Optional<OcrPageRange> pageRange;

    private final Optional<OcrResponse> data;

    private final Map<String, Object> additionalProperties;

    private OcrJobResponse(
            String jobId,
            Optional<List<String>> linkedJobIds,
            OcrJobStatus status,
            Optional<OcrPageRange> pageRange,
            Optional<OcrResponse> data,
            Map<String, Object> additionalProperties) {
        this.jobId = jobId;
        this.linkedJobIds = linkedJobIds;
        this.status = status;
        this.pageRange = pageRange;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("jobId")
    public String getJobId() {
        return jobId;
    }

    /**
     * @return The IDs of any OCR jobs that are processing other subdocuments of the same document.
     */
    @JsonProperty("linkedJobIds")
    public Optional<List<String>> getLinkedJobIds() {
        return linkedJobIds;
    }

    /**
     * @return The status of the OCR job.
     */
    @JsonProperty("status")
    public OcrJobStatus getStatus() {
        return status;
    }

    /**
     * @return The start and end page numbers of the corresponding subdocument (zero-indexed, inclusive). If not provided, the document was not split during OCR.
     */
    @JsonProperty("pageRange")
    public Optional<OcrPageRange> getPageRange() {
        return pageRange;
    }

    @JsonProperty("data")
    public Optional<OcrResponse> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OcrJobResponse && equalTo((OcrJobResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(OcrJobResponse other) {
        return jobId.equals(other.jobId)
                && linkedJobIds.equals(other.linkedJobIds)
                && status.equals(other.status)
                && pageRange.equals(other.pageRange)
                && data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.jobId, this.linkedJobIds, this.status, this.pageRange, this.data);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static JobIdStage builder() {
        return new Builder();
    }

    public interface JobIdStage {
        StatusStage jobId(@NotNull String jobId);

        Builder from(OcrJobResponse other);
    }

    public interface StatusStage {
        _FinalStage status(@NotNull OcrJobStatus status);
    }

    public interface _FinalStage {
        OcrJobResponse build();

        _FinalStage linkedJobIds(Optional<List<String>> linkedJobIds);

        _FinalStage linkedJobIds(List<String> linkedJobIds);

        _FinalStage pageRange(Optional<OcrPageRange> pageRange);

        _FinalStage pageRange(OcrPageRange pageRange);

        _FinalStage data(Optional<OcrResponse> data);

        _FinalStage data(OcrResponse data);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements JobIdStage, StatusStage, _FinalStage {
        private String jobId;

        private OcrJobStatus status;

        private Optional<OcrResponse> data = Optional.empty();

        private Optional<OcrPageRange> pageRange = Optional.empty();

        private Optional<List<String>> linkedJobIds = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(OcrJobResponse other) {
            jobId(other.getJobId());
            linkedJobIds(other.getLinkedJobIds());
            status(other.getStatus());
            pageRange(other.getPageRange());
            data(other.getData());
            return this;
        }

        @java.lang.Override
        @JsonSetter("jobId")
        public StatusStage jobId(@NotNull String jobId) {
            this.jobId = Objects.requireNonNull(jobId, "jobId must not be null");
            return this;
        }

        /**
         * <p>The status of the OCR job.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("status")
        public _FinalStage status(@NotNull OcrJobStatus status) {
            this.status = Objects.requireNonNull(status, "status must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage data(OcrResponse data) {
            this.data = Optional.ofNullable(data);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(Optional<OcrResponse> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The start and end page numbers of the corresponding subdocument (zero-indexed, inclusive). If not provided, the document was not split during OCR.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage pageRange(OcrPageRange pageRange) {
            this.pageRange = Optional.ofNullable(pageRange);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "pageRange", nulls = Nulls.SKIP)
        public _FinalStage pageRange(Optional<OcrPageRange> pageRange) {
            this.pageRange = pageRange;
            return this;
        }

        /**
         * <p>The IDs of any OCR jobs that are processing other subdocuments of the same document.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage linkedJobIds(List<String> linkedJobIds) {
            this.linkedJobIds = Optional.ofNullable(linkedJobIds);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "linkedJobIds", nulls = Nulls.SKIP)
        public _FinalStage linkedJobIds(Optional<List<String>> linkedJobIds) {
            this.linkedJobIds = linkedJobIds;
            return this;
        }

        @java.lang.Override
        public OcrJobResponse build() {
            return new OcrJobResponse(jobId, linkedJobIds, status, pageRange, data, additionalProperties);
        }
    }
}
