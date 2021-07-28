package com.swmansion.reanimated.f;

import android.view.View;
import android.view.ViewGroup;
import b.r.z;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.g;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.n0;

public class c {
  private final UIManagerModule a;
  
  public c(UIManagerModule paramUIManagerModule) {
    this.a = paramUIManagerModule;
  }
  
  public void a(int paramInt, ReadableMap paramReadableMap) {
    this.a.prependUIBlock(new a(this, paramInt, paramReadableMap));
  }
  
  class a implements n0 {
    a(c this$0, int param1Int, ReadableMap param1ReadableMap) {}
    
    public void a(m param1m) {
      try {
        View view = param1m.b(this.a);
        if (view instanceof ViewGroup) {
          ReadableArray readableArray = this.b.getArray("transitions");
          int i = 0;
          int j = readableArray.size();
          while (i < j) {
            z.a((ViewGroup)view, d.a(readableArray.getMap(i)));
            i++;
          } 
        } 
        return;
      } catch (g g) {
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */