package e.f.a.f.y;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

public class b {
  public static final boolean a;
  
  private static final int[] b = new int[] { 16842910, 16842919 };
  
  static final String c = b.class.getSimpleName();
  
  public static ColorStateList a(ColorStateList paramColorStateList) {
    if (paramColorStateList != null) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 22 && i <= 27 && Color.alpha(paramColorStateList.getDefaultColor()) == 0 && Color.alpha(paramColorStateList.getColorForState(b, 0)) != 0)
        Log.w(c, "Use a non-transparent color for the default color as it will be used to finish ripple animations."); 
      return paramColorStateList;
    } 
    return ColorStateList.valueOf(0);
  }
  
  public static boolean a(int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: istore #5
    //   4: iconst_0
    //   5: istore #8
    //   7: iconst_0
    //   8: istore_1
    //   9: iconst_0
    //   10: istore_2
    //   11: iconst_0
    //   12: istore_3
    //   13: iload_1
    //   14: iload #5
    //   16: if_icmpge -> 85
    //   19: aload_0
    //   20: iload_1
    //   21: iaload
    //   22: istore #6
    //   24: iload #6
    //   26: ldc 16842910
    //   28: if_icmpne -> 37
    //   31: iconst_1
    //   32: istore #4
    //   34: goto -> 75
    //   37: iload #6
    //   39: ldc 16842908
    //   41: if_icmpne -> 52
    //   44: iconst_1
    //   45: istore_3
    //   46: iload_2
    //   47: istore #4
    //   49: goto -> 75
    //   52: iload #6
    //   54: ldc 16842919
    //   56: if_icmpne -> 62
    //   59: goto -> 44
    //   62: iload_2
    //   63: istore #4
    //   65: iload #6
    //   67: ldc 16843623
    //   69: if_icmpne -> 75
    //   72: goto -> 44
    //   75: iload_1
    //   76: iconst_1
    //   77: iadd
    //   78: istore_1
    //   79: iload #4
    //   81: istore_2
    //   82: goto -> 13
    //   85: iload #8
    //   87: istore #7
    //   89: iload_2
    //   90: ifeq -> 104
    //   93: iload #8
    //   95: istore #7
    //   97: iload_3
    //   98: ifeq -> 104
    //   101: iconst_1
    //   102: istore #7
    //   104: iload #7
    //   106: ireturn
  }
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21) {
      bool = true;
    } else {
      bool = false;
    } 
    a = bool;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/y/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */