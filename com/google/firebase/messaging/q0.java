package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

final class q0 {
  private final SharedPreferences a;
  
  private final String b;
  
  private final String c;
  
  private final ArrayDeque<String> d = new ArrayDeque<String>();
  
  private final Executor e;
  
  private boolean f = false;
  
  private q0(SharedPreferences paramSharedPreferences, String paramString1, String paramString2, Executor paramExecutor) {
    this.a = paramSharedPreferences;
    this.b = "topic_operation_queue";
    this.c = ",";
    this.e = paramExecutor;
  }
  
  static q0 a(SharedPreferences paramSharedPreferences, String paramString1, String paramString2, Executor paramExecutor) {
    q0 q01 = new q0(paramSharedPreferences, "topic_operation_queue", ",", paramExecutor);
    q01.d();
    return q01;
  }
  
  private boolean a(boolean paramBoolean) {
    boolean bool = paramBoolean;
    if (paramBoolean) {
      bool = paramBoolean;
      if (!this.f) {
        f();
        bool = true;
      } 
    } 
    return bool;
  }
  
  private void d() {
    synchronized (this.d) {
      this.d.clear();
      String str = this.a.getString(this.b, "");
      if (TextUtils.isEmpty(str) || !str.contains(this.c))
        return; 
      String[] arrayOfString = str.split(this.c, -1);
      int j = arrayOfString.length;
      byte b = 0;
      int i = b;
      if (j == 0) {
        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
        i = b;
      } 
      while (true) {
        if (i < j) {
          String str1 = arrayOfString[i];
          if (!TextUtils.isEmpty(str1))
            this.d.add(str1); 
        } else {
          return;
        } 
        i++;
      } 
    } 
  }
  
  private void e() {
    synchronized (this.d) {
      this.a.edit().putString(this.b, c()).commit();
      return;
    } 
  }
  
  private void f() {
    this.e.execute(new p0(this));
  }
  
  public boolean a(Object paramObject) {
    synchronized (this.d) {
      boolean bool = this.d.remove(paramObject);
      a(bool);
      return bool;
    } 
  }
  
  public boolean a(String paramString) {
    if (TextUtils.isEmpty(paramString) || paramString.contains(this.c))
      return false; 
    synchronized (this.d) {
      boolean bool = this.d.add(paramString);
      a(bool);
      return bool;
    } 
  }
  
  public String b() {
    synchronized (this.d) {
      return this.d.peek();
    } 
  }
  
  public String c() {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<String> iterator = this.d.iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(iterator.next());
      stringBuilder.append(this.c);
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */