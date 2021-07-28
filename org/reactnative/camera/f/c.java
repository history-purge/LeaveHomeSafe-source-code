package org.reactnative.camera.f;

import android.util.Base64;
import androidx.core.util.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;

public class c extends c<c> {
  private static final e<c> h = new e(3);
  
  private WritableArray f;
  
  private byte[] g;
  
  private void a(int paramInt, WritableArray paramWritableArray, byte[] paramArrayOfbyte) {
    a(paramInt);
    this.f = paramWritableArray;
    this.g = paramArrayOfbyte;
  }
  
  public static c b(int paramInt, WritableArray paramWritableArray, byte[] paramArrayOfbyte) {
    c c2 = (c)h.a();
    c c1 = c2;
    if (c2 == null)
      c1 = new c(); 
    c1.a(paramInt, paramWritableArray, paramArrayOfbyte);
    return c1;
  }
  
  private WritableMap j() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("type", "barcode");
    writableMap.putArray("barcodes", (ReadableArray)this.f);
    writableMap.putInt("target", g());
    byte[] arrayOfByte = this.g;
    if (arrayOfByte != null)
      writableMap.putString("image", Base64.encodeToString(arrayOfByte, 2)); 
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public short c() {
    return (this.f.size() > 32767) ? Short.MAX_VALUE : (short)this.f.size();
  }
  
  public String d() {
    return CameraViewManager.a.g.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */