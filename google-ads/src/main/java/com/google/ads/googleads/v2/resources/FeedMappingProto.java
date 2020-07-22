// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/feed_mapping.proto

package com.google.ads.googleads.v2.resources;

public final class FeedMappingProto {
  private FeedMappingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_FeedMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_FeedMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_AttributeFieldMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_AttributeFieldMapping_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v2/resources/feed" +
      "_mapping.proto\022!google.ads.googleads.v2." +
      "resources\032Cgoogle/ads/googleads/v2/enums" +
      "/ad_customizer_placeholder_field.proto\032H" +
      "google/ads/googleads/v2/enums/affiliate_" +
      "location_placeholder_field.proto\0329google" +
      "/ads/googleads/v2/enums/app_placeholder_" +
      "field.proto\032:google/ads/googleads/v2/enu" +
      "ms/call_placeholder_field.proto\032=google/" +
      "ads/googleads/v2/enums/callout_placehold" +
      "er_field.proto\032<google/ads/googleads/v2/" +
      "enums/custom_placeholder_field.proto\032Ago" +
      "ogle/ads/googleads/v2/enums/dsa_page_fee" +
      "d_criterion_field.proto\032?google/ads/goog" +
      "leads/v2/enums/education_placeholder_fie" +
      "ld.proto\032?google/ads/googleads/v2/enums/" +
      "feed_mapping_criterion_type.proto\0327googl" +
      "e/ads/googleads/v2/enums/feed_mapping_st" +
      "atus.proto\032<google/ads/googleads/v2/enum" +
      "s/flight_placeholder_field.proto\032;google" +
      "/ads/googleads/v2/enums/hotel_placeholde" +
      "r_field.proto\0329google/ads/googleads/v2/e" +
      "nums/job_placeholder_field.proto\032;google" +
      "/ads/googleads/v2/enums/local_placeholde" +
      "r_field.proto\032Pgoogle/ads/googleads/v2/e" +
      "nums/location_extension_targeting_criter" +
      "ion_field.proto\032>google/ads/googleads/v2" +
      "/enums/location_placeholder_field.proto\032" +
      "=google/ads/googleads/v2/enums/message_p" +
      "laceholder_field.proto\0324google/ads/googl" +
      "eads/v2/enums/placeholder_type.proto\032;go" +
      "ogle/ads/googleads/v2/enums/price_placeh" +
      "older_field.proto\032?google/ads/googleads/" +
      "v2/enums/promotion_placeholder_field.pro" +
      "to\032Agoogle/ads/googleads/v2/enums/real_e" +
      "state_placeholder_field.proto\032>google/ad" +
      "s/googleads/v2/enums/sitelink_placeholde" +
      "r_field.proto\032Hgoogle/ads/googleads/v2/e" +
      "nums/structured_snippet_placeholder_fiel" +
      "d.proto\032<google/ads/googleads/v2/enums/t" +
      "ravel_placeholder_field.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\032\036google/protobuf/wrappers.prot" +
      "o\032\034google/api/annotations.proto\"\244\005\n\013Feed" +
      "Mapping\022C\n\rresource_name\030\001 \001(\tB,\340A\005\372A&\n$" +
      "googleads.googleapis.com/FeedMapping\022Q\n\004" +
      "feed\030\002 \001(\0132\034.google.protobuf.StringValue" +
      "B%\340A\005\372A\037\n\035googleads.googleapis.com/Feed\022" +
      "_\n\030attribute_field_mappings\030\005 \003(\01328.goog" +
      "le.ads.googleads.v2.resources.AttributeF" +
      "ieldMappingB\003\340A\005\022[\n\006status\030\006 \001(\0162F.googl" +
      "e.ads.googleads.v2.enums.FeedMappingStat" +
      "usEnum.FeedMappingStatusB\003\340A\003\022c\n\020placeho" +
      "lder_type\030\003 \001(\0162B.google.ads.googleads.v" +
      "2.enums.PlaceholderTypeEnum.PlaceholderT" +
      "ypeB\003\340A\005H\000\022s\n\016criterion_type\030\004 \001(\0162T.goo" +
      "gle.ads.googleads.v2.enums.FeedMappingCr" +
      "iterionTypeEnum.FeedMappingCriterionType" +
      "B\003\340A\005H\000:[\352AX\n$googleads.googleapis.com/F" +
      "eedMapping\0220customers/{customer}/feedMap" +
      "pings/{feed_mapping}B\010\n\006target\"\336\024\n\025Attri" +
      "buteFieldMapping\022;\n\021feed_attribute_id\030\001 " +
      "\001(\0132\033.google.protobuf.Int64ValueB\003\340A\005\0222\n" +
      "\010field_id\030\002 \001(\0132\033.google.protobuf.Int64V" +
      "alueB\003\340A\003\022s\n\016sitelink_field\030\003 \001(\0162T.goog" +
      "le.ads.googleads.v2.enums.SitelinkPlaceh" +
      "olderFieldEnum.SitelinkPlaceholderFieldB" +
      "\003\340A\005H\000\022g\n\ncall_field\030\004 \001(\0162L.google.ads." +
      "googleads.v2.enums.CallPlaceholderFieldE" +
      "num.CallPlaceholderFieldB\003\340A\005H\000\022d\n\tapp_f" +
      "ield\030\005 \001(\0162J.google.ads.googleads.v2.enu" +
      "ms.AppPlaceholderFieldEnum.AppPlaceholde" +
      "rFieldB\003\340A\005H\000\022s\n\016location_field\030\006 \001(\0162T." +
      "google.ads.googleads.v2.enums.LocationPl" +
      "aceholderFieldEnum.LocationPlaceholderFi" +
      "eldB\003\340A\003H\000\022\217\001\n\030affiliate_location_field\030" +
      "\007 \001(\0162f.google.ads.googleads.v2.enums.Af" +
      "filiateLocationPlaceholderFieldEnum.Affi" +
      "liateLocationPlaceholderFieldB\003\340A\003H\000\022p\n\r" +
      "callout_field\030\010 \001(\0162R.google.ads.googlea" +
      "ds.v2.enums.CalloutPlaceholderFieldEnum." +
      "CalloutPlaceholderFieldB\003\340A\005H\000\022\217\001\n\030struc" +
      "tured_snippet_field\030\t \001(\0162f.google.ads.g" +
      "oogleads.v2.enums.StructuredSnippetPlace" +
      "holderFieldEnum.StructuredSnippetPlaceho" +
      "lderFieldB\003\340A\005H\000\022p\n\rmessage_field\030\n \001(\0162" +
      "R.google.ads.googleads.v2.enums.MessageP" +
      "laceholderFieldEnum.MessagePlaceholderFi" +
      "eldB\003\340A\005H\000\022j\n\013price_field\030\013 \001(\0162N.google" +
      ".ads.googleads.v2.enums.PricePlaceholder" +
      "FieldEnum.PricePlaceholderFieldB\003\340A\005H\000\022v" +
      "\n\017promotion_field\030\014 \001(\0162V.google.ads.goo" +
      "gleads.v2.enums.PromotionPlaceholderFiel" +
      "dEnum.PromotionPlaceholderFieldB\003\340A\005H\000\022\200" +
      "\001\n\023ad_customizer_field\030\r \001(\0162\\.google.ad" +
      "s.googleads.v2.enums.AdCustomizerPlaceho" +
      "lderFieldEnum.AdCustomizerPlaceholderFie" +
      "ldB\003\340A\005H\000\022z\n\023dsa_page_feed_field\030\016 \001(\0162V" +
      ".google.ads.googleads.v2.enums.DsaPageFe" +
      "edCriterionFieldEnum.DsaPageFeedCriterio" +
      "nFieldB\003\340A\005H\000\022\247\001\n\"location_extension_tar" +
      "geting_field\030\017 \001(\0162t.google.ads.googlead" +
      "s.v2.enums.LocationExtensionTargetingCri" +
      "terionFieldEnum.LocationExtensionTargeti" +
      "ngCriterionFieldB\003\340A\005H\000\022v\n\017education_fie" +
      "ld\030\020 \001(\0162V.google.ads.googleads.v2.enums" +
      ".EducationPlaceholderFieldEnum.Education" +
      "PlaceholderFieldB\003\340A\005H\000\022m\n\014flight_field\030" +
      "\021 \001(\0162P.google.ads.googleads.v2.enums.Fl" +
      "ightPlaceholderFieldEnum.FlightPlacehold" +
      "erFieldB\003\340A\005H\000\022m\n\014custom_field\030\022 \001(\0162P.g" +
      "oogle.ads.googleads.v2.enums.CustomPlace" +
      "holderFieldEnum.CustomPlaceholderFieldB\003" +
      "\340A\005H\000\022j\n\013hotel_field\030\023 \001(\0162N.google.ads." +
      "googleads.v2.enums.HotelPlaceholderField" +
      "Enum.HotelPlaceholderFieldB\003\340A\005H\000\022z\n\021rea" +
      "l_estate_field\030\024 \001(\0162X.google.ads.google" +
      "ads.v2.enums.RealEstatePlaceholderFieldE" +
      "num.RealEstatePlaceholderFieldB\003\340A\005H\000\022m\n" +
      "\014travel_field\030\025 \001(\0162P.google.ads.googlea" +
      "ds.v2.enums.TravelPlaceholderFieldEnum.T" +
      "ravelPlaceholderFieldB\003\340A\005H\000\022j\n\013local_fi" +
      "eld\030\026 \001(\0162N.google.ads.googleads.v2.enum" +
      "s.LocalPlaceholderFieldEnum.LocalPlaceho" +
      "lderFieldB\003\340A\005H\000\022d\n\tjob_field\030\027 \001(\0162J.go" +
      "ogle.ads.googleads.v2.enums.JobPlacehold" +
      "erFieldEnum.JobPlaceholderFieldB\003\340A\005H\000B\007" +
      "\n\005fieldB\375\001\n%com.google.ads.googleads.v2." +
      "resourcesB\020FeedMappingProtoP\001ZJgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v2/resources;resources\242\002\003GAA\252\002!Google" +
      ".Ads.GoogleAds.V2.Resources\312\002!Google\\Ads" +
      "\\GoogleAds\\V2\\Resources\352\002%Google::Ads::G" +
      "oogleAds::V2::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.enums.AdCustomizerPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.AppPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.CallPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.CalloutPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.CustomPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.DsaPageFeedCriterionFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.EducationPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.FeedMappingCriterionTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.FeedMappingStatusProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.FlightsPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.HotelsPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.JobsPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.LocalPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.LocationExtensionTargetingCriterionFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.LocationPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.MessagePlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.PricePlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.PromotionPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.RealEstatePlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.SitelinkPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.StructuredSnippetPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.TravelPlaceholderFieldProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_resources_FeedMapping_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_FeedMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_FeedMapping_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "AttributeFieldMappings", "Status", "PlaceholderType", "CriterionType", "Target", });
    internal_static_google_ads_googleads_v2_resources_AttributeFieldMapping_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_resources_AttributeFieldMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_AttributeFieldMapping_descriptor,
        new java.lang.String[] { "FeedAttributeId", "FieldId", "SitelinkField", "CallField", "AppField", "LocationField", "AffiliateLocationField", "CalloutField", "StructuredSnippetField", "MessageField", "PriceField", "PromotionField", "AdCustomizerField", "DsaPageFeedField", "LocationExtensionTargetingField", "EducationField", "FlightField", "CustomField", "HotelField", "RealEstateField", "TravelField", "LocalField", "JobField", "Field", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.enums.AdCustomizerPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.AffiliateLocationPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.AppPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CallPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CalloutPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CustomPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.DsaPageFeedCriterionFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.EducationPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.FeedMappingCriterionTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.FeedMappingStatusProto.getDescriptor();
    com.google.ads.googleads.v2.enums.FlightsPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.HotelsPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.JobsPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.LocalPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.LocationExtensionTargetingCriterionFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.LocationPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.MessagePlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.PlaceholderTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.PricePlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.PromotionPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.RealEstatePlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.SitelinkPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.StructuredSnippetPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v2.enums.TravelPlaceholderFieldProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
