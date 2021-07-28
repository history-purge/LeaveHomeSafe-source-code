package b.g.j;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

public final class c {
  private e a;
  
  static {
    a(new Locale[0]);
  }
  
  private c(e parame) {
    this.a = parame;
  }
  
  public static c a(LocaleList paramLocaleList) {
    return new c(new f(paramLocaleList));
  }
  
  public static c a(Locale... paramVarArgs) {
    return (Build.VERSION.SDK_INT >= 24) ? a(new LocaleList(paramVarArgs)) : new c(new d(paramVarArgs));
  }
  
  static Locale a(String paramString) {
    if (paramString.contains("-")) {
      String[] arrayOfString = paramString.split("-", -1);
      if (arrayOfString.length > 2)
        return new Locale(arrayOfString[0], arrayOfString[1], arrayOfString[2]); 
      if (arrayOfString.length > 1)
        return new Locale(arrayOfString[0], arrayOfString[1]); 
      if (arrayOfString.length == 1)
        return new Locale(arrayOfString[0]); 
    } else {
      if (paramString.contains("_")) {
        String[] arrayOfString = paramString.split("_", -1);
        if (arrayOfString.length > 2)
          return new Locale(arrayOfString[0], arrayOfString[1], arrayOfString[2]); 
        if (arrayOfString.length > 1)
          return new Locale(arrayOfString[0], arrayOfString[1]); 
        if (arrayOfString.length == 1)
          return new Locale(arrayOfString[0]); 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Can not parse language tag: [");
        stringBuilder1.append(paramString);
        stringBuilder1.append("]");
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      return new Locale(paramString);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Can not parse language tag: [");
    stringBuilder.append(paramString);
    stringBuilder.append("]");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public int a() {
    return this.a.size();
  }
  
  public Locale a(int paramInt) {
    return this.a.get(paramInt);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof c && this.a.equals(((c)paramObject).a));
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public String toString() {
    return this.a.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/j/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */