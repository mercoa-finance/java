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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ColorSchemeResponse.Builder.class)
public final class ColorSchemeResponse {
    private final Optional<String> primaryColor;

    private final Optional<String> secondaryColor;

    private final Optional<String> logoBackgroundColor;

    private final Optional<Integer> roundedCorners;

    private final Map<String, Object> additionalProperties;

    private ColorSchemeResponse(
            Optional<String> primaryColor,
            Optional<String> secondaryColor,
            Optional<String> logoBackgroundColor,
            Optional<Integer> roundedCorners,
            Map<String, Object> additionalProperties) {
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.logoBackgroundColor = logoBackgroundColor;
        this.roundedCorners = roundedCorners;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("primaryColor")
    public Optional<String> getPrimaryColor() {
        return primaryColor;
    }

    @JsonProperty("secondaryColor")
    public Optional<String> getSecondaryColor() {
        return secondaryColor;
    }

    @JsonProperty("logoBackgroundColor")
    public Optional<String> getLogoBackgroundColor() {
        return logoBackgroundColor;
    }

    @JsonProperty("roundedCorners")
    public Optional<Integer> getRoundedCorners() {
        return roundedCorners;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ColorSchemeResponse && equalTo((ColorSchemeResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ColorSchemeResponse other) {
        return primaryColor.equals(other.primaryColor)
                && secondaryColor.equals(other.secondaryColor)
                && logoBackgroundColor.equals(other.logoBackgroundColor)
                && roundedCorners.equals(other.roundedCorners);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.primaryColor, this.secondaryColor, this.logoBackgroundColor, this.roundedCorners);
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
        private Optional<String> primaryColor = Optional.empty();

        private Optional<String> secondaryColor = Optional.empty();

        private Optional<String> logoBackgroundColor = Optional.empty();

        private Optional<Integer> roundedCorners = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ColorSchemeResponse other) {
            primaryColor(other.getPrimaryColor());
            secondaryColor(other.getSecondaryColor());
            logoBackgroundColor(other.getLogoBackgroundColor());
            roundedCorners(other.getRoundedCorners());
            return this;
        }

        @JsonSetter(value = "primaryColor", nulls = Nulls.SKIP)
        public Builder primaryColor(Optional<String> primaryColor) {
            this.primaryColor = primaryColor;
            return this;
        }

        public Builder primaryColor(String primaryColor) {
            this.primaryColor = Optional.of(primaryColor);
            return this;
        }

        @JsonSetter(value = "secondaryColor", nulls = Nulls.SKIP)
        public Builder secondaryColor(Optional<String> secondaryColor) {
            this.secondaryColor = secondaryColor;
            return this;
        }

        public Builder secondaryColor(String secondaryColor) {
            this.secondaryColor = Optional.of(secondaryColor);
            return this;
        }

        @JsonSetter(value = "logoBackgroundColor", nulls = Nulls.SKIP)
        public Builder logoBackgroundColor(Optional<String> logoBackgroundColor) {
            this.logoBackgroundColor = logoBackgroundColor;
            return this;
        }

        public Builder logoBackgroundColor(String logoBackgroundColor) {
            this.logoBackgroundColor = Optional.of(logoBackgroundColor);
            return this;
        }

        @JsonSetter(value = "roundedCorners", nulls = Nulls.SKIP)
        public Builder roundedCorners(Optional<Integer> roundedCorners) {
            this.roundedCorners = roundedCorners;
            return this;
        }

        public Builder roundedCorners(Integer roundedCorners) {
            this.roundedCorners = Optional.of(roundedCorners);
            return this;
        }

        public ColorSchemeResponse build() {
            return new ColorSchemeResponse(
                    primaryColor, secondaryColor, logoBackgroundColor, roundedCorners, additionalProperties);
        }
    }
}
