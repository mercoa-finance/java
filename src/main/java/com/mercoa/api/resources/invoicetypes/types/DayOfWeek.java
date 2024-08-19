/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DayOfWeek {
    SUNDAY("0"),

    MONDAY("1"),

    TUESDAY("2"),

    WEDNESDAY("3"),

    THURSDAY("4"),

    FRIDAY("5"),

    SATURDAY("6");

    private final String value;

    DayOfWeek(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}