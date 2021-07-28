package com.oblador.keychain.g;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.util.Log;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.oblador.keychain.f;
import com.oblador.keychain.h.d;
import com.oblador.keychain.i.a;
import e.e.a.a.a.a;
import e.e.a.a.a.d;
import e.e.f.c;
import e.e.f.f;
import e.e.f.i.a;
import java.security.Key;

public class g extends f {
  private final c i;
  
  public g(ReactApplicationContext paramReactApplicationContext) {
    d d = new d((Context)paramReactApplicationContext, f.d);
    this.i = a.a().b((a)d);
  }
  
  private static e.e.f.g e(String paramString) {
    paramString = g(paramString);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("pass");
    return e.e.f.g.a(stringBuilder.toString());
  }
  
  private static e.e.f.g f(String paramString) {
    paramString = g(paramString);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("user");
    return e.e.f.g.a(stringBuilder.toString());
  }
  
  private static String g(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("RN_KEYCHAIN:");
    stringBuilder.append(paramString);
    return stringBuilder.toString();
  }
  
  private void l() {
    if (this.i.b())
      return; 
    throw new a("Crypto is missing");
  }
  
  protected KeyInfo a(Key paramKey) {
    throw new a("Not designed for a call");
  }
  
  public f a() {
    return f.c;
  }
  
  public e.c a(String paramString, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, f paramf) {
    a(paramf);
    l();
    e.e.f.g g2 = f(paramString);
    e.e.f.g g1 = e(paramString);
    try {
      return new e.c(new String(paramArrayOfbyte1, f.h), new String(paramArrayOfbyte2, f.h), f.c);
    } finally {
      paramArrayOfbyte1 = null;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Decryption failed for alias: ");
      stringBuilder.append(paramString);
    } 
  }
  
  public e.d a(String paramString1, String paramString2, String paramString3, f paramf) {
    a(paramf);
    l();
    e.e.f.g g1 = f(paramString1);
    e.e.f.g g2 = e(paramString1);
    try {
      return new e.d(this.i.b(paramString2.getBytes(f.h), g1), this.i.b(paramString3.getBytes(f.h), g2), this);
    } finally {
      paramString2 = null;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Encryption failed for alias: ");
      stringBuilder.append(paramString1);
    } 
  }
  
  protected Key a(KeyGenParameterSpec paramKeyGenParameterSpec) {
    throw new a("Not designed for a call");
  }
  
  public void a(d paramd, String paramString, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, f paramf) {
    try {
      return;
    } finally {
      paramString = null;
      paramd.a(null, (Throwable)paramString);
    } 
  }
  
  public void a(String paramString) {
    String str = f.g;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("CipherStorageFacebookConceal removeKey called. alias: ");
    stringBuilder.append(paramString);
    Log.w(str, stringBuilder.toString());
  }
  
  protected KeyGenParameterSpec.Builder b(String paramString) {
    throw new a("Not designed for a call");
  }
  
  public boolean b() {
    return false;
  }
  
  public String c() {
    return "FacebookConceal";
  }
  
  public int e() {
    return 16;
  }
  
  public boolean f() {
    return false;
  }
  
  protected String j() {
    throw new AssertionException("Not designed for a call");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/g/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */