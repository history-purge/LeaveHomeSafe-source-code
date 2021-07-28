package e.f.a.e.i.d;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class q5 {
  private static int a(byte[] paramArrayOfbyte, int paramInt) {
    byte b1 = paramArrayOfbyte[paramInt];
    byte b2 = paramArrayOfbyte[paramInt + 1];
    byte b3 = paramArrayOfbyte[paramInt + 2];
    return (paramArrayOfbyte[paramInt + 3] & 0xFF) << 24 | b1 & 0xFF | (b2 & 0xFF) << 8 | (b3 & 0xFF) << 16;
  }
  
  private static long a(long paramLong1, long paramLong2, long paramLong3) {
    paramLong1 = (paramLong1 ^ paramLong2) * paramLong3;
    paramLong1 = (paramLong1 ^ paramLong1 >>> 47L ^ paramLong2) * paramLong3;
    return (paramLong1 ^ paramLong1 >>> 47L) * paramLong3;
  }
  
  public static long a(byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    if (i >= 0 && i <= paramArrayOfbyte.length) {
      if (i <= 32) {
        if (i <= 16) {
          if (i >= 8) {
            long l9 = (i << 1) - 7286425919675154353L;
            long l10 = b(paramArrayOfbyte, 0) - 7286425919675154353L;
            long l11 = b(paramArrayOfbyte, i + 0 - 8);
            return a(Long.rotateRight(l11, 37) * l9 + l10, (Long.rotateRight(l10, 25) + l11) * l9, l9);
          } 
          if (i >= 4) {
            long l = (i << 1);
            return a(((a(paramArrayOfbyte, 0) & 0xFFFFFFFFL) << 3L) + i, a(paramArrayOfbyte, i + 0 - 4) & 0xFFFFFFFFL, l - 7286425919675154353L);
          } 
          if (i > 0) {
            byte b1 = paramArrayOfbyte[0];
            byte b2 = paramArrayOfbyte[(i >> 1) + 0];
            byte b3 = paramArrayOfbyte[i - 1 + 0];
            long l = ((b1 & 0xFF) + ((b2 & 0xFF) << 8)) * -7286425919675154353L ^ (i + ((b3 & 0xFF) << 2)) * -4348849565147123417L;
            return (l ^ l >>> 47L) * -7286425919675154353L;
          } 
          return -7286425919675154353L;
        } 
        long l4 = (i << 1) - 7286425919675154353L;
        long l5 = b(paramArrayOfbyte, 0) * -5435081209227447693L;
        long l6 = b(paramArrayOfbyte, 8);
        i += 0;
        long l7 = b(paramArrayOfbyte, i - 8) * l4;
        long l8 = b(paramArrayOfbyte, i - 16);
        return a(Long.rotateRight(l5 + l6, 43) + Long.rotateRight(l7, 30) + l8 * -7286425919675154353L, l5 + Long.rotateRight(l6 - 7286425919675154353L, 18) + l7, l4);
      } 
      if (i <= 64) {
        long l4 = (i << 1) - 7286425919675154353L;
        long l5 = b(paramArrayOfbyte, 0) * -7286425919675154353L;
        long l7 = b(paramArrayOfbyte, 8);
        i += 0;
        long l8 = b(paramArrayOfbyte, i - 8) * l4;
        long l6 = b(paramArrayOfbyte, i - 16);
        l6 = Long.rotateRight(l5 + l7, 43) + Long.rotateRight(l8, 30) + l6 * -7286425919675154353L;
        l7 = a(l6, Long.rotateRight(-7286425919675154353L + l7, 18) + l5 + l8, l4);
        l8 = b(paramArrayOfbyte, 16) * l4;
        long l9 = b(paramArrayOfbyte, 24);
        l6 = (l6 + b(paramArrayOfbyte, i - 32)) * l4;
        return a((l7 + b(paramArrayOfbyte, i - 24)) * l4 + Long.rotateRight(l8 + l9, 43) + Long.rotateRight(l6, 30), l8 + Long.rotateRight(l9 + l5, 18) + l6, l4);
      } 
      long l2 = 2480279821605975764L;
      long l1 = 1390051526045402406L;
      long[] arrayOfLong1 = new long[2];
      long[] arrayOfLong2 = new long[2];
      long l3 = b(paramArrayOfbyte, 0) + 95310865018149119L;
      int j = (--i / 64 << 6) + 0;
      i &= 0x3F;
      int m = j + i - 63;
      int k = 0;
      while (true) {
        l3 = Long.rotateRight(l3 + l2 + arrayOfLong1[0] + b(paramArrayOfbyte, k + 8), 37);
        long l = Long.rotateRight(l2 + arrayOfLong1[1] + b(paramArrayOfbyte, k + 48), 42);
        l2 = l3 * -5435081209227447693L ^ arrayOfLong2[1];
        l3 = l * -5435081209227447693L + arrayOfLong1[0] + b(paramArrayOfbyte, k + 40);
        l = Long.rotateRight(l1 + arrayOfLong2[0], 33) * -5435081209227447693L;
        a(paramArrayOfbyte, k, arrayOfLong1[1] * -5435081209227447693L, l2 + arrayOfLong2[0], arrayOfLong1);
        a(paramArrayOfbyte, k + 32, l + arrayOfLong2[1], l3 + b(paramArrayOfbyte, k + 16), arrayOfLong2);
        k += 64;
        if (k == j) {
          l1 = -5435081209227447693L + ((0xFFL & l2) << 1L);
          arrayOfLong2[0] = arrayOfLong2[0] + i;
          arrayOfLong1[0] = arrayOfLong1[0] + arrayOfLong2[0];
          arrayOfLong2[0] = arrayOfLong2[0] + arrayOfLong1[0];
          l = Long.rotateRight(l + l3 + arrayOfLong1[0] + b(paramArrayOfbyte, m + 8), 37);
          long l4 = Long.rotateRight(l3 + arrayOfLong1[1] + b(paramArrayOfbyte, m + 48), 42);
          l3 = l * l1 ^ arrayOfLong2[1] * 9L;
          l = l4 * l1 + arrayOfLong1[0] * 9L + b(paramArrayOfbyte, m + 40);
          l2 = Long.rotateRight(l2 + arrayOfLong2[0], 33) * l1;
          a(paramArrayOfbyte, m, arrayOfLong1[1] * l1, l3 + arrayOfLong2[0], arrayOfLong1);
          a(paramArrayOfbyte, m + 32, arrayOfLong2[1] + l2, l + b(paramArrayOfbyte, m + 16), arrayOfLong2);
          return a(a(arrayOfLong1[0], arrayOfLong2[0], l1) + (l ^ l >>> 47L) * -4348849565147123417L + l3, a(arrayOfLong1[1], arrayOfLong2[1], l1) + l2, l1);
        } 
        l1 = l2;
        l2 = l3;
        l3 = l;
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder(67);
    stringBuilder.append("Out of bound index with offput: 0 and length: ");
    stringBuilder.append(i);
    IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(stringBuilder.toString());
    throw indexOutOfBoundsException;
  }
  
  private static void a(byte[] paramArrayOfbyte, int paramInt, long paramLong1, long paramLong2, long[] paramArrayOflong) {
    long l4 = b(paramArrayOfbyte, paramInt);
    long l2 = b(paramArrayOfbyte, paramInt + 8);
    long l3 = b(paramArrayOfbyte, paramInt + 16);
    long l1 = b(paramArrayOfbyte, paramInt + 24);
    paramLong1 += l4;
    paramLong2 = Long.rotateRight(paramLong2 + paramLong1 + l1, 21);
    l2 = l2 + paramLong1 + l3;
    l3 = Long.rotateRight(l2, 44);
    paramArrayOflong[0] = l2 + l1;
    paramArrayOflong[1] = paramLong2 + l3 + paramLong1;
  }
  
  private static long b(byte[] paramArrayOfbyte, int paramInt) {
    ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte, paramInt, 8);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    return byteBuffer.getLong();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/q5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */