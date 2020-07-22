// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/keyword_plan_ad_group.proto

package com.google.ads.googleads.v1.resources;

public interface KeywordPlanAdGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.KeywordPlanAdGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the Keyword Planner ad group.
   * KeywordPlanAdGroup resource names have the form:
   * `customers/{customer_id}/keywordPlanAdGroups/{kp_ad_group_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the Keyword Planner ad group.
   * KeywordPlanAdGroup resource names have the form:
   * `customers/{customer_id}/keywordPlanAdGroups/{kp_ad_group_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The keyword plan campaign to which this ad group belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the keywordPlanCampaign field is set.
   */
  boolean hasKeywordPlanCampaign();
  /**
   * <pre>
   * The keyword plan campaign to which this ad group belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The keywordPlanCampaign.
   */
  com.google.protobuf.StringValue getKeywordPlanCampaign();
  /**
   * <pre>
   * The keyword plan campaign to which this ad group belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 2 [(.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getKeywordPlanCampaignOrBuilder();

  /**
   * <pre>
   * Output only. The ID of the keyword plan ad group.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the keyword plan ad group.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the keyword plan ad group.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The name of the keyword plan ad group.
   * This field is required and should not be empty when creating keyword plan
   * ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the keyword plan ad group.
   * This field is required and should not be empty when creating keyword plan
   * ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the keyword plan ad group.
   * This field is required and should not be empty when creating keyword plan
   * ad group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * A default ad group max cpc bid in micros in account currency for all
   * biddable keywords under the keyword plan ad group.
   * If not set, will inherit from parent campaign.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 5;</code>
   * @return Whether the cpcBidMicros field is set.
   */
  boolean hasCpcBidMicros();
  /**
   * <pre>
   * A default ad group max cpc bid in micros in account currency for all
   * biddable keywords under the keyword plan ad group.
   * If not set, will inherit from parent campaign.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 5;</code>
   * @return The cpcBidMicros.
   */
  com.google.protobuf.Int64Value getCpcBidMicros();
  /**
   * <pre>
   * A default ad group max cpc bid in micros in account currency for all
   * biddable keywords under the keyword plan ad group.
   * If not set, will inherit from parent campaign.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpcBidMicrosOrBuilder();
}
