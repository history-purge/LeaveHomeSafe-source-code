package org.reactnative.camera;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import e.f.a.b.j;
import java.util.ArrayList;
import java.util.Map;

public class CameraViewManager extends ViewGroupManager<d> {
  private static final String REACT_CLASS = "RNCamera";
  
  protected d createViewInstance(k0 paramk0) {
    return new d(paramk0);
  }
  
  public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
    f.b b = f.a();
    for (a a : a.values())
      b.a(a.toString(), f.a("registrationName", a.toString())); 
    return b.a();
  }
  
  public String getName() {
    return "RNCamera";
  }
  
  public void onDropViewInstance(d paramd) {
    paramd.onHostDestroy();
    super.onDropViewInstance((View)paramd);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "autoFocus")
  public void setAutoFocus(d paramd, boolean paramBoolean) {
    paramd.setAutoFocus(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "autoFocusPointOfInterest")
  public void setAutoFocusPointOfInterest(d paramd, ReadableMap paramReadableMap) {
    if (paramReadableMap != null)
      paramd.a((float)paramReadableMap.getDouble("x"), (float)paramReadableMap.getDouble("y")); 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "barCodeScannerEnabled")
  public void setBarCodeScanning(d paramd, boolean paramBoolean) {
    paramd.setShouldScanBarCodes(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "barCodeTypes")
  public void setBarCodeTypes(d paramd, ReadableArray paramReadableArray) {
    if (paramReadableArray == null)
      return; 
    ArrayList<String> arrayList = new ArrayList(paramReadableArray.size());
    for (int i = 0; i < paramReadableArray.size(); i++)
      arrayList.add(paramReadableArray.getString(i)); 
    paramd.setBarCodeTypes(arrayList);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "cameraId")
  public void setCameraId(d paramd, String paramString) {
    paramd.setCameraId(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "cameraViewDimensions")
  public void setCameraViewDimensions(d paramd, ReadableMap paramReadableMap) {
    if (paramReadableMap != null)
      paramd.a((int)paramReadableMap.getDouble("width"), (int)paramReadableMap.getDouble("height")); 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "detectedImageInEvent")
  public void setDetectedImageInEvent(d paramd, boolean paramBoolean) {
    paramd.setDetectedImageInEvent(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "exposure")
  public void setExposureCompensation(d paramd, float paramFloat) {
    paramd.setExposureCompensation(paramFloat);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "faceDetectorEnabled")
  public void setFaceDetecting(d paramd, boolean paramBoolean) {
    paramd.setShouldDetectFaces(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "faceDetectionClassifications")
  public void setFaceDetectionClassifications(d paramd, int paramInt) {
    paramd.setFaceDetectionClassifications(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "faceDetectionLandmarks")
  public void setFaceDetectionLandmarks(d paramd, int paramInt) {
    paramd.setFaceDetectionLandmarks(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "faceDetectionMode")
  public void setFaceDetectionMode(d paramd, int paramInt) {
    paramd.setFaceDetectionMode(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "flashMode")
  public void setFlashMode(d paramd, int paramInt) {
    paramd.setFlash(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "focusDepth")
  public void setFocusDepth(d paramd, float paramFloat) {
    paramd.setFocusDepth(paramFloat);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "googleVisionBarcodeDetectorEnabled")
  public void setGoogleVisionBarcodeDetecting(d paramd, boolean paramBoolean) {
    paramd.setShouldGoogleDetectBarcodes(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "googleVisionBarcodeMode")
  public void setGoogleVisionBarcodeMode(d paramd, int paramInt) {
    paramd.setGoogleVisionBarcodeMode(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "googleVisionBarcodeType")
  public void setGoogleVisionBarcodeType(d paramd, int paramInt) {
    paramd.setGoogleVisionBarcodeType(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "pictureSize")
  public void setPictureSize(d paramd, String paramString) {
    j j;
    if (paramString.equals("None")) {
      paramString = null;
    } else {
      j = j.a(paramString);
    } 
    paramd.setPictureSize(j);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "playSoundOnCapture")
  public void setPlaySoundOnCapture(d paramd, boolean paramBoolean) {
    paramd.setPlaySoundOnCapture(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "ratio")
  public void setRatio(d paramd, String paramString) {
    paramd.setAspectRatio(e.f.a.b.a.a(paramString));
  }
  
  @com.facebook.react.uimanager.e1.a(name = "rectOfInterest")
  public void setRectOfInterest(d paramd, ReadableMap paramReadableMap) {
    if (paramReadableMap != null)
      paramd.a((float)paramReadableMap.getDouble("x"), (float)paramReadableMap.getDouble("y"), (float)paramReadableMap.getDouble("width"), (float)paramReadableMap.getDouble("height")); 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "textRecognizerEnabled")
  public void setTextRecognizing(d paramd, boolean paramBoolean) {
    paramd.setShouldRecognizeText(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "touchDetectorEnabled")
  public void setTouchDetectorEnabled(d paramd, boolean paramBoolean) {
    paramd.setShouldDetectTouches(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "trackingEnabled")
  public void setTracking(d paramd, boolean paramBoolean) {
    paramd.setTracking(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "type")
  public void setType(d paramd, int paramInt) {
    paramd.setFacing(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "useCamera2Api")
  public void setUseCamera2Api(d paramd, boolean paramBoolean) {
    paramd.setUsingCamera2Api(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "useNativeZoom")
  public void setUseNativeZoom(d paramd, boolean paramBoolean) {
    paramd.setUseNativeZoom(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "whiteBalance")
  public void setWhiteBalance(d paramd, int paramInt) {
    paramd.setWhiteBalance(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "zoom")
  public void setZoom(d paramd, float paramFloat) {
    paramd.setZoom(paramFloat);
  }
  
  public enum a {
    c("onCameraReady"),
    d("onMountError"),
    e("onBarCodeRead"),
    f("onFacesDetected"),
    g("onGoogleVisionBarcodesDetected"),
    h("onFaceDetectionError"),
    i("onGoogleVisionBarcodeDetectionError"),
    j("onTextRecognized"),
    k("onPictureTaken"),
    l("onPictureSaved"),
    m("onRecordingStart"),
    n("onRecordingEnd"),
    o("onTouch");
    
    private final String mName;
    
    a(String param1String1) {
      this.mName = param1String1;
    }
    
    public String toString() {
      return this.mName;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/CameraViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */