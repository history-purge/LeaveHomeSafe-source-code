package i.a.a.b.h;

public class b {
  private static final int[] b = new int[256];
  
  private final int[] a = new int[3];
  
  static {
    for (int i = 0; i < 256; i++) {
      int k = i;
      int j = 0;
      while (j < 8) {
        int n = k >>> 1;
        int m = n;
        if ((k & 0x1) == 1)
          m = n ^ 0xEDB88320; 
        j++;
        k = m;
      } 
      b[i] = k;
    } 
  }
  
  private int a(int paramInt, byte paramByte) {
    return b[(paramInt ^ paramByte) & 0xFF] ^ paramInt >>> 8;
  }
  
  public byte a() {
    int i = this.a[2] | 0x2;
    return (byte)(i * (i ^ 0x1) >>> 8);
  }
  
  public void a(byte paramByte) {
    int[] arrayOfInt = this.a;
    arrayOfInt[0] = a(arrayOfInt[0], paramByte);
    arrayOfInt = this.a;
    arrayOfInt[1] = arrayOfInt[1] + (arrayOfInt[0] & 0xFF);
    arrayOfInt[1] = arrayOfInt[1] * 134775813 + 1;
    arrayOfInt[2] = a(arrayOfInt[2], (byte)(arrayOfInt[1] >> 24));
  }
  
  public void a(char[] paramArrayOfchar) {
    int[] arrayOfInt = this.a;
    int i = 0;
    arrayOfInt[0] = 305419896;
    arrayOfInt[1] = 591751049;
    arrayOfInt[2] = 878082192;
    while (i < paramArrayOfchar.length) {
      a((byte)(paramArrayOfchar[i] & 0xFF));
      i++;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/b/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */