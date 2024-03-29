/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.ocr.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.resources.entitytypes.types.VendorNetwork;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = RunOcrAsync.Builder.class)
public final class RunOcrAsync {
    private final Optional<VendorNetwork> vendorNetwork;

    private final Optional<String> entityId;

    private final String mimeType;

    private final String image;

    private final Map<String, Object> additionalProperties;

    private RunOcrAsync(
            Optional<VendorNetwork> vendorNetwork,
            Optional<String> entityId,
            String mimeType,
            String image,
            Map<String, Object> additionalProperties) {
        this.vendorNetwork = vendorNetwork;
        this.entityId = entityId;
        this.mimeType = mimeType;
        this.image = image;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Limit OCR vendor search to a specific network
     */
    @JsonProperty("vendorNetwork")
    public Optional<VendorNetwork> getVendorNetwork() {
        return vendorNetwork;
    }

    /**
     * @return When using the Entity vendor network, specify the entity to use if. EntityId on an auth token will take precedence over this parameter.
     */
    @JsonProperty("entityId")
    public Optional<String> getEntityId() {
        return entityId;
    }

    /**
     * @return MIME type of the image. Supported types are image/png, image/jpeg, and application/pdf.
     */
    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    /**
     * @return Base64 encoded image or PDF. PNG, JPG, and PDF are supported. 10MB max.
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RunOcrAsync && equalTo((RunOcrAsync) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RunOcrAsync other) {
        return vendorNetwork.equals(other.vendorNetwork)
                && entityId.equals(other.entityId)
                && mimeType.equals(other.mimeType)
                && image.equals(other.image);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.vendorNetwork, this.entityId, this.mimeType, this.image);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MimeTypeStage builder() {
        return new Builder();
    }

    public interface MimeTypeStage {
        ImageStage mimeType(String mimeType);

        Builder from(RunOcrAsync other);
    }

    public interface ImageStage {
        _FinalStage image(String image);
    }

    public interface _FinalStage {
        RunOcrAsync build();

        _FinalStage vendorNetwork(Optional<VendorNetwork> vendorNetwork);

        _FinalStage vendorNetwork(VendorNetwork vendorNetwork);

        _FinalStage entityId(Optional<String> entityId);

        _FinalStage entityId(String entityId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MimeTypeStage, ImageStage, _FinalStage {
        private String mimeType;

        private String image;

        private Optional<String> entityId = Optional.empty();

        private Optional<VendorNetwork> vendorNetwork = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(RunOcrAsync other) {
            vendorNetwork(other.getVendorNetwork());
            entityId(other.getEntityId());
            mimeType(other.getMimeType());
            image(other.getImage());
            return this;
        }

        /**
         * <p>MIME type of the image. Supported types are image/png, image/jpeg, and application/pdf.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("mimeType")
        public ImageStage mimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        /**
         * <p>Base64 encoded image or PDF. PNG, JPG, and PDF are supported. 10MB max.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("image")
        public _FinalStage image(String image) {
            this.image = image;
            return this;
        }

        /**
         * <p>When using the Entity vendor network, specify the entity to use if. EntityId on an auth token will take precedence over this parameter.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage entityId(String entityId) {
            this.entityId = Optional.of(entityId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "entityId", nulls = Nulls.SKIP)
        public _FinalStage entityId(Optional<String> entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>Limit OCR vendor search to a specific network</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage vendorNetwork(VendorNetwork vendorNetwork) {
            this.vendorNetwork = Optional.of(vendorNetwork);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "vendorNetwork", nulls = Nulls.SKIP)
        public _FinalStage vendorNetwork(Optional<VendorNetwork> vendorNetwork) {
            this.vendorNetwork = vendorNetwork;
            return this;
        }

        @java.lang.Override
        public RunOcrAsync build() {
            return new RunOcrAsync(vendorNetwork, entityId, mimeType, image, additionalProperties);
        }
    }
}
