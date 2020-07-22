// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/customer_service.proto

package com.google.ads.googleads.v3.services;

/**
 * <pre>
 * A single update on a customer.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.services.CustomerOperation}
 */
public final class CustomerOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.services.CustomerOperation)
    CustomerOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomerOperation.newBuilder() to construct.
  private CustomerOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomerOperation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomerOperation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CustomerOperation(
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
            com.google.ads.googleads.v3.resources.Customer.Builder subBuilder = null;
            if (update_ != null) {
              subBuilder = update_.toBuilder();
            }
            update_ = input.readMessage(com.google.ads.googleads.v3.resources.Customer.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(update_);
              update_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v3.services.CustomerServiceProto.internal_static_google_ads_googleads_v3_services_CustomerOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.services.CustomerServiceProto.internal_static_google_ads_googleads_v3_services_CustomerOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.services.CustomerOperation.class, com.google.ads.googleads.v3.services.CustomerOperation.Builder.class);
  }

  public static final int UPDATE_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v3.resources.Customer update_;
  /**
   * <pre>
   * Mutate operation. Only updates are supported for customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Customer update = 1;</code>
   * @return Whether the update field is set.
   */
  @java.lang.Override
  public boolean hasUpdate() {
    return update_ != null;
  }
  /**
   * <pre>
   * Mutate operation. Only updates are supported for customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Customer update = 1;</code>
   * @return The update.
   */
  @java.lang.Override
  public com.google.ads.googleads.v3.resources.Customer getUpdate() {
    return update_ == null ? com.google.ads.googleads.v3.resources.Customer.getDefaultInstance() : update_;
  }
  /**
   * <pre>
   * Mutate operation. Only updates are supported for customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Customer update = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v3.resources.CustomerOrBuilder getUpdateOrBuilder() {
    return getUpdate();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (update_ != null) {
      output.writeMessage(1, getUpdate());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (update_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUpdate());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.ads.googleads.v3.services.CustomerOperation)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.services.CustomerOperation other = (com.google.ads.googleads.v3.services.CustomerOperation) obj;

    if (hasUpdate() != other.hasUpdate()) return false;
    if (hasUpdate()) {
      if (!getUpdate()
          .equals(other.getUpdate())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasUpdate()) {
      hash = (37 * hash) + UPDATE_FIELD_NUMBER;
      hash = (53 * hash) + getUpdate().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.services.CustomerOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.CustomerOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.CustomerOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.CustomerOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.CustomerOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.CustomerOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.CustomerOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.CustomerOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.CustomerOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.CustomerOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.CustomerOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.CustomerOperation parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.services.CustomerOperation prototype) {
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
   * A single update on a customer.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.services.CustomerOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.services.CustomerOperation)
      com.google.ads.googleads.v3.services.CustomerOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.services.CustomerServiceProto.internal_static_google_ads_googleads_v3_services_CustomerOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.services.CustomerServiceProto.internal_static_google_ads_googleads_v3_services_CustomerOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.services.CustomerOperation.class, com.google.ads.googleads.v3.services.CustomerOperation.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.services.CustomerOperation.newBuilder()
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
      if (updateBuilder_ == null) {
        update_ = null;
      } else {
        update_ = null;
        updateBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.services.CustomerServiceProto.internal_static_google_ads_googleads_v3_services_CustomerOperation_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.CustomerOperation getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.services.CustomerOperation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.CustomerOperation build() {
      com.google.ads.googleads.v3.services.CustomerOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.CustomerOperation buildPartial() {
      com.google.ads.googleads.v3.services.CustomerOperation result = new com.google.ads.googleads.v3.services.CustomerOperation(this);
      if (updateBuilder_ == null) {
        result.update_ = update_;
      } else {
        result.update_ = updateBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v3.services.CustomerOperation) {
        return mergeFrom((com.google.ads.googleads.v3.services.CustomerOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.services.CustomerOperation other) {
      if (other == com.google.ads.googleads.v3.services.CustomerOperation.getDefaultInstance()) return this;
      if (other.hasUpdate()) {
        mergeUpdate(other.getUpdate());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.ads.googleads.v3.services.CustomerOperation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.services.CustomerOperation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.ads.googleads.v3.resources.Customer update_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v3.resources.Customer, com.google.ads.googleads.v3.resources.Customer.Builder, com.google.ads.googleads.v3.resources.CustomerOrBuilder> updateBuilder_;
    /**
     * <pre>
     * Mutate operation. Only updates are supported for customer.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.Customer update = 1;</code>
     * @return Whether the update field is set.
     */
    public boolean hasUpdate() {
      return updateBuilder_ != null || update_ != null;
    }
    /**
     * <pre>
     * Mutate operation. Only updates are supported for customer.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.Customer update = 1;</code>
     * @return The update.
     */
    public com.google.ads.googleads.v3.resources.Customer getUpdate() {
      if (updateBuilder_ == null) {
        return update_ == null ? com.google.ads.googleads.v3.resources.Customer.getDefaultInstance() : update_;
      } else {
        return updateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Mutate operation. Only updates are supported for customer.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.Customer update = 1;</code>
     */
    public Builder setUpdate(com.google.ads.googleads.v3.resources.Customer value) {
      if (updateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        update_ = value;
        onChanged();
      } else {
        updateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Mutate operation. Only updates are supported for customer.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.Customer update = 1;</code>
     */
    public Builder setUpdate(
        com.google.ads.googleads.v3.resources.Customer.Builder builderForValue) {
      if (updateBuilder_ == null) {
        update_ = builderForValue.build();
        onChanged();
      } else {
        updateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Mutate operation. Only updates are supported for customer.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.Customer update = 1;</code>
     */
    public Builder mergeUpdate(com.google.ads.googleads.v3.resources.Customer value) {
      if (updateBuilder_ == null) {
        if (update_ != null) {
          update_ =
            com.google.ads.googleads.v3.resources.Customer.newBuilder(update_).mergeFrom(value).buildPartial();
        } else {
          update_ = value;
        }
        onChanged();
      } else {
        updateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Mutate operation. Only updates are supported for customer.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.Customer update = 1;</code>
     */
    public Builder clearUpdate() {
      if (updateBuilder_ == null) {
        update_ = null;
        onChanged();
      } else {
        update_ = null;
        updateBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Mutate operation. Only updates are supported for customer.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.Customer update = 1;</code>
     */
    public com.google.ads.googleads.v3.resources.Customer.Builder getUpdateBuilder() {
      
      onChanged();
      return getUpdateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Mutate operation. Only updates are supported for customer.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.Customer update = 1;</code>
     */
    public com.google.ads.googleads.v3.resources.CustomerOrBuilder getUpdateOrBuilder() {
      if (updateBuilder_ != null) {
        return updateBuilder_.getMessageOrBuilder();
      } else {
        return update_ == null ?
            com.google.ads.googleads.v3.resources.Customer.getDefaultInstance() : update_;
      }
    }
    /**
     * <pre>
     * Mutate operation. Only updates are supported for customer.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.resources.Customer update = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v3.resources.Customer, com.google.ads.googleads.v3.resources.Customer.Builder, com.google.ads.googleads.v3.resources.CustomerOrBuilder> 
        getUpdateFieldBuilder() {
      if (updateBuilder_ == null) {
        updateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v3.resources.Customer, com.google.ads.googleads.v3.resources.Customer.Builder, com.google.ads.googleads.v3.resources.CustomerOrBuilder>(
                getUpdate(),
                getParentForChildren(),
                isClean());
        update_ = null;
      }
      return updateBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.services.CustomerOperation)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.CustomerOperation)
  private static final com.google.ads.googleads.v3.services.CustomerOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.services.CustomerOperation();
  }

  public static com.google.ads.googleads.v3.services.CustomerOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomerOperation>
      PARSER = new com.google.protobuf.AbstractParser<CustomerOperation>() {
    @java.lang.Override
    public CustomerOperation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CustomerOperation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CustomerOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomerOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.services.CustomerOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

