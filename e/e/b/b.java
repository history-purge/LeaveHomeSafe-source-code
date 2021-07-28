package e.e.b;

import e.e.e.d.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class b implements a {
  private final File a;
  
  private b(File paramFile) {
    i.a(paramFile);
    this.a = paramFile;
  }
  
  public static b a(File paramFile) {
    return (paramFile != null) ? new b(paramFile) : null;
  }
  
  public InputStream a() {
    return new FileInputStream(this.a);
  }
  
  public File b() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == null || !(paramObject instanceof b))
      return false; 
    paramObject = paramObject;
    return this.a.equals(((b)paramObject).a);
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public long size() {
    return this.a.length();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */