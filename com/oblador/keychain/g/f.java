package com.oblador.keychain.g;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

public abstract class f implements e {
  protected static final String g = "f";
  
  public static final Charset h = Charset.forName("UTF-8");
  
  protected final Object a = new Object();
  
  protected transient AtomicBoolean b;
  
  protected final Object c = new Object();
  
  protected transient AtomicBoolean d;
  
  protected transient Cipher e;
  
  protected transient KeyStore f;
  
  public static String a(String paramString1, String paramString2) {
    String str = paramString1;
    if (TextUtils.isEmpty(paramString1))
      str = paramString2; 
    return str;
  }
  
  public static void a(InputStream paramInputStream, OutputStream paramOutputStream) {
    byte[] arrayOfByte = new byte[16384];
    while (true) {
      int i = paramInputStream.read(arrayOfByte);
      if (i > 0) {
        paramOutputStream.write(arrayOfByte, 0, i);
        continue;
      } 
      break;
    } 
  }
  
  protected abstract KeyInfo a(Key paramKey);
  
  public com.oblador.keychain.f a() {
    return com.oblador.keychain.f.e;
  }
  
  public String a(Key paramKey, byte[] paramArrayOfbyte) {
    return a(paramKey, paramArrayOfbyte, b.b);
  }
  
  protected String a(Key paramKey, byte[] paramArrayOfbyte, a parama) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual h : ()Ljavax/crypto/Cipher;
    //   4: astore #5
    //   6: new java/io/ByteArrayInputStream
    //   9: dup
    //   10: aload_2
    //   11: invokespecial <init> : ([B)V
    //   14: astore_2
    //   15: new java/io/ByteArrayOutputStream
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: astore #4
    //   24: aload_3
    //   25: ifnull -> 38
    //   28: aload_3
    //   29: aload #5
    //   31: aload_1
    //   32: aload_2
    //   33: invokeinterface a : (Ljavax/crypto/Cipher;Ljava/security/Key;Ljava/io/InputStream;)V
    //   38: new javax/crypto/CipherInputStream
    //   41: dup
    //   42: aload_2
    //   43: aload #5
    //   45: invokespecial <init> : (Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   48: astore_3
    //   49: aload_3
    //   50: aload #4
    //   52: invokestatic a : (Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   55: aload_3
    //   56: invokevirtual close : ()V
    //   59: new java/lang/String
    //   62: dup
    //   63: aload #4
    //   65: invokevirtual toByteArray : ()[B
    //   68: getstatic com/oblador/keychain/g/f.h : Ljava/nio/charset/Charset;
    //   71: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   74: astore_1
    //   75: aload #4
    //   77: invokevirtual close : ()V
    //   80: aload_2
    //   81: invokevirtual close : ()V
    //   84: aload_1
    //   85: areturn
    //   86: astore_1
    //   87: aload_3
    //   88: invokevirtual close : ()V
    //   91: aload_1
    //   92: athrow
    //   93: astore_1
    //   94: aload #4
    //   96: invokevirtual close : ()V
    //   99: aload_1
    //   100: athrow
    //   101: astore_1
    //   102: aload_2
    //   103: invokevirtual close : ()V
    //   106: aload_1
    //   107: athrow
    //   108: astore_1
    //   109: getstatic com/oblador/keychain/g/f.g : Ljava/lang/String;
    //   112: aload_1
    //   113: invokevirtual getMessage : ()Ljava/lang/String;
    //   116: aload_1
    //   117: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   120: pop
    //   121: aload_1
    //   122: athrow
    //   123: astore_3
    //   124: goto -> 91
    //   127: astore_3
    //   128: goto -> 99
    //   131: astore_2
    //   132: goto -> 106
    // Exception table:
    //   from	to	target	type
    //   6	15	108	finally
    //   15	24	101	finally
    //   28	38	93	finally
    //   38	49	93	finally
    //   49	55	86	finally
    //   55	75	93	finally
    //   75	80	101	finally
    //   80	84	108	finally
    //   87	91	123	finally
    //   91	93	93	finally
    //   94	99	127	finally
    //   99	101	101	finally
    //   102	106	131	finally
    //   106	108	108	finally
  }
  
  protected abstract Key a(KeyGenParameterSpec paramKeyGenParameterSpec);
  
  protected Key a(String paramString, com.oblador.keychain.f paramf, AtomicInteger paramAtomicInteger) {
    while (true) {
      KeyStore keyStore = k();
      if (!keyStore.containsAlias(paramString))
        a(paramString, paramf); 
      Key key = a(keyStore, paramString, paramAtomicInteger);
      if (key != null)
        return key; 
    } 
  }
  
  protected Key a(KeyStore paramKeyStore, String paramString, AtomicInteger paramAtomicInteger) {
    try {
      Key key = paramKeyStore.getKey(paramString, null);
      if (key != null)
        return key; 
      throw new com.oblador.keychain.i.c("Empty key extracted!");
    } catch (UnrecoverableKeyException unrecoverableKeyException) {
      if (paramAtomicInteger.getAndDecrement() > 0) {
        paramKeyStore.deleteEntry(paramString);
        return null;
      } 
      throw unrecoverableKeyException;
    } 
  }
  
  protected void a(com.oblador.keychain.f paramf) {
    if (a().a(paramf))
      return; 
    throw new com.oblador.keychain.i.a(String.format("Insufficient security level (wants %s; got %s)", new Object[] { paramf, a() }));
  }
  
  public void a(String paramString) {
    paramString = a(paramString, i());
    KeyStore keyStore = k();
    try {
      if (keyStore.containsAlias(paramString))
        keyStore.deleteEntry(paramString); 
      return;
    } catch (GeneralSecurityException generalSecurityException) {
      return;
    } 
  }
  
  public void a(String paramString, com.oblador.keychain.f paramf) {
    synchronized (this.c) {
      AtomicBoolean atomicBoolean = this.d;
      Key key2 = null;
      Key key1 = null;
      Key key3 = null;
      if (atomicBoolean == null || this.d.get()) {
        if (this.d == null)
          this.d = new AtomicBoolean(false); 
        key1 = key3;
        try {
          key3 = d(paramString);
          key1 = key3;
          key2 = key3;
          this.d.set(true);
          key1 = key3;
        } catch (GeneralSecurityException generalSecurityException2) {
          key1 = key2;
          GeneralSecurityException generalSecurityException1 = generalSecurityException2;
          Log.w(g, "StrongBox security storage is not available.", generalSecurityException1);
        } catch (ProviderException providerException) {}
      } 
      if (key1 == null || !this.d.get())
        try {
          key1 = c(paramString);
          if (a(paramf, key1))
            return; 
          throw new com.oblador.keychain.i.a("Cannot generate keys with required security guarantees");
        } catch (GeneralSecurityException generalSecurityException) {
          Log.e(g, "Regular security storage is not available.", generalSecurityException);
          throw generalSecurityException;
        }  
      if (a(paramf, key1))
        return; 
      throw new com.oblador.keychain.i.a("Cannot generate keys with required security guarantees");
    } 
  }
  
  protected boolean a(com.oblador.keychain.f paramf, Key paramKey) {
    return b(paramKey).a(paramf);
  }
  
  public byte[] a(Key paramKey, String paramString) {
    return a(paramKey, paramString, b.a);
  }
  
  protected byte[] a(Key paramKey, String paramString, c paramc) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual h : ()Ljavax/crypto/Cipher;
    //   4: astore #5
    //   6: new java/io/ByteArrayOutputStream
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore #4
    //   15: aload_3
    //   16: ifnull -> 35
    //   19: aload_3
    //   20: aload #5
    //   22: aload_1
    //   23: aload #4
    //   25: invokeinterface a : (Ljavax/crypto/Cipher;Ljava/security/Key;Ljava/io/OutputStream;)V
    //   30: aload #4
    //   32: invokevirtual flush : ()V
    //   35: new javax/crypto/CipherOutputStream
    //   38: dup
    //   39: aload #4
    //   41: aload #5
    //   43: invokespecial <init> : (Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V
    //   46: astore_1
    //   47: aload_1
    //   48: aload_2
    //   49: getstatic com/oblador/keychain/g/f.h : Ljava/nio/charset/Charset;
    //   52: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   55: invokevirtual write : ([B)V
    //   58: aload_1
    //   59: invokevirtual close : ()V
    //   62: aload #4
    //   64: invokevirtual toByteArray : ()[B
    //   67: astore_1
    //   68: aload #4
    //   70: invokevirtual close : ()V
    //   73: aload_1
    //   74: areturn
    //   75: astore_2
    //   76: aload_1
    //   77: invokevirtual close : ()V
    //   80: aload_2
    //   81: athrow
    //   82: astore_1
    //   83: aload #4
    //   85: invokevirtual close : ()V
    //   88: aload_1
    //   89: athrow
    //   90: astore_1
    //   91: getstatic com/oblador/keychain/g/f.g : Ljava/lang/String;
    //   94: aload_1
    //   95: invokevirtual getMessage : ()Ljava/lang/String;
    //   98: aload_1
    //   99: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   102: pop
    //   103: aload_1
    //   104: athrow
    //   105: astore_1
    //   106: goto -> 80
    //   109: astore_2
    //   110: goto -> 88
    // Exception table:
    //   from	to	target	type
    //   6	15	90	finally
    //   19	35	82	finally
    //   35	47	82	finally
    //   47	58	75	finally
    //   58	68	82	finally
    //   68	73	90	finally
    //   76	80	105	finally
    //   80	82	82	finally
    //   83	88	109	finally
    //   88	90	90	finally
  }
  
  protected abstract KeyGenParameterSpec.Builder b(String paramString);
  
  protected com.oblador.keychain.f b(Key paramKey) {
    KeyInfo keyInfo = a(paramKey);
    return (Build.VERSION.SDK_INT >= 23 && keyInfo.isInsideSecureHardware()) ? com.oblador.keychain.f.e : com.oblador.keychain.f.d;
  }
  
  protected Key c(String paramString) {
    if (Build.VERSION.SDK_INT >= 23)
      return a(b(paramString).build()); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Regular security keystore is not supported for old API");
    stringBuilder.append(Build.VERSION.SDK_INT);
    stringBuilder.append(".");
    throw new com.oblador.keychain.i.c(stringBuilder.toString());
  }
  
  public final int d() {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  protected Key d(String paramString) {
    if (Build.VERSION.SDK_INT >= 28)
      return a(b(paramString).setIsStrongBoxBacked(true).build()); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Strong box security keystore is not supported for old API");
    stringBuilder.append(Build.VERSION.SDK_INT);
    stringBuilder.append(".");
    throw new com.oblador.keychain.i.c(stringBuilder.toString());
  }
  
  public boolean f() {
    null = this.b;
    if (null != null)
      return null.get(); 
    synchronized (this.a) {
      if (this.b != null)
        return this.b.get(); 
      this.b = new AtomicBoolean(false);
      try {
        e e1 = new e("AndroidKeyStore#supportsSecureHardware");
        try {
          boolean bool = a(com.oblador.keychain.f.e, e1.d);
          this.b.set(bool);
          e1.close();
          return this.b.get();
        } finally {
          Exception exception;
        } 
      } finally {}
    } 
    Object object = null;
  }
  
  public Set<String> g() {
    KeyStore keyStore = k();
    try {
      return new HashSet(Collections.list(keyStore.aliases()));
    } catch (KeyStoreException keyStoreException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Error accessing aliases in keystore ");
      stringBuilder.append(keyStore);
      throw new com.oblador.keychain.i.c(stringBuilder.toString(), keyStoreException);
    } 
  }
  
  public Cipher h() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Ljavax/crypto/Cipher;
    //   4: ifnonnull -> 37
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield e : Ljavax/crypto/Cipher;
    //   13: ifnonnull -> 27
    //   16: aload_0
    //   17: aload_0
    //   18: invokevirtual j : ()Ljava/lang/String;
    //   21: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   24: putfield e : Ljavax/crypto/Cipher;
    //   27: aload_0
    //   28: monitorexit
    //   29: goto -> 37
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    //   37: aload_0
    //   38: getfield e : Ljavax/crypto/Cipher;
    //   41: areturn
    // Exception table:
    //   from	to	target	type
    //   9	27	32	finally
    //   27	29	32	finally
    //   33	35	32	finally
  }
  
  public String i() {
    return c();
  }
  
  protected abstract String j();
  
  public KeyStore k() {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Ljava/security/KeyStore;
    //   4: ifnonnull -> 61
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield f : Ljava/security/KeyStore;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnonnull -> 51
    //   18: ldc_w 'AndroidKeyStore'
    //   21: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyStore;
    //   24: astore_1
    //   25: aload_1
    //   26: aconst_null
    //   27: invokevirtual load : (Ljava/security/KeyStore$LoadStoreParameter;)V
    //   30: aload_0
    //   31: aload_1
    //   32: putfield f : Ljava/security/KeyStore;
    //   35: goto -> 51
    //   38: astore_1
    //   39: new com/oblador/keychain/i/c
    //   42: dup
    //   43: ldc_w 'Could not access Keystore'
    //   46: aload_1
    //   47: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   50: athrow
    //   51: aload_0
    //   52: monitorexit
    //   53: goto -> 61
    //   56: astore_1
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_1
    //   60: athrow
    //   61: aload_0
    //   62: getfield f : Ljava/security/KeyStore;
    //   65: areturn
    // Exception table:
    //   from	to	target	type
    //   9	14	56	finally
    //   18	35	38	finally
    //   39	51	56	finally
    //   51	53	56	finally
    //   57	59	56	finally
  }
  
  public static interface a {
    void a(Cipher param1Cipher, Key param1Key, InputStream param1InputStream);
  }
  
  public static final class b {
    public static final f.c a = b.a;
    
    public static final f.a b = a.a;
  }
  
  public static interface c {
    void a(Cipher param1Cipher, Key param1Key, OutputStream param1OutputStream);
  }
  
  public static final class d {
    public static final f.c a = c.a;
    
    public static final f.a b = d.a;
    
    public static IvParameterSpec a(InputStream param1InputStream) {
      byte[] arrayOfByte = new byte[16];
      if (param1InputStream.read(arrayOfByte, 0, 16) == 16)
        return new IvParameterSpec(arrayOfByte); 
      throw new IOException("Input stream has insufficient data.");
    }
    
    public static IvParameterSpec a(byte[] param1ArrayOfbyte) {
      byte[] arrayOfByte = new byte[16];
      if (16 < param1ArrayOfbyte.length) {
        System.arraycopy(param1ArrayOfbyte, 0, arrayOfByte, 0, 16);
        return new IvParameterSpec(arrayOfByte);
      } 
      throw new IOException("Insufficient length of input data for IV extracting.");
    }
  }
  
  public class e implements Closeable {
    public final String c;
    
    public final Key d;
    
    public e(String param1String) {
      this(param1String, f.this.c(param1String));
    }
    
    public e(String param1String, Key param1Key) {
      this.c = param1String;
      this.d = param1Key;
    }
    
    public void close() {
      try {
        this.e.a(this.c);
        return;
      } catch (com.oblador.keychain.i.c c) {
        String str = f.g;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AutoClose remove key failed. Error: ");
        stringBuilder.append(c.getMessage());
        Log.w(str, stringBuilder.toString(), (Throwable)c);
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */