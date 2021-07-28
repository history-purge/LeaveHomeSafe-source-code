package okhttp3.internal.http2;

import j.f;
import java.io.IOException;
import okhttp3.internal.Util;

public final class Http2 {
  static final String[] BINARY;
  
  static final f CONNECTION_PREFACE = f.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
  
  static final String[] FLAGS;
  
  static final byte FLAG_ACK = 1;
  
  static final byte FLAG_COMPRESSED = 32;
  
  static final byte FLAG_END_HEADERS = 4;
  
  static final byte FLAG_END_PUSH_PROMISE = 4;
  
  static final byte FLAG_END_STREAM = 1;
  
  static final byte FLAG_NONE = 0;
  
  static final byte FLAG_PADDED = 8;
  
  static final byte FLAG_PRIORITY = 32;
  
  private static final String[] FRAME_NAMES = new String[] { "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION" };
  
  static final int INITIAL_MAX_FRAME_SIZE = 16384;
  
  static final byte TYPE_CONTINUATION = 9;
  
  static final byte TYPE_DATA = 0;
  
  static final byte TYPE_GOAWAY = 7;
  
  static final byte TYPE_HEADERS = 1;
  
  static final byte TYPE_PING = 6;
  
  static final byte TYPE_PRIORITY = 2;
  
  static final byte TYPE_PUSH_PROMISE = 5;
  
  static final byte TYPE_RST_STREAM = 3;
  
  static final byte TYPE_SETTINGS = 4;
  
  static final byte TYPE_WINDOW_UPDATE = 8;
  
  static {
    FLAGS = new String[64];
    BINARY = new String[256];
    int i = 0;
    while (true) {
      String[] arrayOfString1 = BINARY;
      if (i < arrayOfString1.length) {
        arrayOfString1[i] = Util.format("%8s", new Object[] { Integer.toBinaryString(i) }).replace(' ', '0');
        i++;
        continue;
      } 
      String[] arrayOfString2 = FLAGS;
      arrayOfString2[0] = "";
      arrayOfString2[1] = "END_STREAM";
      int[] arrayOfInt1 = new int[1];
      arrayOfInt1[0] = 1;
      arrayOfString2[8] = "PADDED";
      int j = arrayOfInt1.length;
      for (i = 0; i < j; i++) {
        int m = arrayOfInt1[i];
        arrayOfString2 = FLAGS;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(FLAGS[m]);
        stringBuilder.append("|PADDED");
        arrayOfString2[m | 0x8] = stringBuilder.toString();
      } 
      arrayOfString2 = FLAGS;
      arrayOfString2[4] = "END_HEADERS";
      arrayOfString2[32] = "PRIORITY";
      arrayOfString2[36] = "END_HEADERS|PRIORITY";
      int[] arrayOfInt2 = new int[3];
      arrayOfInt2[0] = 4;
      arrayOfInt2[1] = 32;
      arrayOfInt2[2] = 36;
      int k = arrayOfInt2.length;
      i = 0;
      while (true) {
        j = bool;
        if (i < k) {
          int m = arrayOfInt2[i];
          int n = arrayOfInt1.length;
          for (j = 0; j < n; j++) {
            int i1 = arrayOfInt1[j];
            String[] arrayOfString = FLAGS;
            int i2 = i1 | m;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(FLAGS[i1]);
            stringBuilder.append('|');
            stringBuilder.append(FLAGS[m]);
            arrayOfString[i2] = stringBuilder.toString();
            arrayOfString = FLAGS;
            stringBuilder = new StringBuilder();
            stringBuilder.append(FLAGS[i1]);
            stringBuilder.append('|');
            stringBuilder.append(FLAGS[m]);
            stringBuilder.append("|PADDED");
            arrayOfString[i2 | 0x8] = stringBuilder.toString();
          } 
          i++;
          continue;
        } 
        break;
      } 
      while (true) {
        String[] arrayOfString = FLAGS;
        if (j < arrayOfString.length) {
          if (arrayOfString[j] == null)
            arrayOfString[j] = BINARY[j]; 
          j++;
          continue;
        } 
        break;
      } 
      return;
    } 
  }
  
  static String formatFlags(byte paramByte1, byte paramByte2) {
    if (paramByte2 == 0)
      return ""; 
    if (paramByte1 != 2 && paramByte1 != 3)
      if (paramByte1 != 4 && paramByte1 != 6) {
        if (paramByte1 != 7 && paramByte1 != 8) {
          String str;
          String[] arrayOfString = FLAGS;
          if (paramByte2 < arrayOfString.length) {
            str = arrayOfString[paramByte2];
          } else {
            str = BINARY[paramByte2];
          } 
          return (paramByte1 == 5 && (paramByte2 & 0x4) != 0) ? str.replace("HEADERS", "PUSH_PROMISE") : ((paramByte1 == 0 && (paramByte2 & 0x20) != 0) ? str.replace("PRIORITY", "COMPRESSED") : str);
        } 
      } else {
        return (paramByte2 == 1) ? "ACK" : BINARY[paramByte2];
      }  
    return BINARY[paramByte2];
  }
  
  static String frameLog(boolean paramBoolean, int paramInt1, int paramInt2, byte paramByte1, byte paramByte2) {
    String str1;
    String str2;
    String[] arrayOfString = FRAME_NAMES;
    if (paramByte1 < arrayOfString.length) {
      str1 = arrayOfString[paramByte1];
    } else {
      str1 = Util.format("0x%02x", new Object[] { Byte.valueOf(paramByte1) });
    } 
    String str3 = formatFlags(paramByte1, paramByte2);
    if (paramBoolean) {
      str2 = "<<";
    } else {
      str2 = ">>";
    } 
    return Util.format("%s 0x%08x %5d %-13s %s", new Object[] { str2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str1, str3 });
  }
  
  static IllegalArgumentException illegalArgument(String paramString, Object... paramVarArgs) {
    throw new IllegalArgumentException(Util.format(paramString, paramVarArgs));
  }
  
  static IOException ioException(String paramString, Object... paramVarArgs) {
    throw new IOException(Util.format(paramString, paramVarArgs));
  }
  
  static {
    boolean bool = false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http2/Http2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */