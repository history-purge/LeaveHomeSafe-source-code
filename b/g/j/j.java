package b.g.j;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

public final class j {
  static {
    int i = Build.VERSION.SDK_INT;
    if (i >= 18 && i < 29)
      try {
        Trace.class.getField("TRACE_TAG_APP").getLong(null);
        Trace.class.getMethod("isTagEnabled", new Class[] { long.class });
        Trace.class.getMethod("asyncTraceBegin", new Class[] { long.class, String.class, int.class });
        Trace.class.getMethod("asyncTraceEnd", new Class[] { long.class, String.class, int.class });
        Trace.class.getMethod("traceCounter", new Class[] { long.class, String.class, int.class });
        return;
      } catch (Exception exception) {
        Log.i("TraceCompat", "Unable to initialize via reflection.", exception);
      }  
  }
  
  public static void a() {
    if (Build.VERSION.SDK_INT >= 18)
      Trace.endSection(); 
  }
  
  public static void a(String paramString) {
    if (Build.VERSION.SDK_INT >= 18)
      Trace.beginSection(paramString); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/j/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */