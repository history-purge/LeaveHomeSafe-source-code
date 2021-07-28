package e.d.c.t;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public final class d {
  public static String a(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte.length > 2 && paramArrayOfbyte[0] == 27 && paramArrayOfbyte[1] == 37 && paramArrayOfbyte[2] == 71) ? "UTF-8" : ((paramArrayOfbyte.length > 3 && paramArrayOfbyte[0] == 27 && (paramArrayOfbyte[3] & 0xFF | (paramArrayOfbyte[2] & 0xFF) << 8 | (paramArrayOfbyte[1] & 0xFF) << 16) == 14844066 && paramArrayOfbyte[4] == 65) ? "ISO-8859-1" : null);
  }
  
  static Charset b(byte[] paramArrayOfbyte) {
    String[] arrayOfString = new String[3];
    int i = 0;
    arrayOfString[0] = "UTF-8";
    arrayOfString[1] = System.getProperty("file.encoding");
    arrayOfString[2] = "ISO-8859-1";
    int j = arrayOfString.length;
    while (true) {
      if (i < j) {
        Charset charset = Charset.forName(arrayOfString[i]);
        CharsetDecoder charsetDecoder = charset.newDecoder();
        try {
          charsetDecoder.decode(ByteBuffer.wrap(paramArrayOfbyte));
          return charset;
        } catch (CharacterCodingException characterCodingException) {
          i++;
          continue;
        } 
      } 
      return null;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/t/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */