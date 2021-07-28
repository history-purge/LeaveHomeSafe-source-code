package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.c;
import java.util.Collection;

public interface d<S> extends Parcelable {
  View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle, a parama, o<S> paramo);
  
  String a(Context paramContext);
  
  Collection<c<Long, Long>> a();
  
  int b(Context paramContext);
  
  void b(long paramLong);
  
  boolean b();
  
  Collection<Long> c();
  
  S d();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */