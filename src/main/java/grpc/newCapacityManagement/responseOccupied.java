// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: newCapacityManagement.proto

package grpc.newCapacityManagement;

/**
 * Protobuf type {@code responseOccupied}
 */
public  final class responseOccupied extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:responseOccupied)
    responseOccupiedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use responseOccupied.newBuilder() to construct.
  private responseOccupied(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private responseOccupied() {
    firstInt_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private responseOccupied(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            firstInt_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.newCapacityManagement.NewCapacityManagementImpl.internal_static_responseOccupied_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.newCapacityManagement.NewCapacityManagementImpl.internal_static_responseOccupied_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.newCapacityManagement.responseOccupied.class, grpc.newCapacityManagement.responseOccupied.Builder.class);
  }

  public static final int FIRSTINT_FIELD_NUMBER = 1;
  private int firstInt_;
  /**
   * <code>int32 firstInt = 1;</code>
   */
  public int getFirstInt() {
    return firstInt_;
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
    if (firstInt_ != 0) {
      output.writeInt32(1, firstInt_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (firstInt_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, firstInt_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.newCapacityManagement.responseOccupied)) {
      return super.equals(obj);
    }
    grpc.newCapacityManagement.responseOccupied other = (grpc.newCapacityManagement.responseOccupied) obj;

    boolean result = true;
    result = result && (getFirstInt()
        == other.getFirstInt());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FIRSTINT_FIELD_NUMBER;
    hash = (53 * hash) + getFirstInt();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.newCapacityManagement.responseOccupied parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.newCapacityManagement.responseOccupied parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.newCapacityManagement.responseOccupied parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.newCapacityManagement.responseOccupied parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.newCapacityManagement.responseOccupied parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.newCapacityManagement.responseOccupied parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.newCapacityManagement.responseOccupied parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.newCapacityManagement.responseOccupied parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.newCapacityManagement.responseOccupied parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.newCapacityManagement.responseOccupied parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.newCapacityManagement.responseOccupied parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.newCapacityManagement.responseOccupied parseFrom(
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
  public static Builder newBuilder(grpc.newCapacityManagement.responseOccupied prototype) {
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
   * Protobuf type {@code responseOccupied}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:responseOccupied)
      grpc.newCapacityManagement.responseOccupiedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.newCapacityManagement.NewCapacityManagementImpl.internal_static_responseOccupied_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.newCapacityManagement.NewCapacityManagementImpl.internal_static_responseOccupied_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.newCapacityManagement.responseOccupied.class, grpc.newCapacityManagement.responseOccupied.Builder.class);
    }

    // Construct using grpc.newCapacityManagement.responseOccupied.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      firstInt_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.newCapacityManagement.NewCapacityManagementImpl.internal_static_responseOccupied_descriptor;
    }

    @java.lang.Override
    public grpc.newCapacityManagement.responseOccupied getDefaultInstanceForType() {
      return grpc.newCapacityManagement.responseOccupied.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.newCapacityManagement.responseOccupied build() {
      grpc.newCapacityManagement.responseOccupied result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.newCapacityManagement.responseOccupied buildPartial() {
      grpc.newCapacityManagement.responseOccupied result = new grpc.newCapacityManagement.responseOccupied(this);
      result.firstInt_ = firstInt_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.newCapacityManagement.responseOccupied) {
        return mergeFrom((grpc.newCapacityManagement.responseOccupied)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.newCapacityManagement.responseOccupied other) {
      if (other == grpc.newCapacityManagement.responseOccupied.getDefaultInstance()) return this;
      if (other.getFirstInt() != 0) {
        setFirstInt(other.getFirstInt());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      grpc.newCapacityManagement.responseOccupied parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.newCapacityManagement.responseOccupied) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int firstInt_ ;
    /**
     * <code>int32 firstInt = 1;</code>
     */
    public int getFirstInt() {
      return firstInt_;
    }
    /**
     * <code>int32 firstInt = 1;</code>
     */
    public Builder setFirstInt(int value) {
      
      firstInt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 firstInt = 1;</code>
     */
    public Builder clearFirstInt() {
      
      firstInt_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:responseOccupied)
  }

  // @@protoc_insertion_point(class_scope:responseOccupied)
  private static final grpc.newCapacityManagement.responseOccupied DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.newCapacityManagement.responseOccupied();
  }

  public static grpc.newCapacityManagement.responseOccupied getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<responseOccupied>
      PARSER = new com.google.protobuf.AbstractParser<responseOccupied>() {
    @java.lang.Override
    public responseOccupied parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new responseOccupied(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<responseOccupied> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<responseOccupied> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.newCapacityManagement.responseOccupied getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

