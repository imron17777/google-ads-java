// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/criteria.proto

package com.google.ads.googleads.v2.common;

/**
 * <pre>
 * A listing group criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.common.ListingGroupInfo}
 */
public final class ListingGroupInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.common.ListingGroupInfo)
    ListingGroupInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListingGroupInfo.newBuilder() to construct.
  private ListingGroupInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListingGroupInfo() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListingGroupInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListingGroupInfo(
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
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 18: {
            com.google.ads.googleads.v2.common.ListingDimensionInfo.Builder subBuilder = null;
            if (caseValue_ != null) {
              subBuilder = caseValue_.toBuilder();
            }
            caseValue_ = input.readMessage(com.google.ads.googleads.v2.common.ListingDimensionInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(caseValue_);
              caseValue_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (parentAdGroupCriterion_ != null) {
              subBuilder = parentAdGroupCriterion_.toBuilder();
            }
            parentAdGroupCriterion_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(parentAdGroupCriterion_);
              parentAdGroupCriterion_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_ListingGroupInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_ListingGroupInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.common.ListingGroupInfo.class, com.google.ads.googleads.v2.common.ListingGroupInfo.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * Type of the listing group.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Type of the listing group.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType getType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType result = com.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType.valueOf(type_);
    return result == null ? com.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType.UNRECOGNIZED : result;
  }

  public static final int CASE_VALUE_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v2.common.ListingDimensionInfo caseValue_;
  /**
   * <pre>
   * Dimension value with which this listing group is refining its parent.
   * Undefined for the root group.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
   * @return Whether the caseValue field is set.
   */
  @java.lang.Override
  public boolean hasCaseValue() {
    return caseValue_ != null;
  }
  /**
   * <pre>
   * Dimension value with which this listing group is refining its parent.
   * Undefined for the root group.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
   * @return The caseValue.
   */
  @java.lang.Override
  public com.google.ads.googleads.v2.common.ListingDimensionInfo getCaseValue() {
    return caseValue_ == null ? com.google.ads.googleads.v2.common.ListingDimensionInfo.getDefaultInstance() : caseValue_;
  }
  /**
   * <pre>
   * Dimension value with which this listing group is refining its parent.
   * Undefined for the root group.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v2.common.ListingDimensionInfoOrBuilder getCaseValueOrBuilder() {
    return getCaseValue();
  }

  public static final int PARENT_AD_GROUP_CRITERION_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue parentAdGroupCriterion_;
  /**
   * <pre>
   * Resource name of ad group criterion which is the parent listing group
   * subdivision. Null for the root group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
   * @return Whether the parentAdGroupCriterion field is set.
   */
  @java.lang.Override
  public boolean hasParentAdGroupCriterion() {
    return parentAdGroupCriterion_ != null;
  }
  /**
   * <pre>
   * Resource name of ad group criterion which is the parent listing group
   * subdivision. Null for the root group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
   * @return The parentAdGroupCriterion.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getParentAdGroupCriterion() {
    return parentAdGroupCriterion_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : parentAdGroupCriterion_;
  }
  /**
   * <pre>
   * Resource name of ad group criterion which is the parent listing group
   * subdivision. Null for the root group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getParentAdGroupCriterionOrBuilder() {
    return getParentAdGroupCriterion();
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
    if (type_ != com.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (caseValue_ != null) {
      output.writeMessage(2, getCaseValue());
    }
    if (parentAdGroupCriterion_ != null) {
      output.writeMessage(3, getParentAdGroupCriterion());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (caseValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCaseValue());
    }
    if (parentAdGroupCriterion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getParentAdGroupCriterion());
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
    if (!(obj instanceof com.google.ads.googleads.v2.common.ListingGroupInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.common.ListingGroupInfo other = (com.google.ads.googleads.v2.common.ListingGroupInfo) obj;

    if (type_ != other.type_) return false;
    if (hasCaseValue() != other.hasCaseValue()) return false;
    if (hasCaseValue()) {
      if (!getCaseValue()
          .equals(other.getCaseValue())) return false;
    }
    if (hasParentAdGroupCriterion() != other.hasParentAdGroupCriterion()) return false;
    if (hasParentAdGroupCriterion()) {
      if (!getParentAdGroupCriterion()
          .equals(other.getParentAdGroupCriterion())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasCaseValue()) {
      hash = (37 * hash) + CASE_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getCaseValue().hashCode();
    }
    if (hasParentAdGroupCriterion()) {
      hash = (37 * hash) + PARENT_AD_GROUP_CRITERION_FIELD_NUMBER;
      hash = (53 * hash) + getParentAdGroupCriterion().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.common.ListingGroupInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.ListingGroupInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ListingGroupInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.ListingGroupInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ListingGroupInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.ListingGroupInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ListingGroupInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.ListingGroupInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ListingGroupInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.ListingGroupInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ListingGroupInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.ListingGroupInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.common.ListingGroupInfo prototype) {
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
   * A listing group criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.common.ListingGroupInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.common.ListingGroupInfo)
      com.google.ads.googleads.v2.common.ListingGroupInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_ListingGroupInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_ListingGroupInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.common.ListingGroupInfo.class, com.google.ads.googleads.v2.common.ListingGroupInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.common.ListingGroupInfo.newBuilder()
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
      type_ = 0;

      if (caseValueBuilder_ == null) {
        caseValue_ = null;
      } else {
        caseValue_ = null;
        caseValueBuilder_ = null;
      }
      if (parentAdGroupCriterionBuilder_ == null) {
        parentAdGroupCriterion_ = null;
      } else {
        parentAdGroupCriterion_ = null;
        parentAdGroupCriterionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_ListingGroupInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.ListingGroupInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.common.ListingGroupInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.ListingGroupInfo build() {
      com.google.ads.googleads.v2.common.ListingGroupInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.ListingGroupInfo buildPartial() {
      com.google.ads.googleads.v2.common.ListingGroupInfo result = new com.google.ads.googleads.v2.common.ListingGroupInfo(this);
      result.type_ = type_;
      if (caseValueBuilder_ == null) {
        result.caseValue_ = caseValue_;
      } else {
        result.caseValue_ = caseValueBuilder_.build();
      }
      if (parentAdGroupCriterionBuilder_ == null) {
        result.parentAdGroupCriterion_ = parentAdGroupCriterion_;
      } else {
        result.parentAdGroupCriterion_ = parentAdGroupCriterionBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.common.ListingGroupInfo) {
        return mergeFrom((com.google.ads.googleads.v2.common.ListingGroupInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.common.ListingGroupInfo other) {
      if (other == com.google.ads.googleads.v2.common.ListingGroupInfo.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasCaseValue()) {
        mergeCaseValue(other.getCaseValue());
      }
      if (other.hasParentAdGroupCriterion()) {
        mergeParentAdGroupCriterion(other.getParentAdGroupCriterion());
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
      com.google.ads.googleads.v2.common.ListingGroupInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.common.ListingGroupInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * Type of the listing group.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Type of the listing group.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the listing group.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType getType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType result = com.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType.valueOf(type_);
      return result == null ? com.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of the listing group.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the listing group.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v2.common.ListingDimensionInfo caseValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v2.common.ListingDimensionInfo, com.google.ads.googleads.v2.common.ListingDimensionInfo.Builder, com.google.ads.googleads.v2.common.ListingDimensionInfoOrBuilder> caseValueBuilder_;
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
     * @return Whether the caseValue field is set.
     */
    public boolean hasCaseValue() {
      return caseValueBuilder_ != null || caseValue_ != null;
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
     * @return The caseValue.
     */
    public com.google.ads.googleads.v2.common.ListingDimensionInfo getCaseValue() {
      if (caseValueBuilder_ == null) {
        return caseValue_ == null ? com.google.ads.googleads.v2.common.ListingDimensionInfo.getDefaultInstance() : caseValue_;
      } else {
        return caseValueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
     */
    public Builder setCaseValue(com.google.ads.googleads.v2.common.ListingDimensionInfo value) {
      if (caseValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        caseValue_ = value;
        onChanged();
      } else {
        caseValueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
     */
    public Builder setCaseValue(
        com.google.ads.googleads.v2.common.ListingDimensionInfo.Builder builderForValue) {
      if (caseValueBuilder_ == null) {
        caseValue_ = builderForValue.build();
        onChanged();
      } else {
        caseValueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
     */
    public Builder mergeCaseValue(com.google.ads.googleads.v2.common.ListingDimensionInfo value) {
      if (caseValueBuilder_ == null) {
        if (caseValue_ != null) {
          caseValue_ =
            com.google.ads.googleads.v2.common.ListingDimensionInfo.newBuilder(caseValue_).mergeFrom(value).buildPartial();
        } else {
          caseValue_ = value;
        }
        onChanged();
      } else {
        caseValueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
     */
    public Builder clearCaseValue() {
      if (caseValueBuilder_ == null) {
        caseValue_ = null;
        onChanged();
      } else {
        caseValue_ = null;
        caseValueBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
     */
    public com.google.ads.googleads.v2.common.ListingDimensionInfo.Builder getCaseValueBuilder() {
      
      onChanged();
      return getCaseValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
     */
    public com.google.ads.googleads.v2.common.ListingDimensionInfoOrBuilder getCaseValueOrBuilder() {
      if (caseValueBuilder_ != null) {
        return caseValueBuilder_.getMessageOrBuilder();
      } else {
        return caseValue_ == null ?
            com.google.ads.googleads.v2.common.ListingDimensionInfo.getDefaultInstance() : caseValue_;
      }
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v2.common.ListingDimensionInfo, com.google.ads.googleads.v2.common.ListingDimensionInfo.Builder, com.google.ads.googleads.v2.common.ListingDimensionInfoOrBuilder> 
        getCaseValueFieldBuilder() {
      if (caseValueBuilder_ == null) {
        caseValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v2.common.ListingDimensionInfo, com.google.ads.googleads.v2.common.ListingDimensionInfo.Builder, com.google.ads.googleads.v2.common.ListingDimensionInfoOrBuilder>(
                getCaseValue(),
                getParentForChildren(),
                isClean());
        caseValue_ = null;
      }
      return caseValueBuilder_;
    }

    private com.google.protobuf.StringValue parentAdGroupCriterion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> parentAdGroupCriterionBuilder_;
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
     * @return Whether the parentAdGroupCriterion field is set.
     */
    public boolean hasParentAdGroupCriterion() {
      return parentAdGroupCriterionBuilder_ != null || parentAdGroupCriterion_ != null;
    }
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
     * @return The parentAdGroupCriterion.
     */
    public com.google.protobuf.StringValue getParentAdGroupCriterion() {
      if (parentAdGroupCriterionBuilder_ == null) {
        return parentAdGroupCriterion_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : parentAdGroupCriterion_;
      } else {
        return parentAdGroupCriterionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
     */
    public Builder setParentAdGroupCriterion(com.google.protobuf.StringValue value) {
      if (parentAdGroupCriterionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parentAdGroupCriterion_ = value;
        onChanged();
      } else {
        parentAdGroupCriterionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
     */
    public Builder setParentAdGroupCriterion(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (parentAdGroupCriterionBuilder_ == null) {
        parentAdGroupCriterion_ = builderForValue.build();
        onChanged();
      } else {
        parentAdGroupCriterionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
     */
    public Builder mergeParentAdGroupCriterion(com.google.protobuf.StringValue value) {
      if (parentAdGroupCriterionBuilder_ == null) {
        if (parentAdGroupCriterion_ != null) {
          parentAdGroupCriterion_ =
            com.google.protobuf.StringValue.newBuilder(parentAdGroupCriterion_).mergeFrom(value).buildPartial();
        } else {
          parentAdGroupCriterion_ = value;
        }
        onChanged();
      } else {
        parentAdGroupCriterionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
     */
    public Builder clearParentAdGroupCriterion() {
      if (parentAdGroupCriterionBuilder_ == null) {
        parentAdGroupCriterion_ = null;
        onChanged();
      } else {
        parentAdGroupCriterion_ = null;
        parentAdGroupCriterionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getParentAdGroupCriterionBuilder() {
      
      onChanged();
      return getParentAdGroupCriterionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getParentAdGroupCriterionOrBuilder() {
      if (parentAdGroupCriterionBuilder_ != null) {
        return parentAdGroupCriterionBuilder_.getMessageOrBuilder();
      } else {
        return parentAdGroupCriterion_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : parentAdGroupCriterion_;
      }
    }
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getParentAdGroupCriterionFieldBuilder() {
      if (parentAdGroupCriterionBuilder_ == null) {
        parentAdGroupCriterionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getParentAdGroupCriterion(),
                getParentForChildren(),
                isClean());
        parentAdGroupCriterion_ = null;
      }
      return parentAdGroupCriterionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.common.ListingGroupInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.common.ListingGroupInfo)
  private static final com.google.ads.googleads.v2.common.ListingGroupInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.common.ListingGroupInfo();
  }

  public static com.google.ads.googleads.v2.common.ListingGroupInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListingGroupInfo>
      PARSER = new com.google.protobuf.AbstractParser<ListingGroupInfo>() {
    @java.lang.Override
    public ListingGroupInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListingGroupInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListingGroupInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListingGroupInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.common.ListingGroupInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

