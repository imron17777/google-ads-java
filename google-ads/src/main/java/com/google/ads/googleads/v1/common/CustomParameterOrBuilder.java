// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/custom_parameter.proto

package com.google.ads.googleads.v1.common;

public interface CustomParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.CustomParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The key matching the parameter tag name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue key = 1;</code>
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   * <pre>
   * The key matching the parameter tag name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue key = 1;</code>
   * @return The key.
   */
  com.google.protobuf.StringValue getKey();
  /**
   * <pre>
   * The key matching the parameter tag name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue key = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getKeyOrBuilder();

  /**
   * <pre>
   * The value to be substituted.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 2;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * The value to be substituted.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 2;</code>
   * @return The value.
   */
  com.google.protobuf.StringValue getValue();
  /**
   * <pre>
   * The value to be substituted.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getValueOrBuilder();
}
