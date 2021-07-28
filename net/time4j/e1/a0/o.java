package net.time4j.e1.a0;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.d1.d;
import net.time4j.d1.p;
import net.time4j.e1.a;

final class o<V> implements h<V> {
  private final p<V> c;
  
  private final Map<V, String> d;
  
  private final int e;
  
  private final boolean f;
  
  private final Locale g;
  
  o(p<V> paramp, Map<V, String> paramMap) {
    StringBuilder stringBuilder;
    HashMap<Object, Object> hashMap;
    Class<?> clazz = paramp.getType();
    if (clazz.isEnum()) {
      Map<?, String> map;
      if (paramMap.size() >= (clazz.getEnumConstants()).length) {
        map = a(clazz);
      } else {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Not enough text resources defined for enum: ");
        stringBuilder.append(map.getName());
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
    } else {
      hashMap = new HashMap<Object, Object>(paramMap.size());
    } 
    hashMap.putAll(paramMap);
    this.c = (p<V>)stringBuilder;
    this.d = Collections.unmodifiableMap((Map)hashMap);
    this.e = 0;
    this.f = true;
    this.g = Locale.getDefault();
  }
  
  private o(p<V> paramp, Map<V, String> paramMap, int paramInt, boolean paramBoolean, Locale paramLocale) {
    this.c = paramp;
    this.d = paramMap;
    this.e = paramInt;
    this.f = paramBoolean;
    this.g = paramLocale;
  }
  
  private int a(net.time4j.d1.o paramo, Appendable paramAppendable) {
    String str = a((V)paramo.e(this.c));
    paramAppendable.append(str);
    return str.length();
  }
  
  private String a(V paramV) {
    String str2 = this.d.get(paramV);
    String str1 = str2;
    if (str2 == null)
      str1 = paramV.toString(); 
    return str1;
  }
  
  private static <V, K extends Enum<K>> Map<V, String> a(Class<V> paramClass) {
    return new EnumMap<V, String>(paramClass);
  }
  
  public int a(net.time4j.d1.o paramo, Appendable paramAppendable, d paramd, Set<g> paramSet, boolean paramBoolean) {
    if (paramAppendable instanceof CharSequence) {
      CharSequence charSequence = (CharSequence)paramAppendable;
      int i = charSequence.length();
      int j = a(paramo, paramAppendable);
      if (paramSet != null)
        paramSet.add(new g(this.c, i, charSequence.length())); 
      return j;
    } 
    return a(paramo, paramAppendable);
  }
  
  public h<V> a(p<V> paramp) {
    return (this.c == paramp) ? this : new o(paramp, this.d);
  }
  
  public h<V> a(c<?> paramc, d paramd, int paramInt) {
    return new o(this.c, this.d, ((Integer)paramd.a(a.s, Integer.valueOf(0))).intValue(), ((Boolean)paramd.a(a.i, Boolean.TRUE)).booleanValue(), (Locale)paramd.a(a.c, Locale.getDefault()));
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
    //   20: getfield e : I
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
    //   89: getfield c : Lnet/time4j/d1/p;
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
    //   118: ifeq -> 130
    //   121: aload_0
    //   122: getfield f : Z
    //   125: istore #10
    //   127: goto -> 150
    //   130: aload_3
    //   131: getstatic net/time4j/e1/a.i : Lnet/time4j/d1/c;
    //   134: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   137: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   142: checkcast java/lang/Boolean
    //   145: invokevirtual booleanValue : ()Z
    //   148: istore #10
    //   150: iload #5
    //   152: ifeq -> 163
    //   155: aload_0
    //   156: getfield g : Ljava/util/Locale;
    //   159: astore_3
    //   160: goto -> 179
    //   163: aload_3
    //   164: getstatic net/time4j/e1/a.c : Lnet/time4j/d1/c;
    //   167: invokestatic getDefault : ()Ljava/util/Locale;
    //   170: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   175: checkcast java/util/Locale
    //   178: astore_3
    //   179: iload #7
    //   181: iload #9
    //   183: isub
    //   184: istore #6
    //   186: aload_0
    //   187: getfield d : Ljava/util/Map;
    //   190: invokeinterface keySet : ()Ljava/util/Set;
    //   195: invokeinterface iterator : ()Ljava/util/Iterator;
    //   200: astore #11
    //   202: aload #11
    //   204: invokeinterface hasNext : ()Z
    //   209: ifeq -> 370
    //   212: aload #11
    //   214: invokeinterface next : ()Ljava/lang/Object;
    //   219: astore #12
    //   221: aload_0
    //   222: aload #12
    //   224: invokespecial a : (Ljava/lang/Object;)Ljava/lang/String;
    //   227: astore #13
    //   229: iload #10
    //   231: ifeq -> 308
    //   234: aload #13
    //   236: aload_3
    //   237: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   240: astore #14
    //   242: aload #13
    //   244: invokevirtual length : ()I
    //   247: istore #7
    //   249: iload #7
    //   251: iload #6
    //   253: if_icmpgt -> 202
    //   256: iload #7
    //   258: iload #9
    //   260: iadd
    //   261: istore #7
    //   263: aload #14
    //   265: aload_1
    //   266: iload #9
    //   268: iload #7
    //   270: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   275: invokeinterface toString : ()Ljava/lang/String;
    //   280: aload_3
    //   281: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   284: invokevirtual equals : (Ljava/lang/Object;)Z
    //   287: ifeq -> 202
    //   290: aload #4
    //   292: aload_0
    //   293: getfield c : Lnet/time4j/d1/p;
    //   296: aload #12
    //   298: invokevirtual c : (Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   301: aload_2
    //   302: iload #7
    //   304: invokevirtual a : (I)V
    //   307: return
    //   308: aload #13
    //   310: invokevirtual length : ()I
    //   313: istore #7
    //   315: iload #7
    //   317: iload #6
    //   319: if_icmpgt -> 202
    //   322: iload #7
    //   324: iload #9
    //   326: iadd
    //   327: istore #7
    //   329: aload #13
    //   331: aload_1
    //   332: iload #9
    //   334: iload #7
    //   336: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   341: invokeinterface toString : ()Ljava/lang/String;
    //   346: invokevirtual equals : (Ljava/lang/Object;)Z
    //   349: ifeq -> 202
    //   352: aload #4
    //   354: aload_0
    //   355: getfield c : Lnet/time4j/d1/p;
    //   358: aload #12
    //   360: invokevirtual c : (Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   363: aload_2
    //   364: iload #7
    //   366: invokevirtual a : (I)V
    //   369: return
    //   370: new java/lang/StringBuilder
    //   373: dup
    //   374: invokespecial <init> : ()V
    //   377: astore_1
    //   378: aload_1
    //   379: ldc 'Element value could not be parsed: '
    //   381: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: pop
    //   385: aload_1
    //   386: aload_0
    //   387: getfield c : Lnet/time4j/d1/p;
    //   390: invokeinterface name : ()Ljava/lang/String;
    //   395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: pop
    //   399: aload_2
    //   400: iload #9
    //   402: aload_1
    //   403: invokevirtual toString : ()Ljava/lang/String;
    //   406: invokevirtual a : (ILjava/lang/String;)V
    //   409: return
  }
  
  public boolean a() {
    return false;
  }
  
  public p<V> b() {
    return this.c;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof o) {
      paramObject = paramObject;
      return (this.c.equals(((o)paramObject).c) && this.d.equals(((o)paramObject).d));
    } 
    return false;
  }
  
  public int hashCode() {
    return this.c.hashCode() * 7 + this.d.hashCode() * 31;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(512);
    stringBuilder.append(o.class.getName());
    stringBuilder.append("[element=");
    stringBuilder.append(this.c.name());
    stringBuilder.append(", resources=");
    stringBuilder.append(this.d);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */