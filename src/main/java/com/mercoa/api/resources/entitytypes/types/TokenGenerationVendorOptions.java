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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TokenGenerationVendorOptions.Builder.class)
public final class TokenGenerationVendorOptions {
    private final Optional<Boolean> disableCreation;

    private final VendorNetwork network;

    private final Map<String, Object> additionalProperties;

    private TokenGenerationVendorOptions(
            Optional<Boolean> disableCreation, VendorNetwork network, Map<String, Object> additionalProperties) {
        this.disableCreation = disableCreation;
        this.network = network;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If true, the user will not be able to create new vendors.
     */
    @JsonProperty("disableCreation")
    public Optional<Boolean> getDisableCreation() {
        return disableCreation;
    }

    @JsonProperty("network")
    public VendorNetwork getNetwork() {
        return network;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TokenGenerationVendorOptions && equalTo((TokenGenerationVendorOptions) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TokenGenerationVendorOptions other) {
        return disableCreation.equals(other.disableCreation) && network.equals(other.network);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.disableCreation, this.network);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NetworkStage builder() {
        return new Builder();
    }

    public interface NetworkStage {
        _FinalStage network(VendorNetwork network);

        Builder from(TokenGenerationVendorOptions other);
    }

    public interface _FinalStage {
        TokenGenerationVendorOptions build();

        _FinalStage disableCreation(Optional<Boolean> disableCreation);

        _FinalStage disableCreation(Boolean disableCreation);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NetworkStage, _FinalStage {
        private VendorNetwork network;

        private Optional<Boolean> disableCreation = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TokenGenerationVendorOptions other) {
            disableCreation(other.getDisableCreation());
            network(other.getNetwork());
            return this;
        }

        @java.lang.Override
        @JsonSetter("network")
        public _FinalStage network(VendorNetwork network) {
            this.network = network;
            return this;
        }

        /**
         * <p>If true, the user will not be able to create new vendors.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage disableCreation(Boolean disableCreation) {
            this.disableCreation = Optional.of(disableCreation);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "disableCreation", nulls = Nulls.SKIP)
        public _FinalStage disableCreation(Optional<Boolean> disableCreation) {
            this.disableCreation = disableCreation;
            return this;
        }

        @java.lang.Override
        public TokenGenerationVendorOptions build() {
            return new TokenGenerationVendorOptions(disableCreation, network, additionalProperties);
        }
    }
}
