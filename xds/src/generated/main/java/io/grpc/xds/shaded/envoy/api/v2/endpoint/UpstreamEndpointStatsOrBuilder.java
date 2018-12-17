// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/endpoint/load_report.proto

package io.grpc.xds.shaded.envoy.api.v2.endpoint;

public interface UpstreamEndpointStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.endpoint.UpstreamEndpointStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Upstream host address.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Address address = 1;</code>
   */
  boolean hasAddress();
  /**
   * <pre>
   * Upstream host address.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Address address = 1;</code>
   */
  io.grpc.xds.shaded.envoy.api.v2.core.Address getAddress();
  /**
   * <pre>
   * Upstream host address.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Address address = 1;</code>
   */
  io.grpc.xds.shaded.envoy.api.v2.core.AddressOrBuilder getAddressOrBuilder();

  /**
   * <pre>
   * Opaque and implementation dependent metadata of the
   * endpoint. Envoy will pass this directly to the management server.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 6;</code>
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Opaque and implementation dependent metadata of the
   * endpoint. Envoy will pass this directly to the management server.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 6;</code>
   */
  com.google.protobuf.Struct getMetadata();
  /**
   * <pre>
   * Opaque and implementation dependent metadata of the
   * endpoint. Envoy will pass this directly to the management server.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * The total number of requests successfully completed by the endpoint. A
   * single HTTP or gRPC request or stream is counted as one request. A TCP
   * connection is also treated as one request. There is no explicit
   * total_requests field below for an endpoint, but it may be inferred from:
   * .. code-block:: none
   *   total_requests = total_successful_requests + total_requests_in_progress +
   *     total_error_requests
   * The total number of requests successfully completed by the endpoints in the
   * locality. These include non-5xx responses for HTTP, where errors
   * originate at the client and the endpoint responded successfully. For gRPC,
   * the grpc-status values are those not covered by total_error_requests below.
   * </pre>
   *
   * <code>uint64 total_successful_requests = 2;</code>
   */
  long getTotalSuccessfulRequests();

  /**
   * <pre>
   * The total number of unfinished requests for this endpoint.
   * </pre>
   *
   * <code>uint64 total_requests_in_progress = 3;</code>
   */
  long getTotalRequestsInProgress();

  /**
   * <pre>
   * The total number of requests that failed due to errors at the endpoint.
   * For HTTP these are responses with 5xx status codes and for gRPC the
   * grpc-status values:
   *   - DeadlineExceeded
   *   - Unimplemented
   *   - Internal
   *   - Unavailable
   *   - Unknown
   *   - DataLoss
   * </pre>
   *
   * <code>uint64 total_error_requests = 4;</code>
   */
  long getTotalErrorRequests();

  /**
   * <pre>
   * Stats for multi-dimensional load balancing.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.EndpointLoadMetricStats load_metric_stats = 5;</code>
   */
  java.util.List<io.grpc.xds.shaded.envoy.api.v2.endpoint.EndpointLoadMetricStats> 
      getLoadMetricStatsList();
  /**
   * <pre>
   * Stats for multi-dimensional load balancing.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.EndpointLoadMetricStats load_metric_stats = 5;</code>
   */
  io.grpc.xds.shaded.envoy.api.v2.endpoint.EndpointLoadMetricStats getLoadMetricStats(int index);
  /**
   * <pre>
   * Stats for multi-dimensional load balancing.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.EndpointLoadMetricStats load_metric_stats = 5;</code>
   */
  int getLoadMetricStatsCount();
  /**
   * <pre>
   * Stats for multi-dimensional load balancing.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.EndpointLoadMetricStats load_metric_stats = 5;</code>
   */
  java.util.List<? extends io.grpc.xds.shaded.envoy.api.v2.endpoint.EndpointLoadMetricStatsOrBuilder> 
      getLoadMetricStatsOrBuilderList();
  /**
   * <pre>
   * Stats for multi-dimensional load balancing.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.EndpointLoadMetricStats load_metric_stats = 5;</code>
   */
  io.grpc.xds.shaded.envoy.api.v2.endpoint.EndpointLoadMetricStatsOrBuilder getLoadMetricStatsOrBuilder(
      int index);
}
