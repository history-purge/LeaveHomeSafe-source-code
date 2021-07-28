package e.a.a.j.q;

import e.a.a.d;
import e.a.a.g;
import e.a.a.j.h;
import e.a.a.l.a;

public final class c {
  public static b a(String paramString1, String paramString2) {
    if (paramString1 != null && paramString2 != null) {
      b b = new b();
      a a = new a();
      a.a = paramString2;
      a(paramString1, a, b);
      while (a.e < paramString2.length()) {
        d d1;
        a.d = a.e;
        a(paramString2, a);
        int i = a.d;
        a.e = i;
        if (paramString2.charAt(i) != '[') {
          d1 = b(a);
        } else {
          d1 = a(a);
        } 
        if (d1.b() == 1) {
          if (d1.c().charAt(0) == '@') {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("?");
            stringBuilder.append(d1.c().substring(1));
            d1.a(stringBuilder.toString());
            if (!"?xml:lang".equals(d1.c()))
              throw new d("Only xml:lang allowed with '@'", 102); 
          } 
          if (d1.c().charAt(0) == '?') {
            a.b++;
            d1.b(2);
          } 
        } else if (d1.b() == 6) {
          if (d1.c().charAt(1) == '@') {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[?");
            stringBuilder.append(d1.c().substring(2));
            d1.a(stringBuilder.toString());
            if (!d1.c().startsWith("[?xml:lang="))
              throw new d("Only xml:lang allowed with '@'", 102); 
          } 
          if (d1.c().charAt(1) == '?') {
            a.b++;
            d1.b(5);
          } else {
            continue;
          } 
        } else {
          continue;
        } 
        a(a.a.substring(a.b, a.c));
        continue;
        b.a((d)paramString1);
      } 
      return b;
    } 
    d d = new d("Parameter must not be null", 4);
    throw d;
  }
  
  private static d a(a parama) {
    d d;
    d d1;
    parama.e++;
    if ('0' <= parama.a.charAt(parama.e) && parama.a.charAt(parama.e) <= '9') {
      while (parama.e < parama.a.length() && '0' <= parama.a.charAt(parama.e) && parama.a.charAt(parama.e) <= '9')
        parama.e++; 
      d1 = new d(null, 3);
    } else {
      while (parama.e < parama.a.length() && parama.a.charAt(parama.e) != ']' && parama.a.charAt(parama.e) != '=')
        parama.e++; 
      if (parama.e < parama.a.length()) {
        if (parama.a.charAt(parama.e) == ']') {
          if ("[last()".equals(parama.a.substring(parama.d, parama.e))) {
            d1 = new d(null, 4);
          } else {
            throw new d("Invalid non-numeric array index", 102);
          } 
        } else {
          parama.b = parama.d + 1;
          int i = parama.e;
          parama.c = i;
          parama.e = i + 1;
          i = parama.a.charAt(parama.e);
          if (i == 39 || i == 34) {
            while (true) {
              parama.e++;
              if (parama.e < parama.a.length()) {
                if (parama.a.charAt(parama.e) == i) {
                  if (parama.e + 1 >= parama.a.length() || parama.a.charAt(parama.e + 1) != i)
                    break; 
                  parama.e++;
                } 
                continue;
              } 
              break;
            } 
            if (parama.e < parama.a.length()) {
              parama.e++;
              d1 = new d(null, 6);
            } else {
              throw new d("No terminating quote for array selector", 102);
            } 
          } else {
            throw new d("Invalid quote in array selector", 102);
          } 
        } 
      } else {
        d = new d("Missing ']' or '=' for array index", 102);
        throw d;
      } 
    } 
    if (((a)d).e < ((a)d).a.length() && ((a)d).a.charAt(((a)d).e) == ']') {
      ((a)d).e++;
      d1.a(((a)d).a.substring(((a)d).d, ((a)d).e));
      return d1;
    } 
    throw new d("Missing ']' for array index", 102);
  }
  
  private static void a(String paramString) {
    int i = paramString.indexOf(':');
    if (i > 0) {
      paramString = paramString.substring(0, i);
      if (h.c(paramString)) {
        if (g.a().c(paramString) != null)
          return; 
        throw new d("Unknown namespace prefix for qualified name", 102);
      } 
    } 
    throw new d("Ill-formed qualified name", 102);
  }
  
  private static void a(String paramString, a parama) {
    if (paramString.charAt(parama.d) == '/') {
      parama.d++;
      if (parama.d >= paramString.length())
        throw new d("Empty XMPPath segment", 102); 
    } 
    if (paramString.charAt(parama.d) == '*') {
      parama.d++;
      if (parama.d < paramString.length() && paramString.charAt(parama.d) == '[')
        return; 
      throw new d("Missing '[' after '*'", 102);
    } 
  }
  
  private static void a(String paramString, a parama, b paramb) {
    while (parama.e < parama.a.length() && "/[*".indexOf(parama.a.charAt(parama.e)) < 0)
      parama.e++; 
    int i = parama.e;
    int j = parama.d;
    if (i != j) {
      d d1;
      String str = b(paramString, parama.a.substring(j, i));
      a a1 = g.a().a(str);
      if (a1 == null) {
        paramb.a(new d(paramString, -2147483648));
        d1 = new d(str, 1);
      } else {
        paramb.a(new d(a1.b(), -2147483648));
        d1 = new d(b(a1.b(), a1.c()), 1);
        d1.a(true);
        d1.a(a1.d().a());
        paramb.a(d1);
        if (a1.d().d()) {
          d1 = new d("[?xml:lang='x-default']", 5);
        } else if (a1.d().c()) {
          d1 = new d("[1]", 3);
        } else {
          return;
        } 
        d1.a(true);
        d1.a(a1.d().a());
      } 
      paramb.a(d1);
      return;
    } 
    d d = new d("Empty initial XMPPath step", 102);
    throw d;
  }
  
  private static d b(a parama) {
    parama.b = parama.d;
    while (parama.e < parama.a.length() && "/[*".indexOf(parama.a.charAt(parama.e)) < 0)
      parama.e++; 
    int i = parama.e;
    parama.c = i;
    int j = parama.d;
    if (i != j)
      return new d(parama.a.substring(j, i), 1); 
    d d = new d("Empty XMPPath segment", 102);
    throw d;
  }
  
  private static String b(String paramString1, String paramString2) {
    if (paramString1 != null && paramString1.length() != 0) {
      if (paramString2.charAt(0) != '?' && paramString2.charAt(0) != '@') {
        if (paramString2.indexOf('/') < 0 && paramString2.indexOf('[') < 0) {
          String str = g.a().b(paramString1);
          if (str != null) {
            StringBuilder stringBuilder;
            int i = paramString2.indexOf(':');
            if (i < 0) {
              b(paramString2);
              stringBuilder = new StringBuilder();
              stringBuilder.append(str);
              stringBuilder.append(paramString2);
              return stringBuilder.toString();
            } 
            b(paramString2.substring(0, i));
            b(paramString2.substring(i));
            str = paramString2.substring(0, i + 1);
            String str1 = g.a().b((String)stringBuilder);
            if (str1 != null) {
              if (str.equals(str1))
                return paramString2; 
              throw new d("Schema namespace URI and prefix mismatch", 101);
            } 
            throw new d("Unknown schema namespace prefix", 101);
          } 
          throw new d("Unregistered schema namespace URI", 101);
        } 
        throw new d("Top level name must be simple", 102);
      } 
      throw new d("Top level name must not be a qualifier", 102);
    } 
    throw new d("Schema namespace URI is required", 101);
  }
  
  private static void b(String paramString) {
    if (h.b(paramString))
      return; 
    throw new d("Bad XML name", 102);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/q/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */