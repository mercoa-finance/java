/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.invoicetypes.types;

import java.util.Optional;

public interface IPaymentScheduleBase {
    Optional<Integer> getRepeatEvery();

    Optional<PaymentScheduleEndCondition> getEnds();
}
