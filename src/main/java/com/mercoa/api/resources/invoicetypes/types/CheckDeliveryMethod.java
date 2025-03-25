/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CheckDeliveryMethod {
    PRINT("PRINT"),

    MAIL("MAIL"),

    MAIL_PRIORITY("MAIL_PRIORITY"),

    MAIL_UPS_NEXT_DAY("MAIL_UPS_NEXT_DAY");

    private final String value;

    CheckDeliveryMethod(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
