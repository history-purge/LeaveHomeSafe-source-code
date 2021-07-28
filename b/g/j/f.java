package b.g.j;

import android.os.LocaleList;
import java.util.Locale;

final class f implements e {
  private final LocaleList a;
  
  f(LocaleList paramLocaleList) {
    this.a = paramLocaleList;
  }
  
  public Object a() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    return this.a.equals(((e)paramObject).a());
  }
  
  public Locale get(int paramInt) {
    return this.a.get(paramInt);
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public int size() {
    return this.a.size();
  }
  
  public String toString() {
    return this.a.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/j/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */