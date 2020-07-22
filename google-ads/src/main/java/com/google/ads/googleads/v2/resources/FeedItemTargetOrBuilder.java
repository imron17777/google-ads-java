// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/feed_item_target.proto

package com.google.ads.googleads.v2.resources;

public interface FeedItemTargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.FeedItemTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the feed item target.
   * Feed item target resource names have the form:
   * `customers/{customer_id}/feedItemTargets/{feed_id}~{feed_item_id}~{feed_item_target_type}~{feed_item_target_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the feed item target.
   * Feed item target resource names have the form:
   * `customers/{customer_id}/feedItemTargets/{feed_id}~{feed_item_id}~{feed_item_target_type}~{feed_item_target_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The feed item to which this feed item target belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed_item = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the feedItem field is set.
   */
  boolean hasFeedItem();
  /**
   * <pre>
   * Immutable. The feed item to which this feed item target belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed_item = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The feedItem.
   */
  com.google.protobuf.StringValue getFeedItem();
  /**
   * <pre>
   * Immutable. The feed item to which this feed item target belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed_item = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getFeedItemOrBuilder();

  /**
   * <pre>
   * Output only. The target type of this feed item target. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.FeedItemTargetTypeEnum.FeedItemTargetType feed_item_target_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for feedItemTargetType.
   */
  int getFeedItemTargetTypeValue();
  /**
   * <pre>
   * Output only. The target type of this feed item target. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.FeedItemTargetTypeEnum.FeedItemTargetType feed_item_target_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The feedItemTargetType.
   */
  com.google.ads.googleads.v2.enums.FeedItemTargetTypeEnum.FeedItemTargetType getFeedItemTargetType();

  /**
   * <pre>
   * Output only. The ID of the targeted resource. This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value feed_item_target_id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the feedItemTargetId field is set.
   */
  boolean hasFeedItemTargetId();
  /**
   * <pre>
   * Output only. The ID of the targeted resource. This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value feed_item_target_id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The feedItemTargetId.
   */
  com.google.protobuf.Int64Value getFeedItemTargetId();
  /**
   * <pre>
   * Output only. The ID of the targeted resource. This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value feed_item_target_id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getFeedItemTargetIdOrBuilder();

  /**
   * <pre>
   * Immutable. The targeted campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * Immutable. The targeted campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  com.google.protobuf.StringValue getCampaign();
  /**
   * <pre>
   * Immutable. The targeted campaign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignOrBuilder();

  /**
   * <pre>
   * Immutable. The targeted ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroup field is set.
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * Immutable. The targeted ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  com.google.protobuf.StringValue getAdGroup();
  /**
   * <pre>
   * Immutable. The targeted ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupOrBuilder();

  /**
   * <pre>
   * Immutable. The targeted keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.KeywordInfo keyword = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the keyword field is set.
   */
  boolean hasKeyword();
  /**
   * <pre>
   * Immutable. The targeted keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.KeywordInfo keyword = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The keyword.
   */
  com.google.ads.googleads.v2.common.KeywordInfo getKeyword();
  /**
   * <pre>
   * Immutable. The targeted keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.KeywordInfo keyword = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v2.common.KeywordInfoOrBuilder getKeywordOrBuilder();

  /**
   * <pre>
   * Immutable. The targeted geo target constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue geo_target_constant = 8 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the geoTargetConstant field is set.
   */
  boolean hasGeoTargetConstant();
  /**
   * <pre>
   * Immutable. The targeted geo target constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue geo_target_constant = 8 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The geoTargetConstant.
   */
  com.google.protobuf.StringValue getGeoTargetConstant();
  /**
   * <pre>
   * Immutable. The targeted geo target constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue geo_target_constant = 8 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getGeoTargetConstantOrBuilder();

  /**
   * <pre>
   * Immutable. The targeted device.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.FeedItemTargetDeviceEnum.FeedItemTargetDevice device = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for device.
   */
  int getDeviceValue();
  /**
   * <pre>
   * Immutable. The targeted device.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.FeedItemTargetDeviceEnum.FeedItemTargetDevice device = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The device.
   */
  com.google.ads.googleads.v2.enums.FeedItemTargetDeviceEnum.FeedItemTargetDevice getDevice();

  /**
   * <pre>
   * Immutable. The targeted schedule.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.AdScheduleInfo ad_schedule = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the adSchedule field is set.
   */
  boolean hasAdSchedule();
  /**
   * <pre>
   * Immutable. The targeted schedule.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.AdScheduleInfo ad_schedule = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The adSchedule.
   */
  com.google.ads.googleads.v2.common.AdScheduleInfo getAdSchedule();
  /**
   * <pre>
   * Immutable. The targeted schedule.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.AdScheduleInfo ad_schedule = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v2.common.AdScheduleInfoOrBuilder getAdScheduleOrBuilder();

  public com.google.ads.googleads.v2.resources.FeedItemTarget.TargetCase getTargetCase();
}
