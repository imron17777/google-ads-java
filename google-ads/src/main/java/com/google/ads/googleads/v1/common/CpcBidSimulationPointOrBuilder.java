// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/simulation.proto

package com.google.ads.googleads.v1.common;

public interface CpcBidSimulationPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.CpcBidSimulationPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The simulated CPC bid upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 1;</code>
   * @return Whether the cpcBidMicros field is set.
   */
  boolean hasCpcBidMicros();
  /**
   * <pre>
   * The simulated CPC bid upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 1;</code>
   * @return The cpcBidMicros.
   */
  com.google.protobuf.Int64Value getCpcBidMicros();
  /**
   * <pre>
   * The simulated CPC bid upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpcBidMicrosOrBuilder();

  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions = 2;</code>
   * @return Whether the biddableConversions field is set.
   */
  boolean hasBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions = 2;</code>
   * @return The biddableConversions.
   */
  com.google.protobuf.DoubleValue getBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions = 2;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBiddableConversionsOrBuilder();

  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions_value = 3;</code>
   * @return Whether the biddableConversionsValue field is set.
   */
  boolean hasBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions_value = 3;</code>
   * @return The biddableConversionsValue.
   */
  com.google.protobuf.DoubleValue getBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions_value = 3;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBiddableConversionsValueOrBuilder();

  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value clicks = 4;</code>
   * @return Whether the clicks field is set.
   */
  boolean hasClicks();
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value clicks = 4;</code>
   * @return The clicks.
   */
  com.google.protobuf.Int64Value getClicks();
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value clicks = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getClicksOrBuilder();

  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 5;</code>
   * @return Whether the costMicros field is set.
   */
  boolean hasCostMicros();
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 5;</code>
   * @return The costMicros.
   */
  com.google.protobuf.Int64Value getCostMicros();
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCostMicrosOrBuilder();

  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 6;</code>
   * @return Whether the impressions field is set.
   */
  boolean hasImpressions();
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 6;</code>
   * @return The impressions.
   */
  com.google.protobuf.Int64Value getImpressions();
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 6;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getImpressionsOrBuilder();

  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value top_slot_impressions = 7;</code>
   * @return Whether the topSlotImpressions field is set.
   */
  boolean hasTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value top_slot_impressions = 7;</code>
   * @return The topSlotImpressions.
   */
  com.google.protobuf.Int64Value getTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value top_slot_impressions = 7;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTopSlotImpressionsOrBuilder();
}
