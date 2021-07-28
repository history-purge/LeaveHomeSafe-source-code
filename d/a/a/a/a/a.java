package d.a.a.a.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a extends View {
  private int A = 0;
  
  private int A0;
  
  private int B = 0;
  
  private float B0;
  
  private int C = 0;
  
  private float C0;
  
  private int D = 0;
  
  private float D0;
  
  private int E = 150;
  
  private int E0 = 0;
  
  private int F = 8;
  
  private int F0 = 0;
  
  private String G;
  
  private int G0 = 0;
  
  private String H;
  
  private int H0 = 0;
  
  private String I;
  
  private int I0 = 0;
  
  private String J;
  
  private float K = 1.0F;
  
  private float L = 0.0F;
  
  private float M = 0.0F;
  
  private float N = 0.0F;
  
  private boolean O = true;
  
  private boolean P = true;
  
  private boolean Q = false;
  
  private boolean R = false;
  
  private boolean S = true;
  
  private boolean T = false;
  
  private boolean U = false;
  
  private boolean V = true;
  
  private Scroller W;
  
  private VelocityTracker a0;
  
  private Paint b0 = new Paint();
  
  private int c = -13421773;
  
  private TextPaint c0 = new TextPaint();
  
  private int d = -695533;
  
  private Paint d0 = new Paint();
  
  private int e = -695533;
  
  private String[] e0;
  
  private int f = 0;
  
  private CharSequence[] f0;
  
  private int g = 0;
  
  private CharSequence[] g0;
  
  private int h = 0;
  
  private HandlerThread h0;
  
  private int i = 0;
  
  private Handler i0;
  
  private int j = 0;
  
  private Handler j0;
  
  private int k = 0;
  
  private Map<String, Integer> k0 = new ConcurrentHashMap<String, Integer>();
  
  private int l = 0;
  
  private f l0;
  
  private int m = 0;
  
  private d m0;
  
  private int n = 0;
  
  private c n0;
  
  private int o = -695533;
  
  private e o0;
  
  private int p = 2;
  
  private int p0 = 0;
  
  private int q = 0;
  
  private int q0;
  
  private int r = 0;
  
  private int r0;
  
  private int s = 3;
  
  private int s0;
  
  private int t = 0;
  
  private int t0;
  
  private int u = 0;
  
  private float u0 = 0.0F;
  
  private int v = -1;
  
  private float v0 = 0.0F;
  
  private int w = -1;
  
  private float w0 = 0.0F;
  
  private int x = 0;
  
  private boolean x0 = false;
  
  private int y = 0;
  
  private int y0;
  
  private int z = 0;
  
  private int z0;
  
  public a(Context paramContext) {
    super(paramContext);
    a(paramContext);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  private float a(float paramFloat1, float paramFloat2, float paramFloat3) {
    return paramFloat2 + (paramFloat3 - paramFloat2) * paramFloat1;
  }
  
  private float a(Paint.FontMetrics paramFontMetrics) {
    return (paramFontMetrics == null) ? 0.0F : (Math.abs(paramFontMetrics.top + paramFontMetrics.bottom) / 2.0F);
  }
  
  private int a(float paramFloat, int paramInt1, int paramInt2) {
    int k = (paramInt1 & 0xFF000000) >>> 24;
    int j = (paramInt1 & 0xFF0000) >>> 16;
    int i = (paramInt1 & 0xFF00) >>> 8;
    paramInt1 = (paramInt1 & 0xFF) >>> 0;
    k = (int)(k + (((0xFF000000 & paramInt2) >>> 24) - k) * paramFloat);
    j = (int)(j + (((0xFF0000 & paramInt2) >>> 16) - j) * paramFloat);
    i = (int)(i + (((0xFF00 & paramInt2) >>> 8) - i) * paramFloat);
    return (int)(paramInt1 + (((paramInt2 & 0xFF) >>> 0) - paramInt1) * paramFloat) | k << 24 | j << 16 | i << 8;
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (paramBoolean) {
      if (paramInt1 > paramInt3)
        return (paramInt1 - paramInt3) % getOneRecycleSize() + paramInt2 - 1; 
      int i = paramInt1;
      if (paramInt1 < paramInt2)
        i = (paramInt1 - paramInt2) % getOneRecycleSize() + paramInt3 + 1; 
      return i;
    } 
    if (paramInt1 > paramInt3)
      return paramInt3; 
    paramInt3 = paramInt1;
    if (paramInt1 < paramInt2)
      paramInt3 = paramInt2; 
    return paramInt3;
  }
  
  private int a(Context paramContext, float paramFloat) {
    return (int)(paramFloat * (paramContext.getResources().getDisplayMetrics()).density + 0.5F);
  }
  
  private int a(CharSequence paramCharSequence, Paint paramPaint) {
    if (TextUtils.isEmpty(paramCharSequence))
      return 0; 
    paramCharSequence = paramCharSequence.toString();
    if (this.k0.containsKey(paramCharSequence)) {
      Integer integer = this.k0.get(paramCharSequence);
      if (integer != null)
        return integer.intValue(); 
    } 
    int i = (int)(paramPaint.measureText((String)paramCharSequence) + 0.5F);
    this.k0.put(paramCharSequence, Integer.valueOf(i));
    return i;
  }
  
  private int a(CharSequence[] paramArrayOfCharSequence, Paint paramPaint) {
    int i = 0;
    if (paramArrayOfCharSequence == null)
      return 0; 
    int k = paramArrayOfCharSequence.length;
    int j;
    for (j = 0; i < k; j = m) {
      CharSequence charSequence = paramArrayOfCharSequence[i];
      int m = j;
      if (charSequence != null)
        m = Math.max(a(charSequence, paramPaint), j); 
      i++;
    } 
    return j;
  }
  
  private Message a(int paramInt1, int paramInt2, int paramInt3, Object paramObject) {
    Message message = Message.obtain();
    message.what = paramInt1;
    message.arg1 = paramInt2;
    message.arg2 = paramInt3;
    message.obj = paramObject;
    return message;
  }
  
  private void a(int paramInt1, int paramInt2, Object paramObject) {
    h(0);
    if (paramInt1 != paramInt2) {
      if (paramObject == null || !(paramObject instanceof Boolean) || ((Boolean)paramObject).booleanValue()) {
        paramObject = this.m0;
        if (paramObject != null) {
          int i = this.x;
          paramObject.a(this, paramInt1 + i, i + paramInt2);
        } 
        paramObject = this.l0;
        if (paramObject != null)
          paramObject.a(this, paramInt1, paramInt2, this.e0); 
      } 
      this.D = paramInt2;
    } 
    if (this.T) {
      this.T = false;
      h();
    } 
  }
  
  private void a(Context paramContext) {
    this.W = new Scroller(paramContext);
    this.E = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
    this.F = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    if (this.f == 0)
      this.f = b(paramContext, 14.0F); 
    if (this.g == 0)
      this.g = b(paramContext, 16.0F); 
    if (this.h == 0)
      this.h = b(paramContext, 14.0F); 
    if (this.k == 0)
      this.k = a(paramContext, 8.0F); 
    if (this.l == 0)
      this.l = a(paramContext, 8.0F); 
    this.b0.setColor(this.o);
    this.b0.setAntiAlias(true);
    this.b0.setStyle(Paint.Style.STROKE);
    this.b0.setStrokeWidth(this.p);
    this.c0.setColor(this.c);
    this.c0.setAntiAlias(true);
    this.c0.setTextAlign(Paint.Align.RIGHT);
    this.d0.setColor(this.e);
    this.d0.setAntiAlias(true);
    this.d0.setTextAlign(Paint.Align.CENTER);
    this.d0.setTextSize(this.h);
    int i = this.s;
    if (i % 2 == 0)
      this.s = i + 1; 
    if (this.v == -1 || this.w == -1)
      p(); 
    f();
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet) {
    if (paramAttributeSet == null)
      return; 
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, b.NumberPickerView);
    int j = typedArray.getIndexCount();
    for (int i = 0; i < j; i++) {
      int k = typedArray.getIndex(i);
      if (k == b.NumberPickerView_npv_ShownCount) {
        this.s = typedArray.getInt(k, 3);
      } else if (k == b.NumberPickerView_npv_DividerColor) {
        this.o = typedArray.getColor(k, -695533);
      } else if (k == b.NumberPickerView_npv_DividerHeight) {
        this.p = typedArray.getDimensionPixelSize(k, 2);
      } else if (k == b.NumberPickerView_npv_DividerMarginLeft) {
        this.q = typedArray.getDimensionPixelSize(k, 0);
      } else if (k == b.NumberPickerView_npv_DividerMarginRight) {
        this.r = typedArray.getDimensionPixelSize(k, 0);
      } else if (k == b.NumberPickerView_npv_TextArray) {
        this.e0 = a(typedArray.getTextArray(k));
      } else if (k == b.NumberPickerView_npv_TextColorNormal) {
        this.c = typedArray.getColor(k, -13421773);
      } else if (k == b.NumberPickerView_npv_TextColorSelected) {
        this.d = typedArray.getColor(k, -695533);
      } else if (k == b.NumberPickerView_npv_TextColorHint) {
        this.e = typedArray.getColor(k, -695533);
      } else if (k == b.NumberPickerView_npv_TextSizeNormal) {
        this.f = typedArray.getDimensionPixelSize(k, b(paramContext, 14.0F));
      } else if (k == b.NumberPickerView_npv_TextSizeSelected) {
        this.g = typedArray.getDimensionPixelSize(k, b(paramContext, 16.0F));
      } else if (k == b.NumberPickerView_npv_TextSizeHint) {
        this.h = typedArray.getDimensionPixelSize(k, b(paramContext, 14.0F));
      } else if (k == b.NumberPickerView_npv_MinValue) {
        this.v = typedArray.getInteger(k, 0);
      } else if (k == b.NumberPickerView_npv_MaxValue) {
        this.w = typedArray.getInteger(k, 0);
      } else if (k == b.NumberPickerView_npv_WrapSelectorWheel) {
        this.P = typedArray.getBoolean(k, true);
      } else if (k == b.NumberPickerView_npv_ShowDivider) {
        this.O = typedArray.getBoolean(k, true);
      } else if (k == b.NumberPickerView_npv_HintText) {
        this.G = typedArray.getString(k);
      } else if (k == b.NumberPickerView_npv_AlternativeHint) {
        this.J = typedArray.getString(k);
      } else if (k == b.NumberPickerView_npv_EmptyItemHint) {
        this.I = typedArray.getString(k);
      } else if (k == b.NumberPickerView_npv_MarginStartOfHint) {
        this.k = typedArray.getDimensionPixelSize(k, a(paramContext, 8.0F));
      } else if (k == b.NumberPickerView_npv_MarginEndOfHint) {
        this.l = typedArray.getDimensionPixelSize(k, a(paramContext, 8.0F));
      } else if (k == b.NumberPickerView_npv_ItemPaddingVertical) {
        this.m = typedArray.getDimensionPixelSize(k, a(paramContext, 2.0F));
      } else if (k == b.NumberPickerView_npv_ItemPaddingHorizontal) {
        this.n = typedArray.getDimensionPixelSize(k, a(paramContext, 5.0F));
      } else if (k == b.NumberPickerView_npv_AlternativeTextArrayWithMeasureHint) {
        this.f0 = typedArray.getTextArray(k);
      } else if (k == b.NumberPickerView_npv_AlternativeTextArrayWithoutMeasureHint) {
        this.g0 = typedArray.getTextArray(k);
      } else if (k == b.NumberPickerView_npv_RespondChangeOnDetached) {
        this.U = typedArray.getBoolean(k, false);
      } else if (k == b.NumberPickerView_npv_RespondChangeInMainThread) {
        this.V = typedArray.getBoolean(k, true);
      } else if (k == b.NumberPickerView_npv_TextEllipsize) {
        this.H = typedArray.getString(k);
      } 
    } 
    typedArray.recycle();
  }
  
  private void a(Canvas paramCanvas) {
    int i = 0;
    float f1 = 0.0F;
    while (i < this.s + 1) {
      float f2;
      float f3;
      boolean bool;
      CharSequence charSequence;
      float f4 = (this.F0 + this.A0 * i);
      int j = this.E0;
      int k = getOneRecycleSize();
      if (this.P && this.S) {
        bool = true;
      } else {
        bool = false;
      } 
      k = c(j + i, k, bool);
      j = this.s;
      if (i == j / 2) {
        j = this.A0;
        f1 = (this.F0 + j) / j;
        j = a(f1, this.c, this.d);
        f3 = a(f1, this.f, this.g);
        f2 = a(f1, this.L, this.M);
      } else if (i == j / 2 + 1) {
        f2 = 1.0F - f1;
        j = a(f2, this.c, this.d);
        f3 = a(f2, this.f, this.g);
        f2 = a(f2, this.L, this.M);
      } else {
        j = this.c;
        f3 = this.f;
        f2 = this.L;
      } 
      this.c0.setColor(j);
      this.c0.setTextSize(f3);
      if (k >= 0 && k < getOneRecycleSize()) {
        String str = this.e0[k + this.v];
        charSequence = str;
        if (this.H != null)
          charSequence = TextUtils.ellipsize(str, this.c0, (getWidth() - this.n * 2), getEllipsizeType()); 
        if (this.c0.getTextAlign() == Paint.Align.RIGHT) {
          j = this.y0 - this.n * 2;
        } else {
          j = this.n * 2;
        } 
        f3 = j;
        charSequence = charSequence.toString();
      } else if (!TextUtils.isEmpty(this.I)) {
        charSequence = this.I;
        f3 = this.D0;
      } else {
        continue;
      } 
      paramCanvas.drawText((String)charSequence, f3, f4 + (this.A0 / 2) + f2, (Paint)this.c0);
      continue;
      i++;
    } 
  }
  
  private void a(MotionEvent paramMotionEvent) {
    float f1 = paramMotionEvent.getY();
    for (int i = 0; i < this.s; i++) {
      int j = this.A0;
      if ((j * i) <= f1 && f1 < (j * (i + 1))) {
        b(i);
        return;
      } 
    } 
  }
  
  private void a(boolean paramBoolean) {
    n();
    m();
    if (paramBoolean && (this.H0 == Integer.MIN_VALUE || this.I0 == Integer.MIN_VALUE))
      this.j0.sendEmptyMessage(3); 
  }
  
  private void a(String[] paramArrayOfString) {
    this.e0 = paramArrayOfString;
    q();
  }
  
  private boolean a(String paramString1, String paramString2) {
    return (paramString1 == null) ? ((paramString2 == null)) : paramString1.equals(paramString2);
  }
  
  private String[] a(CharSequence[] paramArrayOfCharSequence) {
    if (paramArrayOfCharSequence == null)
      return null; 
    String[] arrayOfString = new String[paramArrayOfCharSequence.length];
    for (int i = 0; i < paramArrayOfCharSequence.length; i++)
      arrayOfString[i] = paramArrayOfCharSequence[i].toString(); 
    return arrayOfString;
  }
  
  private int b(Context paramContext, float paramFloat) {
    return (int)(paramFloat * (paramContext.getResources().getDisplayMetrics()).scaledDensity + 0.5F);
  }
  
  private void b(int paramInt) {
    if (paramInt >= 0) {
      int i = this.s;
      if (paramInt < i)
        i(paramInt - i / 2); 
    } 
  }
  
  private void b(int paramInt1, int paramInt2) {
    this.o0.a(this, paramInt1, paramInt2);
  }
  
  private void b(int paramInt, boolean paramBoolean) {
    this.E0 = paramInt - (this.s - 1) / 2;
    this.E0 = c(this.E0, getOneRecycleSize(), paramBoolean);
    paramInt = this.A0;
    if (paramInt == 0) {
      this.Q = true;
      return;
    } 
    int i = this.E0;
    this.G0 = paramInt * i;
    this.q0 = i + this.s / 2;
    this.q0 %= getOneRecycleSize();
    paramInt = this.q0;
    if (paramInt < 0)
      this.q0 = paramInt + getOneRecycleSize(); 
    this.r0 = this.q0;
    d();
  }
  
  private void b(Canvas paramCanvas) {
    if (TextUtils.isEmpty(this.G))
      return; 
    paramCanvas.drawText(this.G, this.D0 + ((this.z + this.i) / 2) + this.k, (this.B0 + this.C0) / 2.0F + this.N, this.d0);
  }
  
  private int c(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramInt2 <= 0)
      return 0; 
    int i = paramInt1;
    if (paramBoolean) {
      paramInt1 %= paramInt2;
      i = paramInt1;
      if (paramInt1 < 0)
        i = paramInt1 + paramInt2; 
    } 
    return i;
  }
  
  private Message c(int paramInt) {
    return a(paramInt, 0, 0, (Object)null);
  }
  
  private void c(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial g : ()V
    //   4: aload_0
    //   5: getfield P : Z
    //   8: ifeq -> 20
    //   11: iload_1
    //   12: istore_3
    //   13: aload_0
    //   14: getfield S : Z
    //   17: ifne -> 74
    //   20: aload_0
    //   21: invokevirtual getPickedIndexRelativeToRaw : ()I
    //   24: istore #5
    //   26: iload #5
    //   28: iload_1
    //   29: iadd
    //   30: istore #6
    //   32: aload_0
    //   33: getfield w : I
    //   36: istore_3
    //   37: iload #6
    //   39: iload_3
    //   40: if_icmple -> 53
    //   43: iload_3
    //   44: istore_1
    //   45: iload_1
    //   46: iload #5
    //   48: isub
    //   49: istore_3
    //   50: goto -> 74
    //   53: aload_0
    //   54: getfield v : I
    //   57: istore #4
    //   59: iload_1
    //   60: istore_3
    //   61: iload #6
    //   63: iload #4
    //   65: if_icmpge -> 74
    //   68: iload #4
    //   70: istore_1
    //   71: goto -> 45
    //   74: aload_0
    //   75: getfield F0 : I
    //   78: istore #4
    //   80: aload_0
    //   81: getfield A0 : I
    //   84: istore #5
    //   86: iload #4
    //   88: iload #5
    //   90: ineg
    //   91: iconst_2
    //   92: idiv
    //   93: if_icmpge -> 146
    //   96: iload #4
    //   98: iload #5
    //   100: iadd
    //   101: i2f
    //   102: ldc_w 300.0
    //   105: fmul
    //   106: iload #5
    //   108: i2f
    //   109: fdiv
    //   110: f2i
    //   111: istore_1
    //   112: iload_3
    //   113: ifge -> 128
    //   116: iload_1
    //   117: ineg
    //   118: iload_3
    //   119: sipush #300
    //   122: imul
    //   123: isub
    //   124: istore_1
    //   125: goto -> 136
    //   128: iload_1
    //   129: iload_3
    //   130: sipush #300
    //   133: imul
    //   134: iadd
    //   135: istore_1
    //   136: iload #5
    //   138: iload #4
    //   140: iadd
    //   141: istore #4
    //   143: goto -> 184
    //   146: iload #4
    //   148: ineg
    //   149: i2f
    //   150: ldc_w 300.0
    //   153: fmul
    //   154: iload #5
    //   156: i2f
    //   157: fdiv
    //   158: f2i
    //   159: istore_1
    //   160: iload_3
    //   161: sipush #300
    //   164: imul
    //   165: istore #5
    //   167: iload_3
    //   168: ifge -> 179
    //   171: iload_1
    //   172: iload #5
    //   174: isub
    //   175: istore_1
    //   176: goto -> 184
    //   179: iload_1
    //   180: iload #5
    //   182: iadd
    //   183: istore_1
    //   184: aload_0
    //   185: getfield A0 : I
    //   188: istore #6
    //   190: sipush #300
    //   193: istore #5
    //   195: iload_1
    //   196: sipush #300
    //   199: if_icmpge -> 208
    //   202: iload #5
    //   204: istore_1
    //   205: goto -> 208
    //   208: iload_1
    //   209: istore #5
    //   211: iload_1
    //   212: sipush #600
    //   215: if_icmple -> 223
    //   218: sipush #600
    //   221: istore #5
    //   223: aload_0
    //   224: getfield W : Landroid/widget/Scroller;
    //   227: iconst_0
    //   228: aload_0
    //   229: getfield G0 : I
    //   232: iconst_0
    //   233: iload #4
    //   235: iload_3
    //   236: iload #6
    //   238: imul
    //   239: iadd
    //   240: iload #5
    //   242: invokevirtual startScroll : (IIIII)V
    //   245: iload_2
    //   246: ifeq -> 270
    //   249: aload_0
    //   250: getfield i0 : Landroid/os/Handler;
    //   253: aload_0
    //   254: iconst_1
    //   255: invokespecial c : (I)Landroid/os/Message;
    //   258: iload #5
    //   260: iconst_4
    //   261: idiv
    //   262: i2l
    //   263: invokevirtual sendMessageDelayed : (Landroid/os/Message;J)Z
    //   266: pop
    //   267: goto -> 298
    //   270: aload_0
    //   271: getfield i0 : Landroid/os/Handler;
    //   274: aload_0
    //   275: iconst_1
    //   276: iconst_0
    //   277: iconst_0
    //   278: new java/lang/Boolean
    //   281: dup
    //   282: iload_2
    //   283: invokespecial <init> : (Z)V
    //   286: invokespecial a : (IIILjava/lang/Object;)Landroid/os/Message;
    //   289: iload #5
    //   291: iconst_4
    //   292: idiv
    //   293: i2l
    //   294: invokevirtual sendMessageDelayed : (Landroid/os/Message;J)Z
    //   297: pop
    //   298: aload_0
    //   299: invokevirtual postInvalidate : ()V
    //   302: return
  }
  
  private void c(Canvas paramCanvas) {
    if (this.O) {
      paramCanvas.drawLine((getPaddingLeft() + this.q), this.B0, (this.y0 - getPaddingRight() - this.r), this.B0, this.b0);
      paramCanvas.drawLine((getPaddingLeft() + this.q), this.C0, (this.y0 - getPaddingRight() - this.r), this.C0, this.b0);
    } 
  }
  
  private int d(int paramInt) {
    int i = this.A0;
    boolean bool2 = false;
    if (i == 0)
      return 0; 
    paramInt /= i;
    i = this.s / 2;
    int j = getOneRecycleSize();
    boolean bool1 = bool2;
    if (this.P) {
      bool1 = bool2;
      if (this.S)
        bool1 = true; 
    } 
    paramInt = c(paramInt + i, j, bool1);
    return (paramInt >= 0 && paramInt < getOneRecycleSize()) ? (paramInt + this.v) : (getOneRecycleSize() - 1);
  }
  
  private void d() {
    this.E0 = (int)Math.floor((this.G0 / this.A0));
    int i = this.G0;
    int j = this.E0;
    int k = this.A0;
    this.F0 = -(i - j * k);
    if (this.o0 != null) {
      i = j;
      if (-this.F0 > k / 2)
        i = j + 1; 
      this.r0 = i + this.s / 2;
      this.r0 %= getOneRecycleSize();
      i = this.r0;
      if (i < 0)
        this.r0 = i + getOneRecycleSize(); 
      i = this.q0;
      j = this.r0;
      if (i != j) {
        k = this.x;
        b(i + k, j + k);
      } 
      this.q0 = this.r0;
    } 
  }
  
  private int e(int paramInt) {
    if (this.P && this.S)
      return paramInt; 
    int i = this.t0;
    if (paramInt < i)
      return i; 
    i = this.s0;
    return (paramInt > i) ? i : paramInt;
  }
  
  private void e() {
    if (this.e0 == null) {
      this.e0 = new String[1];
      this.e0[0] = "";
    } 
  }
  
  private int f(int paramInt) {
    int i = View.MeasureSpec.getMode(paramInt);
    this.I0 = i;
    paramInt = View.MeasureSpec.getSize(paramInt);
    if (i == 1073741824)
      return paramInt; 
    int j = this.s * (this.A + this.m * 2) + getPaddingTop() + getPaddingBottom();
    return (i == Integer.MIN_VALUE) ? Math.min(j, paramInt) : j;
  }
  
  private void f() {
    this.h0 = new HandlerThread("HandlerThread-For-Refreshing");
    this.h0.start();
    this.i0 = new a(this, this.h0.getLooper());
    this.j0 = new b(this);
  }
  
  private int g(int paramInt) {
    int j = View.MeasureSpec.getMode(paramInt);
    this.H0 = j;
    int k = View.MeasureSpec.getSize(paramInt);
    if (j == 1073741824)
      return k; 
    paramInt = Math.max(this.i, this.j);
    int i = 0;
    if (paramInt == 0) {
      paramInt = 0;
    } else {
      paramInt = this.l;
    } 
    if (Math.max(this.i, this.j) != 0)
      i = this.k; 
    paramInt = Math.max(this.B, Math.max(this.z, this.C) + (i + Math.max(this.i, this.j) + paramInt + this.n * 2) * 2) + getPaddingLeft() + getPaddingRight();
    return (j == Integer.MIN_VALUE) ? Math.min(paramInt, k) : paramInt;
  }
  
  private void g() {
    if (!this.h0.isAlive())
      f(); 
  }
  
  private TextUtils.TruncateAt getEllipsizeType() {
    // Byte code:
    //   0: aload_0
    //   1: getfield H : Ljava/lang/String;
    //   4: astore_2
    //   5: aload_2
    //   6: invokevirtual hashCode : ()I
    //   9: istore_1
    //   10: iload_1
    //   11: ldc_w -1074341483
    //   14: if_icmpeq -> 64
    //   17: iload_1
    //   18: ldc_w 100571
    //   21: if_icmpeq -> 49
    //   24: iload_1
    //   25: ldc_w 109757538
    //   28: if_icmpeq -> 34
    //   31: goto -> 79
    //   34: aload_2
    //   35: ldc_w 'start'
    //   38: invokevirtual equals : (Ljava/lang/Object;)Z
    //   41: ifeq -> 79
    //   44: iconst_0
    //   45: istore_1
    //   46: goto -> 81
    //   49: aload_2
    //   50: ldc_w 'end'
    //   53: invokevirtual equals : (Ljava/lang/Object;)Z
    //   56: ifeq -> 79
    //   59: iconst_2
    //   60: istore_1
    //   61: goto -> 81
    //   64: aload_2
    //   65: ldc_w 'middle'
    //   68: invokevirtual equals : (Ljava/lang/Object;)Z
    //   71: ifeq -> 79
    //   74: iconst_1
    //   75: istore_1
    //   76: goto -> 81
    //   79: iconst_m1
    //   80: istore_1
    //   81: iload_1
    //   82: ifeq -> 114
    //   85: iload_1
    //   86: iconst_1
    //   87: if_icmpeq -> 110
    //   90: iload_1
    //   91: iconst_2
    //   92: if_icmpne -> 99
    //   95: getstatic android/text/TextUtils$TruncateAt.END : Landroid/text/TextUtils$TruncateAt;
    //   98: areturn
    //   99: new java/lang/IllegalArgumentException
    //   102: dup
    //   103: ldc_w 'Illegal text ellipsize type.'
    //   106: invokespecial <init> : (Ljava/lang/String;)V
    //   109: athrow
    //   110: getstatic android/text/TextUtils$TruncateAt.MIDDLE : Landroid/text/TextUtils$TruncateAt;
    //   113: areturn
    //   114: getstatic android/text/TextUtils$TruncateAt.START : Landroid/text/TextUtils$TruncateAt;
    //   117: areturn
  }
  
  private void h() {
    b(getPickedIndexRelativeToRaw() - this.v, false);
    this.P = false;
    postInvalidate();
  }
  
  private void h(int paramInt) {
    if (this.p0 == paramInt)
      return; 
    this.p0 = paramInt;
    c c1 = this.n0;
    if (c1 != null)
      c1.a(this, paramInt); 
  }
  
  private void i() {
    VelocityTracker velocityTracker = this.a0;
    if (velocityTracker != null) {
      velocityTracker.clear();
      this.a0.recycle();
      this.a0 = null;
    } 
  }
  
  private void i(int paramInt) {
    c(paramInt, true);
  }
  
  private void j() {
    Handler handler = this.i0;
    if (handler != null)
      handler.removeMessages(1); 
  }
  
  private void k() {
    int i = this.s;
    this.t = i / 2;
    int j = this.t;
    this.u = j + 1;
    int k = this.z0;
    this.B0 = (j * k / i);
    this.C0 = (this.u * k / i);
    if (this.q < 0)
      this.q = 0; 
    if (this.r < 0)
      this.r = 0; 
    if (this.q + this.r == 0)
      return; 
    if (getPaddingLeft() + this.q >= this.y0 - getPaddingRight() - this.r) {
      i = getPaddingLeft();
      j = this.q;
      k = getPaddingRight();
      int m = this.r;
      int n = this.y0;
      int i1 = this.q;
      float f1 = i1;
      float f2 = (i + j + k + m - n);
      this.q = (int)(f1 - i1 * f2 / (i1 + m));
      this.r = (int)(m - f2 * m / (this.q + m));
    } 
  }
  
  private void l() {
    int i = this.f;
    int j = this.A0;
    if (i > j)
      this.f = j; 
    i = this.g;
    j = this.A0;
    if (i > j)
      this.g = j; 
    Paint paint = this.d0;
    if (paint != null) {
      paint.setTextSize(this.h);
      this.N = a(this.d0.getFontMetrics());
      this.i = a(this.G, this.d0);
      TextPaint textPaint = this.c0;
      if (textPaint != null) {
        textPaint.setTextSize(this.g);
        this.M = a(this.c0.getFontMetrics());
        this.c0.setTextSize(this.f);
        this.L = a(this.c0.getFontMetrics());
        return;
      } 
      throw new IllegalArgumentException("mPaintText should not be null.");
    } 
    throw new IllegalArgumentException("mPaintHint should not be null.");
  }
  
  private void m() {
    float f1 = this.c0.getTextSize();
    this.c0.setTextSize(this.g);
    double d1 = ((this.c0.getFontMetrics()).bottom - (this.c0.getFontMetrics()).top);
    Double.isNaN(d1);
    this.A = (int)(d1 + 0.5D);
    this.c0.setTextSize(f1);
  }
  
  private void n() {
    float f1 = this.c0.getTextSize();
    this.c0.setTextSize(this.g);
    this.z = a((CharSequence[])this.e0, (Paint)this.c0);
    this.B = a(this.f0, (Paint)this.c0);
    this.C = a(this.g0, (Paint)this.c0);
    this.c0.setTextSize(this.h);
    this.j = a(this.J, (Paint)this.c0);
    this.c0.setTextSize(f1);
  }
  
  private void o() {
    this.s0 = 0;
    this.t0 = -this.s * this.A0;
    if (this.e0 != null) {
      int i = getOneRecycleSize();
      int j = this.s;
      int k = j / 2;
      int m = this.A0;
      this.s0 = (i - k - 1) * m;
      this.t0 = -(j / 2) * m;
    } 
  }
  
  private void p() {
    e();
    q();
    if (this.v == -1)
      this.v = 0; 
    if (this.w == -1)
      this.w = this.e0.length - 1; 
    a(this.v, this.w, false);
  }
  
  private void q() {
    boolean bool;
    if (this.e0.length <= this.s) {
      bool = false;
    } else {
      bool = true;
    } 
    this.S = bool;
  }
  
  public void a(int paramInt) {
    b(getValue(), paramInt, true);
  }
  
  public void a(int paramInt1, int paramInt2) {
    a(paramInt1, paramInt2, true);
  }
  
  public void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramInt1 <= paramInt2) {
      String[] arrayOfString = this.e0;
      if (arrayOfString != null) {
        if (paramInt1 >= 0) {
          int i = arrayOfString.length;
          boolean bool = true;
          if (paramInt1 <= i - 1) {
            if (paramInt2 >= 0) {
              if (paramInt2 <= arrayOfString.length - 1) {
                this.v = paramInt1;
                this.w = paramInt2;
                if (paramBoolean) {
                  this.D = this.v + 0;
                  if (this.P && this.S) {
                    paramBoolean = bool;
                  } else {
                    paramBoolean = false;
                  } 
                  b(0, paramBoolean);
                  postInvalidate();
                } 
                return;
              } 
              StringBuilder stringBuilder4 = new StringBuilder();
              stringBuilder4.append("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is ");
              stringBuilder4.append(this.e0.length - 1);
              stringBuilder4.append(" maxShowIndex is ");
              stringBuilder4.append(paramInt2);
              throw new IllegalArgumentException(stringBuilder4.toString());
            } 
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("maxShowIndex should not be less than 0, now maxShowIndex is ");
            stringBuilder3.append(paramInt2);
            throw new IllegalArgumentException(stringBuilder3.toString());
          } 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is ");
          stringBuilder2.append(this.e0.length - 1);
          stringBuilder2.append(" minShowIndex is ");
          stringBuilder2.append(paramInt1);
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("minShowIndex should not be less than 0, now minShowIndex is ");
        stringBuilder1.append(paramInt1);
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      throw new IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("minShowIndex should be less than maxShowIndex, minShowIndex is ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(", maxShowIndex is ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(".");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void a(int paramInt, boolean paramBoolean) {
    b(getValue(), paramInt, paramBoolean);
  }
  
  public void b(int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield x : I
    //   4: istore #4
    //   6: aload_0
    //   7: getfield y : I
    //   10: istore #5
    //   12: aload_0
    //   13: getfield P : Z
    //   16: istore #7
    //   18: iconst_1
    //   19: istore #8
    //   21: iload #7
    //   23: ifeq -> 39
    //   26: aload_0
    //   27: getfield S : Z
    //   30: ifeq -> 39
    //   33: iconst_1
    //   34: istore #7
    //   36: goto -> 42
    //   39: iconst_0
    //   40: istore #7
    //   42: aload_0
    //   43: iload_1
    //   44: iload #4
    //   46: iload #5
    //   48: iload #7
    //   50: invokespecial a : (IIIZ)I
    //   53: istore #4
    //   55: aload_0
    //   56: getfield x : I
    //   59: istore_1
    //   60: aload_0
    //   61: getfield y : I
    //   64: istore #5
    //   66: aload_0
    //   67: getfield P : Z
    //   70: ifeq -> 87
    //   73: aload_0
    //   74: getfield S : Z
    //   77: ifeq -> 87
    //   80: iload #8
    //   82: istore #7
    //   84: goto -> 90
    //   87: iconst_0
    //   88: istore #7
    //   90: aload_0
    //   91: iload_2
    //   92: iload_1
    //   93: iload #5
    //   95: iload #7
    //   97: invokespecial a : (IIIZ)I
    //   100: istore #5
    //   102: aload_0
    //   103: getfield P : Z
    //   106: ifeq -> 168
    //   109: aload_0
    //   110: getfield S : Z
    //   113: ifeq -> 168
    //   116: iload #5
    //   118: iload #4
    //   120: isub
    //   121: istore_2
    //   122: aload_0
    //   123: invokevirtual getOneRecycleSize : ()I
    //   126: iconst_2
    //   127: idiv
    //   128: istore #6
    //   130: iload_2
    //   131: iload #6
    //   133: ineg
    //   134: if_icmplt -> 145
    //   137: iload_2
    //   138: istore_1
    //   139: iload #6
    //   141: iload_2
    //   142: if_icmpge -> 174
    //   145: aload_0
    //   146: invokevirtual getOneRecycleSize : ()I
    //   149: istore_1
    //   150: iload_2
    //   151: ifle -> 161
    //   154: iload_2
    //   155: iload_1
    //   156: isub
    //   157: istore_1
    //   158: goto -> 174
    //   161: iload_2
    //   162: iload_1
    //   163: iadd
    //   164: istore_1
    //   165: goto -> 174
    //   168: iload #5
    //   170: iload #4
    //   172: isub
    //   173: istore_1
    //   174: aload_0
    //   175: iload #4
    //   177: invokevirtual setValue : (I)V
    //   180: iload #4
    //   182: iload #5
    //   184: if_icmpne -> 188
    //   187: return
    //   188: aload_0
    //   189: iload_1
    //   190: iload_3
    //   191: invokespecial c : (IZ)V
    //   194: return
  }
  
  public boolean b() {
    Scroller scroller = this.W;
    boolean bool = false;
    if (scroller == null)
      return false; 
    if (this.p0 == 2)
      bool = true; 
    return bool;
  }
  
  public void c() {
    Scroller scroller = this.W;
    if (scroller != null && !scroller.isFinished()) {
      scroller = this.W;
      scroller.startScroll(0, scroller.getCurrY(), 0, 0, 1);
      this.W.abortAnimation();
      postInvalidate();
    } 
  }
  
  public void computeScroll() {
    if (this.A0 == 0)
      return; 
    if (this.W.computeScrollOffset()) {
      this.G0 = this.W.getCurrY();
      d();
      postInvalidate();
    } 
  }
  
  public String getContentByCurrValue() {
    return this.e0[getValue() - this.x];
  }
  
  public String[] getDisplayedValues() {
    return this.e0;
  }
  
  public int getMaxValue() {
    return this.y;
  }
  
  public int getMinValue() {
    return this.x;
  }
  
  public int getOneRecycleSize() {
    return this.w - this.v + 1;
  }
  
  public int getPickedIndexRelativeToRaw() {
    int i = this.F0;
    if (i != 0) {
      int j = this.A0;
      return (i < -j / 2) ? d(this.G0 + j + i) : d(this.G0 + i);
    } 
    return d(this.G0);
  }
  
  public int getRawContentSize() {
    String[] arrayOfString = this.e0;
    return (arrayOfString != null) ? arrayOfString.length : 0;
  }
  
  public int getValue() {
    return getPickedIndexRelativeToRaw() + this.x;
  }
  
  public boolean getWrapSelectorWheel() {
    return this.P;
  }
  
  public boolean getWrapSelectorWheelAbsolutely() {
    return (this.P && this.S);
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    HandlerThread handlerThread = this.h0;
    if (handlerThread == null || !handlerThread.isAlive())
      f(); 
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    this.h0.quit();
    if (this.A0 == 0)
      return; 
    if (!this.W.isFinished()) {
      this.W.abortAnimation();
      this.G0 = this.W.getCurrY();
      d();
      int k = this.F0;
      if (k != 0) {
        int m = this.A0;
        if (k < -m / 2) {
          this.G0 = this.G0 + m + k;
        } else {
          this.G0 += k;
        } 
        d();
      } 
      h(0);
    } 
    int i = d(this.G0);
    int j = this.D;
    if (i != j && this.U)
      try {
        if (this.m0 != null)
          this.m0.a(this, j + this.x, this.x + i); 
        if (this.l0 != null)
          this.l0.a(this, this.D, i, this.e0); 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    this.D = i;
  }
  
  protected void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    a(paramCanvas);
    c(paramCanvas);
    b(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    a(false);
    setMeasuredDimension(g(paramInt1), f(paramInt2));
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: iload_3
    //   4: iload #4
    //   6: invokespecial onSizeChanged : (IIII)V
    //   9: aload_0
    //   10: iload_1
    //   11: putfield y0 : I
    //   14: aload_0
    //   15: iload_2
    //   16: putfield z0 : I
    //   19: aload_0
    //   20: aload_0
    //   21: getfield z0 : I
    //   24: aload_0
    //   25: getfield s : I
    //   28: idiv
    //   29: putfield A0 : I
    //   32: aload_0
    //   33: aload_0
    //   34: getfield y0 : I
    //   37: aload_0
    //   38: invokevirtual getPaddingLeft : ()I
    //   41: iadd
    //   42: aload_0
    //   43: invokevirtual getPaddingRight : ()I
    //   46: isub
    //   47: i2f
    //   48: fconst_2
    //   49: fdiv
    //   50: putfield D0 : F
    //   53: aload_0
    //   54: invokevirtual getOneRecycleSize : ()I
    //   57: istore_1
    //   58: iconst_0
    //   59: istore #6
    //   61: iload_1
    //   62: iconst_1
    //   63: if_icmple -> 110
    //   66: aload_0
    //   67: getfield R : Z
    //   70: ifeq -> 86
    //   73: aload_0
    //   74: invokevirtual getValue : ()I
    //   77: aload_0
    //   78: getfield x : I
    //   81: isub
    //   82: istore_1
    //   83: goto -> 112
    //   86: aload_0
    //   87: getfield Q : Z
    //   90: ifeq -> 110
    //   93: aload_0
    //   94: getfield E0 : I
    //   97: aload_0
    //   98: getfield s : I
    //   101: iconst_1
    //   102: isub
    //   103: iconst_2
    //   104: idiv
    //   105: iadd
    //   106: istore_1
    //   107: goto -> 112
    //   110: iconst_0
    //   111: istore_1
    //   112: iload #6
    //   114: istore #5
    //   116: aload_0
    //   117: getfield P : Z
    //   120: ifeq -> 137
    //   123: iload #6
    //   125: istore #5
    //   127: aload_0
    //   128: getfield S : Z
    //   131: ifeq -> 137
    //   134: iconst_1
    //   135: istore #5
    //   137: aload_0
    //   138: iload_1
    //   139: iload #5
    //   141: invokespecial b : (IZ)V
    //   144: aload_0
    //   145: invokespecial l : ()V
    //   148: aload_0
    //   149: invokespecial o : ()V
    //   152: aload_0
    //   153: invokespecial k : ()V
    //   156: aload_0
    //   157: iconst_1
    //   158: putfield R : Z
    //   161: return
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    g();
    if (this.A0 == 0)
      return true; 
    if (this.a0 == null)
      this.a0 = VelocityTracker.obtain(); 
    this.a0.addMovement(paramMotionEvent);
    this.w0 = paramMotionEvent.getY();
    int i = paramMotionEvent.getAction();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3)
            return true; 
          this.u0 = this.G0;
          c();
          this.i0.sendMessageDelayed(c(1), 0L);
          return true;
        } 
        float f1 = this.v0 - this.w0;
        if (this.x0) {
          i = this.F;
          if (-i < f1 && f1 < i) {
            h(1);
            return true;
          } 
        } 
        this.x0 = false;
        this.G0 = e((int)(this.u0 + f1));
        d();
        invalidate();
        h(1);
        return true;
      } 
      if (this.x0) {
        a(paramMotionEvent);
        return true;
      } 
      VelocityTracker velocityTracker = this.a0;
      velocityTracker.computeCurrentVelocity(1000);
      i = (int)(velocityTracker.getYVelocity() * this.K);
      if (Math.abs(i) > this.E) {
        this.W.fling(0, this.G0, 0, -i, -2147483648, 2147483647, e(-2147483648), e(2147483647));
        invalidate();
        h(2);
      } 
      this.i0.sendMessageDelayed(c(1), 0L);
      i();
      return true;
    } 
    this.x0 = true;
    this.i0.removeMessages(1);
    c();
    this.v0 = this.w0;
    this.u0 = this.G0;
    h(0);
    getParent().requestDisallowInterceptTouchEvent(true);
    return true;
  }
  
  public void setContentTextTypeface(Typeface paramTypeface) {
    this.c0.setTypeface(paramTypeface);
  }
  
  public void setDisplayedValues(String[] paramArrayOfString) {
    j();
    c();
    if (paramArrayOfString != null) {
      int i = this.y;
      int j = this.x;
      boolean bool = true;
      if (i - j + 1 <= paramArrayOfString.length) {
        a(paramArrayOfString);
        a(true);
        this.D = this.v + 0;
        if (!this.P || !this.S)
          bool = false; 
        b(0, bool);
        postInvalidate();
        this.j0.sendEmptyMessage(3);
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is ");
      stringBuilder.append(this.y - this.x + 1);
      stringBuilder.append(" newDisplayedValues.length is ");
      stringBuilder.append(paramArrayOfString.length);
      stringBuilder.append(", you need to set MaxValue and MinValue before setDisplayedValues(String[])");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new IllegalArgumentException("newDisplayedValues should not be null.");
  }
  
  public void setDividerColor(int paramInt) {
    if (this.o == paramInt)
      return; 
    this.o = paramInt;
    this.b0.setColor(this.o);
    postInvalidate();
  }
  
  public void setDividerHeight(int paramInt) {
    if (this.p == paramInt)
      return; 
    this.p = paramInt;
    this.b0.setStrokeWidth(paramInt);
    postInvalidate();
  }
  
  public void setFriction(float paramFloat) {
    if (paramFloat > 0.0F) {
      ViewConfiguration.get(getContext());
      this.K = ViewConfiguration.getScrollFriction() / paramFloat;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("you should set a a positive float friction, now friction is ");
    stringBuilder.append(paramFloat);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void setHintText(String paramString) {
    if (a(this.G, paramString))
      return; 
    this.G = paramString;
    this.N = a(this.d0.getFontMetrics());
    this.i = a(this.G, this.d0);
    this.j0.sendEmptyMessage(3);
  }
  
  public void setHintTextColor(int paramInt) {
    if (this.e == paramInt)
      return; 
    this.e = paramInt;
    this.d0.setColor(this.e);
    postInvalidate();
  }
  
  public void setHintTextTypeface(Typeface paramTypeface) {
    this.d0.setTypeface(paramTypeface);
  }
  
  public void setItemPaddingHorizontal(int paramInt) {
    this.n = paramInt;
    postInvalidate();
  }
  
  public void setMaxValue(int paramInt) {
    String[] arrayOfString = this.e0;
    if (arrayOfString != null) {
      int i = this.x;
      if (paramInt - i + 1 <= arrayOfString.length) {
        this.y = paramInt;
        paramInt = this.y;
        int j = this.v;
        this.w = paramInt - i + j;
        a(j, this.w);
        o();
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is ");
      stringBuilder.append(paramInt - this.x + 1);
      stringBuilder.append(" and mDisplayedValues.length is ");
      stringBuilder.append(this.e0.length);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new NullPointerException("mDisplayedValues should not be null");
  }
  
  public void setMinValue(int paramInt) {
    this.x = paramInt;
    this.v = 0;
    o();
  }
  
  public void setNormalTextColor(int paramInt) {
    if (this.c == paramInt)
      return; 
    this.c = paramInt;
    postInvalidate();
  }
  
  public void setOnScrollListener(c paramc) {
    this.n0 = paramc;
  }
  
  public void setOnValueChangeListenerInScrolling(e parame) {
    this.o0 = parame;
  }
  
  public void setOnValueChangedListener(d paramd) {
    this.m0 = paramd;
  }
  
  public void setOnValueChangedListenerRelativeToRaw(f paramf) {
    this.l0 = paramf;
  }
  
  public void setPickedIndexRelativeToMin(int paramInt) {
    if (paramInt >= 0 && paramInt < getOneRecycleSize()) {
      boolean bool;
      this.D = this.v + paramInt;
      if (this.P && this.S) {
        bool = true;
      } else {
        bool = false;
      } 
      b(paramInt, bool);
      postInvalidate();
    } 
  }
  
  public void setPickedIndexRelativeToRaw(int paramInt) {
    int i = this.v;
    if (i > -1 && i <= paramInt && paramInt <= this.w) {
      boolean bool;
      this.D = paramInt;
      if (this.P && this.S) {
        bool = true;
      } else {
        bool = false;
      } 
      b(paramInt - i, bool);
      postInvalidate();
    } 
  }
  
  public void setSelectedTextColor(int paramInt) {
    if (this.d == paramInt)
      return; 
    this.d = paramInt;
    postInvalidate();
  }
  
  public void setShownCount(int paramInt) {
    this.s = paramInt;
  }
  
  public void setTextAlign(Paint.Align paramAlign) {
    this.c0.setTextAlign(paramAlign);
  }
  
  public void setValue(int paramInt) {
    int i = this.x;
    if (paramInt >= i) {
      if (paramInt <= this.y) {
        setPickedIndexRelativeToRaw(paramInt - i);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("should not set a value greater than mMaxValue, value is ");
      stringBuilder1.append(paramInt);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("should not set a value less than mMinValue, value is ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void setWrapSelectorWheel(boolean paramBoolean) {
    if (this.P != paramBoolean) {
      if (!paramBoolean) {
        if (this.p0 == 0) {
          h();
          return;
        } 
        this.T = true;
        return;
      } 
      this.P = paramBoolean;
      q();
      postInvalidate();
    } 
  }
  
  class a extends Handler {
    a(a this$0, Looper param1Looper) {
      super(param1Looper);
    }
    
    public void handleMessage(Message param1Message) {
      Handler handler;
      long l;
      Message message;
      int i = param1Message.what;
      if (i != 1) {
        if (i != 2)
          return; 
        a.a(this.a, param1Message.arg1, param1Message.arg2, param1Message.obj);
        return;
      } 
      boolean bool = a.a(this.a).isFinished();
      i = 0;
      if (!bool) {
        if (a.b(this.a) == 0)
          a.a(this.a, 1); 
        Handler handler1 = a.e(this.a);
        message = a.a(this.a, 1, 0, 0, param1Message.obj);
        l = 32L;
        handler = handler1;
      } else {
        int j;
        if (a.f(this.a) != 0) {
          a a2;
          if (a.b(this.a) == 0)
            a.a(this.a, 1); 
          if (a.f(this.a) < -a.g(this.a) / 2) {
            i = (int)((a.g(this.a) + a.f(this.a)) * 300.0F / a.g(this.a));
            Scroller scroller = a.a(this.a);
            j = a.h(this.a);
            int k = a.g(this.a);
            scroller.startScroll(0, j, 0, a.f(this.a) + k, i * 3);
            a2 = this.a;
            j = a.h(a2) + a.g(this.a);
          } else {
            i = (int)(-a.f(this.a) * 300.0F / a.g(this.a));
            a.a(this.a).startScroll(0, a.h(this.a), 0, a.f(this.a), i * 3);
            a2 = this.a;
            j = a.h(a2);
          } 
          j = a.b(a2, j + a.f(this.a));
          this.a.postInvalidate();
        } else {
          a.a(this.a, 0);
          a a2 = this.a;
          j = a.b(a2, a.h(a2));
        } 
        a a1 = this.a;
        message = a.a(a1, 2, a.i(a1), j, ((Message)handler).obj);
        if (a.c(this.a)) {
          handler = a.d(this.a);
        } else {
          handler = a.e(this.a);
        } 
        l = (i * 2);
      } 
      handler.sendMessageDelayed(message, l);
    }
  }
  
  class b extends Handler {
    b(a this$0) {}
    
    public void handleMessage(Message param1Message) {
      super.handleMessage(param1Message);
      int i = param1Message.what;
      if (i != 2) {
        if (i != 3)
          return; 
        this.a.requestLayout();
        return;
      } 
      a.a(this.a, param1Message.arg1, param1Message.arg2, param1Message.obj);
    }
  }
  
  public static interface c {
    void a(a param1a, int param1Int);
  }
  
  public static interface d {
    void a(a param1a, int param1Int1, int param1Int2);
  }
  
  public static interface e {
    void a(a param1a, int param1Int1, int param1Int2);
  }
  
  public static interface f {
    void a(a param1a, int param1Int1, int param1Int2, String[] param1ArrayOfString);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/d/a/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */