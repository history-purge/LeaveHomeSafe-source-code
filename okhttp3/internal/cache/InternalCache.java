package okhttp3.internal.cache;

import okhttp3.Request;
import okhttp3.Response;

public interface InternalCache {
  Response get(Request paramRequest);
  
  CacheRequest put(Response paramResponse);
  
  void remove(Request paramRequest);
  
  void trackConditionalCacheHit();
  
  void trackResponse(CacheStrategy paramCacheStrategy);
  
  void update(Response paramResponse1, Response paramResponse2);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/cache/InternalCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */