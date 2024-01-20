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
@JsonDeserialize(builder = BankAccountRequest.Builder.class)
public final class BankAccountRequest implements IPaymentMethodBaseRequest {
    private final Optional<Boolean> defaultSource;

    private final Optional<Boolean> defaultDestination;

    private final Optional<String> accountName;

    private final String bankName;

    private final String routingNumber;

    private final String accountNumber;

    private final BankType accountType;

    private final Optional<PlaidLinkRequest> plaid;

    private final Optional<BankAccountCheckOptions> checkOptions;

    private final Map<String, Object> additionalProperties;

    private BankAccountRequest(
            Optional<Boolean> defaultSource,
            Optional<Boolean> defaultDestination,
            Optional<String> accountName,
            String bankName,
            String routingNumber,
            String accountNumber,
            BankType accountType,
            Optional<PlaidLinkRequest> plaid,
            Optional<BankAccountCheckOptions> checkOptions,
            Map<String, Object> additionalProperties) {
        this.defaultSource = defaultSource;
        this.defaultDestination = defaultDestination;
        this.accountName = accountName;
        this.bankName = bankName;
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.plaid = plaid;
        this.checkOptions = checkOptions;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If true, this payment method will be set as the default source. Only one payment method can be set as the default source. If another payment method is already set as the default source, it will be unset.
     */
    @JsonProperty("defaultSource")
    @Override
    public Optional<Boolean> getDefaultSource() {
        return defaultSource;
    }

    /**
     * @return If true, this payment method will be set as the default destination. Only one payment method can be set as the default destination. If another payment method is already set as the default destination, it will be unset.
     */
    @JsonProperty("defaultDestination")
    @Override
    public Optional<Boolean> getDefaultDestination() {
        return defaultDestination;
    }

    @JsonProperty("accountName")
    public Optional<String> getAccountName() {
        return accountName;
    }

    @JsonProperty("bankName")
    public String getBankName() {
        return bankName;
    }

    @JsonProperty("routingNumber")
    public String getRoutingNumber() {
        return routingNumber;
    }

    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("accountType")
    public BankType getAccountType() {
        return accountType;
    }

    /**
     * @return If provided, will link a bank account using Plaid Link
     */
    @JsonProperty("plaid")
    public Optional<PlaidLinkRequest> getPlaid() {
        return plaid;
    }

    /**
     * @return If this bank account supports check printing, use this to enable check printing and set the check options. Checks will be printed directly from the bank account.
     */
    @JsonProperty("checkOptions")
    public Optional<BankAccountCheckOptions> getCheckOptions() {
        return checkOptions;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BankAccountRequest && equalTo((BankAccountRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BankAccountRequest other) {
        return defaultSource.equals(other.defaultSource)
                && defaultDestination.equals(other.defaultDestination)
                && accountName.equals(other.accountName)
                && bankName.equals(other.bankName)
                && routingNumber.equals(other.routingNumber)
                && accountNumber.equals(other.accountNumber)
                && accountType.equals(other.accountType)
                && plaid.equals(other.plaid)
                && checkOptions.equals(other.checkOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.defaultSource,
                this.defaultDestination,
                this.accountName,
                this.bankName,
                this.routingNumber,
                this.accountNumber,
                this.accountType,
                this.plaid,
                this.checkOptions);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static BankNameStage builder() {
        return new Builder();
    }

    public interface BankNameStage {
        RoutingNumberStage bankName(String bankName);

        Builder from(BankAccountRequest other);
    }

    public interface RoutingNumberStage {
        AccountNumberStage routingNumber(String routingNumber);
    }

    public interface AccountNumberStage {
        AccountTypeStage accountNumber(String accountNumber);
    }

    public interface AccountTypeStage {
        _FinalStage accountType(BankType accountType);
    }

    public interface _FinalStage {
        BankAccountRequest build();

        _FinalStage defaultSource(Optional<Boolean> defaultSource);

        _FinalStage defaultSource(Boolean defaultSource);

        _FinalStage defaultDestination(Optional<Boolean> defaultDestination);

        _FinalStage defaultDestination(Boolean defaultDestination);

        _FinalStage accountName(Optional<String> accountName);

        _FinalStage accountName(String accountName);

        _FinalStage plaid(Optional<PlaidLinkRequest> plaid);

        _FinalStage plaid(PlaidLinkRequest plaid);

        _FinalStage checkOptions(Optional<BankAccountCheckOptions> checkOptions);

        _FinalStage checkOptions(BankAccountCheckOptions checkOptions);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements BankNameStage, RoutingNumberStage, AccountNumberStage, AccountTypeStage, _FinalStage {
        private String bankName;

        private String routingNumber;

        private String accountNumber;

        private BankType accountType;

        private Optional<BankAccountCheckOptions> checkOptions = Optional.empty();

        private Optional<PlaidLinkRequest> plaid = Optional.empty();

        private Optional<String> accountName = Optional.empty();

        private Optional<Boolean> defaultDestination = Optional.empty();

        private Optional<Boolean> defaultSource = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(BankAccountRequest other) {
            defaultSource(other.getDefaultSource());
            defaultDestination(other.getDefaultDestination());
            accountName(other.getAccountName());
            bankName(other.getBankName());
            routingNumber(other.getRoutingNumber());
            accountNumber(other.getAccountNumber());
            accountType(other.getAccountType());
            plaid(other.getPlaid());
            checkOptions(other.getCheckOptions());
            return this;
        }

        @Override
        @JsonSetter("bankName")
        public RoutingNumberStage bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        @Override
        @JsonSetter("routingNumber")
        public AccountNumberStage routingNumber(String routingNumber) {
            this.routingNumber = routingNumber;
            return this;
        }

        @Override
        @JsonSetter("accountNumber")
        public AccountTypeStage accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        @Override
        @JsonSetter("accountType")
        public _FinalStage accountType(BankType accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>If this bank account supports check printing, use this to enable check printing and set the check options. Checks will be printed directly from the bank account.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage checkOptions(BankAccountCheckOptions checkOptions) {
            this.checkOptions = Optional.of(checkOptions);
            return this;
        }

        @Override
        @JsonSetter(value = "checkOptions", nulls = Nulls.SKIP)
        public _FinalStage checkOptions(Optional<BankAccountCheckOptions> checkOptions) {
            this.checkOptions = checkOptions;
            return this;
        }

        /**
         * <p>If provided, will link a bank account using Plaid Link</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage plaid(PlaidLinkRequest plaid) {
            this.plaid = Optional.of(plaid);
            return this;
        }

        @Override
        @JsonSetter(value = "plaid", nulls = Nulls.SKIP)
        public _FinalStage plaid(Optional<PlaidLinkRequest> plaid) {
            this.plaid = plaid;
            return this;
        }

        @Override
        public _FinalStage accountName(String accountName) {
            this.accountName = Optional.of(accountName);
            return this;
        }

        @Override
        @JsonSetter(value = "accountName", nulls = Nulls.SKIP)
        public _FinalStage accountName(Optional<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>If true, this payment method will be set as the default destination. Only one payment method can be set as the default destination. If another payment method is already set as the default destination, it will be unset.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage defaultDestination(Boolean defaultDestination) {
            this.defaultDestination = Optional.of(defaultDestination);
            return this;
        }

        @Override
        @JsonSetter(value = "defaultDestination", nulls = Nulls.SKIP)
        public _FinalStage defaultDestination(Optional<Boolean> defaultDestination) {
            this.defaultDestination = defaultDestination;
            return this;
        }

        /**
         * <p>If true, this payment method will be set as the default source. Only one payment method can be set as the default source. If another payment method is already set as the default source, it will be unset.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage defaultSource(Boolean defaultSource) {
            this.defaultSource = Optional.of(defaultSource);
            return this;
        }

        @Override
        @JsonSetter(value = "defaultSource", nulls = Nulls.SKIP)
        public _FinalStage defaultSource(Optional<Boolean> defaultSource) {
            this.defaultSource = defaultSource;
            return this;
        }

        @Override
        public BankAccountRequest build() {
            return new BankAccountRequest(
                    defaultSource,
                    defaultDestination,
                    accountName,
                    bankName,
                    routingNumber,
                    accountNumber,
                    accountType,
                    plaid,
                    checkOptions,
                    additionalProperties);
        }
    }
}
