/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.commons.errors;

import com.mercoa.api.core.MercoaApiException;

public final class InternalServerError extends MercoaApiException {
    /**
     * The body of the response that triggered the exception.
     */
    private final String body;

    public InternalServerError(String body) {
        super("InternalServerError", 500, body);
        this.body = body;
    }

    /**
     * @return the body
     */
    @java.lang.Override
    public String body() {
        return this.body;
    }
}