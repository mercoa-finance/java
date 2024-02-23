/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.entitytypes.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TokenGenerationOptions.Builder.class)
public final class TokenGenerationOptions {
    private final Optional<String> expiresIn;

    private final Optional<TokenGenerationInvoiceOptions> invoice;

    private final Optional<TokenGenerationPagesOptions> pages;

    private final Optional<TokenGenerationStyleOptions> style;

    private final Optional<TokenGenerationVendorOptions> vendors;

    private final Optional<TokenGenerationEntityOptions> entity;

    private final Map<String, Object> additionalProperties;

    private TokenGenerationOptions(
            Optional<String> expiresIn,
            Optional<TokenGenerationInvoiceOptions> invoice,
            Optional<TokenGenerationPagesOptions> pages,
            Optional<TokenGenerationStyleOptions> style,
            Optional<TokenGenerationVendorOptions> vendors,
            Optional<TokenGenerationEntityOptions> entity,
            Map<String, Object> additionalProperties) {
        this.expiresIn = expiresIn;
        this.invoice = invoice;
        this.pages = pages;
        this.style = style;
        this.vendors = vendors;
        this.entity = entity;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Expressed in seconds or a string describing a time span. The default is 1h.
     */
    @JsonProperty("expiresIn")
    public Optional<String> getExpiresIn() {
        return expiresIn;
    }

    @JsonProperty("invoice")
    public Optional<TokenGenerationInvoiceOptions> getInvoice() {
        return invoice;
    }

    @JsonProperty("pages")
    public Optional<TokenGenerationPagesOptions> getPages() {
        return pages;
    }

    @JsonProperty("style")
    public Optional<TokenGenerationStyleOptions> getStyle() {
        return style;
    }

    @JsonProperty("vendors")
    public Optional<TokenGenerationVendorOptions> getVendors() {
        return vendors;
    }

    @JsonProperty("entity")
    public Optional<TokenGenerationEntityOptions> getEntity() {
        return entity;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TokenGenerationOptions && equalTo((TokenGenerationOptions) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TokenGenerationOptions other) {
        return expiresIn.equals(other.expiresIn)
                && invoice.equals(other.invoice)
                && pages.equals(other.pages)
                && style.equals(other.style)
                && vendors.equals(other.vendors)
                && entity.equals(other.entity);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.expiresIn, this.invoice, this.pages, this.style, this.vendors, this.entity);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> expiresIn = Optional.empty();

        private Optional<TokenGenerationInvoiceOptions> invoice = Optional.empty();

        private Optional<TokenGenerationPagesOptions> pages = Optional.empty();

        private Optional<TokenGenerationStyleOptions> style = Optional.empty();

        private Optional<TokenGenerationVendorOptions> vendors = Optional.empty();

        private Optional<TokenGenerationEntityOptions> entity = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TokenGenerationOptions other) {
            expiresIn(other.getExpiresIn());
            invoice(other.getInvoice());
            pages(other.getPages());
            style(other.getStyle());
            vendors(other.getVendors());
            entity(other.getEntity());
            return this;
        }

        @JsonSetter(value = "expiresIn", nulls = Nulls.SKIP)
        public Builder expiresIn(Optional<String> expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        public Builder expiresIn(String expiresIn) {
            this.expiresIn = Optional.of(expiresIn);
            return this;
        }

        @JsonSetter(value = "invoice", nulls = Nulls.SKIP)
        public Builder invoice(Optional<TokenGenerationInvoiceOptions> invoice) {
            this.invoice = invoice;
            return this;
        }

        public Builder invoice(TokenGenerationInvoiceOptions invoice) {
            this.invoice = Optional.of(invoice);
            return this;
        }

        @JsonSetter(value = "pages", nulls = Nulls.SKIP)
        public Builder pages(Optional<TokenGenerationPagesOptions> pages) {
            this.pages = pages;
            return this;
        }

        public Builder pages(TokenGenerationPagesOptions pages) {
            this.pages = Optional.of(pages);
            return this;
        }

        @JsonSetter(value = "style", nulls = Nulls.SKIP)
        public Builder style(Optional<TokenGenerationStyleOptions> style) {
            this.style = style;
            return this;
        }

        public Builder style(TokenGenerationStyleOptions style) {
            this.style = Optional.of(style);
            return this;
        }

        @JsonSetter(value = "vendors", nulls = Nulls.SKIP)
        public Builder vendors(Optional<TokenGenerationVendorOptions> vendors) {
            this.vendors = vendors;
            return this;
        }

        public Builder vendors(TokenGenerationVendorOptions vendors) {
            this.vendors = Optional.of(vendors);
            return this;
        }

        @JsonSetter(value = "entity", nulls = Nulls.SKIP)
        public Builder entity(Optional<TokenGenerationEntityOptions> entity) {
            this.entity = entity;
            return this;
        }

        public Builder entity(TokenGenerationEntityOptions entity) {
            this.entity = Optional.of(entity);
            return this;
        }

        public TokenGenerationOptions build() {
            return new TokenGenerationOptions(expiresIn, invoice, pages, style, vendors, entity, additionalProperties);
        }
    }
}
