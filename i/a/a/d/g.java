package i.a.a.d;

import i.a.a.c.a;
import i.a.a.h.d;
import i.a.a.h.e;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public class g extends OutputStream {
  private RandomAccessFile c;
  
  private long d;
  
  private File e;
  
  private File f;
  
  private int g;
  
  private long h;
  
  public g(File paramFile) {
    this(paramFile, -1L);
  }
  
  public g(File paramFile, long paramLong) {
    if (paramLong < 0L || paramLong >= 65536L) {
      this.c = new RandomAccessFile(paramFile, "rw");
      this.d = paramLong;
      this.f = paramFile;
      this.e = paramFile;
      this.g = 0;
      this.h = 0L;
      return;
    } 
    throw new a("split length less than minimum allowed split length of 65536 Bytes");
  }
  
  private boolean a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      if (paramArrayOfbyte.length < 4)
        return false; 
      int i = d.a(paramArrayOfbyte, 0);
      long[] arrayOfLong = e.a();
      if (arrayOfLong != null && arrayOfLong.length > 0)
        for (int j = 0; j < arrayOfLong.length; j++) {
          if (arrayOfLong[j] != 134695760L && arrayOfLong[j] == i)
            return true; 
        }  
    } 
    return false;
  }
  
  private void e() {
    try {
      String str1;
      File file;
      String str3 = e.g(this.f.getName());
      String str2 = this.e.getAbsolutePath();
      if (this.f.getParent() == null) {
        str1 = "";
      } else {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(this.f.getParent());
        stringBuilder1.append(System.getProperty("file.separator"));
        str1 = stringBuilder1.toString();
      } 
      if (this.g < 9) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(str3);
        stringBuilder1.append(".z0");
        stringBuilder1.append(this.g + 1);
        file = new File(stringBuilder1.toString());
      } else {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append((String)file);
        stringBuilder1.append(str3);
        stringBuilder1.append(".z");
        stringBuilder1.append(this.g + 1);
        file = new File(stringBuilder1.toString());
      } 
      this.c.close();
      if (!file.exists()) {
        if (this.e.renameTo(file)) {
          this.e = new File(str2);
          this.c = new RandomAccessFile(this.e, "rw");
          this.g++;
          return;
        } 
        throw new IOException("cannot rename newly created split file");
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("split file: ");
      stringBuilder.append(file.getName());
      stringBuilder.append(" already exists in the current directory, cannot rename this file");
      throw new IOException(stringBuilder.toString());
    } catch (a a) {
      throw new IOException(a.getMessage());
    } 
  }
  
  public int a() {
    return this.g;
  }
  
  public void a(long paramLong) {
    this.c.seek(paramLong);
  }
  
  public long b() {
    return this.c.getFilePointer();
  }
  
  public boolean b(int paramInt) {
    if (paramInt >= 0) {
      if (!c(paramInt))
        try {
          e();
          this.h = 0L;
          return true;
        } catch (IOException iOException) {
          throw new a(iOException);
        }  
      return false;
    } 
    throw new a("negative buffersize for checkBuffSizeAndStartNextSplitFile");
  }
  
  public long c() {
    return this.d;
  }
  
  public boolean c(int paramInt) {
    if (paramInt >= 0) {
      long l = this.d;
      boolean bool = true;
      if (l >= 65536L) {
        if (this.h + paramInt <= l)
          return true; 
        bool = false;
      } 
      return bool;
    } 
    throw new a("negative buffersize for isBuffSizeFitForCurrSplitFile");
  }
  
  public void close() {
    RandomAccessFile randomAccessFile = this.c;
    if (randomAccessFile != null)
      randomAccessFile.close(); 
  }
  
  public boolean d() {
    return (this.d != -1L);
  }
  
  public void flush() {}
  
  public void write(int paramInt) {
    write(new byte[] { (byte)paramInt }, 0, 1);
  }
  
  public void write(byte[] paramArrayOfbyte) {
    write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l1;
    if (paramInt2 <= 0)
      return; 
    long l2 = this.d;
    if (l2 != -1L) {
      if (l2 >= 65536L) {
        long l = this.h;
        if (l >= l2) {
          e();
          this.c.write(paramArrayOfbyte, paramInt1, paramInt2);
          l1 = paramInt2;
        } else {
          l1 = paramInt2;
          if (l + l1 > l2) {
            if (a(paramArrayOfbyte)) {
              e();
              this.c.write(paramArrayOfbyte, paramInt1, paramInt2);
            } else {
              this.c.write(paramArrayOfbyte, paramInt1, (int)(this.d - this.h));
              e();
              RandomAccessFile randomAccessFile = this.c;
              l2 = this.d;
              l = this.h;
              randomAccessFile.write(paramArrayOfbyte, paramInt1 + (int)(l2 - l), (int)(l1 - l2 - l));
              l1 -= this.d - this.h;
            } 
            this.h = l1;
            return;
          } 
          this.c.write(paramArrayOfbyte, paramInt1, paramInt2);
          l1 = this.h + l1;
        } 
      } else {
        throw new IOException("split length less than minimum allowed split length of 65536 Bytes");
      } 
    } else {
      this.c.write(paramArrayOfbyte, paramInt1, paramInt2);
      l1 = this.h + paramInt2;
    } 
    this.h = l1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */