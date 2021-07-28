package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.g;
import e.f.a.e.e.k.a;
import java.util.Iterator;

public final class j {
  private static a a = new a("GoogleSignInCommon", new String[0]);
  
  public static h<Status> a(f paramf, Context paramContext, boolean paramBoolean) {
    a.a("Signing out", new Object[0]);
    a(paramContext);
    return (h<Status>)(paramBoolean ? i.a(Status.h, paramf) : paramf.a(new k(paramf)));
  }
  
  private static void a(Context paramContext) {
    q.a(paramContext).a();
    Iterator<f> iterator = f.c().iterator();
    if (!iterator.hasNext()) {
      g.c();
      return;
    } 
    ((f)iterator.next()).b();
    throw null;
  }
  
  public static h<Status> b(f paramf, Context paramContext, boolean paramBoolean) {
    a.a("Revoking access", new Object[0]);
    String str = c.a(paramContext).d();
    a(paramContext);
    return (h<Status>)(paramBoolean ? g.a(str) : paramf.a(new l(paramf)));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */