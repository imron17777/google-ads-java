// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/topic_constant_service.proto

package com.google.ads.googleads.v2.services;

public final class TopicConstantServiceProto {
  private TopicConstantServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetTopicConstantRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetTopicConstantRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v2/services/topic" +
      "_constant_service.proto\022 google.ads.goog" +
      "leads.v2.services\0326google/ads/googleads/" +
      "v2/resources/topic_constant.proto\032\034googl" +
      "e/api/annotations.proto\032\027google/api/clie" +
      "nt.proto\032\037google/api/field_behavior.prot" +
      "o\032\031google/api/resource.proto\"`\n\027GetTopic" +
      "ConstantRequest\022E\n\rresource_name\030\001 \001(\tB." +
      "\340A\002\372A(\n&googleads.googleapis.com/TopicCo" +
      "nstant2\363\001\n\024TopicConstantService\022\275\001\n\020GetT" +
      "opicConstant\0229.google.ads.googleads.v2.s" +
      "ervices.GetTopicConstantRequest\0320.google" +
      ".ads.googleads.v2.resources.TopicConstan" +
      "t\"<\202\323\344\223\002&\022$/v2/{resource_name=topicConst" +
      "ants/*}\332A\rresource_name\032\033\312A\030googleads.go" +
      "ogleapis.comB\200\002\n$com.google.ads.googlead" +
      "s.v2.servicesB\031TopicConstantServiceProto" +
      "P\001ZHgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v2/services;services\242\002\003G" +
      "AA\252\002 Google.Ads.GoogleAds.V2.Services\312\002 " +
      "Google\\Ads\\GoogleAds\\V2\\Services\352\002$Googl" +
      "e::Ads::GoogleAds::V2::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.resources.TopicConstantProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_services_GetTopicConstantRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetTopicConstantRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetTopicConstantRequest_descriptor,
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
    com.google.ads.googleads.v2.resources.TopicConstantProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
