// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/bidding.proto

package com.google.ads.googleads.v3.common;

public final class BiddingProto {
  private BiddingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_Commission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_Commission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_EnhancedCpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_EnhancedCpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_ManualCpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_ManualCpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_ManualCpm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_ManualCpm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_ManualCpv_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_ManualCpv_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_MaximizeConversions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_MaximizeConversions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_MaximizeConversionValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_MaximizeConversionValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_TargetCpa_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_TargetCpa_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_TargetCpm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_TargetCpm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_TargetImpressionShare_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_TargetImpressionShare_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_TargetRoas_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_TargetRoas_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_TargetSpend_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_TargetSpend_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_PercentCpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_PercentCpc_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/ads/googleads/v3/common/bidding" +
      ".proto\022\036google.ads.googleads.v3.common\032D" +
      "google/ads/googleads/v3/enums/target_imp" +
      "ression_share_location.proto\032\036google/pro" +
      "tobuf/wrappers.proto\032\034google/api/annotat" +
      "ions.proto\"I\n\nCommission\022;\n\026commission_r" +
      "ate_micros\030\001 \001(\0132\033.google.protobuf.Int64" +
      "Value\"\r\n\013EnhancedCpc\"E\n\tManualCpc\0228\n\024enh" +
      "anced_cpc_enabled\030\001 \001(\0132\032.google.protobu" +
      "f.BoolValue\"\013\n\tManualCpm\"\013\n\tManualCpv\"\025\n" +
      "\023MaximizeConversions\"L\n\027MaximizeConversi" +
      "onValue\0221\n\013target_roas\030\001 \001(\0132\034.google.pr" +
      "otobuf.DoubleValue\"\273\001\n\tTargetCpa\0226\n\021targ" +
      "et_cpa_micros\030\001 \001(\0132\033.google.protobuf.In" +
      "t64Value\022;\n\026cpc_bid_ceiling_micros\030\002 \001(\013" +
      "2\033.google.protobuf.Int64Value\0229\n\024cpc_bid" +
      "_floor_micros\030\003 \001(\0132\033.google.protobuf.In" +
      "t64Value\"\013\n\tTargetCpm\"\205\002\n\025TargetImpressi" +
      "onShare\022p\n\010location\030\001 \001(\0162^.google.ads.g" +
      "oogleads.v3.enums.TargetImpressionShareL" +
      "ocationEnum.TargetImpressionShareLocatio" +
      "n\022=\n\030location_fraction_micros\030\002 \001(\0132\033.go" +
      "ogle.protobuf.Int64Value\022;\n\026cpc_bid_ceil" +
      "ing_micros\030\003 \001(\0132\033.google.protobuf.Int64" +
      "Value\"\267\001\n\nTargetRoas\0221\n\013target_roas\030\001 \001(" +
      "\0132\034.google.protobuf.DoubleValue\022;\n\026cpc_b" +
      "id_ceiling_micros\030\002 \001(\0132\033.google.protobu" +
      "f.Int64Value\0229\n\024cpc_bid_floor_micros\030\003 \001" +
      "(\0132\033.google.protobuf.Int64Value\"\204\001\n\013Targ" +
      "etSpend\0228\n\023target_spend_micros\030\001 \001(\0132\033.g" +
      "oogle.protobuf.Int64Value\022;\n\026cpc_bid_cei" +
      "ling_micros\030\002 \001(\0132\033.google.protobuf.Int6" +
      "4Value\"\203\001\n\nPercentCpc\022;\n\026cpc_bid_ceiling" +
      "_micros\030\001 \001(\0132\033.google.protobuf.Int64Val" +
      "ue\0228\n\024enhanced_cpc_enabled\030\002 \001(\0132\032.googl" +
      "e.protobuf.BoolValueB\347\001\n\"com.google.ads." +
      "googleads.v3.commonB\014BiddingProtoP\001ZDgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v3/common;common\242\002\003GAA\252\002\036Google" +
      ".Ads.GoogleAds.V3.Common\312\002\036Google\\Ads\\Go" +
      "ogleAds\\V3\\Common\352\002\"Google::Ads::GoogleA" +
      "ds::V3::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.enums.TargetImpressionShareLocationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v3_common_Commission_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_common_Commission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_Commission_descriptor,
        new java.lang.String[] { "CommissionRateMicros", });
    internal_static_google_ads_googleads_v3_common_EnhancedCpc_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_common_EnhancedCpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_EnhancedCpc_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v3_common_ManualCpc_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_common_ManualCpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_ManualCpc_descriptor,
        new java.lang.String[] { "EnhancedCpcEnabled", });
    internal_static_google_ads_googleads_v3_common_ManualCpm_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_common_ManualCpm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_ManualCpm_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v3_common_ManualCpv_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_common_ManualCpv_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_ManualCpv_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v3_common_MaximizeConversions_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v3_common_MaximizeConversions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_MaximizeConversions_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v3_common_MaximizeConversionValue_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v3_common_MaximizeConversionValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_MaximizeConversionValue_descriptor,
        new java.lang.String[] { "TargetRoas", });
    internal_static_google_ads_googleads_v3_common_TargetCpa_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v3_common_TargetCpa_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_TargetCpa_descriptor,
        new java.lang.String[] { "TargetCpaMicros", "CpcBidCeilingMicros", "CpcBidFloorMicros", });
    internal_static_google_ads_googleads_v3_common_TargetCpm_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v3_common_TargetCpm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_TargetCpm_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v3_common_TargetImpressionShare_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v3_common_TargetImpressionShare_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_TargetImpressionShare_descriptor,
        new java.lang.String[] { "Location", "LocationFractionMicros", "CpcBidCeilingMicros", });
    internal_static_google_ads_googleads_v3_common_TargetRoas_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v3_common_TargetRoas_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_TargetRoas_descriptor,
        new java.lang.String[] { "TargetRoas", "CpcBidCeilingMicros", "CpcBidFloorMicros", });
    internal_static_google_ads_googleads_v3_common_TargetSpend_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_ads_googleads_v3_common_TargetSpend_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_TargetSpend_descriptor,
        new java.lang.String[] { "TargetSpendMicros", "CpcBidCeilingMicros", });
    internal_static_google_ads_googleads_v3_common_PercentCpc_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_ads_googleads_v3_common_PercentCpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_PercentCpc_descriptor,
        new java.lang.String[] { "CpcBidCeilingMicros", "EnhancedCpcEnabled", });
    com.google.ads.googleads.v3.enums.TargetImpressionShareLocationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
