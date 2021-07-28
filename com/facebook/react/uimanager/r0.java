package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.events.i;
import java.util.HashMap;
import java.util.Map;

class r0 {
  static Map a() {
    f.b b = f.a();
    b.a("topChange", f.a("phasedRegistrationNames", f.a("bubbled", "onChange", "captured", "onChangeCapture")));
    b.a("topSelect", f.a("phasedRegistrationNames", f.a("bubbled", "onSelect", "captured", "onSelectCapture")));
    b.a(i.a(i.c), f.a("phasedRegistrationNames", f.a("bubbled", "onTouchStart", "captured", "onTouchStartCapture")));
    b.a(i.a(i.e), f.a("phasedRegistrationNames", f.a("bubbled", "onTouchMove", "captured", "onTouchMoveCapture")));
    b.a(i.a(i.d), f.a("phasedRegistrationNames", f.a("bubbled", "onTouchEnd", "captured", "onTouchEndCapture")));
    b.a(i.a(i.f), f.a("phasedRegistrationNames", f.a("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture")));
    return b.a();
  }
  
  public static Map<String, Object> b() {
    HashMap<String, Map> hashMap = f.b();
    hashMap.put("UIView", f.a("ContentMode", f.a("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
    hashMap.put("StyleConstants", f.a("PointerEventsValues", f.a("none", Integer.valueOf(r.c.ordinal()), "boxNone", Integer.valueOf(r.d.ordinal()), "boxOnly", Integer.valueOf(r.e.ordinal()), "unspecified", Integer.valueOf(r.f.ordinal()))));
    hashMap.put("PopupMenu", f.a("dismissed", "dismissed", "itemSelected", "itemSelected"));
    hashMap.put("AccessibilityEventTypes", f.a("typeWindowStateChanged", Integer.valueOf(32), "typeViewFocused", Integer.valueOf(8), "typeViewClicked", Integer.valueOf(1)));
    return (Map)hashMap;
  }
  
  static Map c() {
    f.b b = f.a();
    b.a("topContentSizeChange", f.a("registrationName", "onContentSizeChange"));
    b.a("topLayout", f.a("registrationName", "onLayout"));
    b.a("topLoadingError", f.a("registrationName", "onLoadingError"));
    b.a("topLoadingFinish", f.a("registrationName", "onLoadingFinish"));
    b.a("topLoadingStart", f.a("registrationName", "onLoadingStart"));
    b.a("topSelectionChange", f.a("registrationName", "onSelectionChange"));
    b.a("topMessage", f.a("registrationName", "onMessage"));
    b.a("topClick", f.a("registrationName", "onClick"));
    b.a("topScrollBeginDrag", f.a("registrationName", "onScrollBeginDrag"));
    b.a("topScrollEndDrag", f.a("registrationName", "onScrollEndDrag"));
    b.a("topScroll", f.a("registrationName", "onScroll"));
    b.a("topMomentumScrollBegin", f.a("registrationName", "onMomentumScrollBegin"));
    b.a("topMomentumScrollEnd", f.a("registrationName", "onMomentumScrollEnd"));
    return b.a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */