package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.widget.i;
import b.a.j;
import b.g.m.v;

public class r0 extends CompoundButton {
  private static final Property<r0, Float> P = new a(Float.class, "thumbPos");
  
  private static final int[] Q = new int[] { 16842912 };
  
  private int A;
  
  private int B;
  
  private int C;
  
  private int D;
  
  private int E;
  
  private int F;
  
  private int G;
  
  private final TextPaint H;
  
  private ColorStateList I;
  
  private Layout J;
  
  private Layout K;
  
  private TransformationMethod L;
  
  ObjectAnimator M;
  
  private final y N;
  
  private final Rect O = new Rect();
  
  private Drawable c;
  
  private ColorStateList d = null;
  
  private PorterDuff.Mode e = null;
  
  private boolean f = false;
  
  private boolean g = false;
  
  private Drawable h;
  
  private ColorStateList i = null;
  
  private PorterDuff.Mode j = null;
  
  private boolean k = false;
  
  private boolean l = false;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private boolean p;
  
  private CharSequence q;
  
  private CharSequence r;
  
  private boolean s;
  
  private int t;
  
  private int u;
  
  private float v;
  
  private float w;
  
  private VelocityTracker x = VelocityTracker.obtain();
  
  private int y;
  
  float z;
  
  public r0(Context paramContext) {
    this(paramContext, null);
  }
  
  public r0(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.a.a.switchStyle);
  }
  
  public r0(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    this.H = new TextPaint(1);
    Resources resources = getResources();
    this.H.density = (resources.getDisplayMetrics()).density;
    x0 x0 = x0.a(paramContext, paramAttributeSet, j.SwitchCompat, paramInt, 0);
    v.a((View)this, paramContext, j.SwitchCompat, paramAttributeSet, x0.a(), paramInt, 0);
    this.c = x0.b(j.SwitchCompat_android_thumb);
    Drawable drawable = this.c;
    if (drawable != null)
      drawable.setCallback((Drawable.Callback)this); 
    this.h = x0.b(j.SwitchCompat_track);
    drawable = this.h;
    if (drawable != null)
      drawable.setCallback((Drawable.Callback)this); 
    this.q = x0.e(j.SwitchCompat_android_textOn);
    this.r = x0.e(j.SwitchCompat_android_textOff);
    this.s = x0.a(j.SwitchCompat_showText, true);
    this.m = x0.c(j.SwitchCompat_thumbTextPadding, 0);
    this.n = x0.c(j.SwitchCompat_switchMinWidth, 0);
    this.o = x0.c(j.SwitchCompat_switchPadding, 0);
    this.p = x0.a(j.SwitchCompat_splitTrack, false);
    ColorStateList colorStateList2 = x0.a(j.SwitchCompat_thumbTint);
    if (colorStateList2 != null) {
      this.d = colorStateList2;
      this.f = true;
    } 
    PorterDuff.Mode mode2 = e0.a(x0.d(j.SwitchCompat_thumbTintMode, -1), null);
    if (this.e != mode2) {
      this.e = mode2;
      this.g = true;
    } 
    if (this.f || this.g)
      a(); 
    ColorStateList colorStateList1 = x0.a(j.SwitchCompat_trackTint);
    if (colorStateList1 != null) {
      this.i = colorStateList1;
      this.k = true;
    } 
    PorterDuff.Mode mode1 = e0.a(x0.d(j.SwitchCompat_trackTintMode, -1), null);
    if (this.j != mode1) {
      this.j = mode1;
      this.l = true;
    } 
    if (this.k || this.l)
      b(); 
    int i = x0.g(j.SwitchCompat_switchTextAppearance, 0);
    if (i != 0)
      a(paramContext, i); 
    this.N = new y((TextView)this);
    this.N.a(paramAttributeSet, paramInt);
    x0.b();
    ViewConfiguration viewConfiguration = ViewConfiguration.get(paramContext);
    this.u = viewConfiguration.getScaledTouchSlop();
    this.y = viewConfiguration.getScaledMinimumFlingVelocity();
    refreshDrawableState();
    setChecked(isChecked());
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramFloat1 < paramFloat2)
      return paramFloat2; 
    paramFloat2 = paramFloat1;
    if (paramFloat1 > paramFloat3)
      paramFloat2 = paramFloat3; 
    return paramFloat2;
  }
  
  private Layout a(CharSequence paramCharSequence) {
    boolean bool;
    TransformationMethod transformationMethod = this.L;
    CharSequence charSequence = paramCharSequence;
    if (transformationMethod != null)
      charSequence = transformationMethod.getTransformation(paramCharSequence, (View)this); 
    TextPaint textPaint = this.H;
    if (charSequence != null) {
      bool = (int)Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
    } else {
      bool = false;
    } 
    return (Layout)new StaticLayout(charSequence, textPaint, bool, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
  }
  
  private void a() {
    if (this.c != null && (this.f || this.g)) {
      this.c = androidx.core.graphics.drawable.a.i(this.c).mutate();
      if (this.f)
        androidx.core.graphics.drawable.a.a(this.c, this.d); 
      if (this.g)
        androidx.core.graphics.drawable.a.a(this.c, this.e); 
      if (this.c.isStateful())
        this.c.setState(getDrawableState()); 
    } 
  }
  
  private void a(int paramInt1, int paramInt2) {
    Typeface typeface;
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3) {
          typeface = null;
        } else {
          typeface = Typeface.MONOSPACE;
        } 
      } else {
        typeface = Typeface.SERIF;
      } 
    } else {
      typeface = Typeface.SANS_SERIF;
    } 
    a(typeface, paramInt2);
  }
  
  private void a(MotionEvent paramMotionEvent) {
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.setAction(3);
    super.onTouchEvent(paramMotionEvent);
    paramMotionEvent.recycle();
  }
  
  private void a(boolean paramBoolean) {
    float f;
    if (paramBoolean) {
      f = 1.0F;
    } else {
      f = 0.0F;
    } 
    this.M = ObjectAnimator.ofFloat(this, P, new float[] { f });
    this.M.setDuration(250L);
    if (Build.VERSION.SDK_INT >= 18)
      this.M.setAutoCancel(true); 
    this.M.start();
  }
  
  private boolean a(float paramFloat1, float paramFloat2) {
    Drawable drawable = this.c;
    boolean bool2 = false;
    if (drawable == null)
      return false; 
    int k = getThumbOffset();
    this.c.getPadding(this.O);
    int i = this.E;
    int j = this.u;
    k = this.D + k - j;
    int m = this.C;
    Rect rect = this.O;
    int n = rect.left;
    int i1 = rect.right;
    int i2 = this.G;
    boolean bool1 = bool2;
    if (paramFloat1 > k) {
      bool1 = bool2;
      if (paramFloat1 < (m + k + n + i1 + j)) {
        bool1 = bool2;
        if (paramFloat2 > (i - j)) {
          bool1 = bool2;
          if (paramFloat2 < (i2 + j))
            bool1 = true; 
        } 
      } 
    } 
    return bool1;
  }
  
  private void b() {
    if (this.h != null && (this.k || this.l)) {
      this.h = androidx.core.graphics.drawable.a.i(this.h).mutate();
      if (this.k)
        androidx.core.graphics.drawable.a.a(this.h, this.i); 
      if (this.l)
        androidx.core.graphics.drawable.a.a(this.h, this.j); 
      if (this.h.isStateful())
        this.h.setState(getDrawableState()); 
    } 
  }
  
  private void b(MotionEvent paramMotionEvent) {
    this.t = 0;
    int i = paramMotionEvent.getAction();
    boolean bool1 = true;
    if (i == 1 && isEnabled()) {
      i = 1;
    } else {
      i = 0;
    } 
    boolean bool2 = isChecked();
    if (i != 0) {
      this.x.computeCurrentVelocity(1000);
      float f = this.x.getXVelocity();
      if (Math.abs(f) > this.y) {
        if (d1.a((View)this) ? (f < 0.0F) : (f > 0.0F))
          bool1 = false; 
      } else {
        bool1 = getTargetCheckedState();
      } 
    } else {
      bool1 = bool2;
    } 
    if (bool1 != bool2)
      playSoundEffect(0); 
    setChecked(bool1);
    a(paramMotionEvent);
  }
  
  private void c() {
    ObjectAnimator objectAnimator = this.M;
    if (objectAnimator != null)
      objectAnimator.cancel(); 
  }
  
  private boolean getTargetCheckedState() {
    return (this.z > 0.5F);
  }
  
  private int getThumbOffset() {
    float f;
    if (d1.a((View)this)) {
      f = 1.0F - this.z;
    } else {
      f = this.z;
    } 
    return (int)(f * getThumbScrollRange() + 0.5F);
  }
  
  private int getThumbScrollRange() {
    Drawable drawable = this.h;
    if (drawable != null) {
      Rect rect1;
      Rect rect2 = this.O;
      drawable.getPadding(rect2);
      drawable = this.c;
      if (drawable != null) {
        rect1 = e0.d(drawable);
      } else {
        rect1 = e0.c;
      } 
      return this.A - this.C - rect2.left - rect2.right - rect1.left - rect1.right;
    } 
    return 0;
  }
  
  public void a(Context paramContext, int paramInt) {
    x0 x0 = x0.a(paramContext, paramInt, j.TextAppearance);
    ColorStateList colorStateList = x0.a(j.TextAppearance_android_textColor);
    if (colorStateList == null)
      colorStateList = getTextColors(); 
    this.I = colorStateList;
    paramInt = x0.c(j.TextAppearance_android_textSize, 0);
    if (paramInt != 0) {
      float f = paramInt;
      if (f != this.H.getTextSize()) {
        this.H.setTextSize(f);
        requestLayout();
      } 
    } 
    a(x0.d(j.TextAppearance_android_typeface, -1), x0.d(j.TextAppearance_android_textStyle, -1));
    if (x0.a(j.TextAppearance_textAllCaps, false)) {
      b.a.n.a a = new b.a.n.a(getContext());
    } else {
      colorStateList = null;
    } 
    this.L = (TransformationMethod)colorStateList;
    x0.b();
  }
  
  public void a(Typeface paramTypeface, int paramInt) {
    TextPaint textPaint;
    float f = 0.0F;
    boolean bool = false;
    if (paramInt > 0) {
      boolean bool1;
      if (paramTypeface == null) {
        paramTypeface = Typeface.defaultFromStyle(paramInt);
      } else {
        paramTypeface = Typeface.create(paramTypeface, paramInt);
      } 
      setSwitchTypeface(paramTypeface);
      if (paramTypeface != null) {
        bool1 = paramTypeface.getStyle();
      } else {
        bool1 = false;
      } 
      paramInt = (bool1 ^ 0xFFFFFFFF) & paramInt;
      textPaint = this.H;
      if ((paramInt & 0x1) != 0)
        bool = true; 
      textPaint.setFakeBoldText(bool);
      textPaint = this.H;
      if ((paramInt & 0x2) != 0)
        f = -0.25F; 
      textPaint.setTextSkewX(f);
      return;
    } 
    this.H.setFakeBoldText(false);
    this.H.setTextSkewX(0.0F);
    setSwitchTypeface((Typeface)textPaint);
  }
  
  public void draw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: getfield O : Landroid/graphics/Rect;
    //   4: astore #14
    //   6: aload_0
    //   7: getfield D : I
    //   10: istore #5
    //   12: aload_0
    //   13: getfield E : I
    //   16: istore #8
    //   18: aload_0
    //   19: getfield F : I
    //   22: istore #6
    //   24: aload_0
    //   25: getfield G : I
    //   28: istore #9
    //   30: aload_0
    //   31: invokespecial getThumbOffset : ()I
    //   34: iload #5
    //   36: iadd
    //   37: istore_3
    //   38: aload_0
    //   39: getfield c : Landroid/graphics/drawable/Drawable;
    //   42: astore #13
    //   44: aload #13
    //   46: ifnull -> 59
    //   49: aload #13
    //   51: invokestatic d : (Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;
    //   54: astore #13
    //   56: goto -> 64
    //   59: getstatic androidx/appcompat/widget/e0.c : Landroid/graphics/Rect;
    //   62: astore #13
    //   64: aload_0
    //   65: getfield h : Landroid/graphics/drawable/Drawable;
    //   68: astore #15
    //   70: iload_3
    //   71: istore_2
    //   72: aload #15
    //   74: ifnull -> 274
    //   77: aload #15
    //   79: aload #14
    //   81: invokevirtual getPadding : (Landroid/graphics/Rect;)Z
    //   84: pop
    //   85: aload #14
    //   87: getfield left : I
    //   90: istore #4
    //   92: iload_3
    //   93: iload #4
    //   95: iadd
    //   96: istore #10
    //   98: aload #13
    //   100: ifnull -> 238
    //   103: aload #13
    //   105: getfield left : I
    //   108: istore_3
    //   109: iload #5
    //   111: istore_2
    //   112: iload_3
    //   113: iload #4
    //   115: if_icmple -> 126
    //   118: iload #5
    //   120: iload_3
    //   121: iload #4
    //   123: isub
    //   124: iadd
    //   125: istore_2
    //   126: aload #13
    //   128: getfield top : I
    //   131: istore_3
    //   132: aload #14
    //   134: getfield top : I
    //   137: istore #4
    //   139: iload_3
    //   140: iload #4
    //   142: if_icmple -> 156
    //   145: iload_3
    //   146: iload #4
    //   148: isub
    //   149: iload #8
    //   151: iadd
    //   152: istore_3
    //   153: goto -> 159
    //   156: iload #8
    //   158: istore_3
    //   159: aload #13
    //   161: getfield right : I
    //   164: istore #5
    //   166: aload #14
    //   168: getfield right : I
    //   171: istore #7
    //   173: iload #6
    //   175: istore #4
    //   177: iload #5
    //   179: iload #7
    //   181: if_icmple -> 194
    //   184: iload #6
    //   186: iload #5
    //   188: iload #7
    //   190: isub
    //   191: isub
    //   192: istore #4
    //   194: aload #13
    //   196: getfield bottom : I
    //   199: istore #11
    //   201: aload #14
    //   203: getfield bottom : I
    //   206: istore #12
    //   208: iload_2
    //   209: istore #5
    //   211: iload #4
    //   213: istore #6
    //   215: iload_3
    //   216: istore #7
    //   218: iload #11
    //   220: iload #12
    //   222: if_icmple -> 242
    //   225: iload #9
    //   227: iload #11
    //   229: iload #12
    //   231: isub
    //   232: isub
    //   233: istore #7
    //   235: goto -> 258
    //   238: iload #8
    //   240: istore #7
    //   242: iload #9
    //   244: istore_2
    //   245: iload #7
    //   247: istore_3
    //   248: iload_2
    //   249: istore #7
    //   251: iload #6
    //   253: istore #4
    //   255: iload #5
    //   257: istore_2
    //   258: aload_0
    //   259: getfield h : Landroid/graphics/drawable/Drawable;
    //   262: iload_2
    //   263: iload_3
    //   264: iload #4
    //   266: iload #7
    //   268: invokevirtual setBounds : (IIII)V
    //   271: iload #10
    //   273: istore_2
    //   274: aload_0
    //   275: getfield c : Landroid/graphics/drawable/Drawable;
    //   278: astore #13
    //   280: aload #13
    //   282: ifnull -> 349
    //   285: aload #13
    //   287: aload #14
    //   289: invokevirtual getPadding : (Landroid/graphics/Rect;)Z
    //   292: pop
    //   293: iload_2
    //   294: aload #14
    //   296: getfield left : I
    //   299: isub
    //   300: istore_3
    //   301: iload_2
    //   302: aload_0
    //   303: getfield C : I
    //   306: iadd
    //   307: aload #14
    //   309: getfield right : I
    //   312: iadd
    //   313: istore_2
    //   314: aload_0
    //   315: getfield c : Landroid/graphics/drawable/Drawable;
    //   318: iload_3
    //   319: iload #8
    //   321: iload_2
    //   322: iload #9
    //   324: invokevirtual setBounds : (IIII)V
    //   327: aload_0
    //   328: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
    //   331: astore #13
    //   333: aload #13
    //   335: ifnull -> 349
    //   338: aload #13
    //   340: iload_3
    //   341: iload #8
    //   343: iload_2
    //   344: iload #9
    //   346: invokestatic a : (Landroid/graphics/drawable/Drawable;IIII)V
    //   349: aload_0
    //   350: aload_1
    //   351: invokespecial draw : (Landroid/graphics/Canvas;)V
    //   354: return
  }
  
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2) {
    if (Build.VERSION.SDK_INT >= 21)
      super.drawableHotspotChanged(paramFloat1, paramFloat2); 
    Drawable drawable = this.c;
    if (drawable != null)
      androidx.core.graphics.drawable.a.a(drawable, paramFloat1, paramFloat2); 
    drawable = this.h;
    if (drawable != null)
      androidx.core.graphics.drawable.a.a(drawable, paramFloat1, paramFloat2); 
  }
  
  protected void drawableStateChanged() {
    boolean bool;
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable drawable = this.c;
    int j = 0;
    int i = j;
    if (drawable != null) {
      i = j;
      if (drawable.isStateful())
        i = false | drawable.setState(arrayOfInt); 
    } 
    drawable = this.h;
    j = i;
    if (drawable != null) {
      j = i;
      if (drawable.isStateful())
        bool = i | drawable.setState(arrayOfInt); 
    } 
    if (bool)
      invalidate(); 
  }
  
  public int getCompoundPaddingLeft() {
    if (!d1.a((View)this))
      return super.getCompoundPaddingLeft(); 
    int j = super.getCompoundPaddingLeft() + this.A;
    int i = j;
    if (!TextUtils.isEmpty(getText()))
      i = j + this.o; 
    return i;
  }
  
  public int getCompoundPaddingRight() {
    if (d1.a((View)this))
      return super.getCompoundPaddingRight(); 
    int j = super.getCompoundPaddingRight() + this.A;
    int i = j;
    if (!TextUtils.isEmpty(getText()))
      i = j + this.o; 
    return i;
  }
  
  public boolean getShowText() {
    return this.s;
  }
  
  public boolean getSplitTrack() {
    return this.p;
  }
  
  public int getSwitchMinWidth() {
    return this.n;
  }
  
  public int getSwitchPadding() {
    return this.o;
  }
  
  public CharSequence getTextOff() {
    return this.r;
  }
  
  public CharSequence getTextOn() {
    return this.q;
  }
  
  public Drawable getThumbDrawable() {
    return this.c;
  }
  
  public int getThumbTextPadding() {
    return this.m;
  }
  
  public ColorStateList getThumbTintList() {
    return this.d;
  }
  
  public PorterDuff.Mode getThumbTintMode() {
    return this.e;
  }
  
  public Drawable getTrackDrawable() {
    return this.h;
  }
  
  public ColorStateList getTrackTintList() {
    return this.i;
  }
  
  public PorterDuff.Mode getTrackTintMode() {
    return this.j;
  }
  
  public void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    Drawable drawable = this.c;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
    drawable = this.h;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
    ObjectAnimator objectAnimator = this.M;
    if (objectAnimator != null && objectAnimator.isStarted()) {
      this.M.end();
      this.M = null;
    } 
  }
  
  protected int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked())
      CompoundButton.mergeDrawableStates(arrayOfInt, Q); 
    return arrayOfInt;
  }
  
  protected void onDraw(Canvas paramCanvas) {
    Layout layout;
    super.onDraw(paramCanvas);
    Rect rect = this.O;
    Drawable drawable2 = this.h;
    if (drawable2 != null) {
      drawable2.getPadding(rect);
    } else {
      rect.setEmpty();
    } 
    int j = this.E;
    int k = this.G;
    int m = rect.top;
    int n = rect.bottom;
    Drawable drawable1 = this.c;
    if (drawable2 != null)
      if (this.p && drawable1 != null) {
        Rect rect1 = e0.d(drawable1);
        drawable1.copyBounds(rect);
        rect.left += rect1.left;
        rect.right -= rect1.right;
        int i1 = paramCanvas.save();
        paramCanvas.clipRect(rect, Region.Op.DIFFERENCE);
        drawable2.draw(paramCanvas);
        paramCanvas.restoreToCount(i1);
      } else {
        drawable2.draw(paramCanvas);
      }  
    int i = paramCanvas.save();
    if (drawable1 != null)
      drawable1.draw(paramCanvas); 
    if (getTargetCheckedState()) {
      layout = this.J;
    } else {
      layout = this.K;
    } 
    if (layout != null) {
      int i1;
      int[] arrayOfInt = getDrawableState();
      ColorStateList colorStateList = this.I;
      if (colorStateList != null)
        this.H.setColor(colorStateList.getColorForState(arrayOfInt, 0)); 
      this.H.drawableState = arrayOfInt;
      if (drawable1 != null) {
        Rect rect1 = drawable1.getBounds();
        i1 = rect1.left + rect1.right;
      } else {
        i1 = getWidth();
      } 
      i1 /= 2;
      int i2 = layout.getWidth() / 2;
      j = (j + m + k - n) / 2;
      k = layout.getHeight() / 2;
      paramCanvas.translate((i1 - i2), (j - k));
      layout.draw(paramCanvas);
    } 
    paramCanvas.restoreToCount(i);
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("android.widget.Switch");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    CharSequence charSequence;
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("android.widget.Switch");
    if (isChecked()) {
      charSequence = this.q;
    } else {
      charSequence = this.r;
    } 
    if (!TextUtils.isEmpty(charSequence)) {
      CharSequence charSequence1 = paramAccessibilityNodeInfo.getText();
      if (TextUtils.isEmpty(charSequence1)) {
        paramAccessibilityNodeInfo.setText(charSequence);
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(charSequence1);
      stringBuilder.append(' ');
      stringBuilder.append(charSequence);
      paramAccessibilityNodeInfo.setText(stringBuilder);
    } 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable drawable = this.c;
    paramInt1 = 0;
    if (drawable != null) {
      Rect rect1 = this.O;
      Drawable drawable1 = this.h;
      if (drawable1 != null) {
        drawable1.getPadding(rect1);
      } else {
        rect1.setEmpty();
      } 
      Rect rect2 = e0.d(this.c);
      paramInt2 = Math.max(0, rect2.left - rect1.left);
      paramInt1 = Math.max(0, rect2.right - rect1.right);
    } else {
      paramInt2 = 0;
    } 
    if (d1.a((View)this)) {
      paramInt3 = getPaddingLeft() + paramInt2;
      paramInt1 = this.A + paramInt3 - paramInt2 - paramInt1;
      paramInt2 = paramInt3;
      paramInt3 = paramInt1;
    } else {
      paramInt3 = getWidth() - getPaddingRight() - paramInt1;
      paramInt2 = paramInt3 - this.A + paramInt2 + paramInt1;
    } 
    paramInt1 = getGravity() & 0x70;
    if (paramInt1 != 16) {
      if (paramInt1 != 80) {
        paramInt1 = getPaddingTop();
        paramInt4 = this.B;
      } else {
        paramInt4 = getHeight() - getPaddingBottom();
        paramInt1 = paramInt4 - this.B;
        this.D = paramInt2;
        this.E = paramInt1;
        this.G = paramInt4;
        this.F = paramInt3;
      } 
    } else {
      paramInt1 = (getPaddingTop() + getHeight() - getPaddingBottom()) / 2;
      paramInt4 = this.B;
      paramInt1 -= paramInt4 / 2;
    } 
    paramInt4 += paramInt1;
    this.D = paramInt2;
    this.E = paramInt1;
    this.G = paramInt4;
    this.F = paramInt3;
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    int j;
    if (this.s) {
      if (this.J == null)
        this.J = a(this.q); 
      if (this.K == null)
        this.K = a(this.r); 
    } 
    Rect rect = this.O;
    Drawable drawable2 = this.c;
    int m = 0;
    if (drawable2 != null) {
      drawable2.getPadding(rect);
      j = this.c.getIntrinsicWidth() - rect.left - rect.right;
      i = this.c.getIntrinsicHeight();
    } else {
      j = 0;
      i = 0;
    } 
    if (this.s) {
      k = Math.max(this.J.getWidth(), this.K.getWidth()) + this.m * 2;
    } else {
      k = 0;
    } 
    this.C = Math.max(k, j);
    drawable2 = this.h;
    if (drawable2 != null) {
      drawable2.getPadding(rect);
      j = this.h.getIntrinsicHeight();
    } else {
      rect.setEmpty();
      j = m;
    } 
    int i1 = rect.left;
    int n = rect.right;
    Drawable drawable1 = this.c;
    m = n;
    int k = i1;
    if (drawable1 != null) {
      Rect rect1 = e0.d(drawable1);
      k = Math.max(i1, rect1.left);
      m = Math.max(n, rect1.right);
    } 
    k = Math.max(this.n, this.C * 2 + k + m);
    int i = Math.max(j, i);
    this.A = k;
    this.B = i;
    super.onMeasure(paramInt1, paramInt2);
    if (getMeasuredHeight() < i)
      setMeasuredDimension(getMeasuredWidthAndState(), i); 
  }
  
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    CharSequence charSequence;
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    if (isChecked()) {
      charSequence = this.q;
    } else {
      charSequence = this.r;
    } 
    if (charSequence != null)
      paramAccessibilityEvent.getText().add(charSequence); 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    this.x.addMovement(paramMotionEvent);
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i != 1)
        if (i != 2) {
          if (i != 3)
            return super.onTouchEvent(paramMotionEvent); 
        } else {
          i = this.t;
          if (i != 0)
            if (i != 1) {
              if (i == 2) {
                float f3 = paramMotionEvent.getX();
                i = getThumbScrollRange();
                float f1 = f3 - this.v;
                if (i != 0) {
                  f1 /= i;
                } else if (f1 > 0.0F) {
                  f1 = 1.0F;
                } else {
                  f1 = -1.0F;
                } 
                float f2 = f1;
                if (d1.a((View)this))
                  f2 = -f1; 
                f1 = a(this.z + f2, 0.0F, 1.0F);
                if (f1 != this.z) {
                  this.v = f3;
                  setThumbPosition(f1);
                } 
                return true;
              } 
            } else {
              float f1 = paramMotionEvent.getX();
              float f2 = paramMotionEvent.getY();
              if (Math.abs(f1 - this.v) > this.u || Math.abs(f2 - this.w) > this.u) {
                this.t = 2;
                getParent().requestDisallowInterceptTouchEvent(true);
                this.v = f1;
                this.w = f2;
                return true;
              } 
            }  
          return super.onTouchEvent(paramMotionEvent);
        }  
      if (this.t == 2) {
        b(paramMotionEvent);
        super.onTouchEvent(paramMotionEvent);
        return true;
      } 
      this.t = 0;
      this.x.clear();
    } else {
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      if (isEnabled() && a(f1, f2)) {
        this.t = 1;
        this.v = f1;
        this.w = f2;
      } 
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setChecked(boolean paramBoolean) {
    float f;
    super.setChecked(paramBoolean);
    paramBoolean = isChecked();
    if (getWindowToken() != null && v.I((View)this)) {
      a(paramBoolean);
      return;
    } 
    c();
    if (paramBoolean) {
      f = 1.0F;
    } else {
      f = 0.0F;
    } 
    setThumbPosition(f);
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(i.a((TextView)this, paramCallback));
  }
  
  public void setShowText(boolean paramBoolean) {
    if (this.s != paramBoolean) {
      this.s = paramBoolean;
      requestLayout();
    } 
  }
  
  public void setSplitTrack(boolean paramBoolean) {
    this.p = paramBoolean;
    invalidate();
  }
  
  public void setSwitchMinWidth(int paramInt) {
    this.n = paramInt;
    requestLayout();
  }
  
  public void setSwitchPadding(int paramInt) {
    this.o = paramInt;
    requestLayout();
  }
  
  public void setSwitchTypeface(Typeface paramTypeface) {
    if ((this.H.getTypeface() != null && !this.H.getTypeface().equals(paramTypeface)) || (this.H.getTypeface() == null && paramTypeface != null)) {
      this.H.setTypeface(paramTypeface);
      requestLayout();
      invalidate();
    } 
  }
  
  public void setTextOff(CharSequence paramCharSequence) {
    this.r = paramCharSequence;
    requestLayout();
  }
  
  public void setTextOn(CharSequence paramCharSequence) {
    this.q = paramCharSequence;
    requestLayout();
  }
  
  public void setThumbDrawable(Drawable paramDrawable) {
    Drawable drawable = this.c;
    if (drawable != null)
      drawable.setCallback(null); 
    this.c = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback((Drawable.Callback)this); 
    requestLayout();
  }
  
  void setThumbPosition(float paramFloat) {
    this.z = paramFloat;
    invalidate();
  }
  
  public void setThumbResource(int paramInt) {
    setThumbDrawable(b.a.k.a.a.c(getContext(), paramInt));
  }
  
  public void setThumbTextPadding(int paramInt) {
    this.m = paramInt;
    requestLayout();
  }
  
  public void setThumbTintList(ColorStateList paramColorStateList) {
    this.d = paramColorStateList;
    this.f = true;
    a();
  }
  
  public void setThumbTintMode(PorterDuff.Mode paramMode) {
    this.e = paramMode;
    this.g = true;
    a();
  }
  
  public void setTrackDrawable(Drawable paramDrawable) {
    Drawable drawable = this.h;
    if (drawable != null)
      drawable.setCallback(null); 
    this.h = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback((Drawable.Callback)this); 
    requestLayout();
  }
  
  public void setTrackResource(int paramInt) {
    setTrackDrawable(b.a.k.a.a.c(getContext(), paramInt));
  }
  
  public void setTrackTintList(ColorStateList paramColorStateList) {
    this.i = paramColorStateList;
    this.k = true;
    b();
  }
  
  public void setTrackTintMode(PorterDuff.Mode paramMode) {
    this.j = paramMode;
    this.l = true;
    b();
  }
  
  public void toggle() {
    setChecked(isChecked() ^ true);
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable) {
    return (super.verifyDrawable(paramDrawable) || paramDrawable == this.c || paramDrawable == this.h);
  }
  
  class a extends Property<r0, Float> {
    a(r0 this$0, String param1String) {
      super((Class)this$0, param1String);
    }
    
    public Float a(r0 param1r0) {
      return Float.valueOf(param1r0.z);
    }
    
    public void a(r0 param1r0, Float param1Float) {
      param1r0.setThumbPosition(param1Float.floatValue());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */