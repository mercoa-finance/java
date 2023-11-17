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

    private final EntityStatus status;

    private final boolean acceptedTos;

    private final boolean isPayor;

    private final boolean isPayee;

    private final boolean ownedByOrg;

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
            EntityStatus status,
            boolean acceptedTos,
            boolean isPayor,
            boolean isPayee,
            boolean ownedByOrg,
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
        this.status = status;
        this.acceptedTos = acceptedTos;
        this.isPayor = isPayor;
        this.isPayee = isPayee;
        this.ownedByOrg = ownedByOrg;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.paymentMethods = paymentMethods;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    @Override
    public String getId() {
        return id;
    }

    @JsonProperty("name")
    @Override
    public String getName() {
        return name;
    }

    @JsonProperty("email")
    @Override
    public String getEmail() {
        return email;
    }

    /**
     * @return The ID used to identify this entity in your system
     */
    @JsonProperty("foreignId")
    @Override
    public Optional<String> getForeignId() {
        return foreignId;
    }

    /**
     * @return Local-part/username of the email address to which to send invoices to be added to the Invoice Inbox.
     */
    @JsonProperty("emailTo")
    @Override
    public Optional<String> getEmailTo() {
        return emailTo;
    }

    /**
     * @return Email inbox alias addresses. Used when forwarding emails to the emailTo address from an alias.
     */
    @JsonProperty("emailToAlias")
    @Override
    public Optional<List<String>> getEmailToAlias() {
        return emailToAlias;
    }

    /**
     * @return True if this entity has a direct relationship with your organization.
     */
    @JsonProperty("isCustomer")
    @Override
    public boolean getIsCustomer() {
        return isCustomer;
    }

    @JsonProperty("accountType")
    @Override
    public AccountType getAccountType() {
        return accountType;
    }

    @JsonProperty("profile")
    @Override
    public ProfileResponse getProfile() {
        return profile;
    }

    @JsonProperty("status")
    @Override
    public EntityStatus getStatus() {
        return status;
    }

    /**
     * @return True if this entity has accepted the terms of service.
     */
    @JsonProperty("acceptedTos")
    @Override
    public boolean getAcceptedTos() {
        return acceptedTos;
    }

    /**
     * @return True if this entity can pay invoices.
     */
    @JsonProperty("isPayor")
    @Override
    public boolean getIsPayor() {
        return isPayor;
    }

    /**
     * @return True if this entity can receive payments.
     */
    @JsonProperty("isPayee")
    @Override
    public boolean getIsPayee() {
        return isPayee;
    }

    /**
     * @return [DEPRECATED - use isCustomer] - True if this entity has a direct relationship with your organization.
     */
    @JsonProperty("ownedByOrg")
    @Override
    public boolean getOwnedByOrg() {
        return ownedByOrg;
    }

    @JsonProperty("createdAt")
    @Override
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updatedAt")
    @Override
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("paymentMethods")
    public Optional<List<PaymentMethodResponse>> getPaymentMethods() {
        return paymentMethods;
    }

    @Override
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
                && status.equals(other.status)
                && acceptedTos == other.acceptedTos
                && isPayor == other.isPayor
                && isPayee == other.isPayee
                && ownedByOrg == other.ownedByOrg
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && paymentMethods.equals(other.paymentMethods);
    }

    @Override
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
                this.status,
                this.acceptedTos,
                this.isPayor,
                this.isPayee,
                this.ownedByOrg,
                this.createdAt,
                this.updatedAt,
                this.paymentMethods);
    }

    @Override
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
        OwnedByOrgStage isPayee(boolean isPayee);
    }

    public interface OwnedByOrgStage {
        CreatedAtStage ownedByOrg(boolean ownedByOrg);
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
                    OwnedByOrgStage,
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

        private boolean ownedByOrg;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<List<PaymentMethodResponse>> paymentMethods = Optional.empty();

        private Optional<List<String>> emailToAlias = Optional.empty();

        private Optional<String> emailTo = Optional.empty();

        private Optional<String> foreignId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
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
            status(other.getStatus());
            acceptedTos(other.getAcceptedTos());
            isPayor(other.getIsPayor());
            isPayee(other.getIsPayee());
            ownedByOrg(other.getOwnedByOrg());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            paymentMethods(other.getPaymentMethods());
            return this;
        }

        @Override
        @JsonSetter("id")
        public NameStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("name")
        public EmailStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("email")
        public IsCustomerStage email(String email) {
            this.email = email;
            return this;
        }

        /**
         * <p>True if this entity has a direct relationship with your organization.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("isCustomer")
        public AccountTypeStage isCustomer(boolean isCustomer) {
            this.isCustomer = isCustomer;
            return this;
        }

        @Override
        @JsonSetter("accountType")
        public ProfileStage accountType(AccountType accountType) {
            this.accountType = accountType;
            return this;
        }

        @Override
        @JsonSetter("profile")
        public StatusStage profile(ProfileResponse profile) {
            this.profile = profile;
            return this;
        }

        @Override
        @JsonSetter("status")
        public AcceptedTosStage status(EntityStatus status) {
            this.status = status;
            return this;
        }

        /**
         * <p>True if this entity has accepted the terms of service.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("acceptedTos")
        public IsPayorStage acceptedTos(boolean acceptedTos) {
            this.acceptedTos = acceptedTos;
            return this;
        }

        /**
         * <p>True if this entity can pay invoices.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("isPayor")
        public IsPayeeStage isPayor(boolean isPayor) {
            this.isPayor = isPayor;
            return this;
        }

        /**
         * <p>True if this entity can receive payments.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("isPayee")
        public OwnedByOrgStage isPayee(boolean isPayee) {
            this.isPayee = isPayee;
            return this;
        }

        /**
         * <p>[DEPRECATED - use isCustomer] - True if this entity has a direct relationship with your organization.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("ownedByOrg")
        public CreatedAtStage ownedByOrg(boolean ownedByOrg) {
            this.ownedByOrg = ownedByOrg;
            return this;
        }

        @Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @Override
        public _FinalStage paymentMethods(List<PaymentMethodResponse> paymentMethods) {
            this.paymentMethods = Optional.of(paymentMethods);
            return this;
        }

        @Override
        @JsonSetter(value = "paymentMethods", nulls = Nulls.SKIP)
        public _FinalStage paymentMethods(Optional<List<PaymentMethodResponse>> paymentMethods) {
            this.paymentMethods = paymentMethods;
            return this;
        }

        /**
         * <p>Email inbox alias addresses. Used when forwarding emails to the emailTo address from an alias.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage emailToAlias(List<String> emailToAlias) {
            this.emailToAlias = Optional.of(emailToAlias);
            return this;
        }

        @Override
        @JsonSetter(value = "emailToAlias", nulls = Nulls.SKIP)
        public _FinalStage emailToAlias(Optional<List<String>> emailToAlias) {
            this.emailToAlias = emailToAlias;
            return this;
        }

        /**
         * <p>Local-part/username of the email address to which to send invoices to be added to the Invoice Inbox.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage emailTo(String emailTo) {
            this.emailTo = Optional.of(emailTo);
            return this;
        }

        @Override
        @JsonSetter(value = "emailTo", nulls = Nulls.SKIP)
        public _FinalStage emailTo(Optional<String> emailTo) {
            this.emailTo = emailTo;
            return this;
        }

        /**
         * <p>The ID used to identify this entity in your system</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage foreignId(String foreignId) {
            this.foreignId = Optional.of(foreignId);
            return this;
        }

        @Override
        @JsonSetter(value = "foreignId", nulls = Nulls.SKIP)
        public _FinalStage foreignId(Optional<String> foreignId) {
            this.foreignId = foreignId;
            return this;
        }

        @Override
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
                    status,
                    acceptedTos,
                    isPayor,
                    isPayee,
                    ownedByOrg,
                    createdAt,
                    updatedAt,
                    paymentMethods,
                    additionalProperties);
        }
    }
}