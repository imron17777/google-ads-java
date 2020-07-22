// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/keyword_plan.proto

package com.google.ads.googleads.v3.resources;

public final class KeywordPlanProto {
  private KeywordPlanProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_KeywordPlan_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_KeywordPlan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_KeywordPlanForecastPeriod_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_KeywordPlanForecastPeriod_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v3/resources/keyw" +
      "ord_plan.proto\022!google.ads.googleads.v3." +
      "resources\032*google/ads/googleads/v3/commo" +
      "n/dates.proto\032Bgoogle/ads/googleads/v3/e" +
      "nums/keyword_plan_forecast_interval.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\032\036google/protobuf/w" +
      "rappers.proto\032\034google/api/annotations.pr" +
      "oto\"\340\002\n\013KeywordPlan\022C\n\rresource_name\030\001 \001" +
      "(\tB,\340A\005\372A&\n$googleads.googleapis.com/Key" +
      "wordPlan\022,\n\002id\030\002 \001(\0132\033.google.protobuf.I" +
      "nt64ValueB\003\340A\003\022*\n\004name\030\003 \001(\0132\034.google.pr" +
      "otobuf.StringValue\022U\n\017forecast_period\030\004 " +
      "\001(\0132<.google.ads.googleads.v3.resources." +
      "KeywordPlanForecastPeriod:[\352AX\n$googlead" +
      "s.googleapis.com/KeywordPlan\0220customers/" +
      "{customer}/keywordPlans/{keyword_plan}\"\335" +
      "\001\n\031KeywordPlanForecastPeriod\022s\n\rdate_int" +
      "erval\030\001 \001(\0162Z.google.ads.googleads.v3.en" +
      "ums.KeywordPlanForecastIntervalEnum.Keyw" +
      "ordPlanForecastIntervalH\000\022?\n\ndate_range\030" +
      "\002 \001(\0132).google.ads.googleads.v3.common.D" +
      "ateRangeH\000B\n\n\010intervalB\375\001\n%com.google.ad" +
      "s.googleads.v3.resourcesB\020KeywordPlanPro" +
      "toP\001ZJgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v3/resources;resources" +
      "\242\002\003GAA\252\002!Google.Ads.GoogleAds.V3.Resourc" +
      "es\312\002!Google\\Ads\\GoogleAds\\V3\\Resources\352\002" +
      "%Google::Ads::GoogleAds::V3::Resourcesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.common.DatesProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.KeywordPlanForecastIntervalProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v3_resources_KeywordPlan_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_KeywordPlan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_KeywordPlan_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "ForecastPeriod", });
    internal_static_google_ads_googleads_v3_resources_KeywordPlanForecastPeriod_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_resources_KeywordPlanForecastPeriod_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_KeywordPlanForecastPeriod_descriptor,
        new java.lang.String[] { "DateInterval", "DateRange", "Interval", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.common.DatesProto.getDescriptor();
    com.google.ads.googleads.v3.enums.KeywordPlanForecastIntervalProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
