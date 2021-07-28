package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.e1.b;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.r;
import com.facebook.yoga.g;
import e.e.o.d0.a.a;
import java.util.Locale;
import java.util.Map;

@a(name = "RCTView")
public class ReactViewManager extends ReactClippingViewManager<f> {
  private static final int CMD_HOTSPOT_UPDATE = 1;
  
  private static final int CMD_SET_PRESSED = 2;
  
  private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
  
  public static final String REACT_CLASS = "RCTView";
  
  private static final int[] SPACING_TYPES = new int[] { 8, 0, 2, 1, 3, 4, 5 };
  
  private void handleHotspotUpdate(f paramf, ReadableArray paramReadableArray) {
    if (paramReadableArray != null && paramReadableArray.size() == 2) {
      if (Build.VERSION.SDK_INT >= 21)
        paramf.drawableHotspotChanged(q.a(paramReadableArray.getDouble(0)), q.a(paramReadableArray.getDouble(1))); 
      return;
    } 
    throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
  }
  
  private void handleSetPressed(f paramf, ReadableArray paramReadableArray) {
    if (paramReadableArray != null && paramReadableArray.size() == 1) {
      paramf.setPressed(paramReadableArray.getBoolean(0));
      return;
    } 
    throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
  }
  
  public f createViewInstance(k0 paramk0) {
    return new f((Context)paramk0);
  }
  
  public Map<String, Integer> getCommandsMap() {
    return f.a("hotspotUpdate", Integer.valueOf(1), "setPressed", Integer.valueOf(2));
  }
  
  public String getName() {
    return "RCTView";
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = -1, name = "nextFocusDown")
  public void nextFocusDown(f paramf, int paramInt) {
    paramf.setNextFocusDownId(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = -1, name = "nextFocusForward")
  public void nextFocusForward(f paramf, int paramInt) {
    paramf.setNextFocusForwardId(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = -1, name = "nextFocusLeft")
  public void nextFocusLeft(f paramf, int paramInt) {
    paramf.setNextFocusLeftId(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = -1, name = "nextFocusRight")
  public void nextFocusRight(f paramf, int paramInt) {
    paramf.setNextFocusRightId(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = -1, name = "nextFocusUp")
  public void nextFocusUp(f paramf, int paramInt) {
    paramf.setNextFocusUpId(paramInt);
  }
  
  public void receiveCommand(f paramf, int paramInt, ReadableArray paramReadableArray) {
    if (paramInt != 1) {
      if (paramInt != 2)
        return; 
      handleSetPressed(paramf, paramReadableArray);
      return;
    } 
    handleHotspotUpdate(paramf, paramReadableArray);
  }
  
  public void receiveCommand(f paramf, String paramString, ReadableArray paramReadableArray) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual hashCode : ()I
    //   4: istore #4
    //   6: iload #4
    //   8: ldc -1639565984
    //   10: if_icmpeq -> 38
    //   13: iload #4
    //   15: ldc -399823752
    //   17: if_icmpeq -> 23
    //   20: goto -> 53
    //   23: aload_2
    //   24: ldc 'hotspotUpdate'
    //   26: invokevirtual equals : (Ljava/lang/Object;)Z
    //   29: ifeq -> 53
    //   32: iconst_0
    //   33: istore #4
    //   35: goto -> 56
    //   38: aload_2
    //   39: ldc 'setPressed'
    //   41: invokevirtual equals : (Ljava/lang/Object;)Z
    //   44: ifeq -> 53
    //   47: iconst_1
    //   48: istore #4
    //   50: goto -> 56
    //   53: iconst_m1
    //   54: istore #4
    //   56: iload #4
    //   58: ifeq -> 75
    //   61: iload #4
    //   63: iconst_1
    //   64: if_icmpeq -> 68
    //   67: return
    //   68: aload_0
    //   69: aload_1
    //   70: aload_3
    //   71: invokespecial handleSetPressed : (Lcom/facebook/react/views/view/f;Lcom/facebook/react/bridge/ReadableArray;)V
    //   74: return
    //   75: aload_0
    //   76: aload_1
    //   77: aload_3
    //   78: invokespecial handleHotspotUpdate : (Lcom/facebook/react/views/view/f;Lcom/facebook/react/bridge/ReadableArray;)V
    //   81: return
  }
  
  @com.facebook.react.uimanager.e1.a(name = "accessible")
  public void setAccessible(f paramf, boolean paramBoolean) {
    paramf.setFocusable(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "backfaceVisibility")
  public void setBackfaceVisibility(f paramf, String paramString) {
    paramf.setBackfaceVisibility(paramString);
  }
  
  @b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor"})
  public void setBorderColor(f paramf, int paramInt, Integer paramInteger) {
    float f1;
    float f2 = Float.NaN;
    if (paramInteger == null) {
      f1 = Float.NaN;
    } else {
      f1 = (paramInteger.intValue() & 0xFFFFFF);
    } 
    if (paramInteger != null)
      f2 = (paramInteger.intValue() >>> 24); 
    paramf.a(SPACING_TYPES[paramInt], f1, f2);
  }
  
  @b(defaultFloat = NaNF, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius"})
  public void setBorderRadius(f paramf, int paramInt, float paramFloat) {
    float f1 = paramFloat;
    if (!g.a(paramFloat)) {
      f1 = paramFloat;
      if (paramFloat < 0.0F)
        f1 = Float.NaN; 
    } 
    paramFloat = f1;
    if (!g.a(f1))
      paramFloat = q.b(f1); 
    if (paramInt == 0) {
      paramf.setBorderRadius(paramFloat);
      return;
    } 
    paramf.a(paramFloat, paramInt - 1);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "borderStyle")
  public void setBorderStyle(f paramf, String paramString) {
    paramf.setBorderStyle(paramString);
  }
  
  @b(defaultFloat = NaNF, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
  public void setBorderWidth(f paramf, int paramInt, float paramFloat) {
    float f1 = paramFloat;
    if (!g.a(paramFloat)) {
      f1 = paramFloat;
      if (paramFloat < 0.0F)
        f1 = Float.NaN; 
    } 
    paramFloat = f1;
    if (!g.a(f1))
      paramFloat = q.b(f1); 
    paramf.a(SPACING_TYPES[paramInt], paramFloat);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "collapsable")
  public void setCollapsable(f paramf, boolean paramBoolean) {}
  
  @com.facebook.react.uimanager.e1.a(name = "focusable")
  public void setFocusable(f paramf, boolean paramBoolean) {
    if (paramBoolean) {
      paramf.setOnClickListener(new a(this, paramf));
      paramf.setFocusable(true);
      return;
    } 
    paramf.setOnClickListener(null);
    paramf.setClickable(false);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "hitSlop")
  public void setHitSlop(f paramf, ReadableMap paramReadableMap) {
    boolean bool1;
    boolean bool2;
    boolean bool3;
    if (paramReadableMap == null) {
      paramf.setHitSlopRect(null);
      return;
    } 
    boolean bool = paramReadableMap.hasKey("left");
    int i = 0;
    if (bool) {
      bool1 = (int)q.a(paramReadableMap.getDouble("left"));
    } else {
      bool1 = false;
    } 
    if (paramReadableMap.hasKey("top")) {
      bool2 = (int)q.a(paramReadableMap.getDouble("top"));
    } else {
      bool2 = false;
    } 
    if (paramReadableMap.hasKey("right")) {
      bool3 = (int)q.a(paramReadableMap.getDouble("right"));
    } else {
      bool3 = false;
    } 
    if (paramReadableMap.hasKey("bottom"))
      i = (int)q.a(paramReadableMap.getDouble("bottom")); 
    paramf.setHitSlopRect(new Rect(bool1, bool2, bool3, i));
  }
  
  @com.facebook.react.uimanager.e1.a(name = "nativeBackgroundAndroid")
  public void setNativeBackground(f paramf, ReadableMap paramReadableMap) {
    Drawable drawable;
    if (paramReadableMap == null) {
      paramReadableMap = null;
    } else {
      drawable = c.a(paramf.getContext(), paramReadableMap);
    } 
    paramf.setTranslucentBackgroundDrawable(drawable);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "nativeForegroundAndroid")
  @TargetApi(23)
  public void setNativeForeground(f paramf, ReadableMap paramReadableMap) {
    Drawable drawable;
    if (paramReadableMap == null) {
      paramReadableMap = null;
    } else {
      drawable = c.a(paramf.getContext(), paramReadableMap);
    } 
    paramf.setForeground(drawable);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "needsOffscreenAlphaCompositing")
  public void setNeedsOffscreenAlphaCompositing(f paramf, boolean paramBoolean) {
    paramf.setNeedsOffscreenAlphaCompositing(paramBoolean);
  }
  
  public void setOpacity(f paramf, float paramFloat) {
    paramf.setOpacityIfPossible(paramFloat);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "overflow")
  public void setOverflow(f paramf, String paramString) {
    paramf.setOverflow(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "pointerEvents")
  public void setPointerEvents(f paramf, String paramString) {
    r r;
    if (paramString == null) {
      r = r.f;
    } else {
      r = r.valueOf(r.toUpperCase(Locale.US).replace("-", "_"));
    } 
    paramf.setPointerEvents(r);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "hasTVPreferredFocus")
  public void setTVPreferredFocus(f paramf, boolean paramBoolean) {
    if (paramBoolean) {
      paramf.setFocusable(true);
      paramf.setFocusableInTouchMode(true);
      paramf.requestFocus();
    } 
  }
  
  public void setTransform(f paramf, ReadableArray paramReadableArray) {
    super.setTransform((View)paramf, paramReadableArray);
    paramf.d();
  }
  
  class a implements View.OnClickListener {
    a(ReactViewManager this$0, f param1f) {}
    
    public void onClick(View param1View) {
      ((UIManagerModule)((ReactContext)this.c.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new g(this.c.getId()));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/view/ReactViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */