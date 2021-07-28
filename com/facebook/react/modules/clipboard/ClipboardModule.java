package com.facebook.react.modules.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import e.e.o.d0.a.a;

@a(name = "Clipboard")
public class ClipboardModule extends ContextBaseJavaModule {
  public static final String NAME = "Clipboard";
  
  public ClipboardModule(Context paramContext) {
    super(paramContext);
  }
  
  private ClipboardManager getClipboardService() {
    Context context = getContext();
    getContext();
    return (ClipboardManager)context.getSystemService("clipboard");
  }
  
  public String getName() {
    return "Clipboard";
  }
  
  @ReactMethod
  public void getString(Promise paramPromise) {
    try {
      ClipboardManager clipboardManager = getClipboardService();
      ClipData clipData = clipboardManager.getPrimaryClip();
      if (clipData != null && clipData.getItemCount() >= 1) {
        ClipData.Item item = clipboardManager.getPrimaryClip().getItemAt(0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(item.getText());
        paramPromise.resolve(stringBuilder.toString());
        return;
      } 
      paramPromise.resolve("");
      return;
    } catch (Exception exception) {
      paramPromise.reject(exception);
      return;
    } 
  }
  
  @ReactMethod
  public void setString(String paramString) {
    ClipData clipData = ClipData.newPlainText(null, paramString);
    getClipboardService().setPrimaryClip(clipData);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/clipboard/ClipboardModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */