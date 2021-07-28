package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.q;
import e.f.a.e.e.k.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class g implements Runnable {
  private static final a e = new a("RevokeAccessOperation", new String[0]);
  
  private final String c;
  
  private final o d;
  
  private g(String paramString) {
    q.b(paramString);
    this.c = paramString;
    this.d = new o(null);
  }
  
  public static h<Status> a(String paramString) {
    if (paramString == null)
      return i.a((l)new Status(4), null); 
    g g1 = new g(paramString);
    (new Thread(g1)).start();
    return (h<Status>)g1.d;
  }
  
  public final void run() {
    a a1;
    a a2;
    Status status1 = Status.j;
    Status status2 = status1;
    Status status3 = status1;
    try {
      String str = String.valueOf(this.c);
      status2 = status1;
      status3 = status1;
      if (str.length() != 0) {
        status2 = status1;
        status3 = status1;
        str = "https://accounts.google.com/o/oauth2/revoke?token=".concat(str);
      } else {
        status2 = status1;
        status3 = status1;
        str = new String("https://accounts.google.com/o/oauth2/revoke?token=");
      } 
      status2 = status1;
      status3 = status1;
      HttpURLConnection httpURLConnection = (HttpURLConnection)(new URL(str)).openConnection();
      status2 = status1;
      status3 = status1;
      httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      status2 = status1;
      status3 = status1;
      int i = httpURLConnection.getResponseCode();
      if (i == 200) {
        status2 = status1;
        status3 = status1;
        status1 = Status.h;
      } else {
        status2 = status1;
        status3 = status1;
        e.b("Unable to revoke access!", new Object[0]);
      } 
      status2 = status1;
      status3 = status1;
      a a3 = e;
      status2 = status1;
      status3 = status1;
      StringBuilder stringBuilder = new StringBuilder(26);
      status2 = status1;
      status3 = status1;
      stringBuilder.append("Response Code: ");
      status2 = status1;
      status3 = status1;
      stringBuilder.append(i);
      status2 = status1;
      status3 = status1;
      a3.a(stringBuilder.toString(), new Object[0]);
    } catch (IOException iOException) {
      a2 = e;
      String str = String.valueOf(iOException.toString());
      if (str.length() != 0) {
        str = "IOException when revoking access: ".concat(str);
      } else {
        str = new String("IOException when revoking access: ");
      } 
      a2.b(str, new Object[0]);
      Status status = status3;
    } catch (Exception exception) {
      a a3 = e;
      String str = String.valueOf(exception.toString());
      if (str.length() != 0) {
        str = "Exception when revoking access: ".concat(str);
      } else {
        str = new String("Exception when revoking access: ");
      } 
      a3.b(str, new Object[0]);
      a1 = a2;
    } 
    this.d.a((l)a1);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */