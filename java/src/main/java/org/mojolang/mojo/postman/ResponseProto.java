// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/postman/response.proto

package org.mojolang.mojo.postman;

public final class ResponseProto {
  private ResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_postman_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_postman_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033mojo/postman/response.proto\022\014mojo.post" +
      "man\032\025mojo/core/value.proto\032\031mojo/postman" +
      "/header.proto\032\032mojo/postman/request.prot" +
      "o\"\324\001\n\010Response\022\n\n\002id\030\001 \001(\t\022/\n\020original_r" +
      "equest\030\002 \001(\0132\025.mojo.postman.Request\022\025\n\rr" +
      "esponse_time\030\003 \001(\005\022\"\n\007timings\030\004 \001(\0132\021.mo" +
      "jo.core.Object\022$\n\006header\030\005 \003(\0132\024.mojo.po" +
      "stman.Header\022\014\n\004body\030\n \001(\t\022\016\n\006status\030\013 \001" +
      "(\t\022\014\n\004code\030\014 \001(\005Bf\n\031org.mojolang.mojo.po" +
      "stmanB\rResponseProtoP\001Z8github.com/mojo-" +
      "lang/postman/go/pkg/mojo/postman;postman" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.core.ValueProto.getDescriptor(),
          org.mojolang.mojo.postman.HeaderProto.getDescriptor(),
          org.mojolang.mojo.postman.RequestProto.getDescriptor(),
        });
    internal_static_mojo_postman_Response_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_postman_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_postman_Response_descriptor,
        new java.lang.String[] { "Id", "OriginalRequest", "ResponseTime", "Timings", "Header", "Body", "Status", "Code", });
    org.mojolang.mojo.core.ValueProto.getDescriptor();
    org.mojolang.mojo.postman.HeaderProto.getDescriptor();
    org.mojolang.mojo.postman.RequestProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
