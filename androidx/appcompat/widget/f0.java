package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.f;
import b.a.l.a.c;
import b.g.m.z;
import java.lang.reflect.Field;

class f0 extends ListView {
  private final Rect c = new Rect();
  
  private int d = 0;
  
  private int e = 0;
  
  private int f = 0;
  
  private int g = 0;
  
  private int h;
  
  private Field i;
  
  private a j;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  private z n;
  
  private f o;
  
  b p;
  
  f0(Context paramContext, boolean paramBoolean) {
    super(paramContext, null, b.a.a.dropDownListViewStyle);
    this.l = paramBoolean;
    setCacheColorHint(0);
    try {
      this.i = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      this.i.setAccessible(true);
      return;
    } catch (NoSuchFieldException noSuchFieldException) {
      noSuchFieldException.printStackTrace();
      return;
    } 
  }
  
  private void a() {
    this.m = false;
    setPressed(false);
    drawableStateChanged();
    View view = getChildAt(this.h - getFirstVisiblePosition());
    if (view != null)
      view.setPressed(false); 
    z z1 = this.n;
    if (z1 != null) {
      z1.a();
      this.n = null;
    } 
  }
  
  private void a(int paramInt, View paramView) {
    Rect rect = this.c;
    rect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    rect.left -= this.d;
    rect.top -= this.e;
    rect.right += this.f;
    rect.bottom += this.g;
    try {
      boolean bool = this.i.getBoolean(this);
      if (paramView.isEnabled() != bool) {
        Field field = this.i;
        if (!bool) {
          bool = true;
        } else {
          bool = false;
        } 
        field.set(this, Boolean.valueOf(bool));
        if (paramInt != -1) {
          refreshDrawableState();
          return;
        } 
      } 
    } catch (IllegalAccessException illegalAccessException) {
      illegalAccessException.printStackTrace();
    } 
  }
  
  private void a(int paramInt, View paramView, float paramFloat1, float paramFloat2) {
    b(paramInt, paramView);
    Drawable drawable = getSelector();
    if (drawable != null && paramInt != -1)
      androidx.core.graphics.drawable.a.a(drawable, paramFloat1, paramFloat2); 
  }
  
  private void a(Canvas paramCanvas) {
    if (!this.c.isEmpty()) {
      Drawable drawable = getSelector();
      if (drawable != null) {
        drawable.setBounds(this.c);
        drawable.draw(paramCanvas);
      } 
    } 
  }
  
  private void a(View paramView, int paramInt) {
    performItemClick(paramView, paramInt, getItemIdAtPosition(paramInt));
  }
  
  private void a(View paramView, int paramInt, float paramFloat1, float paramFloat2) {
    this.m = true;
    if (Build.VERSION.SDK_INT >= 21)
      drawableHotspotChanged(paramFloat1, paramFloat2); 
    if (!isPressed())
      setPressed(true); 
    layoutChildren();
    int i = this.h;
    if (i != -1) {
      View view = getChildAt(i - getFirstVisiblePosition());
      if (view != null && view != paramView && view.isPressed())
        view.setPressed(false); 
    } 
    this.h = paramInt;
    float f1 = paramView.getLeft();
    float f2 = paramView.getTop();
    if (Build.VERSION.SDK_INT >= 21)
      paramView.drawableHotspotChanged(paramFloat1 - f1, paramFloat2 - f2); 
    if (!paramView.isPressed())
      paramView.setPressed(true); 
    a(paramInt, paramView, paramFloat1, paramFloat2);
    setSelectorEnabled(false);
    refreshDrawableState();
  }
  
  private void b(int paramInt, View paramView) {
    boolean bool1;
    Drawable drawable = getSelector();
    boolean bool2 = true;
    if (drawable != null && paramInt != -1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool1)
      drawable.setVisible(false, false); 
    a(paramInt, paramView);
    if (bool1) {
      Rect rect = this.c;
      float f1 = rect.exactCenterX();
      float f2 = rect.exactCenterY();
      if (getVisibility() != 0)
        bool2 = false; 
      drawable.setVisible(bool2, false);
      androidx.core.graphics.drawable.a.a(drawable, f1, f2);
    } 
  }
  
  private boolean b() {
    return this.m;
  }
  
  private void c() {
    Drawable drawable = getSelector();
    if (drawable != null && b() && isPressed())
      drawable.setState(getDrawableState()); 
  }
  
  private void setSelectorEnabled(boolean paramBoolean) {
    a a1 = this.j;
    if (a1 != null)
      a1.a(paramBoolean); 
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt2 = getListPaddingTop();
    paramInt3 = getListPaddingBottom();
    int i = getDividerHeight();
    Drawable drawable = getDivider();
    ListAdapter listAdapter = getAdapter();
    paramInt3 = paramInt2 + paramInt3;
    if (listAdapter == null)
      return paramInt3; 
    if (i <= 0 || drawable == null)
      i = 0; 
    int m = listAdapter.getCount();
    drawable = null;
    int j = 0;
    int k = 0;
    for (paramInt2 = 0; j < m; paramInt2 = i1) {
      int i1 = listAdapter.getItemViewType(j);
      int n = k;
      if (i1 != k) {
        drawable = null;
        n = i1;
      } 
      View view2 = listAdapter.getView(j, (View)drawable, (ViewGroup)this);
      ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
      ViewGroup.LayoutParams layoutParams1 = layoutParams2;
      if (layoutParams2 == null) {
        layoutParams1 = generateDefaultLayoutParams();
        view2.setLayoutParams(layoutParams1);
      } 
      k = layoutParams1.height;
      if (k > 0) {
        k = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
      } else {
        k = View.MeasureSpec.makeMeasureSpec(0, 0);
      } 
      view2.measure(paramInt1, k);
      view2.forceLayout();
      k = paramInt3;
      if (j > 0)
        k = paramInt3 + i; 
      paramInt3 = k + view2.getMeasuredHeight();
      if (paramInt3 >= paramInt4) {
        paramInt1 = paramInt4;
        if (paramInt5 >= 0) {
          paramInt1 = paramInt4;
          if (j > paramInt5) {
            paramInt1 = paramInt4;
            if (paramInt2 > 0) {
              paramInt1 = paramInt4;
              if (paramInt3 != paramInt4)
                paramInt1 = paramInt2; 
            } 
          } 
        } 
        return paramInt1;
      } 
      i1 = paramInt2;
      if (paramInt5 >= 0) {
        i1 = paramInt2;
        if (j >= paramInt5)
          i1 = paramInt3; 
      } 
      j++;
      k = n;
      View view1 = view2;
    } 
    return paramInt3;
  }
  
  public boolean a(MotionEvent paramMotionEvent, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore_3
    //   5: iload_3
    //   6: iconst_1
    //   7: if_icmpeq -> 42
    //   10: iload_3
    //   11: iconst_2
    //   12: if_icmpeq -> 36
    //   15: iload_3
    //   16: iconst_3
    //   17: if_icmpeq -> 28
    //   20: iconst_0
    //   21: istore_2
    //   22: iconst_1
    //   23: istore #6
    //   25: goto -> 139
    //   28: iconst_0
    //   29: istore_2
    //   30: iconst_0
    //   31: istore #6
    //   33: goto -> 139
    //   36: iconst_1
    //   37: istore #6
    //   39: goto -> 45
    //   42: iconst_0
    //   43: istore #6
    //   45: aload_1
    //   46: iload_2
    //   47: invokevirtual findPointerIndex : (I)I
    //   50: istore #4
    //   52: iload #4
    //   54: ifge -> 60
    //   57: goto -> 28
    //   60: aload_1
    //   61: iload #4
    //   63: invokevirtual getX : (I)F
    //   66: f2i
    //   67: istore_2
    //   68: aload_1
    //   69: iload #4
    //   71: invokevirtual getY : (I)F
    //   74: f2i
    //   75: istore #4
    //   77: aload_0
    //   78: iload_2
    //   79: iload #4
    //   81: invokevirtual pointToPosition : (II)I
    //   84: istore #5
    //   86: iload #5
    //   88: iconst_m1
    //   89: if_icmpne -> 97
    //   92: iconst_1
    //   93: istore_2
    //   94: goto -> 139
    //   97: aload_0
    //   98: iload #5
    //   100: aload_0
    //   101: invokevirtual getFirstVisiblePosition : ()I
    //   104: isub
    //   105: invokevirtual getChildAt : (I)Landroid/view/View;
    //   108: astore #7
    //   110: aload_0
    //   111: aload #7
    //   113: iload #5
    //   115: iload_2
    //   116: i2f
    //   117: iload #4
    //   119: i2f
    //   120: invokespecial a : (Landroid/view/View;IFF)V
    //   123: iload_3
    //   124: iconst_1
    //   125: if_icmpne -> 20
    //   128: aload_0
    //   129: aload #7
    //   131: iload #5
    //   133: invokespecial a : (Landroid/view/View;I)V
    //   136: goto -> 20
    //   139: iload #6
    //   141: ifeq -> 148
    //   144: iload_2
    //   145: ifeq -> 152
    //   148: aload_0
    //   149: invokespecial a : ()V
    //   152: iload #6
    //   154: ifeq -> 198
    //   157: aload_0
    //   158: getfield o : Landroidx/core/widget/f;
    //   161: ifnonnull -> 176
    //   164: aload_0
    //   165: new androidx/core/widget/f
    //   168: dup
    //   169: aload_0
    //   170: invokespecial <init> : (Landroid/widget/ListView;)V
    //   173: putfield o : Landroidx/core/widget/f;
    //   176: aload_0
    //   177: getfield o : Landroidx/core/widget/f;
    //   180: iconst_1
    //   181: invokevirtual a : (Z)Landroidx/core/widget/a;
    //   184: pop
    //   185: aload_0
    //   186: getfield o : Landroidx/core/widget/f;
    //   189: aload_0
    //   190: aload_1
    //   191: invokevirtual onTouch : (Landroid/view/View;Landroid/view/MotionEvent;)Z
    //   194: pop
    //   195: iload #6
    //   197: ireturn
    //   198: aload_0
    //   199: getfield o : Landroidx/core/widget/f;
    //   202: astore_1
    //   203: aload_1
    //   204: ifnull -> 213
    //   207: aload_1
    //   208: iconst_0
    //   209: invokevirtual a : (Z)Landroidx/core/widget/a;
    //   212: pop
    //   213: iload #6
    //   215: ireturn
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {
    a(paramCanvas);
    super.dispatchDraw(paramCanvas);
  }
  
  protected void drawableStateChanged() {
    if (this.p != null)
      return; 
    super.drawableStateChanged();
    setSelectorEnabled(true);
    c();
  }
  
  public boolean hasFocus() {
    return (this.l || super.hasFocus());
  }
  
  public boolean hasWindowFocus() {
    return (this.l || super.hasWindowFocus());
  }
  
  public boolean isFocused() {
    return (this.l || super.isFocused());
  }
  
  public boolean isInTouchMode() {
    return ((this.l && this.k) || super.isInTouchMode());
  }
  
  protected void onDetachedFromWindow() {
    this.p = null;
    super.onDetachedFromWindow();
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    if (Build.VERSION.SDK_INT < 26)
      return super.onHoverEvent(paramMotionEvent); 
    int i = paramMotionEvent.getActionMasked();
    if (i == 10 && this.p == null) {
      this.p = new b(this);
      this.p.b();
    } 
    boolean bool = super.onHoverEvent(paramMotionEvent);
    if (i == 9 || i == 7) {
      i = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      if (i != -1 && i != getSelectedItemPosition()) {
        View view = getChildAt(i - getFirstVisiblePosition());
        if (view.isEnabled())
          setSelectionFromTop(i, view.getTop() - getTop()); 
        c();
      } 
      return bool;
    } 
    setSelection(-1);
    return bool;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 0)
      this.h = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()); 
    b b1 = this.p;
    if (b1 != null)
      b1.a(); 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  void setListSelectionHidden(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  public void setSelector(Drawable paramDrawable) {
    a a1;
    if (paramDrawable != null) {
      a1 = new a(paramDrawable);
    } else {
      a1 = null;
    } 
    this.j = a1;
    super.setSelector((Drawable)this.j);
    Rect rect = new Rect();
    if (paramDrawable != null)
      paramDrawable.getPadding(rect); 
    this.d = rect.left;
    this.e = rect.top;
    this.f = rect.right;
    this.g = rect.bottom;
  }
  
  private static class a extends c {
    private boolean d = true;
    
    a(Drawable param1Drawable) {
      super(param1Drawable);
    }
    
    void a(boolean param1Boolean) {
      this.d = param1Boolean;
    }
    
    public void draw(Canvas param1Canvas) {
      if (this.d)
        super.draw(param1Canvas); 
    }
    
    public void setHotspot(float param1Float1, float param1Float2) {
      if (this.d)
        super.setHotspot(param1Float1, param1Float2); 
    }
    
    public void setHotspotBounds(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      if (this.d)
        super.setHotspotBounds(param1Int1, param1Int2, param1Int3, param1Int4); 
    }
    
    public boolean setState(int[] param1ArrayOfint) {
      return this.d ? super.setState(param1ArrayOfint) : false;
    }
    
    public boolean setVisible(boolean param1Boolean1, boolean param1Boolean2) {
      return this.d ? super.setVisible(param1Boolean1, param1Boolean2) : false;
    }
  }
  
  private class b implements Runnable {
    b(f0 this$0) {}
    
    public void a() {
      f0 f01 = this.c;
      f01.p = null;
      f01.removeCallbacks(this);
    }
    
    public void b() {
      this.c.post(this);
    }
    
    public void run() {
      f0 f01 = this.c;
      f01.p = null;
      f01.drawableStateChanged();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */