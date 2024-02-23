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

public final class NotificationConfigurationResponse {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private NotificationConfigurationResponse(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static NotificationConfigurationResponse invoice(InvoiceNotificationConfigurationResponse value) {
        return new NotificationConfigurationResponse(new InvoiceValue(value));
    }

    public boolean isInvoice() {
        return value instanceof InvoiceValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<InvoiceNotificationConfigurationResponse> getInvoice() {
        if (isInvoice()) {
            return Optional.of(((InvoiceValue) value).value);
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
        T visitInvoice(InvoiceNotificationConfigurationResponse invoice);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            property = "notificationType",
            visible = true,
            defaultImpl = _UnknownValue.class)
    @JsonSubTypes(@JsonSubTypes.Type(InvoiceValue.class))
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("invoice")
    private static final class InvoiceValue implements Value {
        @JsonUnwrapped
        private InvoiceNotificationConfigurationResponse value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private InvoiceValue() {}

        private InvoiceValue(InvoiceNotificationConfigurationResponse value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitInvoice(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof InvoiceValue && equalTo((InvoiceValue) other);
        }

        private boolean equalTo(InvoiceValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "NotificationConfigurationResponse{" + "value: " + value + "}";
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
            return "NotificationConfigurationResponse{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
