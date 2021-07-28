package org.reactnative.camera.g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import org.reactnative.camera.h.c;

public class h extends AsyncTask<Void, Void, WritableMap> {
  private Promise a;
  
  private Bitmap b;
  
  private byte[] c;
  
  private ReadableMap d;
  
  private File e;
  
  private int f;
  
  private g g;
  
  public h(byte[] paramArrayOfbyte, Promise paramPromise, ReadableMap paramReadableMap, File paramFile, int paramInt, g paramg) {
    this.a = paramPromise;
    this.d = paramReadableMap;
    this.c = paramArrayOfbyte;
    this.e = paramFile;
    this.f = paramInt;
    this.g = paramg;
  }
  
  private int a(int paramInt) {
    return (paramInt != 3) ? ((paramInt != 6) ? ((paramInt != 8) ? 0 : 270) : 90) : 180;
  }
  
  private Bitmap a(Bitmap paramBitmap) {
    Matrix matrix = new Matrix();
    matrix.preScale(-1.0F, 1.0F);
    return Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), matrix, true);
  }
  
  private Bitmap a(Bitmap paramBitmap, int paramInt) {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f = paramInt / i;
    return Bitmap.createScaledBitmap(paramBitmap, paramInt, (int)(j * f), true);
  }
  
  private String a() {
    return this.d.hasKey("path") ? this.d.getString("path") : c.a(this.e, ".jpg");
  }
  
  private String a(ByteArrayOutputStream paramByteArrayOutputStream) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #6
    //   3: aconst_null
    //   4: astore_3
    //   5: aconst_null
    //   6: astore #4
    //   8: aload_0
    //   9: invokespecial a : ()Ljava/lang/String;
    //   12: astore_2
    //   13: new java/io/FileOutputStream
    //   16: dup
    //   17: aload_2
    //   18: invokespecial <init> : (Ljava/lang/String;)V
    //   21: astore #5
    //   23: aload #5
    //   25: astore_3
    //   26: aload_1
    //   27: aload #5
    //   29: invokevirtual writeTo : (Ljava/io/OutputStream;)V
    //   32: aload_2
    //   33: astore_3
    //   34: aload #5
    //   36: invokevirtual close : ()V
    //   39: aload #6
    //   41: astore #4
    //   43: aload_2
    //   44: astore_3
    //   45: goto -> 122
    //   48: astore_1
    //   49: aload_1
    //   50: invokevirtual printStackTrace : ()V
    //   53: goto -> 122
    //   56: astore_3
    //   57: aload_2
    //   58: astore_1
    //   59: aload #5
    //   61: astore_2
    //   62: goto -> 86
    //   65: astore_3
    //   66: aconst_null
    //   67: astore #4
    //   69: aload_2
    //   70: astore_1
    //   71: aload #4
    //   73: astore_2
    //   74: goto -> 86
    //   77: astore_1
    //   78: goto -> 133
    //   81: astore_3
    //   82: aconst_null
    //   83: astore_1
    //   84: aload_1
    //   85: astore_2
    //   86: aload_3
    //   87: astore #5
    //   89: aload_2
    //   90: astore_3
    //   91: aload #5
    //   93: invokevirtual printStackTrace : ()V
    //   96: aload #5
    //   98: astore #4
    //   100: aload_1
    //   101: astore_3
    //   102: aload_2
    //   103: ifnull -> 122
    //   106: aload #5
    //   108: astore #4
    //   110: aload_1
    //   111: astore_3
    //   112: aload_2
    //   113: invokevirtual close : ()V
    //   116: aload_1
    //   117: astore_3
    //   118: aload #5
    //   120: astore #4
    //   122: aload #4
    //   124: ifnonnull -> 129
    //   127: aload_3
    //   128: areturn
    //   129: aload #4
    //   131: athrow
    //   132: astore_1
    //   133: aload_3
    //   134: ifnull -> 149
    //   137: aload_3
    //   138: invokevirtual close : ()V
    //   141: goto -> 149
    //   144: astore_2
    //   145: aload_2
    //   146: invokevirtual printStackTrace : ()V
    //   149: aload_1
    //   150: athrow
    // Exception table:
    //   from	to	target	type
    //   8	13	81	java/io/IOException
    //   8	13	77	finally
    //   13	23	65	java/io/IOException
    //   13	23	77	finally
    //   26	32	56	java/io/IOException
    //   26	32	132	finally
    //   34	39	48	java/io/IOException
    //   91	96	132	finally
    //   112	116	48	java/io/IOException
    //   137	141	144	java/io/IOException
  }
  
  private int b() {
    return (int)(this.d.getDouble("quality") * 100.0D);
  }
  
  private Bitmap b(Bitmap paramBitmap, int paramInt) {
    Matrix matrix = new Matrix();
    matrix.postRotate(paramInt);
    return Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), matrix, true);
  }
  
  private void c() {
    if (this.b == null) {
      byte[] arrayOfByte = this.c;
      this.b = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
    } 
    if (this.b != null)
      return; 
    throw new IOException("Failed to decode Image Bitmap");
  }
  
  protected WritableMap a(Void... paramVarArgs) {
    // Byte code:
    //   0: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   3: astore #9
    //   5: aload #9
    //   7: ldc 'deviceOrientation'
    //   9: aload_0
    //   10: getfield f : I
    //   13: invokeinterface putInt : (Ljava/lang/String;I)V
    //   18: aload_0
    //   19: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   22: ldc 'orientation'
    //   24: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   29: ifeq -> 47
    //   32: aload_0
    //   33: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   36: ldc 'orientation'
    //   38: invokeinterface getInt : (Ljava/lang/String;)I
    //   43: istore_2
    //   44: goto -> 52
    //   47: aload_0
    //   48: getfield f : I
    //   51: istore_2
    //   52: aload #9
    //   54: ldc 'pictureOrientation'
    //   56: iload_2
    //   57: invokeinterface putInt : (Ljava/lang/String;I)V
    //   62: new java/io/ByteArrayInputStream
    //   65: dup
    //   66: aload_0
    //   67: getfield c : [B
    //   70: invokespecial <init> : ([B)V
    //   73: astore_1
    //   74: aload_0
    //   75: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   78: ldc 'fixOrientation'
    //   80: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   85: istore #5
    //   87: iload #5
    //   89: ifeq -> 1183
    //   92: aload_0
    //   93: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   96: ldc 'fixOrientation'
    //   98: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   103: ifeq -> 1183
    //   106: new b/k/a/a
    //   109: dup
    //   110: aload_1
    //   111: invokespecial <init> : (Ljava/io/InputStream;)V
    //   114: astore #7
    //   116: aload #7
    //   118: ldc 'Orientation'
    //   120: iconst_0
    //   121: invokevirtual a : (Ljava/lang/String;I)I
    //   124: istore_2
    //   125: aload #7
    //   127: astore #6
    //   129: iload_2
    //   130: ifeq -> 1186
    //   133: aload_0
    //   134: invokespecial c : ()V
    //   137: aload_0
    //   138: aload_0
    //   139: aload_0
    //   140: getfield b : Landroid/graphics/Bitmap;
    //   143: aload_0
    //   144: iload_2
    //   145: invokespecial a : (I)I
    //   148: invokespecial b : (Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    //   151: putfield b : Landroid/graphics/Bitmap;
    //   154: iconst_1
    //   155: istore_2
    //   156: aload #7
    //   158: astore #6
    //   160: goto -> 163
    //   163: aload_0
    //   164: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   167: ldc 'width'
    //   169: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   174: ifeq -> 204
    //   177: aload_0
    //   178: invokespecial c : ()V
    //   181: aload_0
    //   182: aload_0
    //   183: aload_0
    //   184: getfield b : Landroid/graphics/Bitmap;
    //   187: aload_0
    //   188: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   191: ldc 'width'
    //   193: invokeinterface getInt : (Ljava/lang/String;)I
    //   198: invokespecial a : (Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    //   201: putfield b : Landroid/graphics/Bitmap;
    //   204: aload_0
    //   205: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   208: ldc 'mirrorImage'
    //   210: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   215: ifeq -> 248
    //   218: aload_0
    //   219: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   222: ldc 'mirrorImage'
    //   224: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   229: ifeq -> 248
    //   232: aload_0
    //   233: invokespecial c : ()V
    //   236: aload_0
    //   237: aload_0
    //   238: aload_0
    //   239: getfield b : Landroid/graphics/Bitmap;
    //   242: invokespecial a : (Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   245: putfield b : Landroid/graphics/Bitmap;
    //   248: aload_0
    //   249: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   252: ldc 'exif'
    //   254: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   259: ifeq -> 1191
    //   262: aload_0
    //   263: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   266: ldc 'exif'
    //   268: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   273: ifeq -> 1191
    //   276: iconst_1
    //   277: istore_3
    //   278: goto -> 281
    //   281: aload_0
    //   282: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   285: ldc 'writeExif'
    //   287: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   292: ifeq -> 365
    //   295: getstatic org/reactnative/camera/g/h$a.a : [I
    //   298: aload_0
    //   299: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   302: ldc 'writeExif'
    //   304: invokeinterface getType : (Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;
    //   309: invokevirtual ordinal : ()I
    //   312: iaload
    //   313: istore #4
    //   315: iload #4
    //   317: iconst_1
    //   318: if_icmpeq -> 349
    //   321: iload #4
    //   323: iconst_2
    //   324: if_icmpeq -> 330
    //   327: goto -> 365
    //   330: aload_0
    //   331: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   334: ldc 'writeExif'
    //   336: invokeinterface getMap : (Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;
    //   341: astore #7
    //   343: iconst_1
    //   344: istore #5
    //   346: goto -> 371
    //   349: aload_0
    //   350: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   353: ldc 'writeExif'
    //   355: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   360: istore #5
    //   362: goto -> 368
    //   365: iconst_1
    //   366: istore #5
    //   368: aconst_null
    //   369: astore #7
    //   371: iload_3
    //   372: ifne -> 389
    //   375: iload #5
    //   377: ifeq -> 383
    //   380: goto -> 389
    //   383: aconst_null
    //   384: astore #8
    //   386: goto -> 532
    //   389: aload_0
    //   390: getfield b : Landroid/graphics/Bitmap;
    //   393: ifnonnull -> 408
    //   396: aload #7
    //   398: ifnonnull -> 408
    //   401: iload_3
    //   402: ifeq -> 1196
    //   405: goto -> 408
    //   408: aload #6
    //   410: astore #8
    //   412: aload #6
    //   414: ifnonnull -> 427
    //   417: new b/k/a/a
    //   420: dup
    //   421: aload_1
    //   422: invokespecial <init> : (Ljava/io/InputStream;)V
    //   425: astore #8
    //   427: aload #8
    //   429: invokestatic b : (Lb/k/a/a;)Lcom/facebook/react/bridge/WritableMap;
    //   432: astore #8
    //   434: aload #8
    //   436: astore #6
    //   438: aload #7
    //   440: ifnull -> 456
    //   443: aload #8
    //   445: aload #7
    //   447: invokeinterface merge : (Lcom/facebook/react/bridge/ReadableMap;)V
    //   452: aload #8
    //   454: astore #6
    //   456: aload_0
    //   457: getfield b : Landroid/graphics/Bitmap;
    //   460: ifnull -> 509
    //   463: aload #6
    //   465: ldc 'width'
    //   467: aload_0
    //   468: getfield b : Landroid/graphics/Bitmap;
    //   471: invokevirtual getWidth : ()I
    //   474: invokeinterface putInt : (Ljava/lang/String;I)V
    //   479: aload #6
    //   481: ldc 'height'
    //   483: aload_0
    //   484: getfield b : Landroid/graphics/Bitmap;
    //   487: invokevirtual getHeight : ()I
    //   490: invokeinterface putInt : (Ljava/lang/String;I)V
    //   495: iload_2
    //   496: ifeq -> 509
    //   499: aload #6
    //   501: ldc 'Orientation'
    //   503: iconst_1
    //   504: invokeinterface putInt : (Ljava/lang/String;I)V
    //   509: aload #6
    //   511: astore #8
    //   513: iload_3
    //   514: ifeq -> 532
    //   517: aload #9
    //   519: ldc 'exif'
    //   521: aload #6
    //   523: invokeinterface putMap : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    //   528: aload #6
    //   530: astore #8
    //   532: aload_0
    //   533: getfield b : Landroid/graphics/Bitmap;
    //   536: astore #6
    //   538: aload #6
    //   540: ifnonnull -> 818
    //   543: new android/graphics/BitmapFactory$Options
    //   546: dup
    //   547: invokespecial <init> : ()V
    //   550: astore #6
    //   552: aload #6
    //   554: iconst_1
    //   555: putfield inJustDecodeBounds : Z
    //   558: aload_0
    //   559: getfield c : [B
    //   562: iconst_0
    //   563: aload_0
    //   564: getfield c : [B
    //   567: arraylength
    //   568: aload #6
    //   570: invokestatic decodeByteArray : ([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   573: pop
    //   574: aload #9
    //   576: ldc 'width'
    //   578: aload #6
    //   580: getfield outWidth : I
    //   583: invokeinterface putInt : (Ljava/lang/String;I)V
    //   588: aload #9
    //   590: ldc 'height'
    //   592: aload #6
    //   594: getfield outHeight : I
    //   597: invokeinterface putInt : (Ljava/lang/String;I)V
    //   602: aload_0
    //   603: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   606: ldc 'doNotSave'
    //   608: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   613: ifeq -> 630
    //   616: aload_0
    //   617: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   620: ldc 'doNotSave'
    //   622: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   627: ifne -> 763
    //   630: new java/io/File
    //   633: dup
    //   634: aload_0
    //   635: invokespecial a : ()Ljava/lang/String;
    //   638: invokespecial <init> : (Ljava/lang/String;)V
    //   641: astore #8
    //   643: aload #8
    //   645: invokevirtual createNewFile : ()Z
    //   648: pop
    //   649: new java/io/FileOutputStream
    //   652: dup
    //   653: aload #8
    //   655: invokespecial <init> : (Ljava/io/File;)V
    //   658: astore #6
    //   660: aload #6
    //   662: aload_0
    //   663: getfield c : [B
    //   666: invokevirtual write : ([B)V
    //   669: aload #6
    //   671: invokevirtual flush : ()V
    //   674: aload #6
    //   676: invokevirtual close : ()V
    //   679: iload #5
    //   681: ifeq -> 718
    //   684: aload #7
    //   686: ifnull -> 718
    //   689: new b/k/a/a
    //   692: dup
    //   693: aload #8
    //   695: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   698: invokespecial <init> : (Ljava/lang/String;)V
    //   701: astore #6
    //   703: aload #6
    //   705: aload #7
    //   707: invokestatic a : (Lb/k/a/a;Lcom/facebook/react/bridge/ReadableMap;)V
    //   710: aload #6
    //   712: invokevirtual d : ()V
    //   715: goto -> 745
    //   718: iload #5
    //   720: ifne -> 745
    //   723: new b/k/a/a
    //   726: dup
    //   727: aload #8
    //   729: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   732: invokespecial <init> : (Ljava/lang/String;)V
    //   735: astore #6
    //   737: aload #6
    //   739: invokestatic a : (Lb/k/a/a;)V
    //   742: goto -> 710
    //   745: aload #9
    //   747: ldc_w 'uri'
    //   750: aload #8
    //   752: invokestatic fromFile : (Ljava/io/File;)Landroid/net/Uri;
    //   755: invokevirtual toString : ()Ljava/lang/String;
    //   758: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   763: aload_0
    //   764: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   767: ldc_w 'base64'
    //   770: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   775: ifeq -> 1014
    //   778: aload_0
    //   779: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   782: ldc_w 'base64'
    //   785: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   790: ifeq -> 1014
    //   793: aload_0
    //   794: getfield c : [B
    //   797: iconst_2
    //   798: invokestatic encodeToString : ([BI)Ljava/lang/String;
    //   801: astore #6
    //   803: aload #9
    //   805: ldc_w 'base64'
    //   808: aload #6
    //   810: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   815: goto -> 1014
    //   818: aload #9
    //   820: ldc 'width'
    //   822: aload_0
    //   823: getfield b : Landroid/graphics/Bitmap;
    //   826: invokevirtual getWidth : ()I
    //   829: invokeinterface putInt : (Ljava/lang/String;I)V
    //   834: aload #9
    //   836: ldc 'height'
    //   838: aload_0
    //   839: getfield b : Landroid/graphics/Bitmap;
    //   842: invokevirtual getHeight : ()I
    //   845: invokeinterface putInt : (Ljava/lang/String;I)V
    //   850: new java/io/ByteArrayOutputStream
    //   853: dup
    //   854: invokespecial <init> : ()V
    //   857: astore #6
    //   859: aload_0
    //   860: getfield b : Landroid/graphics/Bitmap;
    //   863: getstatic android/graphics/Bitmap$CompressFormat.JPEG : Landroid/graphics/Bitmap$CompressFormat;
    //   866: aload_0
    //   867: invokespecial b : ()I
    //   870: aload #6
    //   872: invokevirtual compress : (Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   875: pop
    //   876: aload_0
    //   877: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   880: ldc 'doNotSave'
    //   882: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   887: ifeq -> 904
    //   890: aload_0
    //   891: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   894: ldc 'doNotSave'
    //   896: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   901: ifne -> 970
    //   904: aload_0
    //   905: aload #6
    //   907: invokespecial a : (Ljava/io/ByteArrayOutputStream;)Ljava/lang/String;
    //   910: astore #7
    //   912: iload #5
    //   914: ifeq -> 945
    //   917: aload #8
    //   919: ifnull -> 945
    //   922: new b/k/a/a
    //   925: dup
    //   926: aload #7
    //   928: invokespecial <init> : (Ljava/lang/String;)V
    //   931: astore #10
    //   933: aload #10
    //   935: aload #8
    //   937: invokestatic a : (Lb/k/a/a;Lcom/facebook/react/bridge/ReadableMap;)V
    //   940: aload #10
    //   942: invokevirtual d : ()V
    //   945: aload #9
    //   947: ldc_w 'uri'
    //   950: new java/io/File
    //   953: dup
    //   954: aload #7
    //   956: invokespecial <init> : (Ljava/lang/String;)V
    //   959: invokestatic fromFile : (Ljava/io/File;)Landroid/net/Uri;
    //   962: invokevirtual toString : ()Ljava/lang/String;
    //   965: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   970: aload_0
    //   971: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   974: ldc_w 'base64'
    //   977: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   982: ifeq -> 1014
    //   985: aload_0
    //   986: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   989: ldc_w 'base64'
    //   992: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   997: ifeq -> 1014
    //   1000: aload #6
    //   1002: invokevirtual toByteArray : ()[B
    //   1005: iconst_2
    //   1006: invokestatic encodeToString : ([BI)Ljava/lang/String;
    //   1009: astore #6
    //   1011: goto -> 803
    //   1014: aload_1
    //   1015: invokevirtual close : ()V
    //   1018: aload #9
    //   1020: areturn
    //   1021: astore_1
    //   1022: aload_1
    //   1023: invokevirtual printStackTrace : ()V
    //   1026: aload #9
    //   1028: areturn
    //   1029: astore #6
    //   1031: goto -> 1158
    //   1034: astore #7
    //   1036: aload_1
    //   1037: astore #6
    //   1039: goto -> 1062
    //   1042: astore #7
    //   1044: aload_1
    //   1045: astore #6
    //   1047: goto -> 1108
    //   1050: astore #6
    //   1052: aconst_null
    //   1053: astore_1
    //   1054: goto -> 1158
    //   1057: astore #7
    //   1059: aconst_null
    //   1060: astore #6
    //   1062: aload #6
    //   1064: astore_1
    //   1065: aload_0
    //   1066: getfield a : Lcom/facebook/react/bridge/Promise;
    //   1069: ldc_w 'E_TAKING_PICTURE_FAILED'
    //   1072: ldc_w 'An unknown I/O exception has occurred.'
    //   1075: aload #7
    //   1077: invokeinterface reject : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1082: aload #6
    //   1084: astore_1
    //   1085: aload #7
    //   1087: invokevirtual printStackTrace : ()V
    //   1090: aload #6
    //   1092: ifnull -> 1154
    //   1095: aload #6
    //   1097: invokevirtual close : ()V
    //   1100: goto -> 1154
    //   1103: astore #7
    //   1105: aconst_null
    //   1106: astore #6
    //   1108: aload #6
    //   1110: astore_1
    //   1111: aload_0
    //   1112: getfield a : Lcom/facebook/react/bridge/Promise;
    //   1115: ldc_w 'E_TAKING_PICTURE_FAILED'
    //   1118: ldc_w 'Documents directory of the app could not be found.'
    //   1121: aload #7
    //   1123: invokeinterface reject : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1128: aload #6
    //   1130: astore_1
    //   1131: aload #7
    //   1133: invokevirtual printStackTrace : ()V
    //   1136: aload #6
    //   1138: ifnull -> 1154
    //   1141: aload #6
    //   1143: invokevirtual close : ()V
    //   1146: goto -> 1154
    //   1149: astore_1
    //   1150: aload_1
    //   1151: invokevirtual printStackTrace : ()V
    //   1154: aconst_null
    //   1155: areturn
    //   1156: astore #6
    //   1158: aload_1
    //   1159: ifnull -> 1174
    //   1162: aload_1
    //   1163: invokevirtual close : ()V
    //   1166: goto -> 1174
    //   1169: astore_1
    //   1170: aload_1
    //   1171: invokevirtual printStackTrace : ()V
    //   1174: goto -> 1180
    //   1177: aload #6
    //   1179: athrow
    //   1180: goto -> 1177
    //   1183: aconst_null
    //   1184: astore #6
    //   1186: iconst_0
    //   1187: istore_2
    //   1188: goto -> 163
    //   1191: iconst_0
    //   1192: istore_3
    //   1193: goto -> 281
    //   1196: aconst_null
    //   1197: astore #6
    //   1199: goto -> 456
    // Exception table:
    //   from	to	target	type
    //   62	74	1103	android/content/res/Resources$NotFoundException
    //   62	74	1057	java/io/IOException
    //   62	74	1050	finally
    //   74	87	1042	android/content/res/Resources$NotFoundException
    //   74	87	1034	java/io/IOException
    //   74	87	1029	finally
    //   92	125	1042	android/content/res/Resources$NotFoundException
    //   92	125	1034	java/io/IOException
    //   92	125	1029	finally
    //   133	154	1042	android/content/res/Resources$NotFoundException
    //   133	154	1034	java/io/IOException
    //   133	154	1029	finally
    //   163	204	1042	android/content/res/Resources$NotFoundException
    //   163	204	1034	java/io/IOException
    //   163	204	1029	finally
    //   204	248	1042	android/content/res/Resources$NotFoundException
    //   204	248	1034	java/io/IOException
    //   204	248	1029	finally
    //   248	276	1042	android/content/res/Resources$NotFoundException
    //   248	276	1034	java/io/IOException
    //   248	276	1029	finally
    //   281	315	1042	android/content/res/Resources$NotFoundException
    //   281	315	1034	java/io/IOException
    //   281	315	1029	finally
    //   330	343	1042	android/content/res/Resources$NotFoundException
    //   330	343	1034	java/io/IOException
    //   330	343	1029	finally
    //   349	362	1042	android/content/res/Resources$NotFoundException
    //   349	362	1034	java/io/IOException
    //   349	362	1029	finally
    //   389	396	1042	android/content/res/Resources$NotFoundException
    //   389	396	1034	java/io/IOException
    //   389	396	1029	finally
    //   417	427	1042	android/content/res/Resources$NotFoundException
    //   417	427	1034	java/io/IOException
    //   417	427	1029	finally
    //   427	434	1042	android/content/res/Resources$NotFoundException
    //   427	434	1034	java/io/IOException
    //   427	434	1029	finally
    //   443	452	1042	android/content/res/Resources$NotFoundException
    //   443	452	1034	java/io/IOException
    //   443	452	1029	finally
    //   456	495	1042	android/content/res/Resources$NotFoundException
    //   456	495	1034	java/io/IOException
    //   456	495	1029	finally
    //   499	509	1042	android/content/res/Resources$NotFoundException
    //   499	509	1034	java/io/IOException
    //   499	509	1029	finally
    //   517	528	1042	android/content/res/Resources$NotFoundException
    //   517	528	1034	java/io/IOException
    //   517	528	1029	finally
    //   532	538	1042	android/content/res/Resources$NotFoundException
    //   532	538	1034	java/io/IOException
    //   532	538	1029	finally
    //   543	630	1042	android/content/res/Resources$NotFoundException
    //   543	630	1034	java/io/IOException
    //   543	630	1029	finally
    //   630	679	1042	android/content/res/Resources$NotFoundException
    //   630	679	1034	java/io/IOException
    //   630	679	1029	finally
    //   689	710	1042	android/content/res/Resources$NotFoundException
    //   689	710	1034	java/io/IOException
    //   689	710	1029	finally
    //   710	715	1042	android/content/res/Resources$NotFoundException
    //   710	715	1034	java/io/IOException
    //   710	715	1029	finally
    //   723	742	1042	android/content/res/Resources$NotFoundException
    //   723	742	1034	java/io/IOException
    //   723	742	1029	finally
    //   745	763	1042	android/content/res/Resources$NotFoundException
    //   745	763	1034	java/io/IOException
    //   745	763	1029	finally
    //   763	803	1042	android/content/res/Resources$NotFoundException
    //   763	803	1034	java/io/IOException
    //   763	803	1029	finally
    //   803	815	1042	android/content/res/Resources$NotFoundException
    //   803	815	1034	java/io/IOException
    //   803	815	1029	finally
    //   818	904	1042	android/content/res/Resources$NotFoundException
    //   818	904	1034	java/io/IOException
    //   818	904	1029	finally
    //   904	912	1042	android/content/res/Resources$NotFoundException
    //   904	912	1034	java/io/IOException
    //   904	912	1029	finally
    //   922	945	1042	android/content/res/Resources$NotFoundException
    //   922	945	1034	java/io/IOException
    //   922	945	1029	finally
    //   945	970	1042	android/content/res/Resources$NotFoundException
    //   945	970	1034	java/io/IOException
    //   945	970	1029	finally
    //   970	1011	1042	android/content/res/Resources$NotFoundException
    //   970	1011	1034	java/io/IOException
    //   970	1011	1029	finally
    //   1014	1018	1021	java/io/IOException
    //   1065	1082	1156	finally
    //   1085	1090	1156	finally
    //   1095	1100	1149	java/io/IOException
    //   1111	1128	1156	finally
    //   1131	1136	1156	finally
    //   1141	1146	1149	java/io/IOException
    //   1162	1166	1169	java/io/IOException
  }
  
  protected void a(WritableMap paramWritableMap) {
    super.onPostExecute(paramWritableMap);
    if (paramWritableMap != null) {
      if (this.d.hasKey("fastMode") && this.d.getBoolean("fastMode")) {
        WritableMap writableMap = Arguments.createMap();
        writableMap.putInt("id", this.d.getInt("id"));
        writableMap.putMap("data", (ReadableMap)paramWritableMap);
        this.g.a(writableMap);
        return;
      } 
      this.a.resolve(paramWritableMap);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/g/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */