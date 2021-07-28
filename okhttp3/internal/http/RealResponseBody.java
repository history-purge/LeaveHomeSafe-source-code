package okhttp3.internal.http;

import j.e;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

public final class RealResponseBody extends ResponseBody {
  private final long contentLength;
  
  private final String contentTypeString;
  
  private final e source;
  
  public RealResponseBody(String paramString, long paramLong, e parame) {
    this.contentTypeString = paramString;
    this.contentLength = paramLong;
    this.source = parame;
  }
  
  public long contentLength() {
    return this.contentLength;
  }
  
  public MediaType contentType() {
    String str = this.contentTypeString;
    return (str != null) ? MediaType.parse(str) : null;
  }
  
  public e source() {
    return this.source;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http/RealResponseBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */