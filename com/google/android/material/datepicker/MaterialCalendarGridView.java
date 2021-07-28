package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.c;
import b.g.m.e0.c;
import b.g.m.v;
import e.f.a.f.f;
import java.util.Calendar;
import java.util.Iterator;

final class MaterialCalendarGridView extends GridView {
  private final Calendar c = r.d();
  
  public MaterialCalendarGridView(Context paramContext) {
    this(paramContext, null);
  }
  
  public MaterialCalendarGridView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MaterialCalendarGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    if (i.g(getContext())) {
      setNextFocusLeftId(f.cancel_button);
      setNextFocusRightId(f.confirm_button);
    } 
    v.a((View)this, new a(this));
  }
  
  private static int a(View paramView) {
    return paramView.getLeft() + paramView.getWidth() / 2;
  }
  
  private void a(int paramInt, Rect paramRect) {
    if (paramInt == 33) {
      paramInt = getAdapter().b();
    } else if (paramInt == 130) {
      paramInt = getAdapter().a();
    } else {
      super.onFocusChanged(true, paramInt, paramRect);
      return;
    } 
    setSelection(paramInt);
  }
  
  private static boolean a(Long paramLong1, Long paramLong2, Long paramLong3, Long paramLong4) {
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (paramLong1 != null) {
      bool1 = bool2;
      if (paramLong2 != null) {
        bool1 = bool2;
        if (paramLong3 != null) {
          if (paramLong4 == null)
            return true; 
          bool1 = bool2;
          if (paramLong3.longValue() <= paramLong2.longValue()) {
            if (paramLong4.longValue() < paramLong1.longValue())
              return true; 
            bool1 = false;
          } 
        } 
      } 
    } 
    return bool1;
  }
  
  public m getAdapter() {
    return (m)super.getAdapter();
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    getAdapter().notifyDataSetChanged();
  }
  
  protected final void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    m m = getAdapter();
    d<?> d = m.d;
    c c = m.e;
    Long long_1 = m.getItem(m.a());
    Long long_2 = m.getItem(m.b());
    Iterator<c<Long, Long>> iterator = d.a().iterator();
    while (true) {
      MaterialCalendarGridView materialCalendarGridView = this;
      if (iterator.hasNext()) {
        int i;
        int j;
        int k;
        int n;
        c c1 = iterator.next();
        Object object = c1.a;
        if (object == null || c1.b == null)
          continue; 
        long l1 = ((Long)object).longValue();
        long l2 = ((Long)c1.b).longValue();
        if (a(long_1, long_2, Long.valueOf(l1), Long.valueOf(l2)))
          return; 
        if (l1 < long_1.longValue()) {
          k = m.a();
          if (m.b(k)) {
            i = 0;
          } else {
            i = materialCalendarGridView.getChildAt(k - 1).getRight();
          } 
        } else {
          materialCalendarGridView.c.setTimeInMillis(l1);
          k = m.a(materialCalendarGridView.c.get(5));
          i = a(materialCalendarGridView.getChildAt(k));
        } 
        if (l2 > long_2.longValue()) {
          n = m.b();
          if (m.c(n)) {
            j = getWidth();
          } else {
            j = materialCalendarGridView.getChildAt(n).getRight();
          } 
        } else {
          materialCalendarGridView.c.setTimeInMillis(l2);
          n = m.a(materialCalendarGridView.c.get(5));
          j = a(materialCalendarGridView.getChildAt(n));
        } 
        int i1 = (int)m.getItemId(k);
        int i2 = (int)m.getItemId(n);
        while (i1 <= i2) {
          int i3;
          int i4 = getNumColumns() * i1;
          int i9 = getNumColumns();
          View view = getChildAt(i4);
          int i5 = view.getTop();
          int i6 = c.a.b();
          int i7 = view.getBottom();
          int i8 = c.a.a();
          if (i4 > k) {
            i3 = 0;
          } else {
            i3 = i;
          } 
          if (n > i9 + i4 - 1) {
            i4 = getWidth();
          } else {
            i4 = j;
          } 
          paramCanvas.drawRect(i3, (i5 + i6), i4, (i7 - i8), c.h);
          i1++;
        } 
        continue;
      } 
      break;
    } 
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect) {
    if (paramBoolean) {
      a(paramInt, paramRect);
      return;
    } 
    super.onFocusChanged(false, paramInt, paramRect);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (!super.onKeyDown(paramInt, paramKeyEvent))
      return false; 
    if (getSelectedItemPosition() != -1) {
      if (getSelectedItemPosition() >= getAdapter().a())
        return true; 
      if (19 == paramInt) {
        setSelection(getAdapter().a());
        return true;
      } 
      return false;
    } 
    return true;
  }
  
  public final void setAdapter(ListAdapter paramListAdapter) {
    if (paramListAdapter instanceof m) {
      super.setAdapter(paramListAdapter);
      return;
    } 
    throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[] { MaterialCalendarGridView.class.getCanonicalName(), m.class.getCanonicalName() }));
  }
  
  public void setSelection(int paramInt) {
    int i = paramInt;
    if (paramInt < getAdapter().a())
      i = getAdapter().a(); 
    super.setSelection(i);
  }
  
  class a extends b.g.m.a {
    a(MaterialCalendarGridView this$0) {}
    
    public void a(View param1View, c param1c) {
      super.a(param1View, param1c);
      param1c.a(null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/MaterialCalendarGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */