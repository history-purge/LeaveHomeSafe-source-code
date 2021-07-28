package b.g.l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.b;

public class c implements Spannable {
  private final Spannable c;
  
  private final a d;
  
  private final PrecomputedText e;
  
  public a a() {
    return this.d;
  }
  
  public PrecomputedText b() {
    Spannable spannable = this.c;
    return (spannable instanceof PrecomputedText) ? (PrecomputedText)spannable : null;
  }
  
  public char charAt(int paramInt) {
    return this.c.charAt(paramInt);
  }
  
  public int getSpanEnd(Object paramObject) {
    return this.c.getSpanEnd(paramObject);
  }
  
  public int getSpanFlags(Object paramObject) {
    return this.c.getSpanFlags(paramObject);
  }
  
  public int getSpanStart(Object paramObject) {
    return this.c.getSpanStart(paramObject);
  }
  
  @SuppressLint({"NewApi"})
  public <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass) {
    return (T[])((Build.VERSION.SDK_INT >= 29) ? this.e.getSpans(paramInt1, paramInt2, paramClass) : this.c.getSpans(paramInt1, paramInt2, paramClass));
  }
  
  public int length() {
    return this.c.length();
  }
  
  public int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass) {
    return this.c.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }
  
  @SuppressLint({"NewApi"})
  public void removeSpan(Object paramObject) {
    if (!(paramObject instanceof android.text.style.MetricAffectingSpan)) {
      if (Build.VERSION.SDK_INT >= 29) {
        this.e.removeSpan(paramObject);
        return;
      } 
      this.c.removeSpan(paramObject);
      return;
    } 
    throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
  }
  
  @SuppressLint({"NewApi"})
  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3) {
    if (!(paramObject instanceof android.text.style.MetricAffectingSpan)) {
      if (Build.VERSION.SDK_INT >= 29) {
        this.e.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
        return;
      } 
      this.c.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
      return;
    } 
    throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2) {
    return this.c.subSequence(paramInt1, paramInt2);
  }
  
  public String toString() {
    return this.c.toString();
  }
  
  public static final class a {
    private final TextPaint a;
    
    private final TextDirectionHeuristic b;
    
    private final int c;
    
    private final int d;
    
    public a(PrecomputedText.Params param1Params) {
      this.a = param1Params.getTextPaint();
      this.b = param1Params.getTextDirection();
      this.c = param1Params.getBreakStrategy();
      this.d = param1Params.getHyphenationFrequency();
      int i = Build.VERSION.SDK_INT;
    }
    
    @SuppressLint({"NewApi"})
    a(TextPaint param1TextPaint, TextDirectionHeuristic param1TextDirectionHeuristic, int param1Int1, int param1Int2) {
      if (Build.VERSION.SDK_INT >= 29)
        (new PrecomputedText.Params.Builder(param1TextPaint)).setBreakStrategy(param1Int1).setHyphenationFrequency(param1Int2).setTextDirection(param1TextDirectionHeuristic).build(); 
      this.a = param1TextPaint;
      this.b = param1TextDirectionHeuristic;
      this.c = param1Int1;
      this.d = param1Int2;
    }
    
    public int a() {
      return this.c;
    }
    
    public boolean a(a param1a) {
      if (Build.VERSION.SDK_INT >= 23) {
        if (this.c != param1a.a())
          return false; 
        if (this.d != param1a.b())
          return false; 
      } 
      if (this.a.getTextSize() != param1a.d().getTextSize())
        return false; 
      if (this.a.getTextScaleX() != param1a.d().getTextScaleX())
        return false; 
      if (this.a.getTextSkewX() != param1a.d().getTextSkewX())
        return false; 
      if (Build.VERSION.SDK_INT >= 21) {
        if (this.a.getLetterSpacing() != param1a.d().getLetterSpacing())
          return false; 
        if (!TextUtils.equals(this.a.getFontFeatureSettings(), param1a.d().getFontFeatureSettings()))
          return false; 
      } 
      if (this.a.getFlags() != param1a.d().getFlags())
        return false; 
      int i = Build.VERSION.SDK_INT;
      if (i >= 24) {
        if (!this.a.getTextLocales().equals(param1a.d().getTextLocales()))
          return false; 
      } else if (i >= 17 && !this.a.getTextLocale().equals(param1a.d().getTextLocale())) {
        return false;
      } 
      if (this.a.getTypeface() == null) {
        if (param1a.d().getTypeface() != null)
          return false; 
      } else if (!this.a.getTypeface().equals(param1a.d().getTypeface())) {
        return false;
      } 
      return true;
    }
    
    public int b() {
      return this.d;
    }
    
    public TextDirectionHeuristic c() {
      return this.b;
    }
    
    public TextPaint d() {
      return this.a;
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object == this)
        return true; 
      if (!(param1Object instanceof a))
        return false; 
      param1Object = param1Object;
      return !a((a)param1Object) ? false : (!(Build.VERSION.SDK_INT >= 18 && this.b != param1Object.c()));
    }
    
    public int hashCode() {
      int i = Build.VERSION.SDK_INT;
      return (i >= 24) ? b.a(new Object[] { 
            Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), 
            Integer.valueOf(this.d) }) : ((i >= 21) ? b.a(new Object[] { 
            Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), 
            Integer.valueOf(this.d) }) : ((i >= 18) ? b.a(new Object[] { Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d) }) : ((i >= 17) ? b.a(new Object[] { Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d) }) : b.a(new Object[] { Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d) }))));
    }
    
    public String toString() {
      // Byte code:
      //   0: new java/lang/StringBuilder
      //   3: dup
      //   4: ldc '{'
      //   6: invokespecial <init> : (Ljava/lang/String;)V
      //   9: astore #4
      //   11: new java/lang/StringBuilder
      //   14: dup
      //   15: invokespecial <init> : ()V
      //   18: astore_2
      //   19: aload_2
      //   20: ldc 'textSize='
      //   22: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   25: pop
      //   26: aload_2
      //   27: aload_0
      //   28: getfield a : Landroid/text/TextPaint;
      //   31: invokevirtual getTextSize : ()F
      //   34: invokevirtual append : (F)Ljava/lang/StringBuilder;
      //   37: pop
      //   38: aload #4
      //   40: aload_2
      //   41: invokevirtual toString : ()Ljava/lang/String;
      //   44: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   47: pop
      //   48: new java/lang/StringBuilder
      //   51: dup
      //   52: invokespecial <init> : ()V
      //   55: astore_2
      //   56: aload_2
      //   57: ldc ', textScaleX='
      //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   62: pop
      //   63: aload_2
      //   64: aload_0
      //   65: getfield a : Landroid/text/TextPaint;
      //   68: invokevirtual getTextScaleX : ()F
      //   71: invokevirtual append : (F)Ljava/lang/StringBuilder;
      //   74: pop
      //   75: aload #4
      //   77: aload_2
      //   78: invokevirtual toString : ()Ljava/lang/String;
      //   81: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   84: pop
      //   85: new java/lang/StringBuilder
      //   88: dup
      //   89: invokespecial <init> : ()V
      //   92: astore_2
      //   93: aload_2
      //   94: ldc ', textSkewX='
      //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   99: pop
      //   100: aload_2
      //   101: aload_0
      //   102: getfield a : Landroid/text/TextPaint;
      //   105: invokevirtual getTextSkewX : ()F
      //   108: invokevirtual append : (F)Ljava/lang/StringBuilder;
      //   111: pop
      //   112: aload #4
      //   114: aload_2
      //   115: invokevirtual toString : ()Ljava/lang/String;
      //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   121: pop
      //   122: getstatic android/os/Build$VERSION.SDK_INT : I
      //   125: bipush #21
      //   127: if_icmplt -> 204
      //   130: new java/lang/StringBuilder
      //   133: dup
      //   134: invokespecial <init> : ()V
      //   137: astore_2
      //   138: aload_2
      //   139: ldc ', letterSpacing='
      //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   144: pop
      //   145: aload_2
      //   146: aload_0
      //   147: getfield a : Landroid/text/TextPaint;
      //   150: invokevirtual getLetterSpacing : ()F
      //   153: invokevirtual append : (F)Ljava/lang/StringBuilder;
      //   156: pop
      //   157: aload #4
      //   159: aload_2
      //   160: invokevirtual toString : ()Ljava/lang/String;
      //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   166: pop
      //   167: new java/lang/StringBuilder
      //   170: dup
      //   171: invokespecial <init> : ()V
      //   174: astore_2
      //   175: aload_2
      //   176: ldc ', elegantTextHeight='
      //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   181: pop
      //   182: aload_2
      //   183: aload_0
      //   184: getfield a : Landroid/text/TextPaint;
      //   187: invokevirtual isElegantTextHeight : ()Z
      //   190: invokevirtual append : (Z)Ljava/lang/StringBuilder;
      //   193: pop
      //   194: aload #4
      //   196: aload_2
      //   197: invokevirtual toString : ()Ljava/lang/String;
      //   200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   203: pop
      //   204: getstatic android/os/Build$VERSION.SDK_INT : I
      //   207: istore_1
      //   208: iload_1
      //   209: bipush #24
      //   211: if_icmplt -> 256
      //   214: new java/lang/StringBuilder
      //   217: dup
      //   218: invokespecial <init> : ()V
      //   221: astore_2
      //   222: aload_2
      //   223: ldc ', textLocale='
      //   225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   228: pop
      //   229: aload_0
      //   230: getfield a : Landroid/text/TextPaint;
      //   233: invokevirtual getTextLocales : ()Landroid/os/LocaleList;
      //   236: astore_3
      //   237: aload_2
      //   238: aload_3
      //   239: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   242: pop
      //   243: aload #4
      //   245: aload_2
      //   246: invokevirtual toString : ()Ljava/lang/String;
      //   249: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   252: pop
      //   253: goto -> 288
      //   256: iload_1
      //   257: bipush #17
      //   259: if_icmplt -> 288
      //   262: new java/lang/StringBuilder
      //   265: dup
      //   266: invokespecial <init> : ()V
      //   269: astore_2
      //   270: aload_2
      //   271: ldc ', textLocale='
      //   273: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   276: pop
      //   277: aload_0
      //   278: getfield a : Landroid/text/TextPaint;
      //   281: invokevirtual getTextLocale : ()Ljava/util/Locale;
      //   284: astore_3
      //   285: goto -> 237
      //   288: new java/lang/StringBuilder
      //   291: dup
      //   292: invokespecial <init> : ()V
      //   295: astore_2
      //   296: aload_2
      //   297: ldc ', typeface='
      //   299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   302: pop
      //   303: aload_2
      //   304: aload_0
      //   305: getfield a : Landroid/text/TextPaint;
      //   308: invokevirtual getTypeface : ()Landroid/graphics/Typeface;
      //   311: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   314: pop
      //   315: aload #4
      //   317: aload_2
      //   318: invokevirtual toString : ()Ljava/lang/String;
      //   321: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   324: pop
      //   325: getstatic android/os/Build$VERSION.SDK_INT : I
      //   328: bipush #26
      //   330: if_icmplt -> 370
      //   333: new java/lang/StringBuilder
      //   336: dup
      //   337: invokespecial <init> : ()V
      //   340: astore_2
      //   341: aload_2
      //   342: ldc ', variationSettings='
      //   344: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   347: pop
      //   348: aload_2
      //   349: aload_0
      //   350: getfield a : Landroid/text/TextPaint;
      //   353: invokevirtual getFontVariationSettings : ()Ljava/lang/String;
      //   356: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   359: pop
      //   360: aload #4
      //   362: aload_2
      //   363: invokevirtual toString : ()Ljava/lang/String;
      //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   369: pop
      //   370: new java/lang/StringBuilder
      //   373: dup
      //   374: invokespecial <init> : ()V
      //   377: astore_2
      //   378: aload_2
      //   379: ldc ', textDir='
      //   381: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   384: pop
      //   385: aload_2
      //   386: aload_0
      //   387: getfield b : Landroid/text/TextDirectionHeuristic;
      //   390: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   393: pop
      //   394: aload #4
      //   396: aload_2
      //   397: invokevirtual toString : ()Ljava/lang/String;
      //   400: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   403: pop
      //   404: new java/lang/StringBuilder
      //   407: dup
      //   408: invokespecial <init> : ()V
      //   411: astore_2
      //   412: aload_2
      //   413: ldc ', breakStrategy='
      //   415: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   418: pop
      //   419: aload_2
      //   420: aload_0
      //   421: getfield c : I
      //   424: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   427: pop
      //   428: aload #4
      //   430: aload_2
      //   431: invokevirtual toString : ()Ljava/lang/String;
      //   434: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   437: pop
      //   438: new java/lang/StringBuilder
      //   441: dup
      //   442: invokespecial <init> : ()V
      //   445: astore_2
      //   446: aload_2
      //   447: ldc ', hyphenationFrequency='
      //   449: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   452: pop
      //   453: aload_2
      //   454: aload_0
      //   455: getfield d : I
      //   458: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   461: pop
      //   462: aload #4
      //   464: aload_2
      //   465: invokevirtual toString : ()Ljava/lang/String;
      //   468: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   471: pop
      //   472: aload #4
      //   474: ldc '}'
      //   476: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   479: pop
      //   480: aload #4
      //   482: invokevirtual toString : ()Ljava/lang/String;
      //   485: areturn
    }
    
    public static class a {
      private final TextPaint a;
      
      private TextDirectionHeuristic b;
      
      private int c;
      
      private int d;
      
      public a(TextPaint param2TextPaint) {
        this.a = param2TextPaint;
        if (Build.VERSION.SDK_INT >= 23) {
          this.c = 1;
          this.d = 1;
        } else {
          this.d = 0;
          this.c = 0;
        } 
        if (Build.VERSION.SDK_INT >= 18) {
          TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        } else {
          param2TextPaint = null;
        } 
        this.b = (TextDirectionHeuristic)param2TextPaint;
      }
      
      public a a(int param2Int) {
        this.c = param2Int;
        return this;
      }
      
      public a a(TextDirectionHeuristic param2TextDirectionHeuristic) {
        this.b = param2TextDirectionHeuristic;
        return this;
      }
      
      public c.a a() {
        return new c.a(this.a, this.b, this.c, this.d);
      }
      
      public a b(int param2Int) {
        this.d = param2Int;
        return this;
      }
    }
  }
  
  public static class a {
    private final TextPaint a;
    
    private TextDirectionHeuristic b;
    
    private int c;
    
    private int d;
    
    public a(TextPaint param1TextPaint) {
      this.a = param1TextPaint;
      if (Build.VERSION.SDK_INT >= 23) {
        this.c = 1;
        this.d = 1;
      } else {
        this.d = 0;
        this.c = 0;
      } 
      if (Build.VERSION.SDK_INT >= 18) {
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
      } else {
        param1TextPaint = null;
      } 
      this.b = (TextDirectionHeuristic)param1TextPaint;
    }
    
    public a a(int param1Int) {
      this.c = param1Int;
      return this;
    }
    
    public a a(TextDirectionHeuristic param1TextDirectionHeuristic) {
      this.b = param1TextDirectionHeuristic;
      return this;
    }
    
    public c.a a() {
      return new c.a(this.a, this.b, this.c, this.d);
    }
    
    public a b(int param1Int) {
      this.d = param1Int;
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/l/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */