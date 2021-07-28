package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.n;
import com.facebook.react.uimanager.v0;
import com.facebook.yoga.g;
import com.facebook.yoga.h;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import java.util.ArrayList;
import java.util.Map;

@TargetApi(23)
public class p extends h {
  private static final TextPaint e0 = new TextPaint(1);
  
  private Spannable b0;
  
  private boolean c0;
  
  private final m d0 = new a(this);
  
  public p() {
    this(null);
  }
  
  public p(s params) {
    super(params);
    S();
  }
  
  private int R() {
    int j = this.I;
    int i = j;
    if (D() == h.e) {
      if (j == 5)
        return 3; 
      i = j;
      if (j == 3)
        i = 5; 
    } 
    return i;
  }
  
  private void S() {
    if (!y())
      a(this.d0); 
  }
  
  private Layout a(Spannable paramSpannable, float paramFloat, n paramn) {
    StaticLayout.Builder builder1;
    StaticLayout.Builder builder2;
    float f;
    int i;
    TextPaint textPaint = e0;
    textPaint.setTextSize(this.C.b());
    BoringLayout.Metrics metrics = BoringLayout.isBoring((CharSequence)paramSpannable, textPaint);
    if (metrics == null) {
      f = Layout.getDesiredWidth((CharSequence)paramSpannable, textPaint);
    } else {
      f = Float.NaN;
    } 
    if (paramn == n.c || paramFloat < 0.0F) {
      i = 1;
    } else {
      i = 0;
    } 
    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
    int j = R();
    if (j != 1) {
      if (j != 3) {
        if (j == 5)
          alignment = Layout.Alignment.ALIGN_OPPOSITE; 
      } else {
        alignment = Layout.Alignment.ALIGN_NORMAL;
      } 
    } else {
      alignment = Layout.Alignment.ALIGN_CENTER;
    } 
    if (metrics == null && (i || (!g.a(f) && f <= paramFloat))) {
      i = (int)Math.ceil(f);
      if (Build.VERSION.SDK_INT < 23)
        return (Layout)new StaticLayout((CharSequence)paramSpannable, textPaint, i, alignment, 1.0F, 0.0F, this.S); 
      builder2 = StaticLayout.Builder.obtain((CharSequence)paramSpannable, 0, paramSpannable.length(), textPaint, i).setAlignment(alignment).setLineSpacing(0.0F, 1.0F).setIncludePad(this.S).setBreakStrategy(this.J).setHyphenationFrequency(this.K);
      if (Build.VERSION.SDK_INT >= 26)
        builder2.setJustificationMode(this.L); 
      builder1 = builder2;
      if (Build.VERSION.SDK_INT >= 28) {
        builder1 = builder2;
      } else {
        return (Layout)builder1.build();
      } 
    } else {
      if (metrics != null && (i != 0 || metrics.width <= paramFloat))
        return (Layout)BoringLayout.make((CharSequence)builder1, textPaint, metrics.width, (Layout.Alignment)builder2, 1.0F, 0.0F, metrics, this.S); 
      if (Build.VERSION.SDK_INT < 23)
        return (Layout)new StaticLayout((CharSequence)builder1, textPaint, (int)paramFloat, (Layout.Alignment)builder2, 1.0F, 0.0F, this.S); 
      builder2 = StaticLayout.Builder.obtain((CharSequence)builder1, 0, builder1.length(), textPaint, (int)paramFloat).setAlignment((Layout.Alignment)builder2).setLineSpacing(0.0F, 1.0F).setIncludePad(this.S).setBreakStrategy(this.J).setHyphenationFrequency(this.K);
      builder1 = builder2;
      if (Build.VERSION.SDK_INT >= 28) {
        builder1 = builder2;
      } else {
        return (Layout)builder1.build();
      } 
    } 
    builder1.setUseLineSpacingFromFallbacks(true);
    return (Layout)builder1.build();
  }
  
  public boolean F() {
    return true;
  }
  
  public boolean I() {
    return false;
  }
  
  public void L() {
    super.L();
    f();
  }
  
  public void a(n paramn) {
    this.b0 = a(this, null, true, paramn);
    L();
  }
  
  public void a(v0 paramv0) {
    super.a(paramv0);
    Spannable spannable = this.b0;
    if (spannable != null) {
      q q = new q(spannable, -1, this.Z, f(4), f(1), f(5), f(3), R(), this.J, this.L);
      paramv0.a(t(), q);
    } 
  }
  
  public Iterable<? extends a0> r() {
    Map<Integer, a0> map = this.a0;
    if (map == null || map.isEmpty())
      return null; 
    Spannable spannable = this.b0;
    e.e.m.a.a.a(spannable, "Spannable element has not been prepared in onBeforeLayout");
    Spanned spanned = (Spanned)spannable;
    int j = spanned.length();
    int i = 0;
    a0[] arrayOfA0 = (a0[])spanned.getSpans(0, j, a0.class);
    ArrayList<a0> arrayList = new ArrayList(arrayOfA0.length);
    j = arrayOfA0.length;
    while (i < j) {
      a0 a01 = arrayOfA0[i];
      a0 a0 = this.a0.get(Integer.valueOf(a01.b()));
      a0.w();
      arrayList.add(a0);
      i++;
    } 
    return arrayList;
  }
  
  @com.facebook.react.uimanager.e1.a(name = "onTextLayout")
  public void setShouldNotifyOnTextLayout(boolean paramBoolean) {
    this.c0 = paramBoolean;
  }
  
  class a implements m {
    a(p this$0) {}
    
    public long a(com.facebook.yoga.p param1p, float param1Float1, n param1n1, float param1Float2, n param1n2) {
      // Byte code:
      //   0: aload_0
      //   1: getfield c : Lcom/facebook/react/views/text/p;
      //   4: invokestatic a : (Lcom/facebook/react/views/text/p;)Landroid/text/Spannable;
      //   7: astore_1
      //   8: aload_1
      //   9: ldc 'Spannable element has not been prepared in onBeforeLayout'
      //   11: invokestatic a : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
      //   14: pop
      //   15: aload_1
      //   16: checkcast android/text/Spannable
      //   19: astore #13
      //   21: aload_0
      //   22: getfield c : Lcom/facebook/react/views/text/p;
      //   25: aload #13
      //   27: fload_2
      //   28: aload_3
      //   29: invokestatic a : (Lcom/facebook/react/views/text/p;Landroid/text/Spannable;FLcom/facebook/yoga/n;)Landroid/text/Layout;
      //   32: astore_1
      //   33: aload_0
      //   34: getfield c : Lcom/facebook/react/views/text/p;
      //   37: astore #14
      //   39: aload_1
      //   40: astore #12
      //   42: aload #14
      //   44: getfield T : Z
      //   47: ifeq -> 325
      //   50: aload #14
      //   52: getfield C : Lcom/facebook/react/views/text/y;
      //   55: invokevirtual b : ()I
      //   58: istore #9
      //   60: aload_0
      //   61: getfield c : Lcom/facebook/react/views/text/p;
      //   64: getfield C : Lcom/facebook/react/views/text/y;
      //   67: invokevirtual b : ()I
      //   70: istore #8
      //   72: aload_0
      //   73: getfield c : Lcom/facebook/react/views/text/p;
      //   76: getfield U : F
      //   79: fstore #6
      //   81: iload #9
      //   83: i2f
      //   84: fstore #7
      //   86: fload #6
      //   88: fload #7
      //   90: fmul
      //   91: ldc 4.0
      //   93: invokestatic b : (F)F
      //   96: invokestatic max : (FF)F
      //   99: f2i
      //   100: istore #10
      //   102: aload_1
      //   103: astore #12
      //   105: iload #8
      //   107: iload #10
      //   109: if_icmple -> 325
      //   112: aload_0
      //   113: getfield c : Lcom/facebook/react/views/text/p;
      //   116: getfield H : I
      //   119: iconst_m1
      //   120: if_icmpeq -> 143
      //   123: aload_1
      //   124: invokevirtual getLineCount : ()I
      //   127: aload_0
      //   128: getfield c : Lcom/facebook/react/views/text/p;
      //   131: getfield H : I
      //   134: if_icmpgt -> 140
      //   137: goto -> 143
      //   140: goto -> 168
      //   143: aload_1
      //   144: astore #12
      //   146: aload #5
      //   148: getstatic com/facebook/yoga/n.c : Lcom/facebook/yoga/n;
      //   151: if_acmpeq -> 325
      //   154: aload_1
      //   155: astore #12
      //   157: aload_1
      //   158: invokevirtual getHeight : ()I
      //   161: i2f
      //   162: fload #4
      //   164: fcmpl
      //   165: ifle -> 325
      //   168: iload #8
      //   170: fconst_1
      //   171: invokestatic b : (F)F
      //   174: f2i
      //   175: isub
      //   176: istore #9
      //   178: iload #9
      //   180: i2f
      //   181: fload #7
      //   183: fdiv
      //   184: fstore #6
      //   186: aload #13
      //   188: invokeinterface length : ()I
      //   193: istore #11
      //   195: iconst_0
      //   196: istore #8
      //   198: aload #13
      //   200: iconst_0
      //   201: iload #11
      //   203: ldc com/facebook/react/views/text/f
      //   205: invokeinterface getSpans : (IILjava/lang/Class;)[Ljava/lang/Object;
      //   210: checkcast [Lcom/facebook/react/views/text/f;
      //   213: astore_1
      //   214: aload_1
      //   215: arraylength
      //   216: istore #11
      //   218: iload #8
      //   220: iload #11
      //   222: if_icmpge -> 306
      //   225: aload_1
      //   226: iload #8
      //   228: aaload
      //   229: astore #12
      //   231: aload #13
      //   233: new com/facebook/react/views/text/f
      //   236: dup
      //   237: aload #12
      //   239: invokevirtual getSize : ()I
      //   242: i2f
      //   243: fload #6
      //   245: fmul
      //   246: iload #10
      //   248: i2f
      //   249: invokestatic max : (FF)F
      //   252: f2i
      //   253: invokespecial <init> : (I)V
      //   256: aload #13
      //   258: aload #12
      //   260: invokeinterface getSpanStart : (Ljava/lang/Object;)I
      //   265: aload #13
      //   267: aload #12
      //   269: invokeinterface getSpanEnd : (Ljava/lang/Object;)I
      //   274: aload #13
      //   276: aload #12
      //   278: invokeinterface getSpanFlags : (Ljava/lang/Object;)I
      //   283: invokeinterface setSpan : (Ljava/lang/Object;III)V
      //   288: aload #13
      //   290: aload #12
      //   292: invokeinterface removeSpan : (Ljava/lang/Object;)V
      //   297: iload #8
      //   299: iconst_1
      //   300: iadd
      //   301: istore #8
      //   303: goto -> 218
      //   306: aload_0
      //   307: getfield c : Lcom/facebook/react/views/text/p;
      //   310: aload #13
      //   312: fload_2
      //   313: aload_3
      //   314: invokestatic a : (Lcom/facebook/react/views/text/p;Landroid/text/Spannable;FLcom/facebook/yoga/n;)Landroid/text/Layout;
      //   317: astore_1
      //   318: iload #9
      //   320: istore #8
      //   322: goto -> 102
      //   325: aload_0
      //   326: getfield c : Lcom/facebook/react/views/text/p;
      //   329: invokestatic b : (Lcom/facebook/react/views/text/p;)Z
      //   332: ifeq -> 419
      //   335: aload_0
      //   336: getfield c : Lcom/facebook/react/views/text/p;
      //   339: invokevirtual h : ()Lcom/facebook/react/uimanager/k0;
      //   342: astore_1
      //   343: aload #13
      //   345: aload #12
      //   347: invokestatic Q : ()Landroid/text/TextPaint;
      //   350: aload_1
      //   351: invokestatic a : (Ljava/lang/CharSequence;Landroid/text/Layout;Landroid/text/TextPaint;Landroid/content/Context;)Lcom/facebook/react/bridge/WritableArray;
      //   354: astore_3
      //   355: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
      //   358: astore #5
      //   360: aload #5
      //   362: ldc 'lines'
      //   364: aload_3
      //   365: invokeinterface putArray : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
      //   370: aload_1
      //   371: invokevirtual hasActiveCatalystInstance : ()Z
      //   374: ifeq -> 405
      //   377: aload_1
      //   378: ldc com/facebook/react/uimanager/events/RCTEventEmitter
      //   380: invokevirtual getJSModule : (Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;
      //   383: checkcast com/facebook/react/uimanager/events/RCTEventEmitter
      //   386: aload_0
      //   387: getfield c : Lcom/facebook/react/views/text/p;
      //   390: invokevirtual t : ()I
      //   393: ldc 'topTextLayout'
      //   395: aload #5
      //   397: invokeinterface receiveEvent : (ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
      //   402: goto -> 419
      //   405: ldc 'ReactTextShadowNode'
      //   407: new com/facebook/react/bridge/ReactNoCrashSoftException
      //   410: dup
      //   411: ldc 'Cannot get RCTEventEmitter, no CatalystInstance'
      //   413: invokespecial <init> : (Ljava/lang/String;)V
      //   416: invokestatic logSoftException : (Ljava/lang/String;Ljava/lang/Throwable;)V
      //   419: aload_0
      //   420: getfield c : Lcom/facebook/react/views/text/p;
      //   423: getfield H : I
      //   426: istore #8
      //   428: iload #8
      //   430: iconst_m1
      //   431: if_icmpeq -> 475
      //   434: iload #8
      //   436: aload #12
      //   438: invokevirtual getLineCount : ()I
      //   441: if_icmpge -> 475
      //   444: aload #12
      //   446: invokevirtual getWidth : ()I
      //   449: istore #8
      //   451: aload #12
      //   453: aload_0
      //   454: getfield c : Lcom/facebook/react/views/text/p;
      //   457: getfield H : I
      //   460: iconst_1
      //   461: isub
      //   462: invokevirtual getLineBottom : (I)I
      //   465: istore #9
      //   467: iload #8
      //   469: iload #9
      //   471: invokestatic a : (II)J
      //   474: lreturn
      //   475: aload #12
      //   477: invokevirtual getWidth : ()I
      //   480: istore #8
      //   482: aload #12
      //   484: invokevirtual getHeight : ()I
      //   487: istore #9
      //   489: goto -> 467
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */