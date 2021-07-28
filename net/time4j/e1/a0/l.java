package net.time4j.e1.a0;

import java.text.ParseException;
import java.util.Collections;
import java.util.Locale;
import net.time4j.a0;
import net.time4j.d1.n;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.t;
import net.time4j.e1.e;
import net.time4j.e1.g;
import net.time4j.e1.j;
import net.time4j.f0;
import net.time4j.g0;
import net.time4j.h0;
import net.time4j.j0;
import net.time4j.tz.k;
import net.time4j.tz.p;
import net.time4j.y0;

public class l {
  private static final char a;
  
  private static final c b = new c((p<Integer>)g0.A);
  
  private static final c c = new c((p<Integer>)g0.E);
  
  private static final n<o> d = b.a(c);
  
  private static final n<Character> e = new d(null);
  
  public static final c<f0> f = a(false);
  
  public static final c<f0> g = a(true);
  
  public static final c<f0> h = f(false);
  
  public static final c<f0> i = f(true);
  
  public static final c<f0> j = i(false);
  
  public static final c<f0> k = i(true);
  
  public static final c<f0> l = b(true);
  
  static {
    g(false);
    g(true);
    h(false);
    h(true);
    e(false);
    e(true);
  }
  
  private static c<a0> a(e parame, boolean paramBoolean) {
    c.d<a0> d = c.a(a0.class, Locale.ROOT);
    d.a((p<f0>)f0.q, d(paramBoolean), c(paramBoolean));
    d.a('T');
    a(d, paramBoolean);
    d.a(parame, paramBoolean, Collections.singletonList("Z"));
    return d.h();
  }
  
  private static c<f0> a(boolean paramBoolean) {
    c.d<f0> d = c.a(f0.class, Locale.ROOT);
    d.a(net.time4j.e1.a.l, j.c);
    d.a(net.time4j.e1.a.m, '0');
    d.a((p<Integer>)f0.r, 4, 9, x.e);
    if (paramBoolean)
      d.a('-'); 
    d.a((p<Integer>)f0.v, 2);
    if (paramBoolean)
      d.a('-'); 
    d.a((p<Integer>)f0.w, 2);
    d.i();
    d.i();
    return d.h().a(g.c);
  }
  
  public static f0 a(CharSequence paramCharSequence) {
    s s = new s();
    f0 f0 = a(paramCharSequence, s);
    if (f0 != null && !s.i()) {
      if (s.f() >= paramCharSequence.length())
        return f0; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Trailing characters found: ");
      stringBuilder.append(paramCharSequence);
      throw new ParseException(stringBuilder.toString(), s.f());
    } 
    throw new ParseException(s.d(), s.c());
  }
  
  public static f0 a(CharSequence paramCharSequence, s params) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface length : ()I
    //   6: istore #7
    //   8: aload_1
    //   9: invokevirtual f : ()I
    //   12: istore #6
    //   14: iload #7
    //   16: iload #6
    //   18: isub
    //   19: istore #5
    //   21: iload #5
    //   23: bipush #7
    //   25: if_icmpge -> 74
    //   28: new java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore #8
    //   37: aload #8
    //   39: ldc 'Too short to be compatible with ISO-8601: '
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: aload #8
    //   47: aload_0
    //   48: iload #6
    //   50: iload #7
    //   52: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   57: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: aload_1
    //   62: iload #7
    //   64: aload #8
    //   66: invokevirtual toString : ()Ljava/lang/String;
    //   69: invokevirtual a : (ILjava/lang/String;)V
    //   72: aconst_null
    //   73: areturn
    //   74: iload #6
    //   76: iconst_1
    //   77: iadd
    //   78: istore_2
    //   79: iconst_0
    //   80: istore_3
    //   81: iload #5
    //   83: istore #4
    //   85: iload_2
    //   86: iload #7
    //   88: if_icmpge -> 179
    //   91: aload_0
    //   92: iload_2
    //   93: invokeinterface charAt : (I)C
    //   98: istore #4
    //   100: iload #4
    //   102: bipush #45
    //   104: if_icmpeq -> 168
    //   107: iload #4
    //   109: bipush #47
    //   111: if_icmpeq -> 159
    //   114: iload #4
    //   116: bipush #84
    //   118: if_icmpeq -> 159
    //   121: iload #4
    //   123: bipush #87
    //   125: if_icmpeq -> 131
    //   128: goto -> 172
    //   131: iload_3
    //   132: ifle -> 143
    //   135: getstatic net/time4j/e1/a0/l.k : Lnet/time4j/e1/a0/c;
    //   138: astore #8
    //   140: goto -> 148
    //   143: getstatic net/time4j/e1/a0/l.j : Lnet/time4j/e1/a0/c;
    //   146: astore #8
    //   148: aload #8
    //   150: aload_0
    //   151: aload_1
    //   152: invokevirtual a : (Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;)Ljava/lang/Object;
    //   155: checkcast net/time4j/f0
    //   158: areturn
    //   159: iload_2
    //   160: iload #6
    //   162: isub
    //   163: istore #4
    //   165: goto -> 179
    //   168: iload_3
    //   169: iconst_1
    //   170: iadd
    //   171: istore_3
    //   172: iload_2
    //   173: iconst_1
    //   174: iadd
    //   175: istore_2
    //   176: goto -> 81
    //   179: iload_3
    //   180: ifne -> 247
    //   183: iload #4
    //   185: iconst_4
    //   186: isub
    //   187: istore_3
    //   188: aload_0
    //   189: iload #6
    //   191: invokeinterface charAt : (I)C
    //   196: istore #4
    //   198: iload #4
    //   200: bipush #43
    //   202: if_icmpeq -> 214
    //   205: iload_3
    //   206: istore_2
    //   207: iload #4
    //   209: bipush #45
    //   211: if_icmpne -> 218
    //   214: iload_3
    //   215: iconst_2
    //   216: isub
    //   217: istore_2
    //   218: iload_2
    //   219: iconst_3
    //   220: if_icmpne -> 231
    //   223: getstatic net/time4j/e1/a0/l.h : Lnet/time4j/e1/a0/c;
    //   226: astore #8
    //   228: goto -> 236
    //   231: getstatic net/time4j/e1/a0/l.f : Lnet/time4j/e1/a0/c;
    //   234: astore #8
    //   236: aload #8
    //   238: aload_0
    //   239: aload_1
    //   240: invokevirtual a : (Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;)Ljava/lang/Object;
    //   243: checkcast net/time4j/f0
    //   246: areturn
    //   247: iload_3
    //   248: iconst_1
    //   249: if_icmpne -> 264
    //   252: getstatic net/time4j/e1/a0/l.i : Lnet/time4j/e1/a0/c;
    //   255: aload_0
    //   256: aload_1
    //   257: invokevirtual a : (Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;)Ljava/lang/Object;
    //   260: checkcast net/time4j/f0
    //   263: areturn
    //   264: getstatic net/time4j/e1/a0/l.g : Lnet/time4j/e1/a0/c;
    //   267: aload_0
    //   268: aload_1
    //   269: invokevirtual a : (Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;)Ljava/lang/Object;
    //   272: checkcast net/time4j/f0
    //   275: areturn
  }
  
  private static <T extends net.time4j.d1.q<T>> void a(c.d<T> paramd, boolean paramBoolean) {
    paramd.a(net.time4j.e1.a.l, j.c);
    paramd.a(net.time4j.e1.a.m, '0');
    paramd.a((p<Integer>)g0.x, 2);
    paramd.l();
    if (paramBoolean)
      paramd.a(':'); 
    paramd.a((p<Integer>)g0.y, 2);
    paramd.a(d);
    if (paramBoolean)
      paramd.a(':'); 
    paramd.a((p<Integer>)g0.A, 2);
    paramd.a(c);
    if (a == ',') {
      paramd.a(',', '.');
    } else {
      paramd.a('.', ',');
    } 
    j0 j0 = g0.E;
    int i = 0;
    paramd.a((p<Integer>)j0, 0, 9, false);
    while (i < 5) {
      paramd.i();
      i++;
    } 
  }
  
  private static c<f0> b(boolean paramBoolean) {
    c.d<f0> d = c.a(f0.class, Locale.ROOT);
    d.a((p<f0>)f0.q, d(paramBoolean), c(paramBoolean));
    return d.h().a(g.c);
  }
  
  private static d<f0> c(boolean paramBoolean) {
    return new b(paramBoolean);
  }
  
  private static e<f0> d(boolean paramBoolean) {
    return new a(paramBoolean);
  }
  
  private static c<a0> e(boolean paramBoolean) {
    c.d<a0> d = c.a(a0.class, Locale.ROOT);
    d.a(a0.y().h(), a(e.f, paramBoolean), a(e.g, paramBoolean));
    return d.h().a(g.c).a((k)p.m);
  }
  
  private static c<f0> f(boolean paramBoolean) {
    c.d<f0> d = c.a(f0.class, Locale.ROOT);
    d.a(net.time4j.e1.a.l, j.c);
    d.a(net.time4j.e1.a.m, '0');
    d.a((p<Integer>)f0.r, 4, 9, x.e);
    if (paramBoolean)
      d.a('-'); 
    d.a((p<Integer>)f0.y, 3);
    d.i();
    d.i();
    return d.h().a(g.c);
  }
  
  private static c<g0> g(boolean paramBoolean) {
    c.d<g0> d = c.a(g0.class, Locale.ROOT);
    d.a(e, 1);
    a(d, paramBoolean);
    return d.h().a(g.c);
  }
  
  private static c<h0> h(boolean paramBoolean) {
    c.d<h0> d = c.a(h0.class, Locale.ROOT);
    d.a((p<f0>)f0.q, d(paramBoolean), c(paramBoolean));
    d.a('T');
    a(d, paramBoolean);
    return d.h().a(g.c);
  }
  
  private static c<f0> i(boolean paramBoolean) {
    c.d<f0> d = c.a(f0.class, Locale.ROOT);
    d.a(net.time4j.e1.a.l, j.c);
    d.a(net.time4j.e1.a.m, '0');
    d.a((p<Integer>)f0.s, 4, 9, x.e);
    if (paramBoolean)
      d.a('-'); 
    d.a('W');
    d.a((p<Integer>)y0.n.j(), 2);
    if (paramBoolean)
      d.a('-'); 
    d.b((p<Enum>)f0.x, 1);
    d.i();
    d.i();
    return d.h().a(g.c);
  }
  
  static {
    byte b;
    if (Boolean.getBoolean("net.time4j.format.iso.decimal.dot")) {
      b = 46;
    } else {
      b = 44;
    } 
    a = b;
  }
  
  static {
    b(false);
  }
  
  static final class a implements e<f0> {
    a(boolean param1Boolean) {}
    
    public <R> R a(f0 param1f0, Appendable param1Appendable, net.time4j.d1.d param1d, t<o, R> param1t) {
      c<f0> c;
      if (this.a) {
        c = l.g;
      } else {
        c = l.f;
      } 
      c.a(param1f0, param1Appendable, param1d);
      return null;
    }
  }
  
  static final class b implements d<f0> {
    b(boolean param1Boolean) {}
    
    public f0 a(CharSequence param1CharSequence, s param1s, net.time4j.d1.d param1d) {
      // Byte code:
      //   0: aload_1
      //   1: invokeinterface length : ()I
      //   6: istore #9
      //   8: aload_2
      //   9: invokevirtual f : ()I
      //   12: istore #8
      //   14: iload #9
      //   16: iload #8
      //   18: isub
      //   19: istore #7
      //   21: iload #8
      //   23: iconst_1
      //   24: iadd
      //   25: istore #4
      //   27: iconst_0
      //   28: istore #5
      //   30: iload #7
      //   32: istore #6
      //   34: iload #4
      //   36: iload #9
      //   38: if_icmpge -> 135
      //   41: aload_1
      //   42: iload #4
      //   44: invokeinterface charAt : (I)C
      //   49: istore #6
      //   51: iload #6
      //   53: bipush #45
      //   55: if_icmpeq -> 120
      //   58: iload #6
      //   60: bipush #47
      //   62: if_icmpeq -> 110
      //   65: iload #6
      //   67: bipush #84
      //   69: if_icmpeq -> 110
      //   72: iload #6
      //   74: bipush #87
      //   76: if_icmpeq -> 82
      //   79: goto -> 126
      //   82: aload_0
      //   83: getfield a : Z
      //   86: ifeq -> 103
      //   89: getstatic net/time4j/e1/a0/l.k : Lnet/time4j/e1/a0/c;
      //   92: astore_3
      //   93: aload_3
      //   94: aload_1
      //   95: aload_2
      //   96: invokevirtual a : (Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;)Ljava/lang/Object;
      //   99: checkcast net/time4j/f0
      //   102: areturn
      //   103: getstatic net/time4j/e1/a0/l.j : Lnet/time4j/e1/a0/c;
      //   106: astore_3
      //   107: goto -> 93
      //   110: iload #4
      //   112: iload #8
      //   114: isub
      //   115: istore #6
      //   117: goto -> 135
      //   120: iload #5
      //   122: iconst_1
      //   123: iadd
      //   124: istore #5
      //   126: iload #4
      //   128: iconst_1
      //   129: iadd
      //   130: istore #4
      //   132: goto -> 30
      //   135: aload_0
      //   136: getfield a : Z
      //   139: ifeq -> 162
      //   142: iload #5
      //   144: iconst_1
      //   145: if_icmpne -> 155
      //   148: getstatic net/time4j/e1/a0/l.i : Lnet/time4j/e1/a0/c;
      //   151: astore_3
      //   152: goto -> 93
      //   155: getstatic net/time4j/e1/a0/l.g : Lnet/time4j/e1/a0/c;
      //   158: astore_3
      //   159: goto -> 93
      //   162: iload #6
      //   164: iconst_4
      //   165: isub
      //   166: istore #5
      //   168: aload_1
      //   169: iload #8
      //   171: invokeinterface charAt : (I)C
      //   176: istore #6
      //   178: iload #6
      //   180: bipush #43
      //   182: if_icmpeq -> 196
      //   185: iload #5
      //   187: istore #4
      //   189: iload #6
      //   191: bipush #45
      //   193: if_icmpne -> 202
      //   196: iload #5
      //   198: iconst_2
      //   199: isub
      //   200: istore #4
      //   202: iload #4
      //   204: iconst_3
      //   205: if_icmpne -> 215
      //   208: getstatic net/time4j/e1/a0/l.h : Lnet/time4j/e1/a0/c;
      //   211: astore_3
      //   212: goto -> 93
      //   215: getstatic net/time4j/e1/a0/l.f : Lnet/time4j/e1/a0/c;
      //   218: astore_3
      //   219: goto -> 93
    }
  }
  
  private static class c implements n<o> {
    private final p<Integer> c;
    
    c(p<Integer> param1p) {
      this.c = param1p;
    }
    
    n<o> a(c param1c) {
      return new a(this, param1c);
    }
    
    public boolean a(o param1o) {
      return (param1o.a(this.c) > 0);
    }
    
    class a implements n<o> {
      a(l.c this$0, l.c param2c1) {}
      
      public boolean a(o param2o) {
        return (this.d.a(param2o) || this.c.a(param2o));
      }
    }
  }
  
  class a implements n<o> {
    a(l this$0, l.c param1c1) {}
    
    public boolean a(o param1o) {
      return (this.d.a(param1o) || this.c.a(param1o));
    }
  }
  
  private static class d implements n<Character> {
    private d() {}
    
    public boolean a(Character param1Character) {
      return (param1Character.charValue() == 'T');
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */