// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/postman/postman.proto

package org.mojolang.mojo.postman;

/**
 * Protobuf type {@code mojo.postman.CollectionItem}
 */
public final class CollectionItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.postman.CollectionItem)
    CollectionItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CollectionItem.newBuilder() to construct.
  private CollectionItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CollectionItem() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CollectionItem();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.postman.PostmanProto.internal_static_mojo_postman_CollectionItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.postman.PostmanProto.internal_static_mojo_postman_CollectionItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.postman.CollectionItem.class, org.mojolang.mojo.postman.CollectionItem.Builder.class);
  }

  private int collectionItemCase_ = 0;
  private java.lang.Object collectionItem_;
  public enum CollectionItemCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ITEM_VAL(1),
    ITEM_GROUP_VAL(2),
    COLLECTIONITEM_NOT_SET(0);
    private final int value;
    private CollectionItemCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CollectionItemCase valueOf(int value) {
      return forNumber(value);
    }

    public static CollectionItemCase forNumber(int value) {
      switch (value) {
        case 1: return ITEM_VAL;
        case 2: return ITEM_GROUP_VAL;
        case 0: return COLLECTIONITEM_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public CollectionItemCase
  getCollectionItemCase() {
    return CollectionItemCase.forNumber(
        collectionItemCase_);
  }

  public static final int ITEM_VAL_FIELD_NUMBER = 1;
  /**
   * <code>.mojo.postman.Item item_val = 1;</code>
   * @return Whether the itemVal field is set.
   */
  @java.lang.Override
  public boolean hasItemVal() {
    return collectionItemCase_ == 1;
  }
  /**
   * <code>.mojo.postman.Item item_val = 1;</code>
   * @return The itemVal.
   */
  @java.lang.Override
  public org.mojolang.mojo.postman.Item getItemVal() {
    if (collectionItemCase_ == 1) {
       return (org.mojolang.mojo.postman.Item) collectionItem_;
    }
    return org.mojolang.mojo.postman.Item.getDefaultInstance();
  }
  /**
   * <code>.mojo.postman.Item item_val = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.postman.ItemOrBuilder getItemValOrBuilder() {
    if (collectionItemCase_ == 1) {
       return (org.mojolang.mojo.postman.Item) collectionItem_;
    }
    return org.mojolang.mojo.postman.Item.getDefaultInstance();
  }

  public static final int ITEM_GROUP_VAL_FIELD_NUMBER = 2;
  /**
   * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
   * @return Whether the itemGroupVal field is set.
   */
  @java.lang.Override
  public boolean hasItemGroupVal() {
    return collectionItemCase_ == 2;
  }
  /**
   * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
   * @return The itemGroupVal.
   */
  @java.lang.Override
  public org.mojolang.mojo.postman.ItemGroup getItemGroupVal() {
    if (collectionItemCase_ == 2) {
       return (org.mojolang.mojo.postman.ItemGroup) collectionItem_;
    }
    return org.mojolang.mojo.postman.ItemGroup.getDefaultInstance();
  }
  /**
   * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.postman.ItemGroupOrBuilder getItemGroupValOrBuilder() {
    if (collectionItemCase_ == 2) {
       return (org.mojolang.mojo.postman.ItemGroup) collectionItem_;
    }
    return org.mojolang.mojo.postman.ItemGroup.getDefaultInstance();
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
    if (collectionItemCase_ == 1) {
      output.writeMessage(1, (org.mojolang.mojo.postman.Item) collectionItem_);
    }
    if (collectionItemCase_ == 2) {
      output.writeMessage(2, (org.mojolang.mojo.postman.ItemGroup) collectionItem_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (collectionItemCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.mojolang.mojo.postman.Item) collectionItem_);
    }
    if (collectionItemCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.mojolang.mojo.postman.ItemGroup) collectionItem_);
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
    if (!(obj instanceof org.mojolang.mojo.postman.CollectionItem)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.postman.CollectionItem other = (org.mojolang.mojo.postman.CollectionItem) obj;

    if (!getCollectionItemCase().equals(other.getCollectionItemCase())) return false;
    switch (collectionItemCase_) {
      case 1:
        if (!getItemVal()
            .equals(other.getItemVal())) return false;
        break;
      case 2:
        if (!getItemGroupVal()
            .equals(other.getItemGroupVal())) return false;
        break;
      case 0:
      default:
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
    switch (collectionItemCase_) {
      case 1:
        hash = (37 * hash) + ITEM_VAL_FIELD_NUMBER;
        hash = (53 * hash) + getItemVal().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ITEM_GROUP_VAL_FIELD_NUMBER;
        hash = (53 * hash) + getItemGroupVal().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.postman.CollectionItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.postman.CollectionItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.postman.CollectionItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.postman.CollectionItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.postman.CollectionItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.postman.CollectionItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.postman.CollectionItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.postman.CollectionItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.postman.CollectionItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.postman.CollectionItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.postman.CollectionItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.postman.CollectionItem parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.postman.CollectionItem prototype) {
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
   * Protobuf type {@code mojo.postman.CollectionItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.postman.CollectionItem)
      org.mojolang.mojo.postman.CollectionItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.postman.PostmanProto.internal_static_mojo_postman_CollectionItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.postman.PostmanProto.internal_static_mojo_postman_CollectionItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.postman.CollectionItem.class, org.mojolang.mojo.postman.CollectionItem.Builder.class);
    }

    // Construct using org.mojolang.mojo.postman.CollectionItem.newBuilder()
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
      if (itemValBuilder_ != null) {
        itemValBuilder_.clear();
      }
      if (itemGroupValBuilder_ != null) {
        itemGroupValBuilder_.clear();
      }
      collectionItemCase_ = 0;
      collectionItem_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.postman.PostmanProto.internal_static_mojo_postman_CollectionItem_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.postman.CollectionItem getDefaultInstanceForType() {
      return org.mojolang.mojo.postman.CollectionItem.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.postman.CollectionItem build() {
      org.mojolang.mojo.postman.CollectionItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.postman.CollectionItem buildPartial() {
      org.mojolang.mojo.postman.CollectionItem result = new org.mojolang.mojo.postman.CollectionItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(org.mojolang.mojo.postman.CollectionItem result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(org.mojolang.mojo.postman.CollectionItem result) {
      result.collectionItemCase_ = collectionItemCase_;
      result.collectionItem_ = this.collectionItem_;
      if (collectionItemCase_ == 1 &&
          itemValBuilder_ != null) {
        result.collectionItem_ = itemValBuilder_.build();
      }
      if (collectionItemCase_ == 2 &&
          itemGroupValBuilder_ != null) {
        result.collectionItem_ = itemGroupValBuilder_.build();
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
      if (other instanceof org.mojolang.mojo.postman.CollectionItem) {
        return mergeFrom((org.mojolang.mojo.postman.CollectionItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.postman.CollectionItem other) {
      if (other == org.mojolang.mojo.postman.CollectionItem.getDefaultInstance()) return this;
      switch (other.getCollectionItemCase()) {
        case ITEM_VAL: {
          mergeItemVal(other.getItemVal());
          break;
        }
        case ITEM_GROUP_VAL: {
          mergeItemGroupVal(other.getItemGroupVal());
          break;
        }
        case COLLECTIONITEM_NOT_SET: {
          break;
        }
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
              input.readMessage(
                  getItemValFieldBuilder().getBuilder(),
                  extensionRegistry);
              collectionItemCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getItemGroupValFieldBuilder().getBuilder(),
                  extensionRegistry);
              collectionItemCase_ = 2;
              break;
            } // case 18
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
    private int collectionItemCase_ = 0;
    private java.lang.Object collectionItem_;
    public CollectionItemCase
        getCollectionItemCase() {
      return CollectionItemCase.forNumber(
          collectionItemCase_);
    }

    public Builder clearCollectionItem() {
      collectionItemCase_ = 0;
      collectionItem_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.postman.Item, org.mojolang.mojo.postman.Item.Builder, org.mojolang.mojo.postman.ItemOrBuilder> itemValBuilder_;
    /**
     * <code>.mojo.postman.Item item_val = 1;</code>
     * @return Whether the itemVal field is set.
     */
    @java.lang.Override
    public boolean hasItemVal() {
      return collectionItemCase_ == 1;
    }
    /**
     * <code>.mojo.postman.Item item_val = 1;</code>
     * @return The itemVal.
     */
    @java.lang.Override
    public org.mojolang.mojo.postman.Item getItemVal() {
      if (itemValBuilder_ == null) {
        if (collectionItemCase_ == 1) {
          return (org.mojolang.mojo.postman.Item) collectionItem_;
        }
        return org.mojolang.mojo.postman.Item.getDefaultInstance();
      } else {
        if (collectionItemCase_ == 1) {
          return itemValBuilder_.getMessage();
        }
        return org.mojolang.mojo.postman.Item.getDefaultInstance();
      }
    }
    /**
     * <code>.mojo.postman.Item item_val = 1;</code>
     */
    public Builder setItemVal(org.mojolang.mojo.postman.Item value) {
      if (itemValBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        collectionItem_ = value;
        onChanged();
      } else {
        itemValBuilder_.setMessage(value);
      }
      collectionItemCase_ = 1;
      return this;
    }
    /**
     * <code>.mojo.postman.Item item_val = 1;</code>
     */
    public Builder setItemVal(
        org.mojolang.mojo.postman.Item.Builder builderForValue) {
      if (itemValBuilder_ == null) {
        collectionItem_ = builderForValue.build();
        onChanged();
      } else {
        itemValBuilder_.setMessage(builderForValue.build());
      }
      collectionItemCase_ = 1;
      return this;
    }
    /**
     * <code>.mojo.postman.Item item_val = 1;</code>
     */
    public Builder mergeItemVal(org.mojolang.mojo.postman.Item value) {
      if (itemValBuilder_ == null) {
        if (collectionItemCase_ == 1 &&
            collectionItem_ != org.mojolang.mojo.postman.Item.getDefaultInstance()) {
          collectionItem_ = org.mojolang.mojo.postman.Item.newBuilder((org.mojolang.mojo.postman.Item) collectionItem_)
              .mergeFrom(value).buildPartial();
        } else {
          collectionItem_ = value;
        }
        onChanged();
      } else {
        if (collectionItemCase_ == 1) {
          itemValBuilder_.mergeFrom(value);
        } else {
          itemValBuilder_.setMessage(value);
        }
      }
      collectionItemCase_ = 1;
      return this;
    }
    /**
     * <code>.mojo.postman.Item item_val = 1;</code>
     */
    public Builder clearItemVal() {
      if (itemValBuilder_ == null) {
        if (collectionItemCase_ == 1) {
          collectionItemCase_ = 0;
          collectionItem_ = null;
          onChanged();
        }
      } else {
        if (collectionItemCase_ == 1) {
          collectionItemCase_ = 0;
          collectionItem_ = null;
        }
        itemValBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.mojo.postman.Item item_val = 1;</code>
     */
    public org.mojolang.mojo.postman.Item.Builder getItemValBuilder() {
      return getItemValFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.postman.Item item_val = 1;</code>
     */
    @java.lang.Override
    public org.mojolang.mojo.postman.ItemOrBuilder getItemValOrBuilder() {
      if ((collectionItemCase_ == 1) && (itemValBuilder_ != null)) {
        return itemValBuilder_.getMessageOrBuilder();
      } else {
        if (collectionItemCase_ == 1) {
          return (org.mojolang.mojo.postman.Item) collectionItem_;
        }
        return org.mojolang.mojo.postman.Item.getDefaultInstance();
      }
    }
    /**
     * <code>.mojo.postman.Item item_val = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.postman.Item, org.mojolang.mojo.postman.Item.Builder, org.mojolang.mojo.postman.ItemOrBuilder> 
        getItemValFieldBuilder() {
      if (itemValBuilder_ == null) {
        if (!(collectionItemCase_ == 1)) {
          collectionItem_ = org.mojolang.mojo.postman.Item.getDefaultInstance();
        }
        itemValBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.postman.Item, org.mojolang.mojo.postman.Item.Builder, org.mojolang.mojo.postman.ItemOrBuilder>(
                (org.mojolang.mojo.postman.Item) collectionItem_,
                getParentForChildren(),
                isClean());
        collectionItem_ = null;
      }
      collectionItemCase_ = 1;
      onChanged();
      return itemValBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.postman.ItemGroup, org.mojolang.mojo.postman.ItemGroup.Builder, org.mojolang.mojo.postman.ItemGroupOrBuilder> itemGroupValBuilder_;
    /**
     * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
     * @return Whether the itemGroupVal field is set.
     */
    @java.lang.Override
    public boolean hasItemGroupVal() {
      return collectionItemCase_ == 2;
    }
    /**
     * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
     * @return The itemGroupVal.
     */
    @java.lang.Override
    public org.mojolang.mojo.postman.ItemGroup getItemGroupVal() {
      if (itemGroupValBuilder_ == null) {
        if (collectionItemCase_ == 2) {
          return (org.mojolang.mojo.postman.ItemGroup) collectionItem_;
        }
        return org.mojolang.mojo.postman.ItemGroup.getDefaultInstance();
      } else {
        if (collectionItemCase_ == 2) {
          return itemGroupValBuilder_.getMessage();
        }
        return org.mojolang.mojo.postman.ItemGroup.getDefaultInstance();
      }
    }
    /**
     * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
     */
    public Builder setItemGroupVal(org.mojolang.mojo.postman.ItemGroup value) {
      if (itemGroupValBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        collectionItem_ = value;
        onChanged();
      } else {
        itemGroupValBuilder_.setMessage(value);
      }
      collectionItemCase_ = 2;
      return this;
    }
    /**
     * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
     */
    public Builder setItemGroupVal(
        org.mojolang.mojo.postman.ItemGroup.Builder builderForValue) {
      if (itemGroupValBuilder_ == null) {
        collectionItem_ = builderForValue.build();
        onChanged();
      } else {
        itemGroupValBuilder_.setMessage(builderForValue.build());
      }
      collectionItemCase_ = 2;
      return this;
    }
    /**
     * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
     */
    public Builder mergeItemGroupVal(org.mojolang.mojo.postman.ItemGroup value) {
      if (itemGroupValBuilder_ == null) {
        if (collectionItemCase_ == 2 &&
            collectionItem_ != org.mojolang.mojo.postman.ItemGroup.getDefaultInstance()) {
          collectionItem_ = org.mojolang.mojo.postman.ItemGroup.newBuilder((org.mojolang.mojo.postman.ItemGroup) collectionItem_)
              .mergeFrom(value).buildPartial();
        } else {
          collectionItem_ = value;
        }
        onChanged();
      } else {
        if (collectionItemCase_ == 2) {
          itemGroupValBuilder_.mergeFrom(value);
        } else {
          itemGroupValBuilder_.setMessage(value);
        }
      }
      collectionItemCase_ = 2;
      return this;
    }
    /**
     * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
     */
    public Builder clearItemGroupVal() {
      if (itemGroupValBuilder_ == null) {
        if (collectionItemCase_ == 2) {
          collectionItemCase_ = 0;
          collectionItem_ = null;
          onChanged();
        }
      } else {
        if (collectionItemCase_ == 2) {
          collectionItemCase_ = 0;
          collectionItem_ = null;
        }
        itemGroupValBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
     */
    public org.mojolang.mojo.postman.ItemGroup.Builder getItemGroupValBuilder() {
      return getItemGroupValFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
     */
    @java.lang.Override
    public org.mojolang.mojo.postman.ItemGroupOrBuilder getItemGroupValOrBuilder() {
      if ((collectionItemCase_ == 2) && (itemGroupValBuilder_ != null)) {
        return itemGroupValBuilder_.getMessageOrBuilder();
      } else {
        if (collectionItemCase_ == 2) {
          return (org.mojolang.mojo.postman.ItemGroup) collectionItem_;
        }
        return org.mojolang.mojo.postman.ItemGroup.getDefaultInstance();
      }
    }
    /**
     * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.postman.ItemGroup, org.mojolang.mojo.postman.ItemGroup.Builder, org.mojolang.mojo.postman.ItemGroupOrBuilder> 
        getItemGroupValFieldBuilder() {
      if (itemGroupValBuilder_ == null) {
        if (!(collectionItemCase_ == 2)) {
          collectionItem_ = org.mojolang.mojo.postman.ItemGroup.getDefaultInstance();
        }
        itemGroupValBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.postman.ItemGroup, org.mojolang.mojo.postman.ItemGroup.Builder, org.mojolang.mojo.postman.ItemGroupOrBuilder>(
                (org.mojolang.mojo.postman.ItemGroup) collectionItem_,
                getParentForChildren(),
                isClean());
        collectionItem_ = null;
      }
      collectionItemCase_ = 2;
      onChanged();
      return itemGroupValBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.postman.CollectionItem)
  }

  // @@protoc_insertion_point(class_scope:mojo.postman.CollectionItem)
  private static final org.mojolang.mojo.postman.CollectionItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.postman.CollectionItem();
  }

  public static org.mojolang.mojo.postman.CollectionItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CollectionItem>
      PARSER = new com.google.protobuf.AbstractParser<CollectionItem>() {
    @java.lang.Override
    public CollectionItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<CollectionItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CollectionItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.postman.CollectionItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

