package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.q;
import com.facebook.yoga.g;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b0 {
  private static final TextPaint a = new TextPaint(1);
  
  private static final Object b = new Object();
  
  private static LruCache<String, Spannable> c = new LruCache(100);
  
  public static long a(Context paramContext, ReadableMap paramReadableMap1, ReadableMap paramReadableMap2, float paramFloat1, n paramn1, float paramFloat2, n paramn2, s params, int[] paramArrayOfint) {
    TextPaint textPaint = a;
    Spannable spannable = b(paramContext, paramReadableMap1, params);
    int i = x.h(paramReadableMap2.getString("textBreakStrategy"));
    if (spannable != null) {
      StaticLayout staticLayout;
      Object object;
      int k;
      BoringLayout.Metrics metrics = BoringLayout.isBoring((CharSequence)spannable, textPaint);
      if (metrics == null) {
        paramFloat2 = Layout.getDesiredWidth((CharSequence)spannable, textPaint);
      } else {
        paramFloat2 = Float.NaN;
      } 
      if (paramn1 == n.c || paramFloat1 < 0.0F) {
        j = 1;
      } else {
        j = 0;
      } 
      int m = spannable.length();
      if (metrics == null && (j || (!g.a(paramFloat2) && paramFloat2 <= paramFloat1))) {
        j = (int)Math.ceil(paramFloat2);
        if (Build.VERSION.SDK_INT < 23) {
          staticLayout = new StaticLayout((CharSequence)spannable, textPaint, j, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
        } else {
          StaticLayout.Builder builder = StaticLayout.Builder.obtain((CharSequence)spannable, 0, m, textPaint, j);
          staticLayout = builder.setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0F, 1.0F).setIncludePad(true).setBreakStrategy(i).setHyphenationFrequency(1).build();
        } 
      } else if (staticLayout != null && (j != 0 || ((BoringLayout.Metrics)staticLayout).width <= paramFloat1)) {
        BoringLayout boringLayout = BoringLayout.make((CharSequence)spannable, textPaint, ((BoringLayout.Metrics)staticLayout).width, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, (BoringLayout.Metrics)staticLayout, true);
      } else if (Build.VERSION.SDK_INT < 23) {
        staticLayout = new StaticLayout((CharSequence)spannable, textPaint, (int)paramFloat1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
      } else {
        StaticLayout.Builder builder = StaticLayout.Builder.obtain((CharSequence)spannable, 0, m, textPaint, (int)paramFloat1);
        staticLayout = builder.setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0F, 1.0F).setIncludePad(true).setBreakStrategy(i).setHyphenationFrequency(1).build();
      } 
      if (paramReadableMap2.hasKey("maximumNumberOfLines")) {
        j = paramReadableMap2.getInt("maximumNumberOfLines");
      } else {
        j = -1;
      } 
      int i1 = staticLayout.getWidth();
      if (j != -1 && j != 0 && j < staticLayout.getLineCount()) {
        k = staticLayout.getLineBottom(j - 1);
      } else {
        k = staticLayout.getHeight();
      } 
      i = 0;
      int j;
      for (j = 0; object < m; j = i2) {
        int i4 = spannable.nextSpanTransition(object, m, a0.class);
        a0[] arrayOfA0 = (a0[])spannable.getSpans(object, i4, a0.class);
        int i5 = arrayOfA0.length;
        int i3 = 0;
        int i2 = j;
        while (true)
          i3++; 
        continue;
        object1 = SYNTHETIC_LOCAL_VARIABLE_14;
        i2 = i;
        object = object1;
      } 
      return o.a(q.d(i1), q.d(k));
    } 
    IllegalStateException illegalStateException = new IllegalStateException("Spannable element has not been prepared in onBeforeLayout");
    throw illegalStateException;
  }
  
  private static Spannable a(Context paramContext, ReadableMap paramReadableMap, s params) {
    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
    ArrayList<a> arrayList = new ArrayList();
    a(paramContext, paramReadableMap.getArray("fragments"), spannableStringBuilder, arrayList);
    Iterator<a> iterator = arrayList.iterator();
    for (int i = 0; iterator.hasNext(); i++)
      ((a)iterator.next()).a(spannableStringBuilder, i); 
    if (params != null)
      params.a((Spannable)spannableStringBuilder); 
    return (Spannable)spannableStringBuilder;
  }
  
  private static void a(Context paramContext, ReadableArray paramReadableArray, SpannableStringBuilder paramSpannableStringBuilder, List<a> paramList) {
    int i = paramReadableArray.size();
    int j;
    for (j = 0; j < i; j++) {
      ReadableMap readableMap = paramReadableArray.getMap(j);
      int k = paramSpannableStringBuilder.length();
      x x = new x(new c0(readableMap.getMap("textAttributes")));
      paramSpannableStringBuilder.append(c0.a(readableMap.getString("string"), x.k));
      int m = paramSpannableStringBuilder.length();
      int n = readableMap.getInt("reactTag");
      if (readableMap.hasKey("isAttachment") && readableMap.getBoolean("isAttachment")) {
        float f1 = q.b(readableMap.getDouble("width"));
        float f2 = q.b(readableMap.getDouble("height"));
        paramList.add(new a(paramSpannableStringBuilder.length() - 1, paramSpannableStringBuilder.length(), new a0(n, (int)f1, (int)f2)));
      } else if (m >= k) {
        if (x.b)
          paramList.add(new a(k, m, new j(x.d))); 
        if (x.e)
          paramList.add(new a(k, m, new g(x.f))); 
        if (Build.VERSION.SDK_INT >= 21 && !Float.isNaN(x.b()))
          paramList.add(new a(k, m, new a(x.b()))); 
        paramList.add(new a(k, m, new f(x.g)));
        if (x.r != -1 || x.s != -1 || x.t != null)
          paramList.add(new a(k, m, new c(x.r, x.s, x.u, x.t, paramContext.getAssets()))); 
        if (x.p)
          paramList.add(new a(k, m, new u())); 
        if (x.q)
          paramList.add(new a(k, m, new m())); 
        if (x.l != 0.0F || x.m != 0.0F)
          paramList.add(new a(k, m, new w(x.l, x.m, x.n, x.o))); 
        if (!Float.isNaN(x.a()))
          paramList.add(new a(k, m, new b(x.a()))); 
        paramList.add(new a(k, m, new n(n)));
      } 
    } 
  }
  
  public static Spannable b(Context paramContext, ReadableMap paramReadableMap, s params) {
    String str = paramReadableMap.toString();
    synchronized (b) {
      Spannable spannable = (Spannable)c.get(str);
      if (spannable != null)
        return spannable; 
      null = a(paramContext, paramReadableMap, params);
      synchronized (b) {
        c.put(str, null);
        return null;
      } 
    } 
  }
  
  public static class a {
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */