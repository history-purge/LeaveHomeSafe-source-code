package e.a.a.j;

import e.a.a.a;
import e.a.a.d;
import e.a.a.g;
import e.a.a.j.q.b;
import e.a.a.j.q.d;
import e.a.a.k.e;
import java.util.Iterator;

public class n implements a {
  static int a(m paramm, String paramString) {
    if (paramm.r().d()) {
      for (int i = 1; i <= paramm.b(); i++) {
        m m1 = paramm.f(i);
        if (m1.x() && "xml:lang".equals(m1.g(1).q()) && paramString.equals(m1.g(1).v()))
          return i; 
      } 
      return -1;
    } 
    d d = new d("Language item must be used on array", 102);
    throw d;
  }
  
  private static int a(m paramm, String paramString1, String paramString2, int paramInt) {
    m m1;
    boolean bool = "xml:lang".equals(paramString1);
    int i = 1;
    if (bool) {
      i = a(paramm, h.d(paramString2));
      if (i < 0 && (paramInt & 0x1000) > 0) {
        m1 = new m("[]", null);
        m1.b(new m("xml:lang", "x-default", null));
        paramm.a(1, m1);
        return 1;
      } 
      return i;
    } 
    while (i < paramm.b()) {
      Iterator<m> iterator = paramm.f(i).B();
      while (iterator.hasNext()) {
        m m2 = iterator.next();
        if (m1.equals(m2.q()) && paramString2.equals(m2.v()))
          return i; 
      } 
      i++;
    } 
    return -1;
  }
  
  static m a(m paramm, b paramb, boolean paramBoolean, e parame) {
    if (paramb != null && paramb.a() != 0) {
      m m1 = d(paramm, paramb.a(0).c(), paramBoolean);
      if (m1 == null)
        return null; 
      if (m1.z()) {
        m1.d(false);
        paramm = m1;
      } else {
        paramm = null;
      } 
      int i = 1;
      try {
        while (i < paramb.a()) {
          m1 = a(m1, paramb.a(i), paramBoolean);
          if (m1 == null) {
            if (paramBoolean) {
              a(paramm);
              return null;
            } 
          } else {
            m m2 = paramm;
            if (m1.z()) {
              m1.d(false);
              if (i == 1 && paramb.a(i).d() && paramb.a(i).a() != 0) {
                m1.r().a(paramb.a(i).a(), true);
              } else if (i < paramb.a() - 1 && paramb.a(i).b() == 1 && !m1.r().h()) {
                m1.r().j(true);
              } 
              m2 = paramm;
              if (paramm == null)
                m2 = m1; 
            } 
            i++;
            paramm = m2;
            continue;
          } 
          return null;
        } 
        if (paramm != null) {
          m1.r().a(parame);
          m1.a(m1.r());
        } 
        return m1;
      } catch (d d1) {
        if (paramm != null)
          a(paramm); 
        throw d1;
      } 
    } 
    d d = new d("Empty XMPPath", 102);
    throw d;
  }
  
  private static m a(m paramm, d paramd, boolean paramBoolean) {
    int i = paramd.b();
    if (i == 1)
      return a(paramm, paramd.c(), paramBoolean); 
    if (i == 2)
      return c(paramm, paramd.c().substring(1), paramBoolean); 
    if (paramm.r().d()) {
      if (i == 3) {
        i = b(paramm, paramd.c(), paramBoolean);
      } else if (i == 4) {
        i = paramm.b();
      } else {
        String[] arrayOfString;
        if (i == 6) {
          arrayOfString = h.e(paramd.c());
          i = c(paramm, arrayOfString[0], arrayOfString[1]);
        } else if (i == 5) {
          String[] arrayOfString1 = h.e(arrayOfString.c());
          i = a(paramm, arrayOfString1[0], arrayOfString1[1], arrayOfString.a());
        } else {
          throw new d("Unknown array indexing step in FollowXPathStep", 9);
        } 
      } 
      return (1 <= i && i <= paramm.b()) ? paramm.f(i) : null;
    } 
    throw new d("Indexing applied to non-array", 102);
  }
  
  static m a(m paramm, String paramString1, String paramString2, boolean paramBoolean) {
    m m2 = paramm.a(paramString1);
    m m1 = m2;
    if (m2 == null) {
      m1 = m2;
      if (paramBoolean) {
        e e = new e();
        e.i(true);
        m2 = new m(paramString1, e);
        m2.d(true);
        String str2 = g.a().b(paramString1);
        String str1 = str2;
        if (str2 == null)
          if (paramString2 != null && paramString2.length() != 0) {
            str1 = g.a().a(paramString1, paramString2);
          } else {
            throw new d("Unregistered schema namespace URI", 101);
          }  
        m2.d(str1);
        paramm.a(m2);
        m1 = m2;
      } 
    } 
    return m1;
  }
  
  static m a(m paramm, String paramString, boolean paramBoolean) {
    if (!paramm.r().j() && !paramm.r().l())
      if (paramm.z()) {
        if (!paramm.r().d()) {
          if (paramBoolean)
            paramm.r().j(true); 
        } else {
          throw new d("Named children not allowed for arrays", 102);
        } 
      } else {
        throw new d("Named children only allowed for schemas and structs", 102);
      }  
    m m2 = paramm.a(paramString);
    m m1 = m2;
    if (m2 == null) {
      m1 = m2;
      if (paramBoolean) {
        m1 = new m(paramString, new e());
        m1.d(true);
        paramm.a(m1);
      } 
    } 
    return m1;
  }
  
  static e a(e parame, Object paramObject) {
    e e1 = parame;
    if (parame == null)
      e1 = new e(); 
    if (e1.e())
      e1.c(true); 
    if (e1.f())
      e1.d(true); 
    if (e1.g())
      e1.a(true); 
    if (!e1.h() || paramObject == null || paramObject.toString().length() <= 0) {
      e1.a(e1.a());
      return e1;
    } 
    throw new d("Structs and arrays can't have values", 103);
  }
  
  static void a(m paramm) {
    m m1 = paramm.s();
    if (paramm.r().i()) {
      m1.e(paramm);
    } else {
      m1.d(paramm);
    } 
    if (!m1.w() && m1.r().j())
      m1.s().d(m1); 
  }
  
  static void a(m paramm, String paramString1, String paramString2) {
    m m2 = new m("[]", paramString2, null);
    m m1 = new m("xml:lang", paramString1, null);
    m2.b(m1);
    if (!"x-default".equals(m1.v())) {
      paramm.a(m2);
      return;
    } 
    paramm.a(1, m2);
  }
  
  private static int b(m paramm, String paramString, boolean paramBoolean) {
    try {
      int i = Integer.parseInt(paramString.substring(1, paramString.length() - 1));
      if (i >= 1) {
        if (paramBoolean && i == paramm.b() + 1) {
          m m1 = new m("[]", null);
          m1.d(true);
          paramm.a(m1);
        } 
        return i;
      } 
      throw new d("Array index must be larger than zero", 102);
    } catch (NumberFormatException numberFormatException) {
      throw new d("Array index not digits.", 102);
    } 
  }
  
  static void b(m paramm) {
    if (paramm.r().f() && paramm.w()) {
      boolean bool1;
      boolean bool2 = false;
      Iterator<m> iterator = paramm.A();
      while (true) {
        bool1 = bool2;
        if (iterator.hasNext()) {
          if (((m)iterator.next()).r().c()) {
            bool1 = true;
            break;
          } 
          continue;
        } 
        break;
      } 
      if (bool1) {
        paramm.r().b(true);
        c(paramm);
      } 
    } 
  }
  
  static Object[] b(m paramm, String paramString1, String paramString2) {
    if (paramm.r().e()) {
      m m1;
      m m2;
      if (!paramm.w())
        return new Object[] { new Integer(0), null }; 
      Iterator<m> iterator = paramm.A();
      String str2 = null;
      String str1 = str2;
      int i = 0;
      while (iterator.hasNext()) {
        m m3 = iterator.next();
        if (!m3.r().h()) {
          if (m3.x() && "xml:lang".equals(m3.g(1).q())) {
            m m4;
            String str = m3.g(1).v();
            if (paramString2.equals(str))
              return new Object[] { new Integer(1), m3 }; 
            if (paramString1 != null && str.startsWith(paramString1)) {
              str = str2;
              if (str2 == null)
                m4 = m3; 
              i++;
              m2 = m4;
              continue;
            } 
            if ("x-default".equals(m4))
              m1 = m3; 
            continue;
          } 
          throw new d("Alt-text array item has no language qualifier", 102);
        } 
        throw new d("Alt-text array item is not simple", 102);
      } 
      return (i == 1) ? new Object[] { new Integer(2), m2 } : ((i > 1) ? new Object[] { new Integer(3), m2 } : ((m1 != null) ? new Object[] { new Integer(4), m1 } : new Object[] { new Integer(5), paramm.f(1) }));
    } 
    d d = new d("Localized text array is not alt-text", 102);
    throw d;
  }
  
  private static int c(m paramm, String paramString1, String paramString2) {
    int i = 1;
    int j = -1;
    while (i <= paramm.b() && j < 0) {
      m m1 = paramm.f(i);
      if (m1.r().l()) {
        int k;
        int i1 = 1;
        while (true) {
          k = j;
          if (i1 <= m1.b()) {
            m m2 = m1.f(i1);
            if (paramString1.equals(m2.q()) && paramString2.equals(m2.v())) {
              k = i;
              break;
            } 
            i1++;
            continue;
          } 
          break;
        } 
        i++;
        j = k;
        continue;
      } 
      throw new d("Field selector must be used on array of struct", 102);
    } 
    return j;
  }
  
  private static m c(m paramm, String paramString, boolean paramBoolean) {
    m m2 = paramm.b(paramString);
    m m1 = m2;
    if (m2 == null) {
      m1 = m2;
      if (paramBoolean) {
        m1 = new m(paramString, null);
        m1.d(true);
        paramm.b(m1);
      } 
    } 
    return m1;
  }
  
  static void c(m paramm) {
    if (!paramm.r().e())
      return; 
    for (int i = 2; i <= paramm.b(); i++) {
      m m1 = paramm.f(i);
      if (m1.x() && "x-default".equals(m1.g(1).v())) {
        try {
          paramm.h(i);
          paramm.a(1, m1);
        } catch (d d) {}
        if (i == 2) {
          paramm.f(2).d(m1.v());
          return;
        } 
        break;
      } 
    } 
  }
  
  static m d(m paramm, String paramString, boolean paramBoolean) {
    return a(paramm, paramString, (String)null, paramBoolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */