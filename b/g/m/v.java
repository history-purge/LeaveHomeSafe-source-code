package b.g.m;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import b.g.m.e0.c;
import b.g.m.e0.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class v {
  private static Field a;
  
  private static boolean b;
  
  private static Field c;
  
  private static boolean d;
  
  private static WeakHashMap<View, String> e;
  
  private static WeakHashMap<View, z> f = null;
  
  private static Field g;
  
  private static boolean h = false;
  
  private static ThreadLocal<Rect> i;
  
  static {
    int i = b.g.c.accessibility_custom_action_0;
    i = b.g.c.accessibility_custom_action_1;
    i = b.g.c.accessibility_custom_action_2;
    i = b.g.c.accessibility_custom_action_3;
    i = b.g.c.accessibility_custom_action_4;
    i = b.g.c.accessibility_custom_action_5;
    i = b.g.c.accessibility_custom_action_6;
    i = b.g.c.accessibility_custom_action_7;
    i = b.g.c.accessibility_custom_action_8;
    i = b.g.c.accessibility_custom_action_9;
    i = b.g.c.accessibility_custom_action_10;
    i = b.g.c.accessibility_custom_action_11;
    i = b.g.c.accessibility_custom_action_12;
    i = b.g.c.accessibility_custom_action_13;
    i = b.g.c.accessibility_custom_action_14;
    i = b.g.c.accessibility_custom_action_15;
    i = b.g.c.accessibility_custom_action_16;
    i = b.g.c.accessibility_custom_action_17;
    i = b.g.c.accessibility_custom_action_18;
    i = b.g.c.accessibility_custom_action_19;
    i = b.g.c.accessibility_custom_action_20;
    i = b.g.c.accessibility_custom_action_21;
    i = b.g.c.accessibility_custom_action_22;
    i = b.g.c.accessibility_custom_action_23;
    i = b.g.c.accessibility_custom_action_24;
    i = b.g.c.accessibility_custom_action_25;
    i = b.g.c.accessibility_custom_action_26;
    i = b.g.c.accessibility_custom_action_27;
    i = b.g.c.accessibility_custom_action_28;
    i = b.g.c.accessibility_custom_action_29;
    i = b.g.c.accessibility_custom_action_30;
    i = b.g.c.accessibility_custom_action_31;
    new e();
  }
  
  public static float A(View paramView) {
    return (Build.VERSION.SDK_INT >= 21) ? paramView.getZ() : 0.0F;
  }
  
  public static boolean B(View paramView) {
    return (c(paramView) != null);
  }
  
  public static boolean C(View paramView) {
    return (Build.VERSION.SDK_INT >= 15) ? paramView.hasOnClickListeners() : false;
  }
  
  public static boolean D(View paramView) {
    return (Build.VERSION.SDK_INT >= 16) ? paramView.hasOverlappingRendering() : true;
  }
  
  public static boolean E(View paramView) {
    return (Build.VERSION.SDK_INT >= 16) ? paramView.hasTransientState() : false;
  }
  
  public static boolean F(View paramView) {
    Boolean bool = a().b(paramView);
    return (bool == null) ? false : bool.booleanValue();
  }
  
  public static boolean G(View paramView) {
    return (Build.VERSION.SDK_INT >= 19) ? paramView.isAttachedToWindow() : ((paramView.getWindowToken() != null));
  }
  
  public static boolean H(View paramView) {
    return (Build.VERSION.SDK_INT >= 18) ? paramView.isInLayout() : false;
  }
  
  public static boolean I(View paramView) {
    return (Build.VERSION.SDK_INT >= 19) ? paramView.isLaidOut() : ((paramView.getWidth() > 0 && paramView.getHeight() > 0));
  }
  
  public static boolean J(View paramView) {
    return (Build.VERSION.SDK_INT >= 21) ? paramView.isNestedScrollingEnabled() : ((paramView instanceof l) ? ((l)paramView).isNestedScrollingEnabled() : false);
  }
  
  public static boolean K(View paramView) {
    return (Build.VERSION.SDK_INT >= 17) ? paramView.isPaddingRelative() : false;
  }
  
  public static boolean L(View paramView) {
    Boolean bool = d().b(paramView);
    return (bool == null) ? false : bool.booleanValue();
  }
  
  public static void M(View paramView) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.postInvalidateOnAnimation();
      return;
    } 
    paramView.postInvalidate();
  }
  
  public static void N(View paramView) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 20) {
      paramView.requestApplyInsets();
      return;
    } 
    if (i >= 16)
      paramView.requestFitSystemWindows(); 
  }
  
  public static void O(View paramView) {
    if (Build.VERSION.SDK_INT >= 21) {
      paramView.stopNestedScroll();
      return;
    } 
    if (paramView instanceof l)
      ((l)paramView).stopNestedScroll(); 
  }
  
  private static void P(View paramView) {
    float f = paramView.getTranslationY();
    paramView.setTranslationY(1.0F + f);
    paramView.setTranslationY(f);
  }
  
  public static d0 a(View paramView, d0 paramd0) {
    if (Build.VERSION.SDK_INT >= 21) {
      WindowInsets windowInsets = paramd0.j();
      if (windowInsets != null && !paramView.dispatchApplyWindowInsets(windowInsets).equals(windowInsets))
        return d0.a(windowInsets); 
    } 
    return paramd0;
  }
  
  public static d0 a(View paramView, d0 paramd0, Rect paramRect) {
    return (Build.VERSION.SDK_INT >= 21) ? g.a(paramView, paramd0, paramRect) : paramd0;
  }
  
  private static f<Boolean> a() {
    return new d(b.g.c.tag_accessibility_heading, Boolean.class, 28);
  }
  
  public static z a(View paramView) {
    if (f == null)
      f = new WeakHashMap<View, z>(); 
    z z2 = f.get(paramView);
    z z1 = z2;
    if (z2 == null) {
      z1 = new z(paramView);
      f.put(paramView, z1);
    } 
    return z1;
  }
  
  private static void a(int paramInt, View paramView) {
    List<c.a> list = g(paramView);
    for (int i = 0; i < list.size(); i++) {
      if (((c.a)list.get(i)).a() == paramInt) {
        list.remove(i);
        return;
      } 
    } 
  }
  
  public static void a(View paramView, float paramFloat) {
    if (Build.VERSION.SDK_INT >= 21)
      paramView.setElevation(paramFloat); 
  }
  
  private static void a(View paramView, int paramInt) {
    paramView.offsetLeftAndRight(paramInt);
    if (paramView.getVisibility() == 0) {
      P(paramView);
      ViewParent viewParent = paramView.getParent();
      if (viewParent instanceof View)
        P((View)viewParent); 
    } 
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2) {
    if (Build.VERSION.SDK_INT >= 23)
      paramView.setScrollIndicators(paramInt1, paramInt2); 
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (Build.VERSION.SDK_INT >= 17) {
      paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    paramView.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(View paramView, @SuppressLint({"ContextFirst"}) Context paramContext, int[] paramArrayOfint, AttributeSet paramAttributeSet, TypedArray paramTypedArray, int paramInt1, int paramInt2) {
    if (Build.VERSION.SDK_INT >= 29)
      i.a(paramView, paramContext, paramArrayOfint, paramAttributeSet, paramTypedArray, paramInt1, paramInt2); 
  }
  
  public static void a(View paramView, ColorStateList paramColorStateList) {
    Drawable drawable;
    if (Build.VERSION.SDK_INT >= 21) {
      paramView.setBackgroundTintList(paramColorStateList);
      if (Build.VERSION.SDK_INT == 21) {
        boolean bool;
        drawable = paramView.getBackground();
        if (paramView.getBackgroundTintList() != null || paramView.getBackgroundTintMode() != null) {
          bool = true;
        } else {
          bool = false;
        } 
        if (drawable != null && bool) {
          if (drawable.isStateful())
            drawable.setState(paramView.getDrawableState()); 
          paramView.setBackground(drawable);
          return;
        } 
      } 
    } else if (paramView instanceof u) {
      ((u)paramView).setSupportBackgroundTintList((ColorStateList)drawable);
    } 
  }
  
  public static void a(View paramView, PorterDuff.Mode paramMode) {
    Drawable drawable;
    if (Build.VERSION.SDK_INT >= 21) {
      paramView.setBackgroundTintMode(paramMode);
      if (Build.VERSION.SDK_INT == 21) {
        boolean bool;
        drawable = paramView.getBackground();
        if (paramView.getBackgroundTintList() != null || paramView.getBackgroundTintMode() != null) {
          bool = true;
        } else {
          bool = false;
        } 
        if (drawable != null && bool) {
          if (drawable.isStateful())
            drawable.setState(paramView.getDrawableState()); 
          paramView.setBackground(drawable);
          return;
        } 
      } 
    } else if (paramView instanceof u) {
      ((u)paramView).setSupportBackgroundTintMode((PorterDuff.Mode)drawable);
    } 
  }
  
  public static void a(View paramView, Rect paramRect) {
    if (Build.VERSION.SDK_INT >= 18)
      paramView.setClipBounds(paramRect); 
  }
  
  public static void a(View paramView, Drawable paramDrawable) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.setBackground(paramDrawable);
      return;
    } 
    paramView.setBackgroundDrawable(paramDrawable);
  }
  
  public static void a(View paramView, a parama) {
    View.AccessibilityDelegate accessibilityDelegate;
    a a1 = parama;
    if (parama == null) {
      a1 = parama;
      if (c(paramView) instanceof a.a)
        a1 = new a(); 
    } 
    if (a1 == null) {
      parama = null;
    } else {
      accessibilityDelegate = a1.a();
    } 
    paramView.setAccessibilityDelegate(accessibilityDelegate);
  }
  
  private static void a(View paramView, c.a parama) {
    if (Build.VERSION.SDK_INT >= 21) {
      s(paramView);
      a(parama.a(), paramView);
      g(paramView).add(parama);
      c(paramView, 0);
    } 
  }
  
  public static void a(View paramView, c.a parama, CharSequence paramCharSequence, f paramf) {
    if (paramf == null && paramCharSequence == null) {
      f(paramView, parama.a());
      return;
    } 
    a(paramView, parama.a(paramCharSequence, paramf));
  }
  
  public static void a(View paramView, c paramc) {
    paramView.onInitializeAccessibilityNodeInfo(paramc.x());
  }
  
  public static void a(View paramView, r paramr) {
    if (Build.VERSION.SDK_INT >= 21) {
      if (paramr == null) {
        paramView.setOnApplyWindowInsetsListener(null);
        return;
      } 
      paramView.setOnApplyWindowInsetsListener(new a(paramr));
    } 
  }
  
  public static void a(View paramView, Runnable paramRunnable) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.postOnAnimation(paramRunnable);
      return;
    } 
    paramView.postDelayed(paramRunnable, ValueAnimator.getFrameDelay());
  }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.postOnAnimationDelayed(paramRunnable, paramLong);
      return;
    } 
    paramView.postDelayed(paramRunnable, ValueAnimator.getFrameDelay() + paramLong);
  }
  
  public static void a(View paramView, String paramString) {
    if (Build.VERSION.SDK_INT >= 21) {
      paramView.setTransitionName(paramString);
      return;
    } 
    if (e == null)
      e = new WeakHashMap<View, String>(); 
    e.put(paramView, paramString);
  }
  
  public static void a(View paramView, boolean paramBoolean) {
    a().b(paramView, Boolean.valueOf(paramBoolean));
  }
  
  public static boolean a(View paramView, int paramInt, Bundle paramBundle) {
    return (Build.VERSION.SDK_INT >= 16) ? paramView.performAccessibilityAction(paramInt, paramBundle) : false;
  }
  
  static boolean a(View paramView, KeyEvent paramKeyEvent) {
    return (Build.VERSION.SDK_INT >= 28) ? false : k.a(paramView).a(paramView, paramKeyEvent);
  }
  
  private static Rect b() {
    if (i == null)
      i = new ThreadLocal<Rect>(); 
    Rect rect2 = i.get();
    Rect rect1 = rect2;
    if (rect2 == null) {
      rect1 = new Rect();
      i.set(rect1);
    } 
    rect1.setEmpty();
    return rect1;
  }
  
  public static a b(View paramView) {
    View.AccessibilityDelegate accessibilityDelegate = c(paramView);
    return (accessibilityDelegate == null) ? null : ((accessibilityDelegate instanceof a.a) ? ((a.a)accessibilityDelegate).a : new a(accessibilityDelegate));
  }
  
  public static d0 b(View paramView, d0 paramd0) {
    if (Build.VERSION.SDK_INT >= 21) {
      WindowInsets windowInsets = paramd0.j();
      if (windowInsets != null) {
        WindowInsets windowInsets1 = paramView.onApplyWindowInsets(windowInsets);
        if (!windowInsets1.equals(windowInsets))
          return d0.a(windowInsets1); 
      } 
    } 
    return paramd0;
  }
  
  public static void b(View paramView, float paramFloat) {
    if (Build.VERSION.SDK_INT >= 21)
      paramView.setTranslationZ(paramFloat); 
  }
  
  private static void b(View paramView, int paramInt) {
    paramView.offsetTopAndBottom(paramInt);
    if (paramView.getVisibility() == 0) {
      P(paramView);
      ViewParent viewParent = paramView.getParent();
      if (viewParent instanceof View)
        P((View)viewParent); 
    } 
  }
  
  public static void b(View paramView, boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 16)
      paramView.setHasTransientState(paramBoolean); 
  }
  
  static boolean b(View paramView, KeyEvent paramKeyEvent) {
    return (Build.VERSION.SDK_INT >= 28) ? false : k.a(paramView).a(paramKeyEvent);
  }
  
  private static View.AccessibilityDelegate c(View paramView) {
    return (Build.VERSION.SDK_INT >= 29) ? paramView.getAccessibilityDelegate() : d(paramView);
  }
  
  private static f<CharSequence> c() {
    return new c(b.g.c.tag_accessibility_pane_title, CharSequence.class, 8, 28);
  }
  
  static void c(View paramView, int paramInt) {
    char c;
    if (!((AccessibilityManager)paramView.getContext().getSystemService("accessibility")).isEnabled())
      return; 
    if (f(paramView) != null) {
      c = '\001';
    } else {
      c = Character.MIN_VALUE;
    } 
    if (e(paramView) != 0 || (c && paramView.getVisibility() == 0)) {
      AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain();
      if (c) {
        c = ' ';
      } else {
        c = 'ࠀ';
      } 
      accessibilityEvent.setEventType(c);
      accessibilityEvent.setContentChangeTypes(paramInt);
      paramView.sendAccessibilityEventUnchecked(accessibilityEvent);
      return;
    } 
    if (paramView.getParent() != null)
      try {
        paramView.getParent().notifySubtreeAccessibilityStateChanged(paramView, paramView, paramInt);
        return;
      } catch (AbstractMethodError abstractMethodError) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(paramView.getParent().getClass().getSimpleName());
        stringBuilder.append(" does not fully implement ViewParent");
        Log.e("ViewCompat", stringBuilder.toString(), abstractMethodError);
        return;
      }  
  }
  
  public static void c(View paramView, boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 21) {
      paramView.setNestedScrollingEnabled(paramBoolean);
      return;
    } 
    if (paramView instanceof l)
      ((l)paramView).setNestedScrollingEnabled(paramBoolean); 
  }
  
  private static View.AccessibilityDelegate d(View paramView) {
    // Byte code:
    //   0: getstatic b/g/m/v.h : Z
    //   3: ifeq -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: getstatic b/g/m/v.g : Ljava/lang/reflect/Field;
    //   11: ifnonnull -> 41
    //   14: ldc android/view/View
    //   16: ldc_w 'mAccessibilityDelegate'
    //   19: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   22: putstatic b/g/m/v.g : Ljava/lang/reflect/Field;
    //   25: getstatic b/g/m/v.g : Ljava/lang/reflect/Field;
    //   28: iconst_1
    //   29: invokevirtual setAccessible : (Z)V
    //   32: goto -> 41
    //   35: iconst_1
    //   36: putstatic b/g/m/v.h : Z
    //   39: aconst_null
    //   40: areturn
    //   41: getstatic b/g/m/v.g : Ljava/lang/reflect/Field;
    //   44: aload_0
    //   45: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   48: astore_0
    //   49: aload_0
    //   50: instanceof android/view/View$AccessibilityDelegate
    //   53: ifeq -> 63
    //   56: aload_0
    //   57: checkcast android/view/View$AccessibilityDelegate
    //   60: astore_0
    //   61: aload_0
    //   62: areturn
    //   63: aconst_null
    //   64: areturn
    //   65: iconst_1
    //   66: putstatic b/g/m/v.h : Z
    //   69: aconst_null
    //   70: areturn
    //   71: astore_0
    //   72: goto -> 35
    //   75: astore_0
    //   76: goto -> 65
    // Exception table:
    //   from	to	target	type
    //   14	32	71	finally
    //   41	61	75	finally
  }
  
  private static f<Boolean> d() {
    return new b(b.g.c.tag_screen_reader_focusable, Boolean.class, 28);
  }
  
  public static void d(View paramView, int paramInt) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      paramView.offsetLeftAndRight(paramInt);
      return;
    } 
    if (i >= 21) {
      Rect rect = b();
      i = 0;
      ViewParent viewParent = paramView.getParent();
      if (viewParent instanceof View) {
        View view = (View)viewParent;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        i = rect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()) ^ true;
      } 
      a(paramView, paramInt);
      if (i != 0 && rect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom())) {
        ((View)viewParent).invalidate(rect);
        return;
      } 
    } else {
      a(paramView, paramInt);
    } 
  }
  
  public static int e(View paramView) {
    return (Build.VERSION.SDK_INT >= 19) ? paramView.getAccessibilityLiveRegion() : 0;
  }
  
  public static void e(View paramView, int paramInt) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      paramView.offsetTopAndBottom(paramInt);
      return;
    } 
    if (i >= 21) {
      Rect rect = b();
      i = 0;
      ViewParent viewParent = paramView.getParent();
      if (viewParent instanceof View) {
        View view = (View)viewParent;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        i = rect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()) ^ true;
      } 
      b(paramView, paramInt);
      if (i != 0 && rect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom())) {
        ((View)viewParent).invalidate(rect);
        return;
      } 
    } else {
      b(paramView, paramInt);
    } 
  }
  
  public static CharSequence f(View paramView) {
    return c().b(paramView);
  }
  
  public static void f(View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT >= 21) {
      a(paramInt, paramView);
      c(paramView, 0);
    } 
  }
  
  private static List<c.a> g(View paramView) {
    ArrayList<c.a> arrayList2 = (ArrayList)paramView.getTag(b.g.c.tag_accessibility_actions);
    ArrayList<c.a> arrayList1 = arrayList2;
    if (arrayList2 == null) {
      arrayList1 = new ArrayList();
      paramView.setTag(b.g.c.tag_accessibility_actions, arrayList1);
    } 
    return arrayList1;
  }
  
  public static void g(View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT >= 19)
      paramView.setAccessibilityLiveRegion(paramInt); 
  }
  
  public static ColorStateList h(View paramView) {
    return (Build.VERSION.SDK_INT >= 21) ? paramView.getBackgroundTintList() : ((paramView instanceof u) ? ((u)paramView).getSupportBackgroundTintList() : null);
  }
  
  public static void h(View paramView, int paramInt) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 19) {
      i = paramInt;
    } else if (i >= 16) {
      i = paramInt;
      if (paramInt == 4)
        i = 2; 
    } else {
      return;
    } 
    paramView.setImportantForAccessibility(i);
  }
  
  public static PorterDuff.Mode i(View paramView) {
    return (Build.VERSION.SDK_INT >= 21) ? paramView.getBackgroundTintMode() : ((paramView instanceof u) ? ((u)paramView).getSupportBackgroundTintMode() : null);
  }
  
  public static void i(View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT >= 26)
      paramView.setImportantForAutofill(paramInt); 
  }
  
  public static Rect j(View paramView) {
    return (Build.VERSION.SDK_INT >= 18) ? paramView.getClipBounds() : null;
  }
  
  public static Display k(View paramView) {
    return (Build.VERSION.SDK_INT >= 17) ? paramView.getDisplay() : (G(paramView) ? ((WindowManager)paramView.getContext().getSystemService("window")).getDefaultDisplay() : null);
  }
  
  public static float l(View paramView) {
    return (Build.VERSION.SDK_INT >= 21) ? paramView.getElevation() : 0.0F;
  }
  
  public static boolean m(View paramView) {
    return (Build.VERSION.SDK_INT >= 16) ? paramView.getFitsSystemWindows() : false;
  }
  
  public static int n(View paramView) {
    return (Build.VERSION.SDK_INT >= 16) ? paramView.getImportantForAccessibility() : 0;
  }
  
  @SuppressLint({"InlinedApi"})
  public static int o(View paramView) {
    return (Build.VERSION.SDK_INT >= 26) ? paramView.getImportantForAutofill() : 0;
  }
  
  public static int p(View paramView) {
    return (Build.VERSION.SDK_INT >= 17) ? paramView.getLayoutDirection() : 0;
  }
  
  public static int q(View paramView) {
    if (Build.VERSION.SDK_INT >= 16)
      return paramView.getMinimumHeight(); 
    if (!d) {
      try {
        c = View.class.getDeclaredField("mMinHeight");
        c.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {}
      d = true;
    } 
    Field field = c;
    if (field != null)
      try {
        return ((Integer)field.get(paramView)).intValue();
      } catch (Exception exception) {} 
    return 0;
  }
  
  public static int r(View paramView) {
    if (Build.VERSION.SDK_INT >= 16)
      return paramView.getMinimumWidth(); 
    if (!b) {
      try {
        a = View.class.getDeclaredField("mMinWidth");
        a.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {}
      b = true;
    } 
    Field field = a;
    if (field != null)
      try {
        return ((Integer)field.get(paramView)).intValue();
      } catch (Exception exception) {} 
    return 0;
  }
  
  static a s(View paramView) {
    a a2 = b(paramView);
    a a1 = a2;
    if (a2 == null)
      a1 = new a(); 
    a(paramView, a1);
    return a1;
  }
  
  public static int t(View paramView) {
    return (Build.VERSION.SDK_INT >= 17) ? paramView.getPaddingEnd() : paramView.getPaddingRight();
  }
  
  public static int u(View paramView) {
    return (Build.VERSION.SDK_INT >= 17) ? paramView.getPaddingStart() : paramView.getPaddingLeft();
  }
  
  public static ViewParent v(View paramView) {
    return (Build.VERSION.SDK_INT >= 16) ? paramView.getParentForAccessibility() : paramView.getParent();
  }
  
  public static d0 w(View paramView) {
    return (Build.VERSION.SDK_INT >= 23) ? d0.a(h.a(paramView)) : null;
  }
  
  public static String x(View paramView) {
    if (Build.VERSION.SDK_INT >= 21)
      return paramView.getTransitionName(); 
    WeakHashMap<View, String> weakHashMap = e;
    return (weakHashMap == null) ? null : weakHashMap.get(paramView);
  }
  
  public static float y(View paramView) {
    return (Build.VERSION.SDK_INT >= 21) ? paramView.getTranslationZ() : 0.0F;
  }
  
  public static int z(View paramView) {
    return (Build.VERSION.SDK_INT >= 16) ? paramView.getWindowSystemUiVisibility() : 0;
  }
  
  static {
    new AtomicInteger(1);
  }
  
  class a implements View.OnApplyWindowInsetsListener {
    a(v this$0) {}
    
    public WindowInsets onApplyWindowInsets(View param1View, WindowInsets param1WindowInsets) {
      d0 d0 = d0.a(param1WindowInsets);
      return this.a.a(param1View, d0).j();
    }
  }
  
  class b extends f<Boolean> {
    b(v this$0, Class<Boolean> param1Class, int param1Int1) {
      super(this$0, param1Class, param1Int1);
    }
    
    Boolean a(View param1View) {
      return Boolean.valueOf(param1View.isScreenReaderFocusable());
    }
    
    void a(View param1View, Boolean param1Boolean) {
      param1View.setScreenReaderFocusable(param1Boolean.booleanValue());
    }
    
    boolean b(Boolean param1Boolean1, Boolean param1Boolean2) {
      return a(param1Boolean1, param1Boolean2) ^ true;
    }
  }
  
  class c extends f<CharSequence> {
    c(v this$0, Class<CharSequence> param1Class, int param1Int1, int param1Int2) {
      super(this$0, param1Class, param1Int1, param1Int2);
    }
    
    CharSequence a(View param1View) {
      return param1View.getAccessibilityPaneTitle();
    }
    
    void a(View param1View, CharSequence param1CharSequence) {
      param1View.setAccessibilityPaneTitle(param1CharSequence);
    }
    
    boolean a(CharSequence param1CharSequence1, CharSequence param1CharSequence2) {
      return TextUtils.equals(param1CharSequence1, param1CharSequence2) ^ true;
    }
  }
  
  class d extends f<Boolean> {
    d(v this$0, Class<Boolean> param1Class, int param1Int1) {
      super(this$0, param1Class, param1Int1);
    }
    
    Boolean a(View param1View) {
      return Boolean.valueOf(param1View.isAccessibilityHeading());
    }
    
    void a(View param1View, Boolean param1Boolean) {
      param1View.setAccessibilityHeading(param1Boolean.booleanValue());
    }
    
    boolean b(Boolean param1Boolean1, Boolean param1Boolean2) {
      return a(param1Boolean1, param1Boolean2) ^ true;
    }
  }
  
  static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    private WeakHashMap<View, Boolean> c = new WeakHashMap<View, Boolean>();
    
    private void a(View param1View) {
      param1View.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
    
    private void a(View param1View, boolean param1Boolean) {
      boolean bool;
      if (param1View.getVisibility() == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      if (param1Boolean != bool) {
        if (bool)
          v.c(param1View, 16); 
        this.c.put(param1View, Boolean.valueOf(bool));
      } 
    }
    
    public void onGlobalLayout() {
      for (Map.Entry<View, Boolean> entry : this.c.entrySet())
        a((View)entry.getKey(), ((Boolean)entry.getValue()).booleanValue()); 
    }
    
    public void onViewAttachedToWindow(View param1View) {
      a(param1View);
    }
    
    public void onViewDetachedFromWindow(View param1View) {}
  }
  
  static abstract class f<T> {
    private final int a;
    
    private final Class<T> b;
    
    private final int c;
    
    f(int param1Int1, Class<T> param1Class, int param1Int2) {
      this(param1Int1, param1Class, 0, param1Int2);
    }
    
    f(int param1Int1, Class<T> param1Class, int param1Int2, int param1Int3) {
      this.a = param1Int1;
      this.b = param1Class;
      this.c = param1Int3;
    }
    
    private boolean a() {
      return (Build.VERSION.SDK_INT >= 19);
    }
    
    private boolean b() {
      return (Build.VERSION.SDK_INT >= this.c);
    }
    
    abstract T a(View param1View);
    
    abstract void a(View param1View, T param1T);
    
    boolean a(Boolean param1Boolean1, Boolean param1Boolean2) {
      boolean bool1;
      boolean bool2;
      boolean bool = false;
      if (param1Boolean1 == null) {
        bool1 = false;
      } else {
        bool1 = param1Boolean1.booleanValue();
      } 
      if (param1Boolean2 == null) {
        bool2 = false;
      } else {
        bool2 = param1Boolean2.booleanValue();
      } 
      if (bool1 == bool2)
        bool = true; 
      return bool;
    }
    
    abstract boolean a(T param1T1, T param1T2);
    
    T b(View param1View) {
      if (b())
        return a(param1View); 
      if (a()) {
        Object object = param1View.getTag(this.a);
        if (this.b.isInstance(object))
          return (T)object; 
      } 
      return null;
    }
    
    void b(View param1View, T param1T) {
      if (b()) {
        a(param1View, param1T);
        return;
      } 
      if (a() && a(b(param1View), param1T)) {
        v.s(param1View);
        param1View.setTag(this.a, param1T);
        v.c(param1View, 0);
      } 
    }
  }
  
  private static class g {
    static d0 a(View param1View, d0 param1d0, Rect param1Rect) {
      WindowInsets windowInsets = param1d0.j();
      if (windowInsets != null)
        return d0.a(param1View.computeSystemWindowInsets(windowInsets, param1Rect)); 
      param1Rect.setEmpty();
      return param1d0;
    }
  }
  
  private static class h {
    public static WindowInsets a(View param1View) {
      return param1View.getRootWindowInsets();
    }
  }
  
  private static class i {
    static void a(View param1View, Context param1Context, int[] param1ArrayOfint, AttributeSet param1AttributeSet, TypedArray param1TypedArray, int param1Int1, int param1Int2) {
      param1View.saveAttributeDataForStyleable(param1Context, param1ArrayOfint, param1AttributeSet, param1TypedArray, param1Int1, param1Int2);
    }
  }
  
  public static interface j {
    boolean a(View param1View, KeyEvent param1KeyEvent);
  }
  
  static class k {
    private static final ArrayList<WeakReference<View>> d = new ArrayList<WeakReference<View>>();
    
    private WeakHashMap<View, Boolean> a = null;
    
    private SparseArray<WeakReference<View>> b = null;
    
    private WeakReference<KeyEvent> c = null;
    
    private SparseArray<WeakReference<View>> a() {
      if (this.b == null)
        this.b = new SparseArray(); 
      return this.b;
    }
    
    static k a(View param1View) {
      k k2 = (k)param1View.getTag(b.g.c.tag_unhandled_key_event_manager);
      k k1 = k2;
      if (k2 == null) {
        k1 = new k();
        param1View.setTag(b.g.c.tag_unhandled_key_event_manager, k1);
      } 
      return k1;
    }
    
    private View b(View param1View, KeyEvent param1KeyEvent) {
      WeakHashMap<View, Boolean> weakHashMap = this.a;
      if (weakHashMap != null) {
        if (!weakHashMap.containsKey(param1View))
          return null; 
        if (param1View instanceof ViewGroup) {
          ViewGroup viewGroup = (ViewGroup)param1View;
          for (int i = viewGroup.getChildCount() - 1; i >= 0; i--) {
            View view = b(viewGroup.getChildAt(i), param1KeyEvent);
            if (view != null)
              return view; 
          } 
        } 
        if (c(param1View, param1KeyEvent))
          return param1View; 
      } 
      return null;
    }
    
    private void b() {
      null = this.a;
      if (null != null)
        null.clear(); 
      if (d.isEmpty())
        return; 
      synchronized (d) {
        if (this.a == null)
          this.a = new WeakHashMap<View, Boolean>(); 
        for (int i = d.size() - 1;; i--) {
          if (i >= 0) {
            View view = ((WeakReference<View>)d.get(i)).get();
            if (view == null) {
              d.remove(i);
            } else {
              this.a.put(view, Boolean.TRUE);
              for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent())
                this.a.put((View)viewParent, Boolean.TRUE); 
            } 
          } else {
            return;
          } 
        } 
      } 
    }
    
    private boolean c(View param1View, KeyEvent param1KeyEvent) {
      ArrayList<v.j> arrayList = (ArrayList)param1View.getTag(b.g.c.tag_unhandled_key_listeners);
      if (arrayList != null)
        for (int i = arrayList.size() - 1; i >= 0; i--) {
          if (((v.j)arrayList.get(i)).a(param1View, param1KeyEvent))
            return true; 
        }  
      return false;
    }
    
    boolean a(KeyEvent param1KeyEvent) {
      WeakReference<KeyEvent> weakReference1 = this.c;
      if (weakReference1 != null && weakReference1.get() == param1KeyEvent)
        return false; 
      this.c = new WeakReference<KeyEvent>(param1KeyEvent);
      WeakReference<KeyEvent> weakReference2 = null;
      SparseArray<WeakReference<View>> sparseArray = a();
      weakReference1 = weakReference2;
      if (param1KeyEvent.getAction() == 1) {
        int i = sparseArray.indexOfKey(param1KeyEvent.getKeyCode());
        weakReference1 = weakReference2;
        if (i >= 0) {
          weakReference1 = (WeakReference<KeyEvent>)sparseArray.valueAt(i);
          sparseArray.removeAt(i);
        } 
      } 
      weakReference2 = weakReference1;
      if (weakReference1 == null)
        weakReference2 = (WeakReference<KeyEvent>)sparseArray.get(param1KeyEvent.getKeyCode()); 
      if (weakReference2 != null) {
        View view = (View)weakReference2.get();
        if (view != null && v.G(view))
          c(view, param1KeyEvent); 
        return true;
      } 
      return false;
    }
    
    boolean a(View param1View, KeyEvent param1KeyEvent) {
      if (param1KeyEvent.getAction() == 0)
        b(); 
      param1View = b(param1View, param1KeyEvent);
      if (param1KeyEvent.getAction() == 0) {
        int i = param1KeyEvent.getKeyCode();
        if (param1View != null && !KeyEvent.isModifierKey(i))
          a().put(i, new WeakReference<View>(param1View)); 
      } 
      return (param1View != null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/m/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */