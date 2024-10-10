/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitytypes.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EmailTemplateType {
    PAYMENT("PAYMENT"),

    DISBURSEMENT("DISBURSEMENT");

    private final String value;

    EmailTemplateType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}