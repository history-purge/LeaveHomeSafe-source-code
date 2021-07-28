package e.d.a;

import e.d.b.d;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;

public class b {
  private static final d<a> a = new d();
  
  private static final HashMap<String, a> b = new HashMap<String, a>();
  
  static {
    b.put("ftypmoov", a.p);
    b.put("ftypwide", a.p);
    b.put("ftypmdat", a.p);
    b.put("ftypfree", a.p);
    b.put("ftypqt  ", a.p);
    b.put("ftypavc1", a.q);
    b.put("ftypiso2", a.q);
    b.put("ftypisom", a.q);
    b.put("ftypM4A ", a.q);
    b.put("ftypM4B ", a.q);
    b.put("ftypM4P ", a.q);
    b.put("ftypM4V ", a.q);
    b.put("ftypM4VH", a.q);
    b.put("ftypM4VP", a.q);
    b.put("ftypmmp4", a.q);
    b.put("ftypmp41", a.q);
    b.put("ftypmp42", a.q);
    b.put("ftypmp71", a.q);
    b.put("ftypMSNV", a.q);
    b.put("ftypNDAS", a.q);
    b.put("ftypNDSC", a.q);
    b.put("ftypNDSH", a.q);
    b.put("ftypNDSM", a.q);
    b.put("ftypNDSP", a.q);
    b.put("ftypNDSS", a.q);
    b.put("ftypNDXC", a.q);
    b.put("ftypNDXH", a.q);
    b.put("ftypNDXM", a.q);
    b.put("ftypNDXP", a.q);
    b.put("ftypNDXS", a.q);
    b.put("ftypmif1", a.r);
    b.put("ftypmsf1", a.r);
    b.put("ftypheic", a.r);
    b.put("ftypheix", a.r);
    b.put("ftyphevc", a.r);
    b.put("ftyphevx", a.r);
    a.a(a.A, new byte[][] { { -1, -15 } });
    a.a(a.A, new byte[][] { { -1, -7 } });
    a.a(a.B, new byte[][] { { 
            48, 38, -78, 117, -114, 102, -49, 17, -90, -39, 
            0, -86, 0, 98, -50, 108 } });
    a.a(a.C, new byte[][] { { -48, -49, 17, -32, -95, -79, 26, -31, 0 } });
    a.a(a.D, new byte[][] { { 70, 76, 86 } });
    a.a(a.E, new byte[][] { { 
            6, 6, -19, -11, -40, 29, 70, -27, -67, 49, 
            -17, -25, -2, 116, -73, 29 } });
    a.a(a.F, new byte[][] { { 
            6, 14, 43, 52, 2, 5, 1, 1, 13, 1, 
            2, 1, 1, 2 } });
    a.a(a.H, new byte[][] { { 0, 0, 73, 73, 88, 80, 82, 51 } });
    a.a(a.H, new byte[][] { { 0, 0, 77, 77, 88, 80, 82, 51 } });
    a.a(a.I, new byte[][] { { 114, 116, 115, 112, 58, 47, 47 } });
    a.a(a.J, new byte[][] { { 123, 92, 114, 116, 102, 49 } });
    a.a(a.K, new byte[][] { { 83, 73, 84, 33, 0 } });
    a.a(a.K, new byte[][] { { 
            83, 116, 117, 102, 102, 73, 116, 32, 40, 99, 
            41, 49, 57, 57, 55, 45 } });
    a.a(a.L, new byte[][] { { 83, 116, 117, 102, 102, 73, 116, 33 } });
    a.a(a.M, new byte[][] { "CWS".getBytes() });
    a.a(a.M, new byte[][] { "FWS".getBytes() });
    a.a(a.M, new byte[][] { "ZWS".getBytes() });
    a.a(a.N, new byte[][] { { 0, 0, 1, -70 } });
    a.a(a.O, new byte[][] { "PK".getBytes() });
  }
  
  public static a a(BufferedInputStream paramBufferedInputStream) {
    if (paramBufferedInputStream.markSupported()) {
      int i = Math.max(16, a.a());
      paramBufferedInputStream.mark(i);
      byte[] arrayOfByte = new byte[i];
      if (paramBufferedInputStream.read(arrayOfByte) != -1) {
        a a1;
        a a3;
        paramBufferedInputStream.reset();
        a a2 = (a)a.a(arrayOfByte);
        if (a2 == a.c) {
          String str = new String(arrayOfByte, 4, 8);
          a3 = b.get(str);
          a1 = a2;
          if (a3 != null)
            return a3; 
        } else {
          a1 = a2;
          if (a2 == a.l) {
            String str = new String((byte[])a3, 8, 4);
            if (str.equals("WAVE"))
              return a.m; 
            if (str.equals("AVI "))
              return a.n; 
            a1 = a2;
            if (str.equals("WEBP"))
              a1 = a.o; 
          } 
        } 
        return a1;
      } 
      throw new IOException("Stream ended before file's magic number could be determined.");
    } 
    throw new IOException("Stream must support mark/reset");
  }
  
  static {
    a.a(a.c);
    a.a(a.d, new byte[][] { { -1, -40 } });
    a.a(a.e, new byte[][] { "II".getBytes(), { 42, 0 } });
    a.a(a.e, new byte[][] { "MM".getBytes(), { 0, 42 } });
    a.a(a.f, new byte[][] { "8BPS".getBytes() });
    a.a(a.g, new byte[][] { { 
            -119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 
            0, 13, 73, 72, 68, 82 } });
    a.a(a.h, new byte[][] { "BM".getBytes() });
    a.a(a.h, new byte[][] { "BA".getBytes() });
    a.a(a.h, new byte[][] { "CI".getBytes() });
    a.a(a.h, new byte[][] { "CP".getBytes() });
    a.a(a.h, new byte[][] { "IC".getBytes() });
    a.a(a.h, new byte[][] { "PT".getBytes() });
    a.a(a.i, new byte[][] { "GIF87a".getBytes() });
    a.a(a.i, new byte[][] { "GIF89a".getBytes() });
    a.a(a.j, new byte[][] { { 0, 0, 1, 0 } });
    a.a(a.k, new byte[][] { { 10, 0, 1 } });
    a.a(a.k, new byte[][] { { 10, 2, 1 } });
    a.a(a.k, new byte[][] { { 10, 3, 1 } });
    a.a(a.k, new byte[][] { { 10, 5, 1 } });
    a.a(a.l, new byte[][] { "RIFF".getBytes() });
    a.a(a.t, new byte[][] { "II".getBytes(), { 42, 0, 8, 0 } });
    d<a> d1 = a;
    a a = a.u;
    byte[] arrayOfByte1 = "II".getBytes();
    byte[] arrayOfByte2 = "HEAPCCDR".getBytes();
    d1.a(a, new byte[][] { arrayOfByte1, { 26, 0, 0, 0 }, arrayOfByte2 });
    a.a(a.v, new byte[][] { "II".getBytes(), { 42, 0, 16, 0, 0, 0, 67, 82 } });
    a.a(a.x, new byte[][] { "IIRO".getBytes(), { 8, 0 } });
    a.a(a.x, new byte[][] { "MMOR".getBytes(), { 0, 0 } });
    a.a(a.x, new byte[][] { "IIRS".getBytes(), { 8, 0 } });
    a.a(a.y, new byte[][] { "FUJIFILMCCD-RAW".getBytes() });
    a.a(a.z, new byte[][] { "II".getBytes(), { 85, 0 } });
    a.a(a.s, new byte[][] { "%!PS".getBytes() });
    a.a(a.s, new byte[][] { { -59, -48, -45, -58 } });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */