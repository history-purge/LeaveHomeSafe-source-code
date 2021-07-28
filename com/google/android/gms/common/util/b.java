package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;

public final class b {
  @RecentlyNonNull
  public static <T> boolean a(@RecentlyNonNull T[] paramArrayOfT, @RecentlyNonNull T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: ifnull -> 10
    //   4: aload_0
    //   5: arraylength
    //   6: istore_3
    //   7: goto -> 12
    //   10: iconst_0
    //   11: istore_3
    //   12: iconst_0
    //   13: istore_2
    //   14: iload_2
    //   15: iload_3
    //   16: if_icmpge -> 39
    //   19: aload_0
    //   20: iload_2
    //   21: aaload
    //   22: aload_1
    //   23: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   26: ifeq -> 32
    //   29: goto -> 41
    //   32: iload_2
    //   33: iconst_1
    //   34: iadd
    //   35: istore_2
    //   36: goto -> 14
    //   39: iconst_m1
    //   40: istore_2
    //   41: iload_2
    //   42: iflt -> 47
    //   45: iconst_1
    //   46: ireturn
    //   47: iconst_0
    //   48: ireturn
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */