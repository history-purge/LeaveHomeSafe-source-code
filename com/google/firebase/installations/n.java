package com.google.firebase.installations;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public class n {
  private static final byte a = Byte.parseByte("01110000", 2);
  
  private static final byte b = Byte.parseByte("00001111", 2);
  
  private static String a(byte[] paramArrayOfbyte) {
    return (new String(Base64.encode(paramArrayOfbyte, 11), Charset.defaultCharset())).substring(0, 22);
  }
  
  private static byte[] a(UUID paramUUID, byte[] paramArrayOfbyte) {
    ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte);
    byteBuffer.putLong(paramUUID.getMostSignificantBits());
    byteBuffer.putLong(paramUUID.getLeastSignificantBits());
    return byteBuffer.array();
  }
  
  public String a() {
    byte[] arrayOfByte = a(UUID.randomUUID(), new byte[17]);
    arrayOfByte[16] = arrayOfByte[0];
    arrayOfByte[0] = (byte)(b & arrayOfByte[0] | a);
    return a(arrayOfByte);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */