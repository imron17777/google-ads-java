// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/billing_setup_service.proto

package com.google.ads.googleads.v3.services;

public interface BillingSetupOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.BillingSetupOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Creates a billing setup. No resource name is expected for the new billing
   * setup.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Creates a billing setup. No resource name is expected for the new billing
   * setup.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
   * @return The create.
   */
  com.google.ads.googleads.v3.resources.BillingSetup getCreate();
  /**
   * <pre>
   * Creates a billing setup. No resource name is expected for the new billing
   * setup.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.BillingSetup create = 2;</code>
   */
  com.google.ads.googleads.v3.resources.BillingSetupOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Resource name of the billing setup to remove. A setup cannot be
   * removed unless it is in a pending state or its scheduled start time is in
   * the future. The resource name looks like
   * `customers/{customer_id}/billingSetups/{billing_id}`.
   * </pre>
   *
   * <code>string remove = 1;</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Resource name of the billing setup to remove. A setup cannot be
   * removed unless it is in a pending state or its scheduled start time is in
   * the future. The resource name looks like
   * `customers/{customer_id}/billingSetups/{billing_id}`.
   * </pre>
   *
   * <code>string remove = 1;</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v3.services.BillingSetupOperation.OperationCase getOperationCase();
}
