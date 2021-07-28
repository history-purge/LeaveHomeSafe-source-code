package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.u0;
import androidx.appcompat.widget.z;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.v;
import com.facebook.react.views.view.e;
import java.util.Comparator;

public class r extends z implements v {
  private static final ViewGroup.LayoutParams r = new ViewGroup.LayoutParams(0, 0);
  
  private boolean g;
  
  private int h = getGravity() & 0x800007;
  
  private int i = getGravity() & 0x70;
  
  private int j = 0;
  
  private int k = Integer.MAX_VALUE;
  
  private TextUtils.TruncateAt l = TextUtils.TruncateAt.END;
  
  private boolean m = false;
  
  private int n = 0;
  
  private boolean o;
  
  private e p = new e((View)this);
  
  private Spannable q;
  
  public r(Context paramContext) {
    super(paramContext);
  }
  
  private static WritableMap a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    WritableMap writableMap = Arguments.createMap();
    if (paramInt1 == 8) {
      String str1 = "gone";
      writableMap.putString("visibility", str1);
      writableMap.putInt("index", paramInt2);
      return writableMap;
    } 
    if (paramInt1 == 0) {
      writableMap.putString("visibility", "visible");
      writableMap.putInt("index", paramInt2);
      writableMap.putDouble("left", q.a(paramInt3));
      writableMap.putDouble("top", q.a(paramInt4));
      writableMap.putDouble("right", q.a(paramInt5));
      writableMap.putDouble("bottom", q.a(paramInt6));
      return writableMap;
    } 
    String str = "unknown";
    writableMap.putString("visibility", str);
    writableMap.putInt("index", paramInt2);
    return writableMap;
  }
  
  private ReactContext getReactContext() {
    Context context2 = getContext();
    Context context1 = context2;
    if (context2 instanceof u0)
      context1 = ((u0)context2).getBaseContext(); 
    return (ReactContext)context1;
  }
  
  public int a(float paramFloat1, float paramFloat2) {
    CharSequence charSequence = getText();
    int i = getId();
    int j = (int)paramFloat1;
    int k = (int)paramFloat2;
    Layout layout = getLayout();
    if (layout == null)
      return i; 
    k = layout.getLineForVertical(k);
    int n = (int)layout.getLineLeft(k);
    int i1 = (int)layout.getLineRight(k);
    int m = i;
    if (charSequence instanceof Spanned) {
      m = i;
      if (j >= n) {
        m = i;
        if (j <= i1) {
          Spanned spanned = (Spanned)charSequence;
          paramFloat1 = j;
          try {
            int i2 = layout.getOffsetForHorizontal(k, paramFloat1);
            n[] arrayOfN = (n[])spanned.getSpans(i2, i2, n.class);
            m = i;
            if (arrayOfN != null) {
              k = charSequence.length();
              j = 0;
              while (true) {
                m = i;
                if (j < arrayOfN.length) {
                  i1 = spanned.getSpanStart(arrayOfN[j]);
                  int i3 = spanned.getSpanEnd(arrayOfN[j]);
                  n = k;
                  m = i;
                  if (i3 > i2) {
                    i1 = i3 - i1;
                    n = k;
                    m = i;
                    if (i1 <= k) {
                      m = arrayOfN[j].a();
                      n = i1;
                    } 
                  } 
                  j++;
                  k = n;
                  i = m;
                  continue;
                } 
                break;
              } 
            } 
          } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Crash in HorizontalMeasurementProvider: ");
            stringBuilder.append(arrayIndexOutOfBoundsException.getMessage());
            e.e.e.e.a.b("ReactNative", stringBuilder.toString());
            m = i;
          } 
        } 
      } 
    } 
    return m;
  }
  
  public void a(float paramFloat, int paramInt) {
    this.p.a(paramFloat, paramInt);
  }
  
  public void a(int paramInt, float paramFloat) {
    this.p.a(paramInt, paramFloat);
  }
  
  public void a(int paramInt, float paramFloat1, float paramFloat2) {
    this.p.a(paramInt, paramFloat1, paramFloat2);
  }
  
  public void d() {
    TextUtils.TruncateAt truncateAt;
    if (this.k == Integer.MAX_VALUE || this.m) {
      truncateAt = null;
    } else {
      truncateAt = this.l;
    } 
    setEllipsize(truncateAt);
  }
  
  public Spannable getSpanned() {
    return this.q;
  }
  
  public boolean hasOverlappingRendering() {
    return false;
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    if (this.g && getText() instanceof Spanned) {
      Spanned spanned = (Spanned)getText();
      int j = spanned.length();
      int i = 0;
      z[] arrayOfZ = (z[])spanned.getSpans(0, j, z.class);
      j = arrayOfZ.length;
      while (i < j) {
        if (arrayOfZ[i].a() == paramDrawable)
          invalidate(); 
        i++;
      } 
    } 
    super.invalidateDrawable(paramDrawable);
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.g && getText() instanceof Spanned) {
      Spanned spanned = (Spanned)getText();
      int j = spanned.length();
      int i = 0;
      z[] arrayOfZ = (z[])spanned.getSpans(0, j, z.class);
      j = arrayOfZ.length;
      while (i < j) {
        arrayOfZ[i].c();
        i++;
      } 
    } 
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if (this.g && getText() instanceof Spanned) {
      Spanned spanned = (Spanned)getText();
      int j = spanned.length();
      int i = 0;
      z[] arrayOfZ = (z[])spanned.getSpans(0, j, z.class);
      j = arrayOfZ.length;
      while (i < j) {
        arrayOfZ[i].d();
        i++;
      } 
    } 
  }
  
  public void onFinishTemporaryDetach() {
    super.onFinishTemporaryDetach();
    if (this.g && getText() instanceof Spanned) {
      Spanned spanned = (Spanned)getText();
      int j = spanned.length();
      int i = 0;
      z[] arrayOfZ = (z[])spanned.getSpans(0, j, z.class);
      j = arrayOfZ.length;
      while (i < j) {
        arrayOfZ[i].e();
        i++;
      } 
    } 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   4: instanceof android/text/Spanned
    //   7: ifeq -> 733
    //   10: aload_0
    //   11: invokevirtual getId : ()I
    //   14: invokestatic a : (I)I
    //   17: iconst_2
    //   18: if_icmpne -> 22
    //   21: return
    //   22: aload_0
    //   23: invokespecial getReactContext : ()Lcom/facebook/react/bridge/ReactContext;
    //   26: astore #22
    //   28: aload #22
    //   30: ldc_w com/facebook/react/uimanager/UIManagerModule
    //   33: invokevirtual getNativeModule : (Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;
    //   36: checkcast com/facebook/react/uimanager/UIManagerModule
    //   39: astore #21
    //   41: aload_0
    //   42: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   45: checkcast android/text/Spanned
    //   48: astore #23
    //   50: aload_0
    //   51: invokevirtual getLayout : ()Landroid/text/Layout;
    //   54: astore #24
    //   56: aload #23
    //   58: iconst_0
    //   59: aload #23
    //   61: invokeinterface length : ()I
    //   66: ldc_w com/facebook/react/views/text/a0
    //   69: invokeinterface getSpans : (IILjava/lang/Class;)[Ljava/lang/Object;
    //   74: checkcast [Lcom/facebook/react/views/text/a0;
    //   77: astore #20
    //   79: aload_0
    //   80: getfield o : Z
    //   83: ifeq -> 101
    //   86: new java/util/ArrayList
    //   89: dup
    //   90: aload #20
    //   92: arraylength
    //   93: invokespecial <init> : (I)V
    //   96: astore #19
    //   98: goto -> 104
    //   101: aconst_null
    //   102: astore #19
    //   104: iload #4
    //   106: iload_2
    //   107: isub
    //   108: istore #14
    //   110: aload #20
    //   112: arraylength
    //   113: istore #8
    //   115: iconst_0
    //   116: istore #9
    //   118: iload #9
    //   120: iload #8
    //   122: if_icmpge -> 629
    //   125: aload #20
    //   127: iload #9
    //   129: aaload
    //   130: astore #25
    //   132: aload #21
    //   134: aload #25
    //   136: invokevirtual b : ()I
    //   139: invokevirtual resolveView : (I)Landroid/view/View;
    //   142: astore #26
    //   144: aload #23
    //   146: aload #25
    //   148: invokeinterface getSpanStart : (Ljava/lang/Object;)I
    //   153: istore #15
    //   155: aload #24
    //   157: iload #15
    //   159: invokevirtual getLineForOffset : (I)I
    //   162: istore #11
    //   164: aload #24
    //   166: iload #11
    //   168: invokevirtual getEllipsisCount : (I)I
    //   171: istore #4
    //   173: iconst_1
    //   174: istore #10
    //   176: iload #4
    //   178: ifle -> 187
    //   181: iconst_1
    //   182: istore #4
    //   184: goto -> 190
    //   187: iconst_0
    //   188: istore #4
    //   190: iload #4
    //   192: ifeq -> 215
    //   195: iload #15
    //   197: aload #24
    //   199: iload #11
    //   201: invokevirtual getLineStart : (I)I
    //   204: aload #24
    //   206: iload #11
    //   208: invokevirtual getEllipsisStart : (I)I
    //   211: iadd
    //   212: if_icmpge -> 569
    //   215: iload #11
    //   217: aload_0
    //   218: getfield k : I
    //   221: if_icmpge -> 569
    //   224: iload #15
    //   226: aload #24
    //   228: iload #11
    //   230: invokevirtual getLineEnd : (I)I
    //   233: if_icmplt -> 239
    //   236: goto -> 569
    //   239: aload #25
    //   241: invokevirtual c : ()I
    //   244: istore #12
    //   246: aload #25
    //   248: invokevirtual a : ()I
    //   251: istore #13
    //   253: aload #24
    //   255: iload #15
    //   257: invokevirtual isRtlCharAt : (I)Z
    //   260: istore #18
    //   262: aload #24
    //   264: iload #11
    //   266: invokevirtual getParagraphDirection : (I)I
    //   269: iconst_m1
    //   270: if_icmpne -> 278
    //   273: iconst_1
    //   274: istore_1
    //   275: goto -> 280
    //   278: iconst_0
    //   279: istore_1
    //   280: iload #15
    //   282: aload #23
    //   284: invokeinterface length : ()I
    //   289: iconst_1
    //   290: isub
    //   291: if_icmpne -> 327
    //   294: iload_1
    //   295: ifeq -> 314
    //   298: iload #14
    //   300: aload #24
    //   302: iload #11
    //   304: invokevirtual getLineWidth : (I)F
    //   307: f2i
    //   308: isub
    //   309: istore #7
    //   311: goto -> 412
    //   314: aload #24
    //   316: iload #11
    //   318: invokevirtual getLineRight : (I)F
    //   321: f2i
    //   322: istore #4
    //   324: goto -> 405
    //   327: iload_1
    //   328: iload #18
    //   330: if_icmpne -> 339
    //   333: iconst_1
    //   334: istore #4
    //   336: goto -> 342
    //   339: iconst_0
    //   340: istore #4
    //   342: iload #4
    //   344: ifeq -> 359
    //   347: aload #24
    //   349: iload #15
    //   351: invokevirtual getPrimaryHorizontal : (I)F
    //   354: fstore #6
    //   356: goto -> 368
    //   359: aload #24
    //   361: iload #15
    //   363: invokevirtual getSecondaryHorizontal : (I)F
    //   366: fstore #6
    //   368: fload #6
    //   370: f2i
    //   371: istore #4
    //   373: iload_1
    //   374: ifeq -> 396
    //   377: iload #14
    //   379: aload #24
    //   381: iload #11
    //   383: invokevirtual getLineRight : (I)F
    //   386: f2i
    //   387: iload #4
    //   389: isub
    //   390: isub
    //   391: istore #4
    //   393: goto -> 396
    //   396: iload #4
    //   398: istore #7
    //   400: iload #18
    //   402: ifeq -> 412
    //   405: iload #4
    //   407: iload #12
    //   409: isub
    //   410: istore #7
    //   412: iload #18
    //   414: ifeq -> 426
    //   417: aload_0
    //   418: invokevirtual getTotalPaddingRight : ()I
    //   421: istore #4
    //   423: goto -> 432
    //   426: aload_0
    //   427: invokevirtual getTotalPaddingLeft : ()I
    //   430: istore #4
    //   432: iload #7
    //   434: iload #4
    //   436: iadd
    //   437: istore #16
    //   439: iload_2
    //   440: iload #16
    //   442: iadd
    //   443: istore #7
    //   445: aload_0
    //   446: invokevirtual getTotalPaddingTop : ()I
    //   449: aload #24
    //   451: iload #11
    //   453: invokevirtual getLineBaseline : (I)I
    //   456: iadd
    //   457: iload #13
    //   459: isub
    //   460: istore #17
    //   462: iload_3
    //   463: iload #17
    //   465: iadd
    //   466: istore #11
    //   468: iload #10
    //   470: istore #4
    //   472: iload #14
    //   474: iload #16
    //   476: if_icmple -> 498
    //   479: iload #5
    //   481: iload_3
    //   482: isub
    //   483: iload #17
    //   485: if_icmpgt -> 495
    //   488: iload #10
    //   490: istore #4
    //   492: goto -> 498
    //   495: iconst_0
    //   496: istore #4
    //   498: iload #4
    //   500: ifeq -> 510
    //   503: bipush #8
    //   505: istore #4
    //   507: goto -> 513
    //   510: iconst_0
    //   511: istore #4
    //   513: iload #12
    //   515: iload #7
    //   517: iadd
    //   518: istore #12
    //   520: iload #11
    //   522: iload #13
    //   524: iadd
    //   525: istore #13
    //   527: aload #26
    //   529: iload #4
    //   531: invokevirtual setVisibility : (I)V
    //   534: aload #26
    //   536: iload #7
    //   538: iload #11
    //   540: iload #12
    //   542: iload #13
    //   544: invokevirtual layout : (IIII)V
    //   547: aload_0
    //   548: getfield o : Z
    //   551: ifeq -> 620
    //   554: iload #11
    //   556: istore #10
    //   558: iload #12
    //   560: istore #11
    //   562: iload #13
    //   564: istore #12
    //   566: goto -> 599
    //   569: aload #26
    //   571: bipush #8
    //   573: invokevirtual setVisibility : (I)V
    //   576: aload_0
    //   577: getfield o : Z
    //   580: ifeq -> 620
    //   583: bipush #8
    //   585: istore #4
    //   587: iconst_m1
    //   588: istore #7
    //   590: iconst_m1
    //   591: istore #10
    //   593: iconst_m1
    //   594: istore #11
    //   596: iconst_m1
    //   597: istore #12
    //   599: aload #19
    //   601: iload #4
    //   603: iload #15
    //   605: iload #7
    //   607: iload #10
    //   609: iload #11
    //   611: iload #12
    //   613: invokestatic a : (IIIIII)Lcom/facebook/react/bridge/WritableMap;
    //   616: invokevirtual add : (Ljava/lang/Object;)Z
    //   619: pop
    //   620: iload #9
    //   622: iconst_1
    //   623: iadd
    //   624: istore #9
    //   626: goto -> 118
    //   629: aload_0
    //   630: getfield o : Z
    //   633: ifeq -> 733
    //   636: aload #19
    //   638: new com/facebook/react/views/text/r$a
    //   641: dup
    //   642: aload_0
    //   643: invokespecial <init> : (Lcom/facebook/react/views/text/r;)V
    //   646: invokestatic sort : (Ljava/util/List;Ljava/util/Comparator;)V
    //   649: invokestatic createArray : ()Lcom/facebook/react/bridge/WritableArray;
    //   652: astore #20
    //   654: aload #19
    //   656: invokevirtual iterator : ()Ljava/util/Iterator;
    //   659: astore #19
    //   661: aload #19
    //   663: invokeinterface hasNext : ()Z
    //   668: ifeq -> 691
    //   671: aload #20
    //   673: aload #19
    //   675: invokeinterface next : ()Ljava/lang/Object;
    //   680: checkcast com/facebook/react/bridge/WritableMap
    //   683: invokeinterface pushMap : (Lcom/facebook/react/bridge/ReadableMap;)V
    //   688: goto -> 661
    //   691: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   694: astore #19
    //   696: aload #19
    //   698: ldc_w 'inlineViews'
    //   701: aload #20
    //   703: invokeinterface putArray : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    //   708: aload #22
    //   710: ldc_w com/facebook/react/uimanager/events/RCTEventEmitter
    //   713: invokevirtual getJSModule : (Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;
    //   716: checkcast com/facebook/react/uimanager/events/RCTEventEmitter
    //   719: aload_0
    //   720: invokevirtual getId : ()I
    //   723: ldc_w 'topInlineViewLayout'
    //   726: aload #19
    //   728: invokeinterface receiveEvent : (ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    //   733: return
  }
  
  public void onStartTemporaryDetach() {
    super.onStartTemporaryDetach();
    if (this.g && getText() instanceof Spanned) {
      Spanned spanned = (Spanned)getText();
      int j = spanned.length();
      int i = 0;
      z[] arrayOfZ = (z[])spanned.getSpans(0, j, z.class);
      j = arrayOfZ.length;
      while (i < j) {
        arrayOfZ[i].f();
        i++;
      } 
    } 
  }
  
  public void setAdjustFontSizeToFit(boolean paramBoolean) {
    this.m = paramBoolean;
  }
  
  public void setBackgroundColor(int paramInt) {
    this.p.a(paramInt);
  }
  
  public void setBorderRadius(float paramFloat) {
    this.p.a(paramFloat);
  }
  
  public void setBorderStyle(String paramString) {
    this.p.a(paramString);
  }
  
  public void setEllipsizeLocation(TextUtils.TruncateAt paramTruncateAt) {
    this.l = paramTruncateAt;
  }
  
  void setGravityHorizontal(int paramInt) {
    int i = paramInt;
    if (paramInt == 0)
      i = this.h; 
    setGravity(i | getGravity() & 0xFFFFFFF8 & 0xFF7FFFF8);
  }
  
  void setGravityVertical(int paramInt) {
    int i = paramInt;
    if (paramInt == 0)
      i = this.i; 
    setGravity(i | getGravity() & 0xFFFFFF8F);
  }
  
  public void setLinkifyMask(int paramInt) {
    this.n = paramInt;
  }
  
  public void setNotifyOnInlineViewLayout(boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  public void setNumberOfLines(int paramInt) {
    int i = paramInt;
    if (paramInt == 0)
      i = Integer.MAX_VALUE; 
    this.k = i;
    paramInt = this.k;
    boolean bool = true;
    if (paramInt != 1)
      bool = false; 
    setSingleLine(bool);
    setMaxLines(this.k);
  }
  
  public void setSpanned(Spannable paramSpannable) {
    this.q = paramSpannable;
  }
  
  public void setText(q paramq) {
    this.g = paramq.a();
    if (getLayoutParams() == null)
      setLayoutParams(r); 
    Spannable spannable = paramq.j();
    int i = this.n;
    if (i > 0) {
      Linkify.addLinks(spannable, i);
      setMovementMethod(LinkMovementMethod.getInstance());
    } 
    setText((CharSequence)spannable);
    float f1 = paramq.e();
    float f2 = paramq.g();
    float f3 = paramq.f();
    float f4 = paramq.d();
    if (f1 != -1.0F && f4 != -1.0F && f3 != -1.0F && f4 != -1.0F)
      setPadding((int)Math.floor(f1), (int)Math.floor(f2), (int)Math.floor(f3), (int)Math.floor(f4)); 
    i = paramq.k();
    if (this.j != i)
      this.j = i; 
    setGravityHorizontal(this.j);
    if (Build.VERSION.SDK_INT >= 23 && getBreakStrategy() != paramq.l())
      setBreakStrategy(paramq.l()); 
    if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != paramq.c())
      setJustificationMode(paramq.c()); 
    requestLayout();
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable) {
    if (this.g && getText() instanceof Spanned) {
      Spanned spanned = (Spanned)getText();
      int j = spanned.length();
      int i = 0;
      z[] arrayOfZ = (z[])spanned.getSpans(0, j, z.class);
      j = arrayOfZ.length;
      while (i < j) {
        if (arrayOfZ[i].a() == paramDrawable)
          return true; 
        i++;
      } 
    } 
    return super.verifyDrawable(paramDrawable);
  }
  
  class a implements Comparator {
    a(r this$0) {}
    
    public int compare(Object param1Object1, Object param1Object2) {
      param1Object1 = param1Object1;
      param1Object2 = param1Object2;
      return param1Object1.getInt("index") - param1Object2.getInt("index");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */