package com.google.firebase.installations.s;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.i;
import com.google.firebase.installations.j;
import com.google.firebase.o.f;
import com.google.firebase.p.b;
import com.google.firebase.r.i;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
  private static final Pattern e = Pattern.compile("[0-9]+s");
  
  private static final Charset f = Charset.forName("UTF-8");
  
  private final Context a;
  
  private final b<i> b;
  
  private final b<f> c;
  
  private final e d;
  
  public c(Context paramContext, b<i> paramb, b<f> paramb1) {
    this.a = paramContext;
    this.b = paramb;
    this.c = paramb1;
    this.d = new e();
  }
  
  private d a(HttpURLConnection paramHttpURLConnection) {
    InputStream inputStream = paramHttpURLConnection.getInputStream();
    JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f));
    f.a a = f.d();
    d.a a1 = d.f();
    jsonReader.beginObject();
    while (jsonReader.hasNext()) {
      String str = jsonReader.nextName();
      if (str.equals("name")) {
        a1.c(jsonReader.nextString());
        continue;
      } 
      if (str.equals("fid")) {
        a1.a(jsonReader.nextString());
        continue;
      } 
      if (str.equals("refreshToken")) {
        a1.b(jsonReader.nextString());
        continue;
      } 
      if (str.equals("authToken")) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
          str = jsonReader.nextName();
          if (str.equals("token")) {
            a.a(jsonReader.nextString());
            continue;
          } 
          if (str.equals("expiresIn")) {
            a.a(b(jsonReader.nextString()));
            continue;
          } 
          jsonReader.skipValue();
        } 
        a1.a(a.a());
        jsonReader.endObject();
        continue;
      } 
      jsonReader.skipValue();
    } 
    jsonReader.endObject();
    jsonReader.close();
    inputStream.close();
    a1.a(d.b.c);
    return a1.a();
  }
  
  private static String a(String paramString1, String paramString2, String paramString3) {
    if (TextUtils.isEmpty(paramString1)) {
      paramString1 = "";
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(", ");
      stringBuilder.append(paramString1);
      paramString1 = stringBuilder.toString();
    } 
    return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", new Object[] { paramString2, paramString3, paramString1 });
  }
  
  private HttpURLConnection a(URL paramURL, String paramString) {
    try {
      HttpURLConnection httpURLConnection = (HttpURLConnection)paramURL.openConnection();
      httpURLConnection.setConnectTimeout(10000);
      httpURLConnection.setUseCaches(false);
      httpURLConnection.setReadTimeout(10000);
      httpURLConnection.addRequestProperty("Content-Type", "application/json");
      httpURLConnection.addRequestProperty("Accept", "application/json");
      httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
      httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
      httpURLConnection.addRequestProperty("X-Android-Package", this.a.getPackageName());
      if (this.c.get() != null && this.b.get() != null) {
        f.a a = ((f)this.c.get()).a("fire-installations-id");
        if (a != f.a.c) {
          httpURLConnection.addRequestProperty("x-firebase-client", ((i)this.b.get()).a());
          httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a.a()));
        } 
      } 
      httpURLConnection.addRequestProperty("X-Android-Cert", b());
      httpURLConnection.addRequestProperty("x-goog-api-key", paramString);
      return httpURLConnection;
    } catch (IOException iOException) {
      throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.d);
    } 
  }
  
  private URL a(String paramString) {
    try {
      return new URL(String.format("https://%s/%s/%s", new Object[] { "firebaseinstallations.googleapis.com", "v1", paramString }));
    } catch (MalformedURLException malformedURLException) {
      throw new j(malformedURLException.getMessage(), j.a.d);
    } 
  }
  
  private static JSONObject a() {
    try {
      JSONObject jSONObject1 = new JSONObject();
      jSONObject1.put("sdkVersion", "a:17.0.0");
      JSONObject jSONObject2 = new JSONObject();
      jSONObject2.put("installation", jSONObject1);
      return jSONObject2;
    } catch (JSONException jSONException) {
      throw new IllegalStateException(jSONException);
    } 
  }
  
  private static JSONObject a(String paramString1, String paramString2) {
    try {
      JSONObject jSONObject = new JSONObject();
      jSONObject.put("fid", paramString1);
      jSONObject.put("appId", paramString2);
      jSONObject.put("authVersion", "FIS_v2");
      jSONObject.put("sdkVersion", "a:17.0.0");
      return jSONObject;
    } catch (JSONException jSONException) {
      throw new IllegalStateException(jSONException);
    } 
  }
  
  private void a(HttpURLConnection paramHttpURLConnection, String paramString1, String paramString2) {
    a(paramHttpURLConnection, a(a(paramString1, paramString2)));
  }
  
  private static void a(HttpURLConnection paramHttpURLConnection, String paramString1, String paramString2, String paramString3) {
    String str = b(paramHttpURLConnection);
    if (!TextUtils.isEmpty(str)) {
      Log.w("Firebase-Installations", str);
      Log.w("Firebase-Installations", a(paramString1, paramString2, paramString3));
    } 
  }
  
  private static void a(URLConnection paramURLConnection, byte[] paramArrayOfbyte) {
    OutputStream outputStream = paramURLConnection.getOutputStream();
    if (outputStream != null) {
      GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
      try {
        gZIPOutputStream.write(paramArrayOfbyte);
      } finally {
        try {
          gZIPOutputStream.close();
          iOException.close();
        } catch (IOException iOException1) {}
      } 
    } else {
      throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    } 
  }
  
  private static boolean a(int paramInt) {
    return (paramInt >= 200 && paramInt < 300);
  }
  
  private static byte[] a(JSONObject paramJSONObject) {
    return paramJSONObject.toString().getBytes("UTF-8");
  }
  
  static long b(String paramString) {
    q.a(e.matcher(paramString).matches(), "Invalid Expiration Timestamp.");
    return (paramString == null || paramString.length() == 0) ? 0L : Long.parseLong(paramString.substring(0, paramString.length() - 1));
  }
  
  private String b() {
    try {
      StringBuilder stringBuilder;
      byte[] arrayOfByte = a.a(this.a, this.a.getPackageName());
      if (arrayOfByte == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Could not get fingerprint hash for package: ");
        stringBuilder.append(this.a.getPackageName());
        Log.e("ContentValues", stringBuilder.toString());
        return null;
      } 
      return i.a((byte[])stringBuilder, false);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("No such package: ");
      stringBuilder.append(this.a.getPackageName());
      Log.e("ContentValues", stringBuilder.toString(), (Throwable)nameNotFoundException);
      return null;
    } 
  }
  
  private static String b(HttpURLConnection paramHttpURLConnection) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getErrorStream : ()Ljava/io/InputStream;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new java/io/BufferedReader
    //   14: dup
    //   15: new java/io/InputStreamReader
    //   18: dup
    //   19: aload_1
    //   20: getstatic com/google/firebase/installations/s/c.f : Ljava/nio/charset/Charset;
    //   23: invokespecial <init> : (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   26: invokespecial <init> : (Ljava/io/Reader;)V
    //   29: astore_1
    //   30: new java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: astore_2
    //   38: aload_1
    //   39: invokevirtual readLine : ()Ljava/lang/String;
    //   42: astore_3
    //   43: aload_3
    //   44: ifnull -> 63
    //   47: aload_2
    //   48: aload_3
    //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload_2
    //   54: bipush #10
    //   56: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: goto -> 38
    //   63: ldc_w 'Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]'
    //   66: iconst_3
    //   67: anewarray java/lang/Object
    //   70: dup
    //   71: iconst_0
    //   72: aload_0
    //   73: invokevirtual getResponseCode : ()I
    //   76: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   79: aastore
    //   80: dup
    //   81: iconst_1
    //   82: aload_0
    //   83: invokevirtual getResponseMessage : ()Ljava/lang/String;
    //   86: aastore
    //   87: dup
    //   88: iconst_2
    //   89: aload_2
    //   90: aastore
    //   91: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   94: astore_0
    //   95: aload_1
    //   96: invokevirtual close : ()V
    //   99: aload_0
    //   100: areturn
    //   101: astore_0
    //   102: aload_1
    //   103: invokevirtual close : ()V
    //   106: aload_0
    //   107: athrow
    //   108: aload_1
    //   109: invokevirtual close : ()V
    //   112: aconst_null
    //   113: areturn
    //   114: astore_0
    //   115: goto -> 108
    //   118: astore_1
    //   119: aload_0
    //   120: areturn
    //   121: astore_1
    //   122: goto -> 106
    //   125: astore_0
    //   126: aconst_null
    //   127: areturn
    // Exception table:
    //   from	to	target	type
    //   30	38	114	java/io/IOException
    //   30	38	101	finally
    //   38	43	114	java/io/IOException
    //   38	43	101	finally
    //   47	60	114	java/io/IOException
    //   47	60	101	finally
    //   63	95	114	java/io/IOException
    //   63	95	101	finally
    //   95	99	118	java/io/IOException
    //   102	106	121	java/io/IOException
    //   108	112	125	java/io/IOException
  }
  
  private f c(HttpURLConnection paramHttpURLConnection) {
    InputStream inputStream = paramHttpURLConnection.getInputStream();
    JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f));
    f.a a = f.d();
    jsonReader.beginObject();
    while (jsonReader.hasNext()) {
      String str = jsonReader.nextName();
      if (str.equals("token")) {
        a.a(jsonReader.nextString());
        continue;
      } 
      if (str.equals("expiresIn")) {
        a.a(b(jsonReader.nextString()));
        continue;
      } 
      jsonReader.skipValue();
    } 
    jsonReader.endObject();
    jsonReader.close();
    inputStream.close();
    a.a(f.b.c);
    return a.a();
  }
  
  private static void c() {
    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
  }
  
  private void d(HttpURLConnection paramHttpURLConnection) {
    a(paramHttpURLConnection, a(a()));
  }
  
  public d a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    if (this.d.a()) {
      int i = 0;
      URL uRL = a(String.format("projects/%s/installations", new Object[] { paramString3 }));
      while (true) {
        if (i <= 1) {
          TrafficStats.setThreadStatsTag(32769);
          HttpURLConnection httpURLConnection = a(uRL, paramString1);
          try {
            d d;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            if (paramString5 != null)
              httpURLConnection.addRequestProperty("x-goog-fis-android-iid-migration-auth", paramString5); 
            a(httpURLConnection, paramString2, paramString4);
            int k = httpURLConnection.getResponseCode();
            this.d.a(k);
            if (a(k)) {
              d d1 = a(httpURLConnection);
              d = d1;
              return d;
            } 
            a(httpURLConnection, paramString4, (String)d, paramString3);
            if (k != 429) {
              if (k >= 500 && k < 600)
                continue; 
              c();
              d.a a = d.f();
              a.a(d.b.d);
              d d1 = a.a();
              d = d1;
              return d;
            } 
            throw new j("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", j.a.e);
          } catch (AssertionError|IOException assertionError) {
            continue;
          } finally {
            httpURLConnection.disconnect();
            TrafficStats.clearThreadStatsTag();
          } 
        } 
        throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.d);
        SYNTHETIC_LOCAL_VARIABLE_9.disconnect();
        TrafficStats.clearThreadStatsTag();
        i++;
      } 
    } 
    j j = new j("Firebase Installations Service is unavailable. Please try again later.", j.a.d);
    throw j;
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4) {
    int i = 0;
    URL uRL = a(String.format("projects/%s/installations/%s", new Object[] { paramString3, paramString2 }));
    while (true) {
      if (i <= 1) {
        TrafficStats.setThreadStatsTag(32770);
        HttpURLConnection httpURLConnection = a(uRL, paramString1);
        try {
          httpURLConnection.setRequestMethod("DELETE");
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("FIS_v2 ");
          stringBuilder.append(paramString4);
          httpURLConnection.addRequestProperty("Authorization", stringBuilder.toString());
          int k = httpURLConnection.getResponseCode();
          if (k == 200 || k == 401 || k == 404)
            return; 
        } catch (IOException iOException) {
        
        } finally {
          httpURLConnection.disconnect();
          TrafficStats.clearThreadStatsTag();
        } 
        i++;
        httpURLConnection.disconnect();
        TrafficStats.clearThreadStatsTag();
        continue;
      } 
      j j = new j("Firebase Installations Service is unavailable. Please try again later.", j.a.d);
      throw j;
    } 
  }
  
  public f b(String paramString1, String paramString2, String paramString3, String paramString4) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Lcom/google/firebase/installations/s/e;
    //   4: invokevirtual a : ()Z
    //   7: ifeq -> 279
    //   10: iconst_0
    //   11: istore #5
    //   13: aload_0
    //   14: ldc_w 'projects/%s/installations/%s/authTokens:generate'
    //   17: iconst_2
    //   18: anewarray java/lang/Object
    //   21: dup
    //   22: iconst_0
    //   23: aload_3
    //   24: aastore
    //   25: dup
    //   26: iconst_1
    //   27: aload_2
    //   28: aastore
    //   29: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   32: invokespecial a : (Ljava/lang/String;)Ljava/net/URL;
    //   35: astore #8
    //   37: iload #5
    //   39: iconst_1
    //   40: if_icmpgt -> 265
    //   43: ldc_w 32771
    //   46: invokestatic setThreadStatsTag : (I)V
    //   49: aload_0
    //   50: aload #8
    //   52: aload_1
    //   53: invokespecial a : (Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;
    //   56: astore #7
    //   58: aload #7
    //   60: ldc_w 'POST'
    //   63: invokevirtual setRequestMethod : (Ljava/lang/String;)V
    //   66: new java/lang/StringBuilder
    //   69: dup
    //   70: invokespecial <init> : ()V
    //   73: astore_2
    //   74: aload_2
    //   75: ldc_w 'FIS_v2 '
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload_2
    //   83: aload #4
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload #7
    //   91: ldc_w 'Authorization'
    //   94: aload_2
    //   95: invokevirtual toString : ()Ljava/lang/String;
    //   98: invokevirtual addRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   101: aload #7
    //   103: iconst_1
    //   104: invokevirtual setDoOutput : (Z)V
    //   107: aload_0
    //   108: aload #7
    //   110: invokespecial d : (Ljava/net/HttpURLConnection;)V
    //   113: aload #7
    //   115: invokevirtual getResponseCode : ()I
    //   118: istore #6
    //   120: aload_0
    //   121: getfield d : Lcom/google/firebase/installations/s/e;
    //   124: iload #6
    //   126: invokevirtual a : (I)V
    //   129: iload #6
    //   131: invokestatic a : (I)Z
    //   134: ifeq -> 156
    //   137: aload_0
    //   138: aload #7
    //   140: invokespecial c : (Ljava/net/HttpURLConnection;)Lcom/google/firebase/installations/s/f;
    //   143: astore_2
    //   144: aload_2
    //   145: astore_1
    //   146: aload #7
    //   148: invokevirtual disconnect : ()V
    //   151: invokestatic clearThreadStatsTag : ()V
    //   154: aload_1
    //   155: areturn
    //   156: aload #7
    //   158: aconst_null
    //   159: aload_1
    //   160: aload_3
    //   161: invokestatic a : (Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   164: iload #6
    //   166: sipush #401
    //   169: if_icmpeq -> 222
    //   172: iload #6
    //   174: sipush #404
    //   177: if_icmpne -> 305
    //   180: goto -> 222
    //   183: invokestatic c : ()V
    //   186: invokestatic d : ()Lcom/google/firebase/installations/s/f$a;
    //   189: astore_2
    //   190: aload_2
    //   191: getstatic com/google/firebase/installations/s/f$b.d : Lcom/google/firebase/installations/s/f$b;
    //   194: invokevirtual a : (Lcom/google/firebase/installations/s/f$b;)Lcom/google/firebase/installations/s/f$a;
    //   197: pop
    //   198: aload_2
    //   199: invokevirtual a : ()Lcom/google/firebase/installations/s/f;
    //   202: astore_2
    //   203: aload_2
    //   204: astore_1
    //   205: goto -> 146
    //   208: new com/google/firebase/installations/j
    //   211: dup
    //   212: ldc_w 'Firebase servers have received too many requests from this client in a short period of time. Please try again later.'
    //   215: getstatic com/google/firebase/installations/j$a.e : Lcom/google/firebase/installations/j$a;
    //   218: invokespecial <init> : (Ljava/lang/String;Lcom/google/firebase/installations/j$a;)V
    //   221: athrow
    //   222: invokestatic d : ()Lcom/google/firebase/installations/s/f$a;
    //   225: astore_2
    //   226: aload_2
    //   227: getstatic com/google/firebase/installations/s/f$b.e : Lcom/google/firebase/installations/s/f$b;
    //   230: invokevirtual a : (Lcom/google/firebase/installations/s/f$b;)Lcom/google/firebase/installations/s/f$a;
    //   233: pop
    //   234: goto -> 198
    //   237: astore_1
    //   238: aload #7
    //   240: invokevirtual disconnect : ()V
    //   243: invokestatic clearThreadStatsTag : ()V
    //   246: aload_1
    //   247: athrow
    //   248: aload #7
    //   250: invokevirtual disconnect : ()V
    //   253: invokestatic clearThreadStatsTag : ()V
    //   256: iload #5
    //   258: iconst_1
    //   259: iadd
    //   260: istore #5
    //   262: goto -> 37
    //   265: new com/google/firebase/installations/j
    //   268: dup
    //   269: ldc_w 'Firebase Installations Service is unavailable. Please try again later.'
    //   272: getstatic com/google/firebase/installations/j$a.d : Lcom/google/firebase/installations/j$a;
    //   275: invokespecial <init> : (Ljava/lang/String;Lcom/google/firebase/installations/j$a;)V
    //   278: athrow
    //   279: new com/google/firebase/installations/j
    //   282: dup
    //   283: ldc_w 'Firebase Installations Service is unavailable. Please try again later.'
    //   286: getstatic com/google/firebase/installations/j$a.d : Lcom/google/firebase/installations/j$a;
    //   289: invokespecial <init> : (Ljava/lang/String;Lcom/google/firebase/installations/j$a;)V
    //   292: astore_1
    //   293: goto -> 298
    //   296: aload_1
    //   297: athrow
    //   298: goto -> 296
    //   301: astore_2
    //   302: goto -> 248
    //   305: iload #6
    //   307: sipush #429
    //   310: if_icmpeq -> 208
    //   313: iload #6
    //   315: sipush #500
    //   318: if_icmplt -> 183
    //   321: iload #6
    //   323: sipush #600
    //   326: if_icmpge -> 183
    //   329: goto -> 248
    // Exception table:
    //   from	to	target	type
    //   58	144	301	java/lang/AssertionError
    //   58	144	301	java/io/IOException
    //   58	144	237	finally
    //   156	164	301	java/lang/AssertionError
    //   156	164	301	java/io/IOException
    //   156	164	237	finally
    //   183	198	301	java/lang/AssertionError
    //   183	198	301	java/io/IOException
    //   183	198	237	finally
    //   198	203	301	java/lang/AssertionError
    //   198	203	301	java/io/IOException
    //   198	203	237	finally
    //   208	222	301	java/lang/AssertionError
    //   208	222	301	java/io/IOException
    //   208	222	237	finally
    //   222	234	301	java/lang/AssertionError
    //   222	234	301	java/io/IOException
    //   222	234	237	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/s/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */