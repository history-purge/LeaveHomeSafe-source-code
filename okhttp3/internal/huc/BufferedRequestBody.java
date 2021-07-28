package okhttp3.internal.huc;

import j.c;
import j.d;
import okhttp3.Request;

final class BufferedRequestBody extends OutputStreamRequestBody {
  final c buffer = new c();
  
  long contentLength = -1L;
  
  BufferedRequestBody(long paramLong) {
    initOutputStream((d)this.buffer, paramLong);
  }
  
  public long contentLength() {
    return this.contentLength;
  }
  
  public Request prepareToSendRequest(Request paramRequest) {
    if (paramRequest.header("Content-Length") != null)
      return paramRequest; 
    outputStream().close();
    this.contentLength = this.buffer.s();
    return paramRequest.newBuilder().removeHeader("Transfer-Encoding").header("Content-Length", Long.toString(this.buffer.s())).build();
  }
  
  public void writeTo(d paramd) {
    this.buffer.a(paramd.f(), 0L, this.buffer.s());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/huc/BufferedRequestBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */