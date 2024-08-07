/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitytypes.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum NotificationStatus {
    PENDING("PENDING"),

    SENT("SENT"),

    READ("READ"),

    FAILED("FAILED");

    private final String value;

    NotificationStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
