/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

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

public final class PaymentSchedule {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private PaymentSchedule(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static PaymentSchedule oneTime(PaymentScheduleBase value) {
        return new PaymentSchedule(new OneTimeValue(value));
    }

    public static PaymentSchedule daily(PaymentScheduleBase value) {
        return new PaymentSchedule(new DailyValue(value));
    }

    public static PaymentSchedule weekly(PaymentWeekSchedule value) {
        return new PaymentSchedule(new WeeklyValue(value));
    }

    public static PaymentSchedule monthly(PaymentMonthSchedule value) {
        return new PaymentSchedule(new MonthlyValue(value));
    }

    public static PaymentSchedule yearly(PaymentYearSchedule value) {
        return new PaymentSchedule(new YearlyValue(value));
    }

    public boolean isOneTime() {
        return value instanceof OneTimeValue;
    }

    public boolean isDaily() {
        return value instanceof DailyValue;
    }

    public boolean isWeekly() {
        return value instanceof WeeklyValue;
    }

    public boolean isMonthly() {
        return value instanceof MonthlyValue;
    }

    public boolean isYearly() {
        return value instanceof YearlyValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<PaymentScheduleBase> getOneTime() {
        if (isOneTime()) {
            return Optional.of(((OneTimeValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<PaymentScheduleBase> getDaily() {
        if (isDaily()) {
            return Optional.of(((DailyValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<PaymentWeekSchedule> getWeekly() {
        if (isWeekly()) {
            return Optional.of(((WeeklyValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<PaymentMonthSchedule> getMonthly() {
        if (isMonthly()) {
            return Optional.of(((MonthlyValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<PaymentYearSchedule> getYearly() {
        if (isYearly()) {
            return Optional.of(((YearlyValue) value).value);
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
        T visitOneTime(PaymentScheduleBase oneTime);

        T visitDaily(PaymentScheduleBase daily);

        T visitWeekly(PaymentWeekSchedule weekly);

        T visitMonthly(PaymentMonthSchedule monthly);

        T visitYearly(PaymentYearSchedule yearly);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(OneTimeValue.class),
        @JsonSubTypes.Type(DailyValue.class),
        @JsonSubTypes.Type(WeeklyValue.class),
        @JsonSubTypes.Type(MonthlyValue.class),
        @JsonSubTypes.Type(YearlyValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("oneTime")
    @JsonIgnoreProperties("type")
    private static final class OneTimeValue implements Value {
        @JsonUnwrapped
        private PaymentScheduleBase value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private OneTimeValue() {}

        private OneTimeValue(PaymentScheduleBase value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitOneTime(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof OneTimeValue && equalTo((OneTimeValue) other);
        }

        private boolean equalTo(OneTimeValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentSchedule{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("daily")
    @JsonIgnoreProperties("type")
    private static final class DailyValue implements Value {
        @JsonUnwrapped
        private PaymentScheduleBase value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private DailyValue() {}

        private DailyValue(PaymentScheduleBase value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitDaily(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof DailyValue && equalTo((DailyValue) other);
        }

        private boolean equalTo(DailyValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentSchedule{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("weekly")
    @JsonIgnoreProperties("type")
    private static final class WeeklyValue implements Value {
        @JsonUnwrapped
        private PaymentWeekSchedule value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private WeeklyValue() {}

        private WeeklyValue(PaymentWeekSchedule value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitWeekly(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof WeeklyValue && equalTo((WeeklyValue) other);
        }

        private boolean equalTo(WeeklyValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentSchedule{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("monthly")
    @JsonIgnoreProperties("type")
    private static final class MonthlyValue implements Value {
        @JsonUnwrapped
        private PaymentMonthSchedule value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private MonthlyValue() {}

        private MonthlyValue(PaymentMonthSchedule value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitMonthly(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof MonthlyValue && equalTo((MonthlyValue) other);
        }

        private boolean equalTo(MonthlyValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentSchedule{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("yearly")
    @JsonIgnoreProperties("type")
    private static final class YearlyValue implements Value {
        @JsonUnwrapped
        private PaymentYearSchedule value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private YearlyValue() {}

        private YearlyValue(PaymentYearSchedule value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitYearly(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof YearlyValue && equalTo((YearlyValue) other);
        }

        private boolean equalTo(YearlyValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PaymentSchedule{" + "value: " + value + "}";
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
            return "PaymentSchedule{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
