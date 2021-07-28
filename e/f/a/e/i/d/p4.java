package e.f.a.e.i.d;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class p4 {
  private final ByteBuffer a;
  
  private m0 b;
  
  private int c;
  
  private p4(ByteBuffer paramByteBuffer) {
    this.a = paramByteBuffer;
    this.a.order(ByteOrder.LITTLE_ENDIAN);
  }
  
  private p4(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this(ByteBuffer.wrap(paramArrayOfbyte, paramInt1, paramInt2));
  }
  
  private static int a(CharSequence paramCharSequence) {
    int k;
    int n = paramCharSequence.length();
    int m = 0;
    int j;
    for (j = 0; j < n && paramCharSequence.charAt(j) < ''; j++);
    int i = n;
    while (true) {
      k = i;
      if (j < n) {
        k = paramCharSequence.charAt(j);
        if (k < 2048) {
          i += 127 - k >>> 31;
          j++;
          continue;
        } 
        int i1 = paramCharSequence.length();
        k = m;
        while (j < i1) {
          char c = paramCharSequence.charAt(j);
          if (c < 'ࠀ') {
            k += 127 - c >>> 31;
            m = j;
          } else {
            int i2 = k + 2;
            k = i2;
            m = j;
            if ('?' <= c) {
              k = i2;
              m = j;
              if (c <= '?')
                if (Character.codePointAt(paramCharSequence, j) >= 65536) {
                  m = j + 1;
                  k = i2;
                } else {
                  paramCharSequence = new StringBuilder(39);
                  paramCharSequence.append("Unpaired surrogate at index ");
                  paramCharSequence.append(j);
                  throw new IllegalArgumentException(paramCharSequence.toString());
                }  
            } 
          } 
          j = m + 1;
        } 
        k = i + k;
      } 
      break;
    } 
    if (k >= n)
      return k; 
    long l = k;
    paramCharSequence = new StringBuilder(54);
    paramCharSequence.append("UTF-8 length does not fit in int: ");
    paramCharSequence.append(l + 4294967296L);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(paramCharSequence.toString());
    throw illegalArgumentException;
  }
  
  public static int a(String paramString) {
    int i = a(paramString);
    return e(i) + i;
  }
  
  public static p4 a(byte[] paramArrayOfbyte) {
    return a(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static p4 a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return new p4(paramArrayOfbyte, 0, paramInt2);
  }
  
  private final void a(int paramInt) {
    byte b = (byte)paramInt;
    if (this.a.hasRemaining()) {
      this.a.put(b);
      return;
    } 
    throw new q4(this.a.position(), this.a.limit());
  }
  
  private static void a(CharSequence paramCharSequence, ByteBuffer paramByteBuffer) {
    ReadOnlyBufferException readOnlyBufferException;
    BufferOverflowException bufferOverflowException;
    int i;
    int j;
    int k;
    int m;
    int n;
    byte[] arrayOfByte;
    if (!paramByteBuffer.isReadOnly()) {
      boolean bool = paramByteBuffer.hasArray();
      j = 0;
      i = 0;
      if (bool) {
        try {
          arrayOfByte = paramByteBuffer.array();
          j = paramByteBuffer.arrayOffset() + paramByteBuffer.position();
          k = paramByteBuffer.remaining();
          m = paramCharSequence.length();
          n = k + j;
          while (i < m) {
            k = i + j;
            if (k < n) {
              char c = paramCharSequence.charAt(i);
              if (c < '') {
                arrayOfByte[k] = (byte)c;
                i++;
              } 
            } 
          } 
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
          bufferOverflowException = new BufferOverflowException();
          bufferOverflowException.initCause(arrayIndexOutOfBoundsException);
          throw bufferOverflowException;
        } 
      } else {
        k = arrayIndexOutOfBoundsException.length();
        for (i = j;; i++) {
          if (i < k) {
            char c = arrayIndexOutOfBoundsException.charAt(i);
            if (c < '') {
              j = c;
            } else {
              if (c < 'ࠀ') {
                j = c >>> 6 | 0x3C0;
              } else if (c < '?' || '?' < c) {
                bufferOverflowException.put((byte)(c >>> 12 | 0x1E0));
                j = c >>> 6 & 0x3F | 0x80;
              } else {
                j = i + 1;
                if (j != arrayIndexOutOfBoundsException.length()) {
                  char c1 = arrayIndexOutOfBoundsException.charAt(j);
                  if (Character.isSurrogatePair(c, c1)) {
                    i = Character.toCodePoint(c, c1);
                    bufferOverflowException.put((byte)(i >>> 18 | 0xF0));
                    bufferOverflowException.put((byte)(i >>> 12 & 0x3F | 0x80));
                    bufferOverflowException.put((byte)(i >>> 6 & 0x3F | 0x80));
                    bufferOverflowException.put((byte)(i & 0x3F | 0x80));
                    i = j;
                  } else {
                    i = j;
                    StringBuilder stringBuilder = new StringBuilder(39);
                    stringBuilder.append("Unpaired surrogate at index ");
                    stringBuilder.append(i - 1);
                    throw new IllegalArgumentException(stringBuilder.toString());
                  } 
                } else {
                  StringBuilder stringBuilder = new StringBuilder(39);
                  stringBuilder.append("Unpaired surrogate at index ");
                  stringBuilder.append(i - 1);
                  throw new IllegalArgumentException(stringBuilder.toString());
                } 
                i++;
              } 
              bufferOverflowException.put((byte)j);
              j = c & 0x3F | 0x80;
            } 
            bufferOverflowException.put((byte)j);
          } else {
            break;
          } 
        } 
        return;
      } 
    } else {
      readOnlyBufferException = new ReadOnlyBufferException();
      throw readOnlyBufferException;
    } 
    if (i == m) {
      k = j + m;
    } else {
      j += i;
      while (true) {
        k = j;
        if (i < m) {
          char c = readOnlyBufferException.charAt(i);
          if (c < '' && j < n) {
            k = j + 1;
            arrayOfByte[j] = (byte)c;
            j = k;
          } else if (c < 'ࠀ' && j <= n - 2) {
            k = j + 1;
            arrayOfByte[j] = (byte)(c >>> 6 | 0x3C0);
            j = k + 1;
            arrayOfByte[k] = (byte)(c & 0x3F | 0x80);
          } else if ((c < '?' || '?' < c) && j <= n - 3) {
            k = j + 1;
            arrayOfByte[j] = (byte)(c >>> 12 | 0x1E0);
            int i1 = k + 1;
            arrayOfByte[k] = (byte)(c >>> 6 & 0x3F | 0x80);
            j = i1 + 1;
            arrayOfByte[i1] = (byte)(c & 0x3F | 0x80);
          } else if (j <= n - 4) {
            k = i + 1;
            if (k != readOnlyBufferException.length()) {
              char c1 = readOnlyBufferException.charAt(k);
              if (Character.isSurrogatePair(c, c1)) {
                i = Character.toCodePoint(c, c1);
                int i1 = j + 1;
                arrayOfByte[j] = (byte)(i >>> 18 | 0xF0);
                j = i1 + 1;
                arrayOfByte[i1] = (byte)(i >>> 12 & 0x3F | 0x80);
                i1 = j + 1;
                arrayOfByte[j] = (byte)(i >>> 6 & 0x3F | 0x80);
                j = i1 + 1;
                arrayOfByte[i1] = (byte)(i & 0x3F | 0x80);
                i = k;
              } else {
                i = k;
                StringBuilder stringBuilder = new StringBuilder(39);
                stringBuilder.append("Unpaired surrogate at index ");
                stringBuilder.append(i - 1);
                throw new IllegalArgumentException(stringBuilder.toString());
              } 
            } else {
              StringBuilder stringBuilder = new StringBuilder(39);
              stringBuilder.append("Unpaired surrogate at index ");
              stringBuilder.append(i - 1);
              throw new IllegalArgumentException(stringBuilder.toString());
            } 
          } else {
            StringBuilder stringBuilder = new StringBuilder(37);
            stringBuilder.append("Failed writing ");
            stringBuilder.append(c);
            stringBuilder.append(" at index ");
            stringBuilder.append(j);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
          } 
          continue;
        } 
        bufferOverflowException.position(k - bufferOverflowException.arrayOffset());
        return;
        i++;
      } 
    } 
    bufferOverflowException.position(k - bufferOverflowException.arrayOffset());
  }
  
  public static int b(int paramInt, long paramLong) {
    return c(paramInt) + c(paramLong);
  }
  
  public static int b(int paramInt, w4 paramw4) {
    paramInt = c(paramInt);
    int i = paramw4.a();
    return paramInt + e(i) + i;
  }
  
  public static int b(int paramInt, String paramString) {
    return c(paramInt) + a(paramString);
  }
  
  public static int b(int paramInt, byte[] paramArrayOfbyte) {
    return c(paramInt) + b(paramArrayOfbyte);
  }
  
  public static int b(byte[] paramArrayOfbyte) {
    return e(paramArrayOfbyte.length) + paramArrayOfbyte.length;
  }
  
  public static long b(long paramLong) {
    return paramLong >> 63L ^ paramLong << 1L;
  }
  
  private final void b(int paramInt) {
    while (true) {
      if ((paramInt & 0xFFFFFF80) == 0) {
        a(paramInt);
        return;
      } 
      a(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    } 
  }
  
  public static int c(int paramInt) {
    return e(paramInt << 3);
  }
  
  public static int c(long paramLong) {
    return ((0xFFFFFFFFFFFFFF80L & paramLong) == 0L) ? 1 : (((0xFFFFFFFFFFFFC000L & paramLong) == 0L) ? 2 : (((0xFFFFFFFFFFE00000L & paramLong) == 0L) ? 3 : (((0xFFFFFFFFF0000000L & paramLong) == 0L) ? 4 : (((0xFFFFFFF800000000L & paramLong) == 0L) ? 5 : (((0xFFFFFC0000000000L & paramLong) == 0L) ? 6 : (((0xFFFE000000000000L & paramLong) == 0L) ? 7 : (((0xFF00000000000000L & paramLong) == 0L) ? 8 : (((paramLong & Long.MIN_VALUE) == 0L) ? 9 : 10))))))));
  }
  
  public static int d(int paramInt) {
    return (paramInt >= 0) ? e(paramInt) : 10;
  }
  
  private static int e(int paramInt) {
    return ((paramInt & 0xFFFFFF80) == 0) ? 1 : (((paramInt & 0xFFFFC000) == 0) ? 2 : (((0xFFE00000 & paramInt) == 0) ? 3 : (((paramInt & 0xF0000000) == 0) ? 4 : 5)));
  }
  
  public final void a() {
    if (this.a.remaining() == 0)
      return; 
    throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[] { Integer.valueOf(this.a.remaining()) }));
  }
  
  public final void a(int paramInt1, int paramInt2) {
    b(paramInt1 << 3 | paramInt2);
  }
  
  public final void a(int paramInt, long paramLong) {
    a(paramInt, 0);
    a(paramLong);
  }
  
  public final void a(int paramInt, k2 paramk2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Le/f/a/e/i/d/m0;
    //   4: ifnonnull -> 32
    //   7: aload_0
    //   8: aload_0
    //   9: getfield a : Ljava/nio/ByteBuffer;
    //   12: invokestatic a : (Ljava/nio/ByteBuffer;)Le/f/a/e/i/d/m0;
    //   15: putfield b : Le/f/a/e/i/d/m0;
    //   18: aload_0
    //   19: aload_0
    //   20: getfield a : Ljava/nio/ByteBuffer;
    //   23: invokevirtual position : ()I
    //   26: putfield c : I
    //   29: goto -> 79
    //   32: aload_0
    //   33: getfield c : I
    //   36: aload_0
    //   37: getfield a : Ljava/nio/ByteBuffer;
    //   40: invokevirtual position : ()I
    //   43: if_icmpeq -> 79
    //   46: aload_0
    //   47: getfield b : Le/f/a/e/i/d/m0;
    //   50: aload_0
    //   51: getfield a : Ljava/nio/ByteBuffer;
    //   54: invokevirtual array : ()[B
    //   57: aload_0
    //   58: getfield c : I
    //   61: aload_0
    //   62: getfield a : Ljava/nio/ByteBuffer;
    //   65: invokevirtual position : ()I
    //   68: aload_0
    //   69: getfield c : I
    //   72: isub
    //   73: invokevirtual b : ([BII)V
    //   76: goto -> 18
    //   79: aload_0
    //   80: getfield b : Le/f/a/e/i/d/m0;
    //   83: astore_3
    //   84: aload_3
    //   85: iload_1
    //   86: aload_2
    //   87: invokevirtual a : (ILe/f/a/e/i/d/k2;)V
    //   90: aload_3
    //   91: invokevirtual a : ()V
    //   94: aload_0
    //   95: aload_0
    //   96: getfield a : Ljava/nio/ByteBuffer;
    //   99: invokevirtual position : ()I
    //   102: putfield c : I
    //   105: return
  }
  
  public final void a(int paramInt, w4 paramw4) {
    a(paramInt, 2);
    if (paramw4.c < 0)
      paramw4.a(); 
    b(paramw4.c);
    paramw4.a(this);
  }
  
  public final void a(int paramInt, String paramString) {
    a(paramInt, 2);
    try {
      paramInt = e(paramString.length());
      if (paramInt == e(paramString.length() * 3)) {
        int i = this.a.position();
        if (this.a.remaining() >= paramInt) {
          this.a.position(i + paramInt);
          a(paramString, this.a);
          int j = this.a.position();
          this.a.position(i);
          b(j - i - paramInt);
          this.a.position(j);
          return;
        } 
        throw new q4(i + paramInt, this.a.limit());
      } 
      b(a(paramString));
      a(paramString, this.a);
      return;
    } catch (BufferOverflowException bufferOverflowException) {
      q4 q4 = new q4(this.a.position(), this.a.limit());
      q4.initCause(bufferOverflowException);
      throw q4;
    } 
  }
  
  public final void a(int paramInt, boolean paramBoolean) {
    a(25, 0);
    byte b = (byte)paramBoolean;
    if (this.a.hasRemaining()) {
      this.a.put(b);
      return;
    } 
    throw new q4(this.a.position(), this.a.limit());
  }
  
  public final void a(int paramInt, byte[] paramArrayOfbyte) {
    a(paramInt, 2);
    b(paramArrayOfbyte.length);
    paramInt = paramArrayOfbyte.length;
    if (this.a.remaining() >= paramInt) {
      this.a.put(paramArrayOfbyte, 0, paramInt);
      return;
    } 
    throw new q4(this.a.position(), this.a.limit());
  }
  
  public final void a(long paramLong) {
    while (true) {
      if ((0xFFFFFFFFFFFFFF80L & paramLong) == 0L) {
        a((int)paramLong);
        return;
      } 
      a((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7L;
    } 
  }
  
  public final void b(int paramInt1, int paramInt2) {
    a(paramInt1, 0);
    if (paramInt2 >= 0) {
      b(paramInt2);
      return;
    } 
    a(paramInt2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/p4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */