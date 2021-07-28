package e.e.j.e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import e.e.e.d.i;
import e.e.l.p.b;
import java.util.Arrays;

public abstract class o extends Drawable implements k, s {
  private float A = 0.0F;
  
  private boolean B = false;
  
  private boolean C = false;
  
  private boolean D = true;
  
  private t E;
  
  private final Drawable c;
  
  protected boolean d = false;
  
  protected boolean e = false;
  
  protected float f = 0.0F;
  
  protected final Path g = new Path();
  
  protected boolean h = true;
  
  protected int i = 0;
  
  protected final Path j = new Path();
  
  private final float[] k = new float[8];
  
  final float[] l = new float[8];
  
  float[] m;
  
  final RectF n = new RectF();
  
  final RectF o = new RectF();
  
  final RectF p = new RectF();
  
  final RectF q = new RectF();
  
  RectF r;
  
  final Matrix s = new Matrix();
  
  final Matrix t = new Matrix();
  
  final Matrix u = new Matrix();
  
  final Matrix v = new Matrix();
  
  final Matrix w = new Matrix();
  
  Matrix x;
  
  Matrix y;
  
  final Matrix z = new Matrix();
  
  o(Drawable paramDrawable) {
    this.c = paramDrawable;
  }
  
  public void a(float paramFloat) {
    if (this.A != paramFloat) {
      this.A = paramFloat;
      this.D = true;
      invalidateSelf();
    } 
  }
  
  public void a(int paramInt, float paramFloat) {
    if (this.i != paramInt || this.f != paramFloat) {
      this.i = paramInt;
      this.f = paramFloat;
      this.D = true;
      invalidateSelf();
    } 
  }
  
  public void a(t paramt) {
    this.E = paramt;
  }
  
  public void a(boolean paramBoolean) {
    this.d = paramBoolean;
    this.D = true;
    invalidateSelf();
  }
  
  public void a(float[] paramArrayOffloat) {
    if (paramArrayOffloat == null) {
      Arrays.fill(this.k, 0.0F);
      this.e = false;
    } else {
      boolean bool;
      if (paramArrayOffloat.length == 8) {
        bool = true;
      } else {
        bool = false;
      } 
      i.a(bool, "radii should have exactly 8 values");
      System.arraycopy(paramArrayOffloat, 0, this.k, 0, 8);
      this.e = false;
      for (int i = 0; i < 8; i++) {
        boolean bool1;
        bool = this.e;
        if (paramArrayOffloat[i] > 0.0F) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        this.e = bool | bool1;
      } 
    } 
    this.D = true;
    invalidateSelf();
  }
  
  public boolean a() {
    return this.C;
  }
  
  public void b(float paramFloat) {
    boolean bool2 = false;
    if (paramFloat >= 0.0F) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    i.b(bool1);
    Arrays.fill(this.k, paramFloat);
    boolean bool1 = bool2;
    if (paramFloat != 0.0F)
      bool1 = true; 
    this.e = bool1;
    this.D = true;
    invalidateSelf();
  }
  
  public void b(boolean paramBoolean) {
    if (this.C != paramBoolean) {
      this.C = paramBoolean;
      invalidateSelf();
    } 
  }
  
  boolean b() {
    return (this.d || this.e || this.f > 0.0F);
  }
  
  protected void c() {
    // Byte code:
    //   0: aload_0
    //   1: getfield D : Z
    //   4: ifeq -> 397
    //   7: aload_0
    //   8: getfield j : Landroid/graphics/Path;
    //   11: invokevirtual reset : ()V
    //   14: aload_0
    //   15: getfield n : Landroid/graphics/RectF;
    //   18: astore #4
    //   20: aload_0
    //   21: getfield f : F
    //   24: fstore_1
    //   25: aload #4
    //   27: fload_1
    //   28: fconst_2
    //   29: fdiv
    //   30: fload_1
    //   31: fconst_2
    //   32: fdiv
    //   33: invokevirtual inset : (FF)V
    //   36: aload_0
    //   37: getfield d : Z
    //   40: ifeq -> 91
    //   43: aload_0
    //   44: getfield n : Landroid/graphics/RectF;
    //   47: invokevirtual width : ()F
    //   50: aload_0
    //   51: getfield n : Landroid/graphics/RectF;
    //   54: invokevirtual height : ()F
    //   57: invokestatic min : (FF)F
    //   60: fconst_2
    //   61: fdiv
    //   62: fstore_1
    //   63: aload_0
    //   64: getfield j : Landroid/graphics/Path;
    //   67: aload_0
    //   68: getfield n : Landroid/graphics/RectF;
    //   71: invokevirtual centerX : ()F
    //   74: aload_0
    //   75: getfield n : Landroid/graphics/RectF;
    //   78: invokevirtual centerY : ()F
    //   81: fload_1
    //   82: getstatic android/graphics/Path$Direction.CW : Landroid/graphics/Path$Direction;
    //   85: invokevirtual addCircle : (FFFLandroid/graphics/Path$Direction;)V
    //   88: goto -> 151
    //   91: iconst_0
    //   92: istore_3
    //   93: aload_0
    //   94: getfield l : [F
    //   97: astore #4
    //   99: iload_3
    //   100: aload #4
    //   102: arraylength
    //   103: if_icmpge -> 135
    //   106: aload #4
    //   108: iload_3
    //   109: aload_0
    //   110: getfield k : [F
    //   113: iload_3
    //   114: faload
    //   115: aload_0
    //   116: getfield A : F
    //   119: fadd
    //   120: aload_0
    //   121: getfield f : F
    //   124: fconst_2
    //   125: fdiv
    //   126: fsub
    //   127: fastore
    //   128: iload_3
    //   129: iconst_1
    //   130: iadd
    //   131: istore_3
    //   132: goto -> 93
    //   135: aload_0
    //   136: getfield j : Landroid/graphics/Path;
    //   139: aload_0
    //   140: getfield n : Landroid/graphics/RectF;
    //   143: aload #4
    //   145: getstatic android/graphics/Path$Direction.CW : Landroid/graphics/Path$Direction;
    //   148: invokevirtual addRoundRect : (Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V
    //   151: aload_0
    //   152: getfield n : Landroid/graphics/RectF;
    //   155: astore #4
    //   157: aload_0
    //   158: getfield f : F
    //   161: fstore_1
    //   162: aload #4
    //   164: fload_1
    //   165: fneg
    //   166: fconst_2
    //   167: fdiv
    //   168: fload_1
    //   169: fneg
    //   170: fconst_2
    //   171: fdiv
    //   172: invokevirtual inset : (FF)V
    //   175: aload_0
    //   176: getfield g : Landroid/graphics/Path;
    //   179: invokevirtual reset : ()V
    //   182: aload_0
    //   183: getfield A : F
    //   186: fstore_2
    //   187: aload_0
    //   188: getfield B : Z
    //   191: ifeq -> 202
    //   194: aload_0
    //   195: getfield f : F
    //   198: fstore_1
    //   199: goto -> 204
    //   202: fconst_0
    //   203: fstore_1
    //   204: fload_2
    //   205: fload_1
    //   206: fadd
    //   207: fstore_1
    //   208: aload_0
    //   209: getfield n : Landroid/graphics/RectF;
    //   212: fload_1
    //   213: fload_1
    //   214: invokevirtual inset : (FF)V
    //   217: aload_0
    //   218: getfield d : Z
    //   221: ifeq -> 270
    //   224: aload_0
    //   225: getfield g : Landroid/graphics/Path;
    //   228: aload_0
    //   229: getfield n : Landroid/graphics/RectF;
    //   232: invokevirtual centerX : ()F
    //   235: aload_0
    //   236: getfield n : Landroid/graphics/RectF;
    //   239: invokevirtual centerY : ()F
    //   242: aload_0
    //   243: getfield n : Landroid/graphics/RectF;
    //   246: invokevirtual width : ()F
    //   249: aload_0
    //   250: getfield n : Landroid/graphics/RectF;
    //   253: invokevirtual height : ()F
    //   256: invokestatic min : (FF)F
    //   259: fconst_2
    //   260: fdiv
    //   261: getstatic android/graphics/Path$Direction.CW : Landroid/graphics/Path$Direction;
    //   264: invokevirtual addCircle : (FFFLandroid/graphics/Path$Direction;)V
    //   267: goto -> 366
    //   270: aload_0
    //   271: getfield B : Z
    //   274: ifeq -> 348
    //   277: aload_0
    //   278: getfield m : [F
    //   281: ifnonnull -> 292
    //   284: aload_0
    //   285: bipush #8
    //   287: newarray float
    //   289: putfield m : [F
    //   292: iconst_0
    //   293: istore_3
    //   294: iload_3
    //   295: aload_0
    //   296: getfield l : [F
    //   299: arraylength
    //   300: if_icmpge -> 327
    //   303: aload_0
    //   304: getfield m : [F
    //   307: iload_3
    //   308: aload_0
    //   309: getfield k : [F
    //   312: iload_3
    //   313: faload
    //   314: aload_0
    //   315: getfield f : F
    //   318: fsub
    //   319: fastore
    //   320: iload_3
    //   321: iconst_1
    //   322: iadd
    //   323: istore_3
    //   324: goto -> 294
    //   327: aload_0
    //   328: getfield g : Landroid/graphics/Path;
    //   331: aload_0
    //   332: getfield n : Landroid/graphics/RectF;
    //   335: aload_0
    //   336: getfield m : [F
    //   339: getstatic android/graphics/Path$Direction.CW : Landroid/graphics/Path$Direction;
    //   342: invokevirtual addRoundRect : (Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V
    //   345: goto -> 366
    //   348: aload_0
    //   349: getfield g : Landroid/graphics/Path;
    //   352: aload_0
    //   353: getfield n : Landroid/graphics/RectF;
    //   356: aload_0
    //   357: getfield k : [F
    //   360: getstatic android/graphics/Path$Direction.CW : Landroid/graphics/Path$Direction;
    //   363: invokevirtual addRoundRect : (Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V
    //   366: aload_0
    //   367: getfield n : Landroid/graphics/RectF;
    //   370: astore #4
    //   372: fload_1
    //   373: fneg
    //   374: fstore_1
    //   375: aload #4
    //   377: fload_1
    //   378: fload_1
    //   379: invokevirtual inset : (FF)V
    //   382: aload_0
    //   383: getfield g : Landroid/graphics/Path;
    //   386: getstatic android/graphics/Path$FillType.WINDING : Landroid/graphics/Path$FillType;
    //   389: invokevirtual setFillType : (Landroid/graphics/Path$FillType;)V
    //   392: aload_0
    //   393: iconst_0
    //   394: putfield D : Z
    //   397: return
  }
  
  public void c(boolean paramBoolean) {
    if (this.B != paramBoolean) {
      this.B = paramBoolean;
      this.D = true;
      invalidateSelf();
    } 
  }
  
  public void clearColorFilter() {
    this.c.clearColorFilter();
  }
  
  protected void d() {
    // Byte code:
    //   0: aload_0
    //   1: getfield E : Le/e/j/e/t;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 35
    //   9: aload_2
    //   10: aload_0
    //   11: getfield u : Landroid/graphics/Matrix;
    //   14: invokeinterface a : (Landroid/graphics/Matrix;)V
    //   19: aload_0
    //   20: getfield E : Le/e/j/e/t;
    //   23: aload_0
    //   24: getfield n : Landroid/graphics/RectF;
    //   27: invokeinterface a : (Landroid/graphics/RectF;)V
    //   32: goto -> 53
    //   35: aload_0
    //   36: getfield u : Landroid/graphics/Matrix;
    //   39: invokevirtual reset : ()V
    //   42: aload_0
    //   43: getfield n : Landroid/graphics/RectF;
    //   46: aload_0
    //   47: invokevirtual getBounds : ()Landroid/graphics/Rect;
    //   50: invokevirtual set : (Landroid/graphics/Rect;)V
    //   53: aload_0
    //   54: getfield p : Landroid/graphics/RectF;
    //   57: fconst_0
    //   58: fconst_0
    //   59: aload_0
    //   60: invokevirtual getIntrinsicWidth : ()I
    //   63: i2f
    //   64: aload_0
    //   65: invokevirtual getIntrinsicHeight : ()I
    //   68: i2f
    //   69: invokevirtual set : (FFFF)V
    //   72: aload_0
    //   73: getfield q : Landroid/graphics/RectF;
    //   76: aload_0
    //   77: getfield c : Landroid/graphics/drawable/Drawable;
    //   80: invokevirtual getBounds : ()Landroid/graphics/Rect;
    //   83: invokevirtual set : (Landroid/graphics/Rect;)V
    //   86: aload_0
    //   87: getfield s : Landroid/graphics/Matrix;
    //   90: aload_0
    //   91: getfield p : Landroid/graphics/RectF;
    //   94: aload_0
    //   95: getfield q : Landroid/graphics/RectF;
    //   98: getstatic android/graphics/Matrix$ScaleToFit.FILL : Landroid/graphics/Matrix$ScaleToFit;
    //   101: invokevirtual setRectToRect : (Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z
    //   104: pop
    //   105: aload_0
    //   106: getfield B : Z
    //   109: ifeq -> 203
    //   112: aload_0
    //   113: getfield r : Landroid/graphics/RectF;
    //   116: astore_2
    //   117: aload_2
    //   118: ifnonnull -> 139
    //   121: aload_0
    //   122: new android/graphics/RectF
    //   125: dup
    //   126: aload_0
    //   127: getfield n : Landroid/graphics/RectF;
    //   130: invokespecial <init> : (Landroid/graphics/RectF;)V
    //   133: putfield r : Landroid/graphics/RectF;
    //   136: goto -> 147
    //   139: aload_2
    //   140: aload_0
    //   141: getfield n : Landroid/graphics/RectF;
    //   144: invokevirtual set : (Landroid/graphics/RectF;)V
    //   147: aload_0
    //   148: getfield r : Landroid/graphics/RectF;
    //   151: astore_2
    //   152: aload_0
    //   153: getfield f : F
    //   156: fstore_1
    //   157: aload_2
    //   158: fload_1
    //   159: fload_1
    //   160: invokevirtual inset : (FF)V
    //   163: aload_0
    //   164: getfield x : Landroid/graphics/Matrix;
    //   167: ifnonnull -> 181
    //   170: aload_0
    //   171: new android/graphics/Matrix
    //   174: dup
    //   175: invokespecial <init> : ()V
    //   178: putfield x : Landroid/graphics/Matrix;
    //   181: aload_0
    //   182: getfield x : Landroid/graphics/Matrix;
    //   185: aload_0
    //   186: getfield n : Landroid/graphics/RectF;
    //   189: aload_0
    //   190: getfield r : Landroid/graphics/RectF;
    //   193: getstatic android/graphics/Matrix$ScaleToFit.FILL : Landroid/graphics/Matrix$ScaleToFit;
    //   196: invokevirtual setRectToRect : (Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z
    //   199: pop
    //   200: goto -> 216
    //   203: aload_0
    //   204: getfield x : Landroid/graphics/Matrix;
    //   207: astore_2
    //   208: aload_2
    //   209: ifnull -> 216
    //   212: aload_2
    //   213: invokevirtual reset : ()V
    //   216: aload_0
    //   217: getfield u : Landroid/graphics/Matrix;
    //   220: aload_0
    //   221: getfield v : Landroid/graphics/Matrix;
    //   224: invokevirtual equals : (Ljava/lang/Object;)Z
    //   227: ifeq -> 264
    //   230: aload_0
    //   231: getfield s : Landroid/graphics/Matrix;
    //   234: aload_0
    //   235: getfield t : Landroid/graphics/Matrix;
    //   238: invokevirtual equals : (Ljava/lang/Object;)Z
    //   241: ifeq -> 264
    //   244: aload_0
    //   245: getfield x : Landroid/graphics/Matrix;
    //   248: astore_2
    //   249: aload_2
    //   250: ifnull -> 403
    //   253: aload_2
    //   254: aload_0
    //   255: getfield y : Landroid/graphics/Matrix;
    //   258: invokevirtual equals : (Ljava/lang/Object;)Z
    //   261: ifne -> 403
    //   264: aload_0
    //   265: iconst_1
    //   266: putfield h : Z
    //   269: aload_0
    //   270: getfield u : Landroid/graphics/Matrix;
    //   273: aload_0
    //   274: getfield w : Landroid/graphics/Matrix;
    //   277: invokevirtual invert : (Landroid/graphics/Matrix;)Z
    //   280: pop
    //   281: aload_0
    //   282: getfield z : Landroid/graphics/Matrix;
    //   285: aload_0
    //   286: getfield u : Landroid/graphics/Matrix;
    //   289: invokevirtual set : (Landroid/graphics/Matrix;)V
    //   292: aload_0
    //   293: getfield B : Z
    //   296: ifeq -> 311
    //   299: aload_0
    //   300: getfield z : Landroid/graphics/Matrix;
    //   303: aload_0
    //   304: getfield x : Landroid/graphics/Matrix;
    //   307: invokevirtual postConcat : (Landroid/graphics/Matrix;)Z
    //   310: pop
    //   311: aload_0
    //   312: getfield z : Landroid/graphics/Matrix;
    //   315: aload_0
    //   316: getfield s : Landroid/graphics/Matrix;
    //   319: invokevirtual preConcat : (Landroid/graphics/Matrix;)Z
    //   322: pop
    //   323: aload_0
    //   324: getfield v : Landroid/graphics/Matrix;
    //   327: aload_0
    //   328: getfield u : Landroid/graphics/Matrix;
    //   331: invokevirtual set : (Landroid/graphics/Matrix;)V
    //   334: aload_0
    //   335: getfield t : Landroid/graphics/Matrix;
    //   338: aload_0
    //   339: getfield s : Landroid/graphics/Matrix;
    //   342: invokevirtual set : (Landroid/graphics/Matrix;)V
    //   345: aload_0
    //   346: getfield B : Z
    //   349: ifeq -> 390
    //   352: aload_0
    //   353: getfield y : Landroid/graphics/Matrix;
    //   356: astore_2
    //   357: aload_2
    //   358: ifnonnull -> 379
    //   361: aload_0
    //   362: new android/graphics/Matrix
    //   365: dup
    //   366: aload_0
    //   367: getfield x : Landroid/graphics/Matrix;
    //   370: invokespecial <init> : (Landroid/graphics/Matrix;)V
    //   373: putfield y : Landroid/graphics/Matrix;
    //   376: goto -> 403
    //   379: aload_2
    //   380: aload_0
    //   381: getfield x : Landroid/graphics/Matrix;
    //   384: invokevirtual set : (Landroid/graphics/Matrix;)V
    //   387: goto -> 403
    //   390: aload_0
    //   391: getfield y : Landroid/graphics/Matrix;
    //   394: astore_2
    //   395: aload_2
    //   396: ifnull -> 403
    //   399: aload_2
    //   400: invokevirtual reset : ()V
    //   403: aload_0
    //   404: getfield n : Landroid/graphics/RectF;
    //   407: aload_0
    //   408: getfield o : Landroid/graphics/RectF;
    //   411: invokevirtual equals : (Ljava/lang/Object;)Z
    //   414: ifne -> 433
    //   417: aload_0
    //   418: iconst_1
    //   419: putfield D : Z
    //   422: aload_0
    //   423: getfield o : Landroid/graphics/RectF;
    //   426: aload_0
    //   427: getfield n : Landroid/graphics/RectF;
    //   430: invokevirtual set : (Landroid/graphics/RectF;)V
    //   433: return
  }
  
  public void draw(Canvas paramCanvas) {
    if (b.c())
      b.a("RoundedDrawable#draw"); 
    this.c.draw(paramCanvas);
    if (b.c())
      b.a(); 
  }
  
  public int getAlpha() {
    return this.c.getAlpha();
  }
  
  public ColorFilter getColorFilter() {
    return this.c.getColorFilter();
  }
  
  public int getIntrinsicHeight() {
    return this.c.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth() {
    return this.c.getIntrinsicWidth();
  }
  
  public int getOpacity() {
    return this.c.getOpacity();
  }
  
  protected void onBoundsChange(Rect paramRect) {
    this.c.setBounds(paramRect);
  }
  
  public void setAlpha(int paramInt) {
    this.c.setAlpha(paramInt);
  }
  
  public void setColorFilter(int paramInt, PorterDuff.Mode paramMode) {
    this.c.setColorFilter(paramInt, paramMode);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.c.setColorFilter(paramColorFilter);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/e/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */