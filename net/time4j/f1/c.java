package net.time4j.f1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import net.time4j.e1.b0.b;
import net.time4j.e1.e;
import net.time4j.e1.m;
import net.time4j.e1.v;
import net.time4j.e1.w;

public final class c implements v, b {
  private static final Set<String> a;
  
  static {
    String[] arrayOfString = e.a("i18n/names/iso8601", Locale.ROOT).b("languages").split(" ");
    HashSet<? super String> hashSet1 = new HashSet();
    Collections.addAll(hashSet1, arrayOfString);
    a = Collections.unmodifiableSet((Set)hashSet1);
    HashSet<Locale> hashSet = new HashSet();
    Iterator<String> iterator = a.iterator();
    while (iterator.hasNext())
      hashSet.add(new Locale(iterator.next())); 
    d[] arrayOfD = d.values();
    int j = arrayOfD.length;
    for (int i = 0; i < j; i++)
      hashSet.add(new Locale(arrayOfD[i].name())); 
    Collections.unmodifiableSet(hashSet);
  }
  
  private static char a(e parame) {
    return Character.toLowerCase(parame.name().charAt(0));
  }
  
  private static String a(String paramString, w paramw, m paramm) {
    char c2 = paramw.name().charAt(0);
    char c1 = c2;
    if (paramm == m.c)
      c1 = Character.toLowerCase(c2); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("P(");
    stringBuilder.append(String.valueOf(c1));
    stringBuilder.append(")_");
    stringBuilder.append(paramString);
    return stringBuilder.toString();
  }
  
  private static String a(e parame, String paramString) {
    return (parame.a("useShortKeys") && "true".equals(parame.b("useShortKeys"))) ? paramString.substring(0, 1) : paramString;
  }
  
  private static String[] a(Locale paramLocale, w paramw) {
    String[] arrayOfString;
    e e = b(paramLocale);
    String str = null;
    w w1 = null;
    if (e != null) {
      w w2 = paramw;
      if (paramw == w.e)
        w2 = w.d; 
      str = a(e, "ERA");
      paramw = w1;
      if (w2 == w.f)
        paramw = w.d; 
      String[] arrayOfString1 = a(e, 5, str, w2, paramw, m.c, 0);
      arrayOfString = arrayOfString1;
      if (arrayOfString1 == null) {
        w1 = w.d;
        arrayOfString = arrayOfString1;
        if (w2 != w1)
          arrayOfString = a(paramLocale, w1); 
      } 
    } 
    if (arrayOfString != null)
      return arrayOfString; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot find ISO-8601-resource for era and locale: ");
    stringBuilder.append(paramLocale);
    throw new MissingResourceException(stringBuilder.toString(), c.class.getName(), paramLocale.toString());
  }
  
  private static String[] a(Locale paramLocale, w paramw, m paramm) {
    e e = b(paramLocale);
    if (e != null) {
      w w2 = paramw;
      if (paramw == w.e)
        w2 = w.d; 
      String str1 = a("am", w2, paramm);
      String str2 = a("pm", w2, paramm);
      if (e.a(str1) && e.a(str2))
        return new String[] { e.b(str1), e.b(str2) }; 
      if (paramm == m.d) {
        w w3 = w.d;
        return (w2 == w3) ? a(paramLocale, w2, m.c) : a(paramLocale, w3, paramm);
      } 
      w w1 = w.d;
      if (w2 != w1)
        return a(paramLocale, w1, paramm); 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot find ISO-8601-resource for am/pm and locale: ");
    stringBuilder.append(paramLocale);
    throw new MissingResourceException(stringBuilder.toString(), c.class.getName(), paramLocale.toString());
  }
  
  private static String[] a(e parame, int paramInt1, String paramString, w paramw1, w paramw2, m paramm, int paramInt2) {
    boolean bool;
    String[] arrayOfString = new String[paramInt1];
    if (paramString.length() == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    for (int i = 0; i < paramInt1; i++) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append('(');
      String str2 = paramw1.name();
      if (bool) {
        char c2 = str2.charAt(0);
        char c1 = c2;
        if (paramm != m.d)
          c1 = Character.toLowerCase(c2); 
        stringBuilder.append(c1);
      } else {
        stringBuilder.append(str2);
        if (paramm == m.d) {
          stringBuilder.append('|');
          stringBuilder.append(paramm.name());
        } 
      } 
      stringBuilder.append(')');
      stringBuilder.append('_');
      stringBuilder.append(i + paramInt2);
      String str1 = stringBuilder.toString();
      if (parame.a(str1)) {
        arrayOfString[i] = parame.b(str1);
      } else if (paramw2 != null) {
        String[] arrayOfString1 = a(parame, paramInt1, paramString, paramw2, null, paramm, paramInt2);
        if (arrayOfString1 != null) {
          arrayOfString[i] = arrayOfString1[i];
        } else {
          return null;
        } 
      } else {
        return null;
      } 
    } 
    return arrayOfString;
  }
  
  private static e b(Locale paramLocale) {
    return e.a("i18n/names/iso8601", paramLocale);
  }
  
  private static String[] b(Locale paramLocale, w paramw, m paramm) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic b : (Ljava/util/Locale;)Lnet/time4j/f1/e;
    //   4: astore #4
    //   6: aload #4
    //   8: ifnull -> 114
    //   11: aload_1
    //   12: astore_3
    //   13: aload_1
    //   14: getstatic net/time4j/e1/w.e : Lnet/time4j/e1/w;
    //   17: if_acmpne -> 24
    //   20: getstatic net/time4j/e1/w.d : Lnet/time4j/e1/w;
    //   23: astore_3
    //   24: aload #4
    //   26: bipush #12
    //   28: aload #4
    //   30: ldc 'MONTH_OF_YEAR'
    //   32: invokestatic a : (Lnet/time4j/f1/e;Ljava/lang/String;)Ljava/lang/String;
    //   35: aload_3
    //   36: aconst_null
    //   37: aload_2
    //   38: iconst_1
    //   39: invokestatic a : (Lnet/time4j/f1/e;ILjava/lang/String;Lnet/time4j/e1/w;Lnet/time4j/e1/w;Lnet/time4j/e1/m;I)[Ljava/lang/String;
    //   42: astore #4
    //   44: aload #4
    //   46: astore_1
    //   47: aload #4
    //   49: ifnonnull -> 116
    //   52: aload_2
    //   53: getstatic net/time4j/e1/m.d : Lnet/time4j/e1/m;
    //   56: if_acmpne -> 72
    //   59: aload #4
    //   61: astore_1
    //   62: aload_3
    //   63: getstatic net/time4j/e1/w.f : Lnet/time4j/e1/w;
    //   66: if_acmpeq -> 116
    //   69: goto -> 83
    //   72: aload_3
    //   73: getstatic net/time4j/e1/w.d : Lnet/time4j/e1/w;
    //   76: if_acmpne -> 97
    //   79: getstatic net/time4j/e1/w.c : Lnet/time4j/e1/w;
    //   82: astore_3
    //   83: getstatic net/time4j/e1/m.c : Lnet/time4j/e1/m;
    //   86: astore_1
    //   87: aload_0
    //   88: aload_3
    //   89: aload_1
    //   90: invokestatic b : (Ljava/util/Locale;Lnet/time4j/e1/w;Lnet/time4j/e1/m;)[Ljava/lang/String;
    //   93: astore_1
    //   94: goto -> 116
    //   97: aload #4
    //   99: astore_1
    //   100: aload_3
    //   101: getstatic net/time4j/e1/w.f : Lnet/time4j/e1/w;
    //   104: if_acmpne -> 116
    //   107: getstatic net/time4j/e1/m.d : Lnet/time4j/e1/m;
    //   110: astore_1
    //   111: goto -> 87
    //   114: aconst_null
    //   115: astore_1
    //   116: aload_1
    //   117: ifnull -> 122
    //   120: aload_1
    //   121: areturn
    //   122: new java/lang/StringBuilder
    //   125: dup
    //   126: invokespecial <init> : ()V
    //   129: astore_1
    //   130: aload_1
    //   131: ldc 'Cannot find ISO-8601-month for locale: '
    //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: aload_1
    //   138: aload_0
    //   139: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: new java/util/MissingResourceException
    //   146: dup
    //   147: aload_1
    //   148: invokevirtual toString : ()Ljava/lang/String;
    //   151: ldc net/time4j/f1/c
    //   153: invokevirtual getName : ()Ljava/lang/String;
    //   156: aload_0
    //   157: invokevirtual toString : ()Ljava/lang/String;
    //   160: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   163: astore_0
    //   164: goto -> 169
    //   167: aload_0
    //   168: athrow
    //   169: goto -> 167
  }
  
  private static String[] c(Locale paramLocale, w paramw, m paramm) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic b : (Ljava/util/Locale;)Lnet/time4j/f1/e;
    //   4: astore #4
    //   6: aload #4
    //   8: ifnull -> 113
    //   11: aload_1
    //   12: astore_3
    //   13: aload_1
    //   14: getstatic net/time4j/e1/w.e : Lnet/time4j/e1/w;
    //   17: if_acmpne -> 24
    //   20: getstatic net/time4j/e1/w.d : Lnet/time4j/e1/w;
    //   23: astore_3
    //   24: aload #4
    //   26: iconst_4
    //   27: aload #4
    //   29: ldc 'QUARTER_OF_YEAR'
    //   31: invokestatic a : (Lnet/time4j/f1/e;Ljava/lang/String;)Ljava/lang/String;
    //   34: aload_3
    //   35: aconst_null
    //   36: aload_2
    //   37: iconst_1
    //   38: invokestatic a : (Lnet/time4j/f1/e;ILjava/lang/String;Lnet/time4j/e1/w;Lnet/time4j/e1/w;Lnet/time4j/e1/m;I)[Ljava/lang/String;
    //   41: astore #4
    //   43: aload #4
    //   45: astore_1
    //   46: aload #4
    //   48: ifnonnull -> 115
    //   51: aload_2
    //   52: getstatic net/time4j/e1/m.d : Lnet/time4j/e1/m;
    //   55: if_acmpne -> 71
    //   58: aload #4
    //   60: astore_1
    //   61: aload_3
    //   62: getstatic net/time4j/e1/w.f : Lnet/time4j/e1/w;
    //   65: if_acmpeq -> 115
    //   68: goto -> 82
    //   71: aload_3
    //   72: getstatic net/time4j/e1/w.d : Lnet/time4j/e1/w;
    //   75: if_acmpne -> 96
    //   78: getstatic net/time4j/e1/w.c : Lnet/time4j/e1/w;
    //   81: astore_3
    //   82: getstatic net/time4j/e1/m.c : Lnet/time4j/e1/m;
    //   85: astore_1
    //   86: aload_0
    //   87: aload_3
    //   88: aload_1
    //   89: invokestatic c : (Ljava/util/Locale;Lnet/time4j/e1/w;Lnet/time4j/e1/m;)[Ljava/lang/String;
    //   92: astore_1
    //   93: goto -> 115
    //   96: aload #4
    //   98: astore_1
    //   99: aload_3
    //   100: getstatic net/time4j/e1/w.f : Lnet/time4j/e1/w;
    //   103: if_acmpne -> 115
    //   106: getstatic net/time4j/e1/m.d : Lnet/time4j/e1/m;
    //   109: astore_1
    //   110: goto -> 86
    //   113: aconst_null
    //   114: astore_1
    //   115: aload_1
    //   116: ifnull -> 121
    //   119: aload_1
    //   120: areturn
    //   121: new java/lang/StringBuilder
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: astore_1
    //   129: aload_1
    //   130: ldc 'Cannot find ISO-8601-quarter-of-year for locale: '
    //   132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: aload_1
    //   137: aload_0
    //   138: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: new java/util/MissingResourceException
    //   145: dup
    //   146: aload_1
    //   147: invokevirtual toString : ()Ljava/lang/String;
    //   150: ldc net/time4j/f1/c
    //   152: invokevirtual getName : ()Ljava/lang/String;
    //   155: aload_0
    //   156: invokevirtual toString : ()Ljava/lang/String;
    //   159: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   162: astore_0
    //   163: goto -> 168
    //   166: aload_0
    //   167: athrow
    //   168: goto -> 166
  }
  
  private static String[] d(Locale paramLocale, w paramw, m paramm) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic b : (Ljava/util/Locale;)Lnet/time4j/f1/e;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull -> 111
    //   9: aload_3
    //   10: bipush #7
    //   12: aload_3
    //   13: ldc 'DAY_OF_WEEK'
    //   15: invokestatic a : (Lnet/time4j/f1/e;Ljava/lang/String;)Ljava/lang/String;
    //   18: aload_1
    //   19: aconst_null
    //   20: aload_2
    //   21: iconst_1
    //   22: invokestatic a : (Lnet/time4j/f1/e;ILjava/lang/String;Lnet/time4j/e1/w;Lnet/time4j/e1/w;Lnet/time4j/e1/m;I)[Ljava/lang/String;
    //   25: astore #4
    //   27: aload #4
    //   29: astore_3
    //   30: aload #4
    //   32: ifnonnull -> 113
    //   35: aload_2
    //   36: getstatic net/time4j/e1/m.d : Lnet/time4j/e1/m;
    //   39: if_acmpne -> 55
    //   42: aload #4
    //   44: astore_3
    //   45: aload_1
    //   46: getstatic net/time4j/e1/w.f : Lnet/time4j/e1/w;
    //   49: if_acmpeq -> 113
    //   52: goto -> 66
    //   55: aload_1
    //   56: getstatic net/time4j/e1/w.d : Lnet/time4j/e1/w;
    //   59: if_acmpne -> 80
    //   62: getstatic net/time4j/e1/w.c : Lnet/time4j/e1/w;
    //   65: astore_1
    //   66: getstatic net/time4j/e1/m.c : Lnet/time4j/e1/m;
    //   69: astore_2
    //   70: aload_0
    //   71: aload_1
    //   72: aload_2
    //   73: invokestatic d : (Ljava/util/Locale;Lnet/time4j/e1/w;Lnet/time4j/e1/m;)[Ljava/lang/String;
    //   76: astore_3
    //   77: goto -> 113
    //   80: aload_1
    //   81: getstatic net/time4j/e1/w.e : Lnet/time4j/e1/w;
    //   84: if_acmpne -> 94
    //   87: getstatic net/time4j/e1/w.d : Lnet/time4j/e1/w;
    //   90: astore_1
    //   91: goto -> 66
    //   94: aload #4
    //   96: astore_3
    //   97: aload_1
    //   98: getstatic net/time4j/e1/w.f : Lnet/time4j/e1/w;
    //   101: if_acmpne -> 113
    //   104: getstatic net/time4j/e1/m.d : Lnet/time4j/e1/m;
    //   107: astore_2
    //   108: goto -> 70
    //   111: aconst_null
    //   112: astore_3
    //   113: aload_3
    //   114: ifnull -> 119
    //   117: aload_3
    //   118: areturn
    //   119: new java/lang/StringBuilder
    //   122: dup
    //   123: invokespecial <init> : ()V
    //   126: astore_1
    //   127: aload_1
    //   128: ldc 'Cannot find ISO-8601-day-of-week for locale: '
    //   130: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: pop
    //   134: aload_1
    //   135: aload_0
    //   136: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   139: pop
    //   140: new java/util/MissingResourceException
    //   143: dup
    //   144: aload_1
    //   145: invokevirtual toString : ()Ljava/lang/String;
    //   148: ldc net/time4j/f1/c
    //   150: invokevirtual getName : ()Ljava/lang/String;
    //   153: aload_0
    //   154: invokevirtual toString : ()Ljava/lang/String;
    //   157: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   160: astore_0
    //   161: goto -> 166
    //   164: aload_0
    //   165: athrow
    //   166: goto -> 164
  }
  
  public String a(e parame, Locale paramLocale) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("F(");
    stringBuilder.append(a(parame));
    stringBuilder.append(")_d");
    String str = stringBuilder.toString();
    return b(paramLocale).b(str);
  }
  
  public String a(e parame, Locale paramLocale, boolean paramBoolean) {
    String str;
    if (paramBoolean && parame == e.d) {
      str = "F(alt)";
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("F(");
      stringBuilder.append(a((e)str));
      stringBuilder.append(")_t");
      str = stringBuilder.toString();
    } 
    return b(paramLocale).b(str);
  }
  
  public String a(e<e> parame1, e<e> parame2, Locale paramLocale) {
    e<e> e1 = parame1;
    if (parame1.compareTo(parame2) < 0)
      e1 = parame2; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("F(");
    stringBuilder.append(a(e1));
    stringBuilder.append(")_dt");
    String str = stringBuilder.toString();
    return b(paramLocale).b(str);
  }
  
  public boolean a(String paramString) {
    return "iso8601".equals(paramString);
  }
  
  public boolean a(Locale paramLocale) {
    return a.contains(d.a(paramLocale));
  }
  
  public String[] a(String paramString, Locale paramLocale, w paramw) {
    return a(paramLocale, paramw);
  }
  
  public String[] a(String paramString, Locale paramLocale, w paramw, m paramm) {
    return c(paramLocale, paramw, paramm);
  }
  
  public String[] a(String paramString, Locale paramLocale, w paramw, m paramm, boolean paramBoolean) {
    return b(paramLocale, paramw, paramm);
  }
  
  public String b(e parame, Locale paramLocale) {
    return a(parame, paramLocale, false);
  }
  
  public String[] b(String paramString, Locale paramLocale, w paramw, m paramm) {
    return d(paramLocale, paramw, paramm);
  }
  
  public String[] c(String paramString, Locale paramLocale, w paramw, m paramm) {
    return a(paramLocale, paramw, paramm);
  }
  
  public String toString() {
    return "IsoTextProviderSPI";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/f1/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */