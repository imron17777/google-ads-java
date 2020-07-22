// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/reach_plan_service.proto

package com.google.ads.googleads.v4.services;

/**
 * <pre>
 * A rule specifying the maximum number of times an ad can be shown to a user
 * over a particular time period.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.services.FrequencyCap}
 */
public final class FrequencyCap extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.services.FrequencyCap)
    FrequencyCapOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FrequencyCap.newBuilder() to construct.
  private FrequencyCap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FrequencyCap() {
    timeUnit_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FrequencyCap();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FrequencyCap(
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
            com.google.protobuf.Int32Value.Builder subBuilder = null;
            if (impressions_ != null) {
              subBuilder = impressions_.toBuilder();
            }
            impressions_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(impressions_);
              impressions_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            timeUnit_ = rawValue;
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
    return com.google.ads.googleads.v4.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v4_services_FrequencyCap_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v4_services_FrequencyCap_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.services.FrequencyCap.class, com.google.ads.googleads.v4.services.FrequencyCap.Builder.class);
  }

  public static final int IMPRESSIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.Int32Value impressions_;
  /**
   * <pre>
   * Required. The number of impressions, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value impressions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the impressions field is set.
   */
  @java.lang.Override
  public boolean hasImpressions() {
    return impressions_ != null;
  }
  /**
   * <pre>
   * Required. The number of impressions, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value impressions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The impressions.
   */
  @java.lang.Override
  public com.google.protobuf.Int32Value getImpressions() {
    return impressions_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : impressions_;
  }
  /**
   * <pre>
   * Required. The number of impressions, inclusive.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value impressions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int32ValueOrBuilder getImpressionsOrBuilder() {
    return getImpressions();
  }

  public static final int TIME_UNIT_FIELD_NUMBER = 2;
  private int timeUnit_;
  /**
   * <pre>
   * Required. The type of time unit.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for timeUnit.
   */
  @java.lang.Override public int getTimeUnitValue() {
    return timeUnit_;
  }
  /**
   * <pre>
   * Required. The type of time unit.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The timeUnit.
   */
  @java.lang.Override public com.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit getTimeUnit() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit result = com.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.valueOf(timeUnit_);
    return result == null ? com.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.UNRECOGNIZED : result;
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
    if (impressions_ != null) {
      output.writeMessage(1, getImpressions());
    }
    if (timeUnit_ != com.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, timeUnit_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (impressions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getImpressions());
    }
    if (timeUnit_ != com.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, timeUnit_);
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
    if (!(obj instanceof com.google.ads.googleads.v4.services.FrequencyCap)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.services.FrequencyCap other = (com.google.ads.googleads.v4.services.FrequencyCap) obj;

    if (hasImpressions() != other.hasImpressions()) return false;
    if (hasImpressions()) {
      if (!getImpressions()
          .equals(other.getImpressions())) return false;
    }
    if (timeUnit_ != other.timeUnit_) return false;
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
    if (hasImpressions()) {
      hash = (37 * hash) + IMPRESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getImpressions().hashCode();
    }
    hash = (37 * hash) + TIME_UNIT_FIELD_NUMBER;
    hash = (53 * hash) + timeUnit_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.services.FrequencyCap parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.FrequencyCap parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.FrequencyCap parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.FrequencyCap parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.FrequencyCap parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.FrequencyCap parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.FrequencyCap parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.FrequencyCap parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.FrequencyCap parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.FrequencyCap parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.FrequencyCap parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.FrequencyCap parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.services.FrequencyCap prototype) {
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
   * A rule specifying the maximum number of times an ad can be shown to a user
   * over a particular time period.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.services.FrequencyCap}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.services.FrequencyCap)
      com.google.ads.googleads.v4.services.FrequencyCapOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v4_services_FrequencyCap_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v4_services_FrequencyCap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.services.FrequencyCap.class, com.google.ads.googleads.v4.services.FrequencyCap.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.services.FrequencyCap.newBuilder()
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
      if (impressionsBuilder_ == null) {
        impressions_ = null;
      } else {
        impressions_ = null;
        impressionsBuilder_ = null;
      }
      timeUnit_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v4_services_FrequencyCap_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.FrequencyCap getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.services.FrequencyCap.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.FrequencyCap build() {
      com.google.ads.googleads.v4.services.FrequencyCap result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.FrequencyCap buildPartial() {
      com.google.ads.googleads.v4.services.FrequencyCap result = new com.google.ads.googleads.v4.services.FrequencyCap(this);
      if (impressionsBuilder_ == null) {
        result.impressions_ = impressions_;
      } else {
        result.impressions_ = impressionsBuilder_.build();
      }
      result.timeUnit_ = timeUnit_;
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
      if (other instanceof com.google.ads.googleads.v4.services.FrequencyCap) {
        return mergeFrom((com.google.ads.googleads.v4.services.FrequencyCap)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.services.FrequencyCap other) {
      if (other == com.google.ads.googleads.v4.services.FrequencyCap.getDefaultInstance()) return this;
      if (other.hasImpressions()) {
        mergeImpressions(other.getImpressions());
      }
      if (other.timeUnit_ != 0) {
        setTimeUnitValue(other.getTimeUnitValue());
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
      com.google.ads.googleads.v4.services.FrequencyCap parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.services.FrequencyCap) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int32Value impressions_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> impressionsBuilder_;
    /**
     * <pre>
     * Required. The number of impressions, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value impressions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the impressions field is set.
     */
    public boolean hasImpressions() {
      return impressionsBuilder_ != null || impressions_ != null;
    }
    /**
     * <pre>
     * Required. The number of impressions, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value impressions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The impressions.
     */
    public com.google.protobuf.Int32Value getImpressions() {
      if (impressionsBuilder_ == null) {
        return impressions_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : impressions_;
      } else {
        return impressionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The number of impressions, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value impressions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setImpressions(com.google.protobuf.Int32Value value) {
      if (impressionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        impressions_ = value;
        onChanged();
      } else {
        impressionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The number of impressions, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value impressions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setImpressions(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (impressionsBuilder_ == null) {
        impressions_ = builderForValue.build();
        onChanged();
      } else {
        impressionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The number of impressions, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value impressions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeImpressions(com.google.protobuf.Int32Value value) {
      if (impressionsBuilder_ == null) {
        if (impressions_ != null) {
          impressions_ =
            com.google.protobuf.Int32Value.newBuilder(impressions_).mergeFrom(value).buildPartial();
        } else {
          impressions_ = value;
        }
        onChanged();
      } else {
        impressionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The number of impressions, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value impressions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearImpressions() {
      if (impressionsBuilder_ == null) {
        impressions_ = null;
        onChanged();
      } else {
        impressions_ = null;
        impressionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The number of impressions, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value impressions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.Int32Value.Builder getImpressionsBuilder() {
      
      onChanged();
      return getImpressionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The number of impressions, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value impressions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getImpressionsOrBuilder() {
      if (impressionsBuilder_ != null) {
        return impressionsBuilder_.getMessageOrBuilder();
      } else {
        return impressions_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : impressions_;
      }
    }
    /**
     * <pre>
     * Required. The number of impressions, inclusive.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value impressions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getImpressionsFieldBuilder() {
      if (impressionsBuilder_ == null) {
        impressionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getImpressions(),
                getParentForChildren(),
                isClean());
        impressions_ = null;
      }
      return impressionsBuilder_;
    }

    private int timeUnit_ = 0;
    /**
     * <pre>
     * Required. The type of time unit.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for timeUnit.
     */
    @java.lang.Override public int getTimeUnitValue() {
      return timeUnit_;
    }
    /**
     * <pre>
     * Required. The type of time unit.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for timeUnit to set.
     * @return This builder for chaining.
     */
    public Builder setTimeUnitValue(int value) {
      
      timeUnit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The type of time unit.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The timeUnit.
     */
    @java.lang.Override
    public com.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit getTimeUnit() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit result = com.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.valueOf(timeUnit_);
      return result == null ? com.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. The type of time unit.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The timeUnit to set.
     * @return This builder for chaining.
     */
    public Builder setTimeUnit(com.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      timeUnit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The type of time unit.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeUnit() {
      
      timeUnit_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.services.FrequencyCap)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.FrequencyCap)
  private static final com.google.ads.googleads.v4.services.FrequencyCap DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.services.FrequencyCap();
  }

  public static com.google.ads.googleads.v4.services.FrequencyCap getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FrequencyCap>
      PARSER = new com.google.protobuf.AbstractParser<FrequencyCap>() {
    @java.lang.Override
    public FrequencyCap parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FrequencyCap(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FrequencyCap> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FrequencyCap> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.services.FrequencyCap getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

