package com.facebook.react.views.picker;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.w;
import java.util.List;

public class a extends w {
  private int l = 0;
  
  private c m;
  
  private List<c> n;
  
  private List<c> o;
  
  private Integer p;
  
  private Integer q;
  
  private Integer r;
  
  private final AdapterView.OnItemSelectedListener s = new a(this);
  
  private final Runnable t = new b(this);
  
  public a(Context paramContext, int paramInt) {
    super(paramContext, paramInt);
    this.l = paramInt;
  }
  
  void b() {
    setOnItemSelectedListener(null);
    b b2 = (b)getAdapter();
    int i = getSelectedItemPosition();
    List<c> list = this.o;
    b b1 = b2;
    if (list != null) {
      b1 = b2;
      if (list != this.n) {
        this.n = list;
        this.o = null;
        if (b2 == null) {
          b1 = new b(getContext(), this.n);
          setAdapter((SpinnerAdapter)b1);
        } else {
          b2.clear();
          b2.addAll(this.n);
          b2.notifyDataSetChanged();
          b1 = b2;
        } 
      } 
    } 
    Integer integer = this.p;
    if (integer != null && integer.intValue() != i) {
      setSelection(this.p.intValue(), false);
      this.p = null;
    } 
    integer = this.q;
    if (integer != null && b1 != null && integer != b1.b()) {
      b1.b(this.q);
      this.q = null;
    } 
    integer = this.r;
    if (integer != null && b1 != null && integer != b1.a()) {
      b1.a(this.r);
      this.r = null;
    } 
    setOnItemSelectedListener(this.s);
  }
  
  public int getMode() {
    return this.l;
  }
  
  public c getOnSelectListener() {
    return this.m;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (getOnItemSelectedListener() == null)
      setOnItemSelectedListener(this.s); 
  }
  
  public void requestLayout() {
    super.requestLayout();
    post(this.t);
  }
  
  void setImmediateSelection(int paramInt) {
    if (paramInt != getSelectedItemPosition()) {
      setOnItemSelectedListener(null);
      setSelection(paramInt, false);
      setOnItemSelectedListener(this.s);
    } 
  }
  
  public void setOnSelectListener(c paramc) {
    this.m = paramc;
  }
  
  void setStagedBackgroundColor(Integer paramInteger) {
    this.r = paramInteger;
  }
  
  void setStagedItems(List<c> paramList) {
    this.o = paramList;
  }
  
  void setStagedPrimaryTextColor(Integer paramInteger) {
    this.q = paramInteger;
  }
  
  void setStagedSelection(int paramInt) {
    this.p = Integer.valueOf(paramInt);
  }
  
  class a implements AdapterView.OnItemSelectedListener {
    a(a this$0) {}
    
    public void onItemSelected(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      if (a.a(this.c) != null)
        a.a(this.c).a(param1Int); 
    }
    
    public void onNothingSelected(AdapterView<?> param1AdapterView) {
      if (a.a(this.c) != null)
        a.a(this.c).a(-1); 
    }
  }
  
  class b implements Runnable {
    b(a this$0) {}
    
    public void run() {
      a a1 = this.c;
      a1.measure(View.MeasureSpec.makeMeasureSpec(a1.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.c.getHeight(), 1073741824));
      a1 = this.c;
      a1.layout(a1.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
    }
  }
  
  public static interface c {
    void a(int param1Int);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/picker/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */