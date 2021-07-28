package e.e.j.c;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import e.e.e.d.h;
import e.e.e.d.i;
import e.e.g.c;
import e.e.g.e;
import e.e.j.b.a;
import e.e.j.b.c;
import e.e.j.g.a;
import e.e.j.h.a;
import e.e.j.h.c;
import java.util.concurrent.Executor;

public abstract class a<T, INFO> implements a, a.b, a.a {
  private static final Class<?> t = a.class;
  
  private final e.e.j.b.b a = e.e.j.b.b.a();
  
  private final a b;
  
  private final Executor c;
  
  private c d;
  
  private a e;
  
  protected d<INFO> f;
  
  private c g;
  
  private Drawable h;
  
  private String i;
  
  private Object j;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  private boolean n;
  
  private String o;
  
  private c<T> p;
  
  private T q;
  
  private Drawable r;
  
  private boolean s = true;
  
  public a(a parama, Executor paramExecutor, String paramString, Object paramObject) {
    this.b = parama;
    this.c = paramExecutor;
    c(paramString, paramObject);
  }
  
  private void a(String paramString, c<T> paramc, float paramFloat, boolean paramBoolean) {
    if (!a(paramString, paramc)) {
      a("ignore_old_datasource @ onProgress", (Throwable)null);
      paramc.close();
      return;
    } 
    if (!paramBoolean)
      this.g.a(paramFloat, false); 
  }
  
  private void a(String paramString, c<T> paramc, T paramT, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    // Byte code:
    //   0: invokestatic c : ()Z
    //   3: ifeq -> 11
    //   6: ldc 'AbstractDraweeController#onNewResultInternal'
    //   8: invokestatic a : (Ljava/lang/String;)V
    //   11: aload_0
    //   12: aload_1
    //   13: aload_2
    //   14: invokespecial a : (Ljava/lang/String;Le/e/g/c;)Z
    //   17: ifne -> 49
    //   20: aload_0
    //   21: ldc 'ignore_old_datasource @ onNewResult'
    //   23: aload_3
    //   24: invokespecial d : (Ljava/lang/String;Ljava/lang/Object;)V
    //   27: aload_0
    //   28: aload_3
    //   29: invokevirtual e : (Ljava/lang/Object;)V
    //   32: aload_2
    //   33: invokeinterface close : ()Z
    //   38: pop
    //   39: invokestatic c : ()Z
    //   42: ifeq -> 48
    //   45: invokestatic a : ()V
    //   48: return
    //   49: aload_0
    //   50: getfield a : Le/e/j/b/b;
    //   53: astore #9
    //   55: iload #5
    //   57: ifeq -> 68
    //   60: getstatic e/e/j/b/b$a.m : Le/e/j/b/b$a;
    //   63: astore #8
    //   65: goto -> 73
    //   68: getstatic e/e/j/b/b$a.n : Le/e/j/b/b$a;
    //   71: astore #8
    //   73: aload #9
    //   75: aload #8
    //   77: invokevirtual a : (Le/e/j/b/b$a;)V
    //   80: aload_0
    //   81: aload_3
    //   82: invokevirtual a : (Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;
    //   85: astore #10
    //   87: aload_0
    //   88: getfield q : Ljava/lang/Object;
    //   91: astore #11
    //   93: aload_0
    //   94: getfield r : Landroid/graphics/drawable/Drawable;
    //   97: astore #12
    //   99: aload_0
    //   100: aload_3
    //   101: putfield q : Ljava/lang/Object;
    //   104: aload_0
    //   105: aload #10
    //   107: putfield r : Landroid/graphics/drawable/Drawable;
    //   110: iload #5
    //   112: ifeq -> 173
    //   115: aload_0
    //   116: ldc 'set_final_result @ onNewResult'
    //   118: aload_3
    //   119: invokespecial d : (Ljava/lang/String;Ljava/lang/Object;)V
    //   122: aload_0
    //   123: aconst_null
    //   124: putfield p : Le/e/g/c;
    //   127: aload_0
    //   128: getfield g : Le/e/j/h/c;
    //   131: aload #10
    //   133: fconst_1
    //   134: iload #6
    //   136: invokeinterface a : (Landroid/graphics/drawable/Drawable;FZ)V
    //   141: aload_0
    //   142: invokevirtual h : ()Le/e/j/c/d;
    //   145: astore_2
    //   146: aload_0
    //   147: aload_3
    //   148: invokevirtual d : (Ljava/lang/Object;)Ljava/lang/Object;
    //   151: astore #8
    //   153: aload_0
    //   154: invokevirtual f : ()Landroid/graphics/drawable/Animatable;
    //   157: astore #9
    //   159: aload_2
    //   160: aload_1
    //   161: aload #8
    //   163: aload #9
    //   165: invokeinterface a : (Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V
    //   170: goto -> 257
    //   173: iload #7
    //   175: ifeq -> 220
    //   178: aload_0
    //   179: ldc 'set_temporary_result @ onNewResult'
    //   181: aload_3
    //   182: invokespecial d : (Ljava/lang/String;Ljava/lang/Object;)V
    //   185: aload_0
    //   186: getfield g : Le/e/j/h/c;
    //   189: aload #10
    //   191: fconst_1
    //   192: iload #6
    //   194: invokeinterface a : (Landroid/graphics/drawable/Drawable;FZ)V
    //   199: aload_0
    //   200: invokevirtual h : ()Le/e/j/c/d;
    //   203: astore_2
    //   204: aload_0
    //   205: aload_3
    //   206: invokevirtual d : (Ljava/lang/Object;)Ljava/lang/Object;
    //   209: astore #8
    //   211: aload_0
    //   212: invokevirtual f : ()Landroid/graphics/drawable/Animatable;
    //   215: astore #9
    //   217: goto -> 159
    //   220: aload_0
    //   221: ldc 'set_intermediate_result @ onNewResult'
    //   223: aload_3
    //   224: invokespecial d : (Ljava/lang/String;Ljava/lang/Object;)V
    //   227: aload_0
    //   228: getfield g : Le/e/j/h/c;
    //   231: aload #10
    //   233: fload #4
    //   235: iload #6
    //   237: invokeinterface a : (Landroid/graphics/drawable/Drawable;FZ)V
    //   242: aload_0
    //   243: invokevirtual h : ()Le/e/j/c/d;
    //   246: aload_1
    //   247: aload_0
    //   248: aload_3
    //   249: invokevirtual d : (Ljava/lang/Object;)Ljava/lang/Object;
    //   252: invokeinterface a : (Ljava/lang/String;Ljava/lang/Object;)V
    //   257: aload #12
    //   259: ifnull -> 275
    //   262: aload #12
    //   264: aload #10
    //   266: if_acmpeq -> 275
    //   269: aload_0
    //   270: aload #12
    //   272: invokevirtual a : (Landroid/graphics/drawable/Drawable;)V
    //   275: aload #11
    //   277: ifnull -> 300
    //   280: aload #11
    //   282: aload_3
    //   283: if_acmpeq -> 300
    //   286: aload_0
    //   287: ldc 'release_previous_result @ onNewResult'
    //   289: aload #11
    //   291: invokespecial d : (Ljava/lang/String;Ljava/lang/Object;)V
    //   294: aload_0
    //   295: aload #11
    //   297: invokevirtual e : (Ljava/lang/Object;)V
    //   300: invokestatic c : ()Z
    //   303: ifeq -> 309
    //   306: invokestatic a : ()V
    //   309: return
    //   310: aload #12
    //   312: ifnull -> 328
    //   315: aload #12
    //   317: aload #10
    //   319: if_acmpeq -> 328
    //   322: aload_0
    //   323: aload #12
    //   325: invokevirtual a : (Landroid/graphics/drawable/Drawable;)V
    //   328: aload #11
    //   330: ifnull -> 353
    //   333: aload #11
    //   335: aload_3
    //   336: if_acmpeq -> 353
    //   339: aload_0
    //   340: ldc 'release_previous_result @ onNewResult'
    //   342: aload #11
    //   344: invokespecial d : (Ljava/lang/String;Ljava/lang/Object;)V
    //   347: aload_0
    //   348: aload #11
    //   350: invokevirtual e : (Ljava/lang/Object;)V
    //   353: aload_1
    //   354: athrow
    //   355: astore #8
    //   357: aload_0
    //   358: ldc 'drawable_failed @ onNewResult'
    //   360: aload_3
    //   361: invokespecial d : (Ljava/lang/String;Ljava/lang/Object;)V
    //   364: aload_0
    //   365: aload_3
    //   366: invokevirtual e : (Ljava/lang/Object;)V
    //   369: aload_0
    //   370: aload_1
    //   371: aload_2
    //   372: aload #8
    //   374: iload #5
    //   376: invokespecial a : (Ljava/lang/String;Le/e/g/c;Ljava/lang/Throwable;Z)V
    //   379: invokestatic c : ()Z
    //   382: ifeq -> 388
    //   385: invokestatic a : ()V
    //   388: return
    //   389: astore_1
    //   390: invokestatic c : ()Z
    //   393: ifeq -> 399
    //   396: invokestatic a : ()V
    //   399: goto -> 404
    //   402: aload_1
    //   403: athrow
    //   404: goto -> 402
    //   407: astore_1
    //   408: goto -> 310
    // Exception table:
    //   from	to	target	type
    //   0	11	389	finally
    //   11	39	389	finally
    //   49	55	389	finally
    //   60	65	389	finally
    //   68	73	389	finally
    //   73	80	389	finally
    //   80	87	355	java/lang/Exception
    //   80	87	389	finally
    //   87	110	389	finally
    //   115	159	407	finally
    //   159	170	407	finally
    //   178	217	407	finally
    //   220	257	407	finally
    //   269	275	389	finally
    //   286	300	389	finally
    //   322	328	389	finally
    //   339	353	389	finally
    //   353	355	389	finally
    //   357	379	389	finally
  }
  
  private void a(String paramString, c<T> paramc, Throwable paramThrowable, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic c : ()Z
    //   3: ifeq -> 11
    //   6: ldc 'AbstractDraweeController#onFailureInternal'
    //   8: invokestatic a : (Ljava/lang/String;)V
    //   11: aload_0
    //   12: aload_1
    //   13: aload_2
    //   14: invokespecial a : (Ljava/lang/String;Le/e/g/c;)Z
    //   17: ifne -> 44
    //   20: aload_0
    //   21: ldc 'ignore_old_datasource @ onFailure'
    //   23: aload_3
    //   24: invokespecial a : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   27: aload_2
    //   28: invokeinterface close : ()Z
    //   33: pop
    //   34: invokestatic c : ()Z
    //   37: ifeq -> 43
    //   40: invokestatic a : ()V
    //   43: return
    //   44: aload_0
    //   45: getfield a : Le/e/j/b/b;
    //   48: astore_2
    //   49: iload #4
    //   51: ifeq -> 61
    //   54: getstatic e/e/j/b/b$a.o : Le/e/j/b/b$a;
    //   57: astore_1
    //   58: goto -> 65
    //   61: getstatic e/e/j/b/b$a.p : Le/e/j/b/b$a;
    //   64: astore_1
    //   65: aload_2
    //   66: aload_1
    //   67: invokevirtual a : (Le/e/j/b/b$a;)V
    //   70: iload #4
    //   72: ifeq -> 170
    //   75: aload_0
    //   76: ldc 'final_failed @ onFailure'
    //   78: aload_3
    //   79: invokespecial a : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   82: aload_0
    //   83: aconst_null
    //   84: putfield p : Le/e/g/c;
    //   87: aload_0
    //   88: iconst_1
    //   89: putfield m : Z
    //   92: aload_0
    //   93: getfield n : Z
    //   96: ifeq -> 123
    //   99: aload_0
    //   100: getfield r : Landroid/graphics/drawable/Drawable;
    //   103: astore_1
    //   104: aload_1
    //   105: ifnull -> 123
    //   108: aload_0
    //   109: getfield g : Le/e/j/h/c;
    //   112: aload_1
    //   113: fconst_1
    //   114: iconst_1
    //   115: invokeinterface a : (Landroid/graphics/drawable/Drawable;FZ)V
    //   120: goto -> 153
    //   123: aload_0
    //   124: invokespecial q : ()Z
    //   127: ifeq -> 143
    //   130: aload_0
    //   131: getfield g : Le/e/j/h/c;
    //   134: aload_3
    //   135: invokeinterface a : (Ljava/lang/Throwable;)V
    //   140: goto -> 153
    //   143: aload_0
    //   144: getfield g : Le/e/j/h/c;
    //   147: aload_3
    //   148: invokeinterface b : (Ljava/lang/Throwable;)V
    //   153: aload_0
    //   154: invokevirtual h : ()Le/e/j/c/d;
    //   157: aload_0
    //   158: getfield i : Ljava/lang/String;
    //   161: aload_3
    //   162: invokeinterface b : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   167: goto -> 191
    //   170: aload_0
    //   171: ldc 'intermediate_failed @ onFailure'
    //   173: aload_3
    //   174: invokespecial a : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   177: aload_0
    //   178: invokevirtual h : ()Le/e/j/c/d;
    //   181: aload_0
    //   182: getfield i : Ljava/lang/String;
    //   185: aload_3
    //   186: invokeinterface a : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   191: invokestatic c : ()Z
    //   194: ifeq -> 200
    //   197: invokestatic a : ()V
    //   200: return
  }
  
  private void a(String paramString, Throwable paramThrowable) {
    if (e.e.e.e.a.a(2))
      e.e.e.e.a.a(t, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.i, paramString, paramThrowable); 
  }
  
  private boolean a(String paramString, c<T> paramc) {
    return (paramc == null && this.p == null) ? true : ((paramString.equals(this.i) && paramc == this.p && this.l));
  }
  
  private void c(String paramString, Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic c : ()Z
    //   5: ifeq -> 13
    //   8: ldc 'AbstractDraweeController#init'
    //   10: invokestatic a : (Ljava/lang/String;)V
    //   13: aload_0
    //   14: getfield a : Le/e/j/b/b;
    //   17: getstatic e/e/j/b/b$a.h : Le/e/j/b/b$a;
    //   20: invokevirtual a : (Le/e/j/b/b$a;)V
    //   23: aload_0
    //   24: getfield s : Z
    //   27: ifne -> 45
    //   30: aload_0
    //   31: getfield b : Le/e/j/b/a;
    //   34: ifnull -> 45
    //   37: aload_0
    //   38: getfield b : Le/e/j/b/a;
    //   41: aload_0
    //   42: invokevirtual a : (Le/e/j/b/a$b;)V
    //   45: aload_0
    //   46: iconst_0
    //   47: putfield k : Z
    //   50: aload_0
    //   51: invokespecial p : ()V
    //   54: aload_0
    //   55: iconst_0
    //   56: putfield n : Z
    //   59: aload_0
    //   60: getfield d : Le/e/j/b/c;
    //   63: ifnull -> 73
    //   66: aload_0
    //   67: getfield d : Le/e/j/b/c;
    //   70: invokevirtual a : ()V
    //   73: aload_0
    //   74: getfield e : Le/e/j/g/a;
    //   77: ifnull -> 95
    //   80: aload_0
    //   81: getfield e : Le/e/j/g/a;
    //   84: invokevirtual a : ()V
    //   87: aload_0
    //   88: getfield e : Le/e/j/g/a;
    //   91: aload_0
    //   92: invokevirtual a : (Le/e/j/g/a$a;)V
    //   95: aload_0
    //   96: getfield f : Le/e/j/c/d;
    //   99: instanceof e/e/j/c/a$b
    //   102: ifeq -> 118
    //   105: aload_0
    //   106: getfield f : Le/e/j/c/d;
    //   109: checkcast e/e/j/c/a$b
    //   112: invokevirtual a : ()V
    //   115: goto -> 123
    //   118: aload_0
    //   119: aconst_null
    //   120: putfield f : Le/e/j/c/d;
    //   123: aload_0
    //   124: getfield g : Le/e/j/h/c;
    //   127: ifnull -> 154
    //   130: aload_0
    //   131: getfield g : Le/e/j/h/c;
    //   134: invokeinterface a : ()V
    //   139: aload_0
    //   140: getfield g : Le/e/j/h/c;
    //   143: aconst_null
    //   144: invokeinterface a : (Landroid/graphics/drawable/Drawable;)V
    //   149: aload_0
    //   150: aconst_null
    //   151: putfield g : Le/e/j/h/c;
    //   154: aload_0
    //   155: aconst_null
    //   156: putfield h : Landroid/graphics/drawable/Drawable;
    //   159: iconst_2
    //   160: invokestatic a : (I)Z
    //   163: ifeq -> 187
    //   166: getstatic e/e/j/c/a.t : Ljava/lang/Class;
    //   169: ldc_w 'controller %x %s -> %s: initialize'
    //   172: aload_0
    //   173: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   176: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   179: aload_0
    //   180: getfield i : Ljava/lang/String;
    //   183: aload_1
    //   184: invokestatic a : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   187: aload_0
    //   188: aload_1
    //   189: putfield i : Ljava/lang/String;
    //   192: aload_0
    //   193: aload_2
    //   194: putfield j : Ljava/lang/Object;
    //   197: invokestatic c : ()Z
    //   200: ifeq -> 206
    //   203: invokestatic a : ()V
    //   206: aload_0
    //   207: monitorexit
    //   208: return
    //   209: astore_1
    //   210: aload_0
    //   211: monitorexit
    //   212: aload_1
    //   213: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	209	finally
    //   13	45	209	finally
    //   45	73	209	finally
    //   73	95	209	finally
    //   95	115	209	finally
    //   118	123	209	finally
    //   123	154	209	finally
    //   154	187	209	finally
    //   187	206	209	finally
  }
  
  private void d(String paramString, T paramT) {
    if (e.e.e.e.a.a(2))
      e.e.e.e.a.b(t, "controller %x %s: %s: image: %s %x", new Object[] { Integer.valueOf(System.identityHashCode(this)), this.i, paramString, b(paramT), Integer.valueOf(c(paramT)) }); 
  }
  
  private void p() {
    boolean bool = this.l;
    this.l = false;
    this.m = false;
    c<T> c1 = this.p;
    if (c1 != null) {
      c1.close();
      this.p = null;
    } 
    Drawable drawable = this.r;
    if (drawable != null)
      a(drawable); 
    if (this.o != null)
      this.o = null; 
    this.r = null;
    T t = this.q;
    if (t != null) {
      d("release", t);
      e(this.q);
      this.q = null;
    } 
    if (bool)
      h().a(this.i); 
  }
  
  private boolean q() {
    if (this.m) {
      c c1 = this.d;
      if (c1 != null && c1.d())
        return true; 
    } 
    return false;
  }
  
  protected abstract Drawable a(T paramT);
  
  public void a() {
    this.a.a(e.e.j.b.b.a.k);
    c c2 = this.d;
    if (c2 != null)
      c2.c(); 
    a a1 = this.e;
    if (a1 != null)
      a1.c(); 
    c c1 = this.g;
    if (c1 != null)
      c1.a(); 
    p();
  }
  
  protected abstract void a(Drawable paramDrawable);
  
  public void a(d<? super INFO> paramd) {
    i.a(paramd);
    d<INFO> d1 = this.f;
    if (d1 instanceof b) {
      ((b<INFO>)d1).a(paramd);
      return;
    } 
    if (d1 != null) {
      this.f = b.a(d1, paramd);
      return;
    } 
    this.f = (d)paramd;
  }
  
  public void a(e parame) {}
  
  protected void a(a parama) {
    this.e = parama;
    parama = this.e;
    if (parama != null)
      parama.a(this); 
  }
  
  public void a(e.e.j.h.b paramb) {
    e.e.j.b.b.a a1;
    if (e.e.e.e.a.a(2))
      e.e.e.e.a.a(t, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.i, paramb); 
    e.e.j.b.b b1 = this.a;
    if (paramb != null) {
      a1 = e.e.j.b.b.a.c;
    } else {
      a1 = e.e.j.b.b.a.d;
    } 
    b1.a(a1);
    if (this.l) {
      this.b.a(this);
      a();
    } 
    c c1 = this.g;
    if (c1 != null) {
      c1.a(null);
      this.g = null;
    } 
    if (paramb != null) {
      i.a(paramb instanceof c);
      this.g = (c)paramb;
      this.g.a(this.h);
    } 
  }
  
  public void a(String paramString) {
    this.o = paramString;
  }
  
  protected void a(String paramString, Object paramObject) {
    c(paramString, paramObject);
    this.s = false;
  }
  
  protected void a(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public boolean a(MotionEvent paramMotionEvent) {
    if (e.e.e.e.a.a(2))
      e.e.e.e.a.a(t, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.i, paramMotionEvent); 
    a a1 = this.e;
    if (a1 == null)
      return false; 
    if (a1.b() || n()) {
      this.e.a(paramMotionEvent);
      return true;
    } 
    return false;
  }
  
  protected String b(T paramT) {
    return (paramT != null) ? paramT.getClass().getSimpleName() : "<null>";
  }
  
  public void b() {
    if (e.e.l.p.b.c())
      e.e.l.p.b.a("AbstractDraweeController#onDetach"); 
    if (e.e.e.e.a.a(2))
      e.e.e.e.a.a(t, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.i); 
    this.a.a(e.e.j.b.b.a.j);
    this.k = false;
    this.b.b(this);
    if (e.e.l.p.b.c())
      e.e.l.p.b.a(); 
  }
  
  protected void b(Drawable paramDrawable) {
    this.h = paramDrawable;
    c c1 = this.g;
    if (c1 != null)
      c1.a(this.h); 
  }
  
  public void b(d<? super INFO> paramd) {
    i.a(paramd);
    d<INFO> d1 = this.f;
    if (d1 instanceof b) {
      ((b<INFO>)d1).b(paramd);
      return;
    } 
    if (d1 == paramd)
      this.f = null; 
  }
  
  protected void b(String paramString, T paramT) {}
  
  protected int c(T paramT) {
    return System.identityHashCode(paramT);
  }
  
  public e.e.j.h.b c() {
    return (e.e.j.h.b)this.g;
  }
  
  protected abstract INFO d(T paramT);
  
  public void d() {
    if (e.e.l.p.b.c())
      e.e.l.p.b.a("AbstractDraweeController#onAttach"); 
    if (e.e.e.e.a.a(2)) {
      String str1;
      Class<?> clazz = t;
      int i = System.identityHashCode(this);
      String str2 = this.i;
      if (this.l) {
        str1 = "request already submitted";
      } else {
        str1 = "request needs submit";
      } 
      e.e.e.e.a.a(clazz, "controller %x %s: onAttach: %s", Integer.valueOf(i), str2, str1);
    } 
    this.a.a(e.e.j.b.b.a.i);
    i.a(this.g);
    this.b.a(this);
    this.k = true;
    if (!this.l)
      o(); 
    if (e.e.l.p.b.c())
      e.e.l.p.b.a(); 
  }
  
  protected abstract void e(T paramT);
  
  public boolean e() {
    if (e.e.e.e.a.a(2))
      e.e.e.e.a.a(t, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.i); 
    if (q()) {
      this.d.b();
      this.g.a();
      o();
      return true;
    } 
    return false;
  }
  
  public Animatable f() {
    Drawable drawable = this.r;
    return (drawable instanceof Animatable) ? (Animatable)drawable : null;
  }
  
  protected T g() {
    return null;
  }
  
  protected d<INFO> h() {
    d<INFO> d2 = this.f;
    d<INFO> d1 = d2;
    if (d2 == null)
      d1 = c.a(); 
    return d1;
  }
  
  protected Drawable i() {
    return this.h;
  }
  
  protected abstract c<T> j();
  
  protected a k() {
    return this.e;
  }
  
  public String l() {
    return this.i;
  }
  
  protected c m() {
    if (this.d == null)
      this.d = new c(); 
    return this.d;
  }
  
  protected boolean n() {
    return q();
  }
  
  protected void o() {
    if (e.e.l.p.b.c())
      e.e.l.p.b.a("AbstractDraweeController#submitRequest"); 
    T t = g();
    if (t != null) {
      if (e.e.l.p.b.c())
        e.e.l.p.b.a("AbstractDraweeController#submitRequest->cache"); 
      this.p = null;
      this.l = true;
      this.m = false;
      this.a.a(e.e.j.b.b.a.z);
      h().b(this.i, this.j);
      b(this.i, t);
      a(this.i, this.p, t, 1.0F, true, true, true);
      if (e.e.l.p.b.c())
        e.e.l.p.b.a(); 
      if (e.e.l.p.b.c())
        e.e.l.p.b.a(); 
      return;
    } 
    this.a.a(e.e.j.b.b.a.l);
    h().b(this.i, this.j);
    this.g.a(0.0F, true);
    this.l = true;
    this.m = false;
    this.p = j();
    if (e.e.e.e.a.a(2))
      e.e.e.e.a.a(t, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.i, Integer.valueOf(System.identityHashCode(this.p))); 
    a a1 = new a(this, this.i, this.p.c());
    this.p.a((e)a1, this.c);
    if (e.e.l.p.b.c())
      e.e.l.p.b.a(); 
  }
  
  public String toString() {
    h.b b1 = h.a(this);
    b1.a("isAttached", this.k);
    b1.a("isRequestSubmitted", this.l);
    b1.a("hasFetchFailed", this.m);
    b1.a("fetchedImage", c(this.q));
    b1.a("events", this.a.toString());
    return b1.toString();
  }
  
  class a extends e.e.g.b<T> {
    a(a this$0, String param1String, boolean param1Boolean) {}
    
    public void d(c<T> param1c) {
      boolean bool = param1c.d();
      float f = param1c.f();
      a.a(this.c, this.a, param1c, f, bool);
    }
    
    public void e(c<T> param1c) {
      a.a(this.c, this.a, param1c, param1c.e(), true);
    }
    
    public void f(c<T> param1c) {
      boolean bool1 = param1c.d();
      boolean bool2 = param1c.b();
      float f = param1c.f();
      Object object = param1c.a();
      if (object != null) {
        a.a(this.c, this.a, param1c, object, f, bool1, this.b, bool2);
        return;
      } 
      if (bool1)
        a.a(this.c, this.a, param1c, new NullPointerException(), true); 
    }
  }
  
  private static class b<INFO> extends f<INFO> {
    public static <INFO> b<INFO> a(d<? super INFO> param1d1, d<? super INFO> param1d2) {
      if (e.e.l.p.b.c())
        e.e.l.p.b.a("AbstractDraweeController#createInternal"); 
      b<INFO> b1 = new b();
      b1.a(param1d1);
      b1.a(param1d2);
      if (e.e.l.p.b.c())
        e.e.l.p.b.a(); 
      return b1;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */