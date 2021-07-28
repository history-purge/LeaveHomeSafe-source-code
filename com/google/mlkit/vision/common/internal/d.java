package com.google.mlkit.vision.common.internal;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.q;
import e.f.b.b.a.a;
import java.nio.ByteBuffer;

public class d {
  private static final i a = new i("MLKitImageUtils", "");
  
  private static d b = new d();
  
  @RecentlyNonNull
  public static d a() {
    return b;
  }
  
  public int a(@RecentlyNonNull a parama) {
    return parama.c();
  }
  
  @RecentlyNonNull
  public final Bitmap a(@RecentlyNonNull ContentResolver paramContentResolver, @RecentlyNonNull Uri paramUri) {
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: invokestatic getBitmap : (Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;
    //   5: astore #8
    //   7: ldc 'content'
    //   9: aload_2
    //   10: invokevirtual getScheme : ()Ljava/lang/String;
    //   13: invokevirtual equals : (Ljava/lang/Object;)Z
    //   16: istore #6
    //   18: iconst_0
    //   19: istore_3
    //   20: iload #6
    //   22: ifne -> 44
    //   25: ldc 'file'
    //   27: aload_2
    //   28: invokevirtual getScheme : ()Ljava/lang/String;
    //   31: invokevirtual equals : (Ljava/lang/Object;)Z
    //   34: istore #6
    //   36: iload #6
    //   38: ifne -> 44
    //   41: goto -> 194
    //   44: aload_1
    //   45: aload_2
    //   46: invokevirtual openInputStream : (Landroid/net/Uri;)Ljava/io/InputStream;
    //   49: astore #9
    //   51: aload #9
    //   53: ifnull -> 88
    //   56: new b/k/a/a
    //   59: dup
    //   60: aload #9
    //   62: invokespecial <init> : (Ljava/io/InputStream;)V
    //   65: astore_1
    //   66: goto -> 90
    //   69: astore_1
    //   70: aload #9
    //   72: invokevirtual close : ()V
    //   75: goto -> 86
    //   78: astore #7
    //   80: aload_1
    //   81: aload #7
    //   83: invokestatic a : (Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   86: aload_1
    //   87: athrow
    //   88: aconst_null
    //   89: astore_1
    //   90: aload_1
    //   91: astore #7
    //   93: aload #9
    //   95: ifnull -> 440
    //   98: aload #9
    //   100: invokevirtual close : ()V
    //   103: aload_1
    //   104: astore #7
    //   106: goto -> 440
    //   109: astore #7
    //   111: goto -> 118
    //   114: astore #7
    //   116: aconst_null
    //   117: astore_1
    //   118: getstatic com/google/mlkit/vision/common/internal/d.a : Lcom/google/android/gms/common/internal/i;
    //   121: astore #9
    //   123: aload_2
    //   124: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   127: astore #10
    //   129: new java/lang/StringBuilder
    //   132: dup
    //   133: aload #10
    //   135: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   138: invokevirtual length : ()I
    //   141: bipush #48
    //   143: iadd
    //   144: invokespecial <init> : (I)V
    //   147: astore #11
    //   149: aload #11
    //   151: ldc 'failed to open file to read rotation meta data: '
    //   153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: aload #11
    //   159: aload #10
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload #9
    //   167: ldc 'MLKitImageUtils'
    //   169: aload #11
    //   171: invokevirtual toString : ()Ljava/lang/String;
    //   174: aload #7
    //   176: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   179: aload_1
    //   180: astore #7
    //   182: goto -> 440
    //   185: aload #7
    //   187: ldc 'Orientation'
    //   189: iconst_1
    //   190: invokevirtual a : (Ljava/lang/String;I)I
    //   193: istore_3
    //   194: new android/graphics/Matrix
    //   197: dup
    //   198: invokespecial <init> : ()V
    //   201: astore_1
    //   202: aload #8
    //   204: invokevirtual getWidth : ()I
    //   207: istore #4
    //   209: aload #8
    //   211: invokevirtual getHeight : ()I
    //   214: istore #5
    //   216: iload_3
    //   217: tableswitch default -> 448, 2 -> 329, 3 -> 319, 4 -> 308, 5 -> 298, 6 -> 288, 7 -> 270, 8 -> 260
    //   260: aload_1
    //   261: ldc -90.0
    //   263: invokevirtual postRotate : (F)Z
    //   266: pop
    //   267: goto -> 453
    //   270: aload_1
    //   271: ldc -90.0
    //   273: invokevirtual postRotate : (F)Z
    //   276: pop
    //   277: aload_1
    //   278: ldc -1.0
    //   280: fconst_1
    //   281: invokevirtual postScale : (FF)Z
    //   284: pop
    //   285: goto -> 453
    //   288: aload_1
    //   289: ldc 90.0
    //   291: invokevirtual postRotate : (F)Z
    //   294: pop
    //   295: goto -> 453
    //   298: aload_1
    //   299: ldc 90.0
    //   301: invokevirtual postRotate : (F)Z
    //   304: pop
    //   305: goto -> 277
    //   308: aload_1
    //   309: fconst_1
    //   310: ldc -1.0
    //   312: invokevirtual postScale : (FF)Z
    //   315: pop
    //   316: goto -> 453
    //   319: aload_1
    //   320: ldc 180.0
    //   322: invokevirtual postRotate : (F)Z
    //   325: pop
    //   326: goto -> 453
    //   329: new android/graphics/Matrix
    //   332: dup
    //   333: invokespecial <init> : ()V
    //   336: astore_1
    //   337: goto -> 277
    //   340: aload_1
    //   341: ifnull -> 371
    //   344: aload #8
    //   346: iconst_0
    //   347: iconst_0
    //   348: iload #4
    //   350: iload #5
    //   352: aload_1
    //   353: iconst_1
    //   354: invokestatic createBitmap : (Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    //   357: astore_1
    //   358: aload #8
    //   360: aload_1
    //   361: if_acmpeq -> 371
    //   364: aload #8
    //   366: invokevirtual recycle : ()V
    //   369: aload_1
    //   370: areturn
    //   371: aload #8
    //   373: areturn
    //   374: astore_1
    //   375: getstatic com/google/mlkit/vision/common/internal/d.a : Lcom/google/android/gms/common/internal/i;
    //   378: astore #7
    //   380: aload_2
    //   381: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   384: astore_2
    //   385: new java/lang/StringBuilder
    //   388: dup
    //   389: aload_2
    //   390: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   393: invokevirtual length : ()I
    //   396: bipush #21
    //   398: iadd
    //   399: invokespecial <init> : (I)V
    //   402: astore #8
    //   404: aload #8
    //   406: ldc 'Could not open file: '
    //   408: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   411: pop
    //   412: aload #8
    //   414: aload_2
    //   415: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: pop
    //   419: aload #7
    //   421: ldc 'MLKitImageUtils'
    //   423: aload #8
    //   425: invokevirtual toString : ()Ljava/lang/String;
    //   428: aload_1
    //   429: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   432: goto -> 437
    //   435: aload_1
    //   436: athrow
    //   437: goto -> 435
    //   440: aload #7
    //   442: ifnonnull -> 185
    //   445: goto -> 194
    //   448: aconst_null
    //   449: astore_1
    //   450: goto -> 340
    //   453: goto -> 340
    // Exception table:
    //   from	to	target	type
    //   0	18	374	java/io/FileNotFoundException
    //   25	36	374	java/io/FileNotFoundException
    //   44	51	114	java/io/IOException
    //   56	66	69	finally
    //   70	75	78	finally
    //   80	86	114	java/io/IOException
    //   86	88	114	java/io/IOException
    //   98	103	109	java/io/IOException
    //   118	179	374	java/io/FileNotFoundException
    //   185	194	374	java/io/FileNotFoundException
    //   194	216	374	java/io/FileNotFoundException
    //   260	267	374	java/io/FileNotFoundException
    //   270	277	374	java/io/FileNotFoundException
    //   277	285	374	java/io/FileNotFoundException
    //   288	295	374	java/io/FileNotFoundException
    //   298	305	374	java/io/FileNotFoundException
    //   308	316	374	java/io/FileNotFoundException
    //   319	326	374	java/io/FileNotFoundException
    //   329	337	374	java/io/FileNotFoundException
    //   344	358	374	java/io/FileNotFoundException
    //   364	369	374	java/io/FileNotFoundException
  }
  
  @TargetApi(19)
  public int b(@RecentlyNonNull a parama) {
    Bitmap bitmap;
    ByteBuffer byteBuffer;
    if (parama.c() == -1) {
      int j = Build.VERSION.SDK_INT;
      bitmap = parama.a();
      q.a(bitmap);
      bitmap = bitmap;
      return (j >= 19) ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
    } 
    if (bitmap.c() == 17 || bitmap.c() == 842094169) {
      byteBuffer = bitmap.b();
      q.a(byteBuffer);
      return byteBuffer.limit();
    } 
    if (byteBuffer.c() != 35)
      return 0; 
    Image.Plane[] arrayOfPlane = byteBuffer.e();
    q.a(arrayOfPlane);
    return arrayOfPlane[0].getBuffer().limit() * 3 / 2;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/mlkit/vision/common/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */