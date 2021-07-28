package okhttp3.internal.http1;

import j.c;
import j.d;
import j.e;
import j.i;
import j.l;
import j.s;
import j.t;
import j.u;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

public final class Http1Codec implements HttpCodec {
  private static final int HEADER_LIMIT = 262144;
  
  private static final int STATE_CLOSED = 6;
  
  private static final int STATE_IDLE = 0;
  
  private static final int STATE_OPEN_REQUEST_BODY = 1;
  
  private static final int STATE_OPEN_RESPONSE_BODY = 4;
  
  private static final int STATE_READING_RESPONSE_BODY = 5;
  
  private static final int STATE_READ_RESPONSE_HEADERS = 3;
  
  private static final int STATE_WRITING_REQUEST_BODY = 2;
  
  final OkHttpClient client;
  
  private long headerLimit = 262144L;
  
  final d sink;
  
  final e source;
  
  int state = 0;
  
  final StreamAllocation streamAllocation;
  
  public Http1Codec(OkHttpClient paramOkHttpClient, StreamAllocation paramStreamAllocation, e parame, d paramd) {
    this.client = paramOkHttpClient;
    this.streamAllocation = paramStreamAllocation;
    this.source = parame;
    this.sink = paramd;
  }
  
  private String readHeaderLine() {
    String str = this.source.f(this.headerLimit);
    this.headerLimit -= str.length();
    return str;
  }
  
  public void cancel() {
    RealConnection realConnection = this.streamAllocation.connection();
    if (realConnection != null)
      realConnection.cancel(); 
  }
  
  public s createRequestBody(Request paramRequest, long paramLong) {
    if ("chunked".equalsIgnoreCase(paramRequest.header("Transfer-Encoding")))
      return newChunkedSink(); 
    if (paramLong != -1L)
      return newFixedLengthSink(paramLong); 
    throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
  }
  
  void detachTimeout(i parami) {
    u u = parami.a();
    parami.a(u.NONE);
    u.clearDeadline();
    u.clearTimeout();
  }
  
  public void finishRequest() {
    this.sink.flush();
  }
  
  public void flushRequest() {
    this.sink.flush();
  }
  
  public boolean isClosed() {
    return (this.state == 6);
  }
  
  public s newChunkedSink() {
    if (this.state == 1) {
      this.state = 2;
      return new ChunkedSink();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("state: ");
    stringBuilder.append(this.state);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public t newChunkedSource(HttpUrl paramHttpUrl) {
    if (this.state == 4) {
      this.state = 5;
      return new ChunkedSource(paramHttpUrl);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("state: ");
    stringBuilder.append(this.state);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public s newFixedLengthSink(long paramLong) {
    if (this.state == 1) {
      this.state = 2;
      return new FixedLengthSink(paramLong);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("state: ");
    stringBuilder.append(this.state);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public t newFixedLengthSource(long paramLong) {
    if (this.state == 4) {
      this.state = 5;
      return new FixedLengthSource(paramLong);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("state: ");
    stringBuilder.append(this.state);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public t newUnknownLengthSource() {
    if (this.state == 4) {
      StreamAllocation streamAllocation = this.streamAllocation;
      if (streamAllocation != null) {
        this.state = 5;
        streamAllocation.noNewStreams();
        return new UnknownLengthSource();
      } 
      throw new IllegalStateException("streamAllocation == null");
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("state: ");
    stringBuilder.append(this.state);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public ResponseBody openResponseBody(Response paramResponse) {
    StreamAllocation streamAllocation = this.streamAllocation;
    streamAllocation.eventListener.responseBodyStart(streamAllocation.call);
    String str = paramResponse.header("Content-Type");
    if (!HttpHeaders.hasBody(paramResponse))
      return (ResponseBody)new RealResponseBody(str, 0L, l.a(newFixedLengthSource(0L))); 
    if ("chunked".equalsIgnoreCase(paramResponse.header("Transfer-Encoding")))
      return (ResponseBody)new RealResponseBody(str, -1L, l.a(newChunkedSource(paramResponse.request().url()))); 
    long l = HttpHeaders.contentLength(paramResponse);
    return (ResponseBody)((l != -1L) ? new RealResponseBody(str, l, l.a(newFixedLengthSource(l))) : new RealResponseBody(str, -1L, l.a(newUnknownLengthSource())));
  }
  
  public Headers readHeaders() {
    Headers.Builder builder = new Headers.Builder();
    while (true) {
      String str = readHeaderLine();
      if (str.length() != 0) {
        Internal.instance.addLenient(builder, str);
        continue;
      } 
      return builder.build();
    } 
  }
  
  public Response.Builder readResponseHeaders(boolean paramBoolean) {
    int i = this.state;
    if (i == 1 || i == 3)
      try {
        StatusLine statusLine = StatusLine.parse(readHeaderLine());
        Response.Builder builder = (new Response.Builder()).protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(readHeaders());
        if (paramBoolean && statusLine.code == 100)
          return null; 
        if (statusLine.code == 100) {
          this.state = 3;
          return builder;
        } 
        this.state = 4;
        return builder;
      } catch (EOFException eOFException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("unexpected end of stream on ");
        stringBuilder1.append(this.streamAllocation);
        IOException iOException = new IOException(stringBuilder1.toString());
        iOException.initCause(eOFException);
        throw iOException;
      }  
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("state: ");
    stringBuilder.append(this.state);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public void writeRequest(Headers paramHeaders, String paramString) {
    if (this.state == 0) {
      this.sink.a(paramString).a("\r\n");
      int i = 0;
      int j = paramHeaders.size();
      while (i < j) {
        this.sink.a(paramHeaders.name(i)).a(": ").a(paramHeaders.value(i)).a("\r\n");
        i++;
      } 
      this.sink.a("\r\n");
      this.state = 1;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("state: ");
    stringBuilder.append(this.state);
    IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
    throw illegalStateException;
  }
  
  public void writeRequestHeaders(Request paramRequest) {
    String str = RequestLine.get(paramRequest, this.streamAllocation.connection().route().proxy().type());
    writeRequest(paramRequest.headers(), str);
  }
  
  private abstract class AbstractSource implements t {
    protected long bytesRead = 0L;
    
    protected boolean closed;
    
    protected final i timeout = new i(Http1Codec.this.source.timeout());
    
    private AbstractSource() {}
    
    protected final void endOfInput(boolean param1Boolean, IOException param1IOException) {
      Http1Codec http1Codec = Http1Codec.this;
      int j = http1Codec.state;
      if (j == 6)
        return; 
      if (j == 5) {
        http1Codec.detachTimeout(this.timeout);
        http1Codec = Http1Codec.this;
        http1Codec.state = 6;
        StreamAllocation streamAllocation = http1Codec.streamAllocation;
        if (streamAllocation != null)
          streamAllocation.streamFinished(param1Boolean ^ true, http1Codec, this.bytesRead, param1IOException); 
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("state: ");
      stringBuilder.append(Http1Codec.this.state);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public long read(c param1c, long param1Long) {
      try {
        param1Long = Http1Codec.this.source.read(param1c, param1Long);
        if (param1Long > 0L)
          this.bytesRead += param1Long; 
        return param1Long;
      } catch (IOException iOException) {
        endOfInput(false, iOException);
        throw iOException;
      } 
    }
    
    public u timeout() {
      return (u)this.timeout;
    }
  }
  
  private final class ChunkedSink implements s {
    private boolean closed;
    
    private final i timeout = new i(Http1Codec.this.sink.timeout());
    
    public void close() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield closed : Z
      //   6: istore_1
      //   7: iload_1
      //   8: ifeq -> 14
      //   11: aload_0
      //   12: monitorexit
      //   13: return
      //   14: aload_0
      //   15: iconst_1
      //   16: putfield closed : Z
      //   19: aload_0
      //   20: getfield this$0 : Lokhttp3/internal/http1/Http1Codec;
      //   23: getfield sink : Lj/d;
      //   26: ldc '0\\r\\n\\r\\n'
      //   28: invokeinterface a : (Ljava/lang/String;)Lj/d;
      //   33: pop
      //   34: aload_0
      //   35: getfield this$0 : Lokhttp3/internal/http1/Http1Codec;
      //   38: aload_0
      //   39: getfield timeout : Lj/i;
      //   42: invokevirtual detachTimeout : (Lj/i;)V
      //   45: aload_0
      //   46: getfield this$0 : Lokhttp3/internal/http1/Http1Codec;
      //   49: iconst_3
      //   50: putfield state : I
      //   53: aload_0
      //   54: monitorexit
      //   55: return
      //   56: astore_2
      //   57: aload_0
      //   58: monitorexit
      //   59: aload_2
      //   60: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	56	finally
      //   14	53	56	finally
    }
    
    public void flush() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield closed : Z
      //   6: istore_1
      //   7: iload_1
      //   8: ifeq -> 14
      //   11: aload_0
      //   12: monitorexit
      //   13: return
      //   14: aload_0
      //   15: getfield this$0 : Lokhttp3/internal/http1/Http1Codec;
      //   18: getfield sink : Lj/d;
      //   21: invokeinterface flush : ()V
      //   26: aload_0
      //   27: monitorexit
      //   28: return
      //   29: astore_2
      //   30: aload_0
      //   31: monitorexit
      //   32: aload_2
      //   33: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	29	finally
      //   14	26	29	finally
    }
    
    public u timeout() {
      return (u)this.timeout;
    }
    
    public void write(c param1c, long param1Long) {
      if (!this.closed) {
        if (param1Long == 0L)
          return; 
        Http1Codec.this.sink.h(param1Long);
        Http1Codec.this.sink.a("\r\n");
        Http1Codec.this.sink.write(param1c, param1Long);
        Http1Codec.this.sink.a("\r\n");
        return;
      } 
      throw new IllegalStateException("closed");
    }
  }
  
  private class ChunkedSource extends AbstractSource {
    private static final long NO_CHUNK_YET = -1L;
    
    private long bytesRemainingInChunk = -1L;
    
    private boolean hasMoreChunks = true;
    
    private final HttpUrl url;
    
    ChunkedSource(HttpUrl param1HttpUrl) {
      this.url = param1HttpUrl;
    }
    
    private void readChunkSize() {
      if (this.bytesRemainingInChunk != -1L)
        Http1Codec.this.source.g(); 
      try {
        this.bytesRemainingInChunk = Http1Codec.this.source.m();
        String str = Http1Codec.this.source.g().trim();
        if (this.bytesRemainingInChunk >= 0L) {
          if (!str.isEmpty()) {
            boolean bool = str.startsWith(";");
            if (bool) {
              if (this.bytesRemainingInChunk == 0L) {
                this.hasMoreChunks = false;
                HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                endOfInput(true, null);
              } 
              return;
            } 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected chunk size and optional extensions but was \"");
            stringBuilder.append(this.bytesRemainingInChunk);
            stringBuilder.append(str);
            stringBuilder.append("\"");
            throw new ProtocolException(stringBuilder.toString());
          } 
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("expected chunk size and optional extensions but was \"");
          stringBuilder.append(this.bytesRemainingInChunk);
          stringBuilder.append(str);
          stringBuilder.append("\"");
          throw new ProtocolException(stringBuilder.toString());
        } 
        if (this.bytesRemainingInChunk == 0L) {
          this.hasMoreChunks = false;
          HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
          endOfInput(true, null);
        } 
        return;
      } catch (NumberFormatException numberFormatException) {
        throw new ProtocolException(numberFormatException.getMessage());
      } 
    }
    
    public void close() {
      if (this.closed)
        return; 
      if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS))
        endOfInput(false, null); 
      this.closed = true;
    }
    
    public long read(c param1c, long param1Long) {
      if (param1Long >= 0L) {
        if (!this.closed) {
          if (!this.hasMoreChunks)
            return -1L; 
          long l = this.bytesRemainingInChunk;
          if (l == 0L || l == -1L) {
            readChunkSize();
            if (!this.hasMoreChunks)
              return -1L; 
          } 
          param1Long = super.read(param1c, Math.min(param1Long, this.bytesRemainingInChunk));
          if (param1Long != -1L) {
            this.bytesRemainingInChunk -= param1Long;
            return param1Long;
          } 
          ProtocolException protocolException = new ProtocolException("unexpected end of stream");
          endOfInput(false, protocolException);
          throw protocolException;
        } 
        throw new IllegalStateException("closed");
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("byteCount < 0: ");
      stringBuilder.append(param1Long);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
  }
  
  private final class FixedLengthSink implements s {
    private long bytesRemaining;
    
    private boolean closed;
    
    private final i timeout = new i(Http1Codec.this.sink.timeout());
    
    FixedLengthSink(long param1Long) {
      this.bytesRemaining = param1Long;
    }
    
    public void close() {
      if (this.closed)
        return; 
      this.closed = true;
      if (this.bytesRemaining <= 0L) {
        Http1Codec.this.detachTimeout(this.timeout);
        Http1Codec.this.state = 3;
        return;
      } 
      throw new ProtocolException("unexpected end of stream");
    }
    
    public void flush() {
      if (this.closed)
        return; 
      Http1Codec.this.sink.flush();
    }
    
    public u timeout() {
      return (u)this.timeout;
    }
    
    public void write(c param1c, long param1Long) {
      if (!this.closed) {
        Util.checkOffsetAndCount(param1c.s(), 0L, param1Long);
        if (param1Long <= this.bytesRemaining) {
          Http1Codec.this.sink.write(param1c, param1Long);
          this.bytesRemaining -= param1Long;
          return;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected ");
        stringBuilder.append(this.bytesRemaining);
        stringBuilder.append(" bytes but received ");
        stringBuilder.append(param1Long);
        throw new ProtocolException(stringBuilder.toString());
      } 
      throw new IllegalStateException("closed");
    }
  }
  
  private class FixedLengthSource extends AbstractSource {
    private long bytesRemaining;
    
    FixedLengthSource(long param1Long) {
      this.bytesRemaining = param1Long;
      if (this.bytesRemaining == 0L)
        endOfInput(true, null); 
    }
    
    public void close() {
      if (this.closed)
        return; 
      if (this.bytesRemaining != 0L && !Util.discard(this, 100, TimeUnit.MILLISECONDS))
        endOfInput(false, null); 
      this.closed = true;
    }
    
    public long read(c param1c, long param1Long) {
      if (param1Long >= 0L) {
        if (!this.closed) {
          long l = this.bytesRemaining;
          if (l == 0L)
            return -1L; 
          param1Long = super.read(param1c, Math.min(l, param1Long));
          if (param1Long != -1L) {
            this.bytesRemaining -= param1Long;
            if (this.bytesRemaining == 0L)
              endOfInput(true, null); 
            return param1Long;
          } 
          ProtocolException protocolException = new ProtocolException("unexpected end of stream");
          endOfInput(false, protocolException);
          throw protocolException;
        } 
        throw new IllegalStateException("closed");
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("byteCount < 0: ");
      stringBuilder.append(param1Long);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
  }
  
  private class UnknownLengthSource extends AbstractSource {
    private boolean inputExhausted;
    
    public void close() {
      if (this.closed)
        return; 
      if (!this.inputExhausted)
        endOfInput(false, null); 
      this.closed = true;
    }
    
    public long read(c param1c, long param1Long) {
      if (param1Long >= 0L) {
        if (!this.closed) {
          if (this.inputExhausted)
            return -1L; 
          param1Long = super.read(param1c, param1Long);
          if (param1Long == -1L) {
            this.inputExhausted = true;
            endOfInput(true, null);
            return -1L;
          } 
          return param1Long;
        } 
        throw new IllegalStateException("closed");
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("byteCount < 0: ");
      stringBuilder.append(param1Long);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http1/Http1Codec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */