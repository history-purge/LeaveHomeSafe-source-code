package org.reactnative.camera;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.lwansbrough.RCTCamera.RCTCameraViewManager;
import e.e.o.v;
import java.util.Arrays;
import java.util.List;
import org.reactnative.facedetector.FaceDetectorModule;

public class c implements v {
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    return Arrays.asList(new NativeModule[] { (NativeModule)new RCTCameraModule(paramReactApplicationContext), (NativeModule)new CameraModule(paramReactApplicationContext), (NativeModule)new FaceDetectorModule(paramReactApplicationContext) });
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    return Arrays.asList(new ViewManager[] { (ViewManager)new RCTCameraViewManager(), (ViewManager)new CameraViewManager() });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */