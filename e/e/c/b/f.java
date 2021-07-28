package e.e.c.b;

import e.e.e.c.c;
import e.e.e.d.l;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class f implements d {
  private static final Class<?> f = f.class;
  
  private final int a;
  
  private final l<File> b;
  
  private final String c;
  
  private final e.e.c.a.a d;
  
  volatile a e;
  
  public f(int paramInt, l<File> paraml, String paramString, e.e.c.a.a parama) {
    this.a = paramInt;
    this.d = parama;
    this.b = paraml;
    this.c = paramString;
    this.e = new a(null, null);
  }
  
  private void g() {
    File file = new File((File)this.b.get(), this.c);
    a(file);
    this.e = new a(file, new a(file, this.a, this.d));
  }
  
  private boolean h() {
    a a1 = this.e;
    if (a1.a != null) {
      File file = a1.b;
      if (file != null && file.exists())
        return false; 
    } 
    return true;
  }
  
  public long a(d.a parama) {
    return f().a(parama);
  }
  
  public long a(String paramString) {
    return f().a(paramString);
  }
  
  public d.b a(String paramString, Object paramObject) {
    return f().a(paramString, paramObject);
  }
  
  public void a() {
    f().a();
  }
  
  void a(File paramFile) {
    try {
      c.a(paramFile);
      e.e.e.e.a.a(f, "Created cache directory %s", paramFile.getAbsolutePath());
      return;
    } catch (e.e.e.c.c.a a1) {
      this.d.a(e.e.c.a.a.a.m, f, "createRootDirectoryIfNecessary", (Throwable)a1);
      throw a1;
    } 
  }
  
  public Collection<d.a> b() {
    return f().b();
  }
  
  public boolean b(String paramString, Object paramObject) {
    return f().b(paramString, paramObject);
  }
  
  public e.e.b.a c(String paramString, Object paramObject) {
    return f().c(paramString, paramObject);
  }
  
  public boolean c() {
    try {
      return f().c();
    } catch (IOException iOException) {
      return false;
    } 
  }
  
  public void d() {
    try {
      f().d();
      return;
    } catch (IOException iOException) {
      e.e.e.e.a.a(f, "purgeUnexpectedResources", iOException);
      return;
    } 
  }
  
  void e() {
    if (this.e.a != null && this.e.b != null)
      e.e.e.c.a.b(this.e.b); 
  }
  
  d f() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial h : ()Z
    //   6: ifeq -> 17
    //   9: aload_0
    //   10: invokevirtual e : ()V
    //   13: aload_0
    //   14: invokespecial g : ()V
    //   17: aload_0
    //   18: getfield e : Le/e/c/b/f$a;
    //   21: getfield a : Le/e/c/b/d;
    //   24: astore_1
    //   25: aload_1
    //   26: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   29: pop
    //   30: aload_1
    //   31: checkcast e/e/c/b/d
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: areturn
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	39	finally
    //   17	35	39	finally
  }
  
  static class a {
    public final d a;
    
    public final File b;
    
    a(File param1File, d param1d) {
      this.a = param1d;
      this.b = param1File;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/c/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */