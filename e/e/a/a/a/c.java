package e.e.a.a.a;

import android.os.Build;
import android.os.Process;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;

public class c {
  private static boolean a;
  
  private static byte[] b() {
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
      dataOutputStream.writeLong(System.currentTimeMillis());
      dataOutputStream.writeLong(System.nanoTime());
      dataOutputStream.writeInt(Process.myPid());
      dataOutputStream.writeInt(Process.myUid());
      dataOutputStream.write(c());
      dataOutputStream.close();
      return byteArrayOutputStream.toByteArray();
    } catch (IOException iOException) {
      throw new SecurityException("Failed to generate seed", iOException);
    } 
  }
  
  private static byte[] c() {
    StringBuilder stringBuilder = new StringBuilder();
    String str = Build.FINGERPRINT;
    if (str != null)
      stringBuilder.append(str); 
    str = d();
    if (str != null)
      stringBuilder.append(str); 
    try {
      return stringBuilder.toString().getBytes("UTF-8");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new RuntimeException("UTF-8 encoding not supported");
    } 
  }
  
  private static String d() {
    try {
      return (String)Build.class.getField("SERIAL").get(null);
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public static void e() {
    // Byte code:
    //   0: ldc e/e/a/a/a/c
    //   2: monitorenter
    //   3: getstatic e/e/a/a/a/c.a : Z
    //   6: istore_0
    //   7: iload_0
    //   8: ifeq -> 15
    //   11: ldc e/e/a/a/a/c
    //   13: monitorexit
    //   14: return
    //   15: invokestatic f : ()V
    //   18: invokestatic g : ()V
    //   21: iconst_1
    //   22: putstatic e/e/a/a/a/c.a : Z
    //   25: ldc e/e/a/a/a/c
    //   27: monitorexit
    //   28: return
    //   29: astore_1
    //   30: new e/e/a/a/a/c$a
    //   33: dup
    //   34: aload_1
    //   35: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   38: athrow
    //   39: astore_1
    //   40: ldc e/e/a/a/a/c
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    // Exception table:
    //   from	to	target	type
    //   3	7	39	finally
    //   15	21	29	finally
    //   21	25	39	finally
    //   30	39	39	finally
  }
  
  private static void f() {
    int i = Build.VERSION.SDK_INT;
    if (i >= 17) {
      if (i > 18)
        return; 
      try {
        Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_seed", new Class[] { byte[].class }).invoke(null, new Object[] { b() });
        i = ((Integer)Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_load_file", new Class[] { String.class, long.class }).invoke(null, new Object[] { "/dev/urandom", Integer.valueOf(1024) })).intValue();
        if (i == 1024)
          return; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected number of bytes read from Linux PRNG: ");
        stringBuilder.append(i);
        throw new IOException(stringBuilder.toString());
      } catch (Exception exception) {
        throw new SecurityException("Failed to seed OpenSSL PRNG", exception);
      } 
    } 
  }
  
  private static void g() {
    if (Build.VERSION.SDK_INT > 18)
      return; 
    Provider[] arrayOfProvider = Security.getProviders("SecureRandom.SHA1PRNG");
    if (arrayOfProvider == null || arrayOfProvider.length < 1 || !c.class.equals(arrayOfProvider[0].getClass()))
      Security.insertProviderAt(new c(), 1); 
    SecureRandom secureRandom = new SecureRandom();
    if (c.class.equals(secureRandom.getProvider().getClass()))
      try {
        secureRandom = SecureRandom.getInstance("SHA1PRNG");
        if (c.class.equals(secureRandom.getProvider().getClass()))
          return; 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("SecureRandom.getInstance(\"SHA1PRNG\") backed by wrong Provider: ");
        stringBuilder1.append(secureRandom.getProvider().getClass());
        throw new SecurityException(stringBuilder1.toString());
      } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        throw new SecurityException("SHA1PRNG not available", noSuchAlgorithmException);
      }  
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("new SecureRandom() backed by wrong Provider: ");
    stringBuilder.append(noSuchAlgorithmException.getProvider().getClass());
    throw new SecurityException(stringBuilder.toString());
  }
  
  public static class a extends RuntimeException {
    public a(Throwable param1Throwable) {
      super("Error fixing the Android's SecureRandom", param1Throwable);
    }
  }
  
  public static class b extends SecureRandomSpi {
    private static final File c = new File("/dev/urandom");
    
    private static final Object d = new Object();
    
    private static DataInputStream e;
    
    private static OutputStream f;
    
    private boolean mSeedAttempted;
    
    private DataInputStream a() {
      synchronized (d) {
        DataInputStream dataInputStream = e;
        if (dataInputStream == null)
          try {
            e = new DataInputStream(new FileInputStream(c));
          } catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to open ");
            stringBuilder.append(c);
            stringBuilder.append(" for reading");
            throw new SecurityException(stringBuilder.toString(), iOException);
          }  
        dataInputStream = e;
        return dataInputStream;
      } 
    }
    
    private OutputStream b() {
      synchronized (d) {
        OutputStream outputStream = f;
        if (outputStream == null)
          try {
            f = new FileOutputStream(c);
          } catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to open ");
            stringBuilder.append(c);
            stringBuilder.append(" for writing");
            throw new SecurityException(stringBuilder.toString(), iOException);
          }  
        outputStream = f;
        return outputStream;
      } 
    }
    
    protected byte[] engineGenerateSeed(int param1Int) {
      byte[] arrayOfByte = new byte[param1Int];
      engineNextBytes(arrayOfByte);
      return arrayOfByte;
    }
    
    protected void engineNextBytes(byte[] param1ArrayOfbyte) {
      // Byte code:
      //   0: aload_0
      //   1: getfield mSeedAttempted : Z
      //   4: ifne -> 14
      //   7: aload_0
      //   8: invokestatic a : ()[B
      //   11: invokevirtual engineSetSeed : ([B)V
      //   14: getstatic e/e/a/a/a/c$b.d : Ljava/lang/Object;
      //   17: astore_2
      //   18: aload_2
      //   19: monitorenter
      //   20: aload_0
      //   21: invokespecial a : ()Ljava/io/DataInputStream;
      //   24: astore_3
      //   25: aload_2
      //   26: monitorexit
      //   27: aload_3
      //   28: monitorenter
      //   29: aload_3
      //   30: aload_1
      //   31: invokevirtual readFully : ([B)V
      //   34: aload_3
      //   35: monitorexit
      //   36: return
      //   37: astore_1
      //   38: aload_3
      //   39: monitorexit
      //   40: aload_1
      //   41: athrow
      //   42: astore_1
      //   43: aload_2
      //   44: monitorexit
      //   45: aload_1
      //   46: athrow
      //   47: astore_1
      //   48: new java/lang/StringBuilder
      //   51: dup
      //   52: invokespecial <init> : ()V
      //   55: astore_2
      //   56: aload_2
      //   57: ldc 'Failed to read from '
      //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   62: pop
      //   63: aload_2
      //   64: getstatic e/e/a/a/a/c$b.c : Ljava/io/File;
      //   67: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   70: pop
      //   71: new java/lang/SecurityException
      //   74: dup
      //   75: aload_2
      //   76: invokevirtual toString : ()Ljava/lang/String;
      //   79: aload_1
      //   80: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
      //   83: athrow
      // Exception table:
      //   from	to	target	type
      //   14	20	47	java/io/IOException
      //   20	27	42	finally
      //   27	29	47	java/io/IOException
      //   29	36	37	finally
      //   38	40	37	finally
      //   40	42	47	java/io/IOException
      //   43	45	42	finally
      //   45	47	47	java/io/IOException
    }
    
    protected void engineSetSeed(byte[] param1ArrayOfbyte) {
      try {
        synchronized (d) {
          OutputStream outputStream = b();
          outputStream.write(param1ArrayOfbyte);
          outputStream.flush();
        } 
      } finally {}
      this.mSeedAttempted = true;
    }
  }
  
  private static class c extends Provider {
    public c() {
      super("LinuxPRNG", 1.0D, "A Linux-specific random number provider that uses /dev/urandom");
      put("SecureRandom.SHA1PRNG", c.b.class.getName());
      put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/a/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */