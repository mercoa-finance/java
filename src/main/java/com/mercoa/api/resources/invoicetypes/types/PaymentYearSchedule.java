/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = PaymentYearSchedule.Builder.class)
public final class PaymentYearSchedule implements IPaymentScheduleBase {
    private final Optional<Integer> repeatEvery;

    private final Optional<PaymentScheduleEndCondition> ends;

    private final int repeatOnDay;

    private final int repeatOnMonth;

    private final Map<String, Object> additionalProperties;

    private PaymentYearSchedule(
            Optional<Integer> repeatEvery,
            Optional<PaymentScheduleEndCondition> ends,
            int repeatOnDay,
            int repeatOnMonth,
            Map<String, Object> additionalProperties) {
        this.repeatEvery = repeatEvery;
        this.ends = ends;
        this.repeatOnDay = repeatOnDay;
        this.repeatOnMonth = repeatOnMonth;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return How often to repeat the payments. Defaults to 1. Must be greater than 0. For example, if repeatEvery is set to 2 and this is a daily payment, the payment will be made every other day. If repeatEvery is set to 3 and this is a weekly payment, the payment will be made every third week.
     */
    @JsonProperty("repeatEvery")
    @java.lang.Override
    public Optional<Integer> getRepeatEvery() {
        return repeatEvery;
    }

    /**
     * @return When to end the payments, either a number of occurrences or a date. Defaults to never ending if not specified
     */
    @JsonProperty("ends")
    @java.lang.Override
    public Optional<PaymentScheduleEndCondition> getEnds() {
        return ends;
    }

    /**
     * @return Day of the month to repeat on. Positive values (1-31): Represent the day of the month counting from the start (e.g., 10 is the 10th day of the month). Negative values (-1 to -31): Represent the day of the month counting backward from the end (e.g., -1 is the last day of the month, -2 is the second-to-last day).
     */
    @JsonProperty("repeatOnDay")
    public int getRepeatOnDay() {
        return repeatOnDay;
    }

    /**
     * @return Month to repeat on (1-12).
     */
    @JsonProperty("repeatOnMonth")
    public int getRepeatOnMonth() {
        return repeatOnMonth;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PaymentYearSchedule && equalTo((PaymentYearSchedule) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PaymentYearSchedule other) {
        return repeatEvery.equals(other.repeatEvery)
                && ends.equals(other.ends)
                && repeatOnDay == other.repeatOnDay
                && repeatOnMonth == other.repeatOnMonth;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.repeatEvery, this.ends, this.repeatOnDay, this.repeatOnMonth);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RepeatOnDayStage builder() {
        return new Builder();
    }

    public interface RepeatOnDayStage {
        RepeatOnMonthStage repeatOnDay(int repeatOnDay);

        Builder from(PaymentYearSchedule other);
    }

    public interface RepeatOnMonthStage {
        _FinalStage repeatOnMonth(int repeatOnMonth);
    }

    public interface _FinalStage {
        PaymentYearSchedule build();

        _FinalStage repeatEvery(Optional<Integer> repeatEvery);

        _FinalStage repeatEvery(Integer repeatEvery);

        _FinalStage ends(Optional<PaymentScheduleEndCondition> ends);

        _FinalStage ends(PaymentScheduleEndCondition ends);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements RepeatOnDayStage, RepeatOnMonthStage, _FinalStage {
        private int repeatOnDay;

        private int repeatOnMonth;

        private Optional<PaymentScheduleEndCondition> ends = Optional.empty();

        private Optional<Integer> repeatEvery = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PaymentYearSchedule other) {
            repeatEvery(other.getRepeatEvery());
            ends(other.getEnds());
            repeatOnDay(other.getRepeatOnDay());
            repeatOnMonth(other.getRepeatOnMonth());
            return this;
        }

        /**
         * <p>Day of the month to repeat on. Positive values (1-31): Represent the day of the month counting from the start (e.g., 10 is the 10th day of the month). Negative values (-1 to -31): Represent the day of the month counting backward from the end (e.g., -1 is the last day of the month, -2 is the second-to-last day).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("repeatOnDay")
        public RepeatOnMonthStage repeatOnDay(int repeatOnDay) {
            this.repeatOnDay = repeatOnDay;
            return this;
        }

        /**
         * <p>Month to repeat on (1-12).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("repeatOnMonth")
        public _FinalStage repeatOnMonth(int repeatOnMonth) {
            this.repeatOnMonth = repeatOnMonth;
            return this;
        }

        /**
         * <p>When to end the payments, either a number of occurrences or a date. Defaults to never ending if not specified</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage ends(PaymentScheduleEndCondition ends) {
            this.ends = Optional.ofNullable(ends);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "ends", nulls = Nulls.SKIP)
        public _FinalStage ends(Optional<PaymentScheduleEndCondition> ends) {
            this.ends = ends;
            return this;
        }

        /**
         * <p>How often to repeat the payments. Defaults to 1. Must be greater than 0. For example, if repeatEvery is set to 2 and this is a daily payment, the payment will be made every other day. If repeatEvery is set to 3 and this is a weekly payment, the payment will be made every third week.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage repeatEvery(Integer repeatEvery) {
            this.repeatEvery = Optional.ofNullable(repeatEvery);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "repeatEvery", nulls = Nulls.SKIP)
        public _FinalStage repeatEvery(Optional<Integer> repeatEvery) {
            this.repeatEvery = repeatEvery;
            return this;
        }

        @java.lang.Override
        public PaymentYearSchedule build() {
            return new PaymentYearSchedule(repeatEvery, ends, repeatOnDay, repeatOnMonth, additionalProperties);
        }
    }
}
