// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qpstest.proto

package io.grpc.testing;

/**
 * Protobuf type {@code grpc.testing.SimpleResponse}
 */
public  final class SimpleResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:grpc.testing.SimpleResponse)
    SimpleResponseOrBuilder {
  // Use SimpleResponse.newBuilder() to construct.
  private SimpleResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SimpleResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SimpleResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            io.grpc.testing.Payload.Builder subBuilder = null;
            if (payload_ != null) {
              subBuilder = payload_.toBuilder();
            }
            payload_ = input.readMessage(io.grpc.testing.Payload.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(payload_);
              payload_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_SimpleResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_SimpleResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.testing.SimpleResponse.class, io.grpc.testing.SimpleResponse.Builder.class);
  }

  public static final int PAYLOAD_FIELD_NUMBER = 1;
  private io.grpc.testing.Payload payload_;
  /**
   * <code>optional .grpc.testing.Payload payload = 1;</code>
   */
  public boolean hasPayload() {
    return payload_ != null;
  }
  /**
   * <code>optional .grpc.testing.Payload payload = 1;</code>
   */
  public io.grpc.testing.Payload getPayload() {
    return payload_ == null ? io.grpc.testing.Payload.getDefaultInstance() : payload_;
  }
  /**
   * <code>optional .grpc.testing.Payload payload = 1;</code>
   */
  public io.grpc.testing.PayloadOrBuilder getPayloadOrBuilder() {
    return getPayload();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (payload_ != null) {
      output.writeMessage(1, getPayload());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (payload_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPayload());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.grpc.testing.SimpleResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.testing.SimpleResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.testing.SimpleResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.testing.SimpleResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.testing.SimpleResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.testing.SimpleResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.grpc.testing.SimpleResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.grpc.testing.SimpleResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.grpc.testing.SimpleResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.testing.SimpleResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.testing.SimpleResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code grpc.testing.SimpleResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.testing.SimpleResponse)
      io.grpc.testing.SimpleResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_SimpleResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_SimpleResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.testing.SimpleResponse.class, io.grpc.testing.SimpleResponse.Builder.class);
    }

    // Construct using io.grpc.testing.SimpleResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (payloadBuilder_ == null) {
        payload_ = null;
      } else {
        payload_ = null;
        payloadBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_SimpleResponse_descriptor;
    }

    public io.grpc.testing.SimpleResponse getDefaultInstanceForType() {
      return io.grpc.testing.SimpleResponse.getDefaultInstance();
    }

    public io.grpc.testing.SimpleResponse build() {
      io.grpc.testing.SimpleResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.testing.SimpleResponse buildPartial() {
      io.grpc.testing.SimpleResponse result = new io.grpc.testing.SimpleResponse(this);
      if (payloadBuilder_ == null) {
        result.payload_ = payload_;
      } else {
        result.payload_ = payloadBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.testing.SimpleResponse) {
        return mergeFrom((io.grpc.testing.SimpleResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.testing.SimpleResponse other) {
      if (other == io.grpc.testing.SimpleResponse.getDefaultInstance()) return this;
      if (other.hasPayload()) {
        mergePayload(other.getPayload());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.testing.SimpleResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.testing.SimpleResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grpc.testing.Payload payload_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        io.grpc.testing.Payload, io.grpc.testing.Payload.Builder, io.grpc.testing.PayloadOrBuilder> payloadBuilder_;
    /**
     * <code>optional .grpc.testing.Payload payload = 1;</code>
     */
    public boolean hasPayload() {
      return payloadBuilder_ != null || payload_ != null;
    }
    /**
     * <code>optional .grpc.testing.Payload payload = 1;</code>
     */
    public io.grpc.testing.Payload getPayload() {
      if (payloadBuilder_ == null) {
        return payload_ == null ? io.grpc.testing.Payload.getDefaultInstance() : payload_;
      } else {
        return payloadBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .grpc.testing.Payload payload = 1;</code>
     */
    public Builder setPayload(io.grpc.testing.Payload value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
        onChanged();
      } else {
        payloadBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .grpc.testing.Payload payload = 1;</code>
     */
    public Builder setPayload(
        io.grpc.testing.Payload.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        payload_ = builderForValue.build();
        onChanged();
      } else {
        payloadBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .grpc.testing.Payload payload = 1;</code>
     */
    public Builder mergePayload(io.grpc.testing.Payload value) {
      if (payloadBuilder_ == null) {
        if (payload_ != null) {
          payload_ =
            io.grpc.testing.Payload.newBuilder(payload_).mergeFrom(value).buildPartial();
        } else {
          payload_ = value;
        }
        onChanged();
      } else {
        payloadBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .grpc.testing.Payload payload = 1;</code>
     */
    public Builder clearPayload() {
      if (payloadBuilder_ == null) {
        payload_ = null;
        onChanged();
      } else {
        payload_ = null;
        payloadBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .grpc.testing.Payload payload = 1;</code>
     */
    public io.grpc.testing.Payload.Builder getPayloadBuilder() {
      
      onChanged();
      return getPayloadFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .grpc.testing.Payload payload = 1;</code>
     */
    public io.grpc.testing.PayloadOrBuilder getPayloadOrBuilder() {
      if (payloadBuilder_ != null) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        return payload_ == null ?
            io.grpc.testing.Payload.getDefaultInstance() : payload_;
      }
    }
    /**
     * <code>optional .grpc.testing.Payload payload = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        io.grpc.testing.Payload, io.grpc.testing.Payload.Builder, io.grpc.testing.PayloadOrBuilder> 
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        payloadBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            io.grpc.testing.Payload, io.grpc.testing.Payload.Builder, io.grpc.testing.PayloadOrBuilder>(
                getPayload(),
                getParentForChildren(),
                isClean());
        payload_ = null;
      }
      return payloadBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.testing.SimpleResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.testing.SimpleResponse)
  private static final io.grpc.testing.SimpleResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.testing.SimpleResponse();
  }

  public static io.grpc.testing.SimpleResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SimpleResponse>
      PARSER = new com.google.protobuf.AbstractParser<SimpleResponse>() {
    public SimpleResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new SimpleResponse(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<SimpleResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SimpleResponse> getParserForType() {
    return PARSER;
  }

  public io.grpc.testing.SimpleResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

