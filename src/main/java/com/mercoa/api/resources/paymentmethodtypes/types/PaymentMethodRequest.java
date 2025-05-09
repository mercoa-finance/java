/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.paymentmethodtypes.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

public final class PaymentMethodRequest {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private PaymentMethodRequest(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static PaymentMethodRequest bankAccount(BankAccountRequest value) {
        return new PaymentMethodRequest(new BankAccountValue(value));
    }

    public static PaymentMethodRequest card(CardRequest value) {
        return new PaymentMethodRequest(new CardValue(value));
    }

    public static PaymentMethodRequest check(CheckRequest value) {
        return new PaymentMethodRequest(new CheckValue(value));
    }

    public static PaymentMethodRequest custom(CustomPaymentMethodRequest value) {
        return new PaymentMethodRequest(new CustomValue(value));
    }

    public static PaymentMethodRequest offPlatform(PaymentMethodBaseRequest value) {
        return new PaymentMethodRequest(new OffPlatformValue(value));
    }

    public static PaymentMethodRequest utility(UtilityPaymentMethodRequest value) {
        return new PaymentMethodRequest(new UtilityValue(value));
    }

    public static PaymentMethodRequest wallet(PaymentMethodBaseRequest value) {
        return new PaymentMethodRequest(new WalletValue(value));
    }

    public boolean isBankAccount() {
        return value instanceof BankAccountValue;
    }

    public boolean isCard() {
        return value instanceof CardValue;
    }

    public boolean isCheck() {
        return value instanceof CheckValue;
    }

    public boolean isCustom() {
        return value instanceof CustomValue;
    }

    public boolean isOffPlatform() {
        return value instanceof OffPlatformValue;
    }

    public boolean isUtility() {
        return value instanceof UtilityValue;
    }

    public boolean isWallet() {
        return value instanceof WalletValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<BankAccountRequest> getBankAccount() {
        if (isBankAccount()) {
            return Optional.of(((BankAccountValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CardRequest> getCard() {
        if (isCard()) {
            return Optional.of(((CardValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CheckRequest> getCheck() {
        if (isCheck()) {
            return Optional.of(((CheckValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CustomPaymentMethodRequest> getCustom() {
        if (isCustom()) {
            return Optional.of(((CustomValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<PaymentMethodBaseRequest> getOffPlatform() {
        if (isOffPlatform()) {
            return Optional.of(((OffPlatformValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<UtilityPaymentMethodRequest> getUtility() {
        if (isUtility()) {
            return Optional.of(((UtilityValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<PaymentMethodBaseRequest> getWallet() {
        if (isWallet()) {
            return Optional.of(((WalletValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<Object> _getUnknown() {
        if (_isUnknown()) {
            return Optional.of(((_UnknownValue) value).value);
        }
        return Optional.empty();
    }

    @JsonValue
    private Value getValue() {
        return this.value;
    }

    public interface Visitor<T> {
        T visitBankAccount(BankAccountRequest bankAccount);

        T visitCard(CardRequest card);

        T visitCheck(CheckRequest check);

        T visitCustom(CustomPaymentMethodRequest custom);

        T visitOffPlatform(PaymentMethodBaseRequest offPlatform);

        T visitUtility(UtilityPaymentMethodRequest utility);

        T visitWallet(PaymentMethodBaseRequest wallet);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(BankAccountValue.class),
        @JsonSubTypes.Type(CardValue.class),
        @JsonSubTypes.Type(CheckValue.class),
        @JsonSubTypes.Type(CustomValue.class),
        @JsonSubTypes.Type(OffPlatformValue.class),
        @JsonSubTypes.Type(UtilityValue.class),
        @JsonSubTypes.Type(WalletValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("bankAccount")
    @JsonIgnoreProperties("type")
    private static final class BankAccountValue implements Value {
        @JsonUnwrapped
        private BankAccountRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private BankAccountValue() {}

        private BankAccountValue(BankAccountRequest value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitBankAccount(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof BankAccountValue && equalTo((BankAccountValue) other);
        }

        private boolean equalTo(BankAccountValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentMethodRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("card")
    @JsonIgnoreProperties("type")
    private static final class CardValue implements Value {
        @JsonUnwrapped
        private CardRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CardValue() {}

        private CardValue(CardRequest value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCard(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CardValue && equalTo((CardValue) other);
        }

        private boolean equalTo(CardValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentMethodRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("check")
    @JsonIgnoreProperties("type")
    private static final class CheckValue implements Value {
        @JsonUnwrapped
        private CheckRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CheckValue() {}

        private CheckValue(CheckRequest value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCheck(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CheckValue && equalTo((CheckValue) other);
        }

        private boolean equalTo(CheckValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentMethodRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("custom")
    @JsonIgnoreProperties("type")
    private static final class CustomValue implements Value {
        @JsonUnwrapped
        private CustomPaymentMethodRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CustomValue() {}

        private CustomValue(CustomPaymentMethodRequest value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCustom(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CustomValue && equalTo((CustomValue) other);
        }

        private boolean equalTo(CustomValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentMethodRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("offPlatform")
    @JsonIgnoreProperties("type")
    private static final class OffPlatformValue implements Value {
        @JsonUnwrapped
        private PaymentMethodBaseRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private OffPlatformValue() {}

        private OffPlatformValue(PaymentMethodBaseRequest value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitOffPlatform(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof OffPlatformValue && equalTo((OffPlatformValue) other);
        }

        private boolean equalTo(OffPlatformValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentMethodRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("utility")
    @JsonIgnoreProperties("type")
    private static final class UtilityValue implements Value {
        @JsonUnwrapped
        private UtilityPaymentMethodRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private UtilityValue() {}

        private UtilityValue(UtilityPaymentMethodRequest value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitUtility(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof UtilityValue && equalTo((UtilityValue) other);
        }

        private boolean equalTo(UtilityValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentMethodRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("wallet")
    @JsonIgnoreProperties("type")
    private static final class WalletValue implements Value {
        @JsonUnwrapped
        private PaymentMethodBaseRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private WalletValue() {}

        private WalletValue(PaymentMethodBaseRequest value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitWallet(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof WalletValue && equalTo((WalletValue) other);
        }

        private boolean equalTo(WalletValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentMethodRequest{" + "value: " + value + "}";
        }
    }

    @JsonIgnoreProperties("type")
    private static final class _UnknownValue implements Value {
        private String type;

        @JsonValue
        private Object value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private _UnknownValue(@JsonProperty("value") Object value) {}

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor._visitUnknown(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof _UnknownValue && equalTo((_UnknownValue) other);
        }

        private boolean equalTo(_UnknownValue other) {
            return type.equals(other.type) && value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.type, this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentMethodRequest{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
