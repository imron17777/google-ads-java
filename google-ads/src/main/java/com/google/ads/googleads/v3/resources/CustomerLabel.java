// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/customer_label.proto

package com.google.ads.googleads.v3.resources;

/**
 * <pre>
 * Represents a relationship between a customer and a label. This customer may
 * not have access to all the labels attached to it. Additional CustomerLabels
 * may be returned by increasing permissions with login-customer-id.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.resources.CustomerLabel}
 */
public final class CustomerLabel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.resources.CustomerLabel)
    CustomerLabelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomerLabel.newBuilder() to construct.
  private CustomerLabel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomerLabel() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomerLabel();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CustomerLabel(
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
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (customer_ != null) {
              subBuilder = customer_.toBuilder();
            }
            customer_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(customer_);
              customer_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (label_ != null) {
              subBuilder = label_.toBuilder();
            }
            label_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(label_);
              label_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v3.resources.CustomerLabelProto.internal_static_google_ads_googleads_v3_resources_CustomerLabel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.resources.CustomerLabelProto.internal_static_google_ads_googleads_v3_resources_CustomerLabel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.resources.CustomerLabel.class, com.google.ads.googleads.v3.resources.CustomerLabel.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Immutable. Name of the resource.
   * Customer label resource names have the form:
   * `customers/{customer_id}/customerLabels/{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. Name of the resource.
   * Customer label resource names have the form:
   * `customers/{customer_id}/customerLabels/{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOMER_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue customer_;
  /**
   * <pre>
   * Output only. The resource name of the customer to which the label is attached.
   * Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue customer = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the customer field is set.
   */
  @java.lang.Override
  public boolean hasCustomer() {
    return customer_ != null;
  }
  /**
   * <pre>
   * Output only. The resource name of the customer to which the label is attached.
   * Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue customer = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The customer.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getCustomer() {
    return customer_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : customer_;
  }
  /**
   * <pre>
   * Output only. The resource name of the customer to which the label is attached.
   * Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue customer = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getCustomerOrBuilder() {
    return getCustomer();
  }

  public static final int LABEL_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue label_;
  /**
   * <pre>
   * Output only. The resource name of the label assigned to the customer.
   * Note: the Customer ID portion of the label resource name is not
   * validated when creating a new CustomerLabel.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the label field is set.
   */
  @java.lang.Override
  public boolean hasLabel() {
    return label_ != null;
  }
  /**
   * <pre>
   * Output only. The resource name of the label assigned to the customer.
   * Note: the Customer ID portion of the label resource name is not
   * validated when creating a new CustomerLabel.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The label.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getLabel() {
    return label_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : label_;
  }
  /**
   * <pre>
   * Output only. The resource name of the label assigned to the customer.
   * Note: the Customer ID portion of the label resource name is not
   * validated when creating a new CustomerLabel.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getLabelOrBuilder() {
    return getLabel();
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
    if (!getResourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (customer_ != null) {
      output.writeMessage(2, getCustomer());
    }
    if (label_ != null) {
      output.writeMessage(3, getLabel());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (customer_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCustomer());
    }
    if (label_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLabel());
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
    if (!(obj instanceof com.google.ads.googleads.v3.resources.CustomerLabel)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.resources.CustomerLabel other = (com.google.ads.googleads.v3.resources.CustomerLabel) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasCustomer() != other.hasCustomer()) return false;
    if (hasCustomer()) {
      if (!getCustomer()
          .equals(other.getCustomer())) return false;
    }
    if (hasLabel() != other.hasLabel()) return false;
    if (hasLabel()) {
      if (!getLabel()
          .equals(other.getLabel())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasCustomer()) {
      hash = (37 * hash) + CUSTOMER_FIELD_NUMBER;
      hash = (53 * hash) + getCustomer().hashCode();
    }
    if (hasLabel()) {
      hash = (37 * hash) + LABEL_FIELD_NUMBER;
      hash = (53 * hash) + getLabel().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.resources.CustomerLabel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.CustomerLabel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.CustomerLabel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.CustomerLabel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.CustomerLabel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.CustomerLabel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.CustomerLabel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.CustomerLabel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.CustomerLabel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.CustomerLabel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.CustomerLabel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.CustomerLabel parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.resources.CustomerLabel prototype) {
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
   * Represents a relationship between a customer and a label. This customer may
   * not have access to all the labels attached to it. Additional CustomerLabels
   * may be returned by increasing permissions with login-customer-id.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.resources.CustomerLabel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.resources.CustomerLabel)
      com.google.ads.googleads.v3.resources.CustomerLabelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.resources.CustomerLabelProto.internal_static_google_ads_googleads_v3_resources_CustomerLabel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.resources.CustomerLabelProto.internal_static_google_ads_googleads_v3_resources_CustomerLabel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.resources.CustomerLabel.class, com.google.ads.googleads.v3.resources.CustomerLabel.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.resources.CustomerLabel.newBuilder()
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
      resourceName_ = "";

      if (customerBuilder_ == null) {
        customer_ = null;
      } else {
        customer_ = null;
        customerBuilder_ = null;
      }
      if (labelBuilder_ == null) {
        label_ = null;
      } else {
        label_ = null;
        labelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.resources.CustomerLabelProto.internal_static_google_ads_googleads_v3_resources_CustomerLabel_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.CustomerLabel getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.resources.CustomerLabel.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.CustomerLabel build() {
      com.google.ads.googleads.v3.resources.CustomerLabel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.CustomerLabel buildPartial() {
      com.google.ads.googleads.v3.resources.CustomerLabel result = new com.google.ads.googleads.v3.resources.CustomerLabel(this);
      result.resourceName_ = resourceName_;
      if (customerBuilder_ == null) {
        result.customer_ = customer_;
      } else {
        result.customer_ = customerBuilder_.build();
      }
      if (labelBuilder_ == null) {
        result.label_ = label_;
      } else {
        result.label_ = labelBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v3.resources.CustomerLabel) {
        return mergeFrom((com.google.ads.googleads.v3.resources.CustomerLabel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.resources.CustomerLabel other) {
      if (other == com.google.ads.googleads.v3.resources.CustomerLabel.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasCustomer()) {
        mergeCustomer(other.getCustomer());
      }
      if (other.hasLabel()) {
        mergeLabel(other.getLabel());
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
      com.google.ads.googleads.v3.resources.CustomerLabel parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.resources.CustomerLabel) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Immutable. Name of the resource.
     * Customer label resource names have the form:
     * `customers/{customer_id}/customerLabels/{label_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. Name of the resource.
     * Customer label resource names have the form:
     * `customers/{customer_id}/customerLabels/{label_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. Name of the resource.
     * Customer label resource names have the form:
     * `customers/{customer_id}/customerLabels/{label_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. Name of the resource.
     * Customer label resource names have the form:
     * `customers/{customer_id}/customerLabels/{label_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. Name of the resource.
     * Customer label resource names have the form:
     * `customers/{customer_id}/customerLabels/{label_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue customer_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> customerBuilder_;
    /**
     * <pre>
     * Output only. The resource name of the customer to which the label is attached.
     * Read only.
     * </pre>
     *
     * <code>.google.protobuf.StringValue customer = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the customer field is set.
     */
    public boolean hasCustomer() {
      return customerBuilder_ != null || customer_ != null;
    }
    /**
     * <pre>
     * Output only. The resource name of the customer to which the label is attached.
     * Read only.
     * </pre>
     *
     * <code>.google.protobuf.StringValue customer = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The customer.
     */
    public com.google.protobuf.StringValue getCustomer() {
      if (customerBuilder_ == null) {
        return customer_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : customer_;
      } else {
        return customerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. The resource name of the customer to which the label is attached.
     * Read only.
     * </pre>
     *
     * <code>.google.protobuf.StringValue customer = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setCustomer(com.google.protobuf.StringValue value) {
      if (customerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customer_ = value;
        onChanged();
      } else {
        customerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the customer to which the label is attached.
     * Read only.
     * </pre>
     *
     * <code>.google.protobuf.StringValue customer = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setCustomer(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (customerBuilder_ == null) {
        customer_ = builderForValue.build();
        onChanged();
      } else {
        customerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the customer to which the label is attached.
     * Read only.
     * </pre>
     *
     * <code>.google.protobuf.StringValue customer = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeCustomer(com.google.protobuf.StringValue value) {
      if (customerBuilder_ == null) {
        if (customer_ != null) {
          customer_ =
            com.google.protobuf.StringValue.newBuilder(customer_).mergeFrom(value).buildPartial();
        } else {
          customer_ = value;
        }
        onChanged();
      } else {
        customerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the customer to which the label is attached.
     * Read only.
     * </pre>
     *
     * <code>.google.protobuf.StringValue customer = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearCustomer() {
      if (customerBuilder_ == null) {
        customer_ = null;
        onChanged();
      } else {
        customer_ = null;
        customerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the customer to which the label is attached.
     * Read only.
     * </pre>
     *
     * <code>.google.protobuf.StringValue customer = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.StringValue.Builder getCustomerBuilder() {
      
      onChanged();
      return getCustomerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. The resource name of the customer to which the label is attached.
     * Read only.
     * </pre>
     *
     * <code>.google.protobuf.StringValue customer = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.StringValueOrBuilder getCustomerOrBuilder() {
      if (customerBuilder_ != null) {
        return customerBuilder_.getMessageOrBuilder();
      } else {
        return customer_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : customer_;
      }
    }
    /**
     * <pre>
     * Output only. The resource name of the customer to which the label is attached.
     * Read only.
     * </pre>
     *
     * <code>.google.protobuf.StringValue customer = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getCustomerFieldBuilder() {
      if (customerBuilder_ == null) {
        customerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getCustomer(),
                getParentForChildren(),
                isClean());
        customer_ = null;
      }
      return customerBuilder_;
    }

    private com.google.protobuf.StringValue label_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> labelBuilder_;
    /**
     * <pre>
     * Output only. The resource name of the label assigned to the customer.
     * Note: the Customer ID portion of the label resource name is not
     * validated when creating a new CustomerLabel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the label field is set.
     */
    public boolean hasLabel() {
      return labelBuilder_ != null || label_ != null;
    }
    /**
     * <pre>
     * Output only. The resource name of the label assigned to the customer.
     * Note: the Customer ID portion of the label resource name is not
     * validated when creating a new CustomerLabel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The label.
     */
    public com.google.protobuf.StringValue getLabel() {
      if (labelBuilder_ == null) {
        return label_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : label_;
      } else {
        return labelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. The resource name of the label assigned to the customer.
     * Note: the Customer ID portion of the label resource name is not
     * validated when creating a new CustomerLabel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setLabel(com.google.protobuf.StringValue value) {
      if (labelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        label_ = value;
        onChanged();
      } else {
        labelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the label assigned to the customer.
     * Note: the Customer ID portion of the label resource name is not
     * validated when creating a new CustomerLabel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setLabel(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (labelBuilder_ == null) {
        label_ = builderForValue.build();
        onChanged();
      } else {
        labelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the label assigned to the customer.
     * Note: the Customer ID portion of the label resource name is not
     * validated when creating a new CustomerLabel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeLabel(com.google.protobuf.StringValue value) {
      if (labelBuilder_ == null) {
        if (label_ != null) {
          label_ =
            com.google.protobuf.StringValue.newBuilder(label_).mergeFrom(value).buildPartial();
        } else {
          label_ = value;
        }
        onChanged();
      } else {
        labelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the label assigned to the customer.
     * Note: the Customer ID portion of the label resource name is not
     * validated when creating a new CustomerLabel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearLabel() {
      if (labelBuilder_ == null) {
        label_ = null;
        onChanged();
      } else {
        label_ = null;
        labelBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the label assigned to the customer.
     * Note: the Customer ID portion of the label resource name is not
     * validated when creating a new CustomerLabel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.StringValue.Builder getLabelBuilder() {
      
      onChanged();
      return getLabelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. The resource name of the label assigned to the customer.
     * Note: the Customer ID portion of the label resource name is not
     * validated when creating a new CustomerLabel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.StringValueOrBuilder getLabelOrBuilder() {
      if (labelBuilder_ != null) {
        return labelBuilder_.getMessageOrBuilder();
      } else {
        return label_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : label_;
      }
    }
    /**
     * <pre>
     * Output only. The resource name of the label assigned to the customer.
     * Note: the Customer ID portion of the label resource name is not
     * validated when creating a new CustomerLabel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getLabelFieldBuilder() {
      if (labelBuilder_ == null) {
        labelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getLabel(),
                getParentForChildren(),
                isClean());
        label_ = null;
      }
      return labelBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.resources.CustomerLabel)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.resources.CustomerLabel)
  private static final com.google.ads.googleads.v3.resources.CustomerLabel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.resources.CustomerLabel();
  }

  public static com.google.ads.googleads.v3.resources.CustomerLabel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomerLabel>
      PARSER = new com.google.protobuf.AbstractParser<CustomerLabel>() {
    @java.lang.Override
    public CustomerLabel parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CustomerLabel(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CustomerLabel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomerLabel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.resources.CustomerLabel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

