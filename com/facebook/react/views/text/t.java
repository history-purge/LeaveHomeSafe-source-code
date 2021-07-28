package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;

public class t {
  public static int a(String paramString) {
    return "italic".equals(paramString) ? 2 : ("normal".equals(paramString) ? 0 : -1);
  }
  
  public static Typeface a(Typeface paramTypeface, int paramInt1, int paramInt2, String paramString, AssetManager paramAssetManager) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #7
    //   3: aload_0
    //   4: ifnonnull -> 13
    //   7: iconst_0
    //   8: istore #6
    //   10: goto -> 19
    //   13: aload_0
    //   14: invokevirtual getStyle : ()I
    //   17: istore #6
    //   19: iload_2
    //   20: iconst_1
    //   21: if_icmpeq -> 44
    //   24: iload #7
    //   26: istore #5
    //   28: iload #6
    //   30: iconst_1
    //   31: iand
    //   32: ifeq -> 47
    //   35: iload #7
    //   37: istore #5
    //   39: iload_2
    //   40: iconst_m1
    //   41: if_icmpne -> 47
    //   44: iconst_1
    //   45: istore #5
    //   47: iload_1
    //   48: iconst_2
    //   49: if_icmpeq -> 72
    //   52: iload #5
    //   54: istore #7
    //   56: iload #6
    //   58: iconst_2
    //   59: iand
    //   60: ifeq -> 78
    //   63: iload #5
    //   65: istore #7
    //   67: iload_1
    //   68: iconst_m1
    //   69: if_icmpne -> 78
    //   72: iload #5
    //   74: iconst_2
    //   75: ior
    //   76: istore #7
    //   78: aload_3
    //   79: ifnull -> 98
    //   82: invokestatic a : ()Lcom/facebook/react/views/text/i;
    //   85: aload_3
    //   86: iload #7
    //   88: iload_2
    //   89: aload #4
    //   91: invokevirtual a : (Ljava/lang/String;IILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;
    //   94: astore_3
    //   95: goto -> 111
    //   98: aload_0
    //   99: astore_3
    //   100: aload_0
    //   101: ifnull -> 111
    //   104: aload_0
    //   105: iload #7
    //   107: invokestatic create : (Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
    //   110: astore_3
    //   111: aload_3
    //   112: ifnull -> 117
    //   115: aload_3
    //   116: areturn
    //   117: iload #7
    //   119: invokestatic defaultFromStyle : (I)Landroid/graphics/Typeface;
    //   122: areturn
  }
  
  public static String a(ReadableArray paramReadableArray) {
    if (paramReadableArray == null || paramReadableArray.size() == 0)
      return null; 
    ArrayList<String> arrayList = new ArrayList();
    for (int i = 0; i < paramReadableArray.size(); i++) {
      String str = paramReadableArray.getString(i);
      if (str != null) {
        byte b = -1;
        switch (str.hashCode()) {
          case 1183323111:
            if (str.equals("small-caps"))
              b = 0; 
            break;
          case -659678800:
            if (str.equals("oldstyle-nums"))
              b = 1; 
            break;
          case -771984547:
            if (str.equals("tabular-nums"))
              b = 3; 
            break;
          case -1061392823:
            if (str.equals("lining-nums"))
              b = 2; 
            break;
          case -1195362251:
            if (str.equals("proportional-nums"))
              b = 4; 
            break;
        } 
        if (b != 0) {
          if (b != 1) {
            if (b != 2) {
              if (b != 3) {
                if (b != 4)
                  continue; 
                str = "'pnum'";
              } else {
                str = "'tnum'";
              } 
            } else {
              str = "'lnum'";
            } 
          } else {
            str = "'onum'";
          } 
        } else {
          str = "'smcp'";
        } 
        arrayList.add(str);
      } 
      continue;
    } 
    return TextUtils.join(", ", arrayList);
  }
  
  public static int b(String paramString) {
    byte b;
    if (paramString != null) {
      b = c(paramString);
    } else {
      b = -1;
    } 
    boolean bool = false;
    if (b == -1)
      b = 0; 
    return (b == 700 || "bold".equals(paramString)) ? 1 : ((b != 400) ? ("normal".equals(paramString) ? 0 : b) : bool);
  }
  
  private static int c(String paramString) {
    return (paramString.length() == 3 && paramString.endsWith("00") && paramString.charAt(0) <= '9' && paramString.charAt(0) >= '1') ? ((paramString.charAt(0) - 48) * 100) : -1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */