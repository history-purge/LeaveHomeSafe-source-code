package com.facebook.imagepipeline.nativecode;

import e.e.e.d.b;
import e.e.e.d.d;
import e.e.k.b;
import e.e.k.c;
import e.e.l.e.e;
import e.e.l.e.f;
import e.e.l.k.d;
import e.e.l.q.a;
import e.e.l.q.b;
import e.e.l.q.c;
import e.e.l.q.e;
import java.io.InputStream;
import java.io.OutputStream;

@d
public class NativeJpegTranscoder implements c {
  private boolean a;
  
  private int b;
  
  private boolean c;
  
  static {
    d.a();
  }
  
  public NativeJpegTranscoder(boolean paramBoolean1, int paramInt, boolean paramBoolean2) {
    this.a = paramBoolean1;
    this.b = paramInt;
    this.c = paramBoolean2;
  }
  
  public static void a(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: invokestatic a : ()V
    //   3: iconst_0
    //   4: istore #6
    //   6: iload_3
    //   7: iconst_1
    //   8: if_icmplt -> 17
    //   11: iconst_1
    //   12: istore #5
    //   14: goto -> 20
    //   17: iconst_0
    //   18: istore #5
    //   20: iload #5
    //   22: invokestatic a : (Z)V
    //   25: iload_3
    //   26: bipush #16
    //   28: if_icmpgt -> 37
    //   31: iconst_1
    //   32: istore #5
    //   34: goto -> 40
    //   37: iconst_0
    //   38: istore #5
    //   40: iload #5
    //   42: invokestatic a : (Z)V
    //   45: iload #4
    //   47: iflt -> 56
    //   50: iconst_1
    //   51: istore #5
    //   53: goto -> 59
    //   56: iconst_0
    //   57: istore #5
    //   59: iload #5
    //   61: invokestatic a : (Z)V
    //   64: iload #4
    //   66: bipush #100
    //   68: if_icmpgt -> 77
    //   71: iconst_1
    //   72: istore #5
    //   74: goto -> 80
    //   77: iconst_0
    //   78: istore #5
    //   80: iload #5
    //   82: invokestatic a : (Z)V
    //   85: iload_2
    //   86: invokestatic d : (I)Z
    //   89: invokestatic a : (Z)V
    //   92: iload_3
    //   93: bipush #8
    //   95: if_icmpne -> 106
    //   98: iload #6
    //   100: istore #5
    //   102: iload_2
    //   103: ifeq -> 109
    //   106: iconst_1
    //   107: istore #5
    //   109: iload #5
    //   111: ldc 'no transformation requested'
    //   113: invokestatic a : (ZLjava/lang/Object;)V
    //   116: aload_0
    //   117: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   120: pop
    //   121: aload_0
    //   122: checkcast java/io/InputStream
    //   125: astore_0
    //   126: aload_1
    //   127: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   130: pop
    //   131: aload_0
    //   132: aload_1
    //   133: checkcast java/io/OutputStream
    //   136: iload_2
    //   137: iload_3
    //   138: iload #4
    //   140: invokestatic nativeTranscodeJpeg : (Ljava/io/InputStream;Ljava/io/OutputStream;III)V
    //   143: return
  }
  
  public static void b(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: invokestatic a : ()V
    //   3: iconst_0
    //   4: istore #6
    //   6: iload_3
    //   7: iconst_1
    //   8: if_icmplt -> 17
    //   11: iconst_1
    //   12: istore #5
    //   14: goto -> 20
    //   17: iconst_0
    //   18: istore #5
    //   20: iload #5
    //   22: invokestatic a : (Z)V
    //   25: iload_3
    //   26: bipush #16
    //   28: if_icmpgt -> 37
    //   31: iconst_1
    //   32: istore #5
    //   34: goto -> 40
    //   37: iconst_0
    //   38: istore #5
    //   40: iload #5
    //   42: invokestatic a : (Z)V
    //   45: iload #4
    //   47: iflt -> 56
    //   50: iconst_1
    //   51: istore #5
    //   53: goto -> 59
    //   56: iconst_0
    //   57: istore #5
    //   59: iload #5
    //   61: invokestatic a : (Z)V
    //   64: iload #4
    //   66: bipush #100
    //   68: if_icmpgt -> 77
    //   71: iconst_1
    //   72: istore #5
    //   74: goto -> 80
    //   77: iconst_0
    //   78: istore #5
    //   80: iload #5
    //   82: invokestatic a : (Z)V
    //   85: iload_2
    //   86: invokestatic c : (I)Z
    //   89: invokestatic a : (Z)V
    //   92: iload_3
    //   93: bipush #8
    //   95: if_icmpne -> 107
    //   98: iload #6
    //   100: istore #5
    //   102: iload_2
    //   103: iconst_1
    //   104: if_icmpeq -> 110
    //   107: iconst_1
    //   108: istore #5
    //   110: iload #5
    //   112: ldc 'no transformation requested'
    //   114: invokestatic a : (ZLjava/lang/Object;)V
    //   117: aload_0
    //   118: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   121: pop
    //   122: aload_0
    //   123: checkcast java/io/InputStream
    //   126: astore_0
    //   127: aload_1
    //   128: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: aload_0
    //   133: aload_1
    //   134: checkcast java/io/OutputStream
    //   137: iload_2
    //   138: iload_3
    //   139: iload #4
    //   141: invokestatic nativeTranscodeJpegWithExifOrientation : (Ljava/io/InputStream;Ljava/io/OutputStream;III)V
    //   144: return
  }
  
  @d
  private static native void nativeTranscodeJpeg(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt1, int paramInt2, int paramInt3);
  
  @d
  private static native void nativeTranscodeJpegWithExifOrientation(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt1, int paramInt2, int paramInt3);
  
  public b a(d paramd, OutputStream paramOutputStream, f paramf, e parame, c paramc, Integer paramInteger) {
    InputStream inputStream;
    Integer integer = paramInteger;
    if (paramInteger == null)
      integer = Integer.valueOf(85); 
    f f1 = paramf;
    if (paramf == null)
      f1 = f.e(); 
    int i = a.a(f1, parame, paramd, this.b);
    f f2 = null;
    paramf = f2;
    try {
      int j = e.a(f1, parame, paramd, this.a);
      paramf = f2;
      int k = e.a(i);
      paramf = f2;
      if (this.c)
        j = k; 
      paramf = f2;
      InputStream inputStream1 = paramd.u();
      inputStream = inputStream1;
      if (e.a.contains(Integer.valueOf(paramd.e()))) {
        inputStream = inputStream1;
        b(inputStream1, paramOutputStream, e.a(f1, paramd), j, integer.intValue());
      } else {
        inputStream = inputStream1;
        a(inputStream1, paramOutputStream, e.b(f1, paramd), j, integer.intValue());
      } 
      b.a(inputStream1);
      j = 1;
      return new b(j);
    } finally {
      b.a(inputStream);
    } 
  }
  
  public String a() {
    return "NativeJpegTranscoder";
  }
  
  public boolean a(c paramc) {
    return (paramc == b.a);
  }
  
  public boolean a(d paramd, f paramf, e parame) {
    f f1 = paramf;
    if (paramf == null)
      f1 = f.e(); 
    return (e.a(f1, parame, paramd, this.a) < 8);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/nativecode/NativeJpegTranscoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */