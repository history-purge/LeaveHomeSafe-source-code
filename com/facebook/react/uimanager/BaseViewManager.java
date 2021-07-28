package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import b.g.m.v;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.i1.a;
import e.e.e.e.a;
import e.e.o.h;
import e.e.o.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseViewManager<T extends View, C extends i> extends ViewManager<T, C> implements b<T> {
  private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float)Math.sqrt(5.0D);
  
  private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
  
  private static final String STATE_BUSY = "busy";
  
  private static final String STATE_CHECKED = "checked";
  
  private static final String STATE_EXPANDED = "expanded";
  
  private static final String STATE_MIXED = "mixed";
  
  private static j.a sMatrixDecompositionContext = new j.a();
  
  public static final Map<String, Integer> sStateDescription;
  
  private static double[] sTransformDecompositionArray = new double[16];
  
  static {
    sStateDescription = new HashMap<String, Integer>();
    sStateDescription.put("busy", Integer.valueOf(j.state_busy_description));
    sStateDescription.put("expanded", Integer.valueOf(j.state_expanded_description));
    sStateDescription.put("collapsed", Integer.valueOf(j.state_collapsed_description));
  }
  
  private void logUnsupportedPropertyWarning(String paramString) {
    a.c("ReactNative", "%s doesn't support property '%s'", new Object[] { getName(), paramString });
  }
  
  private static void resetTransformProperty(View paramView) {
    paramView.setTranslationX(q.b(0.0F));
    paramView.setTranslationY(q.b(0.0F));
    paramView.setRotation(0.0F);
    paramView.setRotationX(0.0F);
    paramView.setRotationY(0.0F);
    paramView.setScaleX(1.0F);
    paramView.setScaleY(1.0F);
    paramView.setCameraDistance(0.0F);
  }
  
  private static float sanitizeFloatPropertyValue(float paramFloat) {
    if (paramFloat >= -3.4028235E38F && paramFloat <= Float.MAX_VALUE)
      return paramFloat; 
    if (paramFloat >= -3.4028235E38F) {
      if (paramFloat == Float.NEGATIVE_INFINITY)
        return -3.4028235E38F; 
      if (paramFloat <= Float.MAX_VALUE) {
        if (paramFloat == Float.POSITIVE_INFINITY)
          return Float.MAX_VALUE; 
        if (Float.isNaN(paramFloat))
          return 0.0F; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid float property value: ");
        stringBuilder.append(paramFloat);
        throw new IllegalStateException(stringBuilder.toString());
      } 
      return Float.MAX_VALUE;
    } 
    return -3.4028235E38F;
  }
  
  private static void setTransformProperty(View paramView, ReadableArray paramReadableArray) {
    sMatrixDecompositionContext.a();
    m0.a(paramReadableArray, sTransformDecompositionArray);
    j.a(sTransformDecompositionArray, sMatrixDecompositionContext);
    paramView.setTranslationX(q.b(sanitizeFloatPropertyValue((float)sMatrixDecompositionContext.d[0])));
    paramView.setTranslationY(q.b(sanitizeFloatPropertyValue((float)sMatrixDecompositionContext.d[1])));
    paramView.setRotation(sanitizeFloatPropertyValue((float)sMatrixDecompositionContext.e[2]));
    paramView.setRotationX(sanitizeFloatPropertyValue((float)sMatrixDecompositionContext.e[0]));
    paramView.setRotationY(sanitizeFloatPropertyValue((float)sMatrixDecompositionContext.e[1]));
    paramView.setScaleX(sanitizeFloatPropertyValue((float)sMatrixDecompositionContext.b[0]));
    paramView.setScaleY(sanitizeFloatPropertyValue((float)sMatrixDecompositionContext.b[1]));
    double[] arrayOfDouble = sMatrixDecompositionContext.a;
    if (arrayOfDouble.length > 2) {
      float f2 = (float)arrayOfDouble[2];
      float f1 = f2;
      if (f2 == 0.0F)
        f1 = 7.8125E-4F; 
      f1 = -1.0F / f1;
      f2 = (c.a()).density;
      paramView.setCameraDistance(sanitizeFloatPropertyValue(f2 * f2 * f1 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
    } 
  }
  
  private void updateViewAccessibility(T paramT) {
    s.d((View)paramT);
  }
  
  private void updateViewContentDescription(T paramT) {
    String str1 = (String)paramT.getTag(h.accessibility_label);
    ReadableMap readableMap1 = (ReadableMap)paramT.getTag(h.accessibility_state);
    String str2 = (String)paramT.getTag(h.accessibility_hint);
    ArrayList<String> arrayList = new ArrayList();
    ReadableMap readableMap2 = (ReadableMap)paramT.getTag(h.accessibility_value);
    if (str1 != null)
      arrayList.add(str1); 
    if (readableMap1 != null) {
      ReadableMapKeySetIterator readableMapKeySetIterator = readableMap1.keySetIterator();
      while (readableMapKeySetIterator.hasNextKey()) {
        int i;
        Context context;
        str1 = readableMapKeySetIterator.nextKey();
        Dynamic dynamic = readableMap1.getDynamic(str1);
        if (str1.equals("checked") && dynamic.getType() == ReadableType.String && dynamic.asString().equals("mixed")) {
          context = paramT.getContext();
          i = j.state_mixed_description;
        } else if (context.equals("busy") && dynamic.getType() == ReadableType.Boolean && dynamic.asBoolean()) {
          context = paramT.getContext();
          i = j.state_busy_description;
        } else if (context.equals("expanded") && dynamic.getType() == ReadableType.Boolean) {
          context = paramT.getContext();
          if (dynamic.asBoolean()) {
            i = j.state_expanded_description;
          } else {
            i = j.state_collapsed_description;
          } 
        } else {
          continue;
        } 
        arrayList.add(context.getString(i));
      } 
    } 
    if (readableMap2 != null && readableMap2.hasKey("text")) {
      Dynamic dynamic = readableMap2.getDynamic("text");
      if (dynamic != null && dynamic.getType() == ReadableType.String)
        arrayList.add(dynamic.asString()); 
    } 
    if (str2 != null)
      arrayList.add(str2); 
    if (arrayList.size() > 0)
      paramT.setContentDescription(TextUtils.join(", ", arrayList)); 
  }
  
  public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
    f.b b1 = f.a();
    b1.a("topAccessibilityAction", f.a("registrationName", "onAccessibilityAction"));
    return b1.a();
  }
  
  protected void onAfterUpdateTransaction(T paramT) {
    super.onAfterUpdateTransaction(paramT);
    updateViewAccessibility(paramT);
  }
  
  @a(name = "accessibilityActions")
  public void setAccessibilityActions(T paramT, ReadableArray paramReadableArray) {
    if (paramReadableArray == null)
      return; 
    paramT.setTag(h.accessibility_actions, paramReadableArray);
  }
  
  @a(name = "accessibilityHint")
  public void setAccessibilityHint(T paramT, String paramString) {
    paramT.setTag(h.accessibility_hint, paramString);
    updateViewContentDescription(paramT);
  }
  
  @a(name = "accessibilityLabel")
  public void setAccessibilityLabel(T paramT, String paramString) {
    paramT.setTag(h.accessibility_label, paramString);
    updateViewContentDescription(paramT);
  }
  
  @a(name = "accessibilityLiveRegion")
  public void setAccessibilityLiveRegion(T paramT, String paramString) {
    byte b1;
    if (paramString == null || paramString.equals("none")) {
      b1 = 0;
    } else if (paramString.equals("polite")) {
      b1 = 1;
    } else if (paramString.equals("assertive")) {
      b1 = 2;
    } else {
      return;
    } 
    v.g((View)paramT, b1);
  }
  
  @a(name = "accessibilityRole")
  public void setAccessibilityRole(T paramT, String paramString) {
    if (paramString == null)
      return; 
    paramT.setTag(h.accessibility_role, s.c.a(paramString));
  }
  
  @a(name = "accessibilityValue")
  public void setAccessibilityValue(T paramT, ReadableMap paramReadableMap) {
    if (paramReadableMap == null)
      return; 
    paramT.setTag(h.accessibility_value, paramReadableMap);
    if (paramReadableMap.hasKey("text"))
      updateViewContentDescription(paramT); 
  }
  
  @a(customType = "Color", defaultInt = 0, name = "backgroundColor")
  public void setBackgroundColor(T paramT, int paramInt) {
    paramT.setBackgroundColor(paramInt);
  }
  
  public void setBorderBottomLeftRadius(T paramT, float paramFloat) {
    logUnsupportedPropertyWarning("borderBottomLeftRadius");
  }
  
  public void setBorderBottomRightRadius(T paramT, float paramFloat) {
    logUnsupportedPropertyWarning("borderBottomRightRadius");
  }
  
  public void setBorderRadius(T paramT, float paramFloat) {
    logUnsupportedPropertyWarning("borderRadius");
  }
  
  public void setBorderTopLeftRadius(T paramT, float paramFloat) {
    logUnsupportedPropertyWarning("borderTopLeftRadius");
  }
  
  public void setBorderTopRightRadius(T paramT, float paramFloat) {
    logUnsupportedPropertyWarning("borderTopRightRadius");
  }
  
  @a(name = "elevation")
  public void setElevation(T paramT, float paramFloat) {
    v.a((View)paramT, q.b(paramFloat));
  }
  
  @a(name = "importantForAccessibility")
  public void setImportantForAccessibility(T paramT, String paramString) {
    byte b1;
    if (paramString == null || paramString.equals("auto")) {
      b1 = 0;
    } else if (paramString.equals("yes")) {
      b1 = 1;
    } else if (paramString.equals("no")) {
      b1 = 2;
    } else if (paramString.equals("no-hide-descendants")) {
      b1 = 4;
    } else {
      return;
    } 
    v.h((View)paramT, b1);
  }
  
  @a(name = "nativeID")
  public void setNativeId(T paramT, String paramString) {
    paramT.setTag(h.view_tag_native_id, paramString);
    a.b((View)paramT);
  }
  
  @a(defaultFloat = 1.0F, name = "opacity")
  public void setOpacity(T paramT, float paramFloat) {
    paramT.setAlpha(paramFloat);
  }
  
  @a(name = "renderToHardwareTextureAndroid")
  public void setRenderToHardwareTexture(T paramT, boolean paramBoolean) {
    boolean bool;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    paramT.setLayerType(bool, null);
  }
  
  @a(name = "rotation")
  @Deprecated
  public void setRotation(T paramT, float paramFloat) {
    paramT.setRotation(paramFloat);
  }
  
  @a(defaultFloat = 1.0F, name = "scaleX")
  @Deprecated
  public void setScaleX(T paramT, float paramFloat) {
    paramT.setScaleX(paramFloat);
  }
  
  @a(defaultFloat = 1.0F, name = "scaleY")
  @Deprecated
  public void setScaleY(T paramT, float paramFloat) {
    paramT.setScaleY(paramFloat);
  }
  
  @a(name = "testID")
  public void setTestId(T paramT, String paramString) {
    paramT.setTag(h.react_test_id, paramString);
    paramT.setTag(paramString);
  }
  
  @a(name = "transform")
  public void setTransform(T paramT, ReadableArray paramReadableArray) {
    if (paramReadableArray == null) {
      resetTransformProperty((View)paramT);
      return;
    } 
    setTransformProperty((View)paramT, paramReadableArray);
  }
  
  @a(defaultFloat = 0.0F, name = "translateX")
  @Deprecated
  public void setTranslateX(T paramT, float paramFloat) {
    paramT.setTranslationX(q.b(paramFloat));
  }
  
  @a(defaultFloat = 0.0F, name = "translateY")
  @Deprecated
  public void setTranslateY(T paramT, float paramFloat) {
    paramT.setTranslationY(q.b(paramFloat));
  }
  
  @a(name = "accessibilityState")
  public void setViewState(T paramT, ReadableMap paramReadableMap) {
    if (paramReadableMap == null)
      return; 
    paramT.setTag(h.accessibility_state, paramReadableMap);
    paramT.setSelected(false);
    paramT.setEnabled(true);
    ReadableMapKeySetIterator readableMapKeySetIterator = paramReadableMap.keySetIterator();
    while (readableMapKeySetIterator.hasNextKey()) {
      String str = readableMapKeySetIterator.nextKey();
      if (str.equals("busy") || str.equals("expanded") || (str.equals("checked") && paramReadableMap.getType("checked") == ReadableType.String)) {
        updateViewContentDescription(paramT);
        break;
      } 
      if (Build.VERSION.SDK_INT >= 21 && paramT.isAccessibilityFocused())
        paramT.sendAccessibilityEvent(1); 
    } 
  }
  
  @a(name = "zIndex")
  public void setZIndex(T paramT, float paramFloat) {
    ViewGroupManager.setViewZIndex((View)paramT, Math.round(paramFloat));
    ViewParent viewParent = paramT.getParent();
    if (viewParent instanceof e0)
      ((e0)viewParent).b(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/BaseViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */