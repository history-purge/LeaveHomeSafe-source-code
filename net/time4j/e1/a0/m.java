package net.time4j.e1.a0;

import java.util.Locale;
import java.util.Set;
import net.time4j.d1.c;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.e1.a;
import net.time4j.e1.b;

final class m implements h<Void> {
  private final char c;
  
  private final char d;
  
  private final String e;
  
  private final c<Character> f;
  
  private final boolean g;
  
  private final boolean h;
  
  private final boolean i;
  
  m(char paramChar1, char paramChar2) {
    this.c = paramChar1;
    this.d = paramChar2;
    this.f = null;
    this.e = null;
    if (paramChar1 >= ' ' && paramChar2 >= ' ') {
      if (!Character.isDigit(paramChar1) && !Character.isDigit(paramChar2)) {
        this.g = true;
        this.h = false;
        this.i = false;
        return;
      } 
      throw new IllegalArgumentException("Literal must not be a decimal digit.");
    } 
    throw new IllegalArgumentException("Literal must not start with non-printable char.");
  }
  
  private m(char paramChar1, char paramChar2, String paramString, c<Character> paramc, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.c = paramChar1;
    this.d = paramChar2;
    this.e = paramString;
    this.f = paramc;
    this.g = paramBoolean1;
    this.h = paramBoolean2;
    this.i = paramBoolean3;
  }
  
  m(String paramString) {
    if (!paramString.isEmpty()) {
      this.c = paramString.charAt(0);
      char c1 = this.c;
      this.d = c1;
      this.f = null;
      this.e = paramString;
      if (c1 >= ' ') {
        boolean bool = true;
        this.g = true;
        if (paramString.length() != 1 || !b(this.c))
          bool = false; 
        this.h = bool;
        this.i = false;
        return;
      } 
      throw new IllegalArgumentException("Literal must not start with non-printable char.");
    } 
    throw new IllegalArgumentException("Missing literal.");
  }
  
  m(c<Character> paramc) {
    if (paramc != null) {
      this.c = Character.MIN_VALUE;
      this.d = this.c;
      this.f = paramc;
      this.e = null;
      this.g = true;
      this.h = false;
      this.i = false;
      return;
    } 
    throw new NullPointerException("Missing format attribute.");
  }
  
  static int a(CharSequence paramCharSequence1, int paramInt, CharSequence paramCharSequence2, boolean paramBoolean1, boolean paramBoolean2) {
    int k = paramCharSequence1.length();
    int n = paramCharSequence2.length();
    int j = 0;
    int i = 0;
    while (j < n) {
      char c1 = paramCharSequence2.charAt(j);
      if (!a(c1)) {
        char c2;
        int i1;
        if (paramBoolean2) {
          c2 = Character.MIN_VALUE;
          while (true) {
            int i2 = i + paramInt;
            i1 = i;
            if (i2 < k) {
              char c3 = paramCharSequence1.charAt(i2);
              i1 = i;
              c2 = c3;
              if (a(c3)) {
                i++;
                c2 = c3;
                continue;
              } 
            } 
            break;
          } 
        } else {
          i1 = i + paramInt;
          if (i1 < k) {
            c2 = paramCharSequence1.charAt(i1);
            i1 = i;
          } else {
            c2 = Character.MIN_VALUE;
            i1 = i;
          } 
        } 
        if (i1 + paramInt >= k)
          return -1; 
        i = i1 + 1;
        if (paramBoolean1) {
          if (!a(c2, c1))
            return -1; 
        } else if (c2 != c1) {
          return -1;
        } 
      } 
      j++;
    } 
    j = i;
    if (paramBoolean2)
      while (true) {
        int i1 = i + paramInt;
        j = i;
        if (i1 < k) {
          j = i;
          if (a(paramCharSequence1.charAt(i1))) {
            i++;
            continue;
          } 
        } 
        break;
      }  
    return j;
  }
  
  private void a(CharSequence paramCharSequence, s params) {
    int i = params.f();
    StringBuilder stringBuilder = new StringBuilder("Cannot parse: \"");
    stringBuilder.append(paramCharSequence);
    stringBuilder.append("\" (expected: [");
    stringBuilder.append(this.e);
    stringBuilder.append("], found: [");
    stringBuilder.append(paramCharSequence.subSequence(i, Math.min(this.e.length() + i, paramCharSequence.length())));
    stringBuilder.append("])");
    params.a(i, stringBuilder.toString());
  }
  
  private void a(CharSequence paramCharSequence, s params, d paramd, boolean paramBoolean) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual f : ()I
    //   4: istore #12
    //   6: aload_0
    //   7: getfield c : C
    //   10: istore #6
    //   12: aload_0
    //   13: getfield f : Lnet/time4j/d1/c;
    //   16: astore #13
    //   18: iconst_0
    //   19: istore #11
    //   21: aload #13
    //   23: ifnull -> 46
    //   26: aload_3
    //   27: aload #13
    //   29: iconst_0
    //   30: invokestatic valueOf : (C)Ljava/lang/Character;
    //   33: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   38: checkcast java/lang/Character
    //   41: invokevirtual charValue : ()C
    //   44: istore #6
    //   46: iload #12
    //   48: aload_1
    //   49: invokeinterface length : ()I
    //   54: if_icmpge -> 301
    //   57: iload #6
    //   59: ifeq -> 301
    //   62: iload #6
    //   64: invokestatic isDigit : (C)Z
    //   67: ifeq -> 73
    //   70: goto -> 301
    //   73: aload_1
    //   74: iload #12
    //   76: invokeinterface charAt : (I)C
    //   81: istore #8
    //   83: aload_0
    //   84: getfield d : C
    //   87: istore #7
    //   89: iload #7
    //   91: istore #5
    //   93: aload_0
    //   94: getfield f : Lnet/time4j/d1/c;
    //   97: ifnull -> 184
    //   100: iload #7
    //   102: istore #5
    //   104: getstatic net/time4j/e1/a.o : Lnet/time4j/d1/c;
    //   107: invokeinterface name : ()Ljava/lang/String;
    //   112: aload_0
    //   113: getfield f : Lnet/time4j/d1/c;
    //   116: invokeinterface name : ()Ljava/lang/String;
    //   121: invokevirtual equals : (Ljava/lang/Object;)Z
    //   124: ifeq -> 184
    //   127: iload #7
    //   129: istore #5
    //   131: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   134: aload_3
    //   135: getstatic net/time4j/e1/a.c : Lnet/time4j/d1/c;
    //   138: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   141: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   146: invokevirtual equals : (Ljava/lang/Object;)Z
    //   149: ifeq -> 184
    //   152: bipush #46
    //   154: istore #5
    //   156: iload #6
    //   158: bipush #44
    //   160: if_icmpne -> 166
    //   163: goto -> 184
    //   166: iload #6
    //   168: bipush #46
    //   170: if_icmpne -> 180
    //   173: bipush #44
    //   175: istore #5
    //   177: goto -> 184
    //   180: iload #6
    //   182: istore #5
    //   184: iload #8
    //   186: iload #6
    //   188: if_icmpeq -> 204
    //   191: iload #8
    //   193: iload #5
    //   195: if_icmpeq -> 204
    //   198: iconst_1
    //   199: istore #9
    //   201: goto -> 207
    //   204: iconst_0
    //   205: istore #9
    //   207: iload #9
    //   209: ifeq -> 290
    //   212: iload #4
    //   214: ifeq -> 226
    //   217: aload_0
    //   218: getfield g : Z
    //   221: istore #4
    //   223: goto -> 246
    //   226: aload_3
    //   227: getstatic net/time4j/e1/a.i : Lnet/time4j/d1/c;
    //   230: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   233: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   238: checkcast java/lang/Boolean
    //   241: invokevirtual booleanValue : ()Z
    //   244: istore #4
    //   246: iload #4
    //   248: ifeq -> 290
    //   251: iload #8
    //   253: istore #7
    //   255: iload #11
    //   257: istore #10
    //   259: iload #8
    //   261: iload #6
    //   263: invokestatic a : (CC)Z
    //   266: ifne -> 307
    //   269: iload #8
    //   271: iload #5
    //   273: invokestatic a : (CC)Z
    //   276: ifeq -> 290
    //   279: iload #8
    //   281: istore #7
    //   283: iload #11
    //   285: istore #10
    //   287: goto -> 307
    //   290: iload #8
    //   292: istore #7
    //   294: iload #9
    //   296: istore #10
    //   298: goto -> 307
    //   301: iconst_0
    //   302: istore #7
    //   304: iconst_1
    //   305: istore #10
    //   307: iload #10
    //   309: ifeq -> 379
    //   312: new java/lang/StringBuilder
    //   315: dup
    //   316: ldc 'Cannot parse: "'
    //   318: invokespecial <init> : (Ljava/lang/String;)V
    //   321: astore_3
    //   322: aload_3
    //   323: aload_1
    //   324: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    //   327: pop
    //   328: aload_3
    //   329: ldc '" (expected: ['
    //   331: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: pop
    //   335: aload_3
    //   336: iload #6
    //   338: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   341: pop
    //   342: aload_3
    //   343: ldc '], found: ['
    //   345: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: pop
    //   349: iload #7
    //   351: ifeq -> 361
    //   354: aload_3
    //   355: iload #7
    //   357: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   360: pop
    //   361: aload_3
    //   362: ldc '])'
    //   364: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: pop
    //   368: aload_2
    //   369: iload #12
    //   371: aload_3
    //   372: invokevirtual toString : ()Ljava/lang/String;
    //   375: invokevirtual a : (ILjava/lang/String;)V
    //   378: return
    //   379: aload_2
    //   380: iload #12
    //   382: iconst_1
    //   383: iadd
    //   384: invokevirtual a : (I)V
    //   387: return
  }
  
  private static boolean a(char paramChar) {
    return (paramChar == '‎' || paramChar == '‏' || paramChar == '؜');
  }
  
  private static boolean a(char paramChar1, char paramChar2) {
    return (paramChar1 == paramChar2 || Character.toUpperCase(paramChar1) == Character.toUpperCase(paramChar2) || Character.toLowerCase(paramChar1) == Character.toLowerCase(paramChar2));
  }
  
  private void b(CharSequence paramCharSequence, s params, d paramd, boolean paramBoolean) {
    boolean bool;
    int i = params.f();
    if (paramBoolean) {
      bool = this.g;
    } else {
      bool = ((Boolean)paramd.a(a.i, Boolean.TRUE)).booleanValue();
    } 
    if (paramBoolean) {
      paramBoolean = this.i;
    } else {
      paramBoolean = b.b((Locale)paramd.a(a.c, Locale.ROOT));
    } 
    int j = a(paramCharSequence, i, this.e, bool, paramBoolean);
    if (j == -1) {
      a(paramCharSequence, params);
      return;
    } 
    params.a(i + j);
  }
  
  private static boolean b(char paramChar) {
    return (!Character.isLetter(paramChar) && !Character.isDigit(paramChar) && !a(paramChar));
  }
  
  public int a(o paramo, Appendable paramAppendable, d paramd, Set<g> paramSet, boolean paramBoolean) {
    c<Character> c1 = this.f;
    if (c1 != null) {
      char c2 = ((Character)paramd.a(c1, null)).charValue();
      paramAppendable.append(c2);
      return 1;
    } 
    String str = this.e;
    if (str == null) {
      char c2 = this.c;
      paramAppendable.append(c2);
      return 1;
    } 
    paramAppendable.append(str);
    return this.e.length();
  }
  
  public h<Void> a(p<Void> paramp) {
    return this;
  }
  
  public h<Void> a(c<?> paramc, d paramd, int paramInt) {
    boolean bool;
    boolean bool1 = b.b((Locale)paramd.a(a.c, Locale.ROOT));
    char c1 = this.c;
    char c2 = this.d;
    String str = this.e;
    c<Character> c3 = this.f;
    boolean bool2 = ((Boolean)paramd.a(a.i, Boolean.TRUE)).booleanValue();
    if (this.h && !bool1) {
      bool = true;
    } else {
      bool = false;
    } 
    return new m(c1, c2, str, c3, bool2, bool, bool1);
  }
  
  public void a(CharSequence paramCharSequence, s params, d paramd, t<?> paramt, boolean paramBoolean) {
    if (paramBoolean && this.h) {
      int i = params.f();
      if (i < paramCharSequence.length() && paramCharSequence.charAt(i) == this.c) {
        params.a(i + 1);
        return;
      } 
      if (this.c != '.' || !((Boolean)paramd.a(a.k, Boolean.TRUE)).booleanValue()) {
        a(paramCharSequence, params);
        return;
      } 
    } else {
      if (this.e == null) {
        a(paramCharSequence, params, paramd, paramBoolean);
        return;
      } 
      b(paramCharSequence, params, paramd, paramBoolean);
    } 
  }
  
  public boolean a() {
    String str = this.e;
    boolean bool = false;
    if (str == null)
      return false; 
    if (c() == this.e.length())
      bool = true; 
    return bool;
  }
  
  public p<Void> b() {
    return null;
  }
  
  int c() {
    String str = this.e;
    int i = 0;
    if (str == null)
      return 0; 
    int k = str.length();
    int j = 0;
    while (i < k && Character.isDigit(this.e.charAt(i))) {
      j++;
      i++;
    } 
    return j;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof m) {
      paramObject = paramObject;
      c<Character> c1 = this.f;
      if (c1 != null)
        return c1.equals(((m)paramObject).f); 
      String str = this.e;
      return (str == null) ? ((((m)paramObject).e == null && this.c == ((m)paramObject).c && this.d == ((m)paramObject).d)) : ((str.equals(((m)paramObject).e) && this.h == ((m)paramObject).h));
    } 
    return false;
  }
  
  public int hashCode() {
    String str;
    c<Character> c2 = this.f;
    if (c2 == null) {
      String str1 = this.e;
      str = str1;
      if (str1 == null)
        str = ""; 
    } else {
      str = str.name();
    } 
    char c1 = this.c;
    return str.hashCode() ^ c1;
  }
  
  public String toString() {
    char c1;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(m.class.getName());
    stringBuilder.append("[literal=");
    if (this.f != null) {
      stringBuilder.append('{');
      stringBuilder.append(this.f);
      c1 = '}';
    } else {
      String str = this.e;
      if (str == null) {
        stringBuilder.append(this.c);
        if (this.d != this.c) {
          stringBuilder.append(", alternative=");
          c1 = this.d;
        } else {
          stringBuilder.append(']');
          return stringBuilder.toString();
        } 
      } else {
        stringBuilder.append(str);
        stringBuilder.append(']');
        return stringBuilder.toString();
      } 
    } 
    stringBuilder.append(c1);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */