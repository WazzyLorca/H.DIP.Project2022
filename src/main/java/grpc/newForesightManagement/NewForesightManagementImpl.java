// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: newForesightManagement.proto

package grpc.newForesightManagement;

public final class NewForesightManagementImpl {
  private NewForesightManagementImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_containsString_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_containsString_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034newForesightManagement.proto\"%\n\016contai" +
      "nsString\022\023\n\013firstString\030\001 \001(\t2\275\001\n\026newFor" +
      "esightManagement\0229\n\021SendDecibelLevels\022\017." +
      "containsString\032\017.containsString\"\000(\001\0223\n\tC" +
      "o2Levels\022\017.containsString\032\017.containsStri" +
      "ng\"\000(\0010\001\0223\n\tElecUsage\022\017.containsString\032\017" +
      ".containsString\"\000(\0010\001B;\n\033grpc.newForesig" +
      "htManagementB\032NewForesightManagementImpl" +
      "P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_containsString_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_containsString_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_containsString_descriptor,
        new java.lang.String[] { "FirstString", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
