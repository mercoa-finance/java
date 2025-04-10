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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = InvoiceLineItemIndividualUpdateRequest.Builder.class)
public final class InvoiceLineItemIndividualUpdateRequest {
    private final Optional<String> name;

    private final Optional<String> description;

    private final Optional<String> category;

    private final Optional<OffsetDateTime> serviceStartDate;

    private final Optional<OffsetDateTime> serviceEndDate;

    private final Optional<Map<String, String>> metadata;

    private final Optional<String> glAccountId;

    private final Map<String, Object> additionalProperties;

    private InvoiceLineItemIndividualUpdateRequest(
            Optional<String> name,
            Optional<String> description,
            Optional<String> category,
            Optional<OffsetDateTime> serviceStartDate,
            Optional<OffsetDateTime> serviceEndDate,
            Optional<Map<String, String>> metadata,
            Optional<String> glAccountId,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.serviceStartDate = serviceStartDate;
        this.serviceEndDate = serviceEndDate;
        this.metadata = metadata;
        this.glAccountId = glAccountId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    /**
     * @return Category of the line item.
     */
    @JsonProperty("category")
    public Optional<String> getCategory() {
        return category;
    }

    @JsonProperty("serviceStartDate")
    public Optional<OffsetDateTime> getServiceStartDate() {
        return serviceStartDate;
    }

    @JsonProperty("serviceEndDate")
    public Optional<OffsetDateTime> getServiceEndDate() {
        return serviceEndDate;
    }

    @JsonProperty("metadata")
    public Optional<Map<String, String>> getMetadata() {
        return metadata;
    }

    /**
     * @return ID of general ledger account associated with this line item.
     */
    @JsonProperty("glAccountId")
    public Optional<String> getGlAccountId() {
        return glAccountId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof InvoiceLineItemIndividualUpdateRequest
                && equalTo((InvoiceLineItemIndividualUpdateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(InvoiceLineItemIndividualUpdateRequest other) {
        return name.equals(other.name)
                && description.equals(other.description)
                && category.equals(other.category)
                && serviceStartDate.equals(other.serviceStartDate)
                && serviceEndDate.equals(other.serviceEndDate)
                && metadata.equals(other.metadata)
                && glAccountId.equals(other.glAccountId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.description,
                this.category,
                this.serviceStartDate,
                this.serviceEndDate,
                this.metadata,
                this.glAccountId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> name = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> category = Optional.empty();

        private Optional<OffsetDateTime> serviceStartDate = Optional.empty();

        private Optional<OffsetDateTime> serviceEndDate = Optional.empty();

        private Optional<Map<String, String>> metadata = Optional.empty();

        private Optional<String> glAccountId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(InvoiceLineItemIndividualUpdateRequest other) {
            name(other.getName());
            description(other.getDescription());
            category(other.getCategory());
            serviceStartDate(other.getServiceStartDate());
            serviceEndDate(other.getServiceEndDate());
            metadata(other.getMetadata());
            glAccountId(other.getGlAccountId());
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public Builder description(Optional<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(String description) {
            this.description = Optional.ofNullable(description);
            return this;
        }

        @JsonSetter(value = "category", nulls = Nulls.SKIP)
        public Builder category(Optional<String> category) {
            this.category = category;
            return this;
        }

        public Builder category(String category) {
            this.category = Optional.ofNullable(category);
            return this;
        }

        @JsonSetter(value = "serviceStartDate", nulls = Nulls.SKIP)
        public Builder serviceStartDate(Optional<OffsetDateTime> serviceStartDate) {
            this.serviceStartDate = serviceStartDate;
            return this;
        }

        public Builder serviceStartDate(OffsetDateTime serviceStartDate) {
            this.serviceStartDate = Optional.ofNullable(serviceStartDate);
            return this;
        }

        @JsonSetter(value = "serviceEndDate", nulls = Nulls.SKIP)
        public Builder serviceEndDate(Optional<OffsetDateTime> serviceEndDate) {
            this.serviceEndDate = serviceEndDate;
            return this;
        }

        public Builder serviceEndDate(OffsetDateTime serviceEndDate) {
            this.serviceEndDate = Optional.ofNullable(serviceEndDate);
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<Map<String, String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String, String> metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @JsonSetter(value = "glAccountId", nulls = Nulls.SKIP)
        public Builder glAccountId(Optional<String> glAccountId) {
            this.glAccountId = glAccountId;
            return this;
        }

        public Builder glAccountId(String glAccountId) {
            this.glAccountId = Optional.ofNullable(glAccountId);
            return this;
        }

        public InvoiceLineItemIndividualUpdateRequest build() {
            return new InvoiceLineItemIndividualUpdateRequest(
                    name,
                    description,
                    category,
                    serviceStartDate,
                    serviceEndDate,
                    metadata,
                    glAccountId,
                    additionalProperties);
        }
    }
}
