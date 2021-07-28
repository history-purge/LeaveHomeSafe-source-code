package okhttp3;

import java.io.IOException;

public interface Callback {
  void onFailure(Call paramCall, IOException paramIOException);
  
  void onResponse(Call paramCall, Response paramResponse);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/Callback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */