/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.organizationtypes.types;

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

public final class PaymentRailRequest {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private PaymentRailRequest(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static PaymentRailRequest bankAccount(BankPaymentRailRequest value) {
        return new PaymentRailRequest(new BankAccountValue(value));
    }

    public static PaymentRailRequest card(GenericPaymentRailRequest value) {
        return new PaymentRailRequest(new CardValue(value));
    }

    public static PaymentRailRequest virtualCard(GenericPaymentRailRequest value) {
        return new PaymentRailRequest(new VirtualCardValue(value));
    }

    public static PaymentRailRequest check(CheckPaymentRailRequest value) {
        return new PaymentRailRequest(new CheckValue(value));
    }

    public static PaymentRailRequest custom(CustomPaymentRailRequest value) {
        return new PaymentRailRequest(new CustomValue(value));
    }

    public static PaymentRailRequest bnpl(GenericPaymentRailRequest value) {
        return new PaymentRailRequest(new BnplValue(value));
    }

    public static PaymentRailRequest offPlatform(GenericPaymentRailRequest value) {
        return new PaymentRailRequest(new OffPlatformValue(value));
    }

    public static PaymentRailRequest utility(GenericPaymentRailRequest value) {
        return new PaymentRailRequest(new UtilityValue(value));
    }

    public static PaymentRailRequest na(GenericPaymentRailRequest value) {
        return new PaymentRailRequest(new NaValue(value));
    }

    public static PaymentRailRequest wallet(GenericPaymentRailRequest value) {
        return new PaymentRailRequest(new WalletValue(value));
    }

    public boolean isBankAccount() {
        return value instanceof BankAccountValue;
    }

    public boolean isCard() {
        return value instanceof CardValue;
    }

    public boolean isVirtualCard() {
        return value instanceof VirtualCardValue;
    }

    public boolean isCheck() {
        return value instanceof CheckValue;
    }

    public boolean isCustom() {
        return value instanceof CustomValue;
    }

    public boolean isBnpl() {
        return value instanceof BnplValue;
    }

    public boolean isOffPlatform() {
        return value instanceof OffPlatformValue;
    }

    public boolean isUtility() {
        return value instanceof UtilityValue;
    }

    public boolean isNa() {
        return value instanceof NaValue;
    }

    public boolean isWallet() {
        return value instanceof WalletValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<BankPaymentRailRequest> getBankAccount() {
        if (isBankAccount()) {
            return Optional.of(((BankAccountValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<GenericPaymentRailRequest> getCard() {
        if (isCard()) {
            return Optional.of(((CardValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<GenericPaymentRailRequest> getVirtualCard() {
        if (isVirtualCard()) {
            return Optional.of(((VirtualCardValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CheckPaymentRailRequest> getCheck() {
        if (isCheck()) {
            return Optional.of(((CheckValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CustomPaymentRailRequest> getCustom() {
        if (isCustom()) {
            return Optional.of(((CustomValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<GenericPaymentRailRequest> getBnpl() {
        if (isBnpl()) {
            return Optional.of(((BnplValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<GenericPaymentRailRequest> getOffPlatform() {
        if (isOffPlatform()) {
            return Optional.of(((OffPlatformValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<GenericPaymentRailRequest> getUtility() {
        if (isUtility()) {
            return Optional.of(((UtilityValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<GenericPaymentRailRequest> getNa() {
        if (isNa()) {
            return Optional.of(((NaValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<GenericPaymentRailRequest> getWallet() {
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
        T visitBankAccount(BankPaymentRailRequest bankAccount);

        T visitCard(GenericPaymentRailRequest card);

        T visitVirtualCard(GenericPaymentRailRequest virtualCard);

        T visitCheck(CheckPaymentRailRequest check);

        T visitCustom(CustomPaymentRailRequest custom);

        T visitBnpl(GenericPaymentRailRequest bnpl);

        T visitOffPlatform(GenericPaymentRailRequest offPlatform);

        T visitUtility(GenericPaymentRailRequest utility);

        T visitNa(GenericPaymentRailRequest na);

        T visitWallet(GenericPaymentRailRequest wallet);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(BankAccountValue.class),
        @JsonSubTypes.Type(CardValue.class),
        @JsonSubTypes.Type(VirtualCardValue.class),
        @JsonSubTypes.Type(CheckValue.class),
        @JsonSubTypes.Type(CustomValue.class),
        @JsonSubTypes.Type(BnplValue.class),
        @JsonSubTypes.Type(OffPlatformValue.class),
        @JsonSubTypes.Type(UtilityValue.class),
        @JsonSubTypes.Type(NaValue.class),
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
        private BankPaymentRailRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private BankAccountValue() {}

        private BankAccountValue(BankPaymentRailRequest value) {
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
            return "PaymentRailRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("card")
    @JsonIgnoreProperties("type")
    private static final class CardValue implements Value {
        @JsonUnwrapped
        private GenericPaymentRailRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CardValue() {}

        private CardValue(GenericPaymentRailRequest value) {
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
            return "PaymentRailRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("virtualCard")
    @JsonIgnoreProperties("type")
    private static final class VirtualCardValue implements Value {
        @JsonUnwrapped
        private GenericPaymentRailRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private VirtualCardValue() {}

        private VirtualCardValue(GenericPaymentRailRequest value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitVirtualCard(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof VirtualCardValue && equalTo((VirtualCardValue) other);
        }

        private boolean equalTo(VirtualCardValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentRailRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("check")
    @JsonIgnoreProperties("type")
    private static final class CheckValue implements Value {
        @JsonUnwrapped
        private CheckPaymentRailRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CheckValue() {}

        private CheckValue(CheckPaymentRailRequest value) {
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
            return "PaymentRailRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("custom")
    @JsonIgnoreProperties("type")
    private static final class CustomValue implements Value {
        @JsonUnwrapped
        private CustomPaymentRailRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CustomValue() {}

        private CustomValue(CustomPaymentRailRequest value) {
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
            return "PaymentRailRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("bnpl")
    @JsonIgnoreProperties("type")
    private static final class BnplValue implements Value {
        @JsonUnwrapped
        private GenericPaymentRailRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private BnplValue() {}

        private BnplValue(GenericPaymentRailRequest value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitBnpl(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof BnplValue && equalTo((BnplValue) other);
        }

        private boolean equalTo(BnplValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentRailRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("offPlatform")
    @JsonIgnoreProperties("type")
    private static final class OffPlatformValue implements Value {
        @JsonUnwrapped
        private GenericPaymentRailRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private OffPlatformValue() {}

        private OffPlatformValue(GenericPaymentRailRequest value) {
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
            return "PaymentRailRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("utility")
    @JsonIgnoreProperties("type")
    private static final class UtilityValue implements Value {
        @JsonUnwrapped
        private GenericPaymentRailRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private UtilityValue() {}

        private UtilityValue(GenericPaymentRailRequest value) {
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
            return "PaymentRailRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("na")
    @JsonIgnoreProperties("type")
    private static final class NaValue implements Value {
        @JsonUnwrapped
        private GenericPaymentRailRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private NaValue() {}

        private NaValue(GenericPaymentRailRequest value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitNa(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof NaValue && equalTo((NaValue) other);
        }

        private boolean equalTo(NaValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentRailRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("wallet")
    @JsonIgnoreProperties("type")
    private static final class WalletValue implements Value {
        @JsonUnwrapped
        private GenericPaymentRailRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private WalletValue() {}

        private WalletValue(GenericPaymentRailRequest value) {
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
            return "PaymentRailRequest{" + "value: " + value + "}";
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
            return "PaymentRailRequest{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
