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
import com.mercoa.api.resources.commons.types.StringOrStringArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = MetadataFilter.Builder.class)
public final class MetadataFilter {
    private final String key;

    private final StringOrStringArray value;

    private final Map<String, Object> additionalProperties;

    private MetadataFilter(String key, StringOrStringArray value, Map<String, Object> additionalProperties) {
        this.key = key;
        this.value = value;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * @return If multiple values are provided, the filter will match if any of the values match (OR filter). To filter for the absence of a key, use the value 'NULL'. To filter for the presence of a key, use the value 'NOT NULL'.
     */
    @JsonProperty("value")
    public StringOrStringArray getValue() {
        return value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MetadataFilter && equalTo((MetadataFilter) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(MetadataFilter other) {
        return key.equals(other.key) && value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.key, this.value);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static KeyStage builder() {
        return new Builder();
    }

    public interface KeyStage {
        ValueStage key(@NotNull String key);

        Builder from(MetadataFilter other);
    }

    public interface ValueStage {
        _FinalStage value(@NotNull StringOrStringArray value);
    }

    public interface _FinalStage {
        MetadataFilter build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements KeyStage, ValueStage, _FinalStage {
        private String key;

        private StringOrStringArray value;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(MetadataFilter other) {
            key(other.getKey());
            value(other.getValue());
            return this;
        }

        @java.lang.Override
        @JsonSetter("key")
        public ValueStage key(@NotNull String key) {
            this.key = Objects.requireNonNull(key, "key must not be null");
            return this;
        }

        /**
         * <p>If multiple values are provided, the filter will match if any of the values match (OR filter). To filter for the absence of a key, use the value 'NULL'. To filter for the presence of a key, use the value 'NOT NULL'.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("value")
        public _FinalStage value(@NotNull StringOrStringArray value) {
            this.value = Objects.requireNonNull(value, "value must not be null");
            return this;
        }

        @java.lang.Override
        public MetadataFilter build() {
            return new MetadataFilter(key, value, additionalProperties);
        }
    }
}
