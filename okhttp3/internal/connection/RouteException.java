package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.internal.Util;

public final class RouteException extends RuntimeException {
  private IOException firstException;
  
  private IOException lastException;
  
  public RouteException(IOException paramIOException) {
    super(paramIOException);
    this.firstException = paramIOException;
    this.lastException = paramIOException;
  }
  
  public void addConnectException(IOException paramIOException) {
    Util.addSuppressedIfPossible(this.firstException, paramIOException);
    this.lastException = paramIOException;
  }
  
  public IOException getFirstConnectException() {
    return this.firstException;
  }
  
  public IOException getLastConnectException() {
    return this.lastException;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/connection/RouteException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */