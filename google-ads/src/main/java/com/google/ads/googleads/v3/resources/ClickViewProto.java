// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/click_view.proto

package com.google.ads.googleads.v3.resources;

public final class ClickViewProto {
  private ClickViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_ClickView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_ClickView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v3/resources/clic" +
      "k_view.proto\022!google.ads.googleads.v3.re" +
      "sources\0323google/ads/googleads/v3/common/" +
      "click_location.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\032\036google/protobuf/wrappers.proto\032\034google" +
      "/api/annotations.proto\"\215\004\n\tClickView\022A\n\r" +
      "resource_name\030\001 \001(\tB*\340A\003\372A$\n\"googleads.g" +
      "oogleapis.com/ClickView\0220\n\005gclid\030\002 \001(\0132\034" +
      ".google.protobuf.StringValueB\003\340A\003\022L\n\020are" +
      "a_of_interest\030\003 \001(\0132-.google.ads.googlea" +
      "ds.v3.common.ClickLocationB\003\340A\003\022P\n\024locat" +
      "ion_of_presence\030\004 \001(\0132-.google.ads.googl" +
      "eads.v3.common.ClickLocationB\003\340A\003\0225\n\013pag" +
      "e_number\030\005 \001(\0132\033.google.protobuf.Int64Va" +
      "lueB\003\340A\003\022]\n\013ad_group_ad\030\007 \001(\0132\034.google.p" +
      "rotobuf.StringValueB*\340A\003\372A$\n\"googleads.g" +
      "oogleapis.com/AdGroupAd:U\352AR\n\"googleads." +
      "googleapis.com/ClickView\022,customers/{cus" +
      "tomer}/clickViews/{click_view}B\373\001\n%com.g" +
      "oogle.ads.googleads.v3.resourcesB\016ClickV" +
      "iewProtoP\001ZJgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v3/resources;res" +
      "ources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V3.R" +
      "esources\312\002!Google\\Ads\\GoogleAds\\V3\\Resou" +
      "rces\352\002%Google::Ads::GoogleAds::V3::Resou" +
      "rcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.common.ClickLocationProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v3_resources_ClickView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_ClickView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_ClickView_descriptor,
        new java.lang.String[] { "ResourceName", "Gclid", "AreaOfInterest", "LocationOfPresence", "PageNumber", "AdGroupAd", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.common.ClickLocationProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
