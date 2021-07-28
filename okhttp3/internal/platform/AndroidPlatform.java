package okhttp3.internal.platform;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

class AndroidPlatform extends Platform {
  private static final int MAX_LOG_LENGTH = 4000;
  
  private final CloseGuard closeGuard = CloseGuard.get();
  
  private final OptionalMethod<Socket> getAlpnSelectedProtocol;
  
  private final OptionalMethod<Socket> setAlpnProtocols;
  
  private final OptionalMethod<Socket> setHostname;
  
  private final OptionalMethod<Socket> setUseSessionTickets;
  
  private final Class<?> sslParametersClass;
  
  AndroidPlatform(Class<?> paramClass, OptionalMethod<Socket> paramOptionalMethod1, OptionalMethod<Socket> paramOptionalMethod2, OptionalMethod<Socket> paramOptionalMethod3, OptionalMethod<Socket> paramOptionalMethod4) {
    this.sslParametersClass = paramClass;
    this.setUseSessionTickets = paramOptionalMethod1;
    this.setHostname = paramOptionalMethod2;
    this.getAlpnSelectedProtocol = paramOptionalMethod3;
    this.setAlpnProtocols = paramOptionalMethod4;
  }
  
  private boolean api23IsCleartextTrafficPermitted(String paramString, Class<?> paramClass, Object paramObject) {
    try {
      return ((Boolean)paramClass.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(paramObject, new Object[0])).booleanValue();
    } catch (NoSuchMethodException noSuchMethodException) {
      return super.isCleartextTrafficPermitted(paramString);
    } 
  }
  
  private boolean api24IsCleartextTrafficPermitted(String paramString, Class<?> paramClass, Object paramObject) {
    try {
      return ((Boolean)paramClass.getMethod("isCleartextTrafficPermitted", new Class[] { String.class }).invoke(paramObject, new Object[] { paramString })).booleanValue();
    } catch (NoSuchMethodException noSuchMethodException) {
      return api23IsCleartextTrafficPermitted(paramString, paramClass, paramObject);
    } 
  }
  
  public static Platform buildIfSupported() {
    // Byte code:
    //   0: ldc 'com.android.org.conscrypt.SSLParametersImpl'
    //   2: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5: astore_0
    //   6: goto -> 18
    //   9: ldc 'org.apache.harmony.xnet.provider.jsse.SSLParametersImpl'
    //   11: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   14: astore_0
    //   15: goto -> 6
    //   18: new okhttp3/internal/platform/OptionalMethod
    //   21: dup
    //   22: aconst_null
    //   23: ldc 'setUseSessionTickets'
    //   25: iconst_1
    //   26: anewarray java/lang/Class
    //   29: dup
    //   30: iconst_0
    //   31: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   34: aastore
    //   35: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    //   38: astore_3
    //   39: new okhttp3/internal/platform/OptionalMethod
    //   42: dup
    //   43: aconst_null
    //   44: ldc 'setHostname'
    //   46: iconst_1
    //   47: anewarray java/lang/Class
    //   50: dup
    //   51: iconst_0
    //   52: ldc java/lang/String
    //   54: aastore
    //   55: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    //   58: astore #4
    //   60: invokestatic supportsAlpn : ()Z
    //   63: ifeq -> 128
    //   66: new okhttp3/internal/platform/OptionalMethod
    //   69: dup
    //   70: ldc [B
    //   72: ldc 'getAlpnSelectedProtocol'
    //   74: iconst_0
    //   75: anewarray java/lang/Class
    //   78: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    //   81: astore_1
    //   82: new okhttp3/internal/platform/OptionalMethod
    //   85: dup
    //   86: aconst_null
    //   87: ldc 'setAlpnProtocols'
    //   89: iconst_1
    //   90: anewarray java/lang/Class
    //   93: dup
    //   94: iconst_0
    //   95: ldc [B
    //   97: aastore
    //   98: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    //   101: astore_2
    //   102: goto -> 105
    //   105: new okhttp3/internal/platform/AndroidPlatform
    //   108: dup
    //   109: aload_0
    //   110: aload_3
    //   111: aload #4
    //   113: aload_1
    //   114: aload_2
    //   115: invokespecial <init> : (Ljava/lang/Class;Lokhttp3/internal/platform/OptionalMethod;Lokhttp3/internal/platform/OptionalMethod;Lokhttp3/internal/platform/OptionalMethod;Lokhttp3/internal/platform/OptionalMethod;)V
    //   118: astore_0
    //   119: aload_0
    //   120: areturn
    //   121: astore_0
    //   122: goto -> 9
    //   125: astore_0
    //   126: aconst_null
    //   127: areturn
    //   128: aconst_null
    //   129: astore_1
    //   130: aload_1
    //   131: astore_2
    //   132: goto -> 105
    // Exception table:
    //   from	to	target	type
    //   0	6	121	java/lang/ClassNotFoundException
    //   9	15	125	java/lang/ClassNotFoundException
    //   18	102	125	java/lang/ClassNotFoundException
    //   105	119	125	java/lang/ClassNotFoundException
  }
  
  private static boolean supportsAlpn() {
    if (Security.getProvider("GMSCore_OpenSSL") != null)
      return true; 
    try {
      Class.forName("android.net.Network");
      return true;
    } catch (ClassNotFoundException classNotFoundException) {
      return false;
    } 
  }
  
  public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager paramX509TrustManager) {
    try {
      Class<?> clazz = Class.forName("android.net.http.X509TrustManagerExtensions");
      return new AndroidCertificateChainCleaner(clazz.getConstructor(new Class[] { X509TrustManager.class }, ).newInstance(new Object[] { paramX509TrustManager }, ), clazz.getMethod("checkServerTrusted", new Class[] { X509Certificate[].class, String.class, String.class }));
    } catch (Exception exception) {
      return super.buildCertificateChainCleaner(paramX509TrustManager);
    } 
  }
  
  public TrustRootIndex buildTrustRootIndex(X509TrustManager paramX509TrustManager) {
    try {
      Method method = paramX509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[] { X509Certificate.class });
      method.setAccessible(true);
      return new AndroidTrustRootIndex(paramX509TrustManager, method);
    } catch (NoSuchMethodException noSuchMethodException) {
      return super.buildTrustRootIndex(paramX509TrustManager);
    } 
  }
  
  public void configureTlsExtensions(SSLSocket paramSSLSocket, String paramString, List<Protocol> paramList) {
    if (paramString != null) {
      this.setUseSessionTickets.invokeOptionalWithoutCheckedException(paramSSLSocket, new Object[] { Boolean.valueOf(true) });
      this.setHostname.invokeOptionalWithoutCheckedException(paramSSLSocket, new Object[] { paramString });
    } 
    OptionalMethod<Socket> optionalMethod = this.setAlpnProtocols;
    if (optionalMethod != null && optionalMethod.isSupported(paramSSLSocket)) {
      byte[] arrayOfByte = Platform.concatLengthPrefixed(paramList);
      this.setAlpnProtocols.invokeWithoutCheckedException(paramSSLSocket, new Object[] { arrayOfByte });
    } 
  }
  
  public void connectSocket(Socket paramSocket, InetSocketAddress paramInetSocketAddress, int paramInt) {
    try {
      paramSocket.connect(paramInetSocketAddress, paramInt);
      return;
    } catch (AssertionError assertionError) {
      if (Util.isAndroidGetsocknameError(assertionError))
        throw new IOException(assertionError); 
      throw assertionError;
    } catch (SecurityException securityException) {
      IOException iOException = new IOException("Exception in connect");
      iOException.initCause(securityException);
      throw iOException;
    } catch (ClassCastException classCastException) {
      if (Build.VERSION.SDK_INT == 26) {
        IOException iOException = new IOException("Exception in connect");
        iOException.initCause(classCastException);
        throw iOException;
      } 
      throw classCastException;
    } 
  }
  
  public SSLContext getSSLContext() {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: getstatic android/os/Build$VERSION.SDK_INT : I
    //   5: bipush #16
    //   7: if_icmplt -> 23
    //   10: getstatic android/os/Build$VERSION.SDK_INT : I
    //   13: istore_2
    //   14: iload_2
    //   15: bipush #22
    //   17: if_icmpge -> 23
    //   20: goto -> 28
    //   23: iconst_0
    //   24: istore_1
    //   25: goto -> 28
    //   28: iload_1
    //   29: ifeq -> 40
    //   32: ldc 'TLSv1.2'
    //   34: invokestatic getInstance : (Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   37: astore_3
    //   38: aload_3
    //   39: areturn
    //   40: ldc 'TLS'
    //   42: invokestatic getInstance : (Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   45: astore_3
    //   46: aload_3
    //   47: areturn
    //   48: astore_3
    //   49: new java/lang/IllegalStateException
    //   52: dup
    //   53: ldc_w 'No TLS provider'
    //   56: aload_3
    //   57: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   60: athrow
    //   61: astore_3
    //   62: goto -> 28
    //   65: astore_3
    //   66: goto -> 40
    // Exception table:
    //   from	to	target	type
    //   2	14	61	java/lang/NoClassDefFoundError
    //   32	38	65	java/security/NoSuchAlgorithmException
    //   40	46	48	java/security/NoSuchAlgorithmException
  }
  
  public String getSelectedProtocol(SSLSocket paramSSLSocket) {
    String str;
    OptionalMethod<Socket> optionalMethod = this.getAlpnSelectedProtocol;
    SSLSocket sSLSocket = null;
    if (optionalMethod == null)
      return null; 
    if (!optionalMethod.isSupported(paramSSLSocket))
      return null; 
    byte[] arrayOfByte = (byte[])this.getAlpnSelectedProtocol.invokeWithoutCheckedException(paramSSLSocket, new Object[0]);
    paramSSLSocket = sSLSocket;
    if (arrayOfByte != null)
      str = new String(arrayOfByte, Util.UTF_8); 
    return str;
  }
  
  public Object getStackTraceForCloseable(String paramString) {
    return this.closeGuard.createAndOpen(paramString);
  }
  
  public boolean isCleartextTrafficPermitted(String paramString) {
    try {
      Class<?> clazz = Class.forName("android.security.NetworkSecurityPolicy");
      return api24IsCleartextTrafficPermitted(paramString, clazz, clazz.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
    } catch (ClassNotFoundException|NoSuchMethodException classNotFoundException) {
      return super.isCleartextTrafficPermitted(paramString);
    } catch (IllegalAccessException illegalAccessException) {
      throw Util.assertionError("unable to determine cleartext support", illegalAccessException);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw Util.assertionError("unable to determine cleartext support", illegalArgumentException);
    } catch (InvocationTargetException invocationTargetException) {
      throw Util.assertionError("unable to determine cleartext support", invocationTargetException);
    } 
  }
  
  public void log(int paramInt, String paramString, Throwable paramThrowable) {
    byte b = 5;
    if (paramInt != 5)
      b = 3; 
    String str = paramString;
    if (paramThrowable != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append('\n');
      stringBuilder.append(Log.getStackTraceString(paramThrowable));
      str = stringBuilder.toString();
    } 
    paramInt = 0;
    int i = str.length();
    label23: while (paramInt < i) {
      int j = str.indexOf('\n', paramInt);
      if (j == -1)
        j = i; 
      while (true) {
        int k = Math.min(j, paramInt + 4000);
        Log.println(b, "OkHttp", str.substring(paramInt, k));
        if (k >= j) {
          paramInt = k + 1;
          continue label23;
        } 
        paramInt = k;
      } 
    } 
  }
  
  public void logCloseableLeak(String paramString, Object paramObject) {
    if (!this.closeGuard.warnIfOpen(paramObject))
      log(5, paramString, null); 
  }
  
  protected X509TrustManager trustManager(SSLSocketFactory paramSSLSocketFactory) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield sslParametersClass : Ljava/lang/Class;
    //   5: ldc_w 'sslParameters'
    //   8: invokestatic readFieldOrNull : (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    //   11: astore_3
    //   12: aload_3
    //   13: astore_2
    //   14: aload_3
    //   15: ifnonnull -> 49
    //   18: aload_1
    //   19: ldc_w 'com.google.android.gms.org.conscrypt.SSLParametersImpl'
    //   22: iconst_0
    //   23: aload_1
    //   24: invokevirtual getClass : ()Ljava/lang/Class;
    //   27: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   30: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   33: ldc_w 'sslParameters'
    //   36: invokestatic readFieldOrNull : (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    //   39: astore_2
    //   40: goto -> 49
    //   43: aload_0
    //   44: aload_1
    //   45: invokespecial trustManager : (Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;
    //   48: areturn
    //   49: aload_2
    //   50: ldc javax/net/ssl/X509TrustManager
    //   52: ldc_w 'x509TrustManager'
    //   55: invokestatic readFieldOrNull : (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    //   58: checkcast javax/net/ssl/X509TrustManager
    //   61: astore_1
    //   62: aload_1
    //   63: ifnull -> 68
    //   66: aload_1
    //   67: areturn
    //   68: aload_2
    //   69: ldc javax/net/ssl/X509TrustManager
    //   71: ldc_w 'trustManager'
    //   74: invokestatic readFieldOrNull : (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    //   77: checkcast javax/net/ssl/X509TrustManager
    //   80: areturn
    //   81: astore_2
    //   82: goto -> 43
    // Exception table:
    //   from	to	target	type
    //   18	40	81	java/lang/ClassNotFoundException
  }
  
  static final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
    private final Method checkServerTrusted;
    
    private final Object x509TrustManagerExtensions;
    
    AndroidCertificateChainCleaner(Object param1Object, Method param1Method) {
      this.x509TrustManagerExtensions = param1Object;
      this.checkServerTrusted = param1Method;
    }
    
    public List<Certificate> clean(List<Certificate> param1List, String param1String) {
      try {
        X509Certificate[] arrayOfX509Certificate = param1List.<X509Certificate>toArray(new X509Certificate[param1List.size()]);
        return (List)this.checkServerTrusted.invoke(this.x509TrustManagerExtensions, new Object[] { arrayOfX509Certificate, "RSA", param1String });
      } catch (InvocationTargetException invocationTargetException) {
        SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(invocationTargetException.getMessage());
        sSLPeerUnverifiedException.initCause(invocationTargetException);
        throw sSLPeerUnverifiedException;
      } catch (IllegalAccessException illegalAccessException) {
        throw new AssertionError(illegalAccessException);
      } 
    }
    
    public boolean equals(Object param1Object) {
      return param1Object instanceof AndroidCertificateChainCleaner;
    }
    
    public int hashCode() {
      return 0;
    }
  }
  
  static final class AndroidTrustRootIndex implements TrustRootIndex {
    private final Method findByIssuerAndSignatureMethod;
    
    private final X509TrustManager trustManager;
    
    AndroidTrustRootIndex(X509TrustManager param1X509TrustManager, Method param1Method) {
      this.findByIssuerAndSignatureMethod = param1Method;
      this.trustManager = param1X509TrustManager;
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object == this)
        return true; 
      if (!(param1Object instanceof AndroidTrustRootIndex))
        return false; 
      param1Object = param1Object;
      return (this.trustManager.equals(((AndroidTrustRootIndex)param1Object).trustManager) && this.findByIssuerAndSignatureMethod.equals(((AndroidTrustRootIndex)param1Object).findByIssuerAndSignatureMethod));
    }
    
    public X509Certificate findByIssuerAndSignature(X509Certificate param1X509Certificate) {
      X509Certificate x509Certificate = null;
      try {
        TrustAnchor trustAnchor = (TrustAnchor)this.findByIssuerAndSignatureMethod.invoke(this.trustManager, new Object[] { param1X509Certificate });
        param1X509Certificate = x509Certificate;
        if (trustAnchor != null)
          param1X509Certificate = trustAnchor.getTrustedCert(); 
        return param1X509Certificate;
      } catch (IllegalAccessException illegalAccessException) {
        throw Util.assertionError("unable to get issues and signature", illegalAccessException);
      } catch (InvocationTargetException invocationTargetException) {
        return null;
      } 
    }
    
    public int hashCode() {
      return this.trustManager.hashCode() + this.findByIssuerAndSignatureMethod.hashCode() * 31;
    }
  }
  
  static final class CloseGuard {
    private final Method getMethod;
    
    private final Method openMethod;
    
    private final Method warnIfOpenMethod;
    
    CloseGuard(Method param1Method1, Method param1Method2, Method param1Method3) {
      this.getMethod = param1Method1;
      this.openMethod = param1Method2;
      this.warnIfOpenMethod = param1Method3;
    }
    
    static CloseGuard get() {
      Exception exception2;
      Method method = null;
      try {
        Class<?> clazz = Class.forName("dalvik.system.CloseGuard");
        Method method3 = clazz.getMethod("get", new Class[0]);
        Method method2 = clazz.getMethod("open", new Class[] { String.class });
        Method method1 = clazz.getMethod("warnIfOpen", new Class[0]);
        method = method3;
      } catch (Exception exception1) {
        exception1 = null;
        exception2 = exception1;
      } 
      return new CloseGuard(method, (Method)exception2, (Method)exception1);
    }
    
    Object createAndOpen(String param1String) {
      Method method = this.getMethod;
      if (method != null)
        try {
          Object object = method.invoke(null, new Object[0]);
          this.openMethod.invoke(object, new Object[] { param1String });
          return object;
        } catch (Exception exception) {
          return null;
        }  
      return null;
    }
    
    boolean warnIfOpen(Object param1Object) {
      boolean bool = false;
      if (param1Object != null)
        try {
          this.warnIfOpenMethod.invoke(param1Object, new Object[0]);
          return true;
        } catch (Exception exception) {
          return false;
        }  
      return bool;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/platform/AndroidPlatform.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */