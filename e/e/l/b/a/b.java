package e.e.l.b.a;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import e.e.l.k.d;
import e.e.l.n.c;
import e.e.l.n.e;
import e.e.l.n.f0;
import e.e.l.n.k;
import e.e.l.n.k0;
import e.e.l.n.l0;
import e.e.l.n.s;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class b extends c<b.c> {
  private final Call.Factory a;
  
  private final CacheControl b;
  
  private Executor c;
  
  public b(Call.Factory paramFactory, Executor paramExecutor) {
    this(paramFactory, paramExecutor, true);
  }
  
  public b(Call.Factory paramFactory, Executor paramExecutor, boolean paramBoolean) {
    this.a = paramFactory;
    this.c = paramExecutor;
    if (paramBoolean) {
      CacheControl cacheControl = (new CacheControl.Builder()).noStore().build();
    } else {
      paramFactory = null;
    } 
    this.b = (CacheControl)paramFactory;
  }
  
  public b(OkHttpClient paramOkHttpClient) {
    this((Call.Factory)paramOkHttpClient, paramOkHttpClient.dispatcher().executorService());
  }
  
  private void a(Call paramCall, Exception paramException, f0.a parama) {
    if (paramCall.isCanceled()) {
      parama.a();
      return;
    } 
    parama.a(paramException);
  }
  
  public c a(k<d> paramk, k0 paramk0) {
    return new c(paramk, paramk0);
  }
  
  public Map<String, String> a(c paramc, int paramInt) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(4);
    hashMap.put("queue_time", Long.toString(paramc.g - paramc.f));
    hashMap.put("fetch_time", Long.toString(paramc.h - paramc.g));
    hashMap.put("total_time", Long.toString(paramc.h - paramc.f));
    hashMap.put("image_size", Integer.toString(paramInt));
    return (Map)hashMap;
  }
  
  public void a(c paramc, f0.a parama) {
    paramc.f = SystemClock.elapsedRealtime();
    Uri uri = paramc.h();
    try {
      Request.Builder builder = (new Request.Builder()).url(uri.toString()).get();
      if (this.b != null)
        builder.cacheControl(this.b); 
      e.e.l.e.a a1 = paramc.b().f().a();
      if (a1 != null)
        builder.addHeader("Range", a1.a()); 
      a(paramc, parama, builder.build());
      return;
    } catch (Exception exception) {
      parama.a(exception);
      return;
    } 
  }
  
  protected void a(c paramc, f0.a parama, Request paramRequest) {
    Call call = this.a.newCall(paramRequest);
    paramc.b().a((l0)new a(this, call));
    call.enqueue(new b(this, paramc, parama));
  }
  
  public void b(c paramc, int paramInt) {
    paramc.h = SystemClock.elapsedRealtime();
  }
  
  class a extends e {
    a(b this$0, Call param1Call) {}
    
    public void a() {
      if (Looper.myLooper() != Looper.getMainLooper()) {
        this.a.cancel();
        return;
      } 
      b.a(this.b).execute(new a(this));
    }
    
    class a implements Runnable {
      a(b.a this$0) {}
      
      public void run() {
        this.c.a.cancel();
      }
    }
  }
  
  class a implements Runnable {
    a(b this$0) {}
    
    public void run() {
      this.c.a.cancel();
    }
  }
  
  class b implements Callback {
    b(b this$0, b.c param1c, f0.a param1a) {}
    
    public void onFailure(Call param1Call, IOException param1IOException) {
      b.a(this.c, param1Call, param1IOException, this.b);
    }
    
    public void onResponse(Call param1Call, Response param1Response) {
      this.a.g = SystemClock.elapsedRealtime();
      ResponseBody responseBody = param1Response.body();
      try {
        if (!param1Response.isSuccessful()) {
          b b1 = this.c;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unexpected HTTP code ");
          stringBuilder.append(param1Response);
          b.a(b1, param1Call, new IOException(stringBuilder.toString()), this.b);
          responseBody.close();
          return;
        } 
        e.e.l.e.a a1 = e.e.l.e.a.a(param1Response.header("Content-Range"));
        if (a1 != null && (a1.a != 0 || a1.b != Integer.MAX_VALUE)) {
          this.a.a(a1);
          this.a.a(8);
        } 
        long l2 = responseBody.contentLength();
        long l1 = l2;
        if (l2 < 0L)
          l1 = 0L; 
        this.b.a(responseBody.byteStream(), (int)l1);
      } catch (Exception exception) {
        b.a(this.c, param1Call, exception, this.b);
      } finally {}
      responseBody.close();
    }
  }
  
  public static class c extends s {
    public long f;
    
    public long g;
    
    public long h;
    
    public c(k<d> param1k, k0 param1k0) {
      super(param1k, param1k0);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */