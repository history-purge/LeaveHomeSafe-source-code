package net.time4j.android.spi;

import android.content.Context;
import android.text.format.DateFormat;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import net.time4j.c1.d;
import net.time4j.d1.s;
import net.time4j.e1.o;
import net.time4j.e1.v;
import net.time4j.e1.y;
import net.time4j.e1.z;
import net.time4j.tz.r;
import net.time4j.tz.s;

public class AndroidResourceLoader extends d {
  private static final Map<Class<?>, Iterable<?>> g;
  
  private static final Set<String> h;
  
  private Context d = null;
  
  private net.time4j.android.a e = null;
  
  private List<net.time4j.e1.f> f = Collections.emptyList();
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(v.class, new h(null));
    hashMap.put(r.class, new k(null));
    hashMap.put(s.class, new j(null));
    hashMap.put(net.time4j.g1.c.class, new e(null));
    hashMap.put(s.class, new d(null));
    hashMap.put(net.time4j.e1.i.class, new f(null));
    hashMap.put(o.class, new g(null));
    hashMap.put(y.class, Collections.singleton(new net.time4j.f1.h()));
    hashMap.put(z.class, new i(null));
    hashMap.put(net.time4j.g1.e.class, Collections.singleton(new a()));
    g = Collections.unmodifiableMap(hashMap);
    HashSet<String> hashSet = new HashSet();
    hashSet.add("i18n");
    hashSet.add("calendar");
    hashSet.add("olson");
    hashSet.add("tzdata");
    h = Collections.unmodifiableSet(hashSet);
  }
  
  private static <T> T a(Object paramObject) {
    return (T)paramObject;
  }
  
  public InputStream a(URI paramURI, boolean paramBoolean) {
    if (paramURI == null)
      return null; 
    try {
      URLConnection uRLConnection;
      if (paramURI.isAbsolute()) {
        uRLConnection = paramURI.toURL().openConnection();
        uRLConnection.setUseCaches(false);
        return uRLConnection.getInputStream();
      } 
      if (this.e != null)
        return this.e.a(uRLConnection.toString()); 
      if (this.d != null)
        return this.d.getAssets().open(uRLConnection.toString()); 
      throw new IllegalStateException("'ApplicationStarter.initialize(context)' must be called first at app start.");
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public <S> Iterable<S> a(Class<S> paramClass) {
    Iterable<net.time4j.e1.f> iterable2 = (Iterable)g.get(paramClass);
    Iterable<net.time4j.e1.f> iterable1 = iterable2;
    if (iterable2 == null)
      if (paramClass == net.time4j.e1.f.class) {
        iterable1 = this.f;
      } else {
        return ServiceLoader.load(paramClass, paramClass.getClassLoader());
      }  
    a(iterable1);
    return (Iterable)iterable1;
  }
  
  public URI a(String paramString1, Class<?> paramClass, String paramString2) {
    try {
      StringBuilder stringBuilder;
      if (h.contains(paramString1)) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("net/time4j/");
        stringBuilder.append(paramString1);
        stringBuilder.append('/');
        stringBuilder.append(paramString2);
        return new URI(stringBuilder.toString());
      } 
      URL uRL = stringBuilder.getClassLoader().getResource(paramString2);
      if (uRL != null)
        return uRL.toURI(); 
    } catch (URISyntaxException uRISyntaxException) {}
    return null;
  }
  
  public void a(Context paramContext, net.time4j.android.a parama) {
    if (paramContext != null) {
      this.d = paramContext;
      this.e = parama;
      this.f = Collections.singletonList(new b(null));
      return;
    } 
    throw new NullPointerException("Missing Android-context.");
  }
  
  private class b implements net.time4j.e1.b0.b {
    private b(AndroidResourceLoader this$0) {}
    
    private String a(String param1String) {
      // Byte code:
      //   0: new java/lang/StringBuilder
      //   3: dup
      //   4: invokespecial <init> : ()V
      //   7: astore #7
      //   9: aload_1
      //   10: invokevirtual length : ()I
      //   13: istore #6
      //   15: iconst_0
      //   16: istore_3
      //   17: iload_3
      //   18: iload #6
      //   20: if_icmpge -> 162
      //   23: aload_1
      //   24: iload_3
      //   25: invokevirtual charAt : (I)C
      //   28: istore_2
      //   29: iload_2
      //   30: bipush #39
      //   32: if_icmpne -> 120
      //   35: aload #7
      //   37: iload_2
      //   38: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   41: pop
      //   42: iload_3
      //   43: iconst_1
      //   44: iadd
      //   45: istore #4
      //   47: iload #4
      //   49: istore #5
      //   51: iload #4
      //   53: iload #6
      //   55: if_icmpge -> 154
      //   58: aload_1
      //   59: iload #4
      //   61: invokevirtual charAt : (I)C
      //   64: istore_2
      //   65: iload #4
      //   67: istore_3
      //   68: iload_2
      //   69: bipush #39
      //   71: if_icmpne -> 110
      //   74: aload #7
      //   76: iload_2
      //   77: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   80: pop
      //   81: iload #4
      //   83: iconst_1
      //   84: iadd
      //   85: istore_3
      //   86: iload #4
      //   88: istore #5
      //   90: iload_3
      //   91: iload #6
      //   93: if_icmpge -> 154
      //   96: iload #4
      //   98: istore #5
      //   100: aload_1
      //   101: iload_3
      //   102: invokevirtual charAt : (I)C
      //   105: bipush #39
      //   107: if_icmpne -> 154
      //   110: aload #7
      //   112: iload_2
      //   113: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   116: pop
      //   117: goto -> 42
      //   120: iload_2
      //   121: bipush #104
      //   123: if_icmpne -> 142
      //   126: bipush #72
      //   128: istore_2
      //   129: aload #7
      //   131: iload_2
      //   132: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   135: pop
      //   136: iload_3
      //   137: istore #5
      //   139: goto -> 154
      //   142: iload_3
      //   143: istore #5
      //   145: iload_2
      //   146: bipush #97
      //   148: if_icmpeq -> 154
      //   151: goto -> 129
      //   154: iload #5
      //   156: iconst_1
      //   157: iadd
      //   158: istore_3
      //   159: goto -> 17
      //   162: aload #7
      //   164: invokevirtual toString : ()Ljava/lang/String;
      //   167: areturn
    }
    
    private net.time4j.e1.b0.b a() {
      return (net.time4j.e1.b0.b)AndroidResourceLoader.c.a();
    }
    
    public String a(net.time4j.e1.e param1e, Locale param1Locale) {
      return a().a(param1e, param1Locale);
    }
    
    public String a(net.time4j.e1.e param1e, Locale param1Locale, boolean param1Boolean) {
      String str = a().a(param1e, param1Locale, param1Boolean);
      if (Locale.getDefault().equals(param1Locale)) {
        String str1;
        if (param1e != net.time4j.e1.e.g) {
          str1 = a().b(net.time4j.e1.e.g, param1Locale);
        } else {
          str1 = str;
        } 
        if (str1.indexOf('a') == -1) {
          param1Boolean = true;
        } else {
          param1Boolean = false;
        } 
        boolean bool = DateFormat.is24HourFormat(AndroidResourceLoader.a(this.a));
        if (bool != param1Boolean) {
          String str2;
          if (bool)
            return a(str).replace("  ", " ").trim(); 
          if (param1Locale.getLanguage().equals("en")) {
            str2 = "b";
          } else {
            str2 = "B";
          } 
          int i = AndroidResourceLoader.a.a[param1e.ordinal()];
          if (i != 1) {
            if (i != 2) {
              if (i != 3) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("h:mm ");
                stringBuilder3.append(str2);
                return stringBuilder3.toString();
              } 
              StringBuilder stringBuilder2 = new StringBuilder();
              stringBuilder2.append("h:mm:ss ");
              stringBuilder2.append(str2);
              return stringBuilder2.toString();
            } 
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("h:mm:ss ");
            stringBuilder1.append(str2);
            stringBuilder1.append(" z");
            return stringBuilder1.toString();
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("h:mm:ss ");
          stringBuilder.append(str2);
          stringBuilder.append(" zzzz");
          return stringBuilder.toString();
        } 
      } 
      return str;
    }
    
    public String a(net.time4j.e1.e param1e1, net.time4j.e1.e param1e2, Locale param1Locale) {
      return a().a(param1e1, param1e2, param1Locale);
    }
    
    public String b(net.time4j.e1.e param1e, Locale param1Locale) {
      return a(param1e, param1Locale, false);
    }
  }
  
  private static final class c {
    private static final net.time4j.f1.c a = new net.time4j.f1.c();
    
    private static final Iterable<net.time4j.e1.i> b = (Iterable)Collections.singleton(net.time4j.f1.f.d);
    
    private static final Iterable<z> c = (Iterable)Collections.singletonList(new net.time4j.f1.i());
    
    private static final Iterable<v> d = Collections.unmodifiableList(Arrays.asList(new v[] { (v)a, (v)new net.time4j.calendar.t.b() }));
  }
  
  private static final class d implements Iterable<s> {
    private d() {}
    
    public Iterator<s> iterator() {
      return AndroidResourceLoader.l.b().iterator();
    }
  }
  
  private static final class e implements Iterable<net.time4j.g1.c> {
    private e() {}
    
    public Iterator<net.time4j.g1.c> iterator() {
      return AndroidResourceLoader.m.c().iterator();
    }
  }
  
  private static final class f implements Iterable<net.time4j.e1.i> {
    private f() {}
    
    public Iterator<net.time4j.e1.i> iterator() {
      return AndroidResourceLoader.c.b().iterator();
    }
  }
  
  private static final class g implements Iterable<o> {
    private g() {}
    
    public Iterator<o> iterator() {
      return AndroidResourceLoader.l.a().iterator();
    }
  }
  
  private static final class h implements Iterable<v> {
    private h() {}
    
    public Iterator<v> iterator() {
      return AndroidResourceLoader.c.d().iterator();
    }
  }
  
  private static final class i implements Iterable<z> {
    private i() {}
    
    public Iterator<z> iterator() {
      return AndroidResourceLoader.c.c().iterator();
    }
  }
  
  private static final class j implements Iterable<s> {
    private j() {}
    
    public Iterator<s> iterator() {
      return AndroidResourceLoader.m.b().iterator();
    }
  }
  
  private static final class k implements Iterable<r> {
    private k() {}
    
    public Iterator<r> iterator() {
      return AndroidResourceLoader.m.a().iterator();
    }
  }
  
  private static final class l {
    private static final Iterable<o> a = (Iterable)Collections.singleton(new net.time4j.f1.a());
    
    private static final Iterable<s> b = Arrays.asList(new s[] { (s)new net.time4j.f1.b(), (s)new net.time4j.calendar.t.c() });
  }
  
  private static final class m {
    private static final Iterable<r> a;
    
    private static final Iterable<s> b;
    
    private static final Iterable<net.time4j.g1.c> c;
    
    static {
      // Byte code:
      //   0: new net/time4j/tz/t/a
      //   3: dup
      //   4: invokespecial <init> : ()V
      //   7: invokestatic singleton : (Ljava/lang/Object;)Ljava/util/Set;
      //   10: putstatic net/time4j/android/spi/AndroidResourceLoader$m.a : Ljava/lang/Iterable;
      //   13: new net/time4j/tz/t/b
      //   16: dup
      //   17: invokespecial <init> : ()V
      //   20: invokestatic singleton : (Ljava/lang/Object;)Ljava/util/Set;
      //   23: putstatic net/time4j/android/spi/AndroidResourceLoader$m.b : Ljava/lang/Iterable;
      //   26: getstatic net/time4j/android/spi/AndroidResourceLoader$m.a : Ljava/lang/Iterable;
      //   29: invokeinterface iterator : ()Ljava/util/Iterator;
      //   34: astore_0
      //   35: aload_0
      //   36: invokeinterface hasNext : ()Z
      //   41: ifeq -> 74
      //   44: aload_0
      //   45: invokeinterface next : ()Ljava/lang/Object;
      //   50: checkcast net/time4j/tz/r
      //   53: astore_1
      //   54: aload_1
      //   55: instanceof net/time4j/g1/c
      //   58: ifeq -> 35
      //   61: ldc net/time4j/g1/c
      //   63: aload_1
      //   64: invokevirtual cast : (Ljava/lang/Object;)Ljava/lang/Object;
      //   67: checkcast net/time4j/g1/c
      //   70: astore_0
      //   71: goto -> 76
      //   74: aconst_null
      //   75: astore_0
      //   76: aload_0
      //   77: ifnonnull -> 87
      //   80: invokestatic emptyList : ()Ljava/util/List;
      //   83: astore_0
      //   84: goto -> 92
      //   87: aload_0
      //   88: invokestatic singleton : (Ljava/lang/Object;)Ljava/util/Set;
      //   91: astore_0
      //   92: aload_0
      //   93: putstatic net/time4j/android/spi/AndroidResourceLoader$m.c : Ljava/lang/Iterable;
      //   96: return
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/android/spi/AndroidResourceLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */