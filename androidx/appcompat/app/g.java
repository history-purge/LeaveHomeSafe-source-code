package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.x0;
import b.g.m.a0;
import b.g.m.b0;
import b.g.m.d0;
import b.g.m.v;
import b.g.m.z;
import java.util.List;

class g extends f implements g.a, LayoutInflater.Factory2 {
  private static final b.d.g<String, Integer> c0 = new b.d.g();
  
  private static final boolean d0;
  
  private static final int[] e0 = new int[] { 16842836 };
  
  private static final boolean f0 = "robolectric".equals(Build.FINGERPRINT) ^ true;
  
  private static final boolean g0;
  
  private static boolean h0;
  
  private boolean A;
  
  private boolean B;
  
  boolean C;
  
  boolean D;
  
  boolean E;
  
  boolean F;
  
  boolean G;
  
  private boolean H;
  
  private s[] I;
  
  private s J;
  
  private boolean K;
  
  private boolean L;
  
  private boolean M;
  
  private boolean N;
  
  boolean O;
  
  private int P = -100;
  
  private int Q;
  
  private boolean R;
  
  private boolean S;
  
  private l T;
  
  private l U;
  
  boolean V;
  
  int W;
  
  private final Runnable X = new b(this);
  
  private boolean Y;
  
  private Rect Z;
  
  private Rect a0;
  
  private i b0;
  
  final Object f;
  
  final Context g;
  
  Window h;
  
  private j i;
  
  final e j;
  
  a k;
  
  MenuInflater l;
  
  private CharSequence m;
  
  private c0 n;
  
  private h o;
  
  private t p;
  
  b.a.o.b q;
  
  ActionBarContextView r;
  
  PopupWindow s;
  
  Runnable t;
  
  z u = null;
  
  private boolean v = true;
  
  private boolean w;
  
  ViewGroup x;
  
  private TextView y;
  
  private View z;
  
  static {
    boolean bool1 = bool2;
    if (Build.VERSION.SDK_INT >= 17)
      bool1 = true; 
    g0 = bool1;
    if (d0 && !h0) {
      Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
      h0 = true;
    } 
  }
  
  g(Activity paramActivity, e parame) {
    this((Context)paramActivity, null, parame, paramActivity);
  }
  
  g(Dialog paramDialog, e parame) {
    this(paramDialog.getContext(), paramDialog.getWindow(), parame, paramDialog);
  }
  
  private g(Context paramContext, Window paramWindow, e parame, Object paramObject) {
    this.g = paramContext;
    this.j = parame;
    this.f = paramObject;
    if (this.P == -100 && this.f instanceof Dialog) {
      d d = D();
      if (d != null)
        this.P = d.p().a(); 
    } 
    if (this.P == -100) {
      Integer integer = (Integer)c0.get(this.f.getClass().getName());
      if (integer != null) {
        this.P = integer.intValue();
        c0.remove(this.f.getClass().getName());
      } 
    } 
    if (paramWindow != null)
      a(paramWindow); 
    androidx.appcompat.widget.j.c();
  }
  
  private void A() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial y : ()V
    //   4: aload_0
    //   5: getfield C : Z
    //   8: ifeq -> 94
    //   11: aload_0
    //   12: getfield k : Landroidx/appcompat/app/a;
    //   15: ifnull -> 19
    //   18: return
    //   19: aload_0
    //   20: getfield f : Ljava/lang/Object;
    //   23: astore_1
    //   24: aload_1
    //   25: instanceof android/app/Activity
    //   28: ifeq -> 55
    //   31: new androidx/appcompat/app/n
    //   34: dup
    //   35: aload_1
    //   36: checkcast android/app/Activity
    //   39: aload_0
    //   40: getfield D : Z
    //   43: invokespecial <init> : (Landroid/app/Activity;Z)V
    //   46: astore_1
    //   47: aload_0
    //   48: aload_1
    //   49: putfield k : Landroidx/appcompat/app/a;
    //   52: goto -> 77
    //   55: aload_1
    //   56: instanceof android/app/Dialog
    //   59: ifeq -> 77
    //   62: new androidx/appcompat/app/n
    //   65: dup
    //   66: aload_1
    //   67: checkcast android/app/Dialog
    //   70: invokespecial <init> : (Landroid/app/Dialog;)V
    //   73: astore_1
    //   74: goto -> 47
    //   77: aload_0
    //   78: getfield k : Landroidx/appcompat/app/a;
    //   81: astore_1
    //   82: aload_1
    //   83: ifnull -> 94
    //   86: aload_1
    //   87: aload_0
    //   88: getfield Y : Z
    //   91: invokevirtual c : (Z)V
    //   94: return
  }
  
  private boolean B() {
    if (!this.S && this.f instanceof Activity) {
      PackageManager packageManager = this.g.getPackageManager();
      if (packageManager == null)
        return false; 
      try {
        boolean bool1;
        boolean bool2;
        if (Build.VERSION.SDK_INT >= 29) {
          bool1 = true;
        } else if (Build.VERSION.SDK_INT >= 24) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.g, this.f.getClass()), bool1);
        if (activityInfo != null && (activityInfo.configChanges & 0x200) != 0) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        this.R = bool2;
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", (Throwable)nameNotFoundException);
        this.R = false;
      } 
    } 
    this.S = true;
    return this.R;
  }
  
  private void C() {
    if (!this.w)
      return; 
    throw new AndroidRuntimeException("Window feature must be requested before adding content");
  }
  
  private d D() {
    Context context = this.g;
    while (context != null) {
      if (context instanceof d)
        return (d)context; 
      if (context instanceof ContextWrapper)
        context = ((ContextWrapper)context).getBaseContext(); 
    } 
    return null;
  }
  
  private Configuration a(Context paramContext, int paramInt, Configuration paramConfiguration) {
    if (paramInt != 1) {
      if (paramInt != 2) {
        paramInt = (paramContext.getApplicationContext().getResources().getConfiguration()).uiMode & 0x30;
      } else {
        paramInt = 32;
      } 
    } else {
      paramInt = 16;
    } 
    Configuration configuration = new Configuration();
    configuration.fontScale = 0.0F;
    if (paramConfiguration != null)
      configuration.setTo(paramConfiguration); 
    configuration.uiMode = paramInt | configuration.uiMode & 0xFFFFFFCF;
    return configuration;
  }
  
  private static Configuration a(Configuration paramConfiguration1, Configuration paramConfiguration2) {
    Configuration configuration = new Configuration();
    configuration.fontScale = 0.0F;
    if (paramConfiguration2 != null) {
      if (paramConfiguration1.diff(paramConfiguration2) == 0)
        return configuration; 
      float f1 = paramConfiguration1.fontScale;
      float f2 = paramConfiguration2.fontScale;
      if (f1 != f2)
        configuration.fontScale = f2; 
      int k = paramConfiguration1.mcc;
      int m = paramConfiguration2.mcc;
      if (k != m)
        configuration.mcc = m; 
      k = paramConfiguration1.mnc;
      m = paramConfiguration2.mnc;
      if (k != m)
        configuration.mnc = m; 
      if (Build.VERSION.SDK_INT >= 24) {
        o.a(paramConfiguration1, paramConfiguration2, configuration);
      } else if (!androidx.core.util.b.a(paramConfiguration1.locale, paramConfiguration2.locale)) {
        configuration.locale = paramConfiguration2.locale;
      } 
      k = paramConfiguration1.touchscreen;
      m = paramConfiguration2.touchscreen;
      if (k != m)
        configuration.touchscreen = m; 
      k = paramConfiguration1.keyboard;
      m = paramConfiguration2.keyboard;
      if (k != m)
        configuration.keyboard = m; 
      k = paramConfiguration1.keyboardHidden;
      m = paramConfiguration2.keyboardHidden;
      if (k != m)
        configuration.keyboardHidden = m; 
      k = paramConfiguration1.navigation;
      m = paramConfiguration2.navigation;
      if (k != m)
        configuration.navigation = m; 
      k = paramConfiguration1.navigationHidden;
      m = paramConfiguration2.navigationHidden;
      if (k != m)
        configuration.navigationHidden = m; 
      k = paramConfiguration1.orientation;
      m = paramConfiguration2.orientation;
      if (k != m)
        configuration.orientation = m; 
      k = paramConfiguration1.screenLayout;
      m = paramConfiguration2.screenLayout;
      if ((k & 0xF) != (m & 0xF))
        configuration.screenLayout |= m & 0xF; 
      k = paramConfiguration1.screenLayout;
      m = paramConfiguration2.screenLayout;
      if ((k & 0xC0) != (m & 0xC0))
        configuration.screenLayout |= m & 0xC0; 
      k = paramConfiguration1.screenLayout;
      m = paramConfiguration2.screenLayout;
      if ((k & 0x30) != (m & 0x30))
        configuration.screenLayout |= m & 0x30; 
      k = paramConfiguration1.screenLayout;
      m = paramConfiguration2.screenLayout;
      if ((k & 0x300) != (m & 0x300))
        configuration.screenLayout |= m & 0x300; 
      if (Build.VERSION.SDK_INT >= 26)
        p.a(paramConfiguration1, paramConfiguration2, configuration); 
      k = paramConfiguration1.uiMode;
      m = paramConfiguration2.uiMode;
      if ((k & 0xF) != (m & 0xF))
        configuration.uiMode |= m & 0xF; 
      k = paramConfiguration1.uiMode;
      m = paramConfiguration2.uiMode;
      if ((k & 0x30) != (m & 0x30))
        configuration.uiMode |= m & 0x30; 
      k = paramConfiguration1.screenWidthDp;
      m = paramConfiguration2.screenWidthDp;
      if (k != m)
        configuration.screenWidthDp = m; 
      k = paramConfiguration1.screenHeightDp;
      m = paramConfiguration2.screenHeightDp;
      if (k != m)
        configuration.screenHeightDp = m; 
      k = paramConfiguration1.smallestScreenWidthDp;
      m = paramConfiguration2.smallestScreenWidthDp;
      if (k != m)
        configuration.smallestScreenWidthDp = m; 
      if (Build.VERSION.SDK_INT >= 17)
        n.a(paramConfiguration1, paramConfiguration2, configuration); 
    } 
    return configuration;
  }
  
  private void a(int paramInt, boolean paramBoolean, Configuration paramConfiguration) {
    Resources resources = this.g.getResources();
    Configuration configuration = new Configuration(resources.getConfiguration());
    if (paramConfiguration != null)
      configuration.updateFrom(paramConfiguration); 
    configuration.uiMode = paramInt | (resources.getConfiguration()).uiMode & 0xFFFFFFCF;
    resources.updateConfiguration(configuration, null);
    if (Build.VERSION.SDK_INT < 26)
      j.a(resources); 
    paramInt = this.Q;
    if (paramInt != 0) {
      this.g.setTheme(paramInt);
      if (Build.VERSION.SDK_INT >= 23)
        this.g.getTheme().applyStyle(this.Q, true); 
    } 
    if (paramBoolean) {
      Object object = this.f;
      if (object instanceof Activity) {
        object = object;
        if ((object instanceof androidx.lifecycle.j) ? ((androidx.lifecycle.j)object).a().a().a(androidx.lifecycle.g.c.f) : this.N)
          object.onConfigurationChanged(configuration); 
      } 
    } 
  }
  
  private void a(Window paramWindow) {
    if (this.h == null) {
      Window.Callback callback = paramWindow.getCallback();
      if (!(callback instanceof j)) {
        this.i = new j(this, callback);
        paramWindow.setCallback((Window.Callback)this.i);
        x0 x0 = x0.a(this.g, null, e0);
        Drawable drawable = x0.c(0);
        if (drawable != null)
          paramWindow.setBackgroundDrawable(drawable); 
        x0.b();
        this.h = paramWindow;
        return;
      } 
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    } 
    throw new IllegalStateException("AppCompat has already installed itself into the Window");
  }
  
  private void a(s params, KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_1
    //   1: getfield o : Z
    //   4: ifne -> 408
    //   7: aload_0
    //   8: getfield O : Z
    //   11: ifeq -> 15
    //   14: return
    //   15: aload_1
    //   16: getfield a : I
    //   19: ifne -> 54
    //   22: aload_0
    //   23: getfield g : Landroid/content/Context;
    //   26: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   29: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   32: getfield screenLayout : I
    //   35: bipush #15
    //   37: iand
    //   38: iconst_4
    //   39: if_icmpne -> 47
    //   42: iconst_1
    //   43: istore_3
    //   44: goto -> 49
    //   47: iconst_0
    //   48: istore_3
    //   49: iload_3
    //   50: ifeq -> 54
    //   53: return
    //   54: aload_0
    //   55: invokevirtual p : ()Landroid/view/Window$Callback;
    //   58: astore #4
    //   60: aload #4
    //   62: ifnull -> 90
    //   65: aload #4
    //   67: aload_1
    //   68: getfield a : I
    //   71: aload_1
    //   72: getfield j : Landroidx/appcompat/view/menu/g;
    //   75: invokeinterface onMenuOpened : (ILandroid/view/Menu;)Z
    //   80: ifne -> 90
    //   83: aload_0
    //   84: aload_1
    //   85: iconst_1
    //   86: invokevirtual a : (Landroidx/appcompat/app/g$s;Z)V
    //   89: return
    //   90: aload_0
    //   91: getfield g : Landroid/content/Context;
    //   94: ldc_w 'window'
    //   97: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   100: checkcast android/view/WindowManager
    //   103: astore #5
    //   105: aload #5
    //   107: ifnonnull -> 111
    //   110: return
    //   111: aload_0
    //   112: aload_1
    //   113: aload_2
    //   114: invokespecial b : (Landroidx/appcompat/app/g$s;Landroid/view/KeyEvent;)Z
    //   117: ifne -> 121
    //   120: return
    //   121: aload_1
    //   122: getfield g : Landroid/view/ViewGroup;
    //   125: ifnull -> 169
    //   128: aload_1
    //   129: getfield q : Z
    //   132: ifeq -> 138
    //   135: goto -> 169
    //   138: aload_1
    //   139: getfield i : Landroid/view/View;
    //   142: astore_2
    //   143: aload_2
    //   144: ifnull -> 334
    //   147: aload_2
    //   148: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   151: astore_2
    //   152: aload_2
    //   153: ifnull -> 334
    //   156: aload_2
    //   157: getfield width : I
    //   160: iconst_m1
    //   161: if_icmpne -> 334
    //   164: iconst_m1
    //   165: istore_3
    //   166: goto -> 337
    //   169: aload_1
    //   170: getfield g : Landroid/view/ViewGroup;
    //   173: astore_2
    //   174: aload_2
    //   175: ifnonnull -> 194
    //   178: aload_0
    //   179: aload_1
    //   180: invokespecial b : (Landroidx/appcompat/app/g$s;)Z
    //   183: ifeq -> 193
    //   186: aload_1
    //   187: getfield g : Landroid/view/ViewGroup;
    //   190: ifnonnull -> 215
    //   193: return
    //   194: aload_1
    //   195: getfield q : Z
    //   198: ifeq -> 215
    //   201: aload_2
    //   202: invokevirtual getChildCount : ()I
    //   205: ifle -> 215
    //   208: aload_1
    //   209: getfield g : Landroid/view/ViewGroup;
    //   212: invokevirtual removeAllViews : ()V
    //   215: aload_0
    //   216: aload_1
    //   217: invokespecial a : (Landroidx/appcompat/app/g$s;)Z
    //   220: ifeq -> 403
    //   223: aload_1
    //   224: invokevirtual a : ()Z
    //   227: ifne -> 233
    //   230: goto -> 403
    //   233: aload_1
    //   234: getfield h : Landroid/view/View;
    //   237: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   240: astore #4
    //   242: aload #4
    //   244: astore_2
    //   245: aload #4
    //   247: ifnonnull -> 262
    //   250: new android/view/ViewGroup$LayoutParams
    //   253: dup
    //   254: bipush #-2
    //   256: bipush #-2
    //   258: invokespecial <init> : (II)V
    //   261: astore_2
    //   262: aload_1
    //   263: getfield b : I
    //   266: istore_3
    //   267: aload_1
    //   268: getfield g : Landroid/view/ViewGroup;
    //   271: iload_3
    //   272: invokevirtual setBackgroundResource : (I)V
    //   275: aload_1
    //   276: getfield h : Landroid/view/View;
    //   279: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   282: astore #4
    //   284: aload #4
    //   286: instanceof android/view/ViewGroup
    //   289: ifeq -> 304
    //   292: aload #4
    //   294: checkcast android/view/ViewGroup
    //   297: aload_1
    //   298: getfield h : Landroid/view/View;
    //   301: invokevirtual removeView : (Landroid/view/View;)V
    //   304: aload_1
    //   305: getfield g : Landroid/view/ViewGroup;
    //   308: aload_1
    //   309: getfield h : Landroid/view/View;
    //   312: aload_2
    //   313: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   316: aload_1
    //   317: getfield h : Landroid/view/View;
    //   320: invokevirtual hasFocus : ()Z
    //   323: ifne -> 334
    //   326: aload_1
    //   327: getfield h : Landroid/view/View;
    //   330: invokevirtual requestFocus : ()Z
    //   333: pop
    //   334: bipush #-2
    //   336: istore_3
    //   337: aload_1
    //   338: iconst_0
    //   339: putfield n : Z
    //   342: new android/view/WindowManager$LayoutParams
    //   345: dup
    //   346: iload_3
    //   347: bipush #-2
    //   349: aload_1
    //   350: getfield d : I
    //   353: aload_1
    //   354: getfield e : I
    //   357: sipush #1002
    //   360: ldc_w 8519680
    //   363: bipush #-3
    //   365: invokespecial <init> : (IIIIIII)V
    //   368: astore_2
    //   369: aload_2
    //   370: aload_1
    //   371: getfield c : I
    //   374: putfield gravity : I
    //   377: aload_2
    //   378: aload_1
    //   379: getfield f : I
    //   382: putfield windowAnimations : I
    //   385: aload #5
    //   387: aload_1
    //   388: getfield g : Landroid/view/ViewGroup;
    //   391: aload_2
    //   392: invokeinterface addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   397: aload_1
    //   398: iconst_1
    //   399: putfield o : Z
    //   402: return
    //   403: aload_1
    //   404: iconst_1
    //   405: putfield q : Z
    //   408: return
  }
  
  private boolean a(ViewParent paramViewParent) {
    if (paramViewParent == null)
      return false; 
    View view = this.h.getDecorView();
    while (true) {
      if (paramViewParent == null)
        return true; 
      if (paramViewParent != view && paramViewParent instanceof View) {
        if (v.G((View)paramViewParent))
          return false; 
        paramViewParent = paramViewParent.getParent();
        continue;
      } 
      break;
    } 
    return false;
  }
  
  private boolean a(s params) {
    View view = params.i;
    if (view != null) {
      params.h = view;
      return true;
    } 
    if (params.j == null)
      return false; 
    if (this.p == null)
      this.p = new t(this); 
    params.h = (View)params.a(this.p);
    return (params.h != null);
  }
  
  private boolean a(s params, int paramInt1, KeyEvent paramKeyEvent, int paramInt2) {
    // Byte code:
    //   0: aload_3
    //   1: invokevirtual isSystem : ()Z
    //   4: istore #5
    //   6: iconst_0
    //   7: istore #6
    //   9: iload #5
    //   11: ifeq -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: aload_1
    //   17: getfield m : Z
    //   20: ifne -> 36
    //   23: iload #6
    //   25: istore #5
    //   27: aload_0
    //   28: aload_1
    //   29: aload_3
    //   30: invokespecial b : (Landroidx/appcompat/app/g$s;Landroid/view/KeyEvent;)Z
    //   33: ifeq -> 62
    //   36: aload_1
    //   37: getfield j : Landroidx/appcompat/view/menu/g;
    //   40: astore #7
    //   42: iload #6
    //   44: istore #5
    //   46: aload #7
    //   48: ifnull -> 62
    //   51: aload #7
    //   53: iload_2
    //   54: aload_3
    //   55: iload #4
    //   57: invokevirtual performShortcut : (ILandroid/view/KeyEvent;I)Z
    //   60: istore #5
    //   62: iload #5
    //   64: ifeq -> 87
    //   67: iload #4
    //   69: iconst_1
    //   70: iand
    //   71: ifne -> 87
    //   74: aload_0
    //   75: getfield n : Landroidx/appcompat/widget/c0;
    //   78: ifnonnull -> 87
    //   81: aload_0
    //   82: aload_1
    //   83: iconst_1
    //   84: invokevirtual a : (Landroidx/appcompat/app/g$s;Z)V
    //   87: iload #5
    //   89: ireturn
  }
  
  private boolean a(boolean paramBoolean) {
    if (this.O)
      return false; 
    int k = v();
    paramBoolean = b(a(this.g, k), paramBoolean);
    if (k == 0) {
      d(this.g).e();
    } else {
      l l2 = this.T;
      if (l2 != null)
        l2.a(); 
    } 
    if (k == 3) {
      c(this.g).e();
      return paramBoolean;
    } 
    l l1 = this.U;
    if (l1 != null)
      l1.a(); 
    return paramBoolean;
  }
  
  private void b(View paramView) {
    int k;
    Context context;
    if ((v.z(paramView) & 0x2000) != 0) {
      k = 1;
    } else {
      k = 0;
    } 
    if (k) {
      context = this.g;
      k = b.a.c.abc_decor_view_status_guard_light;
    } else {
      context = this.g;
      k = b.a.c.abc_decor_view_status_guard;
    } 
    paramView.setBackgroundColor(b.g.e.a.a(context, k));
  }
  
  private void b(boolean paramBoolean) {
    c0 c01 = this.n;
    if (c01 != null && c01.f() && (!ViewConfiguration.get(this.g).hasPermanentMenuKey() || this.n.c())) {
      Window.Callback callback = p();
      if (!this.n.a() || !paramBoolean) {
        if (callback != null && !this.O) {
          if (this.V && (this.W & 0x1) != 0) {
            this.h.getDecorView().removeCallbacks(this.X);
            this.X.run();
          } 
          s s2 = a(0, true);
          g g1 = s2.j;
          if (g1 != null && !s2.r && callback.onPreparePanel(0, s2.i, (Menu)g1)) {
            callback.onMenuOpened(108, (Menu)s2.j);
            this.n.e();
          } 
        } 
        return;
      } 
      this.n.d();
      if (!this.O) {
        callback.onPanelClosed(108, (Menu)(a(0, true)).j);
        return;
      } 
      return;
    } 
    s s1 = a(0, true);
    s1.q = true;
    a(s1, false);
    a(s1, (KeyEvent)null);
  }
  
  private boolean b(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield g : Landroid/content/Context;
    //   5: iload_1
    //   6: aconst_null
    //   7: invokespecial a : (Landroid/content/Context;ILandroid/content/res/Configuration;)Landroid/content/res/Configuration;
    //   10: astore #7
    //   12: aload_0
    //   13: invokespecial B : ()Z
    //   16: istore #6
    //   18: aload_0
    //   19: getfield g : Landroid/content/Context;
    //   22: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   25: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   28: getfield uiMode : I
    //   31: bipush #48
    //   33: iand
    //   34: istore_3
    //   35: aload #7
    //   37: getfield uiMode : I
    //   40: bipush #48
    //   42: iand
    //   43: istore #4
    //   45: iload_3
    //   46: iload #4
    //   48: if_icmpeq -> 120
    //   51: iload_2
    //   52: ifeq -> 120
    //   55: iload #6
    //   57: ifne -> 120
    //   60: aload_0
    //   61: getfield L : Z
    //   64: ifeq -> 120
    //   67: getstatic androidx/appcompat/app/g.f0 : Z
    //   70: ifne -> 80
    //   73: aload_0
    //   74: getfield M : Z
    //   77: ifeq -> 120
    //   80: aload_0
    //   81: getfield f : Ljava/lang/Object;
    //   84: astore #7
    //   86: aload #7
    //   88: instanceof android/app/Activity
    //   91: ifeq -> 120
    //   94: aload #7
    //   96: checkcast android/app/Activity
    //   99: invokevirtual isChild : ()Z
    //   102: ifne -> 120
    //   105: aload_0
    //   106: getfield f : Ljava/lang/Object;
    //   109: checkcast android/app/Activity
    //   112: invokestatic b : (Landroid/app/Activity;)V
    //   115: iconst_1
    //   116: istore_2
    //   117: goto -> 122
    //   120: iconst_0
    //   121: istore_2
    //   122: iload_2
    //   123: istore #5
    //   125: iload_2
    //   126: ifne -> 150
    //   129: iload_2
    //   130: istore #5
    //   132: iload_3
    //   133: iload #4
    //   135: if_icmpeq -> 150
    //   138: aload_0
    //   139: iload #4
    //   141: iload #6
    //   143: aconst_null
    //   144: invokespecial a : (IZLandroid/content/res/Configuration;)V
    //   147: iconst_1
    //   148: istore #5
    //   150: iload #5
    //   152: ifeq -> 178
    //   155: aload_0
    //   156: getfield f : Ljava/lang/Object;
    //   159: astore #7
    //   161: aload #7
    //   163: instanceof androidx/appcompat/app/d
    //   166: ifeq -> 178
    //   169: aload #7
    //   171: checkcast androidx/appcompat/app/d
    //   174: iload_1
    //   175: invokevirtual b : (I)V
    //   178: iload #5
    //   180: ireturn
  }
  
  private boolean b(s params) {
    params.a(n());
    params.g = (ViewGroup)new r(this, params.l);
    params.c = 81;
    return true;
  }
  
  private boolean b(s params, KeyEvent paramKeyEvent) {
    c0 c01;
    if (this.O)
      return false; 
    if (params.m)
      return true; 
    s s1 = this.J;
    if (s1 != null && s1 != params)
      a(s1, false); 
    Window.Callback callback = p();
    if (callback != null)
      params.i = callback.onCreatePanelView(params.a); 
    int k = params.a;
    if (k == 0 || k == 108) {
      k = 1;
    } else {
      k = 0;
    } 
    if (k != 0) {
      c0 c02 = this.n;
      if (c02 != null)
        c02.b(); 
    } 
    if (params.i == null && (k == 0 || !(s() instanceof k))) {
      c0 c02;
      boolean bool;
      if (params.j == null || params.r) {
        if (params.j == null && (!c(params) || params.j == null))
          return false; 
        if (k != 0 && this.n != null) {
          if (this.o == null)
            this.o = new h(this); 
          this.n.a((Menu)params.j, this.o);
        } 
        params.j.s();
        if (!callback.onCreatePanelMenu(params.a, (Menu)params.j)) {
          params.a((g)null);
          if (k != 0) {
            c01 = this.n;
            if (c01 != null)
              c01.a(null, this.o); 
          } 
          return false;
        } 
        ((s)c01).r = false;
      } 
      ((s)c01).j.s();
      Bundle bundle = ((s)c01).s;
      if (bundle != null) {
        ((s)c01).j.a(bundle);
        ((s)c01).s = null;
      } 
      if (!callback.onPreparePanel(0, ((s)c01).i, (Menu)((s)c01).j)) {
        if (k != 0) {
          c02 = this.n;
          if (c02 != null)
            c02.a(null, this.o); 
        } 
        ((s)c01).j.r();
        return false;
      } 
      if (c02 != null) {
        k = c02.getDeviceId();
      } else {
        k = -1;
      } 
      if (KeyCharacterMap.load(k).getKeyboardType() != 1) {
        bool = true;
      } else {
        bool = false;
      } 
      ((s)c01).p = bool;
      ((s)c01).j.setQwertyMode(((s)c01).p);
      ((s)c01).j.r();
    } 
    ((s)c01).m = true;
    ((s)c01).n = false;
    this.J = (s)c01;
    return true;
  }
  
  private l c(Context paramContext) {
    if (this.U == null)
      this.U = new k(this, paramContext); 
    return this.U;
  }
  
  private boolean c(s params) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Landroid/content/Context;
    //   4: astore #5
    //   6: aload_1
    //   7: getfield a : I
    //   10: istore_2
    //   11: iload_2
    //   12: ifeq -> 24
    //   15: aload #5
    //   17: astore_3
    //   18: iload_2
    //   19: bipush #108
    //   21: if_icmpne -> 197
    //   24: aload #5
    //   26: astore_3
    //   27: aload_0
    //   28: getfield n : Landroidx/appcompat/widget/c0;
    //   31: ifnull -> 197
    //   34: new android/util/TypedValue
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: astore #6
    //   43: aload #5
    //   45: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   48: astore #7
    //   50: aload #7
    //   52: getstatic b/a/a.actionBarTheme : I
    //   55: aload #6
    //   57: iconst_1
    //   58: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   61: pop
    //   62: aconst_null
    //   63: astore_3
    //   64: aload #6
    //   66: getfield resourceId : I
    //   69: ifeq -> 111
    //   72: aload #5
    //   74: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   77: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   80: astore_3
    //   81: aload_3
    //   82: aload #7
    //   84: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   87: aload_3
    //   88: aload #6
    //   90: getfield resourceId : I
    //   93: iconst_1
    //   94: invokevirtual applyStyle : (IZ)V
    //   97: aload_3
    //   98: getstatic b/a/a.actionBarWidgetTheme : I
    //   101: aload #6
    //   103: iconst_1
    //   104: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   107: pop
    //   108: goto -> 123
    //   111: aload #7
    //   113: getstatic b/a/a.actionBarWidgetTheme : I
    //   116: aload #6
    //   118: iconst_1
    //   119: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   122: pop
    //   123: aload_3
    //   124: astore #4
    //   126: aload #6
    //   128: getfield resourceId : I
    //   131: ifeq -> 169
    //   134: aload_3
    //   135: astore #4
    //   137: aload_3
    //   138: ifnonnull -> 158
    //   141: aload #5
    //   143: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   146: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   149: astore #4
    //   151: aload #4
    //   153: aload #7
    //   155: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   158: aload #4
    //   160: aload #6
    //   162: getfield resourceId : I
    //   165: iconst_1
    //   166: invokevirtual applyStyle : (IZ)V
    //   169: aload #5
    //   171: astore_3
    //   172: aload #4
    //   174: ifnull -> 197
    //   177: new b/a/o/d
    //   180: dup
    //   181: aload #5
    //   183: iconst_0
    //   184: invokespecial <init> : (Landroid/content/Context;I)V
    //   187: astore_3
    //   188: aload_3
    //   189: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   192: aload #4
    //   194: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   197: new androidx/appcompat/view/menu/g
    //   200: dup
    //   201: aload_3
    //   202: invokespecial <init> : (Landroid/content/Context;)V
    //   205: astore_3
    //   206: aload_3
    //   207: aload_0
    //   208: invokevirtual a : (Landroidx/appcompat/view/menu/g$a;)V
    //   211: aload_1
    //   212: aload_3
    //   213: invokevirtual a : (Landroidx/appcompat/view/menu/g;)V
    //   216: iconst_1
    //   217: ireturn
  }
  
  private l d(Context paramContext) {
    if (this.T == null)
      this.T = new m(this, m.a(paramContext)); 
    return this.T;
  }
  
  private boolean d(int paramInt, KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getRepeatCount() == 0) {
      s s1 = a(paramInt, true);
      if (!s1.o)
        return b(s1, paramKeyEvent); 
    } 
    return false;
  }
  
  private boolean e(int paramInt, KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield q : Lb/a/o/b;
    //   4: ifnull -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: iload_1
    //   11: iconst_1
    //   12: invokevirtual a : (IZ)Landroidx/appcompat/app/g$s;
    //   15: astore #4
    //   17: iload_1
    //   18: ifne -> 110
    //   21: aload_0
    //   22: getfield n : Landroidx/appcompat/widget/c0;
    //   25: astore #5
    //   27: aload #5
    //   29: ifnull -> 110
    //   32: aload #5
    //   34: invokeinterface f : ()Z
    //   39: ifeq -> 110
    //   42: aload_0
    //   43: getfield g : Landroid/content/Context;
    //   46: invokestatic get : (Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   49: invokevirtual hasPermanentMenuKey : ()Z
    //   52: ifne -> 110
    //   55: aload_0
    //   56: getfield n : Landroidx/appcompat/widget/c0;
    //   59: invokeinterface a : ()Z
    //   64: ifne -> 97
    //   67: aload_0
    //   68: getfield O : Z
    //   71: ifne -> 180
    //   74: aload_0
    //   75: aload #4
    //   77: aload_2
    //   78: invokespecial b : (Landroidx/appcompat/app/g$s;Landroid/view/KeyEvent;)Z
    //   81: ifeq -> 180
    //   84: aload_0
    //   85: getfield n : Landroidx/appcompat/widget/c0;
    //   88: invokeinterface e : ()Z
    //   93: istore_3
    //   94: goto -> 198
    //   97: aload_0
    //   98: getfield n : Landroidx/appcompat/widget/c0;
    //   101: invokeinterface d : ()Z
    //   106: istore_3
    //   107: goto -> 198
    //   110: aload #4
    //   112: getfield o : Z
    //   115: ifne -> 185
    //   118: aload #4
    //   120: getfield n : Z
    //   123: ifeq -> 129
    //   126: goto -> 185
    //   129: aload #4
    //   131: getfield m : Z
    //   134: ifeq -> 180
    //   137: aload #4
    //   139: getfield r : Z
    //   142: ifeq -> 162
    //   145: aload #4
    //   147: iconst_0
    //   148: putfield m : Z
    //   151: aload_0
    //   152: aload #4
    //   154: aload_2
    //   155: invokespecial b : (Landroidx/appcompat/app/g$s;Landroid/view/KeyEvent;)Z
    //   158: istore_3
    //   159: goto -> 164
    //   162: iconst_1
    //   163: istore_3
    //   164: iload_3
    //   165: ifeq -> 180
    //   168: aload_0
    //   169: aload #4
    //   171: aload_2
    //   172: invokespecial a : (Landroidx/appcompat/app/g$s;Landroid/view/KeyEvent;)V
    //   175: iconst_1
    //   176: istore_3
    //   177: goto -> 198
    //   180: iconst_0
    //   181: istore_3
    //   182: goto -> 198
    //   185: aload #4
    //   187: getfield o : Z
    //   190: istore_3
    //   191: aload_0
    //   192: aload #4
    //   194: iconst_1
    //   195: invokevirtual a : (Landroidx/appcompat/app/g$s;Z)V
    //   198: iload_3
    //   199: ifeq -> 240
    //   202: aload_0
    //   203: getfield g : Landroid/content/Context;
    //   206: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   209: ldc_w 'audio'
    //   212: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   215: checkcast android/media/AudioManager
    //   218: astore_2
    //   219: aload_2
    //   220: ifnull -> 230
    //   223: aload_2
    //   224: iconst_0
    //   225: invokevirtual playSoundEffect : (I)V
    //   228: iload_3
    //   229: ireturn
    //   230: ldc_w 'AppCompatDelegate'
    //   233: ldc_w 'Couldn't get audio manager'
    //   236: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   239: pop
    //   240: iload_3
    //   241: ireturn
  }
  
  private void i(int paramInt) {
    this.W = 1 << paramInt | this.W;
    if (!this.V) {
      v.a(this.h.getDecorView(), this.X);
      this.V = true;
    } 
  }
  
  private int j(int paramInt) {
    if (paramInt == 8) {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
      return 108;
    } 
    int k = paramInt;
    if (paramInt == 9) {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
      k = 109;
    } 
    return k;
  }
  
  private void u() {
    ContentFrameLayout contentFrameLayout = (ContentFrameLayout)this.x.findViewById(16908290);
    View view = this.h.getDecorView();
    contentFrameLayout.a(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    TypedArray typedArray = this.g.obtainStyledAttributes(b.a.j.AppCompatTheme);
    typedArray.getValue(b.a.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
    typedArray.getValue(b.a.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
    if (typedArray.hasValue(b.a.j.AppCompatTheme_windowFixedWidthMajor))
      typedArray.getValue(b.a.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor()); 
    if (typedArray.hasValue(b.a.j.AppCompatTheme_windowFixedWidthMinor))
      typedArray.getValue(b.a.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor()); 
    if (typedArray.hasValue(b.a.j.AppCompatTheme_windowFixedHeightMajor))
      typedArray.getValue(b.a.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor()); 
    if (typedArray.hasValue(b.a.j.AppCompatTheme_windowFixedHeightMinor))
      typedArray.getValue(b.a.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor()); 
    typedArray.recycle();
    contentFrameLayout.requestLayout();
  }
  
  private int v() {
    int k = this.P;
    return (k != -100) ? k : f.j();
  }
  
  private void w() {
    l l1 = this.T;
    if (l1 != null)
      l1.a(); 
    l1 = this.U;
    if (l1 != null)
      l1.a(); 
  }
  
  private ViewGroup x() {
    StringBuilder stringBuilder;
    TypedArray typedArray = this.g.obtainStyledAttributes(b.a.j.AppCompatTheme);
    if (typedArray.hasValue(b.a.j.AppCompatTheme_windowActionBar)) {
      ViewGroup viewGroup;
      if (typedArray.getBoolean(b.a.j.AppCompatTheme_windowNoTitle, false)) {
        b(1);
      } else if (typedArray.getBoolean(b.a.j.AppCompatTheme_windowActionBar, false)) {
        b(108);
      } 
      if (typedArray.getBoolean(b.a.j.AppCompatTheme_windowActionBarOverlay, false))
        b(109); 
      if (typedArray.getBoolean(b.a.j.AppCompatTheme_windowActionModeOverlay, false))
        b(10); 
      this.F = typedArray.getBoolean(b.a.j.AppCompatTheme_android_windowIsFloating, false);
      typedArray.recycle();
      z();
      this.h.getDecorView();
      LayoutInflater layoutInflater = LayoutInflater.from(this.g);
      if (!this.G) {
        if (this.F) {
          viewGroup = (ViewGroup)layoutInflater.inflate(b.a.g.abc_dialog_title_material, null);
          this.D = false;
          this.C = false;
        } else if (this.C) {
          Context context;
          TypedValue typedValue = new TypedValue();
          this.g.getTheme().resolveAttribute(b.a.a.actionBarTheme, typedValue, true);
          int k = typedValue.resourceId;
          if (k != 0) {
            b.a.o.d d = new b.a.o.d(this.g, k);
          } else {
            context = this.g;
          } 
          ViewGroup viewGroup1 = (ViewGroup)LayoutInflater.from(context).inflate(b.a.g.abc_screen_toolbar, null);
          this.n = (c0)viewGroup1.findViewById(b.a.f.decor_content_parent);
          this.n.setWindowCallback(p());
          if (this.D)
            this.n.a(109); 
          if (this.A)
            this.n.a(2); 
          viewGroup = viewGroup1;
          if (this.B) {
            this.n.a(5);
            viewGroup = viewGroup1;
          } 
        } else {
          layoutInflater = null;
        } 
      } else {
        int k;
        if (this.E) {
          k = b.a.g.abc_screen_simple_overlay_action_mode;
        } else {
          k = b.a.g.abc_screen_simple;
        } 
        viewGroup = (ViewGroup)layoutInflater.inflate(k, null);
      } 
      if (viewGroup != null) {
        if (Build.VERSION.SDK_INT >= 21) {
          v.a((View)viewGroup, new c(this));
        } else if (viewGroup instanceof g0) {
          ((g0)viewGroup).setOnFitSystemWindowsListener(new d(this));
        } 
        if (this.n == null)
          this.y = (TextView)viewGroup.findViewById(b.a.f.title); 
        d1.b((View)viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout)viewGroup.findViewById(b.a.f.action_bar_activity_content);
        ViewGroup viewGroup1 = (ViewGroup)this.h.findViewById(16908290);
        if (viewGroup1 != null) {
          while (viewGroup1.getChildCount() > 0) {
            View view = viewGroup1.getChildAt(0);
            viewGroup1.removeViewAt(0);
            contentFrameLayout.addView(view);
          } 
          viewGroup1.setId(-1);
          contentFrameLayout.setId(16908290);
          if (viewGroup1 instanceof FrameLayout)
            ((FrameLayout)viewGroup1).setForeground(null); 
        } 
        this.h.setContentView((View)viewGroup);
        contentFrameLayout.setAttachListener(new e(this));
        return viewGroup;
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("AppCompat does not support the current theme features: { windowActionBar: ");
      stringBuilder.append(this.C);
      stringBuilder.append(", windowActionBarOverlay: ");
      stringBuilder.append(this.D);
      stringBuilder.append(", android:windowIsFloating: ");
      stringBuilder.append(this.F);
      stringBuilder.append(", windowActionModeOverlay: ");
      stringBuilder.append(this.E);
      stringBuilder.append(", windowNoTitle: ");
      stringBuilder.append(this.G);
      stringBuilder.append(" }");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    stringBuilder.recycle();
    IllegalStateException illegalStateException = new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    throw illegalStateException;
  }
  
  private void y() {
    if (!this.w) {
      this.x = x();
      CharSequence charSequence = o();
      if (!TextUtils.isEmpty(charSequence)) {
        c0 c01 = this.n;
        if (c01 != null) {
          c01.setWindowTitle(charSequence);
        } else if (s() != null) {
          s().b(charSequence);
        } else {
          TextView textView = this.y;
          if (textView != null)
            textView.setText(charSequence); 
        } 
      } 
      u();
      a(this.x);
      this.w = true;
      s s1 = a(0, false);
      if (!this.O && (s1 == null || s1.j == null))
        i(108); 
    } 
  }
  
  private void z() {
    if (this.h == null) {
      Object object = this.f;
      if (object instanceof Activity)
        a(((Activity)object).getWindow()); 
    } 
    if (this.h != null)
      return; 
    throw new IllegalStateException("We have not been given a Window");
  }
  
  public int a() {
    return this.P;
  }
  
  int a(Context paramContext, int paramInt) {
    if (paramInt != -100) {
      if (paramInt != -1) {
        l l1;
        if (paramInt != 0) {
          if (paramInt != 1 && paramInt != 2) {
            if (paramInt == 3) {
              l1 = c(paramContext);
              return l1.c();
            } 
            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
          } 
        } else {
          if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager)l1.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0)
            return -1; 
          l1 = d((Context)l1);
          return l1.c();
        } 
      } 
      return paramInt;
    } 
    return -1;
  }
  
  final int a(d0 paramd0, Rect paramRect) {
    boolean bool;
    byte b1;
    byte b2 = 0;
    if (paramd0 != null) {
      bool = paramd0.g();
    } else if (paramRect != null) {
      bool = paramRect.top;
    } else {
      bool = false;
    } 
    ActionBarContextView actionBarContextView = this.r;
    if (actionBarContextView != null && actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
      boolean bool1;
      boolean bool2;
      boolean bool4;
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.r.getLayoutParams();
      boolean bool5 = this.r.isShown();
      boolean bool3 = true;
      if (bool5) {
        if (this.Z == null) {
          this.Z = new Rect();
          this.a0 = new Rect();
        } 
        Rect rect1 = this.Z;
        Rect rect2 = this.a0;
        if (paramd0 == null) {
          rect1.set(paramRect);
        } else {
          rect1.set(paramd0.e(), paramd0.g(), paramd0.f(), paramd0.d());
        } 
        d1.a((View)this.x, rect1, rect2);
        bool4 = rect1.top;
        int k = rect1.left;
        int m = rect1.right;
        paramd0 = v.w((View)this.x);
        if (paramd0 == null) {
          bool1 = false;
        } else {
          bool1 = paramd0.e();
        } 
        if (paramd0 == null) {
          bool2 = false;
        } else {
          bool2 = paramd0.f();
        } 
        if (marginLayoutParams.topMargin != bool4 || marginLayoutParams.leftMargin != k || marginLayoutParams.rightMargin != m) {
          marginLayoutParams.topMargin = bool4;
          marginLayoutParams.leftMargin = k;
          marginLayoutParams.rightMargin = m;
          k = 1;
        } else {
          k = 0;
        } 
        if (bool4 > 0 && this.z == null) {
          this.z = new View(this.g);
          this.z.setVisibility(8);
          FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
          layoutParams.leftMargin = bool1;
          layoutParams.rightMargin = bool2;
          this.x.addView(this.z, -1, (ViewGroup.LayoutParams)layoutParams);
        } else {
          View view1 = this.z;
          if (view1 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams1 = (ViewGroup.MarginLayoutParams)view1.getLayoutParams();
            if (marginLayoutParams1.height != marginLayoutParams.topMargin || marginLayoutParams1.leftMargin != bool1 || marginLayoutParams1.rightMargin != bool2) {
              marginLayoutParams1.height = marginLayoutParams.topMargin;
              marginLayoutParams1.leftMargin = bool1;
              marginLayoutParams1.rightMargin = bool2;
              this.z.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams1);
            } 
          } 
        } 
        if (this.z == null)
          bool3 = false; 
        if (bool3 && this.z.getVisibility() != 0)
          b(this.z); 
        bool1 = bool;
        bool2 = bool3;
        bool4 = k;
        if (!this.E) {
          bool1 = bool;
          bool2 = bool3;
          bool4 = k;
          if (bool3) {
            bool1 = false;
            bool2 = bool3;
            bool4 = k;
          } 
        } 
      } else {
        boolean bool6;
        if (marginLayoutParams.topMargin != 0) {
          marginLayoutParams.topMargin = 0;
          bool6 = true;
        } else {
          bool6 = false;
        } 
        bool2 = false;
        bool4 = bool6;
        bool1 = bool;
      } 
      bool = bool1;
      b1 = bool2;
      if (bool4) {
        this.r.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams);
        bool = bool1;
        b1 = bool2;
      } 
    } else {
      b1 = 0;
    } 
    View view = this.z;
    if (view != null) {
      if (b1) {
        b1 = b2;
      } else {
        b1 = 8;
      } 
      view.setVisibility(b1);
    } 
    return bool;
  }
  
  public <T extends View> T a(int paramInt) {
    y();
    return (T)this.h.findViewById(paramInt);
  }
  
  public View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b0 : Landroidx/appcompat/app/i;
    //   4: astore #6
    //   6: iconst_0
    //   7: istore #5
    //   9: aload #6
    //   11: ifnonnull -> 147
    //   14: aload_0
    //   15: getfield g : Landroid/content/Context;
    //   18: getstatic b/a/j.AppCompatTheme : [I
    //   21: invokevirtual obtainStyledAttributes : ([I)Landroid/content/res/TypedArray;
    //   24: getstatic b/a/j.AppCompatTheme_viewInflaterClass : I
    //   27: invokevirtual getString : (I)Ljava/lang/String;
    //   30: astore #6
    //   32: aload #6
    //   34: ifnonnull -> 55
    //   37: new androidx/appcompat/app/i
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: astore #6
    //   46: aload_0
    //   47: aload #6
    //   49: putfield b0 : Landroidx/appcompat/app/i;
    //   52: goto -> 147
    //   55: aload_0
    //   56: aload #6
    //   58: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   61: iconst_0
    //   62: anewarray java/lang/Class
    //   65: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   75: checkcast androidx/appcompat/app/i
    //   78: putfield b0 : Landroidx/appcompat/app/i;
    //   81: goto -> 147
    //   84: astore #7
    //   86: new java/lang/StringBuilder
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: astore #8
    //   95: aload #8
    //   97: ldc_w 'Failed to instantiate custom view inflater '
    //   100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload #8
    //   106: aload #6
    //   108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: aload #8
    //   114: ldc_w '. Falling back to default.'
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: ldc_w 'AppCompatDelegate'
    //   124: aload #8
    //   126: invokevirtual toString : ()Ljava/lang/String;
    //   129: aload #7
    //   131: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   134: pop
    //   135: new androidx/appcompat/app/i
    //   138: dup
    //   139: invokespecial <init> : ()V
    //   142: astore #6
    //   144: goto -> 46
    //   147: getstatic androidx/appcompat/app/g.d0 : Z
    //   150: ifeq -> 194
    //   153: aload #4
    //   155: instanceof org/xmlpull/v1/XmlPullParser
    //   158: ifeq -> 181
    //   161: aload #4
    //   163: checkcast org/xmlpull/v1/XmlPullParser
    //   166: invokeinterface getDepth : ()I
    //   171: iconst_1
    //   172: if_icmple -> 191
    //   175: iconst_1
    //   176: istore #5
    //   178: goto -> 191
    //   181: aload_0
    //   182: aload_1
    //   183: checkcast android/view/ViewParent
    //   186: invokespecial a : (Landroid/view/ViewParent;)Z
    //   189: istore #5
    //   191: goto -> 197
    //   194: iconst_0
    //   195: istore #5
    //   197: aload_0
    //   198: getfield b0 : Landroidx/appcompat/app/i;
    //   201: aload_1
    //   202: aload_2
    //   203: aload_3
    //   204: aload #4
    //   206: iload #5
    //   208: getstatic androidx/appcompat/app/g.d0 : Z
    //   211: iconst_1
    //   212: invokestatic b : ()Z
    //   215: invokevirtual createView : (Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZZZ)Landroid/view/View;
    //   218: areturn
    // Exception table:
    //   from	to	target	type
    //   55	81	84	finally
  }
  
  protected s a(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield I : [Landroidx/appcompat/app/g$s;
    //   4: astore #4
    //   6: aload #4
    //   8: ifnull -> 21
    //   11: aload #4
    //   13: astore_3
    //   14: aload #4
    //   16: arraylength
    //   17: iload_1
    //   18: if_icmpgt -> 49
    //   21: iload_1
    //   22: iconst_1
    //   23: iadd
    //   24: anewarray androidx/appcompat/app/g$s
    //   27: astore_3
    //   28: aload #4
    //   30: ifnull -> 44
    //   33: aload #4
    //   35: iconst_0
    //   36: aload_3
    //   37: iconst_0
    //   38: aload #4
    //   40: arraylength
    //   41: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   44: aload_0
    //   45: aload_3
    //   46: putfield I : [Landroidx/appcompat/app/g$s;
    //   49: aload_3
    //   50: iload_1
    //   51: aaload
    //   52: astore #5
    //   54: aload #5
    //   56: astore #4
    //   58: aload #5
    //   60: ifnonnull -> 78
    //   63: new androidx/appcompat/app/g$s
    //   66: dup
    //   67: iload_1
    //   68: invokespecial <init> : (I)V
    //   71: astore #4
    //   73: aload_3
    //   74: iload_1
    //   75: aload #4
    //   77: aastore
    //   78: aload #4
    //   80: areturn
  }
  
  s a(Menu paramMenu) {
    byte b1;
    s[] arrayOfS = this.I;
    int k = 0;
    if (arrayOfS != null) {
      b1 = arrayOfS.length;
    } else {
      b1 = 0;
    } 
    while (k < b1) {
      s s1 = arrayOfS[k];
      if (s1 != null && s1.j == paramMenu)
        return s1; 
      k++;
    } 
    return null;
  }
  
  public b.a.o.b a(b.a.o.b.a parama) {
    if (parama != null) {
      b.a.o.b b1 = this.q;
      if (b1 != null)
        b1.a(); 
      parama = new i(this, parama);
      a a1 = c();
      if (a1 != null) {
        this.q = a1.a(parama);
        b.a.o.b b2 = this.q;
        if (b2 != null) {
          e e1 = this.j;
          if (e1 != null)
            e1.a(b2); 
        } 
      } 
      if (this.q == null)
        this.q = b(parama); 
      return this.q;
    } 
    throw new IllegalArgumentException("ActionMode callback can not be null.");
  }
  
  void a(int paramInt, s params, Menu paramMenu) {
    g g1;
    s s1 = params;
    Menu menu = paramMenu;
    if (paramMenu == null) {
      s s2 = params;
      if (params == null) {
        s2 = params;
        if (paramInt >= 0) {
          s[] arrayOfS = this.I;
          s2 = params;
          if (paramInt < arrayOfS.length)
            s2 = arrayOfS[paramInt]; 
        } 
      } 
      s1 = s2;
      menu = paramMenu;
      if (s2 != null) {
        g1 = s2.j;
        s1 = s2;
      } 
    } 
    if (s1 != null && !s1.o)
      return; 
    if (!this.O)
      this.i.a().onPanelClosed(paramInt, (Menu)g1); 
  }
  
  public void a(Configuration paramConfiguration) {
    if (this.C && this.w) {
      a a1 = c();
      if (a1 != null)
        a1.a(paramConfiguration); 
    } 
    androidx.appcompat.widget.j.b().a(this.g);
    a(false);
  }
  
  public void a(Bundle paramBundle) {
    this.L = true;
    a(false);
    z();
    Object object = this.f;
    if (object instanceof Activity) {
      Object object1;
      paramBundle = null;
      try {
        object = androidx.core.app.g.b((Activity)object);
        object1 = object;
      } catch (IllegalArgumentException illegalArgumentException) {}
      if (object1 != null) {
        object1 = s();
        if (object1 == null) {
          this.Y = true;
        } else {
          object1.c(true);
        } 
      } 
      f.a(this);
    } 
    this.M = true;
  }
  
  public void a(View paramView) {
    y();
    ViewGroup viewGroup = (ViewGroup)this.x.findViewById(16908290);
    viewGroup.removeAllViews();
    viewGroup.addView(paramView);
    this.i.a().onContentChanged();
  }
  
  public void a(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    y();
    ((ViewGroup)this.x.findViewById(16908290)).addView(paramView, paramLayoutParams);
    this.i.a().onContentChanged();
  }
  
  void a(ViewGroup paramViewGroup) {}
  
  void a(s params, boolean paramBoolean) {
    if (paramBoolean && params.a == 0) {
      c0 c01 = this.n;
      if (c01 != null && c01.a()) {
        b(params.j);
        return;
      } 
    } 
    WindowManager windowManager = (WindowManager)this.g.getSystemService("window");
    if (windowManager != null && params.o) {
      ViewGroup viewGroup = params.g;
      if (viewGroup != null) {
        windowManager.removeView((View)viewGroup);
        if (paramBoolean)
          a(params.a, params, (Menu)null); 
      } 
    } 
    params.m = false;
    params.n = false;
    params.o = false;
    params.h = null;
    params.q = true;
    if (this.J == params)
      this.J = null; 
  }
  
  public void a(g paramg) {
    b(true);
  }
  
  public void a(Toolbar paramToolbar) {
    if (!(this.f instanceof Activity))
      return; 
    a a1 = c();
    if (!(a1 instanceof n)) {
      j j1;
      Window window;
      this.l = null;
      if (a1 != null)
        a1.j(); 
      if (paramToolbar != null) {
        k k = new k(paramToolbar, o(), (Window.Callback)this.i);
        this.k = k;
        window = this.h;
        Window.Callback callback = k.l();
      } else {
        this.k = null;
        window = this.h;
        j1 = this.i;
      } 
      window.setCallback((Window.Callback)j1);
      e();
      return;
    } 
    throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
  }
  
  public final void a(CharSequence paramCharSequence) {
    this.m = paramCharSequence;
    c0 c01 = this.n;
    if (c01 != null) {
      c01.setWindowTitle(paramCharSequence);
      return;
    } 
    if (s() != null) {
      s().b(paramCharSequence);
      return;
    } 
    TextView textView = this.y;
    if (textView != null)
      textView.setText(paramCharSequence); 
  }
  
  boolean a(int paramInt, KeyEvent paramKeyEvent) {
    boolean bool = true;
    if (paramInt != 4) {
      if (paramInt != 82)
        return false; 
      d(0, paramKeyEvent);
      return true;
    } 
    if ((paramKeyEvent.getFlags() & 0x80) == 0)
      bool = false; 
    this.K = bool;
    return false;
  }
  
  boolean a(KeyEvent paramKeyEvent) {
    Object object = this.f;
    boolean bool1 = object instanceof b.g.m.e.a;
    boolean bool = true;
    if (bool1 || object instanceof h) {
      object = this.h.getDecorView();
      if (object != null && b.g.m.e.a((View)object, paramKeyEvent))
        return true; 
    } 
    if (paramKeyEvent.getKeyCode() == 82 && this.i.a().dispatchKeyEvent(paramKeyEvent))
      return true; 
    int k = paramKeyEvent.getKeyCode();
    if (paramKeyEvent.getAction() != 0)
      bool = false; 
    return bool ? a(k, paramKeyEvent) : c(k, paramKeyEvent);
  }
  
  public boolean a(g paramg, MenuItem paramMenuItem) {
    Window.Callback callback = p();
    if (callback != null && !this.O) {
      s s1 = a((Menu)paramg.m());
      if (s1 != null)
        return callback.onMenuItemSelected(s1.a, paramMenuItem); 
    } 
    return false;
  }
  
  public Context b(Context paramContext) {
    this.L = true;
    int k = a(paramContext, v());
    boolean bool = g0;
    Configuration configuration = null;
    if (bool && paramContext instanceof ContextThemeWrapper) {
      Configuration configuration1 = a(paramContext, k, (Configuration)null);
      try {
        q.a((ContextThemeWrapper)paramContext, configuration1);
        return paramContext;
      } catch (IllegalStateException illegalStateException) {}
    } 
    if (paramContext instanceof b.a.o.d) {
      Configuration configuration1 = a(paramContext, k, (Configuration)null);
      try {
        ((b.a.o.d)paramContext).a(configuration1);
        return paramContext;
      } catch (IllegalStateException illegalStateException) {}
    } 
    if (!f0) {
      super.b(paramContext);
      return paramContext;
    } 
    try {
      Configuration configuration1 = paramContext.getPackageManager().getResourcesForApplication(paramContext.getApplicationInfo()).getConfiguration();
      Configuration configuration2 = paramContext.getResources().getConfiguration();
      if (!configuration1.equals(configuration2))
        configuration = a(configuration1, configuration2); 
      configuration1 = a(paramContext, k, configuration);
      b.a.o.d d = new b.a.o.d(paramContext, b.a.i.Theme_AppCompat_Empty);
      d.a(configuration1);
      k = 0;
      try {
        Resources.Theme theme = paramContext.getTheme();
        if (theme != null)
          k = 1; 
      } catch (NullPointerException nullPointerException) {}
      if (k != 0)
        b.g.e.d.f.b.a(d.getTheme()); 
      super.b((Context)d);
      return (Context)d;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      throw new RuntimeException("Application failed to obtain resources from itself", nameNotFoundException);
    } 
  }
  
  public MenuInflater b() {
    if (this.l == null) {
      Context context;
      A();
      a a1 = this.k;
      if (a1 != null) {
        context = a1.h();
      } else {
        context = this.g;
      } 
      this.l = (MenuInflater)new b.a.o.g(context);
    } 
    return this.l;
  }
  
  b.a.o.b b(b.a.o.b.a parama) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual m : ()V
    //   4: aload_0
    //   5: getfield q : Lb/a/o/b;
    //   8: astore #4
    //   10: aload #4
    //   12: ifnull -> 20
    //   15: aload #4
    //   17: invokevirtual a : ()V
    //   20: aload_1
    //   21: astore #4
    //   23: aload_1
    //   24: instanceof androidx/appcompat/app/g$i
    //   27: ifne -> 41
    //   30: new androidx/appcompat/app/g$i
    //   33: dup
    //   34: aload_0
    //   35: aload_1
    //   36: invokespecial <init> : (Landroidx/appcompat/app/g;Lb/a/o/b$a;)V
    //   39: astore #4
    //   41: aload_0
    //   42: getfield j : Landroidx/appcompat/app/e;
    //   45: astore_1
    //   46: aload_1
    //   47: ifnull -> 69
    //   50: aload_0
    //   51: getfield O : Z
    //   54: ifne -> 69
    //   57: aload_1
    //   58: aload #4
    //   60: invokeinterface a : (Lb/a/o/b$a;)Lb/a/o/b;
    //   65: astore_1
    //   66: goto -> 71
    //   69: aconst_null
    //   70: astore_1
    //   71: aload_1
    //   72: ifnull -> 83
    //   75: aload_0
    //   76: aload_1
    //   77: putfield q : Lb/a/o/b;
    //   80: goto -> 577
    //   83: aload_0
    //   84: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   87: astore_1
    //   88: iconst_1
    //   89: istore_3
    //   90: aload_1
    //   91: ifnonnull -> 353
    //   94: aload_0
    //   95: getfield F : Z
    //   98: ifeq -> 313
    //   101: new android/util/TypedValue
    //   104: dup
    //   105: invokespecial <init> : ()V
    //   108: astore #5
    //   110: aload_0
    //   111: getfield g : Landroid/content/Context;
    //   114: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   117: astore_1
    //   118: aload_1
    //   119: getstatic b/a/a.actionBarTheme : I
    //   122: aload #5
    //   124: iconst_1
    //   125: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   128: pop
    //   129: aload #5
    //   131: getfield resourceId : I
    //   134: ifeq -> 191
    //   137: aload_0
    //   138: getfield g : Landroid/content/Context;
    //   141: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   144: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   147: astore #6
    //   149: aload #6
    //   151: aload_1
    //   152: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   155: aload #6
    //   157: aload #5
    //   159: getfield resourceId : I
    //   162: iconst_1
    //   163: invokevirtual applyStyle : (IZ)V
    //   166: new b/a/o/d
    //   169: dup
    //   170: aload_0
    //   171: getfield g : Landroid/content/Context;
    //   174: iconst_0
    //   175: invokespecial <init> : (Landroid/content/Context;I)V
    //   178: astore_1
    //   179: aload_1
    //   180: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   183: aload #6
    //   185: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   188: goto -> 196
    //   191: aload_0
    //   192: getfield g : Landroid/content/Context;
    //   195: astore_1
    //   196: aload_0
    //   197: new androidx/appcompat/widget/ActionBarContextView
    //   200: dup
    //   201: aload_1
    //   202: invokespecial <init> : (Landroid/content/Context;)V
    //   205: putfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   208: aload_0
    //   209: new android/widget/PopupWindow
    //   212: dup
    //   213: aload_1
    //   214: aconst_null
    //   215: getstatic b/a/a.actionModePopupWindowStyle : I
    //   218: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   221: putfield s : Landroid/widget/PopupWindow;
    //   224: aload_0
    //   225: getfield s : Landroid/widget/PopupWindow;
    //   228: iconst_2
    //   229: invokestatic a : (Landroid/widget/PopupWindow;I)V
    //   232: aload_0
    //   233: getfield s : Landroid/widget/PopupWindow;
    //   236: aload_0
    //   237: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   240: invokevirtual setContentView : (Landroid/view/View;)V
    //   243: aload_0
    //   244: getfield s : Landroid/widget/PopupWindow;
    //   247: iconst_m1
    //   248: invokevirtual setWidth : (I)V
    //   251: aload_1
    //   252: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   255: getstatic b/a/a.actionBarSize : I
    //   258: aload #5
    //   260: iconst_1
    //   261: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   264: pop
    //   265: aload #5
    //   267: getfield data : I
    //   270: aload_1
    //   271: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   274: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   277: invokestatic complexToDimensionPixelSize : (ILandroid/util/DisplayMetrics;)I
    //   280: istore_2
    //   281: aload_0
    //   282: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   285: iload_2
    //   286: invokevirtual setContentHeight : (I)V
    //   289: aload_0
    //   290: getfield s : Landroid/widget/PopupWindow;
    //   293: bipush #-2
    //   295: invokevirtual setHeight : (I)V
    //   298: aload_0
    //   299: new androidx/appcompat/app/g$f
    //   302: dup
    //   303: aload_0
    //   304: invokespecial <init> : (Landroidx/appcompat/app/g;)V
    //   307: putfield t : Ljava/lang/Runnable;
    //   310: goto -> 353
    //   313: aload_0
    //   314: getfield x : Landroid/view/ViewGroup;
    //   317: getstatic b/a/f.action_mode_bar_stub : I
    //   320: invokevirtual findViewById : (I)Landroid/view/View;
    //   323: checkcast androidx/appcompat/widget/ViewStubCompat
    //   326: astore_1
    //   327: aload_1
    //   328: ifnull -> 353
    //   331: aload_1
    //   332: aload_0
    //   333: invokevirtual n : ()Landroid/content/Context;
    //   336: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   339: invokevirtual setLayoutInflater : (Landroid/view/LayoutInflater;)V
    //   342: aload_0
    //   343: aload_1
    //   344: invokevirtual a : ()Landroid/view/View;
    //   347: checkcast androidx/appcompat/widget/ActionBarContextView
    //   350: putfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   353: aload_0
    //   354: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   357: ifnull -> 577
    //   360: aload_0
    //   361: invokevirtual m : ()V
    //   364: aload_0
    //   365: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   368: invokevirtual c : ()V
    //   371: aload_0
    //   372: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   375: invokevirtual getContext : ()Landroid/content/Context;
    //   378: astore_1
    //   379: aload_0
    //   380: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   383: astore #5
    //   385: aload_0
    //   386: getfield s : Landroid/widget/PopupWindow;
    //   389: ifnonnull -> 395
    //   392: goto -> 397
    //   395: iconst_0
    //   396: istore_3
    //   397: new b/a/o/e
    //   400: dup
    //   401: aload_1
    //   402: aload #5
    //   404: aload #4
    //   406: iload_3
    //   407: invokespecial <init> : (Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Lb/a/o/b$a;Z)V
    //   410: astore_1
    //   411: aload #4
    //   413: aload_1
    //   414: aload_1
    //   415: invokevirtual c : ()Landroid/view/Menu;
    //   418: invokeinterface b : (Lb/a/o/b;Landroid/view/Menu;)Z
    //   423: ifeq -> 572
    //   426: aload_1
    //   427: invokevirtual i : ()V
    //   430: aload_0
    //   431: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   434: aload_1
    //   435: invokevirtual a : (Lb/a/o/b;)V
    //   438: aload_0
    //   439: aload_1
    //   440: putfield q : Lb/a/o/b;
    //   443: aload_0
    //   444: invokevirtual t : ()Z
    //   447: ifeq -> 496
    //   450: aload_0
    //   451: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   454: fconst_0
    //   455: invokevirtual setAlpha : (F)V
    //   458: aload_0
    //   459: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   462: invokestatic a : (Landroid/view/View;)Lb/g/m/z;
    //   465: astore_1
    //   466: aload_1
    //   467: fconst_1
    //   468: invokevirtual a : (F)Lb/g/m/z;
    //   471: pop
    //   472: aload_0
    //   473: aload_1
    //   474: putfield u : Lb/g/m/z;
    //   477: aload_0
    //   478: getfield u : Lb/g/m/z;
    //   481: new androidx/appcompat/app/g$g
    //   484: dup
    //   485: aload_0
    //   486: invokespecial <init> : (Landroidx/appcompat/app/g;)V
    //   489: invokevirtual a : (Lb/g/m/a0;)Lb/g/m/z;
    //   492: pop
    //   493: goto -> 547
    //   496: aload_0
    //   497: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   500: fconst_1
    //   501: invokevirtual setAlpha : (F)V
    //   504: aload_0
    //   505: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   508: iconst_0
    //   509: invokevirtual setVisibility : (I)V
    //   512: aload_0
    //   513: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   516: bipush #32
    //   518: invokevirtual sendAccessibilityEvent : (I)V
    //   521: aload_0
    //   522: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   525: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   528: instanceof android/view/View
    //   531: ifeq -> 547
    //   534: aload_0
    //   535: getfield r : Landroidx/appcompat/widget/ActionBarContextView;
    //   538: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   541: checkcast android/view/View
    //   544: invokestatic N : (Landroid/view/View;)V
    //   547: aload_0
    //   548: getfield s : Landroid/widget/PopupWindow;
    //   551: ifnull -> 577
    //   554: aload_0
    //   555: getfield h : Landroid/view/Window;
    //   558: invokevirtual getDecorView : ()Landroid/view/View;
    //   561: aload_0
    //   562: getfield t : Ljava/lang/Runnable;
    //   565: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   568: pop
    //   569: goto -> 577
    //   572: aload_0
    //   573: aconst_null
    //   574: putfield q : Lb/a/o/b;
    //   577: aload_0
    //   578: getfield q : Lb/a/o/b;
    //   581: astore_1
    //   582: aload_1
    //   583: ifnull -> 605
    //   586: aload_0
    //   587: getfield j : Landroidx/appcompat/app/e;
    //   590: astore #4
    //   592: aload #4
    //   594: ifnull -> 605
    //   597: aload #4
    //   599: aload_1
    //   600: invokeinterface a : (Lb/a/o/b;)V
    //   605: aload_0
    //   606: getfield q : Lb/a/o/b;
    //   609: areturn
    //   610: astore_1
    //   611: goto -> 69
    // Exception table:
    //   from	to	target	type
    //   57	66	610	java/lang/AbstractMethodError
  }
  
  public void b(Bundle paramBundle) {
    y();
  }
  
  public void b(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    y();
    ViewGroup viewGroup = (ViewGroup)this.x.findViewById(16908290);
    viewGroup.removeAllViews();
    viewGroup.addView(paramView, paramLayoutParams);
    this.i.a().onContentChanged();
  }
  
  void b(g paramg) {
    if (this.H)
      return; 
    this.H = true;
    this.n.g();
    Window.Callback callback = p();
    if (callback != null && !this.O)
      callback.onPanelClosed(108, (Menu)paramg); 
    this.H = false;
  }
  
  public boolean b(int paramInt) {
    paramInt = j(paramInt);
    if (this.G && paramInt == 108)
      return false; 
    if (this.C && paramInt == 1)
      this.C = false; 
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 5) {
          if (paramInt != 10) {
            if (paramInt != 108) {
              if (paramInt != 109)
                return this.h.requestFeature(paramInt); 
              C();
              this.D = true;
              return true;
            } 
            C();
            this.C = true;
            return true;
          } 
          C();
          this.E = true;
          return true;
        } 
        C();
        this.B = true;
        return true;
      } 
      C();
      this.A = true;
      return true;
    } 
    C();
    this.G = true;
    return true;
  }
  
  boolean b(int paramInt, KeyEvent paramKeyEvent) {
    s s1;
    a a1 = c();
    if (a1 != null && a1.a(paramInt, paramKeyEvent))
      return true; 
    s s2 = this.J;
    if (s2 != null && a(s2, paramKeyEvent.getKeyCode(), paramKeyEvent, 1)) {
      s1 = this.J;
      if (s1 != null)
        s1.n = true; 
      return true;
    } 
    if (this.J == null) {
      s2 = a(0, true);
      b(s2, (KeyEvent)s1);
      boolean bool = a(s2, s1.getKeyCode(), (KeyEvent)s1, 1);
      s2.m = false;
      if (bool)
        return true; 
    } 
    return false;
  }
  
  public a c() {
    A();
    return this.k;
  }
  
  public void c(int paramInt) {
    y();
    ViewGroup viewGroup = (ViewGroup)this.x.findViewById(16908290);
    viewGroup.removeAllViews();
    LayoutInflater.from(this.g).inflate(paramInt, viewGroup);
    this.i.a().onContentChanged();
  }
  
  public void c(Bundle paramBundle) {}
  
  boolean c(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt != 4) {
      if (paramInt != 82)
        return false; 
      e(0, paramKeyEvent);
      return true;
    } 
    boolean bool = this.K;
    this.K = false;
    s s1 = a(0, false);
    if (s1 != null && s1.o) {
      if (!bool)
        a(s1, true); 
      return true;
    } 
    return r();
  }
  
  public void d() {
    LayoutInflater layoutInflater = LayoutInflater.from(this.g);
    if (layoutInflater.getFactory() == null) {
      b.g.m.f.b(layoutInflater, this);
      return;
    } 
    if (!(layoutInflater.getFactory2() instanceof g))
      Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's"); 
  }
  
  public void d(int paramInt) {
    this.Q = paramInt;
  }
  
  public void e() {
    a a1 = c();
    if (a1 != null && a1.i())
      return; 
    i(0);
  }
  
  void e(int paramInt) {
    a(a(paramInt, true), true);
  }
  
  public void f() {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Ljava/lang/Object;
    //   4: instanceof android/app/Activity
    //   7: ifeq -> 14
    //   10: aload_0
    //   11: invokestatic b : (Landroidx/appcompat/app/f;)V
    //   14: aload_0
    //   15: getfield V : Z
    //   18: ifeq -> 36
    //   21: aload_0
    //   22: getfield h : Landroid/view/Window;
    //   25: invokevirtual getDecorView : ()Landroid/view/View;
    //   28: aload_0
    //   29: getfield X : Ljava/lang/Runnable;
    //   32: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)Z
    //   35: pop
    //   36: aload_0
    //   37: iconst_0
    //   38: putfield N : Z
    //   41: aload_0
    //   42: iconst_1
    //   43: putfield O : Z
    //   46: aload_0
    //   47: getfield P : I
    //   50: bipush #-100
    //   52: if_icmpeq -> 104
    //   55: aload_0
    //   56: getfield f : Ljava/lang/Object;
    //   59: astore_1
    //   60: aload_1
    //   61: instanceof android/app/Activity
    //   64: ifeq -> 104
    //   67: aload_1
    //   68: checkcast android/app/Activity
    //   71: invokevirtual isChangingConfigurations : ()Z
    //   74: ifeq -> 104
    //   77: getstatic androidx/appcompat/app/g.c0 : Lb/d/g;
    //   80: aload_0
    //   81: getfield f : Ljava/lang/Object;
    //   84: invokevirtual getClass : ()Ljava/lang/Class;
    //   87: invokevirtual getName : ()Ljava/lang/String;
    //   90: aload_0
    //   91: getfield P : I
    //   94: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   97: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   100: pop
    //   101: goto -> 121
    //   104: getstatic androidx/appcompat/app/g.c0 : Lb/d/g;
    //   107: aload_0
    //   108: getfield f : Ljava/lang/Object;
    //   111: invokevirtual getClass : ()Ljava/lang/Class;
    //   114: invokevirtual getName : ()Ljava/lang/String;
    //   117: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   120: pop
    //   121: aload_0
    //   122: getfield k : Landroidx/appcompat/app/a;
    //   125: astore_1
    //   126: aload_1
    //   127: ifnull -> 134
    //   130: aload_1
    //   131: invokevirtual j : ()V
    //   134: aload_0
    //   135: invokespecial w : ()V
    //   138: return
  }
  
  void f(int paramInt) {
    s s1 = a(paramInt, true);
    if (s1.j != null) {
      Bundle bundle = new Bundle();
      s1.j.b(bundle);
      if (bundle.size() > 0)
        s1.s = bundle; 
      s1.j.s();
      s1.j.clear();
    } 
    s1.r = true;
    s1.q = true;
    if ((paramInt == 108 || paramInt == 0) && this.n != null) {
      s1 = a(0, false);
      if (s1 != null) {
        s1.m = false;
        b(s1, (KeyEvent)null);
      } 
    } 
  }
  
  public void g() {
    a a1 = c();
    if (a1 != null)
      a1.e(true); 
  }
  
  void g(int paramInt) {
    if (paramInt == 108) {
      a a1 = c();
      if (a1 != null)
        a1.b(true); 
    } 
  }
  
  public void h() {
    this.N = true;
    k();
  }
  
  void h(int paramInt) {
    if (paramInt == 108) {
      a a1 = c();
      if (a1 != null) {
        a1.b(false);
        return;
      } 
    } else if (paramInt == 0) {
      s s1 = a(paramInt, true);
      if (s1.o)
        a(s1, false); 
    } 
  }
  
  public void i() {
    this.N = false;
    a a1 = c();
    if (a1 != null)
      a1.e(false); 
  }
  
  public boolean k() {
    return a(true);
  }
  
  void l() {
    c0 c01 = this.n;
    if (c01 != null)
      c01.g(); 
    if (this.s != null) {
      this.h.getDecorView().removeCallbacks(this.t);
      if (this.s.isShowing())
        try {
          this.s.dismiss();
        } catch (IllegalArgumentException illegalArgumentException) {} 
      this.s = null;
    } 
    m();
    s s1 = a(0, false);
    if (s1 != null) {
      g g1 = s1.j;
      if (g1 != null)
        g1.close(); 
    } 
  }
  
  void m() {
    z z1 = this.u;
    if (z1 != null)
      z1.a(); 
  }
  
  final Context n() {
    Context context;
    a a1 = c();
    if (a1 != null) {
      Context context1 = a1.h();
    } else {
      a1 = null;
    } 
    a a2 = a1;
    if (a1 == null)
      context = this.g; 
    return context;
  }
  
  final CharSequence o() {
    Object object = this.f;
    return (object instanceof Activity) ? ((Activity)object).getTitle() : this.m;
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    return a(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  final Window.Callback p() {
    return this.h.getCallback();
  }
  
  public boolean q() {
    return this.v;
  }
  
  boolean r() {
    b.a.o.b b1 = this.q;
    if (b1 != null) {
      b1.a();
      return true;
    } 
    a a1 = c();
    return (a1 != null && a1.f());
  }
  
  final a s() {
    return this.k;
  }
  
  final boolean t() {
    if (this.w) {
      ViewGroup viewGroup = this.x;
      if (viewGroup != null && v.I((View)viewGroup))
        return true; 
    } 
    return false;
  }
  
  static {
    int k = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    if (k < 21) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    d0 = bool1;
  }
  
  class a implements Thread.UncaughtExceptionHandler {
    a(g this$0) {}
    
    private boolean a(Throwable param1Throwable) {
      boolean bool1 = param1Throwable instanceof Resources.NotFoundException;
      boolean bool = false;
      null = bool;
      if (bool1) {
        String str = param1Throwable.getMessage();
        null = bool;
        if (str != null) {
          if (!str.contains("drawable")) {
            null = bool;
            return str.contains("Drawable") ? true : null;
          } 
        } else {
          return null;
        } 
      } else {
        return null;
      } 
      return true;
    }
    
    public void uncaughtException(Thread param1Thread, Throwable param1Throwable) {
      if (a(param1Throwable)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1Throwable.getMessage());
        stringBuilder.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
        Resources.NotFoundException notFoundException = new Resources.NotFoundException(stringBuilder.toString());
        notFoundException.initCause(param1Throwable.getCause());
        notFoundException.setStackTrace(param1Throwable.getStackTrace());
        this.a.uncaughtException(param1Thread, (Throwable)notFoundException);
        return;
      } 
      this.a.uncaughtException(param1Thread, param1Throwable);
    }
  }
  
  class b implements Runnable {
    b(g this$0) {}
    
    public void run() {
      g g1 = this.c;
      if ((g1.W & 0x1) != 0)
        g1.f(0); 
      g1 = this.c;
      if ((g1.W & 0x1000) != 0)
        g1.f(108); 
      g1 = this.c;
      g1.V = false;
      g1.W = 0;
    }
  }
  
  class c implements b.g.m.r {
    c(g this$0) {}
    
    public d0 a(View param1View, d0 param1d0) {
      int i = param1d0.g();
      int j = this.a.a(param1d0, (Rect)null);
      d0 d01 = param1d0;
      if (i != j)
        d01 = param1d0.b(param1d0.e(), j, param1d0.f(), param1d0.d()); 
      return v.b(param1View, d01);
    }
  }
  
  class d implements g0.a {
    d(g this$0) {}
    
    public void a(Rect param1Rect) {
      param1Rect.top = this.a.a((d0)null, param1Rect);
    }
  }
  
  class e implements ContentFrameLayout.a {
    e(g this$0) {}
    
    public void a() {}
    
    public void onDetachedFromWindow() {
      this.a.l();
    }
  }
  
  class f implements Runnable {
    f(g this$0) {}
    
    public void run() {
      g g1 = this.c;
      g1.s.showAtLocation((View)g1.r, 55, 0, 0);
      this.c.m();
      if (this.c.t()) {
        this.c.r.setAlpha(0.0F);
        g1 = this.c;
        z z = v.a((View)g1.r);
        z.a(1.0F);
        g1.u = z;
        this.c.u.a((a0)new a(this));
        return;
      } 
      this.c.r.setAlpha(1.0F);
      this.c.r.setVisibility(0);
    }
    
    class a extends b0 {
      a(g.f this$0) {}
      
      public void b(View param2View) {
        this.a.c.r.setAlpha(1.0F);
        this.a.c.u.a(null);
        this.a.c.u = null;
      }
      
      public void c(View param2View) {
        this.a.c.r.setVisibility(0);
      }
    }
  }
  
  class a extends b0 {
    a(g this$0) {}
    
    public void b(View param1View) {
      this.a.c.r.setAlpha(1.0F);
      this.a.c.u.a(null);
      this.a.c.u = null;
    }
    
    public void c(View param1View) {
      this.a.c.r.setVisibility(0);
    }
  }
  
  class g extends b0 {
    g(g this$0) {}
    
    public void b(View param1View) {
      this.a.r.setAlpha(1.0F);
      this.a.u.a(null);
      this.a.u = null;
    }
    
    public void c(View param1View) {
      this.a.r.setVisibility(0);
      this.a.r.sendAccessibilityEvent(32);
      if (this.a.r.getParent() instanceof View)
        v.N((View)this.a.r.getParent()); 
    }
  }
  
  private final class h implements androidx.appcompat.view.menu.n.a {
    h(g this$0) {}
    
    public void a(g param1g, boolean param1Boolean) {
      this.c.b(param1g);
    }
    
    public boolean a(g param1g) {
      Window.Callback callback = this.c.p();
      if (callback != null)
        callback.onMenuOpened(108, (Menu)param1g); 
      return true;
    }
  }
  
  class i implements b.a.o.b.a {
    private b.a.o.b.a a;
    
    public i(g this$0, b.a.o.b.a param1a) {
      this.a = param1a;
    }
    
    public void a(b.a.o.b param1b) {
      this.a.a(param1b);
      g g1 = this.b;
      if (g1.s != null)
        g1.h.getDecorView().removeCallbacks(this.b.t); 
      g1 = this.b;
      if (g1.r != null) {
        g1.m();
        g1 = this.b;
        z z = v.a((View)g1.r);
        z.a(0.0F);
        g1.u = z;
        this.b.u.a((a0)new a(this));
      } 
      g1 = this.b;
      e e = g1.j;
      if (e != null)
        e.b(g1.q); 
      g1 = this.b;
      g1.q = null;
      v.N((View)g1.x);
    }
    
    public boolean a(b.a.o.b param1b, Menu param1Menu) {
      v.N((View)this.b.x);
      return this.a.a(param1b, param1Menu);
    }
    
    public boolean a(b.a.o.b param1b, MenuItem param1MenuItem) {
      return this.a.a(param1b, param1MenuItem);
    }
    
    public boolean b(b.a.o.b param1b, Menu param1Menu) {
      return this.a.b(param1b, param1Menu);
    }
    
    class a extends b0 {
      a(g.i this$0) {}
      
      public void b(View param2View) {
        this.a.b.r.setVisibility(8);
        g g = this.a.b;
        PopupWindow popupWindow = g.s;
        if (popupWindow != null) {
          popupWindow.dismiss();
        } else if (g.r.getParent() instanceof View) {
          v.N((View)this.a.b.r.getParent());
        } 
        this.a.b.r.removeAllViews();
        this.a.b.u.a(null);
        g = this.a.b;
        g.u = null;
        v.N((View)g.x);
      }
    }
  }
  
  class a extends b0 {
    a(g this$0) {}
    
    public void b(View param1View) {
      this.a.b.r.setVisibility(8);
      g g = this.a.b;
      PopupWindow popupWindow = g.s;
      if (popupWindow != null) {
        popupWindow.dismiss();
      } else if (g.r.getParent() instanceof View) {
        v.N((View)this.a.b.r.getParent());
      } 
      this.a.b.r.removeAllViews();
      this.a.b.u.a(null);
      g = this.a.b;
      g.u = null;
      v.N((View)g.x);
    }
  }
  
  class j extends b.a.o.i {
    j(g this$0, Window.Callback param1Callback) {
      super(param1Callback);
    }
    
    final ActionMode a(ActionMode.Callback param1Callback) {
      b.a.o.f.a a = new b.a.o.f.a(this.d.g, param1Callback);
      b.a.o.b b = this.d.a((b.a.o.b.a)a);
      return (b != null) ? a.b(b) : null;
    }
    
    public boolean dispatchKeyEvent(KeyEvent param1KeyEvent) {
      return (this.d.a(param1KeyEvent) || super.dispatchKeyEvent(param1KeyEvent));
    }
    
    public boolean dispatchKeyShortcutEvent(KeyEvent param1KeyEvent) {
      return (super.dispatchKeyShortcutEvent(param1KeyEvent) || this.d.b(param1KeyEvent.getKeyCode(), param1KeyEvent));
    }
    
    public void onContentChanged() {}
    
    public boolean onCreatePanelMenu(int param1Int, Menu param1Menu) {
      return (param1Int == 0 && !(param1Menu instanceof g)) ? false : super.onCreatePanelMenu(param1Int, param1Menu);
    }
    
    public boolean onMenuOpened(int param1Int, Menu param1Menu) {
      super.onMenuOpened(param1Int, param1Menu);
      this.d.g(param1Int);
      return true;
    }
    
    public void onPanelClosed(int param1Int, Menu param1Menu) {
      super.onPanelClosed(param1Int, param1Menu);
      this.d.h(param1Int);
    }
    
    public boolean onPreparePanel(int param1Int, View param1View, Menu param1Menu) {
      g g1;
      if (param1Menu instanceof g) {
        g1 = (g)param1Menu;
      } else {
        g1 = null;
      } 
      if (param1Int == 0 && g1 == null)
        return false; 
      if (g1 != null)
        g1.c(true); 
      boolean bool = super.onPreparePanel(param1Int, param1View, param1Menu);
      if (g1 != null)
        g1.c(false); 
      return bool;
    }
    
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> param1List, Menu param1Menu, int param1Int) {
      g.s s = this.d.a(0, true);
      if (s != null) {
        g g1 = s.j;
        if (g1 != null) {
          super.onProvideKeyboardShortcuts(param1List, (Menu)g1, param1Int);
          return;
        } 
      } 
      super.onProvideKeyboardShortcuts(param1List, param1Menu, param1Int);
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback param1Callback) {
      return (Build.VERSION.SDK_INT >= 23) ? null : (this.d.q() ? a(param1Callback) : super.onWindowStartingActionMode(param1Callback));
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback param1Callback, int param1Int) {
      return (!this.d.q() || param1Int != 0) ? super.onWindowStartingActionMode(param1Callback, param1Int) : a(param1Callback);
    }
  }
  
  private class k extends l {
    private final PowerManager c;
    
    k(g this$0, Context param1Context) {
      super(this$0);
      this.c = (PowerManager)param1Context.getApplicationContext().getSystemService("power");
    }
    
    IntentFilter b() {
      if (Build.VERSION.SDK_INT >= 21) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
      } 
      return null;
    }
    
    public int c() {
      int i = Build.VERSION.SDK_INT;
      byte b2 = 1;
      byte b1 = b2;
      if (i >= 21) {
        b1 = b2;
        if (this.c.isPowerSaveMode())
          b1 = 2; 
      } 
      return b1;
    }
    
    public void d() {
      this.d.k();
    }
  }
  
  abstract class l {
    private BroadcastReceiver a;
    
    l(g this$0) {}
    
    void a() {
      BroadcastReceiver broadcastReceiver = this.a;
      if (broadcastReceiver != null) {
        try {
          this.b.g.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException illegalArgumentException) {}
        this.a = null;
      } 
    }
    
    abstract IntentFilter b();
    
    abstract int c();
    
    abstract void d();
    
    void e() {
      a();
      IntentFilter intentFilter = b();
      if (intentFilter != null) {
        if (intentFilter.countActions() == 0)
          return; 
        if (this.a == null)
          this.a = new a(this); 
        this.b.g.registerReceiver(this.a, intentFilter);
      } 
    }
    
    class a extends BroadcastReceiver {
      a(g.l this$0) {}
      
      public void onReceive(Context param2Context, Intent param2Intent) {
        this.a.d();
      }
    }
  }
  
  class a extends BroadcastReceiver {
    a(g this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      this.a.d();
    }
  }
  
  private class m extends l {
    private final m c;
    
    m(g this$0, m param1m) {
      super(this$0);
      this.c = param1m;
    }
    
    IntentFilter b() {
      IntentFilter intentFilter = new IntentFilter();
      intentFilter.addAction("android.intent.action.TIME_SET");
      intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
      intentFilter.addAction("android.intent.action.TIME_TICK");
      return intentFilter;
    }
    
    public int c() {
      return this.c.a() ? 2 : 1;
    }
    
    public void d() {
      this.d.k();
    }
  }
  
  static class n {
    static void a(Configuration param1Configuration1, Configuration param1Configuration2, Configuration param1Configuration3) {
      int i = param1Configuration1.densityDpi;
      int j = param1Configuration2.densityDpi;
      if (i != j)
        param1Configuration3.densityDpi = j; 
    }
  }
  
  static class o {
    static void a(Configuration param1Configuration1, Configuration param1Configuration2, Configuration param1Configuration3) {
      LocaleList localeList1 = param1Configuration1.getLocales();
      LocaleList localeList2 = param1Configuration2.getLocales();
      if (!localeList1.equals(localeList2)) {
        param1Configuration3.setLocales(localeList2);
        param1Configuration3.locale = param1Configuration2.locale;
      } 
    }
  }
  
  static class p {
    static void a(Configuration param1Configuration1, Configuration param1Configuration2, Configuration param1Configuration3) {
      int i = param1Configuration1.colorMode;
      int j = param1Configuration2.colorMode;
      if ((i & 0x3) != (j & 0x3))
        param1Configuration3.colorMode |= j & 0x3; 
      i = param1Configuration1.colorMode;
      j = param1Configuration2.colorMode;
      if ((i & 0xC) != (j & 0xC))
        param1Configuration3.colorMode |= j & 0xC; 
    }
  }
  
  private static class q {
    static void a(ContextThemeWrapper param1ContextThemeWrapper, Configuration param1Configuration) {
      param1ContextThemeWrapper.applyOverrideConfiguration(param1Configuration);
    }
  }
  
  private class r extends ContentFrameLayout {
    public r(g this$0, Context param1Context) {
      super(param1Context);
    }
    
    private boolean a(int param1Int1, int param1Int2) {
      return (param1Int1 < -5 || param1Int2 < -5 || param1Int1 > getWidth() + 5 || param1Int2 > getHeight() + 5);
    }
    
    public boolean dispatchKeyEvent(KeyEvent param1KeyEvent) {
      return (this.k.a(param1KeyEvent) || super.dispatchKeyEvent(param1KeyEvent));
    }
    
    public boolean onInterceptTouchEvent(MotionEvent param1MotionEvent) {
      if (param1MotionEvent.getAction() == 0 && a((int)param1MotionEvent.getX(), (int)param1MotionEvent.getY())) {
        this.k.e(0);
        return true;
      } 
      return super.onInterceptTouchEvent(param1MotionEvent);
    }
    
    public void setBackgroundResource(int param1Int) {
      setBackgroundDrawable(b.a.k.a.a.c(getContext(), param1Int));
    }
  }
  
  protected static final class s {
    int a;
    
    int b;
    
    int c;
    
    int d;
    
    int e;
    
    int f;
    
    ViewGroup g;
    
    View h;
    
    View i;
    
    g j;
    
    androidx.appcompat.view.menu.e k;
    
    Context l;
    
    boolean m;
    
    boolean n;
    
    boolean o;
    
    public boolean p;
    
    boolean q;
    
    boolean r;
    
    Bundle s;
    
    s(int param1Int) {
      this.a = param1Int;
      this.q = false;
    }
    
    androidx.appcompat.view.menu.o a(androidx.appcompat.view.menu.n.a param1a) {
      if (this.j == null)
        return null; 
      if (this.k == null) {
        this.k = new androidx.appcompat.view.menu.e(this.l, b.a.g.abc_list_menu_item_layout);
        this.k.a(param1a);
        this.j.a((androidx.appcompat.view.menu.n)this.k);
      } 
      return this.k.a(this.g);
    }
    
    void a(Context param1Context) {
      TypedValue typedValue = new TypedValue();
      Resources.Theme theme = param1Context.getResources().newTheme();
      theme.setTo(param1Context.getTheme());
      theme.resolveAttribute(b.a.a.actionBarPopupTheme, typedValue, true);
      int i = typedValue.resourceId;
      if (i != 0)
        theme.applyStyle(i, true); 
      theme.resolveAttribute(b.a.a.panelMenuListTheme, typedValue, true);
      i = typedValue.resourceId;
      if (i == 0)
        i = b.a.i.Theme_AppCompat_CompactMenu; 
      theme.applyStyle(i, true);
      b.a.o.d d = new b.a.o.d(param1Context, 0);
      d.getTheme().setTo(theme);
      this.l = (Context)d;
      TypedArray typedArray = d.obtainStyledAttributes(b.a.j.AppCompatTheme);
      this.b = typedArray.getResourceId(b.a.j.AppCompatTheme_panelBackground, 0);
      this.f = typedArray.getResourceId(b.a.j.AppCompatTheme_android_windowAnimationStyle, 0);
      typedArray.recycle();
    }
    
    void a(g param1g) {
      g g1 = this.j;
      if (param1g == g1)
        return; 
      if (g1 != null)
        g1.b((androidx.appcompat.view.menu.n)this.k); 
      this.j = param1g;
      if (param1g != null) {
        androidx.appcompat.view.menu.e e1 = this.k;
        if (e1 != null)
          param1g.a((androidx.appcompat.view.menu.n)e1); 
      } 
    }
    
    public boolean a() {
      View view = this.h;
      boolean bool = false;
      if (view == null)
        return false; 
      if (this.i != null)
        return true; 
      if (this.k.b().getCount() > 0)
        bool = true; 
      return bool;
    }
  }
  
  private final class t implements androidx.appcompat.view.menu.n.a {
    t(g this$0) {}
    
    public void a(g param1g, boolean param1Boolean) {
      boolean bool;
      g g1 = param1g.m();
      if (g1 != param1g) {
        bool = true;
      } else {
        bool = false;
      } 
      g g2 = this.c;
      if (bool)
        param1g = g1; 
      g.s s = g2.a((Menu)param1g);
      if (s != null) {
        if (bool) {
          this.c.a(s.a, s, (Menu)g1);
          this.c.a(s, true);
          return;
        } 
        this.c.a(s, param1Boolean);
      } 
    }
    
    public boolean a(g param1g) {
      if (param1g == param1g.m()) {
        g g1 = this.c;
        if (g1.C) {
          Window.Callback callback = g1.p();
          if (callback != null && !this.c.O)
            callback.onMenuOpened(108, (Menu)param1g); 
        } 
      } 
      return true;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/app/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */