/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitytypes.types;

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

public final class Trigger {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private Trigger(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static Trigger amount(AmountTrigger value) {
        return new Trigger(new AmountValue(value));
    }

    public static Trigger vendor(VendorTrigger value) {
        return new Trigger(new VendorValue(value));
    }

    public static Trigger metadata(MetadataTrigger value) {
        return new Trigger(new MetadataValue(value));
    }

    public boolean isAmount() {
        return value instanceof AmountValue;
    }

    public boolean isVendor() {
        return value instanceof VendorValue;
    }

    public boolean isMetadata() {
        return value instanceof MetadataValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<AmountTrigger> getAmount() {
        if (isAmount()) {
            return Optional.of(((AmountValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<VendorTrigger> getVendor() {
        if (isVendor()) {
            return Optional.of(((VendorValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<MetadataTrigger> getMetadata() {
        if (isMetadata()) {
            return Optional.of(((MetadataValue) value).value);
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
        T visitAmount(AmountTrigger amount);

        T visitVendor(VendorTrigger vendor);

        T visitMetadata(MetadataTrigger metadata);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(AmountValue.class),
        @JsonSubTypes.Type(VendorValue.class),
        @JsonSubTypes.Type(MetadataValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("amount")
    @JsonIgnoreProperties("type")
    private static final class AmountValue implements Value {
        @JsonUnwrapped
        private AmountTrigger value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private AmountValue() {}

        private AmountValue(AmountTrigger value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitAmount(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof AmountValue && equalTo((AmountValue) other);
        }

        private boolean equalTo(AmountValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "Trigger{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("vendor")
    @JsonIgnoreProperties("type")
    private static final class VendorValue implements Value {
        @JsonUnwrapped
        private VendorTrigger value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private VendorValue() {}

        private VendorValue(VendorTrigger value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitVendor(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof VendorValue && equalTo((VendorValue) other);
        }

        private boolean equalTo(VendorValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "Trigger{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("metadata")
    @JsonIgnoreProperties("type")
    private static final class MetadataValue implements Value {
        @JsonUnwrapped
        private MetadataTrigger value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private MetadataValue() {}

        private MetadataValue(MetadataTrigger value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitMetadata(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof MetadataValue && equalTo((MetadataValue) other);
        }

        private boolean equalTo(MetadataValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "Trigger{" + "value: " + value + "}";
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
            return "Trigger{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
