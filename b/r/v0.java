package b.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public abstract class v0 extends x {
  private static final String[] M = new String[] { "android:visibility:visibility", "android:visibility:parent" };
  
  private int L = 3;
  
  private c b(d0 paramd01, d0 paramd02) {
    c c = new c();
    c.a = false;
    c.b = false;
    if (paramd01 != null && paramd01.a.containsKey("android:visibility:visibility")) {
      c.c = ((Integer)paramd01.a.get("android:visibility:visibility")).intValue();
      c.e = (ViewGroup)paramd01.a.get("android:visibility:parent");
    } else {
      c.c = -1;
      c.e = null;
    } 
    if (paramd02 != null && paramd02.a.containsKey("android:visibility:visibility")) {
      c.d = ((Integer)paramd02.a.get("android:visibility:visibility")).intValue();
      c.f = (ViewGroup)paramd02.a.get("android:visibility:parent");
    } else {
      c.d = -1;
      c.f = null;
    } 
    if (paramd01 != null && paramd02 != null) {
      if (c.c == c.d && c.e == c.f)
        return c; 
      int i = c.c;
      int j = c.d;
      if (i != j) {
        if (i == 0) {
          c.b = false;
          c.a = true;
          return c;
        } 
        if (j == 0) {
          c.b = true;
          c.a = true;
          return c;
        } 
      } else {
        if (c.f == null) {
          c.b = false;
          c.a = true;
          return c;
        } 
        if (c.e == null) {
          c.b = true;
          c.a = true;
          return c;
        } 
      } 
    } else {
      if (paramd01 == null && c.d == 0) {
        c.b = true;
        c.a = true;
        return c;
      } 
      if (paramd02 == null && c.c == 0) {
        c.b = false;
        c.a = true;
        return c;
      } 
    } 
    return c;
  }
  
  private void d(d0 paramd0) {
    int i = paramd0.b.getVisibility();
    paramd0.a.put("android:visibility:visibility", Integer.valueOf(i));
    paramd0.a.put("android:visibility:parent", paramd0.b.getParent());
    int[] arrayOfInt = new int[2];
    paramd0.b.getLocationOnScreen(arrayOfInt);
    paramd0.a.put("android:visibility:screenLocation", arrayOfInt);
  }
  
  public abstract Animator a(ViewGroup paramViewGroup, View paramView, d0 paramd01, d0 paramd02);
  
  public Animator a(ViewGroup paramViewGroup, d0 paramd01, int paramInt1, d0 paramd02, int paramInt2) {
    if ((this.L & 0x1) == 1) {
      if (paramd02 == null)
        return null; 
      if (paramd01 == null) {
        View view = (View)paramd02.b.getParent();
        if ((b(a(view, false), b(view, false))).a)
          return null; 
      } 
      return a(paramViewGroup, paramd02.b, paramd01, paramd02);
    } 
    return null;
  }
  
  public Animator a(ViewGroup paramViewGroup, d0 paramd01, d0 paramd02) {
    c c = b(paramd01, paramd02);
    return (c.a && (c.e != null || c.f != null)) ? (c.b ? a(paramViewGroup, paramd01, c.c, paramd02, c.d) : b(paramViewGroup, paramd01, c.c, paramd02, c.d)) : null;
  }
  
  public void a(int paramInt) {
    if ((paramInt & 0xFFFFFFFC) == 0) {
      this.L = paramInt;
      return;
    } 
    throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
  }
  
  public void a(d0 paramd0) {
    d(paramd0);
  }
  
  public boolean a(d0 paramd01, d0 paramd02) {
    boolean bool = false;
    if (paramd01 == null && paramd02 == null)
      return false; 
    if (paramd01 != null && paramd02 != null && paramd02.a.containsKey("android:visibility:visibility") != paramd01.a.containsKey("android:visibility:visibility"))
      return false; 
    c c = b(paramd01, paramd02);
    null = bool;
    if (c.a) {
      if (c.c != 0) {
        null = bool;
        return (c.d == 0) ? true : null;
      } 
    } else {
      return null;
    } 
    return true;
  }
  
  public abstract Animator b(ViewGroup paramViewGroup, View paramView, d0 paramd01, d0 paramd02);
  
  public Animator b(ViewGroup paramViewGroup, d0 paramd01, int paramInt1, d0 paramd02, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield L : I
    //   4: iconst_2
    //   5: iand
    //   6: iconst_2
    //   7: if_icmpeq -> 12
    //   10: aconst_null
    //   11: areturn
    //   12: aload_2
    //   13: ifnonnull -> 18
    //   16: aconst_null
    //   17: areturn
    //   18: aload_2
    //   19: getfield b : Landroid/view/View;
    //   22: astore #10
    //   24: aload #4
    //   26: ifnull -> 39
    //   29: aload #4
    //   31: getfield b : Landroid/view/View;
    //   34: astore #7
    //   36: goto -> 42
    //   39: aconst_null
    //   40: astore #7
    //   42: aload #10
    //   44: getstatic b/r/s.save_overlay_view : I
    //   47: invokevirtual getTag : (I)Ljava/lang/Object;
    //   50: checkcast android/view/View
    //   53: astore #8
    //   55: aload #8
    //   57: ifnull -> 76
    //   60: aconst_null
    //   61: astore #9
    //   63: iconst_1
    //   64: istore_3
    //   65: aload #8
    //   67: astore #7
    //   69: aload #9
    //   71: astore #8
    //   73: goto -> 281
    //   76: aload #7
    //   78: ifnull -> 118
    //   81: aload #7
    //   83: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   86: ifnonnull -> 92
    //   89: goto -> 118
    //   92: iload #5
    //   94: iconst_4
    //   95: if_icmpne -> 101
    //   98: goto -> 108
    //   101: aload #10
    //   103: aload #7
    //   105: if_acmpne -> 135
    //   108: aconst_null
    //   109: astore #9
    //   111: aload #7
    //   113: astore #8
    //   115: goto -> 130
    //   118: aload #7
    //   120: ifnull -> 135
    //   123: aconst_null
    //   124: astore #8
    //   126: aload #7
    //   128: astore #9
    //   130: iconst_0
    //   131: istore_3
    //   132: goto -> 144
    //   135: aconst_null
    //   136: astore #9
    //   138: aload #9
    //   140: astore #8
    //   142: iconst_1
    //   143: istore_3
    //   144: aload #9
    //   146: astore #7
    //   148: iload_3
    //   149: ifeq -> 279
    //   152: aload #10
    //   154: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   157: ifnonnull -> 163
    //   160: goto -> 275
    //   163: aload #9
    //   165: astore #7
    //   167: aload #10
    //   169: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   172: instanceof android/view/View
    //   175: ifeq -> 279
    //   178: aload #10
    //   180: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   183: checkcast android/view/View
    //   186: astore #11
    //   188: aload_0
    //   189: aload_0
    //   190: aload #11
    //   192: iconst_1
    //   193: invokevirtual b : (Landroid/view/View;Z)Lb/r/d0;
    //   196: aload_0
    //   197: aload #11
    //   199: iconst_1
    //   200: invokevirtual a : (Landroid/view/View;Z)Lb/r/d0;
    //   203: invokespecial b : (Lb/r/d0;Lb/r/d0;)Lb/r/v0$c;
    //   206: getfield a : Z
    //   209: ifne -> 225
    //   212: aload_1
    //   213: aload #10
    //   215: aload #11
    //   217: invokestatic a : (Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)Landroid/view/View;
    //   220: astore #7
    //   222: goto -> 279
    //   225: aload #11
    //   227: invokevirtual getId : ()I
    //   230: istore_3
    //   231: aload #9
    //   233: astore #7
    //   235: aload #11
    //   237: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   240: ifnonnull -> 279
    //   243: aload #9
    //   245: astore #7
    //   247: iload_3
    //   248: iconst_m1
    //   249: if_icmpeq -> 279
    //   252: aload #9
    //   254: astore #7
    //   256: aload_1
    //   257: iload_3
    //   258: invokevirtual findViewById : (I)Landroid/view/View;
    //   261: ifnull -> 279
    //   264: aload #9
    //   266: astore #7
    //   268: aload_0
    //   269: getfield x : Z
    //   272: ifeq -> 279
    //   275: aload #10
    //   277: astore #7
    //   279: iconst_0
    //   280: istore_3
    //   281: aload #7
    //   283: ifnull -> 438
    //   286: iload_3
    //   287: ifne -> 376
    //   290: aload_2
    //   291: getfield a : Ljava/util/Map;
    //   294: ldc 'android:visibility:screenLocation'
    //   296: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   301: checkcast [I
    //   304: astore #8
    //   306: aload #8
    //   308: iconst_0
    //   309: iaload
    //   310: istore #5
    //   312: aload #8
    //   314: iconst_1
    //   315: iaload
    //   316: istore #6
    //   318: iconst_2
    //   319: newarray int
    //   321: astore #8
    //   323: aload_1
    //   324: aload #8
    //   326: invokevirtual getLocationOnScreen : ([I)V
    //   329: aload #7
    //   331: iload #5
    //   333: aload #8
    //   335: iconst_0
    //   336: iaload
    //   337: isub
    //   338: aload #7
    //   340: invokevirtual getLeft : ()I
    //   343: isub
    //   344: invokevirtual offsetLeftAndRight : (I)V
    //   347: aload #7
    //   349: iload #6
    //   351: aload #8
    //   353: iconst_1
    //   354: iaload
    //   355: isub
    //   356: aload #7
    //   358: invokevirtual getTop : ()I
    //   361: isub
    //   362: invokevirtual offsetTopAndBottom : (I)V
    //   365: aload_1
    //   366: invokestatic a : (Landroid/view/ViewGroup;)Lb/r/i0;
    //   369: aload #7
    //   371: invokeinterface a : (Landroid/view/View;)V
    //   376: aload_0
    //   377: aload_1
    //   378: aload #7
    //   380: aload_2
    //   381: aload #4
    //   383: invokevirtual b : (Landroid/view/ViewGroup;Landroid/view/View;Lb/r/d0;Lb/r/d0;)Landroid/animation/Animator;
    //   386: astore_2
    //   387: iload_3
    //   388: ifne -> 436
    //   391: aload_2
    //   392: ifnonnull -> 408
    //   395: aload_1
    //   396: invokestatic a : (Landroid/view/ViewGroup;)Lb/r/i0;
    //   399: aload #7
    //   401: invokeinterface b : (Landroid/view/View;)V
    //   406: aload_2
    //   407: areturn
    //   408: aload #10
    //   410: getstatic b/r/s.save_overlay_view : I
    //   413: aload #7
    //   415: invokevirtual setTag : (ILjava/lang/Object;)V
    //   418: aload_0
    //   419: new b/r/v0$a
    //   422: dup
    //   423: aload_0
    //   424: aload_1
    //   425: aload #7
    //   427: aload #10
    //   429: invokespecial <init> : (Lb/r/v0;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    //   432: invokevirtual a : (Lb/r/x$f;)Lb/r/x;
    //   435: pop
    //   436: aload_2
    //   437: areturn
    //   438: aload #8
    //   440: ifnull -> 509
    //   443: aload #8
    //   445: invokevirtual getVisibility : ()I
    //   448: istore_3
    //   449: aload #8
    //   451: iconst_0
    //   452: invokestatic a : (Landroid/view/View;I)V
    //   455: aload_0
    //   456: aload_1
    //   457: aload #8
    //   459: aload_2
    //   460: aload #4
    //   462: invokevirtual b : (Landroid/view/ViewGroup;Landroid/view/View;Lb/r/d0;Lb/r/d0;)Landroid/animation/Animator;
    //   465: astore_1
    //   466: aload_1
    //   467: ifnull -> 501
    //   470: new b/r/v0$b
    //   473: dup
    //   474: aload #8
    //   476: iload #5
    //   478: iconst_1
    //   479: invokespecial <init> : (Landroid/view/View;IZ)V
    //   482: astore_2
    //   483: aload_1
    //   484: aload_2
    //   485: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   488: aload_1
    //   489: aload_2
    //   490: invokestatic a : (Landroid/animation/Animator;Landroid/animation/AnimatorListenerAdapter;)V
    //   493: aload_0
    //   494: aload_2
    //   495: invokevirtual a : (Lb/r/x$f;)Lb/r/x;
    //   498: pop
    //   499: aload_1
    //   500: areturn
    //   501: aload #8
    //   503: iload_3
    //   504: invokestatic a : (Landroid/view/View;I)V
    //   507: aload_1
    //   508: areturn
    //   509: aconst_null
    //   510: areturn
  }
  
  public void c(d0 paramd0) {
    d(paramd0);
  }
  
  public String[] o() {
    return M;
  }
  
  class a extends y {
    a(v0 this$0, ViewGroup param1ViewGroup, View param1View1, View param1View2) {}
    
    public void c(x param1x) {
      j0.a(this.a).b(this.b);
    }
    
    public void d(x param1x) {
      if (this.b.getParent() == null) {
        j0.a(this.a).a(this.b);
        return;
      } 
      this.d.cancel();
    }
    
    public void e(x param1x) {
      this.c.setTag(s.save_overlay_view, null);
      j0.a(this.a).b(this.b);
      param1x.b(this);
    }
  }
  
  private static class b extends AnimatorListenerAdapter implements x.f, a.a {
    private final View a;
    
    private final int b;
    
    private final ViewGroup c;
    
    private final boolean d;
    
    private boolean e;
    
    boolean f = false;
    
    b(View param1View, int param1Int, boolean param1Boolean) {
      this.a = param1View;
      this.b = param1Int;
      this.c = (ViewGroup)param1View.getParent();
      this.d = param1Boolean;
      a(true);
    }
    
    private void a() {
      if (!this.f) {
        o0.a(this.a, this.b);
        ViewGroup viewGroup = this.c;
        if (viewGroup != null)
          viewGroup.invalidate(); 
      } 
      a(false);
    }
    
    private void a(boolean param1Boolean) {
      if (this.d && this.e != param1Boolean) {
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
          this.e = param1Boolean;
          j0.b(viewGroup, param1Boolean);
        } 
      } 
    }
    
    public void a(x param1x) {}
    
    public void b(x param1x) {}
    
    public void c(x param1x) {
      a(false);
    }
    
    public void d(x param1x) {
      a(true);
    }
    
    public void e(x param1x) {
      a();
      param1x.b(this);
    }
    
    public void onAnimationCancel(Animator param1Animator) {
      this.f = true;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      a();
    }
    
    public void onAnimationPause(Animator param1Animator) {
      if (!this.f)
        o0.a(this.a, this.b); 
    }
    
    public void onAnimationRepeat(Animator param1Animator) {}
    
    public void onAnimationResume(Animator param1Animator) {
      if (!this.f)
        o0.a(this.a, 0); 
    }
    
    public void onAnimationStart(Animator param1Animator) {}
  }
  
  private static class c {
    boolean a;
    
    boolean b;
    
    int c;
    
    int d;
    
    ViewGroup e;
    
    ViewGroup f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */