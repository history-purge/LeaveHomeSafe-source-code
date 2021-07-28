package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.fabric.events.EventBeatManager;
import e.e.n.a.a;

@SuppressLint({"MissingNativeLoadLibrary"})
@a
public class Binding {
  @a
  private final HybridData mHybridData = initHybrid();
  
  static {
    b.a();
  }
  
  private static native HybridData initHybrid();
  
  private native void installFabricUIManager(long paramLong, Object paramObject1, EventBeatManager paramEventBeatManager, MessageQueueThread paramMessageQueueThread, ComponentFactoryDelegate paramComponentFactoryDelegate, Object paramObject2);
  
  private native void uninstallFabricUIManager();
  
  public native void renderTemplateToSurface(int paramInt, String paramString);
  
  public native void setConstraints(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean1, boolean paramBoolean2);
  
  public native void setPixelDensity(float paramFloat);
  
  public native void startSurface(int paramInt, String paramString, NativeMap paramNativeMap);
  
  public native void startSurfaceWithConstraints(int paramInt, String paramString, NativeMap paramNativeMap, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean1, boolean paramBoolean2);
  
  public native void stopSurface(int paramInt);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/Binding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */