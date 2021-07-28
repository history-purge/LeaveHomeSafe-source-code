package b.s.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class i extends h {
  static final PorterDuff.Mode l = PorterDuff.Mode.SRC_IN;
  
  private h d = new h();
  
  private PorterDuffColorFilter e;
  
  private ColorFilter f;
  
  private boolean g;
  
  private boolean h = true;
  
  private final float[] i = new float[9];
  
  private final Matrix j = new Matrix();
  
  private final Rect k = new Rect();
  
  i() {}
  
  i(h paramh) {
    this.e = a(this.e, paramh.c, paramh.d);
  }
  
  static int a(int paramInt, float paramFloat) {
    return paramInt & 0xFFFFFF | (int)(Color.alpha(paramInt) * paramFloat) << 24;
  }
  
  private static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode) {
    if (paramInt != 3) {
      if (paramInt != 5) {
        if (paramInt != 9) {
          switch (paramInt) {
            default:
              return paramMode;
            case 16:
              return PorterDuff.Mode.ADD;
            case 15:
              return PorterDuff.Mode.SCREEN;
            case 14:
              break;
          } 
          return PorterDuff.Mode.MULTIPLY;
        } 
        return PorterDuff.Mode.SRC_ATOP;
      } 
      return PorterDuff.Mode.SRC_IN;
    } 
    return PorterDuff.Mode.SRC_OVER;
  }
  
  public static i a(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    if (Build.VERSION.SDK_INT >= 24) {
      i i1 = new i();
      i1.c = b.g.e.d.f.b(paramResources, paramInt, paramTheme);
      new i(i1.c.getConstantState());
      return i1;
    } 
    try {
      XmlResourceParser xmlResourceParser = paramResources.getXml(paramInt);
      AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
      while (true) {
        paramInt = xmlResourceParser.next();
        if (paramInt != 2 && paramInt != 1)
          continue; 
        break;
      } 
      if (paramInt == 2)
        return createFromXmlInner(paramResources, (XmlPullParser)xmlResourceParser, attributeSet, paramTheme); 
      throw new XmlPullParserException("No start tag found");
    } catch (XmlPullParserException xmlPullParserException) {
    
    } catch (IOException iOException) {}
    Log.e("VectorDrawableCompat", "parser error", iOException);
    return null;
  }
  
  private void a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Lb/s/a/a/i$h;
    //   4: astore #12
    //   6: aload #12
    //   8: getfield b : Lb/s/a/a/i$g;
    //   11: astore #13
    //   13: new java/util/ArrayDeque
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: astore #14
    //   22: aload #14
    //   24: aload #13
    //   26: getfield h : Lb/s/a/a/i$d;
    //   29: invokevirtual push : (Ljava/lang/Object;)V
    //   32: aload_2
    //   33: invokeinterface getEventType : ()I
    //   38: istore #7
    //   40: aload_2
    //   41: invokeinterface getDepth : ()I
    //   46: istore #9
    //   48: iconst_1
    //   49: istore #5
    //   51: iload #7
    //   53: iconst_1
    //   54: if_icmpeq -> 434
    //   57: aload_2
    //   58: invokeinterface getDepth : ()I
    //   63: iload #9
    //   65: iconst_1
    //   66: iadd
    //   67: if_icmpge -> 76
    //   70: iload #7
    //   72: iconst_3
    //   73: if_icmpeq -> 434
    //   76: iload #7
    //   78: iconst_2
    //   79: if_icmpne -> 381
    //   82: aload_2
    //   83: invokeinterface getName : ()Ljava/lang/String;
    //   88: astore #10
    //   90: aload #14
    //   92: invokevirtual peek : ()Ljava/lang/Object;
    //   95: checkcast b/s/a/a/i$d
    //   98: astore #15
    //   100: ldc 'path'
    //   102: aload #10
    //   104: invokevirtual equals : (Ljava/lang/Object;)Z
    //   107: ifeq -> 170
    //   110: new b/s/a/a/i$c
    //   113: dup
    //   114: invokespecial <init> : ()V
    //   117: astore #10
    //   119: aload #10
    //   121: aload_1
    //   122: aload_3
    //   123: aload #4
    //   125: aload_2
    //   126: invokevirtual a : (Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
    //   129: aload #15
    //   131: getfield b : Ljava/util/ArrayList;
    //   134: aload #10
    //   136: invokevirtual add : (Ljava/lang/Object;)Z
    //   139: pop
    //   140: aload #10
    //   142: invokevirtual getPathName : ()Ljava/lang/String;
    //   145: ifnull -> 164
    //   148: aload #13
    //   150: getfield p : Lb/d/a;
    //   153: aload #10
    //   155: invokevirtual getPathName : ()Ljava/lang/String;
    //   158: aload #10
    //   160: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   163: pop
    //   164: iconst_0
    //   165: istore #6
    //   167: goto -> 250
    //   170: ldc 'clip-path'
    //   172: aload #10
    //   174: invokevirtual equals : (Ljava/lang/Object;)Z
    //   177: ifeq -> 289
    //   180: new b/s/a/a/i$b
    //   183: dup
    //   184: invokespecial <init> : ()V
    //   187: astore #11
    //   189: aload #11
    //   191: aload_1
    //   192: aload_3
    //   193: aload #4
    //   195: aload_2
    //   196: invokevirtual a : (Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
    //   199: aload #15
    //   201: getfield b : Ljava/util/ArrayList;
    //   204: aload #11
    //   206: invokevirtual add : (Ljava/lang/Object;)Z
    //   209: pop
    //   210: aload #11
    //   212: astore #10
    //   214: iload #5
    //   216: istore #6
    //   218: aload #11
    //   220: invokevirtual getPathName : ()Ljava/lang/String;
    //   223: ifnull -> 250
    //   226: aload #13
    //   228: getfield p : Lb/d/a;
    //   231: aload #11
    //   233: invokevirtual getPathName : ()Ljava/lang/String;
    //   236: aload #11
    //   238: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   241: pop
    //   242: iload #5
    //   244: istore #6
    //   246: aload #11
    //   248: astore #10
    //   250: aload #12
    //   252: getfield a : I
    //   255: istore #7
    //   257: aload #10
    //   259: getfield d : I
    //   262: istore #8
    //   264: iload #6
    //   266: istore #5
    //   268: iload #8
    //   270: istore #6
    //   272: aload #12
    //   274: iload #6
    //   276: iload #7
    //   278: ior
    //   279: putfield a : I
    //   282: iload #5
    //   284: istore #6
    //   286: goto -> 419
    //   289: iload #5
    //   291: istore #6
    //   293: ldc 'group'
    //   295: aload #10
    //   297: invokevirtual equals : (Ljava/lang/Object;)Z
    //   300: ifeq -> 419
    //   303: new b/s/a/a/i$d
    //   306: dup
    //   307: invokespecial <init> : ()V
    //   310: astore #10
    //   312: aload #10
    //   314: aload_1
    //   315: aload_3
    //   316: aload #4
    //   318: aload_2
    //   319: invokevirtual a : (Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
    //   322: aload #15
    //   324: getfield b : Ljava/util/ArrayList;
    //   327: aload #10
    //   329: invokevirtual add : (Ljava/lang/Object;)Z
    //   332: pop
    //   333: aload #14
    //   335: aload #10
    //   337: invokevirtual push : (Ljava/lang/Object;)V
    //   340: aload #10
    //   342: invokevirtual getGroupName : ()Ljava/lang/String;
    //   345: ifnull -> 364
    //   348: aload #13
    //   350: getfield p : Lb/d/a;
    //   353: aload #10
    //   355: invokevirtual getGroupName : ()Ljava/lang/String;
    //   358: aload #10
    //   360: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   363: pop
    //   364: aload #12
    //   366: getfield a : I
    //   369: istore #7
    //   371: aload #10
    //   373: getfield k : I
    //   376: istore #6
    //   378: goto -> 272
    //   381: iload #5
    //   383: istore #6
    //   385: iload #7
    //   387: iconst_3
    //   388: if_icmpne -> 419
    //   391: iload #5
    //   393: istore #6
    //   395: ldc 'group'
    //   397: aload_2
    //   398: invokeinterface getName : ()Ljava/lang/String;
    //   403: invokevirtual equals : (Ljava/lang/Object;)Z
    //   406: ifeq -> 419
    //   409: aload #14
    //   411: invokevirtual pop : ()Ljava/lang/Object;
    //   414: pop
    //   415: iload #5
    //   417: istore #6
    //   419: aload_2
    //   420: invokeinterface next : ()I
    //   425: istore #7
    //   427: iload #6
    //   429: istore #5
    //   431: goto -> 51
    //   434: iload #5
    //   436: ifne -> 440
    //   439: return
    //   440: new org/xmlpull/v1/XmlPullParserException
    //   443: dup
    //   444: ldc 'no path defined'
    //   446: invokespecial <init> : (Ljava/lang/String;)V
    //   449: astore_1
    //   450: goto -> 455
    //   453: aload_1
    //   454: athrow
    //   455: goto -> 453
  }
  
  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme) {
    String str;
    h h1 = this.d;
    g g = h1.b;
    h1.d = a(b.g.e.d.g.b(paramTypedArray, paramXmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
    ColorStateList colorStateList = b.g.e.d.g.a(paramTypedArray, paramXmlPullParser, paramTheme, "tint", 1);
    if (colorStateList != null)
      h1.c = colorStateList; 
    h1.e = b.g.e.d.g.a(paramTypedArray, paramXmlPullParser, "autoMirrored", 5, h1.e);
    g.k = b.g.e.d.g.a(paramTypedArray, paramXmlPullParser, "viewportWidth", 7, g.k);
    g.l = b.g.e.d.g.a(paramTypedArray, paramXmlPullParser, "viewportHeight", 8, g.l);
    if (g.k > 0.0F) {
      if (g.l > 0.0F) {
        g.i = paramTypedArray.getDimension(3, g.i);
        g.j = paramTypedArray.getDimension(2, g.j);
        if (g.i > 0.0F) {
          if (g.j > 0.0F) {
            g.setAlpha(b.g.e.d.g.a(paramTypedArray, paramXmlPullParser, "alpha", 4, g.getAlpha()));
            str = paramTypedArray.getString(0);
            if (str != null) {
              g.n = str;
              g.p.put(str, g);
            } 
            return;
          } 
          StringBuilder stringBuilder3 = new StringBuilder();
          stringBuilder3.append(str.getPositionDescription());
          stringBuilder3.append("<vector> tag requires height > 0");
          throw new XmlPullParserException(stringBuilder3.toString());
        } 
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str.getPositionDescription());
        stringBuilder2.append("<vector> tag requires width > 0");
        throw new XmlPullParserException(stringBuilder2.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str.getPositionDescription());
      stringBuilder1.append("<vector> tag requires viewportHeight > 0");
      throw new XmlPullParserException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str.getPositionDescription());
    stringBuilder.append("<vector> tag requires viewportWidth > 0");
    throw new XmlPullParserException(stringBuilder.toString());
  }
  
  private boolean a() {
    int j = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (j >= 17) {
      bool1 = bool2;
      if (isAutoMirrored()) {
        bool1 = bool2;
        if (androidx.core.graphics.drawable.a.e(this) == 1)
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public static i createFromXmlInner(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    i i1 = new i();
    i1.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return i1;
  }
  
  PorterDuffColorFilter a(PorterDuffColorFilter paramPorterDuffColorFilter, ColorStateList paramColorStateList, PorterDuff.Mode paramMode) {
    return (paramColorStateList == null || paramMode == null) ? null : new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  Object a(String paramString) {
    return this.d.b.p.get(paramString);
  }
  
  void a(boolean paramBoolean) {
    this.h = paramBoolean;
  }
  
  public boolean canApplyTheme() {
    Drawable drawable = this.c;
    if (drawable != null)
      androidx.core.graphics.drawable.a.a(drawable); 
    return false;
  }
  
  public void draw(Canvas paramCanvas) {
    Drawable drawable = this.c;
    if (drawable != null) {
      drawable.draw(paramCanvas);
      return;
    } 
    copyBounds(this.k);
    if (this.k.width() > 0) {
      PorterDuffColorFilter porterDuffColorFilter;
      if (this.k.height() <= 0)
        return; 
      ColorFilter colorFilter2 = this.f;
      ColorFilter colorFilter1 = colorFilter2;
      if (colorFilter2 == null)
        porterDuffColorFilter = this.e; 
      paramCanvas.getMatrix(this.j);
      this.j.getValues(this.i);
      float f1 = Math.abs(this.i[0]);
      float f2 = Math.abs(this.i[4]);
      float f4 = Math.abs(this.i[1]);
      float f3 = Math.abs(this.i[3]);
      if (f4 != 0.0F || f3 != 0.0F) {
        f1 = 1.0F;
        f2 = 1.0F;
      } 
      int j = (int)(this.k.width() * f1);
      int k = (int)(this.k.height() * f2);
      j = Math.min(2048, j);
      k = Math.min(2048, k);
      if (j > 0) {
        if (k <= 0)
          return; 
        int m = paramCanvas.save();
        Rect rect = this.k;
        paramCanvas.translate(rect.left, rect.top);
        if (a()) {
          paramCanvas.translate(this.k.width(), 0.0F);
          paramCanvas.scale(-1.0F, 1.0F);
        } 
        this.k.offsetTo(0, 0);
        this.d.b(j, k);
        if (!this.h) {
          this.d.c(j, k);
        } else if (!this.d.a()) {
          this.d.c(j, k);
          this.d.d();
        } 
        this.d.a(paramCanvas, (ColorFilter)porterDuffColorFilter, this.k);
        paramCanvas.restoreToCount(m);
      } 
    } 
  }
  
  public int getAlpha() {
    Drawable drawable = this.c;
    return (drawable != null) ? androidx.core.graphics.drawable.a.c(drawable) : this.d.b.getRootAlpha();
  }
  
  public int getChangingConfigurations() {
    Drawable drawable = this.c;
    return (drawable != null) ? drawable.getChangingConfigurations() : (super.getChangingConfigurations() | this.d.getChangingConfigurations());
  }
  
  public ColorFilter getColorFilter() {
    Drawable drawable = this.c;
    return (drawable != null) ? androidx.core.graphics.drawable.a.d(drawable) : this.f;
  }
  
  public Drawable.ConstantState getConstantState() {
    Drawable drawable = this.c;
    if (drawable != null && Build.VERSION.SDK_INT >= 24)
      return new i(drawable.getConstantState()); 
    this.d.a = getChangingConfigurations();
    return this.d;
  }
  
  public int getIntrinsicHeight() {
    Drawable drawable = this.c;
    return (drawable != null) ? drawable.getIntrinsicHeight() : (int)this.d.b.j;
  }
  
  public int getIntrinsicWidth() {
    Drawable drawable = this.c;
    return (drawable != null) ? drawable.getIntrinsicWidth() : (int)this.d.b.i;
  }
  
  public int getOpacity() {
    Drawable drawable = this.c;
    return (drawable != null) ? drawable.getOpacity() : -3;
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet) {
    Drawable drawable = this.c;
    if (drawable != null) {
      drawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
      return;
    } 
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    Drawable drawable = this.c;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.a(drawable, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    } 
    h h1 = this.d;
    h1.b = new g();
    TypedArray typedArray = b.g.e.d.g.a(paramResources, paramTheme, paramAttributeSet, a.a);
    a(typedArray, paramXmlPullParser, paramTheme);
    typedArray.recycle();
    h1.a = getChangingConfigurations();
    h1.k = true;
    a(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    this.e = a(this.e, h1.c, h1.d);
  }
  
  public void invalidateSelf() {
    Drawable drawable = this.c;
    if (drawable != null) {
      drawable.invalidateSelf();
      return;
    } 
    super.invalidateSelf();
  }
  
  public boolean isAutoMirrored() {
    Drawable drawable = this.c;
    return (drawable != null) ? androidx.core.graphics.drawable.a.f(drawable) : this.d.e;
  }
  
  public boolean isStateful() {
    Drawable drawable = this.c;
    if (drawable != null)
      return drawable.isStateful(); 
    if (!super.isStateful()) {
      h h1 = this.d;
      if (h1 != null) {
        if (!h1.c()) {
          ColorStateList colorStateList = this.d.c;
          return (colorStateList != null && colorStateList.isStateful());
        } 
      } else {
        return false;
      } 
    } 
    return true;
  }
  
  public Drawable mutate() {
    Drawable drawable = this.c;
    if (drawable != null) {
      drawable.mutate();
      return this;
    } 
    if (!this.g && super.mutate() == this) {
      this.d = new h(this.d);
      this.g = true;
    } 
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.c;
    if (drawable != null)
      drawable.setBounds(paramRect); 
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    Drawable drawable = this.c;
    if (drawable != null)
      return drawable.setState(paramArrayOfint); 
    boolean bool2 = false;
    h h1 = this.d;
    ColorStateList colorStateList = h1.c;
    boolean bool1 = bool2;
    if (colorStateList != null) {
      PorterDuff.Mode mode = h1.d;
      bool1 = bool2;
      if (mode != null) {
        this.e = a(this.e, colorStateList, mode);
        invalidateSelf();
        bool1 = true;
      } 
    } 
    bool2 = bool1;
    if (h1.c()) {
      bool2 = bool1;
      if (h1.a(paramArrayOfint)) {
        invalidateSelf();
        bool2 = true;
      } 
    } 
    return bool2;
  }
  
  public void scheduleSelf(Runnable paramRunnable, long paramLong) {
    Drawable drawable = this.c;
    if (drawable != null) {
      drawable.scheduleSelf(paramRunnable, paramLong);
      return;
    } 
    super.scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt) {
    Drawable drawable = this.c;
    if (drawable != null) {
      drawable.setAlpha(paramInt);
      return;
    } 
    if (this.d.b.getRootAlpha() != paramInt) {
      this.d.b.setRootAlpha(paramInt);
      invalidateSelf();
    } 
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    Drawable drawable = this.c;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.a(drawable, paramBoolean);
      return;
    } 
    this.d.e = paramBoolean;
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    Drawable drawable = this.c;
    if (drawable != null) {
      drawable.setColorFilter(paramColorFilter);
      return;
    } 
    this.f = paramColorFilter;
    invalidateSelf();
  }
  
  public void setTint(int paramInt) {
    Drawable drawable = this.c;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.b(drawable, paramInt);
      return;
    } 
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    Drawable drawable = this.c;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.a(drawable, paramColorStateList);
      return;
    } 
    h h1 = this.d;
    if (h1.c != paramColorStateList) {
      h1.c = paramColorStateList;
      this.e = a(this.e, paramColorStateList, h1.d);
      invalidateSelf();
    } 
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    Drawable drawable = this.c;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.a(drawable, paramMode);
      return;
    } 
    h h1 = this.d;
    if (h1.d != paramMode) {
      h1.d = paramMode;
      this.e = a(this.e, h1.c, paramMode);
      invalidateSelf();
    } 
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    Drawable drawable = this.c;
    return (drawable != null) ? drawable.setVisible(paramBoolean1, paramBoolean2) : super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void unscheduleSelf(Runnable paramRunnable) {
    Drawable drawable = this.c;
    if (drawable != null) {
      drawable.unscheduleSelf(paramRunnable);
      return;
    } 
    super.unscheduleSelf(paramRunnable);
  }
  
  private static class b extends f {
    b() {}
    
    b(b param1b) {
      super(param1b);
    }
    
    private void a(TypedArray param1TypedArray, XmlPullParser param1XmlPullParser) {
      String str = param1TypedArray.getString(0);
      if (str != null)
        this.b = str; 
      str = param1TypedArray.getString(1);
      if (str != null)
        this.a = b.g.f.c.a(str); 
      this.c = b.g.e.d.g.b(param1TypedArray, param1XmlPullParser, "fillType", 2, 0);
    }
    
    public void a(Resources param1Resources, AttributeSet param1AttributeSet, Resources.Theme param1Theme, XmlPullParser param1XmlPullParser) {
      if (!b.g.e.d.g.a(param1XmlPullParser, "pathData"))
        return; 
      TypedArray typedArray = b.g.e.d.g.a(param1Resources, param1Theme, param1AttributeSet, a.d);
      a(typedArray, param1XmlPullParser);
      typedArray.recycle();
    }
    
    public boolean b() {
      return true;
    }
  }
  
  private static class c extends f {
    private int[] e;
    
    b.g.e.d.b f;
    
    float g = 0.0F;
    
    b.g.e.d.b h;
    
    float i = 1.0F;
    
    float j = 1.0F;
    
    float k = 0.0F;
    
    float l = 1.0F;
    
    float m = 0.0F;
    
    Paint.Cap n = Paint.Cap.BUTT;
    
    Paint.Join o = Paint.Join.MITER;
    
    float p = 4.0F;
    
    c() {}
    
    c(c param1c) {
      super(param1c);
      this.e = param1c.e;
      this.f = param1c.f;
      this.g = param1c.g;
      this.i = param1c.i;
      this.h = param1c.h;
      this.c = param1c.c;
      this.j = param1c.j;
      this.k = param1c.k;
      this.l = param1c.l;
      this.m = param1c.m;
      this.n = param1c.n;
      this.o = param1c.o;
      this.p = param1c.p;
    }
    
    private Paint.Cap a(int param1Int, Paint.Cap param1Cap) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? param1Cap : Paint.Cap.SQUARE) : Paint.Cap.ROUND) : Paint.Cap.BUTT;
    }
    
    private Paint.Join a(int param1Int, Paint.Join param1Join) {
      return (param1Int != 0) ? ((param1Int != 1) ? ((param1Int != 2) ? param1Join : Paint.Join.BEVEL) : Paint.Join.ROUND) : Paint.Join.MITER;
    }
    
    private void a(TypedArray param1TypedArray, XmlPullParser param1XmlPullParser, Resources.Theme param1Theme) {
      this.e = null;
      if (!b.g.e.d.g.a(param1XmlPullParser, "pathData"))
        return; 
      String str = param1TypedArray.getString(0);
      if (str != null)
        this.b = str; 
      str = param1TypedArray.getString(2);
      if (str != null)
        this.a = b.g.f.c.a(str); 
      this.h = b.g.e.d.g.a(param1TypedArray, param1XmlPullParser, param1Theme, "fillColor", 1, 0);
      this.j = b.g.e.d.g.a(param1TypedArray, param1XmlPullParser, "fillAlpha", 12, this.j);
      this.n = a(b.g.e.d.g.b(param1TypedArray, param1XmlPullParser, "strokeLineCap", 8, -1), this.n);
      this.o = a(b.g.e.d.g.b(param1TypedArray, param1XmlPullParser, "strokeLineJoin", 9, -1), this.o);
      this.p = b.g.e.d.g.a(param1TypedArray, param1XmlPullParser, "strokeMiterLimit", 10, this.p);
      this.f = b.g.e.d.g.a(param1TypedArray, param1XmlPullParser, param1Theme, "strokeColor", 3, 0);
      this.i = b.g.e.d.g.a(param1TypedArray, param1XmlPullParser, "strokeAlpha", 11, this.i);
      this.g = b.g.e.d.g.a(param1TypedArray, param1XmlPullParser, "strokeWidth", 4, this.g);
      this.l = b.g.e.d.g.a(param1TypedArray, param1XmlPullParser, "trimPathEnd", 6, this.l);
      this.m = b.g.e.d.g.a(param1TypedArray, param1XmlPullParser, "trimPathOffset", 7, this.m);
      this.k = b.g.e.d.g.a(param1TypedArray, param1XmlPullParser, "trimPathStart", 5, this.k);
      this.c = b.g.e.d.g.b(param1TypedArray, param1XmlPullParser, "fillType", 13, this.c);
    }
    
    public void a(Resources param1Resources, AttributeSet param1AttributeSet, Resources.Theme param1Theme, XmlPullParser param1XmlPullParser) {
      TypedArray typedArray = b.g.e.d.g.a(param1Resources, param1Theme, param1AttributeSet, a.c);
      a(typedArray, param1XmlPullParser, param1Theme);
      typedArray.recycle();
    }
    
    public boolean a() {
      return (this.h.d() || this.f.d());
    }
    
    public boolean a(int[] param1ArrayOfint) {
      boolean bool = this.h.a(param1ArrayOfint);
      return this.f.a(param1ArrayOfint) | bool;
    }
    
    float getFillAlpha() {
      return this.j;
    }
    
    int getFillColor() {
      return this.h.a();
    }
    
    float getStrokeAlpha() {
      return this.i;
    }
    
    int getStrokeColor() {
      return this.f.a();
    }
    
    float getStrokeWidth() {
      return this.g;
    }
    
    float getTrimPathEnd() {
      return this.l;
    }
    
    float getTrimPathOffset() {
      return this.m;
    }
    
    float getTrimPathStart() {
      return this.k;
    }
    
    void setFillAlpha(float param1Float) {
      this.j = param1Float;
    }
    
    void setFillColor(int param1Int) {
      this.h.a(param1Int);
    }
    
    void setStrokeAlpha(float param1Float) {
      this.i = param1Float;
    }
    
    void setStrokeColor(int param1Int) {
      this.f.a(param1Int);
    }
    
    void setStrokeWidth(float param1Float) {
      this.g = param1Float;
    }
    
    void setTrimPathEnd(float param1Float) {
      this.l = param1Float;
    }
    
    void setTrimPathOffset(float param1Float) {
      this.m = param1Float;
    }
    
    void setTrimPathStart(float param1Float) {
      this.k = param1Float;
    }
  }
  
  private static class d extends e {
    final Matrix a = new Matrix();
    
    final ArrayList<i.e> b = new ArrayList<i.e>();
    
    float c = 0.0F;
    
    private float d = 0.0F;
    
    private float e = 0.0F;
    
    private float f = 1.0F;
    
    private float g = 1.0F;
    
    private float h = 0.0F;
    
    private float i = 0.0F;
    
    final Matrix j = new Matrix();
    
    int k;
    
    private int[] l;
    
    private String m = null;
    
    public d() {
      super(null);
    }
    
    public d(d param1d, b.d.a<String, Object> param1a) {
      super(null);
      this.c = param1d.c;
      this.d = param1d.d;
      this.e = param1d.e;
      this.f = param1d.f;
      this.g = param1d.g;
      this.h = param1d.h;
      this.i = param1d.i;
      this.l = param1d.l;
      this.m = param1d.m;
      this.k = param1d.k;
      String str = this.m;
      if (str != null)
        param1a.put(str, this); 
      this.j.set(param1d.j);
      ArrayList<i.e> arrayList = param1d.b;
      for (int i = 0; i < arrayList.size(); i++) {
        param1d = (d)arrayList.get(i);
        if (param1d instanceof d) {
          param1d = param1d;
          this.b.add(new d(param1d, param1a));
        } else {
          i.c c;
          i.b b;
          if (param1d instanceof i.c) {
            c = new i.c((i.c)param1d);
          } else if (c instanceof i.b) {
            b = new i.b((i.b)c);
          } else {
            throw new IllegalStateException("Unknown object in the tree!");
          } 
          this.b.add(b);
          String str1 = b.b;
          if (str1 != null)
            param1a.put(str1, b); 
        } 
      } 
    }
    
    private void a(TypedArray param1TypedArray, XmlPullParser param1XmlPullParser) {
      this.l = null;
      this.c = b.g.e.d.g.a(param1TypedArray, param1XmlPullParser, "rotation", 5, this.c);
      this.d = param1TypedArray.getFloat(1, this.d);
      this.e = param1TypedArray.getFloat(2, this.e);
      this.f = b.g.e.d.g.a(param1TypedArray, param1XmlPullParser, "scaleX", 3, this.f);
      this.g = b.g.e.d.g.a(param1TypedArray, param1XmlPullParser, "scaleY", 4, this.g);
      this.h = b.g.e.d.g.a(param1TypedArray, param1XmlPullParser, "translateX", 6, this.h);
      this.i = b.g.e.d.g.a(param1TypedArray, param1XmlPullParser, "translateY", 7, this.i);
      String str = param1TypedArray.getString(0);
      if (str != null)
        this.m = str; 
      b();
    }
    
    private void b() {
      this.j.reset();
      this.j.postTranslate(-this.d, -this.e);
      this.j.postScale(this.f, this.g);
      this.j.postRotate(this.c, 0.0F, 0.0F);
      this.j.postTranslate(this.h + this.d, this.i + this.e);
    }
    
    public void a(Resources param1Resources, AttributeSet param1AttributeSet, Resources.Theme param1Theme, XmlPullParser param1XmlPullParser) {
      TypedArray typedArray = b.g.e.d.g.a(param1Resources, param1Theme, param1AttributeSet, a.b);
      a(typedArray, param1XmlPullParser);
      typedArray.recycle();
    }
    
    public boolean a() {
      for (int i = 0; i < this.b.size(); i++) {
        if (((i.e)this.b.get(i)).a())
          return true; 
      } 
      return false;
    }
    
    public boolean a(int[] param1ArrayOfint) {
      int i = 0;
      boolean bool = false;
      while (i < this.b.size()) {
        bool |= ((i.e)this.b.get(i)).a(param1ArrayOfint);
        i++;
      } 
      return bool;
    }
    
    public String getGroupName() {
      return this.m;
    }
    
    public Matrix getLocalMatrix() {
      return this.j;
    }
    
    public float getPivotX() {
      return this.d;
    }
    
    public float getPivotY() {
      return this.e;
    }
    
    public float getRotation() {
      return this.c;
    }
    
    public float getScaleX() {
      return this.f;
    }
    
    public float getScaleY() {
      return this.g;
    }
    
    public float getTranslateX() {
      return this.h;
    }
    
    public float getTranslateY() {
      return this.i;
    }
    
    public void setPivotX(float param1Float) {
      if (param1Float != this.d) {
        this.d = param1Float;
        b();
      } 
    }
    
    public void setPivotY(float param1Float) {
      if (param1Float != this.e) {
        this.e = param1Float;
        b();
      } 
    }
    
    public void setRotation(float param1Float) {
      if (param1Float != this.c) {
        this.c = param1Float;
        b();
      } 
    }
    
    public void setScaleX(float param1Float) {
      if (param1Float != this.f) {
        this.f = param1Float;
        b();
      } 
    }
    
    public void setScaleY(float param1Float) {
      if (param1Float != this.g) {
        this.g = param1Float;
        b();
      } 
    }
    
    public void setTranslateX(float param1Float) {
      if (param1Float != this.h) {
        this.h = param1Float;
        b();
      } 
    }
    
    public void setTranslateY(float param1Float) {
      if (param1Float != this.i) {
        this.i = param1Float;
        b();
      } 
    }
  }
  
  private static abstract class e {
    private e() {}
    
    public boolean a() {
      return false;
    }
    
    public boolean a(int[] param1ArrayOfint) {
      return false;
    }
  }
  
  private static abstract class f extends e {
    protected b.g.f.c.b[] a = null;
    
    String b;
    
    int c = 0;
    
    int d;
    
    public f() {
      super(null);
    }
    
    public f(f param1f) {
      super(null);
      this.b = param1f.b;
      this.d = param1f.d;
      this.a = b.g.f.c.a(param1f.a);
    }
    
    public void a(Path param1Path) {
      param1Path.reset();
      b.g.f.c.b[] arrayOfB = this.a;
      if (arrayOfB != null)
        b.g.f.c.b.a(arrayOfB, param1Path); 
    }
    
    public boolean b() {
      return false;
    }
    
    public b.g.f.c.b[] getPathData() {
      return this.a;
    }
    
    public String getPathName() {
      return this.b;
    }
    
    public void setPathData(b.g.f.c.b[] param1ArrayOfb) {
      if (!b.g.f.c.a(this.a, param1ArrayOfb)) {
        this.a = b.g.f.c.a(param1ArrayOfb);
        return;
      } 
      b.g.f.c.b(this.a, param1ArrayOfb);
    }
  }
  
  private static class g {
    private static final Matrix q = new Matrix();
    
    private final Path a = new Path();
    
    private final Path b = new Path();
    
    private final Matrix c = new Matrix();
    
    Paint d;
    
    Paint e;
    
    private PathMeasure f;
    
    private int g;
    
    final i.d h = new i.d();
    
    float i = 0.0F;
    
    float j = 0.0F;
    
    float k = 0.0F;
    
    float l = 0.0F;
    
    int m = 255;
    
    String n = null;
    
    Boolean o = null;
    
    final b.d.a<String, Object> p = new b.d.a();
    
    public g() {}
    
    public g(g param1g) {
      this.i = param1g.i;
      this.j = param1g.j;
      this.k = param1g.k;
      this.l = param1g.l;
      this.g = param1g.g;
      this.m = param1g.m;
      this.n = param1g.n;
      String str = param1g.n;
      if (str != null)
        this.p.put(str, this); 
      this.o = param1g.o;
    }
    
    private static float a(float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      return param1Float1 * param1Float4 - param1Float2 * param1Float3;
    }
    
    private float a(Matrix param1Matrix) {
      float[] arrayOfFloat = new float[4];
      arrayOfFloat[0] = 0.0F;
      arrayOfFloat[1] = 1.0F;
      arrayOfFloat[2] = 1.0F;
      arrayOfFloat[3] = 0.0F;
      param1Matrix.mapVectors(arrayOfFloat);
      float f1 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
      float f3 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
      float f2 = a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
      f3 = Math.max(f1, f3);
      f1 = 0.0F;
      if (f3 > 0.0F)
        f1 = Math.abs(f2) / f3; 
      return f1;
    }
    
    private void a(i.d param1d, Matrix param1Matrix, Canvas param1Canvas, int param1Int1, int param1Int2, ColorFilter param1ColorFilter) {
      param1d.a.set(param1Matrix);
      param1d.a.preConcat(param1d.j);
      param1Canvas.save();
      int i;
      for (i = 0; i < param1d.b.size(); i++) {
        i.e e = param1d.b.get(i);
        if (e instanceof i.d) {
          a((i.d)e, param1d.a, param1Canvas, param1Int1, param1Int2, param1ColorFilter);
        } else if (e instanceof i.f) {
          a(param1d, (i.f)e, param1Canvas, param1Int1, param1Int2, param1ColorFilter);
        } 
      } 
      param1Canvas.restore();
    }
    
    private void a(i.d param1d, i.f param1f, Canvas param1Canvas, int param1Int1, int param1Int2, ColorFilter param1ColorFilter) {
      Path path1;
      float f2 = param1Int1 / this.k;
      float f3 = param1Int2 / this.l;
      float f1 = Math.min(f2, f3);
      Matrix matrix = param1d.a;
      this.c.set(matrix);
      this.c.postScale(f2, f3);
      f2 = a(matrix);
      if (f2 == 0.0F)
        return; 
      param1f.a(this.a);
      Path path2 = this.a;
      this.b.reset();
      if (param1f.b()) {
        Path.FillType fillType;
        path1 = this.b;
        if (param1f.c == 0) {
          fillType = Path.FillType.WINDING;
        } else {
          fillType = Path.FillType.EVEN_ODD;
        } 
        path1.setFillType(fillType);
        this.b.addPath(path2, this.c);
        param1Canvas.clipPath(this.b);
        return;
      } 
      param1f = param1f;
      if (((i.c)param1f).k != 0.0F || ((i.c)param1f).l != 1.0F) {
        float f6 = ((i.c)param1f).k;
        float f4 = ((i.c)param1f).m;
        float f5 = ((i.c)param1f).l;
        if (this.f == null)
          this.f = new PathMeasure(); 
        this.f.setPath(this.a, false);
        f3 = this.f.getLength();
        f6 = (f6 + f4) % 1.0F * f3;
        f4 = (f5 + f4) % 1.0F * f3;
        path2.reset();
        if (f6 > f4) {
          this.f.getSegment(f6, f3, path2, true);
          this.f.getSegment(0.0F, f4, path2, true);
        } else {
          this.f.getSegment(f6, f4, path2, true);
        } 
        path2.rLineTo(0.0F, 0.0F);
      } 
      this.b.addPath(path2, this.c);
      if (((i.c)param1f).h.e()) {
        Shader shader;
        Path.FillType fillType;
        b.g.e.d.b b = ((i.c)param1f).h;
        if (this.e == null) {
          this.e = new Paint(1);
          this.e.setStyle(Paint.Style.FILL);
        } 
        Paint paint = this.e;
        if (b.c()) {
          shader = b.b();
          shader.setLocalMatrix(this.c);
          paint.setShader(shader);
          paint.setAlpha(Math.round(((i.c)param1f).j * 255.0F));
        } else {
          paint.setShader(null);
          paint.setAlpha(255);
          paint.setColor(i.a(shader.a(), ((i.c)param1f).j));
        } 
        paint.setColorFilter((ColorFilter)path1);
        Path path = this.b;
        if (param1f.c == 0) {
          fillType = Path.FillType.WINDING;
        } else {
          fillType = Path.FillType.EVEN_ODD;
        } 
        path.setFillType(fillType);
        param1Canvas.drawPath(this.b, paint);
      } 
      if (((i.c)param1f).f.e()) {
        Shader shader;
        b.g.e.d.b b = ((i.c)param1f).f;
        if (this.d == null) {
          this.d = new Paint(1);
          this.d.setStyle(Paint.Style.STROKE);
        } 
        Paint paint = this.d;
        Paint.Join join = ((i.c)param1f).o;
        if (join != null)
          paint.setStrokeJoin(join); 
        Paint.Cap cap = ((i.c)param1f).n;
        if (cap != null)
          paint.setStrokeCap(cap); 
        paint.setStrokeMiter(((i.c)param1f).p);
        if (b.c()) {
          shader = b.b();
          shader.setLocalMatrix(this.c);
          paint.setShader(shader);
          paint.setAlpha(Math.round(((i.c)param1f).i * 255.0F));
        } else {
          paint.setShader(null);
          paint.setAlpha(255);
          paint.setColor(i.a(shader.a(), ((i.c)param1f).i));
        } 
        paint.setColorFilter((ColorFilter)path1);
        paint.setStrokeWidth(((i.c)param1f).g * f1 * f2);
        param1Canvas.drawPath(this.b, paint);
      } 
    }
    
    public void a(Canvas param1Canvas, int param1Int1, int param1Int2, ColorFilter param1ColorFilter) {
      a(this.h, q, param1Canvas, param1Int1, param1Int2, param1ColorFilter);
    }
    
    public boolean a() {
      if (this.o == null)
        this.o = Boolean.valueOf(this.h.a()); 
      return this.o.booleanValue();
    }
    
    public boolean a(int[] param1ArrayOfint) {
      return this.h.a(param1ArrayOfint);
    }
    
    public float getAlpha() {
      return getRootAlpha() / 255.0F;
    }
    
    public int getRootAlpha() {
      return this.m;
    }
    
    public void setAlpha(float param1Float) {
      setRootAlpha((int)(param1Float * 255.0F));
    }
    
    public void setRootAlpha(int param1Int) {
      this.m = param1Int;
    }
  }
  
  private static class h extends Drawable.ConstantState {
    int a;
    
    i.g b;
    
    ColorStateList c = null;
    
    PorterDuff.Mode d = i.l;
    
    boolean e;
    
    Bitmap f;
    
    ColorStateList g;
    
    PorterDuff.Mode h;
    
    int i;
    
    boolean j;
    
    boolean k;
    
    Paint l;
    
    public h() {
      this.b = new i.g();
    }
    
    public h(h param1h) {
      if (param1h != null) {
        this.a = param1h.a;
        this.b = new i.g(param1h.b);
        Paint paint = param1h.b.e;
        if (paint != null)
          this.b.e = new Paint(paint); 
        paint = param1h.b.d;
        if (paint != null)
          this.b.d = new Paint(paint); 
        this.c = param1h.c;
        this.d = param1h.d;
        this.e = param1h.e;
      } 
    }
    
    public Paint a(ColorFilter param1ColorFilter) {
      if (!b() && param1ColorFilter == null)
        return null; 
      if (this.l == null) {
        this.l = new Paint();
        this.l.setFilterBitmap(true);
      } 
      this.l.setAlpha(this.b.getRootAlpha());
      this.l.setColorFilter(param1ColorFilter);
      return this.l;
    }
    
    public void a(Canvas param1Canvas, ColorFilter param1ColorFilter, Rect param1Rect) {
      Paint paint = a(param1ColorFilter);
      param1Canvas.drawBitmap(this.f, null, param1Rect, paint);
    }
    
    public boolean a() {
      return (!this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha());
    }
    
    public boolean a(int param1Int1, int param1Int2) {
      return (param1Int1 == this.f.getWidth() && param1Int2 == this.f.getHeight());
    }
    
    public boolean a(int[] param1ArrayOfint) {
      boolean bool = this.b.a(param1ArrayOfint);
      this.k |= bool;
      return bool;
    }
    
    public void b(int param1Int1, int param1Int2) {
      if (this.f == null || !a(param1Int1, param1Int2)) {
        this.f = Bitmap.createBitmap(param1Int1, param1Int2, Bitmap.Config.ARGB_8888);
        this.k = true;
      } 
    }
    
    public boolean b() {
      return (this.b.getRootAlpha() < 255);
    }
    
    public void c(int param1Int1, int param1Int2) {
      this.f.eraseColor(0);
      Canvas canvas = new Canvas(this.f);
      this.b.a(canvas, param1Int1, param1Int2, (ColorFilter)null);
    }
    
    public boolean c() {
      return this.b.a();
    }
    
    public void d() {
      this.g = this.c;
      this.h = this.d;
      this.i = this.b.getRootAlpha();
      this.j = this.e;
      this.k = false;
    }
    
    public int getChangingConfigurations() {
      return this.a;
    }
    
    public Drawable newDrawable() {
      return new i(this);
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      return new i(this);
    }
  }
  
  private static class i extends Drawable.ConstantState {
    private final Drawable.ConstantState a;
    
    public i(Drawable.ConstantState param1ConstantState) {
      this.a = param1ConstantState;
    }
    
    public boolean canApplyTheme() {
      return this.a.canApplyTheme();
    }
    
    public int getChangingConfigurations() {
      return this.a.getChangingConfigurations();
    }
    
    public Drawable newDrawable() {
      i i1 = new i();
      i1.c = this.a.newDrawable();
      return i1;
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      i i1 = new i();
      i1.c = this.a.newDrawable(param1Resources);
      return i1;
    }
    
    public Drawable newDrawable(Resources param1Resources, Resources.Theme param1Theme) {
      i i1 = new i();
      i1.c = this.a.newDrawable(param1Resources, param1Theme);
      return i1;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/s/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */