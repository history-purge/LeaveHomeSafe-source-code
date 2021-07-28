package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.q0;
import e.e.e.k.f;
import e.e.j.c.d;
import e.e.j.e.m;
import e.e.j.e.r;
import e.e.j.f.d;
import e.e.j.i.d;
import e.e.l.c.f;
import e.e.l.k.e;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class g extends d {
  private static float[] J = new float[4];
  
  private static final Matrix K = new Matrix();
  
  private static final Matrix L = new Matrix();
  
  private static final Matrix M = new Matrix();
  
  private final c A;
  
  private e.e.l.m.a B;
  
  private d C;
  
  private d D;
  
  private a E;
  
  private Object F;
  
  private int G = -1;
  
  private boolean H;
  
  private ReadableMap I;
  
  private c i = c.c;
  
  private final List<e.e.o.i0.b.a> j;
  
  private e.e.o.i0.b.a k;
  
  private e.e.o.i0.b.a l;
  
  private Drawable m;
  
  private Drawable n;
  
  private m o;
  
  private int p = 0;
  
  private int q;
  
  private int r;
  
  private float s;
  
  private float t = Float.NaN;
  
  private float[] u;
  
  private r.b v = d.b();
  
  private Shader.TileMode w = d.a();
  
  private boolean x;
  
  private final e.e.j.c.b y;
  
  private final b z;
  
  public g(Context paramContext, e.e.j.c.b paramb, a parama, Object paramObject) {
    super(paramContext, a(paramContext));
    this.y = paramb;
    this.z = new b(null);
    this.A = new c(null);
    this.E = parama;
    this.F = paramObject;
    this.j = new LinkedList<e.e.o.i0.b.a>();
  }
  
  private static e.e.j.f.a a(Context paramContext) {
    e.e.j.f.b b1 = new e.e.j.f.b(paramContext.getResources());
    b1.a(d.b(0.0F));
    return b1.a();
  }
  
  private void a(String paramString) {}
  
  private void a(float[] paramArrayOffloat) {
    float f1;
    if (!com.facebook.yoga.g.a(this.t)) {
      f1 = this.t;
    } else {
      f1 = 0.0F;
    } 
    float[] arrayOfFloat = this.u;
    if (arrayOfFloat != null && !com.facebook.yoga.g.a(arrayOfFloat[0])) {
      f2 = this.u[0];
    } else {
      f2 = f1;
    } 
    paramArrayOffloat[0] = f2;
    arrayOfFloat = this.u;
    if (arrayOfFloat != null && !com.facebook.yoga.g.a(arrayOfFloat[1])) {
      f2 = this.u[1];
    } else {
      f2 = f1;
    } 
    paramArrayOffloat[1] = f2;
    arrayOfFloat = this.u;
    if (arrayOfFloat != null && !com.facebook.yoga.g.a(arrayOfFloat[2])) {
      f2 = this.u[2];
    } else {
      f2 = f1;
    } 
    paramArrayOffloat[2] = f2;
    arrayOfFloat = this.u;
    float f2 = f1;
    if (arrayOfFloat != null) {
      f2 = f1;
      if (!com.facebook.yoga.g.a(arrayOfFloat[3]))
        f2 = this.u[3]; 
    } 
    paramArrayOffloat[3] = f2;
  }
  
  private boolean a(e.e.o.i0.b.a parama) {
    c c1 = this.i;
    c c2 = c.c;
    boolean bool = true;
    if (c1 == c2) {
      if (!f.f(parama.c())) {
        if (f.g(parama.c()))
          return true; 
        bool = false;
      } 
      return bool;
    } 
    return (c1 == c.d);
  }
  
  private boolean j() {
    return (this.j.size() > 1);
  }
  
  private boolean k() {
    return (this.w != Shader.TileMode.CLAMP);
  }
  
  private void l() {
    this.k = null;
    if (this.j.isEmpty()) {
      e.e.o.i0.b.a a1 = new e.e.o.i0.b.a(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=");
      this.j.add(a1);
    } else if (j()) {
      e.e.o.i0.b.b.b b1 = e.e.o.i0.b.b.a(getWidth(), getHeight(), this.j);
      this.k = b1.a();
      this.l = b1.b();
      return;
    } 
    this.k = this.j.get(0);
  }
  
  public void a(float paramFloat, int paramInt) {
    if (this.u == null) {
      this.u = new float[4];
      Arrays.fill(this.u, Float.NaN);
    } 
    if (!d.a(this.u[paramInt], paramFloat)) {
      this.u[paramInt] = paramFloat;
      this.x = true;
    } 
  }
  
  public void a(Object paramObject) {
    this.F = paramObject;
    this.x = true;
  }
  
  public void e() {
    // Byte code:
    //   0: aload_0
    //   1: getfield x : Z
    //   4: ifne -> 8
    //   7: return
    //   8: aload_0
    //   9: invokespecial j : ()Z
    //   12: ifeq -> 30
    //   15: aload_0
    //   16: invokevirtual getWidth : ()I
    //   19: ifle -> 29
    //   22: aload_0
    //   23: invokevirtual getHeight : ()I
    //   26: ifgt -> 30
    //   29: return
    //   30: aload_0
    //   31: invokespecial l : ()V
    //   34: aload_0
    //   35: getfield k : Le/e/o/i0/b/a;
    //   38: astore #4
    //   40: aload #4
    //   42: ifnonnull -> 46
    //   45: return
    //   46: aload_0
    //   47: aload #4
    //   49: invokespecial a : (Le/e/o/i0/b/a;)Z
    //   52: istore_3
    //   53: iload_3
    //   54: ifeq -> 72
    //   57: aload_0
    //   58: invokevirtual getWidth : ()I
    //   61: ifle -> 71
    //   64: aload_0
    //   65: invokevirtual getHeight : ()I
    //   68: ifgt -> 72
    //   71: return
    //   72: aload_0
    //   73: invokespecial k : ()Z
    //   76: ifeq -> 94
    //   79: aload_0
    //   80: invokevirtual getWidth : ()I
    //   83: ifle -> 93
    //   86: aload_0
    //   87: invokevirtual getHeight : ()I
    //   90: ifgt -> 94
    //   93: return
    //   94: aload_0
    //   95: invokevirtual getHierarchy : ()Le/e/j/h/b;
    //   98: checkcast e/e/j/f/a
    //   101: astore #4
    //   103: aload #4
    //   105: aload_0
    //   106: getfield v : Le/e/j/e/r$b;
    //   109: invokevirtual a : (Le/e/j/e/r$b;)V
    //   112: aload_0
    //   113: getfield m : Landroid/graphics/drawable/Drawable;
    //   116: astore #5
    //   118: aload #5
    //   120: ifnull -> 134
    //   123: aload #4
    //   125: aload #5
    //   127: aload_0
    //   128: getfield v : Le/e/j/e/r$b;
    //   131: invokevirtual a : (Landroid/graphics/drawable/Drawable;Le/e/j/e/r$b;)V
    //   134: aload_0
    //   135: getfield n : Landroid/graphics/drawable/Drawable;
    //   138: astore #5
    //   140: aload #5
    //   142: ifnull -> 155
    //   145: aload #4
    //   147: aload #5
    //   149: getstatic e/e/j/e/r$b.c : Le/e/j/e/r$b;
    //   152: invokevirtual a : (Landroid/graphics/drawable/Drawable;Le/e/j/e/r$b;)V
    //   155: aload_0
    //   156: getfield v : Le/e/j/e/r$b;
    //   159: astore #5
    //   161: aload #5
    //   163: getstatic e/e/j/e/r$b.e : Le/e/j/e/r$b;
    //   166: if_acmpeq -> 182
    //   169: aload #5
    //   171: getstatic e/e/j/e/r$b.f : Le/e/j/e/r$b;
    //   174: if_acmpeq -> 182
    //   177: iconst_1
    //   178: istore_2
    //   179: goto -> 184
    //   182: iconst_0
    //   183: istore_2
    //   184: aload #4
    //   186: invokevirtual c : ()Le/e/j/f/d;
    //   189: astore #5
    //   191: aload_0
    //   192: getstatic com/facebook/react/views/image/g.J : [F
    //   195: invokespecial a : ([F)V
    //   198: getstatic com/facebook/react/views/image/g.J : [F
    //   201: astore #6
    //   203: aload #5
    //   205: aload #6
    //   207: iconst_0
    //   208: faload
    //   209: aload #6
    //   211: iconst_1
    //   212: faload
    //   213: aload #6
    //   215: iconst_2
    //   216: faload
    //   217: aload #6
    //   219: iconst_3
    //   220: faload
    //   221: invokevirtual a : (FFFF)Le/e/j/f/d;
    //   224: pop
    //   225: aload_0
    //   226: getfield o : Le/e/j/e/m;
    //   229: astore #6
    //   231: aload #6
    //   233: ifnull -> 270
    //   236: aload #6
    //   238: aload_0
    //   239: getfield q : I
    //   242: aload_0
    //   243: getfield s : F
    //   246: invokevirtual a : (IF)V
    //   249: aload_0
    //   250: getfield o : Le/e/j/e/m;
    //   253: aload #5
    //   255: invokevirtual c : ()[F
    //   258: invokevirtual a : ([F)V
    //   261: aload #4
    //   263: aload_0
    //   264: getfield o : Le/e/j/e/m;
    //   267: invokevirtual b : (Landroid/graphics/drawable/Drawable;)V
    //   270: iload_2
    //   271: ifeq -> 281
    //   274: aload #5
    //   276: fconst_0
    //   277: invokevirtual a : (F)Le/e/j/f/d;
    //   280: pop
    //   281: aload #5
    //   283: aload_0
    //   284: getfield q : I
    //   287: aload_0
    //   288: getfield s : F
    //   291: invokevirtual a : (IF)Le/e/j/f/d;
    //   294: pop
    //   295: aload_0
    //   296: getfield r : I
    //   299: istore_1
    //   300: iload_1
    //   301: ifeq -> 314
    //   304: aload #5
    //   306: iload_1
    //   307: invokevirtual a : (I)Le/e/j/f/d;
    //   310: pop
    //   311: goto -> 323
    //   314: aload #5
    //   316: getstatic e/e/j/f/d$a.d : Le/e/j/f/d$a;
    //   319: invokevirtual a : (Le/e/j/f/d$a;)Le/e/j/f/d;
    //   322: pop
    //   323: aload #4
    //   325: aload #5
    //   327: invokevirtual a : (Le/e/j/f/d;)V
    //   330: aload_0
    //   331: getfield G : I
    //   334: istore_1
    //   335: iload_1
    //   336: iflt -> 342
    //   339: goto -> 361
    //   342: aload_0
    //   343: getfield k : Le/e/o/i0/b/a;
    //   346: invokevirtual d : ()Z
    //   349: ifeq -> 357
    //   352: iconst_0
    //   353: istore_1
    //   354: goto -> 361
    //   357: sipush #300
    //   360: istore_1
    //   361: aload #4
    //   363: iload_1
    //   364: invokevirtual a : (I)V
    //   367: new java/util/LinkedList
    //   370: dup
    //   371: invokespecial <init> : ()V
    //   374: astore #4
    //   376: iload_2
    //   377: ifeq -> 392
    //   380: aload #4
    //   382: aload_0
    //   383: getfield z : Lcom/facebook/react/views/image/g$b;
    //   386: invokeinterface add : (Ljava/lang/Object;)Z
    //   391: pop
    //   392: aload_0
    //   393: getfield B : Le/e/l/m/a;
    //   396: astore #5
    //   398: aload #5
    //   400: ifnull -> 413
    //   403: aload #4
    //   405: aload #5
    //   407: invokeinterface add : (Ljava/lang/Object;)Z
    //   412: pop
    //   413: aload_0
    //   414: invokespecial k : ()Z
    //   417: ifeq -> 432
    //   420: aload #4
    //   422: aload_0
    //   423: getfield A : Lcom/facebook/react/views/image/g$c;
    //   426: invokeinterface add : (Ljava/lang/Object;)Z
    //   431: pop
    //   432: aload #4
    //   434: invokestatic a : (Ljava/util/List;)Le/e/l/o/e;
    //   437: astore #5
    //   439: iload_3
    //   440: ifeq -> 463
    //   443: new e/e/l/e/e
    //   446: dup
    //   447: aload_0
    //   448: invokevirtual getWidth : ()I
    //   451: aload_0
    //   452: invokevirtual getHeight : ()I
    //   455: invokespecial <init> : (II)V
    //   458: astore #4
    //   460: goto -> 466
    //   463: aconst_null
    //   464: astore #4
    //   466: aload_0
    //   467: getfield k : Le/e/o/i0/b/a;
    //   470: invokevirtual c : ()Landroid/net/Uri;
    //   473: invokestatic b : (Landroid/net/Uri;)Le/e/l/o/d;
    //   476: astore #6
    //   478: aload #6
    //   480: aload #5
    //   482: invokevirtual a : (Le/e/l/o/e;)Le/e/l/o/d;
    //   485: pop
    //   486: aload #6
    //   488: aload #4
    //   490: invokevirtual a : (Le/e/l/e/e;)Le/e/l/o/d;
    //   493: pop
    //   494: aload #6
    //   496: iconst_1
    //   497: invokevirtual a : (Z)Le/e/l/o/d;
    //   500: pop
    //   501: aload #6
    //   503: aload_0
    //   504: getfield H : Z
    //   507: invokevirtual c : (Z)Le/e/l/o/d;
    //   510: pop
    //   511: aload #6
    //   513: aload_0
    //   514: getfield I : Lcom/facebook/react/bridge/ReadableMap;
    //   517: invokestatic a : (Le/e/l/o/d;Lcom/facebook/react/bridge/ReadableMap;)Lcom/facebook/react/modules/fresco/a;
    //   520: astore #6
    //   522: aload_0
    //   523: getfield E : Lcom/facebook/react/views/image/a;
    //   526: astore #7
    //   528: aload #7
    //   530: ifnull -> 547
    //   533: aload #7
    //   535: aload_0
    //   536: getfield k : Le/e/o/i0/b/a;
    //   539: invokevirtual c : ()Landroid/net/Uri;
    //   542: invokeinterface a : (Landroid/net/Uri;)V
    //   547: aload_0
    //   548: getfield y : Le/e/j/c/b;
    //   551: invokevirtual k : ()Le/e/j/c/b;
    //   554: pop
    //   555: aload_0
    //   556: getfield y : Le/e/j/c/b;
    //   559: astore #7
    //   561: aload #7
    //   563: iconst_1
    //   564: invokevirtual a : (Z)Le/e/j/c/b;
    //   567: pop
    //   568: aload #7
    //   570: aload_0
    //   571: getfield F : Ljava/lang/Object;
    //   574: invokevirtual a : (Ljava/lang/Object;)Le/e/j/c/b;
    //   577: pop
    //   578: aload #7
    //   580: aload_0
    //   581: invokevirtual getController : ()Le/e/j/h/a;
    //   584: invokevirtual a : (Le/e/j/h/a;)Le/e/j/c/b;
    //   587: pop
    //   588: aload #7
    //   590: aload #6
    //   592: invokevirtual b : (Ljava/lang/Object;)Le/e/j/c/b;
    //   595: pop
    //   596: aload_0
    //   597: getfield l : Le/e/o/i0/b/a;
    //   600: astore #6
    //   602: aload #6
    //   604: ifnull -> 667
    //   607: aload #6
    //   609: invokevirtual c : ()Landroid/net/Uri;
    //   612: invokestatic b : (Landroid/net/Uri;)Le/e/l/o/d;
    //   615: astore #6
    //   617: aload #6
    //   619: aload #5
    //   621: invokevirtual a : (Le/e/l/o/e;)Le/e/l/o/d;
    //   624: pop
    //   625: aload #6
    //   627: aload #4
    //   629: invokevirtual a : (Le/e/l/e/e;)Le/e/l/o/d;
    //   632: pop
    //   633: aload #6
    //   635: iconst_1
    //   636: invokevirtual a : (Z)Le/e/l/o/d;
    //   639: pop
    //   640: aload #6
    //   642: aload_0
    //   643: getfield H : Z
    //   646: invokevirtual c : (Z)Le/e/l/o/d;
    //   649: pop
    //   650: aload #6
    //   652: invokevirtual a : ()Le/e/l/o/c;
    //   655: astore #4
    //   657: aload_0
    //   658: getfield y : Le/e/j/c/b;
    //   661: aload #4
    //   663: invokevirtual c : (Ljava/lang/Object;)Le/e/j/c/b;
    //   666: pop
    //   667: aload_0
    //   668: getfield C : Le/e/j/c/d;
    //   671: ifnull -> 711
    //   674: aload_0
    //   675: getfield D : Le/e/j/c/d;
    //   678: ifnull -> 711
    //   681: new e/e/j/c/f
    //   684: dup
    //   685: invokespecial <init> : ()V
    //   688: astore #4
    //   690: aload #4
    //   692: aload_0
    //   693: getfield C : Le/e/j/c/d;
    //   696: invokevirtual a : (Le/e/j/c/d;)V
    //   699: aload #4
    //   701: aload_0
    //   702: getfield D : Le/e/j/c/d;
    //   705: invokevirtual a : (Le/e/j/c/d;)V
    //   708: goto -> 722
    //   711: aload_0
    //   712: getfield D : Le/e/j/c/d;
    //   715: astore #4
    //   717: aload #4
    //   719: ifnull -> 735
    //   722: aload_0
    //   723: getfield y : Le/e/j/c/b;
    //   726: aload #4
    //   728: invokevirtual a : (Le/e/j/c/d;)Le/e/j/c/b;
    //   731: pop
    //   732: goto -> 749
    //   735: aload_0
    //   736: getfield C : Le/e/j/c/d;
    //   739: astore #4
    //   741: aload #4
    //   743: ifnull -> 749
    //   746: goto -> 722
    //   749: aload_0
    //   750: aload_0
    //   751: getfield y : Le/e/j/c/b;
    //   754: invokevirtual a : ()Le/e/j/c/a;
    //   757: invokevirtual setController : (Le/e/j/h/a;)V
    //   760: aload_0
    //   761: iconst_0
    //   762: putfield x : Z
    //   765: aload_0
    //   766: getfield y : Le/e/j/c/b;
    //   769: invokevirtual k : ()Le/e/j/c/b;
    //   772: pop
    //   773: return
  }
  
  public boolean hasOverlappingRendering() {
    return false;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 > 0 && paramInt2 > 0) {
      boolean bool;
      if (this.x || j() || k()) {
        bool = true;
      } else {
        bool = false;
      } 
      this.x = bool;
      e();
    } 
  }
  
  public void setBackgroundColor(int paramInt) {
    if (this.p != paramInt) {
      this.p = paramInt;
      this.o = new m(paramInt);
      this.x = true;
    } 
  }
  
  public void setBlurRadius(float paramFloat) {
    int i = (int)q.b(paramFloat);
    if (i == 0) {
      this.B = null;
    } else {
      this.B = new e.e.l.m.a(i);
    } 
    this.x = true;
  }
  
  public void setBorderColor(int paramInt) {
    this.q = paramInt;
    this.x = true;
  }
  
  public void setBorderRadius(float paramFloat) {
    if (!d.a(this.t, paramFloat)) {
      this.t = paramFloat;
      this.x = true;
    } 
  }
  
  public void setBorderWidth(float paramFloat) {
    this.s = q.b(paramFloat);
    this.x = true;
  }
  
  public void setControllerListener(d paramd) {
    this.D = paramd;
    this.x = true;
    e();
  }
  
  public void setDefaultSource(String paramString) {
    this.m = e.e.o.i0.b.c.a().a(getContext(), paramString);
    this.x = true;
  }
  
  public void setFadeDuration(int paramInt) {
    this.G = paramInt;
  }
  
  public void setHeaders(ReadableMap paramReadableMap) {
    this.I = paramReadableMap;
  }
  
  public void setLoadingIndicatorSource(String paramString) {
    Drawable drawable = e.e.o.i0.b.c.a().a(getContext(), paramString);
    if (drawable != null) {
      e.e.j.e.b b1 = new e.e.j.e.b(drawable, 1000);
    } else {
      drawable = null;
    } 
    this.n = drawable;
    this.x = true;
  }
  
  public void setOverlayColor(int paramInt) {
    this.r = paramInt;
    this.x = true;
  }
  
  public void setProgressiveRenderingEnabled(boolean paramBoolean) {
    this.H = paramBoolean;
  }
  
  public void setResizeMethod(c paramc) {
    this.i = paramc;
    this.x = true;
  }
  
  public void setScaleType(r.b paramb) {
    this.v = paramb;
    this.x = true;
  }
  
  public void setShouldNotifyLoadEvents(boolean paramBoolean) {
    if (!paramBoolean) {
      this.C = null;
    } else {
      this.C = (d)new a(this, q0.b((ReactContext)getContext(), getId()));
    } 
    this.x = true;
  }
  
  public void setSource(ReadableArray paramReadableArray) {
    e.e.o.i0.b.a a1;
    this.j.clear();
    if (paramReadableArray == null || paramReadableArray.size() == 0) {
      a1 = new e.e.o.i0.b.a(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=");
      this.j.add(a1);
    } else {
      String str;
      int j = a1.size();
      int i = 0;
      if (j == 1) {
        str = a1.getMap(0).getString("uri");
        e.e.o.i0.b.a a2 = new e.e.o.i0.b.a(getContext(), str);
        this.j.add(a2);
        if (Uri.EMPTY.equals(a2.c()))
          a(str); 
      } else {
        while (i < str.size()) {
          ReadableMap readableMap = str.getMap(i);
          String str1 = readableMap.getString("uri");
          e.e.o.i0.b.a a2 = new e.e.o.i0.b.a(getContext(), str1, readableMap.getDouble("width"), readableMap.getDouble("height"));
          this.j.add(a2);
          if (Uri.EMPTY.equals(a2.c()))
            a(str1); 
          i++;
        } 
      } 
    } 
    this.x = true;
  }
  
  public void setTileMode(Shader.TileMode paramTileMode) {
    this.w = paramTileMode;
    this.x = true;
  }
  
  class a extends e.e.j.c.c<e> {
    a(g this$0, d param1d) {}
    
    public void a(String param1String, e param1e, Animatable param1Animatable) {
      if (param1e != null) {
        this.b.a(new b(this.c.getId(), 2, g.c(this.c).b(), param1e.b(), param1e.a()));
        this.b.a(new b(this.c.getId(), 3));
      } 
    }
    
    public void b(String param1String, Object param1Object) {
      this.b.a(new b(this.c.getId(), 4));
    }
    
    public void b(String param1String, Throwable param1Throwable) {
      this.b.a(new b(this.c.getId(), 1, true, param1Throwable.getMessage()));
    }
  }
  
  private class b extends e.e.l.o.a {
    private b(g this$0) {}
    
    public void a(Bitmap param1Bitmap1, Bitmap param1Bitmap2) {
      g.a(this.b, g.h());
      param1Bitmap1.setHasAlpha(true);
      if (d.a(g.h()[0], 0.0F) && d.a(g.h()[1], 0.0F) && d.a(g.h()[2], 0.0F) && d.a(g.h()[3], 0.0F)) {
        super.a(param1Bitmap1, param1Bitmap2);
        return;
      } 
      Paint paint = new Paint();
      paint.setAntiAlias(true);
      Shader.TileMode tileMode = Shader.TileMode.CLAMP;
      paint.setShader((Shader)new BitmapShader(param1Bitmap2, tileMode, tileMode));
      Canvas canvas = new Canvas(param1Bitmap1);
      float[] arrayOfFloat = new float[8];
      a(param1Bitmap2, g.h(), arrayOfFloat);
      Path path = new Path();
      path.addRoundRect(new RectF(0.0F, 0.0F, param1Bitmap2.getWidth(), param1Bitmap2.getHeight()), arrayOfFloat, Path.Direction.CW);
      canvas.drawPath(path, paint);
    }
    
    void a(Bitmap param1Bitmap, float[] param1ArrayOffloat1, float[] param1ArrayOffloat2) {
      g.a(this.b).a(g.f(), new Rect(0, 0, param1Bitmap.getWidth(), param1Bitmap.getHeight()), param1Bitmap.getWidth(), param1Bitmap.getHeight(), 0.0F, 0.0F);
      g.f().invert(g.g());
      param1ArrayOffloat2[0] = g.g().mapRadius(param1ArrayOffloat1[0]);
      param1ArrayOffloat2[1] = param1ArrayOffloat2[0];
      param1ArrayOffloat2[2] = g.g().mapRadius(param1ArrayOffloat1[1]);
      param1ArrayOffloat2[3] = param1ArrayOffloat2[2];
      param1ArrayOffloat2[4] = g.g().mapRadius(param1ArrayOffloat1[2]);
      param1ArrayOffloat2[5] = param1ArrayOffloat2[4];
      param1ArrayOffloat2[6] = g.g().mapRadius(param1ArrayOffloat1[3]);
      param1ArrayOffloat2[7] = param1ArrayOffloat2[6];
    }
  }
  
  private class c extends e.e.l.o.a {
    private c(g this$0) {}
    
    public e.e.e.h.a<Bitmap> a(Bitmap param1Bitmap, f param1f) {
      Rect rect = new Rect(0, 0, this.b.getWidth(), this.b.getHeight());
      g.a(this.b).a(g.i(), rect, param1Bitmap.getWidth(), param1Bitmap.getHeight(), 0.0F, 0.0F);
      Paint paint = new Paint();
      paint.setAntiAlias(true);
      BitmapShader bitmapShader = new BitmapShader(param1Bitmap, g.b(this.b), g.b(this.b));
      bitmapShader.setLocalMatrix(g.i());
      paint.setShader((Shader)bitmapShader);
      e.e.e.h.a a1 = param1f.a(this.b.getWidth(), this.b.getHeight());
      try {
        (new Canvas((Bitmap)a1.b())).drawRect(rect, paint);
        return a1.clone();
      } finally {
        e.e.e.h.a.b(a1);
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/image/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */