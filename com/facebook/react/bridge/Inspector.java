package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import e.e.e.e.a;
import e.e.n.a.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@a
public class Inspector {
  private final HybridData mHybridData;
  
  static {
    ReactBridge.staticInit();
  }
  
  private Inspector(HybridData paramHybridData) {
    this.mHybridData = paramHybridData;
  }
  
  public static LocalConnection connect(int paramInt, RemoteConnection paramRemoteConnection) {
    try {
      return instance().connectNative(paramInt, paramRemoteConnection);
    } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
      a.b("ReactNative", "Inspector doesn't work in open source yet", unsatisfiedLinkError);
      throw new RuntimeException(unsatisfiedLinkError);
    } 
  }
  
  private native LocalConnection connectNative(int paramInt, RemoteConnection paramRemoteConnection);
  
  public static List<Page> getPages() {
    try {
      return Arrays.asList(instance().getPagesNative());
    } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
      a.b("ReactNative", "Inspector doesn't work in open source yet", unsatisfiedLinkError);
      return Collections.emptyList();
    } 
  }
  
  private native Page[] getPagesNative();
  
  private static native Inspector instance();
  
  @a
  public static class LocalConnection {
    private final HybridData mHybridData;
    
    private LocalConnection(HybridData param1HybridData) {
      this.mHybridData = param1HybridData;
    }
    
    public native void disconnect();
    
    public native void sendMessage(String param1String);
  }
  
  @a
  public static class Page {
    private final int mId;
    
    private final String mTitle;
    
    private final String mVM;
    
    @a
    private Page(int param1Int, String param1String1, String param1String2) {
      this.mId = param1Int;
      this.mTitle = param1String1;
      this.mVM = param1String2;
    }
    
    public int getId() {
      return this.mId;
    }
    
    public String getTitle() {
      return this.mTitle;
    }
    
    public String getVM() {
      return this.mVM;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Page{mId=");
      stringBuilder.append(this.mId);
      stringBuilder.append(", mTitle='");
      stringBuilder.append(this.mTitle);
      stringBuilder.append('\'');
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
  
  @a
  public static interface RemoteConnection {
    @a
    void onDisconnect();
    
    @a
    void onMessage(String param1String);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/Inspector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */