package okhttp3.internal.http;

import j.s;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public interface HttpCodec {
  public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;
  
  void cancel();
  
  s createRequestBody(Request paramRequest, long paramLong);
  
  void finishRequest();
  
  void flushRequest();
  
  ResponseBody openResponseBody(Response paramResponse);
  
  Response.Builder readResponseHeaders(boolean paramBoolean);
  
  void writeRequestHeaders(Request paramRequest);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http/HttpCodec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */