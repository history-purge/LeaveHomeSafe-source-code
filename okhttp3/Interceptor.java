package okhttp3;

import java.util.concurrent.TimeUnit;

public interface Interceptor {
  Response intercept(Chain paramChain);
  
  public static interface Chain {
    Call call();
    
    int connectTimeoutMillis();
    
    Connection connection();
    
    Response proceed(Request param1Request);
    
    int readTimeoutMillis();
    
    Request request();
    
    Chain withConnectTimeout(int param1Int, TimeUnit param1TimeUnit);
    
    Chain withReadTimeout(int param1Int, TimeUnit param1TimeUnit);
    
    Chain withWriteTimeout(int param1Int, TimeUnit param1TimeUnit);
    
    int writeTimeoutMillis();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/Interceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */