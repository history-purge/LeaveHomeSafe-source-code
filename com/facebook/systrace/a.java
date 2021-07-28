package com.facebook.systrace;

import android.os.Build;
import android.os.Trace;

public class a {
  public static void a(long paramLong) {
    if (Build.VERSION.SDK_INT >= 18)
      Trace.endSection(); 
  }
  
  public static void a(long paramLong, String paramString) {
    if (Build.VERSION.SDK_INT >= 18)
      Trace.beginSection(paramString); 
  }
  
  public static void a(long paramLong, String paramString, int paramInt) {}
  
  public static void a(long paramLong1, String paramString, int paramInt, long paramLong2) {}
  
  public static void a(long paramLong, String paramString, a parama) {}
  
  public static void a(TraceListener paramTraceListener) {}
  
  public static void b(long paramLong, String paramString, int paramInt) {}
  
  public static void b(long paramLong1, String paramString, int paramInt, long paramLong2) {}
  
  public static void b(TraceListener paramTraceListener) {}
  
  public static boolean b(long paramLong) {
    return false;
  }
  
  public static void c(long paramLong, String paramString, int paramInt) {}
  
  public static void d(long paramLong, String paramString, int paramInt) {}
  
  public static void e(long paramLong, String paramString, int paramInt) {}
  
  public enum a {
    c('t'),
    d('p'),
    e('g');
    
    private final char mCode;
    
    a(char param1Char) {
      this.mCode = param1Char;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/systrace/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */