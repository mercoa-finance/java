/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum InvoiceMetricsPerDateGroupBy {
    CREATION_DATE("CREATION_DATE"),

    DUE_DATE("DUE_DATE"),

    INVOICE_DATE("INVOICE_DATE"),

    DEDUCTION_DATE("DEDUCTION_DATE"),

    NEXT_PAYMENT_DATE("NEXT_PAYMENT_DATE");

    private final String value;

    InvoiceMetricsPerDateGroupBy(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
