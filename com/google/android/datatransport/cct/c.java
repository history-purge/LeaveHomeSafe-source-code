package com.google.android.datatransport.cct;

import e.f.a.c.b;
import e.f.a.c.i.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class c implements g {
  static final String c = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
  
  static final String d = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
  
  private static final String e = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
  
  private static final Set<b> f = Collections.unmodifiableSet(new HashSet<b>(Arrays.asList(new b[] { b.a("proto"), b.a("json") })));
  
  public static final c g = new c(c, null);
  
  public static final c h = new c(d, e);
  
  private final String a;
  
  private final String b;
  
  public c(String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public static c a(byte[] paramArrayOfbyte) {
    String str = new String(paramArrayOfbyte, Charset.forName("UTF-8"));
    if (str.startsWith("1$")) {
      String[] arrayOfString = str.substring(2).split(Pattern.quote("\\"), 2);
      if (arrayOfString.length == 2) {
        String str1 = arrayOfString[0];
        if (!str1.isEmpty()) {
          String str3 = arrayOfString[1];
          String str2 = str3;
          if (str3.isEmpty())
            str2 = null; 
          return new c(str1, str2);
        } 
        throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
      } 
      throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
    } 
    throw new IllegalArgumentException("Version marker missing from extras");
  }
  
  public Set<b> a() {
    return f;
  }
  
  public byte[] b() {
    return c();
  }
  
  public byte[] c() {
    if (this.b == null && this.a == null)
      return null; 
    String str3 = this.a;
    String str2 = this.b;
    String str1 = str2;
    if (str2 == null)
      str1 = ""; 
    return String.format("%s%s%s%s", new Object[] { "1$", str3, "\\", str1 }).getBytes(Charset.forName("UTF-8"));
  }
  
  public String d() {
    return this.b;
  }
  
  public String e() {
    return this.a;
  }
  
  public String getName() {
    return "cct";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/cct/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */