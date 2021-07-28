package com.RNFetchBlob;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;

public class h {
  public static OkHttpClient.Builder a(OkHttpClient paramOkHttpClient) {
    try {
      a a = new a();
      SSLContext sSLContext = SSLContext.getInstance("SSL");
      SecureRandom secureRandom = new SecureRandom();
      sSLContext.init(null, new TrustManager[] { a }, secureRandom);
      SSLSocketFactory sSLSocketFactory = sSLContext.getSocketFactory();
      OkHttpClient.Builder builder = paramOkHttpClient.newBuilder();
      builder.sslSocketFactory(sSLSocketFactory, a);
      builder.hostnameVerifier(new b());
      return builder;
    } catch (Exception exception) {
      throw new RuntimeException(exception);
    } 
  }
  
  public static void a(String paramString) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("event", "warn");
    writableMap.putString("detail", paramString);
    ((DeviceEventManagerModule.RCTDeviceEventEmitter)RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobMessage", writableMap);
  }
  
  public static String b(String paramString) {
    try {
      int i;
      MessageDigest messageDigest = MessageDigest.getInstance("MD5");
      messageDigest.update(paramString.getBytes());
      byte[] arrayOfByte = messageDigest.digest();
      StringBuilder stringBuilder = new StringBuilder();
      int j = arrayOfByte.length;
      return stringBuilder.toString();
    } catch (Exception exception) {
      return null;
    } finally {
      paramString = null;
    } 
  }
  
  class a implements X509TrustManager {
    public void checkClientTrusted(X509Certificate[] param1ArrayOfX509Certificate, String param1String) {}
    
    public void checkServerTrusted(X509Certificate[] param1ArrayOfX509Certificate, String param1String) {}
    
    public X509Certificate[] getAcceptedIssuers() {
      return new X509Certificate[0];
    }
  }
  
  class b implements HostnameVerifier {
    public boolean verify(String param1String, SSLSession param1SSLSession) {
      return true;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/RNFetchBlob/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */