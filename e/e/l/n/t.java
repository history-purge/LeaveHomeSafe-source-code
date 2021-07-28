package e.e.l.n;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import e.e.e.k.f;
import e.e.l.k.d;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class t extends c<t.c> {
  private int a;
  
  private final ExecutorService b = Executors.newFixedThreadPool(3);
  
  private final com.facebook.common.time.b c;
  
  public t(int paramInt) {
    this((com.facebook.common.time.b)RealtimeSinceBootClock.get());
    this.a = paramInt;
  }
  
  t(com.facebook.common.time.b paramb) {
    this.c = paramb;
  }
  
  private static String a(String paramString, Object... paramVarArgs) {
    return String.format(Locale.getDefault(), paramString, paramVarArgs);
  }
  
  static HttpURLConnection a(Uri paramUri) {
    return (HttpURLConnection)f.k(paramUri).openConnection();
  }
  
  private HttpURLConnection a(Uri paramUri, int paramInt) {
    String str;
    Uri uri;
    HttpURLConnection httpURLConnection = a(paramUri);
    httpURLConnection.setConnectTimeout(this.a);
    int i = httpURLConnection.getResponseCode();
    if (b(i))
      return httpURLConnection; 
    if (a(i)) {
      String str1 = httpURLConnection.getHeaderField("Location");
      httpURLConnection.disconnect();
      if (str1 == null) {
        httpURLConnection = null;
      } else {
        uri = Uri.parse(str1);
      } 
      str1 = paramUri.getScheme();
      if (paramInt > 0 && uri != null && !uri.getScheme().equals(str1))
        return a(uri, paramInt - 1); 
      if (paramInt == 0) {
        str = a("URL %s follows too many redirects", new Object[] { paramUri.toString() });
      } else {
        str = a("URL %s returned %d without a valid redirect", new Object[] { str.toString(), Integer.valueOf(i) });
      } 
      throw new IOException(str);
    } 
    uri.disconnect();
    throw new IOException(String.format("Image URL %s returned HTTP code %d", new Object[] { str.toString(), Integer.valueOf(i) }));
  }
  
  private static boolean a(int paramInt) {
    if (paramInt != 307 && paramInt != 308)
      switch (paramInt) {
        default:
          return false;
        case 300:
        case 301:
        case 302:
        case 303:
          break;
      }  
    return true;
  }
  
  private static boolean b(int paramInt) {
    return (paramInt >= 200 && paramInt < 300);
  }
  
  public c a(k<d> paramk, k0 paramk0) {
    return new c(paramk, paramk0);
  }
  
  public Map<String, String> a(c paramc, int paramInt) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(4);
    hashMap.put("queue_time", Long.toString(c.b(paramc) - c.a(paramc)));
    hashMap.put("fetch_time", Long.toString(c.c(paramc) - c.b(paramc)));
    hashMap.put("total_time", Long.toString(c.c(paramc) - c.a(paramc)));
    hashMap.put("image_size", Integer.toString(paramInt));
    return (Map)hashMap;
  }
  
  public void a(c paramc, f0.a parama) {
    c.a(paramc, this.c.now());
    Future<?> future = this.b.submit(new a(this, paramc, parama));
    paramc.b().a(new b(this, future, parama));
  }
  
  public void b(c paramc, int paramInt) {
    c.c(paramc, this.c.now());
  }
  
  void b(c paramc, f0.a parama) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #7
    //   3: aconst_null
    //   4: astore #6
    //   6: aconst_null
    //   7: astore #8
    //   9: aconst_null
    //   10: astore_3
    //   11: aconst_null
    //   12: astore #9
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual h : ()Landroid/net/Uri;
    //   19: iconst_5
    //   20: invokespecial a : (Landroid/net/Uri;I)Ljava/net/HttpURLConnection;
    //   23: astore #4
    //   25: aload #7
    //   27: astore #6
    //   29: aload #8
    //   31: astore_3
    //   32: aload #4
    //   34: astore #5
    //   36: aload_1
    //   37: aload_0
    //   38: getfield c : Lcom/facebook/common/time/b;
    //   41: invokeinterface now : ()J
    //   46: invokestatic b : (Le/e/l/n/t$c;J)J
    //   49: pop2
    //   50: aload #9
    //   52: astore_1
    //   53: aload #4
    //   55: ifnull -> 92
    //   58: aload #7
    //   60: astore #6
    //   62: aload #8
    //   64: astore_3
    //   65: aload #4
    //   67: astore #5
    //   69: aload #4
    //   71: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   74: astore_1
    //   75: aload_1
    //   76: astore #6
    //   78: aload_1
    //   79: astore_3
    //   80: aload #4
    //   82: astore #5
    //   84: aload_2
    //   85: aload_1
    //   86: iconst_m1
    //   87: invokeinterface a : (Ljava/io/InputStream;I)V
    //   92: aload_1
    //   93: ifnull -> 103
    //   96: aload_1
    //   97: invokevirtual close : ()V
    //   100: goto -> 103
    //   103: aload #4
    //   105: ifnull -> 170
    //   108: aload #4
    //   110: astore_1
    //   111: goto -> 166
    //   114: astore_3
    //   115: aload #4
    //   117: astore_1
    //   118: aload_3
    //   119: astore #4
    //   121: goto -> 135
    //   124: astore_1
    //   125: aconst_null
    //   126: astore #5
    //   128: goto -> 172
    //   131: astore #4
    //   133: aconst_null
    //   134: astore_1
    //   135: aload #6
    //   137: astore_3
    //   138: aload_1
    //   139: astore #5
    //   141: aload_2
    //   142: aload #4
    //   144: invokeinterface a : (Ljava/lang/Throwable;)V
    //   149: aload #6
    //   151: ifnull -> 162
    //   154: aload #6
    //   156: invokevirtual close : ()V
    //   159: goto -> 162
    //   162: aload_1
    //   163: ifnull -> 170
    //   166: aload_1
    //   167: invokevirtual disconnect : ()V
    //   170: return
    //   171: astore_1
    //   172: aload_3
    //   173: ifnull -> 183
    //   176: aload_3
    //   177: invokevirtual close : ()V
    //   180: goto -> 183
    //   183: aload #5
    //   185: ifnull -> 193
    //   188: aload #5
    //   190: invokevirtual disconnect : ()V
    //   193: aload_1
    //   194: athrow
    //   195: astore_1
    //   196: goto -> 103
    //   199: astore_2
    //   200: goto -> 162
    //   203: astore_2
    //   204: goto -> 183
    // Exception table:
    //   from	to	target	type
    //   14	25	131	java/io/IOException
    //   14	25	124	finally
    //   36	50	114	java/io/IOException
    //   36	50	171	finally
    //   69	75	114	java/io/IOException
    //   69	75	171	finally
    //   84	92	114	java/io/IOException
    //   84	92	171	finally
    //   96	100	195	java/io/IOException
    //   141	149	171	finally
    //   154	159	199	java/io/IOException
    //   176	180	203	java/io/IOException
  }
  
  class a implements Runnable {
    a(t this$0, t.c param1c, f0.a param1a) {}
    
    public void run() {
      this.e.b(this.c, this.d);
    }
  }
  
  class b extends e {
    b(t this$0, Future param1Future, f0.a param1a) {}
    
    public void a() {
      if (this.a.cancel(false))
        this.b.a(); 
    }
  }
  
  public static class c extends s {
    private long f;
    
    private long g;
    
    private long h;
    
    public c(k<d> param1k, k0 param1k0) {
      super(param1k, param1k0);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */