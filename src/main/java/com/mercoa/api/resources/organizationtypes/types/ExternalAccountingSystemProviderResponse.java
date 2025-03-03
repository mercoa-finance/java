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

public final class ExternalAccountingSystemProviderResponse {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private ExternalAccountingSystemProviderResponse(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static ExternalAccountingSystemProviderResponse none(CodatProviderResponse value) {
        return new ExternalAccountingSystemProviderResponse(new NoneValue(value));
    }

    public static ExternalAccountingSystemProviderResponse codat(CodatProviderResponse value) {
        return new ExternalAccountingSystemProviderResponse(new CodatValue(value));
    }

    public static ExternalAccountingSystemProviderResponse rutter(RutterProviderResponse value) {
        return new ExternalAccountingSystemProviderResponse(new RutterValue(value));
    }

    public boolean isNone() {
        return value instanceof NoneValue;
    }

    public boolean isCodat() {
        return value instanceof CodatValue;
    }

    public boolean isRutter() {
        return value instanceof RutterValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<CodatProviderResponse> getNone() {
        if (isNone()) {
            return Optional.of(((NoneValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CodatProviderResponse> getCodat() {
        if (isCodat()) {
            return Optional.of(((CodatValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<RutterProviderResponse> getRutter() {
        if (isRutter()) {
            return Optional.of(((RutterValue) value).value);
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
        T visitNone(CodatProviderResponse none);

        T visitCodat(CodatProviderResponse codat);

        T visitRutter(RutterProviderResponse rutter);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(NoneValue.class),
        @JsonSubTypes.Type(CodatValue.class),
        @JsonSubTypes.Type(RutterValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("none")
    @JsonIgnoreProperties("type")
    private static final class NoneValue implements Value {
        @JsonUnwrapped
        private CodatProviderResponse value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private NoneValue() {}

        private NoneValue(CodatProviderResponse value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitNone(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof NoneValue && equalTo((NoneValue) other);
        }

        private boolean equalTo(NoneValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ExternalAccountingSystemProviderResponse{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("codat")
    @JsonIgnoreProperties("type")
    private static final class CodatValue implements Value {
        @JsonUnwrapped
        private CodatProviderResponse value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CodatValue() {}

        private CodatValue(CodatProviderResponse value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCodat(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CodatValue && equalTo((CodatValue) other);
        }

        private boolean equalTo(CodatValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ExternalAccountingSystemProviderResponse{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("rutter")
    @JsonIgnoreProperties("type")
    private static final class RutterValue implements Value {
        @JsonUnwrapped
        private RutterProviderResponse value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private RutterValue() {}

        private RutterValue(RutterProviderResponse value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitRutter(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof RutterValue && equalTo((RutterValue) other);
        }

        private boolean equalTo(RutterValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ExternalAccountingSystemProviderResponse{" + "value: " + value + "}";
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
            return "ExternalAccountingSystemProviderResponse{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
