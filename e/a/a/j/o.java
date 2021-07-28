package e.a.a.j;

import e.a.a.b;
import e.a.a.d;
import e.a.a.f;
import e.a.a.g;
import e.a.a.i;
import e.a.a.j.q.c;
import e.a.a.k.d;
import e.a.a.k.e;
import e.a.a.l.a;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class o {
  private static Map a;
  
  static {
    a();
  }
  
  static f a(k paramk, d paramd) {
    m m = paramk.a();
    a(paramk);
    a(m, paramd);
    e(m);
    a(m);
    return paramk;
  }
  
  private static void a() {
    a = new HashMap<Object, Object>();
    e e = new e();
    e.a(true);
    a.put("dc:contributor", e);
    a.put("dc:language", e);
    a.put("dc:publisher", e);
    a.put("dc:relation", e);
    a.put("dc:subject", e);
    a.put("dc:type", e);
    e = new e();
    e.a(true);
    e.d(true);
    a.put("dc:creator", e);
    a.put("dc:date", e);
    e = new e();
    e.a(true);
    e.d(true);
    e.c(true);
    e.b(true);
    a.put("dc:description", e);
    a.put("dc:rights", e);
    a.put("dc:title", e);
  }
  
  private static void a(f paramf, m paramm) {
    // Byte code:
    //   0: aload_0
    //   1: checkcast e/a/a/j/k
    //   4: invokevirtual a : ()Le/a/a/j/m;
    //   7: ldc 'http://purl.org/dc/elements/1.1/'
    //   9: iconst_1
    //   10: invokestatic d : (Le/a/a/j/m;Ljava/lang/String;Z)Le/a/a/j/m;
    //   13: astore #5
    //   15: aload_1
    //   16: invokevirtual v : ()Ljava/lang/String;
    //   19: astore #4
    //   21: aload #5
    //   23: ldc 'dc:rights'
    //   25: iconst_0
    //   26: invokestatic a : (Le/a/a/j/m;Ljava/lang/String;Z)Le/a/a/j/m;
    //   29: astore #5
    //   31: aload #5
    //   33: ifnull -> 229
    //   36: aload #5
    //   38: invokevirtual w : ()Z
    //   41: ifne -> 47
    //   44: goto -> 229
    //   47: aload #5
    //   49: ldc 'x-default'
    //   51: invokestatic a : (Le/a/a/j/m;Ljava/lang/String;)I
    //   54: istore_3
    //   55: iload_3
    //   56: istore_2
    //   57: iload_3
    //   58: ifge -> 93
    //   61: aload_0
    //   62: ldc 'http://purl.org/dc/elements/1.1/'
    //   64: ldc 'rights'
    //   66: ldc ''
    //   68: ldc 'x-default'
    //   70: aload #5
    //   72: iconst_1
    //   73: invokevirtual f : (I)Le/a/a/j/m;
    //   76: invokevirtual v : ()Ljava/lang/String;
    //   79: aconst_null
    //   80: invokeinterface a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le/a/a/k/e;)V
    //   85: aload #5
    //   87: ldc 'x-default'
    //   89: invokestatic a : (Le/a/a/j/m;Ljava/lang/String;)I
    //   92: istore_2
    //   93: aload #5
    //   95: iload_2
    //   96: invokevirtual f : (I)Le/a/a/j/m;
    //   99: astore #5
    //   101: aload #5
    //   103: invokevirtual v : ()Ljava/lang/String;
    //   106: astore_0
    //   107: aload_0
    //   108: ldc '\\n\\n'
    //   110: invokevirtual indexOf : (Ljava/lang/String;)I
    //   113: istore_2
    //   114: iload_2
    //   115: ifge -> 174
    //   118: aload #4
    //   120: aload_0
    //   121: invokevirtual equals : (Ljava/lang/Object;)Z
    //   124: ifne -> 274
    //   127: new java/lang/StringBuilder
    //   130: dup
    //   131: invokespecial <init> : ()V
    //   134: astore #6
    //   136: aload #6
    //   138: aload_0
    //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload #6
    //   145: ldc '\\n\\n'
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: pop
    //   151: aload #6
    //   153: aload #4
    //   155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: aload #6
    //   161: invokevirtual toString : ()Ljava/lang/String;
    //   164: astore_0
    //   165: aload #5
    //   167: aload_0
    //   168: invokevirtual d : (Ljava/lang/String;)V
    //   171: goto -> 274
    //   174: iload_2
    //   175: iconst_2
    //   176: iadd
    //   177: istore_2
    //   178: aload_0
    //   179: iload_2
    //   180: invokevirtual substring : (I)Ljava/lang/String;
    //   183: aload #4
    //   185: invokevirtual equals : (Ljava/lang/Object;)Z
    //   188: ifne -> 274
    //   191: new java/lang/StringBuilder
    //   194: dup
    //   195: invokespecial <init> : ()V
    //   198: astore #6
    //   200: aload #6
    //   202: aload_0
    //   203: iconst_0
    //   204: iload_2
    //   205: invokevirtual substring : (II)Ljava/lang/String;
    //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: pop
    //   212: aload #6
    //   214: aload #4
    //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: aload #6
    //   222: invokevirtual toString : ()Ljava/lang/String;
    //   225: astore_0
    //   226: goto -> 165
    //   229: new java/lang/StringBuilder
    //   232: dup
    //   233: invokespecial <init> : ()V
    //   236: astore #5
    //   238: aload #5
    //   240: ldc '\\n\\n'
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: pop
    //   246: aload #5
    //   248: aload #4
    //   250: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: pop
    //   254: aload_0
    //   255: ldc 'http://purl.org/dc/elements/1.1/'
    //   257: ldc 'rights'
    //   259: ldc ''
    //   261: ldc 'x-default'
    //   263: aload #5
    //   265: invokevirtual toString : ()Ljava/lang/String;
    //   268: aconst_null
    //   269: invokeinterface a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le/a/a/k/e;)V
    //   274: aload_1
    //   275: invokevirtual s : ()Le/a/a/j/m;
    //   278: aload_1
    //   279: invokevirtual d : (Le/a/a/j/m;)V
    //   282: return
    //   283: astore_0
    //   284: return
    // Exception table:
    //   from	to	target	type
    //   0	31	283	e/a/a/d
    //   36	44	283	e/a/a/d
    //   47	55	283	e/a/a/d
    //   61	93	283	e/a/a/d
    //   93	114	283	e/a/a/d
    //   118	165	283	e/a/a/d
    //   165	171	283	e/a/a/d
    //   178	226	283	e/a/a/d
    //   229	274	283	e/a/a/d
    //   274	282	283	e/a/a/d
  }
  
  private static void a(k paramk) {
    n.d(paramk.a(), "http://purl.org/dc/elements/1.1/", true);
    Iterator iterator = paramk.a().A();
    while (true) {
      while (true)
        break; 
      if (SYNTHETIC_LOCAL_VARIABLE_1 != null)
        a(paramk, (m)SYNTHETIC_LOCAL_VARIABLE_1); 
    } 
  }
  
  private static void a(m paramm) {
    Iterator<m> iterator = paramm.A();
    while (iterator.hasNext()) {
      if (!((m)iterator.next()).w())
        iterator.remove(); 
    } 
  }
  
  private static void a(m paramm1, m paramm2, boolean paramBoolean) {
    if (paramm1.v().equals(paramm2.v()) && paramm1.b() == paramm2.b()) {
      if (paramBoolean || (paramm1.q().equals(paramm2.q()) && paramm1.r().equals(paramm2.r()) && paramm1.t() == paramm2.t())) {
        Iterator<m> iterator3 = paramm1.A();
        Iterator<m> iterator4 = paramm2.A();
        while (iterator3.hasNext() && iterator4.hasNext())
          a(iterator3.next(), iterator4.next(), false); 
        Iterator<m> iterator1 = paramm1.B();
        Iterator<m> iterator2 = paramm2.B();
        while (iterator1.hasNext() && iterator2.hasNext())
          a(iterator1.next(), iterator2.next(), false); 
        return;
      } 
      throw new d("Mismatch between alias and base nodes", 203);
    } 
    d d = new d("Mismatch between alias and base nodes", 203);
    throw d;
  }
  
  private static void a(m paramm, d paramd) {
    if (!paramm.c())
      return; 
    paramm.b(false);
    boolean bool = paramd.h();
    for (m m1 : paramm.u()) {
      if (!m1.c())
        continue; 
      Iterator<m> iterator = m1.A();
      while (iterator.hasNext()) {
        m m2 = iterator.next();
        if (!m2.y())
          continue; 
        m2.a(false);
        a a = g.a().a(m2.q());
        if (a != null) {
          String str = a.b();
          paramd = null;
          m m3 = n.a(paramm, str, (String)null, true);
          m3.d(false);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(a.a());
          stringBuilder.append(a.c());
          m m4 = n.a(m3, stringBuilder.toString(), false);
          if (m4 == null) {
            if (a.d().e()) {
              StringBuilder stringBuilder1 = new StringBuilder();
              stringBuilder1.append(a.a());
              stringBuilder1.append(a.c());
              m2.c(stringBuilder1.toString());
              m3.a(m2);
            } else {
              StringBuilder stringBuilder1 = new StringBuilder();
              stringBuilder1.append(a.a());
              stringBuilder1.append(a.c());
              m m5 = new m(stringBuilder1.toString(), a.d().f());
              m3.a(m5);
              a(iterator, m2, m5);
              continue;
            } 
          } else if (a.d().e()) {
            if (bool)
              a(m2, m4, true); 
          } else {
            m m5;
            if (a.d().d()) {
              int i = n.a(m4, "x-default");
              if (i != -1)
                m5 = m4.f(i); 
            } else if (m4.w()) {
              m5 = m4.f(1);
            } 
            if (m5 == null) {
              a(iterator, m2, m4);
              continue;
            } 
            if (bool)
              a(m2, m5, true); 
          } 
          iterator.remove();
        } 
      } 
      m1.b(false);
    } 
  }
  
  private static void a(Iterator paramIterator, m paramm1, m paramm2) {
    if (paramm2.r().e())
      if (!paramm1.r().c()) {
        paramm1.b(new m("xml:lang", "x-default", null));
      } else {
        throw new d("Alias to x-default already has a language qualifier", 203);
      }  
    paramIterator.remove();
    paramm1.c("[]");
    paramm2.a(paramm1);
  }
  
  private static void b(m paramm) {
    m m1 = n.a(paramm, "exif:GPSTimeStamp", false);
    if (m1 == null)
      return; 
    try {
      b b = i.a(m1.v());
      if (b.getYear() == 0 && b.getMonth() == 0) {
        if (b.getDay() != 0)
          return; 
        m m3 = n.a(paramm, "exif:DateTimeOriginal", false);
        m m2 = m3;
        if (m3 == null)
          m2 = n.a(paramm, "exif:DateTimeDigitized", false); 
        b b1 = i.a(m2.v());
        Calendar calendar = b.l();
        calendar.set(1, b1.getYear());
        calendar.set(2, b1.getMonth());
        calendar.set(5, b1.getDay());
        m1.d(i.a(new i(calendar)));
      } 
      return;
    } catch (d d) {
      return;
    } 
  }
  
  private static void c(m paramm) {
    for (int i = 1; i <= paramm.b(); i++) {
      m m1 = paramm.f(i);
      e e = (e)a.get(m1.q());
      if (e != null)
        if (m1.r().k()) {
          m m2 = new m(m1.q(), e);
          m1.c("[]");
          m2.a(m1);
          paramm.b(i, m2);
          if (e.e() && !m1.r().c())
            m1.b(new m("xml:lang", "x-default", null)); 
        } else {
          m1.r().a(7680, false);
          m1.r().a(e);
          if (e.e())
            d(m1); 
        }  
    } 
  }
  
  private static void d(m paramm) {
    if (paramm != null) {
      if (!paramm.r().d())
        return; 
      e e = paramm.r();
      e.d(true);
      e.c(true);
      e.b(true);
      Iterator<m> iterator = paramm.A();
      while (iterator.hasNext()) {
        m m1 = iterator.next();
        if (!m1.r().h())
          if (!m1.r().c()) {
            String str = m1.v();
            if (str != null && str.length() != 0) {
              m1.b(new m("xml:lang", "x-repair", null));
              continue;
            } 
          } else {
            continue;
          }  
        iterator.remove();
      } 
    } 
  }
  
  private static void e(m paramm) {
    if (paramm.q() != null && paramm.q().length() >= 36) {
      String str2 = paramm.q().toLowerCase();
      String str1 = str2;
      if (str2.startsWith("uuid:"))
        str1 = str2.substring(5); 
      if (h.a(str1)) {
        m m1 = n.a(paramm, c.a("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, (e)null);
        if (m1 != null) {
          m1.a((e)null);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("uuid:");
          stringBuilder.append(str1);
          m1.d(stringBuilder.toString());
          m1.C();
          m1.D();
          paramm.c((String)null);
          return;
        } 
        throw new d("Failure creating xmpMM:InstanceID", 9);
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */