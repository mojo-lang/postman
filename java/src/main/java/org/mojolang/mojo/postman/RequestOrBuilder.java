// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/postman/request.proto

package org.mojolang.mojo.postman;

public interface RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.postman.Request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.mojo.postman.Url url = 1;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <code>.mojo.postman.Url url = 1;</code>
   * @return The url.
   */
  org.mojolang.mojo.postman.Url getUrl();
  /**
   * <code>.mojo.postman.Url url = 1;</code>
   */
  org.mojolang.mojo.postman.UrlOrBuilder getUrlOrBuilder();

  /**
   * <code>string method = 3;</code>
   * @return The method.
   */
  java.lang.String getMethod();
  /**
   * <code>string method = 3;</code>
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString
      getMethodBytes();

  /**
   * <code>.mojo.postman.Description description = 4;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>.mojo.postman.Description description = 4;</code>
   * @return The description.
   */
  org.mojolang.mojo.postman.Description getDescription();
  /**
   * <code>.mojo.postman.Description description = 4;</code>
   */
  org.mojolang.mojo.postman.DescriptionOrBuilder getDescriptionOrBuilder();

  /**
   * <code>repeated .mojo.postman.Header header = 5;</code>
   */
  java.util.List<org.mojolang.mojo.postman.Header> 
      getHeaderList();
  /**
   * <code>repeated .mojo.postman.Header header = 5;</code>
   */
  org.mojolang.mojo.postman.Header getHeader(int index);
  /**
   * <code>repeated .mojo.postman.Header header = 5;</code>
   */
  int getHeaderCount();
  /**
   * <code>repeated .mojo.postman.Header header = 5;</code>
   */
  java.util.List<? extends org.mojolang.mojo.postman.HeaderOrBuilder> 
      getHeaderOrBuilderList();
  /**
   * <code>repeated .mojo.postman.Header header = 5;</code>
   */
  org.mojolang.mojo.postman.HeaderOrBuilder getHeaderOrBuilder(
      int index);

  /**
   * <code>.mojo.postman.Request.Body body = 8;</code>
   * @return Whether the body field is set.
   */
  boolean hasBody();
  /**
   * <code>.mojo.postman.Request.Body body = 8;</code>
   * @return The body.
   */
  org.mojolang.mojo.postman.Request.Body getBody();
  /**
   * <code>.mojo.postman.Request.Body body = 8;</code>
   */
  org.mojolang.mojo.postman.Request.BodyOrBuilder getBodyOrBuilder();
}
