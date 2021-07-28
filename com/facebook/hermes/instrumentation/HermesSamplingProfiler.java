package com.facebook.hermes.instrumentation;

import com.facebook.soloader.SoLoader;

public class HermesSamplingProfiler {
  static {
    SoLoader.a("jsijniprofiler");
  }
  
  public static native void disable();
  
  public static native void dumpSampledTraceToFile(String paramString);
  
  public static native void enable();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/hermes/instrumentation/HermesSamplingProfiler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */