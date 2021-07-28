package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.f.a;
import com.google.android.datatransport.cct.f.j;
import com.google.android.datatransport.cct.f.k;
import com.google.android.datatransport.cct.f.l;
import com.google.android.datatransport.cct.f.m;
import com.google.android.datatransport.cct.f.o;
import com.google.android.datatransport.cct.f.p;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import com.google.firebase.m.c;
import e.f.a.c.i.h;
import e.f.a.c.i.i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

final class d implements m {
  private final com.google.firebase.m.a a = j.b();
  
  private final ConnectivityManager b;
  
  private final Context c;
  
  final URL d;
  
  private final e.f.a.c.i.z.a e;
  
  private final e.f.a.c.i.z.a f;
  
  private final int g;
  
  d(Context paramContext, e.f.a.c.i.z.a parama1, e.f.a.c.i.z.a parama2) {
    this(paramContext, parama1, parama2, 40000);
  }
  
  d(Context paramContext, e.f.a.c.i.z.a parama1, e.f.a.c.i.z.a parama2, int paramInt) {
    this.c = paramContext;
    this.b = (ConnectivityManager)paramContext.getSystemService("connectivity");
    this.d = a(c.c);
    this.e = parama2;
    this.f = parama1;
    this.g = paramInt;
  }
  
  private static int a(Context paramContext) {
    try {
      return (paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0)).versionCode;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      e.f.a.c.i.v.a.a("CctTransportBackend", "Unable to find version code for package", (Throwable)nameNotFoundException);
      return -1;
    } 
  }
  
  private static int a(NetworkInfo paramNetworkInfo) {
    o.b b;
    if (paramNetworkInfo == null) {
      b = o.b.c;
      return b.a();
    } 
    int i = b.getSubtype();
    if (i == -1) {
      b = o.b.w;
      return b.a();
    } 
    return (o.b.f(i) != null) ? i : 0;
  }
  
  static long a() {
    Calendar.getInstance();
    return (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
  }
  
  private b a(a parama) {
    e.f.a.c.i.v.a.a("CctTransportBackend", "Making request to: %s", parama.a);
    HttpURLConnection httpURLConnection = (HttpURLConnection)parama.a.openConnection();
    httpURLConnection.setConnectTimeout(30000);
    httpURLConnection.setReadTimeout(this.g);
    httpURLConnection.setDoOutput(true);
    httpURLConnection.setInstanceFollowRedirects(false);
    httpURLConnection.setRequestMethod("POST");
    httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[] { "3.0.0" }));
    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
    httpURLConnection.setRequestProperty("Content-Type", "application/json");
    httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
    String str = parama.c;
    if (str != null)
      httpURLConnection.setRequestProperty("X-Goog-Api-Key", str); 
    try {
      OutputStream outputStream = httpURLConnection.getOutputStream();
      try {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
      } finally {
        if (outputStream != null)
          try {
            outputStream.close();
          } finally {} 
      } 
    } catch (ConnectException null) {
    
    } catch (UnknownHostException null) {
    
    } catch (c c) {
      e.f.a.c.i.v.a.a("CctTransportBackend", "Couldn't encode request, returning with 400", (Throwable)c);
      return new b(400, null, 0L);
    } catch (IOException iOException) {
      e.f.a.c.i.v.a.a("CctTransportBackend", "Couldn't encode request, returning with 400", iOException);
      return new b(400, null, 0L);
    } 
    e.f.a.c.i.v.a.a("CctTransportBackend", "Couldn't open connection, returning with 500", iOException);
    return new b(500, null, 0L);
  }
  
  private static InputStream a(InputStream paramInputStream, String paramString) {
    return "gzip".equals(paramString) ? new GZIPInputStream(paramInputStream) : paramInputStream;
  }
  
  private static URL a(String paramString) {
    try {
      return new URL(paramString);
    } catch (MalformedURLException malformedURLException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid url: ");
      stringBuilder.append(paramString);
      throw new IllegalArgumentException(stringBuilder.toString(), malformedURLException);
    } 
  }
  
  private static int b(NetworkInfo paramNetworkInfo) {
    return (paramNetworkInfo == null) ? o.c.u.a() : paramNetworkInfo.getType();
  }
  
  private static TelephonyManager b(Context paramContext) {
    return (TelephonyManager)paramContext.getSystemService("phone");
  }
  
  private j b(f paramf) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    for (i i : paramf.a()) {
      String str = i.f();
      if (!hashMap.containsKey(str)) {
        ArrayList<i> arrayList1 = new ArrayList();
        arrayList1.add(i);
        hashMap.put(str, arrayList1);
        continue;
      } 
      ((List<i>)hashMap.get(str)).add(i);
    } 
    ArrayList<m> arrayList = new ArrayList();
    Iterator<Map.Entry> iterator = hashMap.entrySet().iterator();
    while (true) {
      if (iterator.hasNext()) {
        Map.Entry entry = iterator.next();
        i i = ((List<i>)entry.getValue()).get(0);
        m.a a1 = m.h();
        a1.a(p.c);
        a1.a(this.f.a());
        a1.b(this.e.a());
        k.a a2 = k.c();
        a2.a(k.b.d);
        a.a a3 = a.m();
        a3.a(Integer.valueOf(i.b("sdk-version")));
        a3.i(i.a("model"));
        a3.e(i.a("hardware"));
        a3.c(i.a("device"));
        a3.k(i.a("product"));
        a3.j(i.a("os-uild"));
        a3.g(i.a("manufacturer"));
        a3.d(i.a("fingerprint"));
        a3.b(i.a("country"));
        a3.f(i.a("locale"));
        a3.h(i.a("mcc_mnc"));
        a3.a(i.a("application_build"));
        a2.a(a3.a());
        a1.a(a2.a());
        try {
          a1.a(Integer.parseInt((String)entry.getKey()));
        } catch (NumberFormatException numberFormatException) {
          a1.b((String)entry.getKey());
        } 
        ArrayList<l> arrayList1 = new ArrayList();
        for (i i1 : entry.getValue()) {
          l.a a4;
          h h = i1.c();
          e.f.a.c.b b = h.b();
          if (b.equals(e.f.a.c.b.a("proto"))) {
            a4 = l.a(h.a());
          } else if (b.equals(e.f.a.c.b.a("json"))) {
            a4 = l.a(new String(a4.a(), Charset.forName("UTF-8")));
          } else {
            e.f.a.c.i.v.a.b("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b);
            continue;
          } 
          a4.a(i1.d());
          a4.b(i1.g());
          a4.c(i1.c("tz-offset"));
          o.a a5 = o.c();
          a5.a(o.c.f(i1.b("net-type")));
          a5.a(o.b.f(i1.b("mobile-subtype")));
          a4.a(a5.a());
          if (i1.b() != null)
            a4.a(i1.b()); 
          arrayList1.add(a4.a());
        } 
        a1.a(arrayList1);
        arrayList.add(a1.a());
        continue;
      } 
      return j.a(arrayList);
    } 
  }
  
  public g a(f paramf) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial b : (Lcom/google/android/datatransport/runtime/backends/f;)Lcom/google/android/datatransport/cct/f/j;
    //   5: astore #6
    //   7: aload_0
    //   8: getfield d : Ljava/net/URL;
    //   11: astore #4
    //   13: aload_1
    //   14: invokevirtual b : ()[B
    //   17: astore #7
    //   19: aconst_null
    //   20: astore_3
    //   21: aconst_null
    //   22: astore #5
    //   24: aload #4
    //   26: astore_2
    //   27: aload #7
    //   29: ifnull -> 89
    //   32: aload_1
    //   33: invokevirtual b : ()[B
    //   36: invokestatic a : ([B)Lcom/google/android/datatransport/cct/c;
    //   39: astore #7
    //   41: aload #5
    //   43: astore_1
    //   44: aload #7
    //   46: invokevirtual d : ()Ljava/lang/String;
    //   49: ifnull -> 58
    //   52: aload #7
    //   54: invokevirtual d : ()Ljava/lang/String;
    //   57: astore_1
    //   58: aload #4
    //   60: astore_2
    //   61: aload_1
    //   62: astore_3
    //   63: aload #7
    //   65: invokevirtual e : ()Ljava/lang/String;
    //   68: ifnull -> 89
    //   71: aload #7
    //   73: invokevirtual e : ()Ljava/lang/String;
    //   76: invokestatic a : (Ljava/lang/String;)Ljava/net/URL;
    //   79: astore_2
    //   80: aload_1
    //   81: astore_3
    //   82: goto -> 89
    //   85: invokestatic c : ()Lcom/google/android/datatransport/runtime/backends/g;
    //   88: areturn
    //   89: iconst_5
    //   90: new com/google/android/datatransport/cct/d$a
    //   93: dup
    //   94: aload_2
    //   95: aload #6
    //   97: aload_3
    //   98: invokespecial <init> : (Ljava/net/URL;Lcom/google/android/datatransport/cct/f/j;Ljava/lang/String;)V
    //   101: new com/google/android/datatransport/cct/a
    //   104: dup
    //   105: aload_0
    //   106: invokespecial <init> : (Lcom/google/android/datatransport/cct/d;)V
    //   109: getstatic com/google/android/datatransport/cct/b.a : Lcom/google/android/datatransport/cct/b;
    //   112: invokestatic a : (ILjava/lang/Object;Le/f/a/c/i/w/a;Le/f/a/c/i/w/c;)Ljava/lang/Object;
    //   115: checkcast com/google/android/datatransport/cct/d$b
    //   118: astore_1
    //   119: aload_1
    //   120: getfield a : I
    //   123: sipush #200
    //   126: if_icmpne -> 137
    //   129: aload_1
    //   130: getfield c : J
    //   133: invokestatic a : (J)Lcom/google/android/datatransport/runtime/backends/g;
    //   136: areturn
    //   137: aload_1
    //   138: getfield a : I
    //   141: sipush #500
    //   144: if_icmpge -> 164
    //   147: aload_1
    //   148: getfield a : I
    //   151: sipush #404
    //   154: if_icmpne -> 160
    //   157: goto -> 164
    //   160: invokestatic c : ()Lcom/google/android/datatransport/runtime/backends/g;
    //   163: areturn
    //   164: invokestatic d : ()Lcom/google/android/datatransport/runtime/backends/g;
    //   167: astore_1
    //   168: aload_1
    //   169: areturn
    //   170: astore_1
    //   171: ldc 'CctTransportBackend'
    //   173: ldc_w 'Could not make request to the backend'
    //   176: aload_1
    //   177: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   180: invokestatic d : ()Lcom/google/android/datatransport/runtime/backends/g;
    //   183: areturn
    //   184: astore_1
    //   185: goto -> 85
    // Exception table:
    //   from	to	target	type
    //   32	41	184	java/lang/IllegalArgumentException
    //   44	58	184	java/lang/IllegalArgumentException
    //   63	80	184	java/lang/IllegalArgumentException
    //   89	137	170	java/io/IOException
    //   137	157	170	java/io/IOException
    //   160	164	170	java/io/IOException
    //   164	168	170	java/io/IOException
  }
  
  public i a(i parami) {
    NetworkInfo networkInfo = this.b.getActiveNetworkInfo();
    i.a a1 = parami.h();
    a1.a("sdk-version", Build.VERSION.SDK_INT);
    a1.a("model", Build.MODEL);
    a1.a("hardware", Build.HARDWARE);
    a1.a("device", Build.DEVICE);
    a1.a("product", Build.PRODUCT);
    a1.a("os-uild", Build.ID);
    a1.a("manufacturer", Build.MANUFACTURER);
    a1.a("fingerprint", Build.FINGERPRINT);
    a1.a("tz-offset", a());
    a1.a("net-type", b(networkInfo));
    a1.a("mobile-subtype", a(networkInfo));
    a1.a("country", Locale.getDefault().getCountry());
    a1.a("locale", Locale.getDefault().getLanguage());
    a1.a("mcc_mnc", b(this.c).getSimOperator());
    a1.a("application_build", Integer.toString(a(this.c)));
    return a1.a();
  }
  
  static final class a {
    final URL a;
    
    final j b;
    
    final String c;
    
    a(URL param1URL, j param1j, String param1String) {
      this.a = param1URL;
      this.b = param1j;
      this.c = param1String;
    }
    
    a a(URL param1URL) {
      return new a(param1URL, this.b, this.c);
    }
  }
  
  static final class b {
    final int a;
    
    final URL b;
    
    final long c;
    
    b(int param1Int, URL param1URL, long param1Long) {
      this.a = param1Int;
      this.b = param1URL;
      this.c = param1Long;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/cct/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */