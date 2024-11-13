/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

import com.mercoa.api.resources.entitytypes.types.ApprovalPolicyResponse;
import com.mercoa.api.resources.entitytypes.types.CounterpartyResponse;
import com.mercoa.api.resources.entitytypes.types.EntityUserResponse;
import com.mercoa.api.resources.paymentmethodtypes.types.CurrencyCode;
import com.mercoa.api.resources.paymentmethodtypes.types.PaymentMethodResponse;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IInvoiceResponseBase {
    InvoiceStatus getStatus();

    Optional<Double> getAmount();

    Optional<CurrencyCode> getCurrency();

    Optional<OffsetDateTime> getInvoiceDate();

    Optional<OffsetDateTime> getDeductionDate();

    Optional<OffsetDateTime> getDueDate();

    Optional<String> getInvoiceNumber();

    Optional<String> getNoteToSelf();

    Optional<OffsetDateTime> getServiceStartDate();

    Optional<OffsetDateTime> getServiceEndDate();

    Optional<String> getPayerId();

    Optional<CounterpartyResponse> getPayer();

    Optional<PaymentMethodResponse> getPaymentSource();

    Optional<String> getPaymentSourceId();

    Optional<String> getVendorId();

    Optional<CounterpartyResponse> getVendor();

    Optional<PaymentMethodResponse> getPaymentDestination();

    Optional<String> getPaymentDestinationId();

    Optional<PaymentDestinationOptions> getPaymentDestinationOptions();

    boolean getPaymentDestinationConfirmed();

    Optional<Boolean> getBatchPayment();

    boolean getHasDocuments();

    boolean getHasSourceEmail();

    Optional<List<InvoiceLineItemResponse>> getLineItems();

    List<ApprovalSlot> getApprovers();

    List<ApprovalPolicyResponse> getApprovalPolicy();

    Map<String, String> getMetadata();

    Optional<String> getCreatorEntityId();

    Optional<EntityUserResponse> getCreatorUser();

    OffsetDateTime getCreatedAt();

    OffsetDateTime getUpdatedAt();

    Optional<List<CommentResponse>> getComments();

    Optional<InvoiceFeesResponse> getFees();

    Optional<PaymentSchedule> getPaymentSchedule();
}
