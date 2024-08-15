/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum InvoiceOrderByField {
    AMOUNT("AMOUNT"),

    DUE_DATE("DUE_DATE"),

    CREATED_AT("CREATED_AT"),

    UPDATED_AT("UPDATED_AT"),

    DEDUCTION_DATE("DEDUCTION_DATE"),

    INVOICE_DATE("INVOICE_DATE"),

    SETTLEMENT_DATE("SETTLEMENT_DATE"),

    INVOICE_NUMBER("INVOICE_NUMBER"),

    VENDOR_NAME("VENDOR_NAME"),

    PAYER_NAME("PAYER_NAME"),

    NEXT_PAYMENT_DATE("NEXT_PAYMENT_DATE");

    private final String value;

    InvoiceOrderByField(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
