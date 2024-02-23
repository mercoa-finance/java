/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.organizationtypes.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MetadataType {
    STRING("STRING"),

    NUMBER("NUMBER"),

    DATE("DATE"),

    BOOLEAN("BOOLEAN"),

    KEY_VALUE("KEY_VALUE");

    private final String value;

    MetadataType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
