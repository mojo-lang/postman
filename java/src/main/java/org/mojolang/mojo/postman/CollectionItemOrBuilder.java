// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/postman/postman.proto

package org.mojolang.mojo.postman;

public interface CollectionItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.postman.CollectionItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.mojo.postman.Item item_val = 1;</code>
   * @return Whether the itemVal field is set.
   */
  boolean hasItemVal();
  /**
   * <code>.mojo.postman.Item item_val = 1;</code>
   * @return The itemVal.
   */
  org.mojolang.mojo.postman.Item getItemVal();
  /**
   * <code>.mojo.postman.Item item_val = 1;</code>
   */
  org.mojolang.mojo.postman.ItemOrBuilder getItemValOrBuilder();

  /**
   * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
   * @return Whether the itemGroupVal field is set.
   */
  boolean hasItemGroupVal();
  /**
   * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
   * @return The itemGroupVal.
   */
  org.mojolang.mojo.postman.ItemGroup getItemGroupVal();
  /**
   * <code>.mojo.postman.ItemGroup item_group_val = 2;</code>
   */
  org.mojolang.mojo.postman.ItemGroupOrBuilder getItemGroupValOrBuilder();

  public org.mojolang.mojo.postman.CollectionItem.CollectionItemCase getCollectionItemCase();
}
