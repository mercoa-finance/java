/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.transaction.types;

import java.util.Optional;

public interface ITransactionResponseBankToBankBase extends ITransactionResponseBase {
    Optional<TransactionFailureReason> getFailureReason();
}