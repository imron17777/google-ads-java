// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/bidding.proto

package com.google.ads.googleads.v2.common;

public interface PageOnePromotedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.PageOnePromoted)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The strategy goal of where impressions are desired to be shown on
   * search result pages.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.PageOnePromotedStrategyGoalEnum.PageOnePromotedStrategyGoal strategy_goal = 1;</code>
   * @return The enum numeric value on the wire for strategyGoal.
   */
  int getStrategyGoalValue();
  /**
   * <pre>
   * The strategy goal of where impressions are desired to be shown on
   * search result pages.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.PageOnePromotedStrategyGoalEnum.PageOnePromotedStrategyGoal strategy_goal = 1;</code>
   * @return The strategyGoal.
   */
  com.google.ads.googleads.v2.enums.PageOnePromotedStrategyGoalEnum.PageOnePromotedStrategyGoal getStrategyGoal();

  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
   * @return Whether the cpcBidCeilingMicros field is set.
   */
  boolean hasCpcBidCeilingMicros();
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
   * @return The cpcBidCeilingMicros.
   */
  com.google.protobuf.Int64Value getCpcBidCeilingMicros();
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpcBidCeilingMicrosOrBuilder();

  /**
   * <pre>
   * Bid multiplier to be applied to the relevant bid estimate (depending on
   * the `strategy_goal`) in determining a keyword's new CPC bid.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 3;</code>
   * @return Whether the bidModifier field is set.
   */
  boolean hasBidModifier();
  /**
   * <pre>
   * Bid multiplier to be applied to the relevant bid estimate (depending on
   * the `strategy_goal`) in determining a keyword's new CPC bid.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 3;</code>
   * @return The bidModifier.
   */
  com.google.protobuf.DoubleValue getBidModifier();
  /**
   * <pre>
   * Bid multiplier to be applied to the relevant bid estimate (depending on
   * the `strategy_goal`) in determining a keyword's new CPC bid.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 3;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBidModifierOrBuilder();

  /**
   * <pre>
   * Whether the strategy should always follow bid estimate changes, or only
   * increase.
   * If false, always sets a keyword's new bid to the current bid estimate.
   * If true, only updates a keyword's bid if the current bid estimate is
   * greater than the current bid.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue only_raise_cpc_bids = 4;</code>
   * @return Whether the onlyRaiseCpcBids field is set.
   */
  boolean hasOnlyRaiseCpcBids();
  /**
   * <pre>
   * Whether the strategy should always follow bid estimate changes, or only
   * increase.
   * If false, always sets a keyword's new bid to the current bid estimate.
   * If true, only updates a keyword's bid if the current bid estimate is
   * greater than the current bid.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue only_raise_cpc_bids = 4;</code>
   * @return The onlyRaiseCpcBids.
   */
  com.google.protobuf.BoolValue getOnlyRaiseCpcBids();
  /**
   * <pre>
   * Whether the strategy should always follow bid estimate changes, or only
   * increase.
   * If false, always sets a keyword's new bid to the current bid estimate.
   * If true, only updates a keyword's bid if the current bid estimate is
   * greater than the current bid.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue only_raise_cpc_bids = 4;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getOnlyRaiseCpcBidsOrBuilder();

  /**
   * <pre>
   * Whether the strategy is allowed to raise bids when the throttling
   * rate of the budget it is serving out of rises above a threshold.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue raise_cpc_bid_when_budget_constrained = 5;</code>
   * @return Whether the raiseCpcBidWhenBudgetConstrained field is set.
   */
  boolean hasRaiseCpcBidWhenBudgetConstrained();
  /**
   * <pre>
   * Whether the strategy is allowed to raise bids when the throttling
   * rate of the budget it is serving out of rises above a threshold.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue raise_cpc_bid_when_budget_constrained = 5;</code>
   * @return The raiseCpcBidWhenBudgetConstrained.
   */
  com.google.protobuf.BoolValue getRaiseCpcBidWhenBudgetConstrained();
  /**
   * <pre>
   * Whether the strategy is allowed to raise bids when the throttling
   * rate of the budget it is serving out of rises above a threshold.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue raise_cpc_bid_when_budget_constrained = 5;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getRaiseCpcBidWhenBudgetConstrainedOrBuilder();

  /**
   * <pre>
   * Whether the strategy is allowed to raise bids on keywords with
   * lower-range quality scores.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue raise_cpc_bid_when_quality_score_is_low = 6;</code>
   * @return Whether the raiseCpcBidWhenQualityScoreIsLow field is set.
   */
  boolean hasRaiseCpcBidWhenQualityScoreIsLow();
  /**
   * <pre>
   * Whether the strategy is allowed to raise bids on keywords with
   * lower-range quality scores.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue raise_cpc_bid_when_quality_score_is_low = 6;</code>
   * @return The raiseCpcBidWhenQualityScoreIsLow.
   */
  com.google.protobuf.BoolValue getRaiseCpcBidWhenQualityScoreIsLow();
  /**
   * <pre>
   * Whether the strategy is allowed to raise bids on keywords with
   * lower-range quality scores.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue raise_cpc_bid_when_quality_score_is_low = 6;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getRaiseCpcBidWhenQualityScoreIsLowOrBuilder();
}
