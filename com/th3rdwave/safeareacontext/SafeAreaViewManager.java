package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.k0;
import java.util.EnumSet;

public class SafeAreaViewManager extends ViewGroupManager<g> {
  public k createShadowNodeInstance() {
    return new k();
  }
  
  public g createViewInstance(k0 paramk0) {
    return new g((Context)paramk0);
  }
  
  public String getName() {
    return "RNCSafeAreaView";
  }
  
  public Class<? extends i> getShadowNodeClass() {
    return (Class)k.class;
  }
  
  @a(name = "edges")
  public void setEdges(g paramg, ReadableArray paramReadableArray) {
    EnumSet<h> enumSet = EnumSet.noneOf(h.class);
    if (paramReadableArray != null)
      for (int i = 0; i < paramReadableArray.size(); i++) {
        h h;
        String str = paramReadableArray.getString(i);
        if ("top".equals(str)) {
          h = h.c;
        } else if ("right".equals(h)) {
          h = h.d;
        } else if ("bottom".equals(h)) {
          h = h.e;
        } else if ("left".equals(h)) {
          h = h.f;
        } else {
          continue;
        } 
        enumSet.add(h);
        continue;
      }  
    paramg.setEdges(enumSet);
  }
  
  @a(name = "mode")
  public void setMode(g paramg, String paramString) {
    j j;
    if ("padding".equals(paramString)) {
      j = j.c;
    } else if ("margin".equals(j)) {
      j = j.d;
    } else {
      return;
    } 
    paramg.setMode(j);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/th3rdwave/safeareacontext/SafeAreaViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */