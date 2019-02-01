// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/ad_parameter_service.proto

package com.google.ads.googleads.v0.services;

public final class AdParameterServiceProto {
  private AdParameterServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetAdParameterRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetAdParameterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdParametersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdParametersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_AdParameterOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_AdParameterOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdParametersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdParametersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdParameterResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdParameterResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v0/services/ad_pa" +
      "rameter_service.proto\022 google.ads.google" +
      "ads.v0.services\0324google/ads/googleads/v0" +
      "/resources/ad_parameter.proto\032\034google/ap" +
      "i/annotations.proto\032 google/protobuf/fie" +
      "ld_mask.proto\032\036google/protobuf/wrappers." +
      "proto\032\027google/rpc/status.proto\".\n\025GetAdP" +
      "arameterRequest\022\025\n\rresource_name\030\001 \001(\t\"\254" +
      "\001\n\031MutateAdParametersRequest\022\023\n\013customer" +
      "_id\030\001 \001(\t\022J\n\noperations\030\002 \003(\01326.google.a" +
      "ds.googleads.v0.services.AdParameterOper" +
      "ation\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalida" +
      "te_only\030\004 \001(\010\"\352\001\n\024AdParameterOperation\022/" +
      "\n\013update_mask\030\004 \001(\0132\032.google.protobuf.Fi" +
      "eldMask\022@\n\006create\030\001 \001(\0132..google.ads.goo" +
      "gleads.v0.resources.AdParameterH\000\022@\n\006upd" +
      "ate\030\002 \001(\0132..google.ads.googleads.v0.reso" +
      "urces.AdParameterH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n" +
      "\toperation\"\233\001\n\032MutateAdParametersRespons" +
      "e\0221\n\025partial_failure_error\030\003 \001(\0132\022.googl" +
      "e.rpc.Status\022J\n\007results\030\002 \003(\01329.google.a" +
      "ds.googleads.v0.services.MutateAdParamet" +
      "erResult\"0\n\027MutateAdParameterResult\022\025\n\rr" +
      "esource_name\030\001 \001(\t2\230\003\n\022AdParameterServic" +
      "e\022\261\001\n\016GetAdParameter\0227.google.ads.google" +
      "ads.v0.services.GetAdParameterRequest\032.." +
      "google.ads.googleads.v0.resources.AdPara" +
      "meter\"6\202\323\344\223\0020\022./v0/{resource_name=custom" +
      "ers/*/adParameters/*}\022\315\001\n\022MutateAdParame" +
      "ters\022;.google.ads.googleads.v0.services." +
      "MutateAdParametersRequest\032<.google.ads.g" +
      "oogleads.v0.services.MutateAdParametersR" +
      "esponse\"<\202\323\344\223\0026\"1/v0/customers/{customer" +
      "_id=*}/adParameters:mutate:\001*B\376\001\n$com.go" +
      "ogle.ads.googleads.v0.servicesB\027AdParame" +
      "terServiceProtoP\001ZHgoogle.golang.org/gen" +
      "proto/googleapis/ads/googleads/v0/servic" +
      "es;services\242\002\003GAA\252\002 Google.Ads.GoogleAds" +
      ".V0.Services\312\002 Google\\Ads\\GoogleAds\\V0\\S" +
      "ervices\352\002$Google::Ads::GoogleAds::V0::Se" +
      "rvicesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v0.resources.AdParameterProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetAdParameterRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetAdParameterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetAdParameterRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_MutateAdParametersRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_MutateAdParametersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdParametersRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v0_services_AdParameterOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_AdParameterOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_AdParameterOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v0_services_MutateAdParametersResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_services_MutateAdParametersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdParametersResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v0_services_MutateAdParameterResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_services_MutateAdParameterResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdParameterResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.AdParameterProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}