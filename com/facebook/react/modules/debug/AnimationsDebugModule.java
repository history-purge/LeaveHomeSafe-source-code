package com.facebook.react.modules.debug;

import android.content.Context;
import android.widget.Toast;
import com.facebook.fbreact.specs.NativeAnimationsDebugModuleSpec;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.debug.c.a;
import e.e.e.e.a;
import e.e.o.d0.a.a;
import java.util.Locale;

@a(name = "AnimationsDebugModule")
public class AnimationsDebugModule extends NativeAnimationsDebugModuleSpec {
  protected static final String NAME = "AnimationsDebugModule";
  
  private final a mCatalystSettings;
  
  private b mFrameCallback;
  
  public AnimationsDebugModule(ReactApplicationContext paramReactApplicationContext, a parama) {
    super(paramReactApplicationContext);
    this.mCatalystSettings = parama;
  }
  
  public String getName() {
    return "AnimationsDebugModule";
  }
  
  public void onCatalystInstanceDestroy() {
    b b1 = this.mFrameCallback;
    if (b1 != null) {
      b1.j();
      this.mFrameCallback = null;
    } 
  }
  
  public void startRecordingFps() {
    a a1 = this.mCatalystSettings;
    if (a1 != null) {
      if (!a1.a())
        return; 
      if (this.mFrameCallback == null) {
        this.mFrameCallback = new b((ReactContext)getReactApplicationContext());
        this.mFrameCallback.i();
        return;
      } 
      throw new JSApplicationCausedNativeException("Already recording FPS!");
    } 
  }
  
  public void stopRecordingFps(double paramDouble) {
    b b2 = this.mFrameCallback;
    if (b2 == null)
      return; 
    b2.j();
    b.b b1 = this.mFrameCallback.b((long)paramDouble);
    if (b1 == null) {
      Toast.makeText((Context)getReactApplicationContext(), "Unable to get FPS info", 1);
    } else {
      String str2 = String.format(Locale.US, "FPS: %.2f, %d frames (%d expected)", new Object[] { Double.valueOf(b1.d), Integer.valueOf(b1.a), Integer.valueOf(b1.c) });
      String str3 = String.format(Locale.US, "JS FPS: %.2f, %d frames (%d expected)", new Object[] { Double.valueOf(b1.e), Integer.valueOf(b1.b), Integer.valueOf(b1.c) });
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str2);
      stringBuilder.append("\n");
      stringBuilder.append(str3);
      stringBuilder.append("\nTotal Time MS: ");
      stringBuilder.append(String.format(Locale.US, "%d", new Object[] { Integer.valueOf(b1.f) }));
      String str1 = stringBuilder.toString();
      a.a("ReactNative", str1);
      Toast.makeText((Context)getReactApplicationContext(), str1, 1).show();
    } 
    this.mFrameCallback = null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/debug/AnimationsDebugModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */