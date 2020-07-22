// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/google_ads_field.proto

package com.google.ads.googleads.v1.resources;

public final class GoogleAdsFieldProto {
  private GoogleAdsFieldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_GoogleAdsField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_GoogleAdsField_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v1/resources/goog" +
      "le_ads_field.proto\022!google.ads.googleads" +
      ".v1.resources\032=google/ads/googleads/v1/e" +
      "nums/google_ads_field_category.proto\032>go" +
      "ogle/ads/googleads/v1/enums/google_ads_f" +
      "ield_data_type.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\032\036google/protobuf/wrappers.proto\032\034google" +
      "/api/annotations.proto\"\323\007\n\016GoogleAdsFiel" +
      "d\022F\n\rresource_name\030\001 \001(\tB/\340A\003\372A)\n\'google" +
      "ads.googleapis.com/GoogleAdsField\022/\n\004nam" +
      "e\030\002 \001(\0132\034.google.protobuf.StringValueB\003\340" +
      "A\003\022g\n\010category\030\003 \001(\0162P.google.ads.google" +
      "ads.v1.enums.GoogleAdsFieldCategoryEnum." +
      "GoogleAdsFieldCategoryB\003\340A\003\0223\n\nselectabl" +
      "e\030\004 \001(\0132\032.google.protobuf.BoolValueB\003\340A\003" +
      "\0223\n\nfilterable\030\005 \001(\0132\032.google.protobuf.B" +
      "oolValueB\003\340A\003\0221\n\010sortable\030\006 \001(\0132\032.google" +
      ".protobuf.BoolValueB\003\340A\003\022:\n\017selectable_w" +
      "ith\030\007 \003(\0132\034.google.protobuf.StringValueB" +
      "\003\340A\003\022>\n\023attribute_resources\030\010 \003(\0132\034.goog" +
      "le.protobuf.StringValueB\003\340A\003\0222\n\007metrics\030" +
      "\t \003(\0132\034.google.protobuf.StringValueB\003\340A\003" +
      "\0223\n\010segments\030\n \003(\0132\034.google.protobuf.Str" +
      "ingValueB\003\340A\003\0226\n\013enum_values\030\013 \003(\0132\034.goo" +
      "gle.protobuf.StringValueB\003\340A\003\022h\n\tdata_ty" +
      "pe\030\014 \001(\0162P.google.ads.googleads.v1.enums" +
      ".GoogleAdsFieldDataTypeEnum.GoogleAdsFie" +
      "ldDataTypeB\003\340A\003\0223\n\010type_url\030\r \001(\0132\034.goog" +
      "le.protobuf.StringValueB\003\340A\003\0224\n\013is_repea" +
      "ted\030\016 \001(\0132\032.google.protobuf.BoolValueB\003\340" +
      "A\003:P\352AM\n\'googleads.googleapis.com/Google" +
      "AdsField\022\"googleAdsFields/{google_ads_fi" +
      "eld}B\200\002\n%com.google.ads.googleads.v1.res" +
      "ourcesB\023GoogleAdsFieldProtoP\001ZJgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v1/resources;resources\242\002\003GAA\252\002!Google" +
      ".Ads.GoogleAds.V1.Resources\312\002!Google\\Ads" +
      "\\GoogleAds\\V1\\Resources\352\002%Google::Ads::G" +
      "oogleAds::V1::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.enums.GoogleAdsFieldCategoryProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.GoogleAdsFieldDataTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_resources_GoogleAdsField_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_GoogleAdsField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_GoogleAdsField_descriptor,
        new java.lang.String[] { "ResourceName", "Name", "Category", "Selectable", "Filterable", "Sortable", "SelectableWith", "AttributeResources", "Metrics", "Segments", "EnumValues", "DataType", "TypeUrl", "IsRepeated", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.enums.GoogleAdsFieldCategoryProto.getDescriptor();
    com.google.ads.googleads.v1.enums.GoogleAdsFieldDataTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
