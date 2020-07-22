// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/media_file.proto

package com.google.ads.googleads.v1.resources;

public final class MediaFileProto {
  private MediaFileProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_MediaFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_MediaFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_MediaImage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_MediaImage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_MediaBundle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_MediaBundle_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_MediaAudio_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_MediaAudio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_MediaVideo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_MediaVideo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v1/resources/medi" +
      "a_file.proto\022!google.ads.googleads.v1.re" +
      "sources\032.google/ads/googleads/v1/enums/m" +
      "edia_type.proto\032-google/ads/googleads/v1" +
      "/enums/mime_type.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\032\036google/protobuf/wrappers.proto\032\034goog" +
      "le/api/annotations.proto\"\262\006\n\tMediaFile\022A" +
      "\n\rresource_name\030\001 \001(\tB*\340A\005\372A$\n\"googleads" +
      ".googleapis.com/MediaFile\022,\n\002id\030\002 \001(\0132\033." +
      "google.protobuf.Int64ValueB\003\340A\003\022I\n\004type\030" +
      "\005 \001(\01626.google.ads.googleads.v1.enums.Me" +
      "diaTypeEnum.MediaTypeB\003\340A\005\022L\n\tmime_type\030" +
      "\006 \001(\01624.google.ads.googleads.v1.enums.Mi" +
      "meTypeEnum.MimeTypeB\003\340A\003\0225\n\nsource_url\030\007" +
      " \001(\0132\034.google.protobuf.StringValueB\003\340A\005\022" +
      "/\n\004name\030\010 \001(\0132\034.google.protobuf.StringVa" +
      "lueB\003\340A\005\0223\n\tfile_size\030\t \001(\0132\033.google.pro" +
      "tobuf.Int64ValueB\003\340A\003\022C\n\005image\030\003 \001(\0132-.g" +
      "oogle.ads.googleads.v1.resources.MediaIm" +
      "ageB\003\340A\005H\000\022K\n\014media_bundle\030\004 \001(\0132..googl" +
      "e.ads.googleads.v1.resources.MediaBundle" +
      "B\003\340A\005H\000\022C\n\005audio\030\n \001(\0132-.google.ads.goog" +
      "leads.v1.resources.MediaAudioB\003\340A\003H\000\022C\n\005" +
      "video\030\013 \001(\0132-.google.ads.googleads.v1.re" +
      "sources.MediaVideoB\003\340A\005H\000:U\352AR\n\"googlead" +
      "s.googleapis.com/MediaFile\022,customers/{c" +
      "ustomer}/mediaFiles/{media_file}B\013\n\tmedi" +
      "atype\"<\n\nMediaImage\022.\n\004data\030\001 \001(\0132\033.goog" +
      "le.protobuf.BytesValueB\003\340A\005\"=\n\013MediaBund" +
      "le\022.\n\004data\030\001 \001(\0132\033.google.protobuf.Bytes" +
      "ValueB\003\340A\005\"J\n\nMediaAudio\022<\n\022ad_duration_" +
      "millis\030\001 \001(\0132\033.google.protobuf.Int64Valu" +
      "eB\003\340A\003\"\375\001\n\nMediaVideo\022<\n\022ad_duration_mil" +
      "lis\030\001 \001(\0132\033.google.protobuf.Int64ValueB\003" +
      "\340A\003\022;\n\020youtube_video_id\030\002 \001(\0132\034.google.p" +
      "rotobuf.StringValueB\003\340A\005\022>\n\023advertising_" +
      "id_code\030\003 \001(\0132\034.google.protobuf.StringVa" +
      "lueB\003\340A\003\0224\n\tisci_code\030\004 \001(\0132\034.google.pro" +
      "tobuf.StringValueB\003\340A\003B\373\001\n%com.google.ad" +
      "s.googleads.v1.resourcesB\016MediaFileProto" +
      "P\001ZJgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v1/resources;resources\242\002" +
      "\003GAA\252\002!Google.Ads.GoogleAds.V1.Resources" +
      "\312\002!Google\\Ads\\GoogleAds\\V1\\Resources\352\002%G" +
      "oogle::Ads::GoogleAds::V1::Resourcesb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.enums.MediaTypeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.MimeTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_resources_MediaFile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_MediaFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_MediaFile_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Type", "MimeType", "SourceUrl", "Name", "FileSize", "Image", "MediaBundle", "Audio", "Video", "Mediatype", });
    internal_static_google_ads_googleads_v1_resources_MediaImage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_resources_MediaImage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_MediaImage_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_google_ads_googleads_v1_resources_MediaBundle_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_resources_MediaBundle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_MediaBundle_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_google_ads_googleads_v1_resources_MediaAudio_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_resources_MediaAudio_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_MediaAudio_descriptor,
        new java.lang.String[] { "AdDurationMillis", });
    internal_static_google_ads_googleads_v1_resources_MediaVideo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_resources_MediaVideo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_MediaVideo_descriptor,
        new java.lang.String[] { "AdDurationMillis", "YoutubeVideoId", "AdvertisingIdCode", "IsciCode", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.enums.MediaTypeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.MimeTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
