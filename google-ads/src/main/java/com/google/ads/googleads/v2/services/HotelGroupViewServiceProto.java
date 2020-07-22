// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/hotel_group_view_service.proto

package com.google.ads.googleads.v2.services;

public final class HotelGroupViewServiceProto {
  private HotelGroupViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetHotelGroupViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetHotelGroupViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v2/services/hotel" +
      "_group_view_service.proto\022 google.ads.go" +
      "ogleads.v2.services\0328google/ads/googlead" +
      "s/v2/resources/hotel_group_view.proto\032\034g" +
      "oogle/api/annotations.proto\032\027google/api/" +
      "client.proto\032\037google/api/field_behavior." +
      "proto\032\031google/api/resource.proto\"b\n\030GetH" +
      "otelGroupViewRequest\022F\n\rresource_name\030\001 " +
      "\001(\tB/\340A\002\372A)\n\'googleads.googleapis.com/Ho" +
      "telGroupView2\204\002\n\025HotelGroupViewService\022\315" +
      "\001\n\021GetHotelGroupView\022:.google.ads.google" +
      "ads.v2.services.GetHotelGroupViewRequest" +
      "\0321.google.ads.googleads.v2.resources.Hot" +
      "elGroupView\"I\202\323\344\223\0023\0221/v2/{resource_name=" +
      "customers/*/hotelGroupViews/*}\332A\rresourc" +
      "e_name\032\033\312A\030googleads.googleapis.comB\201\002\n$" +
      "com.google.ads.googleads.v2.servicesB\032Ho" +
      "telGroupViewServiceProtoP\001ZHgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v2/services;services\242\002\003GAA\252\002 Google.Ads." +
      "GoogleAds.V2.Services\312\002 Google\\Ads\\Googl" +
      "eAds\\V2\\Services\352\002$Google::Ads::GoogleAd" +
      "s::V2::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.resources.HotelGroupViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_services_GetHotelGroupViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetHotelGroupViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetHotelGroupViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.resources.HotelGroupViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
