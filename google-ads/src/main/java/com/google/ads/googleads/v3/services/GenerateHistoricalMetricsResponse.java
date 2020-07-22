// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/keyword_plan_service.proto

package com.google.ads.googleads.v3.services;

/**
 * <pre>
 * Response message for [KeywordPlanService.GenerateHistoricalMetrics][google.ads.googleads.v3.services.KeywordPlanService.GenerateHistoricalMetrics].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse}
 */
public final class GenerateHistoricalMetricsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse)
    GenerateHistoricalMetricsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateHistoricalMetricsResponse.newBuilder() to construct.
  private GenerateHistoricalMetricsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateHistoricalMetricsResponse() {
    metrics_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateHistoricalMetricsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GenerateHistoricalMetricsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              metrics_ = new java.util.ArrayList<com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics>();
              mutable_bitField0_ |= 0x00000001;
            }
            metrics_.add(
                input.readMessage(com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        metrics_ = java.util.Collections.unmodifiableList(metrics_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v3.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse.class, com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse.Builder.class);
  }

  public static final int METRICS_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics> metrics_;
  /**
   * <pre>
   * List of keyword historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics> getMetricsList() {
    return metrics_;
  }
  /**
   * <pre>
   * List of keyword historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetricsOrBuilder> 
      getMetricsOrBuilderList() {
    return metrics_;
  }
  /**
   * <pre>
   * List of keyword historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
   */
  @java.lang.Override
  public int getMetricsCount() {
    return metrics_.size();
  }
  /**
   * <pre>
   * List of keyword historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics getMetrics(int index) {
    return metrics_.get(index);
  }
  /**
   * <pre>
   * List of keyword historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetricsOrBuilder getMetricsOrBuilder(
      int index) {
    return metrics_.get(index);
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
    for (int i = 0; i < metrics_.size(); i++) {
      output.writeMessage(1, metrics_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < metrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, metrics_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse other = (com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse) obj;

    if (!getMetricsList()
        .equals(other.getMetricsList())) return false;
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
    if (getMetricsCount() > 0) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse prototype) {
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
   * Response message for [KeywordPlanService.GenerateHistoricalMetrics][google.ads.googleads.v3.services.KeywordPlanService.GenerateHistoricalMetrics].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse)
      com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse.class, com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse.newBuilder()
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
        getMetricsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        metricsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse build() {
      com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse buildPartial() {
      com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse result = new com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse(this);
      int from_bitField0_ = bitField0_;
      if (metricsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          metrics_ = java.util.Collections.unmodifiableList(metrics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.metrics_ = metrics_;
      } else {
        result.metrics_ = metricsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse) {
        return mergeFrom((com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse other) {
      if (other == com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse.getDefaultInstance()) return this;
      if (metricsBuilder_ == null) {
        if (!other.metrics_.isEmpty()) {
          if (metrics_.isEmpty()) {
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMetricsIsMutable();
            metrics_.addAll(other.metrics_);
          }
          onChanged();
        }
      } else {
        if (!other.metrics_.isEmpty()) {
          if (metricsBuilder_.isEmpty()) {
            metricsBuilder_.dispose();
            metricsBuilder_ = null;
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            metricsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMetricsFieldBuilder() : null;
          } else {
            metricsBuilder_.addAllMessages(other.metrics_);
          }
        }
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
      com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics> metrics_ =
      java.util.Collections.emptyList();
    private void ensureMetricsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        metrics_ = new java.util.ArrayList<com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics>(metrics_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics, com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics.Builder, com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetricsOrBuilder> metricsBuilder_;

    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics> getMetricsList() {
      if (metricsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metrics_);
      } else {
        return metricsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public int getMetricsCount() {
      if (metricsBuilder_ == null) {
        return metrics_.size();
      } else {
        return metricsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics getMetrics(int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);
      } else {
        return metricsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public Builder setMetrics(
        int index, com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.set(index, value);
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public Builder setMetrics(
        int index, com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.set(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public Builder addMetrics(com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public Builder addMetrics(
        int index, com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(index, value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public Builder addMetrics(
        com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public Builder addMetrics(
        int index, com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public Builder addAllMetrics(
        java.lang.Iterable<? extends com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics> values) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, metrics_);
        onChanged();
      } else {
        metricsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public Builder clearMetrics() {
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        metricsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public Builder removeMetrics(int index) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.remove(index);
        onChanged();
      } else {
        metricsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics.Builder getMetricsBuilder(
        int index) {
      return getMetricsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetricsOrBuilder getMetricsOrBuilder(
        int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);  } else {
        return metricsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetricsOrBuilder> 
         getMetricsOrBuilderList() {
      if (metricsBuilder_ != null) {
        return metricsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metrics_);
      }
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics.Builder addMetricsBuilder() {
      return getMetricsFieldBuilder().addBuilder(
          com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics.getDefaultInstance());
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics.Builder addMetricsBuilder(
        int index) {
      return getMetricsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics.getDefaultInstance());
    }
    /**
     * <pre>
     * List of keyword historical metrics.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics.Builder> 
         getMetricsBuilderList() {
      return getMetricsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics, com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics.Builder, com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetricsOrBuilder> 
        getMetricsFieldBuilder() {
      if (metricsBuilder_ == null) {
        metricsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics, com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetrics.Builder, com.google.ads.googleads.v3.services.KeywordPlanKeywordHistoricalMetricsOrBuilder>(
                metrics_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        metrics_ = null;
      }
      return metricsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse)
  private static final com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse();
  }

  public static com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateHistoricalMetricsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenerateHistoricalMetricsResponse>() {
    @java.lang.Override
    public GenerateHistoricalMetricsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GenerateHistoricalMetricsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GenerateHistoricalMetricsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateHistoricalMetricsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.services.GenerateHistoricalMetricsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

