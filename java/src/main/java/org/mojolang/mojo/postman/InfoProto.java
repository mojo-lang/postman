// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/postman/info.proto

package org.mojolang.mojo.postman;

public final class InfoProto {
  private InfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_postman_Info_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_postman_Info_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027mojo/postman/info.proto\022\014mojo.postman\032" +
      "\027mojo/core/version.proto\032\017mojo/mojo.prot" +
      "o\032\036mojo/postman/description.proto\"\236\001\n\004In" +
      "fo\022\014\n\004name\030\001 \001(\t\022#\n\npostman_id\030\002 \001(\tB\017\312\317" +
      "$\013_postman_id\022.\n\013description\030\003 \001(\0132\031.moj" +
      "o.postman.Description\022#\n\007version\030\005 \001(\0132\022" +
      ".mojo.core.Version\022\016\n\006schema\030\006 \001(\tBb\n\031or" +
      "g.mojolang.mojo.postmanB\tInfoProtoP\001Z8gi" +
      "thub.com/mojo-lang/postman/go/pkg/mojo/p" +
      "ostman;postmanb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.core.VersionProto.getDescriptor(),
          com.google.protobuf.MojoProtos.getDescriptor(),
          org.mojolang.mojo.postman.DescriptionProto.getDescriptor(),
        });
    internal_static_mojo_postman_Info_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_postman_Info_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_postman_Info_descriptor,
        new java.lang.String[] { "Name", "PostmanId", "Description", "Version", "Schema", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.MojoProtos.alias);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.mojolang.mojo.core.VersionProto.getDescriptor();
    com.google.protobuf.MojoProtos.getDescriptor();
    org.mojolang.mojo.postman.DescriptionProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
