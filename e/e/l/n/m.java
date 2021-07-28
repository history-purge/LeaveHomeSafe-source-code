package e.e.l.n;

import android.graphics.Bitmap;
import e.e.e.d.f;
import e.e.e.d.i;
import e.e.e.h.a;
import e.e.e.k.f;
import e.e.l.e.e;
import e.e.l.i.e;
import e.e.l.i.f;
import e.e.l.k.b;
import e.e.l.k.d;
import e.e.l.k.f;
import e.e.l.k.g;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public class m implements j0<a<b>> {
  private final e.e.e.g.a a;
  
  private final Executor b;
  
  private final e.e.l.i.c c;
  
  private final e d;
  
  private final j0<d> e;
  
  private final boolean f;
  
  private final boolean g;
  
  private final boolean h;
  
  private final int i;
  
  private final e.e.l.f.a j;
  
  public m(e.e.e.g.a parama, Executor paramExecutor, e.e.l.i.c paramc, e parame, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, j0<d> paramj0, int paramInt, e.e.l.f.a parama1) {
    i.a(parama);
    this.a = parama;
    i.a(paramExecutor);
    this.b = paramExecutor;
    i.a(paramc);
    this.c = paramc;
    i.a(parame);
    this.d = parame;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
    i.a(paramj0);
    this.e = paramj0;
    this.h = paramBoolean3;
    this.i = paramInt;
    this.j = parama1;
  }
  
  public void a(k<a<b>> paramk, k0 paramk0) {
    try {
      if (e.e.l.p.b.c())
        e.e.l.p.b.a("DecodeProducer#produceResults"); 
      if (!f.i(paramk0.f().p())) {
        paramk = new a(this, paramk, paramk0, this.h, this.i);
      } else {
        paramk = new b(this, paramk, paramk0, new f(this.a), this.d, this.h, this.i);
      } 
      this.e.a(paramk, paramk0);
      return;
    } finally {
      if (e.e.l.p.b.c())
        e.e.l.p.b.a(); 
    } 
  }
  
  private class a extends c {
    public a(m this$0, k<a<b>> param1k, k0 param1k0, boolean param1Boolean, int param1Int) {
      super(this$0, param1k, param1k0, param1Boolean, param1Int);
    }
    
    protected int a(d param1d) {
      return param1d.y();
    }
    
    protected boolean b(d param1d, int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: iload_2
      //   3: invokestatic b : (I)Z
      //   6: istore_3
      //   7: iload_3
      //   8: ifeq -> 15
      //   11: aload_0
      //   12: monitorexit
      //   13: iconst_0
      //   14: ireturn
      //   15: aload_0
      //   16: aload_1
      //   17: iload_2
      //   18: invokespecial b : (Le/e/l/k/d;I)Z
      //   21: istore_3
      //   22: aload_0
      //   23: monitorexit
      //   24: iload_3
      //   25: ireturn
      //   26: astore_1
      //   27: aload_0
      //   28: monitorexit
      //   29: aload_1
      //   30: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	26	finally
      //   15	22	26	finally
    }
    
    protected g d() {
      return f.a(0, false, false);
    }
  }
  
  private class b extends c {
    private final f i;
    
    private final e j;
    
    private int k;
    
    public b(m this$0, k<a<b>> param1k, k0 param1k0, f param1f, e param1e, boolean param1Boolean, int param1Int) {
      super(this$0, param1k, param1k0, param1Boolean, param1Int);
      i.a(param1f);
      this.i = param1f;
      i.a(param1e);
      this.j = param1e;
      this.k = 0;
    }
    
    protected int a(d param1d) {
      return this.i.a();
    }
    
    protected boolean b(d param1d, int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: aload_1
      //   4: iload_2
      //   5: invokespecial b : (Le/e/l/k/d;I)Z
      //   8: istore #4
      //   10: iload_2
      //   11: invokestatic b : (I)Z
      //   14: ifne -> 26
      //   17: iload_2
      //   18: bipush #8
      //   20: invokestatic b : (II)Z
      //   23: ifeq -> 132
      //   26: iload_2
      //   27: iconst_4
      //   28: invokestatic b : (II)Z
      //   31: ifne -> 132
      //   34: aload_1
      //   35: invokestatic e : (Le/e/l/k/d;)Z
      //   38: ifeq -> 132
      //   41: aload_1
      //   42: invokevirtual t : ()Le/e/k/c;
      //   45: getstatic e/e/k/b.a : Le/e/k/c;
      //   48: if_acmpne -> 132
      //   51: aload_0
      //   52: getfield i : Le/e/l/i/f;
      //   55: aload_1
      //   56: invokevirtual a : (Le/e/l/k/d;)Z
      //   59: istore #5
      //   61: iload #5
      //   63: ifne -> 70
      //   66: aload_0
      //   67: monitorexit
      //   68: iconst_0
      //   69: ireturn
      //   70: aload_0
      //   71: getfield i : Le/e/l/i/f;
      //   74: invokevirtual b : ()I
      //   77: istore_2
      //   78: aload_0
      //   79: getfield k : I
      //   82: istore_3
      //   83: iload_2
      //   84: iload_3
      //   85: if_icmpgt -> 92
      //   88: aload_0
      //   89: monitorexit
      //   90: iconst_0
      //   91: ireturn
      //   92: iload_2
      //   93: aload_0
      //   94: getfield j : Le/e/l/i/e;
      //   97: aload_0
      //   98: getfield k : I
      //   101: invokeinterface a : (I)I
      //   106: if_icmpge -> 127
      //   109: aload_0
      //   110: getfield i : Le/e/l/i/f;
      //   113: invokevirtual c : ()Z
      //   116: istore #5
      //   118: iload #5
      //   120: ifne -> 127
      //   123: aload_0
      //   124: monitorexit
      //   125: iconst_0
      //   126: ireturn
      //   127: aload_0
      //   128: iload_2
      //   129: putfield k : I
      //   132: aload_0
      //   133: monitorexit
      //   134: iload #4
      //   136: ireturn
      //   137: astore_1
      //   138: aload_0
      //   139: monitorexit
      //   140: aload_1
      //   141: athrow
      // Exception table:
      //   from	to	target	type
      //   2	26	137	finally
      //   26	61	137	finally
      //   70	83	137	finally
      //   92	118	137	finally
      //   127	132	137	finally
    }
    
    protected g d() {
      return this.j.b(this.i.b());
    }
  }
  
  private abstract class c extends n<d, a<b>> {
    private final k0 c;
    
    private final m0 d;
    
    private final e.e.l.e.b e;
    
    private boolean f;
    
    private final u g;
    
    public c(m this$0, k<a<b>> param1k, k0 param1k0, boolean param1Boolean, int param1Int) {
      super(param1k);
      this.c = param1k0;
      this.d = param1k0.e();
      this.e = param1k0.f().c();
      this.f = false;
      a a = new a(this, this$0, param1k0, param1Int);
      this.g = new u(m.c(this$0), a, this.e.a);
      this.c.a(new b(this, this$0, param1Boolean));
    }
    
    private Map<String, String> a(b param1b, long param1Long, g param1g, boolean param1Boolean, String param1String1, String param1String2, String param1String3, String param1String4) {
      if (!this.d.a(this.c.a()))
        return null; 
      String str2 = String.valueOf(param1Long);
      String str1 = String.valueOf(param1g.b());
      String str3 = String.valueOf(param1Boolean);
      if (param1b instanceof e.e.l.k.c) {
        Bitmap bitmap = ((e.e.l.k.c)param1b).r();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bitmap.getWidth());
        stringBuilder.append("x");
        stringBuilder.append(bitmap.getHeight());
        String str = stringBuilder.toString();
        HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>(8);
        hashMap1.put("bitmapSize", str);
        hashMap1.put("queueTime", str2);
        hashMap1.put("hasGoodQuality", str1);
        hashMap1.put("isFinal", str3);
        hashMap1.put("encodedImageSize", param1String2);
        hashMap1.put("imageFormat", param1String1);
        hashMap1.put("requestedImageSize", param1String3);
        hashMap1.put("sampleSize", param1String4);
        return (Map<String, String>)f.a(hashMap1);
      } 
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>(7);
      hashMap.put("queueTime", str2);
      hashMap.put("hasGoodQuality", str1);
      hashMap.put("isFinal", str3);
      hashMap.put("encodedImageSize", param1String2);
      hashMap.put("imageFormat", param1String1);
      hashMap.put("requestedImageSize", param1String3);
      hashMap.put("sampleSize", param1String4);
      return (Map<String, String>)f.a(hashMap);
    }
    
    private void a(b param1b, int param1Int) {
      a a = m.e(this.h).a((Closeable)param1b);
      try {
        b(b.a(param1Int));
        c().a((O)a, param1Int);
        return;
      } finally {
        a.b(a);
      } 
    }
    
    private void b(boolean param1Boolean) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: iload_1
      //   3: ifeq -> 41
      //   6: aload_0
      //   7: getfield f : Z
      //   10: ifeq -> 16
      //   13: goto -> 41
      //   16: aload_0
      //   17: invokevirtual c : ()Le/e/l/n/k;
      //   20: fconst_1
      //   21: invokeinterface a : (F)V
      //   26: aload_0
      //   27: iconst_1
      //   28: putfield f : Z
      //   31: aload_0
      //   32: monitorexit
      //   33: aload_0
      //   34: getfield g : Le/e/l/n/u;
      //   37: invokevirtual a : ()V
      //   40: return
      //   41: aload_0
      //   42: monitorexit
      //   43: return
      //   44: astore_2
      //   45: aload_0
      //   46: monitorexit
      //   47: aload_2
      //   48: athrow
      // Exception table:
      //   from	to	target	type
      //   6	13	44	finally
      //   16	33	44	finally
      //   41	43	44	finally
      //   45	47	44	finally
    }
    
    private void c(d param1d, int param1Int) {
      int j;
      boolean bool1;
      boolean bool2;
      long l;
      String str1;
      g g;
      b b1;
      String str2;
      String str3;
      int i = param1Int;
      if (param1d.t() != e.e.k.b.a && b.b(param1Int))
        return; 
      if (!f()) {
        if (!d.e(param1d))
          return; 
        null = param1d.t();
        str1 = "unknown";
        if (null != null) {
          String str = null.a();
        } else {
          String str = "unknown";
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1d.z());
        stringBuilder.append("x");
        stringBuilder.append(param1d.r());
        str2 = stringBuilder.toString();
        str3 = String.valueOf(param1d.x());
        bool1 = b.a(param1Int);
        if (bool1 && !b.b(i, 8)) {
          param1Int = 1;
        } else {
          param1Int = 0;
        } 
        bool2 = b.b(i, 4);
        e e = this.c.f().l();
        if (e != null) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append(e.a);
          stringBuilder1.append("x");
          stringBuilder1.append(e.b);
          str1 = stringBuilder1.toString();
        } 
        try {
          l = this.g.b();
          String str = String.valueOf(this.c.f().p());
        } finally {
          d.c(param1d);
        } 
      } else {
        return;
      } 
      if (param1Int != 0 || bool2) {
        g = f.d;
      } else {
        g = d();
      } 
      this.d.a(this.c.a(), "DecodeProducer");
      try {
        b1 = m.d(this.h).a(param1d, j, g, this.e);
        try {
          j = param1d.x();
          param1Int = i;
          if (j != 1)
            param1Int = i | 0x10; 
          map = a(b1, l, g, bool1, (String)SYNTHETIC_LOCAL_VARIABLE_9, str2, str1, str3);
          this.d.a(this.c.a(), "DecodeProducer", map);
          a(b1, param1Int);
          d.c(param1d);
          return;
        } catch (Exception null) {}
      } catch (e.e.l.i.a null) {
        d d1 = b1.a();
        e.e.e.e.a.c("ProgressiveDecoder", "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", new Object[] { b1.getMessage(), exception, d1.b(10), Integer.valueOf(d1.y()) });
        throw b1;
      } catch (Exception exception) {
        b1 = null;
      } 
      Map<String, String> map = a(b1, l, g, bool1, (String)map, str2, str1, str3);
      this.d.a(this.c.a(), "DecodeProducer", exception, map);
      c(exception);
      d.c(param1d);
    }
    
    private void c(Throwable param1Throwable) {
      b(true);
      c().a(param1Throwable);
    }
    
    private void e() {
      b(true);
      c().a();
    }
    
    private boolean f() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield f : Z
      //   6: istore_1
      //   7: aload_0
      //   8: monitorexit
      //   9: iload_1
      //   10: ireturn
      //   11: astore_2
      //   12: aload_0
      //   13: monitorexit
      //   14: aload_2
      //   15: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	11	finally
    }
    
    protected abstract int a(d param1d);
    
    public void a(d param1d, int param1Int) {
      try {
        if (e.e.l.p.b.c())
          e.e.l.p.b.a("DecodeProducer#onNewResultImpl"); 
        boolean bool1 = b.a(param1Int);
        if (bool1 && !d.e(param1d)) {
          c((Throwable)new e.e.e.k.a("Encoded image is not valid."));
          return;
        } 
        boolean bool2 = b(param1d, param1Int);
        if (!bool2)
          return; 
        bool2 = b.b(param1Int, 4);
        if (bool1 || bool2 || this.c.g())
          this.g.c(); 
        return;
      } finally {
        if (e.e.l.p.b.c())
          e.e.l.p.b.a(); 
      } 
    }
    
    public void b() {
      e();
    }
    
    protected void b(float param1Float) {
      super.b(param1Float * 0.99F);
    }
    
    public void b(Throwable param1Throwable) {
      c(param1Throwable);
    }
    
    protected boolean b(d param1d, int param1Int) {
      return this.g.a(param1d, param1Int);
    }
    
    protected abstract g d();
    
    class a implements u.d {
      a(m.c this$0, m param2m, k0 param2k0, int param2Int) {}
      
      public void a(d param2d, int param2Int) {
        if (param2d != null) {
          if (m.a(this.c.h) || !b.b(param2Int, 16)) {
            e.e.l.o.c c1 = this.a.f();
            if (m.b(this.c.h) || !f.i(c1.p()))
              param2d.g(e.e.l.q.a.a(c1.n(), c1.l(), param2d, this.b)); 
          } 
          m.c.a(this.c, param2d, param2Int);
        } 
      }
    }
    
    class b extends e {
      b(m.c this$0, m param2m, boolean param2Boolean) {}
      
      public void a() {
        if (this.a)
          m.c.c(this.b); 
      }
      
      public void b() {
        if (m.c.a(this.b).g())
          m.c.b(this.b).c(); 
      }
    }
  }
  
  class a implements u.d {
    a(m this$0, m param1m, k0 param1k0, int param1Int) {}
    
    public void a(d param1d, int param1Int) {
      if (param1d != null) {
        if (m.a(this.c.h) || !b.b(param1Int, 16)) {
          e.e.l.o.c c1 = this.a.f();
          if (m.b(this.c.h) || !f.i(c1.p()))
            param1d.g(e.e.l.q.a.a(c1.n(), c1.l(), param1d, this.b)); 
        } 
        m.c.a(this.c, param1d, param1Int);
      } 
    }
  }
  
  class b extends e {
    b(m this$0, m param1m, boolean param1Boolean) {}
    
    public void a() {
      if (this.a)
        m.c.c(this.b); 
    }
    
    public void b() {
      if (m.c.a(this.b).g())
        m.c.b(this.b).c(); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */