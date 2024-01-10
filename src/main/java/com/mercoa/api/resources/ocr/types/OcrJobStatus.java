/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.ocr.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OcrJobStatus {
    PENDING("pending"),

    SUCCESS("success"),

    FAILED("failed");

    private final String value;

    OcrJobStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
