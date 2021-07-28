package com.facebook.react.views.text;

import android.content.Context;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.f;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import com.facebook.yoga.n;
import e.e.o.d0.a.a;
import java.util.Map;

@a(name = "RCTText")
public class ReactTextViewManager extends ReactTextAnchorViewManager<r, p> implements f {
  public static final String REACT_CLASS = "RCTText";
  
  protected s mReactTextViewManagerCallback;
  
  public p createShadowNodeInstance() {
    return new p();
  }
  
  public p createShadowNodeInstance(s params) {
    return new p(params);
  }
  
  public r createViewInstance(k0 paramk0) {
    return new r((Context)paramk0);
  }
  
  public Map getExportedCustomDirectEventTypeConstants() {
    return f.a("topTextLayout", f.a("registrationName", "onTextLayout"), "topInlineViewLayout", f.a("registrationName", "onInlineViewLayout"));
  }
  
  public String getName() {
    return "RCTText";
  }
  
  public Class<p> getShadowNodeClass() {
    return p.class;
  }
  
  public long measure(Context paramContext, ReadableMap paramReadableMap1, ReadableMap paramReadableMap2, ReadableMap paramReadableMap3, float paramFloat1, n paramn1, float paramFloat2, n paramn2, int[] paramArrayOfint) {
    return b0.a(paramContext, paramReadableMap1, paramReadableMap2, paramFloat1, paramn1, paramFloat2, paramn2, this.mReactTextViewManagerCallback, paramArrayOfint);
  }
  
  public boolean needsCustomLayoutForChildren() {
    return true;
  }
  
  protected void onAfterUpdateTransaction(r paramr) {
    super.onAfterUpdateTransaction((View)paramr);
    paramr.d();
  }
  
  public void setPadding(r paramr, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramr.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void updateExtraData(r paramr, Object paramObject) {
    paramObject = paramObject;
    if (paramObject.a())
      z.a(paramObject.j(), (TextView)paramr); 
    paramr.setText((q)paramObject);
  }
  
  public Object updateState(r paramr, c0 paramc0, j0 paramj0) {
    byte b;
    ReadableNativeMap readableNativeMap1 = paramj0.getState();
    ReadableNativeMap readableNativeMap3 = readableNativeMap1.getMap("attributedString");
    ReadableNativeMap readableNativeMap2 = readableNativeMap1.getMap("paragraphAttributes");
    Spannable spannable = b0.b(paramr.getContext(), (ReadableMap)readableNativeMap3, this.mReactTextViewManagerCallback);
    paramr.setSpanned(spannable);
    int i = x.h(readableNativeMap2.getString("textBreakStrategy"));
    if (readableNativeMap1.hasKey("mostRecentEventCount")) {
      b = readableNativeMap1.getInt("mostRecentEventCount");
    } else {
      b = -1;
    } 
    return new q(spannable, b, false, x.b(paramc0), i, x.a(paramc0));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/ReactTextViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */