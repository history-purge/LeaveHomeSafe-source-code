package com.facebook.react.modules.network;

import android.content.Context;
import android.os.Build;
import e.e.e.e.a;
import java.io.File;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;

public class g {
  private static OkHttpClient a;
  
  private static f b;
  
  public static OkHttpClient.Builder a(Context paramContext, int paramInt) {
    OkHttpClient.Builder builder = b();
    return (paramInt == 0) ? builder : builder.cache(new Cache(new File(paramContext.getCacheDir(), "http-cache"), paramInt));
  }
  
  public static OkHttpClient.Builder a(OkHttpClient.Builder paramBuilder) {
    if (Build.VERSION.SDK_INT <= 19)
      try {
        paramBuilder.sslSocketFactory(new o());
        ConnectionSpec connectionSpec = (new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)).tlsVersions(new TlsVersion[] { TlsVersion.TLS_1_2 }).build();
        ArrayList<ConnectionSpec> arrayList = new ArrayList();
        arrayList.add(connectionSpec);
        arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
        arrayList.add(ConnectionSpec.CLEARTEXT);
        paramBuilder.connectionSpecs(arrayList);
        return paramBuilder;
      } catch (Exception exception) {
        a.b("OkHttpClientProvider", "Error while enabling TLS 1.2", exception);
      }  
    return paramBuilder;
  }
  
  public static OkHttpClient a() {
    f f1 = b;
    return (f1 != null) ? f1.a() : b().build();
  }
  
  public static OkHttpClient a(Context paramContext) {
    f f1 = b;
    return (f1 != null) ? f1.a() : b(paramContext).build();
  }
  
  public static OkHttpClient.Builder b() {
    OkHttpClient.Builder builder = (new OkHttpClient.Builder()).connectTimeout(0L, TimeUnit.MILLISECONDS).readTimeout(0L, TimeUnit.MILLISECONDS).writeTimeout(0L, TimeUnit.MILLISECONDS).cookieJar(new l());
    try {
      Security.insertProviderAt((Provider)Class.forName("org.conscrypt.OpenSSLProvider").newInstance(), 1);
      return builder;
    } catch (Exception exception) {
      a(builder);
      return builder;
    } 
  }
  
  public static OkHttpClient.Builder b(Context paramContext) {
    return a(paramContext, 10485760);
  }
  
  public static OkHttpClient c() {
    if (a == null)
      a = a(); 
    return a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/network/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */