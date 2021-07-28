package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpDate;

public final class Headers {
  private final String[] namesAndValues;
  
  Headers(Builder paramBuilder) {
    List<String> list = paramBuilder.namesAndValues;
    this.namesAndValues = list.<String>toArray(new String[list.size()]);
  }
  
  private Headers(String[] paramArrayOfString) {
    this.namesAndValues = paramArrayOfString;
  }
  
  static void checkName(String paramString) {
    if (paramString != null) {
      if (!paramString.isEmpty()) {
        int j = paramString.length();
        int i = 0;
        while (i < j) {
          char c = paramString.charAt(i);
          if (c > ' ' && c < '') {
            i++;
            continue;
          } 
          throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", new Object[] { Integer.valueOf(c), Integer.valueOf(i), paramString }));
        } 
        return;
      } 
      throw new IllegalArgumentException("name is empty");
    } 
    NullPointerException nullPointerException = new NullPointerException("name == null");
    throw nullPointerException;
  }
  
  static void checkValue(String paramString1, String paramString2) {
    if (paramString1 != null) {
      int j = paramString1.length();
      int i = 0;
      while (i < j) {
        char c = paramString1.charAt(i);
        if ((c > '\037' || c == '\t') && c < '') {
          i++;
          continue;
        } 
        throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in %s value: %s", new Object[] { Integer.valueOf(c), Integer.valueOf(i), paramString2, paramString1 }));
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("value for name ");
    stringBuilder.append(paramString2);
    stringBuilder.append(" == null");
    NullPointerException nullPointerException = new NullPointerException(stringBuilder.toString());
    throw nullPointerException;
  }
  
  private static String get(String[] paramArrayOfString, String paramString) {
    for (int i = paramArrayOfString.length - 2; i >= 0; i -= 2) {
      if (paramString.equalsIgnoreCase(paramArrayOfString[i]))
        return paramArrayOfString[i + 1]; 
    } 
    return null;
  }
  
  public static Headers of(Map<String, String> paramMap) {
    if (paramMap != null) {
      String[] arrayOfString = new String[paramMap.size() * 2];
      int i = 0;
      for (Map.Entry<String, String> entry : paramMap.entrySet()) {
        if (entry.getKey() != null && entry.getValue() != null) {
          String str1 = ((String)entry.getKey()).trim();
          String str2 = ((String)entry.getValue()).trim();
          checkName(str1);
          checkValue(str2, str1);
          arrayOfString[i] = str1;
          arrayOfString[i + 1] = str2;
          i += 2;
          continue;
        } 
        throw new IllegalArgumentException("Headers cannot be null");
      } 
      return new Headers(arrayOfString);
    } 
    NullPointerException nullPointerException = new NullPointerException("headers == null");
    throw nullPointerException;
  }
  
  public static Headers of(String... paramVarArgs) {
    if (paramVarArgs != null) {
      if (paramVarArgs.length % 2 == 0) {
        int j;
        paramVarArgs = (String[])paramVarArgs.clone();
        byte b = 0;
        int i = 0;
        while (true) {
          j = b;
          if (i < paramVarArgs.length) {
            if (paramVarArgs[i] != null) {
              paramVarArgs[i] = paramVarArgs[i].trim();
              i++;
              continue;
            } 
            throw new IllegalArgumentException("Headers cannot be null");
          } 
          break;
        } 
        while (j < paramVarArgs.length) {
          String str1 = paramVarArgs[j];
          String str2 = paramVarArgs[j + 1];
          checkName(str1);
          checkValue(str2, str1);
          j += 2;
        } 
        return new Headers(paramVarArgs);
      } 
      throw new IllegalArgumentException("Expected alternating header names and values");
    } 
    NullPointerException nullPointerException = new NullPointerException("namesAndValues == null");
    throw nullPointerException;
  }
  
  public long byteCount() {
    String[] arrayOfString = this.namesAndValues;
    long l = (arrayOfString.length * 2);
    int j = arrayOfString.length;
    for (int i = 0; i < j; i++)
      l += this.namesAndValues[i].length(); 
    return l;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof Headers && Arrays.equals((Object[])((Headers)paramObject).namesAndValues, (Object[])this.namesAndValues));
  }
  
  public String get(String paramString) {
    return get(this.namesAndValues, paramString);
  }
  
  public Date getDate(String paramString) {
    paramString = get(paramString);
    return (paramString != null) ? HttpDate.parse(paramString) : null;
  }
  
  public int hashCode() {
    return Arrays.hashCode((Object[])this.namesAndValues);
  }
  
  public String name(int paramInt) {
    return this.namesAndValues[paramInt * 2];
  }
  
  public Set<String> names() {
    TreeSet<String> treeSet = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
    int j = size();
    for (int i = 0; i < j; i++)
      treeSet.add(name(i)); 
    return Collections.unmodifiableSet(treeSet);
  }
  
  public Builder newBuilder() {
    Builder builder = new Builder();
    Collections.addAll(builder.namesAndValues, this.namesAndValues);
    return builder;
  }
  
  public int size() {
    return this.namesAndValues.length / 2;
  }
  
  public Map<String, List<String>> toMultimap() {
    TreeMap<String, Object> treeMap = new TreeMap<String, Object>(String.CASE_INSENSITIVE_ORDER);
    int j = size();
    for (int i = 0; i < j; i++) {
      String str = name(i).toLowerCase(Locale.US);
      List<String> list2 = (List)treeMap.get(str);
      List<String> list1 = list2;
      if (list2 == null) {
        list1 = new ArrayList(2);
        treeMap.put(str, list1);
      } 
      list1.add(value(i));
    } 
    return (Map)treeMap;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    int j = size();
    for (int i = 0; i < j; i++) {
      stringBuilder.append(name(i));
      stringBuilder.append(": ");
      stringBuilder.append(value(i));
      stringBuilder.append("\n");
    } 
    return stringBuilder.toString();
  }
  
  public String value(int paramInt) {
    return this.namesAndValues[paramInt * 2 + 1];
  }
  
  public List<String> values(String paramString) {
    int j = size();
    ArrayList<String> arrayList = null;
    int i = 0;
    while (i < j) {
      ArrayList<String> arrayList1 = arrayList;
      if (paramString.equalsIgnoreCase(name(i))) {
        arrayList1 = arrayList;
        if (arrayList == null)
          arrayList1 = new ArrayList(2); 
        arrayList1.add(value(i));
      } 
      i++;
      arrayList = arrayList1;
    } 
    return (arrayList != null) ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
  }
  
  public static final class Builder {
    final List<String> namesAndValues = new ArrayList<String>(20);
    
    public Builder add(String param1String) {
      int i = param1String.indexOf(":");
      if (i != -1)
        return add(param1String.substring(0, i).trim(), param1String.substring(i + 1)); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unexpected header: ");
      stringBuilder.append(param1String);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public Builder add(String param1String1, String param1String2) {
      Headers.checkName(param1String1);
      Headers.checkValue(param1String2, param1String1);
      return addLenient(param1String1, param1String2);
    }
    
    public Builder add(String param1String, Date param1Date) {
      if (param1Date != null) {
        add(param1String, HttpDate.format(param1Date));
        return this;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("value for name ");
      stringBuilder.append(param1String);
      stringBuilder.append(" == null");
      throw new NullPointerException(stringBuilder.toString());
    }
    
    public Builder addAll(Headers param1Headers) {
      int j = param1Headers.size();
      for (int i = 0; i < j; i++)
        addLenient(param1Headers.name(i), param1Headers.value(i)); 
      return this;
    }
    
    Builder addLenient(String param1String) {
      int i = param1String.indexOf(":", 1);
      return (i != -1) ? addLenient(param1String.substring(0, i), param1String.substring(i + 1)) : (param1String.startsWith(":") ? addLenient("", param1String.substring(1)) : addLenient("", param1String));
    }
    
    Builder addLenient(String param1String1, String param1String2) {
      this.namesAndValues.add(param1String1);
      this.namesAndValues.add(param1String2.trim());
      return this;
    }
    
    public Builder addUnsafeNonAscii(String param1String1, String param1String2) {
      Headers.checkName(param1String1);
      return addLenient(param1String1, param1String2);
    }
    
    public Headers build() {
      return new Headers(this);
    }
    
    public String get(String param1String) {
      for (int i = this.namesAndValues.size() - 2; i >= 0; i -= 2) {
        if (param1String.equalsIgnoreCase(this.namesAndValues.get(i)))
          return this.namesAndValues.get(i + 1); 
      } 
      return null;
    }
    
    public Builder removeAll(String param1String) {
      for (int i = 0; i < this.namesAndValues.size(); i = j + 2) {
        int j = i;
        if (param1String.equalsIgnoreCase(this.namesAndValues.get(i))) {
          this.namesAndValues.remove(i);
          this.namesAndValues.remove(i);
          j = i - 2;
        } 
      } 
      return this;
    }
    
    public Builder set(String param1String1, String param1String2) {
      Headers.checkName(param1String1);
      Headers.checkValue(param1String2, param1String1);
      removeAll(param1String1);
      addLenient(param1String1, param1String2);
      return this;
    }
    
    public Builder set(String param1String, Date param1Date) {
      if (param1Date != null) {
        set(param1String, HttpDate.format(param1Date));
        return this;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("value for name ");
      stringBuilder.append(param1String);
      stringBuilder.append(" == null");
      throw new NullPointerException(stringBuilder.toString());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/Headers.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */