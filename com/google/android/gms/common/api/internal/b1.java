package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import b.d.a;
import e.f.a.e.i.f.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class b1 extends Fragment implements i {
  private static WeakHashMap<Activity, WeakReference<b1>> f = new WeakHashMap<Activity, WeakReference<b1>>();
  
  private Map<String, LifecycleCallback> c = Collections.synchronizedMap((Map<String, LifecycleCallback>)new a());
  
  private int d = 0;
  
  private Bundle e;
  
  public static b1 a(Activity paramActivity) {
    WeakReference<b1> weakReference = f.get(paramActivity);
    if (weakReference != null) {
      b1 b11 = weakReference.get();
      if (b11 != null)
        return b11; 
    } 
    try {
      b1 b12 = (b1)paramActivity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
      if (b12 != null) {
        b1 b13 = b12;
        if (b12.isRemoving()) {
          b13 = new b1();
          paramActivity.getFragmentManager().beginTransaction().add(b13, "LifecycleFragmentImpl").commitAllowingStateLoss();
          f.put(paramActivity, new WeakReference<b1>(b13));
          return b13;
        } 
        f.put(paramActivity, new WeakReference<b1>(b13));
        return b13;
      } 
      b1 b11 = new b1();
      paramActivity.getFragmentManager().beginTransaction().add(b11, "LifecycleFragmentImpl").commitAllowingStateLoss();
      f.put(paramActivity, new WeakReference<b1>(b11));
      return b11;
    } catch (ClassCastException classCastException) {
      throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", classCastException);
    } 
  }
  
  public final <T extends LifecycleCallback> T a(String paramString, Class<T> paramClass) {
    return paramClass.cast(this.c.get(paramString));
  }
  
  public final void a(String paramString, LifecycleCallback paramLifecycleCallback) {
    if (!this.c.containsKey(paramString)) {
      this.c.put(paramString, paramLifecycleCallback);
      if (this.d > 0)
        (new h(Looper.getMainLooper())).post(new a1(this, paramLifecycleCallback, paramString)); 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 59);
    stringBuilder.append("LifecycleCallback with tag ");
    stringBuilder.append(paramString);
    stringBuilder.append(" already added to this fragment.");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator<LifecycleCallback> iterator = this.c.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString); 
  }
  
  public final Activity e() {
    return getActivity();
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Iterator<LifecycleCallback> iterator = this.c.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).a(paramInt1, paramInt2, paramIntent); 
  }
  
  public final void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    this.d = 1;
    this.e = paramBundle;
    for (Map.Entry<String, LifecycleCallback> entry : this.c.entrySet()) {
      LifecycleCallback lifecycleCallback = (LifecycleCallback)entry.getValue();
      if (paramBundle != null) {
        Bundle bundle = paramBundle.getBundle((String)entry.getKey());
      } else {
        entry = null;
      } 
      lifecycleCallback.a((Bundle)entry);
    } 
  }
  
  public final void onDestroy() {
    super.onDestroy();
    this.d = 5;
    Iterator<LifecycleCallback> iterator = this.c.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).b(); 
  }
  
  public final void onResume() {
    super.onResume();
    this.d = 3;
    Iterator<LifecycleCallback> iterator = this.c.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).c(); 
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    if (paramBundle == null)
      return; 
    for (Map.Entry<String, LifecycleCallback> entry : this.c.entrySet()) {
      Bundle bundle = new Bundle();
      ((LifecycleCallback)entry.getValue()).b(bundle);
      paramBundle.putBundle((String)entry.getKey(), bundle);
    } 
  }
  
  public final void onStart() {
    super.onStart();
    this.d = 2;
    Iterator<LifecycleCallback> iterator = this.c.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).d(); 
  }
  
  public final void onStop() {
    super.onStop();
    this.d = 4;
    Iterator<LifecycleCallback> iterator = this.c.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).e(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/b1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */