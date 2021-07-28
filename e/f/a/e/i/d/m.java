package e.f.a.e.i.d;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;

final class m extends f<T> {
  private final Object k = new Object();
  
  private String l;
  
  private T m;
  
  m(p paramp, String paramString, Object paramObject, o paramo) {
    super(paramp, paramString, paramObject, null);
  }
  
  protected final T a(SharedPreferences paramSharedPreferences) {
    try {
      return a(paramSharedPreferences.getString(this.b, ""));
    } catch (ClassCastException classCastException) {
      String str = String.valueOf(this.b);
      if (str.length() != 0) {
        str = "Invalid byte[] value in SharedPreferences for ".concat(str);
      } else {
        str = new String("Invalid byte[] value in SharedPreferences for ");
      } 
      Log.e("PhenotypeFlag", str, classCastException);
      return null;
    } 
  }
  
  protected final T a(String paramString) {
    try {
      synchronized (this.k) {
        if (!paramString.equals(this.l)) {
          T t = (T)this.n.a(Base64.decode(paramString, 3));
          this.l = paramString;
          this.m = t;
        } 
        return this.m;
      } 
    } catch (IOException|IllegalArgumentException iOException) {
      String str = this.b;
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(paramString).length());
      stringBuilder.append("Invalid byte[] value for ");
      stringBuilder.append(str);
      stringBuilder.append(": ");
      stringBuilder.append(paramString);
      Log.e("PhenotypeFlag", stringBuilder.toString());
      return null;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */