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
@JsonDeserialize(builder = CardRequest.Builder.class)
public final class CardRequest implements IPaymentMethodBaseRequest {
    private final Optional<Boolean> defaultSource;

    private final Optional<Boolean> defaultDestination;

    private final Optional<String> externalAccountingSystemId;

    private final CardType cardType;

    private final CardBrand cardBrand;

    private final String lastFour;

    private final String expMonth;

    private final String expYear;

    private final String token;

    private final Map<String, Object> additionalProperties;

    private CardRequest(
            Optional<Boolean> defaultSource,
            Optional<Boolean> defaultDestination,
            Optional<String> externalAccountingSystemId,
            CardType cardType,
            CardBrand cardBrand,
            String lastFour,
            String expMonth,
            String expYear,
            String token,
            Map<String, Object> additionalProperties) {
        this.defaultSource = defaultSource;
        this.defaultDestination = defaultDestination;
        this.externalAccountingSystemId = externalAccountingSystemId;
        this.cardType = cardType;
        this.cardBrand = cardBrand;
        this.lastFour = lastFour;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.token = token;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If true, this payment method will be set as the default source. Only one payment method can be set as the default source. If another payment method is already set as the default source, it will be unset.
     */
    @JsonProperty("defaultSource")
    @java.lang.Override
    public Optional<Boolean> getDefaultSource() {
        return defaultSource;
    }

    /**
     * @return If true, this payment method will be set as the default destination. Only one payment method can be set as the default destination. If another payment method is already set as the default destination, it will be unset.
     */
    @JsonProperty("defaultDestination")
    @java.lang.Override
    public Optional<Boolean> getDefaultDestination() {
        return defaultDestination;
    }

    /**
     * @return ID for this payment method in the external accounting system (e.g Rutter or Codat)
     */
    @JsonProperty("externalAccountingSystemId")
    @java.lang.Override
    public Optional<String> getExternalAccountingSystemId() {
        return externalAccountingSystemId;
    }

    @JsonProperty("cardType")
    public CardType getCardType() {
        return cardType;
    }

    @JsonProperty("cardBrand")
    public CardBrand getCardBrand() {
        return cardBrand;
    }

    @JsonProperty("lastFour")
    public String getLastFour() {
        return lastFour;
    }

    @JsonProperty("expMonth")
    public String getExpMonth() {
        return expMonth;
    }

    @JsonProperty("expYear")
    public String getExpYear() {
        return expYear;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CardRequest && equalTo((CardRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CardRequest other) {
        return defaultSource.equals(other.defaultSource)
                && defaultDestination.equals(other.defaultDestination)
                && externalAccountingSystemId.equals(other.externalAccountingSystemId)
                && cardType.equals(other.cardType)
                && cardBrand.equals(other.cardBrand)
                && lastFour.equals(other.lastFour)
                && expMonth.equals(other.expMonth)
                && expYear.equals(other.expYear)
                && token.equals(other.token);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.defaultSource,
                this.defaultDestination,
                this.externalAccountingSystemId,
                this.cardType,
                this.cardBrand,
                this.lastFour,
                this.expMonth,
                this.expYear,
                this.token);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CardTypeStage builder() {
        return new Builder();
    }

    public interface CardTypeStage {
        CardBrandStage cardType(CardType cardType);

        Builder from(CardRequest other);
    }

    public interface CardBrandStage {
        LastFourStage cardBrand(CardBrand cardBrand);
    }

    public interface LastFourStage {
        ExpMonthStage lastFour(String lastFour);
    }

    public interface ExpMonthStage {
        ExpYearStage expMonth(String expMonth);
    }

    public interface ExpYearStage {
        TokenStage expYear(String expYear);
    }

    public interface TokenStage {
        _FinalStage token(String token);
    }

    public interface _FinalStage {
        CardRequest build();

        _FinalStage defaultSource(Optional<Boolean> defaultSource);

        _FinalStage defaultSource(Boolean defaultSource);

        _FinalStage defaultDestination(Optional<Boolean> defaultDestination);

        _FinalStage defaultDestination(Boolean defaultDestination);

        _FinalStage externalAccountingSystemId(Optional<String> externalAccountingSystemId);

        _FinalStage externalAccountingSystemId(String externalAccountingSystemId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements CardTypeStage,
                    CardBrandStage,
                    LastFourStage,
                    ExpMonthStage,
                    ExpYearStage,
                    TokenStage,
                    _FinalStage {
        private CardType cardType;

        private CardBrand cardBrand;

        private String lastFour;

        private String expMonth;

        private String expYear;

        private String token;

        private Optional<String> externalAccountingSystemId = Optional.empty();

        private Optional<Boolean> defaultDestination = Optional.empty();

        private Optional<Boolean> defaultSource = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CardRequest other) {
            defaultSource(other.getDefaultSource());
            defaultDestination(other.getDefaultDestination());
            externalAccountingSystemId(other.getExternalAccountingSystemId());
            cardType(other.getCardType());
            cardBrand(other.getCardBrand());
            lastFour(other.getLastFour());
            expMonth(other.getExpMonth());
            expYear(other.getExpYear());
            token(other.getToken());
            return this;
        }

        @java.lang.Override
        @JsonSetter("cardType")
        public CardBrandStage cardType(CardType cardType) {
            this.cardType = cardType;
            return this;
        }

        @java.lang.Override
        @JsonSetter("cardBrand")
        public LastFourStage cardBrand(CardBrand cardBrand) {
            this.cardBrand = cardBrand;
            return this;
        }

        @java.lang.Override
        @JsonSetter("lastFour")
        public ExpMonthStage lastFour(String lastFour) {
            this.lastFour = lastFour;
            return this;
        }

        @java.lang.Override
        @JsonSetter("expMonth")
        public ExpYearStage expMonth(String expMonth) {
            this.expMonth = expMonth;
            return this;
        }

        @java.lang.Override
        @JsonSetter("expYear")
        public TokenStage expYear(String expYear) {
            this.expYear = expYear;
            return this;
        }

        @java.lang.Override
        @JsonSetter("token")
        public _FinalStage token(String token) {
            this.token = token;
            return this;
        }

        /**
         * <p>ID for this payment method in the external accounting system (e.g Rutter or Codat)</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage externalAccountingSystemId(String externalAccountingSystemId) {
            this.externalAccountingSystemId = Optional.of(externalAccountingSystemId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "externalAccountingSystemId", nulls = Nulls.SKIP)
        public _FinalStage externalAccountingSystemId(Optional<String> externalAccountingSystemId) {
            this.externalAccountingSystemId = externalAccountingSystemId;
            return this;
        }

        /**
         * <p>If true, this payment method will be set as the default destination. Only one payment method can be set as the default destination. If another payment method is already set as the default destination, it will be unset.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage defaultDestination(Boolean defaultDestination) {
            this.defaultDestination = Optional.of(defaultDestination);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "defaultDestination", nulls = Nulls.SKIP)
        public _FinalStage defaultDestination(Optional<Boolean> defaultDestination) {
            this.defaultDestination = defaultDestination;
            return this;
        }

        /**
         * <p>If true, this payment method will be set as the default source. Only one payment method can be set as the default source. If another payment method is already set as the default source, it will be unset.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage defaultSource(Boolean defaultSource) {
            this.defaultSource = Optional.of(defaultSource);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "defaultSource", nulls = Nulls.SKIP)
        public _FinalStage defaultSource(Optional<Boolean> defaultSource) {
            this.defaultSource = defaultSource;
            return this;
        }

        @java.lang.Override
        public CardRequest build() {
            return new CardRequest(
                    defaultSource,
                    defaultDestination,
                    externalAccountingSystemId,
                    cardType,
                    cardBrand,
                    lastFour,
                    expMonth,
                    expYear,
                    token,
                    additionalProperties);
        }
    }
}
