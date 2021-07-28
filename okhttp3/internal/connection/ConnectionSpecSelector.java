package okhttp3.internal.connection;

import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;

public final class ConnectionSpecSelector {
  private final List<ConnectionSpec> connectionSpecs;
  
  private boolean isFallback;
  
  private boolean isFallbackPossible;
  
  private int nextModeIndex = 0;
  
  public ConnectionSpecSelector(List<ConnectionSpec> paramList) {
    this.connectionSpecs = paramList;
  }
  
  private boolean isFallbackPossible(SSLSocket paramSSLSocket) {
    for (int i = this.nextModeIndex; i < this.connectionSpecs.size(); i++) {
      if (((ConnectionSpec)this.connectionSpecs.get(i)).isCompatible(paramSSLSocket))
        return true; 
    } 
    return false;
  }
  
  public ConnectionSpec configureSecureSocket(SSLSocket paramSSLSocket) {
    // Byte code:
    //   0: aload_0
    //   1: getfield nextModeIndex : I
    //   4: istore_2
    //   5: aload_0
    //   6: getfield connectionSpecs : Ljava/util/List;
    //   9: invokeinterface size : ()I
    //   14: istore #4
    //   16: iload_2
    //   17: iload #4
    //   19: if_icmpge -> 64
    //   22: aload_0
    //   23: getfield connectionSpecs : Ljava/util/List;
    //   26: iload_2
    //   27: invokeinterface get : (I)Ljava/lang/Object;
    //   32: checkcast okhttp3/ConnectionSpec
    //   35: astore #6
    //   37: aload #6
    //   39: aload_1
    //   40: invokevirtual isCompatible : (Ljavax/net/ssl/SSLSocket;)Z
    //   43: istore #5
    //   45: iload_2
    //   46: iconst_1
    //   47: iadd
    //   48: istore_3
    //   49: iload_3
    //   50: istore_2
    //   51: iload #5
    //   53: ifeq -> 16
    //   56: aload_0
    //   57: iload_3
    //   58: putfield nextModeIndex : I
    //   61: goto -> 67
    //   64: aconst_null
    //   65: astore #6
    //   67: aload #6
    //   69: ifnull -> 97
    //   72: aload_0
    //   73: aload_0
    //   74: aload_1
    //   75: invokespecial isFallbackPossible : (Ljavax/net/ssl/SSLSocket;)Z
    //   78: putfield isFallbackPossible : Z
    //   81: getstatic okhttp3/internal/Internal.instance : Lokhttp3/internal/Internal;
    //   84: aload #6
    //   86: aload_1
    //   87: aload_0
    //   88: getfield isFallback : Z
    //   91: invokevirtual apply : (Lokhttp3/ConnectionSpec;Ljavax/net/ssl/SSLSocket;Z)V
    //   94: aload #6
    //   96: areturn
    //   97: new java/lang/StringBuilder
    //   100: dup
    //   101: invokespecial <init> : ()V
    //   104: astore #6
    //   106: aload #6
    //   108: ldc 'Unable to find acceptable protocols. isFallback='
    //   110: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload #6
    //   116: aload_0
    //   117: getfield isFallback : Z
    //   120: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   123: pop
    //   124: aload #6
    //   126: ldc ', modes='
    //   128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: pop
    //   132: aload #6
    //   134: aload_0
    //   135: getfield connectionSpecs : Ljava/util/List;
    //   138: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload #6
    //   144: ldc ', supported protocols='
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: pop
    //   150: aload #6
    //   152: aload_1
    //   153: invokevirtual getEnabledProtocols : ()[Ljava/lang/String;
    //   156: invokestatic toString : ([Ljava/lang/Object;)Ljava/lang/String;
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: new java/net/UnknownServiceException
    //   166: dup
    //   167: aload #6
    //   169: invokevirtual toString : ()Ljava/lang/String;
    //   172: invokespecial <init> : (Ljava/lang/String;)V
    //   175: astore_1
    //   176: goto -> 181
    //   179: aload_1
    //   180: athrow
    //   181: goto -> 179
  }
  
  public boolean connectionFailed(IOException paramIOException) {
    boolean bool2 = true;
    this.isFallback = true;
    if (!this.isFallbackPossible)
      return false; 
    if (paramIOException instanceof java.net.ProtocolException)
      return false; 
    if (paramIOException instanceof java.io.InterruptedIOException)
      return false; 
    boolean bool = paramIOException instanceof javax.net.ssl.SSLHandshakeException;
    if (bool && paramIOException.getCause() instanceof java.security.cert.CertificateException)
      return false; 
    if (paramIOException instanceof javax.net.ssl.SSLPeerUnverifiedException)
      return false; 
    boolean bool1 = bool2;
    if (!bool) {
      bool1 = bool2;
      if (!(paramIOException instanceof javax.net.ssl.SSLProtocolException)) {
        if (paramIOException instanceof javax.net.ssl.SSLException)
          return true; 
        bool1 = false;
      } 
    } 
    return bool1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/connection/ConnectionSpecSelector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */