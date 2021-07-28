package org.reactnative.camera.f;

import android.util.Base64;
import androidx.core.util.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import e.f.c.n;
import e.f.c.p;
import java.util.Formatter;
import org.reactnative.camera.CameraViewManager;

public class a extends c<a> {
  private static final e<a> j = new e(3);
  
  private n f;
  
  private int g;
  
  private int h;
  
  private byte[] i;
  
  private void a(int paramInt1, n paramn, int paramInt2, int paramInt3, byte[] paramArrayOfbyte) {
    a(paramInt1);
    this.f = paramn;
    this.g = paramInt2;
    this.h = paramInt3;
    this.i = paramArrayOfbyte;
  }
  
  public static a b(int paramInt1, n paramn, int paramInt2, int paramInt3, byte[] paramArrayOfbyte) {
    a a2 = (a)j.a();
    a a1 = a2;
    if (a2 == null)
      a1 = new a(); 
    a1.a(paramInt1, paramn, paramInt2, paramInt3, paramArrayOfbyte);
    return a1;
  }
  
  private WritableMap j() {
    WritableMap writableMap1 = Arguments.createMap();
    WritableMap writableMap2 = Arguments.createMap();
    writableMap1.putInt("target", g());
    writableMap1.putString("data", this.f.e());
    byte[] arrayOfByte2 = this.f.b();
    byte b = 0;
    if (arrayOfByte2 != null && arrayOfByte2.length > 0) {
      Formatter formatter = new Formatter();
      int m = arrayOfByte2.length;
      for (int k = 0; k < m; k++) {
        formatter.format("%02x", new Object[] { Byte.valueOf(arrayOfByte2[k]) });
      } 
      writableMap1.putString("rawData", formatter.toString());
      formatter.close();
    } 
    writableMap1.putString("type", this.f.a().toString());
    WritableArray writableArray = Arguments.createArray();
    p[] arrayOfP = this.f.d();
    int j = arrayOfP.length;
    for (int i = b; i < j; i++) {
      p p = arrayOfP[i];
      if (p != null) {
        WritableMap writableMap = Arguments.createMap();
        writableMap.putString("x", String.valueOf(p.a()));
        writableMap.putString("y", String.valueOf(p.b()));
        writableArray.pushMap((ReadableMap)writableMap);
      } 
    } 
    writableMap2.putArray("origin", (ReadableArray)writableArray);
    writableMap2.putInt("height", this.h);
    writableMap2.putInt("width", this.g);
    writableMap1.putMap("bounds", (ReadableMap)writableMap2);
    byte[] arrayOfByte1 = this.i;
    if (arrayOfByte1 != null)
      writableMap1.putString("image", Base64.encodeToString(arrayOfByte1, 2)); 
    return writableMap1;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public short c() {
    return (short)(this.f.e().hashCode() % 32767);
  }
  
  public String d() {
    return CameraViewManager.a.e.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */