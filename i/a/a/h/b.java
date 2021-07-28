package i.a.a.h;

import i.a.a.f.a;

public class b {
  public static long a(String paramString, a parama) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic h : (Ljava/lang/String;)Z
    //   4: ifeq -> 226
    //   7: aconst_null
    //   8: astore #6
    //   10: aconst_null
    //   11: astore #7
    //   13: aconst_null
    //   14: astore #8
    //   16: aload #8
    //   18: astore #5
    //   20: aload_0
    //   21: invokestatic b : (Ljava/lang/String;)Z
    //   24: pop
    //   25: aload #8
    //   27: astore #5
    //   29: new java/io/FileInputStream
    //   32: dup
    //   33: new java/io/File
    //   36: dup
    //   37: aload_0
    //   38: invokespecial <init> : (Ljava/lang/String;)V
    //   41: invokespecial <init> : (Ljava/io/File;)V
    //   44: astore_0
    //   45: sipush #16384
    //   48: newarray byte
    //   50: astore #5
    //   52: new java/util/zip/CRC32
    //   55: dup
    //   56: invokespecial <init> : ()V
    //   59: astore #6
    //   61: aload_0
    //   62: aload #5
    //   64: invokevirtual read : ([B)I
    //   67: istore_2
    //   68: iload_2
    //   69: iconst_m1
    //   70: if_icmpeq -> 125
    //   73: aload #6
    //   75: aload #5
    //   77: iconst_0
    //   78: iload_2
    //   79: invokevirtual update : ([BII)V
    //   82: aload_1
    //   83: ifnull -> 61
    //   86: aload_1
    //   87: iload_2
    //   88: i2l
    //   89: invokevirtual b : (J)V
    //   92: aload_1
    //   93: invokevirtual c : ()Z
    //   96: ifeq -> 61
    //   99: aload_1
    //   100: iconst_3
    //   101: invokevirtual c : (I)V
    //   104: aload_1
    //   105: iconst_0
    //   106: invokevirtual d : (I)V
    //   109: aload_0
    //   110: invokevirtual close : ()V
    //   113: lconst_0
    //   114: lreturn
    //   115: new i/a/a/c/a
    //   118: dup
    //   119: ldc 'error while closing the file after calculating crc'
    //   121: invokespecial <init> : (Ljava/lang/String;)V
    //   124: athrow
    //   125: aload #6
    //   127: invokevirtual getValue : ()J
    //   130: lstore_3
    //   131: aload_0
    //   132: invokevirtual close : ()V
    //   135: lload_3
    //   136: lreturn
    //   137: new i/a/a/c/a
    //   140: dup
    //   141: ldc 'error while closing the file after calculating crc'
    //   143: invokespecial <init> : (Ljava/lang/String;)V
    //   146: athrow
    //   147: astore_1
    //   148: aload_0
    //   149: astore #5
    //   151: aload_1
    //   152: astore_0
    //   153: goto -> 201
    //   156: astore_1
    //   157: aload_0
    //   158: astore #5
    //   160: aload_1
    //   161: astore_0
    //   162: goto -> 183
    //   165: astore_1
    //   166: aload_0
    //   167: astore #5
    //   169: aload_1
    //   170: astore_0
    //   171: goto -> 192
    //   174: astore_0
    //   175: goto -> 201
    //   178: astore_0
    //   179: aload #6
    //   181: astore #5
    //   183: new i/a/a/c/a
    //   186: dup
    //   187: aload_0
    //   188: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   191: athrow
    //   192: new i/a/a/c/a
    //   195: dup
    //   196: aload_0
    //   197: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   200: athrow
    //   201: aload #5
    //   203: ifnull -> 224
    //   206: aload #5
    //   208: invokevirtual close : ()V
    //   211: goto -> 224
    //   214: new i/a/a/c/a
    //   217: dup
    //   218: ldc 'error while closing the file after calculating crc'
    //   220: invokespecial <init> : (Ljava/lang/String;)V
    //   223: athrow
    //   224: aload_0
    //   225: athrow
    //   226: new i/a/a/c/a
    //   229: dup
    //   230: ldc 'input file is null or empty, cannot calculate CRC for the file'
    //   232: invokespecial <init> : (Ljava/lang/String;)V
    //   235: astore_0
    //   236: goto -> 241
    //   239: aload_0
    //   240: athrow
    //   241: goto -> 239
    //   244: astore_0
    //   245: goto -> 115
    //   248: astore_0
    //   249: goto -> 137
    //   252: astore_0
    //   253: goto -> 214
    //   256: astore_0
    //   257: aload #7
    //   259: astore #5
    //   261: goto -> 192
    // Exception table:
    //   from	to	target	type
    //   20	25	256	java/io/IOException
    //   20	25	178	java/lang/Exception
    //   20	25	174	finally
    //   29	45	256	java/io/IOException
    //   29	45	178	java/lang/Exception
    //   29	45	174	finally
    //   45	61	165	java/io/IOException
    //   45	61	156	java/lang/Exception
    //   45	61	147	finally
    //   61	68	165	java/io/IOException
    //   61	68	156	java/lang/Exception
    //   61	68	147	finally
    //   73	82	165	java/io/IOException
    //   73	82	156	java/lang/Exception
    //   73	82	147	finally
    //   86	109	165	java/io/IOException
    //   86	109	156	java/lang/Exception
    //   86	109	147	finally
    //   109	113	244	java/io/IOException
    //   125	131	165	java/io/IOException
    //   125	131	156	java/lang/Exception
    //   125	131	147	finally
    //   131	135	248	java/io/IOException
    //   183	192	174	finally
    //   192	201	174	finally
    //   206	211	252	java/io/IOException
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */