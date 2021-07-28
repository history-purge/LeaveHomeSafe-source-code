package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public abstract class a<T extends View, U extends b<T>> implements y0<T> {
  protected final U a;
  
  public a(U paramU) {
    this.a = paramU;
  }
  
  public void a(T paramT, String paramString, Object paramObject) {
    U u;
    int i = paramString.hashCode();
    boolean bool = false;
    boolean bool1 = false;
    switch (i) {
      default:
        i = -1;
        break;
      case 2045685618:
        if (paramString.equals("nativeID")) {
          i = 14;
          break;
        } 
      case 1505602511:
        if (paramString.equals("accessibilityActions")) {
          i = 0;
          break;
        } 
      case 1349188574:
        if (paramString.equals("borderRadius")) {
          i = 7;
          break;
        } 
      case 1287124693:
        if (paramString.equals("backgroundColor")) {
          i = 6;
          break;
        } 
      case 1153872867:
        if (paramString.equals("accessibilityState")) {
          i = 5;
          break;
        } 
      case 1146842694:
        if (paramString.equals("accessibilityLabel")) {
          i = 2;
          break;
        } 
      case 1052666732:
        if (paramString.equals("transform")) {
          i = 21;
          break;
        } 
      case 746986311:
        if (paramString.equals("importantForAccessibility")) {
          i = 13;
          break;
        } 
      case 588239831:
        if (paramString.equals("borderBottomRightRadius")) {
          i = 9;
          break;
        } 
      case 581268560:
        if (paramString.equals("borderBottomLeftRadius")) {
          i = 8;
          break;
        } 
      case 333432965:
        if (paramString.equals("borderTopRightRadius")) {
          i = 11;
          break;
        } 
      case 36255470:
        if (paramString.equals("accessibilityLiveRegion")) {
          i = 3;
          break;
        } 
      case -4379043:
        if (paramString.equals("elevation")) {
          i = 12;
          break;
        } 
      case -40300674:
        if (paramString.equals("rotation")) {
          i = 17;
          break;
        } 
      case -80891667:
        if (paramString.equals("renderToHardwareTextureAndroid")) {
          i = 16;
          break;
        } 
      case -101359900:
        if (paramString.equals("accessibilityRole")) {
          i = 4;
          break;
        } 
      case -101663499:
        if (paramString.equals("accessibilityHint")) {
          i = 1;
          break;
        } 
      case -731417480:
        if (paramString.equals("zIndex")) {
          i = 24;
          break;
        } 
      case -877170387:
        if (paramString.equals("testID")) {
          i = 20;
          break;
        } 
      case -908189617:
        if (paramString.equals("scaleY")) {
          i = 19;
          break;
        } 
      case -908189618:
        if (paramString.equals("scaleX")) {
          i = 18;
          break;
        } 
      case -1228066334:
        if (paramString.equals("borderTopLeftRadius")) {
          i = 10;
          break;
        } 
      case -1267206133:
        if (paramString.equals("opacity")) {
          i = 15;
          break;
        } 
      case -1721943861:
        if (paramString.equals("translateY")) {
          i = 23;
          break;
        } 
      case -1721943862:
        if (paramString.equals("translateX")) {
          i = 22;
          break;
        } 
    } 
    float f2 = 1.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f3 = 0.0F;
    float f1 = Float.NaN;
    switch (i) {
      default:
        return;
      case 24:
        u = this.a;
        if (paramObject == null) {
          f1 = f3;
        } else {
          f1 = ((Double)paramObject).floatValue();
        } 
        u.setZIndex(paramT, f1);
        return;
      case 23:
        u = this.a;
        if (paramObject == null) {
          f1 = f4;
        } else {
          f1 = ((Double)paramObject).floatValue();
        } 
        u.setTranslateY(paramT, f1);
        return;
      case 22:
        u = this.a;
        if (paramObject == null) {
          f1 = f5;
        } else {
          f1 = ((Double)paramObject).floatValue();
        } 
        u.setTranslateX(paramT, f1);
        return;
      case 21:
        this.a.setTransform(paramT, (ReadableArray)paramObject);
        return;
      case 20:
        this.a.setTestId(paramT, (String)paramObject);
        return;
      case 19:
        u = this.a;
        if (paramObject != null)
          f2 = ((Double)paramObject).floatValue(); 
        u.setScaleY(paramT, f2);
        return;
      case 18:
        u = this.a;
        if (paramObject != null)
          f2 = ((Double)paramObject).floatValue(); 
        u.setScaleX(paramT, f2);
        return;
      case 17:
        u = this.a;
        if (paramObject == null) {
          f1 = f6;
        } else {
          f1 = ((Double)paramObject).floatValue();
        } 
        u.setRotation(paramT, f1);
        return;
      case 16:
        u = this.a;
        if (paramObject != null)
          bool1 = ((Boolean)paramObject).booleanValue(); 
        u.setRenderToHardwareTexture(paramT, bool1);
        return;
      case 15:
        u = this.a;
        if (paramObject != null)
          f2 = ((Double)paramObject).floatValue(); 
        u.setOpacity(paramT, f2);
        return;
      case 14:
        this.a.setNativeId(paramT, (String)paramObject);
        return;
      case 13:
        this.a.setImportantForAccessibility(paramT, (String)paramObject);
        return;
      case 12:
        u = this.a;
        if (paramObject == null) {
          f1 = f7;
        } else {
          f1 = ((Double)paramObject).floatValue();
        } 
        u.setElevation(paramT, f1);
        return;
      case 11:
        u = this.a;
        if (paramObject != null)
          f1 = ((Double)paramObject).floatValue(); 
        u.setBorderTopRightRadius(paramT, f1);
        return;
      case 10:
        u = this.a;
        if (paramObject != null)
          f1 = ((Double)paramObject).floatValue(); 
        u.setBorderTopLeftRadius(paramT, f1);
        return;
      case 9:
        u = this.a;
        if (paramObject != null)
          f1 = ((Double)paramObject).floatValue(); 
        u.setBorderBottomRightRadius(paramT, f1);
        return;
      case 8:
        u = this.a;
        if (paramObject != null)
          f1 = ((Double)paramObject).floatValue(); 
        u.setBorderBottomLeftRadius(paramT, f1);
        return;
      case 7:
        u = this.a;
        if (paramObject != null)
          f1 = ((Double)paramObject).floatValue(); 
        u.setBorderRadius(paramT, f1);
        return;
      case 6:
        u = this.a;
        if (paramObject == null) {
          i = bool;
        } else {
          i = ColorPropConverter.getColor(paramObject, paramT.getContext()).intValue();
        } 
        u.setBackgroundColor(paramT, i);
        return;
      case 5:
        this.a.setViewState(paramT, (ReadableMap)paramObject);
        return;
      case 4:
        this.a.setAccessibilityRole(paramT, (String)paramObject);
        return;
      case 3:
        this.a.setAccessibilityLiveRegion(paramT, (String)paramObject);
        return;
      case 2:
        this.a.setAccessibilityLabel(paramT, (String)paramObject);
        return;
      case 1:
        this.a.setAccessibilityHint(paramT, (String)paramObject);
        return;
      case 0:
        break;
    } 
    this.a.setAccessibilityActions(paramT, (ReadableArray)paramObject);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */