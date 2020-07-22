// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/campaign_shared_set.proto

package com.google.ads.googleads.v1.resources;

public final class CampaignSharedSetProto {
  private CampaignSharedSetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_CampaignSharedSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_CampaignSharedSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v1/resources/camp" +
      "aign_shared_set.proto\022!google.ads.google" +
      "ads.v1.resources\032>google/ads/googleads/v" +
      "1/enums/campaign_shared_set_status.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032\036google/protobuf/wr" +
      "appers.proto\032\034google/api/annotations.pro" +
      "to\"\360\003\n\021CampaignSharedSet\022I\n\rresource_nam" +
      "e\030\001 \001(\tB2\340A\005\372A,\n*googleads.googleapis.co" +
      "m/CampaignSharedSet\022Y\n\010campaign\030\003 \001(\0132\034." +
      "google.protobuf.StringValueB)\340A\005\372A#\n!goo" +
      "gleads.googleapis.com/Campaign\022\\\n\nshared" +
      "_set\030\004 \001(\0132\034.google.protobuf.StringValue" +
      "B*\340A\005\372A$\n\"googleads.googleapis.com/Share" +
      "dSet\022g\n\006status\030\002 \001(\0162R.google.ads.google" +
      "ads.v1.enums.CampaignSharedSetStatusEnum" +
      ".CampaignSharedSetStatusB\003\340A\003:n\352Ak\n*goog" +
      "leads.googleapis.com/CampaignSharedSet\022=" +
      "customers/{customer}/campaignSharedSets/" +
      "{campaign_shared_set}B\203\002\n%com.google.ads" +
      ".googleads.v1.resourcesB\026CampaignSharedS" +
      "etProtoP\001ZJgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v1/resources;reso" +
      "urces\242\002\003GAA\252\002!Google.Ads.GoogleAds.V1.Re" +
      "sources\312\002!Google\\Ads\\GoogleAds\\V1\\Resour" +
      "ces\352\002%Google::Ads::GoogleAds::V1::Resour" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.enums.CampaignSharedSetStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_resources_CampaignSharedSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_CampaignSharedSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_CampaignSharedSet_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "SharedSet", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.enums.CampaignSharedSetStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
