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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ApprovalPolicyRequest.Builder.class)
public final class ApprovalPolicyRequest {
    private final List<Trigger> trigger;

    private final Rule rule;

    private final String upstreamPolicyId;

    private final Map<String, Object> additionalProperties;

    private ApprovalPolicyRequest(
            List<Trigger> trigger, Rule rule, String upstreamPolicyId, Map<String, Object> additionalProperties) {
        this.trigger = trigger;
        this.rule = rule;
        this.upstreamPolicyId = upstreamPolicyId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return List of triggers that will cause this policy to be evaluated. If no triggers are provided, the policy will be evaluated for all invoices.
     */
    @JsonProperty("trigger")
    public List<Trigger> getTrigger() {
        return trigger;
    }

    @JsonProperty("rule")
    public Rule getRule() {
        return rule;
    }

    /**
     * @return The policy ID of the previous approval policy in the chain of policies. Use 'root' if no upstreamPolicyId is intended to be set.
     */
    @JsonProperty("upstreamPolicyId")
    public String getUpstreamPolicyId() {
        return upstreamPolicyId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ApprovalPolicyRequest && equalTo((ApprovalPolicyRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ApprovalPolicyRequest other) {
        return trigger.equals(other.trigger)
                && rule.equals(other.rule)
                && upstreamPolicyId.equals(other.upstreamPolicyId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.trigger, this.rule, this.upstreamPolicyId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RuleStage builder() {
        return new Builder();
    }

    public interface RuleStage {
        UpstreamPolicyIdStage rule(Rule rule);

        Builder from(ApprovalPolicyRequest other);
    }

    public interface UpstreamPolicyIdStage {
        _FinalStage upstreamPolicyId(String upstreamPolicyId);
    }

    public interface _FinalStage {
        ApprovalPolicyRequest build();

        _FinalStage trigger(List<Trigger> trigger);

        _FinalStage addTrigger(Trigger trigger);

        _FinalStage addAllTrigger(List<Trigger> trigger);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements RuleStage, UpstreamPolicyIdStage, _FinalStage {
        private Rule rule;

        private String upstreamPolicyId;

        private List<Trigger> trigger = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ApprovalPolicyRequest other) {
            trigger(other.getTrigger());
            rule(other.getRule());
            upstreamPolicyId(other.getUpstreamPolicyId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("rule")
        public UpstreamPolicyIdStage rule(Rule rule) {
            this.rule = rule;
            return this;
        }

        /**
         * <p>The policy ID of the previous approval policy in the chain of policies. Use 'root' if no upstreamPolicyId is intended to be set.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("upstreamPolicyId")
        public _FinalStage upstreamPolicyId(String upstreamPolicyId) {
            this.upstreamPolicyId = upstreamPolicyId;
            return this;
        }

        /**
         * <p>List of triggers that will cause this policy to be evaluated. If no triggers are provided, the policy will be evaluated for all invoices.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllTrigger(List<Trigger> trigger) {
            this.trigger.addAll(trigger);
            return this;
        }

        /**
         * <p>List of triggers that will cause this policy to be evaluated. If no triggers are provided, the policy will be evaluated for all invoices.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addTrigger(Trigger trigger) {
            this.trigger.add(trigger);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "trigger", nulls = Nulls.SKIP)
        public _FinalStage trigger(List<Trigger> trigger) {
            this.trigger.clear();
            this.trigger.addAll(trigger);
            return this;
        }

        @java.lang.Override
        public ApprovalPolicyRequest build() {
            return new ApprovalPolicyRequest(trigger, rule, upstreamPolicyId, additionalProperties);
        }
    }
}
