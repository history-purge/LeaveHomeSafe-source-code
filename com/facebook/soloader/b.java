package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;

public class b extends l {
  private Context a;
  
  private int b;
  
  private c c;
  
  public b(Context paramContext, int paramInt) {
    this.a = paramContext.getApplicationContext();
    if (this.a == null) {
      Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.");
      this.a = paramContext;
    } 
    this.b = paramInt;
    this.c = new c(new File((this.a.getApplicationInfo()).nativeLibraryDir), paramInt);
  }
  
  public int a(String paramString, int paramInt, StrictMode.ThreadPolicy paramThreadPolicy) {
    return this.c.a(paramString, paramInt, paramThreadPolicy);
  }
  
  public File a(String paramString) {
    return this.c.a(paramString);
  }
  
  protected void a(int paramInt) {
    this.c.a(paramInt);
  }
  
  public boolean a() {
    try {
      File file1 = this.c.a;
      Context context = this.a;
      String str = this.a.getPackageName();
      boolean bool = false;
      context = context.createPackageContext(str, 0);
      File file2 = new File((context.getApplicationInfo()).nativeLibraryDir);
      if (!file1.equals(file2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Native library directory updated from ");
        stringBuilder.append(file1);
        stringBuilder.append(" to ");
        stringBuilder.append(file2);
        Log.d("SoLoader", stringBuilder.toString());
        int i = this.b;
        bool = true;
        this.b = i | 0x1;
        this.c = new c(file2, this.b);
        this.c.a(this.b);
        this.a = context;
      } 
      return bool;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      throw new RuntimeException(nameNotFoundException);
    } 
  }
  
  public String toString() {
    return this.c.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/soloader/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */