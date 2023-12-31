// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/postman/header.proto

package org.mojolang.mojo.postman;

/**
 * Protobuf type {@code mojo.postman.Header}
 */
public final class Header extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.postman.Header)
    HeaderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Header.newBuilder() to construct.
  private Header(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Header() {
    key_ = "";
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Header();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.postman.HeaderProto.internal_static_mojo_postman_Header_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.postman.HeaderProto.internal_static_mojo_postman_Header_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.postman.Header.class, org.mojolang.mojo.postman.Header.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object key_ = "";
  /**
   * <code>string key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object value_ = "";
  /**
   * <code>string value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <code>string value = 2;</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISABLED_FIELD_NUMBER = 3;
  private boolean disabled_ = false;
  /**
   * <code>bool disabled = 3;</code>
   * @return The disabled.
   */
  @java.lang.Override
  public boolean getDisabled() {
    return disabled_;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  private org.mojolang.mojo.postman.Description description_;
  /**
   * <code>.mojo.postman.Description description = 4;</code>
   * @return Whether the description field is set.
   */
  @java.lang.Override
  public boolean hasDescription() {
    return description_ != null;
  }
  /**
   * <code>.mojo.postman.Description description = 4;</code>
   * @return The description.
   */
  @java.lang.Override
  public org.mojolang.mojo.postman.Description getDescription() {
    return description_ == null ? org.mojolang.mojo.postman.Description.getDefaultInstance() : description_;
  }
  /**
   * <code>.mojo.postman.Description description = 4;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.postman.DescriptionOrBuilder getDescriptionOrBuilder() {
    return description_ == null ? org.mojolang.mojo.postman.Description.getDefaultInstance() : description_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
    }
    if (disabled_ != false) {
      output.writeBool(3, disabled_);
    }
    if (description_ != null) {
      output.writeMessage(4, getDescription());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
    }
    if (disabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, disabled_);
    }
    if (description_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getDescription());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.mojolang.mojo.postman.Header)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.postman.Header other = (org.mojolang.mojo.postman.Header) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
    if (getDisabled()
        != other.getDisabled()) return false;
    if (hasDescription() != other.hasDescription()) return false;
    if (hasDescription()) {
      if (!getDescription()
          .equals(other.getDescription())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + DISABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisabled());
    if (hasDescription()) {
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.postman.Header parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.postman.Header parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.postman.Header parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.postman.Header parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.postman.Header parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.postman.Header parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.postman.Header parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.postman.Header parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.postman.Header parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.postman.Header parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.postman.Header parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.postman.Header parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.mojolang.mojo.postman.Header prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code mojo.postman.Header}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.postman.Header)
      org.mojolang.mojo.postman.HeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.postman.HeaderProto.internal_static_mojo_postman_Header_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.postman.HeaderProto.internal_static_mojo_postman_Header_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.postman.Header.class, org.mojolang.mojo.postman.Header.Builder.class);
    }

    // Construct using org.mojolang.mojo.postman.Header.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      key_ = "";
      value_ = "";
      disabled_ = false;
      description_ = null;
      if (descriptionBuilder_ != null) {
        descriptionBuilder_.dispose();
        descriptionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.postman.HeaderProto.internal_static_mojo_postman_Header_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.postman.Header getDefaultInstanceForType() {
      return org.mojolang.mojo.postman.Header.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.postman.Header build() {
      org.mojolang.mojo.postman.Header result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.postman.Header buildPartial() {
      org.mojolang.mojo.postman.Header result = new org.mojolang.mojo.postman.Header(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.mojolang.mojo.postman.Header result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = value_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.disabled_ = disabled_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.description_ = descriptionBuilder_ == null
            ? description_
            : descriptionBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.mojolang.mojo.postman.Header) {
        return mergeFrom((org.mojolang.mojo.postman.Header)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.postman.Header other) {
      if (other == org.mojolang.mojo.postman.Header.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getDisabled() != false) {
        setDisabled(other.getDisabled());
      }
      if (other.hasDescription()) {
        mergeDescription(other.getDescription());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              key_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              value_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              disabled_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getDescriptionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object key_ = "";
    /**
     * <code>string key = 1;</code>
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string key = 1;</code>
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string key = 1;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      key_ = getDefaultInstance().getKey();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1;</code>
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <code>string value = 2;</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string value = 2;</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string value = 2;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      value_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = getDefaultInstance().getValue();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string value = 2;</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      value_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean disabled_ ;
    /**
     * <code>bool disabled = 3;</code>
     * @return The disabled.
     */
    @java.lang.Override
    public boolean getDisabled() {
      return disabled_;
    }
    /**
     * <code>bool disabled = 3;</code>
     * @param value The disabled to set.
     * @return This builder for chaining.
     */
    public Builder setDisabled(boolean value) {
      
      disabled_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool disabled = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisabled() {
      bitField0_ = (bitField0_ & ~0x00000004);
      disabled_ = false;
      onChanged();
      return this;
    }

    private org.mojolang.mojo.postman.Description description_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.postman.Description, org.mojolang.mojo.postman.Description.Builder, org.mojolang.mojo.postman.DescriptionOrBuilder> descriptionBuilder_;
    /**
     * <code>.mojo.postman.Description description = 4;</code>
     * @return Whether the description field is set.
     */
    public boolean hasDescription() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.mojo.postman.Description description = 4;</code>
     * @return The description.
     */
    public org.mojolang.mojo.postman.Description getDescription() {
      if (descriptionBuilder_ == null) {
        return description_ == null ? org.mojolang.mojo.postman.Description.getDefaultInstance() : description_;
      } else {
        return descriptionBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.postman.Description description = 4;</code>
     */
    public Builder setDescription(org.mojolang.mojo.postman.Description value) {
      if (descriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        description_ = value;
      } else {
        descriptionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.postman.Description description = 4;</code>
     */
    public Builder setDescription(
        org.mojolang.mojo.postman.Description.Builder builderForValue) {
      if (descriptionBuilder_ == null) {
        description_ = builderForValue.build();
      } else {
        descriptionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.postman.Description description = 4;</code>
     */
    public Builder mergeDescription(org.mojolang.mojo.postman.Description value) {
      if (descriptionBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          description_ != null &&
          description_ != org.mojolang.mojo.postman.Description.getDefaultInstance()) {
          getDescriptionBuilder().mergeFrom(value);
        } else {
          description_ = value;
        }
      } else {
        descriptionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.postman.Description description = 4;</code>
     */
    public Builder clearDescription() {
      bitField0_ = (bitField0_ & ~0x00000008);
      description_ = null;
      if (descriptionBuilder_ != null) {
        descriptionBuilder_.dispose();
        descriptionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.postman.Description description = 4;</code>
     */
    public org.mojolang.mojo.postman.Description.Builder getDescriptionBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getDescriptionFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.postman.Description description = 4;</code>
     */
    public org.mojolang.mojo.postman.DescriptionOrBuilder getDescriptionOrBuilder() {
      if (descriptionBuilder_ != null) {
        return descriptionBuilder_.getMessageOrBuilder();
      } else {
        return description_ == null ?
            org.mojolang.mojo.postman.Description.getDefaultInstance() : description_;
      }
    }
    /**
     * <code>.mojo.postman.Description description = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.postman.Description, org.mojolang.mojo.postman.Description.Builder, org.mojolang.mojo.postman.DescriptionOrBuilder> 
        getDescriptionFieldBuilder() {
      if (descriptionBuilder_ == null) {
        descriptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.postman.Description, org.mojolang.mojo.postman.Description.Builder, org.mojolang.mojo.postman.DescriptionOrBuilder>(
                getDescription(),
                getParentForChildren(),
                isClean());
        description_ = null;
      }
      return descriptionBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:mojo.postman.Header)
  }

  // @@protoc_insertion_point(class_scope:mojo.postman.Header)
  private static final org.mojolang.mojo.postman.Header DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.postman.Header();
  }

  public static org.mojolang.mojo.postman.Header getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Header>
      PARSER = new com.google.protobuf.AbstractParser<Header>() {
    @java.lang.Override
    public Header parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Header> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Header> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.postman.Header getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

