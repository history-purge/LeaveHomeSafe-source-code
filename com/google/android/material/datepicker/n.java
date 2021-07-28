package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.g.m.v;
import e.f.a.f.f;
import e.f.a.f.h;

class n extends RecyclerView.g<n.b> {
  private final a c;
  
  private final d<?> d;
  
  private final h.l e;
  
  private final int f;
  
  n(Context paramContext, d<?> paramd, a parama, h.l paraml) {
    l l1 = parama.i();
    l l2 = parama.f();
    l l3 = parama.h();
    if (l1.a(l3) <= 0) {
      if (l3.a(l2) <= 0) {
        byte b;
        int i = m.g;
        int j = h.b(paramContext);
        if (i.g(paramContext)) {
          b = h.b(paramContext);
        } else {
          b = 0;
        } 
        this.f = i * j + b;
        this.c = parama;
        this.d = paramd;
        this.e = paraml;
        a(true);
        return;
      } 
      throw new IllegalArgumentException("currentPage cannot be after lastPage");
    } 
    throw new IllegalArgumentException("firstPage cannot be after currentPage");
  }
  
  public int a() {
    return this.c.g();
  }
  
  int a(l paraml) {
    return this.c.i().b(paraml);
  }
  
  public long a(int paramInt) {
    return this.c.i().g(paramInt).s();
  }
  
  public void a(b paramb, int paramInt) {
    l l1 = this.c.i().g(paramInt);
    paramb.t.setText(l1.r());
    MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView)paramb.u.findViewById(f.month_grid);
    if (materialCalendarGridView.getAdapter() != null && l1.equals((materialCalendarGridView.getAdapter()).c)) {
      materialCalendarGridView.getAdapter().notifyDataSetChanged();
    } else {
      m m = new m(l1, this.d, this.c);
      materialCalendarGridView.setNumColumns(l1.g);
      materialCalendarGridView.setAdapter((ListAdapter)m);
    } 
    materialCalendarGridView.setOnItemClickListener(new a(this, materialCalendarGridView));
  }
  
  public b b(ViewGroup paramViewGroup, int paramInt) {
    LinearLayout linearLayout = (LinearLayout)LayoutInflater.from(paramViewGroup.getContext()).inflate(h.mtrl_calendar_month_labeled, paramViewGroup, false);
    if (i.g(paramViewGroup.getContext())) {
      linearLayout.setLayoutParams((ViewGroup.LayoutParams)new RecyclerView.p(-1, this.f));
      return new b(linearLayout, true);
    } 
    return new b(linearLayout, false);
  }
  
  l c(int paramInt) {
    return this.c.i().g(paramInt);
  }
  
  CharSequence d(int paramInt) {
    return c(paramInt).r();
  }
  
  class a implements AdapterView.OnItemClickListener {
    a(n this$0, MaterialCalendarGridView param1MaterialCalendarGridView) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      if (this.c.getAdapter().e(param1Int))
        n.a(this.d).a(this.c.getAdapter().getItem(param1Int).longValue()); 
    }
  }
  
  public static class b extends RecyclerView.d0 {
    final TextView t;
    
    final MaterialCalendarGridView u;
    
    b(LinearLayout param1LinearLayout, boolean param1Boolean) {
      super((View)param1LinearLayout);
      this.t = (TextView)param1LinearLayout.findViewById(f.month_title);
      v.a((View)this.t, true);
      this.u = (MaterialCalendarGridView)param1LinearLayout.findViewById(f.month_grid);
      if (!param1Boolean)
        this.t.setVisibility(8); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */