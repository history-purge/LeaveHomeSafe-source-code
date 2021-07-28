package hk.gov.ogcio.leavehomesafe;

public class JNIHelper {
  static {
    System.loadLibrary("NativeConfig");
  }
  
  public native String[] getPbk();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/hk/gov/ogcio/leavehomesafe/JNIHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */