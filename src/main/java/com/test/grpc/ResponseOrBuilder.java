// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protoc-27.2-win64/envelope.proto
// Protobuf Java Version: 4.27.2

package com.test.grpc;

public interface ResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:messaging.Response)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string status = 1;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 1;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}