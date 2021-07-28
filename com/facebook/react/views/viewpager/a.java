package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

class a extends c<a> {
  private final int f;
  
  private final float g;
  
  protected a(int paramInt1, int paramInt2, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokespecial <init> : (I)V
    //   5: aload_0
    //   6: iload_2
    //   7: putfield f : I
    //   10: fload_3
    //   11: invokestatic isInfinite : (F)Z
    //   14: ifne -> 27
    //   17: fload_3
    //   18: fstore #4
    //   20: fload_3
    //   21: invokestatic isNaN : (F)Z
    //   24: ifeq -> 30
    //   27: fconst_0
    //   28: fstore #4
    //   30: aload_0
    //   31: fload #4
    //   33: putfield g : F
    //   36: return
  }
  
  private WritableMap j() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putInt("position", this.f);
    writableMap.putDouble("offset", this.g);
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public String d() {
    return "topPageScroll";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/viewpager/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */