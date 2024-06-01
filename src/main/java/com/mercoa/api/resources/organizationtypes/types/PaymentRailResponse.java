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
import com.mercoa.api.resources.paymentmethodtypes.types.PaymentMethodType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PaymentRailResponse.Builder.class)
public final class PaymentRailResponse {
    private final PaymentMethodType type;

    private final String name;

    private final boolean active;

    private final Map<String, Object> additionalProperties;

    private PaymentRailResponse(
            PaymentMethodType type, String name, boolean active, Map<String, Object> additionalProperties) {
        this.type = type;
        this.name = name;
        this.active = active;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("type")
    public PaymentMethodType getType() {
        return type;
    }

    /**
     * @return For custom payment methods, this is the ID of the schema.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("active")
    public boolean getActive() {
        return active;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PaymentRailResponse && equalTo((PaymentRailResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PaymentRailResponse other) {
        return type.equals(other.type) && name.equals(other.name) && active == other.active;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.type, this.name, this.active);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        NameStage type(PaymentMethodType type);

        Builder from(PaymentRailResponse other);
    }

    public interface NameStage {
        ActiveStage name(String name);
    }

    public interface ActiveStage {
        _FinalStage active(boolean active);
    }

    public interface _FinalStage {
        PaymentRailResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TypeStage, NameStage, ActiveStage, _FinalStage {
        private PaymentMethodType type;

        private String name;

        private boolean active;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PaymentRailResponse other) {
            type(other.getType());
            name(other.getName());
            active(other.getActive());
            return this;
        }

        @java.lang.Override
        @JsonSetter("type")
        public NameStage type(PaymentMethodType type) {
            this.type = type;
            return this;
        }

        /**
         * <p>For custom payment methods, this is the ID of the schema.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public ActiveStage name(String name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        @JsonSetter("active")
        public _FinalStage active(boolean active) {
            this.active = active;
            return this;
        }

        @java.lang.Override
        public PaymentRailResponse build() {
            return new PaymentRailResponse(type, name, active, additionalProperties);
        }
    }
}
