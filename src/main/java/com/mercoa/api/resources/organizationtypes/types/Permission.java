/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.organizationtypes.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Permission {
    INVOICE_ALL("invoice.all"),

    INVOICE_VIEW_ALL("invoice.view.all"),

    INVOICE_VIEW_DRAFT("invoice.view.draft"),

    INVOICE_VIEW_NEW("invoice.view.new"),

    INVOICE_VIEW_APPROVED("invoice.view.approved"),

    INVOICE_VIEW_SCHEDULED("invoice.view.scheduled"),

    INVOICE_VIEW_PENDING("invoice.view.pending"),

    INVOICE_VIEW_PAID("invoice.view.paid"),

    INVOICE_VIEW_ARCHIVED("invoice.view.archived"),

    INVOICE_VIEW_REFUSED("invoice.view.refused"),

    INVOICE_VIEW_CANCELED("invoice.view.canceled"),

    INVOICE_VIEW_FAILED("invoice.view.failed"),

    INVOICE_CREATE_ALL("invoice.create.all"),

    INVOICE_CREATE_DRAFT("invoice.create.draft"),

    INVOICE_CREATE_NEW("invoice.create.new"),

    INVOICE_CREATE_APPROVED("invoice.create.approved"),

    INVOICE_CREATE_SCHEDULED("invoice.create.scheduled"),

    INVOICE_CREATE_ARCHIVED("invoice.create.archived"),

    INVOICE_CREATE_CANCEL("invoice.create.cancel"),

    INVOICE_UPDATE_ALL("invoice.update.all"),

    INVOICE_UPDATE_DRAFT("invoice.update.draft"),

    INVOICE_UPDATE_NEW("invoice.update.new"),

    INVOICE_UPDATE_APPROVED("invoice.update.approved"),

    INVOICE_UPDATE_SCHEDULED("invoice.update.scheduled"),

    INVOICE_UPDATE_ARCHIVED("invoice.update.archived"),

    INVOICE_UPDATE_CANCEL("invoice.update.cancel"),

    INVOICE_DELETE("invoice.delete"),

    INVOICE_COMMENT_VIEW("invoice.comment.view"),

    INVOICE_COMMENT_CREATE("invoice.comment.create"),

    INVOICE_APPROVER_OVERRIDE("invoice.approver.override"),

    INVOICE_CHECK_PRINT("invoice.check.print"),

    PAYMENT_METHOD_ALL("paymentMethod.all"),

    PAYMENT_METHOD_VIEW("paymentMethod.view"),

    PAYMENT_METHOD_CREATE("paymentMethod.create"),

    PAYMENT_METHOD_UPDATE("paymentMethod.update"),

    PAYMENT_METHOD_DELETE("paymentMethod.delete");

    private final String value;

    Permission(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
