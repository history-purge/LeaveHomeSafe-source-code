package com.facebook.react.bridge;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import b.g.e.d.f;

public class ColorPropConverter {
  private static final String ATTR = "attr";
  
  private static final String ATTR_SEGMENT = "attr/";
  
  private static final String JSON_KEY = "resource_paths";
  
  private static final String PACKAGE_DELIMITER = ":";
  
  private static final String PATH_DELIMITER = "/";
  
  private static final String PREFIX_ATTR = "?";
  
  private static final String PREFIX_RESOURCE = "@";
  
  public static Integer getColor(Object paramObject, Context paramContext) {
    if (paramObject == null)
      return null; 
    if (paramObject instanceof Double)
      return Integer.valueOf(((Double)paramObject).intValue()); 
    if (paramContext != null) {
      if (paramObject instanceof ReadableMap) {
        paramObject = ((ReadableMap)paramObject).getArray("resource_paths");
        if (paramObject != null) {
          int i = 0;
          while (true) {
            if (i < paramObject.size()) {
              String str = paramObject.getString(i);
              if (str != null && !str.isEmpty()) {
                boolean bool1 = str.startsWith("@");
                boolean bool2 = str.startsWith("?");
                str = str.substring(1);
                if (bool1) {
                  try {
                    return Integer.valueOf(resolveResource(paramContext, str));
                  } catch (android.content.res.Resources.NotFoundException notFoundException) {}
                } else if (bool2) {
                  int j = resolveThemeAttribute(paramContext, (String)notFoundException);
                  return Integer.valueOf(j);
                } 
              } 
              i++;
              continue;
            } 
            throw new JSApplicationCausedNativeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
          } 
        } 
        throw new JSApplicationCausedNativeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
      } 
      throw new JSApplicationCausedNativeException("ColorValue: the value must be a number or Object.");
    } 
    paramObject = new RuntimeException("Context may not be null.");
    throw paramObject;
  }
  
  private static int resolveResource(Context paramContext, String paramString) {
    String[] arrayOfString = paramString.split(":");
    String str1 = paramContext.getPackageName();
    if (arrayOfString.length > 1) {
      str1 = arrayOfString[0];
      paramString = arrayOfString[1];
    } 
    arrayOfString = paramString.split("/");
    paramString = arrayOfString[0];
    String str2 = arrayOfString[1];
    int i = paramContext.getResources().getIdentifier(str2, paramString, str1);
    return f.a(paramContext.getResources(), i, paramContext.getTheme());
  }
  
  private static int resolveThemeAttribute(Context paramContext, String paramString) {
    String str = paramString.replaceAll("attr/", "");
    String[] arrayOfString = str.split(":");
    paramString = paramContext.getPackageName();
    if (arrayOfString.length > 1) {
      paramString = arrayOfString[0];
      str = arrayOfString[1];
    } 
    int i = paramContext.getResources().getIdentifier(str, "attr", paramString);
    TypedValue typedValue = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(i, typedValue, true))
      return typedValue.data; 
    throw new Resources.NotFoundException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/ColorPropConverter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */