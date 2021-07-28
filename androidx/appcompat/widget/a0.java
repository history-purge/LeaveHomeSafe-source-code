package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import b.a.j;
import b.g.m.v;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

class a0 {
  private static final RectF l = new RectF();
  
  private static ConcurrentHashMap<String, Method> m = new ConcurrentHashMap<String, Method>();
  
  private static ConcurrentHashMap<String, Field> n = new ConcurrentHashMap<String, Field>();
  
  private int a;
  
  private boolean b;
  
  private float c;
  
  private float d;
  
  private float e;
  
  private int[] f;
  
  private boolean g;
  
  private TextPaint h;
  
  private final TextView i;
  
  private final Context j;
  
  private final c k;
  
  a0(TextView paramTextView) {
    c c1;
    this.a = 0;
    this.b = false;
    this.c = -1.0F;
    this.d = -1.0F;
    this.e = -1.0F;
    this.f = new int[0];
    this.g = false;
    this.i = paramTextView;
    this.j = this.i.getContext();
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      c1 = new b();
    } else if (i >= 23) {
      c1 = new a();
    } else {
      c1 = new c();
    } 
    this.k = c1;
  }
  
  private int a(RectF paramRectF) {
    int i = this.f.length;
    if (i != 0) {
      int k = i - 1;
      i = 1;
      int j = 0;
      while (i <= k) {
        int m = (i + k) / 2;
        if (a(this.f[m], paramRectF)) {
          j = i;
          i = m + 1;
          continue;
        } 
        j = m - 1;
        k = j;
      } 
      return this.f[j];
    } 
    IllegalStateException illegalStateException = new IllegalStateException("No available text sizes to choose from.");
    throw illegalStateException;
  }
  
  private StaticLayout a(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt) {
    float f1 = ((Float)a(this.i, "mSpacingMult", Float.valueOf(1.0F))).floatValue();
    float f2 = ((Float)a(this.i, "mSpacingAdd", Float.valueOf(0.0F))).floatValue();
    boolean bool = ((Boolean)a(this.i, "mIncludePad", Boolean.valueOf(true))).booleanValue();
    return new StaticLayout(paramCharSequence, this.h, paramInt, paramAlignment, f1, f2, bool);
  }
  
  private static <T> T a(Object paramObject, String paramString, T paramT) {
    try {
      Field field = a(paramString);
      return (T)((field == null) ? (Object)paramT : field.get(paramObject));
    } catch (IllegalAccessException illegalAccessException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to access TextView#");
      stringBuilder.append(paramString);
      stringBuilder.append(" member");
      Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), illegalAccessException);
      return paramT;
    } 
  }
  
  private static Field a(String paramString) {
    try {
      Field field2 = n.get(paramString);
      Field field1 = field2;
      if (field2 == null) {
        field2 = TextView.class.getDeclaredField(paramString);
        field1 = field2;
        if (field2 != null) {
          field2.setAccessible(true);
          n.put(paramString, field2);
          field1 = field2;
        } 
      } 
      return field1;
    } catch (NoSuchFieldException noSuchFieldException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to access TextView#");
      stringBuilder.append(paramString);
      stringBuilder.append(" member");
      Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), noSuchFieldException);
      return null;
    } 
  }
  
  private void a(float paramFloat) {
    if (paramFloat != this.i.getPaint().getTextSize()) {
      boolean bool;
      this.i.getPaint().setTextSize(paramFloat);
      if (Build.VERSION.SDK_INT >= 18) {
        bool = this.i.isInLayout();
      } else {
        bool = false;
      } 
      if (this.i.getLayout() != null) {
        this.b = false;
        try {
          Method method = b("nullLayouts");
          if (method != null)
            method.invoke(this.i, new Object[0]); 
        } catch (Exception exception) {
          Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", exception);
        } 
        if (!bool) {
          this.i.requestLayout();
        } else {
          this.i.forceLayout();
        } 
        this.i.invalidate();
      } 
    } 
  }
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramFloat1 > 0.0F) {
      if (paramFloat2 > paramFloat1) {
        if (paramFloat3 > 0.0F) {
          this.a = 1;
          this.d = paramFloat1;
          this.e = paramFloat2;
          this.c = paramFloat3;
          this.g = false;
          return;
        } 
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("The auto-size step granularity (");
        stringBuilder2.append(paramFloat3);
        stringBuilder2.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(stringBuilder2.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Maximum auto-size text size (");
      stringBuilder1.append(paramFloat2);
      stringBuilder1.append("px) is less or equal to minimum auto-size text size (");
      stringBuilder1.append(paramFloat1);
      stringBuilder1.append("px)");
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Minimum auto-size text size (");
    stringBuilder.append(paramFloat1);
    stringBuilder.append("px) is less or equal to (0px)");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private void a(TypedArray paramTypedArray) {
    int i = paramTypedArray.length();
    int[] arrayOfInt = new int[i];
    if (i > 0) {
      for (int j = 0; j < i; j++)
        arrayOfInt[j] = paramTypedArray.getDimensionPixelSize(j, -1); 
      this.f = a(arrayOfInt);
      j();
    } 
  }
  
  private boolean a(int paramInt, RectF paramRectF) {
    byte b;
    CharSequence charSequence2 = this.i.getText();
    TransformationMethod transformationMethod = this.i.getTransformationMethod();
    CharSequence charSequence1 = charSequence2;
    if (transformationMethod != null) {
      CharSequence charSequence = transformationMethod.getTransformation(charSequence2, (View)this.i);
      charSequence1 = charSequence2;
      if (charSequence != null)
        charSequence1 = charSequence; 
    } 
    if (Build.VERSION.SDK_INT >= 16) {
      b = this.i.getMaxLines();
    } else {
      b = -1;
    } 
    a(paramInt);
    StaticLayout staticLayout = a(charSequence1, b(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(paramRectF.right), b);
    return (b != -1 && (staticLayout.getLineCount() > b || staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != charSequence1.length())) ? false : (!(staticLayout.getHeight() > paramRectF.bottom));
  }
  
  private int[] a(int[] paramArrayOfint) {
    int j = paramArrayOfint.length;
    if (j == 0)
      return paramArrayOfint; 
    Arrays.sort(paramArrayOfint);
    ArrayList<? extends Comparable<? super Integer>> arrayList = new ArrayList();
    boolean bool = false;
    int i;
    for (i = 0; i < j; i++) {
      int k = paramArrayOfint[i];
      if (k > 0 && Collections.binarySearch(arrayList, Integer.valueOf(k)) < 0)
        arrayList.add(Integer.valueOf(k)); 
    } 
    if (j == arrayList.size())
      return paramArrayOfint; 
    j = arrayList.size();
    paramArrayOfint = new int[j];
    for (i = bool; i < j; i++)
      paramArrayOfint[i] = ((Integer)arrayList.get(i)).intValue(); 
    return paramArrayOfint;
  }
  
  private StaticLayout b(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt) {
    float f1 = this.i.getLineSpacingMultiplier();
    float f2 = this.i.getLineSpacingExtra();
    boolean bool = this.i.getIncludeFontPadding();
    return new StaticLayout(paramCharSequence, this.h, paramInt, paramAlignment, f1, f2, bool);
  }
  
  private StaticLayout b(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt1, int paramInt2) {
    StaticLayout.Builder builder1 = StaticLayout.Builder.obtain(paramCharSequence, 0, paramCharSequence.length(), this.h, paramInt1);
    StaticLayout.Builder builder2 = builder1.setAlignment(paramAlignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
    paramInt1 = paramInt2;
    if (paramInt2 == -1)
      paramInt1 = Integer.MAX_VALUE; 
    builder2.setMaxLines(paramInt1);
    try {
      this.k.a(builder1, this.i);
    } catch (ClassCastException classCastException) {
      Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
    } 
    return builder1.build();
  }
  
  static <T> T b(Object paramObject, String paramString, T paramT) {
    try {
      return (T)b(paramString).invoke(paramObject, new Object[0]);
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to invoke TextView#");
      stringBuilder.append(paramString);
      stringBuilder.append("() method");
      Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), exception);
      return paramT;
    } finally {}
    throw paramObject;
  }
  
  private static Method b(String paramString) {
    try {
      Method method2 = m.get(paramString);
      Method method1 = method2;
      if (method2 == null) {
        method2 = TextView.class.getDeclaredMethod(paramString, new Class[0]);
        method1 = method2;
        if (method2 != null) {
          method2.setAccessible(true);
          m.put(paramString, method2);
          method1 = method2;
        } 
      } 
      return method1;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to retrieve TextView#");
      stringBuilder.append(paramString);
      stringBuilder.append("() method");
      Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), exception);
      return null;
    } 
  }
  
  private void h() {
    this.a = 0;
    this.d = -1.0F;
    this.e = -1.0F;
    this.c = -1.0F;
    this.f = new int[0];
    this.b = false;
  }
  
  private boolean i() {
    boolean bool = k();
    int i = 0;
    if (bool && this.a == 1) {
      if (!this.g || this.f.length == 0) {
        int j = (int)Math.floor(((this.e - this.d) / this.c)) + 1;
        int[] arrayOfInt = new int[j];
        while (i < j) {
          arrayOfInt[i] = Math.round(this.d + i * this.c);
          i++;
        } 
        this.f = a(arrayOfInt);
      } 
      this.b = true;
    } else {
      this.b = false;
    } 
    return this.b;
  }
  
  private boolean j() {
    boolean bool;
    int i = this.f.length;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.g = bool;
    if (this.g) {
      this.a = 1;
      int[] arrayOfInt = this.f;
      this.d = arrayOfInt[0];
      this.e = arrayOfInt[i - 1];
      this.c = -1.0F;
    } 
    return this.g;
  }
  
  private boolean k() {
    return this.i instanceof k ^ true;
  }
  
  StaticLayout a(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt1, int paramInt2) {
    int i = Build.VERSION.SDK_INT;
    return (i >= 23) ? b(paramCharSequence, paramAlignment, paramInt1, paramInt2) : ((i >= 16) ? b(paramCharSequence, paramAlignment, paramInt1) : a(paramCharSequence, paramAlignment, paramInt1));
  }
  
  void a() {
    if (!g())
      return; 
    if (this.b)
      if (this.i.getMeasuredHeight() > 0) {
        int i;
        if (this.i.getMeasuredWidth() <= 0)
          return; 
        if (this.k.a(this.i)) {
          i = 1048576;
        } else {
          i = this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft() - this.i.getTotalPaddingRight();
        } 
        int j = this.i.getHeight() - this.i.getCompoundPaddingBottom() - this.i.getCompoundPaddingTop();
        if (i > 0) {
          if (j <= 0)
            return; 
          synchronized (l) {
            l.setEmpty();
            l.right = i;
            l.bottom = j;
            float f = a(l);
            if (f != this.i.getTextSize())
              a(0, f); 
          } 
        } else {
          return;
        } 
      } else {
        return;
      }  
    this.b = true;
  }
  
  void a(int paramInt) {
    TextPaint textPaint = this.h;
    if (textPaint == null) {
      this.h = new TextPaint();
    } else {
      textPaint.reset();
    } 
    this.h.set(this.i.getPaint());
    this.h.setTextSize(paramInt);
  }
  
  void a(int paramInt, float paramFloat) {
    Resources resources;
    Context context = this.j;
    if (context == null) {
      resources = Resources.getSystem();
    } else {
      resources = resources.getResources();
    } 
    a(TypedValue.applyDimension(paramInt, paramFloat, resources.getDisplayMetrics()));
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (k()) {
      DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
      a(TypedValue.applyDimension(paramInt4, paramInt1, displayMetrics), TypedValue.applyDimension(paramInt4, paramInt2, displayMetrics), TypedValue.applyDimension(paramInt4, paramInt3, displayMetrics));
      if (i())
        a(); 
    } 
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt) {
    float f1;
    float f2;
    float f3;
    TypedArray typedArray = this.j.obtainStyledAttributes(paramAttributeSet, j.AppCompatTextView, paramInt, 0);
    TextView textView = this.i;
    v.a((View)textView, textView.getContext(), j.AppCompatTextView, paramAttributeSet, typedArray, paramInt, 0);
    if (typedArray.hasValue(j.AppCompatTextView_autoSizeTextType))
      this.a = typedArray.getInt(j.AppCompatTextView_autoSizeTextType, 0); 
    if (typedArray.hasValue(j.AppCompatTextView_autoSizeStepGranularity)) {
      f1 = typedArray.getDimension(j.AppCompatTextView_autoSizeStepGranularity, -1.0F);
    } else {
      f1 = -1.0F;
    } 
    if (typedArray.hasValue(j.AppCompatTextView_autoSizeMinTextSize)) {
      f2 = typedArray.getDimension(j.AppCompatTextView_autoSizeMinTextSize, -1.0F);
    } else {
      f2 = -1.0F;
    } 
    if (typedArray.hasValue(j.AppCompatTextView_autoSizeMaxTextSize)) {
      f3 = typedArray.getDimension(j.AppCompatTextView_autoSizeMaxTextSize, -1.0F);
    } else {
      f3 = -1.0F;
    } 
    if (typedArray.hasValue(j.AppCompatTextView_autoSizePresetSizes)) {
      paramInt = typedArray.getResourceId(j.AppCompatTextView_autoSizePresetSizes, 0);
      if (paramInt > 0) {
        TypedArray typedArray1 = typedArray.getResources().obtainTypedArray(paramInt);
        a(typedArray1);
        typedArray1.recycle();
      } 
    } 
    typedArray.recycle();
    if (k()) {
      if (this.a == 1) {
        if (!this.g) {
          DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
          float f = f2;
          if (f2 == -1.0F)
            f = TypedValue.applyDimension(2, 12.0F, displayMetrics); 
          f2 = f3;
          if (f3 == -1.0F)
            f2 = TypedValue.applyDimension(2, 112.0F, displayMetrics); 
          f3 = f1;
          if (f1 == -1.0F)
            f3 = 1.0F; 
          a(f, f2, f3);
        } 
        i();
        return;
      } 
    } else {
      this.a = 0;
    } 
  }
  
  void a(int[] paramArrayOfint, int paramInt) {
    if (k()) {
      int j = paramArrayOfint.length;
      int i = 0;
      if (j > 0) {
        int[] arrayOfInt1;
        int[] arrayOfInt2 = new int[j];
        if (paramInt == 0) {
          arrayOfInt1 = Arrays.copyOf(paramArrayOfint, j);
        } else {
          DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
          while (true) {
            arrayOfInt1 = arrayOfInt2;
            if (i < j) {
              arrayOfInt2[i] = Math.round(TypedValue.applyDimension(paramInt, paramArrayOfint[i], displayMetrics));
              i++;
              continue;
            } 
            break;
          } 
        } 
        this.f = a(arrayOfInt1);
        if (!j()) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("None of the preset sizes is valid: ");
          stringBuilder.append(Arrays.toString(paramArrayOfint));
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        this.g = false;
      } 
      if (i())
        a(); 
    } 
  }
  
  int b() {
    return Math.round(this.e);
  }
  
  void b(int paramInt) {
    if (k())
      if (paramInt != 0) {
        if (paramInt == 1) {
          DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
          a(TypedValue.applyDimension(2, 12.0F, displayMetrics), TypedValue.applyDimension(2, 112.0F, displayMetrics), 1.0F);
          if (i()) {
            a();
            return;
          } 
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown auto-size text type: ");
          stringBuilder.append(paramInt);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        h();
      }  
  }
  
  int c() {
    return Math.round(this.d);
  }
  
  int d() {
    return Math.round(this.c);
  }
  
  int[] e() {
    return this.f;
  }
  
  int f() {
    return this.a;
  }
  
  boolean g() {
    return (k() && this.a != 0);
  }
  
  private static class a extends c {
    void a(StaticLayout.Builder param1Builder, TextView param1TextView) {
      param1Builder.setTextDirection(a0.<TextDirectionHeuristic>b(param1TextView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
  }
  
  private static class b extends a {
    void a(StaticLayout.Builder param1Builder, TextView param1TextView) {
      param1Builder.setTextDirection(param1TextView.getTextDirectionHeuristic());
    }
    
    boolean a(TextView param1TextView) {
      return param1TextView.isHorizontallyScrollable();
    }
  }
  
  private static class c {
    void a(StaticLayout.Builder param1Builder, TextView param1TextView) {}
    
    boolean a(TextView param1TextView) {
      return ((Boolean)a0.<Boolean>b(param1TextView, "getHorizontallyScrolling", Boolean.valueOf(false))).booleanValue();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */