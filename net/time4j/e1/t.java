package net.time4j.e1;

import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.time4j.d1.d;

public final class t {
  private final List<String> a;
  
  t(String[] paramArrayOfString) {
    this.a = Collections.unmodifiableList(Arrays.asList(paramArrayOfString));
  }
  
  private <V extends Enum<V>> V a(CharSequence paramCharSequence, ParsePosition paramParsePosition, Class<V> paramClass, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    Enum[] arrayOfEnum = (Enum[])paramClass.getEnumConstants();
    int j = this.a.size();
    int k = paramParsePosition.getIndex();
    int m = paramCharSequence.length();
    String str1 = "";
    String str2 = "";
    int i = 0;
    Enum enum_ = null;
    byte b = 0;
    while (i < arrayOfEnum.length) {
      byte b1;
      boolean bool = str2.isEmpty();
      if (bool)
        if (i >= j) {
          str2 = arrayOfEnum[i].name();
        } else {
          str2 = this.a.get(i);
        }  
      int i3 = str2.length();
      int n = k;
      int i2 = 0;
      int i1;
      for (i1 = 1; i1 && i2 < i3; i1 = b1) {
        b1 = k + i2;
        if (b1 >= m) {
          b1 = 0;
        } else {
          char c1 = paramCharSequence.charAt(b1);
          char c2 = str2.charAt(i2);
          if (paramBoolean1 ? (c1 == c2 || a(c1, c2)) : (c1 == c2)) {
            b1 = 1;
          } else {
            b1 = 0;
          } 
          i1 = n;
          if (b1 != 0)
            i1 = n + 1; 
          n = i1;
        } 
        i2++;
      } 
      if (paramBoolean3 && bool && i3 == 5 && str2.charAt(4) == '.') {
        b1 = k + 3;
        if (n == b1 && b1 < m && paramCharSequence.charAt(b1) == '.') {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(str2.subSequence(k, b1));
          stringBuilder.append(".");
          str2 = stringBuilder.toString();
          i--;
          continue;
        } 
      } 
      if (paramBoolean2 || i3 == 1) {
        n -= k;
        if (b < n) {
          enum_ = arrayOfEnum[i];
          b1 = n;
        } else {
          b1 = b;
          if (b == n) {
            str2 = str1;
            enum_ = null;
            continue;
          } 
        } 
      } else {
        b1 = b;
        if (i1 != 0) {
          paramParsePosition.setIndex(n);
          return (V)arrayOfEnum[i];
        } 
      } 
      str2 = str1;
      b = b1;
      continue;
      i++;
    } 
    if (enum_ == null) {
      paramParsePosition.setErrorIndex(k);
      return (V)enum_;
    } 
    paramParsePosition.setIndex(k + b);
    return (V)enum_;
  }
  
  private boolean a(char paramChar1, char paramChar2) {
    boolean bool1 = false;
    boolean bool2 = false;
    null = false;
    if (paramChar1 >= 'a' && paramChar1 <= 'z') {
      char c = paramChar2;
      if (paramChar2 >= 'A') {
        c = paramChar2;
        if (paramChar2 <= 'Z')
          c = (char)(paramChar2 + 97 - 65); 
      } 
      if (paramChar1 == c)
        null = true; 
      return null;
    } 
    if (paramChar1 >= 'A' && paramChar1 <= 'Z') {
      char c1 = (char)(paramChar1 + 97 - 65);
      char c = paramChar2;
      if (paramChar2 >= 'A') {
        c = paramChar2;
        if (paramChar2 <= 'Z')
          c = (char)(paramChar2 + 97 - 65); 
      } 
      null = bool1;
      if (c1 == c)
        null = true; 
      return null;
    } 
    if (Character.toUpperCase(paramChar1) != Character.toUpperCase(paramChar2)) {
      null = bool2;
      return (Character.toLowerCase(paramChar1) == Character.toLowerCase(paramChar2)) ? true : null;
    } 
    return true;
  }
  
  public <V extends Enum<V>> V a(CharSequence paramCharSequence, ParsePosition paramParsePosition, Class<V> paramClass, d paramd) {
    return a(paramCharSequence, paramParsePosition, paramClass, ((Boolean)paramd.a(a.i, Boolean.TRUE)).booleanValue(), ((Boolean)paramd.a(a.j, Boolean.FALSE)).booleanValue(), ((Boolean)paramd.a(a.k, Boolean.TRUE)).booleanValue());
  }
  
  public <V extends Enum<V>> V a(CharSequence paramCharSequence, ParsePosition paramParsePosition, Class<V> paramClass, g paramg) {
    boolean bool1;
    boolean bool2;
    boolean bool3;
    if (paramg == g.c) {
      bool1 = false;
      bool2 = false;
      bool3 = false;
    } else {
      g g1 = g.e;
      boolean bool = true;
      if (paramg == g1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      bool3 = true;
      bool2 = bool1;
      bool1 = bool;
    } 
    return a(paramCharSequence, paramParsePosition, paramClass, bool1, bool2, bool3);
  }
  
  public String a(Enum<?> paramEnum) {
    int i = paramEnum.ordinal();
    return (this.a.size() <= i) ? paramEnum.name() : this.a.get(i);
  }
  
  public List<String> a() {
    return this.a;
  }
  
  public String toString() {
    int j = this.a.size();
    StringBuilder stringBuilder = new StringBuilder(j * 16 + 2);
    stringBuilder.append('{');
    int i = 0;
    boolean bool = true;
    while (i < j) {
      if (bool) {
        bool = false;
      } else {
        stringBuilder.append(',');
      } 
      stringBuilder.append(this.a.get(i));
      i++;
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */