package i.a.a.g;

import i.a.a.e.f;
import i.a.a.e.h;
import i.a.a.e.l;
import i.a.a.h.c;
import i.a.a.h.e;
import java.io.File;

public class a {
  private l a;
  
  public a(l paraml) {
    if (paraml != null) {
      this.a = paraml;
      return;
    } 
    throw new i.a.a.c.a("ZipModel is null");
  }
  
  private void a(f paramf, String paramString1, h paramh, String paramString2, i.a.a.f.a parama) {
    if (paramf != null)
      try {
        parama.a(paramf.k());
        String str1 = paramString1;
        if (!paramString1.endsWith(c.b)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramString1);
          stringBuilder.append(c.b);
          str1 = stringBuilder.toString();
        } 
        paramString1 = paramf.k();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str1);
        stringBuilder2.append(paramString1);
        String str2 = stringBuilder2.toString();
        if ((new File(str2)).getCanonicalPath().startsWith((new File(str1)).getCanonicalPath())) {
          boolean bool = paramf.v();
          if (bool) {
            try {
              if (!e.h(paramString1))
                return; 
              File file = new File(str2);
              if (!file.exists()) {
                file.mkdirs();
                return;
              } 
            } catch (Exception null) {
              parama.a(exception);
              throw new i.a.a.c.a(exception);
            } 
          } else {
            a((f)exception, str1, paramString2);
            b b = new b(this.a, (f)exception);
            try {
              b.a(parama, str1, paramString2, paramh);
              return;
            } catch (Exception exception) {
              parama.a(exception);
              throw new i.a.a.c.a(exception);
            } 
          } 
          return;
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("illegal file name that breaks out of the target directory: ");
        stringBuilder1.append(exception.k());
        throw new i.a.a.c.a(stringBuilder1.toString());
      } catch (i.a.a.c.a a1) {
        parama.a((Throwable)a1);
        throw a1;
      } catch (Exception exception) {
        parama.a(exception);
        throw new i.a.a.c.a(exception);
      }  
    throw new i.a.a.c.a("fileHeader is null");
  }
  
  private void a(f paramf, String paramString1, String paramString2) {
    if (paramf != null && e.h(paramString1)) {
      String str = paramf.k();
      if (e.h(paramString2))
        str = paramString2; 
      if (!e.h(str))
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString1);
      stringBuilder.append(str);
      str = stringBuilder.toString();
      try {
        File file = new File((new File(str)).getParent());
        if (!file.exists())
          file.mkdirs(); 
        return;
      } catch (Exception exception) {
        throw new i.a.a.c.a(exception);
      } 
    } 
    throw new i.a.a.c.a("Cannot check output directory structure...one of the parameters was null");
  }
  
  public void a(f paramf, String paramString1, h paramh, String paramString2, i.a.a.f.a parama, boolean paramBoolean) {
    if (paramf != null) {
      parama.a(1);
      parama.a(paramf.b());
      parama.d(1);
      parama.b(0);
      parama.a(paramf.k());
      if (paramBoolean) {
        (new a(this, "Zip4j", paramf, paramString1, paramh, paramString2, parama)).start();
        return;
      } 
      a(paramf, paramString1, paramh, paramString2, parama);
      parama.a();
      return;
    } 
    throw new i.a.a.c.a("fileHeader is null");
  }
  
  class a extends Thread {
    a(a this$0, String param1String1, f param1f, String param1String2, h param1h, String param1String3, i.a.a.f.a param1a) {
      super(param1String1);
    }
    
    public void run() {
      try {
        a.a(this.h, this.c, this.d, this.e, this.f, this.g);
        this.g.a();
        return;
      } catch (i.a.a.c.a a1) {
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */