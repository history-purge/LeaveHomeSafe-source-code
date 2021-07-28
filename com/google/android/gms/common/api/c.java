package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import b.d.a;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.internal.q;
import e.f.a.e.e.a;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends Exception {
  private final a<b<?>, a> zaa;
  
  public c(@RecentlyNonNull a<b<?>, a> parama) {
    this.zaa = parama;
  }
  
  public String getMessage() {
    String str;
    ArrayList<String> arrayList = new ArrayList();
    Iterator<b> iterator = this.zaa.keySet().iterator();
    boolean bool = true;
    while (iterator.hasNext()) {
      b b = iterator.next();
      a a1 = (a)this.zaa.get(b);
      q.a(a1);
      a1 = a1;
      if (a1.r())
        bool = false; 
      String str1 = b.a();
      String str2 = String.valueOf(a1);
      StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(str1).length() + 2 + String.valueOf(str2).length());
      stringBuilder1.append(str1);
      stringBuilder1.append(": ");
      stringBuilder1.append(str2);
      arrayList.add(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    if (bool) {
      str = "None of the queried APIs are available. ";
    } else {
      str = "Some of the queried APIs are unavailable. ";
    } 
    stringBuilder.append(str);
    stringBuilder.append(TextUtils.join("; ", arrayList));
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */