// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/user_list.proto

package com.google.ads.googleads.v4.resources;

public final class UserListProto {
  private UserListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_UserList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_UserList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v4/resources/user" +
      "_list.proto\022!google.ads.googleads.v4.res" +
      "ources\032/google/ads/googleads/v4/common/u" +
      "ser_lists.proto\0321google/ads/googleads/v4" +
      "/enums/access_reason.proto\032;google/ads/g" +
      "oogleads/v4/enums/user_list_access_statu" +
      "s.proto\032<google/ads/googleads/v4/enums/u" +
      "ser_list_closing_reason.proto\032?google/ad" +
      "s/googleads/v4/enums/user_list_membershi" +
      "p_status.proto\0328google/ads/googleads/v4/" +
      "enums/user_list_size_range.proto\0322google" +
      "/ads/googleads/v4/enums/user_list_type.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\032\036google/protobu" +
      "f/wrappers.proto\032\034google/api/annotations" +
      ".proto\"\300\016\n\010UserList\022@\n\rresource_name\030\001 \001" +
      "(\tB)\340A\005\372A#\n!googleads.googleapis.com/Use" +
      "rList\022,\n\002id\030\002 \001(\0132\033.google.protobuf.Int6" +
      "4ValueB\003\340A\003\0222\n\tread_only\030\003 \001(\0132\032.google." +
      "protobuf.BoolValueB\003\340A\003\022*\n\004name\030\004 \001(\0132\034." +
      "google.protobuf.StringValue\0221\n\013descripti" +
      "on\030\005 \001(\0132\034.google.protobuf.StringValue\022o" +
      "\n\021membership_status\030\006 \001(\0162T.google.ads.g" +
      "oogleads.v4.enums.UserListMembershipStat" +
      "usEnum.UserListMembershipStatus\0226\n\020integ" +
      "ration_code\030\007 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\0229\n\024membership_life_span\030\010 \001(\0132\033." +
      "google.protobuf.Int64Value\022:\n\020size_for_d" +
      "isplay\030\t \001(\0132\033.google.protobuf.Int64Valu" +
      "eB\003\340A\003\022k\n\026size_range_for_display\030\n \001(\0162F" +
      ".google.ads.googleads.v4.enums.UserListS" +
      "izeRangeEnum.UserListSizeRangeB\003\340A\003\0229\n\017s" +
      "ize_for_search\030\013 \001(\0132\033.google.protobuf.I" +
      "nt64ValueB\003\340A\003\022j\n\025size_range_for_search\030" +
      "\014 \001(\0162F.google.ads.googleads.v4.enums.Us" +
      "erListSizeRangeEnum.UserListSizeRangeB\003\340" +
      "A\003\022O\n\004type\030\r \001(\0162<.google.ads.googleads." +
      "v4.enums.UserListTypeEnum.UserListTypeB\003" +
      "\340A\003\022f\n\016closing_reason\030\016 \001(\0162N.google.ads" +
      ".googleads.v4.enums.UserListClosingReaso" +
      "nEnum.UserListClosingReason\022X\n\raccess_re" +
      "ason\030\017 \001(\0162<.google.ads.googleads.v4.enu" +
      "ms.AccessReasonEnum.AccessReasonB\003\340A\003\022n\n" +
      "\030account_user_list_status\030\020 \001(\0162L.google" +
      ".ads.googleads.v4.enums.UserListAccessSt" +
      "atusEnum.UserListAccessStatus\0227\n\023eligibl" +
      "e_for_search\030\021 \001(\0132\032.google.protobuf.Boo" +
      "lValue\022=\n\024eligible_for_display\030\022 \001(\0132\032.g" +
      "oogle.protobuf.BoolValueB\003\340A\003\022S\n\023crm_bas" +
      "ed_user_list\030\023 \001(\01324.google.ads.googlead" +
      "s.v4.common.CrmBasedUserListInfoH\000\022U\n\021si" +
      "milar_user_list\030\024 \001(\01323.google.ads.googl" +
      "eads.v4.common.SimilarUserListInfoB\003\340A\003H" +
      "\000\022U\n\024rule_based_user_list\030\025 \001(\01325.google" +
      ".ads.googleads.v4.common.RuleBasedUserLi" +
      "stInfoH\000\022P\n\021logical_user_list\030\026 \001(\01323.go" +
      "ogle.ads.googleads.v4.common.LogicalUser" +
      "ListInfoH\000\022L\n\017basic_user_list\030\027 \001(\01321.go" +
      "ogle.ads.googleads.v4.common.BasicUserLi" +
      "stInfoH\000:R\352AO\n!googleads.googleapis.com/" +
      "UserList\022*customers/{customer}/userLists" +
      "/{user_list}B\013\n\tuser_listB\372\001\n%com.google" +
      ".ads.googleads.v4.resourcesB\rUserListPro" +
      "toP\001ZJgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v4/resources;resources" +
      "\242\002\003GAA\252\002!Google.Ads.GoogleAds.V4.Resourc" +
      "es\312\002!Google\\Ads\\GoogleAds\\V4\\Resources\352\002" +
      "%Google::Ads::GoogleAds::V4::Resourcesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.common.UserListsProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.AccessReasonProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.UserListAccessStatusProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.UserListClosingReasonProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.UserListMembershipStatusProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.UserListSizeRangeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.UserListTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_resources_UserList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_UserList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_UserList_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "ReadOnly", "Name", "Description", "MembershipStatus", "IntegrationCode", "MembershipLifeSpan", "SizeForDisplay", "SizeRangeForDisplay", "SizeForSearch", "SizeRangeForSearch", "Type", "ClosingReason", "AccessReason", "AccountUserListStatus", "EligibleForSearch", "EligibleForDisplay", "CrmBasedUserList", "SimilarUserList", "RuleBasedUserList", "LogicalUserList", "BasicUserList", "UserList", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.common.UserListsProto.getDescriptor();
    com.google.ads.googleads.v4.enums.AccessReasonProto.getDescriptor();
    com.google.ads.googleads.v4.enums.UserListAccessStatusProto.getDescriptor();
    com.google.ads.googleads.v4.enums.UserListClosingReasonProto.getDescriptor();
    com.google.ads.googleads.v4.enums.UserListMembershipStatusProto.getDescriptor();
    com.google.ads.googleads.v4.enums.UserListSizeRangeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.UserListTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
