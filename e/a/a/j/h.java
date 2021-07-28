package e.a.a.j;

import e.a.a.a;

public class h implements a {
  private static boolean[] c;
  
  private static boolean[] d;
  
  static {
    a();
  }
  
  private static void a() {
    // Byte code:
    //   0: sipush #256
    //   3: newarray boolean
    //   5: putstatic e/a/a/j/h.d : [Z
    //   8: sipush #256
    //   11: newarray boolean
    //   13: putstatic e/a/a/j/h.c : [Z
    //   16: iconst_0
    //   17: istore_0
    //   18: iload_0
    //   19: getstatic e/a/a/j/h.d : [Z
    //   22: arraylength
    //   23: if_icmpge -> 194
    //   26: getstatic e/a/a/j/h.c : [Z
    //   29: astore_3
    //   30: iconst_1
    //   31: istore_2
    //   32: iload_0
    //   33: bipush #58
    //   35: if_icmpeq -> 118
    //   38: bipush #65
    //   40: iload_0
    //   41: if_icmpgt -> 50
    //   44: iload_0
    //   45: bipush #90
    //   47: if_icmple -> 118
    //   50: iload_0
    //   51: bipush #95
    //   53: if_icmpeq -> 118
    //   56: bipush #97
    //   58: iload_0
    //   59: if_icmpgt -> 68
    //   62: iload_0
    //   63: bipush #122
    //   65: if_icmple -> 118
    //   68: sipush #192
    //   71: iload_0
    //   72: if_icmpgt -> 82
    //   75: iload_0
    //   76: sipush #214
    //   79: if_icmple -> 118
    //   82: sipush #216
    //   85: iload_0
    //   86: if_icmpgt -> 96
    //   89: iload_0
    //   90: sipush #246
    //   93: if_icmple -> 118
    //   96: sipush #248
    //   99: iload_0
    //   100: if_icmpgt -> 113
    //   103: iload_0
    //   104: sipush #255
    //   107: if_icmpgt -> 113
    //   110: goto -> 118
    //   113: iconst_0
    //   114: istore_1
    //   115: goto -> 120
    //   118: iconst_1
    //   119: istore_1
    //   120: aload_3
    //   121: iload_0
    //   122: iload_1
    //   123: bastore
    //   124: getstatic e/a/a/j/h.d : [Z
    //   127: astore_3
    //   128: iload_2
    //   129: istore_1
    //   130: getstatic e/a/a/j/h.c : [Z
    //   133: iload_0
    //   134: baload
    //   135: ifne -> 182
    //   138: iload_2
    //   139: istore_1
    //   140: iload_0
    //   141: bipush #45
    //   143: if_icmpeq -> 182
    //   146: iload_2
    //   147: istore_1
    //   148: iload_0
    //   149: bipush #46
    //   151: if_icmpeq -> 182
    //   154: bipush #48
    //   156: iload_0
    //   157: if_icmpgt -> 168
    //   160: iload_2
    //   161: istore_1
    //   162: iload_0
    //   163: bipush #57
    //   165: if_icmple -> 182
    //   168: iload_0
    //   169: sipush #183
    //   172: if_icmpne -> 180
    //   175: iload_2
    //   176: istore_1
    //   177: goto -> 182
    //   180: iconst_0
    //   181: istore_1
    //   182: aload_3
    //   183: iload_0
    //   184: iload_1
    //   185: bastore
    //   186: iload_0
    //   187: iconst_1
    //   188: iadd
    //   189: i2c
    //   190: istore_0
    //   191: goto -> 18
    //   194: return
  }
  
  static boolean a(char paramChar) {
    return ((paramChar <= '\037' || paramChar == '') && paramChar != '\t' && paramChar != '\n' && paramChar != '\r');
  }
  
  static boolean a(String paramString) {
    boolean bool3 = false;
    if (paramString == null)
      return false; 
    int i = 0;
    boolean bool1 = true;
    int j;
    for (j = 0; i < paramString.length(); j = k) {
      boolean bool = bool1;
      int k = j;
      if (paramString.charAt(i) == '-') {
        k = j + 1;
        if (bool1 && (i == 8 || i == 13 || i == 18 || i == 23)) {
          bool = true;
        } else {
          bool = false;
        } 
      } 
      i++;
      bool1 = bool;
    } 
    boolean bool2 = bool3;
    if (bool1) {
      bool2 = bool3;
      if (4 == j) {
        bool2 = bool3;
        if (36 == i)
          bool2 = true; 
      } 
    } 
    return bool2;
  }
  
  private static boolean b(char paramChar) {
    return ((paramChar <= 'ÿ' && d[paramChar]) || c(paramChar) || (paramChar >= '̀' && paramChar <= 'ͯ') || (paramChar >= '‿' && paramChar <= '⁀'));
  }
  
  public static boolean b(String paramString) {
    if (paramString.length() > 0 && !c(paramString.charAt(0)))
      return false; 
    for (int i = 1; i < paramString.length(); i++) {
      if (!b(paramString.charAt(i)))
        return false; 
    } 
    return true;
  }
  
  private static boolean c(char paramChar) {
    return ((paramChar <= 'ÿ' && c[paramChar]) || (paramChar >= 'Ā' && paramChar <= '˿') || (paramChar >= 'Ͱ' && paramChar <= 'ͽ') || (paramChar >= 'Ϳ' && paramChar <= '῿') || (paramChar >= '‌' && paramChar <= '‍') || (paramChar >= '⁰' && paramChar <= '↏') || (paramChar >= 'Ⰰ' && paramChar <= '⿯') || (paramChar >= '、' && paramChar <= '퟿') || (paramChar >= '豈' && paramChar <= '﷏') || (paramChar >= 'ﷰ' && paramChar <= '�') || (paramChar >= 65536 && paramChar <= 983039));
  }
  
  public static boolean c(String paramString) {
    if (paramString.length() > 0 && (!c(paramString.charAt(0)) || paramString.charAt(0) == ':'))
      return false; 
    int i = 1;
    while (i < paramString.length()) {
      if (b(paramString.charAt(i))) {
        if (paramString.charAt(i) == ':')
          return false; 
        i++;
        continue;
      } 
      return false;
    } 
    return true;
  }
  
  public static String d(String paramString) {
    if ("x-default".equals(paramString))
      return paramString; 
    StringBuffer stringBuffer = new StringBuffer();
    int i = 0;
    for (int j = 1; i < paramString.length(); j = k) {
      char c = paramString.charAt(i);
      int k = j;
      if (c != ' ')
        if (c != '-' && c != '_') {
          char c1;
          if (j != 2) {
            c1 = Character.toLowerCase(paramString.charAt(i));
          } else {
            c1 = Character.toUpperCase(paramString.charAt(i));
          } 
          stringBuffer.append(c1);
          k = j;
        } else {
          stringBuffer.append('-');
          k = j + 1;
        }  
      i++;
    } 
    return stringBuffer.toString();
  }
  
  static String[] e(String paramString) {
    int j = paramString.indexOf('=');
    if (paramString.charAt(1) == '?') {
      i = 2;
    } else {
      i = 1;
    } 
    String str = paramString.substring(i, j);
    int i = j + 1;
    char c = paramString.charAt(i);
    i++;
    int k = paramString.length() - 2;
    StringBuffer stringBuffer = new StringBuffer(k - j);
    while (i < k) {
      stringBuffer.append(paramString.charAt(i));
      j = i + 1;
      i = j;
      if (paramString.charAt(j) == c)
        i = j + 1; 
    } 
    return new String[] { str, stringBuffer.toString() };
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */