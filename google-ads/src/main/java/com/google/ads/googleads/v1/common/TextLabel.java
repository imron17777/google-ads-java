// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/text_label.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * A type of label displaying text on a colored background.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.TextLabel}
 */
public final class TextLabel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.TextLabel)
    TextLabelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TextLabel.newBuilder() to construct.
  private TextLabel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextLabel() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TextLabel();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TextLabel(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (backgroundColor_ != null) {
              subBuilder = backgroundColor_.toBuilder();
            }
            backgroundColor_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(backgroundColor_);
              backgroundColor_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (description_ != null) {
              subBuilder = description_.toBuilder();
            }
            description_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(description_);
              description_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v1.common.TextLabelProto.internal_static_google_ads_googleads_v1_common_TextLabel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.TextLabelProto.internal_static_google_ads_googleads_v1_common_TextLabel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.TextLabel.class, com.google.ads.googleads.v1.common.TextLabel.Builder.class);
  }

  public static final int BACKGROUND_COLOR_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue backgroundColor_;
  /**
   * <pre>
   * Background color of the label in RGB format. This string must match the
   * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
   * Note: The background color may not be visible for manager accounts.
   * </pre>
   *
   * <code>.google.protobuf.StringValue background_color = 1;</code>
   * @return Whether the backgroundColor field is set.
   */
  @java.lang.Override
  public boolean hasBackgroundColor() {
    return backgroundColor_ != null;
  }
  /**
   * <pre>
   * Background color of the label in RGB format. This string must match the
   * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
   * Note: The background color may not be visible for manager accounts.
   * </pre>
   *
   * <code>.google.protobuf.StringValue background_color = 1;</code>
   * @return The backgroundColor.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getBackgroundColor() {
    return backgroundColor_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : backgroundColor_;
  }
  /**
   * <pre>
   * Background color of the label in RGB format. This string must match the
   * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
   * Note: The background color may not be visible for manager accounts.
   * </pre>
   *
   * <code>.google.protobuf.StringValue background_color = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getBackgroundColorOrBuilder() {
    return getBackgroundColor();
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue description_;
  /**
   * <pre>
   * A short description of the label. The length must be no more than 200
   * characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   * @return Whether the description field is set.
   */
  @java.lang.Override
  public boolean hasDescription() {
    return description_ != null;
  }
  /**
   * <pre>
   * A short description of the label. The length must be no more than 200
   * characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   * @return The description.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getDescription() {
    return description_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description_;
  }
  /**
   * <pre>
   * A short description of the label. The length must be no more than 200
   * characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder() {
    return getDescription();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (backgroundColor_ != null) {
      output.writeMessage(1, getBackgroundColor());
    }
    if (description_ != null) {
      output.writeMessage(2, getDescription());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (backgroundColor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBackgroundColor());
    }
    if (description_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDescription());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v1.common.TextLabel)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.TextLabel other = (com.google.ads.googleads.v1.common.TextLabel) obj;

    if (hasBackgroundColor() != other.hasBackgroundColor()) return false;
    if (hasBackgroundColor()) {
      if (!getBackgroundColor()
          .equals(other.getBackgroundColor())) return false;
    }
    if (hasDescription() != other.hasDescription()) return false;
    if (hasDescription()) {
      if (!getDescription()
          .equals(other.getDescription())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasBackgroundColor()) {
      hash = (37 * hash) + BACKGROUND_COLOR_FIELD_NUMBER;
      hash = (53 * hash) + getBackgroundColor().hashCode();
    }
    if (hasDescription()) {
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.TextLabel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.TextLabel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.TextLabel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.TextLabel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.TextLabel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.TextLabel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.TextLabel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.TextLabel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.TextLabel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.TextLabel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.TextLabel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.TextLabel parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v1.common.TextLabel prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A type of label displaying text on a colored background.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.TextLabel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.TextLabel)
      com.google.ads.googleads.v1.common.TextLabelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.TextLabelProto.internal_static_google_ads_googleads_v1_common_TextLabel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.TextLabelProto.internal_static_google_ads_googleads_v1_common_TextLabel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.TextLabel.class, com.google.ads.googleads.v1.common.TextLabel.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.TextLabel.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (backgroundColorBuilder_ == null) {
        backgroundColor_ = null;
      } else {
        backgroundColor_ = null;
        backgroundColorBuilder_ = null;
      }
      if (descriptionBuilder_ == null) {
        description_ = null;
      } else {
        description_ = null;
        descriptionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.TextLabelProto.internal_static_google_ads_googleads_v1_common_TextLabel_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.TextLabel getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.TextLabel.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.TextLabel build() {
      com.google.ads.googleads.v1.common.TextLabel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.TextLabel buildPartial() {
      com.google.ads.googleads.v1.common.TextLabel result = new com.google.ads.googleads.v1.common.TextLabel(this);
      if (backgroundColorBuilder_ == null) {
        result.backgroundColor_ = backgroundColor_;
      } else {
        result.backgroundColor_ = backgroundColorBuilder_.build();
      }
      if (descriptionBuilder_ == null) {
        result.description_ = description_;
      } else {
        result.description_ = descriptionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v1.common.TextLabel) {
        return mergeFrom((com.google.ads.googleads.v1.common.TextLabel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.TextLabel other) {
      if (other == com.google.ads.googleads.v1.common.TextLabel.getDefaultInstance()) return this;
      if (other.hasBackgroundColor()) {
        mergeBackgroundColor(other.getBackgroundColor());
      }
      if (other.hasDescription()) {
        mergeDescription(other.getDescription());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v1.common.TextLabel parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.TextLabel) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue backgroundColor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> backgroundColorBuilder_;
    /**
     * <pre>
     * Background color of the label in RGB format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue background_color = 1;</code>
     * @return Whether the backgroundColor field is set.
     */
    public boolean hasBackgroundColor() {
      return backgroundColorBuilder_ != null || backgroundColor_ != null;
    }
    /**
     * <pre>
     * Background color of the label in RGB format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue background_color = 1;</code>
     * @return The backgroundColor.
     */
    public com.google.protobuf.StringValue getBackgroundColor() {
      if (backgroundColorBuilder_ == null) {
        return backgroundColor_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : backgroundColor_;
      } else {
        return backgroundColorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Background color of the label in RGB format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue background_color = 1;</code>
     */
    public Builder setBackgroundColor(com.google.protobuf.StringValue value) {
      if (backgroundColorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        backgroundColor_ = value;
        onChanged();
      } else {
        backgroundColorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Background color of the label in RGB format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue background_color = 1;</code>
     */
    public Builder setBackgroundColor(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (backgroundColorBuilder_ == null) {
        backgroundColor_ = builderForValue.build();
        onChanged();
      } else {
        backgroundColorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Background color of the label in RGB format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue background_color = 1;</code>
     */
    public Builder mergeBackgroundColor(com.google.protobuf.StringValue value) {
      if (backgroundColorBuilder_ == null) {
        if (backgroundColor_ != null) {
          backgroundColor_ =
            com.google.protobuf.StringValue.newBuilder(backgroundColor_).mergeFrom(value).buildPartial();
        } else {
          backgroundColor_ = value;
        }
        onChanged();
      } else {
        backgroundColorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Background color of the label in RGB format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue background_color = 1;</code>
     */
    public Builder clearBackgroundColor() {
      if (backgroundColorBuilder_ == null) {
        backgroundColor_ = null;
        onChanged();
      } else {
        backgroundColor_ = null;
        backgroundColorBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Background color of the label in RGB format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue background_color = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getBackgroundColorBuilder() {
      
      onChanged();
      return getBackgroundColorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Background color of the label in RGB format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue background_color = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getBackgroundColorOrBuilder() {
      if (backgroundColorBuilder_ != null) {
        return backgroundColorBuilder_.getMessageOrBuilder();
      } else {
        return backgroundColor_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : backgroundColor_;
      }
    }
    /**
     * <pre>
     * Background color of the label in RGB format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue background_color = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getBackgroundColorFieldBuilder() {
      if (backgroundColorBuilder_ == null) {
        backgroundColorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getBackgroundColor(),
                getParentForChildren(),
                isClean());
        backgroundColor_ = null;
      }
      return backgroundColorBuilder_;
    }

    private com.google.protobuf.StringValue description_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> descriptionBuilder_;
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     * @return Whether the description field is set.
     */
    public boolean hasDescription() {
      return descriptionBuilder_ != null || description_ != null;
    }
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     * @return The description.
     */
    public com.google.protobuf.StringValue getDescription() {
      if (descriptionBuilder_ == null) {
        return description_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description_;
      } else {
        return descriptionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    public Builder setDescription(com.google.protobuf.StringValue value) {
      if (descriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        description_ = value;
        onChanged();
      } else {
        descriptionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    public Builder setDescription(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (descriptionBuilder_ == null) {
        description_ = builderForValue.build();
        onChanged();
      } else {
        descriptionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    public Builder mergeDescription(com.google.protobuf.StringValue value) {
      if (descriptionBuilder_ == null) {
        if (description_ != null) {
          description_ =
            com.google.protobuf.StringValue.newBuilder(description_).mergeFrom(value).buildPartial();
        } else {
          description_ = value;
        }
        onChanged();
      } else {
        descriptionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    public Builder clearDescription() {
      if (descriptionBuilder_ == null) {
        description_ = null;
        onChanged();
      } else {
        description_ = null;
        descriptionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getDescriptionBuilder() {
      
      onChanged();
      return getDescriptionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder() {
      if (descriptionBuilder_ != null) {
        return descriptionBuilder_.getMessageOrBuilder();
      } else {
        return description_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : description_;
      }
    }
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getDescriptionFieldBuilder() {
      if (descriptionBuilder_ == null) {
        descriptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getDescription(),
                getParentForChildren(),
                isClean());
        description_ = null;
      }
      return descriptionBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.TextLabel)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.TextLabel)
  private static final com.google.ads.googleads.v1.common.TextLabel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.TextLabel();
  }

  public static com.google.ads.googleads.v1.common.TextLabel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextLabel>
      PARSER = new com.google.protobuf.AbstractParser<TextLabel>() {
    @java.lang.Override
    public TextLabel parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TextLabel(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TextLabel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextLabel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.TextLabel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

