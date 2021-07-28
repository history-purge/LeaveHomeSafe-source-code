package e.e.l.f;

import android.content.ContentResolver;
import android.net.Uri;
import e.e.e.d.i;
import e.e.e.f.a;
import e.e.e.h.a;
import e.e.l.k.b;
import e.e.l.k.d;
import e.e.l.n.a;
import e.e.l.n.f0;
import e.e.l.n.g;
import e.e.l.n.g0;
import e.e.l.n.h;
import e.e.l.n.j0;
import e.e.l.n.o;
import e.e.l.n.o0;
import e.e.l.n.p;
import e.e.l.n.s0;
import e.e.l.n.t0;
import e.e.l.n.u0;
import e.e.l.n.v0;
import e.e.l.n.w0;
import e.e.l.o.c;
import e.e.l.p.b;
import e.e.l.q.d;
import java.util.HashMap;
import java.util.Map;

public class n {
  private final ContentResolver a;
  
  private final m b;
  
  private final f0 c;
  
  private final boolean d;
  
  private final boolean e;
  
  private final boolean f;
  
  private final t0 g;
  
  private final boolean h;
  
  private final boolean i;
  
  private final boolean j;
  
  private final d k;
  
  j0<a<b>> l;
  
  j0<d> m;
  
  j0<d> n;
  
  j0<Void> o;
  
  j0<Void> p;
  
  private j0<d> q;
  
  j0<a<b>> r;
  
  j0<a<b>> s;
  
  j0<a<b>> t;
  
  j0<a<b>> u;
  
  j0<a<b>> v;
  
  j0<a<b>> w;
  
  j0<a<b>> x;
  
  Map<j0<a<b>>, j0<a<b>>> y;
  
  Map<j0<a<b>>, j0<a<b>>> z;
  
  public n(ContentResolver paramContentResolver, m paramm, f0 paramf0, boolean paramBoolean1, boolean paramBoolean2, t0 paramt0, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, d paramd) {
    this.a = paramContentResolver;
    this.b = paramm;
    this.c = paramf0;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.y = new HashMap<j0<a<b>>, j0<a<b>>>();
    new HashMap<Object, Object>();
    this.z = new HashMap<j0<a<b>>, j0<a<b>>>();
    this.g = paramt0;
    this.h = paramBoolean3;
    this.i = paramBoolean4;
    this.f = paramBoolean5;
    this.j = paramBoolean6;
    this.k = paramd;
  }
  
  private j0<d> a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic c : ()Z
    //   5: ifeq -> 13
    //   8: ldc 'ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence'
    //   10: invokestatic a : (Ljava/lang/String;)V
    //   13: aload_0
    //   14: getfield m : Le/e/l/n/j0;
    //   17: ifnonnull -> 68
    //   20: invokestatic c : ()Z
    //   23: ifeq -> 31
    //   26: ldc 'ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence:init'
    //   28: invokestatic a : (Ljava/lang/String;)V
    //   31: aload_0
    //   32: aload_0
    //   33: getfield b : Le/e/l/f/m;
    //   36: invokevirtual f : ()Le/e/l/n/a0;
    //   39: invokespecial g : (Le/e/l/n/j0;)Le/e/l/n/j0;
    //   42: astore_1
    //   43: aload_0
    //   44: aload_0
    //   45: getfield b : Le/e/l/f/m;
    //   48: aload_1
    //   49: aload_0
    //   50: getfield g : Le/e/l/n/t0;
    //   53: invokevirtual a : (Le/e/l/n/j0;Le/e/l/n/t0;)Le/e/l/n/s0;
    //   56: putfield m : Le/e/l/n/j0;
    //   59: invokestatic c : ()Z
    //   62: ifeq -> 68
    //   65: invokestatic a : ()V
    //   68: invokestatic c : ()Z
    //   71: ifeq -> 77
    //   74: invokestatic a : ()V
    //   77: aload_0
    //   78: getfield m : Le/e/l/n/j0;
    //   81: astore_1
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_1
    //   85: areturn
    //   86: astore_1
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_1
    //   90: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	86	finally
    //   13	31	86	finally
    //   31	68	86	finally
    //   68	77	86	finally
    //   77	82	86	finally
  }
  
  private j0<a<b>> a(j0<a<b>> paramj0) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield z : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast e/e/l/n/j0
    //   15: astore_3
    //   16: aload_3
    //   17: astore_2
    //   18: aload_3
    //   19: ifnonnull -> 43
    //   22: aload_0
    //   23: getfield b : Le/e/l/f/m;
    //   26: aload_1
    //   27: invokevirtual d : (Le/e/l/n/j0;)Le/e/l/n/i;
    //   30: astore_2
    //   31: aload_0
    //   32: getfield z : Ljava/util/Map;
    //   35: aload_1
    //   36: aload_2
    //   37: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   42: pop
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_2
    //   46: areturn
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	47	finally
    //   22	43	47	finally
  }
  
  private j0<a<b>> a(j0<d> paramj0, w0<d>[] paramArrayOfw0) {
    return d(b(g(paramj0), paramArrayOfw0));
  }
  
  private j0<d> a(w0<d>[] paramArrayOfw0) {
    v0 v0 = this.b.a(paramArrayOfw0);
    return (j0<d>)this.b.a((j0<d>)v0, true, this.k);
  }
  
  private static String a(Uri paramUri) {
    String str2 = String.valueOf(paramUri);
    String str1 = str2;
    if (str2.length() > 30) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str2.substring(0, 30));
      stringBuilder.append("...");
      str1 = stringBuilder.toString();
    } 
    return str1;
  }
  
  private j0<d> b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic c : ()Z
    //   5: ifeq -> 13
    //   8: ldc 'ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence'
    //   10: invokestatic a : (Ljava/lang/String;)V
    //   13: aload_0
    //   14: getfield n : Le/e/l/n/j0;
    //   17: ifnonnull -> 59
    //   20: invokestatic c : ()Z
    //   23: ifeq -> 31
    //   26: ldc 'ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init'
    //   28: invokestatic a : (Ljava/lang/String;)V
    //   31: aload_0
    //   32: aload_0
    //   33: getfield b : Le/e/l/f/m;
    //   36: aload_0
    //   37: invokespecial c : ()Le/e/l/n/j0;
    //   40: aload_0
    //   41: getfield g : Le/e/l/n/t0;
    //   44: invokevirtual a : (Le/e/l/n/j0;Le/e/l/n/t0;)Le/e/l/n/s0;
    //   47: putfield n : Le/e/l/n/j0;
    //   50: invokestatic c : ()Z
    //   53: ifeq -> 59
    //   56: invokestatic a : ()V
    //   59: invokestatic c : ()Z
    //   62: ifeq -> 68
    //   65: invokestatic a : ()V
    //   68: aload_0
    //   69: getfield n : Le/e/l/n/j0;
    //   72: astore_1
    //   73: aload_0
    //   74: monitorexit
    //   75: aload_1
    //   76: areturn
    //   77: astore_1
    //   78: aload_0
    //   79: monitorexit
    //   80: aload_1
    //   81: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	77	finally
    //   13	31	77	finally
    //   31	59	77	finally
    //   59	68	77	finally
    //   68	73	77	finally
  }
  
  private j0<a<b>> b(j0<a<b>> paramj0) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield y : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   12: ifne -> 45
    //   15: aload_0
    //   16: getfield b : Le/e/l/f/m;
    //   19: aload_1
    //   20: invokevirtual l : (Le/e/l/n/j0;)Le/e/l/n/i0;
    //   23: astore_2
    //   24: aload_0
    //   25: getfield b : Le/e/l/f/m;
    //   28: aload_2
    //   29: invokevirtual k : (Le/e/l/n/j0;)Le/e/l/n/h0;
    //   32: astore_2
    //   33: aload_0
    //   34: getfield y : Ljava/util/Map;
    //   37: aload_1
    //   38: aload_2
    //   39: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   44: pop
    //   45: aload_0
    //   46: getfield y : Ljava/util/Map;
    //   49: aload_1
    //   50: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   55: checkcast e/e/l/n/j0
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: areturn
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    // Exception table:
    //   from	to	target	type
    //   2	45	63	finally
    //   45	59	63	finally
  }
  
  private j0<d> b(j0<d> paramj0, w0<d>[] paramArrayOfw0) {
    a a = m.o(paramj0);
    o0 o0 = this.b.a((j0<d>)a, true, this.k);
    u0<?> u0 = this.b.m((j0<?>)o0);
    return (j0<d>)m.a(a(paramArrayOfw0), (j0)u0);
  }
  
  private j0<d> c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic c : ()Z
    //   5: ifeq -> 13
    //   8: ldc 'ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence'
    //   10: invokestatic a : (Ljava/lang/String;)V
    //   13: aload_0
    //   14: getfield q : Le/e/l/n/j0;
    //   17: ifnonnull -> 105
    //   20: invokestatic c : ()Z
    //   23: ifeq -> 31
    //   26: ldc 'ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init'
    //   28: invokestatic a : (Ljava/lang/String;)V
    //   31: aload_0
    //   32: aload_0
    //   33: aload_0
    //   34: getfield b : Le/e/l/f/m;
    //   37: aload_0
    //   38: getfield c : Le/e/l/n/f0;
    //   41: invokevirtual a : (Le/e/l/n/f0;)Le/e/l/n/e0;
    //   44: invokespecial g : (Le/e/l/n/j0;)Le/e/l/n/j0;
    //   47: invokestatic o : (Le/e/l/n/j0;)Le/e/l/n/a;
    //   50: putfield q : Le/e/l/n/j0;
    //   53: aload_0
    //   54: getfield b : Le/e/l/f/m;
    //   57: astore_2
    //   58: aload_0
    //   59: getfield q : Le/e/l/n/j0;
    //   62: astore_3
    //   63: aload_0
    //   64: getfield d : Z
    //   67: ifeq -> 128
    //   70: aload_0
    //   71: getfield h : Z
    //   74: ifne -> 128
    //   77: iconst_1
    //   78: istore_1
    //   79: goto -> 82
    //   82: aload_0
    //   83: aload_2
    //   84: aload_3
    //   85: iload_1
    //   86: aload_0
    //   87: getfield k : Le/e/l/q/d;
    //   90: invokevirtual a : (Le/e/l/n/j0;ZLe/e/l/q/d;)Le/e/l/n/o0;
    //   93: putfield q : Le/e/l/n/j0;
    //   96: invokestatic c : ()Z
    //   99: ifeq -> 105
    //   102: invokestatic a : ()V
    //   105: invokestatic c : ()Z
    //   108: ifeq -> 114
    //   111: invokestatic a : ()V
    //   114: aload_0
    //   115: getfield q : Le/e/l/n/j0;
    //   118: astore_2
    //   119: aload_0
    //   120: monitorexit
    //   121: aload_2
    //   122: areturn
    //   123: astore_2
    //   124: aload_0
    //   125: monitorexit
    //   126: aload_2
    //   127: athrow
    //   128: iconst_0
    //   129: istore_1
    //   130: goto -> 82
    // Exception table:
    //   from	to	target	type
    //   2	13	123	finally
    //   13	31	123	finally
    //   31	77	123	finally
    //   82	105	123	finally
    //   105	114	123	finally
    //   114	119	123	finally
  }
  
  private j0<a<b>> c(j0<a<b>> paramj0) {
    h h = this.b.c(paramj0);
    g g = this.b.b((j0<a<b>>)h);
    s0<?> s0 = this.b.a((j0<?>)g, this.g);
    return (j0<a<b>>)this.b.a((j0)s0);
  }
  
  private j0<a<b>> c(c paramc) {
    try {
      if (b.c())
        b.a("ProducerSequenceFactory#getBasicDecodedImageSequence"); 
      i.a(paramc);
      Uri uri = paramc.p();
      i.a(uri, "Uri is null.");
      int i = paramc.q();
      if (i != 0) {
        j0<a<b>> j01;
        switch (i) {
          case 8:
            j01 = m();
            return j01;
          case 7:
            j01 = d();
            return j01;
          case 6:
            j01 = i();
            return j01;
          case 5:
            j01 = e();
            return j01;
          case 4:
            if (a.c(this.a.getType(uri))) {
              j01 = j();
              return j01;
            } 
            j01 = f();
            return j01;
          case 3:
            j01 = h();
            return j01;
          case 2:
            j01 = j();
            return j01;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported uri scheme! Uri is: ");
        stringBuilder.append(a(uri));
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      return k();
    } finally {
      if (b.c())
        b.a(); 
    } 
  }
  
  private j0<a<b>> d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield w : Le/e/l/n/j0;
    //   6: ifnonnull -> 75
    //   9: aload_0
    //   10: getfield b : Le/e/l/f/m;
    //   13: invokevirtual a : ()Le/e/l/n/l;
    //   16: astore_2
    //   17: aload_2
    //   18: astore_1
    //   19: getstatic e/e/e/l/c.a : Z
    //   22: ifeq -> 49
    //   25: aload_0
    //   26: getfield e : Z
    //   29: ifeq -> 40
    //   32: aload_2
    //   33: astore_1
    //   34: getstatic e/e/e/l/c.b : Le/e/e/l/b;
    //   37: ifnonnull -> 49
    //   40: aload_0
    //   41: getfield b : Le/e/l/f/m;
    //   44: aload_2
    //   45: invokevirtual n : (Le/e/l/n/j0;)Le/e/l/n/y0;
    //   48: astore_1
    //   49: aload_1
    //   50: invokestatic o : (Le/e/l/n/j0;)Le/e/l/n/a;
    //   53: astore_1
    //   54: aload_0
    //   55: aload_0
    //   56: aload_0
    //   57: getfield b : Le/e/l/f/m;
    //   60: aload_1
    //   61: iconst_1
    //   62: aload_0
    //   63: getfield k : Le/e/l/q/d;
    //   66: invokevirtual a : (Le/e/l/n/j0;ZLe/e/l/q/d;)Le/e/l/n/o0;
    //   69: invokespecial d : (Le/e/l/n/j0;)Le/e/l/n/j0;
    //   72: putfield w : Le/e/l/n/j0;
    //   75: aload_0
    //   76: getfield w : Le/e/l/n/j0;
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: areturn
    //   84: astore_1
    //   85: aload_0
    //   86: monitorexit
    //   87: aload_1
    //   88: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	84	finally
    //   19	32	84	finally
    //   34	40	84	finally
    //   40	49	84	finally
    //   49	75	84	finally
    //   75	80	84	finally
  }
  
  private j0<a<b>> d(j0<d> paramj0) {
    if (b.c())
      b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence"); 
    paramj0 = (j0)c((j0<a<b>>)this.b.e(paramj0));
    if (b.c())
      b.a(); 
    return (j0)paramj0;
  }
  
  private static void d(c paramc) {
    boolean bool;
    i.a(paramc);
    if (paramc.e().a() <= c.b.e.a()) {
      bool = true;
    } else {
      bool = false;
    } 
    i.a(bool);
  }
  
  private j0<a<b>> e() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield v : Le/e/l/n/j0;
    //   6: ifnonnull -> 24
    //   9: aload_0
    //   10: aload_0
    //   11: aload_0
    //   12: getfield b : Le/e/l/f/m;
    //   15: invokevirtual b : ()Le/e/l/n/v;
    //   18: invokespecial e : (Le/e/l/n/j0;)Le/e/l/n/j0;
    //   21: putfield v : Le/e/l/n/j0;
    //   24: aload_0
    //   25: getfield v : Le/e/l/n/j0;
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: areturn
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	33	finally
    //   24	29	33	finally
  }
  
  private j0<a<b>> e(j0<d> paramj0) {
    return a(paramj0, (w0<d>[])new w0[] { (w0)this.b.e() });
  }
  
  private j0<a<b>> f() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield t : Le/e/l/n/j0;
    //   6: ifnonnull -> 48
    //   9: aload_0
    //   10: aload_0
    //   11: aload_0
    //   12: getfield b : Le/e/l/f/m;
    //   15: invokevirtual c : ()Le/e/l/n/w;
    //   18: iconst_2
    //   19: anewarray e/e/l/n/w0
    //   22: dup
    //   23: iconst_0
    //   24: aload_0
    //   25: getfield b : Le/e/l/f/m;
    //   28: invokevirtual d : ()Le/e/l/n/x;
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: aload_0
    //   35: getfield b : Le/e/l/f/m;
    //   38: invokevirtual e : ()Le/e/l/n/y;
    //   41: aastore
    //   42: invokespecial a : (Le/e/l/n/j0;[Le/e/l/n/w0;)Le/e/l/n/j0;
    //   45: putfield t : Le/e/l/n/j0;
    //   48: aload_0
    //   49: getfield t : Le/e/l/n/j0;
    //   52: astore_1
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_1
    //   56: areturn
    //   57: astore_1
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    // Exception table:
    //   from	to	target	type
    //   2	48	57	finally
    //   48	53	57	finally
  }
  
  private j0<d> f(j0<d> paramj0) {
    g0 g0;
    if (b.c())
      b.a("ProducerSequenceFactory#newDiskCacheSequence"); 
    j0<d> j01 = paramj0;
    if (this.f)
      g0 = this.b.j(paramj0); 
    p p = this.b.g((j0<d>)g0);
    o o = this.b.f((j0<d>)p);
    if (b.c())
      b.a(); 
    return (j0<d>)o;
  }
  
  private j0<Void> g() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic c : ()Z
    //   5: ifeq -> 14
    //   8: ldc_w 'ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence'
    //   11: invokestatic a : (Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield o : Le/e/l/n/j0;
    //   18: ifnonnull -> 53
    //   21: invokestatic c : ()Z
    //   24: ifeq -> 33
    //   27: ldc_w 'ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init'
    //   30: invokestatic a : (Ljava/lang/String;)V
    //   33: aload_0
    //   34: aload_0
    //   35: invokespecial a : ()Le/e/l/n/j0;
    //   38: invokestatic p : (Le/e/l/n/j0;)Le/e/l/n/r0;
    //   41: putfield o : Le/e/l/n/j0;
    //   44: invokestatic c : ()Z
    //   47: ifeq -> 53
    //   50: invokestatic a : ()V
    //   53: invokestatic c : ()Z
    //   56: ifeq -> 62
    //   59: invokestatic a : ()V
    //   62: aload_0
    //   63: getfield o : Le/e/l/n/j0;
    //   66: astore_1
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_1
    //   70: areturn
    //   71: astore_1
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_1
    //   75: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	71	finally
    //   14	33	71	finally
    //   33	53	71	finally
    //   53	62	71	finally
    //   62	67	71	finally
  }
  
  private j0<d> g(j0<d> paramj0) {
    // Byte code:
    //   0: aload_1
    //   1: astore_2
    //   2: getstatic e/e/e/l/c.a : Z
    //   5: ifeq -> 32
    //   8: aload_0
    //   9: getfield e : Z
    //   12: ifeq -> 23
    //   15: aload_1
    //   16: astore_2
    //   17: getstatic e/e/e/l/c.b : Le/e/e/l/b;
    //   20: ifnonnull -> 32
    //   23: aload_0
    //   24: getfield b : Le/e/l/f/m;
    //   27: aload_1
    //   28: invokevirtual n : (Le/e/l/n/j0;)Le/e/l/n/y0;
    //   31: astore_2
    //   32: aload_2
    //   33: astore_1
    //   34: aload_0
    //   35: getfield j : Z
    //   38: ifeq -> 47
    //   41: aload_0
    //   42: aload_2
    //   43: invokespecial f : (Le/e/l/n/j0;)Le/e/l/n/j0;
    //   46: astore_1
    //   47: aload_0
    //   48: getfield b : Le/e/l/f/m;
    //   51: aload_1
    //   52: invokevirtual i : (Le/e/l/n/j0;)Le/e/l/n/r;
    //   55: astore_1
    //   56: aload_0
    //   57: getfield b : Le/e/l/f/m;
    //   60: aload_1
    //   61: invokevirtual h : (Le/e/l/n/j0;)Le/e/l/n/q;
    //   64: areturn
  }
  
  private j0<a<b>> h() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield r : Le/e/l/n/j0;
    //   6: ifnonnull -> 24
    //   9: aload_0
    //   10: aload_0
    //   11: aload_0
    //   12: getfield b : Le/e/l/f/m;
    //   15: invokevirtual f : ()Le/e/l/n/a0;
    //   18: invokespecial e : (Le/e/l/n/j0;)Le/e/l/n/j0;
    //   21: putfield r : Le/e/l/n/j0;
    //   24: aload_0
    //   25: getfield r : Le/e/l/n/j0;
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: areturn
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	33	finally
    //   24	29	33	finally
  }
  
  private j0<a<b>> i() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield u : Le/e/l/n/j0;
    //   6: ifnonnull -> 24
    //   9: aload_0
    //   10: aload_0
    //   11: aload_0
    //   12: getfield b : Le/e/l/f/m;
    //   15: invokevirtual g : ()Le/e/l/n/b0;
    //   18: invokespecial e : (Le/e/l/n/j0;)Le/e/l/n/j0;
    //   21: putfield u : Le/e/l/n/j0;
    //   24: aload_0
    //   25: getfield u : Le/e/l/n/j0;
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: areturn
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	33	finally
    //   24	29	33	finally
  }
  
  private j0<a<b>> j() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield s : Le/e/l/n/j0;
    //   6: ifnonnull -> 24
    //   9: aload_0
    //   10: aload_0
    //   11: aload_0
    //   12: getfield b : Le/e/l/f/m;
    //   15: invokevirtual h : ()Le/e/l/n/c0;
    //   18: invokespecial c : (Le/e/l/n/j0;)Le/e/l/n/j0;
    //   21: putfield s : Le/e/l/n/j0;
    //   24: aload_0
    //   25: getfield s : Le/e/l/n/j0;
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: areturn
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	33	finally
    //   24	29	33	finally
  }
  
  private j0<a<b>> k() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic c : ()Z
    //   5: ifeq -> 14
    //   8: ldc_w 'ProducerSequenceFactory#getNetworkFetchSequence'
    //   11: invokestatic a : (Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield l : Le/e/l/n/j0;
    //   18: ifnonnull -> 54
    //   21: invokestatic c : ()Z
    //   24: ifeq -> 33
    //   27: ldc_w 'ProducerSequenceFactory#getNetworkFetchSequence:init'
    //   30: invokestatic a : (Ljava/lang/String;)V
    //   33: aload_0
    //   34: aload_0
    //   35: aload_0
    //   36: invokespecial c : ()Le/e/l/n/j0;
    //   39: invokespecial d : (Le/e/l/n/j0;)Le/e/l/n/j0;
    //   42: putfield l : Le/e/l/n/j0;
    //   45: invokestatic c : ()Z
    //   48: ifeq -> 54
    //   51: invokestatic a : ()V
    //   54: invokestatic c : ()Z
    //   57: ifeq -> 63
    //   60: invokestatic a : ()V
    //   63: aload_0
    //   64: getfield l : Le/e/l/n/j0;
    //   67: astore_1
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_1
    //   71: areturn
    //   72: astore_1
    //   73: aload_0
    //   74: monitorexit
    //   75: aload_1
    //   76: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	72	finally
    //   14	33	72	finally
    //   33	54	72	finally
    //   54	63	72	finally
    //   63	68	72	finally
  }
  
  private j0<Void> l() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic c : ()Z
    //   5: ifeq -> 14
    //   8: ldc_w 'ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence'
    //   11: invokestatic a : (Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield p : Le/e/l/n/j0;
    //   18: ifnonnull -> 53
    //   21: invokestatic c : ()Z
    //   24: ifeq -> 33
    //   27: ldc_w 'ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence:init'
    //   30: invokestatic a : (Ljava/lang/String;)V
    //   33: aload_0
    //   34: aload_0
    //   35: invokespecial b : ()Le/e/l/n/j0;
    //   38: invokestatic p : (Le/e/l/n/j0;)Le/e/l/n/r0;
    //   41: putfield p : Le/e/l/n/j0;
    //   44: invokestatic c : ()Z
    //   47: ifeq -> 53
    //   50: invokestatic a : ()V
    //   53: invokestatic c : ()Z
    //   56: ifeq -> 62
    //   59: invokestatic a : ()V
    //   62: aload_0
    //   63: getfield p : Le/e/l/n/j0;
    //   66: astore_1
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_1
    //   70: areturn
    //   71: astore_1
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_1
    //   75: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	71	finally
    //   14	33	71	finally
    //   33	53	71	finally
    //   53	62	71	finally
    //   62	67	71	finally
  }
  
  private j0<a<b>> m() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield x : Le/e/l/n/j0;
    //   6: ifnonnull -> 24
    //   9: aload_0
    //   10: aload_0
    //   11: aload_0
    //   12: getfield b : Le/e/l/f/m;
    //   15: invokevirtual i : ()Le/e/l/n/n0;
    //   18: invokespecial e : (Le/e/l/n/j0;)Le/e/l/n/j0;
    //   21: putfield x : Le/e/l/n/j0;
    //   24: aload_0
    //   25: getfield x : Le/e/l/n/j0;
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: areturn
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	33	finally
    //   24	29	33	finally
  }
  
  public j0<a<b>> a(c paramc) {
    if (b.c())
      b.a("ProducerSequenceFactory#getDecodedImageProducerSequence"); 
    j0<a<b>> j03 = c(paramc);
    j0<a<b>> j02 = j03;
    if (paramc.f() != null)
      j02 = b(j03); 
    j0<a<b>> j01 = j02;
    if (this.i)
      j01 = a(j02); 
    if (b.c())
      b.a(); 
    return j01;
  }
  
  public j0<Void> b(c paramc) {
    d(paramc);
    int i = paramc.q();
    if (i != 0) {
      if (i == 2 || i == 3)
        return g(); 
      Uri uri = paramc.p();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unsupported uri scheme for encoded image fetch! Uri is: ");
      stringBuilder.append(a(uri));
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return l();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/f/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */