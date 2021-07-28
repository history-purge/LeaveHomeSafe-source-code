package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class o {
  @RecentlyNonNull
  public static int a(@RecentlyNonNull Object... paramVarArgs) {
    return Arrays.hashCode(paramVarArgs);
  }
  
  @RecentlyNonNull
  public static a a(@RecentlyNonNull Object paramObject) {
    return new a(paramObject, null);
  }
  
  @RecentlyNonNull
  public static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2)));
  }
  
  public static final class a {
    private final List<String> a;
    
    private final Object b;
    
    private a(Object param1Object) {
      q.a(param1Object);
      this.b = param1Object;
      this.a = new ArrayList<String>();
    }
    
    @RecentlyNonNull
    public final a a(@RecentlyNonNull String param1String, Object param1Object) {
      List<String> list = this.a;
      q.a(param1String);
      param1String = param1String;
      param1Object = String.valueOf(param1Object);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(param1String).length() + 1 + String.valueOf(param1Object).length());
      stringBuilder.append(param1String);
      stringBuilder.append("=");
      stringBuilder.append((String)param1Object);
      list.add(stringBuilder.toString());
      return this;
    }
    
    @RecentlyNonNull
    public final String toString() {
      StringBuilder stringBuilder = new StringBuilder(100);
      stringBuilder.append(this.b.getClass().getSimpleName());
      stringBuilder.append('{');
      int j = this.a.size();
      for (int i = 0; i < j; i++) {
        stringBuilder.append(this.a.get(i));
        if (i < j - 1)
          stringBuilder.append(", "); 
      } 
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */