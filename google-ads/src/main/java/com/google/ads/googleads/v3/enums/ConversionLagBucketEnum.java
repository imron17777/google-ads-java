// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/enums/conversion_lag_bucket.proto

package com.google.ads.googleads.v3.enums;

/**
 * <pre>
 * Container for enum representing the number of days between impression and
 * conversion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.enums.ConversionLagBucketEnum}
 */
public final class ConversionLagBucketEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.enums.ConversionLagBucketEnum)
    ConversionLagBucketEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversionLagBucketEnum.newBuilder() to construct.
  private ConversionLagBucketEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversionLagBucketEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConversionLagBucketEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConversionLagBucketEnum(
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
    return com.google.ads.googleads.v3.enums.ConversionLagBucketProto.internal_static_google_ads_googleads_v3_enums_ConversionLagBucketEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.enums.ConversionLagBucketProto.internal_static_google_ads_googleads_v3_enums_ConversionLagBucketEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.enums.ConversionLagBucketEnum.class, com.google.ads.googleads.v3.enums.ConversionLagBucketEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum representing the number of days between impression and conversion.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v3.enums.ConversionLagBucketEnum.ConversionLagBucket}
   */
  public enum ConversionLagBucket
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Conversion lag bucket from 0 to 1 day. 0 day is included, 1 day is not.
     * </pre>
     *
     * <code>LESS_THAN_ONE_DAY = 2;</code>
     */
    LESS_THAN_ONE_DAY(2),
    /**
     * <pre>
     * Conversion lag bucket from 1 to 2 days. 1 day is included, 2 days is not.
     * </pre>
     *
     * <code>ONE_TO_TWO_DAYS = 3;</code>
     */
    ONE_TO_TWO_DAYS(3),
    /**
     * <pre>
     * Conversion lag bucket from 2 to 3 days. 2 days is included,
     * 3 days is not.
     * </pre>
     *
     * <code>TWO_TO_THREE_DAYS = 4;</code>
     */
    TWO_TO_THREE_DAYS(4),
    /**
     * <pre>
     * Conversion lag bucket from 3 to 4 days. 3 days is included,
     * 4 days is not.
     * </pre>
     *
     * <code>THREE_TO_FOUR_DAYS = 5;</code>
     */
    THREE_TO_FOUR_DAYS(5),
    /**
     * <pre>
     * Conversion lag bucket from 4 to 5 days. 4 days is included,
     * 5 days is not.
     * </pre>
     *
     * <code>FOUR_TO_FIVE_DAYS = 6;</code>
     */
    FOUR_TO_FIVE_DAYS(6),
    /**
     * <pre>
     * Conversion lag bucket from 5 to 6 days. 5 days is included,
     * 6 days is not.
     * </pre>
     *
     * <code>FIVE_TO_SIX_DAYS = 7;</code>
     */
    FIVE_TO_SIX_DAYS(7),
    /**
     * <pre>
     * Conversion lag bucket from 6 to 7 days. 6 days is included,
     * 7 days is not.
     * </pre>
     *
     * <code>SIX_TO_SEVEN_DAYS = 8;</code>
     */
    SIX_TO_SEVEN_DAYS(8),
    /**
     * <pre>
     * Conversion lag bucket from 7 to 8 days. 7 days is included,
     * 8 days is not.
     * </pre>
     *
     * <code>SEVEN_TO_EIGHT_DAYS = 9;</code>
     */
    SEVEN_TO_EIGHT_DAYS(9),
    /**
     * <pre>
     * Conversion lag bucket from 8 to 9 days. 8 days is included,
     * 9 days is not.
     * </pre>
     *
     * <code>EIGHT_TO_NINE_DAYS = 10;</code>
     */
    EIGHT_TO_NINE_DAYS(10),
    /**
     * <pre>
     * Conversion lag bucket from 9 to 10 days. 9 days is included,
     * 10 days is not.
     * </pre>
     *
     * <code>NINE_TO_TEN_DAYS = 11;</code>
     */
    NINE_TO_TEN_DAYS(11),
    /**
     * <pre>
     * Conversion lag bucket from 10 to 11 days. 10 days is included,
     * 11 days is not.
     * </pre>
     *
     * <code>TEN_TO_ELEVEN_DAYS = 12;</code>
     */
    TEN_TO_ELEVEN_DAYS(12),
    /**
     * <pre>
     * Conversion lag bucket from 11 to 12 days. 11 days is included,
     * 12 days is not.
     * </pre>
     *
     * <code>ELEVEN_TO_TWELVE_DAYS = 13;</code>
     */
    ELEVEN_TO_TWELVE_DAYS(13),
    /**
     * <pre>
     * Conversion lag bucket from 12 to 13 days. 12 days is included,
     * 13 days is not.
     * </pre>
     *
     * <code>TWELVE_TO_THIRTEEN_DAYS = 14;</code>
     */
    TWELVE_TO_THIRTEEN_DAYS(14),
    /**
     * <pre>
     * Conversion lag bucket from 13 to 14 days. 13 days is included,
     * 14 days is not.
     * </pre>
     *
     * <code>THIRTEEN_TO_FOURTEEN_DAYS = 15;</code>
     */
    THIRTEEN_TO_FOURTEEN_DAYS(15),
    /**
     * <pre>
     * Conversion lag bucket from 14 to 21 days. 14 days is included,
     * 21 days is not.
     * </pre>
     *
     * <code>FOURTEEN_TO_TWENTY_ONE_DAYS = 16;</code>
     */
    FOURTEEN_TO_TWENTY_ONE_DAYS(16),
    /**
     * <pre>
     * Conversion lag bucket from 21 to 30 days. 21 days is included,
     * 30 days is not.
     * </pre>
     *
     * <code>TWENTY_ONE_TO_THIRTY_DAYS = 17;</code>
     */
    TWENTY_ONE_TO_THIRTY_DAYS(17),
    /**
     * <pre>
     * Conversion lag bucket from 30 to 45 days. 30 days is included,
     * 45 days is not.
     * </pre>
     *
     * <code>THIRTY_TO_FORTY_FIVE_DAYS = 18;</code>
     */
    THIRTY_TO_FORTY_FIVE_DAYS(18),
    /**
     * <pre>
     * Conversion lag bucket from 45 to 60 days. 45 days is included,
     * 60 days is not.
     * </pre>
     *
     * <code>FORTY_FIVE_TO_SIXTY_DAYS = 19;</code>
     */
    FORTY_FIVE_TO_SIXTY_DAYS(19),
    /**
     * <pre>
     * Conversion lag bucket from 60 to 90 days. 60 days is included,
     * 90 days is not.
     * </pre>
     *
     * <code>SIXTY_TO_NINETY_DAYS = 20;</code>
     */
    SIXTY_TO_NINETY_DAYS(20),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Conversion lag bucket from 0 to 1 day. 0 day is included, 1 day is not.
     * </pre>
     *
     * <code>LESS_THAN_ONE_DAY = 2;</code>
     */
    public static final int LESS_THAN_ONE_DAY_VALUE = 2;
    /**
     * <pre>
     * Conversion lag bucket from 1 to 2 days. 1 day is included, 2 days is not.
     * </pre>
     *
     * <code>ONE_TO_TWO_DAYS = 3;</code>
     */
    public static final int ONE_TO_TWO_DAYS_VALUE = 3;
    /**
     * <pre>
     * Conversion lag bucket from 2 to 3 days. 2 days is included,
     * 3 days is not.
     * </pre>
     *
     * <code>TWO_TO_THREE_DAYS = 4;</code>
     */
    public static final int TWO_TO_THREE_DAYS_VALUE = 4;
    /**
     * <pre>
     * Conversion lag bucket from 3 to 4 days. 3 days is included,
     * 4 days is not.
     * </pre>
     *
     * <code>THREE_TO_FOUR_DAYS = 5;</code>
     */
    public static final int THREE_TO_FOUR_DAYS_VALUE = 5;
    /**
     * <pre>
     * Conversion lag bucket from 4 to 5 days. 4 days is included,
     * 5 days is not.
     * </pre>
     *
     * <code>FOUR_TO_FIVE_DAYS = 6;</code>
     */
    public static final int FOUR_TO_FIVE_DAYS_VALUE = 6;
    /**
     * <pre>
     * Conversion lag bucket from 5 to 6 days. 5 days is included,
     * 6 days is not.
     * </pre>
     *
     * <code>FIVE_TO_SIX_DAYS = 7;</code>
     */
    public static final int FIVE_TO_SIX_DAYS_VALUE = 7;
    /**
     * <pre>
     * Conversion lag bucket from 6 to 7 days. 6 days is included,
     * 7 days is not.
     * </pre>
     *
     * <code>SIX_TO_SEVEN_DAYS = 8;</code>
     */
    public static final int SIX_TO_SEVEN_DAYS_VALUE = 8;
    /**
     * <pre>
     * Conversion lag bucket from 7 to 8 days. 7 days is included,
     * 8 days is not.
     * </pre>
     *
     * <code>SEVEN_TO_EIGHT_DAYS = 9;</code>
     */
    public static final int SEVEN_TO_EIGHT_DAYS_VALUE = 9;
    /**
     * <pre>
     * Conversion lag bucket from 8 to 9 days. 8 days is included,
     * 9 days is not.
     * </pre>
     *
     * <code>EIGHT_TO_NINE_DAYS = 10;</code>
     */
    public static final int EIGHT_TO_NINE_DAYS_VALUE = 10;
    /**
     * <pre>
     * Conversion lag bucket from 9 to 10 days. 9 days is included,
     * 10 days is not.
     * </pre>
     *
     * <code>NINE_TO_TEN_DAYS = 11;</code>
     */
    public static final int NINE_TO_TEN_DAYS_VALUE = 11;
    /**
     * <pre>
     * Conversion lag bucket from 10 to 11 days. 10 days is included,
     * 11 days is not.
     * </pre>
     *
     * <code>TEN_TO_ELEVEN_DAYS = 12;</code>
     */
    public static final int TEN_TO_ELEVEN_DAYS_VALUE = 12;
    /**
     * <pre>
     * Conversion lag bucket from 11 to 12 days. 11 days is included,
     * 12 days is not.
     * </pre>
     *
     * <code>ELEVEN_TO_TWELVE_DAYS = 13;</code>
     */
    public static final int ELEVEN_TO_TWELVE_DAYS_VALUE = 13;
    /**
     * <pre>
     * Conversion lag bucket from 12 to 13 days. 12 days is included,
     * 13 days is not.
     * </pre>
     *
     * <code>TWELVE_TO_THIRTEEN_DAYS = 14;</code>
     */
    public static final int TWELVE_TO_THIRTEEN_DAYS_VALUE = 14;
    /**
     * <pre>
     * Conversion lag bucket from 13 to 14 days. 13 days is included,
     * 14 days is not.
     * </pre>
     *
     * <code>THIRTEEN_TO_FOURTEEN_DAYS = 15;</code>
     */
    public static final int THIRTEEN_TO_FOURTEEN_DAYS_VALUE = 15;
    /**
     * <pre>
     * Conversion lag bucket from 14 to 21 days. 14 days is included,
     * 21 days is not.
     * </pre>
     *
     * <code>FOURTEEN_TO_TWENTY_ONE_DAYS = 16;</code>
     */
    public static final int FOURTEEN_TO_TWENTY_ONE_DAYS_VALUE = 16;
    /**
     * <pre>
     * Conversion lag bucket from 21 to 30 days. 21 days is included,
     * 30 days is not.
     * </pre>
     *
     * <code>TWENTY_ONE_TO_THIRTY_DAYS = 17;</code>
     */
    public static final int TWENTY_ONE_TO_THIRTY_DAYS_VALUE = 17;
    /**
     * <pre>
     * Conversion lag bucket from 30 to 45 days. 30 days is included,
     * 45 days is not.
     * </pre>
     *
     * <code>THIRTY_TO_FORTY_FIVE_DAYS = 18;</code>
     */
    public static final int THIRTY_TO_FORTY_FIVE_DAYS_VALUE = 18;
    /**
     * <pre>
     * Conversion lag bucket from 45 to 60 days. 45 days is included,
     * 60 days is not.
     * </pre>
     *
     * <code>FORTY_FIVE_TO_SIXTY_DAYS = 19;</code>
     */
    public static final int FORTY_FIVE_TO_SIXTY_DAYS_VALUE = 19;
    /**
     * <pre>
     * Conversion lag bucket from 60 to 90 days. 60 days is included,
     * 90 days is not.
     * </pre>
     *
     * <code>SIXTY_TO_NINETY_DAYS = 20;</code>
     */
    public static final int SIXTY_TO_NINETY_DAYS_VALUE = 20;


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
    public static ConversionLagBucket valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConversionLagBucket forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return LESS_THAN_ONE_DAY;
        case 3: return ONE_TO_TWO_DAYS;
        case 4: return TWO_TO_THREE_DAYS;
        case 5: return THREE_TO_FOUR_DAYS;
        case 6: return FOUR_TO_FIVE_DAYS;
        case 7: return FIVE_TO_SIX_DAYS;
        case 8: return SIX_TO_SEVEN_DAYS;
        case 9: return SEVEN_TO_EIGHT_DAYS;
        case 10: return EIGHT_TO_NINE_DAYS;
        case 11: return NINE_TO_TEN_DAYS;
        case 12: return TEN_TO_ELEVEN_DAYS;
        case 13: return ELEVEN_TO_TWELVE_DAYS;
        case 14: return TWELVE_TO_THIRTEEN_DAYS;
        case 15: return THIRTEEN_TO_FOURTEEN_DAYS;
        case 16: return FOURTEEN_TO_TWENTY_ONE_DAYS;
        case 17: return TWENTY_ONE_TO_THIRTY_DAYS;
        case 18: return THIRTY_TO_FORTY_FIVE_DAYS;
        case 19: return FORTY_FIVE_TO_SIXTY_DAYS;
        case 20: return SIXTY_TO_NINETY_DAYS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConversionLagBucket>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConversionLagBucket> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConversionLagBucket>() {
            public ConversionLagBucket findValueByNumber(int number) {
              return ConversionLagBucket.forNumber(number);
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
      return com.google.ads.googleads.v3.enums.ConversionLagBucketEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConversionLagBucket[] VALUES = values();

    public static ConversionLagBucket valueOf(
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

    private ConversionLagBucket(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v3.enums.ConversionLagBucketEnum.ConversionLagBucket)
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
    if (!(obj instanceof com.google.ads.googleads.v3.enums.ConversionLagBucketEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.enums.ConversionLagBucketEnum other = (com.google.ads.googleads.v3.enums.ConversionLagBucketEnum) obj;

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

  public static com.google.ads.googleads.v3.enums.ConversionLagBucketEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.ConversionLagBucketEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ConversionLagBucketEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.ConversionLagBucketEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ConversionLagBucketEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.enums.ConversionLagBucketEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ConversionLagBucketEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.ConversionLagBucketEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ConversionLagBucketEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.ConversionLagBucketEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.enums.ConversionLagBucketEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.enums.ConversionLagBucketEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.enums.ConversionLagBucketEnum prototype) {
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
   * Container for enum representing the number of days between impression and
   * conversion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.enums.ConversionLagBucketEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.enums.ConversionLagBucketEnum)
      com.google.ads.googleads.v3.enums.ConversionLagBucketEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.enums.ConversionLagBucketProto.internal_static_google_ads_googleads_v3_enums_ConversionLagBucketEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.enums.ConversionLagBucketProto.internal_static_google_ads_googleads_v3_enums_ConversionLagBucketEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.enums.ConversionLagBucketEnum.class, com.google.ads.googleads.v3.enums.ConversionLagBucketEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.enums.ConversionLagBucketEnum.newBuilder()
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
      return com.google.ads.googleads.v3.enums.ConversionLagBucketProto.internal_static_google_ads_googleads_v3_enums_ConversionLagBucketEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.ConversionLagBucketEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.enums.ConversionLagBucketEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.ConversionLagBucketEnum build() {
      com.google.ads.googleads.v3.enums.ConversionLagBucketEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.enums.ConversionLagBucketEnum buildPartial() {
      com.google.ads.googleads.v3.enums.ConversionLagBucketEnum result = new com.google.ads.googleads.v3.enums.ConversionLagBucketEnum(this);
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
      if (other instanceof com.google.ads.googleads.v3.enums.ConversionLagBucketEnum) {
        return mergeFrom((com.google.ads.googleads.v3.enums.ConversionLagBucketEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.enums.ConversionLagBucketEnum other) {
      if (other == com.google.ads.googleads.v3.enums.ConversionLagBucketEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v3.enums.ConversionLagBucketEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.enums.ConversionLagBucketEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.enums.ConversionLagBucketEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.enums.ConversionLagBucketEnum)
  private static final com.google.ads.googleads.v3.enums.ConversionLagBucketEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.enums.ConversionLagBucketEnum();
  }

  public static com.google.ads.googleads.v3.enums.ConversionLagBucketEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversionLagBucketEnum>
      PARSER = new com.google.protobuf.AbstractParser<ConversionLagBucketEnum>() {
    @java.lang.Override
    public ConversionLagBucketEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConversionLagBucketEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConversionLagBucketEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversionLagBucketEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.enums.ConversionLagBucketEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

