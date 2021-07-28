package io.invertase.firebase.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.app.a;

public class i {
  private static i a = new i();
  
  private Bundle b() {
    Bundle bundle = null;
    try {
      Context context = a.a();
      PackageManager packageManager = context.getPackageManager();
      if (packageManager == null)
        return null; 
      ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
      if (applicationInfo != null)
        bundle = applicationInfo.metaData; 
      return bundle;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      return null;
    } 
  }
  
  public static i c() {
    return a;
  }
  
  public WritableMap a() {
    Bundle bundle = b();
    WritableMap writableMap = Arguments.createMap();
    if (bundle == null)
      return writableMap; 
    for (String str : bundle.keySet()) {
      if (str.startsWith("rnfirebase_")) {
        Object object = bundle.get(str);
        if (object == null) {
          writableMap.putNull(str);
          continue;
        } 
        if (object instanceof String) {
          writableMap.putString(str, (String)object);
          continue;
        } 
        if (object instanceof Boolean)
          writableMap.putBoolean(str, ((Boolean)object).booleanValue()); 
      } 
    } 
    return writableMap;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/common/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */