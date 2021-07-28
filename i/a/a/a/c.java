package i.a.a.a;

import i.a.a.c.a;
import i.a.a.e.f;
import i.a.a.e.h;
import i.a.a.e.l;
import i.a.a.e.m;
import i.a.a.f.a;
import i.a.a.h.e;
import i.a.a.i.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class c {
  private String a;
  
  private int b;
  
  private l c;
  
  private boolean d;
  
  private a e;
  
  private boolean f;
  
  private String g;
  
  public c(File paramFile) {
    if (paramFile != null) {
      this.a = paramFile.getPath();
      this.b = 2;
      this.e = new a();
      this.f = false;
      return;
    } 
    throw new a("Input zip file parameter is not null", 1);
  }
  
  public c(String paramString) {
    this(new File(paramString));
  }
  
  private void a(File paramFile, m paramm, boolean paramBoolean) {
    c();
    l l1 = this.c;
    if (l1 != null) {
      if (!paramBoolean || !l1.j()) {
        (new a(this.c)).a(paramFile, paramm, this.e, this.f);
        return;
      } 
      throw new a("This is a split archive. Zip file format does not allow updating split/spanned files");
    } 
    throw new a("internal error: zip model is null");
  }
  
  private void c() {
    if (this.c == null) {
      if (e.a(this.a)) {
        e();
        return;
      } 
      d();
    } 
  }
  
  private void d() {
    this.c = new l();
    this.c.b(this.a);
    this.c.a(this.g);
  }
  
  private void e() {
    if (e.a(this.a)) {
      if (e.b(this.a)) {
        if (this.b == 2) {
          Exception exception;
          RandomAccessFile randomAccessFile;
          try {
            randomAccessFile = new RandomAccessFile(new File(this.a), "r");
            RandomAccessFile randomAccessFile1 = randomAccessFile;
          } catch (FileNotFoundException fileNotFoundException) {
            exception = null;
            throw new a(fileNotFoundException);
          } finally {
            exception = null;
          } 
          if (randomAccessFile != null)
            try {
              randomAccessFile.close();
            } catch (IOException iOException) {} 
          throw exception;
        } 
        throw new a("Invalid mode");
      } 
      throw new a("no read access for the input zip file");
    } 
    throw new a("zip file does not exist");
  }
  
  public List a() {
    e();
    l l1 = this.c;
    return (l1 == null || l1.a() == null) ? null : this.c.a().a();
  }
  
  public void a(f paramf, String paramString) {
    a(paramf, paramString, (h)null);
  }
  
  public void a(f paramf, String paramString, h paramh) {
    a(paramf, paramString, paramh, null);
  }
  
  public void a(f paramf, String paramString1, h paramh, String paramString2) {
    if (paramf != null) {
      if (e.h(paramString1)) {
        e();
        if (this.e.b() != 1) {
          paramf.a(this.c, paramString1, paramh, paramString2, this.e, this.f);
          return;
        } 
        throw new a("invalid operation - Zip4j is in busy state");
      } 
      throw new a("destination path is empty or null, cannot extract file");
    } 
    throw new a("input file header is null, cannot extract file");
  }
  
  public void a(File paramFile, m paramm) {
    ArrayList<File> arrayList = new ArrayList();
    arrayList.add(paramFile);
    a(arrayList, paramm);
  }
  
  public void a(String paramString) {
    if (e.h(paramString)) {
      a(paramString.toCharArray());
      return;
    } 
    throw new NullPointerException();
  }
  
  public void a(String paramString, m paramm) {
    if (e.h(paramString)) {
      b(new File(paramString), paramm);
      return;
    } 
    throw new a("input path is null or empty, cannot add folder to zip file");
  }
  
  public void a(ArrayList paramArrayList, m paramm) {
    c();
    if (this.c != null) {
      if (paramArrayList != null) {
        if (e.a(paramArrayList, 1)) {
          if (paramm != null) {
            if (this.e.b() != 1) {
              if (!e.a(this.a) || !this.c.j()) {
                (new a(this.c)).a(paramArrayList, paramm, this.e, this.f);
                return;
              } 
              throw new a("Zip file already exists. Zip file format does not allow updating split/spanned files");
            } 
            throw new a("invalid operation - Zip4j is in busy state");
          } 
          throw new a("input parameters are null, cannot add files to zip");
        } 
        throw new a("One or more elements in the input ArrayList is not of type File");
      } 
      throw new a("input file ArrayList is null, cannot add files");
    } 
    throw new a("internal error: zip model is null");
  }
  
  public void a(char[] paramArrayOfchar) {
    if (this.c == null) {
      e();
      if (this.c == null)
        throw new a("Zip Model is null"); 
    } 
    if (this.c.a() != null && this.c.a().a() != null) {
      for (int i = 0; i < this.c.a().a().size(); i++) {
        if (this.c.a().a().get(i) != null && ((f)this.c.a().a().get(i)).w())
          ((f)this.c.a().a().get(i)).a(paramArrayOfchar); 
      } 
      return;
    } 
    a a1 = new a("invalid zip file");
    throw a1;
  }
  
  public void b(File paramFile, m paramm) {
    if (paramFile != null) {
      if (paramm != null) {
        a(paramFile, paramm, true);
        return;
      } 
      throw new a("input parameters are null, cannot add folder to zip file");
    } 
    throw new a("input path is null, cannot add folder to zip file");
  }
  
  public boolean b() {
    if (this.c == null) {
      e();
      if (this.c == null)
        throw new a("Zip Model is null"); 
    } 
    if (this.c.a() != null && this.c.a().a() != null) {
      ArrayList<f> arrayList = this.c.a().a();
      for (int i = 0; i < arrayList.size(); i++) {
        f f = arrayList.get(i);
        if (f != null && f.w()) {
          this.d = true;
          break;
        } 
      } 
      return this.d;
    } 
    a a1 = new a("invalid zip file");
    throw a1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */