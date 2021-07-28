package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

public final class i {
  private static long a(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, long paramLong) {
    a(paramFileChannel, paramByteBuffer, 8, paramLong);
    return paramByteBuffer.getLong();
  }
  
  private static void a(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, int paramInt, long paramLong) {
    paramByteBuffer.position(0);
    paramByteBuffer.limit(paramInt);
    while (paramByteBuffer.remaining() > 0) {
      paramInt = paramFileChannel.read(paramByteBuffer, paramLong);
      if (paramInt == -1)
        break; 
      paramLong += paramInt;
    } 
    if (paramByteBuffer.remaining() <= 0) {
      paramByteBuffer.position(0);
      return;
    } 
    a a = new a("ELF file truncated");
    throw a;
  }
  
  public static String[] a(File paramFile) {
    FileInputStream fileInputStream = new FileInputStream(paramFile);
    try {
      return a(fileInputStream.getChannel());
    } finally {
      fileInputStream.close();
    } 
  }
  
  public static String[] a(FileChannel paramFileChannel) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(8);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    if (d(paramFileChannel, byteBuffer, 0L) == 1179403647L) {
      long l2;
      int j = e(paramFileChannel, byteBuffer, 4L);
      boolean bool = true;
      if (j != 1)
        bool = false; 
      if (e(paramFileChannel, byteBuffer, 5L) == 2)
        byteBuffer.order(ByteOrder.BIG_ENDIAN); 
      if (bool) {
        l2 = d(paramFileChannel, byteBuffer, 28L);
      } else {
        l2 = a(paramFileChannel, byteBuffer, 32L);
      } 
      if (bool) {
        l1 = c(paramFileChannel, byteBuffer, 44L);
      } else {
        l1 = c(paramFileChannel, byteBuffer, 56L);
      } 
      if (bool) {
        l3 = 42L;
      } else {
        l3 = 54L;
      } 
      int k = c(paramFileChannel, byteBuffer, l3);
      long l3 = l1;
      if (l1 == 65535L) {
        if (bool) {
          l1 = d(paramFileChannel, byteBuffer, 32L);
        } else {
          l1 = a(paramFileChannel, byteBuffer, 40L);
        } 
        if (bool) {
          l1 += 28L;
        } else {
          l1 += 44L;
        } 
        l3 = d(paramFileChannel, byteBuffer, l1);
      } 
      long l4 = l2;
      long l1 = 0L;
      while (true) {
        if (l1 < l3) {
          if (d(paramFileChannel, byteBuffer, l4 + 0L) == 2L) {
            if (bool) {
              l1 = d(paramFileChannel, byteBuffer, l4 + 4L);
              break;
            } 
            l1 = a(paramFileChannel, byteBuffer, l4 + 8L);
            break;
          } 
          l4 += k;
          l1++;
          continue;
        } 
        l1 = 0L;
        break;
      } 
      if (l1 != 0L) {
        long l = l1;
        l4 = 0L;
        int m = 0;
        while (true) {
          int n;
          long l5;
          long l6;
          if (bool) {
            l5 = d(paramFileChannel, byteBuffer, l + 0L);
          } else {
            l5 = a(paramFileChannel, byteBuffer, l + 0L);
          } 
          if (l5 == 1L) {
            if (m != Integer.MAX_VALUE) {
              n = m + 1;
            } else {
              throw new a("malformed DT_NEEDED section");
            } 
          } else {
            j = m;
            if (l5 == 5L) {
              if (bool) {
                l4 = d(paramFileChannel, byteBuffer, l + 4L);
              } else {
                l4 = a(paramFileChannel, byteBuffer, l + 8L);
              } 
              j = m;
            } 
          } 
          if (bool) {
            l6 = 8L;
          } else {
            l6 = 16L;
          } 
          l += l6;
          if (l5 == 0L) {
            if (l4 != 0L) {
              m = 0;
              while (true) {
                if (m < l3) {
                  if (d(paramFileChannel, byteBuffer, l2 + 0L) == 1L) {
                    if (bool) {
                      l = d(paramFileChannel, byteBuffer, l2 + 8L);
                    } else {
                      l = a(paramFileChannel, byteBuffer, l2 + 16L);
                    } 
                    if (bool) {
                      l5 = d(paramFileChannel, byteBuffer, l2 + 20L);
                    } else {
                      l5 = a(paramFileChannel, byteBuffer, l2 + 40L);
                    } 
                    if (l <= l4 && l4 < l5 + l) {
                      if (bool) {
                        l2 = d(paramFileChannel, byteBuffer, l2 + 4L);
                      } else {
                        l2 = a(paramFileChannel, byteBuffer, l2 + 8L);
                      } 
                      l2 += l4 - l;
                      break;
                    } 
                  } 
                  l2 += k;
                  m++;
                  continue;
                } 
                l2 = 0L;
                break;
              } 
              if (l2 != 0L) {
                String[] arrayOfString = new String[j];
                n = 0;
                while (true) {
                  l3 = l1 + 0L;
                  if (bool) {
                    l3 = d(paramFileChannel, byteBuffer, l3);
                  } else {
                    l3 = a(paramFileChannel, byteBuffer, l3);
                  } 
                  if (l3 == 1L) {
                    if (bool) {
                      l4 = d(paramFileChannel, byteBuffer, l1 + 4L);
                    } else {
                      l4 = a(paramFileChannel, byteBuffer, l1 + 8L);
                    } 
                    arrayOfString[n] = b(paramFileChannel, byteBuffer, l4 + l2);
                    if (n != Integer.MAX_VALUE) {
                      n++;
                    } else {
                      throw new a("malformed DT_NEEDED section");
                    } 
                  } 
                  if (bool) {
                    l4 = 8L;
                  } else {
                    l4 = 16L;
                  } 
                  l1 += l4;
                  if (l3 == 0L) {
                    if (n == arrayOfString.length)
                      return arrayOfString; 
                    throw new a("malformed DT_NEEDED section");
                  } 
                } 
                break;
              } 
              throw new a("did not find file offset of DT_STRTAB table");
            } 
            throw new a("Dynamic section string-table not found");
          } 
          int i1 = n;
        } 
      } 
      throw new a("ELF file does not contain dynamic linking information");
    } 
    a a = new a("file is not ELF");
    throw a;
  }
  
  private static String b(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, long paramLong) {
    StringBuilder stringBuilder = new StringBuilder();
    while (true) {
      short s = e(paramFileChannel, paramByteBuffer, paramLong);
      if (s != 0) {
        stringBuilder.append((char)s);
        paramLong = 1L + paramLong;
        continue;
      } 
      return stringBuilder.toString();
    } 
  }
  
  private static int c(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, long paramLong) {
    a(paramFileChannel, paramByteBuffer, 2, paramLong);
    return paramByteBuffer.getShort() & 0xFFFF;
  }
  
  private static long d(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, long paramLong) {
    a(paramFileChannel, paramByteBuffer, 4, paramLong);
    return paramByteBuffer.getInt() & 0xFFFFFFFFL;
  }
  
  private static short e(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, long paramLong) {
    a(paramFileChannel, paramByteBuffer, 1, paramLong);
    return (short)(paramByteBuffer.get() & 0xFF);
  }
  
  private static class a extends RuntimeException {
    a(String param1String) {
      super(param1String);
    }
  }
  
  public enum b {
    c("not_so"),
    d("x86"),
    e("armeabi-v7a"),
    f("x86_64"),
    g("arm64-v8a"),
    h("others");
    
    private final String value;
    
    b(String param1String1) {
      this.value = param1String1;
    }
    
    public String toString() {
      return this.value;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/soloader/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */