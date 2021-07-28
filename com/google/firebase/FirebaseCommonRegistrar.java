package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.n;
import com.google.firebase.components.r;
import com.google.firebase.o.d;
import com.google.firebase.r.d;
import com.google.firebase.r.f;
import com.google.firebase.r.h;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements r {
  private static String a(String paramString) {
    return paramString.replace(' ', '_').replace('/', '_');
  }
  
  public List<n<?>> getComponents() {
    ArrayList<n> arrayList = new ArrayList();
    arrayList.add(d.b());
    arrayList.add(d.a());
    arrayList.add(h.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
    arrayList.add(h.a("fire-core", "20.0.0"));
    arrayList.add(h.a("device-name", a(Build.PRODUCT)));
    arrayList.add(h.a("device-model", a(Build.DEVICE)));
    arrayList.add(h.a("device-brand", a(Build.BRAND)));
    arrayList.add(h.a("android-target-sdk", c.a));
    arrayList.add(h.a("android-min-sdk", e.a));
    arrayList.add(h.a("android-platform", d.a));
    arrayList.add(h.a("android-installer", b.a));
    String str = f.a();
    if (str != null)
      arrayList.add(h.a("kotlin", str)); 
    return (List)arrayList;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/FirebaseCommonRegistrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */