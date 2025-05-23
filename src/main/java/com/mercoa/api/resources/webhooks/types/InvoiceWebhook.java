/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.webhooks.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.entitytypes.types.EntityUserResponse;
import com.mercoa.api.resources.invoicetypes.types.InvoiceResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = InvoiceWebhook.Builder.class)
public final class InvoiceWebhook implements IInvoiceWebhook {
    private final String eventType;

    private final InvoiceResponse invoice;

    private final Optional<EntityUserResponse> user;

    private final Map<String, Object> additionalProperties;

    private InvoiceWebhook(
            String eventType,
            InvoiceResponse invoice,
            Optional<EntityUserResponse> user,
            Map<String, Object> additionalProperties) {
        this.eventType = eventType;
        this.invoice = invoice;
        this.user = user;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The type of the event.
     */
    @JsonProperty("eventType")
    @java.lang.Override
    public String getEventType() {
        return eventType;
    }

    /**
     * @return The invoice involved in the event.
     */
    @JsonProperty("invoice")
    @java.lang.Override
    public InvoiceResponse getInvoice() {
        return invoice;
    }

    /**
     * @return User who initiated the change.
     */
    @JsonProperty("user")
    @java.lang.Override
    public Optional<EntityUserResponse> getUser() {
        return user;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof InvoiceWebhook && equalTo((InvoiceWebhook) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(InvoiceWebhook other) {
        return eventType.equals(other.eventType) && invoice.equals(other.invoice) && user.equals(other.user);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.eventType, this.invoice, this.user);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EventTypeStage builder() {
        return new Builder();
    }

    public interface EventTypeStage {
        InvoiceStage eventType(@NotNull String eventType);

        Builder from(InvoiceWebhook other);
    }

    public interface InvoiceStage {
        _FinalStage invoice(@NotNull InvoiceResponse invoice);
    }

    public interface _FinalStage {
        InvoiceWebhook build();

        _FinalStage user(Optional<EntityUserResponse> user);

        _FinalStage user(EntityUserResponse user);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EventTypeStage, InvoiceStage, _FinalStage {
        private String eventType;

        private InvoiceResponse invoice;

        private Optional<EntityUserResponse> user = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(InvoiceWebhook other) {
            eventType(other.getEventType());
            invoice(other.getInvoice());
            user(other.getUser());
            return this;
        }

        /**
         * <p>The type of the event.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("eventType")
        public InvoiceStage eventType(@NotNull String eventType) {
            this.eventType = Objects.requireNonNull(eventType, "eventType must not be null");
            return this;
        }

        /**
         * <p>The invoice involved in the event.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("invoice")
        public _FinalStage invoice(@NotNull InvoiceResponse invoice) {
            this.invoice = Objects.requireNonNull(invoice, "invoice must not be null");
            return this;
        }

        /**
         * <p>User who initiated the change.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage user(EntityUserResponse user) {
            this.user = Optional.ofNullable(user);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "user", nulls = Nulls.SKIP)
        public _FinalStage user(Optional<EntityUserResponse> user) {
            this.user = user;
            return this;
        }

        @java.lang.Override
        public InvoiceWebhook build() {
            return new InvoiceWebhook(eventType, invoice, user, additionalProperties);
        }
    }
}
