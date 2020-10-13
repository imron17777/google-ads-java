// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/campaign_shared_set.proto

package com.google.ads.googleads.v5.resources;

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
    internal_static_google_ads_googleads_v5_resources_CampaignSharedSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_CampaignSharedSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v5/resources/camp" +
      "aign_shared_set.proto\022!google.ads.google" +
      "ads.v5.resources\032>google/ads/googleads/v" +
      "5/enums/campaign_shared_set_status.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032\034google/api/annotat" +
      "ions.proto\"\332\003\n\021CampaignSharedSet\022I\n\rreso" +
      "urce_name\030\001 \001(\tB2\340A\005\372A,\n*googleads.googl" +
      "eapis.com/CampaignSharedSet\022@\n\010campaign\030" +
      "\005 \001(\tB)\340A\005\372A#\n!googleads.googleapis.com/" +
      "CampaignH\000\210\001\001\022C\n\nshared_set\030\006 \001(\tB*\340A\005\372A" +
      "$\n\"googleads.googleapis.com/SharedSetH\001\210" +
      "\001\001\022g\n\006status\030\002 \001(\0162R.google.ads.googlead" +
      "s.v5.enums.CampaignSharedSetStatusEnum.C" +
      "ampaignSharedSetStatusB\003\340A\003:n\352Ak\n*google" +
      "ads.googleapis.com/CampaignSharedSet\022=cu" +
      "stomers/{customer}/campaignSharedSets/{c" +
      "ampaign_shared_set}B\013\n\t_campaignB\r\n\013_sha" +
      "red_setB\203\002\n%com.google.ads.googleads.v5." +
      "resourcesB\026CampaignSharedSetProtoP\001ZJgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v5/resources;resources\242\002\003GAA\252\002!" +
      "Google.Ads.GoogleAds.V5.Resources\312\002!Goog" +
      "le\\Ads\\GoogleAds\\V5\\Resources\352\002%Google::" +
      "Ads::GoogleAds::V5::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.enums.CampaignSharedSetStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_CampaignSharedSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_CampaignSharedSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_CampaignSharedSet_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "SharedSet", "Status", "Campaign", "SharedSet", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.enums.CampaignSharedSetStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}