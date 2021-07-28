package e.f.a.e.i.n;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class w4 {
  static String a(r4 paramr4, String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("# ");
    stringBuilder.append(paramString);
    a(paramr4, stringBuilder, 0);
    return stringBuilder.toString();
  }
  
  private static final String a(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < paramString.length(); i++) {
      char c = paramString.charAt(i);
      if (Character.isUpperCase(c))
        stringBuilder.append("_"); 
      stringBuilder.append(Character.toLowerCase(c));
    } 
    return stringBuilder.toString();
  }
  
  private static void a(r4 paramr4, StringBuilder paramStringBuilder, int paramInt) {
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    TreeSet<String> treeSet = new TreeSet();
    for (Method method : paramr4.getClass().getDeclaredMethods()) {
      hashMap2.put(method.getName(), method);
      if ((method.getParameterTypes()).length == 0) {
        hashMap1.put(method.getName(), method);
        if (method.getName().startsWith("get"))
          treeSet.add(method.getName()); 
      } 
    } 
    Iterator<String> iterator = treeSet.iterator();
    while (true) {
      while (true)
        break; 
      if (SYNTHETIC_LOCAL_VARIABLE_5 != null)
        a(paramStringBuilder, paramInt, a((String)SYNTHETIC_LOCAL_VARIABLE_7), method); 
    } 
    if (paramr4 instanceof h3.c) {
      Iterator<Map.Entry<h3.e, Object>> iterator1 = ((h3.c)paramr4).zzc.c();
      while (iterator1.hasNext()) {
        Map.Entry entry = iterator1.next();
        int i = ((h3.e)entry.getKey()).c;
        StringBuilder stringBuilder = new StringBuilder(13);
        stringBuilder.append("[");
        stringBuilder.append(i);
        stringBuilder.append("]");
        a(paramStringBuilder, paramInt, stringBuilder.toString(), entry.getValue());
      } 
    } 
    d6 d6 = ((h3)paramr4).zzb;
    if (d6 != null)
      d6.a(paramStringBuilder, paramInt); 
  }
  
  static final void a(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject) {
    if (paramObject instanceof List) {
      paramObject = ((List)paramObject).iterator();
      while (paramObject.hasNext())
        a(paramStringBuilder, paramInt, paramString, paramObject.next()); 
      return;
    } 
    if (paramObject instanceof Map) {
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (paramObject.hasNext())
        a(paramStringBuilder, paramInt, paramString, paramObject.next()); 
      return;
    } 
    paramStringBuilder.append('\n');
    boolean bool1 = false;
    boolean bool2 = false;
    int i;
    for (i = 0; i < paramInt; i++)
      paramStringBuilder.append(' '); 
    paramStringBuilder.append(paramString);
    if (paramObject instanceof String) {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(w5.a(z1.a((String)paramObject)));
      paramStringBuilder.append('"');
      return;
    } 
    if (paramObject instanceof z1) {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(w5.a((z1)paramObject));
      paramStringBuilder.append('"');
      return;
    } 
    if (paramObject instanceof h3) {
      paramStringBuilder.append(" {");
      a((h3)paramObject, paramStringBuilder, paramInt + 2);
      paramStringBuilder.append("\n");
      for (i = bool2; i < paramInt; i++)
        paramStringBuilder.append(' '); 
      paramStringBuilder.append("}");
      return;
    } 
    if (paramObject instanceof Map.Entry) {
      paramStringBuilder.append(" {");
      Map.Entry entry = (Map.Entry)paramObject;
      i = paramInt + 2;
      a(paramStringBuilder, i, "key", entry.getKey());
      a(paramStringBuilder, i, "value", entry.getValue());
      paramStringBuilder.append("\n");
      for (i = bool1; i < paramInt; i++)
        paramStringBuilder.append(' '); 
      paramStringBuilder.append("}");
      return;
    } 
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject.toString());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/w4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */