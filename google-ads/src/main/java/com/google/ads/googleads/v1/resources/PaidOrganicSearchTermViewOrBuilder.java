// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/paid_organic_search_term_view.proto

package com.google.ads.googleads.v1.resources;

public interface PaidOrganicSearchTermViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.PaidOrganicSearchTermView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the search term view.
   * Search term view resource names have the form:
   * `customers/{customer_id}/paidOrganicSearchTermViews/{campaign_id}~
   * {ad_group_id}~{URL-base64 search term}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the search term view.
   * Search term view resource names have the form:
   * `customers/{customer_id}/paidOrganicSearchTermViews/{campaign_id}~
   * {ad_group_id}~{URL-base64 search term}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The search term.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the searchTerm field is set.
   */
  boolean hasSearchTerm();
  /**
   * <pre>
   * Output only. The search term.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The searchTerm.
   */
  com.google.protobuf.StringValue getSearchTerm();
  /**
   * <pre>
   * Output only. The search term.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getSearchTermOrBuilder();
}
