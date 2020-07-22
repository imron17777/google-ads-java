// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/ad.proto

package com.google.ads.googleads.v2.resources;

public final class AdProto {
  private AdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_Ad_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_Ad_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/ads/googleads/v2/resources/ad.p" +
      "roto\022!google.ads.googleads.v2.resources\032" +
      "2google/ads/googleads/v2/common/ad_type_" +
      "infos.proto\0325google/ads/googleads/v2/com" +
      "mon/custom_parameter.proto\0322google/ads/g" +
      "oogleads/v2/common/final_app_url.proto\0323" +
      "google/ads/googleads/v2/common/url_colle" +
      "ction.proto\032+google/ads/googleads/v2/enu" +
      "ms/ad_type.proto\032*google/ads/googleads/v" +
      "2/enums/device.proto\032@google/ads/googlea" +
      "ds/v2/enums/system_managed_entity_source" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\032\036google/proto" +
      "buf/wrappers.proto\032\034google/api/annotatio" +
      "ns.proto\"\336\023\n\002Ad\022:\n\rresource_name\030% \001(\tB#" +
      "\340A\005\372A\035\n\033googleads.googleapis.com/Ad\022,\n\002i" +
      "d\030\001 \001(\0132\033.google.protobuf.Int64ValueB\003\340A" +
      "\003\0220\n\nfinal_urls\030\002 \003(\0132\034.google.protobuf." +
      "StringValue\022C\n\016final_app_urls\030# \003(\0132+.go" +
      "ogle.ads.googleads.v2.common.FinalAppUrl" +
      "\0227\n\021final_mobile_urls\030\020 \003(\0132\034.google.pro" +
      "tobuf.StringValue\022;\n\025tracking_url_templa" +
      "te\030\014 \001(\0132\034.google.protobuf.StringValue\0226" +
      "\n\020final_url_suffix\030& \001(\0132\034.google.protob" +
      "uf.StringValue\022N\n\025url_custom_parameters\030" +
      "\n \003(\0132/.google.ads.googleads.v2.common.C" +
      "ustomParameter\0221\n\013display_url\030\004 \001(\0132\034.go" +
      "ogle.protobuf.StringValue\022C\n\004type\030\005 \001(\0162" +
      "0.google.ads.googleads.v2.enums.AdTypeEn" +
      "um.AdTypeB\003\340A\003\022<\n\023added_by_google_ads\030\023 " +
      "\001(\0132\032.google.protobuf.BoolValueB\003\340A\003\022K\n\021" +
      "device_preference\030\024 \001(\01620.google.ads.goo" +
      "gleads.v2.enums.DeviceEnum.Device\022F\n\017url" +
      "_collections\030\032 \003(\0132-.google.ads.googlead" +
      "s.v2.common.UrlCollection\022/\n\004name\030\027 \001(\0132" +
      "\034.google.protobuf.StringValueB\003\340A\005\022\207\001\n\036s" +
      "ystem_managed_resource_source\030\033 \001(\0162Z.go" +
      "ogle.ads.googleads.v2.enums.SystemManage" +
      "dResourceSourceEnum.SystemManagedResourc" +
      "eSourceB\003\340A\003\022=\n\007text_ad\030\006 \001(\0132*.google.a" +
      "ds.googleads.v2.common.TextAdInfoH\000\022N\n\020e" +
      "xpanded_text_ad\030\007 \001(\01322.google.ads.googl" +
      "eads.v2.common.ExpandedTextAdInfoH\000\022F\n\014c" +
      "all_only_ad\030\r \001(\0132..google.ads.googleads" +
      ".v2.common.CallOnlyAdInfoH\000\022a\n\032expanded_" +
      "dynamic_search_ad\030\016 \001(\0132;.google.ads.goo" +
      "gleads.v2.common.ExpandedDynamicSearchAd" +
      "InfoH\000\022?\n\010hotel_ad\030\017 \001(\0132+.google.ads.go" +
      "ogleads.v2.common.HotelAdInfoH\000\022P\n\021shopp" +
      "ing_smart_ad\030\021 \001(\01323.google.ads.googlead" +
      "s.v2.common.ShoppingSmartAdInfoH\000\022T\n\023sho" +
      "pping_product_ad\030\022 \001(\01325.google.ads.goog" +
      "leads.v2.common.ShoppingProductAdInfoH\000\022" +
      "?\n\010gmail_ad\030\025 \001(\0132+.google.ads.googleads" +
      ".v2.common.GmailAdInfoH\000\022?\n\010image_ad\030\026 \001" +
      "(\0132+.google.ads.googleads.v2.common.Imag" +
      "eAdInfoH\000\022?\n\010video_ad\030\030 \001(\0132+.google.ads" +
      ".googleads.v2.common.VideoAdInfoH\000\022V\n\024re" +
      "sponsive_search_ad\030\031 \001(\01326.google.ads.go" +
      "ogleads.v2.common.ResponsiveSearchAdInfo" +
      "H\000\022e\n\034legacy_responsive_display_ad\030\034 \001(\013" +
      "2=.google.ads.googleads.v2.common.Legacy" +
      "ResponsiveDisplayAdInfoH\000\022;\n\006app_ad\030\035 \001(" +
      "\0132).google.ads.googleads.v2.common.AppAd" +
      "InfoH\000\022\\\n\025legacy_app_install_ad\030\036 \001(\01326." +
      "google.ads.googleads.v2.common.LegacyApp" +
      "InstallAdInfoB\003\340A\005H\000\022X\n\025responsive_displ" +
      "ay_ad\030\037 \001(\01327.google.ads.googleads.v2.co" +
      "mmon.ResponsiveDisplayAdInfoH\000\022P\n\021displa" +
      "y_upload_ad\030! \001(\01323.google.ads.googleads" +
      ".v2.common.DisplayUploadAdInfoH\000\022P\n\021app_" +
      "engagement_ad\030\" \001(\01323.google.ads.googlea" +
      "ds.v2.common.AppEngagementAdInfoH\000\022i\n\036sh" +
      "opping_comparison_listing_ad\030$ \001(\0132?.goo" +
      "gle.ads.googleads.v2.common.ShoppingComp" +
      "arisonListingAdInfoH\000:?\352A<\n\033googleads.go" +
      "ogleapis.com/Ad\022\035customers/{customer}/ad" +
      "s/{ad}B\t\n\007ad_dataB\364\001\n%com.google.ads.goo" +
      "gleads.v2.resourcesB\007AdProtoP\001ZJgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v2/resources;resources\242\002\003GAA\252\002!Googl" +
      "e.Ads.GoogleAds.V2.Resources\312\002!Google\\Ad" +
      "s\\GoogleAds\\V2\\Resources\352\002%Google::Ads::" +
      "GoogleAds::V2::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.common.AdTypeInfosProto.getDescriptor(),
          com.google.ads.googleads.v2.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v2.common.FinalAppUrlProto.getDescriptor(),
          com.google.ads.googleads.v2.common.UrlCollectionProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.AdTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.DeviceProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.SystemManagedEntitySourceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_resources_Ad_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_Ad_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_Ad_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "FinalUrls", "FinalAppUrls", "FinalMobileUrls", "TrackingUrlTemplate", "FinalUrlSuffix", "UrlCustomParameters", "DisplayUrl", "Type", "AddedByGoogleAds", "DevicePreference", "UrlCollections", "Name", "SystemManagedResourceSource", "TextAd", "ExpandedTextAd", "CallOnlyAd", "ExpandedDynamicSearchAd", "HotelAd", "ShoppingSmartAd", "ShoppingProductAd", "GmailAd", "ImageAd", "VideoAd", "ResponsiveSearchAd", "LegacyResponsiveDisplayAd", "AppAd", "LegacyAppInstallAd", "ResponsiveDisplayAd", "DisplayUploadAd", "AppEngagementAd", "ShoppingComparisonListingAd", "AdData", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.common.AdTypeInfosProto.getDescriptor();
    com.google.ads.googleads.v2.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v2.common.FinalAppUrlProto.getDescriptor();
    com.google.ads.googleads.v2.common.UrlCollectionProto.getDescriptor();
    com.google.ads.googleads.v2.enums.AdTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.DeviceProto.getDescriptor();
    com.google.ads.googleads.v2.enums.SystemManagedEntitySourceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
