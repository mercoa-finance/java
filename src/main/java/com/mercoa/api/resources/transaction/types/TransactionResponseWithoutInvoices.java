/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.transaction.types;

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

public final class TransactionResponseWithoutInvoices {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private TransactionResponseWithoutInvoices(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static TransactionResponseWithoutInvoices bankAccountToBankAccount(TransactionResponseBankToBankBase value) {
        return new TransactionResponseWithoutInvoices(new BankAccountToBankAccountValue(value));
    }

    public static TransactionResponseWithoutInvoices bankAccountToMailedCheck(
            TransactionResponseBankToMailedCheckBase value) {
        return new TransactionResponseWithoutInvoices(new BankAccountToMailedCheckValue(value));
    }

    public static TransactionResponseWithoutInvoices custom(TransactionResponseBase value) {
        return new TransactionResponseWithoutInvoices(new CustomValue(value));
    }

    public boolean isBankAccountToBankAccount() {
        return value instanceof BankAccountToBankAccountValue;
    }

    public boolean isBankAccountToMailedCheck() {
        return value instanceof BankAccountToMailedCheckValue;
    }

    public boolean isCustom() {
        return value instanceof CustomValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<TransactionResponseBankToBankBase> getBankAccountToBankAccount() {
        if (isBankAccountToBankAccount()) {
            return Optional.of(((BankAccountToBankAccountValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<TransactionResponseBankToMailedCheckBase> getBankAccountToMailedCheck() {
        if (isBankAccountToMailedCheck()) {
            return Optional.of(((BankAccountToMailedCheckValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<TransactionResponseBase> getCustom() {
        if (isCustom()) {
            return Optional.of(((CustomValue) value).value);
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
        T visitBankAccountToBankAccount(TransactionResponseBankToBankBase bankAccountToBankAccount);

        T visitBankAccountToMailedCheck(TransactionResponseBankToMailedCheckBase bankAccountToMailedCheck);

        T visitCustom(TransactionResponseBase custom);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(BankAccountToBankAccountValue.class),
        @JsonSubTypes.Type(BankAccountToMailedCheckValue.class),
        @JsonSubTypes.Type(CustomValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("bankAccountToBankAccount")
    private static final class BankAccountToBankAccountValue implements Value {
        @JsonUnwrapped
        private TransactionResponseBankToBankBase value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private BankAccountToBankAccountValue() {}

        private BankAccountToBankAccountValue(TransactionResponseBankToBankBase value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitBankAccountToBankAccount(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof BankAccountToBankAccountValue && equalTo((BankAccountToBankAccountValue) other);
        }

        private boolean equalTo(BankAccountToBankAccountValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TransactionResponseWithoutInvoices{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("bankAccountToMailedCheck")
    private static final class BankAccountToMailedCheckValue implements Value {
        @JsonUnwrapped
        private TransactionResponseBankToMailedCheckBase value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private BankAccountToMailedCheckValue() {}

        private BankAccountToMailedCheckValue(TransactionResponseBankToMailedCheckBase value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitBankAccountToMailedCheck(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof BankAccountToMailedCheckValue && equalTo((BankAccountToMailedCheckValue) other);
        }

        private boolean equalTo(BankAccountToMailedCheckValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TransactionResponseWithoutInvoices{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("custom")
    private static final class CustomValue implements Value {
        @JsonUnwrapped
        private TransactionResponseBase value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CustomValue() {}

        private CustomValue(TransactionResponseBase value) {
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
            return "TransactionResponseWithoutInvoices{" + "value: " + value + "}";
        }
    }

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
            return "TransactionResponseWithoutInvoices{" + "type: " + type + ", value: " + value + "}";
        }
    }
}