package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.Util;

class JdkWithJettyBootPlatform extends Platform {
  private final Class<?> clientProviderClass;
  
  private final Method getMethod;
  
  private final Method putMethod;
  
  private final Method removeMethod;
  
  private final Class<?> serverProviderClass;
  
  JdkWithJettyBootPlatform(Method paramMethod1, Method paramMethod2, Method paramMethod3, Class<?> paramClass1, Class<?> paramClass2) {
    this.putMethod = paramMethod1;
    this.getMethod = paramMethod2;
    this.removeMethod = paramMethod3;
    this.clientProviderClass = paramClass1;
    this.serverProviderClass = paramClass2;
  }
  
  public static Platform buildIfSupported() {
    try {
      Class<?> clazz1 = Class.forName("org.eclipse.jetty.alpn.ALPN");
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("org.eclipse.jetty.alpn.ALPN");
      stringBuilder1.append("$Provider");
      Class<?> clazz2 = Class.forName(stringBuilder1.toString());
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("org.eclipse.jetty.alpn.ALPN");
      stringBuilder2.append("$ClientProvider");
      Class<?> clazz3 = Class.forName(stringBuilder2.toString());
      StringBuilder stringBuilder3 = new StringBuilder();
      stringBuilder3.append("org.eclipse.jetty.alpn.ALPN");
      stringBuilder3.append("$ServerProvider");
      Class<?> clazz4 = Class.forName(stringBuilder3.toString());
      return new JdkWithJettyBootPlatform(clazz1.getMethod("put", new Class[] { SSLSocket.class, clazz2 }), clazz1.getMethod("get", new Class[] { SSLSocket.class }), clazz1.getMethod("remove", new Class[] { SSLSocket.class }), clazz3, clazz4);
    } catch (ClassNotFoundException|NoSuchMethodException classNotFoundException) {
      return null;
    } 
  }
  
  public void afterHandshake(SSLSocket paramSSLSocket) {
    try {
      this.removeMethod.invoke(null, new Object[] { paramSSLSocket });
      return;
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    throw Util.assertionError("unable to remove alpn", invocationTargetException);
  }
  
  public void configureTlsExtensions(SSLSocket paramSSLSocket, String paramString, List<Protocol> paramList) {
    List<String> list = Platform.alpnProtocolNames(paramList);
    try {
      ClassLoader classLoader = Platform.class.getClassLoader();
      Class<?> clazz1 = this.clientProviderClass;
      Class<?> clazz2 = this.serverProviderClass;
      JettyNegoProvider jettyNegoProvider = new JettyNegoProvider(list);
      Object object = Proxy.newProxyInstance(classLoader, new Class[] { clazz1, clazz2 }, jettyNegoProvider);
      this.putMethod.invoke(null, new Object[] { paramSSLSocket, object });
      return;
    } catch (InvocationTargetException invocationTargetException) {
    
    } catch (IllegalAccessException illegalAccessException) {}
    throw Util.assertionError("unable to set alpn", illegalAccessException);
  }
  
  public String getSelectedProtocol(SSLSocket paramSSLSocket) {
    try {
      JettyNegoProvider jettyNegoProvider = (JettyNegoProvider)Proxy.getInvocationHandler(this.getMethod.invoke(null, new Object[] { paramSSLSocket }));
      if (!jettyNegoProvider.unsupported && jettyNegoProvider.selected == null) {
        Platform.get().log(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
        return null;
      } 
      return jettyNegoProvider.unsupported ? null : jettyNegoProvider.selected;
    } catch (InvocationTargetException invocationTargetException) {
    
    } catch (IllegalAccessException illegalAccessException) {}
    throw Util.assertionError("unable to get selected protocol", illegalAccessException);
  }
  
  private static class JettyNegoProvider implements InvocationHandler {
    private final List<String> protocols;
    
    String selected;
    
    boolean unsupported;
    
    JettyNegoProvider(List<String> param1List) {
      this.protocols = param1List;
    }
    
    public Object invoke(Object param1Object, Method param1Method, Object[] param1ArrayOfObject) {
      // Byte code:
      //   0: aload_2
      //   1: invokevirtual getName : ()Ljava/lang/String;
      //   4: astore #6
      //   6: aload_2
      //   7: invokevirtual getReturnType : ()Ljava/lang/Class;
      //   10: astore #7
      //   12: aload_3
      //   13: astore_1
      //   14: aload_3
      //   15: ifnonnull -> 22
      //   18: getstatic okhttp3/internal/Util.EMPTY_STRING_ARRAY : [Ljava/lang/String;
      //   21: astore_1
      //   22: aload #6
      //   24: ldc 'supports'
      //   26: invokevirtual equals : (Ljava/lang/Object;)Z
      //   29: ifeq -> 45
      //   32: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
      //   35: aload #7
      //   37: if_acmpne -> 45
      //   40: iconst_1
      //   41: invokestatic valueOf : (Z)Ljava/lang/Boolean;
      //   44: areturn
      //   45: aload #6
      //   47: ldc 'unsupported'
      //   49: invokevirtual equals : (Ljava/lang/Object;)Z
      //   52: ifeq -> 70
      //   55: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
      //   58: aload #7
      //   60: if_acmpne -> 70
      //   63: aload_0
      //   64: iconst_1
      //   65: putfield unsupported : Z
      //   68: aconst_null
      //   69: areturn
      //   70: aload #6
      //   72: ldc 'protocols'
      //   74: invokevirtual equals : (Ljava/lang/Object;)Z
      //   77: ifeq -> 90
      //   80: aload_1
      //   81: arraylength
      //   82: ifne -> 90
      //   85: aload_0
      //   86: getfield protocols : Ljava/util/List;
      //   89: areturn
      //   90: aload #6
      //   92: ldc 'selectProtocol'
      //   94: invokevirtual equals : (Ljava/lang/Object;)Z
      //   97: ifne -> 110
      //   100: aload #6
      //   102: ldc 'select'
      //   104: invokevirtual equals : (Ljava/lang/Object;)Z
      //   107: ifeq -> 221
      //   110: ldc java/lang/String
      //   112: aload #7
      //   114: if_acmpne -> 221
      //   117: aload_1
      //   118: arraylength
      //   119: iconst_1
      //   120: if_icmpne -> 221
      //   123: aload_1
      //   124: iconst_0
      //   125: aaload
      //   126: instanceof java/util/List
      //   129: ifeq -> 221
      //   132: aload_1
      //   133: iconst_0
      //   134: aaload
      //   135: checkcast java/util/List
      //   138: astore_1
      //   139: aload_1
      //   140: invokeinterface size : ()I
      //   145: istore #5
      //   147: iconst_0
      //   148: istore #4
      //   150: iload #4
      //   152: iload #5
      //   154: if_icmpge -> 207
      //   157: aload_0
      //   158: getfield protocols : Ljava/util/List;
      //   161: aload_1
      //   162: iload #4
      //   164: invokeinterface get : (I)Ljava/lang/Object;
      //   169: invokeinterface contains : (Ljava/lang/Object;)Z
      //   174: ifeq -> 198
      //   177: aload_1
      //   178: iload #4
      //   180: invokeinterface get : (I)Ljava/lang/Object;
      //   185: astore_1
      //   186: aload_1
      //   187: checkcast java/lang/String
      //   190: astore_1
      //   191: aload_0
      //   192: aload_1
      //   193: putfield selected : Ljava/lang/String;
      //   196: aload_1
      //   197: areturn
      //   198: iload #4
      //   200: iconst_1
      //   201: iadd
      //   202: istore #4
      //   204: goto -> 150
      //   207: aload_0
      //   208: getfield protocols : Ljava/util/List;
      //   211: iconst_0
      //   212: invokeinterface get : (I)Ljava/lang/Object;
      //   217: astore_1
      //   218: goto -> 186
      //   221: aload #6
      //   223: ldc 'protocolSelected'
      //   225: invokevirtual equals : (Ljava/lang/Object;)Z
      //   228: ifne -> 241
      //   231: aload #6
      //   233: ldc 'selected'
      //   235: invokevirtual equals : (Ljava/lang/Object;)Z
      //   238: ifeq -> 259
      //   241: aload_1
      //   242: arraylength
      //   243: iconst_1
      //   244: if_icmpne -> 259
      //   247: aload_0
      //   248: aload_1
      //   249: iconst_0
      //   250: aaload
      //   251: checkcast java/lang/String
      //   254: putfield selected : Ljava/lang/String;
      //   257: aconst_null
      //   258: areturn
      //   259: aload_2
      //   260: aload_0
      //   261: aload_1
      //   262: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   265: areturn
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/platform/JdkWithJettyBootPlatform.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */