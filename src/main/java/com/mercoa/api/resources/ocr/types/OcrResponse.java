/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.ocr.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.entitytypes.types.CounterpartyResponse;
import com.mercoa.api.resources.invoicetypes.types.InvoiceResponse;
import com.mercoa.api.resources.paymentmethodtypes.types.BankAccountResponse;
import com.mercoa.api.resources.paymentmethodtypes.types.CheckResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = OcrResponse.Builder.class)
public final class OcrResponse {
    private final InvoiceResponse invoice;

    private final CounterpartyResponse vendor;

    private final Optional<CheckResponse> check;

    private final Optional<BankAccountResponse> bankAccount;

    private final Map<String, Object> additionalProperties;

    private OcrResponse(
            InvoiceResponse invoice,
            CounterpartyResponse vendor,
            Optional<CheckResponse> check,
            Optional<BankAccountResponse> bankAccount,
            Map<String, Object> additionalProperties) {
        this.invoice = invoice;
        this.vendor = vendor;
        this.check = check;
        this.bankAccount = bankAccount;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("invoice")
    public InvoiceResponse getInvoice() {
        return invoice;
    }

    @JsonProperty("vendor")
    public CounterpartyResponse getVendor() {
        return vendor;
    }

    @JsonProperty("check")
    public Optional<CheckResponse> getCheck() {
        return check;
    }

    @JsonProperty("bankAccount")
    public Optional<BankAccountResponse> getBankAccount() {
        return bankAccount;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OcrResponse && equalTo((OcrResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(OcrResponse other) {
        return invoice.equals(other.invoice)
                && vendor.equals(other.vendor)
                && check.equals(other.check)
                && bankAccount.equals(other.bankAccount);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.invoice, this.vendor, this.check, this.bankAccount);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static InvoiceStage builder() {
        return new Builder();
    }

    public interface InvoiceStage {
        VendorStage invoice(InvoiceResponse invoice);

        Builder from(OcrResponse other);
    }

    public interface VendorStage {
        _FinalStage vendor(CounterpartyResponse vendor);
    }

    public interface _FinalStage {
        OcrResponse build();

        _FinalStage check(Optional<CheckResponse> check);

        _FinalStage check(CheckResponse check);

        _FinalStage bankAccount(Optional<BankAccountResponse> bankAccount);

        _FinalStage bankAccount(BankAccountResponse bankAccount);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements InvoiceStage, VendorStage, _FinalStage {
        private InvoiceResponse invoice;

        private CounterpartyResponse vendor;

        private Optional<BankAccountResponse> bankAccount = Optional.empty();

        private Optional<CheckResponse> check = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(OcrResponse other) {
            invoice(other.getInvoice());
            vendor(other.getVendor());
            check(other.getCheck());
            bankAccount(other.getBankAccount());
            return this;
        }

        @java.lang.Override
        @JsonSetter("invoice")
        public VendorStage invoice(InvoiceResponse invoice) {
            this.invoice = invoice;
            return this;
        }

        @java.lang.Override
        @JsonSetter("vendor")
        public _FinalStage vendor(CounterpartyResponse vendor) {
            this.vendor = vendor;
            return this;
        }

        @java.lang.Override
        public _FinalStage bankAccount(BankAccountResponse bankAccount) {
            this.bankAccount = Optional.ofNullable(bankAccount);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "bankAccount", nulls = Nulls.SKIP)
        public _FinalStage bankAccount(Optional<BankAccountResponse> bankAccount) {
            this.bankAccount = bankAccount;
            return this;
        }

        @java.lang.Override
        public _FinalStage check(CheckResponse check) {
            this.check = Optional.ofNullable(check);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "check", nulls = Nulls.SKIP)
        public _FinalStage check(Optional<CheckResponse> check) {
            this.check = check;
            return this;
        }

        @java.lang.Override
        public OcrResponse build() {
            return new OcrResponse(invoice, vendor, check, bankAccount, additionalProperties);
        }
    }
}
