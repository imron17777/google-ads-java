// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/errors/authorization_error.proto

package com.google.ads.googleads.v4.errors;

/**
 * <pre>
 * Container for enum describing possible authorization errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.errors.AuthorizationErrorEnum}
 */
public final class AuthorizationErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.errors.AuthorizationErrorEnum)
    AuthorizationErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthorizationErrorEnum.newBuilder() to construct.
  private AuthorizationErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthorizationErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AuthorizationErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AuthorizationErrorEnum(
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
    return com.google.ads.googleads.v4.errors.AuthorizationErrorProto.internal_static_google_ads_googleads_v4_errors_AuthorizationErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.errors.AuthorizationErrorProto.internal_static_google_ads_googleads_v4_errors_AuthorizationErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.errors.AuthorizationErrorEnum.class, com.google.ads.googleads.v4.errors.AuthorizationErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible authorization errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v4.errors.AuthorizationErrorEnum.AuthorizationError}
   */
  public enum AuthorizationError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * User doesn't have permission to access customer. Note: If you're
     * accessing a client customer, the manager's customer ID must be set in the
     * `login-customer-id` header. Learn more at
     * https://developers.google.com/google-ads/api/docs/concepts/call-structure#cid
     * </pre>
     *
     * <code>USER_PERMISSION_DENIED = 2;</code>
     */
    USER_PERMISSION_DENIED(2),
    /**
     * <pre>
     * The developer token is not whitelisted.
     * </pre>
     *
     * <code>DEVELOPER_TOKEN_NOT_WHITELISTED = 3;</code>
     */
    DEVELOPER_TOKEN_NOT_WHITELISTED(3),
    /**
     * <pre>
     * The developer token is not allowed with the project sent in the request.
     * </pre>
     *
     * <code>DEVELOPER_TOKEN_PROHIBITED = 4;</code>
     */
    DEVELOPER_TOKEN_PROHIBITED(4),
    /**
     * <pre>
     * The Google Cloud project sent in the request does not have permission to
     * access the api.
     * </pre>
     *
     * <code>PROJECT_DISABLED = 5;</code>
     */
    PROJECT_DISABLED(5),
    /**
     * <pre>
     * Authorization of the client failed.
     * </pre>
     *
     * <code>AUTHORIZATION_ERROR = 6;</code>
     */
    AUTHORIZATION_ERROR(6),
    /**
     * <pre>
     * The user does not have permission to perform this action
     * (e.g., ADD, UPDATE, REMOVE) on the resource or call a method.
     * </pre>
     *
     * <code>ACTION_NOT_PERMITTED = 7;</code>
     */
    ACTION_NOT_PERMITTED(7),
    /**
     * <pre>
     * Signup not complete.
     * </pre>
     *
     * <code>INCOMPLETE_SIGNUP = 8;</code>
     */
    INCOMPLETE_SIGNUP(8),
    /**
     * <pre>
     * The customer can't be used because it isn't enabled.
     * </pre>
     *
     * <code>CUSTOMER_NOT_ENABLED = 24;</code>
     */
    CUSTOMER_NOT_ENABLED(24),
    /**
     * <pre>
     * The developer must sign the terms of service. They can be found here:
     * ads.google.com/aw/apicenter
     * </pre>
     *
     * <code>MISSING_TOS = 9;</code>
     */
    MISSING_TOS(9),
    /**
     * <pre>
     * The developer token is not approved. Non-approved developer tokens can
     * only be used with test accounts.
     * </pre>
     *
     * <code>DEVELOPER_TOKEN_NOT_APPROVED = 10;</code>
     */
    DEVELOPER_TOKEN_NOT_APPROVED(10),
    /**
     * <pre>
     * The login customer specified does not have access to the account
     * specified, so the request is invalid.
     * </pre>
     *
     * <code>INVALID_LOGIN_CUSTOMER_ID_SERVING_CUSTOMER_ID_COMBINATION = 11;</code>
     */
    INVALID_LOGIN_CUSTOMER_ID_SERVING_CUSTOMER_ID_COMBINATION(11),
    /**
     * <pre>
     * The developer specified does not have access to the service.
     * </pre>
     *
     * <code>SERVICE_ACCESS_DENIED = 12;</code>
     */
    SERVICE_ACCESS_DENIED(12),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * User doesn't have permission to access customer. Note: If you're
     * accessing a client customer, the manager's customer ID must be set in the
     * `login-customer-id` header. Learn more at
     * https://developers.google.com/google-ads/api/docs/concepts/call-structure#cid
     * </pre>
     *
     * <code>USER_PERMISSION_DENIED = 2;</code>
     */
    public static final int USER_PERMISSION_DENIED_VALUE = 2;
    /**
     * <pre>
     * The developer token is not whitelisted.
     * </pre>
     *
     * <code>DEVELOPER_TOKEN_NOT_WHITELISTED = 3;</code>
     */
    public static final int DEVELOPER_TOKEN_NOT_WHITELISTED_VALUE = 3;
    /**
     * <pre>
     * The developer token is not allowed with the project sent in the request.
     * </pre>
     *
     * <code>DEVELOPER_TOKEN_PROHIBITED = 4;</code>
     */
    public static final int DEVELOPER_TOKEN_PROHIBITED_VALUE = 4;
    /**
     * <pre>
     * The Google Cloud project sent in the request does not have permission to
     * access the api.
     * </pre>
     *
     * <code>PROJECT_DISABLED = 5;</code>
     */
    public static final int PROJECT_DISABLED_VALUE = 5;
    /**
     * <pre>
     * Authorization of the client failed.
     * </pre>
     *
     * <code>AUTHORIZATION_ERROR = 6;</code>
     */
    public static final int AUTHORIZATION_ERROR_VALUE = 6;
    /**
     * <pre>
     * The user does not have permission to perform this action
     * (e.g., ADD, UPDATE, REMOVE) on the resource or call a method.
     * </pre>
     *
     * <code>ACTION_NOT_PERMITTED = 7;</code>
     */
    public static final int ACTION_NOT_PERMITTED_VALUE = 7;
    /**
     * <pre>
     * Signup not complete.
     * </pre>
     *
     * <code>INCOMPLETE_SIGNUP = 8;</code>
     */
    public static final int INCOMPLETE_SIGNUP_VALUE = 8;
    /**
     * <pre>
     * The customer can't be used because it isn't enabled.
     * </pre>
     *
     * <code>CUSTOMER_NOT_ENABLED = 24;</code>
     */
    public static final int CUSTOMER_NOT_ENABLED_VALUE = 24;
    /**
     * <pre>
     * The developer must sign the terms of service. They can be found here:
     * ads.google.com/aw/apicenter
     * </pre>
     *
     * <code>MISSING_TOS = 9;</code>
     */
    public static final int MISSING_TOS_VALUE = 9;
    /**
     * <pre>
     * The developer token is not approved. Non-approved developer tokens can
     * only be used with test accounts.
     * </pre>
     *
     * <code>DEVELOPER_TOKEN_NOT_APPROVED = 10;</code>
     */
    public static final int DEVELOPER_TOKEN_NOT_APPROVED_VALUE = 10;
    /**
     * <pre>
     * The login customer specified does not have access to the account
     * specified, so the request is invalid.
     * </pre>
     *
     * <code>INVALID_LOGIN_CUSTOMER_ID_SERVING_CUSTOMER_ID_COMBINATION = 11;</code>
     */
    public static final int INVALID_LOGIN_CUSTOMER_ID_SERVING_CUSTOMER_ID_COMBINATION_VALUE = 11;
    /**
     * <pre>
     * The developer specified does not have access to the service.
     * </pre>
     *
     * <code>SERVICE_ACCESS_DENIED = 12;</code>
     */
    public static final int SERVICE_ACCESS_DENIED_VALUE = 12;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AuthorizationError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AuthorizationError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return USER_PERMISSION_DENIED;
        case 3: return DEVELOPER_TOKEN_NOT_WHITELISTED;
        case 4: return DEVELOPER_TOKEN_PROHIBITED;
        case 5: return PROJECT_DISABLED;
        case 6: return AUTHORIZATION_ERROR;
        case 7: return ACTION_NOT_PERMITTED;
        case 8: return INCOMPLETE_SIGNUP;
        case 24: return CUSTOMER_NOT_ENABLED;
        case 9: return MISSING_TOS;
        case 10: return DEVELOPER_TOKEN_NOT_APPROVED;
        case 11: return INVALID_LOGIN_CUSTOMER_ID_SERVING_CUSTOMER_ID_COMBINATION;
        case 12: return SERVICE_ACCESS_DENIED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AuthorizationError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AuthorizationError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AuthorizationError>() {
            public AuthorizationError findValueByNumber(int number) {
              return AuthorizationError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.errors.AuthorizationErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AuthorizationError[] VALUES = values();

    public static AuthorizationError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AuthorizationError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v4.errors.AuthorizationErrorEnum.AuthorizationError)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v4.errors.AuthorizationErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.errors.AuthorizationErrorEnum other = (com.google.ads.googleads.v4.errors.AuthorizationErrorEnum) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.errors.AuthorizationErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.errors.AuthorizationErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.errors.AuthorizationErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.errors.AuthorizationErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.errors.AuthorizationErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.errors.AuthorizationErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.errors.AuthorizationErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.errors.AuthorizationErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.errors.AuthorizationErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.errors.AuthorizationErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.errors.AuthorizationErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.errors.AuthorizationErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.errors.AuthorizationErrorEnum prototype) {
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
   * Container for enum describing possible authorization errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.errors.AuthorizationErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.errors.AuthorizationErrorEnum)
      com.google.ads.googleads.v4.errors.AuthorizationErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.errors.AuthorizationErrorProto.internal_static_google_ads_googleads_v4_errors_AuthorizationErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.errors.AuthorizationErrorProto.internal_static_google_ads_googleads_v4_errors_AuthorizationErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.errors.AuthorizationErrorEnum.class, com.google.ads.googleads.v4.errors.AuthorizationErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.errors.AuthorizationErrorEnum.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.errors.AuthorizationErrorProto.internal_static_google_ads_googleads_v4_errors_AuthorizationErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.errors.AuthorizationErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.errors.AuthorizationErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.errors.AuthorizationErrorEnum build() {
      com.google.ads.googleads.v4.errors.AuthorizationErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.errors.AuthorizationErrorEnum buildPartial() {
      com.google.ads.googleads.v4.errors.AuthorizationErrorEnum result = new com.google.ads.googleads.v4.errors.AuthorizationErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v4.errors.AuthorizationErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v4.errors.AuthorizationErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.errors.AuthorizationErrorEnum other) {
      if (other == com.google.ads.googleads.v4.errors.AuthorizationErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v4.errors.AuthorizationErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.errors.AuthorizationErrorEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.errors.AuthorizationErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.errors.AuthorizationErrorEnum)
  private static final com.google.ads.googleads.v4.errors.AuthorizationErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.errors.AuthorizationErrorEnum();
  }

  public static com.google.ads.googleads.v4.errors.AuthorizationErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthorizationErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AuthorizationErrorEnum>() {
    @java.lang.Override
    public AuthorizationErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AuthorizationErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuthorizationErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthorizationErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.errors.AuthorizationErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

