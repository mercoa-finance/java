/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum InvoiceStatus {
    UNASSIGNED("UNASSIGNED"),

    DRAFT("DRAFT"),

    NEW("NEW"),

    APPROVED("APPROVED"),

    SCHEDULED("SCHEDULED"),

    PENDING("PENDING"),

    PAID("PAID"),

    ARCHIVED("ARCHIVED"),

    REFUSED("REFUSED"),

    CANCELED("CANCELED"),

    FAILED("FAILED");

    private final String value;

    InvoiceStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
