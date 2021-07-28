package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import b.d.g;
import b.d.h;
import b.s.a.a.i;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class m0 {
  private static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
  
  private static m0 i;
  
  private static final c j = new c(6);
  
  private WeakHashMap<Context, h<ColorStateList>> a;
  
  private g<String, d> b;
  
  private h<String> c;
  
  private final WeakHashMap<Context, b.d.d<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<Context, b.d.d<WeakReference<Drawable.ConstantState>>>(0);
  
  private TypedValue e;
  
  private boolean f;
  
  private e g;
  
  private static long a(TypedValue paramTypedValue) {
    return paramTypedValue.assetCookie << 32L | paramTypedValue.data;
  }
  
  public static PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode) {
    // Byte code:
    //   0: ldc androidx/appcompat/widget/m0
    //   2: monitorenter
    //   3: getstatic androidx/appcompat/widget/m0.j : Landroidx/appcompat/widget/m0$c;
    //   6: iload_0
    //   7: aload_1
    //   8: invokevirtual a : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    //   11: astore_3
    //   12: aload_3
    //   13: astore_2
    //   14: aload_3
    //   15: ifnonnull -> 38
    //   18: new android/graphics/PorterDuffColorFilter
    //   21: dup
    //   22: iload_0
    //   23: aload_1
    //   24: invokespecial <init> : (ILandroid/graphics/PorterDuff$Mode;)V
    //   27: astore_2
    //   28: getstatic androidx/appcompat/widget/m0.j : Landroidx/appcompat/widget/m0$c;
    //   31: iload_0
    //   32: aload_1
    //   33: aload_2
    //   34: invokevirtual a : (ILandroid/graphics/PorterDuff$Mode;Landroid/graphics/PorterDuffColorFilter;)Landroid/graphics/PorterDuffColorFilter;
    //   37: pop
    //   38: ldc androidx/appcompat/widget/m0
    //   40: monitorexit
    //   41: aload_2
    //   42: areturn
    //   43: astore_1
    //   44: ldc androidx/appcompat/widget/m0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    // Exception table:
    //   from	to	target	type
    //   3	12	43	finally
    //   18	38	43	finally
  }
  
  private static PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int[] paramArrayOfint) {
    return (paramColorStateList == null || paramMode == null) ? null : a(paramColorStateList.getColorForState(paramArrayOfint, 0), paramMode);
  }
  
  private Drawable a(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable) {
    Drawable drawable;
    PorterDuff.Mode mode1;
    PorterDuff.Mode mode2;
    ColorStateList colorStateList = b(paramContext, paramInt);
    if (colorStateList != null) {
      drawable = paramDrawable;
      if (e0.a(paramDrawable))
        drawable = paramDrawable.mutate(); 
      drawable = androidx.core.graphics.drawable.a.i(drawable);
      androidx.core.graphics.drawable.a.a(drawable, colorStateList);
      mode1 = a(paramInt);
      Drawable drawable1 = drawable;
      if (mode1 != null) {
        androidx.core.graphics.drawable.a.a(drawable, mode1);
        return drawable;
      } 
    } else {
      e e1 = this.g;
      if (e1 != null && e1.b((Context)drawable, paramInt, (Drawable)mode1))
        return (Drawable)mode1; 
      mode2 = mode1;
      if (!a((Context)drawable, paramInt, (Drawable)mode1)) {
        mode2 = mode1;
        if (paramBoolean)
          mode2 = null; 
      } 
    } 
    return (Drawable)mode2;
  }
  
  private Drawable a(Context paramContext, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Ljava/util/WeakHashMap;
    //   6: aload_1
    //   7: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast b/d/d
    //   13: astore #4
    //   15: aload #4
    //   17: ifnonnull -> 24
    //   20: aload_0
    //   21: monitorexit
    //   22: aconst_null
    //   23: areturn
    //   24: aload #4
    //   26: lload_2
    //   27: invokevirtual a : (J)Ljava/lang/Object;
    //   30: checkcast java/lang/ref/WeakReference
    //   33: astore #5
    //   35: aload #5
    //   37: ifnull -> 75
    //   40: aload #5
    //   42: invokevirtual get : ()Ljava/lang/Object;
    //   45: checkcast android/graphics/drawable/Drawable$ConstantState
    //   48: astore #5
    //   50: aload #5
    //   52: ifnull -> 69
    //   55: aload #5
    //   57: aload_1
    //   58: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   61: invokevirtual newDrawable : (Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: areturn
    //   69: aload #4
    //   71: lload_2
    //   72: invokevirtual c : (J)V
    //   75: aload_0
    //   76: monitorexit
    //   77: aconst_null
    //   78: areturn
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	79	finally
    //   24	35	79	finally
    //   40	50	79	finally
    //   55	65	79	finally
    //   69	75	79	finally
  }
  
  public static m0 a() {
    // Byte code:
    //   0: ldc androidx/appcompat/widget/m0
    //   2: monitorenter
    //   3: getstatic androidx/appcompat/widget/m0.i : Landroidx/appcompat/widget/m0;
    //   6: ifnonnull -> 25
    //   9: new androidx/appcompat/widget/m0
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic androidx/appcompat/widget/m0.i : Landroidx/appcompat/widget/m0;
    //   19: getstatic androidx/appcompat/widget/m0.i : Landroidx/appcompat/widget/m0;
    //   22: invokestatic a : (Landroidx/appcompat/widget/m0;)V
    //   25: getstatic androidx/appcompat/widget/m0.i : Landroidx/appcompat/widget/m0;
    //   28: astore_0
    //   29: ldc androidx/appcompat/widget/m0
    //   31: monitorexit
    //   32: aload_0
    //   33: areturn
    //   34: astore_0
    //   35: ldc androidx/appcompat/widget/m0
    //   37: monitorexit
    //   38: aload_0
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   3	25	34	finally
    //   25	29	34	finally
  }
  
  private void a(Context paramContext, int paramInt, ColorStateList paramColorStateList) {
    if (this.a == null)
      this.a = new WeakHashMap<Context, h<ColorStateList>>(); 
    h<ColorStateList> h2 = this.a.get(paramContext);
    h<ColorStateList> h1 = h2;
    if (h2 == null) {
      h1 = new h();
      this.a.put(paramContext, h1);
    } 
    h1.a(paramInt, paramColorStateList);
  }
  
  static void a(Drawable paramDrawable, v0 paramv0, int[] paramArrayOfint) {
    if (e0.a(paramDrawable) && paramDrawable.mutate() != paramDrawable) {
      Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
      return;
    } 
    if (paramv0.d || paramv0.c) {
      PorterDuff.Mode mode;
      ColorStateList colorStateList;
      if (paramv0.d) {
        colorStateList = paramv0.a;
      } else {
        colorStateList = null;
      } 
      if (paramv0.c) {
        mode = paramv0.b;
      } else {
        mode = h;
      } 
      paramDrawable.setColorFilter((ColorFilter)a(colorStateList, mode, paramArrayOfint));
    } else {
      paramDrawable.clearColorFilter();
    } 
    if (Build.VERSION.SDK_INT <= 23)
      paramDrawable.invalidateSelf(); 
  }
  
  private static void a(m0 paramm0) {
    if (Build.VERSION.SDK_INT < 24) {
      paramm0.a("vector", new f());
      paramm0.a("animated-vector", new b());
      paramm0.a("animated-selector", new a());
    } 
  }
  
  private void a(String paramString, d paramd) {
    if (this.b == null)
      this.b = new g(); 
    this.b.put(paramString, paramd);
  }
  
  private boolean a(Context paramContext, long paramLong, Drawable paramDrawable) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload #4
    //   4: invokevirtual getConstantState : ()Landroid/graphics/drawable/Drawable$ConstantState;
    //   7: astore #7
    //   9: aload #7
    //   11: ifnull -> 79
    //   14: aload_0
    //   15: getfield d : Ljava/util/WeakHashMap;
    //   18: aload_1
    //   19: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   22: checkcast b/d/d
    //   25: astore #6
    //   27: aload #6
    //   29: astore #4
    //   31: aload #6
    //   33: ifnonnull -> 56
    //   36: new b/d/d
    //   39: dup
    //   40: invokespecial <init> : ()V
    //   43: astore #4
    //   45: aload_0
    //   46: getfield d : Ljava/util/WeakHashMap;
    //   49: aload_1
    //   50: aload #4
    //   52: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   55: pop
    //   56: aload #4
    //   58: lload_2
    //   59: new java/lang/ref/WeakReference
    //   62: dup
    //   63: aload #7
    //   65: invokespecial <init> : (Ljava/lang/Object;)V
    //   68: invokevirtual c : (JLjava/lang/Object;)V
    //   71: iconst_1
    //   72: istore #5
    //   74: aload_0
    //   75: monitorexit
    //   76: iload #5
    //   78: ireturn
    //   79: iconst_0
    //   80: istore #5
    //   82: goto -> 74
    //   85: astore_1
    //   86: aload_0
    //   87: monitorexit
    //   88: goto -> 93
    //   91: aload_1
    //   92: athrow
    //   93: goto -> 91
    // Exception table:
    //   from	to	target	type
    //   2	9	85	finally
    //   14	27	85	finally
    //   36	56	85	finally
    //   56	71	85	finally
  }
  
  private static boolean a(Drawable paramDrawable) {
    return (paramDrawable instanceof i || "android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName()));
  }
  
  private void b(Context paramContext) {
    if (this.f)
      return; 
    this.f = true;
    Drawable drawable = a(paramContext, b.a.m.a.abc_vector_test);
    if (drawable != null && a(drawable))
      return; 
    this.f = false;
    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
  }
  
  private Drawable c(Context paramContext, int paramInt) {
    Drawable drawable1;
    if (this.e == null)
      this.e = new TypedValue(); 
    TypedValue typedValue = this.e;
    paramContext.getResources().getValue(paramInt, typedValue, true);
    long l = a(typedValue);
    Drawable drawable2 = a(paramContext, l);
    if (drawable2 != null)
      return drawable2; 
    e e1 = this.g;
    if (e1 == null) {
      e1 = null;
    } else {
      drawable1 = e1.a(this, paramContext, paramInt);
    } 
    if (drawable1 != null) {
      drawable1.setChangingConfigurations(typedValue.changingConfigurations);
      a(paramContext, l, drawable1);
    } 
    return drawable1;
  }
  
  private ColorStateList d(Context paramContext, int paramInt) {
    WeakHashMap<Context, h<ColorStateList>> weakHashMap = this.a;
    ColorStateList colorStateList2 = null;
    ColorStateList colorStateList1 = colorStateList2;
    if (weakHashMap != null) {
      h h1 = weakHashMap.get(paramContext);
      colorStateList1 = colorStateList2;
      if (h1 != null)
        colorStateList1 = (ColorStateList)h1.a(paramInt); 
    } 
    return colorStateList1;
  }
  
  private Drawable e(Context paramContext, int paramInt) {
    g<String, d> g1 = this.b;
    if (g1 != null && !g1.isEmpty()) {
      h<String> h1 = this.c;
      if (h1 != null) {
        String str = (String)h1.a(paramInt);
        if ("appcompat_skip_skip".equals(str) || (str != null && this.b.get(str) == null))
          return null; 
      } else {
        this.c = new h();
      } 
      if (this.e == null)
        this.e = new TypedValue(); 
      TypedValue typedValue = this.e;
      Resources resources = paramContext.getResources();
      resources.getValue(paramInt, typedValue, true);
      long l = a(typedValue);
      Drawable drawable1 = a(paramContext, l);
      if (drawable1 != null)
        return drawable1; 
      CharSequence charSequence = typedValue.string;
      Drawable drawable2 = drawable1;
      if (charSequence != null) {
        drawable2 = drawable1;
        if (charSequence.toString().endsWith(".xml")) {
          drawable2 = drawable1;
          try {
            int i;
            XmlResourceParser xmlResourceParser = resources.getXml(paramInt);
            drawable2 = drawable1;
            AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
            while (true) {
              drawable2 = drawable1;
              i = xmlResourceParser.next();
              if (i != 2 && i != 1)
                continue; 
              break;
            } 
            if (i == 2) {
              drawable2 = drawable1;
              String str = xmlResourceParser.getName();
              drawable2 = drawable1;
              this.c.a(paramInt, str);
              drawable2 = drawable1;
              d d = (d)this.b.get(str);
              Drawable drawable = drawable1;
              if (d != null) {
                drawable2 = drawable1;
                drawable = d.a(paramContext, (XmlPullParser)xmlResourceParser, attributeSet, paramContext.getTheme());
              } 
              drawable2 = drawable;
              if (drawable != null) {
                drawable2 = drawable;
                drawable.setChangingConfigurations(typedValue.changingConfigurations);
                drawable2 = drawable;
                a(paramContext, l, drawable);
                drawable2 = drawable;
              } 
            } else {
              drawable2 = drawable1;
              throw new XmlPullParserException("No start tag found");
            } 
          } catch (Exception exception) {
            Log.e("ResourceManagerInternal", "Exception while inflating drawable", exception);
          } 
        } 
      } 
      if (drawable2 == null)
        this.c.a(paramInt, "appcompat_skip_skip"); 
      return drawable2;
    } 
    return null;
  }
  
  PorterDuff.Mode a(int paramInt) {
    e e1 = this.g;
    return (e1 == null) ? null : e1.a(paramInt);
  }
  
  public Drawable a(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: iload_2
    //   5: iconst_0
    //   6: invokevirtual a : (Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    //   9: astore_1
    //   10: aload_0
    //   11: monitorexit
    //   12: aload_1
    //   13: areturn
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	14	finally
  }
  
  Drawable a(Context paramContext, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial b : (Landroid/content/Context;)V
    //   7: aload_0
    //   8: aload_1
    //   9: iload_2
    //   10: invokespecial e : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   13: astore #5
    //   15: aload #5
    //   17: astore #4
    //   19: aload #5
    //   21: ifnonnull -> 32
    //   24: aload_0
    //   25: aload_1
    //   26: iload_2
    //   27: invokespecial c : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   30: astore #4
    //   32: aload #4
    //   34: astore #5
    //   36: aload #4
    //   38: ifnonnull -> 48
    //   41: aload_1
    //   42: iload_2
    //   43: invokestatic c : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   46: astore #5
    //   48: aload #5
    //   50: astore #4
    //   52: aload #5
    //   54: ifnull -> 68
    //   57: aload_0
    //   58: aload_1
    //   59: iload_2
    //   60: iload_3
    //   61: aload #5
    //   63: invokespecial a : (Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   66: astore #4
    //   68: aload #4
    //   70: ifnull -> 78
    //   73: aload #4
    //   75: invokestatic b : (Landroid/graphics/drawable/Drawable;)V
    //   78: aload_0
    //   79: monitorexit
    //   80: aload #4
    //   82: areturn
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	83	finally
    //   24	32	83	finally
    //   41	48	83	finally
    //   57	68	83	finally
    //   73	78	83	finally
  }
  
  Drawable a(Context paramContext, c1 paramc1, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: iload_3
    //   5: invokespecial e : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   8: astore #5
    //   10: aload #5
    //   12: astore #4
    //   14: aload #5
    //   16: ifnonnull -> 26
    //   19: aload_2
    //   20: iload_3
    //   21: invokevirtual a : (I)Landroid/graphics/drawable/Drawable;
    //   24: astore #4
    //   26: aload #4
    //   28: ifnull -> 45
    //   31: aload_0
    //   32: aload_1
    //   33: iload_3
    //   34: iconst_0
    //   35: aload #4
    //   37: invokespecial a : (Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: areturn
    //   45: aload_0
    //   46: monitorexit
    //   47: aconst_null
    //   48: areturn
    //   49: astore_1
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_1
    //   53: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	49	finally
    //   19	26	49	finally
    //   31	41	49	finally
  }
  
  public void a(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Ljava/util/WeakHashMap;
    //   6: aload_1
    //   7: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast b/d/d
    //   13: astore_1
    //   14: aload_1
    //   15: ifnull -> 22
    //   18: aload_1
    //   19: invokevirtual a : ()V
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	25	finally
    //   18	22	25	finally
  }
  
  public void a(e parame) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield g : Landroidx/appcompat/widget/m0$e;
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  boolean a(Context paramContext, int paramInt, Drawable paramDrawable) {
    e e1 = this.g;
    return (e1 != null && e1.a(paramContext, paramInt, paramDrawable));
  }
  
  ColorStateList b(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: iload_2
    //   5: invokespecial d : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   8: astore_3
    //   9: aload_3
    //   10: astore #4
    //   12: aload_3
    //   13: ifnonnull -> 57
    //   16: aload_0
    //   17: getfield g : Landroidx/appcompat/widget/m0$e;
    //   20: ifnonnull -> 28
    //   23: aconst_null
    //   24: astore_3
    //   25: goto -> 40
    //   28: aload_0
    //   29: getfield g : Landroidx/appcompat/widget/m0$e;
    //   32: aload_1
    //   33: iload_2
    //   34: invokeinterface a : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   39: astore_3
    //   40: aload_3
    //   41: astore #4
    //   43: aload_3
    //   44: ifnull -> 57
    //   47: aload_0
    //   48: aload_1
    //   49: iload_2
    //   50: aload_3
    //   51: invokespecial a : (Landroid/content/Context;ILandroid/content/res/ColorStateList;)V
    //   54: aload_3
    //   55: astore #4
    //   57: aload_0
    //   58: monitorexit
    //   59: aload #4
    //   61: areturn
    //   62: astore_1
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	62	finally
    //   16	23	62	finally
    //   28	40	62	finally
    //   47	54	62	finally
  }
  
  static class a implements d {
    public Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme) {
      try {
        return (Drawable)b.a.l.a.a.b(param1Context, param1Context.getResources(), param1XmlPullParser, param1AttributeSet, param1Theme);
      } catch (Exception exception) {
        Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", exception);
        return null;
      } 
    }
  }
  
  private static class b implements d {
    public Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme) {
      try {
        return (Drawable)b.s.a.a.c.a(param1Context, param1Context.getResources(), param1XmlPullParser, param1AttributeSet, param1Theme);
      } catch (Exception exception) {
        Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", exception);
        return null;
      } 
    }
  }
  
  private static class c extends b.d.e<Integer, PorterDuffColorFilter> {
    public c(int param1Int) {
      super(param1Int);
    }
    
    private static int b(int param1Int, PorterDuff.Mode param1Mode) {
      return (param1Int + 31) * 31 + param1Mode.hashCode();
    }
    
    PorterDuffColorFilter a(int param1Int, PorterDuff.Mode param1Mode) {
      return (PorterDuffColorFilter)b(Integer.valueOf(b(param1Int, param1Mode)));
    }
    
    PorterDuffColorFilter a(int param1Int, PorterDuff.Mode param1Mode, PorterDuffColorFilter param1PorterDuffColorFilter) {
      return (PorterDuffColorFilter)a(Integer.valueOf(b(param1Int, param1Mode)), param1PorterDuffColorFilter);
    }
  }
  
  private static interface d {
    Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme);
  }
  
  static interface e {
    ColorStateList a(Context param1Context, int param1Int);
    
    PorterDuff.Mode a(int param1Int);
    
    Drawable a(m0 param1m0, Context param1Context, int param1Int);
    
    boolean a(Context param1Context, int param1Int, Drawable param1Drawable);
    
    boolean b(Context param1Context, int param1Int, Drawable param1Drawable);
  }
  
  private static class f implements d {
    public Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme) {
      try {
        return (Drawable)i.createFromXmlInner(param1Context.getResources(), param1XmlPullParser, param1AttributeSet, param1Theme);
      } catch (Exception exception) {
        Log.e("VdcInflateDelegate", "Exception while inflating <vector>", exception);
        return null;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */