package com.facebook.soloader;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public final class e extends n {
  public e(Context paramContext, String paramString) {
    super(paramContext, paramString);
  }
  
  protected n.f b() {
    return new b(this, this);
  }
  
  private final class b extends n.f {
    private final e.c[] c;
    
    b(e this$0, n param1n) {
      Context context = this$0.c;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("/data/local/tmp/exopackage/");
      stringBuilder.append(context.getPackageName());
      stringBuilder.append("/native-libs/");
      File file = new File(stringBuilder.toString());
      ArrayList<e.c> arrayList = new ArrayList();
      LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
      String[] arrayOfString = SysUtil.a();
      int j = arrayOfString.length;
      int i = 0;
      label58: while (true) {
        if (i < j) {
          String str = arrayOfString[i];
          File file2 = new File(file, str);
          if (!file2.isDirectory())
            continue; 
          linkedHashSet.add(str);
          File file1 = new File(file2, "metadata.txt");
          if (!file1.isFile())
            continue; 
          FileReader fileReader = new FileReader(file1);
          try {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
              int k;
              int m;
              String str2;
              try {
                str1 = bufferedReader.readLine();
              } finally {
                param1n = null;
              } 
              if (k != 0)
                continue; 
              String str1 = str1.substring(m + 1);
              arrayList.add(new e.c(str2, str1, new File(file2, str1)));
            } 
          } finally {
            param1n = null;
          } 
          break;
        } 
        param1n.a(linkedHashSet.<String>toArray(new String[linkedHashSet.size()]));
        this.c = arrayList.<e.c>toArray(new e.c[arrayList.size()]);
        return;
      } 
    }
    
    protected n.c a() {
      return new n.c((n.b[])this.c);
    }
    
    protected n.e b() {
      return new a(null);
    }
    
    private final class a extends n.e {
      private int c;
      
      private a(e.b this$0) {}
      
      public boolean a() {
        return (this.c < (e.b.a(this.d)).length);
      }
      
      public n.d b() {
        e.c[] arrayOfC = e.b.a(this.d);
        int i = this.c;
        this.c = i + 1;
        null = arrayOfC[i];
        FileInputStream fileInputStream = new FileInputStream(null.e);
        try {
          return new n.d(null, fileInputStream);
        } finally {
          fileInputStream.close();
        } 
      }
    }
  }
  
  private final class a extends n.e {
    private int c;
    
    private a(e this$0) {}
    
    public boolean a() {
      return (this.c < (e.b.a(this.d)).length);
    }
    
    public n.d b() {
      e.c[] arrayOfC = e.b.a(this.d);
      int i = this.c;
      this.c = i + 1;
      null = arrayOfC[i];
      FileInputStream fileInputStream = new FileInputStream(null.e);
      try {
        return new n.d(null, fileInputStream);
      } finally {
        fileInputStream.close();
      } 
    }
  }
  
  private static final class c extends n.b {
    final File e;
    
    c(String param1String1, String param1String2, File param1File) {
      super(param1String1, param1String2);
      this.e = param1File;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/soloader/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */