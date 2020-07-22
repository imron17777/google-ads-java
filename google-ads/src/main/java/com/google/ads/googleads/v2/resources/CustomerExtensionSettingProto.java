// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/customer_extension_setting.proto

package com.google.ads.googleads.v2.resources;

public final class CustomerExtensionSettingProto {
  private CustomerExtensionSettingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_CustomerExtensionSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_CustomerExtensionSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v2/resources/cust" +
      "omer_extension_setting.proto\022!google.ads" +
      ".googleads.v2.resources\032<google/ads/goog" +
      "leads/v2/enums/extension_setting_device." +
      "proto\0322google/ads/googleads/v2/enums/ext" +
      "ension_type.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032\036g" +
      "oogle/protobuf/wrappers.proto\032\034google/ap" +
      "i/annotations.proto\"\237\004\n\030CustomerExtensio" +
      "nSetting\022P\n\rresource_name\030\001 \001(\tB9\340A\005\372A3\n" +
      "1googleads.googleapis.com/CustomerExtens" +
      "ionSetting\022[\n\016extension_type\030\002 \001(\0162>.goo" +
      "gle.ads.googleads.v2.enums.ExtensionType" +
      "Enum.ExtensionTypeB\003\340A\005\022k\n\024extension_fee" +
      "d_items\030\003 \003(\0132\034.google.protobuf.StringVa" +
      "lueB/\372A,\n*googleads.googleapis.com/Exten" +
      "sionFeedItem\022`\n\006device\030\004 \001(\0162P.google.ad" +
      "s.googleads.v2.enums.ExtensionSettingDev" +
      "iceEnum.ExtensionSettingDevice:\204\001\352A\200\001\n1g" +
      "oogleads.googleapis.com/CustomerExtensio" +
      "nSetting\022Kcustomers/{customer}/customerE" +
      "xtensionSettings/{customer_extension_set" +
      "ting}B\212\002\n%com.google.ads.googleads.v2.re" +
      "sourcesB\035CustomerExtensionSettingProtoP\001" +
      "ZJgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v2/resources;resources\242\002\003G" +
      "AA\252\002!Google.Ads.GoogleAds.V2.Resources\312\002" +
      "!Google\\Ads\\GoogleAds\\V2\\Resources\352\002%Goo" +
      "gle::Ads::GoogleAds::V2::Resourcesb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.enums.ExtensionSettingDeviceProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ExtensionTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_resources_CustomerExtensionSetting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_CustomerExtensionSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_CustomerExtensionSetting_descriptor,
        new java.lang.String[] { "ResourceName", "ExtensionType", "ExtensionFeedItems", "Device", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.enums.ExtensionSettingDeviceProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ExtensionTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
