// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/reach_plan_service.proto

package com.google.ads.googleads.v3.services;

/**
 * <pre>
 * A product being planned for reach.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.services.PlannedProduct}
 */
public final class PlannedProduct extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.services.PlannedProduct)
    PlannedProductOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlannedProduct.newBuilder() to construct.
  private PlannedProduct(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlannedProduct() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlannedProduct();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlannedProduct(
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
            if (plannableProductCode_ != null) {
              subBuilder = plannableProductCode_.toBuilder();
            }
            plannableProductCode_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(plannableProductCode_);
              plannableProductCode_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (budgetMicros_ != null) {
              subBuilder = budgetMicros_.toBuilder();
            }
            budgetMicros_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(budgetMicros_);
              budgetMicros_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v3.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v3_services_PlannedProduct_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v3_services_PlannedProduct_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.services.PlannedProduct.class, com.google.ads.googleads.v3.services.PlannedProduct.Builder.class);
  }

  public static final int PLANNABLE_PRODUCT_CODE_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue plannableProductCode_;
  /**
   * <pre>
   * Required. Selected product for planning.
   * Plannable products codes can be obtained from ListPlannableProducts.
   * </pre>
   *
   * <code>.google.protobuf.StringValue plannable_product_code = 1;</code>
   * @return Whether the plannableProductCode field is set.
   */
  @java.lang.Override
  public boolean hasPlannableProductCode() {
    return plannableProductCode_ != null;
  }
  /**
   * <pre>
   * Required. Selected product for planning.
   * Plannable products codes can be obtained from ListPlannableProducts.
   * </pre>
   *
   * <code>.google.protobuf.StringValue plannable_product_code = 1;</code>
   * @return The plannableProductCode.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getPlannableProductCode() {
    return plannableProductCode_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : plannableProductCode_;
  }
  /**
   * <pre>
   * Required. Selected product for planning.
   * Plannable products codes can be obtained from ListPlannableProducts.
   * </pre>
   *
   * <code>.google.protobuf.StringValue plannable_product_code = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getPlannableProductCodeOrBuilder() {
    return getPlannableProductCode();
  }

  public static final int BUDGET_MICROS_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value budgetMicros_;
  /**
   * <pre>
   * Required. Maximum budget allocation in micros for the selected product.
   * The value is specified in the selected planning currency_code.
   * E.g. 1 000 000$ = 1 000 000 000 000 micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value budget_micros = 2;</code>
   * @return Whether the budgetMicros field is set.
   */
  @java.lang.Override
  public boolean hasBudgetMicros() {
    return budgetMicros_ != null;
  }
  /**
   * <pre>
   * Required. Maximum budget allocation in micros for the selected product.
   * The value is specified in the selected planning currency_code.
   * E.g. 1 000 000$ = 1 000 000 000 000 micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value budget_micros = 2;</code>
   * @return The budgetMicros.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getBudgetMicros() {
    return budgetMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : budgetMicros_;
  }
  /**
   * <pre>
   * Required. Maximum budget allocation in micros for the selected product.
   * The value is specified in the selected planning currency_code.
   * E.g. 1 000 000$ = 1 000 000 000 000 micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value budget_micros = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getBudgetMicrosOrBuilder() {
    return getBudgetMicros();
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
    if (plannableProductCode_ != null) {
      output.writeMessage(1, getPlannableProductCode());
    }
    if (budgetMicros_ != null) {
      output.writeMessage(2, getBudgetMicros());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (plannableProductCode_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPlannableProductCode());
    }
    if (budgetMicros_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBudgetMicros());
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
    if (!(obj instanceof com.google.ads.googleads.v3.services.PlannedProduct)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.services.PlannedProduct other = (com.google.ads.googleads.v3.services.PlannedProduct) obj;

    if (hasPlannableProductCode() != other.hasPlannableProductCode()) return false;
    if (hasPlannableProductCode()) {
      if (!getPlannableProductCode()
          .equals(other.getPlannableProductCode())) return false;
    }
    if (hasBudgetMicros() != other.hasBudgetMicros()) return false;
    if (hasBudgetMicros()) {
      if (!getBudgetMicros()
          .equals(other.getBudgetMicros())) return false;
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
    if (hasPlannableProductCode()) {
      hash = (37 * hash) + PLANNABLE_PRODUCT_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getPlannableProductCode().hashCode();
    }
    if (hasBudgetMicros()) {
      hash = (37 * hash) + BUDGET_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + getBudgetMicros().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.services.PlannedProduct parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.PlannedProduct parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.PlannedProduct parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.PlannedProduct parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.PlannedProduct parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.PlannedProduct parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.PlannedProduct parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.PlannedProduct parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.PlannedProduct parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.PlannedProduct parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.PlannedProduct parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.PlannedProduct parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.services.PlannedProduct prototype) {
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
   * A product being planned for reach.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.services.PlannedProduct}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.services.PlannedProduct)
      com.google.ads.googleads.v3.services.PlannedProductOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v3_services_PlannedProduct_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v3_services_PlannedProduct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.services.PlannedProduct.class, com.google.ads.googleads.v3.services.PlannedProduct.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.services.PlannedProduct.newBuilder()
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
      if (plannableProductCodeBuilder_ == null) {
        plannableProductCode_ = null;
      } else {
        plannableProductCode_ = null;
        plannableProductCodeBuilder_ = null;
      }
      if (budgetMicrosBuilder_ == null) {
        budgetMicros_ = null;
      } else {
        budgetMicros_ = null;
        budgetMicrosBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v3_services_PlannedProduct_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.PlannedProduct getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.services.PlannedProduct.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.PlannedProduct build() {
      com.google.ads.googleads.v3.services.PlannedProduct result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.PlannedProduct buildPartial() {
      com.google.ads.googleads.v3.services.PlannedProduct result = new com.google.ads.googleads.v3.services.PlannedProduct(this);
      if (plannableProductCodeBuilder_ == null) {
        result.plannableProductCode_ = plannableProductCode_;
      } else {
        result.plannableProductCode_ = plannableProductCodeBuilder_.build();
      }
      if (budgetMicrosBuilder_ == null) {
        result.budgetMicros_ = budgetMicros_;
      } else {
        result.budgetMicros_ = budgetMicrosBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v3.services.PlannedProduct) {
        return mergeFrom((com.google.ads.googleads.v3.services.PlannedProduct)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.services.PlannedProduct other) {
      if (other == com.google.ads.googleads.v3.services.PlannedProduct.getDefaultInstance()) return this;
      if (other.hasPlannableProductCode()) {
        mergePlannableProductCode(other.getPlannableProductCode());
      }
      if (other.hasBudgetMicros()) {
        mergeBudgetMicros(other.getBudgetMicros());
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
      com.google.ads.googleads.v3.services.PlannedProduct parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.services.PlannedProduct) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue plannableProductCode_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> plannableProductCodeBuilder_;
    /**
     * <pre>
     * Required. Selected product for planning.
     * Plannable products codes can be obtained from ListPlannableProducts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_product_code = 1;</code>
     * @return Whether the plannableProductCode field is set.
     */
    public boolean hasPlannableProductCode() {
      return plannableProductCodeBuilder_ != null || plannableProductCode_ != null;
    }
    /**
     * <pre>
     * Required. Selected product for planning.
     * Plannable products codes can be obtained from ListPlannableProducts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_product_code = 1;</code>
     * @return The plannableProductCode.
     */
    public com.google.protobuf.StringValue getPlannableProductCode() {
      if (plannableProductCodeBuilder_ == null) {
        return plannableProductCode_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : plannableProductCode_;
      } else {
        return plannableProductCodeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Selected product for planning.
     * Plannable products codes can be obtained from ListPlannableProducts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_product_code = 1;</code>
     */
    public Builder setPlannableProductCode(com.google.protobuf.StringValue value) {
      if (plannableProductCodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        plannableProductCode_ = value;
        onChanged();
      } else {
        plannableProductCodeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Selected product for planning.
     * Plannable products codes can be obtained from ListPlannableProducts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_product_code = 1;</code>
     */
    public Builder setPlannableProductCode(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (plannableProductCodeBuilder_ == null) {
        plannableProductCode_ = builderForValue.build();
        onChanged();
      } else {
        plannableProductCodeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Selected product for planning.
     * Plannable products codes can be obtained from ListPlannableProducts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_product_code = 1;</code>
     */
    public Builder mergePlannableProductCode(com.google.protobuf.StringValue value) {
      if (plannableProductCodeBuilder_ == null) {
        if (plannableProductCode_ != null) {
          plannableProductCode_ =
            com.google.protobuf.StringValue.newBuilder(plannableProductCode_).mergeFrom(value).buildPartial();
        } else {
          plannableProductCode_ = value;
        }
        onChanged();
      } else {
        plannableProductCodeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Selected product for planning.
     * Plannable products codes can be obtained from ListPlannableProducts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_product_code = 1;</code>
     */
    public Builder clearPlannableProductCode() {
      if (plannableProductCodeBuilder_ == null) {
        plannableProductCode_ = null;
        onChanged();
      } else {
        plannableProductCode_ = null;
        plannableProductCodeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Selected product for planning.
     * Plannable products codes can be obtained from ListPlannableProducts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_product_code = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getPlannableProductCodeBuilder() {
      
      onChanged();
      return getPlannableProductCodeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Selected product for planning.
     * Plannable products codes can be obtained from ListPlannableProducts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_product_code = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getPlannableProductCodeOrBuilder() {
      if (plannableProductCodeBuilder_ != null) {
        return plannableProductCodeBuilder_.getMessageOrBuilder();
      } else {
        return plannableProductCode_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : plannableProductCode_;
      }
    }
    /**
     * <pre>
     * Required. Selected product for planning.
     * Plannable products codes can be obtained from ListPlannableProducts.
     * </pre>
     *
     * <code>.google.protobuf.StringValue plannable_product_code = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getPlannableProductCodeFieldBuilder() {
      if (plannableProductCodeBuilder_ == null) {
        plannableProductCodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getPlannableProductCode(),
                getParentForChildren(),
                isClean());
        plannableProductCode_ = null;
      }
      return plannableProductCodeBuilder_;
    }

    private com.google.protobuf.Int64Value budgetMicros_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> budgetMicrosBuilder_;
    /**
     * <pre>
     * Required. Maximum budget allocation in micros for the selected product.
     * The value is specified in the selected planning currency_code.
     * E.g. 1 000 000$ = 1 000 000 000 000 micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value budget_micros = 2;</code>
     * @return Whether the budgetMicros field is set.
     */
    public boolean hasBudgetMicros() {
      return budgetMicrosBuilder_ != null || budgetMicros_ != null;
    }
    /**
     * <pre>
     * Required. Maximum budget allocation in micros for the selected product.
     * The value is specified in the selected planning currency_code.
     * E.g. 1 000 000$ = 1 000 000 000 000 micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value budget_micros = 2;</code>
     * @return The budgetMicros.
     */
    public com.google.protobuf.Int64Value getBudgetMicros() {
      if (budgetMicrosBuilder_ == null) {
        return budgetMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : budgetMicros_;
      } else {
        return budgetMicrosBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Maximum budget allocation in micros for the selected product.
     * The value is specified in the selected planning currency_code.
     * E.g. 1 000 000$ = 1 000 000 000 000 micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value budget_micros = 2;</code>
     */
    public Builder setBudgetMicros(com.google.protobuf.Int64Value value) {
      if (budgetMicrosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        budgetMicros_ = value;
        onChanged();
      } else {
        budgetMicrosBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Maximum budget allocation in micros for the selected product.
     * The value is specified in the selected planning currency_code.
     * E.g. 1 000 000$ = 1 000 000 000 000 micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value budget_micros = 2;</code>
     */
    public Builder setBudgetMicros(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (budgetMicrosBuilder_ == null) {
        budgetMicros_ = builderForValue.build();
        onChanged();
      } else {
        budgetMicrosBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Maximum budget allocation in micros for the selected product.
     * The value is specified in the selected planning currency_code.
     * E.g. 1 000 000$ = 1 000 000 000 000 micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value budget_micros = 2;</code>
     */
    public Builder mergeBudgetMicros(com.google.protobuf.Int64Value value) {
      if (budgetMicrosBuilder_ == null) {
        if (budgetMicros_ != null) {
          budgetMicros_ =
            com.google.protobuf.Int64Value.newBuilder(budgetMicros_).mergeFrom(value).buildPartial();
        } else {
          budgetMicros_ = value;
        }
        onChanged();
      } else {
        budgetMicrosBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Maximum budget allocation in micros for the selected product.
     * The value is specified in the selected planning currency_code.
     * E.g. 1 000 000$ = 1 000 000 000 000 micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value budget_micros = 2;</code>
     */
    public Builder clearBudgetMicros() {
      if (budgetMicrosBuilder_ == null) {
        budgetMicros_ = null;
        onChanged();
      } else {
        budgetMicros_ = null;
        budgetMicrosBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Maximum budget allocation in micros for the selected product.
     * The value is specified in the selected planning currency_code.
     * E.g. 1 000 000$ = 1 000 000 000 000 micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value budget_micros = 2;</code>
     */
    public com.google.protobuf.Int64Value.Builder getBudgetMicrosBuilder() {
      
      onChanged();
      return getBudgetMicrosFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Maximum budget allocation in micros for the selected product.
     * The value is specified in the selected planning currency_code.
     * E.g. 1 000 000$ = 1 000 000 000 000 micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value budget_micros = 2;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getBudgetMicrosOrBuilder() {
      if (budgetMicrosBuilder_ != null) {
        return budgetMicrosBuilder_.getMessageOrBuilder();
      } else {
        return budgetMicros_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : budgetMicros_;
      }
    }
    /**
     * <pre>
     * Required. Maximum budget allocation in micros for the selected product.
     * The value is specified in the selected planning currency_code.
     * E.g. 1 000 000$ = 1 000 000 000 000 micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value budget_micros = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getBudgetMicrosFieldBuilder() {
      if (budgetMicrosBuilder_ == null) {
        budgetMicrosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getBudgetMicros(),
                getParentForChildren(),
                isClean());
        budgetMicros_ = null;
      }
      return budgetMicrosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.services.PlannedProduct)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.PlannedProduct)
  private static final com.google.ads.googleads.v3.services.PlannedProduct DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.services.PlannedProduct();
  }

  public static com.google.ads.googleads.v3.services.PlannedProduct getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlannedProduct>
      PARSER = new com.google.protobuf.AbstractParser<PlannedProduct>() {
    @java.lang.Override
    public PlannedProduct parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlannedProduct(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlannedProduct> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlannedProduct> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.services.PlannedProduct getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

