package e.f.a.e.e.k;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.i;
import java.util.Locale;

public class a {
  private final String a;
  
  private final String b;
  
  private final int c;
  
  private a(String paramString1, String paramString2) {
    this.b = paramString2;
    this.a = paramString1;
    new i(paramString1);
    int i;
    for (i = 2; 7 >= i && !Log.isLoggable(this.a, i); i++);
    this.c = i;
  }
  
  public a(@RecentlyNonNull String paramString, @RecentlyNonNull String... paramVarArgs) {
    this(paramString, str);
  }
  
  public void a(@RecentlyNonNull String paramString, Object... paramVarArgs) {
    if (a(3))
      Log.d(this.a, c(paramString, paramVarArgs)); 
  }
  
  @RecentlyNonNull
  public boolean a(@RecentlyNonNull int paramInt) {
    return (this.c <= paramInt);
  }
  
  public void b(@RecentlyNonNull String paramString, Object... paramVarArgs) {
    Log.e(this.a, c(paramString, paramVarArgs));
  }
  
  @RecentlyNonNull
  protected String c(@RecentlyNonNull String paramString, Object... paramVarArgs) {
    String str = paramString;
    if (paramVarArgs != null) {
      str = paramString;
      if (paramVarArgs.length > 0)
        str = String.format(Locale.US, paramString, paramVarArgs); 
    } 
    return this.b.concat(str);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */