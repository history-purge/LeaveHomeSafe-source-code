package net.time4j.e1.a0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.c1.f;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.e1.g;
import net.time4j.tz.d;
import net.time4j.tz.k;
import net.time4j.tz.l;

final class d0 implements h<k> {
  private static final ConcurrentMap<Locale, a> i = new ConcurrentHashMap<Locale, a>();
  
  private static final ConcurrentMap<Locale, a> j = new ConcurrentHashMap<Locale, a>();
  
  private final boolean c;
  
  private final h<k> d;
  
  private final Set<k> e;
  
  private final g f;
  
  private final Locale g;
  
  private final int h;
  
  d0(boolean paramBoolean) {
    this.c = paramBoolean;
    this.d = new n(paramBoolean);
    this.e = null;
    this.f = g.d;
    this.g = Locale.ROOT;
    this.h = 0;
  }
  
  private d0(boolean paramBoolean, h<k> paramh, Set<k> paramSet, g paramg, Locale paramLocale, int paramInt) {
    this.c = paramBoolean;
    this.d = paramh;
    this.e = paramSet;
    this.f = paramg;
    this.g = paramLocale;
    this.h = paramInt;
  }
  
  private String a(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    int i = paramInt1;
    while (i < paramInt2) {
      char c = paramCharSequence.charAt(i);
      if (Character.isLetter(c) || (!this.c && i > paramInt1 && !Character.isDigit(c))) {
        stringBuilder.append(c);
        i++;
      } 
    } 
    return stringBuilder.toString().trim();
  }
  
  private static List<k> a(List<k> paramList) {
    int j = paramList.size();
    int i = 1;
    if (j > 1) {
      ArrayList<k> arrayList = new ArrayList<k>(paramList);
      j = paramList.size();
      while (i < j) {
        k k = paramList.get(i);
        if (k.a().startsWith("WINDOWS~"))
          arrayList.remove(k); 
        i++;
      } 
      if (!arrayList.isEmpty())
        return arrayList; 
    } 
    return paramList;
  }
  
  private List<k> a(List<k> paramList, Locale paramLocale, g paramg) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("DEFAULT", new ArrayList());
    Iterator<k> iterator = paramList.iterator();
    while (true) {
      boolean bool1 = iterator.hasNext();
      boolean bool = false;
      if (bool1) {
        String str1;
        String str2 = ((k)iterator.next()).a();
        Set<k> set2 = this.e;
        int i = str2.indexOf('~');
        if (i >= 0) {
          str1 = str2.substring(0, i);
        } else {
          str1 = "DEFAULT";
        } 
        Set<k> set1 = set2;
        if (set2 == null)
          set1 = l.a(paramLocale, paramg.b(), str1); 
        Iterator<k> iterator1 = set1.iterator();
        label33: while (iterator1.hasNext()) {
          k k = iterator1.next();
          if (k.a().equals(str2)) {
            List<k> list4 = (List)hashMap.get(str1);
            List<k> list3 = list4;
            if (list4 == null) {
              list3 = new ArrayList();
              hashMap.put(str1, list3);
              list3.add(k);
              continue;
            } 
            break label33;
          } 
        } 
        continue;
      } 
      List<k> list2 = (List)hashMap.get("DEFAULT");
      List<k> list1 = list2;
      if (list2.isEmpty()) {
        boolean bool2;
        hashMap.remove("DEFAULT");
        Iterator<String> iterator1 = hashMap.keySet().iterator();
        while (true) {
          bool2 = bool;
          list1 = paramList;
          if (iterator1.hasNext()) {
            list1 = (List<k>)hashMap.get(iterator1.next());
            if (!list1.isEmpty()) {
              bool2 = true;
              break;
            } 
            continue;
          } 
          break;
        } 
        if (!bool2)
          list1 = Collections.emptyList(); 
      } 
      return list1;
    } 
  }
  
  private g0 a(Locale paramLocale, boolean paramBoolean) {
    d d = a(paramBoolean);
    Iterator<k> iterator = l.p().iterator();
    g0.b b;
    for (b = null; iterator.hasNext(); b = g0.a(b, str, k)) {
      k k = iterator.next();
      String str = l.a(k, d, paramLocale);
      if (str.equals(k.a()))
        continue; 
    } 
    return new g0(b);
  }
  
  private d a(boolean paramBoolean) {
    return paramBoolean ? (this.c ? d.e : d.f) : (this.c ? d.c : d.d);
  }
  
  private static String b(List<k> paramList) {
    StringBuilder stringBuilder = new StringBuilder(paramList.size() * 16);
    stringBuilder.append('{');
    Iterator<k> iterator = paramList.iterator();
    boolean bool = true;
    while (iterator.hasNext()) {
      k k = iterator.next();
      if (bool) {
        bool = false;
      } else {
        stringBuilder.append(',');
      } 
      stringBuilder.append(k.a());
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public int a(o paramo, Appendable paramAppendable, d paramd, Set<g> paramSet, boolean paramBoolean) {
    String str;
    if (paramo.d()) {
      k k = paramo.c();
      if (k instanceof net.time4j.tz.p)
        return this.d.a(paramo, paramAppendable, paramd, paramSet, paramBoolean); 
      if (paramo instanceof f) {
        Locale locale;
        byte b;
        l l = l.a(k);
        d d1 = a(l.c(f.class.cast(paramo)));
        if (paramBoolean) {
          locale = this.g;
        } else {
          locale = (Locale)paramd.a(net.time4j.e1.a.c, Locale.ROOT);
        } 
        str = l.a(d1, locale);
        if (paramAppendable instanceof CharSequence) {
          b = ((CharSequence)paramAppendable).length();
        } else {
          b = -1;
        } 
        paramAppendable.append(str);
        int i = str.length();
        if (b != -1 && i > 0 && paramSet != null)
          paramSet.add(new g(b0.c, b, b + i)); 
        return i;
      } 
      paramAppendable = new StringBuilder();
      paramAppendable.append("Cannot extract timezone name from: ");
      paramAppendable.append(str);
      throw new IllegalArgumentException(paramAppendable.toString());
    } 
    paramAppendable = new StringBuilder();
    paramAppendable.append("Cannot extract timezone name from: ");
    paramAppendable.append(str);
    throw new IllegalArgumentException(paramAppendable.toString());
  }
  
  public h<k> a(p<k> paramp) {
    return this;
  }
  
  public h<k> a(c<?> paramc, d paramd, int paramInt) {
    return new d0(this.c, this.d, this.e, (g)paramd.a(net.time4j.e1.a.f, g.d), (Locale)paramd.a(net.time4j.e1.a.c, Locale.ROOT), ((Integer)paramd.a(net.time4j.e1.a.s, Integer.valueOf(0))).intValue());
  }
  
  public void a(CharSequence paramCharSequence, s params, d paramd, t<?> paramt, boolean paramBoolean) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:548)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public boolean a() {
    return false;
  }
  
  public p<k> b() {
    return b0.c;
  }
  
  public boolean equals(Object<k> paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof d0) {
      d0 d01 = (d0)paramObject;
      if (this.c == d01.c) {
        paramObject = (Object<k>)this.e;
        Set<k> set = d01.e;
        if (paramObject == null) {
          if (set == null)
            return true; 
        } else if (paramObject.equals(set)) {
          return true;
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public int hashCode() {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append(d0.class.getName());
    stringBuilder.append("[abbreviated=");
    stringBuilder.append(this.c);
    stringBuilder.append(", preferredZones=");
    stringBuilder.append(this.e);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  private static class a {
    private final g0 a;
    
    private final g0 b;
    
    a(g0 param1g01, g0 param1g02) {
      this.a = param1g01;
      this.b = param1g02;
    }
    
    void a(CharSequence param1CharSequence, int param1Int, List<k> param1List1, List<k> param1List2, int[] param1ArrayOfint) {
      String str = this.a.a(param1CharSequence, param1Int);
      int i = str.length();
      param1ArrayOfint[0] = param1Int + i;
      param1CharSequence = this.b.a(param1CharSequence, param1Int);
      int j = param1CharSequence.length();
      param1ArrayOfint[1] = param1Int + j;
      if (j <= i) {
        if (j < i) {
          param1List1.addAll(this.a.a(str));
          return;
        } 
        if (i > 0) {
          param1List1.addAll(this.a.a(str));
        } else {
          return;
        } 
      } 
      param1List2.addAll(this.b.a((String)param1CharSequence));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */