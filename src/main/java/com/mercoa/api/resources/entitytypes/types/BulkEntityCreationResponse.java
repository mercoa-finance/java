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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = BulkEntityCreationResponse.Builder.class)
public final class BulkEntityCreationResponse {
    private final List<BulkEntityCreationFromObjectResponse> data;

    private final Map<String, Object> additionalProperties;

    private BulkEntityCreationResponse(
            List<BulkEntityCreationFromObjectResponse> data, Map<String, Object> additionalProperties) {
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("data")
    public List<BulkEntityCreationFromObjectResponse> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BulkEntityCreationResponse && equalTo((BulkEntityCreationResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BulkEntityCreationResponse other) {
        return data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.data);
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
        private List<BulkEntityCreationFromObjectResponse> data = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(BulkEntityCreationResponse other) {
            data(other.getData());
            return this;
        }

        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public Builder data(List<BulkEntityCreationFromObjectResponse> data) {
            this.data.clear();
            this.data.addAll(data);
            return this;
        }

        public Builder addData(BulkEntityCreationFromObjectResponse data) {
            this.data.add(data);
            return this;
        }

        public Builder addAllData(List<BulkEntityCreationFromObjectResponse> data) {
            this.data.addAll(data);
            return this;
        }

        public BulkEntityCreationResponse build() {
            return new BulkEntityCreationResponse(data, additionalProperties);
        }
    }
}
