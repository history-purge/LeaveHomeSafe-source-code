package e.e.e.i;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import e.e.e.d.n;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class a {
  private static a h;
  
  private static final long i = TimeUnit.MINUTES.toMillis(2L);
  
  private volatile StatFs a = null;
  
  private volatile File b;
  
  private volatile StatFs c = null;
  
  private volatile File d;
  
  private long e;
  
  private final Lock f = new ReentrantLock();
  
  private volatile boolean g = false;
  
  private StatFs a(StatFs paramStatFs, File paramFile) {
    if (paramFile != null) {
      if (!paramFile.exists())
        return null; 
      if (paramStatFs == null)
        try {
          return a(paramFile.getAbsolutePath());
        } catch (IllegalArgumentException illegalArgumentException) {
          return null;
        } finally {
          paramStatFs = null;
          n.a((Throwable)paramStatFs);
        }  
      paramStatFs.restat(paramFile.getAbsolutePath());
      return paramStatFs;
    } 
    return null;
  }
  
  protected static StatFs a(String paramString) {
    return new StatFs(paramString);
  }
  
  private void a() {
    if (!this.g) {
      this.f.lock();
      try {
        if (!this.g) {
          this.b = Environment.getDataDirectory();
          this.d = Environment.getExternalStorageDirectory();
          d();
          this.g = true;
        } 
        return;
      } finally {
        this.f.unlock();
      } 
    } 
  }
  
  public static a b() {
    // Byte code:
    //   0: ldc e/e/e/i/a
    //   2: monitorenter
    //   3: getstatic e/e/e/i/a.h : Le/e/e/i/a;
    //   6: ifnonnull -> 19
    //   9: new e/e/e/i/a
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic e/e/e/i/a.h : Le/e/e/i/a;
    //   19: getstatic e/e/e/i/a.h : Le/e/e/i/a;
    //   22: astore_0
    //   23: ldc e/e/e/i/a
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc e/e/e/i/a
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
  }
  
  private void c() {
    if (this.f.tryLock())
      try {
        if (SystemClock.uptimeMillis() - this.e > i)
          d(); 
        return;
      } finally {
        this.f.unlock();
      }  
  }
  
  private void d() {
    this.a = a(this.a, this.b);
    this.c = a(this.c, this.d);
    this.e = SystemClock.uptimeMillis();
  }
  
  @SuppressLint({"DeprecatedMethod"})
  public long a(a parama) {
    StatFs statFs;
    a();
    c();
    if (parama == a.c) {
      statFs = this.a;
    } else {
      statFs = this.c;
    } 
    if (statFs != null) {
      long l1;
      long l2;
      if (Build.VERSION.SDK_INT >= 18) {
        l1 = statFs.getBlockSizeLong();
        l2 = statFs.getAvailableBlocksLong();
      } else {
        l1 = statFs.getBlockSize();
        l2 = statFs.getAvailableBlocks();
      } 
      return l1 * l2;
    } 
    return 0L;
  }
  
  public boolean a(a parama, long paramLong) {
    a();
    long l = a(parama);
    boolean bool = true;
    if (l > 0L) {
      if (l < paramLong)
        return true; 
      bool = false;
    } 
    return bool;
  }
  
  public enum a {
    c, d;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */