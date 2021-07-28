package b.g.f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import b.g.e.d.c;
import b.g.k.b;
import java.io.IOException;
import java.io.InputStream;

public class i extends j {
  public Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2) {
    try {
      Font font = (new Font.Builder(paramResources, paramInt1)).build();
      FontFamily fontFamily = (new FontFamily.Builder(font)).build();
      return (new Typeface.CustomFallbackBuilder(fontFamily)).setStyle(font.getStyle()).build();
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public Typeface a(Context paramContext, CancellationSignal paramCancellationSignal, b.f[] paramArrayOff, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   4: astore #10
    //   6: aload_3
    //   7: arraylength
    //   8: istore #8
    //   10: iconst_0
    //   11: istore #7
    //   13: aconst_null
    //   14: astore_1
    //   15: iconst_0
    //   16: istore #5
    //   18: iconst_1
    //   19: istore #6
    //   21: iload #5
    //   23: iload #8
    //   25: if_icmpge -> 198
    //   28: aload_3
    //   29: iload #5
    //   31: aaload
    //   32: astore #12
    //   34: aload_1
    //   35: astore #9
    //   37: aload #10
    //   39: aload #12
    //   41: invokevirtual c : ()Landroid/net/Uri;
    //   44: ldc 'r'
    //   46: aload_2
    //   47: invokevirtual openFileDescriptor : (Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   50: astore #11
    //   52: aload #11
    //   54: ifnonnull -> 79
    //   57: aload_1
    //   58: astore #9
    //   60: aload #11
    //   62: ifnull -> 186
    //   65: aload_1
    //   66: astore #9
    //   68: aload #11
    //   70: invokevirtual close : ()V
    //   73: aload_1
    //   74: astore #9
    //   76: goto -> 186
    //   79: new android/graphics/fonts/Font$Builder
    //   82: dup
    //   83: aload #11
    //   85: invokespecial <init> : (Landroid/os/ParcelFileDescriptor;)V
    //   88: aload #12
    //   90: invokevirtual d : ()I
    //   93: invokevirtual setWeight : (I)Landroid/graphics/fonts/Font$Builder;
    //   96: astore #9
    //   98: aload #12
    //   100: invokevirtual e : ()Z
    //   103: ifeq -> 278
    //   106: goto -> 109
    //   109: aload #9
    //   111: iload #6
    //   113: invokevirtual setSlant : (I)Landroid/graphics/fonts/Font$Builder;
    //   116: aload #12
    //   118: invokevirtual b : ()I
    //   121: invokevirtual setTtcIndex : (I)Landroid/graphics/fonts/Font$Builder;
    //   124: invokevirtual build : ()Landroid/graphics/fonts/Font;
    //   127: astore #9
    //   129: aload_1
    //   130: ifnonnull -> 150
    //   133: new android/graphics/fonts/FontFamily$Builder
    //   136: dup
    //   137: aload #9
    //   139: invokespecial <init> : (Landroid/graphics/fonts/Font;)V
    //   142: astore #9
    //   144: aload #9
    //   146: astore_1
    //   147: goto -> 157
    //   150: aload_1
    //   151: aload #9
    //   153: invokevirtual addFont : (Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
    //   156: pop
    //   157: aload_1
    //   158: astore #9
    //   160: aload #11
    //   162: ifnull -> 186
    //   165: goto -> 65
    //   168: astore #12
    //   170: aload #11
    //   172: ifnull -> 180
    //   175: aload #11
    //   177: invokevirtual close : ()V
    //   180: aload_1
    //   181: astore #9
    //   183: aload #12
    //   185: athrow
    //   186: iload #5
    //   188: iconst_1
    //   189: iadd
    //   190: istore #5
    //   192: aload #9
    //   194: astore_1
    //   195: goto -> 18
    //   198: aload_1
    //   199: ifnonnull -> 204
    //   202: aconst_null
    //   203: areturn
    //   204: iload #4
    //   206: iconst_1
    //   207: iand
    //   208: ifeq -> 219
    //   211: sipush #700
    //   214: istore #5
    //   216: goto -> 224
    //   219: sipush #400
    //   222: istore #5
    //   224: iload #7
    //   226: istore #6
    //   228: iload #4
    //   230: iconst_2
    //   231: iand
    //   232: ifeq -> 238
    //   235: iconst_1
    //   236: istore #6
    //   238: new android/graphics/fonts/FontStyle
    //   241: dup
    //   242: iload #5
    //   244: iload #6
    //   246: invokespecial <init> : (II)V
    //   249: astore_2
    //   250: new android/graphics/Typeface$CustomFallbackBuilder
    //   253: dup
    //   254: aload_1
    //   255: invokevirtual build : ()Landroid/graphics/fonts/FontFamily;
    //   258: invokespecial <init> : (Landroid/graphics/fonts/FontFamily;)V
    //   261: aload_2
    //   262: invokevirtual setStyle : (Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
    //   265: invokevirtual build : ()Landroid/graphics/Typeface;
    //   268: areturn
    //   269: astore_1
    //   270: goto -> 186
    //   273: astore #9
    //   275: goto -> 180
    //   278: iconst_0
    //   279: istore #6
    //   281: goto -> 109
    // Exception table:
    //   from	to	target	type
    //   37	52	269	java/io/IOException
    //   68	73	269	java/io/IOException
    //   79	106	168	finally
    //   109	129	168	finally
    //   133	144	168	finally
    //   150	157	168	finally
    //   175	180	273	finally
    //   183	186	269	java/io/IOException
  }
  
  public Typeface a(Context paramContext, c.b paramb, Resources paramResources, int paramInt) {
    c.c[] arrayOfC = paramb.a();
    int m = arrayOfC.length;
    boolean bool = false;
    paramContext = null;
    int k = 0;
    while (true) {
      FontFamily.Builder builder;
      boolean bool1 = true;
      if (k < m) {
        c.c c = arrayOfC[k];
        try {
          FontFamily.Builder builder1;
          Font.Builder builder2 = (new Font.Builder(paramResources, c.b())).setWeight(c.e());
          if (!c.f())
            bool1 = false; 
          Font font = builder2.setSlant(bool1).setTtcIndex(c.c()).setFontVariationSettings(c.d()).build();
          if (paramContext == null) {
            builder1 = new FontFamily.Builder(font);
            builder = builder1;
          } else {
            builder.addFont((Font)builder1);
          } 
        } catch (IOException iOException) {}
        k++;
        continue;
      } 
      if (builder == null)
        return null; 
      if ((paramInt & 0x1) != 0) {
        k = 700;
      } else {
        k = 400;
      } 
      bool1 = bool;
      if ((paramInt & 0x2) != 0)
        bool1 = true; 
      FontStyle fontStyle = new FontStyle(k, bool1);
      return (new Typeface.CustomFallbackBuilder(builder.build())).setStyle(fontStyle).build();
    } 
  }
  
  protected Typeface a(Context paramContext, InputStream paramInputStream) {
    throw new RuntimeException("Do not use this function in API 29 or later.");
  }
  
  protected b.f a(b.f[] paramArrayOff, int paramInt) {
    throw new RuntimeException("Do not use this function in API 29 or later.");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */