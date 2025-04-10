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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ApproverRule.Builder.class)
public final class ApproverRule {
    private final int numApprovers;

    private final IdentifierList identifierList;

    private final Optional<Boolean> autoAssign;

    private final Map<String, Object> additionalProperties;

    private ApproverRule(
            int numApprovers,
            IdentifierList identifierList,
            Optional<Boolean> autoAssign,
            Map<String, Object> additionalProperties) {
        this.numApprovers = numApprovers;
        this.identifierList = identifierList;
        this.autoAssign = autoAssign;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Number of approvals required to approve an invoice
     */
    @JsonProperty("numApprovers")
    public int getNumApprovers() {
        return numApprovers;
    }

    /**
     * @return List of users or roles that should be used to determine eligible approvers
     */
    @JsonProperty("identifierList")
    public IdentifierList getIdentifierList() {
        return identifierList;
    }

    /**
     * @return If true, the policy will automatically assign approvers to the invoice. If more than one approver is eligible, the policy will assign all eligible approvers to the invoice.
     */
    @JsonProperty("autoAssign")
    public Optional<Boolean> getAutoAssign() {
        return autoAssign;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ApproverRule && equalTo((ApproverRule) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ApproverRule other) {
        return numApprovers == other.numApprovers
                && identifierList.equals(other.identifierList)
                && autoAssign.equals(other.autoAssign);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.numApprovers, this.identifierList, this.autoAssign);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NumApproversStage builder() {
        return new Builder();
    }

    public interface NumApproversStage {
        IdentifierListStage numApprovers(int numApprovers);

        Builder from(ApproverRule other);
    }

    public interface IdentifierListStage {
        _FinalStage identifierList(@NotNull IdentifierList identifierList);
    }

    public interface _FinalStage {
        ApproverRule build();

        _FinalStage autoAssign(Optional<Boolean> autoAssign);

        _FinalStage autoAssign(Boolean autoAssign);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NumApproversStage, IdentifierListStage, _FinalStage {
        private int numApprovers;

        private IdentifierList identifierList;

        private Optional<Boolean> autoAssign = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ApproverRule other) {
            numApprovers(other.getNumApprovers());
            identifierList(other.getIdentifierList());
            autoAssign(other.getAutoAssign());
            return this;
        }

        /**
         * <p>Number of approvals required to approve an invoice</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("numApprovers")
        public IdentifierListStage numApprovers(int numApprovers) {
            this.numApprovers = numApprovers;
            return this;
        }

        /**
         * <p>List of users or roles that should be used to determine eligible approvers</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("identifierList")
        public _FinalStage identifierList(@NotNull IdentifierList identifierList) {
            this.identifierList = Objects.requireNonNull(identifierList, "identifierList must not be null");
            return this;
        }

        /**
         * <p>If true, the policy will automatically assign approvers to the invoice. If more than one approver is eligible, the policy will assign all eligible approvers to the invoice.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage autoAssign(Boolean autoAssign) {
            this.autoAssign = Optional.ofNullable(autoAssign);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "autoAssign", nulls = Nulls.SKIP)
        public _FinalStage autoAssign(Optional<Boolean> autoAssign) {
            this.autoAssign = autoAssign;
            return this;
        }

        @java.lang.Override
        public ApproverRule build() {
            return new ApproverRule(numApprovers, identifierList, autoAssign, additionalProperties);
        }
    }
}
