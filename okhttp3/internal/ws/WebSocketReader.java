package okhttp3.internal.ws;

import j.c;
import j.e;
import j.f;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

final class WebSocketReader {
  boolean closed;
  
  private final c controlFrameBuffer = new c();
  
  final FrameCallback frameCallback;
  
  long frameLength;
  
  final boolean isClient;
  
  boolean isControlFrame;
  
  boolean isFinalFrame;
  
  private final c.c maskCursor;
  
  private final byte[] maskKey;
  
  private final c messageFrameBuffer = new c();
  
  int opcode;
  
  final e source;
  
  WebSocketReader(boolean paramBoolean, e parame, FrameCallback paramFrameCallback) {
    if (parame != null) {
      if (paramFrameCallback != null) {
        byte[] arrayOfByte;
        c.c c1;
        this.isClient = paramBoolean;
        this.source = parame;
        this.frameCallback = paramFrameCallback;
        paramFrameCallback = null;
        if (paramBoolean) {
          parame = null;
        } else {
          arrayOfByte = new byte[4];
        } 
        this.maskKey = arrayOfByte;
        if (paramBoolean) {
          FrameCallback frameCallback = paramFrameCallback;
        } else {
          c1 = new c.c();
        } 
        this.maskCursor = c1;
        return;
      } 
      throw new NullPointerException("frameCallback == null");
    } 
    throw new NullPointerException("source == null");
  }
  
  private void readControlFrame() {
    StringBuilder stringBuilder;
    long l = this.frameLength;
    if (l > 0L) {
      this.source.a(this.controlFrameBuffer, l);
      if (!this.isClient) {
        this.controlFrameBuffer.a(this.maskCursor);
        this.maskCursor.a(0L);
        WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
        this.maskCursor.close();
      } 
    } 
    switch (this.opcode) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown control opcode: ");
        stringBuilder.append(Integer.toHexString(this.opcode));
        throw new ProtocolException(stringBuilder.toString());
      case 10:
        this.frameCallback.onReadPong(this.controlFrameBuffer.c());
        return;
      case 9:
        this.frameCallback.onReadPing(this.controlFrameBuffer.c());
        return;
      case 8:
        break;
    } 
    short s = 1005;
    l = this.controlFrameBuffer.s();
    if (l != 1L) {
      String str;
      if (l != 0L) {
        s = this.controlFrameBuffer.readShort();
        str = this.controlFrameBuffer.d();
        String str1 = WebSocketProtocol.closeCodeExceptionMessage(s);
        if (str1 != null)
          throw new ProtocolException(str1); 
      } else {
        str = "";
      } 
      this.frameCallback.onReadClose(s, str);
      this.closed = true;
      return;
    } 
    throw new ProtocolException("Malformed close payload length of 1.");
  }
  
  private void readHeader() {
    if (!this.closed) {
      long l = this.source.timeout().timeoutNanos();
      this.source.timeout().clearTimeout();
      try {
        boolean bool1;
        byte b = this.source.readByte();
        int i = b & 0xFF;
        this.source.timeout().timeout(l, TimeUnit.NANOSECONDS);
        this.opcode = i & 0xF;
        boolean bool2 = true;
        if ((i & 0x80) != 0) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        this.isFinalFrame = bool1;
        if ((i & 0x8) != 0) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        this.isControlFrame = bool1;
        if (!this.isControlFrame || this.isFinalFrame) {
          boolean bool;
          if ((i & 0x40) != 0) {
            b = 1;
          } else {
            b = 0;
          } 
          if ((i & 0x20) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          if ((i & 0x10) != 0) {
            i = 1;
          } else {
            i = 0;
          } 
          if (b == 0 && !bool && i == 0) {
            int j = this.source.readByte() & 0xFF;
            if ((j & 0x80) != 0) {
              bool1 = bool2;
            } else {
              bool1 = false;
            } 
            bool2 = this.isClient;
            if (bool1 == bool2) {
              String str;
              if (bool2) {
                str = "Server-sent frames must not be masked.";
              } else {
                str = "Client-sent frames must be masked.";
              } 
              throw new ProtocolException(str);
            } 
            this.frameLength = (j & 0x7F);
            l = this.frameLength;
            if (l == 126L) {
              this.frameLength = this.source.readShort() & 0xFFFFL;
            } else if (l == 127L) {
              this.frameLength = this.source.readLong();
              if (this.frameLength < 0L) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Frame length 0x");
                stringBuilder.append(Long.toHexString(this.frameLength));
                stringBuilder.append(" > 0x7FFFFFFFFFFFFFFF");
                throw new ProtocolException(stringBuilder.toString());
              } 
            } 
            if (!this.isControlFrame || this.frameLength <= 125L)
              return; 
            throw new ProtocolException("Control frame must be less than 125B.");
          } 
          throw new ProtocolException("Reserved flags are unsupported.");
        } 
        throw new ProtocolException("Control frames must be final.");
      } finally {
        this.source.timeout().timeout(l, TimeUnit.NANOSECONDS);
      } 
    } 
    throw new IOException("closed");
  }
  
  private void readMessage() {
    while (!this.closed) {
      long l = this.frameLength;
      if (l > 0L) {
        this.source.a(this.messageFrameBuffer, l);
        if (!this.isClient) {
          this.messageFrameBuffer.a(this.maskCursor);
          this.maskCursor.a(this.messageFrameBuffer.s() - this.frameLength);
          WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
          this.maskCursor.close();
        } 
      } 
      if (this.isFinalFrame)
        return; 
      readUntilNonControlFrame();
      if (this.opcode == 0)
        continue; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Expected continuation opcode. Got: ");
      stringBuilder.append(Integer.toHexString(this.opcode));
      throw new ProtocolException(stringBuilder.toString());
    } 
    IOException iOException = new IOException("closed");
    throw iOException;
  }
  
  private void readMessageFrame() {
    int i = this.opcode;
    if (i == 1 || i == 2) {
      readMessage();
      if (i == 1) {
        this.frameCallback.onReadMessage(this.messageFrameBuffer.d());
        return;
      } 
      this.frameCallback.onReadMessage(this.messageFrameBuffer.c());
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown opcode: ");
    stringBuilder.append(Integer.toHexString(i));
    throw new ProtocolException(stringBuilder.toString());
  }
  
  private void readUntilNonControlFrame() {
    while (!this.closed) {
      readHeader();
      if (!this.isControlFrame)
        return; 
      readControlFrame();
    } 
  }
  
  void processNextFrame() {
    readHeader();
    if (this.isControlFrame) {
      readControlFrame();
      return;
    } 
    readMessageFrame();
  }
  
  public static interface FrameCallback {
    void onReadClose(int param1Int, String param1String);
    
    void onReadMessage(f param1f);
    
    void onReadMessage(String param1String);
    
    void onReadPing(f param1f);
    
    void onReadPong(f param1f);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/ws/WebSocketReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */