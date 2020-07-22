// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/bidding.proto

package com.google.ads.googleads.v3.common;

/**
 * <pre>
 * An automated bidding strategy which tries to maximize conversion value
 * given a daily budget.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.common.MaximizeConversionValue}
 */
public final class MaximizeConversionValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.common.MaximizeConversionValue)
    MaximizeConversionValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MaximizeConversionValue.newBuilder() to construct.
  private MaximizeConversionValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MaximizeConversionValue() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MaximizeConversionValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MaximizeConversionValue(
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
            com.google.protobuf.DoubleValue.Builder subBuilder = null;
            if (targetRoas_ != null) {
              subBuilder = targetRoas_.toBuilder();
            }
            targetRoas_ = input.readMessage(com.google.protobuf.DoubleValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(targetRoas_);
              targetRoas_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v3.common.BiddingProto.internal_static_google_ads_googleads_v3_common_MaximizeConversionValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.common.BiddingProto.internal_static_google_ads_googleads_v3_common_MaximizeConversionValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.common.MaximizeConversionValue.class, com.google.ads.googleads.v3.common.MaximizeConversionValue.Builder.class);
  }

  public static final int TARGET_ROAS_FIELD_NUMBER = 1;
  private com.google.protobuf.DoubleValue targetRoas_;
  /**
   * <pre>
   * The target return on ad spend (ROAS) option. If set, the bid strategy will
   * maximize revenue while averaging the target return on ad spend. If the
   * target ROAS is high, the bid strategy may not be able to spend the full
   * budget. If the target ROAS is not set, the bid strategy will aim to
   * achieve the highest possible ROAS for the budget.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue target_roas = 1;</code>
   * @return Whether the targetRoas field is set.
   */
  @java.lang.Override
  public boolean hasTargetRoas() {
    return targetRoas_ != null;
  }
  /**
   * <pre>
   * The target return on ad spend (ROAS) option. If set, the bid strategy will
   * maximize revenue while averaging the target return on ad spend. If the
   * target ROAS is high, the bid strategy may not be able to spend the full
   * budget. If the target ROAS is not set, the bid strategy will aim to
   * achieve the highest possible ROAS for the budget.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue target_roas = 1;</code>
   * @return The targetRoas.
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValue getTargetRoas() {
    return targetRoas_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : targetRoas_;
  }
  /**
   * <pre>
   * The target return on ad spend (ROAS) option. If set, the bid strategy will
   * maximize revenue while averaging the target return on ad spend. If the
   * target ROAS is high, the bid strategy may not be able to spend the full
   * budget. If the target ROAS is not set, the bid strategy will aim to
   * achieve the highest possible ROAS for the budget.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue target_roas = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValueOrBuilder getTargetRoasOrBuilder() {
    return getTargetRoas();
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
    if (targetRoas_ != null) {
      output.writeMessage(1, getTargetRoas());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetRoas_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTargetRoas());
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
    if (!(obj instanceof com.google.ads.googleads.v3.common.MaximizeConversionValue)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.common.MaximizeConversionValue other = (com.google.ads.googleads.v3.common.MaximizeConversionValue) obj;

    if (hasTargetRoas() != other.hasTargetRoas()) return false;
    if (hasTargetRoas()) {
      if (!getTargetRoas()
          .equals(other.getTargetRoas())) return false;
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
    if (hasTargetRoas()) {
      hash = (37 * hash) + TARGET_ROAS_FIELD_NUMBER;
      hash = (53 * hash) + getTargetRoas().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.common.MaximizeConversionValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.common.MaximizeConversionValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.MaximizeConversionValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.common.MaximizeConversionValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.MaximizeConversionValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.common.MaximizeConversionValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.MaximizeConversionValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.common.MaximizeConversionValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.MaximizeConversionValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.common.MaximizeConversionValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.MaximizeConversionValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.common.MaximizeConversionValue parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.common.MaximizeConversionValue prototype) {
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
   * An automated bidding strategy which tries to maximize conversion value
   * given a daily budget.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.common.MaximizeConversionValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.common.MaximizeConversionValue)
      com.google.ads.googleads.v3.common.MaximizeConversionValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.common.BiddingProto.internal_static_google_ads_googleads_v3_common_MaximizeConversionValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.common.BiddingProto.internal_static_google_ads_googleads_v3_common_MaximizeConversionValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.common.MaximizeConversionValue.class, com.google.ads.googleads.v3.common.MaximizeConversionValue.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.common.MaximizeConversionValue.newBuilder()
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
      if (targetRoasBuilder_ == null) {
        targetRoas_ = null;
      } else {
        targetRoas_ = null;
        targetRoasBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.common.BiddingProto.internal_static_google_ads_googleads_v3_common_MaximizeConversionValue_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.common.MaximizeConversionValue getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.common.MaximizeConversionValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.common.MaximizeConversionValue build() {
      com.google.ads.googleads.v3.common.MaximizeConversionValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.common.MaximizeConversionValue buildPartial() {
      com.google.ads.googleads.v3.common.MaximizeConversionValue result = new com.google.ads.googleads.v3.common.MaximizeConversionValue(this);
      if (targetRoasBuilder_ == null) {
        result.targetRoas_ = targetRoas_;
      } else {
        result.targetRoas_ = targetRoasBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v3.common.MaximizeConversionValue) {
        return mergeFrom((com.google.ads.googleads.v3.common.MaximizeConversionValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.common.MaximizeConversionValue other) {
      if (other == com.google.ads.googleads.v3.common.MaximizeConversionValue.getDefaultInstance()) return this;
      if (other.hasTargetRoas()) {
        mergeTargetRoas(other.getTargetRoas());
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
      com.google.ads.googleads.v3.common.MaximizeConversionValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.common.MaximizeConversionValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.DoubleValue targetRoas_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> targetRoasBuilder_;
    /**
     * <pre>
     * The target return on ad spend (ROAS) option. If set, the bid strategy will
     * maximize revenue while averaging the target return on ad spend. If the
     * target ROAS is high, the bid strategy may not be able to spend the full
     * budget. If the target ROAS is not set, the bid strategy will aim to
     * achieve the highest possible ROAS for the budget.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue target_roas = 1;</code>
     * @return Whether the targetRoas field is set.
     */
    public boolean hasTargetRoas() {
      return targetRoasBuilder_ != null || targetRoas_ != null;
    }
    /**
     * <pre>
     * The target return on ad spend (ROAS) option. If set, the bid strategy will
     * maximize revenue while averaging the target return on ad spend. If the
     * target ROAS is high, the bid strategy may not be able to spend the full
     * budget. If the target ROAS is not set, the bid strategy will aim to
     * achieve the highest possible ROAS for the budget.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue target_roas = 1;</code>
     * @return The targetRoas.
     */
    public com.google.protobuf.DoubleValue getTargetRoas() {
      if (targetRoasBuilder_ == null) {
        return targetRoas_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : targetRoas_;
      } else {
        return targetRoasBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The target return on ad spend (ROAS) option. If set, the bid strategy will
     * maximize revenue while averaging the target return on ad spend. If the
     * target ROAS is high, the bid strategy may not be able to spend the full
     * budget. If the target ROAS is not set, the bid strategy will aim to
     * achieve the highest possible ROAS for the budget.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue target_roas = 1;</code>
     */
    public Builder setTargetRoas(com.google.protobuf.DoubleValue value) {
      if (targetRoasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        targetRoas_ = value;
        onChanged();
      } else {
        targetRoasBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The target return on ad spend (ROAS) option. If set, the bid strategy will
     * maximize revenue while averaging the target return on ad spend. If the
     * target ROAS is high, the bid strategy may not be able to spend the full
     * budget. If the target ROAS is not set, the bid strategy will aim to
     * achieve the highest possible ROAS for the budget.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue target_roas = 1;</code>
     */
    public Builder setTargetRoas(
        com.google.protobuf.DoubleValue.Builder builderForValue) {
      if (targetRoasBuilder_ == null) {
        targetRoas_ = builderForValue.build();
        onChanged();
      } else {
        targetRoasBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The target return on ad spend (ROAS) option. If set, the bid strategy will
     * maximize revenue while averaging the target return on ad spend. If the
     * target ROAS is high, the bid strategy may not be able to spend the full
     * budget. If the target ROAS is not set, the bid strategy will aim to
     * achieve the highest possible ROAS for the budget.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue target_roas = 1;</code>
     */
    public Builder mergeTargetRoas(com.google.protobuf.DoubleValue value) {
      if (targetRoasBuilder_ == null) {
        if (targetRoas_ != null) {
          targetRoas_ =
            com.google.protobuf.DoubleValue.newBuilder(targetRoas_).mergeFrom(value).buildPartial();
        } else {
          targetRoas_ = value;
        }
        onChanged();
      } else {
        targetRoasBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The target return on ad spend (ROAS) option. If set, the bid strategy will
     * maximize revenue while averaging the target return on ad spend. If the
     * target ROAS is high, the bid strategy may not be able to spend the full
     * budget. If the target ROAS is not set, the bid strategy will aim to
     * achieve the highest possible ROAS for the budget.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue target_roas = 1;</code>
     */
    public Builder clearTargetRoas() {
      if (targetRoasBuilder_ == null) {
        targetRoas_ = null;
        onChanged();
      } else {
        targetRoas_ = null;
        targetRoasBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The target return on ad spend (ROAS) option. If set, the bid strategy will
     * maximize revenue while averaging the target return on ad spend. If the
     * target ROAS is high, the bid strategy may not be able to spend the full
     * budget. If the target ROAS is not set, the bid strategy will aim to
     * achieve the highest possible ROAS for the budget.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue target_roas = 1;</code>
     */
    public com.google.protobuf.DoubleValue.Builder getTargetRoasBuilder() {
      
      onChanged();
      return getTargetRoasFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The target return on ad spend (ROAS) option. If set, the bid strategy will
     * maximize revenue while averaging the target return on ad spend. If the
     * target ROAS is high, the bid strategy may not be able to spend the full
     * budget. If the target ROAS is not set, the bid strategy will aim to
     * achieve the highest possible ROAS for the budget.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue target_roas = 1;</code>
     */
    public com.google.protobuf.DoubleValueOrBuilder getTargetRoasOrBuilder() {
      if (targetRoasBuilder_ != null) {
        return targetRoasBuilder_.getMessageOrBuilder();
      } else {
        return targetRoas_ == null ?
            com.google.protobuf.DoubleValue.getDefaultInstance() : targetRoas_;
      }
    }
    /**
     * <pre>
     * The target return on ad spend (ROAS) option. If set, the bid strategy will
     * maximize revenue while averaging the target return on ad spend. If the
     * target ROAS is high, the bid strategy may not be able to spend the full
     * budget. If the target ROAS is not set, the bid strategy will aim to
     * achieve the highest possible ROAS for the budget.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue target_roas = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> 
        getTargetRoasFieldBuilder() {
      if (targetRoasBuilder_ == null) {
        targetRoasBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                getTargetRoas(),
                getParentForChildren(),
                isClean());
        targetRoas_ = null;
      }
      return targetRoasBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.common.MaximizeConversionValue)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.common.MaximizeConversionValue)
  private static final com.google.ads.googleads.v3.common.MaximizeConversionValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.common.MaximizeConversionValue();
  }

  public static com.google.ads.googleads.v3.common.MaximizeConversionValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MaximizeConversionValue>
      PARSER = new com.google.protobuf.AbstractParser<MaximizeConversionValue>() {
    @java.lang.Override
    public MaximizeConversionValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MaximizeConversionValue(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MaximizeConversionValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MaximizeConversionValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.common.MaximizeConversionValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

