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
import com.mercoa.api.resources.paymentmethodtypes.types.PaymentMethodResponse;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EntityWithPaymentMethodResponse.Builder.class)
public final class EntityWithPaymentMethodResponse implements IEntityResponse {
    private final String id;

    private final String name;

    private final String email;

    private final Optional<String> foreignId;

    private final Optional<String> emailTo;

    private final Optional<List<String>> emailToAlias;

    private final boolean isCustomer;

    private final AccountType accountType;

    private final ProfileResponse profile;

    private final Optional<String> logo;

    private final EntityStatus status;

    private final boolean acceptedTos;

    private final boolean isPayor;

    private final boolean isPayee;

    private final boolean isNetworkPayor;

    private final boolean isNetworkPayee;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Optional<List<PaymentMethodResponse>> paymentMethods;

    private final Map<String, Object> additionalProperties;

    private EntityWithPaymentMethodResponse(
            String id,
            String name,
            String email,
            Optional<String> foreignId,
            Optional<String> emailTo,
            Optional<List<String>> emailToAlias,
            boolean isCustomer,
            AccountType accountType,
            ProfileResponse profile,
            Optional<String> logo,
            EntityStatus status,
            boolean acceptedTos,
            boolean isPayor,
            boolean isPayee,
            boolean isNetworkPayor,
            boolean isNetworkPayee,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Optional<List<PaymentMethodResponse>> paymentMethods,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.foreignId = foreignId;
        this.emailTo = emailTo;
        this.emailToAlias = emailToAlias;
        this.isCustomer = isCustomer;
        this.accountType = accountType;
        this.profile = profile;
        this.logo = logo;
        this.status = status;
        this.acceptedTos = acceptedTos;
        this.isPayor = isPayor;
        this.isPayee = isPayee;
        this.isNetworkPayor = isNetworkPayor;
        this.isNetworkPayee = isNetworkPayee;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.paymentMethods = paymentMethods;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    @java.lang.Override
    public String getId() {
        return id;
    }

    @JsonProperty("name")
    @java.lang.Override
    public String getName() {
        return name;
    }

    @JsonProperty("email")
    @java.lang.Override
    public String getEmail() {
        return email;
    }

    /**
     * @return The ID used to identify this entity in your system
     */
    @JsonProperty("foreignId")
    @java.lang.Override
    public Optional<String> getForeignId() {
        return foreignId;
    }

    /**
     * @return Local-part/username of the email address to which to send invoices to be added to the Invoice Inbox.
     */
    @JsonProperty("emailTo")
    @java.lang.Override
    public Optional<String> getEmailTo() {
        return emailTo;
    }

    /**
     * @return Email inbox alias addresses. Used when forwarding emails to the emailTo address from an alias.
     */
    @JsonProperty("emailToAlias")
    @java.lang.Override
    public Optional<List<String>> getEmailToAlias() {
        return emailToAlias;
    }

    /**
     * @return True if this entity has a direct relationship with your organization.
     */
    @JsonProperty("isCustomer")
    @java.lang.Override
    public boolean getIsCustomer() {
        return isCustomer;
    }

    @JsonProperty("accountType")
    @java.lang.Override
    public AccountType getAccountType() {
        return accountType;
    }

    @JsonProperty("profile")
    @java.lang.Override
    public ProfileResponse getProfile() {
        return profile;
    }

    /**
     * @return URL for the entity logo
     */
    @JsonProperty("logo")
    @java.lang.Override
    public Optional<String> getLogo() {
        return logo;
    }

    @JsonProperty("status")
    @java.lang.Override
    public EntityStatus getStatus() {
        return status;
    }

    /**
     * @return True if this entity has accepted the terms of service.
     */
    @JsonProperty("acceptedTos")
    @java.lang.Override
    public boolean getAcceptedTos() {
        return acceptedTos;
    }

    /**
     * @return True if this entity can pay invoices.
     */
    @JsonProperty("isPayor")
    @java.lang.Override
    public boolean getIsPayor() {
        return isPayor;
    }

    /**
     * @return True if this entity can receive payments.
     */
    @JsonProperty("isPayee")
    @java.lang.Override
    public boolean getIsPayee() {
        return isPayee;
    }

    /**
     * @return True if this entity is available as a payor to any entity on your platform. Otherwise this entity will only be available as a payor to entities that have a direct relationship with this entity.
     */
    @JsonProperty("isNetworkPayor")
    @java.lang.Override
    public boolean getIsNetworkPayor() {
        return isNetworkPayor;
    }

    /**
     * @return True if this entity is available as a payee to any entity on your platform. Otherwise this entity will only be available as a payee to entities that have a direct relationship with this entity.
     */
    @JsonProperty("isNetworkPayee")
    @java.lang.Override
    public boolean getIsNetworkPayee() {
        return isNetworkPayee;
    }

    @JsonProperty("createdAt")
    @java.lang.Override
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updatedAt")
    @java.lang.Override
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("paymentMethods")
    public Optional<List<PaymentMethodResponse>> getPaymentMethods() {
        return paymentMethods;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityWithPaymentMethodResponse && equalTo((EntityWithPaymentMethodResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityWithPaymentMethodResponse other) {
        return id.equals(other.id)
                && name.equals(other.name)
                && email.equals(other.email)
                && foreignId.equals(other.foreignId)
                && emailTo.equals(other.emailTo)
                && emailToAlias.equals(other.emailToAlias)
                && isCustomer == other.isCustomer
                && accountType.equals(other.accountType)
                && profile.equals(other.profile)
                && logo.equals(other.logo)
                && status.equals(other.status)
                && acceptedTos == other.acceptedTos
                && isPayor == other.isPayor
                && isPayee == other.isPayee
                && isNetworkPayor == other.isNetworkPayor
                && isNetworkPayee == other.isNetworkPayee
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && paymentMethods.equals(other.paymentMethods);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.name,
                this.email,
                this.foreignId,
                this.emailTo,
                this.emailToAlias,
                this.isCustomer,
                this.accountType,
                this.profile,
                this.logo,
                this.status,
                this.acceptedTos,
                this.isPayor,
                this.isPayee,
                this.isNetworkPayor,
                this.isNetworkPayee,
                this.createdAt,
                this.updatedAt,
                this.paymentMethods);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        NameStage id(String id);

        Builder from(EntityWithPaymentMethodResponse other);
    }

    public interface NameStage {
        EmailStage name(String name);
    }

    public interface EmailStage {
        IsCustomerStage email(String email);
    }

    public interface IsCustomerStage {
        AccountTypeStage isCustomer(boolean isCustomer);
    }

    public interface AccountTypeStage {
        ProfileStage accountType(AccountType accountType);
    }

    public interface ProfileStage {
        StatusStage profile(ProfileResponse profile);
    }

    public interface StatusStage {
        AcceptedTosStage status(EntityStatus status);
    }

    public interface AcceptedTosStage {
        IsPayorStage acceptedTos(boolean acceptedTos);
    }

    public interface IsPayorStage {
        IsPayeeStage isPayor(boolean isPayor);
    }

    public interface IsPayeeStage {
        IsNetworkPayorStage isPayee(boolean isPayee);
    }

    public interface IsNetworkPayorStage {
        IsNetworkPayeeStage isNetworkPayor(boolean isNetworkPayor);
    }

    public interface IsNetworkPayeeStage {
        CreatedAtStage isNetworkPayee(boolean isNetworkPayee);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        EntityWithPaymentMethodResponse build();

        _FinalStage foreignId(Optional<String> foreignId);

        _FinalStage foreignId(String foreignId);

        _FinalStage emailTo(Optional<String> emailTo);

        _FinalStage emailTo(String emailTo);

        _FinalStage emailToAlias(Optional<List<String>> emailToAlias);

        _FinalStage emailToAlias(List<String> emailToAlias);

        _FinalStage logo(Optional<String> logo);

        _FinalStage logo(String logo);

        _FinalStage paymentMethods(Optional<List<PaymentMethodResponse>> paymentMethods);

        _FinalStage paymentMethods(List<PaymentMethodResponse> paymentMethods);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    NameStage,
                    EmailStage,
                    IsCustomerStage,
                    AccountTypeStage,
                    ProfileStage,
                    StatusStage,
                    AcceptedTosStage,
                    IsPayorStage,
                    IsPayeeStage,
                    IsNetworkPayorStage,
                    IsNetworkPayeeStage,
                    CreatedAtStage,
                    UpdatedAtStage,
                    _FinalStage {
        private String id;

        private String name;

        private String email;

        private boolean isCustomer;

        private AccountType accountType;

        private ProfileResponse profile;

        private EntityStatus status;

        private boolean acceptedTos;

        private boolean isPayor;

        private boolean isPayee;

        private boolean isNetworkPayor;

        private boolean isNetworkPayee;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<List<PaymentMethodResponse>> paymentMethods = Optional.empty();

        private Optional<String> logo = Optional.empty();

        private Optional<List<String>> emailToAlias = Optional.empty();

        private Optional<String> emailTo = Optional.empty();

        private Optional<String> foreignId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EntityWithPaymentMethodResponse other) {
            id(other.getId());
            name(other.getName());
            email(other.getEmail());
            foreignId(other.getForeignId());
            emailTo(other.getEmailTo());
            emailToAlias(other.getEmailToAlias());
            isCustomer(other.getIsCustomer());
            accountType(other.getAccountType());
            profile(other.getProfile());
            logo(other.getLogo());
            status(other.getStatus());
            acceptedTos(other.getAcceptedTos());
            isPayor(other.getIsPayor());
            isPayee(other.getIsPayee());
            isNetworkPayor(other.getIsNetworkPayor());
            isNetworkPayee(other.getIsNetworkPayee());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            paymentMethods(other.getPaymentMethods());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public NameStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public EmailStage name(String name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        @JsonSetter("email")
        public IsCustomerStage email(String email) {
            this.email = email;
            return this;
        }

        /**
         * <p>True if this entity has a direct relationship with your organization.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("isCustomer")
        public AccountTypeStage isCustomer(boolean isCustomer) {
            this.isCustomer = isCustomer;
            return this;
        }

        @java.lang.Override
        @JsonSetter("accountType")
        public ProfileStage accountType(AccountType accountType) {
            this.accountType = accountType;
            return this;
        }

        @java.lang.Override
        @JsonSetter("profile")
        public StatusStage profile(ProfileResponse profile) {
            this.profile = profile;
            return this;
        }

        @java.lang.Override
        @JsonSetter("status")
        public AcceptedTosStage status(EntityStatus status) {
            this.status = status;
            return this;
        }

        /**
         * <p>True if this entity has accepted the terms of service.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("acceptedTos")
        public IsPayorStage acceptedTos(boolean acceptedTos) {
            this.acceptedTos = acceptedTos;
            return this;
        }

        /**
         * <p>True if this entity can pay invoices.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("isPayor")
        public IsPayeeStage isPayor(boolean isPayor) {
            this.isPayor = isPayor;
            return this;
        }

        /**
         * <p>True if this entity can receive payments.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("isPayee")
        public IsNetworkPayorStage isPayee(boolean isPayee) {
            this.isPayee = isPayee;
            return this;
        }

        /**
         * <p>True if this entity is available as a payor to any entity on your platform. Otherwise this entity will only be available as a payor to entities that have a direct relationship with this entity.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("isNetworkPayor")
        public IsNetworkPayeeStage isNetworkPayor(boolean isNetworkPayor) {
            this.isNetworkPayor = isNetworkPayor;
            return this;
        }

        /**
         * <p>True if this entity is available as a payee to any entity on your platform. Otherwise this entity will only be available as a payee to entities that have a direct relationship with this entity.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("isNetworkPayee")
        public CreatedAtStage isNetworkPayee(boolean isNetworkPayee) {
            this.isNetworkPayee = isNetworkPayee;
            return this;
        }

        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @java.lang.Override
        public _FinalStage paymentMethods(List<PaymentMethodResponse> paymentMethods) {
            this.paymentMethods = Optional.of(paymentMethods);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "paymentMethods", nulls = Nulls.SKIP)
        public _FinalStage paymentMethods(Optional<List<PaymentMethodResponse>> paymentMethods) {
            this.paymentMethods = paymentMethods;
            return this;
        }

        /**
         * <p>URL for the entity logo</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage logo(String logo) {
            this.logo = Optional.of(logo);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "logo", nulls = Nulls.SKIP)
        public _FinalStage logo(Optional<String> logo) {
            this.logo = logo;
            return this;
        }

        /**
         * <p>Email inbox alias addresses. Used when forwarding emails to the emailTo address from an alias.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage emailToAlias(List<String> emailToAlias) {
            this.emailToAlias = Optional.of(emailToAlias);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "emailToAlias", nulls = Nulls.SKIP)
        public _FinalStage emailToAlias(Optional<List<String>> emailToAlias) {
            this.emailToAlias = emailToAlias;
            return this;
        }

        /**
         * <p>Local-part/username of the email address to which to send invoices to be added to the Invoice Inbox.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage emailTo(String emailTo) {
            this.emailTo = Optional.of(emailTo);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "emailTo", nulls = Nulls.SKIP)
        public _FinalStage emailTo(Optional<String> emailTo) {
            this.emailTo = emailTo;
            return this;
        }

        /**
         * <p>The ID used to identify this entity in your system</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage foreignId(String foreignId) {
            this.foreignId = Optional.of(foreignId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "foreignId", nulls = Nulls.SKIP)
        public _FinalStage foreignId(Optional<String> foreignId) {
            this.foreignId = foreignId;
            return this;
        }

        @java.lang.Override
        public EntityWithPaymentMethodResponse build() {
            return new EntityWithPaymentMethodResponse(
                    id,
                    name,
                    email,
                    foreignId,
                    emailTo,
                    emailToAlias,
                    isCustomer,
                    accountType,
                    profile,
                    logo,
                    status,
                    acceptedTos,
                    isPayor,
                    isPayee,
                    isNetworkPayor,
                    isNetworkPayee,
                    createdAt,
                    updatedAt,
                    paymentMethods,
                    additionalProperties);
        }
    }
}
