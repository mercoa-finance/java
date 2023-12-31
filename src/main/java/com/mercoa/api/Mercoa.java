/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api;

import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.Suppliers;
import com.mercoa.api.resources.banklookup.BankLookupClient;
import com.mercoa.api.resources.entity.EntityClient;
import com.mercoa.api.resources.invoice.InvoiceClient;
import com.mercoa.api.resources.ocr.OcrClient;
import com.mercoa.api.resources.organization.OrganizationClient;
import com.mercoa.api.resources.paymentmethodschema.PaymentMethodSchemaClient;
import java.util.function.Supplier;

public class Mercoa {
    protected final ClientOptions clientOptions;

    protected final Supplier<EntityClient> entityClient;

    protected final Supplier<InvoiceClient> invoiceClient;

    protected final Supplier<OrganizationClient> organizationClient;

    protected final Supplier<BankLookupClient> bankLookupClient;

    protected final Supplier<OcrClient> ocrClient;

    protected final Supplier<PaymentMethodSchemaClient> paymentMethodSchemaClient;

    public Mercoa(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.entityClient = Suppliers.memoize(() -> new EntityClient(clientOptions));
        this.invoiceClient = Suppliers.memoize(() -> new InvoiceClient(clientOptions));
        this.organizationClient = Suppliers.memoize(() -> new OrganizationClient(clientOptions));
        this.bankLookupClient = Suppliers.memoize(() -> new BankLookupClient(clientOptions));
        this.ocrClient = Suppliers.memoize(() -> new OcrClient(clientOptions));
        this.paymentMethodSchemaClient = Suppliers.memoize(() -> new PaymentMethodSchemaClient(clientOptions));
    }

    public EntityClient entity() {
        return this.entityClient.get();
    }

    public InvoiceClient invoice() {
        return this.invoiceClient.get();
    }

    public OrganizationClient organization() {
        return this.organizationClient.get();
    }

    public BankLookupClient bankLookup() {
        return this.bankLookupClient.get();
    }

    public OcrClient ocr() {
        return this.ocrClient.get();
    }

    public PaymentMethodSchemaClient paymentMethodSchema() {
        return this.paymentMethodSchemaClient.get();
    }

    public static MercoaBuilder builder() {
        return new MercoaBuilder();
    }
}
