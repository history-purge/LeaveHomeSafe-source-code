package androidx.core.util;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

public class b {
  public static int a(Object... paramVarArgs) {
    return (Build.VERSION.SDK_INT >= 19) ? Objects.hash(paramVarArgs) : Arrays.hashCode(paramVarArgs);
  }
  
  public static boolean a(Object paramObject1, Object paramObject2) {
    return (Build.VERSION.SDK_INT >= 19) ? Objects.equals(paramObject1, paramObject2) : ((paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2))));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/util/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */