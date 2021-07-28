package e.f.a.e.i.d;

import android.content.SharedPreferences;
import android.util.Log;

final class l extends f<String> {
  l(p paramp, String paramString1, String paramString2) {
    super(paramp, paramString1, paramString2, null);
  }
  
  private final String b(SharedPreferences paramSharedPreferences) {
    try {
      return paramSharedPreferences.getString(this.b, null);
    } catch (ClassCastException classCastException) {
      String str = String.valueOf(this.b);
      if (str.length() != 0) {
        str = "Invalid string value in SharedPreferences for ".concat(str);
      } else {
        str = new String("Invalid string value in SharedPreferences for ");
      } 
      Log.e("PhenotypeFlag", str, classCastException);
      return null;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */