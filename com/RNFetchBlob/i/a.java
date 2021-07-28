package com.RNFetchBlob.i;

import com.RNFetchBlob.f;
import com.RNFetchBlob.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import j.c;
import j.e;
import j.l;
import j.t;
import j.u;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

public class a extends ResponseBody {
  String c;
  
  ReactApplicationContext d;
  
  ResponseBody e;
  
  boolean f = false;
  
  public a(ReactApplicationContext paramReactApplicationContext, String paramString, ResponseBody paramResponseBody, boolean paramBoolean) {
    this.d = paramReactApplicationContext;
    this.c = paramString;
    this.e = paramResponseBody;
    this.f = paramBoolean;
  }
  
  public long contentLength() {
    return this.e.contentLength();
  }
  
  public MediaType contentType() {
    return this.e.contentType();
  }
  
  public e source() {
    return l.a(new a(this, this.e.source()));
  }
  
  private class a implements t {
    e c;
    
    long d = 0L;
    
    a(a this$0, e param1e) {
      this.c = param1e;
    }
    
    public void close() {}
    
    public long read(c param1c, long param1Long) {
      long l1 = this.c.read(param1c, param1Long);
      long l2 = this.d;
      if (l1 > 0L) {
        param1Long = l1;
      } else {
        param1Long = 0L;
      } 
      this.d = l2 + param1Long;
      f f = g.b(this.e.c);
      param1Long = this.e.contentLength();
      if (f != null && param1Long != 0L && f.a((float)(this.d / this.e.contentLength()))) {
        String str;
        WritableMap writableMap = Arguments.createMap();
        writableMap.putString("taskId", this.e.c);
        writableMap.putString("written", String.valueOf(this.d));
        writableMap.putString("total", String.valueOf(this.e.contentLength()));
        if (this.e.f) {
          str = param1c.a(Charset.defaultCharset());
        } else {
          str = "";
        } 
        writableMap.putString("chunk", str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter)this.e.d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobProgress", writableMap);
      } 
      return l1;
    }
    
    public u timeout() {
      return null;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/RNFetchBlob/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */