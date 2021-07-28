package okhttp3.internal.cache;

import j.c;
import j.g;
import j.s;
import java.io.IOException;

class FaultHidingSink extends g {
  private boolean hasErrors;
  
  FaultHidingSink(s params) {
    super(params);
  }
  
  public void close() {
    if (this.hasErrors)
      return; 
    try {
      super.close();
      return;
    } catch (IOException iOException) {
      this.hasErrors = true;
      onException(iOException);
      return;
    } 
  }
  
  public void flush() {
    if (this.hasErrors)
      return; 
    try {
      super.flush();
      return;
    } catch (IOException iOException) {
      this.hasErrors = true;
      onException(iOException);
      return;
    } 
  }
  
  protected void onException(IOException paramIOException) {}
  
  public void write(c paramc, long paramLong) {
    if (this.hasErrors) {
      paramc.skip(paramLong);
      return;
    } 
    try {
      super.write(paramc, paramLong);
      return;
    } catch (IOException iOException) {
      this.hasErrors = true;
      onException(iOException);
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/cache/FaultHidingSink.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */