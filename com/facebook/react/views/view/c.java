package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.q;

public class c {
  private static final TypedValue a = new TypedValue();
  
  private static Drawable a(Context paramContext) {
    return (Build.VERSION.SDK_INT >= 21) ? paramContext.getResources().getDrawable(a.resourceId, paramContext.getTheme()) : paramContext.getResources().getDrawable(a.resourceId);
  }
  
  @TargetApi(21)
  public static Drawable a(Context paramContext, ReadableMap paramReadableMap) {
    String str = paramReadableMap.getString("type");
    if ("ThemeAttrAndroid".equals(str)) {
      str = paramReadableMap.getString("attribute");
      SoftAssertions.assertNotNull(str);
      int i = paramContext.getResources().getIdentifier(str, "attr", "android");
      if (i != 0) {
        if (paramContext.getTheme().resolveAttribute(i, a, true)) {
          Drawable drawable = a(paramContext);
          a(paramReadableMap, drawable);
          return drawable;
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Attribute ");
        stringBuilder1.append(str);
        stringBuilder1.append(" couldn't be resolved into a drawable");
        throw new JSApplicationIllegalArgumentException(stringBuilder1.toString());
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Attribute ");
      stringBuilder.append(str);
      stringBuilder.append(" couldn't be found in the resource list");
      throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    } 
    if ("RippleAndroid".equals(str)) {
      RippleDrawable rippleDrawable = c((Context)stringBuilder, paramReadableMap);
      a(paramReadableMap, (Drawable)rippleDrawable);
      return (Drawable)rippleDrawable;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid type for android drawable: ");
    stringBuilder.append(str);
    JSApplicationIllegalArgumentException jSApplicationIllegalArgumentException = new JSApplicationIllegalArgumentException(stringBuilder.toString());
    throw jSApplicationIllegalArgumentException;
  }
  
  private static Drawable a(ReadableMap paramReadableMap) {
    return (Drawable)((!paramReadableMap.hasKey("borderless") || paramReadableMap.isNull("borderless") || !paramReadableMap.getBoolean("borderless")) ? new ColorDrawable(-1) : null);
  }
  
  private static Drawable a(ReadableMap paramReadableMap, Drawable paramDrawable) {
    if (Build.VERSION.SDK_INT >= 23 && paramReadableMap.hasKey("rippleRadius") && paramDrawable instanceof RippleDrawable)
      ((RippleDrawable)paramDrawable).setRadius((int)q.a(paramReadableMap.getDouble("rippleRadius"))); 
    return paramDrawable;
  }
  
  private static int b(Context paramContext, ReadableMap paramReadableMap) {
    if (paramReadableMap.hasKey("color") && !paramReadableMap.isNull("color"))
      return paramReadableMap.getInt("color"); 
    if (paramContext.getTheme().resolveAttribute(16843820, a, true))
      return paramContext.getResources().getColor(a.resourceId); 
    throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
  }
  
  private static RippleDrawable c(Context paramContext, ReadableMap paramReadableMap) {
    if (Build.VERSION.SDK_INT >= 21) {
      int i = b(paramContext, paramReadableMap);
      Drawable drawable = a(paramReadableMap);
      return new RippleDrawable(new ColorStateList(new int[][] { {} }, new int[] { i }), null, drawable);
    } 
    throw new JSApplicationIllegalArgumentException("Ripple drawable is not available on android API <21");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/view/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */