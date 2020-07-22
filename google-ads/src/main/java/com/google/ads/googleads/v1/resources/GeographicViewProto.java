// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/geographic_view.proto

package com.google.ads.googleads.v1.resources;

public final class GeographicViewProto {
  private GeographicViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_GeographicView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_GeographicView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v1/resources/geog" +
      "raphic_view.proto\022!google.ads.googleads." +
      "v1.resources\0326google/ads/googleads/v1/en" +
      "ums/geo_targeting_type.proto\032\037google/api" +
      "/field_behavior.proto\032\031google/api/resour" +
      "ce.proto\032\036google/protobuf/wrappers.proto" +
      "\032\034google/api/annotations.proto\"\227\003\n\016Geogr" +
      "aphicView\022F\n\rresource_name\030\001 \001(\tB/\340A\003\372A)" +
      "\n\'googleads.googleapis.com/GeographicVie" +
      "w\022u\n\033country_geo_target_constant\030\002 \001(\0132\034" +
      ".google.protobuf.StringValueB2\340A\003\372A,\n*go" +
      "ogleads.googleapis.com/GeoTargetConstant" +
      "\022`\n\rlocation_type\030\003 \001(\0162D.google.ads.goo" +
      "gleads.v1.enums.GeoTargetingTypeEnum.Geo" +
      "TargetingTypeB\003\340A\003:d\352Aa\n\'googleads.googl" +
      "eapis.com/GeographicView\0226customers/{cus" +
      "tomer}/geographicViews/{geographic_view}" +
      "B\200\002\n%com.google.ads.googleads.v1.resourc" +
      "esB\023GeographicViewProtoP\001ZJgoogle.golang" +
      ".org/genproto/googleapis/ads/googleads/v" +
      "1/resources;resources\242\002\003GAA\252\002!Google.Ads" +
      ".GoogleAds.V1.Resources\312\002!Google\\Ads\\Goo" +
      "gleAds\\V1\\Resources\352\002%Google::Ads::Googl" +
      "eAds::V1::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.enums.GeoTargetingTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_resources_GeographicView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_GeographicView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_GeographicView_descriptor,
        new java.lang.String[] { "ResourceName", "CountryGeoTargetConstant", "LocationType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.enums.GeoTargetingTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
