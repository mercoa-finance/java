/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.commons.types;

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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Address.Builder.class)
public final class Address {
    private final String addressLine1;

    private final Optional<String> addressLine2;

    private final String city;

    private final String stateOrProvince;

    private final String postalCode;

    private final Optional<String> country;

    private final Map<String, Object> additionalProperties;

    private Address(
            String addressLine1,
            Optional<String> addressLine2,
            String city,
            String stateOrProvince,
            String postalCode,
            Optional<String> country,
            Map<String, Object> additionalProperties) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.stateOrProvince = stateOrProvince;
        this.postalCode = postalCode;
        this.country = country;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("addressLine2")
    public Optional<String> getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * @return State or province code. Must be in the format XX.
     */
    @JsonProperty("stateOrProvince")
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * @return Postal code. Must be in the format XXXXX or XXXXX-XXXX.
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("country")
    public Optional<String> getCountry() {
        return country;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Address && equalTo((Address) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Address other) {
        return addressLine1.equals(other.addressLine1)
                && addressLine2.equals(other.addressLine2)
                && city.equals(other.city)
                && stateOrProvince.equals(other.stateOrProvince)
                && postalCode.equals(other.postalCode)
                && country.equals(other.country);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.addressLine1, this.addressLine2, this.city, this.stateOrProvince, this.postalCode, this.country);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AddressLine1Stage builder() {
        return new Builder();
    }

    public interface AddressLine1Stage {
        CityStage addressLine1(@NotNull String addressLine1);

        Builder from(Address other);
    }

    public interface CityStage {
        StateOrProvinceStage city(@NotNull String city);
    }

    public interface StateOrProvinceStage {
        PostalCodeStage stateOrProvince(@NotNull String stateOrProvince);
    }

    public interface PostalCodeStage {
        _FinalStage postalCode(@NotNull String postalCode);
    }

    public interface _FinalStage {
        Address build();

        _FinalStage addressLine2(Optional<String> addressLine2);

        _FinalStage addressLine2(String addressLine2);

        _FinalStage country(Optional<String> country);

        _FinalStage country(String country);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AddressLine1Stage, CityStage, StateOrProvinceStage, PostalCodeStage, _FinalStage {
        private String addressLine1;

        private String city;

        private String stateOrProvince;

        private String postalCode;

        private Optional<String> country = Optional.empty();

        private Optional<String> addressLine2 = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Address other) {
            addressLine1(other.getAddressLine1());
            addressLine2(other.getAddressLine2());
            city(other.getCity());
            stateOrProvince(other.getStateOrProvince());
            postalCode(other.getPostalCode());
            country(other.getCountry());
            return this;
        }

        @java.lang.Override
        @JsonSetter("addressLine1")
        public CityStage addressLine1(@NotNull String addressLine1) {
            this.addressLine1 = Objects.requireNonNull(addressLine1, "addressLine1 must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("city")
        public StateOrProvinceStage city(@NotNull String city) {
            this.city = Objects.requireNonNull(city, "city must not be null");
            return this;
        }

        /**
         * <p>State or province code. Must be in the format XX.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("stateOrProvince")
        public PostalCodeStage stateOrProvince(@NotNull String stateOrProvince) {
            this.stateOrProvince = Objects.requireNonNull(stateOrProvince, "stateOrProvince must not be null");
            return this;
        }

        /**
         * <p>Postal code. Must be in the format XXXXX or XXXXX-XXXX.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("postalCode")
        public _FinalStage postalCode(@NotNull String postalCode) {
            this.postalCode = Objects.requireNonNull(postalCode, "postalCode must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage country(String country) {
            this.country = Optional.ofNullable(country);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "country", nulls = Nulls.SKIP)
        public _FinalStage country(Optional<String> country) {
            this.country = country;
            return this;
        }

        @java.lang.Override
        public _FinalStage addressLine2(String addressLine2) {
            this.addressLine2 = Optional.ofNullable(addressLine2);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "addressLine2", nulls = Nulls.SKIP)
        public _FinalStage addressLine2(Optional<String> addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        @java.lang.Override
        public Address build() {
            return new Address(
                    addressLine1, addressLine2, city, stateOrProvince, postalCode, country, additionalProperties);
        }
    }
}
