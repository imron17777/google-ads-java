// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/matching_function.proto

package com.google.ads.googleads.v3.common;

public interface OperandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.Operand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A constant operand in a matching function.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Operand.ConstantOperand constant_operand = 1;</code>
   * @return Whether the constantOperand field is set.
   */
  boolean hasConstantOperand();
  /**
   * <pre>
   * A constant operand in a matching function.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Operand.ConstantOperand constant_operand = 1;</code>
   * @return The constantOperand.
   */
  com.google.ads.googleads.v3.common.Operand.ConstantOperand getConstantOperand();
  /**
   * <pre>
   * A constant operand in a matching function.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Operand.ConstantOperand constant_operand = 1;</code>
   */
  com.google.ads.googleads.v3.common.Operand.ConstantOperandOrBuilder getConstantOperandOrBuilder();

  /**
   * <pre>
   * This operand specifies a feed attribute in feed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Operand.FeedAttributeOperand feed_attribute_operand = 2;</code>
   * @return Whether the feedAttributeOperand field is set.
   */
  boolean hasFeedAttributeOperand();
  /**
   * <pre>
   * This operand specifies a feed attribute in feed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Operand.FeedAttributeOperand feed_attribute_operand = 2;</code>
   * @return The feedAttributeOperand.
   */
  com.google.ads.googleads.v3.common.Operand.FeedAttributeOperand getFeedAttributeOperand();
  /**
   * <pre>
   * This operand specifies a feed attribute in feed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Operand.FeedAttributeOperand feed_attribute_operand = 2;</code>
   */
  com.google.ads.googleads.v3.common.Operand.FeedAttributeOperandOrBuilder getFeedAttributeOperandOrBuilder();

  /**
   * <pre>
   * A function operand in a matching function.
   * Used to represent nested functions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Operand.FunctionOperand function_operand = 3;</code>
   * @return Whether the functionOperand field is set.
   */
  boolean hasFunctionOperand();
  /**
   * <pre>
   * A function operand in a matching function.
   * Used to represent nested functions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Operand.FunctionOperand function_operand = 3;</code>
   * @return The functionOperand.
   */
  com.google.ads.googleads.v3.common.Operand.FunctionOperand getFunctionOperand();
  /**
   * <pre>
   * A function operand in a matching function.
   * Used to represent nested functions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Operand.FunctionOperand function_operand = 3;</code>
   */
  com.google.ads.googleads.v3.common.Operand.FunctionOperandOrBuilder getFunctionOperandOrBuilder();

  /**
   * <pre>
   * An operand in a function referring to a value in the request context.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Operand.RequestContextOperand request_context_operand = 4;</code>
   * @return Whether the requestContextOperand field is set.
   */
  boolean hasRequestContextOperand();
  /**
   * <pre>
   * An operand in a function referring to a value in the request context.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Operand.RequestContextOperand request_context_operand = 4;</code>
   * @return The requestContextOperand.
   */
  com.google.ads.googleads.v3.common.Operand.RequestContextOperand getRequestContextOperand();
  /**
   * <pre>
   * An operand in a function referring to a value in the request context.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.Operand.RequestContextOperand request_context_operand = 4;</code>
   */
  com.google.ads.googleads.v3.common.Operand.RequestContextOperandOrBuilder getRequestContextOperandOrBuilder();

  public com.google.ads.googleads.v3.common.Operand.FunctionArgumentOperandCase getFunctionArgumentOperandCase();
}
