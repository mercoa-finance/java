/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.paymentmethodtypes.types;

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
@JsonDeserialize(builder = PlaidPublicTokenRequest.Builder.class)
public final class PlaidPublicTokenRequest {
    private final Optional<String> accountId;

    private final String publicToken;

    private final Map<String, Object> additionalProperties;

    private PlaidPublicTokenRequest(
            Optional<String> accountId, String publicToken, Map<String, Object> additionalProperties) {
        this.accountId = accountId;
        this.publicToken = publicToken;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Plaid account ID. If not provided, will try to match the provided routing number and account number.
     */
    @JsonProperty("accountId")
    public Optional<String> getAccountId() {
        return accountId;
    }

    /**
     * @return Public token received from Plaid Link. Use this if linking the account using the Plaid Link frontend component.
     */
    @JsonProperty("publicToken")
    public String getPublicToken() {
        return publicToken;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PlaidPublicTokenRequest && equalTo((PlaidPublicTokenRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PlaidPublicTokenRequest other) {
        return accountId.equals(other.accountId) && publicToken.equals(other.publicToken);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.accountId, this.publicToken);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static PublicTokenStage builder() {
        return new Builder();
    }

    public interface PublicTokenStage {
        _FinalStage publicToken(@NotNull String publicToken);

        Builder from(PlaidPublicTokenRequest other);
    }

    public interface _FinalStage {
        PlaidPublicTokenRequest build();

        _FinalStage accountId(Optional<String> accountId);

        _FinalStage accountId(String accountId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements PublicTokenStage, _FinalStage {
        private String publicToken;

        private Optional<String> accountId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PlaidPublicTokenRequest other) {
            accountId(other.getAccountId());
            publicToken(other.getPublicToken());
            return this;
        }

        /**
         * <p>Public token received from Plaid Link. Use this if linking the account using the Plaid Link frontend component.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("publicToken")
        public _FinalStage publicToken(@NotNull String publicToken) {
            this.publicToken = Objects.requireNonNull(publicToken, "publicToken must not be null");
            return this;
        }

        /**
         * <p>Plaid account ID. If not provided, will try to match the provided routing number and account number.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage accountId(String accountId) {
            this.accountId = Optional.ofNullable(accountId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "accountId", nulls = Nulls.SKIP)
        public _FinalStage accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        @java.lang.Override
        public PlaidPublicTokenRequest build() {
            return new PlaidPublicTokenRequest(accountId, publicToken, additionalProperties);
        }
    }
}
