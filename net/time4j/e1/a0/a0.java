package net.time4j.e1.a0;

import java.util.Locale;
import java.util.Set;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.e1.a;
import net.time4j.e1.b0.d;
import net.time4j.e1.g;
import net.time4j.e1.m;
import net.time4j.e1.u;
import net.time4j.e1.w;

final class a0<V> implements h<V> {
  private final u<V> c;
  
  private final boolean d;
  
  private final d<V> e;
  
  private final Locale f;
  
  private final w g;
  
  private final m h;
  
  private final g i;
  
  private final int j;
  
  private a0(u<V> paramu, boolean paramBoolean, Locale paramLocale, w paramw, m paramm, g paramg, int paramInt) {
    if (paramu != null) {
      this.c = paramu;
      this.d = paramBoolean;
      if (paramu instanceof d) {
        d d1 = (d)paramu;
      } else {
        paramu = null;
      } 
      this.e = (d<V>)paramu;
      this.f = paramLocale;
      this.g = paramw;
      this.h = paramm;
      this.i = paramg;
      this.j = paramInt;
      return;
    } 
    throw new NullPointerException("Missing element.");
  }
  
  static <V> a0<V> a(u<V> paramu) {
    return new a0<V>(paramu, false, Locale.ROOT, w.c, m.c, g.d, 0);
  }
  
  private boolean a(o paramo, Appendable paramAppendable, d paramd, boolean paramBoolean) {
    d<V> d1 = this.e;
    if (d1 != null && paramBoolean) {
      d1.a(paramo, paramAppendable, this.f, this.g, this.h);
      return true;
    } 
    if (paramo.c((p)this.c)) {
      this.c.a(paramo, paramAppendable, paramd);
      return true;
    } 
    return false;
  }
  
  public int a(o paramo, Appendable paramAppendable, d paramd, Set<g> paramSet, boolean paramBoolean) {
    if (paramAppendable instanceof CharSequence) {
      CharSequence charSequence = (CharSequence)paramAppendable;
      int i = charSequence.length();
      if (a(paramo, paramAppendable, paramd, paramBoolean)) {
        if (paramSet != null)
          paramSet.add(new g((p<?>)this.c, i, charSequence.length())); 
        return charSequence.length() - i;
      } 
    } else if (a(paramo, paramAppendable, paramd, paramBoolean)) {
      return Integer.MAX_VALUE;
    } 
    return -1;
  }
  
  public h<V> a(p<V> paramp) {
    if (!this.d) {
      if (this.c == paramp)
        return this; 
      if (paramp instanceof u)
        return a((u<V>)paramp); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Text element required: ");
      stringBuilder.append(paramp.getClass().getName());
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return this;
  }
  
  public h<V> a(c<?> paramc, d paramd, int paramInt) {
    g g1 = (g)paramd.a(a.f, g.d);
    boolean bool1 = ((Boolean)paramd.a(a.k, Boolean.TRUE)).booleanValue();
    boolean bool2 = ((Boolean)paramd.a(a.i, Boolean.TRUE)).booleanValue();
    boolean bool3 = ((Boolean)paramd.a(a.j, Boolean.FALSE)).booleanValue();
    if ((g1 == g.c && (bool1 || bool2 || bool3)) || (g1 == g.d && (!bool1 || !bool2 || bool3)) || !bool1 || !bool2 || !bool3)
      g1 = null; 
    return new a0(this.c, this.d, (Locale)paramd.a(a.c, Locale.ROOT), (w)paramd.a(a.g, w.c), (m)paramd.a(a.h, m.c), g1, ((Integer)paramd.a(a.s, Integer.valueOf(0))).intValue());
  }
  
  public void a(CharSequence paramCharSequence, s params, d paramd, t<?> paramt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual f : ()I
    //   4: istore #9
    //   6: aload_1
    //   7: invokeinterface length : ()I
    //   12: istore #8
    //   14: iload #5
    //   16: ifeq -> 28
    //   19: aload_0
    //   20: getfield j : I
    //   23: istore #6
    //   25: goto -> 49
    //   28: aload_3
    //   29: getstatic net/time4j/e1/a.s : Lnet/time4j/d1/c;
    //   32: iconst_0
    //   33: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   36: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   41: checkcast java/lang/Integer
    //   44: invokevirtual intValue : ()I
    //   47: istore #6
    //   49: iload #8
    //   51: istore #7
    //   53: iload #6
    //   55: ifle -> 65
    //   58: iload #8
    //   60: iload #6
    //   62: isub
    //   63: istore #7
    //   65: iload #9
    //   67: iload #7
    //   69: if_icmplt -> 116
    //   72: new java/lang/StringBuilder
    //   75: dup
    //   76: invokespecial <init> : ()V
    //   79: astore_1
    //   80: aload_1
    //   81: ldc 'Missing chars for: '
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload_1
    //   88: aload_0
    //   89: getfield c : Lnet/time4j/e1/u;
    //   92: invokeinterface name : ()Ljava/lang/String;
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload_2
    //   102: iload #9
    //   104: aload_1
    //   105: invokevirtual toString : ()Ljava/lang/String;
    //   108: invokevirtual a : (ILjava/lang/String;)V
    //   111: aload_2
    //   112: invokevirtual k : ()V
    //   115: return
    //   116: iload #5
    //   118: ifeq -> 171
    //   121: aload_0
    //   122: getfield e : Lnet/time4j/e1/b0/d;
    //   125: astore #10
    //   127: aload #10
    //   129: ifnull -> 171
    //   132: aload_0
    //   133: getfield i : Lnet/time4j/e1/g;
    //   136: ifnull -> 171
    //   139: aload #10
    //   141: aload_1
    //   142: aload_2
    //   143: invokevirtual e : ()Ljava/text/ParsePosition;
    //   146: aload_0
    //   147: getfield f : Ljava/util/Locale;
    //   150: aload_0
    //   151: getfield g : Lnet/time4j/e1/w;
    //   154: aload_0
    //   155: getfield h : Lnet/time4j/e1/m;
    //   158: aload_0
    //   159: getfield i : Lnet/time4j/e1/g;
    //   162: invokeinterface a : (Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/util/Locale;Lnet/time4j/e1/w;Lnet/time4j/e1/m;Lnet/time4j/e1/g;)Ljava/lang/Object;
    //   167: astore_1
    //   168: goto -> 221
    //   171: aload_0
    //   172: getfield c : Lnet/time4j/e1/u;
    //   175: astore #10
    //   177: aload #10
    //   179: instanceof net/time4j/e1/b0/a
    //   182: ifeq -> 207
    //   185: aload #10
    //   187: checkcast net/time4j/e1/b0/a
    //   190: aload_1
    //   191: aload_2
    //   192: invokevirtual e : ()Ljava/text/ParsePosition;
    //   195: aload_3
    //   196: aload #4
    //   198: invokeinterface a : (Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lnet/time4j/d1/d;Lnet/time4j/d1/q;)Ljava/lang/Integer;
    //   203: astore_1
    //   204: goto -> 221
    //   207: aload #10
    //   209: aload_1
    //   210: aload_2
    //   211: invokevirtual e : ()Ljava/text/ParsePosition;
    //   214: aload_3
    //   215: invokeinterface a : (Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lnet/time4j/d1/d;)Ljava/lang/Object;
    //   220: astore_1
    //   221: aload_2
    //   222: invokevirtual i : ()Z
    //   225: ifeq -> 332
    //   228: aload_0
    //   229: getfield c : Lnet/time4j/e1/u;
    //   232: invokeinterface getType : ()Ljava/lang/Class;
    //   237: astore_1
    //   238: aload_1
    //   239: invokevirtual isEnum : ()Z
    //   242: ifeq -> 286
    //   245: aload_2
    //   246: invokevirtual c : ()I
    //   249: istore #6
    //   251: new java/lang/StringBuilder
    //   254: dup
    //   255: invokespecial <init> : ()V
    //   258: astore_3
    //   259: aload_3
    //   260: ldc 'No suitable enum found: '
    //   262: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: pop
    //   266: aload_3
    //   267: aload_1
    //   268: invokevirtual getName : ()Ljava/lang/String;
    //   271: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: pop
    //   275: aload_2
    //   276: iload #6
    //   278: aload_3
    //   279: invokevirtual toString : ()Ljava/lang/String;
    //   282: invokevirtual a : (ILjava/lang/String;)V
    //   285: return
    //   286: aload_2
    //   287: invokevirtual c : ()I
    //   290: istore #6
    //   292: new java/lang/StringBuilder
    //   295: dup
    //   296: invokespecial <init> : ()V
    //   299: astore_1
    //   300: aload_1
    //   301: ldc 'Unparseable element: '
    //   303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: pop
    //   307: aload_1
    //   308: aload_0
    //   309: getfield c : Lnet/time4j/e1/u;
    //   312: invokeinterface name : ()Ljava/lang/String;
    //   317: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: pop
    //   321: aload_2
    //   322: iload #6
    //   324: aload_1
    //   325: invokevirtual toString : ()Ljava/lang/String;
    //   328: invokevirtual a : (ILjava/lang/String;)V
    //   331: return
    //   332: aload_1
    //   333: ifnonnull -> 345
    //   336: aload_2
    //   337: iload #9
    //   339: ldc 'No interpretable value.'
    //   341: invokevirtual a : (ILjava/lang/String;)V
    //   344: return
    //   345: aload_0
    //   346: getfield c : Lnet/time4j/e1/u;
    //   349: astore_2
    //   350: aload_2
    //   351: getstatic net/time4j/f0.u : Lnet/time4j/c0;
    //   354: if_acmpne -> 379
    //   357: aload #4
    //   359: getstatic net/time4j/f0.v : Lnet/time4j/j0;
    //   362: ldc_w net/time4j/b0
    //   365: aload_1
    //   366: invokevirtual cast : (Ljava/lang/Object;)Ljava/lang/Object;
    //   369: checkcast net/time4j/b0
    //   372: invokevirtual a : ()I
    //   375: invokevirtual b : (Lnet/time4j/d1/p;I)V
    //   378: return
    //   379: aload #4
    //   381: aload_2
    //   382: aload_1
    //   383: invokevirtual c : (Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   386: return
  }
  
  public boolean a() {
    return false;
  }
  
  public p<V> b() {
    return (p<V>)this.c;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof a0) {
      paramObject = paramObject;
      return (this.c.equals(((a0)paramObject).c) && this.d == ((a0)paramObject).d);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.c.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append(a0.class.getName());
    stringBuilder.append("[element=");
    stringBuilder.append(this.c.name());
    stringBuilder.append(",protected-mode=");
    stringBuilder.append(this.d);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */