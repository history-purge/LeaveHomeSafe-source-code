package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import e.f.a.f.h;
import e.f.a.f.i;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

class s extends RecyclerView.g<s.b> {
  private final h<?> c;
  
  s(h<?> paramh) {
    this.c = paramh;
  }
  
  private View.OnClickListener e(int paramInt) {
    return new a(this, paramInt);
  }
  
  public int a() {
    return this.c.x0().j();
  }
  
  public void a(b paramb, int paramInt) {
    b b1;
    paramInt = d(paramInt);
    String str = paramb.t.getContext().getString(i.mtrl_picker_navigate_to_year_description);
    paramb.t.setText(String.format(Locale.getDefault(), "%d", new Object[] { Integer.valueOf(paramInt) }));
    paramb.t.setContentDescription(String.format(str, new Object[] { Integer.valueOf(paramInt) }));
    c c = this.c.y0();
    Calendar calendar = r.b();
    if (calendar.get(1) == paramInt) {
      b1 = c.f;
    } else {
      b1 = c.d;
    } 
    Iterator<Long> iterator = this.c.A0().c().iterator();
    while (iterator.hasNext()) {
      calendar.setTimeInMillis(((Long)iterator.next()).longValue());
      if (calendar.get(1) == paramInt)
        b1 = c.e; 
    } 
    b1.a(paramb.t);
    paramb.t.setOnClickListener(e(paramInt));
  }
  
  public b b(ViewGroup paramViewGroup, int paramInt) {
    return new b((TextView)LayoutInflater.from(paramViewGroup.getContext()).inflate(h.mtrl_calendar_year, paramViewGroup, false));
  }
  
  int c(int paramInt) {
    return paramInt - (this.c.x0().i()).f;
  }
  
  int d(int paramInt) {
    return (this.c.x0().i()).f + paramInt;
  }
  
  class a implements View.OnClickListener {
    a(s this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      l l = l.a(this.c, (s.a(this.d).z0()).e);
      s.a(this.d).a(l);
      s.a(this.d).a(h.k.c);
    }
  }
  
  public static class b extends RecyclerView.d0 {
    final TextView t;
    
    b(TextView param1TextView) {
      super((View)param1TextView);
      this.t = param1TextView;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */