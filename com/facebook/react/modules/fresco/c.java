package com.facebook.react.modules.fresco;

import android.util.Pair;
import com.facebook.systrace.a;
import e.e.l.l.a;
import java.util.HashMap;
import java.util.Map;

public class c extends a {
  int a = 0;
  
  Map<String, Pair<Integer, String>> b = new HashMap<String, Pair<Integer, String>>();
  
  Map<String, Pair<Integer, String>> c = new HashMap<String, Pair<Integer, String>>();
  
  public void a(e.e.l.o.c paramc, Object paramObject, String paramString, boolean paramBoolean) {
    if (!a.b(0L))
      return; 
    paramObject = new StringBuilder();
    paramObject.append("FRESCO_REQUEST_");
    paramObject.append(paramc.p().toString().replace(':', '_'));
    Pair<Integer, String> pair = Pair.create(Integer.valueOf(this.a), paramObject.toString());
    a.a(0L, (String)pair.second, this.a);
    this.c.put(paramString, pair);
    this.a++;
  }
  
  public void a(e.e.l.o.c paramc, String paramString, Throwable paramThrowable, boolean paramBoolean) {
    if (!a.b(0L))
      return; 
    if (this.c.containsKey(paramString)) {
      Pair pair = this.c.get(paramString);
      a.c(0L, (String)pair.second, ((Integer)pair.first).intValue());
      this.c.remove(paramString);
    } 
  }
  
  public void a(e.e.l.o.c paramc, String paramString, boolean paramBoolean) {
    if (!a.b(0L))
      return; 
    if (this.c.containsKey(paramString)) {
      Pair pair = this.c.get(paramString);
      a.c(0L, (String)pair.second, ((Integer)pair.first).intValue());
      this.c.remove(paramString);
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    if (!a.b(0L))
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("FRESCO_PRODUCER_");
    stringBuilder.append(paramString2.replace(':', '_'));
    Pair<Integer, String> pair = Pair.create(Integer.valueOf(this.a), stringBuilder.toString());
    a.a(0L, (String)pair.second, this.a);
    this.b.put(paramString1, pair);
    this.a++;
  }
  
  public void a(String paramString1, String paramString2, String paramString3) {
    if (!a.b(0L))
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("FRESCO_PRODUCER_EVENT_");
    stringBuilder.append(paramString1.replace(':', '_'));
    stringBuilder.append("_");
    stringBuilder.append(paramString2.replace(':', '_'));
    stringBuilder.append("_");
    stringBuilder.append(paramString3.replace(':', '_'));
    a.a(0L, stringBuilder.toString(), a.a.c);
  }
  
  public void a(String paramString1, String paramString2, Throwable paramThrowable, Map<String, String> paramMap) {
    if (!a.b(0L))
      return; 
    if (this.b.containsKey(paramString1)) {
      Pair pair = this.b.get(paramString1);
      a.c(0L, (String)pair.second, ((Integer)pair.first).intValue());
      this.b.remove(paramString1);
    } 
  }
  
  public void a(String paramString1, String paramString2, Map<String, String> paramMap) {
    if (!a.b(0L))
      return; 
    if (this.b.containsKey(paramString1)) {
      Pair pair = this.b.get(paramString1);
      a.c(0L, (String)pair.second, ((Integer)pair.first).intValue());
      this.b.remove(paramString1);
    } 
  }
  
  public boolean a(String paramString) {
    return false;
  }
  
  public void b(String paramString) {
    if (!a.b(0L))
      return; 
    if (this.c.containsKey(paramString)) {
      Pair pair = this.c.get(paramString);
      a.c(0L, (String)pair.second, ((Integer)pair.first).intValue());
      this.c.remove(paramString);
    } 
  }
  
  public void b(String paramString1, String paramString2, Map<String, String> paramMap) {
    if (!a.b(0L))
      return; 
    if (this.b.containsKey(paramString1)) {
      Pair pair = this.b.get(paramString1);
      a.c(0L, (String)pair.second, ((Integer)pair.first).intValue());
      this.b.remove(paramString1);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/fresco/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */