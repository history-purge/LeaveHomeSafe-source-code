package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.x;
import b.d.a;
import e.f.a.e.i.f.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class c1 extends Fragment implements i {
  private static WeakHashMap<e, WeakReference<c1>> e0 = new WeakHashMap<e, WeakReference<c1>>();
  
  private Map<String, LifecycleCallback> b0 = Collections.synchronizedMap((Map<String, LifecycleCallback>)new a());
  
  private int c0 = 0;
  
  private Bundle d0;
  
  public static c1 a(e parame) {
    WeakReference<c1> weakReference = e0.get(parame);
    if (weakReference != null) {
      c1 c11 = weakReference.get();
      if (c11 != null)
        return c11; 
    } 
    try {
      c1 c12 = (c1)parame.k().c("SupportLifecycleFragmentImpl");
      if (c12 != null) {
        c1 c13 = c12;
        if (c12.U()) {
          c13 = new c1();
          x x1 = parame.k().b();
          x1.a(c13, "SupportLifecycleFragmentImpl");
          x1.b();
          e0.put(parame, new WeakReference<c1>(c13));
          return c13;
        } 
        e0.put(parame, new WeakReference<c1>(c13));
        return c13;
      } 
      c1 c11 = new c1();
      x x = parame.k().b();
      x.a(c11, "SupportLifecycleFragmentImpl");
      x.b();
      e0.put(parame, new WeakReference<c1>(c11));
      return c11;
    } catch (ClassCastException classCastException) {
      throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", classCastException);
    } 
  }
  
  public final void Z() {
    super.Z();
    this.c0 = 5;
    Iterator<LifecycleCallback> iterator = this.b0.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).b(); 
  }
  
  public final <T extends LifecycleCallback> T a(String paramString, Class<T> paramClass) {
    return paramClass.cast(this.b0.get(paramString));
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent) {
    super.a(paramInt1, paramInt2, paramIntent);
    Iterator<LifecycleCallback> iterator = this.b0.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).a(paramInt1, paramInt2, paramIntent); 
  }
  
  public final void a(String paramString, LifecycleCallback paramLifecycleCallback) {
    if (!this.b0.containsKey(paramString)) {
      this.b0.put(paramString, paramLifecycleCallback);
      if (this.c0 > 0)
        (new h(Looper.getMainLooper())).post(new d1(this, paramLifecycleCallback, paramString)); 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 59);
    stringBuilder.append("LifecycleCallback with tag ");
    stringBuilder.append(paramString);
    stringBuilder.append(" already added to this fragment.");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator<LifecycleCallback> iterator = this.b0.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString); 
  }
  
  public final void c(Bundle paramBundle) {
    super.c(paramBundle);
    this.c0 = 1;
    this.d0 = paramBundle;
    for (Map.Entry<String, LifecycleCallback> entry : this.b0.entrySet()) {
      LifecycleCallback lifecycleCallback = (LifecycleCallback)entry.getValue();
      if (paramBundle != null) {
        Bundle bundle = paramBundle.getBundle((String)entry.getKey());
      } else {
        entry = null;
      } 
      lifecycleCallback.a((Bundle)entry);
    } 
  }
  
  public final void e(Bundle paramBundle) {
    super.e(paramBundle);
    if (paramBundle == null)
      return; 
    for (Map.Entry<String, LifecycleCallback> entry : this.b0.entrySet()) {
      Bundle bundle = new Bundle();
      ((LifecycleCallback)entry.getValue()).b(bundle);
      paramBundle.putBundle((String)entry.getKey(), bundle);
    } 
  }
  
  public final void e0() {
    super.e0();
    this.c0 = 3;
    Iterator<LifecycleCallback> iterator = this.b0.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).c(); 
  }
  
  public final void f0() {
    super.f0();
    this.c0 = 2;
    Iterator<LifecycleCallback> iterator = this.b0.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).d(); 
  }
  
  public final void g0() {
    super.g0();
    this.c0 = 4;
    Iterator<LifecycleCallback> iterator = this.b0.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).e(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/c1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */