package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
  static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
  
  public int a = -1;
  
  Object b;
  
  public byte[] c = null;
  
  public Parcelable d = null;
  
  public int e = 0;
  
  public int f = 0;
  
  public ColorStateList g = null;
  
  PorterDuff.Mode h = j;
  
  public String i = null;
  
  public IconCompat() {}
  
  private IconCompat(int paramInt) {
    this.a = paramInt;
  }
  
  private static int a(Icon paramIcon) {
    if (Build.VERSION.SDK_INT >= 28)
      return paramIcon.getResId(); 
    try {
      return ((Integer)paramIcon.getClass().getMethod("getResId", new Class[0]).invoke(paramIcon, new Object[0])).intValue();
    } catch (IllegalAccessException illegalAccessException) {
      Log.e("IconCompat", "Unable to get icon resource", illegalAccessException);
      return 0;
    } catch (InvocationTargetException invocationTargetException) {
      Log.e("IconCompat", "Unable to get icon resource", invocationTargetException);
      return 0;
    } catch (NoSuchMethodException noSuchMethodException) {
      Log.e("IconCompat", "Unable to get icon resource", noSuchMethodException);
      return 0;
    } 
  }
  
  static Bitmap a(Bitmap paramBitmap, boolean paramBoolean) {
    int i = (int)(Math.min(paramBitmap.getWidth(), paramBitmap.getHeight()) * 0.6666667F);
    Bitmap bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    Canvas canvas = new Canvas(bitmap);
    Paint paint = new Paint(3);
    float f1 = i;
    float f2 = 0.5F * f1;
    float f3 = 0.9166667F * f2;
    if (paramBoolean) {
      float f = 0.010416667F * f1;
      paint.setColor(0);
      paint.setShadowLayer(f, 0.0F, f1 * 0.020833334F, 1023410176);
      canvas.drawCircle(f2, f2, f3, paint);
      paint.setShadowLayer(f, 0.0F, 0.0F, 503316480);
      canvas.drawCircle(f2, f2, f3, paint);
      paint.clearShadowLayer();
    } 
    paint.setColor(-16777216);
    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
    BitmapShader bitmapShader = new BitmapShader(paramBitmap, tileMode, tileMode);
    Matrix matrix = new Matrix();
    matrix.setTranslate((-(paramBitmap.getWidth() - i) / 2), (-(paramBitmap.getHeight() - i) / 2));
    bitmapShader.setLocalMatrix(matrix);
    paint.setShader((Shader)bitmapShader);
    canvas.drawCircle(f2, f2, f3, paint);
    canvas.setBitmap(null);
    return bitmap;
  }
  
  public static IconCompat a(Resources paramResources, String paramString, int paramInt) {
    if (paramString != null) {
      if (paramInt != 0) {
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.e = paramInt;
        if (paramResources != null)
          try {
            iconCompat.b = paramResources.getResourceName(paramInt);
            return iconCompat;
          } catch (android.content.res.Resources.NotFoundException notFoundException) {
            throw new IllegalArgumentException("Icon resource cannot be found");
          }  
        iconCompat.b = paramString;
        return iconCompat;
      } 
      throw new IllegalArgumentException("Drawable resource ID must not be 0");
    } 
    throw new IllegalArgumentException("Package must not be null.");
  }
  
  private static String a(int paramInt) {
    switch (paramInt) {
      default:
        return "UNKNOWN";
      case 6:
        return "URI_MASKABLE";
      case 5:
        return "BITMAP_MASKABLE";
      case 4:
        return "URI";
      case 3:
        return "DATA";
      case 2:
        return "RESOURCE";
      case 1:
        break;
    } 
    return "BITMAP";
  }
  
  private InputStream b(Context paramContext) {
    StringBuilder stringBuilder;
    Uri uri = d();
    String str = uri.getScheme();
    if ("content".equals(str) || "file".equals(str)) {
      try {
        return paramContext.getContentResolver().openInputStream(uri);
      } catch (Exception null) {
        stringBuilder = new StringBuilder();
        str = "Unable to load image from URI: ";
      } 
      stringBuilder.append(str);
      stringBuilder.append(uri);
      Log.w("IconCompat", stringBuilder.toString(), exception);
      return null;
    } 
    try {
      return new FileInputStream(new File((String)this.b));
    } catch (FileNotFoundException exception) {
      stringBuilder = new StringBuilder();
      str = "Unable to load image from path: ";
    } 
    stringBuilder.append(str);
    stringBuilder.append(uri);
    Log.w("IconCompat", stringBuilder.toString(), exception);
    return null;
  }
  
  private static String b(Icon paramIcon) {
    if (Build.VERSION.SDK_INT >= 28)
      return paramIcon.getResPackage(); 
    try {
      return (String)paramIcon.getClass().getMethod("getResPackage", new Class[0]).invoke(paramIcon, new Object[0]);
    } catch (IllegalAccessException illegalAccessException) {
      Log.e("IconCompat", "Unable to get icon package", illegalAccessException);
      return null;
    } catch (InvocationTargetException invocationTargetException) {
      Log.e("IconCompat", "Unable to get icon package", invocationTargetException);
      return null;
    } catch (NoSuchMethodException noSuchMethodException) {
      Log.e("IconCompat", "Unable to get icon package", noSuchMethodException);
      return null;
    } 
  }
  
  private static int c(Icon paramIcon) {
    StringBuilder stringBuilder;
    if (Build.VERSION.SDK_INT >= 28)
      return paramIcon.getType(); 
    try {
      return ((Integer)paramIcon.getClass().getMethod("getType", new Class[0]).invoke(paramIcon, new Object[0])).intValue();
    } catch (IllegalAccessException illegalAccessException) {
      stringBuilder = new StringBuilder();
    } catch (InvocationTargetException invocationTargetException) {
      stringBuilder = new StringBuilder();
    } catch (NoSuchMethodException noSuchMethodException) {
      stringBuilder = new StringBuilder();
    } 
    stringBuilder.append("Unable to get icon type ");
    stringBuilder.append(paramIcon);
    Log.e("IconCompat", stringBuilder.toString(), noSuchMethodException);
    return -1;
  }
  
  private static Uri d(Icon paramIcon) {
    if (Build.VERSION.SDK_INT >= 28)
      return paramIcon.getUri(); 
    try {
      return (Uri)paramIcon.getClass().getMethod("getUri", new Class[0]).invoke(paramIcon, new Object[0]);
    } catch (IllegalAccessException illegalAccessException) {
      Log.e("IconCompat", "Unable to get icon uri", illegalAccessException);
      return null;
    } catch (InvocationTargetException invocationTargetException) {
      Log.e("IconCompat", "Unable to get icon uri", invocationTargetException);
      return null;
    } catch (NoSuchMethodException noSuchMethodException) {
      Log.e("IconCompat", "Unable to get icon uri", noSuchMethodException);
      return null;
    } 
  }
  
  public int a() {
    if (this.a == -1 && Build.VERSION.SDK_INT >= 23)
      return a((Icon)this.b); 
    if (this.a == 2)
      return this.e; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("called getResId() on ");
    stringBuilder.append(this);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public Icon a(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : I
    //   4: tableswitch default -> 52, -1 -> 311, 0 -> 52, 1 -> 263, 2 -> 248, 3 -> 226, 4 -> 212, 5 -> 171, 6 -> 63
    //   52: new java/lang/IllegalArgumentException
    //   55: dup
    //   56: ldc_w 'Unknown type'
    //   59: invokespecial <init> : (Ljava/lang/String;)V
    //   62: athrow
    //   63: aload_1
    //   64: ifnull -> 134
    //   67: aload_0
    //   68: aload_1
    //   69: invokespecial b : (Landroid/content/Context;)Ljava/io/InputStream;
    //   72: astore_1
    //   73: aload_1
    //   74: ifnull -> 97
    //   77: getstatic android/os/Build$VERSION.SDK_INT : I
    //   80: istore_2
    //   81: aload_1
    //   82: invokestatic decodeStream : (Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   85: astore_1
    //   86: aload_1
    //   87: astore_3
    //   88: iload_2
    //   89: bipush #26
    //   91: if_icmplt -> 203
    //   94: goto -> 187
    //   97: new java/lang/StringBuilder
    //   100: dup
    //   101: invokespecial <init> : ()V
    //   104: astore_1
    //   105: aload_1
    //   106: ldc_w 'Cannot load adaptive icon from uri: '
    //   109: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: pop
    //   113: aload_1
    //   114: aload_0
    //   115: invokevirtual d : ()Landroid/net/Uri;
    //   118: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: new java/lang/IllegalStateException
    //   125: dup
    //   126: aload_1
    //   127: invokevirtual toString : ()Ljava/lang/String;
    //   130: invokespecial <init> : (Ljava/lang/String;)V
    //   133: athrow
    //   134: new java/lang/StringBuilder
    //   137: dup
    //   138: invokespecial <init> : ()V
    //   141: astore_1
    //   142: aload_1
    //   143: ldc_w 'Context is required to resolve the file uri of the icon: '
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: pop
    //   150: aload_1
    //   151: aload_0
    //   152: invokevirtual d : ()Landroid/net/Uri;
    //   155: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: new java/lang/IllegalArgumentException
    //   162: dup
    //   163: aload_1
    //   164: invokevirtual toString : ()Ljava/lang/String;
    //   167: invokespecial <init> : (Ljava/lang/String;)V
    //   170: athrow
    //   171: getstatic android/os/Build$VERSION.SDK_INT : I
    //   174: bipush #26
    //   176: if_icmplt -> 195
    //   179: aload_0
    //   180: getfield b : Ljava/lang/Object;
    //   183: checkcast android/graphics/Bitmap
    //   186: astore_1
    //   187: aload_1
    //   188: invokestatic createWithAdaptiveBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   191: astore_1
    //   192: goto -> 276
    //   195: aload_0
    //   196: getfield b : Ljava/lang/Object;
    //   199: checkcast android/graphics/Bitmap
    //   202: astore_3
    //   203: aload_3
    //   204: iconst_0
    //   205: invokestatic a : (Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;
    //   208: astore_1
    //   209: goto -> 271
    //   212: aload_0
    //   213: getfield b : Ljava/lang/Object;
    //   216: checkcast java/lang/String
    //   219: invokestatic createWithContentUri : (Ljava/lang/String;)Landroid/graphics/drawable/Icon;
    //   222: astore_1
    //   223: goto -> 276
    //   226: aload_0
    //   227: getfield b : Ljava/lang/Object;
    //   230: checkcast [B
    //   233: aload_0
    //   234: getfield e : I
    //   237: aload_0
    //   238: getfield f : I
    //   241: invokestatic createWithData : ([BII)Landroid/graphics/drawable/Icon;
    //   244: astore_1
    //   245: goto -> 276
    //   248: aload_0
    //   249: invokevirtual b : ()Ljava/lang/String;
    //   252: aload_0
    //   253: getfield e : I
    //   256: invokestatic createWithResource : (Ljava/lang/String;I)Landroid/graphics/drawable/Icon;
    //   259: astore_1
    //   260: goto -> 276
    //   263: aload_0
    //   264: getfield b : Ljava/lang/Object;
    //   267: checkcast android/graphics/Bitmap
    //   270: astore_1
    //   271: aload_1
    //   272: invokestatic createWithBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   275: astore_1
    //   276: aload_0
    //   277: getfield g : Landroid/content/res/ColorStateList;
    //   280: astore_3
    //   281: aload_3
    //   282: ifnull -> 291
    //   285: aload_1
    //   286: aload_3
    //   287: invokevirtual setTintList : (Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Icon;
    //   290: pop
    //   291: aload_0
    //   292: getfield h : Landroid/graphics/PorterDuff$Mode;
    //   295: astore_3
    //   296: aload_3
    //   297: getstatic androidx/core/graphics/drawable/IconCompat.j : Landroid/graphics/PorterDuff$Mode;
    //   300: if_acmpeq -> 309
    //   303: aload_1
    //   304: aload_3
    //   305: invokevirtual setTintMode : (Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/drawable/Icon;
    //   308: pop
    //   309: aload_1
    //   310: areturn
    //   311: aload_0
    //   312: getfield b : Ljava/lang/Object;
    //   315: checkcast android/graphics/drawable/Icon
    //   318: areturn
  }
  
  public void a(boolean paramBoolean) {
    this.i = this.h.name();
    switch (this.a) {
      default:
        return;
      case 4:
      case 6:
        this.c = this.b.toString().getBytes(Charset.forName("UTF-16"));
        return;
      case 3:
        this.c = (byte[])this.b;
        return;
      case 2:
        this.c = ((String)this.b).getBytes(Charset.forName("UTF-16"));
        return;
      case 1:
      case 5:
        if (paramBoolean) {
          Bitmap bitmap = (Bitmap)this.b;
          ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
          bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
          this.c = byteArrayOutputStream.toByteArray();
          return;
        } 
        break;
      case -1:
        if (!paramBoolean)
          break; 
        throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
    } 
    this.d = (Parcelable)this.b;
  }
  
  public String b() {
    if (this.a == -1 && Build.VERSION.SDK_INT >= 23)
      return b((Icon)this.b); 
    if (this.a == 2)
      return ((String)this.b).split(":", -1)[0]; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("called getResPackage() on ");
    stringBuilder.append(this);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public int c() {
    return (this.a == -1 && Build.VERSION.SDK_INT >= 23) ? c((Icon)this.b) : this.a;
  }
  
  public Uri d() {
    if (this.a == -1 && Build.VERSION.SDK_INT >= 23)
      return d((Icon)this.b); 
    int i = this.a;
    if (i == 4 || i == 6)
      return Uri.parse((String)this.b); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("called getUri() on ");
    stringBuilder.append(this);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public void e() {
    Parcelable parcelable2;
    byte[] arrayOfByte;
    Parcelable parcelable1;
    this.h = PorterDuff.Mode.valueOf(this.i);
    switch (this.a) {
      default:
        return;
      case 3:
        this.b = this.c;
        return;
      case 2:
      case 4:
      case 6:
        this.b = new String(this.c, Charset.forName("UTF-16"));
        return;
      case 1:
      case 5:
        parcelable2 = this.d;
        if (parcelable2 != null)
          break; 
        arrayOfByte = this.c;
        this.b = arrayOfByte;
        this.a = 3;
        this.e = 0;
        this.f = arrayOfByte.length;
        return;
      case -1:
        parcelable1 = this.d;
        if (parcelable1 != null)
          break; 
        throw new IllegalArgumentException("Invalid icon");
    } 
    this.b = parcelable1;
  }
  
  @Deprecated
  public Icon f() {
    return a((Context)null);
  }
  
  public String toString() {
    int i;
    if (this.a == -1)
      return String.valueOf(this.b); 
    StringBuilder stringBuilder = new StringBuilder("Icon(typ=");
    stringBuilder.append(a(this.a));
    switch (this.a) {
      case 4:
      case 6:
        stringBuilder.append(" uri=");
        stringBuilder.append(this.b);
        break;
      case 3:
        stringBuilder.append(" len=");
        stringBuilder.append(this.e);
        if (this.f != 0) {
          stringBuilder.append(" off=");
          i = this.f;
        } else {
          break;
        } 
        stringBuilder.append(i);
        break;
      case 2:
        stringBuilder.append(" pkg=");
        stringBuilder.append(b());
        stringBuilder.append(" id=");
        stringBuilder.append(String.format("0x%08x", new Object[] { Integer.valueOf(a()) }));
        break;
      case 1:
      case 5:
        stringBuilder.append(" size=");
        stringBuilder.append(((Bitmap)this.b).getWidth());
        stringBuilder.append("x");
        i = ((Bitmap)this.b).getHeight();
        stringBuilder.append(i);
        break;
    } 
    if (this.g != null) {
      stringBuilder.append(" tint=");
      stringBuilder.append(this.g);
    } 
    if (this.h != j) {
      stringBuilder.append(" mode=");
      stringBuilder.append(this.h);
    } 
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/graphics/drawable/IconCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */