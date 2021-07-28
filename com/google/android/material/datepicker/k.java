package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class k<S> extends p<S> {
  private d<S> c0;
  
  private a d0;
  
  static <T> k<T> a(d<T> paramd, a parama) {
    k<T> k1 = new k();
    Bundle bundle = new Bundle();
    bundle.putParcelable("DATE_SELECTOR_KEY", paramd);
    bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", parama);
    k1.m(bundle);
    return k1;
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    return this.c0.a(paramLayoutInflater, paramViewGroup, paramBundle, this.d0, new a(this));
  }
  
  public void c(Bundle paramBundle) {
    super.c(paramBundle);
    Bundle bundle = paramBundle;
    if (paramBundle == null)
      bundle = m(); 
    this.c0 = (d<S>)bundle.getParcelable("DATE_SELECTOR_KEY");
    this.d0 = (a)bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
  }
  
  public void e(Bundle paramBundle) {
    super.e(paramBundle);
    paramBundle.putParcelable("DATE_SELECTOR_KEY", this.c0);
    paramBundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d0);
  }
  
  class a implements o<S> {
    a(k this$0) {}
    
    public void a(S param1S) {
      Iterator<o<S>> iterator = this.a.b0.iterator();
      while (iterator.hasNext())
        ((o<S>)iterator.next()).a(param1S); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */