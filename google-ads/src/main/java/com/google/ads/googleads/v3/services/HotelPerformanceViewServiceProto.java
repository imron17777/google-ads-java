// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/hotel_performance_view_service.proto

package com.google.ads.googleads.v3.services;

public final class HotelPerformanceViewServiceProto {
  private HotelPerformanceViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetHotelPerformanceViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetHotelPerformanceViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v3/services/hotel" +
      "_performance_view_service.proto\022 google." +
      "ads.googleads.v3.services\032>google/ads/go" +
      "ogleads/v3/resources/hotel_performance_v" +
      "iew.proto\032\034google/api/annotations.proto\032" +
      "\027google/api/client.proto\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\"n\n\036GetHotelPerformanceViewRequest\022L" +
      "\n\rresource_name\030\001 \001(\tB5\340A\002\372A/\n-googleads" +
      ".googleapis.com/HotelPerformanceView2\237\002\n" +
      "\033HotelPerformanceViewService\022\342\001\n\027GetHote" +
      "lPerformanceView\022@.google.ads.googleads." +
      "v3.services.GetHotelPerformanceViewReque" +
      "st\0327.google.ads.googleads.v3.resources.H" +
      "otelPerformanceView\"L\202\323\344\223\0026\0224/v3/{resour" +
      "ce_name=customers/*/hotelPerformanceView" +
      "}\332A\rresource_name\032\033\312A\030googleads.googleap" +
      "is.comB\207\002\n$com.google.ads.googleads.v3.s" +
      "ervicesB HotelPerformanceViewServiceProt" +
      "oP\001ZHgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v3/services;services\242\002\003" +
      "GAA\252\002 Google.Ads.GoogleAds.V3.Services\312\002" +
      " Google\\Ads\\GoogleAds\\V3\\Services\352\002$Goog" +
      "le::Ads::GoogleAds::V3::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.resources.HotelPerformanceViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v3_services_GetHotelPerformanceViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetHotelPerformanceViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetHotelPerformanceViewRequest_descriptor,
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
    com.google.ads.googleads.v3.resources.HotelPerformanceViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
