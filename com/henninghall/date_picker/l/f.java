package com.henninghall.date_picker.l;

import android.os.Build;
import com.facebook.react.bridge.Dynamic;
import com.henninghall.date_picker.e;
import java.util.Locale;

public class f extends k<Locale> {
  private String b = c();
  
  public f() {
    super(d());
  }
  
  private static String c() {
    return (Build.VERSION.SDK_INT >= 21) ? Locale.getDefault().toLanguageTag().replace('-', '_') : "en";
  }
  
  private static Locale d() {
    return e.c(c());
  }
  
  public String b() {
    return this.b;
  }
  
  public Locale b(Dynamic paramDynamic) {
    this.b = paramDynamic.asString().replace('-', '_');
    return e.c(this.b);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/l/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */