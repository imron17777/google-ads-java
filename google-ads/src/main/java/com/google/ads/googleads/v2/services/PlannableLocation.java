// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/reach_plan_service.proto

package com.google.ads.googleads.v2.services;

/**
 * <pre>
 * A plannable location: a country, a DMA, a metro region, a tv region,
 * a province.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.services.PlannableLocation}
 */
public final class PlannableLocation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.services.PlannableLocation)
    PlannableLocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlannableLocation.newBuilder() to construct.
  private PlannableLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlannableLocation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlannableLocation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlannableLocation(
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
            if (id_ != null) {
              subBuilder = id_.toBuilder();
            }
            id_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(id_);
              id_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (name_ != null) {
              subBuilder = name_.toBuilder();
            }
            name_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(name_);
              name_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (parentCountryId_ != null) {
              subBuilder = parentCountryId_.toBuilder();
            }
            parentCountryId_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(parentCountryId_);
              parentCountryId_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v2_services_PlannableLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v2_services_PlannableLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.services.PlannableLocation.class, com.google.ads.googleads.v2.services.PlannableLocation.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue id_;
  /**
   * <pre>
   * The location identifier.
   * </pre>
   *
   * <code>.google.protobuf.StringValue id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <pre>
   * The location identifier.
   * </pre>
   *
   * <code>.google.protobuf.StringValue id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getId() {
    return id_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : id_;
  }
  /**
   * <pre>
   * The location identifier.
   * </pre>
   *
   * <code>.google.protobuf.StringValue id = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue name_;
  /**
   * <pre>
   * The unique location name in english.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 2;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return name_ != null;
  }
  /**
   * <pre>
   * The unique location name in english.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getName() {
    return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
  }
  /**
   * <pre>
   * The unique location name in english.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
    return getName();
  }

  public static final int PARENT_COUNTRY_ID_FIELD_NUMBER = 3;
  private com.google.protobuf.Int64Value parentCountryId_;
  /**
   * <pre>
   * The parent country code, not present if location is a country.
   * If present will always be a criterion id: additional information, such as
   * country name are returned both via ListPlannableLocations or directly by
   * accessing GeoTargetConstantService with the criterion id.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
   * @return Whether the parentCountryId field is set.
   */
  @java.lang.Override
  public boolean hasParentCountryId() {
    return parentCountryId_ != null;
  }
  /**
   * <pre>
   * The parent country code, not present if location is a country.
   * If present will always be a criterion id: additional information, such as
   * country name are returned both via ListPlannableLocations or directly by
   * accessing GeoTargetConstantService with the criterion id.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
   * @return The parentCountryId.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getParentCountryId() {
    return parentCountryId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : parentCountryId_;
  }
  /**
   * <pre>
   * The parent country code, not present if location is a country.
   * If present will always be a criterion id: additional information, such as
   * country name are returned both via ListPlannableLocations or directly by
   * accessing GeoTargetConstantService with the criterion id.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getParentCountryIdOrBuilder() {
    return getParentCountryId();
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
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (name_ != null) {
      output.writeMessage(2, getName());
    }
    if (parentCountryId_ != null) {
      output.writeMessage(3, getParentCountryId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getId());
    }
    if (name_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getName());
    }
    if (parentCountryId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getParentCountryId());
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
    if (!(obj instanceof com.google.ads.googleads.v2.services.PlannableLocation)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.services.PlannableLocation other = (com.google.ads.googleads.v2.services.PlannableLocation) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (hasParentCountryId() != other.hasParentCountryId()) return false;
    if (hasParentCountryId()) {
      if (!getParentCountryId()
          .equals(other.getParentCountryId())) return false;
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
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasParentCountryId()) {
      hash = (37 * hash) + PARENT_COUNTRY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentCountryId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.services.PlannableLocation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.PlannableLocation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.PlannableLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.PlannableLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.PlannableLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.PlannableLocation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.PlannableLocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.PlannableLocation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.PlannableLocation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.PlannableLocation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.PlannableLocation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.PlannableLocation parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.services.PlannableLocation prototype) {
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
   * A plannable location: a country, a DMA, a metro region, a tv region,
   * a province.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.services.PlannableLocation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.services.PlannableLocation)
      com.google.ads.googleads.v2.services.PlannableLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v2_services_PlannableLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v2_services_PlannableLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.services.PlannableLocation.class, com.google.ads.googleads.v2.services.PlannableLocation.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.services.PlannableLocation.newBuilder()
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
      if (idBuilder_ == null) {
        id_ = null;
      } else {
        id_ = null;
        idBuilder_ = null;
      }
      if (nameBuilder_ == null) {
        name_ = null;
      } else {
        name_ = null;
        nameBuilder_ = null;
      }
      if (parentCountryIdBuilder_ == null) {
        parentCountryId_ = null;
      } else {
        parentCountryId_ = null;
        parentCountryIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v2_services_PlannableLocation_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.PlannableLocation getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.services.PlannableLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.PlannableLocation build() {
      com.google.ads.googleads.v2.services.PlannableLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.PlannableLocation buildPartial() {
      com.google.ads.googleads.v2.services.PlannableLocation result = new com.google.ads.googleads.v2.services.PlannableLocation(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (nameBuilder_ == null) {
        result.name_ = name_;
      } else {
        result.name_ = nameBuilder_.build();
      }
      if (parentCountryIdBuilder_ == null) {
        result.parentCountryId_ = parentCountryId_;
      } else {
        result.parentCountryId_ = parentCountryIdBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.services.PlannableLocation) {
        return mergeFrom((com.google.ads.googleads.v2.services.PlannableLocation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.services.PlannableLocation other) {
      if (other == com.google.ads.googleads.v2.services.PlannableLocation.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasName()) {
        mergeName(other.getName());
      }
      if (other.hasParentCountryId()) {
        mergeParentCountryId(other.getParentCountryId());
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
      com.google.ads.googleads.v2.services.PlannableLocation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.services.PlannableLocation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> idBuilder_;
    /**
     * <pre>
     * The location identifier.
     * </pre>
     *
     * <code>.google.protobuf.StringValue id = 1;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <pre>
     * The location identifier.
     * </pre>
     *
     * <code>.google.protobuf.StringValue id = 1;</code>
     * @return The id.
     */
    public com.google.protobuf.StringValue getId() {
      if (idBuilder_ == null) {
        return id_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The location identifier.
     * </pre>
     *
     * <code>.google.protobuf.StringValue id = 1;</code>
     */
    public Builder setId(com.google.protobuf.StringValue value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
        onChanged();
      } else {
        idBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The location identifier.
     * </pre>
     *
     * <code>.google.protobuf.StringValue id = 1;</code>
     */
    public Builder setId(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The location identifier.
     * </pre>
     *
     * <code>.google.protobuf.StringValue id = 1;</code>
     */
    public Builder mergeId(com.google.protobuf.StringValue value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ =
            com.google.protobuf.StringValue.newBuilder(id_).mergeFrom(value).buildPartial();
        } else {
          id_ = value;
        }
        onChanged();
      } else {
        idBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The location identifier.
     * </pre>
     *
     * <code>.google.protobuf.StringValue id = 1;</code>
     */
    public Builder clearId() {
      if (idBuilder_ == null) {
        id_ = null;
        onChanged();
      } else {
        id_ = null;
        idBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The location identifier.
     * </pre>
     *
     * <code>.google.protobuf.StringValue id = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getIdBuilder() {
      
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The location identifier.
     * </pre>
     *
     * <code>.google.protobuf.StringValue id = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : id_;
      }
    }
    /**
     * <pre>
     * The location identifier.
     * </pre>
     *
     * <code>.google.protobuf.StringValue id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private com.google.protobuf.StringValue name_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> nameBuilder_;
    /**
     * <pre>
     * The unique location name in english.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 2;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return nameBuilder_ != null || name_ != null;
    }
    /**
     * <pre>
     * The unique location name in english.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 2;</code>
     * @return The name.
     */
    public com.google.protobuf.StringValue getName() {
      if (nameBuilder_ == null) {
        return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
      } else {
        return nameBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The unique location name in english.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 2;</code>
     */
    public Builder setName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
        onChanged();
      } else {
        nameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The unique location name in english.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 2;</code>
     */
    public Builder setName(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (nameBuilder_ == null) {
        name_ = builderForValue.build();
        onChanged();
      } else {
        nameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The unique location name in english.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 2;</code>
     */
    public Builder mergeName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (name_ != null) {
          name_ =
            com.google.protobuf.StringValue.newBuilder(name_).mergeFrom(value).buildPartial();
        } else {
          name_ = value;
        }
        onChanged();
      } else {
        nameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The unique location name in english.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 2;</code>
     */
    public Builder clearName() {
      if (nameBuilder_ == null) {
        name_ = null;
        onChanged();
      } else {
        name_ = null;
        nameBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The unique location name in english.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getNameBuilder() {
      
      onChanged();
      return getNameFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The unique location name in english.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
      if (nameBuilder_ != null) {
        return nameBuilder_.getMessageOrBuilder();
      } else {
        return name_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : name_;
      }
    }
    /**
     * <pre>
     * The unique location name in english.
     * </pre>
     *
     * <code>.google.protobuf.StringValue name = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getNameFieldBuilder() {
      if (nameBuilder_ == null) {
        nameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getName(),
                getParentForChildren(),
                isClean());
        name_ = null;
      }
      return nameBuilder_;
    }

    private com.google.protobuf.Int64Value parentCountryId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> parentCountryIdBuilder_;
    /**
     * <pre>
     * The parent country code, not present if location is a country.
     * If present will always be a criterion id: additional information, such as
     * country name are returned both via ListPlannableLocations or directly by
     * accessing GeoTargetConstantService with the criterion id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
     * @return Whether the parentCountryId field is set.
     */
    public boolean hasParentCountryId() {
      return parentCountryIdBuilder_ != null || parentCountryId_ != null;
    }
    /**
     * <pre>
     * The parent country code, not present if location is a country.
     * If present will always be a criterion id: additional information, such as
     * country name are returned both via ListPlannableLocations or directly by
     * accessing GeoTargetConstantService with the criterion id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
     * @return The parentCountryId.
     */
    public com.google.protobuf.Int64Value getParentCountryId() {
      if (parentCountryIdBuilder_ == null) {
        return parentCountryId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : parentCountryId_;
      } else {
        return parentCountryIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The parent country code, not present if location is a country.
     * If present will always be a criterion id: additional information, such as
     * country name are returned both via ListPlannableLocations or directly by
     * accessing GeoTargetConstantService with the criterion id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
     */
    public Builder setParentCountryId(com.google.protobuf.Int64Value value) {
      if (parentCountryIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parentCountryId_ = value;
        onChanged();
      } else {
        parentCountryIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The parent country code, not present if location is a country.
     * If present will always be a criterion id: additional information, such as
     * country name are returned both via ListPlannableLocations or directly by
     * accessing GeoTargetConstantService with the criterion id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
     */
    public Builder setParentCountryId(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (parentCountryIdBuilder_ == null) {
        parentCountryId_ = builderForValue.build();
        onChanged();
      } else {
        parentCountryIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The parent country code, not present if location is a country.
     * If present will always be a criterion id: additional information, such as
     * country name are returned both via ListPlannableLocations or directly by
     * accessing GeoTargetConstantService with the criterion id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
     */
    public Builder mergeParentCountryId(com.google.protobuf.Int64Value value) {
      if (parentCountryIdBuilder_ == null) {
        if (parentCountryId_ != null) {
          parentCountryId_ =
            com.google.protobuf.Int64Value.newBuilder(parentCountryId_).mergeFrom(value).buildPartial();
        } else {
          parentCountryId_ = value;
        }
        onChanged();
      } else {
        parentCountryIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The parent country code, not present if location is a country.
     * If present will always be a criterion id: additional information, such as
     * country name are returned both via ListPlannableLocations or directly by
     * accessing GeoTargetConstantService with the criterion id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
     */
    public Builder clearParentCountryId() {
      if (parentCountryIdBuilder_ == null) {
        parentCountryId_ = null;
        onChanged();
      } else {
        parentCountryId_ = null;
        parentCountryIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The parent country code, not present if location is a country.
     * If present will always be a criterion id: additional information, such as
     * country name are returned both via ListPlannableLocations or directly by
     * accessing GeoTargetConstantService with the criterion id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
     */
    public com.google.protobuf.Int64Value.Builder getParentCountryIdBuilder() {
      
      onChanged();
      return getParentCountryIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The parent country code, not present if location is a country.
     * If present will always be a criterion id: additional information, such as
     * country name are returned both via ListPlannableLocations or directly by
     * accessing GeoTargetConstantService with the criterion id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getParentCountryIdOrBuilder() {
      if (parentCountryIdBuilder_ != null) {
        return parentCountryIdBuilder_.getMessageOrBuilder();
      } else {
        return parentCountryId_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : parentCountryId_;
      }
    }
    /**
     * <pre>
     * The parent country code, not present if location is a country.
     * If present will always be a criterion id: additional information, such as
     * country name are returned both via ListPlannableLocations or directly by
     * accessing GeoTargetConstantService with the criterion id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getParentCountryIdFieldBuilder() {
      if (parentCountryIdBuilder_ == null) {
        parentCountryIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getParentCountryId(),
                getParentForChildren(),
                isClean());
        parentCountryId_ = null;
      }
      return parentCountryIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.services.PlannableLocation)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.PlannableLocation)
  private static final com.google.ads.googleads.v2.services.PlannableLocation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.services.PlannableLocation();
  }

  public static com.google.ads.googleads.v2.services.PlannableLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlannableLocation>
      PARSER = new com.google.protobuf.AbstractParser<PlannableLocation>() {
    @java.lang.Override
    public PlannableLocation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlannableLocation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlannableLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlannableLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.services.PlannableLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

