package okhttp3.internal.http2;

import j.e;
import java.util.List;

public interface PushObserver {
  public static final PushObserver CANCEL = new PushObserver() {
      public boolean onData(int param1Int1, e param1e, int param1Int2, boolean param1Boolean) {
        param1e.skip(param1Int2);
        return true;
      }
      
      public boolean onHeaders(int param1Int, List<Header> param1List, boolean param1Boolean) {
        return true;
      }
      
      public boolean onRequest(int param1Int, List<Header> param1List) {
        return true;
      }
      
      public void onReset(int param1Int, ErrorCode param1ErrorCode) {}
    };
  
  boolean onData(int paramInt1, e parame, int paramInt2, boolean paramBoolean);
  
  boolean onHeaders(int paramInt, List<Header> paramList, boolean paramBoolean);
  
  boolean onRequest(int paramInt, List<Header> paramList);
  
  void onReset(int paramInt, ErrorCode paramErrorCode);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http2/PushObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */