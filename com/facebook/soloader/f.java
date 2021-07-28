package com.facebook.soloader;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class f extends n {
  protected final File f;
  
  protected final String g;
  
  public f(Context paramContext, String paramString1, File paramFile, String paramString2) {
    super(paramContext, paramString1);
    this.f = paramFile;
    this.g = paramString2;
  }
  
  private static final class b extends n.b implements Comparable {
    final ZipEntry e;
    
    final int f;
    
    b(String param1String, ZipEntry param1ZipEntry, int param1Int) {
      super(param1String, a(param1ZipEntry));
      this.e = param1ZipEntry;
      this.f = param1Int;
    }
    
    private static String a(ZipEntry param1ZipEntry) {
      return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[] { param1ZipEntry.getName(), Long.valueOf(param1ZipEntry.getSize()), Long.valueOf(param1ZipEntry.getCompressedSize()), Long.valueOf(param1ZipEntry.getCrc()) });
    }
    
    public int compareTo(Object param1Object) {
      return this.c.compareTo(((b)param1Object).c);
    }
  }
  
  protected class c extends n.f {
    private f.b[] c;
    
    private final ZipFile d;
    
    private final n e;
    
    c(f this$0, n param1n) {
      this.d = new ZipFile(this$0.f);
      this.e = param1n;
    }
    
    protected final n.c a() {
      return new n.c((n.b[])c());
    }
    
    protected boolean a(ZipEntry param1ZipEntry, String param1String) {
      throw null;
    }
    
    protected final n.e b() {
      return new a(null);
    }
    
    final f.b[] c() {
      if (this.c == null) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Pattern pattern = Pattern.compile(this.f.g);
        String[] arrayOfString = SysUtil.a();
        Enumeration<? extends ZipEntry> enumeration = this.d.entries();
        while (enumeration.hasMoreElements()) {
          ZipEntry zipEntry = enumeration.nextElement();
          Matcher matcher = pattern.matcher(zipEntry.getName());
          if (matcher.matches()) {
            String str1 = matcher.group(1);
            String str2 = matcher.group(2);
            int m = SysUtil.a(arrayOfString, str1);
            if (m >= 0) {
              linkedHashSet.add(str1);
              f.b b1 = (f.b)hashMap.get(str2);
              if (b1 == null || m < b1.f)
                hashMap.put(str2, new f.b(str2, zipEntry, m)); 
            } 
          } 
        } 
        this.e.a(linkedHashSet.<String>toArray(new String[linkedHashSet.size()]));
        f.b[] arrayOfB1 = (f.b[])hashMap.values().toArray((Object[])new f.b[hashMap.size()]);
        Arrays.sort((Object[])arrayOfB1);
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < arrayOfB1.length) {
          f.b b1 = arrayOfB1[i];
          if (a(b1.e, b1.c)) {
            j++;
          } else {
            arrayOfB1[i] = null;
          } 
          i++;
        } 
        f.b[] arrayOfB2 = new f.b[j];
        j = 0;
        i = k;
        while (i < arrayOfB1.length) {
          f.b b1 = arrayOfB1[i];
          k = j;
          if (b1 != null) {
            arrayOfB2[j] = b1;
            k = j + 1;
          } 
          i++;
          j = k;
        } 
        this.c = arrayOfB2;
      } 
      return this.c;
    }
    
    public void close() {
      this.d.close();
    }
    
    private final class a extends n.e {
      private int c;
      
      private a(f.c this$0) {}
      
      public boolean a() {
        this.d.c();
        return (this.c < (f.c.a(this.d)).length);
      }
      
      public n.d b() {
        this.d.c();
        f.b[] arrayOfB = f.c.a(this.d);
        int i = this.c;
        this.c = i + 1;
        null = arrayOfB[i];
        InputStream inputStream = f.c.b(this.d).getInputStream(null.e);
        try {
          return new n.d(null, inputStream);
        } finally {
          if (inputStream != null)
            inputStream.close(); 
        } 
      }
    }
  }
  
  private final class a extends n.e {
    private int c;
    
    private a(f this$0) {}
    
    public boolean a() {
      this.d.c();
      return (this.c < (f.c.a(this.d)).length);
    }
    
    public n.d b() {
      this.d.c();
      f.b[] arrayOfB = f.c.a(this.d);
      int i = this.c;
      this.c = i + 1;
      null = arrayOfB[i];
      InputStream inputStream = f.c.b(this.d).getInputStream(null.e);
      try {
        return new n.d(null, inputStream);
      } finally {
        if (inputStream != null)
          inputStream.close(); 
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/soloader/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */