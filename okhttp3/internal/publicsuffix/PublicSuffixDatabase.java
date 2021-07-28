package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

public final class PublicSuffixDatabase {
  private static final String[] EMPTY_RULE;
  
  private static final byte EXCEPTION_MARKER = 33;
  
  private static final String[] PREVAILING_RULE;
  
  public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
  
  private static final byte[] WILDCARD_LABEL = new byte[] { 42 };
  
  private static final PublicSuffixDatabase instance;
  
  private final AtomicBoolean listRead = new AtomicBoolean(false);
  
  private byte[] publicSuffixExceptionListBytes;
  
  private byte[] publicSuffixListBytes;
  
  private final CountDownLatch readCompleteLatch = new CountDownLatch(1);
  
  static {
    EMPTY_RULE = new String[0];
    PREVAILING_RULE = new String[] { "*" };
    instance = new PublicSuffixDatabase();
  }
  
  private static String binarySearchBytes(byte[] paramArrayOfbyte, byte[][] paramArrayOfbyte1, int paramInt) {
    int i = paramArrayOfbyte.length;
    int j = 0;
    label56: while (j < i) {
      int k;
      for (k = (j + i) / 2; k > -1 && paramArrayOfbyte[k] != 10; k--);
      int m = k + 1;
      k = 1;
      while (true) {
        int i2 = m + k;
        if (paramArrayOfbyte[i2] != 10) {
          k++;
          continue;
        } 
        int i3 = i2 - m;
        int n = paramInt;
        boolean bool = false;
        k = 0;
        int i1 = 0;
        label53: while (true) {
          int i4;
          if (bool) {
            bool = false;
            i4 = 46;
          } else {
            i4 = paramArrayOfbyte1[n][k] & 0xFF;
          } 
          int i5 = i4 - (paramArrayOfbyte[m + i1] & 0xFF);
          if (i5 == 0) {
            i4 = i1 + 1;
            int i6 = k + 1;
            if (i4 == i3) {
              k = i6;
              i1 = i4;
            } else {
              k = i6;
              i1 = i4;
              if ((paramArrayOfbyte1[n]).length == i6) {
                if (n == paramArrayOfbyte1.length - 1) {
                  i1 = i4;
                  k = i6;
                } else {
                  n++;
                  bool = true;
                  k = -1;
                  i1 = i4;
                  continue;
                } 
              } else {
                continue;
              } 
            } 
          } 
          if (i5 < 0) {
            i = m - 1;
            continue label56;
          } 
          if (i5 > 0) {
            j = i2 + 1;
            continue label56;
          } 
          i1 = i3 - i1;
          k = (paramArrayOfbyte1[n]).length - k;
          while (true) {
            if (++n < paramArrayOfbyte1.length) {
              k += (paramArrayOfbyte1[n]).length;
              continue;
            } 
            if (k < i1)
              continue label53; 
            if (k > i1)
              continue label53; 
            return new String(paramArrayOfbyte, m, i3, Util.UTF_8);
          } 
          break;
        } 
      } 
      continue;
    } 
    return null;
  }
  
  private String[] findMatchingRule(String[] paramArrayOfString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield listRead : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   4: invokevirtual get : ()Z
    //   7: istore #4
    //   9: iconst_0
    //   10: istore_3
    //   11: iload #4
    //   13: ifne -> 35
    //   16: aload_0
    //   17: getfield listRead : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   20: iconst_0
    //   21: iconst_1
    //   22: invokevirtual compareAndSet : (ZZ)Z
    //   25: ifeq -> 35
    //   28: aload_0
    //   29: invokespecial readTheListUninterruptibly : ()V
    //   32: goto -> 51
    //   35: aload_0
    //   36: getfield readCompleteLatch : Ljava/util/concurrent/CountDownLatch;
    //   39: invokevirtual await : ()V
    //   42: goto -> 51
    //   45: invokestatic currentThread : ()Ljava/lang/Thread;
    //   48: invokevirtual interrupt : ()V
    //   51: aload_0
    //   52: monitorenter
    //   53: aload_0
    //   54: getfield publicSuffixListBytes : [B
    //   57: ifnull -> 347
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_1
    //   63: arraylength
    //   64: anewarray [B
    //   67: astore #7
    //   69: iconst_0
    //   70: istore_2
    //   71: iload_2
    //   72: aload_1
    //   73: arraylength
    //   74: if_icmpge -> 97
    //   77: aload #7
    //   79: iload_2
    //   80: aload_1
    //   81: iload_2
    //   82: aaload
    //   83: getstatic okhttp3/internal/Util.UTF_8 : Ljava/nio/charset/Charset;
    //   86: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   89: aastore
    //   90: iload_2
    //   91: iconst_1
    //   92: iadd
    //   93: istore_2
    //   94: goto -> 71
    //   97: iconst_0
    //   98: istore_2
    //   99: iload_2
    //   100: aload #7
    //   102: arraylength
    //   103: if_icmpge -> 131
    //   106: aload_0
    //   107: getfield publicSuffixListBytes : [B
    //   110: aload #7
    //   112: iload_2
    //   113: invokestatic binarySearchBytes : ([B[[BI)Ljava/lang/String;
    //   116: astore_1
    //   117: aload_1
    //   118: ifnull -> 124
    //   121: goto -> 133
    //   124: iload_2
    //   125: iconst_1
    //   126: iadd
    //   127: istore_2
    //   128: goto -> 99
    //   131: aconst_null
    //   132: astore_1
    //   133: aload #7
    //   135: arraylength
    //   136: iconst_1
    //   137: if_icmple -> 195
    //   140: aload #7
    //   142: invokevirtual clone : ()Ljava/lang/Object;
    //   145: checkcast [[B
    //   148: astore #6
    //   150: iconst_0
    //   151: istore_2
    //   152: iload_2
    //   153: aload #6
    //   155: arraylength
    //   156: iconst_1
    //   157: isub
    //   158: if_icmpge -> 195
    //   161: aload #6
    //   163: iload_2
    //   164: getstatic okhttp3/internal/publicsuffix/PublicSuffixDatabase.WILDCARD_LABEL : [B
    //   167: aastore
    //   168: aload_0
    //   169: getfield publicSuffixListBytes : [B
    //   172: aload #6
    //   174: iload_2
    //   175: invokestatic binarySearchBytes : ([B[[BI)Ljava/lang/String;
    //   178: astore #5
    //   180: aload #5
    //   182: ifnull -> 188
    //   185: goto -> 198
    //   188: iload_2
    //   189: iconst_1
    //   190: iadd
    //   191: istore_2
    //   192: goto -> 152
    //   195: aconst_null
    //   196: astore #5
    //   198: aload #5
    //   200: ifnull -> 241
    //   203: iload_3
    //   204: istore_2
    //   205: iload_2
    //   206: aload #7
    //   208: arraylength
    //   209: iconst_1
    //   210: isub
    //   211: if_icmpge -> 241
    //   214: aload_0
    //   215: getfield publicSuffixExceptionListBytes : [B
    //   218: aload #7
    //   220: iload_2
    //   221: invokestatic binarySearchBytes : ([B[[BI)Ljava/lang/String;
    //   224: astore #6
    //   226: aload #6
    //   228: ifnull -> 234
    //   231: goto -> 244
    //   234: iload_2
    //   235: iconst_1
    //   236: iadd
    //   237: istore_2
    //   238: goto -> 205
    //   241: aconst_null
    //   242: astore #6
    //   244: aload #6
    //   246: ifnull -> 281
    //   249: new java/lang/StringBuilder
    //   252: dup
    //   253: invokespecial <init> : ()V
    //   256: astore_1
    //   257: aload_1
    //   258: ldc '!'
    //   260: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: pop
    //   264: aload_1
    //   265: aload #6
    //   267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: pop
    //   271: aload_1
    //   272: invokevirtual toString : ()Ljava/lang/String;
    //   275: ldc '\.'
    //   277: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   280: areturn
    //   281: aload_1
    //   282: ifnonnull -> 294
    //   285: aload #5
    //   287: ifnonnull -> 294
    //   290: getstatic okhttp3/internal/publicsuffix/PublicSuffixDatabase.PREVAILING_RULE : [Ljava/lang/String;
    //   293: areturn
    //   294: aload_1
    //   295: ifnull -> 308
    //   298: aload_1
    //   299: ldc '\.'
    //   301: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   304: astore_1
    //   305: goto -> 312
    //   308: getstatic okhttp3/internal/publicsuffix/PublicSuffixDatabase.EMPTY_RULE : [Ljava/lang/String;
    //   311: astore_1
    //   312: aload #5
    //   314: ifnull -> 329
    //   317: aload #5
    //   319: ldc '\.'
    //   321: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   324: astore #5
    //   326: goto -> 334
    //   329: getstatic okhttp3/internal/publicsuffix/PublicSuffixDatabase.EMPTY_RULE : [Ljava/lang/String;
    //   332: astore #5
    //   334: aload_1
    //   335: arraylength
    //   336: aload #5
    //   338: arraylength
    //   339: if_icmple -> 344
    //   342: aload_1
    //   343: areturn
    //   344: aload #5
    //   346: areturn
    //   347: new java/lang/IllegalStateException
    //   350: dup
    //   351: ldc 'Unable to load publicsuffixes.gz resource from the classpath.'
    //   353: invokespecial <init> : (Ljava/lang/String;)V
    //   356: athrow
    //   357: astore_1
    //   358: aload_0
    //   359: monitorexit
    //   360: goto -> 365
    //   363: aload_1
    //   364: athrow
    //   365: goto -> 363
    //   368: astore #5
    //   370: goto -> 45
    // Exception table:
    //   from	to	target	type
    //   35	42	368	java/lang/InterruptedException
    //   53	62	357	finally
    //   347	357	357	finally
    //   358	360	357	finally
  }
  
  public static PublicSuffixDatabase get() {
    return instance;
  }
  
  private void readTheList() {
    // Byte code:
    //   0: ldc okhttp3/internal/publicsuffix/PublicSuffixDatabase
    //   2: ldc 'publicsuffixes.gz'
    //   4: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   7: astore_1
    //   8: aload_1
    //   9: ifnonnull -> 13
    //   12: return
    //   13: new j/j
    //   16: dup
    //   17: aload_1
    //   18: invokestatic a : (Ljava/io/InputStream;)Lj/t;
    //   21: invokespecial <init> : (Lj/t;)V
    //   24: invokestatic a : (Lj/t;)Lj/e;
    //   27: astore_1
    //   28: aload_1
    //   29: invokeinterface readInt : ()I
    //   34: newarray byte
    //   36: astore_2
    //   37: aload_1
    //   38: aload_2
    //   39: invokeinterface readFully : ([B)V
    //   44: aload_1
    //   45: invokeinterface readInt : ()I
    //   50: newarray byte
    //   52: astore_3
    //   53: aload_1
    //   54: aload_3
    //   55: invokeinterface readFully : ([B)V
    //   60: aload_1
    //   61: invokestatic closeQuietly : (Ljava/io/Closeable;)V
    //   64: aload_0
    //   65: monitorenter
    //   66: aload_0
    //   67: aload_2
    //   68: putfield publicSuffixListBytes : [B
    //   71: aload_0
    //   72: aload_3
    //   73: putfield publicSuffixExceptionListBytes : [B
    //   76: aload_0
    //   77: monitorexit
    //   78: aload_0
    //   79: getfield readCompleteLatch : Ljava/util/concurrent/CountDownLatch;
    //   82: invokevirtual countDown : ()V
    //   85: return
    //   86: astore_1
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_1
    //   90: athrow
    //   91: astore_2
    //   92: aload_1
    //   93: invokestatic closeQuietly : (Ljava/io/Closeable;)V
    //   96: aload_2
    //   97: athrow
    // Exception table:
    //   from	to	target	type
    //   28	60	91	finally
    //   66	78	86	finally
    //   87	89	86	finally
  }
  
  private void readTheListUninterruptibly() {
    boolean bool = false;
    while (true) {
      try {
        readTheList();
        return;
      } catch (InterruptedIOException interruptedIOException) {
        Thread.interrupted();
      } catch (IOException iOException) {
        Platform.get().log(5, "Failed to read public suffix list", iOException);
        return;
      } finally {
        if (bool)
          Thread.currentThread().interrupt(); 
      } 
    } 
  }
  
  public String getEffectiveTldPlusOne(String paramString) {
    if (paramString != null) {
      String[] arrayOfString2 = IDN.toUnicode(paramString).split("\\.");
      String[] arrayOfString3 = findMatchingRule(arrayOfString2);
      if (arrayOfString2.length == arrayOfString3.length && arrayOfString3[0].charAt(0) != '!')
        return null; 
      char c = arrayOfString3[0].charAt(0);
      int j = arrayOfString2.length;
      int i = arrayOfString3.length;
      if (c != '!')
        i++; 
      i = j - i;
      StringBuilder stringBuilder = new StringBuilder();
      String[] arrayOfString1 = paramString.split("\\.");
      while (i < arrayOfString1.length) {
        stringBuilder.append(arrayOfString1[i]);
        stringBuilder.append('.');
        i++;
      } 
      stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      return stringBuilder.toString();
    } 
    NullPointerException nullPointerException = new NullPointerException("domain == null");
    throw nullPointerException;
  }
  
  void setListBytes(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.publicSuffixListBytes = paramArrayOfbyte1;
    this.publicSuffixExceptionListBytes = paramArrayOfbyte2;
    this.listRead.set(true);
    this.readCompleteLatch.countDown();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/publicsuffix/PublicSuffixDatabase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */