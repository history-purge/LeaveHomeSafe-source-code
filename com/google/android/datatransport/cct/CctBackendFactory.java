package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.d;
import com.google.android.datatransport.runtime.backends.h;
import com.google.android.datatransport.runtime.backends.m;

@Keep
public class CctBackendFactory implements d {
  public m create(h paramh) {
    return new d(paramh.a(), paramh.d(), paramh.c());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/cct/CctBackendFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */