/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

import com.mercoa.api.resources.paymentmethodtypes.types.CurrencyCode;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IInvoiceRequest {
    Optional<InvoiceStatus> getStatus();

    Optional<Double> getAmount();

    Optional<CurrencyCode> getCurrency();

    Optional<OffsetDateTime> getInvoiceDate();

    Optional<OffsetDateTime> getDeductionDate();

    Optional<OffsetDateTime> getSettlementDate();

    Optional<OffsetDateTime> getDueDate();

    Optional<String> getInvoiceNumber();

    Optional<String> getNoteToSelf();

    Optional<OffsetDateTime> getServiceStartDate();

    Optional<OffsetDateTime> getServiceEndDate();

    Optional<String> getPayerId();

    Optional<String> getPaymentSourceId();

    Optional<String> getVendorId();

    Optional<String> getPaymentDestinationId();

    Optional<PaymentDestinationOptions> getPaymentDestinationOptions();

    Optional<List<ApprovalSlotAssignment>> getApprovers();

    Optional<List<InvoiceLineItemRequest>> getLineItems();

    Optional<Map<String, String>> getMetadata();

    Optional<String> getForeignId();

    Optional<String> getDocument();

    Optional<String> getUploadedImage();
}
