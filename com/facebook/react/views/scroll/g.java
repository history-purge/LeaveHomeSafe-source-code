package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.q0;

public class g {
  public static int a(String paramString) {
    if (paramString == null || paramString.equals("auto"))
      return 1; 
    if (paramString.equals("always"))
      return 0; 
    if (paramString.equals("never"))
      return 2; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("wrong overScrollMode: ");
    stringBuilder.append(paramString);
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public static void a(ViewGroup paramViewGroup) {
    a(paramViewGroup, i.c);
  }
  
  public static void a(ViewGroup paramViewGroup, float paramFloat1, float paramFloat2) {
    a(paramViewGroup, i.d, paramFloat1, paramFloat2);
  }
  
  public static void a(ViewGroup paramViewGroup, int paramInt1, int paramInt2) {
    a(paramViewGroup, i.f, paramInt1, paramInt2);
  }
  
  private static void a(ViewGroup paramViewGroup, i parami) {
    a(paramViewGroup, parami, 0.0F, 0.0F);
  }
  
  private static void a(ViewGroup paramViewGroup, i parami, float paramFloat1, float paramFloat2) {
    View view = paramViewGroup.getChildAt(0);
    if (view == null)
      return; 
    q0.b((ReactContext)paramViewGroup.getContext(), paramViewGroup.getId()).a(h.b(paramViewGroup.getId(), parami, paramViewGroup.getScrollX(), paramViewGroup.getScrollY(), paramFloat1, paramFloat2, view.getWidth(), view.getHeight(), paramViewGroup.getWidth(), paramViewGroup.getHeight()));
  }
  
  public static void b(ViewGroup paramViewGroup) {
    a(paramViewGroup, i.g);
  }
  
  public static void b(ViewGroup paramViewGroup, float paramFloat1, float paramFloat2) {
    a(paramViewGroup, i.e, paramFloat1, paramFloat2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/scroll/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */