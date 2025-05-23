/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.ocr.types;

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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = OcrRequest.Builder.class)
public final class OcrRequest {
    private final String mimeType;

    private final String image;

    private final Optional<VendorNetwork> vendorNetwork;

    private final Optional<String> entityId;

    private final Map<String, Object> additionalProperties;

    private OcrRequest(
            String mimeType,
            String image,
            Optional<VendorNetwork> vendorNetwork,
            Optional<String> entityId,
            Map<String, Object> additionalProperties) {
        this.mimeType = mimeType;
        this.image = image;
        this.vendorNetwork = vendorNetwork;
        this.entityId = entityId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return MIME type of the image. Supported types are image/png, image/jpeg, and application/pdf.
     */
    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    /**
     * @return Base64 encoded image or PDF. PNG, JPG, WEBP, and PDF are supported. 10MB max.
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
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

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OcrRequest && equalTo((OcrRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(OcrRequest other) {
        return mimeType.equals(other.mimeType)
                && image.equals(other.image)
                && vendorNetwork.equals(other.vendorNetwork)
                && entityId.equals(other.entityId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.mimeType, this.image, this.vendorNetwork, this.entityId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MimeTypeStage builder() {
        return new Builder();
    }

    public interface MimeTypeStage {
        ImageStage mimeType(@NotNull String mimeType);

        Builder from(OcrRequest other);
    }

    public interface ImageStage {
        _FinalStage image(@NotNull String image);
    }

    public interface _FinalStage {
        OcrRequest build();

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
        public Builder from(OcrRequest other) {
            mimeType(other.getMimeType());
            image(other.getImage());
            vendorNetwork(other.getVendorNetwork());
            entityId(other.getEntityId());
            return this;
        }

        /**
         * <p>MIME type of the image. Supported types are image/png, image/jpeg, and application/pdf.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("mimeType")
        public ImageStage mimeType(@NotNull String mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType, "mimeType must not be null");
            return this;
        }

        /**
         * <p>Base64 encoded image or PDF. PNG, JPG, WEBP, and PDF are supported. 10MB max.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("image")
        public _FinalStage image(@NotNull String image) {
            this.image = Objects.requireNonNull(image, "image must not be null");
            return this;
        }

        /**
         * <p>When using the Entity vendor network, specify the entity to use if. EntityId on an auth token will take precedence over this parameter.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage entityId(String entityId) {
            this.entityId = Optional.ofNullable(entityId);
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
            this.vendorNetwork = Optional.ofNullable(vendorNetwork);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "vendorNetwork", nulls = Nulls.SKIP)
        public _FinalStage vendorNetwork(Optional<VendorNetwork> vendorNetwork) {
            this.vendorNetwork = vendorNetwork;
            return this;
        }

        @java.lang.Override
        public OcrRequest build() {
            return new OcrRequest(mimeType, image, vendorNetwork, entityId, additionalProperties);
        }
    }
}
