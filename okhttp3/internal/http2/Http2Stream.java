package okhttp3.internal.http2;

import j.a;
import j.c;
import j.e;
import j.s;
import j.t;
import j.u;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import okhttp3.Headers;

public final class Http2Stream {
  long bytesLeftInWriteWindow;
  
  final Http2Connection connection;
  
  ErrorCode errorCode = null;
  
  private boolean hasResponseHeaders;
  
  private Header.Listener headersListener;
  
  private final Deque<Headers> headersQueue = new ArrayDeque<Headers>();
  
  final int id;
  
  final StreamTimeout readTimeout = new StreamTimeout();
  
  final FramingSink sink;
  
  private final FramingSource source;
  
  long unacknowledgedBytesRead = 0L;
  
  final StreamTimeout writeTimeout = new StreamTimeout();
  
  Http2Stream(int paramInt, Http2Connection paramHttp2Connection, boolean paramBoolean1, boolean paramBoolean2, Headers paramHeaders) {
    if (paramHttp2Connection != null) {
      this.id = paramInt;
      this.connection = paramHttp2Connection;
      this.bytesLeftInWriteWindow = paramHttp2Connection.peerSettings.getInitialWindowSize();
      this.source = new FramingSource(paramHttp2Connection.okHttpSettings.getInitialWindowSize());
      this.sink = new FramingSink();
      this.source.finished = paramBoolean2;
      this.sink.finished = paramBoolean1;
      if (paramHeaders != null)
        this.headersQueue.add(paramHeaders); 
      if (!isLocallyInitiated() || paramHeaders == null) {
        if (!isLocallyInitiated()) {
          if (paramHeaders != null)
            return; 
          throw new IllegalStateException("remotely-initiated streams should have headers");
        } 
        return;
      } 
      throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
    } 
    throw new NullPointerException("connection == null");
  }
  
  private boolean closeInternal(ErrorCode paramErrorCode) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield errorCode : Lokhttp3/internal/http2/ErrorCode;
    //   6: ifnull -> 13
    //   9: aload_0
    //   10: monitorexit
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_0
    //   14: getfield source : Lokhttp3/internal/http2/Http2Stream$FramingSource;
    //   17: getfield finished : Z
    //   20: ifeq -> 37
    //   23: aload_0
    //   24: getfield sink : Lokhttp3/internal/http2/Http2Stream$FramingSink;
    //   27: getfield finished : Z
    //   30: ifeq -> 37
    //   33: aload_0
    //   34: monitorexit
    //   35: iconst_0
    //   36: ireturn
    //   37: aload_0
    //   38: aload_1
    //   39: putfield errorCode : Lokhttp3/internal/http2/ErrorCode;
    //   42: aload_0
    //   43: invokevirtual notifyAll : ()V
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_0
    //   49: getfield connection : Lokhttp3/internal/http2/Http2Connection;
    //   52: aload_0
    //   53: getfield id : I
    //   56: invokevirtual removeStream : (I)Lokhttp3/internal/http2/Http2Stream;
    //   59: pop
    //   60: iconst_1
    //   61: ireturn
    //   62: astore_1
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	62	finally
    //   13	35	62	finally
    //   37	48	62	finally
    //   63	65	62	finally
  }
  
  void addBytesToWriteWindow(long paramLong) {
    this.bytesLeftInWriteWindow += paramLong;
    if (paramLong > 0L)
      notifyAll(); 
  }
  
  void cancelStreamIfNecessary() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield source : Lokhttp3/internal/http2/Http2Stream$FramingSource;
    //   6: getfield finished : Z
    //   9: ifne -> 91
    //   12: aload_0
    //   13: getfield source : Lokhttp3/internal/http2/Http2Stream$FramingSource;
    //   16: getfield closed : Z
    //   19: ifeq -> 91
    //   22: aload_0
    //   23: getfield sink : Lokhttp3/internal/http2/Http2Stream$FramingSink;
    //   26: getfield finished : Z
    //   29: ifne -> 86
    //   32: aload_0
    //   33: getfield sink : Lokhttp3/internal/http2/Http2Stream$FramingSink;
    //   36: getfield closed : Z
    //   39: ifeq -> 91
    //   42: goto -> 86
    //   45: aload_0
    //   46: invokevirtual isOpen : ()Z
    //   49: istore_2
    //   50: aload_0
    //   51: monitorexit
    //   52: iload_1
    //   53: ifeq -> 64
    //   56: aload_0
    //   57: getstatic okhttp3/internal/http2/ErrorCode.CANCEL : Lokhttp3/internal/http2/ErrorCode;
    //   60: invokevirtual close : (Lokhttp3/internal/http2/ErrorCode;)V
    //   63: return
    //   64: iload_2
    //   65: ifne -> 80
    //   68: aload_0
    //   69: getfield connection : Lokhttp3/internal/http2/Http2Connection;
    //   72: aload_0
    //   73: getfield id : I
    //   76: invokevirtual removeStream : (I)Lokhttp3/internal/http2/Http2Stream;
    //   79: pop
    //   80: return
    //   81: astore_3
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_3
    //   85: athrow
    //   86: iconst_1
    //   87: istore_1
    //   88: goto -> 45
    //   91: iconst_0
    //   92: istore_1
    //   93: goto -> 45
    // Exception table:
    //   from	to	target	type
    //   2	42	81	finally
    //   45	52	81	finally
    //   82	84	81	finally
  }
  
  void checkOutNotClosed() {
    FramingSink framingSink = this.sink;
    if (!framingSink.closed) {
      if (!framingSink.finished) {
        ErrorCode errorCode = this.errorCode;
        if (errorCode == null)
          return; 
        throw new StreamResetException(errorCode);
      } 
      throw new IOException("stream finished");
    } 
    throw new IOException("stream closed");
  }
  
  public void close(ErrorCode paramErrorCode) {
    if (!closeInternal(paramErrorCode))
      return; 
    this.connection.writeSynReset(this.id, paramErrorCode);
  }
  
  public void closeLater(ErrorCode paramErrorCode) {
    if (!closeInternal(paramErrorCode))
      return; 
    this.connection.writeSynResetLater(this.id, paramErrorCode);
  }
  
  public Http2Connection getConnection() {
    return this.connection;
  }
  
  public ErrorCode getErrorCode() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield errorCode : Lokhttp3/internal/http2/ErrorCode;
    //   6: astore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_1
    //   10: areturn
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public int getId() {
    return this.id;
  }
  
  public s getSink() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield hasResponseHeaders : Z
    //   6: ifne -> 29
    //   9: aload_0
    //   10: invokevirtual isLocallyInitiated : ()Z
    //   13: ifeq -> 19
    //   16: goto -> 29
    //   19: new java/lang/IllegalStateException
    //   22: dup
    //   23: ldc 'reply before requesting the sink'
    //   25: invokespecial <init> : (Ljava/lang/String;)V
    //   28: athrow
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_0
    //   32: getfield sink : Lokhttp3/internal/http2/Http2Stream$FramingSink;
    //   35: areturn
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	36	finally
    //   19	29	36	finally
    //   29	31	36	finally
    //   37	39	36	finally
  }
  
  public t getSource() {
    return this.source;
  }
  
  public boolean isLocallyInitiated() {
    boolean bool;
    if ((this.id & 0x1) == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    return (this.connection.client == bool);
  }
  
  public boolean isOpen() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield errorCode : Lokhttp3/internal/http2/ErrorCode;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: iconst_0
    //   14: ireturn
    //   15: aload_0
    //   16: getfield source : Lokhttp3/internal/http2/Http2Stream$FramingSource;
    //   19: getfield finished : Z
    //   22: ifne -> 35
    //   25: aload_0
    //   26: getfield source : Lokhttp3/internal/http2/Http2Stream$FramingSource;
    //   29: getfield closed : Z
    //   32: ifeq -> 68
    //   35: aload_0
    //   36: getfield sink : Lokhttp3/internal/http2/Http2Stream$FramingSink;
    //   39: getfield finished : Z
    //   42: ifne -> 55
    //   45: aload_0
    //   46: getfield sink : Lokhttp3/internal/http2/Http2Stream$FramingSink;
    //   49: getfield closed : Z
    //   52: ifeq -> 68
    //   55: aload_0
    //   56: getfield hasResponseHeaders : Z
    //   59: istore_1
    //   60: iload_1
    //   61: ifeq -> 68
    //   64: aload_0
    //   65: monitorexit
    //   66: iconst_0
    //   67: ireturn
    //   68: aload_0
    //   69: monitorexit
    //   70: iconst_1
    //   71: ireturn
    //   72: astore_2
    //   73: aload_0
    //   74: monitorexit
    //   75: aload_2
    //   76: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	72	finally
    //   15	35	72	finally
    //   35	55	72	finally
    //   55	60	72	finally
  }
  
  public u readTimeout() {
    return (u)this.readTimeout;
  }
  
  void receiveData(e parame, int paramInt) {
    this.source.receive(parame, paramInt);
  }
  
  void receiveFin() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield source : Lokhttp3/internal/http2/Http2Stream$FramingSource;
    //   6: iconst_1
    //   7: putfield finished : Z
    //   10: aload_0
    //   11: invokevirtual isOpen : ()Z
    //   14: istore_1
    //   15: aload_0
    //   16: invokevirtual notifyAll : ()V
    //   19: aload_0
    //   20: monitorexit
    //   21: iload_1
    //   22: ifne -> 37
    //   25: aload_0
    //   26: getfield connection : Lokhttp3/internal/http2/Http2Connection;
    //   29: aload_0
    //   30: getfield id : I
    //   33: invokevirtual removeStream : (I)Lokhttp3/internal/http2/Http2Stream;
    //   36: pop
    //   37: return
    //   38: astore_2
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_2
    //   42: athrow
    // Exception table:
    //   from	to	target	type
    //   2	21	38	finally
    //   39	41	38	finally
  }
  
  void receiveHeaders(List<Header> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield hasResponseHeaders : Z
    //   7: aload_0
    //   8: getfield headersQueue : Ljava/util/Deque;
    //   11: aload_1
    //   12: invokestatic toHeaders : (Ljava/util/List;)Lokhttp3/Headers;
    //   15: invokeinterface add : (Ljava/lang/Object;)Z
    //   20: pop
    //   21: aload_0
    //   22: invokevirtual isOpen : ()Z
    //   25: istore_2
    //   26: aload_0
    //   27: invokevirtual notifyAll : ()V
    //   30: aload_0
    //   31: monitorexit
    //   32: iload_2
    //   33: ifne -> 48
    //   36: aload_0
    //   37: getfield connection : Lokhttp3/internal/http2/Http2Connection;
    //   40: aload_0
    //   41: getfield id : I
    //   44: invokevirtual removeStream : (I)Lokhttp3/internal/http2/Http2Stream;
    //   47: pop
    //   48: return
    //   49: astore_1
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_1
    //   53: athrow
    // Exception table:
    //   from	to	target	type
    //   2	32	49	finally
    //   50	52	49	finally
  }
  
  void receiveRstStream(ErrorCode paramErrorCode) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield errorCode : Lokhttp3/internal/http2/ErrorCode;
    //   6: ifnonnull -> 18
    //   9: aload_0
    //   10: aload_1
    //   11: putfield errorCode : Lokhttp3/internal/http2/ErrorCode;
    //   14: aload_0
    //   15: invokevirtual notifyAll : ()V
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	21	finally
  }
  
  public void setHeadersListener(Header.Listener paramListener) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield headersListener : Lokhttp3/internal/http2/Header$Listener;
    //   7: aload_0
    //   8: getfield headersQueue : Ljava/util/Deque;
    //   11: invokeinterface isEmpty : ()Z
    //   16: ifne -> 27
    //   19: aload_1
    //   20: ifnull -> 27
    //   23: aload_0
    //   24: invokevirtual notifyAll : ()V
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	30	finally
    //   23	27	30	finally
  }
  
  public Headers takeHeaders() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield readTimeout : Lokhttp3/internal/http2/Http2Stream$StreamTimeout;
    //   6: invokevirtual enter : ()V
    //   9: aload_0
    //   10: getfield headersQueue : Ljava/util/Deque;
    //   13: invokeinterface isEmpty : ()Z
    //   18: ifeq -> 35
    //   21: aload_0
    //   22: getfield errorCode : Lokhttp3/internal/http2/ErrorCode;
    //   25: ifnonnull -> 35
    //   28: aload_0
    //   29: invokevirtual waitForIo : ()V
    //   32: goto -> 9
    //   35: aload_0
    //   36: getfield readTimeout : Lokhttp3/internal/http2/Http2Stream$StreamTimeout;
    //   39: invokevirtual exitAndThrowIfTimedOut : ()V
    //   42: aload_0
    //   43: getfield headersQueue : Ljava/util/Deque;
    //   46: invokeinterface isEmpty : ()Z
    //   51: ifne -> 71
    //   54: aload_0
    //   55: getfield headersQueue : Ljava/util/Deque;
    //   58: invokeinterface removeFirst : ()Ljava/lang/Object;
    //   63: checkcast okhttp3/Headers
    //   66: astore_1
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_1
    //   70: areturn
    //   71: new okhttp3/internal/http2/StreamResetException
    //   74: dup
    //   75: aload_0
    //   76: getfield errorCode : Lokhttp3/internal/http2/ErrorCode;
    //   79: invokespecial <init> : (Lokhttp3/internal/http2/ErrorCode;)V
    //   82: athrow
    //   83: astore_1
    //   84: aload_0
    //   85: getfield readTimeout : Lokhttp3/internal/http2/Http2Stream$StreamTimeout;
    //   88: invokevirtual exitAndThrowIfTimedOut : ()V
    //   91: aload_1
    //   92: athrow
    //   93: astore_1
    //   94: aload_0
    //   95: monitorexit
    //   96: goto -> 101
    //   99: aload_1
    //   100: athrow
    //   101: goto -> 99
    // Exception table:
    //   from	to	target	type
    //   2	9	93	finally
    //   9	32	83	finally
    //   35	67	93	finally
    //   71	83	93	finally
    //   84	93	93	finally
  }
  
  void waitForIo() {
    try {
      wait();
      return;
    } catch (InterruptedException interruptedException) {
      Thread.currentThread().interrupt();
      throw new InterruptedIOException();
    } 
  }
  
  public void writeHeaders(List<Header> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 111
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: iconst_1
    //   8: putfield hasResponseHeaders : Z
    //   11: iload_2
    //   12: ifne -> 122
    //   15: aload_0
    //   16: getfield sink : Lokhttp3/internal/http2/Http2Stream$FramingSink;
    //   19: iconst_1
    //   20: putfield finished : Z
    //   23: iconst_1
    //   24: istore_3
    //   25: iconst_1
    //   26: istore_2
    //   27: goto -> 30
    //   30: aload_0
    //   31: monitorexit
    //   32: iload_3
    //   33: istore #4
    //   35: iload_3
    //   36: ifne -> 80
    //   39: aload_0
    //   40: getfield connection : Lokhttp3/internal/http2/Http2Connection;
    //   43: astore #5
    //   45: aload #5
    //   47: monitorenter
    //   48: aload_0
    //   49: getfield connection : Lokhttp3/internal/http2/Http2Connection;
    //   52: getfield bytesLeftInWriteWindow : J
    //   55: lconst_0
    //   56: lcmp
    //   57: ifne -> 129
    //   60: iconst_1
    //   61: istore_3
    //   62: goto -> 65
    //   65: aload #5
    //   67: monitorexit
    //   68: iload_3
    //   69: istore #4
    //   71: goto -> 80
    //   74: astore_1
    //   75: aload #5
    //   77: monitorexit
    //   78: aload_1
    //   79: athrow
    //   80: aload_0
    //   81: getfield connection : Lokhttp3/internal/http2/Http2Connection;
    //   84: aload_0
    //   85: getfield id : I
    //   88: iload_2
    //   89: aload_1
    //   90: invokevirtual writeSynReply : (IZLjava/util/List;)V
    //   93: iload #4
    //   95: ifeq -> 105
    //   98: aload_0
    //   99: getfield connection : Lokhttp3/internal/http2/Http2Connection;
    //   102: invokevirtual flush : ()V
    //   105: return
    //   106: astore_1
    //   107: aload_0
    //   108: monitorexit
    //   109: aload_1
    //   110: athrow
    //   111: new java/lang/NullPointerException
    //   114: dup
    //   115: ldc_w 'headers == null'
    //   118: invokespecial <init> : (Ljava/lang/String;)V
    //   121: athrow
    //   122: iconst_0
    //   123: istore_3
    //   124: iconst_0
    //   125: istore_2
    //   126: goto -> 30
    //   129: iconst_0
    //   130: istore_3
    //   131: goto -> 65
    // Exception table:
    //   from	to	target	type
    //   6	11	106	finally
    //   15	23	106	finally
    //   30	32	106	finally
    //   48	60	74	finally
    //   65	68	74	finally
    //   75	78	74	finally
    //   107	109	106	finally
  }
  
  public u writeTimeout() {
    return (u)this.writeTimeout;
  }
  
  final class FramingSink implements s {
    private static final long EMIT_BUFFER_SIZE = 16384L;
    
    boolean closed;
    
    boolean finished;
    
    private final c sendBuffer = new c();
    
    private void emitFrame(boolean param1Boolean) {
      synchronized (Http2Stream.this) {
        Http2Stream.this.writeTimeout.enter();
        try {
          while (Http2Stream.this.bytesLeftInWriteWindow <= 0L && !this.finished && !this.closed && Http2Stream.this.errorCode == null)
            Http2Stream.this.waitForIo(); 
          Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
          Http2Stream.this.checkOutNotClosed();
          long l = Math.min(Http2Stream.this.bytesLeftInWriteWindow, this.sendBuffer.s());
          Http2Stream http2Stream = Http2Stream.this;
          http2Stream.bytesLeftInWriteWindow -= l;
          Http2Stream.this.writeTimeout.enter();
        } finally {
          Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
        } 
      } 
    }
    
    public void close() {
      synchronized (Http2Stream.this) {
        if (this.closed)
          return; 
        if (!Http2Stream.this.sink.finished)
          if (this.sendBuffer.s() > 0L) {
            while (this.sendBuffer.s() > 0L)
              emitFrame(true); 
          } else {
            null = Http2Stream.this;
            null.connection.writeData(null.id, true, null, 0L);
          }  
        synchronized (Http2Stream.this) {
          this.closed = true;
          Http2Stream.this.connection.flush();
          Http2Stream.this.cancelStreamIfNecessary();
          return;
        } 
      } 
    }
    
    public void flush() {
      synchronized (Http2Stream.this) {
        Http2Stream.this.checkOutNotClosed();
        while (this.sendBuffer.s() > 0L) {
          emitFrame(false);
          Http2Stream.this.connection.flush();
        } 
        return;
      } 
    }
    
    public u timeout() {
      return (u)Http2Stream.this.writeTimeout;
    }
    
    public void write(c param1c, long param1Long) {
      this.sendBuffer.write(param1c, param1Long);
      while (this.sendBuffer.s() >= 16384L)
        emitFrame(false); 
    }
  }
  
  private final class FramingSource implements t {
    boolean closed;
    
    boolean finished;
    
    private final long maxByteCount;
    
    private final c readBuffer = new c();
    
    private final c receiveBuffer = new c();
    
    FramingSource(long param1Long) {
      this.maxByteCount = param1Long;
    }
    
    private void updateConnectionFlowControl(long param1Long) {
      Http2Stream.this.connection.updateConnectionFlowControl(param1Long);
    }
    
    public void close() {
      synchronized (Http2Stream.this) {
        Header.Listener listener;
        this.closed = true;
        long l = this.readBuffer.s();
        this.readBuffer.a();
        boolean bool = Http2Stream.this.headersQueue.isEmpty();
        ArrayList arrayList = null;
        if (!bool && Http2Stream.this.headersListener != null) {
          arrayList = new ArrayList(Http2Stream.this.headersQueue);
          Http2Stream.this.headersQueue.clear();
          listener = Http2Stream.this.headersListener;
        } else {
          listener = null;
        } 
        Http2Stream.this.notifyAll();
        if (l > 0L)
          updateConnectionFlowControl(l); 
        Http2Stream.this.cancelStreamIfNecessary();
        if (listener != null) {
          Iterator<Headers> iterator = arrayList.iterator();
          while (iterator.hasNext())
            listener.onHeaders(iterator.next()); 
        } 
        return;
      } 
    }
    
    public long read(c param1c, long param1Long) {
      if (param1Long >= 0L)
        while (true) {
          synchronized (Http2Stream.this) {
            Http2Stream.this.readTimeout.enter();
          } 
        }  
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("byteCount < 0: ");
      stringBuilder.append(param1Long);
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
      throw illegalArgumentException;
    }
    
    void receive(e param1e, long param1Long) {
      while (true) {
        if (param1Long > 0L)
          synchronized (Http2Stream.this) {
            boolean bool1;
            boolean bool = this.finished;
            long l1 = this.readBuffer.s();
            long l2 = this.maxByteCount;
            boolean bool2 = true;
            if (l1 + param1Long > l2) {
              bool1 = true;
            } else {
              bool1 = false;
            } 
            if (bool1) {
              param1e.skip(param1Long);
              Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
              return;
            } 
            if (bool) {
              param1e.skip(param1Long);
              return;
            } 
            l1 = param1e.read(this.receiveBuffer, param1Long);
            if (l1 != -1L) {
              param1Long -= l1;
              synchronized (Http2Stream.this) {
                if (this.readBuffer.s() == 0L) {
                  bool1 = bool2;
                } else {
                  bool1 = false;
                } 
                this.readBuffer.a((t)this.receiveBuffer);
                if (bool1)
                  Http2Stream.this.notifyAll(); 
              } 
              continue;
            } 
            throw new EOFException();
          }  
        return;
      } 
    }
    
    public u timeout() {
      return (u)Http2Stream.this.readTimeout;
    }
  }
  
  class StreamTimeout extends a {
    public void exitAndThrowIfTimedOut() {
      if (!exit())
        return; 
      throw newTimeoutException(null);
    }
    
    protected IOException newTimeoutException(IOException param1IOException) {
      SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
      if (param1IOException != null)
        socketTimeoutException.initCause(param1IOException); 
      return socketTimeoutException;
    }
    
    protected void timedOut() {
      Http2Stream.this.closeLater(ErrorCode.CANCEL);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http2/Http2Stream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */