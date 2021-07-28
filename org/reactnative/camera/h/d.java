package org.reactnative.camera.h;

import android.content.Context;
import java.io.File;

public class d {
  private File a = null;
  
  public d(Context paramContext) {
    a(paramContext);
  }
  
  public File a() {
    return this.a;
  }
  
  public void a(Context paramContext) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramContext.getCacheDir());
    stringBuilder.append("/Camera/");
    this.a = new File(stringBuilder.toString());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */