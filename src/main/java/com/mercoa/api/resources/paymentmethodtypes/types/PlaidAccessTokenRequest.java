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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = PlaidAccessTokenRequest.Builder.class)
public final class PlaidAccessTokenRequest {
    private final String accountId;

    private final String accessToken;

    private final Map<String, Object> additionalProperties;

    private PlaidAccessTokenRequest(String accountId, String accessToken, Map<String, Object> additionalProperties) {
        this.accountId = accountId;
        this.accessToken = accessToken;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Plaid account ID
     */
    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    /**
     * @return Plaid access token for the account. If you already have an access token for the account (for example, you have linked the account to your app already), use this instead of publicToken.
     */
    @JsonProperty("accessToken")
    public String getAccessToken() {
        return accessToken;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PlaidAccessTokenRequest && equalTo((PlaidAccessTokenRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PlaidAccessTokenRequest other) {
        return accountId.equals(other.accountId) && accessToken.equals(other.accessToken);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.accountId, this.accessToken);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AccountIdStage builder() {
        return new Builder();
    }

    public interface AccountIdStage {
        AccessTokenStage accountId(String accountId);

        Builder from(PlaidAccessTokenRequest other);
    }

    public interface AccessTokenStage {
        _FinalStage accessToken(String accessToken);
    }

    public interface _FinalStage {
        PlaidAccessTokenRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AccountIdStage, AccessTokenStage, _FinalStage {
        private String accountId;

        private String accessToken;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PlaidAccessTokenRequest other) {
            accountId(other.getAccountId());
            accessToken(other.getAccessToken());
            return this;
        }

        /**
         * <p>Plaid account ID</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("accountId")
        public AccessTokenStage accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>Plaid access token for the account. If you already have an access token for the account (for example, you have linked the account to your app already), use this instead of publicToken.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("accessToken")
        public _FinalStage accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        @java.lang.Override
        public PlaidAccessTokenRequest build() {
            return new PlaidAccessTokenRequest(accountId, accessToken, additionalProperties);
        }
    }
}