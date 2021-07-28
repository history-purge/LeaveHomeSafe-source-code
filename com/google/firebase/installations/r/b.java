package com.google.firebase.installations.r;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.g;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
  private static final String[] c = new String[] { "*", "FCM", "GCM", "" };
  
  private final SharedPreferences a;
  
  private final String b;
  
  public b(g paramg) {
    this.a = paramg.b().getSharedPreferences("com.google.android.gms.appid", 0);
    this.b = a(paramg);
  }
  
  private static String a(g paramg) {
    String str3 = paramg.d().e();
    if (str3 != null)
      return str3; 
    String str2 = paramg.d().b();
    if (!str2.startsWith("1:") && !str2.startsWith("2:"))
      return str2; 
    String[] arrayOfString = str2.split(":");
    if (arrayOfString.length != 4)
      return null; 
    String str1 = arrayOfString[1];
    return str1.isEmpty() ? null : str1;
  }
  
  private String a(String paramString) {
    try {
      return (new JSONObject(paramString)).getString("token");
    } catch (JSONException jSONException) {
      return null;
    } 
  }
  
  private String a(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("|T|");
    stringBuilder.append(paramString1);
    stringBuilder.append("|");
    stringBuilder.append(paramString2);
    return stringBuilder.toString();
  }
  
  private static String a(PublicKey paramPublicKey) {
    byte[] arrayOfByte = paramPublicKey.getEncoded();
    try {
      arrayOfByte = MessageDigest.getInstance("SHA1").digest(arrayOfByte);
      arrayOfByte[0] = (byte)((arrayOfByte[0] & 0xF) + 112 & 0xFF);
      return Base64.encodeToString(arrayOfByte, 0, 8, 11);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      Log.w("ContentValues", "Unexpected error, device missing required algorithms");
      return null;
    } 
  }
  
  private PublicKey b(String paramString) {
    try {
      byte[] arrayOfByte = Base64.decode(paramString, 8);
      return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(arrayOfByte));
    } catch (IllegalArgumentException illegalArgumentException) {
    
    } catch (InvalidKeySpecException invalidKeySpecException) {
    
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid key stored ");
    stringBuilder.append(noSuchAlgorithmException);
    Log.w("ContentValues", stringBuilder.toString());
    return null;
  }
  
  private String c() {
    synchronized (this.a) {
      return this.a.getString("|S|id", null);
    } 
  }
  
  private String d() {
    synchronized (this.a) {
      String str = this.a.getString("|S||P|", null);
      if (str == null)
        return null; 
      PublicKey publicKey = b(str);
      if (publicKey == null)
        return null; 
      return a(publicKey);
    } 
  }
  
  public String a() {
    synchronized (this.a) {
      String str = c();
      if (str != null)
        return str; 
      str = d();
      return str;
    } 
  }
  
  public String b() {
    synchronized (this.a) {
      String[] arrayOfString = c;
      int j = arrayOfString.length;
      for (int i = 0;; i++) {
        if (i < j) {
          String str = arrayOfString[i];
          str = a(this.b, str);
          str = this.a.getString(str, null);
          if (str != null && !str.isEmpty()) {
            String str1 = str;
            if (str.startsWith("{"))
              str1 = a(str); 
            return str1;
          } 
        } else {
          return null;
        } 
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/r/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */