/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entity.externalaccountingsystem.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.entity.externalaccountingsystem.types.SyncType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = SyncExternalSystemRequest.Builder.class)
public final class SyncExternalSystemRequest {
    private final Optional<SyncType> vendors;

    private final Optional<SyncType> bills;

    private final Optional<SyncType> glAccounts;

    private final Map<String, Object> additionalProperties;

    private SyncExternalSystemRequest(
            Optional<SyncType> vendors,
            Optional<SyncType> bills,
            Optional<SyncType> glAccounts,
            Map<String, Object> additionalProperties) {
        this.vendors = vendors;
        this.bills = bills;
        this.glAccounts = glAccounts;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Sync vendors from external accounting system. Default is to pull vendors from external system.
     */
    @JsonProperty("vendors")
    public Optional<SyncType> getVendors() {
        return vendors;
    }

    /**
     * @return Sync bills from external accounting system. Default is to not sync bills. Invoices that already exist in both systems will not be updated, only new invoices not present in the other system will be created.
     */
    @JsonProperty("bills")
    public Optional<SyncType> getBills() {
        return bills;
    }

    /**
     * @return Sync GL accounts from external accounting system. Default is to pull GL accounts from external system. Pushing GL accounts is not supported.
     */
    @JsonProperty("glAccounts")
    public Optional<SyncType> getGlAccounts() {
        return glAccounts;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SyncExternalSystemRequest && equalTo((SyncExternalSystemRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SyncExternalSystemRequest other) {
        return vendors.equals(other.vendors) && bills.equals(other.bills) && glAccounts.equals(other.glAccounts);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.vendors, this.bills, this.glAccounts);
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
        private Optional<SyncType> vendors = Optional.empty();

        private Optional<SyncType> bills = Optional.empty();

        private Optional<SyncType> glAccounts = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(SyncExternalSystemRequest other) {
            vendors(other.getVendors());
            bills(other.getBills());
            glAccounts(other.getGlAccounts());
            return this;
        }

        @JsonSetter(value = "vendors", nulls = Nulls.SKIP)
        public Builder vendors(Optional<SyncType> vendors) {
            this.vendors = vendors;
            return this;
        }

        public Builder vendors(SyncType vendors) {
            this.vendors = Optional.ofNullable(vendors);
            return this;
        }

        @JsonSetter(value = "bills", nulls = Nulls.SKIP)
        public Builder bills(Optional<SyncType> bills) {
            this.bills = bills;
            return this;
        }

        public Builder bills(SyncType bills) {
            this.bills = Optional.ofNullable(bills);
            return this;
        }

        @JsonSetter(value = "glAccounts", nulls = Nulls.SKIP)
        public Builder glAccounts(Optional<SyncType> glAccounts) {
            this.glAccounts = glAccounts;
            return this;
        }

        public Builder glAccounts(SyncType glAccounts) {
            this.glAccounts = Optional.ofNullable(glAccounts);
            return this;
        }

        public SyncExternalSystemRequest build() {
            return new SyncExternalSystemRequest(vendors, bills, glAccounts, additionalProperties);
        }
    }
}
