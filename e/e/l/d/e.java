package e.e.l.d;

import c.f;
import e.e.c.a.j;
import e.e.c.b.i;
import e.e.e.d.i;
import e.e.e.g.g;
import e.e.e.g.h;
import e.e.e.g.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class e {
  private static final Class<?> h = e.class;
  
  private final i a;
  
  private final h b;
  
  private final k c;
  
  private final Executor d;
  
  private final Executor e;
  
  private final u f;
  
  private final n g;
  
  public e(i parami, h paramh, k paramk, Executor paramExecutor1, Executor paramExecutor2, n paramn) {
    this.a = parami;
    this.b = paramh;
    this.c = paramk;
    this.d = paramExecutor1;
    this.e = paramExecutor2;
    this.g = paramn;
    this.f = u.b();
  }
  
  private f<e.e.l.k.d> b(e.e.c.a.d paramd, e.e.l.k.d paramd1) {
    e.e.e.e.a.b(h, "Found image for %s in staging area", paramd.a());
    this.g.d(paramd);
    return f.b(paramd1);
  }
  
  private f<e.e.l.k.d> b(e.e.c.a.d paramd, AtomicBoolean paramAtomicBoolean) {
    try {
      return f.a(new a(this, paramAtomicBoolean, paramd), this.d);
    } catch (Exception exception) {
      e.e.e.e.a.b(h, exception, "Failed to schedule disk-cache read for %s", new Object[] { paramd.a() });
      return f.b(exception);
    } 
  }
  
  private void c(e.e.c.a.d paramd, e.e.l.k.d paramd1) {
    e.e.e.e.a.b(h, "About to write to disk-cache for key %s", paramd.a());
    try {
      this.a.a(paramd, new e(this, paramd1));
      e.e.e.e.a.b(h, "Successful disk-cache write for key %s", paramd.a());
      return;
    } catch (IOException iOException) {
      e.e.e.e.a.b(h, iOException, "Failed to write to disk-cache for key %s", new Object[] { paramd.a() });
      return;
    } 
  }
  
  private boolean d(e.e.c.a.d paramd) {
    e.e.l.k.d d1 = this.f.b(paramd);
    if (d1 != null) {
      d1.close();
      e.e.e.e.a.b(h, "Found image for %s in staging area", paramd.a());
      this.g.d(paramd);
      return true;
    } 
    e.e.e.e.a.b(h, "Did not find image for %s in staging area", paramd.a());
    this.g.a();
    try {
      return this.a.b(paramd);
    } catch (Exception exception) {
      return false;
    } 
  }
  
  private g e(e.e.c.a.d paramd) {
    try {
      e.e.e.e.a.b(h, "Disk cache read for %s", paramd.a());
      null = this.a.c(paramd);
      if (null == null) {
        e.e.e.e.a.b(h, "Disk cache miss for %s", paramd.a());
        this.g.f();
        return null;
      } 
      e.e.e.e.a.b(h, "Found entry in disk cache for %s", paramd.a());
      this.g.b(paramd);
      InputStream inputStream = null.a();
      try {
        g g = this.b.a(inputStream, (int)null.size());
        inputStream.close();
        return g;
      } finally {
        inputStream.close();
      } 
    } catch (IOException iOException) {
      e.e.e.e.a.b(h, iOException, "Exception reading from cache for %s", new Object[] { paramd.a() });
      this.g.e();
      throw iOException;
    } 
  }
  
  public f<Void> a() {
    this.f.a();
    try {
      return f.a(new d(this), this.e);
    } catch (Exception exception) {
      e.e.e.e.a.b(h, exception, "Failed to schedule disk-cache clear", new Object[0]);
      return f.b(exception);
    } 
  }
  
  public f<e.e.l.k.d> a(e.e.c.a.d paramd, AtomicBoolean paramAtomicBoolean) {
    try {
      if (e.e.l.p.b.c())
        e.e.l.p.b.a("BufferedDiskCache#get"); 
      e.e.l.k.d d1 = this.f.b(paramd);
      if (d1 != null) {
        f = b(paramd, d1);
        return f;
      } 
      f<e.e.l.k.d> f = b((e.e.c.a.d)f, paramAtomicBoolean);
      return f;
    } finally {
      if (e.e.l.p.b.c())
        e.e.l.p.b.a(); 
    } 
  }
  
  public void a(e.e.c.a.d paramd, e.e.l.k.d paramd1) {
    try {
      if (e.e.l.p.b.c())
        e.e.l.p.b.a("BufferedDiskCache#put"); 
      i.a(paramd);
      i.a(e.e.l.k.d.e(paramd1));
      this.f.a(paramd, paramd1);
      e.e.l.k.d d1 = e.e.l.k.d.b(paramd1);
      try {
        this.e.execute(new b(this, paramd, d1));
      } catch (Exception exception) {
        e.e.e.e.a.b(h, exception, "Failed to schedule disk-cache write for %s", new Object[] { paramd.a() });
        this.f.b(paramd, paramd1);
        e.e.l.k.d.c(d1);
      } 
      return;
    } finally {
      if (e.e.l.p.b.c())
        e.e.l.p.b.a(); 
    } 
  }
  
  public boolean a(e.e.c.a.d paramd) {
    return (this.f.a(paramd) || this.a.d(paramd));
  }
  
  public boolean b(e.e.c.a.d paramd) {
    return a(paramd) ? true : d(paramd);
  }
  
  public f<Void> c(e.e.c.a.d paramd) {
    i.a(paramd);
    this.f.c(paramd);
    try {
      return f.a(new c(this, paramd), this.e);
    } catch (Exception exception) {
      e.e.e.e.a.b(h, exception, "Failed to schedule disk-cache remove for %s", new Object[] { paramd.a() });
      return f.b(exception);
    } 
  }
  
  class a implements Callable<e.e.l.k.d> {
    a(e this$0, AtomicBoolean param1AtomicBoolean, e.e.c.a.d param1d) {}
    
    public e.e.l.k.d call() {
      // Byte code:
      //   0: invokestatic c : ()Z
      //   3: ifeq -> 11
      //   6: ldc 'BufferedDiskCache#getAsync'
      //   8: invokestatic a : (Ljava/lang/String;)V
      //   11: aload_0
      //   12: getfield a : Ljava/util/concurrent/atomic/AtomicBoolean;
      //   15: invokevirtual get : ()Z
      //   18: ifne -> 209
      //   21: aload_0
      //   22: getfield c : Le/e/l/d/e;
      //   25: invokestatic a : (Le/e/l/d/e;)Le/e/l/d/u;
      //   28: aload_0
      //   29: getfield b : Le/e/c/a/d;
      //   32: invokevirtual b : (Le/e/c/a/d;)Le/e/l/k/d;
      //   35: astore_1
      //   36: aload_1
      //   37: ifnull -> 76
      //   40: invokestatic b : ()Ljava/lang/Class;
      //   43: ldc 'Found image for %s in staging area'
      //   45: aload_0
      //   46: getfield b : Le/e/c/a/d;
      //   49: invokeinterface a : ()Ljava/lang/String;
      //   54: invokestatic b : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
      //   57: aload_0
      //   58: getfield c : Le/e/l/d/e;
      //   61: invokestatic b : (Le/e/l/d/e;)Le/e/l/d/n;
      //   64: aload_0
      //   65: getfield b : Le/e/c/a/d;
      //   68: invokeinterface d : (Le/e/c/a/d;)V
      //   73: goto -> 150
      //   76: invokestatic b : ()Ljava/lang/Class;
      //   79: ldc 'Did not find image for %s in staging area'
      //   81: aload_0
      //   82: getfield b : Le/e/c/a/d;
      //   85: invokeinterface a : ()Ljava/lang/String;
      //   90: invokestatic b : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
      //   93: aload_0
      //   94: getfield c : Le/e/l/d/e;
      //   97: invokestatic b : (Le/e/l/d/e;)Le/e/l/d/n;
      //   100: invokeinterface a : ()V
      //   105: aload_0
      //   106: getfield c : Le/e/l/d/e;
      //   109: aload_0
      //   110: getfield b : Le/e/c/a/d;
      //   113: invokestatic a : (Le/e/l/d/e;Le/e/c/a/d;)Le/e/e/g/g;
      //   116: astore_1
      //   117: aload_1
      //   118: ifnonnull -> 132
      //   121: invokestatic c : ()Z
      //   124: ifeq -> 130
      //   127: invokestatic a : ()V
      //   130: aconst_null
      //   131: areturn
      //   132: aload_1
      //   133: invokestatic a : (Ljava/io/Closeable;)Le/e/e/h/a;
      //   136: astore_2
      //   137: new e/e/l/k/d
      //   140: dup
      //   141: aload_2
      //   142: invokespecial <init> : (Le/e/e/h/a;)V
      //   145: astore_1
      //   146: aload_2
      //   147: invokestatic b : (Le/e/e/h/a;)V
      //   150: invokestatic interrupted : ()Z
      //   153: ifeq -> 180
      //   156: invokestatic b : ()Ljava/lang/Class;
      //   159: ldc 'Host thread was interrupted, decreasing reference count'
      //   161: invokestatic b : (Ljava/lang/Class;Ljava/lang/String;)V
      //   164: aload_1
      //   165: ifnull -> 172
      //   168: aload_1
      //   169: invokevirtual close : ()V
      //   172: new java/lang/InterruptedException
      //   175: dup
      //   176: invokespecial <init> : ()V
      //   179: athrow
      //   180: invokestatic c : ()Z
      //   183: ifeq -> 189
      //   186: invokestatic a : ()V
      //   189: aload_1
      //   190: areturn
      //   191: astore_1
      //   192: aload_2
      //   193: invokestatic b : (Le/e/e/h/a;)V
      //   196: aload_1
      //   197: athrow
      //   198: invokestatic c : ()Z
      //   201: ifeq -> 207
      //   204: invokestatic a : ()V
      //   207: aconst_null
      //   208: areturn
      //   209: new java/util/concurrent/CancellationException
      //   212: dup
      //   213: invokespecial <init> : ()V
      //   216: athrow
      //   217: astore_1
      //   218: invokestatic c : ()Z
      //   221: ifeq -> 227
      //   224: invokestatic a : ()V
      //   227: aload_1
      //   228: athrow
      //   229: astore_1
      //   230: goto -> 198
      // Exception table:
      //   from	to	target	type
      //   0	11	217	finally
      //   11	36	217	finally
      //   40	73	217	finally
      //   76	105	217	finally
      //   105	117	229	java/lang/Exception
      //   105	117	217	finally
      //   132	137	229	java/lang/Exception
      //   132	137	217	finally
      //   137	146	191	finally
      //   146	150	229	java/lang/Exception
      //   146	150	217	finally
      //   150	164	217	finally
      //   168	172	217	finally
      //   172	180	217	finally
      //   192	198	229	java/lang/Exception
      //   192	198	217	finally
      //   209	217	217	finally
    }
  }
  
  class b implements Runnable {
    b(e this$0, e.e.c.a.d param1d, e.e.l.k.d param1d1) {}
    
    public void run() {
      try {
        if (e.e.l.p.b.c())
          e.e.l.p.b.a("BufferedDiskCache#putAsync"); 
        e.a(this.e, this.c, this.d);
        return;
      } finally {
        e.a(this.e).b(this.c, this.d);
        e.e.l.k.d.c(this.d);
        if (e.e.l.p.b.c())
          e.e.l.p.b.a(); 
      } 
    }
  }
  
  class c implements Callable<Void> {
    c(e this$0, e.e.c.a.d param1d) {}
    
    public Void call() {
      try {
        if (e.e.l.p.b.c())
          e.e.l.p.b.a("BufferedDiskCache#remove"); 
        e.a(this.b).c(this.a);
        e.c(this.b).a(this.a);
        return null;
      } finally {
        if (e.e.l.p.b.c())
          e.e.l.p.b.a(); 
      } 
    }
  }
  
  class d implements Callable<Void> {
    d(e this$0) {}
    
    public Void call() {
      e.a(this.a).a();
      e.c(this.a).a();
      return null;
    }
  }
  
  class e implements j {
    e(e this$0, e.e.l.k.d param1d) {}
    
    public void a(OutputStream param1OutputStream) {
      e.d(this.b).a(this.a.u(), param1OutputStream);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */