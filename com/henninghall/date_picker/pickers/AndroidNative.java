package com.henninghall.date_picker.pickers;

import android.content.Context;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import java.lang.reflect.Field;

public class AndroidNative extends NumberPicker implements a {
  private a.a c;
  
  private int d = 0;
  
  private a.b e;
  
  public AndroidNative(Context paramContext) {
    super(paramContext);
  }
  
  public AndroidNative(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public AndroidNative(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private int a(int paramInt1, int paramInt2) {
    int i = getMaxValue();
    paramInt2 -= paramInt1;
    int j = i + 1 - Math.abs(paramInt2);
    if (getWrapSelectorWheel())
      return (Math.abs(paramInt2) < Math.abs(j)) ? paramInt2 : j; 
    paramInt1 += paramInt2;
    return (paramInt1 > i) ? j : ((paramInt1 < 0) ? j : paramInt2);
  }
  
  private void a(NumberPicker paramNumberPicker, boolean paramBoolean) {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_3
    //   2: aload_0
    //   3: invokevirtual getClass : ()Ljava/lang/Class;
    //   6: invokevirtual getSuperclass : ()Ljava/lang/Class;
    //   9: ldc 'changeValueByOne'
    //   11: iconst_1
    //   12: anewarray java/lang/Class
    //   15: dup
    //   16: iconst_0
    //   17: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   20: aastore
    //   21: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   24: astore #6
    //   26: aload #6
    //   28: iconst_1
    //   29: invokevirtual setAccessible : (Z)V
    //   32: aload #6
    //   34: aload_1
    //   35: iconst_1
    //   36: anewarray java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: iload_2
    //   42: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   45: aastore
    //   46: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   49: pop
    //   50: return
    //   51: astore_1
    //   52: goto -> 189
    //   55: astore_1
    //   56: ldc 'changeValueByOne'
    //   58: aload_1
    //   59: invokestatic w : (Ljava/lang/String;Ljava/lang/Throwable;)I
    //   62: pop
    //   63: aload_0
    //   64: invokevirtual getValue : ()I
    //   67: istore #5
    //   69: iload_3
    //   70: istore #4
    //   72: iload #5
    //   74: istore_3
    //   75: iload_2
    //   76: ifeq -> 175
    //   79: iload #5
    //   81: istore_3
    //   82: goto -> 172
    //   85: astore_1
    //   86: ldc 'changeValueByOne'
    //   88: aload_1
    //   89: invokestatic w : (Ljava/lang/String;Ljava/lang/Throwable;)I
    //   92: pop
    //   93: aload_0
    //   94: invokevirtual getValue : ()I
    //   97: istore #5
    //   99: iload_3
    //   100: istore #4
    //   102: iload #5
    //   104: istore_3
    //   105: iload_2
    //   106: ifeq -> 175
    //   109: iload #5
    //   111: istore_3
    //   112: goto -> 172
    //   115: astore_1
    //   116: ldc 'changeValueByOne'
    //   118: aload_1
    //   119: invokestatic w : (Ljava/lang/String;Ljava/lang/Throwable;)I
    //   122: pop
    //   123: aload_0
    //   124: invokevirtual getValue : ()I
    //   127: istore #5
    //   129: iload_3
    //   130: istore #4
    //   132: iload #5
    //   134: istore_3
    //   135: iload_2
    //   136: ifeq -> 175
    //   139: iload #5
    //   141: istore_3
    //   142: goto -> 172
    //   145: astore_1
    //   146: ldc 'changeValueByOne'
    //   148: aload_1
    //   149: invokestatic w : (Ljava/lang/String;Ljava/lang/Throwable;)I
    //   152: pop
    //   153: aload_0
    //   154: invokevirtual getValue : ()I
    //   157: istore #5
    //   159: iload_3
    //   160: istore #4
    //   162: iload #5
    //   164: istore_3
    //   165: iload_2
    //   166: ifeq -> 175
    //   169: iload #5
    //   171: istore_3
    //   172: iconst_1
    //   173: istore #4
    //   175: aload_0
    //   176: iload_3
    //   177: iload #4
    //   179: iadd
    //   180: aload_0
    //   181: invokevirtual getMaxValue : ()I
    //   184: irem
    //   185: invokevirtual setValue : (I)V
    //   188: return
    //   189: aload_0
    //   190: invokevirtual getValue : ()I
    //   193: istore #4
    //   195: iload_2
    //   196: ifeq -> 201
    //   199: iconst_1
    //   200: istore_3
    //   201: aload_0
    //   202: iload #4
    //   204: iload_3
    //   205: iadd
    //   206: aload_0
    //   207: invokevirtual getMaxValue : ()I
    //   210: irem
    //   211: invokevirtual setValue : (I)V
    //   214: aload_1
    //   215: athrow
    // Exception table:
    //   from	to	target	type
    //   2	50	145	java/lang/NoSuchMethodException
    //   2	50	115	java/lang/IllegalArgumentException
    //   2	50	85	java/lang/IllegalAccessException
    //   2	50	55	java/lang/reflect/InvocationTargetException
    //   2	50	51	finally
    //   56	63	51	finally
    //   86	93	51	finally
    //   116	123	51	finally
    //   146	153	51	finally
  }
  
  private void a(boolean paramBoolean1, int paramInt, boolean paramBoolean2) {
    (new Handler()).postDelayed(new b(this, this, paramBoolean1, paramBoolean2), paramInt);
  }
  
  private void b() {
    (new Handler()).postDelayed(new e(this), 500L);
  }
  
  private void b(int paramInt) {
    if (this.d != 0 && paramInt == 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if (paramInt != 0)
      b(); 
  }
  
  public void a(int paramInt) {
    (new Handler()).postDelayed(new a(this, this, paramInt), 500L);
  }
  
  public void a(int paramInt, boolean paramBoolean) {
    a(paramInt);
  }
  
  public boolean a() {
    return (this.d == 2);
  }
  
  public View getView() {
    return (View)this;
  }
  
  public void setDividerHeight(int paramInt) {}
  
  public void setItemPaddingHorizontal(int paramInt) {}
  
  public void setNormalTextColor(int paramInt) {}
  
  public void setOnValueChangeListenerInScrolling(a.b paramb) {
    this.e = paramb;
  }
  
  public void setOnValueChangedListener(a.a parama) {
    this.c = parama;
    setOnValueChangedListener(new c(this, this));
    setOnScrollListener(new d(this));
  }
  
  public void setSelectedTextColor(int paramInt) {
    try {
      Field field = getClass().getSuperclass().getDeclaredField("mSelectorWheelPaint");
      field.setAccessible(true);
      ((Paint)field.get(this)).setColor(paramInt);
    } catch (NoSuchFieldException noSuchFieldException) {
      Log.w("setSelectedTextColor", noSuchFieldException);
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (IllegalArgumentException illegalArgumentException) {}
    int j = getChildCount();
    for (int i = 0; i < j; i++) {
      View view = getChildAt(i);
      if (view instanceof EditText)
        ((EditText)view).setTextColor(paramInt); 
    } 
    invalidate();
  }
  
  public void setShownCount(int paramInt) {}
  
  public void setTextAlign(Paint.Align paramAlign) {}
  
  class a implements Runnable {
    a(AndroidNative this$0, AndroidNative param1AndroidNative1, int param1Int) {}
    
    public void run() {
      int i = this.c.getValue();
      int j = this.d;
      if (j == i)
        return; 
      j = AndroidNative.a(this.e, i, j);
      int k = Math.abs(j);
      for (i = 0; i < k; i++) {
        boolean bool1;
        AndroidNative androidNative = this.e;
        boolean bool2 = true;
        if (j > 0) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        if (i != k - 1)
          bool2 = false; 
        AndroidNative.a(androidNative, bool1, i * 100, bool2);
      } 
    }
  }
  
  class b implements Runnable {
    b(AndroidNative this$0, AndroidNative param1AndroidNative1, boolean param1Boolean1, boolean param1Boolean2) {}
    
    public void run() {
      AndroidNative.a(this.f, this.c, this.d);
      if (this.e)
        AndroidNative.a(this.f); 
    }
  }
  
  class c implements NumberPicker.OnValueChangeListener {
    c(AndroidNative this$0, a param1a) {}
    
    public void onValueChange(NumberPicker param1NumberPicker, int param1Int1, int param1Int2) {
      if (AndroidNative.b(this.b) != null)
        AndroidNative.b(this.b).a(this.a, param1Int1, param1Int2); 
      if (AndroidNative.c(this.b) == 0)
        AndroidNative.a(this.b); 
    }
  }
  
  class d implements NumberPicker.OnScrollListener {
    d(AndroidNative this$0) {}
    
    public void onScrollStateChange(NumberPicker param1NumberPicker, int param1Int) {
      AndroidNative.b(this.a, param1Int);
      AndroidNative.a(this.a, param1Int);
    }
  }
  
  class e implements Runnable {
    e(AndroidNative this$0) {}
    
    public void run() {
      AndroidNative.d(this.c).a();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/pickers/AndroidNative.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */