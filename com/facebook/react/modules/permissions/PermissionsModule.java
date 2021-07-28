package com.facebook.react.modules.permissions;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import e.e.o.d0.a.a;
import java.util.ArrayList;

@a(name = "PermissionsAndroid")
public class PermissionsModule extends NativePermissionsAndroidSpec implements f {
  private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
  
  public static final String NAME = "PermissionsAndroid";
  
  private final String DENIED = "denied";
  
  private final String GRANTED = "granted";
  
  private final String NEVER_ASK_AGAIN = "never_ask_again";
  
  private final SparseArray<Callback> mCallbacks = new SparseArray();
  
  private int mRequestCode = 0;
  
  public PermissionsModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  private e getPermissionAwareActivity() {
    Activity activity = getCurrentActivity();
    if (activity != null) {
      if (activity instanceof e)
        return (e)activity; 
      throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    } 
    throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
  }
  
  public void checkPermission(String paramString, Promise paramPromise) {
    Context context = getReactApplicationContext().getBaseContext();
    int i = Build.VERSION.SDK_INT;
    boolean bool = true;
    if ((i < 23) ? (context.checkPermission(paramString, Process.myPid(), Process.myUid()) == 0) : (context.checkSelfPermission(paramString) == 0))
      bool = false; 
    paramPromise.resolve(Boolean.valueOf(bool));
  }
  
  public String getName() {
    return "PermissionsAndroid";
  }
  
  public boolean onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {
    Callback callback = (Callback)this.mCallbacks.get(paramInt);
    boolean bool = false;
    callback.invoke(new Object[] { paramArrayOfint, getPermissionAwareActivity() });
    this.mCallbacks.remove(paramInt);
    if (this.mCallbacks.size() == 0)
      bool = true; 
    return bool;
  }
  
  public void requestMultiplePermissions(ReadableArray paramReadableArray, Promise paramPromise) {
    WritableNativeMap writableNativeMap = new WritableNativeMap();
    ArrayList<String> arrayList = new ArrayList();
    Context context = getReactApplicationContext().getBaseContext();
    int i = 0;
    int j = 0;
    while (i < paramReadableArray.size()) {
      String str2 = paramReadableArray.getString(i);
      int k = Build.VERSION.SDK_INT;
      String str1 = "granted";
      if (k < 23) {
        if (context.checkPermission(str2, Process.myPid(), Process.myUid()) != 0)
          str1 = "denied"; 
      } else if (context.checkSelfPermission(str2) != 0) {
        arrayList.add(str2);
        continue;
      } 
      writableNativeMap.putString(str2, str1);
      j++;
      continue;
      i++;
    } 
    if (paramReadableArray.size() == j) {
      paramPromise.resolve(writableNativeMap);
      return;
    } 
    try {
      e e = getPermissionAwareActivity();
      this.mCallbacks.put(this.mRequestCode, new b(this, arrayList, (WritableMap)writableNativeMap, paramPromise));
      e.a(arrayList.<String>toArray(new String[0]), this.mRequestCode, this);
      this.mRequestCode++;
      return;
    } catch (IllegalStateException illegalStateException) {
      paramPromise.reject("E_INVALID_ACTIVITY", illegalStateException);
      return;
    } 
  }
  
  public void requestPermission(String paramString, Promise paramPromise) {
    Context context = getReactApplicationContext().getBaseContext();
    int i = Build.VERSION.SDK_INT;
    String str = "granted";
    if (i < 23) {
      if (context.checkPermission(paramString, Process.myPid(), Process.myUid()) == 0) {
        paramString = str;
      } else {
        paramString = "denied";
      } 
      paramPromise.resolve(paramString);
      return;
    } 
    if (context.checkSelfPermission(paramString) == 0) {
      paramPromise.resolve("granted");
      return;
    } 
    try {
      e e = getPermissionAwareActivity();
      this.mCallbacks.put(this.mRequestCode, new a(this, paramPromise, paramString));
      i = this.mRequestCode;
      e.a(new String[] { paramString }, i, this);
      this.mRequestCode++;
      return;
    } catch (IllegalStateException illegalStateException) {
      paramPromise.reject("E_INVALID_ACTIVITY", illegalStateException);
      return;
    } 
  }
  
  public void shouldShowRequestPermissionRationale(String paramString, Promise paramPromise) {
    if (Build.VERSION.SDK_INT < 23) {
      paramPromise.resolve(Boolean.valueOf(false));
      return;
    } 
    try {
      paramPromise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(paramString)));
      return;
    } catch (IllegalStateException illegalStateException) {
      paramPromise.reject("E_INVALID_ACTIVITY", illegalStateException);
      return;
    } 
  }
  
  class a implements Callback {
    a(PermissionsModule this$0, Promise param1Promise, String param1String) {}
    
    public void invoke(Object... param1VarArgs) {
      String str;
      Promise promise;
      int[] arrayOfInt = (int[])param1VarArgs[0];
      if (arrayOfInt.length > 0 && arrayOfInt[0] == 0) {
        promise = this.a;
        str = "granted";
      } else if (((e)str[1]).shouldShowRequestPermissionRationale(this.b)) {
        promise = this.a;
        str = "denied";
      } else {
        promise = this.a;
        str = "never_ask_again";
      } 
      promise.resolve(str);
    }
  }
  
  class b implements Callback {
    b(PermissionsModule this$0, ArrayList param1ArrayList, WritableMap param1WritableMap, Promise param1Promise) {}
    
    public void invoke(Object... param1VarArgs) {
      int i = 0;
      int[] arrayOfInt = (int[])param1VarArgs[0];
      e e = (e)param1VarArgs[1];
      while (i < this.a.size()) {
        WritableMap writableMap;
        String str1;
        String str2 = this.a.get(i);
        if (arrayOfInt.length > 0 && arrayOfInt[i] == 0) {
          writableMap = this.b;
          str1 = "granted";
        } else if (e.shouldShowRequestPermissionRationale(str2)) {
          writableMap = this.b;
          str1 = "denied";
        } else {
          writableMap = this.b;
          str1 = "never_ask_again";
        } 
        writableMap.putString(str2, str1);
        i++;
      } 
      this.c.resolve(this.b);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/permissions/PermissionsModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */