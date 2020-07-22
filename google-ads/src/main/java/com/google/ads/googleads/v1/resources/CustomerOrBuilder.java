// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/customer.proto

package com.google.ads.googleads.v1.resources;

public interface CustomerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.Customer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the customer.
   * Customer resource names have the form:
   * `customers/{customer_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the customer.
   * Customer resource names have the form:
   * `customers/{customer_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Optional, non-unique descriptive name of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 4;</code>
   * @return Whether the descriptiveName field is set.
   */
  boolean hasDescriptiveName();
  /**
   * <pre>
   * Optional, non-unique descriptive name of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 4;</code>
   * @return The descriptiveName.
   */
  com.google.protobuf.StringValue getDescriptiveName();
  /**
   * <pre>
   * Optional, non-unique descriptive name of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptiveNameOrBuilder();

  /**
   * <pre>
   * Immutable. The currency in which the account operates.
   * A subset of the currency codes from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Immutable. The currency in which the account operates.
   * A subset of the currency codes from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The currencyCode.
   */
  com.google.protobuf.StringValue getCurrencyCode();
  /**
   * <pre>
   * Immutable. The currency in which the account operates.
   * A subset of the currency codes from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.StringValueOrBuilder getCurrencyCodeOrBuilder();

  /**
   * <pre>
   * Immutable. The local timezone ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the timeZone field is set.
   */
  boolean hasTimeZone();
  /**
   * <pre>
   * Immutable. The local timezone ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The timeZone.
   */
  com.google.protobuf.StringValue getTimeZone();
  /**
   * <pre>
   * Immutable. The local timezone ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.StringValueOrBuilder getTimeZoneOrBuilder();

  /**
   * <pre>
   * The URL template for constructing a tracking URL out of parameters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 7;</code>
   * @return Whether the trackingUrlTemplate field is set.
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL out of parameters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 7;</code>
   * @return The trackingUrlTemplate.
   */
  com.google.protobuf.StringValue getTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL out of parameters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 7;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTrackingUrlTemplateOrBuilder();

  /**
   * <pre>
   * The URL template for appending params to the final URL
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 11;</code>
   * @return Whether the finalUrlSuffix field is set.
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * The URL template for appending params to the final URL
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 11;</code>
   * @return The finalUrlSuffix.
   */
  com.google.protobuf.StringValue getFinalUrlSuffix();
  /**
   * <pre>
   * The URL template for appending params to the final URL
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 11;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalUrlSuffixOrBuilder();

  /**
   * <pre>
   * Whether auto-tagging is enabled for the customer.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue auto_tagging_enabled = 8;</code>
   * @return Whether the autoTaggingEnabled field is set.
   */
  boolean hasAutoTaggingEnabled();
  /**
   * <pre>
   * Whether auto-tagging is enabled for the customer.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue auto_tagging_enabled = 8;</code>
   * @return The autoTaggingEnabled.
   */
  com.google.protobuf.BoolValue getAutoTaggingEnabled();
  /**
   * <pre>
   * Whether auto-tagging is enabled for the customer.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue auto_tagging_enabled = 8;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getAutoTaggingEnabledOrBuilder();

  /**
   * <pre>
   * Output only. Whether the Customer has a Partners program badge. If the Customer is not
   * associated with the Partners program, this will be false. For more
   * information, see https://support.google.com/partners/answer/3125774.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_partners_badge = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the hasPartnersBadge field is set.
   */
  boolean hasHasPartnersBadge();
  /**
   * <pre>
   * Output only. Whether the Customer has a Partners program badge. If the Customer is not
   * associated with the Partners program, this will be false. For more
   * information, see https://support.google.com/partners/answer/3125774.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_partners_badge = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hasPartnersBadge.
   */
  com.google.protobuf.BoolValue getHasPartnersBadge();
  /**
   * <pre>
   * Output only. Whether the Customer has a Partners program badge. If the Customer is not
   * associated with the Partners program, this will be false. For more
   * information, see https://support.google.com/partners/answer/3125774.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_partners_badge = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHasPartnersBadgeOrBuilder();

  /**
   * <pre>
   * Output only. Whether the customer is a manager.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue manager = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the manager field is set.
   */
  boolean hasManager();
  /**
   * <pre>
   * Output only. Whether the customer is a manager.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue manager = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The manager.
   */
  com.google.protobuf.BoolValue getManager();
  /**
   * <pre>
   * Output only. Whether the customer is a manager.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue manager = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getManagerOrBuilder();

  /**
   * <pre>
   * Output only. Whether the customer is a test account.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue test_account = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the testAccount field is set.
   */
  boolean hasTestAccount();
  /**
   * <pre>
   * Output only. Whether the customer is a test account.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue test_account = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The testAccount.
   */
  com.google.protobuf.BoolValue getTestAccount();
  /**
   * <pre>
   * Output only. Whether the customer is a test account.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue test_account = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getTestAccountOrBuilder();

  /**
   * <pre>
   * Call reporting setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.CallReportingSetting call_reporting_setting = 10;</code>
   * @return Whether the callReportingSetting field is set.
   */
  boolean hasCallReportingSetting();
  /**
   * <pre>
   * Call reporting setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.CallReportingSetting call_reporting_setting = 10;</code>
   * @return The callReportingSetting.
   */
  com.google.ads.googleads.v1.resources.CallReportingSetting getCallReportingSetting();
  /**
   * <pre>
   * Call reporting setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.CallReportingSetting call_reporting_setting = 10;</code>
   */
  com.google.ads.googleads.v1.resources.CallReportingSettingOrBuilder getCallReportingSettingOrBuilder();

  /**
   * <pre>
   * Output only. Conversion tracking setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.ConversionTrackingSetting conversion_tracking_setting = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the conversionTrackingSetting field is set.
   */
  boolean hasConversionTrackingSetting();
  /**
   * <pre>
   * Output only. Conversion tracking setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.ConversionTrackingSetting conversion_tracking_setting = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The conversionTrackingSetting.
   */
  com.google.ads.googleads.v1.resources.ConversionTrackingSetting getConversionTrackingSetting();
  /**
   * <pre>
   * Output only. Conversion tracking setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.ConversionTrackingSetting conversion_tracking_setting = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v1.resources.ConversionTrackingSettingOrBuilder getConversionTrackingSettingOrBuilder();

  /**
   * <pre>
   * Output only. Remarketing setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.RemarketingSetting remarketing_setting = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the remarketingSetting field is set.
   */
  boolean hasRemarketingSetting();
  /**
   * <pre>
   * Output only. Remarketing setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.RemarketingSetting remarketing_setting = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The remarketingSetting.
   */
  com.google.ads.googleads.v1.resources.RemarketingSetting getRemarketingSetting();
  /**
   * <pre>
   * Output only. Remarketing setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.RemarketingSetting remarketing_setting = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v1.resources.RemarketingSettingOrBuilder getRemarketingSettingOrBuilder();

  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use PaymentMode.CONVERSIONS. If
   * the list is empty, the customer is eligible. This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the payPerConversionEligibilityFailureReasons.
   */
  java.util.List<com.google.ads.googleads.v1.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason> getPayPerConversionEligibilityFailureReasonsList();
  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use PaymentMode.CONVERSIONS. If
   * the list is empty, the customer is eligible. This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of payPerConversionEligibilityFailureReasons.
   */
  int getPayPerConversionEligibilityFailureReasonsCount();
  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use PaymentMode.CONVERSIONS. If
   * the list is empty, the customer is eligible. This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The payPerConversionEligibilityFailureReasons at the given index.
   */
  com.google.ads.googleads.v1.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason getPayPerConversionEligibilityFailureReasons(int index);
  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use PaymentMode.CONVERSIONS. If
   * the list is empty, the customer is eligible. This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the enum numeric values on the wire for payPerConversionEligibilityFailureReasons.
   */
  java.util.List<java.lang.Integer>
  getPayPerConversionEligibilityFailureReasonsValueList();
  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use PaymentMode.CONVERSIONS. If
   * the list is empty, the customer is eligible. This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of payPerConversionEligibilityFailureReasons at the given index.
   */
  int getPayPerConversionEligibilityFailureReasonsValue(int index);
}
