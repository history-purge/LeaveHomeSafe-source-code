package e.e.e.c;

import e.e.e.d.i;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class c {
  public static void a(File paramFile) {
    if (paramFile.exists()) {
      if (paramFile.isDirectory())
        return; 
      if (!paramFile.delete())
        throw new a(paramFile.getAbsolutePath(), new b(paramFile.getAbsolutePath())); 
    } 
    if (!paramFile.mkdirs()) {
      if (paramFile.isDirectory())
        return; 
      throw new a(paramFile.getAbsolutePath());
    } 
  }
  
  public static void a(File paramFile1, File paramFile2) {
    b b;
    i.a(paramFile1);
    i.a(paramFile2);
    paramFile2.delete();
    if (paramFile1.renameTo(paramFile2))
      return; 
    FileNotFoundException fileNotFoundException = null;
    if (!paramFile2.exists()) {
      if (paramFile1.getParentFile().exists()) {
        if (!paramFile1.exists())
          fileNotFoundException = new FileNotFoundException(paramFile1.getAbsolutePath()); 
      } else {
        fileNotFoundException = new c(paramFile1.getAbsolutePath());
      } 
    } else {
      b = new b(paramFile2.getAbsolutePath());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown error renaming ");
    stringBuilder.append(paramFile1.getAbsolutePath());
    stringBuilder.append(" to ");
    stringBuilder.append(paramFile2.getAbsolutePath());
    throw new d(stringBuilder.toString(), b);
  }
  
  public static class a extends IOException {
    public a(String param1String) {
      super(param1String);
    }
    
    public a(String param1String, Throwable param1Throwable) {
      super(param1String);
      initCause(param1Throwable);
    }
  }
  
  public static class b extends IOException {
    public b(String param1String) {
      super(param1String);
    }
  }
  
  public static class c extends FileNotFoundException {
    public c(String param1String) {
      super(param1String);
    }
  }
  
  public static class d extends IOException {
    public d(String param1String, Throwable param1Throwable) {
      super(param1String);
      initCause(param1Throwable);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */