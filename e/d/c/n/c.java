package e.d.c.n;

import e.d.a.s.b;
import e.d.a.s.d;
import e.d.a.s.e;
import e.d.b.b;
import e.d.b.f;
import e.d.b.k;
import e.d.b.l;
import e.d.b.n;
import e.d.b.o;
import e.d.b.p;
import e.d.c.a0.f;
import e.d.c.a0.g;
import e.d.c.e;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class c {
  private int a;
  
  private static int a(byte paramByte) {
    if (paramByte >= 48 && paramByte <= 57)
      return paramByte - 48; 
    byte b = 65;
    if (paramByte < 65 || paramByte > 70) {
      b = 97;
      if (paramByte < 97 || paramByte > 102)
        return -1; 
    } 
    return paramByte - b + 10;
  }
  
  private static void a(e parame, o paramo) {
    byte[] arrayOfByte = a(paramo);
    if (arrayOfByte != null)
      (new e.d.c.r.c()).a((k)new b(arrayOfByte), parame); 
  }
  
  private void a(b paramb, e parame, o paramo) {
    StringBuilder stringBuilder = new StringBuilder();
    while (true) {
      String str;
      stringBuilder.setLength(0);
      while (true) {
        char c1 = (char)paramo.b();
        if (c1 == '\r' || c1 == '\n')
          break; 
        stringBuilder.append(c1);
      } 
      if (stringBuilder.length() != 0 && stringBuilder.charAt(0) != '%')
        return; 
      int i = stringBuilder.indexOf(":");
      if (i != -1) {
        str = stringBuilder.substring(0, i).trim();
        a(paramb, str, stringBuilder.substring(i + 1).trim());
      } else {
        str = stringBuilder.toString().trim();
      } 
      if (str.equals("%BeginPhotoshop")) {
        b(parame, paramo);
        continue;
      } 
      if (str.equals("%%BeginICCProfile")) {
        a(parame, paramo);
        continue;
      } 
      if (str.equals("%begin_xml_packet"))
        c(parame, paramo); 
    } 
  }
  
  private static void a(b paramb, String paramString) {
    paramb.a(8, paramString.trim());
    String[] arrayOfString = paramString.split(" ");
    int i = Integer.parseInt(arrayOfString[0]);
    int j = Integer.parseInt(arrayOfString[1]);
    byte b1 = 3;
    int k = Integer.parseInt(arrayOfString[3]);
    if (!paramb.a(28))
      paramb.a(28, i); 
    if (!paramb.a(29))
      paramb.a(29, j); 
    if (!paramb.a(30))
      paramb.a(30, k); 
    if (!paramb.a(31)) {
      byte b2;
      if (k == 1) {
        b2 = 1;
      } else {
        b2 = b1;
        if (k != 2)
          if (k == 3) {
            b2 = b1;
          } else if (k == 4) {
            b2 = b1;
          } else {
            b2 = 0;
          }  
      } 
      if (b2 != 0)
        paramb.a(31, b2 * i * j); 
    } 
  }
  
  private void a(b paramb, String paramString1, String paramString2) {
    Integer integer = b.f.get(paramString1);
    if (integer == null)
      return; 
    int i = integer.intValue();
    if (i != 8) {
      if (i != 36) {
        if (b.e.containsKey(integer) && !paramb.a(integer.intValue())) {
          paramb.a(integer.intValue(), paramString2);
          i = integer.intValue();
        } else {
          i = 0;
        } 
        this.a = i;
      } else {
        i = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(paramb.p(this.a));
        stringBuilder.append(" ");
        stringBuilder.append(paramString2);
        paramb.a(i, stringBuilder.toString());
      } 
    } else {
      a(paramb, paramString2);
    } 
    this.a = integer.intValue();
  }
  
  private static byte[] a(o paramo) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    boolean bool = false;
    int i = 0;
    byte b = 0;
    int j = 0;
    while (!bool) {
      byte b1 = paramo.b();
      if (i) {
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              b = b1;
              continue;
            } 
            i = a(b1);
            if (i == -1)
              return null; 
            byteArrayOutputStream.write(i + j);
          } else {
            i = a(b1);
            if (i != -1) {
              j = i * 16;
              i = 3;
              b = b1;
              continue;
            } 
            if (b1 == 13 || b1 == 10) {
              i = 0;
              b = b1;
              continue;
            } 
            return null;
          } 
        } else if (b1 != 32) {
          bool = true;
          b = b1;
          continue;
        } 
        i = 2;
        b = b1;
        continue;
      } 
      b = b1;
      if (b1 != 10) {
        b = b1;
        if (b1 != 13) {
          b = b1;
          if (b1 != 32) {
            if (b1 != 37)
              return null; 
            i = 1;
            b = b1;
          } 
        } 
      } 
    } 
    while (b != 10)
      b = paramo.b(); 
    return byteArrayOutputStream.toByteArray();
  }
  
  private static byte[] a(o paramo, byte[] paramArrayOfbyte) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    int j = paramArrayOfbyte.length;
    int i = 0;
    while (i != j) {
      byte b = paramo.b();
      if (b == paramArrayOfbyte[i]) {
        i++;
      } else {
        i = 0;
      } 
      byteArrayOutputStream.write(b);
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  private static void b(e parame, o paramo) {
    byte[] arrayOfByte = a(paramo);
    if (arrayOfByte != null)
      (new f()).a((o)new n(arrayOfByte), arrayOfByte.length, parame); 
  }
  
  private static void c(e parame, o paramo) {
    String str = new String(a(paramo, "<?xpacket end=\"w\"?>".getBytes()), f.a);
    (new e.d.c.f0.c()).a(str, parame);
  }
  
  public void a(InputStream paramInputStream, e parame) {
    l l = new l(paramInputStream);
    b b = new b();
    parame.a(b);
    int i = l.g(0);
    if (i != -976170042) {
      if (i != 622940243) {
        b.a("File type not supported.");
        return;
      } 
      paramInputStream.reset();
      a(b, parame, (o)new p(paramInputStream));
      return;
    } 
    l.a(false);
    i = l.g(4);
    int j = l.g(8);
    int k = l.g(12);
    int m = l.g(16);
    int n = l.g(20);
    int i1 = l.g(24);
    if (i1 != 0) {
      b.a(32, i1);
      b.a(33, n);
      try {
        b b1 = new b(l.a(n, i1));
        (new e()).a((k)b1, (b)new g(parame, null), 0);
      } catch (d d) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to process TIFF data: ");
        stringBuilder.append(d.getMessage());
        b.a(stringBuilder.toString());
      } 
    } else if (m != 0) {
      b.a(34, m);
      b.a(35, k);
    } 
    a(b, parame, (o)new n(l.a(i, j)));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/n/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */