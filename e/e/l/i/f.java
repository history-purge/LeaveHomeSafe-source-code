package e.e.l.i;

import e.e.e.d.b;
import e.e.e.d.i;
import e.e.e.d.n;
import e.e.e.g.a;
import e.e.e.h.c;
import e.e.e.k.d;
import e.e.l.k.d;
import java.io.IOException;
import java.io.InputStream;

public class f {
  private int a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private boolean g;
  
  private final a h;
  
  public f(a parama) {
    i.a(parama);
    this.h = parama;
    this.c = 0;
    this.b = 0;
    this.d = 0;
    this.f = 0;
    this.e = 0;
    this.a = 0;
  }
  
  private static boolean a(int paramInt) {
    return (paramInt == 1) ? false : ((paramInt >= 208 && paramInt <= 215) ? false : ((paramInt != 217 && paramInt != 216)));
  }
  
  private boolean a(InputStream paramInputStream) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : I
    //   4: istore #4
    //   6: aload_0
    //   7: getfield a : I
    //   10: istore #5
    //   12: iconst_0
    //   13: istore #8
    //   15: iconst_1
    //   16: istore_3
    //   17: bipush #6
    //   19: istore_2
    //   20: iload #5
    //   22: bipush #6
    //   24: if_icmpeq -> 244
    //   27: aload_1
    //   28: invokevirtual read : ()I
    //   31: istore #5
    //   33: iload #5
    //   35: iconst_m1
    //   36: if_icmpeq -> 244
    //   39: aload_0
    //   40: aload_0
    //   41: getfield c : I
    //   44: iconst_1
    //   45: iadd
    //   46: putfield c : I
    //   49: aload_0
    //   50: getfield g : Z
    //   53: ifeq -> 69
    //   56: aload_0
    //   57: bipush #6
    //   59: putfield a : I
    //   62: aload_0
    //   63: iconst_0
    //   64: putfield g : Z
    //   67: iconst_0
    //   68: ireturn
    //   69: aload_0
    //   70: getfield a : I
    //   73: istore #6
    //   75: iload #6
    //   77: ifeq -> 331
    //   80: iload #6
    //   82: iconst_1
    //   83: if_icmpeq -> 320
    //   86: iconst_3
    //   87: istore_2
    //   88: iload #6
    //   90: iconst_2
    //   91: if_icmpeq -> 309
    //   94: iload #6
    //   96: iconst_3
    //   97: if_icmpeq -> 290
    //   100: iconst_5
    //   101: istore_2
    //   102: iload #6
    //   104: iconst_4
    //   105: if_icmpeq -> 159
    //   108: iload #6
    //   110: iconst_5
    //   111: if_icmpeq -> 121
    //   114: iconst_0
    //   115: invokestatic b : (Z)V
    //   118: goto -> 235
    //   121: aload_0
    //   122: getfield b : I
    //   125: bipush #8
    //   127: ishl
    //   128: iload #5
    //   130: iadd
    //   131: iconst_2
    //   132: isub
    //   133: istore_2
    //   134: aload_1
    //   135: iload_2
    //   136: i2l
    //   137: invokestatic a : (Ljava/io/InputStream;J)J
    //   140: pop2
    //   141: aload_0
    //   142: aload_0
    //   143: getfield c : I
    //   146: iload_2
    //   147: iadd
    //   148: putfield c : I
    //   151: aload_0
    //   152: iconst_2
    //   153: putfield a : I
    //   156: goto -> 235
    //   159: aload_0
    //   160: iload_2
    //   161: putfield a : I
    //   164: goto -> 235
    //   167: aload_0
    //   168: iload_2
    //   169: putfield a : I
    //   172: goto -> 235
    //   175: iload #5
    //   177: sipush #217
    //   180: if_icmpne -> 201
    //   183: aload_0
    //   184: iconst_1
    //   185: putfield g : Z
    //   188: aload_0
    //   189: aload_0
    //   190: getfield c : I
    //   193: iconst_2
    //   194: isub
    //   195: invokespecial b : (I)V
    //   198: goto -> 151
    //   201: iload #5
    //   203: sipush #218
    //   206: if_icmpne -> 219
    //   209: aload_0
    //   210: aload_0
    //   211: getfield c : I
    //   214: iconst_2
    //   215: isub
    //   216: invokespecial b : (I)V
    //   219: iload #5
    //   221: invokestatic a : (I)Z
    //   224: ifeq -> 151
    //   227: aload_0
    //   228: iconst_4
    //   229: putfield a : I
    //   232: goto -> 235
    //   235: aload_0
    //   236: iload #5
    //   238: putfield b : I
    //   241: goto -> 6
    //   244: iload #8
    //   246: istore #7
    //   248: aload_0
    //   249: getfield a : I
    //   252: bipush #6
    //   254: if_icmpeq -> 273
    //   257: iload #8
    //   259: istore #7
    //   261: aload_0
    //   262: getfield e : I
    //   265: iload #4
    //   267: if_icmpeq -> 273
    //   270: iconst_1
    //   271: istore #7
    //   273: iload #7
    //   275: ireturn
    //   276: astore_1
    //   277: aload_1
    //   278: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    //   281: pop
    //   282: goto -> 287
    //   285: aconst_null
    //   286: athrow
    //   287: goto -> 285
    //   290: iload #5
    //   292: sipush #255
    //   295: if_icmpne -> 301
    //   298: goto -> 167
    //   301: iload #5
    //   303: ifne -> 175
    //   306: goto -> 151
    //   309: iload #5
    //   311: sipush #255
    //   314: if_icmpne -> 235
    //   317: goto -> 167
    //   320: iload #5
    //   322: sipush #216
    //   325: if_icmpne -> 167
    //   328: goto -> 151
    //   331: iload #5
    //   333: sipush #255
    //   336: if_icmpne -> 167
    //   339: iload_3
    //   340: istore_2
    //   341: goto -> 159
    // Exception table:
    //   from	to	target	type
    //   6	12	276	java/io/IOException
    //   27	33	276	java/io/IOException
    //   39	67	276	java/io/IOException
    //   69	75	276	java/io/IOException
    //   114	118	276	java/io/IOException
    //   121	151	276	java/io/IOException
    //   151	156	276	java/io/IOException
    //   159	164	276	java/io/IOException
    //   167	172	276	java/io/IOException
    //   183	198	276	java/io/IOException
    //   209	219	276	java/io/IOException
    //   219	232	276	java/io/IOException
    //   235	241	276	java/io/IOException
  }
  
  private void b(int paramInt) {
    if (this.d > 0)
      this.f = paramInt; 
    paramInt = this.d;
    this.d = paramInt + 1;
    this.e = paramInt;
  }
  
  public int a() {
    return this.f;
  }
  
  public boolean a(d paramd) {
    Exception exception;
    if (this.a == 6)
      return false; 
    if (paramd.y() <= this.c)
      return false; 
    e.e.e.g.f f1 = new e.e.e.g.f(paramd.u(), (byte[])this.h.get(16384), (c)this.h);
    try {
      d.a((InputStream)f1, this.c);
      boolean bool = a((InputStream)f1);
      b.a((InputStream)f1);
      return bool;
    } catch (IOException null) {
      n.a(exception);
      throw null;
    } finally {}
    b.a((InputStream)f1);
    throw exception;
  }
  
  public int b() {
    return this.e;
  }
  
  public boolean c() {
    return this.g;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/i/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */