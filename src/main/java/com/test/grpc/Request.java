// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protoc-27.2-win64/envelope.proto
// Protobuf Java Version: 4.27.2

package com.test.grpc;

/**
 * <pre>
 * Request message for initiating message streaming
 * </pre>
 *
 * Protobuf type {@code messaging.Request}
 */
public final class Request extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:messaging.Request)
    RequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      Request.class.getName());
  }
  // Use Request.newBuilder() to construct.
  private Request(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Request() {
    filterType_ = "";
    sourceFilter_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.test.grpc.EnvelopeProto.internal_static_messaging_Request_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.test.grpc.EnvelopeProto.internal_static_messaging_Request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.test.grpc.Request.class, com.test.grpc.Request.Builder.class);
  }

  public static final int FILTER_TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object filterType_ = "";
  /**
   * <code>string filter_type = 1;</code>
   * @return The filterType.
   */
  @java.lang.Override
  public java.lang.String getFilterType() {
    java.lang.Object ref = filterType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filterType_ = s;
      return s;
    }
  }
  /**
   * <code>string filter_type = 1;</code>
   * @return The bytes for filterType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFilterTypeBytes() {
    java.lang.Object ref = filterType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filterType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_FILTER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sourceFilter_ = "";
  /**
   * <code>string source_filter = 2;</code>
   * @return The sourceFilter.
   */
  @java.lang.Override
  public java.lang.String getSourceFilter() {
    java.lang.Object ref = sourceFilter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceFilter_ = s;
      return s;
    }
  }
  /**
   * <code>string source_filter = 2;</code>
   * @return The bytes for sourceFilter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceFilterBytes() {
    java.lang.Object ref = sourceFilter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sourceFilter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(filterType_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, filterType_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(sourceFilter_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, sourceFilter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(filterType_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, filterType_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(sourceFilter_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, sourceFilter_);
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
    if (!(obj instanceof com.test.grpc.Request)) {
      return super.equals(obj);
    }
    com.test.grpc.Request other = (com.test.grpc.Request) obj;

    if (!getFilterType()
        .equals(other.getFilterType())) return false;
    if (!getSourceFilter()
        .equals(other.getSourceFilter())) return false;
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
    hash = (37 * hash) + FILTER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getFilterType().hashCode();
    hash = (37 * hash) + SOURCE_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getSourceFilter().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.test.grpc.Request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.test.grpc.Request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.test.grpc.Request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.test.grpc.Request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.test.grpc.Request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.test.grpc.Request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.test.grpc.Request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.test.grpc.Request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.test.grpc.Request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.test.grpc.Request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.test.grpc.Request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.test.grpc.Request parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.test.grpc.Request prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for initiating message streaming
   * </pre>
   *
   * Protobuf type {@code messaging.Request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:messaging.Request)
      com.test.grpc.RequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.test.grpc.EnvelopeProto.internal_static_messaging_Request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.test.grpc.EnvelopeProto.internal_static_messaging_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.test.grpc.Request.class, com.test.grpc.Request.Builder.class);
    }

    // Construct using com.test.grpc.Request.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      filterType_ = "";
      sourceFilter_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.test.grpc.EnvelopeProto.internal_static_messaging_Request_descriptor;
    }

    @java.lang.Override
    public com.test.grpc.Request getDefaultInstanceForType() {
      return com.test.grpc.Request.getDefaultInstance();
    }

    @java.lang.Override
    public com.test.grpc.Request build() {
      com.test.grpc.Request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.test.grpc.Request buildPartial() {
      com.test.grpc.Request result = new com.test.grpc.Request(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.test.grpc.Request result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.filterType_ = filterType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sourceFilter_ = sourceFilter_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.test.grpc.Request) {
        return mergeFrom((com.test.grpc.Request)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.test.grpc.Request other) {
      if (other == com.test.grpc.Request.getDefaultInstance()) return this;
      if (!other.getFilterType().isEmpty()) {
        filterType_ = other.filterType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSourceFilter().isEmpty()) {
        sourceFilter_ = other.sourceFilter_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              filterType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              sourceFilter_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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
    private int bitField0_;

    private java.lang.Object filterType_ = "";
    /**
     * <code>string filter_type = 1;</code>
     * @return The filterType.
     */
    public java.lang.String getFilterType() {
      java.lang.Object ref = filterType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filterType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string filter_type = 1;</code>
     * @return The bytes for filterType.
     */
    public com.google.protobuf.ByteString
        getFilterTypeBytes() {
      java.lang.Object ref = filterType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filterType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string filter_type = 1;</code>
     * @param value The filterType to set.
     * @return This builder for chaining.
     */
    public Builder setFilterType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      filterType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string filter_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilterType() {
      filterType_ = getDefaultInstance().getFilterType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string filter_type = 1;</code>
     * @param value The bytes for filterType to set.
     * @return This builder for chaining.
     */
    public Builder setFilterTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      filterType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object sourceFilter_ = "";
    /**
     * <code>string source_filter = 2;</code>
     * @return The sourceFilter.
     */
    public java.lang.String getSourceFilter() {
      java.lang.Object ref = sourceFilter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceFilter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string source_filter = 2;</code>
     * @return The bytes for sourceFilter.
     */
    public com.google.protobuf.ByteString
        getSourceFilterBytes() {
      java.lang.Object ref = sourceFilter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourceFilter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string source_filter = 2;</code>
     * @param value The sourceFilter to set.
     * @return This builder for chaining.
     */
    public Builder setSourceFilter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sourceFilter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string source_filter = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceFilter() {
      sourceFilter_ = getDefaultInstance().getSourceFilter();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string source_filter = 2;</code>
     * @param value The bytes for sourceFilter to set.
     * @return This builder for chaining.
     */
    public Builder setSourceFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sourceFilter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:messaging.Request)
  }

  // @@protoc_insertion_point(class_scope:messaging.Request)
  private static final com.test.grpc.Request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.test.grpc.Request();
  }

  public static com.test.grpc.Request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Request>
      PARSER = new com.google.protobuf.AbstractParser<Request>() {
    @java.lang.Override
    public Request parsePartialFrom(
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

  public static com.google.protobuf.Parser<Request> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Request> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.test.grpc.Request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
