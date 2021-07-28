package i.a.a.h;

import i.a.a.c.a;
import i.a.a.e.f;
import i.a.a.e.l;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class e {
  public static int a(l paraml, f paramf) {
    if (paraml != null && paramf != null) {
      if (paraml.a() != null) {
        if (paraml.a().a() != null) {
          if (paraml.a().a().size() <= 0)
            return -1; 
          String str = paramf.k();
          if (h(str)) {
            ArrayList<f> arrayList = paraml.a().a();
            for (int i = 0; i < arrayList.size(); i++) {
              String str1 = ((f)arrayList.get(i)).k();
              if (h(str1) && str.equalsIgnoreCase(str1))
                return i; 
            } 
            return -1;
          } 
          throw new a("file name in file header is empty or null, cannot determine index of file header");
        } 
        throw new a("file Headers are null, cannot determine index of file header");
      } 
      throw new a("central directory is null, ccannot determine index of file header");
    } 
    a a = new a("input parameters is null, cannot determine index of file header");
    throw a;
  }
  
  public static int a(String paramString1, String paramString2) {
    if (h(paramString1)) {
      if (h(paramString2)) {
        ByteBuffer byteBuffer;
        try {
          ByteBuffer byteBuffer1;
          if (paramString2.equals("Cp850")) {
            byteBuffer1 = ByteBuffer.wrap(paramString1.getBytes("Cp850"));
            byteBuffer = byteBuffer1;
          } else if (byteBuffer1.equals("UTF8")) {
            byteBuffer1 = ByteBuffer.wrap(byteBuffer.getBytes("UTF8"));
            byteBuffer = byteBuffer1;
          } else {
            byteBuffer1 = ByteBuffer.wrap(byteBuffer.getBytes((String)byteBuffer1));
            byteBuffer = byteBuffer1;
          } 
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
          byteBuffer = ByteBuffer.wrap(byteBuffer.getBytes());
        } catch (Exception exception) {
          throw new a(exception);
        } 
        return exception.limit();
      } 
      throw new a("encoding is not defined, cannot calculate string length");
    } 
    throw new a("input string is null, cannot calculate encoded String length");
  }
  
  public static long a(int paramInt) {
    Calendar calendar = Calendar.getInstance();
    calendar.set((paramInt >> 25 & 0x7F) + 1980, (paramInt >> 21 & 0xF) - 1, paramInt >> 16 & 0x1F, paramInt >> 11 & 0x1F, paramInt >> 5 & 0x3F, (paramInt & 0x1F) * 2);
    calendar.set(14, 0);
    return calendar.getTime().getTime();
  }
  
  public static long a(long paramLong) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTimeInMillis(paramLong);
    int i = calendar.get(1);
    if (i < 1980)
      return 2162688L; 
    int j = calendar.get(2);
    int k = calendar.get(5);
    int m = calendar.get(11);
    int n = calendar.get(12);
    return (calendar.get(13) >> 1 | i - 1980 << 25 | j + 1 << 21 | k << 16 | m << 11 | n << 5);
  }
  
  public static long a(File paramFile, TimeZone paramTimeZone) {
    if (paramFile != null) {
      if (paramFile.exists())
        return paramFile.lastModified(); 
      throw new a("input file does not exist, cannot read last modified file time");
    } 
    throw new a("input file is null, cannot read last modified file time");
  }
  
  public static f a(l paraml, String paramString) {
    if (paraml != null) {
      if (h(paramString)) {
        f f2 = b(paraml, paramString);
        f f1 = f2;
        if (f2 == null) {
          paramString = paramString.replaceAll("\\\\", "/");
          f1 = b(paraml, paramString);
          if (f1 == null)
            return b(paraml, paramString.replaceAll("/", "\\\\")); 
        } 
        return f1;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("file name is null, cannot determine file header for fileName: ");
      stringBuilder1.append(paramString);
      throw new a(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("zip model is null, cannot determine file header for fileName: ");
    stringBuilder.append(paramString);
    throw new a(stringBuilder.toString());
  }
  
  public static String a(String paramString1, String paramString2, String paramString3) {
    if (h(paramString1)) {
      String str1;
      String str2;
      if (h(paramString3)) {
        StringBuilder stringBuilder;
        String str = (new File(paramString3)).getPath();
        paramString3 = str;
        if (!str.endsWith(c.b)) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append(str);
          stringBuilder1.append(c.b);
          str2 = stringBuilder1.toString();
        } 
        str = paramString1.substring(str2.length());
        str2 = str;
        if (str.startsWith(System.getProperty("file.separator")))
          str2 = str.substring(1); 
        File file = new File(paramString1);
        if (file.isDirectory()) {
          str2 = str2.replaceAll("\\\\", "/");
          stringBuilder = new StringBuilder();
          stringBuilder.append(str2);
          stringBuilder.append("/");
        } else {
          str2 = str2.substring(0, str2.lastIndexOf(file.getName())).replaceAll("\\\\", "/");
          stringBuilder = new StringBuilder();
          stringBuilder.append(str2);
          stringBuilder.append(file.getName());
        } 
        str1 = stringBuilder.toString();
      } else {
        File file = new File(str1);
        if (file.isDirectory()) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(file.getName());
          stringBuilder.append("/");
          str1 = stringBuilder.toString();
        } else {
          str1 = c(new File(str1));
        } 
      } 
      paramString3 = str1;
      if (h(paramString2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(paramString2);
        stringBuilder.append(str1);
        str2 = stringBuilder.toString();
      } 
      if (h(str2))
        return str2; 
      throw new a("Error determining file name");
    } 
    throw new a("input file path/name is empty, cannot calculate relative file name");
  }
  
  public static String a(byte[] paramArrayOfbyte) {
    try {
      return new String(paramArrayOfbyte, "Cp850");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      return new String(paramArrayOfbyte);
    } 
  }
  
  public static String a(byte[] paramArrayOfbyte, boolean paramBoolean) {
    if (paramBoolean)
      try {
        return new String(paramArrayOfbyte, "UTF8");
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        return new String(paramArrayOfbyte);
      }  
    return a(paramArrayOfbyte);
  }
  
  public static ArrayList a(File paramFile, boolean paramBoolean) {
    if (paramFile != null) {
      ArrayList<File> arrayList = new ArrayList();
      List<File> list = Arrays.asList(paramFile.listFiles());
      if (!paramFile.canRead())
        return arrayList; 
      for (int i = 0; i < list.size(); i++) {
        paramFile = list.get(i);
        if (paramFile.isHidden() && !paramBoolean)
          return arrayList; 
        arrayList.add(paramFile);
        if (paramFile.isDirectory())
          arrayList.addAll(a(paramFile, paramBoolean)); 
      } 
      return arrayList;
    } 
    a a = new a("input path is null, cannot read files in the directory");
    throw a;
  }
  
  public static boolean a(File paramFile) {
    if (paramFile != null)
      return paramFile.exists(); 
    throw new a("cannot check if file exists: input file is null");
  }
  
  public static boolean a(String paramString) {
    if (h(paramString))
      return a(new File(paramString)); 
    throw new a("path is null");
  }
  
  public static boolean a(ArrayList paramArrayList, int paramInt) {
    if (paramArrayList != null) {
      if (paramArrayList.size() <= 0)
        return true; 
      boolean bool = false;
      if (paramInt != 1) {
        if (paramInt != 2) {
          paramInt = bool;
        } else {
          int i = 0;
          while (true) {
            paramInt = bool;
            if (i < paramArrayList.size()) {
              if (paramArrayList.get(i) instanceof String) {
                i++;
                continue;
              } 
            } else {
              break;
            } 
            paramInt = 1;
            break;
          } 
        } 
      } else {
        int i = 0;
        while (true) {
          paramInt = bool;
          if (i < paramArrayList.size()) {
            if (paramArrayList.get(i) instanceof File) {
              i++;
              continue;
            } 
          } else {
            break;
          } 
          paramInt = 1;
          break;
        } 
      } 
      return paramInt ^ 0x1;
    } 
    a a = new a("input arraylist is null, cannot check types");
    throw a;
  }
  
  public static long[] a() {
    return new long[] { 
        67324752L, 134695760L, 33639248L, 101010256L, 84233040L, 134630224L, 134695760L, 117853008L, 101075792L, 1L, 
        39169L };
  }
  
  public static long b(File paramFile) {
    if (paramFile != null)
      return paramFile.isDirectory() ? -1L : paramFile.length(); 
    throw new a("input file is null, cannot calculate file length");
  }
  
  public static f b(l paraml, String paramString) {
    if (paraml != null) {
      if (h(paramString)) {
        if (paraml.a() != null) {
          if (paraml.a().a() != null) {
            if (paraml.a().a().size() <= 0)
              return null; 
            ArrayList<f> arrayList = paraml.a().a();
            for (int i = 0; i < arrayList.size(); i++) {
              f f = arrayList.get(i);
              String str = f.k();
              if (h(str) && paramString.equalsIgnoreCase(str))
                return f; 
            } 
            return null;
          } 
          StringBuilder stringBuilder3 = new StringBuilder();
          stringBuilder3.append("file Headers are null, cannot determine file header with exact match for fileName: ");
          stringBuilder3.append(paramString);
          throw new a(stringBuilder3.toString());
        } 
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("central directory is null, cannot determine file header with exact match for fileName: ");
        stringBuilder2.append(paramString);
        throw new a(stringBuilder2.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("file name is null, cannot determine file header with exact match for fileName: ");
      stringBuilder1.append(paramString);
      throw new a(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("zip model is null, cannot determine file header with exact match for fileName: ");
    stringBuilder.append(paramString);
    a a = new a(stringBuilder.toString());
    throw a;
  }
  
  public static boolean b(String paramString) {
    if (h(paramString)) {
      if (a(paramString))
        try {
          return (new File(paramString)).canRead();
        } catch (Exception exception) {
          throw new a("cannot read zip file");
        }  
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("file does not exist: ");
      stringBuilder.append((String)exception);
      throw new a(stringBuilder.toString());
    } 
    throw new a("path is null");
  }
  
  public static String c(File paramFile) {
    if (paramFile != null)
      return paramFile.isDirectory() ? null : paramFile.getName(); 
    throw new a("input file is null, cannot get file name");
  }
  
  public static boolean c(String paramString) {
    if (h(paramString)) {
      File file = new File(paramString);
      if (file.exists()) {
        if (file.isDirectory()) {
          if (!file.canWrite())
            throw new a("no write access to output folder"); 
        } else {
          throw new a("output folder is not valid");
        } 
      } else {
        try {
          file.mkdirs();
          if (file.isDirectory()) {
            if (!file.canWrite())
              throw new a("no write access to destination folder"); 
          } else {
            throw new a("output folder is not valid");
          } 
        } catch (Exception exception) {
          throw new a("Cannot create destination folder");
        } 
      } 
    } else {
      throw new a(new NullPointerException("output path is null"));
    } 
    return true;
  }
  
  public static void d(File paramFile) {}
  
  public static byte[] d(String paramString) {
    try {
      String str = e(paramString);
      return str.equals("Cp850") ? paramString.getBytes("Cp850") : (str.equals("UTF8") ? paramString.getBytes("UTF8") : paramString.getBytes());
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      return paramString.getBytes();
    } catch (Exception exception) {
      throw new a(exception);
    } 
  }
  
  public static String e(String paramString) {
    if (paramString != null)
      try {
        return paramString.equals(new String(paramString.getBytes("Cp850"), "Cp850")) ? "Cp850" : (paramString.equals(new String(paramString.getBytes("UTF8"), "UTF8")) ? "UTF8" : c.a);
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        return c.a;
      } catch (Exception exception) {
        return c.a;
      }  
    throw new a("input string is null, cannot detect charset");
  }
  
  public static void e(File paramFile) {}
  
  public static int f(String paramString) {
    if (h(paramString))
      return a(paramString, e(paramString)); 
    throw new a("input string is null, cannot calculate encoded String length");
  }
  
  public static void f(File paramFile) {
    if (paramFile != null) {
      if (paramFile.exists())
        paramFile.setReadOnly(); 
      return;
    } 
    throw new a("input file is null. cannot set read only file attribute");
  }
  
  public static String g(String paramString) {
    if (h(paramString)) {
      String str = paramString;
      if (paramString.indexOf(System.getProperty("file.separator")) >= 0)
        str = paramString.substring(paramString.lastIndexOf(System.getProperty("file.separator"))); 
      paramString = str;
      if (str.indexOf(".") > 0)
        paramString = str.substring(0, str.lastIndexOf(".")); 
      return paramString;
    } 
    throw new a("zip file name is empty or null, cannot determine zip file name");
  }
  
  public static void g(File paramFile) {}
  
  public static boolean h(String paramString) {
    return !(paramString == null || paramString.trim().length() <= 0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/h/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */