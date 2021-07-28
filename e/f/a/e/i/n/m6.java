package e.f.a.e.i.n;

final class m6 {
  private static void b(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, char[] paramArrayOfchar, int paramInt) {
    if (!g(paramByte2) && (paramByte1 << 28) + paramByte2 + 112 >> 30 == 0 && !g(paramByte3) && !g(paramByte4)) {
      int i = (paramByte1 & 0x7) << 18 | (paramByte2 & 0x3F) << 12 | (paramByte3 & 0x3F) << 6 | paramByte4 & 0x3F;
      paramArrayOfchar[paramInt] = (char)((i >>> 10) + 55232);
      paramArrayOfchar[paramInt + 1] = (char)((i & 0x3FF) + 56320);
      return;
    } 
    throw q3.f();
  }
  
  private static void b(byte paramByte1, byte paramByte2, byte paramByte3, char[] paramArrayOfchar, int paramInt) {
    if (!g(paramByte2) && (paramByte1 != -32 || paramByte2 >= -96) && (paramByte1 != -19 || paramByte2 < -96) && !g(paramByte3)) {
      paramArrayOfchar[paramInt] = (char)((paramByte1 & 0xF) << 12 | (paramByte2 & 0x3F) << 6 | paramByte3 & 0x3F);
      return;
    } 
    throw q3.f();
  }
  
  private static void b(byte paramByte1, byte paramByte2, char[] paramArrayOfchar, int paramInt) {
    if (paramByte1 >= -62 && !g(paramByte2)) {
      paramArrayOfchar[paramInt] = (char)((paramByte1 & 0x1F) << 6 | paramByte2 & 0x3F);
      return;
    } 
    throw q3.f();
  }
  
  private static void b(byte paramByte, char[] paramArrayOfchar, int paramInt) {
    paramArrayOfchar[paramInt] = (char)paramByte;
  }
  
  private static boolean d(byte paramByte) {
    return (paramByte >= 0);
  }
  
  private static boolean e(byte paramByte) {
    return (paramByte < -32);
  }
  
  private static boolean f(byte paramByte) {
    return (paramByte < -16);
  }
  
  private static boolean g(byte paramByte) {
    return (paramByte > -65);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/m6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */