package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.b0;
import com.facebook.react.uimanager.g;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.n;
import com.facebook.react.uimanager.q;
import com.facebook.yoga.u;
import com.facebook.yoga.v;
import java.util.List;
import java.util.Map;

@TargetApi(23)
public abstract class h extends i {
  protected s B;
  
  protected y C;
  
  protected boolean D = false;
  
  protected int E;
  
  protected boolean F = false;
  
  protected int G;
  
  protected int H = -1;
  
  protected int I = 0;
  
  protected int J;
  
  protected int K;
  
  protected int L;
  
  protected float M;
  
  protected float N;
  
  protected float O;
  
  protected int P;
  
  protected boolean Q;
  
  protected boolean R;
  
  protected boolean S;
  
  protected boolean T;
  
  protected float U;
  
  protected int V;
  
  protected int W;
  
  protected String X;
  
  protected String Y;
  
  protected boolean Z;
  
  protected Map<Integer, a0> a0;
  
  public h() {
    this(null);
  }
  
  public h(s params) {
    if (Build.VERSION.SDK_INT < 23) {
      j = 0;
    } else {
      j = 1;
    } 
    this.J = j;
    int j = Build.VERSION.SDK_INT;
    this.K = 0;
    j = Build.VERSION.SDK_INT;
    this.L = 0;
    this.M = 0.0F;
    this.N = 0.0F;
    this.O = 0.0F;
    this.P = 1426063360;
    this.Q = false;
    this.R = false;
    this.S = true;
    this.T = false;
    this.U = 0.0F;
    this.V = -1;
    this.W = -1;
    this.X = null;
    this.Y = null;
    this.Z = false;
    this.C = new y();
    this.B = params;
  }
  
  private static void a(h paramh, SpannableStringBuilder paramSpannableStringBuilder, List<a> paramList, y paramy, boolean paramBoolean, Map<Integer, a0> paramMap, int paramInt) {
    StringBuilder stringBuilder;
    y y2 = paramh.C;
    y y1 = y2;
    if (paramy != null)
      y1 = paramy.a(y2); 
    int k = paramh.a();
    int j;
    for (j = 0; j < k; j++) {
      b0 b0 = paramh.a(j);
      if (b0 instanceof k) {
        paramSpannableStringBuilder.append(c0.a(((k)b0).Q(), y1.k()));
      } else if (b0 instanceof h) {
        a((h)b0, paramSpannableStringBuilder, paramList, y1, paramBoolean, paramMap, paramSpannableStringBuilder.length());
      } else if (b0 instanceof o) {
        paramSpannableStringBuilder.append("0");
        paramList.add(new a(paramSpannableStringBuilder.length() - 1, paramSpannableStringBuilder.length(), ((o)b0).Q()));
      } else if (paramBoolean) {
        float f1;
        float f2;
        int m = b0.t();
        v v1 = b0.d();
        v v2 = b0.o();
        u u1 = v1.b;
        u u2 = u.d;
        if (u1 != u2 || v2.b != u2) {
          b0.w();
          f1 = b0.C();
          f2 = b0.l();
        } else {
          f1 = v1.a;
          f2 = v2.a;
        } 
        paramSpannableStringBuilder.append("0");
        paramList.add(new a(paramSpannableStringBuilder.length() - 1, paramSpannableStringBuilder.length(), new a0(m, (int)f1, (int)f2)));
        paramMap.put(Integer.valueOf(m), b0);
      } else {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected view type nested under a <Text> or <TextInput> node: ");
        stringBuilder.append(b0.getClass());
        throw new g(stringBuilder.toString());
      } 
      b0.e();
    } 
    j = paramSpannableStringBuilder.length();
    if (j >= paramInt) {
      if (((h)stringBuilder).D)
        paramList.add(new a(paramInt, j, new j(((h)stringBuilder).E))); 
      if (((h)stringBuilder).F)
        paramList.add(new a(paramInt, j, new g(((h)stringBuilder).G))); 
      if (Build.VERSION.SDK_INT >= 21) {
        float f1 = y1.c();
        if (!Float.isNaN(f1) && (paramy == null || paramy.c() != f1))
          paramList.add(new a(paramInt, j, new a(f1))); 
      } 
      k = y1.b();
      if (paramy == null || paramy.b() != k)
        paramList.add(new a(paramInt, j, new f(k))); 
      if (((h)stringBuilder).V != -1 || ((h)stringBuilder).W != -1 || ((h)stringBuilder).X != null)
        paramList.add(new a(paramInt, j, new c(((h)stringBuilder).V, ((h)stringBuilder).W, ((h)stringBuilder).Y, ((h)stringBuilder).X, stringBuilder.h().getAssets()))); 
      if (((h)stringBuilder).Q)
        paramList.add(new a(paramInt, j, new u())); 
      if (((h)stringBuilder).R)
        paramList.add(new a(paramInt, j, new m())); 
      if ((((h)stringBuilder).M != 0.0F || ((h)stringBuilder).N != 0.0F || ((h)stringBuilder).O != 0.0F) && Color.alpha(((h)stringBuilder).P) != 0)
        paramList.add(new a(paramInt, j, new w(((h)stringBuilder).M, ((h)stringBuilder).N, ((h)stringBuilder).O, ((h)stringBuilder).P))); 
      float f = y1.d();
      if (!Float.isNaN(f) && (paramy == null || paramy.d() != f))
        paramList.add(new a(paramInt, j, new b(f))); 
      paramList.add(new a(paramInt, j, new n(stringBuilder.t())));
    } 
  }
  
  protected Spannable a(h paramh, String paramString, boolean paramBoolean, n paramn) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #7
    //   3: iload_3
    //   4: ifeq -> 21
    //   7: aload #4
    //   9: ifnull -> 15
    //   12: goto -> 21
    //   15: iconst_0
    //   16: istore #9
    //   18: goto -> 24
    //   21: iconst_1
    //   22: istore #9
    //   24: iload #9
    //   26: ldc_w 'nativeViewHierarchyOptimizer is required when inline views are supported'
    //   29: invokestatic a : (ZLjava/lang/String;)V
    //   32: new android/text/SpannableStringBuilder
    //   35: dup
    //   36: invokespecial <init> : ()V
    //   39: astore #11
    //   41: new java/util/ArrayList
    //   44: dup
    //   45: invokespecial <init> : ()V
    //   48: astore #12
    //   50: iload_3
    //   51: ifeq -> 66
    //   54: new java/util/HashMap
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: astore #10
    //   63: goto -> 69
    //   66: aconst_null
    //   67: astore #10
    //   69: aload_2
    //   70: ifnull -> 90
    //   73: aload #11
    //   75: aload_2
    //   76: aload_1
    //   77: getfield C : Lcom/facebook/react/views/text/y;
    //   80: invokevirtual k : ()Lcom/facebook/react/views/text/c0;
    //   83: invokestatic a : (Ljava/lang/String;Lcom/facebook/react/views/text/c0;)Ljava/lang/String;
    //   86: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    //   89: pop
    //   90: aload_1
    //   91: aload #11
    //   93: aload #12
    //   95: aconst_null
    //   96: iload_3
    //   97: aload #10
    //   99: iconst_0
    //   100: invokestatic a : (Lcom/facebook/react/views/text/h;Landroid/text/SpannableStringBuilder;Ljava/util/List;Lcom/facebook/react/views/text/y;ZLjava/util/Map;I)V
    //   103: aload_1
    //   104: iconst_0
    //   105: putfield Z : Z
    //   108: aload_1
    //   109: aload #10
    //   111: putfield a0 : Ljava/util/Map;
    //   114: ldc_w NaN
    //   117: fstore #5
    //   119: aload #12
    //   121: invokeinterface iterator : ()Ljava/util/Iterator;
    //   126: astore_2
    //   127: aload_2
    //   128: invokeinterface hasNext : ()Z
    //   133: ifeq -> 302
    //   136: aload_2
    //   137: invokeinterface next : ()Ljava/lang/Object;
    //   142: checkcast com/facebook/react/views/text/h$a
    //   145: astore #12
    //   147: aload #12
    //   149: getfield c : Lcom/facebook/react/views/text/l;
    //   152: astore #13
    //   154: aload #13
    //   156: instanceof com/facebook/react/views/text/z
    //   159: istore_3
    //   160: iload_3
    //   161: ifne -> 176
    //   164: fload #5
    //   166: fstore #6
    //   168: aload #13
    //   170: instanceof com/facebook/react/views/text/a0
    //   173: ifeq -> 280
    //   176: aload #12
    //   178: getfield c : Lcom/facebook/react/views/text/l;
    //   181: astore #13
    //   183: iload_3
    //   184: ifeq -> 205
    //   187: aload #13
    //   189: checkcast com/facebook/react/views/text/z
    //   192: invokevirtual b : ()I
    //   195: istore #8
    //   197: aload_1
    //   198: iconst_1
    //   199: putfield Z : Z
    //   202: goto -> 254
    //   205: aload #13
    //   207: checkcast com/facebook/react/views/text/a0
    //   210: astore #13
    //   212: aload #13
    //   214: invokevirtual a : ()I
    //   217: istore #8
    //   219: aload #10
    //   221: aload #13
    //   223: invokevirtual b : ()I
    //   226: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   229: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   234: checkcast com/facebook/react/uimanager/a0
    //   237: astore #13
    //   239: aload #4
    //   241: aload #13
    //   243: invokevirtual a : (Lcom/facebook/react/uimanager/a0;)V
    //   246: aload #13
    //   248: aload_1
    //   249: invokeinterface b : (Lcom/facebook/react/uimanager/a0;)V
    //   254: fload #5
    //   256: invokestatic isNaN : (F)Z
    //   259: ifne -> 275
    //   262: fload #5
    //   264: fstore #6
    //   266: iload #8
    //   268: i2f
    //   269: fload #5
    //   271: fcmpl
    //   272: ifle -> 280
    //   275: iload #8
    //   277: i2f
    //   278: fstore #6
    //   280: aload #12
    //   282: aload #11
    //   284: iload #7
    //   286: invokevirtual a : (Landroid/text/SpannableStringBuilder;I)V
    //   289: iload #7
    //   291: iconst_1
    //   292: iadd
    //   293: istore #7
    //   295: fload #6
    //   297: fstore #5
    //   299: goto -> 127
    //   302: aload_1
    //   303: getfield C : Lcom/facebook/react/views/text/y;
    //   306: fload #5
    //   308: invokevirtual b : (F)V
    //   311: aload_0
    //   312: getfield B : Lcom/facebook/react/views/text/s;
    //   315: astore_1
    //   316: aload_1
    //   317: ifnull -> 328
    //   320: aload_1
    //   321: aload #11
    //   323: invokeinterface a : (Landroid/text/Spannable;)V
    //   328: aload #11
    //   330: areturn
  }
  
  @com.facebook.react.uimanager.e1.a(name = "adjustsFontSizeToFit")
  public void setAdjustFontSizeToFit(boolean paramBoolean) {
    if (paramBoolean != this.T) {
      this.T = paramBoolean;
      L();
    } 
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "allowFontScaling")
  public void setAllowFontScaling(boolean paramBoolean) {
    if (paramBoolean != this.C.a()) {
      this.C.a(paramBoolean);
      L();
    } 
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "backgroundColor")
  public void setBackgroundColor(Integer paramInteger) {
    if (y()) {
      boolean bool;
      if (paramInteger != null) {
        bool = true;
      } else {
        bool = false;
      } 
      this.F = bool;
      if (this.F)
        this.G = paramInteger.intValue(); 
      L();
    } 
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "color")
  public void setColor(Integer paramInteger) {
    boolean bool;
    if (paramInteger != null) {
      bool = true;
    } else {
      bool = false;
    } 
    this.D = bool;
    if (this.D)
      this.E = paramInteger.intValue(); 
    L();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "fontFamily")
  public void setFontFamily(String paramString) {
    this.X = paramString;
    L();
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = NaNF, name = "fontSize")
  public void setFontSize(float paramFloat) {
    this.C.a(paramFloat);
    L();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "fontStyle")
  public void setFontStyle(String paramString) {
    int j = t.a(paramString);
    if (j != this.V) {
      this.V = j;
      L();
    } 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "fontVariant")
  public void setFontVariant(ReadableArray paramReadableArray) {
    String str = t.a(paramReadableArray);
    if (!TextUtils.equals(str, this.Y)) {
      this.Y = str;
      L();
    } 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "fontWeight")
  public void setFontWeight(String paramString) {
    int j = t.b(paramString);
    if (j != this.W) {
      this.W = j;
      L();
    } 
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "includeFontPadding")
  public void setIncludeFontPadding(boolean paramBoolean) {
    this.S = paramBoolean;
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = NaNF, name = "letterSpacing")
  public void setLetterSpacing(float paramFloat) {
    this.C.c(paramFloat);
    L();
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = NaNF, name = "lineHeight")
  public void setLineHeight(float paramFloat) {
    this.C.d(paramFloat);
    L();
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = NaNF, name = "maxFontSizeMultiplier")
  public void setMaxFontSizeMultiplier(float paramFloat) {
    if (paramFloat != this.C.j()) {
      this.C.e(paramFloat);
      L();
    } 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "minimumFontScale")
  public void setMinimumFontScale(float paramFloat) {
    if (paramFloat != this.U) {
      this.U = paramFloat;
      L();
    } 
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = -1, name = "numberOfLines")
  public void setNumberOfLines(int paramInt) {
    int j = paramInt;
    if (paramInt == 0)
      j = -1; 
    this.H = j;
    L();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "textAlign")
  public void setTextAlign(String paramString) {
    // Byte code:
    //   0: ldc_w 'justify'
    //   3: aload_1
    //   4: invokevirtual equals : (Ljava/lang/Object;)Z
    //   7: ifeq -> 31
    //   10: getstatic android/os/Build$VERSION.SDK_INT : I
    //   13: bipush #26
    //   15: if_icmplt -> 23
    //   18: aload_0
    //   19: iconst_1
    //   20: putfield L : I
    //   23: aload_0
    //   24: iconst_3
    //   25: putfield I : I
    //   28: goto -> 149
    //   31: getstatic android/os/Build$VERSION.SDK_INT : I
    //   34: bipush #26
    //   36: if_icmplt -> 44
    //   39: aload_0
    //   40: iconst_0
    //   41: putfield L : I
    //   44: aload_1
    //   45: ifnull -> 144
    //   48: ldc_w 'auto'
    //   51: aload_1
    //   52: invokevirtual equals : (Ljava/lang/Object;)Z
    //   55: ifeq -> 61
    //   58: goto -> 144
    //   61: ldc_w 'left'
    //   64: aload_1
    //   65: invokevirtual equals : (Ljava/lang/Object;)Z
    //   68: ifeq -> 74
    //   71: goto -> 23
    //   74: ldc_w 'right'
    //   77: aload_1
    //   78: invokevirtual equals : (Ljava/lang/Object;)Z
    //   81: ifeq -> 92
    //   84: aload_0
    //   85: iconst_5
    //   86: putfield I : I
    //   89: goto -> 149
    //   92: ldc_w 'center'
    //   95: aload_1
    //   96: invokevirtual equals : (Ljava/lang/Object;)Z
    //   99: ifeq -> 110
    //   102: aload_0
    //   103: iconst_1
    //   104: putfield I : I
    //   107: goto -> 149
    //   110: new java/lang/StringBuilder
    //   113: dup
    //   114: invokespecial <init> : ()V
    //   117: astore_2
    //   118: aload_2
    //   119: ldc_w 'Invalid textAlign: '
    //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: aload_2
    //   127: aload_1
    //   128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: pop
    //   132: new com/facebook/react/bridge/JSApplicationIllegalArgumentException
    //   135: dup
    //   136: aload_2
    //   137: invokevirtual toString : ()Ljava/lang/String;
    //   140: invokespecial <init> : (Ljava/lang/String;)V
    //   143: athrow
    //   144: aload_0
    //   145: iconst_0
    //   146: putfield I : I
    //   149: aload_0
    //   150: invokevirtual L : ()V
    //   153: return
  }
  
  @com.facebook.react.uimanager.e1.a(name = "textBreakStrategy")
  public void setTextBreakStrategy(String paramString) {
    byte b;
    if (Build.VERSION.SDK_INT < 23)
      return; 
    if (paramString == null || "highQuality".equals(paramString)) {
      b = 1;
    } else if ("simple".equals(paramString)) {
      b = 0;
    } else if ("balanced".equals(paramString)) {
      b = 2;
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid textBreakStrategy: ");
      stringBuilder.append(paramString);
      throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    } 
    this.J = b;
    L();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "textDecorationLine")
  public void setTextDecorationLine(String paramString) {
    int j = 0;
    this.Q = false;
    this.R = false;
    if (paramString != null) {
      String[] arrayOfString = paramString.split(" ");
      int k = arrayOfString.length;
      while (j < k) {
        String str = arrayOfString[j];
        if ("underline".equals(str)) {
          this.Q = true;
        } else if ("line-through".equals(str)) {
          this.R = true;
        } 
        j++;
      } 
    } 
    L();
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
  public void setTextShadowColor(int paramInt) {
    if (paramInt != this.P) {
      this.P = paramInt;
      L();
    } 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "textShadowOffset")
  public void setTextShadowOffset(ReadableMap paramReadableMap) {
    this.M = 0.0F;
    this.N = 0.0F;
    if (paramReadableMap != null) {
      if (paramReadableMap.hasKey("width") && !paramReadableMap.isNull("width"))
        this.M = q.a(paramReadableMap.getDouble("width")); 
      if (paramReadableMap.hasKey("height") && !paramReadableMap.isNull("height"))
        this.N = q.a(paramReadableMap.getDouble("height")); 
    } 
    L();
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "textShadowRadius")
  public void setTextShadowRadius(float paramFloat) {
    if (paramFloat != this.O) {
      this.O = paramFloat;
      L();
    } 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "textTransform")
  public void setTextTransform(String paramString) {
    c0 c0;
    JSApplicationIllegalArgumentException jSApplicationIllegalArgumentException;
    StringBuilder stringBuilder;
    if (paramString == null) {
      y y1 = this.C;
      c0 = c0.g;
    } else if ("none".equals(c0)) {
      y y1 = this.C;
      c0 = c0.c;
    } else if ("uppercase".equals(c0)) {
      y y1 = this.C;
      c0 = c0.d;
    } else if ("lowercase".equals(c0)) {
      y y1 = this.C;
      c0 = c0.e;
    } else if ("capitalize".equals(c0)) {
      y y1 = this.C;
      c0 = c0.f;
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid textTransform: ");
      stringBuilder.append((String)c0);
      jSApplicationIllegalArgumentException = new JSApplicationIllegalArgumentException(stringBuilder.toString());
      throw jSApplicationIllegalArgumentException;
    } 
    stringBuilder.a((c0)jSApplicationIllegalArgumentException);
    L();
  }
  
  private static class a {
    protected int a;
    
    protected int b;
    
    protected l c;
    
    a(int param1Int1, int param1Int2, l param1l) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1l;
    }
    
    public void a(SpannableStringBuilder param1SpannableStringBuilder, int param1Int) {
      byte b;
      if (this.a == 0) {
        b = 18;
      } else {
        b = 34;
      } 
      param1SpannableStringBuilder.setSpan(this.c, this.a, this.b, param1Int << 16 & 0xFF0000 | b & 0xFF00FFFF);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */