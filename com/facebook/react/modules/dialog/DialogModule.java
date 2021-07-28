package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.f;
import e.e.o.d0.a.a;
import java.util.Map;

@a(name = "DialogManagerAndroid")
public class DialogModule extends NativeDialogManagerAndroidSpec implements LifecycleEventListener {
  static final String ACTION_BUTTON_CLICKED = "buttonClicked";
  
  static final String ACTION_DISMISSED = "dismissed";
  
  static final Map<String, Object> CONSTANTS = f.a("buttonClicked", "buttonClicked", "dismissed", "dismissed", "buttonPositive", Integer.valueOf(-1), "buttonNegative", Integer.valueOf(-2), "buttonNeutral", Integer.valueOf(-3));
  
  static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
  
  static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
  
  static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
  
  static final String KEY_BUTTON_POSITIVE = "buttonPositive";
  
  static final String KEY_CANCELABLE = "cancelable";
  
  static final String KEY_ITEMS = "items";
  
  static final String KEY_MESSAGE = "message";
  
  static final String KEY_TITLE = "title";
  
  public static final String NAME = "DialogManagerAndroid";
  
  private boolean mIsInForeground;
  
  public DialogModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  private c getFragmentManagerHelper() {
    Activity activity = getCurrentActivity();
    return (activity == null || !(activity instanceof e)) ? null : new c(this, ((e)activity).k());
  }
  
  public String getName() {
    return "DialogManagerAndroid";
  }
  
  public Map<String, Object> getTypedExportedConstants() {
    return CONSTANTS;
  }
  
  public void initialize() {
    getReactApplicationContext().addLifecycleEventListener(this);
  }
  
  public void onHostDestroy() {}
  
  public void onHostPause() {
    this.mIsInForeground = false;
  }
  
  public void onHostResume() {
    this.mIsInForeground = true;
    c c = getFragmentManagerHelper();
    if (c != null) {
      c.a();
      return;
    } 
    e.e.e.e.a.c(DialogModule.class, "onHostResume called but no FragmentManager found");
  }
  
  public void showAlert(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2) {
    c c = getFragmentManagerHelper();
    int i = 0;
    if (c == null) {
      paramCallback1.invoke(new Object[] { "Tried to show an alert while not attached to an Activity" });
      return;
    } 
    Bundle bundle = new Bundle();
    if (paramReadableMap.hasKey("title"))
      bundle.putString("title", paramReadableMap.getString("title")); 
    if (paramReadableMap.hasKey("message"))
      bundle.putString("message", paramReadableMap.getString("message")); 
    if (paramReadableMap.hasKey("buttonPositive"))
      bundle.putString("button_positive", paramReadableMap.getString("buttonPositive")); 
    if (paramReadableMap.hasKey("buttonNegative"))
      bundle.putString("button_negative", paramReadableMap.getString("buttonNegative")); 
    if (paramReadableMap.hasKey("buttonNeutral"))
      bundle.putString("button_neutral", paramReadableMap.getString("buttonNeutral")); 
    if (paramReadableMap.hasKey("items")) {
      ReadableArray readableArray = paramReadableMap.getArray("items");
      CharSequence[] arrayOfCharSequence = new CharSequence[readableArray.size()];
      while (i < readableArray.size()) {
        arrayOfCharSequence[i] = readableArray.getString(i);
        i++;
      } 
      bundle.putCharSequenceArray("items", arrayOfCharSequence);
    } 
    if (paramReadableMap.hasKey("cancelable"))
      bundle.putBoolean("cancelable", paramReadableMap.getBoolean("cancelable")); 
    UiThreadUtil.runOnUiThread(new a(this, c, bundle, paramCallback2));
  }
  
  class a implements Runnable {
    a(DialogModule this$0, DialogModule.c param1c, Bundle param1Bundle, Callback param1Callback) {}
    
    public void run() {
      this.c.a(this.d, this.e);
    }
  }
  
  class b implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
    private final Callback c;
    
    private boolean d = false;
    
    public b(DialogModule this$0, Callback param1Callback) {
      this.c = param1Callback;
    }
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      if (!this.d && this.e.getReactApplicationContext().hasActiveCatalystInstance()) {
        this.c.invoke(new Object[] { "buttonClicked", Integer.valueOf(param1Int) });
        this.d = true;
      } 
    }
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      if (!this.d && this.e.getReactApplicationContext().hasActiveCatalystInstance()) {
        this.c.invoke(new Object[] { "dismissed" });
        this.d = true;
      } 
    }
  }
  
  private class c {
    private final n a;
    
    private Object b;
    
    public c(DialogModule this$0, n param1n) {
      this.a = param1n;
    }
    
    private void b() {
      if (!this.c.mIsInForeground)
        return; 
      a a = (a)this.a.c("com.facebook.catalyst.react.dialog.DialogModule");
      if (a != null && a.W())
        a.w0(); 
    }
    
    public void a() {
      UiThreadUtil.assertOnUiThread();
      SoftAssertions.assertCondition(this.c.mIsInForeground, "showPendingAlert() called in background");
      if (this.b == null)
        return; 
      b();
      ((a)this.b).a(this.a, "com.facebook.catalyst.react.dialog.DialogModule");
      this.b = null;
    }
    
    public void a(Bundle param1Bundle, Callback param1Callback) {
      UiThreadUtil.assertOnUiThread();
      b();
      if (param1Callback != null) {
        DialogModule.b b = new DialogModule.b(this.c, param1Callback);
      } else {
        param1Callback = null;
      } 
      a a = new a((DialogModule.b)param1Callback, param1Bundle);
      if (this.c.mIsInForeground && !this.a.D()) {
        if (param1Bundle.containsKey("cancelable"))
          a.j(param1Bundle.getBoolean("cancelable")); 
        a.a(this.a, "com.facebook.catalyst.react.dialog.DialogModule");
        return;
      } 
      this.b = a;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/dialog/DialogModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */