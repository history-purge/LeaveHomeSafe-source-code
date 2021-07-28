package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import java.util.Arrays;
import java.util.HashSet;

public class c1 {
  public static final int[] a = new int[] { 8, 4, 5, 1, 3, 0, 2 };
  
  public static final int[] b = new int[] { 8, 7, 6, 4, 5, 1, 3, 0, 2 };
  
  private static final HashSet<String> c = new HashSet<String>(Arrays.asList(new String[] { 
          "alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", 
          "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", 
          "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", 
          "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", 
          "paddingBottom", "paddingStart", "paddingEnd" }));
  
  public static boolean a(ReadableMap paramReadableMap, String paramString) {
    String str;
    byte b;
    boolean bool = c.contains(paramString);
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool4 = true;
    boolean bool5 = true;
    boolean bool6 = true;
    boolean bool7 = true;
    boolean bool8 = true;
    boolean bool1 = true;
    if (bool)
      return true; 
    if ("pointerEvents".equals(paramString)) {
      str = paramReadableMap.getString(paramString);
      if (!"auto".equals(str)) {
        if ("box-none".equals(str))
          return true; 
        bool1 = false;
      } 
      return bool1;
    } 
    switch (paramString.hashCode()) {
      default:
        b = -1;
        break;
      case 1349188574:
        if (paramString.equals("borderRadius")) {
          b = 1;
          break;
        } 
      case 741115130:
        if (paramString.equals("borderWidth")) {
          b = 6;
          break;
        } 
      case 529642498:
        if (paramString.equals("overflow")) {
          b = 11;
          break;
        } 
      case -223992013:
        if (paramString.equals("borderLeftWidth")) {
          b = 7;
          break;
        } 
      case -242276144:
        if (paramString.equals("borderLeftColor")) {
          b = 2;
          break;
        } 
      case -1267206133:
        if (paramString.equals("opacity")) {
          b = 0;
          break;
        } 
      case -1290574193:
        if (paramString.equals("borderBottomWidth")) {
          b = 10;
          break;
        } 
      case -1308858324:
        if (paramString.equals("borderBottomColor")) {
          b = 5;
          break;
        } 
      case -1452542531:
        if (paramString.equals("borderTopWidth")) {
          b = 8;
          break;
        } 
      case -1470826662:
        if (paramString.equals("borderTopColor")) {
          b = 4;
          break;
        } 
      case -1971292586:
        if (paramString.equals("borderRightWidth")) {
          b = 9;
          break;
        } 
      case -1989576717:
        if (paramString.equals("borderRightColor")) {
          b = 3;
          break;
        } 
    } 
    switch (b) {
      default:
        return false;
      case 11:
        bool1 = bool2;
        if (!str.isNull("overflow")) {
          if ("visible".equals(str.getString("overflow")))
            return true; 
          bool1 = false;
        } 
        return bool1;
      case 10:
        bool1 = bool3;
        if (!str.isNull("borderBottomWidth")) {
          if (str.getDouble("borderBottomWidth") == 0.0D)
            return true; 
          bool1 = false;
        } 
        return bool1;
      case 9:
        bool1 = bool4;
        if (!str.isNull("borderRightWidth")) {
          if (str.getDouble("borderRightWidth") == 0.0D)
            return true; 
          bool1 = false;
        } 
        return bool1;
      case 8:
        bool1 = bool5;
        if (!str.isNull("borderTopWidth")) {
          if (str.getDouble("borderTopWidth") == 0.0D)
            return true; 
          bool1 = false;
        } 
        return bool1;
      case 7:
        bool1 = bool6;
        if (!str.isNull("borderLeftWidth")) {
          if (str.getDouble("borderLeftWidth") == 0.0D)
            return true; 
          bool1 = false;
        } 
        return bool1;
      case 6:
        bool1 = bool7;
        if (!str.isNull("borderWidth")) {
          if (str.getDouble("borderWidth") == 0.0D)
            return true; 
          bool1 = false;
        } 
        return bool1;
      case 5:
        return (!str.isNull("borderBottomColor") && str.getInt("borderBottomColor") == 0);
      case 4:
        return (!str.isNull("borderTopColor") && str.getInt("borderTopColor") == 0);
      case 3:
        return (!str.isNull("borderRightColor") && str.getInt("borderRightColor") == 0);
      case 2:
        return (!str.isNull("borderLeftColor") && str.getInt("borderLeftColor") == 0);
      case 1:
        return (str.hasKey("backgroundColor") && str.getInt("backgroundColor") != 0) ? false : (!(str.hasKey("borderWidth") && !str.isNull("borderWidth") && str.getDouble("borderWidth") != 0.0D));
      case 0:
        break;
    } 
    bool1 = bool8;
    if (!str.isNull("opacity")) {
      if (str.getDouble("opacity") == 1.0D)
        return true; 
      bool1 = false;
    } 
    return bool1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/c1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */