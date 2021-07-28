package com.google.android.datatransport.cct.f;

import com.google.firebase.m.i.a;

public final class b implements a {
  public static final a a = new b();
  
  public void a(com.google.firebase.m.i.b<?> paramb) {
    paramb.a(j.class, b.a);
    paramb.a(d.class, b.a);
    paramb.a(m.class, e.a);
    paramb.a(g.class, e.a);
    paramb.a(k.class, c.a);
    paramb.a(e.class, c.a);
    paramb.a(a.class, a.a);
    paramb.a(c.class, a.a);
    paramb.a(l.class, d.a);
    paramb.a(f.class, d.a);
    paramb.a(o.class, f.a);
    paramb.a(i.class, f.a);
  }
  
  private static final class a implements com.google.firebase.m.e<a> {
    static final a a = new a();
    
    private static final com.google.firebase.m.d b = com.google.firebase.m.d.b("sdkVersion");
    
    private static final com.google.firebase.m.d c = com.google.firebase.m.d.b("model");
    
    private static final com.google.firebase.m.d d = com.google.firebase.m.d.b("hardware");
    
    private static final com.google.firebase.m.d e = com.google.firebase.m.d.b("device");
    
    private static final com.google.firebase.m.d f = com.google.firebase.m.d.b("product");
    
    private static final com.google.firebase.m.d g = com.google.firebase.m.d.b("osBuild");
    
    private static final com.google.firebase.m.d h = com.google.firebase.m.d.b("manufacturer");
    
    private static final com.google.firebase.m.d i = com.google.firebase.m.d.b("fingerprint");
    
    private static final com.google.firebase.m.d j = com.google.firebase.m.d.b("locale");
    
    private static final com.google.firebase.m.d k = com.google.firebase.m.d.b("country");
    
    private static final com.google.firebase.m.d l = com.google.firebase.m.d.b("mccMnc");
    
    private static final com.google.firebase.m.d m = com.google.firebase.m.d.b("applicationBuild");
    
    public void a(a param1a, com.google.firebase.m.f param1f) {
      param1f.a(b, param1a.l());
      param1f.a(c, param1a.i());
      param1f.a(d, param1a.e());
      param1f.a(e, param1a.c());
      param1f.a(f, param1a.k());
      param1f.a(g, param1a.j());
      param1f.a(h, param1a.g());
      param1f.a(i, param1a.d());
      param1f.a(j, param1a.f());
      param1f.a(k, param1a.b());
      param1f.a(l, param1a.h());
      param1f.a(m, param1a.a());
    }
  }
  
  private static final class b implements com.google.firebase.m.e<j> {
    static final b a = new b();
    
    private static final com.google.firebase.m.d b = com.google.firebase.m.d.b("logRequest");
    
    public void a(j param1j, com.google.firebase.m.f param1f) {
      param1f.a(b, param1j.a());
    }
  }
  
  private static final class c implements com.google.firebase.m.e<k> {
    static final c a = new c();
    
    private static final com.google.firebase.m.d b = com.google.firebase.m.d.b("clientType");
    
    private static final com.google.firebase.m.d c = com.google.firebase.m.d.b("androidClientInfo");
    
    public void a(k param1k, com.google.firebase.m.f param1f) {
      param1f.a(b, param1k.b());
      param1f.a(c, param1k.a());
    }
  }
  
  private static final class d implements com.google.firebase.m.e<l> {
    static final d a = new d();
    
    private static final com.google.firebase.m.d b = com.google.firebase.m.d.b("eventTimeMs");
    
    private static final com.google.firebase.m.d c = com.google.firebase.m.d.b("eventCode");
    
    private static final com.google.firebase.m.d d = com.google.firebase.m.d.b("eventUptimeMs");
    
    private static final com.google.firebase.m.d e = com.google.firebase.m.d.b("sourceExtension");
    
    private static final com.google.firebase.m.d f = com.google.firebase.m.d.b("sourceExtensionJsonProto3");
    
    private static final com.google.firebase.m.d g = com.google.firebase.m.d.b("timezoneOffsetSeconds");
    
    private static final com.google.firebase.m.d h = com.google.firebase.m.d.b("networkConnectionInfo");
    
    public void a(l param1l, com.google.firebase.m.f param1f) {
      param1f.a(b, param1l.b());
      param1f.a(c, param1l.a());
      param1f.a(d, param1l.c());
      param1f.a(e, param1l.e());
      param1f.a(f, param1l.f());
      param1f.a(g, param1l.g());
      param1f.a(h, param1l.d());
    }
  }
  
  private static final class e implements com.google.firebase.m.e<m> {
    static final e a = new e();
    
    private static final com.google.firebase.m.d b = com.google.firebase.m.d.b("requestTimeMs");
    
    private static final com.google.firebase.m.d c = com.google.firebase.m.d.b("requestUptimeMs");
    
    private static final com.google.firebase.m.d d = com.google.firebase.m.d.b("clientInfo");
    
    private static final com.google.firebase.m.d e = com.google.firebase.m.d.b("logSource");
    
    private static final com.google.firebase.m.d f = com.google.firebase.m.d.b("logSourceName");
    
    private static final com.google.firebase.m.d g = com.google.firebase.m.d.b("logEvent");
    
    private static final com.google.firebase.m.d h = com.google.firebase.m.d.b("qosTier");
    
    public void a(m param1m, com.google.firebase.m.f param1f) {
      param1f.a(b, param1m.f());
      param1f.a(c, param1m.g());
      param1f.a(d, param1m.a());
      param1f.a(e, param1m.c());
      param1f.a(f, param1m.d());
      param1f.a(g, param1m.b());
      param1f.a(h, param1m.e());
    }
  }
  
  private static final class f implements com.google.firebase.m.e<o> {
    static final f a = new f();
    
    private static final com.google.firebase.m.d b = com.google.firebase.m.d.b("networkType");
    
    private static final com.google.firebase.m.d c = com.google.firebase.m.d.b("mobileSubtype");
    
    public void a(o param1o, com.google.firebase.m.f param1f) {
      param1f.a(b, param1o.b());
      param1f.a(c, param1o.a());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/cct/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */