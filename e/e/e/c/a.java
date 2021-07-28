package e.e.e.c;

import java.io.File;

public class a {
  public static void a(File paramFile, b paramb) {
    paramb.a(paramFile);
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null) {
      int j = arrayOfFile.length;
      for (int i = 0; i < j; i++) {
        File file = arrayOfFile[i];
        if (file.isDirectory()) {
          a(file, paramb);
        } else {
          paramb.c(file);
        } 
      } 
    } 
    paramb.b(paramFile);
  }
  
  public static boolean a(File paramFile) {
    File[] arrayOfFile = paramFile.listFiles();
    boolean bool2 = true;
    boolean bool1 = true;
    if (arrayOfFile != null) {
      int j = arrayOfFile.length;
      int i = 0;
      while (true) {
        bool2 = bool1;
        if (i < j) {
          bool1 &= b(arrayOfFile[i]);
          i++;
          continue;
        } 
        break;
      } 
    } 
    return bool2;
  }
  
  public static boolean b(File paramFile) {
    if (paramFile.isDirectory())
      a(paramFile); 
    return paramFile.delete();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */