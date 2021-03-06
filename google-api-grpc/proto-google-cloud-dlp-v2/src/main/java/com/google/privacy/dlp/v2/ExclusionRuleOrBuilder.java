// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ExclusionRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ExclusionRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Dictionary which defines the rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary dictionary = 1;</code>
   */
  boolean hasDictionary();
  /**
   * <pre>
   * Dictionary which defines the rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary dictionary = 1;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.Dictionary getDictionary();
  /**
   * <pre>
   * Dictionary which defines the rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary dictionary = 1;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.DictionaryOrBuilder getDictionaryOrBuilder();

  /**
   * <pre>
   * Regular expression which defines the rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex regex = 2;</code>
   */
  boolean hasRegex();
  /**
   * <pre>
   * Regular expression which defines the rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex regex = 2;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.Regex getRegex();
  /**
   * <pre>
   * Regular expression which defines the rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex regex = 2;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.RegexOrBuilder getRegexOrBuilder();

  /**
   * <pre>
   * Set of infoTypes for which findings would affect this rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ExcludeInfoTypes exclude_info_types = 3;</code>
   */
  boolean hasExcludeInfoTypes();
  /**
   * <pre>
   * Set of infoTypes for which findings would affect this rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ExcludeInfoTypes exclude_info_types = 3;</code>
   */
  com.google.privacy.dlp.v2.ExcludeInfoTypes getExcludeInfoTypes();
  /**
   * <pre>
   * Set of infoTypes for which findings would affect this rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ExcludeInfoTypes exclude_info_types = 3;</code>
   */
  com.google.privacy.dlp.v2.ExcludeInfoTypesOrBuilder getExcludeInfoTypesOrBuilder();

  /**
   * <pre>
   * How the rule is applied, see MatchingType documentation for details.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.MatchingType matching_type = 4;</code>
   */
  int getMatchingTypeValue();
  /**
   * <pre>
   * How the rule is applied, see MatchingType documentation for details.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.MatchingType matching_type = 4;</code>
   */
  com.google.privacy.dlp.v2.MatchingType getMatchingType();

  public com.google.privacy.dlp.v2.ExclusionRule.TypeCase getTypeCase();
}
