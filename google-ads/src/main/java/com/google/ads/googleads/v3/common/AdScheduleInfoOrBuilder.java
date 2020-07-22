// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/criteria.proto

package com.google.ads.googleads.v3.common;

public interface AdScheduleInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.AdScheduleInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Minutes after the start hour at which this schedule starts.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.MinuteOfHourEnum.MinuteOfHour start_minute = 1;</code>
   * @return The enum numeric value on the wire for startMinute.
   */
  int getStartMinuteValue();
  /**
   * <pre>
   * Minutes after the start hour at which this schedule starts.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.MinuteOfHourEnum.MinuteOfHour start_minute = 1;</code>
   * @return The startMinute.
   */
  com.google.ads.googleads.v3.enums.MinuteOfHourEnum.MinuteOfHour getStartMinute();

  /**
   * <pre>
   * Minutes after the end hour at which this schedule ends. The schedule is
   * exclusive of the end minute.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.MinuteOfHourEnum.MinuteOfHour end_minute = 2;</code>
   * @return The enum numeric value on the wire for endMinute.
   */
  int getEndMinuteValue();
  /**
   * <pre>
   * Minutes after the end hour at which this schedule ends. The schedule is
   * exclusive of the end minute.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.MinuteOfHourEnum.MinuteOfHour end_minute = 2;</code>
   * @return The endMinute.
   */
  com.google.ads.googleads.v3.enums.MinuteOfHourEnum.MinuteOfHour getEndMinute();

  /**
   * <pre>
   * Starting hour in 24 hour time.
   * This field must be between 0 and 23, inclusive.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value start_hour = 3;</code>
   * @return Whether the startHour field is set.
   */
  boolean hasStartHour();
  /**
   * <pre>
   * Starting hour in 24 hour time.
   * This field must be between 0 and 23, inclusive.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value start_hour = 3;</code>
   * @return The startHour.
   */
  com.google.protobuf.Int32Value getStartHour();
  /**
   * <pre>
   * Starting hour in 24 hour time.
   * This field must be between 0 and 23, inclusive.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value start_hour = 3;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getStartHourOrBuilder();

  /**
   * <pre>
   * Ending hour in 24 hour time; 24 signifies end of the day.
   * This field must be between 0 and 24, inclusive.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value end_hour = 4;</code>
   * @return Whether the endHour field is set.
   */
  boolean hasEndHour();
  /**
   * <pre>
   * Ending hour in 24 hour time; 24 signifies end of the day.
   * This field must be between 0 and 24, inclusive.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value end_hour = 4;</code>
   * @return The endHour.
   */
  com.google.protobuf.Int32Value getEndHour();
  /**
   * <pre>
   * Ending hour in 24 hour time; 24 signifies end of the day.
   * This field must be between 0 and 24, inclusive.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value end_hour = 4;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getEndHourOrBuilder();

  /**
   * <pre>
   * Day of the week the schedule applies to.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.DayOfWeekEnum.DayOfWeek day_of_week = 5;</code>
   * @return The enum numeric value on the wire for dayOfWeek.
   */
  int getDayOfWeekValue();
  /**
   * <pre>
   * Day of the week the schedule applies to.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.DayOfWeekEnum.DayOfWeek day_of_week = 5;</code>
   * @return The dayOfWeek.
   */
  com.google.ads.googleads.v3.enums.DayOfWeekEnum.DayOfWeek getDayOfWeek();
}
