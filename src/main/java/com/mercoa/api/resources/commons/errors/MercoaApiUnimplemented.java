/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.commons.errors;

import com.mercoa.api.core.MercoaApiApiError;

public final class MercoaApiUnimplemented extends MercoaApiApiError {
    /**
     * The body of the response that triggered the exception.
     */
    private final String body;

    public MercoaApiUnimplemented(String body) {
        super("Unimplemented", 501, body);
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
