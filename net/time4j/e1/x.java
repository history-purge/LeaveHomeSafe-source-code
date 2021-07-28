package net.time4j.e1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.time4j.d1.m0;

public abstract class x<U, S extends m0<U>> {
  protected x(Class<U> paramClass, String paramString) {
    if (paramClass != null) {
      int k = paramString.length();
      ArrayList<List<b<U>>> arrayList = new ArrayList();
      arrayList.add(new ArrayList());
      int i = 0;
      int j = 0;
      while (true) {
        if (i < k) {
          char c = paramString.charAt(i);
          if (c == '#') {
            j++;
          } else {
            int m;
            if (b(c)) {
              for (m = i + 1; m < k && paramString.charAt(m) == c; m++);
              a(c, m - i, j, arrayList);
              i = m - 1;
              j = 0;
            } else if (j <= 0) {
              if (c == '\'') {
                int n = i + 1;
                for (i = n; i < k; i = m + 1) {
                  m = i;
                  if (paramString.charAt(i) == '\'') {
                    m = i + 1;
                    if (m < k && paramString.charAt(m) == '\'')
                      continue; 
                    break;
                  } 
                  continue;
                } 
                if (i < k) {
                  if (n == i) {
                    a('\'', arrayList);
                  } else {
                    a(paramString.substring(n, i).replace("''", "'"), arrayList);
                  } 
                } else {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append("String literal in pattern not closed: ");
                  stringBuilder.append(paramString);
                  throw new IllegalArgumentException(stringBuilder.toString());
                } 
              } else if (c == '[') {
                c(arrayList);
              } else if (c == ']') {
                a(arrayList);
              } else {
                List<b<U>> list;
                b<?> b;
                if (c == '.') {
                  list = b(arrayList);
                  b = new i('.', ',', null);
                } else if (c == ',') {
                  list = b(arrayList);
                  b = new i(',', '.', null);
                } else {
                  if (c == '-') {
                    list = b(arrayList);
                    b = new j(false, null);
                  } else if (c == '+') {
                    list = b(arrayList);
                    b = new j(true, null);
                  } else {
                    if (c == '{') {
                      m = i + 1;
                      for (i = m; i < k && paramString.charAt(i) != '}'; i++);
                      b(paramString.substring(m, i), arrayList);
                    } else {
                      if (c == '|') {
                        list = b(arrayList);
                        b = g.b();
                      } else {
                        a(c, arrayList);
                        i++;
                      } 
                      list.add(b);
                    } 
                    i++;
                  } 
                  list.add(b);
                } 
                list.add(b);
              } 
            } else {
              throw new IllegalArgumentException("Char # must be followed by unit symbol.");
            } 
          } 
        } else {
          break;
        } 
        i++;
      } 
      if (arrayList.size() <= 1) {
        if (!arrayList.isEmpty()) {
          List<g> list = (List)arrayList.get(0);
          if (!list.isEmpty()) {
            if (list.get(0) != g.a && list.get(list.size() - 1) != g.a) {
              j = list.size();
              i = ((b)list.get(j - 1)).a();
              for (j -= 2; j >= 0; j--) {
                b b = list.get(j);
                if (b == g.a) {
                  i = 0;
                } else {
                  list.set(j, (g)b.a(i));
                  i += b.a();
                } 
              } 
              Collections.unmodifiableList(list);
              return;
            } 
            throw new IllegalArgumentException("Pattern must not start or end with an or-operator.");
          } 
          throw new IllegalArgumentException("Missing format pattern.");
        } 
        throw new IllegalArgumentException("Empty or invalid pattern.");
      } 
      throw new IllegalArgumentException("Open square bracket without closing one.");
    } 
    NullPointerException nullPointerException = new NullPointerException("Missing unit type.");
    throw nullPointerException;
  }
  
  private void a(char paramChar, int paramInt1, int paramInt2, List<List<b<U>>> paramList) {
    U u = a(paramChar);
    paramList = (List<List<b<U>>>)paramList.get(paramList.size() - 1);
    if (paramChar == 'f') {
      if (paramInt2 <= 0) {
        paramList.add((List<b<U>>)new c(0, paramInt1, a(paramChar), null));
        return;
      } 
      throw new IllegalArgumentException("Combination of # and f-symbol not allowed.");
    } 
    paramList.add((List<b<U>>)new e(0, paramInt1, paramInt1 + paramInt2, u, null));
  }
  
  private void a(char paramChar, List<List<b<U>>> paramList) {
    a(String.valueOf(paramChar), paramList);
  }
  
  private void a(String paramString, List<List<b<U>>> paramList) {
    b(paramList).add(new d(paramString, null));
  }
  
  private static <U> void a(List<List<b<U>>> paramList) {
    int i = paramList.size() - 1;
    if (i >= 1) {
      List list = paramList.remove(i);
      ((List)paramList.get(i - 1)).add(new f(list, null));
      return;
    } 
    throw new IllegalArgumentException("Closing square bracket without open one.");
  }
  
  private static <U> List<b<U>> b(List<List<b<U>>> paramList) {
    return paramList.get(paramList.size() - 1);
  }
  
  private void b(String paramString, List<List<b<U>>> paramList) {
    String[] arrayOfString = paramString.split(":");
    if (arrayOfString.length <= 9 && arrayOfString.length >= 4) {
      if (arrayOfString[0].length() == 1) {
        Locale locale;
        U u = a(arrayOfString[0].charAt(0));
        String[] arrayOfString1 = arrayOfString[2].split("-|_");
        String str = arrayOfString1[0];
        int j = arrayOfString1.length;
        int i = 3;
        if (j > 1) {
          String str1 = arrayOfString1[1];
          if (arrayOfString1.length > 2) {
            String str2 = arrayOfString1[2];
            if (arrayOfString1.length <= 3) {
              locale = new Locale(str, str1, str2);
            } else {
              stringBuilder2 = new StringBuilder();
              stringBuilder2.append("Plural information has wrong locale: ");
              stringBuilder2.append(paramString);
              throw new IllegalArgumentException(stringBuilder2.toString());
            } 
          } else {
            locale = new Locale(str, str1);
          } 
        } else {
          locale = new Locale(str);
        } 
        EnumMap<n, Object> enumMap = new EnumMap<n, Object>(n.class);
        p p = p.a(locale, k.c);
        while (i < arrayOfString.length) {
          String[] arrayOfString2 = arrayOfString[i].split("=");
          if (arrayOfString2.length == 2) {
            enumMap.put(n.valueOf(arrayOfString2[0]), arrayOfString2[1]);
            i++;
            continue;
          } 
          stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Plural information has wrong format: ");
          stringBuilder2.append(paramString);
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
        if (!enumMap.isEmpty()) {
          if (enumMap.containsKey(n.h)) {
            b((List<List<b<?>>>)stringBuilder2).add(new h(u, arrayOfString[1], p, enumMap, null));
            return;
          } 
          stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Missing plural category OTHER: ");
          stringBuilder2.append(paramString);
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Missing plural forms: ");
        stringBuilder2.append(paramString);
        throw new IllegalArgumentException(stringBuilder2.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Plural information has wrong symbol: ");
      stringBuilder1.append(paramString);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Plural information has wrong format: ");
    stringBuilder.append(paramString);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  private static boolean b(char paramChar) {
    return ((paramChar >= 'A' && paramChar <= 'Z') || (paramChar >= 'a' && paramChar <= 'z'));
  }
  
  private static <U> void c(List<List<b<U>>> paramList) {
    paramList.add(new ArrayList<b<U>>());
  }
  
  protected abstract U a(char paramChar);
  
  private static abstract class b<U> {
    b(int param1Int) {}
    
    abstract int a();
    
    abstract b<U> a(int param1Int);
  }
  
  private static class c<U> extends b<U> {
    private final int a;
    
    private final U b;
    
    private c(int param1Int1, int param1Int2, U param1U) {
      super(param1Int1);
      if (param1Int2 >= 1 && param1Int2 <= 9) {
        this.a = param1Int2;
        this.b = param1U;
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Fraction width out of bounds: ");
      stringBuilder.append(param1Int2);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    int a() {
      return this.a;
    }
    
    x.b<U> a(int param1Int) {
      return new c(param1Int, this.a, this.b);
    }
  }
  
  private static class d<U> extends b<U> {
    private final String a;
    
    private d(int param1Int, String param1String) {
      super(param1Int);
      this.a = param1String;
    }
    
    private d(String param1String) {
      this(param1String, false);
    }
    
    private d(String param1String, boolean param1Boolean) {
      super(0);
      if (param1Boolean || !param1String.isEmpty()) {
        this.a = param1String;
        return;
      } 
      throw new IllegalArgumentException("Literal is empty.");
    }
    
    int a() {
      return this.a.length();
    }
    
    x.b<U> a(int param1Int) {
      return new d(param1Int, this.a);
    }
  }
  
  private static class e<U> extends b<U> {
    private final int a;
    
    private final int b;
    
    private final U c;
    
    private e(int param1Int1, int param1Int2, int param1Int3, U param1U) {
      super(param1Int1);
      if (param1Int2 >= 1 && param1Int2 <= 18) {
        if (param1Int3 >= param1Int2) {
          if (param1Int3 <= 18) {
            if (param1U != null) {
              this.a = param1Int2;
              this.b = param1Int3;
              this.c = param1U;
              return;
            } 
            throw new NullPointerException("Missing unit.");
          } 
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Max width out of bounds: ");
          stringBuilder1.append(param1Int3);
          throw new IllegalArgumentException(stringBuilder1.toString());
        } 
        throw new IllegalArgumentException("Max width smaller than min width.");
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Min width out of bounds: ");
      stringBuilder.append(param1Int2);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    int a() {
      return this.a;
    }
    
    x.b<U> a(int param1Int) {
      return new e(param1Int, this.a, this.b, this.c);
    }
  }
  
  private static class f<U> extends b<U> {
    private final List<x.b<U>> a;
    
    private f(List<x.b<U>> param1List) {
      super(0);
      if (!param1List.isEmpty()) {
        if (param1List.get(0) != x.g.a && param1List.get(param1List.size() - 1) != x.g.a) {
          this.a = Collections.unmodifiableList(param1List);
          return;
        } 
        throw new IllegalArgumentException("Optional section must not start or end with an or-operator.");
      } 
      throw new IllegalArgumentException("Optional section is empty.");
    }
    
    int a() {
      return 0;
    }
    
    x.b<U> a(int param1Int) {
      ArrayList<x.b<U>> arrayList = new ArrayList<x.b<U>>(this.a);
      int j = arrayList.size() - 1;
      int i = param1Int;
      for (param1Int = j; param1Int >= 0; param1Int--) {
        x.b<U> b1 = arrayList.get(param1Int);
        arrayList.set(param1Int, b1.a(i));
        i += b1.a();
      } 
      return new f(arrayList);
    }
  }
  
  private static class g<U> extends b<U> {
    static final g a = new g();
    
    private g() {
      super(0);
    }
    
    static <U> x.b<U> b() {
      return a;
    }
    
    int a() {
      return 0;
    }
    
    x.b<U> a(int param1Int) {
      return this;
    }
  }
  
  private static class h<U> extends b<U> {
    private final x.e<U> a;
    
    private final x.b<U> b;
    
    private final p c;
    
    private final Map<n, String> d;
    
    private final int e;
    
    private h(int param1Int1, x.e<U> param1e, x.b<U> param1b, p param1p, Map<n, String> param1Map, int param1Int2) {
      super(param1Int1);
      this.a = param1e;
      this.b = param1b;
      this.c = param1p;
      this.d = param1Map;
      this.e = param1Int2;
    }
    
    private h(U param1U, String param1String, p param1p, Map<n, String> param1Map) {
      super(0);
      this.a = new x.e<U>(0, 1, 18, param1U, null);
      this.b = new x.d<U>(param1String, true, null);
      this.c = param1p;
      this.d = param1Map;
      Iterator<String> iterator = param1Map.values().iterator();
      int i = Integer.MAX_VALUE;
      while (iterator.hasNext()) {
        param1String = iterator.next();
        if (param1String.length() < i)
          i = param1String.length(); 
      } 
      this.e = i;
    }
    
    int a() {
      return this.e;
    }
    
    x.b<U> a(int param1Int) {
      return new h(param1Int, this.a, this.b, this.c, this.d, this.e);
    }
  }
  
  private static class i<U> extends b<U> {
    private final char a;
    
    private final char b;
    
    private i(char param1Char1, char param1Char2) {
      this(0, param1Char1, param1Char2);
    }
    
    private i(int param1Int, char param1Char1, char param1Char2) {
      super(param1Int);
      this.a = param1Char1;
      this.b = param1Char2;
    }
    
    int a() {
      return 1;
    }
    
    x.b<U> a(int param1Int) {
      return new i(param1Int, this.a, this.b);
    }
  }
  
  private static class j<U> extends b<U> {
    private final boolean a;
    
    private j(int param1Int, boolean param1Boolean) {
      super(param1Int);
      this.a = param1Boolean;
    }
    
    private j(boolean param1Boolean) {
      super(0);
      this.a = param1Boolean;
    }
    
    int a() {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    x.b<U> a(int param1Int) {
      return new j(param1Int, this.a);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */