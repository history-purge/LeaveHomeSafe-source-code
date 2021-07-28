package b.a.l.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

class b extends Drawable implements Drawable.Callback {
  private c c;
  
  private Rect d;
  
  private Drawable e;
  
  private Drawable f;
  
  private int g = 255;
  
  private boolean h;
  
  private int i = -1;
  
  private boolean j;
  
  private Runnable k;
  
  private long l;
  
  private long m;
  
  private b n;
  
  static int a(Resources paramResources, int paramInt) {
    if (paramResources != null)
      paramInt = (paramResources.getDisplayMetrics()).densityDpi; 
    int i = paramInt;
    if (paramInt == 0)
      i = 160; 
    return i;
  }
  
  private void a(Drawable paramDrawable) {
    if (this.n == null)
      this.n = new b(); 
    null = this.n;
    null.a(paramDrawable.getCallback());
    paramDrawable.setCallback(null);
    try {
      if (this.c.A <= 0 && this.h)
        paramDrawable.setAlpha(this.g); 
      if (this.c.E) {
        paramDrawable.setColorFilter(this.c.D);
      } else {
        if (this.c.H)
          androidx.core.graphics.drawable.a.a(paramDrawable, this.c.F); 
        if (this.c.I)
          androidx.core.graphics.drawable.a.a(paramDrawable, this.c.G); 
      } 
      paramDrawable.setVisible(isVisible(), true);
      paramDrawable.setDither(this.c.x);
      paramDrawable.setState(getState());
      paramDrawable.setLevel(getLevel());
      paramDrawable.setBounds(getBounds());
      if (Build.VERSION.SDK_INT >= 23)
        paramDrawable.setLayoutDirection(getLayoutDirection()); 
      if (Build.VERSION.SDK_INT >= 19)
        paramDrawable.setAutoMirrored(this.c.C); 
      Rect rect = this.d;
      if (Build.VERSION.SDK_INT >= 21 && rect != null)
        paramDrawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom); 
      return;
    } finally {
      paramDrawable.setCallback(this.n.a());
    } 
  }
  
  private boolean c() {
    return (isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1);
  }
  
  c a() {
    throw null;
  }
  
  final void a(Resources paramResources) {
    this.c.a(paramResources);
  }
  
  void a(c paramc) {
    this.c = paramc;
    int i = this.i;
    if (i >= 0) {
      this.e = paramc.a(i);
      Drawable drawable = this.e;
      if (drawable != null)
        a(drawable); 
    } 
    this.f = null;
  }
  
  void a(boolean paramBoolean) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield h : Z
    //   7: invokestatic uptimeMillis : ()J
    //   10: lstore #4
    //   12: aload_0
    //   13: getfield e : Landroid/graphics/drawable/Drawable;
    //   16: astore #8
    //   18: aload #8
    //   20: ifnull -> 97
    //   23: aload_0
    //   24: getfield l : J
    //   27: lstore #6
    //   29: lload #6
    //   31: lconst_0
    //   32: lcmp
    //   33: ifeq -> 102
    //   36: lload #6
    //   38: lload #4
    //   40: lcmp
    //   41: ifgt -> 56
    //   44: aload #8
    //   46: aload_0
    //   47: getfield g : I
    //   50: invokevirtual setAlpha : (I)V
    //   53: goto -> 97
    //   56: aload #8
    //   58: sipush #255
    //   61: lload #6
    //   63: lload #4
    //   65: lsub
    //   66: ldc2_w 255
    //   69: lmul
    //   70: l2i
    //   71: aload_0
    //   72: getfield c : Lb/a/l/a/b$c;
    //   75: getfield A : I
    //   78: idiv
    //   79: isub
    //   80: aload_0
    //   81: getfield g : I
    //   84: imul
    //   85: sipush #255
    //   88: idiv
    //   89: invokevirtual setAlpha : (I)V
    //   92: iconst_1
    //   93: istore_2
    //   94: goto -> 104
    //   97: aload_0
    //   98: lconst_0
    //   99: putfield l : J
    //   102: iconst_0
    //   103: istore_2
    //   104: aload_0
    //   105: getfield f : Landroid/graphics/drawable/Drawable;
    //   108: astore #8
    //   110: aload #8
    //   112: ifnull -> 189
    //   115: aload_0
    //   116: getfield m : J
    //   119: lstore #6
    //   121: lload #6
    //   123: lconst_0
    //   124: lcmp
    //   125: ifeq -> 194
    //   128: lload #6
    //   130: lload #4
    //   132: lcmp
    //   133: ifgt -> 152
    //   136: aload #8
    //   138: iconst_0
    //   139: iconst_0
    //   140: invokevirtual setVisible : (ZZ)Z
    //   143: pop
    //   144: aload_0
    //   145: aconst_null
    //   146: putfield f : Landroid/graphics/drawable/Drawable;
    //   149: goto -> 189
    //   152: aload #8
    //   154: lload #6
    //   156: lload #4
    //   158: lsub
    //   159: ldc2_w 255
    //   162: lmul
    //   163: l2i
    //   164: aload_0
    //   165: getfield c : Lb/a/l/a/b$c;
    //   168: getfield B : I
    //   171: idiv
    //   172: aload_0
    //   173: getfield g : I
    //   176: imul
    //   177: sipush #255
    //   180: idiv
    //   181: invokevirtual setAlpha : (I)V
    //   184: iload_3
    //   185: istore_2
    //   186: goto -> 194
    //   189: aload_0
    //   190: lconst_0
    //   191: putfield m : J
    //   194: iload_1
    //   195: ifeq -> 216
    //   198: iload_2
    //   199: ifeq -> 216
    //   202: aload_0
    //   203: aload_0
    //   204: getfield k : Ljava/lang/Runnable;
    //   207: lload #4
    //   209: ldc2_w 16
    //   212: ladd
    //   213: invokevirtual scheduleSelf : (Ljava/lang/Runnable;J)V
    //   216: return
  }
  
  boolean a(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield i : I
    //   5: if_icmpne -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: invokestatic uptimeMillis : ()J
    //   13: lstore_2
    //   14: aload_0
    //   15: getfield c : Lb/a/l/a/b$c;
    //   18: getfield B : I
    //   21: ifle -> 90
    //   24: aload_0
    //   25: getfield f : Landroid/graphics/drawable/Drawable;
    //   28: astore #4
    //   30: aload #4
    //   32: ifnull -> 43
    //   35: aload #4
    //   37: iconst_0
    //   38: iconst_0
    //   39: invokevirtual setVisible : (ZZ)Z
    //   42: pop
    //   43: aload_0
    //   44: getfield e : Landroid/graphics/drawable/Drawable;
    //   47: astore #4
    //   49: aload #4
    //   51: ifnull -> 77
    //   54: aload_0
    //   55: aload #4
    //   57: putfield f : Landroid/graphics/drawable/Drawable;
    //   60: aload_0
    //   61: aload_0
    //   62: getfield c : Lb/a/l/a/b$c;
    //   65: getfield B : I
    //   68: i2l
    //   69: lload_2
    //   70: ladd
    //   71: putfield m : J
    //   74: goto -> 109
    //   77: aload_0
    //   78: aconst_null
    //   79: putfield f : Landroid/graphics/drawable/Drawable;
    //   82: aload_0
    //   83: lconst_0
    //   84: putfield m : J
    //   87: goto -> 109
    //   90: aload_0
    //   91: getfield e : Landroid/graphics/drawable/Drawable;
    //   94: astore #4
    //   96: aload #4
    //   98: ifnull -> 109
    //   101: aload #4
    //   103: iconst_0
    //   104: iconst_0
    //   105: invokevirtual setVisible : (ZZ)Z
    //   108: pop
    //   109: iload_1
    //   110: iflt -> 181
    //   113: aload_0
    //   114: getfield c : Lb/a/l/a/b$c;
    //   117: astore #4
    //   119: iload_1
    //   120: aload #4
    //   122: getfield h : I
    //   125: if_icmpge -> 181
    //   128: aload #4
    //   130: iload_1
    //   131: invokevirtual a : (I)Landroid/graphics/drawable/Drawable;
    //   134: astore #4
    //   136: aload_0
    //   137: aload #4
    //   139: putfield e : Landroid/graphics/drawable/Drawable;
    //   142: aload_0
    //   143: iload_1
    //   144: putfield i : I
    //   147: aload #4
    //   149: ifnull -> 191
    //   152: aload_0
    //   153: getfield c : Lb/a/l/a/b$c;
    //   156: getfield A : I
    //   159: istore_1
    //   160: iload_1
    //   161: ifle -> 172
    //   164: aload_0
    //   165: lload_2
    //   166: iload_1
    //   167: i2l
    //   168: ladd
    //   169: putfield l : J
    //   172: aload_0
    //   173: aload #4
    //   175: invokespecial a : (Landroid/graphics/drawable/Drawable;)V
    //   178: goto -> 191
    //   181: aload_0
    //   182: aconst_null
    //   183: putfield e : Landroid/graphics/drawable/Drawable;
    //   186: aload_0
    //   187: iconst_m1
    //   188: putfield i : I
    //   191: aload_0
    //   192: getfield l : J
    //   195: lconst_0
    //   196: lcmp
    //   197: ifne -> 209
    //   200: aload_0
    //   201: getfield m : J
    //   204: lconst_0
    //   205: lcmp
    //   206: ifeq -> 246
    //   209: aload_0
    //   210: getfield k : Ljava/lang/Runnable;
    //   213: astore #4
    //   215: aload #4
    //   217: ifnonnull -> 235
    //   220: aload_0
    //   221: new b/a/l/a/b$a
    //   224: dup
    //   225: aload_0
    //   226: invokespecial <init> : (Lb/a/l/a/b;)V
    //   229: putfield k : Ljava/lang/Runnable;
    //   232: goto -> 241
    //   235: aload_0
    //   236: aload #4
    //   238: invokevirtual unscheduleSelf : (Ljava/lang/Runnable;)V
    //   241: aload_0
    //   242: iconst_1
    //   243: invokevirtual a : (Z)V
    //   246: aload_0
    //   247: invokevirtual invalidateSelf : ()V
    //   250: iconst_1
    //   251: ireturn
  }
  
  public void applyTheme(Resources.Theme paramTheme) {
    this.c.a(paramTheme);
  }
  
  int b() {
    return this.i;
  }
  
  public boolean canApplyTheme() {
    return this.c.canApplyTheme();
  }
  
  public void draw(Canvas paramCanvas) {
    Drawable drawable = this.e;
    if (drawable != null)
      drawable.draw(paramCanvas); 
    drawable = this.f;
    if (drawable != null)
      drawable.draw(paramCanvas); 
  }
  
  public int getAlpha() {
    return this.g;
  }
  
  public int getChangingConfigurations() {
    return super.getChangingConfigurations() | this.c.getChangingConfigurations();
  }
  
  public final Drawable.ConstantState getConstantState() {
    if (this.c.a()) {
      this.c.d = getChangingConfigurations();
      return this.c;
    } 
    return null;
  }
  
  public Drawable getCurrent() {
    return this.e;
  }
  
  public void getHotspotBounds(Rect paramRect) {
    Rect rect = this.d;
    if (rect != null) {
      paramRect.set(rect);
      return;
    } 
    super.getHotspotBounds(paramRect);
  }
  
  public int getIntrinsicHeight() {
    if (this.c.l())
      return this.c.e(); 
    Drawable drawable = this.e;
    return (drawable != null) ? drawable.getIntrinsicHeight() : -1;
  }
  
  public int getIntrinsicWidth() {
    if (this.c.l())
      return this.c.i(); 
    Drawable drawable = this.e;
    return (drawable != null) ? drawable.getIntrinsicWidth() : -1;
  }
  
  public int getMinimumHeight() {
    if (this.c.l())
      return this.c.f(); 
    Drawable drawable = this.e;
    return (drawable != null) ? drawable.getMinimumHeight() : 0;
  }
  
  public int getMinimumWidth() {
    if (this.c.l())
      return this.c.g(); 
    Drawable drawable = this.e;
    return (drawable != null) ? drawable.getMinimumWidth() : 0;
  }
  
  public int getOpacity() {
    Drawable drawable = this.e;
    return (drawable == null || !drawable.isVisible()) ? -2 : this.c.j();
  }
  
  public void getOutline(Outline paramOutline) {
    Drawable drawable = this.e;
    if (drawable != null)
      drawable.getOutline(paramOutline); 
  }
  
  public boolean getPadding(Rect paramRect) {
    boolean bool;
    Rect rect = this.c.h();
    if (rect != null) {
      paramRect.set(rect);
      int i = rect.left;
      int j = rect.top;
      int k = rect.bottom;
      if ((rect.right | i | j | k) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
    } else {
      Drawable drawable = this.e;
      if (drawable != null) {
        bool = drawable.getPadding(paramRect);
      } else {
        bool = super.getPadding(paramRect);
      } 
    } 
    if (c()) {
      int i = paramRect.left;
      paramRect.left = paramRect.right;
      paramRect.right = i;
    } 
    return bool;
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    c c1 = this.c;
    if (c1 != null)
      c1.k(); 
    if (paramDrawable == this.e && getCallback() != null)
      getCallback().invalidateDrawable(this); 
  }
  
  public boolean isAutoMirrored() {
    return this.c.C;
  }
  
  public void jumpToCurrentState() {
    boolean bool;
    Drawable drawable = this.f;
    if (drawable != null) {
      drawable.jumpToCurrentState();
      this.f = null;
      bool = true;
    } else {
      bool = false;
    } 
    drawable = this.e;
    if (drawable != null) {
      drawable.jumpToCurrentState();
      if (this.h)
        this.e.setAlpha(this.g); 
    } 
    if (this.m != 0L) {
      this.m = 0L;
      bool = true;
    } 
    if (this.l != 0L) {
      this.l = 0L;
      bool = true;
    } 
    if (bool)
      invalidateSelf(); 
  }
  
  public Drawable mutate() {
    if (!this.j && super.mutate() == this) {
      c c1 = a();
      c1.m();
      a(c1);
      this.j = true;
    } 
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.f;
    if (drawable != null)
      drawable.setBounds(paramRect); 
    drawable = this.e;
    if (drawable != null)
      drawable.setBounds(paramRect); 
  }
  
  public boolean onLayoutDirectionChanged(int paramInt) {
    return this.c.b(paramInt, b());
  }
  
  protected boolean onLevelChange(int paramInt) {
    Drawable drawable = this.f;
    if (drawable != null)
      return drawable.setLevel(paramInt); 
    drawable = this.e;
    return (drawable != null) ? drawable.setLevel(paramInt) : false;
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    Drawable drawable = this.f;
    if (drawable != null)
      return drawable.setState(paramArrayOfint); 
    drawable = this.e;
    return (drawable != null) ? drawable.setState(paramArrayOfint) : false;
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    if (paramDrawable == this.e && getCallback() != null)
      getCallback().scheduleDrawable(this, paramRunnable, paramLong); 
  }
  
  public void setAlpha(int paramInt) {
    if (!this.h || this.g != paramInt) {
      this.h = true;
      this.g = paramInt;
      Drawable drawable = this.e;
      if (drawable != null) {
        if (this.l == 0L) {
          drawable.setAlpha(paramInt);
          return;
        } 
        a(false);
      } 
    } 
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    c c1 = this.c;
    if (c1.C != paramBoolean) {
      c1.C = paramBoolean;
      Drawable drawable = this.e;
      if (drawable != null)
        androidx.core.graphics.drawable.a.a(drawable, c1.C); 
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    c c1 = this.c;
    c1.E = true;
    if (c1.D != paramColorFilter) {
      c1.D = paramColorFilter;
      Drawable drawable = this.e;
      if (drawable != null)
        drawable.setColorFilter(paramColorFilter); 
    } 
  }
  
  public void setDither(boolean paramBoolean) {
    c c1 = this.c;
    if (c1.x != paramBoolean) {
      c1.x = paramBoolean;
      Drawable drawable = this.e;
      if (drawable != null)
        drawable.setDither(c1.x); 
    } 
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2) {
    Drawable drawable = this.e;
    if (drawable != null)
      androidx.core.graphics.drawable.a.a(drawable, paramFloat1, paramFloat2); 
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Rect rect = this.d;
    if (rect == null) {
      this.d = new Rect(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      rect.set(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
    Drawable drawable = this.e;
    if (drawable != null)
      androidx.core.graphics.drawable.a.a(drawable, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    c c1 = this.c;
    c1.H = true;
    if (c1.F != paramColorStateList) {
      c1.F = paramColorStateList;
      androidx.core.graphics.drawable.a.a(this.e, paramColorStateList);
    } 
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    c c1 = this.c;
    c1.I = true;
    if (c1.G != paramMode) {
      c1.G = paramMode;
      androidx.core.graphics.drawable.a.a(this.e, paramMode);
    } 
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    Drawable drawable = this.f;
    if (drawable != null)
      drawable.setVisible(paramBoolean1, paramBoolean2); 
    drawable = this.e;
    if (drawable != null)
      drawable.setVisible(paramBoolean1, paramBoolean2); 
    return bool;
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    if (paramDrawable == this.e && getCallback() != null)
      getCallback().unscheduleDrawable(this, paramRunnable); 
  }
  
  class a implements Runnable {
    a(b this$0) {}
    
    public void run() {
      this.c.a(true);
      this.c.invalidateSelf();
    }
  }
  
  static class b implements Drawable.Callback {
    private Drawable.Callback c;
    
    public Drawable.Callback a() {
      Drawable.Callback callback = this.c;
      this.c = null;
      return callback;
    }
    
    public b a(Drawable.Callback param1Callback) {
      this.c = param1Callback;
      return this;
    }
    
    public void invalidateDrawable(Drawable param1Drawable) {}
    
    public void scheduleDrawable(Drawable param1Drawable, Runnable param1Runnable, long param1Long) {
      Drawable.Callback callback = this.c;
      if (callback != null)
        callback.scheduleDrawable(param1Drawable, param1Runnable, param1Long); 
    }
    
    public void unscheduleDrawable(Drawable param1Drawable, Runnable param1Runnable) {
      Drawable.Callback callback = this.c;
      if (callback != null)
        callback.unscheduleDrawable(param1Drawable, param1Runnable); 
    }
  }
  
  static abstract class c extends Drawable.ConstantState {
    int A;
    
    int B;
    
    boolean C;
    
    ColorFilter D;
    
    boolean E;
    
    ColorStateList F;
    
    PorterDuff.Mode G;
    
    boolean H;
    
    boolean I;
    
    final b a;
    
    Resources b;
    
    int c;
    
    int d;
    
    int e;
    
    SparseArray<Drawable.ConstantState> f;
    
    Drawable[] g;
    
    int h;
    
    boolean i;
    
    boolean j;
    
    Rect k;
    
    boolean l;
    
    boolean m;
    
    int n;
    
    int o;
    
    int p;
    
    int q;
    
    boolean r;
    
    int s;
    
    boolean t;
    
    boolean u;
    
    boolean v;
    
    boolean w;
    
    boolean x;
    
    boolean y;
    
    int z;
    
    c(c param1c, b param1b, Resources param1Resources) {
      int i;
      this.c = 160;
      byte b1 = 0;
      this.i = false;
      this.l = false;
      this.x = true;
      this.A = 0;
      this.B = 0;
      this.a = param1b;
      if (param1Resources != null) {
        Resources resources = param1Resources;
      } else if (param1c != null) {
        Resources resources = param1c.b;
      } else {
        param1b = null;
      } 
      this.b = (Resources)param1b;
      if (param1c != null) {
        i = param1c.c;
      } else {
        i = 0;
      } 
      this.c = b.a(param1Resources, i);
      if (param1c != null) {
        this.d = param1c.d;
        this.e = param1c.e;
        this.v = true;
        this.w = true;
        this.i = param1c.i;
        this.l = param1c.l;
        this.x = param1c.x;
        this.y = param1c.y;
        this.z = param1c.z;
        this.A = param1c.A;
        this.B = param1c.B;
        this.C = param1c.C;
        this.D = param1c.D;
        this.E = param1c.E;
        this.F = param1c.F;
        this.G = param1c.G;
        this.H = param1c.H;
        this.I = param1c.I;
        if (param1c.c == this.c) {
          if (param1c.j) {
            this.k = new Rect(param1c.k);
            this.j = true;
          } 
          if (param1c.m) {
            this.n = param1c.n;
            this.o = param1c.o;
            this.p = param1c.p;
            this.q = param1c.q;
            this.m = true;
          } 
        } 
        if (param1c.r) {
          this.s = param1c.s;
          this.r = true;
        } 
        if (param1c.t) {
          this.u = param1c.u;
          this.t = true;
        } 
        Drawable[] arrayOfDrawable = param1c.g;
        this.g = new Drawable[arrayOfDrawable.length];
        this.h = param1c.h;
        SparseArray<Drawable.ConstantState> sparseArray = param1c.f;
        if (sparseArray != null) {
          sparseArray = sparseArray.clone();
        } else {
          sparseArray = new SparseArray(this.h);
        } 
        this.f = sparseArray;
        int j = this.h;
        for (i = b1; i < j; i++) {
          if (arrayOfDrawable[i] != null) {
            Drawable.ConstantState constantState = arrayOfDrawable[i].getConstantState();
            if (constantState != null) {
              this.f.put(i, constantState);
            } else {
              this.g[i] = arrayOfDrawable[i];
            } 
          } 
        } 
      } else {
        this.g = new Drawable[10];
        this.h = 0;
      } 
    }
    
    private Drawable b(Drawable param1Drawable) {
      if (Build.VERSION.SDK_INT >= 23)
        param1Drawable.setLayoutDirection(this.z); 
      param1Drawable = param1Drawable.mutate();
      param1Drawable.setCallback(this.a);
      return param1Drawable;
    }
    
    private void n() {
      SparseArray<Drawable.ConstantState> sparseArray = this.f;
      if (sparseArray != null) {
        int j = sparseArray.size();
        for (int i = 0; i < j; i++) {
          int k = this.f.keyAt(i);
          Drawable.ConstantState constantState = (Drawable.ConstantState)this.f.valueAt(i);
          this.g[k] = b(constantState.newDrawable(this.b));
        } 
        this.f = null;
      } 
    }
    
    public final int a(Drawable param1Drawable) {
      int i = this.h;
      if (i >= this.g.length)
        a(i, i + 10); 
      param1Drawable.mutate();
      param1Drawable.setVisible(false, true);
      param1Drawable.setCallback(this.a);
      this.g[i] = param1Drawable;
      this.h++;
      int j = this.e;
      this.e = param1Drawable.getChangingConfigurations() | j;
      k();
      this.k = null;
      this.j = false;
      this.m = false;
      this.v = false;
      return i;
    }
    
    public final Drawable a(int param1Int) {
      Drawable drawable = this.g[param1Int];
      if (drawable != null)
        return drawable; 
      SparseArray<Drawable.ConstantState> sparseArray = this.f;
      if (sparseArray != null) {
        int i = sparseArray.indexOfKey(param1Int);
        if (i >= 0) {
          Drawable drawable1 = b(((Drawable.ConstantState)this.f.valueAt(i)).newDrawable(this.b));
          this.g[param1Int] = drawable1;
          this.f.removeAt(i);
          if (this.f.size() == 0)
            this.f = null; 
          return drawable1;
        } 
      } 
      return null;
    }
    
    public void a(int param1Int1, int param1Int2) {
      Drawable[] arrayOfDrawable = new Drawable[param1Int2];
      System.arraycopy(this.g, 0, arrayOfDrawable, 0, param1Int1);
      this.g = arrayOfDrawable;
    }
    
    final void a(Resources.Theme param1Theme) {
      if (param1Theme != null) {
        n();
        int j = this.h;
        Drawable[] arrayOfDrawable = this.g;
        for (int i = 0; i < j; i++) {
          if (arrayOfDrawable[i] != null && arrayOfDrawable[i].canApplyTheme()) {
            arrayOfDrawable[i].applyTheme(param1Theme);
            this.e |= arrayOfDrawable[i].getChangingConfigurations();
          } 
        } 
        a(param1Theme.getResources());
      } 
    }
    
    final void a(Resources param1Resources) {
      if (param1Resources != null) {
        this.b = param1Resources;
        int i = b.a(param1Resources, this.c);
        int j = this.c;
        this.c = i;
        if (j != i) {
          this.m = false;
          this.j = false;
        } 
      } 
    }
    
    public final void a(boolean param1Boolean) {
      this.l = param1Boolean;
    }
    
    public boolean a() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield v : Z
      //   6: ifeq -> 18
      //   9: aload_0
      //   10: getfield w : Z
      //   13: istore_3
      //   14: aload_0
      //   15: monitorexit
      //   16: iload_3
      //   17: ireturn
      //   18: aload_0
      //   19: invokespecial n : ()V
      //   22: aload_0
      //   23: iconst_1
      //   24: putfield v : Z
      //   27: aload_0
      //   28: getfield h : I
      //   31: istore_2
      //   32: aload_0
      //   33: getfield g : [Landroid/graphics/drawable/Drawable;
      //   36: astore #4
      //   38: iconst_0
      //   39: istore_1
      //   40: iload_1
      //   41: iload_2
      //   42: if_icmpge -> 71
      //   45: aload #4
      //   47: iload_1
      //   48: aaload
      //   49: invokevirtual getConstantState : ()Landroid/graphics/drawable/Drawable$ConstantState;
      //   52: ifnonnull -> 64
      //   55: aload_0
      //   56: iconst_0
      //   57: putfield w : Z
      //   60: aload_0
      //   61: monitorexit
      //   62: iconst_0
      //   63: ireturn
      //   64: iload_1
      //   65: iconst_1
      //   66: iadd
      //   67: istore_1
      //   68: goto -> 40
      //   71: aload_0
      //   72: iconst_1
      //   73: putfield w : Z
      //   76: aload_0
      //   77: monitorexit
      //   78: iconst_1
      //   79: ireturn
      //   80: astore #4
      //   82: aload_0
      //   83: monitorexit
      //   84: goto -> 90
      //   87: aload #4
      //   89: athrow
      //   90: goto -> 87
      // Exception table:
      //   from	to	target	type
      //   2	14	80	finally
      //   18	38	80	finally
      //   45	60	80	finally
      //   71	76	80	finally
    }
    
    protected void b() {
      this.m = true;
      n();
      int j = this.h;
      Drawable[] arrayOfDrawable = this.g;
      this.o = -1;
      this.n = -1;
      int i = 0;
      this.q = 0;
      this.p = 0;
      while (i < j) {
        Drawable drawable = arrayOfDrawable[i];
        int k = drawable.getIntrinsicWidth();
        if (k > this.n)
          this.n = k; 
        k = drawable.getIntrinsicHeight();
        if (k > this.o)
          this.o = k; 
        k = drawable.getMinimumWidth();
        if (k > this.p)
          this.p = k; 
        k = drawable.getMinimumHeight();
        if (k > this.q)
          this.q = k; 
        i++;
      } 
    }
    
    public final void b(int param1Int) {
      this.A = param1Int;
    }
    
    public final void b(boolean param1Boolean) {
      this.i = param1Boolean;
    }
    
    final boolean b(int param1Int1, int param1Int2) {
      int j = this.h;
      Drawable[] arrayOfDrawable = this.g;
      int i = 0;
      boolean bool;
      for (bool = false; i < j; bool = bool1) {
        boolean bool1 = bool;
        if (arrayOfDrawable[i] != null) {
          boolean bool2;
          if (Build.VERSION.SDK_INT >= 23) {
            bool2 = arrayOfDrawable[i].setLayoutDirection(param1Int1);
          } else {
            bool2 = false;
          } 
          bool1 = bool;
          if (i == param1Int2)
            bool1 = bool2; 
        } 
        i++;
      } 
      this.z = param1Int1;
      return bool;
    }
    
    final int c() {
      return this.g.length;
    }
    
    public final void c(int param1Int) {
      this.B = param1Int;
    }
    
    public boolean canApplyTheme() {
      int j = this.h;
      Drawable[] arrayOfDrawable = this.g;
      for (int i = 0; i < j; i++) {
        Drawable drawable = arrayOfDrawable[i];
        if (drawable != null) {
          if (drawable.canApplyTheme())
            return true; 
        } else {
          Drawable.ConstantState constantState = (Drawable.ConstantState)this.f.get(i);
          if (constantState != null && constantState.canApplyTheme())
            return true; 
        } 
      } 
      return false;
    }
    
    public final int d() {
      return this.h;
    }
    
    public final int e() {
      if (!this.m)
        b(); 
      return this.o;
    }
    
    public final int f() {
      if (!this.m)
        b(); 
      return this.q;
    }
    
    public final int g() {
      if (!this.m)
        b(); 
      return this.p;
    }
    
    public int getChangingConfigurations() {
      return this.d | this.e;
    }
    
    public final Rect h() {
      if (this.i)
        return null; 
      if (this.k != null || this.j)
        return this.k; 
      n();
      Rect rect2 = new Rect();
      int j = this.h;
      Drawable[] arrayOfDrawable = this.g;
      Rect rect1 = null;
      int i = 0;
      while (i < j) {
        Rect rect = rect1;
        if (arrayOfDrawable[i].getPadding(rect2)) {
          Rect rect3 = rect1;
          if (rect1 == null)
            rect3 = new Rect(0, 0, 0, 0); 
          int k = rect2.left;
          if (k > rect3.left)
            rect3.left = k; 
          k = rect2.top;
          if (k > rect3.top)
            rect3.top = k; 
          k = rect2.right;
          if (k > rect3.right)
            rect3.right = k; 
          k = rect2.bottom;
          rect = rect3;
          if (k > rect3.bottom) {
            rect3.bottom = k;
            rect = rect3;
          } 
        } 
        i++;
        rect1 = rect;
      } 
      this.j = true;
      this.k = rect1;
      return rect1;
    }
    
    public final int i() {
      if (!this.m)
        b(); 
      return this.n;
    }
    
    public final int j() {
      if (this.r)
        return this.s; 
      n();
      int k = this.h;
      Drawable[] arrayOfDrawable = this.g;
      if (k > 0) {
        i = arrayOfDrawable[0].getOpacity();
      } else {
        i = -2;
      } 
      byte b1 = 1;
      int j = i;
      for (int i = b1; i < k; i++)
        j = Drawable.resolveOpacity(j, arrayOfDrawable[i].getOpacity()); 
      this.s = j;
      this.r = true;
      return j;
    }
    
    void k() {
      this.r = false;
      this.t = false;
    }
    
    public final boolean l() {
      return this.l;
    }
    
    abstract void m();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/a/l/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */