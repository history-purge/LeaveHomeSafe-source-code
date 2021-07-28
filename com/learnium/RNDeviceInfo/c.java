package com.learnium.RNDeviceInfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import e.b.a.a.d;
import java.io.PrintStream;

public class c {
  private SharedPreferences a;
  
  private e.b.a.a.a b;
  
  private e.b.a.a.c c = new a(this);
  
  c(Context paramContext) {
    this.a = paramContext.getSharedPreferences("react-native-device-info", 0);
    this.b = e.b.a.a.a.a(paramContext).a();
    try {
      this.b.a(this.c);
      return;
    } catch (Exception exception) {
      PrintStream printStream = System.err;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: ");
      stringBuilder.append(exception.getMessage());
      printStream.println(stringBuilder.toString());
      exception.printStackTrace(System.err);
      return;
    } 
  }
  
  private String a() {
    try {
      return this.b.b().b();
    } catch (Exception exception) {
      PrintStream printStream = System.err;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: ");
      stringBuilder.append(exception.getMessage());
      printStream.println(stringBuilder.toString());
      exception.printStackTrace(System.err);
      return null;
    } 
  }
  
  class a implements e.b.a.a.c {
    a(c this$0) {}
    
    public void a() {
      Log.d("RNInstallReferrerClient", "InstallReferrerService disconnected");
    }
    
    public void a(int param1Int) {
      if (param1Int != 0) {
        String str;
        if (param1Int != 1) {
          if (param1Int != 2)
            return; 
          str = "FEATURE_NOT_SUPPORTED";
        } else {
          str = "SERVICE_UNAVAILABLE";
        } 
        Log.d("InstallReferrerState", str);
        return;
      } 
      try {
        Log.d("InstallReferrerState", "OK");
        d d = c.a(this.a).b();
        d.b();
        d.c();
        d.a();
        SharedPreferences.Editor editor = c.b(this.a).edit();
        editor.putString("installReferrer", c.c(this.a));
        editor.apply();
        c.a(this.a).a();
        return;
      } catch (Exception exception) {
        PrintStream printStream = System.err;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: ");
        stringBuilder.append(exception.getMessage());
        printStream.println(stringBuilder.toString());
        exception.printStackTrace(System.err);
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/learnium/RNDeviceInfo/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */