package com.facebook.react.modules.network;

import e.e.e.e.a;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class k {
  private final CharsetDecoder a;
  
  private byte[] b = null;
  
  public k(Charset paramCharset) {
    this.a = paramCharset.newDecoder();
  }
  
  public String a(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte2 = this.b;
    byte[] arrayOfByte1 = paramArrayOfbyte;
    int i = paramInt;
    if (arrayOfByte2 != null) {
      arrayOfByte1 = new byte[arrayOfByte2.length + paramInt];
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte1, this.b.length, paramInt);
      i = paramInt + this.b.length;
    } 
    ByteBuffer byteBuffer = ByteBuffer.wrap(arrayOfByte1, 0, i);
    boolean bool2 = true;
    paramArrayOfbyte = null;
    boolean bool1 = false;
    paramInt = 0;
    while (true) {
      CharBuffer charBuffer;
      if (!bool1 && paramInt < 4) {
        try {
          CharBuffer charBuffer1 = this.a.decode(byteBuffer);
          bool1 = true;
          charBuffer = charBuffer1;
        } catch (CharacterCodingException characterCodingException) {
          ByteBuffer byteBuffer1 = ByteBuffer.wrap(arrayOfByte1, 0, i - ++paramInt);
        } 
        continue;
      } 
      if (!bool1 || paramInt <= 0)
        bool2 = false; 
      if (bool2) {
        this.b = new byte[paramInt];
        System.arraycopy(arrayOfByte1, i - paramInt, this.b, 0, paramInt);
      } else {
        this.b = null;
      } 
      if (!bool1) {
        a.e("ReactNative", "failed to decode string from byte array");
        return "";
      } 
      return new String(charBuffer.array(), 0, charBuffer.length());
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/network/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */