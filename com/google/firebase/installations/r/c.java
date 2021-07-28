package com.google.firebase.installations.r;

import com.google.firebase.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
  private final File a;
  
  private final g b;
  
  public c(g paramg) {
    File file = paramg.b().getFilesDir();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("PersistedInstallation.");
    stringBuilder.append(paramg.e());
    stringBuilder.append(".json");
    this.a = new File(file, stringBuilder.toString());
    this.b = paramg;
  }
  
  private JSONObject b() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[16384];
    try {
      FileInputStream fileInputStream = new FileInputStream(this.a);
      try {
        while (true) {
          JSONObject jSONObject;
          int i = fileInputStream.read(arrayOfByte, 0, arrayOfByte.length);
          if (i < 0) {
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            return jSONObject;
          } 
          jSONObject.write(arrayOfByte, 0, i);
        } 
      } finally {
        try {
          fileInputStream.close();
        } finally {}
      } 
    } catch (IOException|JSONException iOException) {
      return new JSONObject();
    } 
  }
  
  public d a() {
    JSONObject jSONObject = b();
    String str1 = jSONObject.optString("Fid", null);
    int i = jSONObject.optInt("Status", a.c.ordinal());
    String str2 = jSONObject.optString("AuthToken", null);
    String str3 = jSONObject.optString("RefreshToken", null);
    long l1 = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
    long l2 = jSONObject.optLong("ExpiresInSecs", 0L);
    String str4 = jSONObject.optString("FisError", null);
    d.a a = d.p();
    a.b(str1);
    a.a(a.values()[i]);
    a.a(str2);
    a.d(str3);
    a.b(l1);
    a.a(l2);
    a.c(str4);
    return a.a();
  }
  
  public d a(d paramd) {
    try {
      JSONObject jSONObject = new JSONObject();
      jSONObject.put("Fid", paramd.c());
      jSONObject.put("Status", paramd.f().ordinal());
      jSONObject.put("AuthToken", paramd.a());
      jSONObject.put("RefreshToken", paramd.e());
      jSONObject.put("TokenCreationEpochInSecs", paramd.g());
      jSONObject.put("ExpiresInSecs", paramd.b());
      jSONObject.put("FisError", paramd.d());
      File file = File.createTempFile("PersistedInstallation", "tmp", this.b.b().getFilesDir());
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
      fileOutputStream.close();
      if (file.renameTo(this.a))
        return paramd; 
      throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    } catch (JSONException|IOException jSONException) {
      return paramd;
    } 
  }
  
  public enum a {
    c, d, e, f, g;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/r/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */