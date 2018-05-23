package etcdserverpb;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class KVGrpc {

  private KVGrpc() {}

  public static final String SERVICE_NAME = "etcdserverpb.KV";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<Rpc.RangeRequest,
      Rpc.RangeResponse> METHOD_RANGE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "etcdserverpb.KV", "Range"),
          io.grpc.protobuf.ProtoUtils.marshaller(Rpc.RangeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Rpc.RangeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<Rpc.PutRequest,
      Rpc.PutResponse> METHOD_PUT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "etcdserverpb.KV", "Put"),
          io.grpc.protobuf.ProtoUtils.marshaller(Rpc.PutRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Rpc.PutResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<Rpc.DeleteRangeRequest,
      Rpc.DeleteRangeResponse> METHOD_DELETE_RANGE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "etcdserverpb.KV", "DeleteRange"),
          io.grpc.protobuf.ProtoUtils.marshaller(Rpc.DeleteRangeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Rpc.DeleteRangeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<Rpc.TxnRequest,
      Rpc.TxnResponse> METHOD_TXN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "etcdserverpb.KV", "Txn"),
          io.grpc.protobuf.ProtoUtils.marshaller(Rpc.TxnRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Rpc.TxnResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<Rpc.CompactionRequest,
      Rpc.CompactionResponse> METHOD_COMPACT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "etcdserverpb.KV", "Compact"),
          io.grpc.protobuf.ProtoUtils.marshaller(Rpc.CompactionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Rpc.CompactionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<Rpc.HashRequest,
      Rpc.HashResponse> METHOD_HASH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "etcdserverpb.KV", "Hash"),
          io.grpc.protobuf.ProtoUtils.marshaller(Rpc.HashRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Rpc.HashResponse.getDefaultInstance()));

  public static KVStub newStub(io.grpc.Channel channel) {
    return new KVStub(channel);
  }

  public static KVBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KVBlockingStub(channel);
  }

  public static KVFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KVFutureStub(channel);
  }

  public static interface KV {

    public void range(Rpc.RangeRequest request,
                      io.grpc.stub.StreamObserver<Rpc.RangeResponse> responseObserver);

    public void put(Rpc.PutRequest request,
                    io.grpc.stub.StreamObserver<Rpc.PutResponse> responseObserver);

    public void deleteRange(Rpc.DeleteRangeRequest request,
                            io.grpc.stub.StreamObserver<Rpc.DeleteRangeResponse> responseObserver);

    public void txn(Rpc.TxnRequest request,
                    io.grpc.stub.StreamObserver<Rpc.TxnResponse> responseObserver);

    public void compact(Rpc.CompactionRequest request,
                        io.grpc.stub.StreamObserver<Rpc.CompactionResponse> responseObserver);

    public void hash(Rpc.HashRequest request,
                     io.grpc.stub.StreamObserver<Rpc.HashResponse> responseObserver);
  }

  public static interface KVBlockingClient {

    public Rpc.RangeResponse range(Rpc.RangeRequest request);

    public Rpc.PutResponse put(Rpc.PutRequest request);

    public Rpc.DeleteRangeResponse deleteRange(Rpc.DeleteRangeRequest request);

    public Rpc.TxnResponse txn(Rpc.TxnRequest request);

    public Rpc.CompactionResponse compact(Rpc.CompactionRequest request);

    public Rpc.HashResponse hash(Rpc.HashRequest request);
  }

  public static interface KVFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<Rpc.RangeResponse> range(
            Rpc.RangeRequest request);

    public com.google.common.util.concurrent.ListenableFuture<Rpc.PutResponse> put(
            Rpc.PutRequest request);

    public com.google.common.util.concurrent.ListenableFuture<Rpc.DeleteRangeResponse> deleteRange(
            Rpc.DeleteRangeRequest request);

    public com.google.common.util.concurrent.ListenableFuture<Rpc.TxnResponse> txn(
            Rpc.TxnRequest request);

    public com.google.common.util.concurrent.ListenableFuture<Rpc.CompactionResponse> compact(
            Rpc.CompactionRequest request);

    public com.google.common.util.concurrent.ListenableFuture<Rpc.HashResponse> hash(
            Rpc.HashRequest request);
  }

  public static class KVStub extends io.grpc.stub.AbstractStub<KVStub>
      implements KV {
    private KVStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KVStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected KVStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KVStub(channel, callOptions);
    }

    @Override
    public void range(Rpc.RangeRequest request,
        io.grpc.stub.StreamObserver<Rpc.RangeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RANGE, getCallOptions()), request, responseObserver);
    }

    @Override
    public void put(Rpc.PutRequest request,
        io.grpc.stub.StreamObserver<Rpc.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PUT, getCallOptions()), request, responseObserver);
    }

    @Override
    public void deleteRange(Rpc.DeleteRangeRequest request,
        io.grpc.stub.StreamObserver<Rpc.DeleteRangeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_RANGE, getCallOptions()), request, responseObserver);
    }

    @Override
    public void txn(Rpc.TxnRequest request,
        io.grpc.stub.StreamObserver<Rpc.TxnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TXN, getCallOptions()), request, responseObserver);
    }

    @Override
    public void compact(Rpc.CompactionRequest request,
        io.grpc.stub.StreamObserver<Rpc.CompactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COMPACT, getCallOptions()), request, responseObserver);
    }

    @Override
    public void hash(Rpc.HashRequest request,
        io.grpc.stub.StreamObserver<Rpc.HashResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HASH, getCallOptions()), request, responseObserver);
    }
  }

  public static class KVBlockingStub extends io.grpc.stub.AbstractStub<KVBlockingStub>
      implements KVBlockingClient {
    private KVBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KVBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected KVBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KVBlockingStub(channel, callOptions);
    }

    @Override
    public Rpc.RangeResponse range(Rpc.RangeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RANGE, getCallOptions(), request);
    }

    @Override
    public Rpc.PutResponse put(Rpc.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PUT, getCallOptions(), request);
    }

    @Override
    public Rpc.DeleteRangeResponse deleteRange(Rpc.DeleteRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_RANGE, getCallOptions(), request);
    }

    @Override
    public Rpc.TxnResponse txn(Rpc.TxnRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TXN, getCallOptions(), request);
    }

    @Override
    public Rpc.CompactionResponse compact(Rpc.CompactionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COMPACT, getCallOptions(), request);
    }

    @Override
    public Rpc.HashResponse hash(Rpc.HashRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HASH, getCallOptions(), request);
    }
  }

  public static class KVFutureStub extends io.grpc.stub.AbstractStub<KVFutureStub>
      implements KVFutureClient {
    private KVFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KVFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected KVFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KVFutureStub(channel, callOptions);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<Rpc.RangeResponse> range(
        Rpc.RangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RANGE, getCallOptions()), request);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<Rpc.PutResponse> put(
        Rpc.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PUT, getCallOptions()), request);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<Rpc.DeleteRangeResponse> deleteRange(
        Rpc.DeleteRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_RANGE, getCallOptions()), request);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<Rpc.TxnResponse> txn(
        Rpc.TxnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TXN, getCallOptions()), request);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<Rpc.CompactionResponse> compact(
        Rpc.CompactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COMPACT, getCallOptions()), request);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<Rpc.HashResponse> hash(
        Rpc.HashRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HASH, getCallOptions()), request);
    }
  }

  private static final int METHODID_RANGE = 0;
  private static final int METHODID_PUT = 1;
  private static final int METHODID_DELETE_RANGE = 2;
  private static final int METHODID_TXN = 3;
  private static final int METHODID_COMPACT = 4;
  private static final int METHODID_HASH = 5;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KV serviceImpl;
    private final int methodId;

    public MethodHandlers(KV serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RANGE:
          serviceImpl.range((Rpc.RangeRequest) request,
              (io.grpc.stub.StreamObserver<Rpc.RangeResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((Rpc.PutRequest) request,
              (io.grpc.stub.StreamObserver<Rpc.PutResponse>) responseObserver);
          break;
        case METHODID_DELETE_RANGE:
          serviceImpl.deleteRange((Rpc.DeleteRangeRequest) request,
              (io.grpc.stub.StreamObserver<Rpc.DeleteRangeResponse>) responseObserver);
          break;
        case METHODID_TXN:
          serviceImpl.txn((Rpc.TxnRequest) request,
              (io.grpc.stub.StreamObserver<Rpc.TxnResponse>) responseObserver);
          break;
        case METHODID_COMPACT:
          serviceImpl.compact((Rpc.CompactionRequest) request,
              (io.grpc.stub.StreamObserver<Rpc.CompactionResponse>) responseObserver);
          break;
        case METHODID_HASH:
          serviceImpl.hash((Rpc.HashRequest) request,
              (io.grpc.stub.StreamObserver<Rpc.HashResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final KV serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_RANGE,
          asyncUnaryCall(
            new MethodHandlers<
              Rpc.RangeRequest,
              Rpc.RangeResponse>(
                serviceImpl, METHODID_RANGE)))
        .addMethod(
          METHOD_PUT,
          asyncUnaryCall(
            new MethodHandlers<
              Rpc.PutRequest,
              Rpc.PutResponse>(
                serviceImpl, METHODID_PUT)))
        .addMethod(
          METHOD_DELETE_RANGE,
          asyncUnaryCall(
            new MethodHandlers<
              Rpc.DeleteRangeRequest,
              Rpc.DeleteRangeResponse>(
                serviceImpl, METHODID_DELETE_RANGE)))
        .addMethod(
          METHOD_TXN,
          asyncUnaryCall(
            new MethodHandlers<
              Rpc.TxnRequest,
              Rpc.TxnResponse>(
                serviceImpl, METHODID_TXN)))
        .addMethod(
          METHOD_COMPACT,
          asyncUnaryCall(
            new MethodHandlers<
              Rpc.CompactionRequest,
              Rpc.CompactionResponse>(
                serviceImpl, METHODID_COMPACT)))
        .addMethod(
          METHOD_HASH,
          asyncUnaryCall(
            new MethodHandlers<
              Rpc.HashRequest,
              Rpc.HashResponse>(
                serviceImpl, METHODID_HASH)))
        .build();
  }
}
