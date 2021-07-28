package e.a.a.j;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class a {
  private byte[] a;
  
  private int b;
  
  private String c = null;
  
  public a(int paramInt) {
    this.a = new byte[paramInt];
    this.b = 0;
  }
  
  public a(InputStream paramInputStream) {
    this.b = 0;
    this.a = new byte[16384];
    while (true) {
      int i = paramInputStream.read(this.a, this.b, 16384);
      if (i > 0) {
        this.b += i;
        if (i == 16384) {
          b(this.b + 16384);
          continue;
        } 
      } 
      break;
    } 
  }
  
  public a(byte[] paramArrayOfbyte) {
    this.a = paramArrayOfbyte;
    this.b = paramArrayOfbyte.length;
  }
  
  public a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt2 <= paramArrayOfbyte.length - paramInt1) {
      this.a = new byte[paramInt2];
      System.arraycopy(paramArrayOfbyte, paramInt1, this.a, 0, paramInt2);
      this.b = paramInt2;
      return;
    } 
    throw new ArrayIndexOutOfBoundsException("Valid length exceeds the buffer length.");
  }
  
  private void b(int paramInt) {
    byte[] arrayOfByte = this.a;
    if (paramInt > arrayOfByte.length) {
      this.a = new byte[arrayOfByte.length * 2];
      System.arraycopy(arrayOfByte, 0, this.a, 0, arrayOfByte.length);
    } 
  }
  
  public int a(int paramInt) {
    if (paramInt < this.b)
      return this.a[paramInt] & 0xFF; 
    throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
  }
  
  public InputStream a() {
    return new ByteArrayInputStream(this.a, 0, this.b);
  }
  
  public void a(byte paramByte) {
    b(this.b + 1);
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = i + 1;
    arrayOfByte[i] = paramByte;
  }
  
  public void a(byte[] paramArrayOfbyte) {
    a(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    b(this.b + paramInt2);
    System.arraycopy(paramArrayOfbyte, paramInt1, this.a, this.b, paramInt2);
    this.b += paramInt2;
  }
  
  public String b() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/lang/String;
    //   4: ifnonnull -> 203
    //   7: aload_0
    //   8: getfield b : I
    //   11: istore_1
    //   12: iload_1
    //   13: iconst_2
    //   14: if_icmpge -> 26
    //   17: aload_0
    //   18: ldc 'UTF-8'
    //   20: putfield c : Ljava/lang/String;
    //   23: goto -> 203
    //   26: aload_0
    //   27: getfield a : [B
    //   30: astore_2
    //   31: aload_2
    //   32: iconst_0
    //   33: baload
    //   34: ifne -> 103
    //   37: iload_1
    //   38: iconst_4
    //   39: if_icmplt -> 92
    //   42: aload_2
    //   43: iconst_1
    //   44: baload
    //   45: ifeq -> 51
    //   48: goto -> 92
    //   51: aload_2
    //   52: iconst_2
    //   53: baload
    //   54: sipush #255
    //   57: iand
    //   58: sipush #254
    //   61: if_icmpne -> 83
    //   64: aload_2
    //   65: iconst_3
    //   66: baload
    //   67: sipush #255
    //   70: iand
    //   71: sipush #255
    //   74: if_icmpne -> 83
    //   77: ldc 'UTF-32BE'
    //   79: astore_2
    //   80: goto -> 95
    //   83: aload_0
    //   84: ldc 'UTF-32'
    //   86: putfield c : Ljava/lang/String;
    //   89: goto -> 203
    //   92: ldc 'UTF-16BE'
    //   94: astore_2
    //   95: aload_0
    //   96: aload_2
    //   97: putfield c : Ljava/lang/String;
    //   100: goto -> 203
    //   103: aload_2
    //   104: iconst_0
    //   105: baload
    //   106: sipush #255
    //   109: iand
    //   110: sipush #128
    //   113: if_icmpge -> 151
    //   116: aload_2
    //   117: iconst_1
    //   118: baload
    //   119: ifeq -> 125
    //   122: goto -> 17
    //   125: iload_1
    //   126: iconst_4
    //   127: if_icmplt -> 145
    //   130: aload_2
    //   131: iconst_2
    //   132: baload
    //   133: ifeq -> 139
    //   136: goto -> 145
    //   139: ldc 'UTF-32LE'
    //   141: astore_2
    //   142: goto -> 95
    //   145: ldc 'UTF-16LE'
    //   147: astore_2
    //   148: goto -> 95
    //   151: aload_2
    //   152: iconst_0
    //   153: baload
    //   154: sipush #255
    //   157: iand
    //   158: sipush #239
    //   161: if_icmpne -> 167
    //   164: goto -> 17
    //   167: aload_2
    //   168: iconst_0
    //   169: baload
    //   170: sipush #255
    //   173: iand
    //   174: sipush #254
    //   177: if_icmpne -> 189
    //   180: aload_0
    //   181: ldc 'UTF-16'
    //   183: putfield c : Ljava/lang/String;
    //   186: goto -> 203
    //   189: iload_1
    //   190: iconst_4
    //   191: if_icmplt -> 180
    //   194: aload_2
    //   195: iconst_2
    //   196: baload
    //   197: ifeq -> 83
    //   200: goto -> 180
    //   203: aload_0
    //   204: getfield c : Ljava/lang/String;
    //   207: areturn
  }
  
  public int c() {
    return this.b;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */