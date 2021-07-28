package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;

public class t {
  private static t c;
  
  private Boolean a = null;
  
  private Boolean b = null;
  
  public static t a() {
    // Byte code:
    //   0: ldc com/google/firebase/iid/t
    //   2: monitorenter
    //   3: getstatic com/google/firebase/iid/t.c : Lcom/google/firebase/iid/t;
    //   6: ifnonnull -> 19
    //   9: new com/google/firebase/iid/t
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic com/google/firebase/iid/t.c : Lcom/google/firebase/iid/t;
    //   19: getstatic com/google/firebase/iid/t.c : Lcom/google/firebase/iid/t;
    //   22: astore_0
    //   23: ldc com/google/firebase/iid/t
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc com/google/firebase/iid/t
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
  }
  
  boolean a(Context paramContext) {
    if (this.b == null) {
      boolean bool;
      if (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.b = Boolean.valueOf(bool);
    } 
    if (!this.a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3))
      Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest"); 
    return this.b.booleanValue();
  }
  
  boolean b(Context paramContext) {
    if (this.a == null) {
      boolean bool;
      if (paramContext.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.a = Boolean.valueOf(bool);
    } 
    if (!this.a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3))
      Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest"); 
    return this.a.booleanValue();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/iid/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */