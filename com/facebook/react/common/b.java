package com.facebook.react.common;

import android.net.Uri;

public class b extends RuntimeException {
  public b(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public static b a(String paramString1, String paramString2, String paramString3, Throwable paramThrowable) {
    paramString1 = "\n\nTry the following to fix the issue:\n• Ensure that the packager server is running\n• Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n• Ensure Airplane Mode is disabled\n• If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT>' to forward requests from your device\n• If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n".replace("<PORT>", String.valueOf(Uri.parse(paramString1).getPort()));
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString2);
    stringBuilder.append(paramString1);
    stringBuilder.append(paramString3);
    return new b(stringBuilder.toString(), paramThrowable);
  }
  
  public static b a(String paramString1, String paramString2, Throwable paramThrowable) {
    return a(paramString1, paramString2, "", paramThrowable);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/common/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */