/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.contracttypes.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = GenerateContractResponse.Builder.class)
public final class GenerateContractResponse {
    private final String jobId;

    private final ContractResponse contract;

    private final Map<String, Object> additionalProperties;

    private GenerateContractResponse(
            String jobId, ContractResponse contract, Map<String, Object> additionalProperties) {
        this.jobId = jobId;
        this.contract = contract;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Job ID
     */
    @JsonProperty("jobId")
    public String getJobId() {
        return jobId;
    }

    /**
     * @return Contract
     */
    @JsonProperty("contract")
    public ContractResponse getContract() {
        return contract;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GenerateContractResponse && equalTo((GenerateContractResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GenerateContractResponse other) {
        return jobId.equals(other.jobId) && contract.equals(other.contract);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.jobId, this.contract);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static JobIdStage builder() {
        return new Builder();
    }

    public interface JobIdStage {
        ContractStage jobId(@NotNull String jobId);

        Builder from(GenerateContractResponse other);
    }

    public interface ContractStage {
        _FinalStage contract(@NotNull ContractResponse contract);
    }

    public interface _FinalStage {
        GenerateContractResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements JobIdStage, ContractStage, _FinalStage {
        private String jobId;

        private ContractResponse contract;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(GenerateContractResponse other) {
            jobId(other.getJobId());
            contract(other.getContract());
            return this;
        }

        /**
         * <p>Job ID</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("jobId")
        public ContractStage jobId(@NotNull String jobId) {
            this.jobId = Objects.requireNonNull(jobId, "jobId must not be null");
            return this;
        }

        /**
         * <p>Contract</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("contract")
        public _FinalStage contract(@NotNull ContractResponse contract) {
            this.contract = Objects.requireNonNull(contract, "contract must not be null");
            return this;
        }

        @java.lang.Override
        public GenerateContractResponse build() {
            return new GenerateContractResponse(jobId, contract, additionalProperties);
        }
    }
}
