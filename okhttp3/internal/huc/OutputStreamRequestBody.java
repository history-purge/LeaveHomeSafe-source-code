package okhttp3.internal.huc;

import j.d;
import j.u;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

abstract class OutputStreamRequestBody extends RequestBody {
  boolean closed;
  
  private long expectedContentLength;
  
  private OutputStream outputStream;
  
  private u timeout;
  
  public long contentLength() {
    return this.expectedContentLength;
  }
  
  public final MediaType contentType() {
    return null;
  }
  
  protected void initOutputStream(final d sink, final long expectedContentLength) {
    this.timeout = sink.timeout();
    this.expectedContentLength = expectedContentLength;
    this.outputStream = new OutputStream() {
        private long bytesReceived;
        
        public void close() {
          OutputStreamRequestBody.this.closed = true;
          long l = expectedContentLength;
          if (l == -1L || this.bytesReceived >= l) {
            sink.close();
            return;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("expected ");
          stringBuilder.append(expectedContentLength);
          stringBuilder.append(" bytes but received ");
          stringBuilder.append(this.bytesReceived);
          throw new ProtocolException(stringBuilder.toString());
        }
        
        public void flush() {
          if (OutputStreamRequestBody.this.closed)
            return; 
          sink.flush();
        }
        
        public void write(int param1Int) {
          write(new byte[] { (byte)param1Int }, 0, 1);
        }
        
        public void write(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
          if (!OutputStreamRequestBody.this.closed) {
            long l = expectedContentLength;
            if (l == -1L || this.bytesReceived + param1Int2 <= l) {
              this.bytesReceived += param1Int2;
              try {
                sink.write(param1ArrayOfbyte, param1Int1, param1Int2);
                return;
              } catch (InterruptedIOException interruptedIOException) {
                throw new SocketTimeoutException(interruptedIOException.getMessage());
              } 
            } 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected ");
            stringBuilder.append(expectedContentLength);
            stringBuilder.append(" bytes but received ");
            stringBuilder.append(this.bytesReceived);
            stringBuilder.append(param1Int2);
            throw new ProtocolException(stringBuilder.toString());
          } 
          throw new IOException("closed");
        }
      };
  }
  
  public final boolean isClosed() {
    return this.closed;
  }
  
  public final OutputStream outputStream() {
    return this.outputStream;
  }
  
  public Request prepareToSendRequest(Request paramRequest) {
    return paramRequest;
  }
  
  public final u timeout() {
    return this.timeout;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/huc/OutputStreamRequestBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */