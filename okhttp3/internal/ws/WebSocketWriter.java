package okhttp3.internal.ws;

import j.c;
import j.d;
import j.f;
import j.s;
import j.u;
import java.io.IOException;
import java.util.Random;

final class WebSocketWriter {
  boolean activeWriter;
  
  final c buffer = new c();
  
  final FrameSink frameSink = new FrameSink();
  
  final boolean isClient;
  
  private final c.c maskCursor;
  
  private final byte[] maskKey;
  
  final Random random;
  
  final d sink;
  
  final c sinkBuffer;
  
  boolean writerClosed;
  
  WebSocketWriter(boolean paramBoolean, d paramd, Random paramRandom) {
    if (paramd != null) {
      if (paramRandom != null) {
        c.c c1;
        this.isClient = paramBoolean;
        this.sink = paramd;
        this.sinkBuffer = paramd.f();
        this.random = paramRandom;
        paramRandom = null;
        if (paramBoolean) {
          byte[] arrayOfByte = new byte[4];
        } else {
          paramd = null;
        } 
        this.maskKey = (byte[])paramd;
        Random random = paramRandom;
        if (paramBoolean)
          c1 = new c.c(); 
        this.maskCursor = c1;
        return;
      } 
      throw new NullPointerException("random == null");
    } 
    throw new NullPointerException("sink == null");
  }
  
  private void writeControlFrame(int paramInt, f paramf) {
    if (!this.writerClosed) {
      int i = paramf.s();
      if (i <= 125L) {
        this.sinkBuffer.writeByte(paramInt | 0x80);
        if (this.isClient) {
          this.sinkBuffer.writeByte(i | 0x80);
          this.random.nextBytes(this.maskKey);
          this.sinkBuffer.write(this.maskKey);
          if (i > 0) {
            long l = this.sinkBuffer.s();
            this.sinkBuffer.a(paramf);
            this.sinkBuffer.a(this.maskCursor);
            this.maskCursor.a(l);
            WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
            this.maskCursor.close();
          } 
        } else {
          this.sinkBuffer.writeByte(i);
          this.sinkBuffer.a(paramf);
        } 
        this.sink.flush();
        return;
      } 
      throw new IllegalArgumentException("Payload size must be less than or equal to 125");
    } 
    throw new IOException("closed");
  }
  
  s newMessageSink(int paramInt, long paramLong) {
    if (!this.activeWriter) {
      this.activeWriter = true;
      FrameSink frameSink = this.frameSink;
      frameSink.formatOpcode = paramInt;
      frameSink.contentLength = paramLong;
      frameSink.isFirstFrame = true;
      frameSink.closed = false;
      return frameSink;
    } 
    throw new IllegalStateException("Another message writer is active. Did you call close()?");
  }
  
  void writeClose(int paramInt, f paramf) {
    f f1 = f.f;
    if (paramInt != 0 || paramf != null) {
      if (paramInt != 0)
        WebSocketProtocol.validateCloseCode(paramInt); 
      c c1 = new c();
      c1.writeShort(paramInt);
      if (paramf != null)
        c1.a(paramf); 
      f1 = c1.c();
    } 
    try {
      writeControlFrame(8, f1);
      return;
    } finally {
      this.writerClosed = true;
    } 
  }
  
  void writeMessageFrame(int paramInt, long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    if (!this.writerClosed) {
      boolean bool = false;
      if (!paramBoolean1)
        paramInt = 0; 
      int i = paramInt;
      if (paramBoolean2)
        i = paramInt | 0x80; 
      this.sinkBuffer.writeByte(i);
      paramInt = bool;
      if (this.isClient)
        paramInt = 128; 
      if (paramLong <= 125L) {
        i = (int)paramLong;
        this.sinkBuffer.writeByte(i | paramInt);
      } else if (paramLong <= 65535L) {
        this.sinkBuffer.writeByte(paramInt | 0x7E);
        this.sinkBuffer.writeShort((int)paramLong);
      } else {
        this.sinkBuffer.writeByte(paramInt | 0x7F);
        this.sinkBuffer.k(paramLong);
      } 
      if (this.isClient) {
        this.random.nextBytes(this.maskKey);
        this.sinkBuffer.write(this.maskKey);
        if (paramLong > 0L) {
          long l = this.sinkBuffer.s();
          this.sinkBuffer.write(this.buffer, paramLong);
          this.sinkBuffer.a(this.maskCursor);
          this.maskCursor.a(l);
          WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
          this.maskCursor.close();
        } 
      } else {
        this.sinkBuffer.write(this.buffer, paramLong);
      } 
      this.sink.o();
      return;
    } 
    throw new IOException("closed");
  }
  
  void writePing(f paramf) {
    writeControlFrame(9, paramf);
  }
  
  void writePong(f paramf) {
    writeControlFrame(10, paramf);
  }
  
  final class FrameSink implements s {
    boolean closed;
    
    long contentLength;
    
    int formatOpcode;
    
    boolean isFirstFrame;
    
    public void close() {
      if (!this.closed) {
        WebSocketWriter webSocketWriter = WebSocketWriter.this;
        webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.s(), this.isFirstFrame, true);
        this.closed = true;
        WebSocketWriter.this.activeWriter = false;
        return;
      } 
      throw new IOException("closed");
    }
    
    public void flush() {
      if (!this.closed) {
        WebSocketWriter webSocketWriter = WebSocketWriter.this;
        webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.s(), this.isFirstFrame, false);
        this.isFirstFrame = false;
        return;
      } 
      throw new IOException("closed");
    }
    
    public u timeout() {
      return WebSocketWriter.this.sink.timeout();
    }
    
    public void write(c param1c, long param1Long) {
      if (!this.closed) {
        boolean bool;
        WebSocketWriter.this.buffer.write(param1c, param1Long);
        if (this.isFirstFrame && this.contentLength != -1L && WebSocketWriter.this.buffer.s() > this.contentLength - 8192L) {
          bool = true;
        } else {
          bool = false;
        } 
        param1Long = WebSocketWriter.this.buffer.b();
        if (param1Long > 0L && !bool) {
          WebSocketWriter.this.writeMessageFrame(this.formatOpcode, param1Long, this.isFirstFrame, false);
          this.isFirstFrame = false;
        } 
        return;
      } 
      throw new IOException("closed");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/ws/WebSocketWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */