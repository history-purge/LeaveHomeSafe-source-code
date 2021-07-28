package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.o;
import java.util.regex.Pattern;

final class t0 {
  private static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
  
  private final String a;
  
  private final String b;
  
  private final String c;
  
  private t0(String paramString1, String paramString2) {
    this.a = a(paramString2, paramString1);
    this.b = paramString1;
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 1 + String.valueOf(paramString2).length());
    stringBuilder.append(paramString1);
    stringBuilder.append("!");
    stringBuilder.append(paramString2);
    this.c = stringBuilder.toString();
  }
  
  static t0 a(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return null; 
    String[] arrayOfString = paramString.split("!", -1);
    return (arrayOfString.length != 2) ? null : new t0(arrayOfString[0], arrayOfString[1]);
  }
  
  private static String a(String paramString1, String paramString2) {
    String str = paramString1;
    if (paramString1 != null) {
      str = paramString1;
      if (paramString1.startsWith("/topics/")) {
        Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[] { paramString2 }));
        str = paramString1.substring(8);
      } 
    } 
    if (str != null && d.matcher(str).matches())
      return str; 
    throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[] { str, "[a-zA-Z0-9-_.~%]{1,900}" }));
  }
  
  public static t0 b(String paramString) {
    return new t0("S", paramString);
  }
  
  public static t0 c(String paramString) {
    return new t0("U", paramString);
  }
  
  public String a() {
    return this.b;
  }
  
  public String b() {
    return this.a;
  }
  
  public String c() {
    return this.c;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof t0))
      return false; 
    paramObject = paramObject;
    return (this.a.equals(((t0)paramObject).a) && this.b.equals(((t0)paramObject).b));
  }
  
  public int hashCode() {
    return o.a(new Object[] { this.b, this.a });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/t0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */