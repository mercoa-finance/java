/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.paymentmethodtypes.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentMethodType {
    CUSTOM("custom"),

    CHECK("check"),

    BANK_ACCOUNT("bankAccount"),

    NA("na"),

    CARD("card"),

    BNPL("bnpl"),

    VIRTUAL_CARD("virtualCard"),

    OFF_PLATFORM("offPlatform"),

    UTILITY("utility");

    private final String value;

    PaymentMethodType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
