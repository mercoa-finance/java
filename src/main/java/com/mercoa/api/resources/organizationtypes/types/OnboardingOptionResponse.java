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
@JsonDeserialize(builder = OnboardingOptionResponse.Builder.class)
public final class OnboardingOptionResponse {
    private final boolean show;

    private final boolean edit;

    private final boolean required;

    private final Map<String, Object> additionalProperties;

    private OnboardingOptionResponse(
            boolean show, boolean edit, boolean required, Map<String, Object> additionalProperties) {
        this.show = show;
        this.edit = edit;
        this.required = required;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("show")
    public boolean getShow() {
        return show;
    }

    @JsonProperty("edit")
    public boolean getEdit() {
        return edit;
    }

    @JsonProperty("required")
    public boolean getRequired() {
        return required;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OnboardingOptionResponse && equalTo((OnboardingOptionResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(OnboardingOptionResponse other) {
        return show == other.show && edit == other.edit && required == other.required;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.show, this.edit, this.required);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ShowStage builder() {
        return new Builder();
    }

    public interface ShowStage {
        EditStage show(boolean show);

        Builder from(OnboardingOptionResponse other);
    }

    public interface EditStage {
        RequiredStage edit(boolean edit);
    }

    public interface RequiredStage {
        _FinalStage required(boolean required);
    }

    public interface _FinalStage {
        OnboardingOptionResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ShowStage, EditStage, RequiredStage, _FinalStage {
        private boolean show;

        private boolean edit;

        private boolean required;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(OnboardingOptionResponse other) {
            show(other.getShow());
            edit(other.getEdit());
            required(other.getRequired());
            return this;
        }

        @java.lang.Override
        @JsonSetter("show")
        public EditStage show(boolean show) {
            this.show = show;
            return this;
        }

        @java.lang.Override
        @JsonSetter("edit")
        public RequiredStage edit(boolean edit) {
            this.edit = edit;
            return this;
        }

        @java.lang.Override
        @JsonSetter("required")
        public _FinalStage required(boolean required) {
            this.required = required;
            return this;
        }

        @java.lang.Override
        public OnboardingOptionResponse build() {
            return new OnboardingOptionResponse(show, edit, required, additionalProperties);
        }
    }
}
