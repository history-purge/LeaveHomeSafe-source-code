package e.e.l.f;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import e.e.c.a.d;
import e.e.e.g.a;
import e.e.e.g.g;
import e.e.e.g.h;
import e.e.e.h.a;
import e.e.l.c.f;
import e.e.l.d.e;
import e.e.l.d.f;
import e.e.l.d.p;
import e.e.l.i.c;
import e.e.l.i.e;
import e.e.l.k.b;
import e.e.l.k.d;
import e.e.l.n.a;
import e.e.l.n.a0;
import e.e.l.n.b0;
import e.e.l.n.c0;
import e.e.l.n.e0;
import e.e.l.n.f;
import e.e.l.n.f0;
import e.e.l.n.g;
import e.e.l.n.g0;
import e.e.l.n.h;
import e.e.l.n.h0;
import e.e.l.n.i;
import e.e.l.n.i0;
import e.e.l.n.j;
import e.e.l.n.j0;
import e.e.l.n.l;
import e.e.l.n.n0;
import e.e.l.n.o;
import e.e.l.n.o0;
import e.e.l.n.p;
import e.e.l.n.q;
import e.e.l.n.r;
import e.e.l.n.r0;
import e.e.l.n.s0;
import e.e.l.n.t0;
import e.e.l.n.u0;
import e.e.l.n.v;
import e.e.l.n.v0;
import e.e.l.n.w;
import e.e.l.n.w0;
import e.e.l.n.x;
import e.e.l.n.y;
import e.e.l.n.y0;
import e.e.l.q.d;

public class m {
  private ContentResolver a;
  
  private Resources b;
  
  private AssetManager c;
  
  private final a d;
  
  private final c e;
  
  private final e f;
  
  private final boolean g;
  
  private final boolean h;
  
  private final boolean i;
  
  private final f j;
  
  private final h k;
  
  private final e l;
  
  private final e m;
  
  private final p<d, g> n;
  
  private final p<d, b> o;
  
  private final f p;
  
  private final f q;
  
  private final int r;
  
  private final int s;
  
  private boolean t;
  
  private final a u;
  
  private final int v;
  
  public m(Context paramContext, a parama, c paramc, e parame, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, f paramf, h paramh, p<d, b> paramp, p<d, g> paramp1, e parame1, e parame2, f paramf1, f paramf2, int paramInt1, int paramInt2, boolean paramBoolean4, int paramInt3, a parama1) {
    this.a = paramContext.getApplicationContext().getContentResolver();
    this.b = paramContext.getApplicationContext().getResources();
    this.c = paramContext.getApplicationContext().getAssets();
    this.d = parama;
    this.e = paramc;
    this.f = parame;
    this.g = paramBoolean1;
    this.h = paramBoolean2;
    this.i = paramBoolean3;
    this.j = paramf;
    this.k = paramh;
    this.o = paramp;
    this.n = paramp1;
    this.l = parame1;
    this.m = parame2;
    this.p = paramf1;
    this.q = paramf2;
    this.r = paramInt1;
    this.s = paramInt2;
    this.t = paramBoolean4;
    this.v = paramInt3;
    this.u = parama1;
  }
  
  public static j a(j0<d> paramj01, j0<d> paramj02) {
    return new j(paramj01, paramj02);
  }
  
  public static a o(j0<d> paramj0) {
    return new a(paramj0);
  }
  
  public static <T> r0<T> p(j0<T> paramj0) {
    return new r0(paramj0);
  }
  
  public e0 a(f0 paramf0) {
    return new e0(this.k, this.d, paramf0);
  }
  
  public f a(j0<a<b>> paramj0) {
    return new f(this.o, this.p, paramj0);
  }
  
  public l a() {
    return new l(this.k);
  }
  
  public o0 a(j0<d> paramj0, boolean paramBoolean, d paramd) {
    return new o0(this.j.d(), this.k, paramj0, paramBoolean, paramd);
  }
  
  public <T> s0<T> a(j0<T> paramj0, t0 paramt0) {
    return new s0(paramj0, paramt0);
  }
  
  public v0 a(w0<d>[] paramArrayOfw0) {
    return new v0((w0[])paramArrayOfw0);
  }
  
  public g b(j0<a<b>> paramj0) {
    return new g(this.p, paramj0);
  }
  
  public v b() {
    return new v(this.j.c(), this.k, this.c);
  }
  
  public h c(j0<a<b>> paramj0) {
    return new h(this.o, this.p, paramj0);
  }
  
  public w c() {
    return new w(this.j.c(), this.k, this.a);
  }
  
  public i d(j0<a<b>> paramj0) {
    return new i(paramj0, this.r, this.s, this.t);
  }
  
  public x d() {
    return new x(this.j.c(), this.k, this.a);
  }
  
  public e.e.l.n.m e(j0<d> paramj0) {
    return new e.e.l.n.m(this.d, this.j.a(), this.e, this.f, this.g, this.h, this.i, paramj0, this.v, this.u);
  }
  
  public y e() {
    return new y(this.j.c(), this.k, this.a);
  }
  
  public a0 f() {
    return new a0(this.j.c(), this.k);
  }
  
  public o f(j0<d> paramj0) {
    return new o(this.l, this.m, this.p, paramj0);
  }
  
  public b0 g() {
    return new b0(this.j.c(), this.k, this.b);
  }
  
  public p g(j0<d> paramj0) {
    return new p(this.l, this.m, this.p, paramj0);
  }
  
  public c0 h() {
    return new c0(this.j.c(), this.a);
  }
  
  public q h(j0<d> paramj0) {
    return new q(this.p, paramj0);
  }
  
  public n0 i() {
    return new n0(this.j.c(), this.k, this.a);
  }
  
  public r i(j0<d> paramj0) {
    return new r(this.n, this.p, paramj0);
  }
  
  public g0 j(j0<d> paramj0) {
    return new g0(this.l, this.p, this.k, this.d, paramj0);
  }
  
  public h0 k(j0<a<b>> paramj0) {
    return new h0(this.o, this.p, paramj0);
  }
  
  public i0 l(j0<a<b>> paramj0) {
    return new i0(paramj0, this.q, this.j.d());
  }
  
  public <T> u0<T> m(j0<T> paramj0) {
    return new u0(5, this.j.b(), paramj0);
  }
  
  public y0 n(j0<d> paramj0) {
    return new y0(this.j.d(), this.k, paramj0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/f/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */