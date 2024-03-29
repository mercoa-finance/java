/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum InvoiceFailureType {
    SOURCE_PAYMENT_ERROR("SOURCE_PAYMENT_ERROR"),

    DESTINATION_PAYMENT_ERROR("DESTINATION_PAYMENT_ERROR"),

    REJECTED_HIGH_RISK("REJECTED_HIGH_RISK"),

    INSUFFICIENT_FUNDS("INSUFFICIENT_FUNDS"),

    PROCESSING_ERROR("PROCESSING_ERROR");

    private final String value;

    InvoiceFailureType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
