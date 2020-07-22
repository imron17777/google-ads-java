// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/keyword_plan_campaign_service.proto

package com.google.ads.googleads.v1.services;

public final class KeywordPlanCampaignServiceProto {
  private KeywordPlanCampaignServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetKeywordPlanCampaignRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetKeywordPlanCampaignRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_KeywordPlanCampaignOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_KeywordPlanCampaignOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v1/services/keywo" +
      "rd_plan_campaign_service.proto\022 google.a" +
      "ds.googleads.v1.services\032=google/ads/goo" +
      "gleads/v1/resources/keyword_plan_campaig" +
      "n.proto\032\034google/api/annotations.proto\032\027g" +
      "oogle/api/client.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\032 google/protobuf/field_mask.proto\032\027go" +
      "ogle/rpc/status.proto\"l\n\035GetKeywordPlanC" +
      "ampaignRequest\022K\n\rresource_name\030\001 \001(\tB4\340" +
      "A\002\372A.\n,googleads.googleapis.com/KeywordP" +
      "lanCampaign\"\306\001\n!MutateKeywordPlanCampaig" +
      "nsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022W\n\no" +
      "perations\030\002 \003(\0132>.google.ads.googleads.v" +
      "1.services.KeywordPlanCampaignOperationB" +
      "\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidat" +
      "e_only\030\004 \001(\010\"\202\002\n\034KeywordPlanCampaignOper" +
      "ation\022/\n\013update_mask\030\004 \001(\0132\032.google.prot" +
      "obuf.FieldMask\022H\n\006create\030\001 \001(\01326.google." +
      "ads.googleads.v1.resources.KeywordPlanCa" +
      "mpaignH\000\022H\n\006update\030\002 \001(\01326.google.ads.go" +
      "ogleads.v1.resources.KeywordPlanCampaign" +
      "H\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"\253\001\n\"Mu" +
      "tateKeywordPlanCampaignsResponse\0221\n\025part" +
      "ial_failure_error\030\003 \001(\0132\022.google.rpc.Sta" +
      "tus\022R\n\007results\030\002 \003(\0132A.google.ads.google" +
      "ads.v1.services.MutateKeywordPlanCampaig" +
      "nResult\"8\n\037MutateKeywordPlanCampaignResu" +
      "lt\022\025\n\rresource_name\030\001 \001(\t2\246\004\n\032KeywordPla" +
      "nCampaignService\022\341\001\n\026GetKeywordPlanCampa" +
      "ign\022?.google.ads.googleads.v1.services.G" +
      "etKeywordPlanCampaignRequest\0326.google.ad" +
      "s.googleads.v1.resources.KeywordPlanCamp" +
      "aign\"N\202\323\344\223\0028\0226/v1/{resource_name=custome" +
      "rs/*/keywordPlanCampaigns/*}\332A\rresource_" +
      "name\022\206\002\n\032MutateKeywordPlanCampaigns\022C.go" +
      "ogle.ads.googleads.v1.services.MutateKey" +
      "wordPlanCampaignsRequest\032D.google.ads.go" +
      "ogleads.v1.services.MutateKeywordPlanCam" +
      "paignsResponse\"]\202\323\344\223\002>\"9/v1/customers/{c" +
      "ustomer_id=*}/keywordPlanCampaigns:mutat" +
      "e:\001*\332A\026customer_id,operations\032\033\312A\030google" +
      "ads.googleapis.comB\206\002\n$com.google.ads.go" +
      "ogleads.v1.servicesB\037KeywordPlanCampaign" +
      "ServiceProtoP\001ZHgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v1/services;" +
      "services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V1" +
      ".Services\312\002 Google\\Ads\\GoogleAds\\V1\\Serv" +
      "ices\352\002$Google::Ads::GoogleAds::V1::Servi" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.KeywordPlanCampaignProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_services_GetKeywordPlanCampaignRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetKeywordPlanCampaignRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetKeywordPlanCampaignRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_KeywordPlanCampaignOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_KeywordPlanCampaignOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_KeywordPlanCampaignOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignResult_descriptor,
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
    com.google.ads.googleads.v1.resources.KeywordPlanCampaignProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
