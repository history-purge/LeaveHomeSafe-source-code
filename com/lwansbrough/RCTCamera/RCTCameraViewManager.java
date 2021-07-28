package com.lwansbrough.RCTCamera;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.k0;
import java.util.ArrayList;
import java.util.Map;

public class RCTCameraViewManager extends ViewGroupManager<d> {
  public static final int COMMAND_START_PREVIEW = 2;
  
  public static final int COMMAND_STOP_PREVIEW = 1;
  
  private static final String REACT_CLASS = "RCTCamera";
  
  public d createViewInstance(k0 paramk0) {
    return new d((Context)paramk0);
  }
  
  public Map<String, Integer> getCommandsMap() {
    return f.a("stopPreview", Integer.valueOf(1), "startPreview", Integer.valueOf(2));
  }
  
  public String getName() {
    return "RCTCamera";
  }
  
  public void receiveCommand(d paramd, int paramInt, ReadableArray paramReadableArray) {
    if (paramd != null) {
      if (paramInt != 1) {
        if (paramInt == 2) {
          paramd.a();
          return;
        } 
        throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", new Object[] { Integer.valueOf(paramInt), RCTCameraViewManager.class.getSimpleName() }));
      } 
      paramd.b();
      return;
    } 
    throw new AssertionError();
  }
  
  @a(name = "aspect")
  public void setAspect(d paramd, int paramInt) {
    paramd.setAspect(paramInt);
  }
  
  @a(name = "barCodeTypes")
  public void setBarCodeTypes(d paramd, ReadableArray paramReadableArray) {
    if (paramReadableArray == null)
      return; 
    ArrayList<String> arrayList = new ArrayList(paramReadableArray.size());
    for (int i = 0; i < paramReadableArray.size(); i++)
      arrayList.add(paramReadableArray.getString(i)); 
    paramd.setBarCodeTypes(arrayList);
  }
  
  @a(name = "barcodeScannerEnabled")
  public void setBarcodeScannerEnabled(d paramd, boolean paramBoolean) {
    paramd.setBarcodeScannerEnabled(paramBoolean);
  }
  
  @a(name = "captureAudio")
  public void setCaptureAudio(d paramd, boolean paramBoolean) {}
  
  @a(name = "captureMode")
  public void setCaptureMode(d paramd, int paramInt) {
    paramd.setCaptureMode(paramInt);
  }
  
  @a(name = "captureQuality")
  public void setCaptureQuality(d paramd, String paramString) {
    paramd.setCaptureQuality(paramString);
  }
  
  @a(name = "captureTarget")
  public void setCaptureTarget(d paramd, int paramInt) {}
  
  @a(name = "clearWindowBackground")
  public void setClearWindowBackground(d paramd, boolean paramBoolean) {
    paramd.setClearWindowBackground(paramBoolean);
  }
  
  @a(name = "flashMode")
  public void setFlashMode(d paramd, int paramInt) {
    paramd.setFlashMode(paramInt);
  }
  
  @a(name = "orientation")
  public void setOrientation(d paramd, int paramInt) {
    paramd.setOrientation(paramInt);
  }
  
  @a(name = "torchMode")
  public void setTorchMode(d paramd, int paramInt) {
    paramd.setTorchMode(paramInt);
  }
  
  @a(name = "type")
  public void setType(d paramd, int paramInt) {
    paramd.setCameraType(paramInt);
  }
  
  @a(name = "zoom")
  public void setZoom(d paramd, int paramInt) {
    paramd.setZoom(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/lwansbrough/RCTCamera/RCTCameraViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */