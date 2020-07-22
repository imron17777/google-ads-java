// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/video.proto

package com.google.ads.googleads.v2.resources;

public final class VideoProto {
  private VideoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_Video_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_Video_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v2/resources/vide" +
      "o.proto\022!google.ads.googleads.v2.resourc" +
      "es\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\032\036google/protobuf/" +
      "wrappers.proto\032\034google/api/annotations.p" +
      "roto\"\343\002\n\005Video\022=\n\rresource_name\030\001 \001(\tB&\340" +
      "A\003\372A \n\036googleads.googleapis.com/Video\022-\n" +
      "\002id\030\002 \001(\0132\034.google.protobuf.StringValueB" +
      "\003\340A\003\0225\n\nchannel_id\030\003 \001(\0132\034.google.protob" +
      "uf.StringValueB\003\340A\003\0229\n\017duration_millis\030\004" +
      " \001(\0132\033.google.protobuf.Int64ValueB\003\340A\003\0220" +
      "\n\005title\030\005 \001(\0132\034.google.protobuf.StringVa" +
      "lueB\003\340A\003:H\352AE\n\036googleads.googleapis.com/" +
      "Video\022#customers/{customer}/videos/{vide" +
      "o}B\367\001\n%com.google.ads.googleads.v2.resou" +
      "rcesB\nVideoProtoP\001ZJgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v2/resou" +
      "rces;resources\242\002\003GAA\252\002!Google.Ads.Google" +
      "Ads.V2.Resources\312\002!Google\\Ads\\GoogleAds\\" +
      "V2\\Resources\352\002%Google::Ads::GoogleAds::V" +
      "2::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_resources_Video_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_Video_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_Video_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "ChannelId", "DurationMillis", "Title", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
