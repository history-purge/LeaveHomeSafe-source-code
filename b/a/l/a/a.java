package b.a.l.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.m0;
import androidx.core.graphics.drawable.b;
import b.d.h;
import b.s.a.a.i;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
public class a extends d implements b {
  private c q;
  
  private g r;
  
  private int s = -1;
  
  private int t = -1;
  
  private boolean u;
  
  public a() {
    this((c)null, (Resources)null);
  }
  
  a(c paramc, Resources paramResources) {
    super((d.a)null);
    a(new c(paramc, this, paramResources));
    onStateChange(getState());
    jumpToCurrentState();
  }
  
  private void a(TypedArray paramTypedArray) {
    c c1 = this.q;
    if (Build.VERSION.SDK_INT >= 21)
      c1.d |= paramTypedArray.getChangingConfigurations(); 
    c1.b(paramTypedArray.getBoolean(b.a.m.b.AnimatedStateListDrawableCompat_android_variablePadding, c1.i));
    c1.a(paramTypedArray.getBoolean(b.a.m.b.AnimatedStateListDrawableCompat_android_constantSize, c1.l));
    c1.b(paramTypedArray.getInt(b.a.m.b.AnimatedStateListDrawableCompat_android_enterFadeDuration, c1.A));
    c1.c(paramTypedArray.getInt(b.a.m.b.AnimatedStateListDrawableCompat_android_exitFadeDuration, c1.B));
    setDither(paramTypedArray.getBoolean(b.a.m.b.AnimatedStateListDrawableCompat_android_dither, c1.x));
  }
  
  public static a b(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    a a1;
    String str = paramXmlPullParser.getName();
    if (str.equals("animated-selector")) {
      a1 = new a();
      a1.a(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return a1;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramXmlPullParser.getPositionDescription());
    stringBuilder.append(": invalid animated-selector tag ");
    stringBuilder.append((String)a1);
    throw new XmlPullParserException(stringBuilder.toString());
  }
  
  private boolean b(int paramInt) {
    int i;
    g g1 = this.r;
    if (g1 != null) {
      if (paramInt == this.s)
        return true; 
      if (paramInt == this.t && g1.a()) {
        g1.b();
        this.s = this.t;
        this.t = paramInt;
        return true;
      } 
      i = this.s;
      g1.d();
    } else {
      i = b();
    } 
    this.r = null;
    this.t = -1;
    this.s = -1;
    c c1 = this.q;
    int j = c1.d(i);
    int k = c1.d(paramInt);
    if (k != 0) {
      b b1;
      if (j == 0)
        return false; 
      int m = c1.c(j, k);
      if (m < 0)
        return false; 
      boolean bool = c1.e(j, k);
      a(m);
      Drawable drawable = getCurrent();
      if (drawable instanceof AnimationDrawable) {
        boolean bool1 = c1.d(j, k);
        e e = new e((AnimationDrawable)drawable, bool1, bool);
      } else if (drawable instanceof b.s.a.a.c) {
        d d1 = new d((b.s.a.a.c)drawable);
      } else {
        if (drawable instanceof Animatable) {
          b1 = new b((Animatable)drawable);
          b1.c();
          this.r = b1;
          this.t = i;
          this.s = paramInt;
          return true;
        } 
        return false;
      } 
      b1.c();
      this.r = b1;
      this.t = i;
      this.s = paramInt;
      return true;
    } 
    return false;
  }
  
  private void c() {
    onStateChange(getState());
  }
  
  private void c(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    int i = paramXmlPullParser.getDepth() + 1;
    while (true) {
      int j = paramXmlPullParser.next();
      if (j != 1) {
        int k = paramXmlPullParser.getDepth();
        if (k >= i || j != 3) {
          if (j != 2 || k > i)
            continue; 
          if (paramXmlPullParser.getName().equals("item")) {
            d(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
            continue;
          } 
          if (paramXmlPullParser.getName().equals("transition"))
            e(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme); 
          continue;
        } 
      } 
      break;
    } 
  }
  
  private int d(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    XmlPullParserException xmlPullParserException2;
    Context context;
    TypedArray typedArray = b.g.e.d.g.a(paramResources, paramTheme, paramAttributeSet, b.a.m.b.AnimatedStateListDrawableItem);
    int i = typedArray.getResourceId(b.a.m.b.AnimatedStateListDrawableItem_android_id, 0);
    int j = typedArray.getResourceId(b.a.m.b.AnimatedStateListDrawableItem_android_drawable, -1);
    if (j > 0) {
      context = (Context)m0.a().a(paramContext, j);
    } else {
      context = null;
    } 
    typedArray.recycle();
    int[] arrayOfInt = a(paramAttributeSet);
    paramContext = context;
    if (context == null)
      while (true) {
        j = paramXmlPullParser.next();
        if (j == 4)
          continue; 
        if (j == 2) {
          if (paramXmlPullParser.getName().equals("vector")) {
            i i1 = i.createFromXmlInner(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
            break;
          } 
          if (Build.VERSION.SDK_INT >= 21) {
            Drawable drawable = Drawable.createFromXmlInner(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
          } else {
            Drawable drawable = Drawable.createFromXmlInner(paramResources, paramXmlPullParser, paramAttributeSet);
          } 
        } else {
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append(paramXmlPullParser.getPositionDescription());
          stringBuilder1.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
          throw new XmlPullParserException(stringBuilder1.toString());
        } 
        if (stringBuilder1 != null)
          return this.q.a(arrayOfInt, (Drawable)stringBuilder1, i); 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(paramXmlPullParser.getPositionDescription());
        stringBuilder1.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        xmlPullParserException2 = new XmlPullParserException(stringBuilder1.toString());
        throw xmlPullParserException2;
      }  
    if (xmlPullParserException2 != null)
      return this.q.a(arrayOfInt, (Drawable)xmlPullParserException2, i); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramXmlPullParser.getPositionDescription());
    stringBuilder.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    XmlPullParserException xmlPullParserException1 = new XmlPullParserException(stringBuilder.toString());
    throw xmlPullParserException1;
  }
  
  private int e(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    // Byte code:
    //   0: aload_2
    //   1: aload #5
    //   3: aload #4
    //   5: getstatic b/a/m/b.AnimatedStateListDrawableTransition : [I
    //   8: invokestatic a : (Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   11: astore #10
    //   13: aload #10
    //   15: getstatic b/a/m/b.AnimatedStateListDrawableTransition_android_fromId : I
    //   18: iconst_m1
    //   19: invokevirtual getResourceId : (II)I
    //   22: istore #6
    //   24: aload #10
    //   26: getstatic b/a/m/b.AnimatedStateListDrawableTransition_android_toId : I
    //   29: iconst_m1
    //   30: invokevirtual getResourceId : (II)I
    //   33: istore #7
    //   35: aload #10
    //   37: getstatic b/a/m/b.AnimatedStateListDrawableTransition_android_drawable : I
    //   40: iconst_m1
    //   41: invokevirtual getResourceId : (II)I
    //   44: istore #8
    //   46: iload #8
    //   48: ifle -> 65
    //   51: invokestatic a : ()Landroidx/appcompat/widget/m0;
    //   54: aload_1
    //   55: iload #8
    //   57: invokevirtual a : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   60: astore #11
    //   62: goto -> 68
    //   65: aconst_null
    //   66: astore #11
    //   68: aload #10
    //   70: getstatic b/a/m/b.AnimatedStateListDrawableTransition_android_reversible : I
    //   73: iconst_0
    //   74: invokevirtual getBoolean : (IZ)Z
    //   77: istore #9
    //   79: aload #10
    //   81: invokevirtual recycle : ()V
    //   84: aload #11
    //   86: astore #10
    //   88: aload #11
    //   90: ifnonnull -> 219
    //   93: aload_3
    //   94: invokeinterface next : ()I
    //   99: istore #8
    //   101: iload #8
    //   103: iconst_4
    //   104: if_icmpne -> 110
    //   107: goto -> 93
    //   110: iload #8
    //   112: iconst_2
    //   113: if_icmpne -> 180
    //   116: aload_3
    //   117: invokeinterface getName : ()Ljava/lang/String;
    //   122: ldc_w 'animated-vector'
    //   125: invokevirtual equals : (Ljava/lang/Object;)Z
    //   128: ifeq -> 146
    //   131: aload_1
    //   132: aload_2
    //   133: aload_3
    //   134: aload #4
    //   136: aload #5
    //   138: invokestatic a : (Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lb/s/a/a/c;
    //   141: astore #10
    //   143: goto -> 219
    //   146: getstatic android/os/Build$VERSION.SDK_INT : I
    //   149: bipush #21
    //   151: if_icmplt -> 168
    //   154: aload_2
    //   155: aload_3
    //   156: aload #4
    //   158: aload #5
    //   160: invokestatic createFromXmlInner : (Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    //   163: astore #10
    //   165: goto -> 219
    //   168: aload_2
    //   169: aload_3
    //   170: aload #4
    //   172: invokestatic createFromXmlInner : (Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)Landroid/graphics/drawable/Drawable;
    //   175: astore #10
    //   177: goto -> 219
    //   180: new java/lang/StringBuilder
    //   183: dup
    //   184: invokespecial <init> : ()V
    //   187: astore_1
    //   188: aload_1
    //   189: aload_3
    //   190: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: aload_1
    //   200: ldc_w ': <transition> tag requires a 'drawable' attribute or child tag defining a drawable'
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: new org/xmlpull/v1/XmlPullParserException
    //   210: dup
    //   211: aload_1
    //   212: invokevirtual toString : ()Ljava/lang/String;
    //   215: invokespecial <init> : (Ljava/lang/String;)V
    //   218: athrow
    //   219: aload #10
    //   221: ifnull -> 291
    //   224: iload #6
    //   226: iconst_m1
    //   227: if_icmpeq -> 252
    //   230: iload #7
    //   232: iconst_m1
    //   233: if_icmpeq -> 252
    //   236: aload_0
    //   237: getfield q : Lb/a/l/a/a$c;
    //   240: iload #6
    //   242: iload #7
    //   244: aload #10
    //   246: iload #9
    //   248: invokevirtual a : (IILandroid/graphics/drawable/Drawable;Z)I
    //   251: ireturn
    //   252: new java/lang/StringBuilder
    //   255: dup
    //   256: invokespecial <init> : ()V
    //   259: astore_1
    //   260: aload_1
    //   261: aload_3
    //   262: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: pop
    //   271: aload_1
    //   272: ldc_w ': <transition> tag requires 'fromId' & 'toId' attributes'
    //   275: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: pop
    //   279: new org/xmlpull/v1/XmlPullParserException
    //   282: dup
    //   283: aload_1
    //   284: invokevirtual toString : ()Ljava/lang/String;
    //   287: invokespecial <init> : (Ljava/lang/String;)V
    //   290: athrow
    //   291: new java/lang/StringBuilder
    //   294: dup
    //   295: invokespecial <init> : ()V
    //   298: astore_1
    //   299: aload_1
    //   300: aload_3
    //   301: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   306: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: pop
    //   310: aload_1
    //   311: ldc_w ': <transition> tag requires a 'drawable' attribute or child tag defining a drawable'
    //   314: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: pop
    //   318: new org/xmlpull/v1/XmlPullParserException
    //   321: dup
    //   322: aload_1
    //   323: invokevirtual toString : ()Ljava/lang/String;
    //   326: invokespecial <init> : (Ljava/lang/String;)V
    //   329: astore_1
    //   330: goto -> 335
    //   333: aload_1
    //   334: athrow
    //   335: goto -> 333
  }
  
  c a() {
    return new c(this.q, this, null);
  }
  
  public void a(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    TypedArray typedArray = b.g.e.d.g.a(paramResources, paramTheme, paramAttributeSet, b.a.m.b.AnimatedStateListDrawableCompat);
    setVisible(typedArray.getBoolean(b.a.m.b.AnimatedStateListDrawableCompat_android_visible, true), true);
    a(typedArray);
    a(paramResources);
    typedArray.recycle();
    c(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    c();
  }
  
  void a(b.c paramc) {
    super.a(paramc);
    if (paramc instanceof c)
      this.q = (c)paramc; 
  }
  
  public boolean isStateful() {
    return true;
  }
  
  public void jumpToCurrentState() {
    super.jumpToCurrentState();
    g g1 = this.r;
    if (g1 != null) {
      g1.d();
      this.r = null;
      a(this.s);
      this.s = -1;
      this.t = -1;
    } 
  }
  
  public Drawable mutate() {
    if (!this.u) {
      super.mutate();
      this.q.m();
      this.u = true;
    } 
    return this;
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    boolean bool1;
    int i = this.q.b(paramArrayOfint);
    if (i != b() && (b(i) || a(i))) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    Drawable drawable = getCurrent();
    boolean bool2 = bool1;
    if (drawable != null)
      bool2 = bool1 | drawable.setState(paramArrayOfint); 
    return bool2;
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    if (this.r != null && (bool || paramBoolean2)) {
      if (paramBoolean1) {
        this.r.c();
        return bool;
      } 
      jumpToCurrentState();
    } 
    return bool;
  }
  
  private static class b extends g {
    private final Animatable a;
    
    b(Animatable param1Animatable) {
      super(null);
      this.a = param1Animatable;
    }
    
    public void c() {
      this.a.start();
    }
    
    public void d() {
      this.a.stop();
    }
  }
  
  static class c extends d.a {
    b.d.d<Long> K;
    
    h<Integer> L;
    
    c(c param1c, a param1a, Resources param1Resources) {
      super(param1c, param1a, param1Resources);
      h<Integer> h1;
      if (param1c != null) {
        this.K = param1c.K;
        h1 = param1c.L;
      } else {
        this.K = new b.d.d();
        h1 = new h();
      } 
      this.L = h1;
    }
    
    private static long f(int param1Int1, int param1Int2) {
      long l = param1Int1;
      return param1Int2 | l << 32L;
    }
    
    int a(int param1Int1, int param1Int2, Drawable param1Drawable, boolean param1Boolean) {
      long l1;
      int i = a(param1Drawable);
      long l2 = f(param1Int1, param1Int2);
      if (param1Boolean) {
        l1 = 8589934592L;
      } else {
        l1 = 0L;
      } 
      b.d.d<Long> d1 = this.K;
      long l3 = i;
      d1.a(l2, Long.valueOf(l3 | l1));
      if (param1Boolean) {
        l2 = f(param1Int2, param1Int1);
        this.K.a(l2, Long.valueOf(0x100000000L | l3 | l1));
      } 
      return i;
    }
    
    int a(int[] param1ArrayOfint, Drawable param1Drawable, int param1Int) {
      int i = a(param1ArrayOfint, param1Drawable);
      this.L.c(i, Integer.valueOf(param1Int));
      return i;
    }
    
    int b(int[] param1ArrayOfint) {
      int i = a(param1ArrayOfint);
      return (i >= 0) ? i : a(StateSet.WILD_CARD);
    }
    
    int c(int param1Int1, int param1Int2) {
      long l = f(param1Int1, param1Int2);
      return (int)((Long)this.K.b(l, Long.valueOf(-1L))).longValue();
    }
    
    int d(int param1Int) {
      return (param1Int < 0) ? 0 : ((Integer)this.L.b(param1Int, Integer.valueOf(0))).intValue();
    }
    
    boolean d(int param1Int1, int param1Int2) {
      long l = f(param1Int1, param1Int2);
      return ((((Long)this.K.b(l, Long.valueOf(-1L))).longValue() & 0x100000000L) != 0L);
    }
    
    boolean e(int param1Int1, int param1Int2) {
      long l = f(param1Int1, param1Int2);
      return ((((Long)this.K.b(l, Long.valueOf(-1L))).longValue() & 0x200000000L) != 0L);
    }
    
    void m() {
      this.K = this.K.clone();
      this.L = this.L.clone();
    }
    
    public Drawable newDrawable() {
      return new a(this, null);
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      return new a(this, param1Resources);
    }
  }
  
  private static class d extends g {
    private final b.s.a.a.c a;
    
    d(b.s.a.a.c param1c) {
      super(null);
      this.a = param1c;
    }
    
    public void c() {
      this.a.start();
    }
    
    public void d() {
      this.a.stop();
    }
  }
  
  private static class e extends g {
    private final ObjectAnimator a;
    
    private final boolean b;
    
    e(AnimationDrawable param1AnimationDrawable, boolean param1Boolean1, boolean param1Boolean2) {
      super(null);
      boolean bool;
      int i = param1AnimationDrawable.getNumberOfFrames();
      if (param1Boolean1) {
        bool = i - 1;
      } else {
        bool = false;
      } 
      if (param1Boolean1) {
        i = 0;
      } else {
        i--;
      } 
      a.f f = new a.f(param1AnimationDrawable, param1Boolean1);
      ObjectAnimator objectAnimator = ObjectAnimator.ofInt(param1AnimationDrawable, "currentIndex", new int[] { bool, i });
      if (Build.VERSION.SDK_INT >= 18)
        objectAnimator.setAutoCancel(true); 
      objectAnimator.setDuration(f.a());
      objectAnimator.setInterpolator(f);
      this.b = param1Boolean2;
      this.a = objectAnimator;
    }
    
    public boolean a() {
      return this.b;
    }
    
    public void b() {
      this.a.reverse();
    }
    
    public void c() {
      this.a.start();
    }
    
    public void d() {
      this.a.cancel();
    }
  }
  
  private static class f implements TimeInterpolator {
    private int[] a;
    
    private int b;
    
    private int c;
    
    f(AnimationDrawable param1AnimationDrawable, boolean param1Boolean) {
      a(param1AnimationDrawable, param1Boolean);
    }
    
    int a() {
      return this.c;
    }
    
    int a(AnimationDrawable param1AnimationDrawable, boolean param1Boolean) {
      int k = param1AnimationDrawable.getNumberOfFrames();
      this.b = k;
      int[] arrayOfInt = this.a;
      if (arrayOfInt == null || arrayOfInt.length < k)
        this.a = new int[k]; 
      arrayOfInt = this.a;
      int i = 0;
      int j = 0;
      while (i < k) {
        if (param1Boolean) {
          m = k - i - 1;
        } else {
          m = i;
        } 
        int m = param1AnimationDrawable.getDuration(m);
        arrayOfInt[i] = m;
        j += m;
        i++;
      } 
      this.c = j;
      return j;
    }
    
    public float getInterpolation(float param1Float) {
      int j = (int)(param1Float * this.c + 0.5F);
      int k = this.b;
      int[] arrayOfInt = this.a;
      int i;
      for (i = 0; i < k && j >= arrayOfInt[i]; i++)
        j -= arrayOfInt[i]; 
      if (i < k) {
        param1Float = j / this.c;
      } else {
        param1Float = 0.0F;
      } 
      return i / k + param1Float;
    }
  }
  
  private static abstract class g {
    private g() {}
    
    public boolean a() {
      return false;
    }
    
    public void b() {}
    
    public abstract void c();
    
    public abstract void d();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/a/l/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */