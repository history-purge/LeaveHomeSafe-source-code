package okhttp3.internal.http2;

import j.c;
import j.e;
import j.f;
import j.t;
import j.u;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;

final class Http2Reader implements Closeable {
  static final Logger logger = Logger.getLogger(Http2.class.getName());
  
  private final boolean client;
  
  private final ContinuationSource continuation;
  
  final Hpack.Reader hpackReader;
  
  private final e source;
  
  Http2Reader(e parame, boolean paramBoolean) {
    this.source = parame;
    this.client = paramBoolean;
    this.continuation = new ContinuationSource(this.source);
    this.hpackReader = new Hpack.Reader(4096, this.continuation);
  }
  
  static int lengthWithoutPadding(int paramInt, byte paramByte, short paramShort) {
    int i = paramInt;
    if ((paramByte & 0x8) != 0)
      i = paramInt - 1; 
    if (paramShort <= i)
      return (short)(i - paramShort); 
    throw Http2.ioException("PROTOCOL_ERROR padding %s > remaining length %s", new Object[] { Short.valueOf(paramShort), Integer.valueOf(i) });
  }
  
  private void readData(Handler paramHandler, int paramInt1, byte paramByte, int paramInt2) {
    short s = 0;
    if (paramInt2 != 0) {
      boolean bool2;
      boolean bool1 = true;
      if ((paramByte & 0x1) != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      if ((paramByte & 0x20) == 0)
        bool1 = false; 
      if (!bool1) {
        if ((paramByte & 0x8) != 0)
          s = (short)(this.source.readByte() & 0xFF); 
        paramInt1 = lengthWithoutPadding(paramInt1, paramByte, s);
        paramHandler.data(bool2, paramInt2, this.source, paramInt1);
        this.source.skip(s);
        return;
      } 
      throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
    } 
    throw Http2.ioException("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
  }
  
  private void readGoAway(Handler paramHandler, int paramInt1, byte paramByte, int paramInt2) {
    if (paramInt1 >= 8) {
      if (paramInt2 == 0) {
        int i = this.source.readInt();
        paramInt2 = this.source.readInt();
        paramInt1 -= 8;
        ErrorCode errorCode = ErrorCode.fromHttp2(paramInt2);
        if (errorCode != null) {
          f f = f.f;
          if (paramInt1 > 0)
            f = this.source.c(paramInt1); 
          paramHandler.goAway(i, errorCode, f);
          return;
        } 
        throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", new Object[] { Integer.valueOf(paramInt2) });
      } 
      throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
    } 
    throw Http2.ioException("TYPE_GOAWAY length < 8: %s", new Object[] { Integer.valueOf(paramInt1) });
  }
  
  private List<Header> readHeaderBlock(int paramInt1, short paramShort, byte paramByte, int paramInt2) {
    ContinuationSource continuationSource = this.continuation;
    continuationSource.left = paramInt1;
    continuationSource.length = paramInt1;
    continuationSource.padding = paramShort;
    continuationSource.flags = paramByte;
    continuationSource.streamId = paramInt2;
    this.hpackReader.readHeaders();
    return this.hpackReader.getAndResetHeaderList();
  }
  
  private void readHeaders(Handler paramHandler, int paramInt1, byte paramByte, int paramInt2) {
    short s = 0;
    if (paramInt2 != 0) {
      boolean bool;
      if ((paramByte & 0x1) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      if ((paramByte & 0x8) != 0)
        s = (short)(this.source.readByte() & 0xFF); 
      int i = paramInt1;
      if ((paramByte & 0x20) != 0) {
        readPriority(paramHandler, paramInt2);
        i = paramInt1 - 5;
      } 
      paramHandler.headers(bool, paramInt2, -1, readHeaderBlock(lengthWithoutPadding(i, paramByte, s), s, paramByte, paramInt2));
      return;
    } 
    throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
  }
  
  static int readMedium(e parame) {
    byte b1 = parame.readByte();
    byte b2 = parame.readByte();
    return parame.readByte() & 0xFF | (b1 & 0xFF) << 16 | (b2 & 0xFF) << 8;
  }
  
  private void readPing(Handler paramHandler, int paramInt1, byte paramByte, int paramInt2) {
    boolean bool = false;
    if (paramInt1 == 8) {
      if (paramInt2 == 0) {
        paramInt1 = this.source.readInt();
        paramInt2 = this.source.readInt();
        if ((paramByte & 0x1) != 0)
          bool = true; 
        paramHandler.ping(bool, paramInt1, paramInt2);
        return;
      } 
      throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
    } 
    throw Http2.ioException("TYPE_PING length != 8: %s", new Object[] { Integer.valueOf(paramInt1) });
  }
  
  private void readPriority(Handler paramHandler, int paramInt) {
    boolean bool;
    int i = this.source.readInt();
    if ((Integer.MIN_VALUE & i) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    paramHandler.priority(paramInt, i & Integer.MAX_VALUE, (this.source.readByte() & 0xFF) + 1, bool);
  }
  
  private void readPriority(Handler paramHandler, int paramInt1, byte paramByte, int paramInt2) {
    if (paramInt1 == 5) {
      if (paramInt2 != 0) {
        readPriority(paramHandler, paramInt2);
        return;
      } 
      throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
    } 
    throw Http2.ioException("TYPE_PRIORITY length: %d != 5", new Object[] { Integer.valueOf(paramInt1) });
  }
  
  private void readPushPromise(Handler paramHandler, int paramInt1, byte paramByte, int paramInt2) {
    short s = 0;
    if (paramInt2 != 0) {
      if ((paramByte & 0x8) != 0)
        s = (short)(this.source.readByte() & 0xFF); 
      paramHandler.pushPromise(paramInt2, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(lengthWithoutPadding(paramInt1 - 4, paramByte, s), s, paramByte, paramInt2));
      return;
    } 
    throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
  }
  
  private void readRstStream(Handler paramHandler, int paramInt1, byte paramByte, int paramInt2) {
    if (paramInt1 == 4) {
      if (paramInt2 != 0) {
        paramInt1 = this.source.readInt();
        ErrorCode errorCode = ErrorCode.fromHttp2(paramInt1);
        if (errorCode != null) {
          paramHandler.rstStream(paramInt2, errorCode);
          return;
        } 
        throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", new Object[] { Integer.valueOf(paramInt1) });
      } 
      throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
    } 
    throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", new Object[] { Integer.valueOf(paramInt1) });
  }
  
  private void readSettings(Handler paramHandler, int paramInt1, byte paramByte, int paramInt2) {
    if (paramInt2 == 0) {
      if ((paramByte & 0x1) != 0) {
        if (paramInt1 == 0) {
          paramHandler.ackSettings();
          return;
        } 
        throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
      } 
      if (paramInt1 % 6 == 0) {
        Settings settings = new Settings();
        for (paramInt2 = 0; paramInt2 < paramInt1; paramInt2 += 6) {
          int j = this.source.readShort() & 0xFFFF;
          int k = this.source.readInt();
          int i = j;
          switch (j) {
            default:
              i = j;
              break;
            case 5:
              if (k >= 16384 && k <= 16777215) {
                i = j;
                break;
              } 
              throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[] { Integer.valueOf(k) });
            case 4:
              i = 7;
              if (k >= 0)
                break; 
              throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
            case 3:
              i = 4;
              break;
            case 2:
              i = j;
              if (k != 0) {
                if (k == 1) {
                  i = j;
                  break;
                } 
                throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
              } 
              break;
            case 1:
            case 6:
              break;
          } 
          settings.set(i, k);
        } 
        paramHandler.settings(false, settings);
        return;
      } 
      throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", new Object[] { Integer.valueOf(paramInt1) });
    } 
    IOException iOException = Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
    throw iOException;
  }
  
  private void readWindowUpdate(Handler paramHandler, int paramInt1, byte paramByte, int paramInt2) {
    if (paramInt1 == 4) {
      long l = this.source.readInt() & 0x7FFFFFFFL;
      if (l != 0L) {
        paramHandler.windowUpdate(paramInt2, l);
        return;
      } 
      throw Http2.ioException("windowSizeIncrement was 0", new Object[] { Long.valueOf(l) });
    } 
    throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] { Integer.valueOf(paramInt1) });
  }
  
  public void close() {
    this.source.close();
  }
  
  public boolean nextFrame(boolean paramBoolean, Handler paramHandler) {
    try {
      this.source.g(9L);
      int i = readMedium(this.source);
      if (i >= 0 && i <= 16384) {
        byte b = (byte)(this.source.readByte() & 0xFF);
        if (!paramBoolean || b == 4) {
          byte b1 = (byte)(this.source.readByte() & 0xFF);
          int j = this.source.readInt() & Integer.MAX_VALUE;
          if (logger.isLoggable(Level.FINE))
            logger.fine(Http2.frameLog(true, j, i, b, b1)); 
          switch (b) {
            default:
              this.source.skip(i);
              return true;
            case 8:
              readWindowUpdate(paramHandler, i, b1, j);
              return true;
            case 7:
              readGoAway(paramHandler, i, b1, j);
              return true;
            case 6:
              readPing(paramHandler, i, b1, j);
              return true;
            case 5:
              readPushPromise(paramHandler, i, b1, j);
              return true;
            case 4:
              readSettings(paramHandler, i, b1, j);
              return true;
            case 3:
              readRstStream(paramHandler, i, b1, j);
              return true;
            case 2:
              readPriority(paramHandler, i, b1, j);
              return true;
            case 1:
              readHeaders(paramHandler, i, b1, j);
              return true;
            case 0:
              break;
          } 
          readData(paramHandler, i, b1, j);
          return true;
        } 
        throw Http2.ioException("Expected a SETTINGS frame but was %s", new Object[] { Byte.valueOf(b) });
      } 
      throw Http2.ioException("FRAME_SIZE_ERROR: %s", new Object[] { Integer.valueOf(i) });
    } catch (IOException iOException) {
      return false;
    } 
  }
  
  public void readConnectionPreface(Handler paramHandler) {
    if (this.client) {
      if (nextFrame(true, paramHandler))
        return; 
      throw Http2.ioException("Required SETTINGS preface not received", new Object[0]);
    } 
    f f = this.source.c(Http2.CONNECTION_PREFACE.s());
    if (logger.isLoggable(Level.FINE))
      logger.fine(Util.format("<< CONNECTION %s", new Object[] { f.b() })); 
    if (Http2.CONNECTION_PREFACE.equals(f))
      return; 
    throw Http2.ioException("Expected a connection header but was %s", new Object[] { f.v() });
  }
  
  static final class ContinuationSource implements t {
    byte flags;
    
    int left;
    
    int length;
    
    short padding;
    
    private final e source;
    
    int streamId;
    
    ContinuationSource(e param1e) {
      this.source = param1e;
    }
    
    private void readContinuationHeader() {
      int i = this.streamId;
      int j = Http2Reader.readMedium(this.source);
      this.left = j;
      this.length = j;
      byte b = (byte)(this.source.readByte() & 0xFF);
      this.flags = (byte)(this.source.readByte() & 0xFF);
      if (Http2Reader.logger.isLoggable(Level.FINE))
        Http2Reader.logger.fine(Http2.frameLog(true, this.streamId, this.length, b, this.flags)); 
      this.streamId = this.source.readInt() & Integer.MAX_VALUE;
      if (b == 9) {
        if (this.streamId == i)
          return; 
        throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
      } 
      throw Http2.ioException("%s != TYPE_CONTINUATION", new Object[] { Byte.valueOf(b) });
    }
    
    public void close() {}
    
    public long read(c param1c, long param1Long) {
      while (true) {
        int i = this.left;
        if (i == 0) {
          this.source.skip(this.padding);
          this.padding = 0;
          if ((this.flags & 0x4) != 0)
            return -1L; 
          readContinuationHeader();
          continue;
        } 
        param1Long = this.source.read(param1c, Math.min(param1Long, i));
        if (param1Long == -1L)
          return -1L; 
        this.left = (int)(this.left - param1Long);
        return param1Long;
      } 
    }
    
    public u timeout() {
      return this.source.timeout();
    }
  }
  
  static interface Handler {
    void ackSettings();
    
    void alternateService(int param1Int1, String param1String1, f param1f, String param1String2, int param1Int2, long param1Long);
    
    void data(boolean param1Boolean, int param1Int1, e param1e, int param1Int2);
    
    void goAway(int param1Int, ErrorCode param1ErrorCode, f param1f);
    
    void headers(boolean param1Boolean, int param1Int1, int param1Int2, List<Header> param1List);
    
    void ping(boolean param1Boolean, int param1Int1, int param1Int2);
    
    void priority(int param1Int1, int param1Int2, int param1Int3, boolean param1Boolean);
    
    void pushPromise(int param1Int1, int param1Int2, List<Header> param1List);
    
    void rstStream(int param1Int, ErrorCode param1ErrorCode);
    
    void settings(boolean param1Boolean, Settings param1Settings);
    
    void windowUpdate(int param1Int, long param1Long);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http2/Http2Reader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */