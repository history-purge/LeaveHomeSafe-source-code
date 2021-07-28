package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.r.d;
import com.google.firebase.installations.t.a;
import com.google.firebase.installations.t.b;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class p {
  public static final long b = TimeUnit.HOURS.toSeconds(1L);
  
  private static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
  
  private static p d;
  
  private final a a;
  
  private p(a parama) {
    this.a = parama;
  }
  
  public static p a(a parama) {
    if (d == null)
      d = new p(parama); 
    return d;
  }
  
  static boolean a(String paramString) {
    return c.matcher(paramString).matches();
  }
  
  static boolean b(String paramString) {
    return paramString.contains(":");
  }
  
  public static p d() {
    return a((a)b.b());
  }
  
  public long a() {
    return this.a.a();
  }
  
  public boolean a(d paramd) {
    return TextUtils.isEmpty(paramd.a()) ? true : ((paramd.g() + paramd.b() < b() + b));
  }
  
  public long b() {
    return TimeUnit.MILLISECONDS.toSeconds(a());
  }
  
  public long c() {
    return (long)(Math.random() * 1000.0D);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */