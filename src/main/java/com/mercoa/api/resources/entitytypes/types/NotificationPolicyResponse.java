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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = NotificationPolicyResponse.Builder.class)
public final class NotificationPolicyResponse {
    private final boolean disabled;

    private final List<String> additionalRoles;

    private final List<String> additionalUsers;

    private final boolean notifyPayeeCounterparty;

    private final boolean notifyPayorCounterparty;

    private final NotificationType type;

    private final Map<String, Object> additionalProperties;

    private NotificationPolicyResponse(
            boolean disabled,
            List<String> additionalRoles,
            List<String> additionalUsers,
            boolean notifyPayeeCounterparty,
            boolean notifyPayorCounterparty,
            NotificationType type,
            Map<String, Object> additionalProperties) {
        this.disabled = disabled;
        this.additionalRoles = additionalRoles;
        this.additionalUsers = additionalUsers;
        this.notifyPayeeCounterparty = notifyPayeeCounterparty;
        this.notifyPayorCounterparty = notifyPayorCounterparty;
        this.type = type;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return True if the selected notification type is disabled for this entity
     */
    @JsonProperty("disabled")
    public boolean getDisabled() {
        return disabled;
    }

    /**
     * @return List of user roles that should receive notifications in addition to the default users for this notification type
     */
    @JsonProperty("additionalRoles")
    public List<String> getAdditionalRoles() {
        return additionalRoles;
    }

    /**
     * @return List of user IDs that should receive notifications in addition to the default users for this notification type
     */
    @JsonProperty("additionalUsers")
    public List<String> getAdditionalUsers() {
        return additionalUsers;
    }

    /**
     * @return True if the selected notification type should be sent to the counterparty if this is a payable invoice.
     */
    @JsonProperty("notifyPayeeCounterparty")
    public boolean getNotifyPayeeCounterparty() {
        return notifyPayeeCounterparty;
    }

    /**
     * @return True if the selected notification type should be sent to the counterparty if this is a receivable invoice.
     */
    @JsonProperty("notifyPayorCounterparty")
    public boolean getNotifyPayorCounterparty() {
        return notifyPayorCounterparty;
    }

    @JsonProperty("type")
    public NotificationType getType() {
        return type;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NotificationPolicyResponse && equalTo((NotificationPolicyResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NotificationPolicyResponse other) {
        return disabled == other.disabled
                && additionalRoles.equals(other.additionalRoles)
                && additionalUsers.equals(other.additionalUsers)
                && notifyPayeeCounterparty == other.notifyPayeeCounterparty
                && notifyPayorCounterparty == other.notifyPayorCounterparty
                && type.equals(other.type);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.disabled,
                this.additionalRoles,
                this.additionalUsers,
                this.notifyPayeeCounterparty,
                this.notifyPayorCounterparty,
                this.type);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DisabledStage builder() {
        return new Builder();
    }

    public interface DisabledStage {
        NotifyPayeeCounterpartyStage disabled(boolean disabled);

        Builder from(NotificationPolicyResponse other);
    }

    public interface NotifyPayeeCounterpartyStage {
        NotifyPayorCounterpartyStage notifyPayeeCounterparty(boolean notifyPayeeCounterparty);
    }

    public interface NotifyPayorCounterpartyStage {
        TypeStage notifyPayorCounterparty(boolean notifyPayorCounterparty);
    }

    public interface TypeStage {
        _FinalStage type(@NotNull NotificationType type);
    }

    public interface _FinalStage {
        NotificationPolicyResponse build();

        _FinalStage additionalRoles(List<String> additionalRoles);

        _FinalStage addAdditionalRoles(String additionalRoles);

        _FinalStage addAllAdditionalRoles(List<String> additionalRoles);

        _FinalStage additionalUsers(List<String> additionalUsers);

        _FinalStage addAdditionalUsers(String additionalUsers);

        _FinalStage addAllAdditionalUsers(List<String> additionalUsers);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements DisabledStage,
                    NotifyPayeeCounterpartyStage,
                    NotifyPayorCounterpartyStage,
                    TypeStage,
                    _FinalStage {
        private boolean disabled;

        private boolean notifyPayeeCounterparty;

        private boolean notifyPayorCounterparty;

        private NotificationType type;

        private List<String> additionalUsers = new ArrayList<>();

        private List<String> additionalRoles = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(NotificationPolicyResponse other) {
            disabled(other.getDisabled());
            additionalRoles(other.getAdditionalRoles());
            additionalUsers(other.getAdditionalUsers());
            notifyPayeeCounterparty(other.getNotifyPayeeCounterparty());
            notifyPayorCounterparty(other.getNotifyPayorCounterparty());
            type(other.getType());
            return this;
        }

        /**
         * <p>True if the selected notification type is disabled for this entity</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("disabled")
        public NotifyPayeeCounterpartyStage disabled(boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * <p>True if the selected notification type should be sent to the counterparty if this is a payable invoice.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("notifyPayeeCounterparty")
        public NotifyPayorCounterpartyStage notifyPayeeCounterparty(boolean notifyPayeeCounterparty) {
            this.notifyPayeeCounterparty = notifyPayeeCounterparty;
            return this;
        }

        /**
         * <p>True if the selected notification type should be sent to the counterparty if this is a receivable invoice.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("notifyPayorCounterparty")
        public TypeStage notifyPayorCounterparty(boolean notifyPayorCounterparty) {
            this.notifyPayorCounterparty = notifyPayorCounterparty;
            return this;
        }

        @java.lang.Override
        @JsonSetter("type")
        public _FinalStage type(@NotNull NotificationType type) {
            this.type = Objects.requireNonNull(type, "type must not be null");
            return this;
        }

        /**
         * <p>List of user IDs that should receive notifications in addition to the default users for this notification type</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllAdditionalUsers(List<String> additionalUsers) {
            this.additionalUsers.addAll(additionalUsers);
            return this;
        }

        /**
         * <p>List of user IDs that should receive notifications in addition to the default users for this notification type</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAdditionalUsers(String additionalUsers) {
            this.additionalUsers.add(additionalUsers);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "additionalUsers", nulls = Nulls.SKIP)
        public _FinalStage additionalUsers(List<String> additionalUsers) {
            this.additionalUsers.clear();
            this.additionalUsers.addAll(additionalUsers);
            return this;
        }

        /**
         * <p>List of user roles that should receive notifications in addition to the default users for this notification type</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllAdditionalRoles(List<String> additionalRoles) {
            this.additionalRoles.addAll(additionalRoles);
            return this;
        }

        /**
         * <p>List of user roles that should receive notifications in addition to the default users for this notification type</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAdditionalRoles(String additionalRoles) {
            this.additionalRoles.add(additionalRoles);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "additionalRoles", nulls = Nulls.SKIP)
        public _FinalStage additionalRoles(List<String> additionalRoles) {
            this.additionalRoles.clear();
            this.additionalRoles.addAll(additionalRoles);
            return this;
        }

        @java.lang.Override
        public NotificationPolicyResponse build() {
            return new NotificationPolicyResponse(
                    disabled,
                    additionalRoles,
                    additionalUsers,
                    notifyPayeeCounterparty,
                    notifyPayorCounterparty,
                    type,
                    additionalProperties);
        }
    }
}
