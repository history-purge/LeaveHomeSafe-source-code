package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.e;
import com.facebook.imagepipeline.memory.d;
import e.e.e.d.i;
import e.e.e.h.a;
import e.e.e.j.a;
import e.e.l.k.d;
import java.io.InputStream;
import java.nio.ByteBuffer;

@TargetApi(21)
public abstract class b implements f {
  private static final Class<?> d = b.class;
  
  private static final byte[] e = new byte[] { -1, -39 };
  
  private final d a;
  
  private final PreverificationHelper b;
  
  final e<ByteBuffer> c;
  
  public b(d paramd, int paramInt, e<ByteBuffer> parame) {
    PreverificationHelper preverificationHelper;
    if (Build.VERSION.SDK_INT >= 26) {
      preverificationHelper = new PreverificationHelper();
    } else {
      preverificationHelper = null;
    } 
    this.b = preverificationHelper;
    this.a = paramd;
    this.c = parame;
    int i;
    for (i = 0; i < paramInt; i++)
      this.c.a(ByteBuffer.allocate(16384)); 
  }
  
  private static BitmapFactory.Options a(d paramd, Bitmap.Config paramConfig) {
    BitmapFactory.Options options = new BitmapFactory.Options();
    options.inSampleSize = paramd.x();
    options.inJustDecodeBounds = true;
    BitmapFactory.decodeStream(paramd.u(), null, options);
    if (options.outWidth != -1 && options.outHeight != -1) {
      options.inJustDecodeBounds = false;
      options.inDither = true;
      options.inPreferredConfig = paramConfig;
      options.inMutable = true;
      return options;
    } 
    throw new IllegalArgumentException();
  }
  
  private a<Bitmap> a(InputStream paramInputStream, BitmapFactory.Options paramOptions, Rect paramRect, ColorSpace paramColorSpace) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_2
    //   6: getfield outWidth : I
    //   9: istore #5
    //   11: aload_2
    //   12: getfield outHeight : I
    //   15: istore #6
    //   17: aload_3
    //   18: ifnull -> 43
    //   21: aload_3
    //   22: invokevirtual width : ()I
    //   25: aload_2
    //   26: getfield inSampleSize : I
    //   29: idiv
    //   30: istore #5
    //   32: aload_3
    //   33: invokevirtual height : ()I
    //   36: aload_2
    //   37: getfield inSampleSize : I
    //   40: idiv
    //   41: istore #6
    //   43: getstatic android/os/Build$VERSION.SDK_INT : I
    //   46: bipush #26
    //   48: if_icmplt -> 80
    //   51: aload_0
    //   52: getfield b : Lcom/facebook/imagepipeline/platform/PreverificationHelper;
    //   55: astore #8
    //   57: aload #8
    //   59: ifnull -> 80
    //   62: aload #8
    //   64: aload_2
    //   65: getfield inPreferredConfig : Landroid/graphics/Bitmap$Config;
    //   68: invokevirtual shouldUseHardwareBitmapConfig : (Landroid/graphics/Bitmap$Config;)Z
    //   71: ifeq -> 80
    //   74: iconst_1
    //   75: istore #7
    //   77: goto -> 83
    //   80: iconst_0
    //   81: istore #7
    //   83: aload_3
    //   84: ifnonnull -> 103
    //   87: iload #7
    //   89: ifeq -> 103
    //   92: aload_2
    //   93: iconst_0
    //   94: putfield inMutable : Z
    //   97: aconst_null
    //   98: astore #9
    //   100: goto -> 151
    //   103: aload_3
    //   104: ifnull -> 119
    //   107: iload #7
    //   109: ifeq -> 119
    //   112: aload_2
    //   113: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   116: putfield inPreferredConfig : Landroid/graphics/Bitmap$Config;
    //   119: aload_0
    //   120: iload #5
    //   122: iload #6
    //   124: aload_2
    //   125: invokevirtual a : (IILandroid/graphics/BitmapFactory$Options;)I
    //   128: istore #7
    //   130: aload_0
    //   131: getfield a : Lcom/facebook/imagepipeline/memory/d;
    //   134: iload #7
    //   136: invokeinterface get : (I)Ljava/lang/Object;
    //   141: checkcast android/graphics/Bitmap
    //   144: astore #9
    //   146: aload #9
    //   148: ifnull -> 505
    //   151: aload_2
    //   152: aload #9
    //   154: putfield inBitmap : Landroid/graphics/Bitmap;
    //   157: getstatic android/os/Build$VERSION.SDK_INT : I
    //   160: bipush #26
    //   162: if_icmplt -> 188
    //   165: aload #4
    //   167: astore #8
    //   169: aload #4
    //   171: ifnonnull -> 182
    //   174: getstatic android/graphics/ColorSpace$Named.SRGB : Landroid/graphics/ColorSpace$Named;
    //   177: invokestatic get : (Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;
    //   180: astore #8
    //   182: aload_2
    //   183: aload #8
    //   185: putfield inPreferredColorSpace : Landroid/graphics/ColorSpace;
    //   188: aload_0
    //   189: getfield c : Landroidx/core/util/e;
    //   192: invokevirtual a : ()Ljava/lang/Object;
    //   195: checkcast java/nio/ByteBuffer
    //   198: astore #4
    //   200: aload #4
    //   202: astore #10
    //   204: aload #4
    //   206: ifnonnull -> 217
    //   209: sipush #16384
    //   212: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   215: astore #10
    //   217: aload_2
    //   218: aload #10
    //   220: invokevirtual array : ()[B
    //   223: putfield inTempStorage : [B
    //   226: aload_3
    //   227: ifnull -> 533
    //   230: aload #9
    //   232: ifnull -> 533
    //   235: aload #9
    //   237: iload #5
    //   239: iload #6
    //   241: aload_2
    //   242: getfield inPreferredConfig : Landroid/graphics/Bitmap$Config;
    //   245: invokevirtual reconfigure : (IILandroid/graphics/Bitmap$Config;)V
    //   248: aload_1
    //   249: iconst_1
    //   250: invokestatic newInstance : (Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
    //   253: astore #8
    //   255: aload #8
    //   257: astore #4
    //   259: aload #8
    //   261: aload_3
    //   262: aload_2
    //   263: invokevirtual decodeRegion : (Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   266: astore #11
    //   268: aload #11
    //   270: astore_3
    //   271: aload #8
    //   273: ifnull -> 342
    //   276: aload #8
    //   278: invokevirtual recycle : ()V
    //   281: aload #11
    //   283: astore_3
    //   284: goto -> 342
    //   287: astore_2
    //   288: aconst_null
    //   289: astore #4
    //   291: goto -> 330
    //   294: aconst_null
    //   295: astore #8
    //   297: aload #8
    //   299: astore #4
    //   301: getstatic com/facebook/imagepipeline/platform/b.d : Ljava/lang/Class;
    //   304: ldc 'Could not decode region %s, decoding full bitmap instead.'
    //   306: iconst_1
    //   307: anewarray java/lang/Object
    //   310: dup
    //   311: iconst_0
    //   312: aload_3
    //   313: aastore
    //   314: invokestatic a : (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    //   317: aload #8
    //   319: ifnull -> 533
    //   322: aload #8
    //   324: invokevirtual recycle : ()V
    //   327: goto -> 533
    //   330: aload #4
    //   332: ifnull -> 340
    //   335: aload #4
    //   337: invokevirtual recycle : ()V
    //   340: aload_2
    //   341: athrow
    //   342: aload_3
    //   343: astore #4
    //   345: aload_3
    //   346: ifnonnull -> 357
    //   349: aload_1
    //   350: aconst_null
    //   351: aload_2
    //   352: invokestatic decodeStream : (Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   355: astore #4
    //   357: aload_0
    //   358: getfield c : Landroidx/core/util/e;
    //   361: aload #10
    //   363: invokevirtual a : (Ljava/lang/Object;)Z
    //   366: pop
    //   367: aload #9
    //   369: ifnull -> 406
    //   372: aload #9
    //   374: aload #4
    //   376: if_acmpne -> 382
    //   379: goto -> 406
    //   382: aload_0
    //   383: getfield a : Lcom/facebook/imagepipeline/memory/d;
    //   386: aload #9
    //   388: invokeinterface a : (Ljava/lang/Object;)V
    //   393: aload #4
    //   395: invokevirtual recycle : ()V
    //   398: new java/lang/IllegalStateException
    //   401: dup
    //   402: invokespecial <init> : ()V
    //   405: athrow
    //   406: aload #4
    //   408: aload_0
    //   409: getfield a : Lcom/facebook/imagepipeline/memory/d;
    //   412: invokestatic a : (Ljava/lang/Object;Le/e/e/h/c;)Le/e/e/h/a;
    //   415: areturn
    //   416: astore_1
    //   417: goto -> 493
    //   420: astore_1
    //   421: aload #9
    //   423: ifnull -> 437
    //   426: aload_0
    //   427: getfield a : Lcom/facebook/imagepipeline/memory/d;
    //   430: aload #9
    //   432: invokeinterface a : (Ljava/lang/Object;)V
    //   437: aload_1
    //   438: athrow
    //   439: astore_2
    //   440: aload #9
    //   442: ifnull -> 456
    //   445: aload_0
    //   446: getfield a : Lcom/facebook/imagepipeline/memory/d;
    //   449: aload #9
    //   451: invokeinterface a : (Ljava/lang/Object;)V
    //   456: aload_1
    //   457: invokevirtual reset : ()V
    //   460: aload_1
    //   461: invokestatic decodeStream : (Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   464: astore_1
    //   465: aload_1
    //   466: ifnull -> 489
    //   469: aload_1
    //   470: invokestatic a : ()Le/e/l/c/h;
    //   473: invokestatic a : (Ljava/lang/Object;Le/e/e/h/c;)Le/e/e/h/a;
    //   476: astore_1
    //   477: aload_0
    //   478: getfield c : Landroidx/core/util/e;
    //   481: aload #10
    //   483: invokevirtual a : (Ljava/lang/Object;)Z
    //   486: pop
    //   487: aload_1
    //   488: areturn
    //   489: aload_2
    //   490: athrow
    //   491: aload_2
    //   492: athrow
    //   493: aload_0
    //   494: getfield c : Landroidx/core/util/e;
    //   497: aload #10
    //   499: invokevirtual a : (Ljava/lang/Object;)Z
    //   502: pop
    //   503: aload_1
    //   504: athrow
    //   505: new java/lang/NullPointerException
    //   508: dup
    //   509: ldc 'BitmapPool.get returned null'
    //   511: invokespecial <init> : (Ljava/lang/String;)V
    //   514: athrow
    //   515: astore #4
    //   517: goto -> 294
    //   520: astore #4
    //   522: goto -> 297
    //   525: astore_1
    //   526: goto -> 491
    //   529: astore_2
    //   530: goto -> 330
    //   533: aconst_null
    //   534: astore_3
    //   535: goto -> 342
    // Exception table:
    //   from	to	target	type
    //   217	226	439	java/lang/IllegalArgumentException
    //   217	226	420	java/lang/RuntimeException
    //   217	226	416	finally
    //   235	255	515	java/io/IOException
    //   235	255	287	finally
    //   259	268	520	java/io/IOException
    //   259	268	529	finally
    //   276	281	439	java/lang/IllegalArgumentException
    //   276	281	420	java/lang/RuntimeException
    //   276	281	416	finally
    //   301	317	529	finally
    //   322	327	439	java/lang/IllegalArgumentException
    //   322	327	420	java/lang/RuntimeException
    //   322	327	416	finally
    //   335	340	439	java/lang/IllegalArgumentException
    //   335	340	420	java/lang/RuntimeException
    //   335	340	416	finally
    //   340	342	439	java/lang/IllegalArgumentException
    //   340	342	420	java/lang/RuntimeException
    //   340	342	416	finally
    //   349	357	439	java/lang/IllegalArgumentException
    //   349	357	420	java/lang/RuntimeException
    //   349	357	416	finally
    //   426	437	416	finally
    //   437	439	416	finally
    //   445	456	416	finally
    //   456	465	525	java/io/IOException
    //   456	465	416	finally
    //   469	477	525	java/io/IOException
    //   469	477	416	finally
    //   489	491	525	java/io/IOException
    //   489	491	416	finally
    //   491	493	416	finally
  }
  
  public abstract int a(int paramInt1, int paramInt2, BitmapFactory.Options paramOptions);
  
  public a<Bitmap> a(d paramd, Bitmap.Config paramConfig, Rect paramRect, int paramInt) {
    return a(paramd, paramConfig, paramRect, paramInt, null);
  }
  
  public a<Bitmap> a(d paramd, Bitmap.Config paramConfig, Rect paramRect, int paramInt, ColorSpace paramColorSpace) {
    a a;
    e.e.e.j.b b1;
    boolean bool;
    boolean bool1 = paramd.c(paramInt);
    BitmapFactory.Options options = a(paramd, paramConfig);
    InputStream inputStream2 = paramd.u();
    i.a(inputStream2);
    InputStream inputStream1 = inputStream2;
    if (paramd.y() > paramInt)
      a = new a(inputStream2, paramInt); 
    if (!bool1)
      b1 = new e.e.e.j.b((InputStream)a, e); 
    if (options.inPreferredConfig != Bitmap.Config.ARGB_8888) {
      bool = true;
    } else {
      bool = false;
    } 
    try {
      return a((InputStream)b1, options, paramRect, paramColorSpace);
    } catch (RuntimeException runtimeException) {
      if (bool)
        return a(paramd, Bitmap.Config.ARGB_8888, paramRect, paramInt, paramColorSpace); 
      throw runtimeException;
    } 
  }
  
  public a<Bitmap> a(d paramd, Bitmap.Config paramConfig, Rect paramRect, ColorSpace paramColorSpace) {
    boolean bool;
    BitmapFactory.Options options = a(paramd, paramConfig);
    if (options.inPreferredConfig != Bitmap.Config.ARGB_8888) {
      bool = true;
    } else {
      bool = false;
    } 
    try {
      return a(paramd.u(), options, paramRect, paramColorSpace);
    } catch (RuntimeException runtimeException) {
      if (bool)
        return a(paramd, Bitmap.Config.ARGB_8888, paramRect, paramColorSpace); 
      throw runtimeException;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/platform/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */