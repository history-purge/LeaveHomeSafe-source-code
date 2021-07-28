package e.e.c.b;

import android.os.Environment;
import e.e.c.a.j;
import e.e.e.d.i;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class a implements d {
  private static final Class<?> f = a.class;
  
  static final long g = TimeUnit.MINUTES.toMillis(30L);
  
  private final File a;
  
  private final boolean b;
  
  private final File c;
  
  private final e.e.c.a.a d;
  
  private final com.facebook.common.time.a e;
  
  public a(File paramFile, int paramInt, e.e.c.a.a parama) {
    i.a(paramFile);
    this.a = paramFile;
    this.b = a(paramFile, parama);
    this.c = new File(this.a, a(paramInt));
    this.d = parama;
    f();
    this.e = (com.facebook.common.time.a)com.facebook.common.time.c.a();
  }
  
  private long a(File paramFile) {
    if (!paramFile.exists())
      return 0L; 
    long l = paramFile.length();
    return paramFile.delete() ? l : -1L;
  }
  
  static String a(int paramInt) {
    return String.format(null, "%s.ols%d.%d", new Object[] { "v2", Integer.valueOf(100), Integer.valueOf(paramInt) });
  }
  
  private void a(File paramFile, String paramString) {
    try {
      e.e.e.c.c.a(paramFile);
      return;
    } catch (e.e.e.c.c.a a1) {
      this.d.a(e.e.c.a.a.a.m, f, paramString, (Throwable)a1);
      throw a1;
    } 
  }
  
  private static boolean a(File paramFile, e.e.c.a.a parama) {
    try {
      File file = Environment.getExternalStorageDirectory();
      if (file != null) {
        String str = file.toString();
        try {
          String str1 = paramFile.getCanonicalPath();
          try {
            return str1.contains(str);
          } catch (IOException null) {}
        } catch (IOException iOException) {
          file = null;
        } 
        e.e.c.a.a.a a1 = e.e.c.a.a.a.s;
        Class<?> clazz = f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("failed to read folder to check if external: ");
        stringBuilder.append((String)file);
        parama.a(a1, clazz, stringBuilder.toString(), iOException);
        return false;
      } 
    } catch (Exception exception) {
      parama.a(e.e.c.a.a.a.s, f, "failed to get the external storage directory!", exception);
    } 
    return false;
  }
  
  private boolean a(String paramString, boolean paramBoolean) {
    File file = b(paramString);
    boolean bool = file.exists();
    if (paramBoolean && bool)
      file.setLastModified(this.e.now()); 
    return bool;
  }
  
  private d b(File paramFile) {
    d d1 = d.b(paramFile);
    return (d1 == null) ? null : (f(d1.b).equals(paramFile.getParentFile()) ? d1 : null);
  }
  
  private static String d(String paramString) {
    return ".cnt".equals(paramString) ? ".cnt" : (".tmp".equals(paramString) ? ".tmp" : null);
  }
  
  private String e(String paramString) {
    d d1 = new d(".cnt", paramString, null);
    return d1.a(g(d1.b));
  }
  
  private File f(String paramString) {
    return new File(g(paramString));
  }
  
  private void f() {
    boolean bool1 = this.a.exists();
    boolean bool = true;
    if (bool1)
      if (!this.c.exists()) {
        e.e.e.c.a.b(this.a);
      } else {
        bool = false;
      }  
    if (bool)
      try {
        e.e.e.c.c.a(this.c);
        return;
      } catch (e.e.e.c.c.a a2) {
        e.e.c.a.a a1 = this.d;
        e.e.c.a.a.a a3 = e.e.c.a.a.a.m;
        Class<?> clazz = f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("version directory could not be created: ");
        stringBuilder.append(this.c);
        a1.a(a3, clazz, stringBuilder.toString(), null);
      }  
  }
  
  private String g(String paramString) {
    int i = Math.abs(paramString.hashCode() % 100);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.c);
    stringBuilder.append(File.separator);
    stringBuilder.append(String.valueOf(i));
    return stringBuilder.toString();
  }
  
  public long a(d.a parama) {
    return a(((c)parama).d().b());
  }
  
  public long a(String paramString) {
    return a(b(paramString));
  }
  
  public d.b a(String paramString, Object paramObject) {
    paramObject = new d(".tmp", paramString, null);
    File file = f(((d)paramObject).b);
    if (!file.exists())
      a(file, "insert"); 
    try {
      return new f(this, paramString, paramObject.a(file));
    } catch (IOException iOException) {
      this.d.a(e.e.c.a.a.a.h, f, "insert", iOException);
      throw iOException;
    } 
  }
  
  public void a() {
    e.e.e.c.a.a(this.a);
  }
  
  File b(String paramString) {
    return new File(e(paramString));
  }
  
  public List<d.a> b() {
    b b = new b(null);
    e.e.e.c.a.a(this.c, b);
    return b.a();
  }
  
  public boolean b(String paramString, Object paramObject) {
    return a(paramString, false);
  }
  
  public e.e.b.a c(String paramString, Object paramObject) {
    File file = b(paramString);
    if (file.exists()) {
      file.setLastModified(this.e.now());
      return (e.e.b.a)e.e.b.b.a(file);
    } 
    return null;
  }
  
  public boolean c() {
    return this.b;
  }
  
  public void d() {
    e.e.e.c.a.a(this.a, new g(null));
  }
  
  private class b implements e.e.e.c.b {
    private final List<d.a> a = new ArrayList<d.a>();
    
    private b(a this$0) {}
    
    public List<d.a> a() {
      return Collections.unmodifiableList(this.a);
    }
    
    public void a(File param1File) {}
    
    public void b(File param1File) {}
    
    public void c(File param1File) {
      a.d d = a.a(this.b, param1File);
      if (d != null && d.a == ".cnt")
        this.a.add(new a.c(d.b, param1File, null)); 
    }
  }
  
  static class c implements d.a {
    private final String a;
    
    private final e.e.b.b b;
    
    private long c;
    
    private long d;
    
    private c(String param1String, File param1File) {
      i.a(param1File);
      i.a(param1String);
      this.a = param1String;
      this.b = e.e.b.b.a(param1File);
      this.c = -1L;
      this.d = -1L;
    }
    
    public String a() {
      return this.a;
    }
    
    public long b() {
      if (this.c < 0L)
        this.c = this.b.size(); 
      return this.c;
    }
    
    public long c() {
      if (this.d < 0L)
        this.d = this.b.b().lastModified(); 
      return this.d;
    }
    
    public e.e.b.b d() {
      return this.b;
    }
  }
  
  private static class d {
    public final String a;
    
    public final String b;
    
    private d(String param1String1, String param1String2) {
      this.a = param1String1;
      this.b = param1String2;
    }
    
    public static d b(File param1File) {
      String str1 = param1File.getName();
      int i = str1.lastIndexOf('.');
      if (i <= 0)
        return null; 
      String str3 = a.c(str1.substring(i));
      if (str3 == null)
        return null; 
      String str2 = str1.substring(0, i);
      str1 = str2;
      if (str3.equals(".tmp")) {
        i = str2.lastIndexOf('.');
        if (i <= 0)
          return null; 
        str1 = str2.substring(0, i);
      } 
      return new d(str3, str1);
    }
    
    public File a(File param1File) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.b);
      stringBuilder.append(".");
      return File.createTempFile(stringBuilder.toString(), ".tmp", param1File);
    }
    
    public String a(String param1String) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(param1String);
      stringBuilder.append(File.separator);
      stringBuilder.append(this.b);
      stringBuilder.append(this.a);
      return stringBuilder.toString();
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.a);
      stringBuilder.append("(");
      stringBuilder.append(this.b);
      stringBuilder.append(")");
      return stringBuilder.toString();
    }
  }
  
  private static class e extends IOException {
    public final long actual;
    
    public final long expected;
    
    public e(long param1Long1, long param1Long2) {
      super(stringBuilder.toString());
      this.expected = param1Long1;
      this.actual = param1Long2;
    }
  }
  
  class f implements d.b {
    private final String a;
    
    final File b;
    
    public f(a this$0, String param1String, File param1File) {
      this.a = param1String;
      this.b = param1File;
    }
    
    public e.e.b.a a(Object param1Object) {
      param1Object = this.c.b(this.a);
      try {
        e.e.e.c.c.a(this.b, (File)param1Object);
        if (param1Object.exists())
          param1Object.setLastModified(a.d(this.c).now()); 
        return (e.e.b.a)e.e.b.b.a((File)param1Object);
      } catch (e.e.e.c.c.d d) {
        param1Object = d.getCause();
        if (param1Object != null)
          if (!(param1Object instanceof e.e.e.c.c.c)) {
            if (param1Object instanceof FileNotFoundException) {
              param1Object = e.e.c.a.a.a.j;
              a.a(this.c).a((e.e.c.a.a.a)param1Object, a.e(), "commit", (Throwable)d);
              throw d;
            } 
          } else {
            param1Object = e.e.c.a.a.a.k;
            a.a(this.c).a((e.e.c.a.a.a)param1Object, a.e(), "commit", (Throwable)d);
            throw d;
          }  
        param1Object = e.e.c.a.a.a.l;
      } 
      a.a(this.c).a((e.e.c.a.a.a)param1Object, a.e(), "commit", (Throwable)d);
      throw d;
    }
    
    public void a(j param1j, Object param1Object) {
      try {
        param1Object = new FileOutputStream(this.b);
        try {
          e.e.e.d.c c = new e.e.e.d.c((OutputStream)param1Object);
          param1j.a((OutputStream)c);
          c.flush();
          long l = c.a();
          param1Object.close();
          if (this.b.length() == l)
            return; 
          throw new a.e(l, this.b.length());
        } finally {
          param1Object.close();
        } 
      } catch (FileNotFoundException fileNotFoundException) {
        a.a(this.c).a(e.e.c.a.a.a.i, a.e(), "updateResource", fileNotFoundException);
        throw fileNotFoundException;
      } 
    }
    
    public boolean s() {
      return (!this.b.exists() || this.b.delete());
    }
  }
  
  private class g implements e.e.e.c.b {
    private boolean a;
    
    private g(a this$0) {}
    
    private boolean d(File param1File) {
      a.d d = a.a(this.b, param1File);
      boolean bool = false;
      if (d == null)
        return false; 
      String str = d.a;
      if (str == ".tmp")
        return e(param1File); 
      if (str == ".cnt")
        bool = true; 
      i.b(bool);
      return true;
    }
    
    private boolean e(File param1File) {
      return (param1File.lastModified() > a.d(this.b).now() - a.g);
    }
    
    public void a(File param1File) {
      if (!this.a && param1File.equals(a.b(this.b)))
        this.a = true; 
    }
    
    public void b(File param1File) {
      if (!a.c(this.b).equals(param1File) && !this.a)
        param1File.delete(); 
      if (this.a && param1File.equals(a.b(this.b)))
        this.a = false; 
    }
    
    public void c(File param1File) {
      if (!this.a || !d(param1File))
        param1File.delete(); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/c/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */