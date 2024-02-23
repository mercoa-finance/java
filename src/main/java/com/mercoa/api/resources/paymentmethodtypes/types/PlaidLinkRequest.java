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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PlaidLinkRequest.Builder.class)
public final class PlaidLinkRequest {
    private final String accountId;

    private final Optional<String> publicToken;

    private final Optional<String> accessToken;

    private final Map<String, Object> additionalProperties;

    private PlaidLinkRequest(
            String accountId,
            Optional<String> publicToken,
            Optional<String> accessToken,
            Map<String, Object> additionalProperties) {
        this.accountId = accountId;
        this.publicToken = publicToken;
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
     * @return Public token received from Plaid Link. Use this if linking the account using the Plaid Link frontend component.
     */
    @JsonProperty("publicToken")
    public Optional<String> getPublicToken() {
        return publicToken;
    }

    /**
     * @return Plaid access token for the account. If you already have an access token for the account (for example, you have linked the account to your app already), use this instead of publicToken.
     */
    @JsonProperty("accessToken")
    public Optional<String> getAccessToken() {
        return accessToken;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PlaidLinkRequest && equalTo((PlaidLinkRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PlaidLinkRequest other) {
        return accountId.equals(other.accountId)
                && publicToken.equals(other.publicToken)
                && accessToken.equals(other.accessToken);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.accountId, this.publicToken, this.accessToken);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AccountIdStage builder() {
        return new Builder();
    }

    public interface AccountIdStage {
        _FinalStage accountId(String accountId);

        Builder from(PlaidLinkRequest other);
    }

    public interface _FinalStage {
        PlaidLinkRequest build();

        _FinalStage publicToken(Optional<String> publicToken);

        _FinalStage publicToken(String publicToken);

        _FinalStage accessToken(Optional<String> accessToken);

        _FinalStage accessToken(String accessToken);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AccountIdStage, _FinalStage {
        private String accountId;

        private Optional<String> accessToken = Optional.empty();

        private Optional<String> publicToken = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PlaidLinkRequest other) {
            accountId(other.getAccountId());
            publicToken(other.getPublicToken());
            accessToken(other.getAccessToken());
            return this;
        }

        /**
         * <p>Plaid account ID</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("accountId")
        public _FinalStage accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>Plaid access token for the account. If you already have an access token for the account (for example, you have linked the account to your app already), use this instead of publicToken.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage accessToken(String accessToken) {
            this.accessToken = Optional.of(accessToken);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "accessToken", nulls = Nulls.SKIP)
        public _FinalStage accessToken(Optional<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>Public token received from Plaid Link. Use this if linking the account using the Plaid Link frontend component.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage publicToken(String publicToken) {
            this.publicToken = Optional.of(publicToken);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "publicToken", nulls = Nulls.SKIP)
        public _FinalStage publicToken(Optional<String> publicToken) {
            this.publicToken = publicToken;
            return this;
        }

        @java.lang.Override
        public PlaidLinkRequest build() {
            return new PlaidLinkRequest(accountId, publicToken, accessToken, additionalProperties);
        }
    }
}
