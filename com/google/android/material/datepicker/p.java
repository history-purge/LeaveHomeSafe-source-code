package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

abstract class p<S> extends Fragment {
  protected final LinkedHashSet<o<S>> b0 = new LinkedHashSet<o<S>>();
  
  boolean a(o<S> paramo) {
    return this.b0.add(paramo);
  }
  
  void w0() {
    this.b0.clear();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */