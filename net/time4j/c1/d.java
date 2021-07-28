package net.time4j.c1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ServiceLoader;

public abstract class d {
  static {
    if (!a && Boolean.getBoolean("net.time4j.base.useClassloaderOnly")) {
      bool = true;
    } else {
      bool = false;
    } 
    c = bool;
    String str = System.getProperty("net.time4j.base.ResourceLoader");
    if (str == null) {
      b = new a();
      return;
    } 
    try {
      b = (d)Class.forName(str).newInstance();
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Wrong configuration of external resource loader: ");
      stringBuilder.append(exception.getMessage());
      throw new AssertionError(stringBuilder.toString());
    } 
  }
  
  public static d c() {
    return b;
  }
  
  public final InputStream a(Class<?> paramClass, String paramString, boolean paramBoolean) {
    if (!a) {
      URL uRL = paramClass.getClassLoader().getResource(paramString);
      if (uRL != null) {
        URLConnection uRLConnection;
        if (paramBoolean) {
          uRLConnection = uRL.openConnection();
          uRLConnection.setUseCaches(false);
          uRLConnection.connect();
          return uRLConnection.getInputStream();
        } 
        return uRLConnection.openStream();
      } 
      throw new FileNotFoundException(paramString);
    } 
    throw new FileNotFoundException(paramString);
  }
  
  public abstract InputStream a(URI paramURI, boolean paramBoolean);
  
  public abstract <S> Iterable<S> a(Class<S> paramClass);
  
  public abstract URI a(String paramString1, Class<?> paramClass, String paramString2);
  
  static {
    boolean bool;
  }
  
  private static final boolean a = "Dalvik".equalsIgnoreCase(System.getProperty("java.vm.name"));
  
  private static final d b;
  
  private static final boolean c;
  
  private static class a extends d {
    a() {
      if (!d.a())
        return; 
      throw new IllegalStateException("The module time4j-android is not active. Check your configuration.");
    }
    
    public InputStream a(URI param1URI, boolean param1Boolean) {
      if (param1URI != null) {
        if (d.b())
          return null; 
        try {
          URLConnection uRLConnection;
          URL uRL = param1URI.toURL();
          if (param1Boolean) {
            uRLConnection = uRL.openConnection();
            uRLConnection.setUseCaches(false);
            uRLConnection.connect();
            return uRLConnection.getInputStream();
          } 
          return uRLConnection.openStream();
        } catch (IOException iOException) {
          if (param1URI.toString().contains(".repository")) {
            PrintStream printStream = System.err;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Warning: Loading of resource ");
            stringBuilder.append(param1URI);
            stringBuilder.append(" failed (");
            stringBuilder.append(iOException.getMessage());
            stringBuilder.append("). ");
            stringBuilder.append("Consider setting the system property \"");
            stringBuilder.append("net.time4j.base.useClassloaderOnly");
            stringBuilder.append("\" for reducing overhead.");
            printStream.println(stringBuilder.toString());
            iOException.printStackTrace(System.err);
          } 
        } 
      } 
      return null;
    }
    
    public <S> Iterable<S> a(Class<S> param1Class) {
      return ServiceLoader.load(param1Class, param1Class.getClassLoader());
    }
    
    public URI a(String param1String1, Class<?> param1Class, String param1String2) {
      try {
        CodeSource codeSource;
        ProtectionDomain protectionDomain = param1Class.getProtectionDomain();
        if (protectionDomain == null) {
          protectionDomain = null;
        } else {
          codeSource = protectionDomain.getCodeSource();
        } 
        if (codeSource != null) {
          String str3 = codeSource.getLocation().toExternalForm();
          String str2 = str3;
          String str1 = str3;
          try {
            if (str3.endsWith(".jar")) {
              str1 = str3;
              StringBuilder stringBuilder2 = new StringBuilder();
              str1 = str3;
              stringBuilder2.append("jar:");
              str1 = str3;
              stringBuilder2.append(str3);
              str1 = str3;
              stringBuilder2.append("!/");
              str1 = str3;
              str = stringBuilder2.toString();
            } 
            str1 = str;
            StringBuilder stringBuilder1 = new StringBuilder();
            str1 = str;
            stringBuilder1.append(str);
            str1 = str;
            stringBuilder1.append(param1String2);
            str1 = str;
            String str = stringBuilder1.toString();
            str1 = str;
            return new URI(str);
          } catch (URISyntaxException uRISyntaxException1) {}
        } else {
          return null;
        } 
      } catch (SecurityException securityException) {
        return null;
      } catch (URISyntaxException uRISyntaxException) {
        uRISyntaxException = null;
      } 
      PrintStream printStream = System.err;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Warning: malformed resource path = ");
      stringBuilder.append((String)uRISyntaxException);
      printStream.println(stringBuilder.toString());
      return null;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/c1/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */