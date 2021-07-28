package okhttp3.internal.http2;

import java.io.IOException;

public final class StreamResetException extends IOException {
  public final ErrorCode errorCode;
  
  public StreamResetException(ErrorCode paramErrorCode) {
    super(stringBuilder.toString());
    this.errorCode = paramErrorCode;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http2/StreamResetException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */