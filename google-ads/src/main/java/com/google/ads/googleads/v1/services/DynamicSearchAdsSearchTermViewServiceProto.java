// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/dynamic_search_ads_search_term_view_service.proto

package com.google.ads.googleads.v1.services;

public final class DynamicSearchAdsSearchTermViewServiceProto {
  private DynamicSearchAdsSearchTermViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetDynamicSearchAdsSearchTermViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetDynamicSearchAdsSearchTermViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nRgoogle/ads/googleads/v1/services/dynam" +
      "ic_search_ads_search_term_view_service.p" +
      "roto\022 google.ads.googleads.v1.services\032K" +
      "google/ads/googleads/v1/resources/dynami" +
      "c_search_ads_search_term_view.proto\032\034goo" +
      "gle/api/annotations.proto\032\027google/api/cl" +
      "ient.proto\032\037google/api/field_behavior.pr" +
      "oto\032\031google/api/resource.proto\"\202\001\n(GetDy" +
      "namicSearchAdsSearchTermViewRequest\022V\n\rr" +
      "esource_name\030\001 \001(\tB?\340A\002\372A9\n7googleads.go" +
      "ogleapis.com/DynamicSearchAdsSearchTermV" +
      "iew2\324\002\n%DynamicSearchAdsSearchTermViewSe" +
      "rvice\022\215\002\n!GetDynamicSearchAdsSearchTermV" +
      "iew\022J.google.ads.googleads.v1.services.G" +
      "etDynamicSearchAdsSearchTermViewRequest\032" +
      "A.google.ads.googleads.v1.resources.Dyna" +
      "micSearchAdsSearchTermView\"Y\202\323\344\223\002C\022A/v1/" +
      "{resource_name=customers/*/dynamicSearch" +
      "AdsSearchTermViews/*}\332A\rresource_name\032\033\312" +
      "A\030googleads.googleapis.comB\221\002\n$com.googl" +
      "e.ads.googleads.v1.servicesB*DynamicSear" +
      "chAdsSearchTermViewServiceProtoP\001ZHgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v1/services;services\242\002\003GAA\252\002 Goog" +
      "le.Ads.GoogleAds.V1.Services\312\002 Google\\Ad" +
      "s\\GoogleAds\\V1\\Services\352\002$Google::Ads::G" +
      "oogleAds::V1::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_services_GetDynamicSearchAdsSearchTermViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetDynamicSearchAdsSearchTermViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetDynamicSearchAdsSearchTermViewRequest_descriptor,
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
    com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
