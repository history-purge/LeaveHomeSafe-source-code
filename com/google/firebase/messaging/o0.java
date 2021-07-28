package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

public class o0 {
  private static o0 e;
  
  private String a = null;
  
  private Boolean b = null;
  
  private Boolean c = null;
  
  private final Queue<Intent> d = new ArrayDeque<Intent>();
  
  private int b(Context paramContext, Intent paramIntent) {
    String str = c(paramContext, paramIntent);
    if (str != null) {
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        String str1;
        if (str.length() != 0) {
          str1 = "Restricting intent to a specific service: ".concat(str);
        } else {
          str1 = new String("Restricting intent to a specific service: ");
        } 
        Log.d("FirebaseMessaging", str1);
      } 
      paramIntent.setClassName(paramContext.getPackageName(), str);
    } 
    try {
      ComponentName componentName;
      if (b(paramContext)) {
        componentName = y0.a(paramContext, paramIntent);
      } else {
        componentName = componentName.startService(paramIntent);
        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
      } 
      if (componentName == null) {
        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
        return 404;
      } 
      return -1;
    } catch (SecurityException securityException) {
      Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", securityException);
      return 401;
    } catch (IllegalStateException illegalStateException) {
      String str1 = String.valueOf(illegalStateException);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 45);
      stringBuilder.append("Failed to start service while in background: ");
      stringBuilder.append(str1);
      Log.e("FirebaseMessaging", stringBuilder.toString());
      return 402;
    } 
  }
  
  static o0 b() {
    // Byte code:
    //   0: ldc com/google/firebase/messaging/o0
    //   2: monitorenter
    //   3: getstatic com/google/firebase/messaging/o0.e : Lcom/google/firebase/messaging/o0;
    //   6: ifnonnull -> 19
    //   9: new com/google/firebase/messaging/o0
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic com/google/firebase/messaging/o0.e : Lcom/google/firebase/messaging/o0;
    //   19: getstatic com/google/firebase/messaging/o0.e : Lcom/google/firebase/messaging/o0;
    //   22: astore_0
    //   23: ldc com/google/firebase/messaging/o0
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc com/google/firebase/messaging/o0
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
  }
  
  private String c(Context paramContext, Intent paramIntent) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/lang/String;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_3
    //   14: areturn
    //   15: aload_1
    //   16: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   19: aload_2
    //   20: iconst_0
    //   21: invokevirtual resolveService : (Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //   24: astore_2
    //   25: aload_2
    //   26: ifnull -> 222
    //   29: aload_2
    //   30: getfield serviceInfo : Landroid/content/pm/ServiceInfo;
    //   33: ifnonnull -> 39
    //   36: goto -> 222
    //   39: aload_2
    //   40: getfield serviceInfo : Landroid/content/pm/ServiceInfo;
    //   43: astore_2
    //   44: aload_1
    //   45: invokevirtual getPackageName : ()Ljava/lang/String;
    //   48: aload_2
    //   49: getfield packageName : Ljava/lang/String;
    //   52: invokevirtual equals : (Ljava/lang/Object;)Z
    //   55: ifeq -> 146
    //   58: aload_2
    //   59: getfield name : Ljava/lang/String;
    //   62: ifnonnull -> 68
    //   65: goto -> 146
    //   68: aload_2
    //   69: getfield name : Ljava/lang/String;
    //   72: ldc '.'
    //   74: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   77: ifeq -> 129
    //   80: aload_1
    //   81: invokevirtual getPackageName : ()Ljava/lang/String;
    //   84: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   87: astore_1
    //   88: aload_2
    //   89: getfield name : Ljava/lang/String;
    //   92: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   95: astore_2
    //   96: aload_2
    //   97: invokevirtual length : ()I
    //   100: ifeq -> 112
    //   103: aload_1
    //   104: aload_2
    //   105: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   108: astore_1
    //   109: goto -> 121
    //   112: new java/lang/String
    //   115: dup
    //   116: aload_1
    //   117: invokespecial <init> : (Ljava/lang/String;)V
    //   120: astore_1
    //   121: aload_0
    //   122: aload_1
    //   123: putfield a : Ljava/lang/String;
    //   126: goto -> 137
    //   129: aload_2
    //   130: getfield name : Ljava/lang/String;
    //   133: astore_1
    //   134: goto -> 121
    //   137: aload_0
    //   138: getfield a : Ljava/lang/String;
    //   141: astore_1
    //   142: aload_0
    //   143: monitorexit
    //   144: aload_1
    //   145: areturn
    //   146: aload_2
    //   147: getfield packageName : Ljava/lang/String;
    //   150: astore_1
    //   151: aload_2
    //   152: getfield name : Ljava/lang/String;
    //   155: astore_2
    //   156: new java/lang/StringBuilder
    //   159: dup
    //   160: aload_1
    //   161: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   164: invokevirtual length : ()I
    //   167: bipush #94
    //   169: iadd
    //   170: aload_2
    //   171: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   174: invokevirtual length : ()I
    //   177: iadd
    //   178: invokespecial <init> : (I)V
    //   181: astore_3
    //   182: aload_3
    //   183: ldc 'Error resolving target intent service, skipping classname enforcement. Resolved service was: '
    //   185: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: pop
    //   189: aload_3
    //   190: aload_1
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: aload_3
    //   196: ldc '/'
    //   198: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: pop
    //   202: aload_3
    //   203: aload_2
    //   204: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: pop
    //   208: ldc 'FirebaseMessaging'
    //   210: aload_3
    //   211: invokevirtual toString : ()Ljava/lang/String;
    //   214: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   217: pop
    //   218: aload_0
    //   219: monitorexit
    //   220: aconst_null
    //   221: areturn
    //   222: ldc 'FirebaseMessaging'
    //   224: ldc 'Failed to resolve target intent service, skipping classname enforcement'
    //   226: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   229: pop
    //   230: aload_0
    //   231: monitorexit
    //   232: aconst_null
    //   233: areturn
    //   234: astore_1
    //   235: aload_0
    //   236: monitorexit
    //   237: goto -> 242
    //   240: aload_1
    //   241: athrow
    //   242: goto -> 240
    // Exception table:
    //   from	to	target	type
    //   2	7	234	finally
    //   15	25	234	finally
    //   29	36	234	finally
    //   39	65	234	finally
    //   68	109	234	finally
    //   112	121	234	finally
    //   121	126	234	finally
    //   129	134	234	finally
    //   137	142	234	finally
    //   146	218	234	finally
    //   222	230	234	finally
  }
  
  public int a(Context paramContext, Intent paramIntent) {
    if (Log.isLoggable("FirebaseMessaging", 3))
      Log.d("FirebaseMessaging", "Starting service"); 
    this.d.offer(paramIntent);
    paramIntent = new Intent("com.google.firebase.MESSAGING_EVENT");
    paramIntent.setPackage(paramContext.getPackageName());
    return b(paramContext, paramIntent);
  }
  
  Intent a() {
    return this.d.poll();
  }
  
  boolean a(Context paramContext) {
    if (this.c == null) {
      boolean bool;
      if (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.c = Boolean.valueOf(bool);
    } 
    if (!this.b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3))
      Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest"); 
    return this.c.booleanValue();
  }
  
  boolean b(Context paramContext) {
    if (this.b == null) {
      boolean bool;
      if (paramContext.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.b = Boolean.valueOf(bool);
    } 
    if (!this.b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3))
      Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest"); 
    return this.b.booleanValue();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */