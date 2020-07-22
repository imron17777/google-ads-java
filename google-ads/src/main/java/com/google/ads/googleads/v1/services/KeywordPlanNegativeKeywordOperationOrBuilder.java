// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/keyword_plan_negative_keyword_service.proto

package com.google.ads.googleads.v1.services;

public interface KeywordPlanNegativeKeywordOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.services.KeywordPlanNegativeKeywordOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The FieldMask that determines which resource fields are modified in an
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The FieldMask that determines which resource fields are modified in an
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The FieldMask that determines which resource fields are modified in an
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new Keyword Plan
   * negative keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.KeywordPlanNegativeKeyword create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new Keyword Plan
   * negative keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.KeywordPlanNegativeKeyword create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v1.resources.KeywordPlanNegativeKeyword getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new Keyword Plan
   * negative keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.KeywordPlanNegativeKeyword create = 1;</code>
   */
  com.google.ads.googleads.v1.resources.KeywordPlanNegativeKeywordOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The Keyword Plan negative keyword expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.KeywordPlanNegativeKeyword update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The Keyword Plan negative keyword expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.KeywordPlanNegativeKeyword update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v1.resources.KeywordPlanNegativeKeyword getUpdate();
  /**
   * <pre>
   * Update operation: The Keyword Plan negative keyword expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.KeywordPlanNegativeKeyword update = 2;</code>
   */
  com.google.ads.googleads.v1.resources.KeywordPlanNegativeKeywordOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed Keyword Plan negative
   * keywords expected in this format:
   * `customers/{customer_id}/keywordPlanNegativeKeywords/{kp_negative_keyword_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed Keyword Plan negative
   * keywords expected in this format:
   * `customers/{customer_id}/keywordPlanNegativeKeywords/{kp_negative_keyword_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v1.services.KeywordPlanNegativeKeywordOperation.OperationCase getOperationCase();
}
