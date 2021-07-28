package com.oblador.keychain;

import android.content.SharedPreferences;
import android.util.Base64;
import com.facebook.react.bridge.ReactApplicationContext;
import com.oblador.keychain.g.e;
import java.util.HashSet;
import java.util.Set;

public class e {
  private final SharedPreferences a;
  
  public e(ReactApplicationContext paramReactApplicationContext) {
    this.a = paramReactApplicationContext.getSharedPreferences("RN_KEYCHAIN", 0);
  }
  
  private byte[] c(String paramString) {
    paramString = this.a.getString(paramString, null);
    return (paramString != null) ? Base64.decode(paramString, 0) : null;
  }
  
  private byte[] d(String paramString) {
    return c(h(paramString));
  }
  
  private byte[] e(String paramString) {
    return c(i(paramString));
  }
  
  private String f(String paramString) {
    paramString = g(paramString);
    return this.a.getString(paramString, null);
  }
  
  public static String g(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append(":c");
    return stringBuilder.toString();
  }
  
  public static String h(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append(":p");
    return stringBuilder.toString();
  }
  
  public static String i(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append(":u");
    return stringBuilder.toString();
  }
  
  public static boolean j(String paramString) {
    return paramString.endsWith(":c");
  }
  
  public a a(String paramString) {
    byte[] arrayOfByte1 = e(paramString);
    byte[] arrayOfByte2 = d(paramString);
    String str = f(paramString);
    if (arrayOfByte1 == null || arrayOfByte2 == null)
      return null; 
    paramString = str;
    if (str == null)
      paramString = "FacebookConceal"; 
    return new a(paramString, arrayOfByte1, arrayOfByte2);
  }
  
  public Set<String> a() {
    HashSet<String> hashSet = new HashSet();
    for (String str : this.a.getAll().keySet()) {
      if (j(str))
        hashSet.add(this.a.getString(str, null)); 
    } 
    return hashSet;
  }
  
  public void a(String paramString, e.d paramd) {
    String str1 = i(paramString);
    String str2 = h(paramString);
    paramString = g(paramString);
    this.a.edit().putString(str1, Base64.encodeToString((byte[])((e.a)paramd).a, 0)).putString(str2, Base64.encodeToString((byte[])((e.a)paramd).b, 0)).putString(paramString, paramd.c).apply();
  }
  
  public void b(String paramString) {
    String str1 = i(paramString);
    String str2 = h(paramString);
    paramString = g(paramString);
    this.a.edit().remove(str1).remove(str2).remove(paramString).apply();
  }
  
  public static class a extends e.a<byte[]> {
    public final String c;
    
    public a(String param1String, byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      super(param1ArrayOfbyte1, param1ArrayOfbyte2);
      this.c = param1String;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */