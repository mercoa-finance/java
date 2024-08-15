/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.mercoa.api.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = PaymentScheduleEndCondition.Deserializer.class)
public final class PaymentScheduleEndCondition {
    private final Object value;

    private final int type;

    private PaymentScheduleEndCondition(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((int) this.value);
        } else if (this.type == 1) {
            return visitor.visit((String) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PaymentScheduleEndCondition && equalTo((PaymentScheduleEndCondition) other);
    }

    private boolean equalTo(PaymentScheduleEndCondition other) {
        return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
        return this.value.toString();
    }

    public static PaymentScheduleEndCondition of(int value) {
        return new PaymentScheduleEndCondition(value, 0);
    }

    public static PaymentScheduleEndCondition of(String value) {
        return new PaymentScheduleEndCondition(value, 1);
    }

    public interface Visitor<T> {
        T visit(int value);

        T visit(String value);
    }

    static final class Deserializer extends StdDeserializer<PaymentScheduleEndCondition> {
        Deserializer() {
            super(PaymentScheduleEndCondition.class);
        }

        @java.lang.Override
        public PaymentScheduleEndCondition deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            if (value instanceof Integer) {
                return of((Integer) value);
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, String.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
