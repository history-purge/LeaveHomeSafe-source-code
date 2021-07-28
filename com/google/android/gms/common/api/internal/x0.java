package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.l;
import e.f.a.e.m.m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class x0 {
  private final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap<BasePendingResult<?>, Boolean>());
  
  private final Map<m<?>, Boolean> b = Collections.synchronizedMap(new WeakHashMap<m<?>, Boolean>());
  
  private final void a(boolean paramBoolean, Status paramStatus) {
    synchronized (this.a) {
      Map<m<?>, Boolean> map;
      HashMap<BasePendingResult<?>, Boolean> hashMap = new HashMap<BasePendingResult<?>, Boolean>(this.a);
      synchronized (this.b) {
        null = (Map)new HashMap<Object, Boolean>(this.b);
        for (Map.Entry<BasePendingResult<?>, Boolean> entry : hashMap.entrySet()) {
          if (paramBoolean || ((Boolean)entry.getValue()).booleanValue())
            ((BasePendingResult)entry.getKey()).b(paramStatus); 
        } 
        for (Map.Entry<BasePendingResult<?>, Boolean> entry1 : null.entrySet()) {
          if (paramBoolean || ((Boolean)entry1.getValue()).booleanValue())
            ((m)entry1.getKey()).b((Exception)new b(paramStatus)); 
        } 
        return;
      } 
    } 
  }
  
  final void a(int paramInt, String paramString) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: ldc 'The connection to Google Play services was lost'
    //   6: invokespecial <init> : (Ljava/lang/String;)V
    //   9: astore #4
    //   11: iload_1
    //   12: iconst_1
    //   13: if_icmpne -> 29
    //   16: ldc ' due to service disconnection.'
    //   18: astore_3
    //   19: aload #4
    //   21: aload_3
    //   22: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: pop
    //   26: goto -> 40
    //   29: iload_1
    //   30: iconst_3
    //   31: if_icmpne -> 40
    //   34: ldc ' due to dead object exception.'
    //   36: astore_3
    //   37: goto -> 19
    //   40: aload_2
    //   41: ifnull -> 59
    //   44: aload #4
    //   46: ldc ' Last reason for disconnect: '
    //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: aload #4
    //   54: aload_2
    //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: aload_0
    //   60: iconst_1
    //   61: new com/google/android/gms/common/api/Status
    //   64: dup
    //   65: bipush #20
    //   67: aload #4
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: invokespecial <init> : (ILjava/lang/String;)V
    //   75: invokespecial a : (ZLcom/google/android/gms/common/api/Status;)V
    //   78: return
  }
  
  final void a(BasePendingResult<? extends l> paramBasePendingResult, boolean paramBoolean) {
    this.a.put(paramBasePendingResult, Boolean.valueOf(paramBoolean));
    paramBasePendingResult.a(new w0(this, paramBasePendingResult));
  }
  
  final boolean a() {
    return (!this.a.isEmpty() || !this.b.isEmpty());
  }
  
  public final void b() {
    a(false, g.o);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */