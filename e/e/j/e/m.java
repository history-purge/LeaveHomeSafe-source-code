package e.e.j.e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import e.e.e.d.i;
import java.util.Arrays;

public class m extends Drawable implements k {
  private final float[] c = new float[8];
  
  final float[] d = new float[8];
  
  float[] e;
  
  final Paint f = new Paint(1);
  
  private boolean g = false;
  
  private float h = 0.0F;
  
  private float i = 0.0F;
  
  private int j = 0;
  
  private boolean k = false;
  
  private boolean l = false;
  
  final Path m = new Path();
  
  final Path n = new Path();
  
  private int o = 0;
  
  private final RectF p = new RectF();
  
  private int q = 255;
  
  public m(int paramInt) {
    a(paramInt);
  }
  
  @TargetApi(11)
  public static m a(ColorDrawable paramColorDrawable) {
    return new m(paramColorDrawable.getColor());
  }
  
  private void b() {
    // Byte code:
    //   0: aload_0
    //   1: getfield m : Landroid/graphics/Path;
    //   4: invokevirtual reset : ()V
    //   7: aload_0
    //   8: getfield n : Landroid/graphics/Path;
    //   11: invokevirtual reset : ()V
    //   14: aload_0
    //   15: getfield p : Landroid/graphics/RectF;
    //   18: aload_0
    //   19: invokevirtual getBounds : ()Landroid/graphics/Rect;
    //   22: invokevirtual set : (Landroid/graphics/Rect;)V
    //   25: aload_0
    //   26: getfield p : Landroid/graphics/RectF;
    //   29: astore #6
    //   31: aload_0
    //   32: getfield h : F
    //   35: fstore_1
    //   36: aload #6
    //   38: fload_1
    //   39: fconst_2
    //   40: fdiv
    //   41: fload_1
    //   42: fconst_2
    //   43: fdiv
    //   44: invokevirtual inset : (FF)V
    //   47: aload_0
    //   48: getfield g : Z
    //   51: istore #5
    //   53: iconst_0
    //   54: istore #4
    //   56: iload #5
    //   58: ifeq -> 109
    //   61: aload_0
    //   62: getfield p : Landroid/graphics/RectF;
    //   65: invokevirtual width : ()F
    //   68: aload_0
    //   69: getfield p : Landroid/graphics/RectF;
    //   72: invokevirtual height : ()F
    //   75: invokestatic min : (FF)F
    //   78: fconst_2
    //   79: fdiv
    //   80: fstore_1
    //   81: aload_0
    //   82: getfield n : Landroid/graphics/Path;
    //   85: aload_0
    //   86: getfield p : Landroid/graphics/RectF;
    //   89: invokevirtual centerX : ()F
    //   92: aload_0
    //   93: getfield p : Landroid/graphics/RectF;
    //   96: invokevirtual centerY : ()F
    //   99: fload_1
    //   100: getstatic android/graphics/Path$Direction.CW : Landroid/graphics/Path$Direction;
    //   103: invokevirtual addCircle : (FFFLandroid/graphics/Path$Direction;)V
    //   106: goto -> 169
    //   109: iconst_0
    //   110: istore_3
    //   111: aload_0
    //   112: getfield d : [F
    //   115: astore #6
    //   117: iload_3
    //   118: aload #6
    //   120: arraylength
    //   121: if_icmpge -> 153
    //   124: aload #6
    //   126: iload_3
    //   127: aload_0
    //   128: getfield c : [F
    //   131: iload_3
    //   132: faload
    //   133: aload_0
    //   134: getfield i : F
    //   137: fadd
    //   138: aload_0
    //   139: getfield h : F
    //   142: fconst_2
    //   143: fdiv
    //   144: fsub
    //   145: fastore
    //   146: iload_3
    //   147: iconst_1
    //   148: iadd
    //   149: istore_3
    //   150: goto -> 111
    //   153: aload_0
    //   154: getfield n : Landroid/graphics/Path;
    //   157: aload_0
    //   158: getfield p : Landroid/graphics/RectF;
    //   161: aload #6
    //   163: getstatic android/graphics/Path$Direction.CW : Landroid/graphics/Path$Direction;
    //   166: invokevirtual addRoundRect : (Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V
    //   169: aload_0
    //   170: getfield p : Landroid/graphics/RectF;
    //   173: astore #6
    //   175: aload_0
    //   176: getfield h : F
    //   179: fstore_1
    //   180: aload #6
    //   182: fload_1
    //   183: fneg
    //   184: fconst_2
    //   185: fdiv
    //   186: fload_1
    //   187: fneg
    //   188: fconst_2
    //   189: fdiv
    //   190: invokevirtual inset : (FF)V
    //   193: aload_0
    //   194: getfield i : F
    //   197: fstore_2
    //   198: aload_0
    //   199: getfield k : Z
    //   202: ifeq -> 213
    //   205: aload_0
    //   206: getfield h : F
    //   209: fstore_1
    //   210: goto -> 215
    //   213: fconst_0
    //   214: fstore_1
    //   215: fload_2
    //   216: fload_1
    //   217: fadd
    //   218: fstore_1
    //   219: aload_0
    //   220: getfield p : Landroid/graphics/RectF;
    //   223: fload_1
    //   224: fload_1
    //   225: invokevirtual inset : (FF)V
    //   228: aload_0
    //   229: getfield g : Z
    //   232: ifeq -> 283
    //   235: aload_0
    //   236: getfield p : Landroid/graphics/RectF;
    //   239: invokevirtual width : ()F
    //   242: aload_0
    //   243: getfield p : Landroid/graphics/RectF;
    //   246: invokevirtual height : ()F
    //   249: invokestatic min : (FF)F
    //   252: fconst_2
    //   253: fdiv
    //   254: fstore_2
    //   255: aload_0
    //   256: getfield m : Landroid/graphics/Path;
    //   259: aload_0
    //   260: getfield p : Landroid/graphics/RectF;
    //   263: invokevirtual centerX : ()F
    //   266: aload_0
    //   267: getfield p : Landroid/graphics/RectF;
    //   270: invokevirtual centerY : ()F
    //   273: fload_2
    //   274: getstatic android/graphics/Path$Direction.CW : Landroid/graphics/Path$Direction;
    //   277: invokevirtual addCircle : (FFFLandroid/graphics/Path$Direction;)V
    //   280: goto -> 383
    //   283: aload_0
    //   284: getfield k : Z
    //   287: ifeq -> 365
    //   290: iload #4
    //   292: istore_3
    //   293: aload_0
    //   294: getfield e : [F
    //   297: ifnonnull -> 311
    //   300: aload_0
    //   301: bipush #8
    //   303: newarray float
    //   305: putfield e : [F
    //   308: iload #4
    //   310: istore_3
    //   311: aload_0
    //   312: getfield e : [F
    //   315: astore #6
    //   317: iload_3
    //   318: aload #6
    //   320: arraylength
    //   321: if_icmpge -> 346
    //   324: aload #6
    //   326: iload_3
    //   327: aload_0
    //   328: getfield c : [F
    //   331: iload_3
    //   332: faload
    //   333: aload_0
    //   334: getfield h : F
    //   337: fsub
    //   338: fastore
    //   339: iload_3
    //   340: iconst_1
    //   341: iadd
    //   342: istore_3
    //   343: goto -> 311
    //   346: aload_0
    //   347: getfield m : Landroid/graphics/Path;
    //   350: aload_0
    //   351: getfield p : Landroid/graphics/RectF;
    //   354: aload #6
    //   356: getstatic android/graphics/Path$Direction.CW : Landroid/graphics/Path$Direction;
    //   359: invokevirtual addRoundRect : (Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V
    //   362: goto -> 383
    //   365: aload_0
    //   366: getfield m : Landroid/graphics/Path;
    //   369: aload_0
    //   370: getfield p : Landroid/graphics/RectF;
    //   373: aload_0
    //   374: getfield c : [F
    //   377: getstatic android/graphics/Path$Direction.CW : Landroid/graphics/Path$Direction;
    //   380: invokevirtual addRoundRect : (Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V
    //   383: aload_0
    //   384: getfield p : Landroid/graphics/RectF;
    //   387: astore #6
    //   389: fload_1
    //   390: fneg
    //   391: fstore_1
    //   392: aload #6
    //   394: fload_1
    //   395: fload_1
    //   396: invokevirtual inset : (FF)V
    //   399: return
  }
  
  public void a(float paramFloat) {
    if (this.i != paramFloat) {
      this.i = paramFloat;
      b();
      invalidateSelf();
    } 
  }
  
  public void a(int paramInt) {
    if (this.o != paramInt) {
      this.o = paramInt;
      invalidateSelf();
    } 
  }
  
  public void a(int paramInt, float paramFloat) {
    if (this.j != paramInt) {
      this.j = paramInt;
      invalidateSelf();
    } 
    if (this.h != paramFloat) {
      this.h = paramFloat;
      b();
      invalidateSelf();
    } 
  }
  
  public void a(boolean paramBoolean) {
    this.g = paramBoolean;
    b();
    invalidateSelf();
  }
  
  public void a(float[] paramArrayOffloat) {
    if (paramArrayOffloat == null) {
      Arrays.fill(this.c, 0.0F);
    } else {
      boolean bool;
      if (paramArrayOffloat.length == 8) {
        bool = true;
      } else {
        bool = false;
      } 
      i.a(bool, "radii should have exactly 8 values");
      System.arraycopy(paramArrayOffloat, 0, this.c, 0, 8);
    } 
    b();
    invalidateSelf();
  }
  
  public boolean a() {
    return this.l;
  }
  
  public void b(float paramFloat) {
    boolean bool;
    if (paramFloat >= 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    i.a(bool, "radius should be non negative");
    Arrays.fill(this.c, paramFloat);
    b();
    invalidateSelf();
  }
  
  public void b(boolean paramBoolean) {
    if (this.l != paramBoolean) {
      this.l = paramBoolean;
      invalidateSelf();
    } 
  }
  
  public void c(boolean paramBoolean) {
    if (this.k != paramBoolean) {
      this.k = paramBoolean;
      b();
      invalidateSelf();
    } 
  }
  
  public void draw(Canvas paramCanvas) {
    this.f.setColor(f.a(this.o, this.q));
    this.f.setStyle(Paint.Style.FILL);
    this.f.setFilterBitmap(a());
    paramCanvas.drawPath(this.m, this.f);
    if (this.h != 0.0F) {
      this.f.setColor(f.a(this.j, this.q));
      this.f.setStyle(Paint.Style.STROKE);
      this.f.setStrokeWidth(this.h);
      paramCanvas.drawPath(this.n, this.f);
    } 
  }
  
  public int getAlpha() {
    return this.q;
  }
  
  public int getOpacity() {
    return f.a(f.a(this.o, this.q));
  }
  
  protected void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    b();
  }
  
  public void setAlpha(int paramInt) {
    if (paramInt != this.q) {
      this.q = paramInt;
      invalidateSelf();
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/e/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */