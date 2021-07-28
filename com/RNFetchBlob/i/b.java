package com.RNFetchBlob.i;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import j.c;
import j.e;
import j.l;
import j.t;
import j.u;
import java.io.File;
import java.io.FileOutputStream;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

public class b extends ResponseBody {
  String c;
  
  ResponseBody d;
  
  long e = 0L;
  
  ReactApplicationContext f;
  
  FileOutputStream g;
  
  boolean h;
  
  public b(ReactApplicationContext paramReactApplicationContext, String paramString1, ResponseBody paramResponseBody, String paramString2, boolean paramBoolean) {
    this.f = paramReactApplicationContext;
    this.c = paramString1;
    this.d = paramResponseBody;
    this.h = false;
    if (paramString2 != null) {
      paramString1 = paramString2.replace("?append=true", "");
      File file2 = new File(paramString1);
      File file1 = file2.getParentFile();
      if (file1 == null || file1.exists() || file1.mkdirs()) {
        if (!file2.exists())
          file2.createNewFile(); 
        this.g = new FileOutputStream(new File(paramString1), paramBoolean ^ true);
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Couldn't create dir: ");
      stringBuilder.append(file1);
      throw new IllegalStateException(stringBuilder.toString());
    } 
  }
  
  public boolean a() {
    return (this.e == contentLength() || (contentLength() == -1L && this.h));
  }
  
  public long contentLength() {
    return this.d.contentLength();
  }
  
  public MediaType contentType() {
    return this.d.contentType();
  }
  
  public e source() {
    return l.a(new b(null));
  }
  
  private class b implements t {
    private b(b this$0) {}
    
    private void a(String param1String, long param1Long1, long param1Long2) {
      WritableMap writableMap = Arguments.createMap();
      writableMap.putString("taskId", param1String);
      writableMap.putString("written", String.valueOf(param1Long1));
      writableMap.putString("total", String.valueOf(param1Long2));
      ((DeviceEventManagerModule.RCTDeviceEventEmitter)this.c.f.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobProgress", writableMap);
    }
    
    public void close() {
      this.c.g.close();
    }
    
    public long read(c param1c, long param1Long) {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public u timeout() {
      return null;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/RNFetchBlob/i/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */