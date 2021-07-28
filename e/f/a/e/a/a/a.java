package e.f.a.e.a.a;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.h;
import com.google.android.gms.auth.api.signin.internal.i;
import com.google.android.gms.common.internal.o;
import e.f.a.e.a.a.e.a;
import e.f.a.e.i.a.f;
import e.f.a.e.i.a.g;

public final class a {
  public static final com.google.android.gms.common.api.a.g<g> a = new com.google.android.gms.common.api.a.g();
  
  public static final com.google.android.gms.common.api.a.g<h> b = new com.google.android.gms.common.api.a.g();
  
  private static final com.google.android.gms.common.api.a.a<g, a> c = new g();
  
  private static final com.google.android.gms.common.api.a.a<h, GoogleSignInOptions> d = new h();
  
  public static final com.google.android.gms.common.api.a<GoogleSignInOptions> e = new com.google.android.gms.common.api.a("Auth.GOOGLE_SIGN_IN_API", d, b);
  
  static {
    a a1 = b.d;
    new f();
    new i();
  }
  
  static {
    com.google.android.gms.common.api.a<c> a2 = b.c;
    new com.google.android.gms.common.api.a("Auth.CREDENTIALS_API", c, a);
  }
  
  @Deprecated
  public static class a implements com.google.android.gms.common.api.a.d.f {
    public static final a f = (new a()).a();
    
    private final String c;
    
    private final boolean d;
    
    private final String e;
    
    public a(a param1a) {
      this.c = param1a.a;
      this.d = param1a.b.booleanValue();
      this.e = param1a.c;
    }
    
    public final Bundle a() {
      Bundle bundle = new Bundle();
      bundle.putString("consumer_package", this.c);
      bundle.putBoolean("force_save_dialog", this.d);
      bundle.putString("log_session_id", this.e);
      return bundle;
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object == this)
        return true; 
      if (!(param1Object instanceof a))
        return false; 
      param1Object = param1Object;
      return (o.a(this.c, ((a)param1Object).c) && this.d == ((a)param1Object).d && o.a(this.e, ((a)param1Object).e));
    }
    
    public int hashCode() {
      return o.a(new Object[] { this.c, Boolean.valueOf(this.d), this.e });
    }
    
    @Deprecated
    public static class a {
      protected String a;
      
      protected Boolean b = Boolean.valueOf(false);
      
      protected String c;
      
      public a() {}
      
      public a(a.a param2a) {
        this.a = a.a.a(param2a);
        this.b = Boolean.valueOf(a.a.b(param2a));
        this.c = a.a.c(param2a);
      }
      
      public a a(String param2String) {
        this.c = param2String;
        return this;
      }
      
      public a.a a() {
        return new a.a(this);
      }
    }
  }
  
  @Deprecated
  public static class a {
    protected String a;
    
    protected Boolean b = Boolean.valueOf(false);
    
    protected String c;
    
    public a() {}
    
    public a(a.a param1a) {
      this.a = a.a.a(param1a);
      this.b = Boolean.valueOf(a.a.b(param1a));
      this.c = a.a.c(param1a);
    }
    
    public a a(String param1String) {
      this.c = param1String;
      return this;
    }
    
    public a.a a() {
      return new a.a(this);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */