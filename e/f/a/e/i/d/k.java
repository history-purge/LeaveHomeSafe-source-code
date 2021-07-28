package e.f.a.e.i.d;

import android.content.SharedPreferences;
import android.util.Log;

final class k extends f<Boolean> {
  k(p paramp, String paramString, Boolean paramBoolean) {
    super(paramp, paramString, paramBoolean, null);
  }
  
  private final Boolean b(SharedPreferences paramSharedPreferences) {
    try {
      boolean bool = paramSharedPreferences.getBoolean(this.b, false);
      return Boolean.valueOf(bool);
    } catch (ClassCastException classCastException) {
      String str = String.valueOf(this.b);
      if (str.length() != 0) {
        str = "Invalid boolean value in SharedPreferences for ".concat(str);
      } else {
        str = new String("Invalid boolean value in SharedPreferences for ");
      } 
      Log.e("PhenotypeFlag", str, classCastException);
      return null;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */