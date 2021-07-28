package e.d.c.f0;

import e.a.a.d;
import e.a.a.e;
import e.a.a.f;
import e.a.a.g;
import e.d.a.k.d;
import e.d.a.k.f;
import e.d.b.n;
import e.d.c.b;
import e.d.c.e;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

public class c implements d {
  private static String a(e parame) {
    Iterator<b> iterator = parame.a(b.class).iterator();
    while (true) {
      if (iterator.hasNext()) {
        f f = ((b)iterator.next()).f();
        try {
          e<e.a.a.l.c> e1 = f.a("http://ns.adobe.com/xmp/note/", null, null);
          if (e1 == null)
            continue; 
          while (e1.hasNext()) {
            e.a.a.l.c c1 = e1.next();
            if ("xmpNote:HasExtendedXMP".equals(c1.a()))
              return c1.getValue(); 
          } 
        } catch (d d1) {}
        continue;
      } 
      return null;
    } 
  }
  
  private static byte[] a(e parame, byte[] paramArrayOfbyte1, String paramString, byte[] paramArrayOfbyte2) {
    int i = paramArrayOfbyte1.length;
    byte[] arrayOfByte = paramArrayOfbyte2;
    if (i >= 75) {
      byte[] arrayOfByte1 = paramArrayOfbyte2;
      try {
        n n = new n(paramArrayOfbyte1);
        arrayOfByte1 = paramArrayOfbyte2;
        n.a(35L);
        arrayOfByte1 = paramArrayOfbyte2;
        arrayOfByte = paramArrayOfbyte2;
        if (paramString.equals(n.c(32))) {
          arrayOfByte1 = paramArrayOfbyte2;
          int j = (int)n.i();
          arrayOfByte1 = paramArrayOfbyte2;
          int k = (int)n.i();
          byte[] arrayOfByte2 = paramArrayOfbyte2;
          if (paramArrayOfbyte2 == null) {
            arrayOfByte1 = paramArrayOfbyte2;
            arrayOfByte2 = new byte[j];
          } 
          arrayOfByte1 = arrayOfByte2;
          if (arrayOfByte2.length == j) {
            arrayOfByte1 = arrayOfByte2;
            System.arraycopy(paramArrayOfbyte1, 75, arrayOfByte2, k, i - 75);
            return arrayOfByte2;
          } 
          arrayOfByte1 = arrayOfByte2;
          b b = new b();
          arrayOfByte1 = arrayOfByte2;
          b.a(String.format("Inconsistent length for the Extended XMP buffer: %d instead of %d", new Object[] { Integer.valueOf(j), Integer.valueOf(arrayOfByte2.length) }));
          arrayOfByte1 = arrayOfByte2;
          parame.a(b);
          return arrayOfByte2;
        } 
      } catch (IOException iOException) {
        b b = new b();
        b.a(iOException.getMessage());
        parame.a(b);
        arrayOfByte = arrayOfByte1;
      } 
    } 
    return arrayOfByte;
  }
  
  public Iterable<f> a() {
    return Collections.singletonList(f.d);
  }
  
  public void a(Iterable<byte[]> paramIterable, e parame, f paramf) {
    byte[] arrayOfByte;
    Iterator<byte> iterator = paramIterable.iterator();
    paramIterable = null;
    paramf = null;
    while (iterator.hasNext()) {
      String str;
      byte[] arrayOfByte1 = (byte[])iterator.next();
      if (arrayOfByte1.length >= 29 && ("http://ns.adobe.com/xap/1.0/\000".equalsIgnoreCase(new String(arrayOfByte1, 0, 29)) || "XMP".equalsIgnoreCase(new String(arrayOfByte1, 0, 3)))) {
        byte[] arrayOfByte2 = new byte[arrayOfByte1.length - 29];
        System.arraycopy(arrayOfByte1, 29, arrayOfByte2, 0, arrayOfByte2.length);
        a(arrayOfByte2, parame);
        str = a(parame);
        continue;
      } 
      if (str != null && arrayOfByte1.length >= 35 && "http://ns.adobe.com/xmp/extension/\000".equalsIgnoreCase(new String(arrayOfByte1, 0, 35)))
        arrayOfByte = a(parame, arrayOfByte1, str, (byte[])paramIterable); 
    } 
    if (arrayOfByte != null)
      a(arrayOfByte, parame); 
  }
  
  public void a(String paramString, e parame) {
    a(paramString, parame, (b)null);
  }
  
  public void a(String paramString, e parame, b paramb) {
    b b1 = new b();
    if (paramb != null)
      b1.a(paramb); 
    try {
      b1.a(g.a(paramString));
    } catch (d d1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Error processing XMP data: ");
      stringBuilder.append(d1.getMessage());
      b1.a(stringBuilder.toString());
    } 
    if (!b1.e())
      parame.a(b1); 
  }
  
  public void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, e parame, b paramb) {
    // Byte code:
    //   0: new e/d/c/f0/b
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #6
    //   9: aload #5
    //   11: ifnull -> 21
    //   14: aload #6
    //   16: aload #5
    //   18: invokevirtual a : (Le/d/c/b;)V
    //   21: iload_2
    //   22: ifne -> 39
    //   25: iload_3
    //   26: aload_1
    //   27: arraylength
    //   28: if_icmpne -> 39
    //   31: aload_1
    //   32: invokestatic a : ([B)Le/a/a/f;
    //   35: astore_1
    //   36: goto -> 56
    //   39: new e/a/a/j/a
    //   42: dup
    //   43: aload_1
    //   44: iload_2
    //   45: iload_3
    //   46: invokespecial <init> : ([BII)V
    //   49: invokevirtual a : ()Ljava/io/InputStream;
    //   52: invokestatic a : (Ljava/io/InputStream;)Le/a/a/f;
    //   55: astore_1
    //   56: aload #6
    //   58: aload_1
    //   59: invokevirtual a : (Le/a/a/f;)V
    //   62: goto -> 103
    //   65: astore_1
    //   66: new java/lang/StringBuilder
    //   69: dup
    //   70: invokespecial <init> : ()V
    //   73: astore #5
    //   75: aload #5
    //   77: ldc 'Error processing XMP data: '
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: pop
    //   83: aload #5
    //   85: aload_1
    //   86: invokevirtual getMessage : ()Ljava/lang/String;
    //   89: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: aload #6
    //   95: aload #5
    //   97: invokevirtual toString : ()Ljava/lang/String;
    //   100: invokevirtual a : (Ljava/lang/String;)V
    //   103: aload #6
    //   105: invokevirtual e : ()Z
    //   108: ifne -> 118
    //   111: aload #4
    //   113: aload #6
    //   115: invokevirtual a : (Le/d/c/b;)V
    //   118: return
    // Exception table:
    //   from	to	target	type
    //   25	36	65	e/a/a/d
    //   39	56	65	e/a/a/d
    //   56	62	65	e/a/a/d
  }
  
  public void a(byte[] paramArrayOfbyte, e parame) {
    a(paramArrayOfbyte, parame, (b)null);
  }
  
  public void a(byte[] paramArrayOfbyte, e parame, b paramb) {
    a(paramArrayOfbyte, 0, paramArrayOfbyte.length, parame, paramb);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/f0/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */