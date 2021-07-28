package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;

class q extends LinearLayoutManager {
  q(Context paramContext, int paramInt, boolean paramBoolean) {
    super(paramContext, paramInt, paramBoolean);
  }
  
  public void a(RecyclerView paramRecyclerView, RecyclerView.a0 parama0, int paramInt) {
    a a = new a(this, paramRecyclerView.getContext());
    a.c(paramInt);
    b((RecyclerView.z)a);
  }
  
  class a extends h {
    a(q this$0, Context param1Context) {
      super(param1Context);
    }
    
    protected float a(DisplayMetrics param1DisplayMetrics) {
      return 100.0F / param1DisplayMetrics.densityDpi;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */