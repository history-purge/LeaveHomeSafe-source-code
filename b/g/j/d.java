package b.g.j;

import java.util.HashSet;
import java.util.Locale;

final class d implements e {
  private static final Locale[] b = new Locale[0];
  
  private final Locale[] a;
  
  static {
    new Locale("en", "XA");
    new Locale("ar", "XB");
    c.a("en-Latn");
  }
  
  d(Locale... paramVarArgs) {
    if (paramVarArgs.length == 0) {
      this.a = b;
      return;
    } 
    Locale[] arrayOfLocale = new Locale[paramVarArgs.length];
    HashSet<Locale> hashSet = new HashSet();
    StringBuilder stringBuilder = new StringBuilder();
    int i = 0;
    while (i < paramVarArgs.length) {
      Locale locale = paramVarArgs[i];
      if (locale != null) {
        if (!hashSet.contains(locale)) {
          locale = (Locale)locale.clone();
          arrayOfLocale[i] = locale;
          a(stringBuilder, locale);
          if (i < paramVarArgs.length - 1)
            stringBuilder.append(','); 
          hashSet.add(locale);
          i++;
          continue;
        } 
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("list[");
        stringBuilder2.append(i);
        stringBuilder2.append("] is a repetition");
        throw new IllegalArgumentException(stringBuilder2.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("list[");
      stringBuilder1.append(i);
      stringBuilder1.append("] is null");
      throw new NullPointerException(stringBuilder1.toString());
    } 
    this.a = arrayOfLocale;
    stringBuilder.toString();
  }
  
  static void a(StringBuilder paramStringBuilder, Locale paramLocale) {
    paramStringBuilder.append(paramLocale.getLanguage());
    String str = paramLocale.getCountry();
    if (str != null && !str.isEmpty()) {
      paramStringBuilder.append('-');
      paramStringBuilder.append(paramLocale.getCountry());
    } 
  }
  
  public Object a() {
    return null;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof d))
      return false; 
    paramObject = ((d)paramObject).a;
    if (this.a.length != paramObject.length)
      return false; 
    int i = 0;
    while (true) {
      Locale[] arrayOfLocale = this.a;
      if (i < arrayOfLocale.length) {
        if (!arrayOfLocale[i].equals(paramObject[i]))
          return false; 
        i++;
        continue;
      } 
      return true;
    } 
  }
  
  public Locale get(int paramInt) {
    if (paramInt >= 0) {
      Locale[] arrayOfLocale = this.a;
      if (paramInt < arrayOfLocale.length)
        return arrayOfLocale[paramInt]; 
    } 
    return null;
  }
  
  public int hashCode() {
    int j = 1;
    int i = 0;
    while (true) {
      Locale[] arrayOfLocale = this.a;
      if (i < arrayOfLocale.length) {
        j = j * 31 + arrayOfLocale[i].hashCode();
        i++;
        continue;
      } 
      return j;
    } 
  }
  
  public int size() {
    return this.a.length;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    int i = 0;
    while (true) {
      Locale[] arrayOfLocale = this.a;
      if (i < arrayOfLocale.length) {
        stringBuilder.append(arrayOfLocale[i]);
        if (i < this.a.length - 1)
          stringBuilder.append(','); 
        i++;
        continue;
      } 
      stringBuilder.append("]");
      return stringBuilder.toString();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/j/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */