package e.f.a.e.i.d;

import android.content.Context;
import android.util.Log;
import e.f.a.e.c.a;
import e.f.a.e.c.f;
import e.f.a.e.e.n.b;
import e.f.a.e.j.b;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class v5 implements a.b {
  private static final Charset b = Charset.forName("UTF-8");
  
  private static final p c = (new p(b.a("com.google.android.gms.clearcut.public"))).a("gms:playlog:service:samplingrules_").b("LogSamplingRules__");
  
  private static final p d = (new p(b.a("com.google.android.gms.clearcut.public"))).a("gms:playlog:service:sampling_").b("LogSampling__");
  
  private static final ConcurrentHashMap<String, f<h5>> e = new ConcurrentHashMap<String, f<h5>>();
  
  private static final HashMap<String, f<String>> f = new HashMap<String, f<String>>();
  
  private static Boolean g = null;
  
  private static Long h = null;
  
  private static final f<Boolean> i = c.a("enable_log_sampling_rules", false);
  
  private final Context a;
  
  public v5(Context paramContext) {
    this.a = paramContext;
    paramContext = this.a;
    if (paramContext != null)
      f.a(paramContext); 
  }
  
  private static long a(String paramString, long paramLong) {
    if (paramString == null || paramString.isEmpty())
      return q5.a(ByteBuffer.allocate(8).putLong(paramLong).array()); 
    byte[] arrayOfByte = paramString.getBytes(b);
    ByteBuffer byteBuffer = ByteBuffer.allocate(arrayOfByte.length + 8);
    byteBuffer.put(arrayOfByte);
    byteBuffer.putLong(paramLong);
    return q5.a(byteBuffer.array());
  }
  
  private static h5.b a(String paramString) {
    h5.b.a a;
    String str;
    if (paramString == null)
      return null; 
    int i = paramString.indexOf(',');
    if (i >= 0) {
      str = paramString.substring(0, i);
      i++;
    } else {
      str = "";
      i = 0;
    } 
    int j = paramString.indexOf('/', i);
    if (j <= 0) {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Failed to parse the rule: ".concat(paramString);
      } else {
        paramString = new String("Failed to parse the rule: ");
      } 
      Log.e("LogSamplerImpl", paramString);
      return null;
    } 
    try {
      long l1 = Long.parseLong(paramString.substring(i, j));
      long l2 = Long.parseLong(paramString.substring(j + 1));
      if (l1 < 0L || l2 < 0L) {
        StringBuilder stringBuilder = new StringBuilder(72);
        stringBuilder.append("negative values not supported: ");
        stringBuilder.append(l1);
        stringBuilder.append("/");
        stringBuilder.append(l2);
        Log.e("LogSamplerImpl", stringBuilder.toString());
        return null;
      } 
      a = h5.b.n();
      a.a(str);
      a.a(l1);
      a.b(l2);
      return (h5.b)a.i();
    } catch (NumberFormatException numberFormatException) {
      String str1 = String.valueOf(a);
      if (str1.length() != 0) {
        str1 = "parseLong() failed while parsing: ".concat(str1);
      } else {
        str1 = new String("parseLong() failed while parsing: ");
      } 
      Log.e("LogSamplerImpl", str1, numberFormatException);
      return null;
    } 
  }
  
  private static boolean a(long paramLong1, long paramLong2, long paramLong3) {
    if (paramLong2 >= 0L && paramLong3 > 0L) {
      if (paramLong1 >= 0L) {
        paramLong1 %= paramLong3;
      } else {
        paramLong1 = (Long.MAX_VALUE % paramLong3 + 1L + (paramLong1 & Long.MAX_VALUE) % paramLong3) % paramLong3;
      } 
      if (paramLong1 >= paramLong2)
        return false; 
    } 
    return true;
  }
  
  private static boolean a(Context paramContext) {
    if (g == null) {
      boolean bool;
      if (b.a(paramContext).a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      g = Boolean.valueOf(bool);
    } 
    return g.booleanValue();
  }
  
  private static long b(Context paramContext) {
    if (h == null) {
      long l = 0L;
      if (paramContext != null) {
        if (a(paramContext))
          l = z5.a(paramContext.getContentResolver(), "android_id", 0L); 
        h = Long.valueOf(l);
      } else {
        return 0L;
      } 
    } 
    return h.longValue();
  }
  
  public final boolean a(f paramf) {
    boolean bool;
    x5 x5 = paramf.c;
    String str = x5.i;
    int i = x5.e;
    m5 m5 = paramf.k;
    if (m5 != null) {
      bool = m5.h;
    } else {
      bool = false;
    } 
    boolean bool1 = ((Boolean)i.a()).booleanValue();
    x5 = null;
    if (!bool1) {
      if (str != null && !str.isEmpty()) {
        String str1 = str;
      } else if (i >= 0) {
        String str1 = String.valueOf(i);
      } else {
        m5 = null;
      } 
      if (m5 != null) {
        Context context = this.a;
        x5 x51 = x5;
        if (context != null)
          if (!a(context)) {
            x51 = x5;
          } else {
            f<String> f2 = f.get(m5);
            f<String> f1 = f2;
            if (f2 == null) {
              f1 = d.a((String)m5, (String)null);
              f.put(m5, f1);
            } 
            str = f1.a();
          }  
        h5.b b1 = a(str);
        if (b1 != null)
          return a(a(b1.k(), b(this.a)), b1.l(), b1.m()); 
      } 
    } else {
      if (str != null && !str.isEmpty()) {
        String str1 = str;
      } else if (i >= 0) {
        String str1 = String.valueOf(i);
      } else {
        m5 = null;
      } 
      if (m5 != null) {
        List<?> list;
        if (this.a == null) {
          list = Collections.emptyList();
        } else {
          f<h5> f2 = e.get(list);
          f<h5> f1 = f2;
          if (f2 == null) {
            f1 = c.a((String)list, h5.j(), w5.a);
            f<h5> f3 = e.putIfAbsent(list, f1);
            if (f3 != null)
              f1 = f3; 
          } 
          list = ((h5)f1.a()).i();
        } 
        for (h5.b b1 : list) {
          if ((!b1.j() || b1.i() == 0 || b1.i() == bool) && !a(a(b1.k(), b(this.a)), b1.l(), b1.m()))
            return false; 
        } 
      } 
    } 
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/v5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */