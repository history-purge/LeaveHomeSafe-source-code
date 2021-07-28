package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.h.a;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class e {
  private Random a = new Random();
  
  private final Map<Integer, String> b = new HashMap<Integer, String>();
  
  private final Map<String, Integer> c = new HashMap<String, Integer>();
  
  private final Map<String, c> d = new HashMap<String, c>();
  
  ArrayList<String> e = new ArrayList<String>();
  
  final transient Map<String, b<?>> f = new HashMap<String, b<?>>();
  
  final Map<String, Object> g = new HashMap<String, Object>();
  
  final Bundle h = new Bundle();
  
  private int a() {
    int i = this.a.nextInt(2147418112);
    while (true) {
      i += 65536;
      if (this.b.containsKey(Integer.valueOf(i))) {
        i = this.a.nextInt(2147418112);
        continue;
      } 
      return i;
    } 
  }
  
  private void a(int paramInt, String paramString) {
    this.b.put(Integer.valueOf(paramInt), paramString);
    this.c.put(paramString, Integer.valueOf(paramInt));
  }
  
  private <O> void a(String paramString, int paramInt, Intent paramIntent, b<O> paramb) {
    if (paramb != null) {
      b<O> b1 = paramb.a;
      if (b1 != null) {
        b1.a((O)paramb.b.a(paramInt, paramIntent));
        return;
      } 
    } 
    this.g.remove(paramString);
    this.h.putParcelable(paramString, new a(paramInt, paramIntent));
  }
  
  private int b(String paramString) {
    Integer integer = this.c.get(paramString);
    if (integer != null)
      return integer.intValue(); 
    int i = a();
    a(i, paramString);
    return i;
  }
  
  public final <I, O> d<I> a(String paramString, a<I, O> parama, b<O> paramb) {
    int i = b(paramString);
    this.f.put(paramString, new b(paramb, parama));
    if (this.g.containsKey(paramString)) {
      Object object = this.g.get(paramString);
      this.g.remove(paramString);
      paramb.a((O)object);
    } 
    a a1 = (a)this.h.getParcelable(paramString);
    if (a1 != null) {
      this.h.remove(paramString);
      paramb.a((O)parama.a(a1.f(), a1.e()));
    } 
    return new a(this, paramString, i, parama);
  }
  
  public abstract <I, O> void a(int paramInt, a<I, O> parama, @SuppressLint({"UnknownNullness"}) I paramI, androidx.core.app.b paramb);
  
  public final void a(Bundle paramBundle) {
    if (paramBundle == null)
      return; 
    ArrayList<Integer> arrayList = paramBundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
    ArrayList<String> arrayList1 = paramBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
    if (arrayList1 != null) {
      if (arrayList == null)
        return; 
      int j = arrayList1.size();
      for (int i = 0; i < j; i++)
        a(((Integer)arrayList.get(i)).intValue(), arrayList1.get(i)); 
      this.e = paramBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
      this.a = (Random)paramBundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
      this.h.putAll(paramBundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
    } 
  }
  
  final void a(String paramString) {
    if (!this.e.contains(paramString)) {
      Integer integer = this.c.remove(paramString);
      if (integer != null)
        this.b.remove(integer); 
    } 
    this.f.remove(paramString);
    if (this.g.containsKey(paramString)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Dropping pending result for request ");
      stringBuilder.append(paramString);
      stringBuilder.append(": ");
      stringBuilder.append(this.g.get(paramString));
      Log.w("ActivityResultRegistry", stringBuilder.toString());
      this.g.remove(paramString);
    } 
    if (this.h.containsKey(paramString)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Dropping pending result for request ");
      stringBuilder.append(paramString);
      stringBuilder.append(": ");
      stringBuilder.append(this.h.getParcelable(paramString));
      Log.w("ActivityResultRegistry", stringBuilder.toString());
      this.h.remove(paramString);
    } 
    c c = this.d.get(paramString);
    if (c != null) {
      c.a();
      this.d.remove(paramString);
    } 
  }
  
  public final boolean a(int paramInt1, int paramInt2, Intent paramIntent) {
    String str = this.b.get(Integer.valueOf(paramInt1));
    if (str == null)
      return false; 
    this.e.remove(str);
    a(str, paramInt2, paramIntent, this.f.get(str));
    return true;
  }
  
  public final <O> boolean a(int paramInt, @SuppressLint({"UnknownNullness"}) O paramO) {
    String str = this.b.get(Integer.valueOf(paramInt));
    if (str == null)
      return false; 
    this.e.remove(str);
    b b = this.f.get(str);
    if (b != null) {
      b<O> b1 = b.a;
      if (b1 == null) {
        this.h.remove(str);
        this.g.put(str, paramO);
        return true;
      } 
      b1.a(paramO);
      return true;
    } 
    this.h.remove(str);
    this.g.put(str, paramO);
    return true;
  }
  
  public final void b(Bundle paramBundle) {
    paramBundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.b.keySet()));
    paramBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.b.values()));
    paramBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<String>(this.e));
    paramBundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle)this.h.clone());
    paramBundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.a);
  }
  
  class a extends d<I> {
    a(e this$0, String param1String, int param1Int, a param1a) {}
    
    public void a() {
      this.d.a(this.a);
    }
    
    public void a(I param1I, androidx.core.app.b param1b) {
      this.d.e.add(this.a);
      this.d.a(this.b, this.c, param1I, param1b);
    }
  }
  
  private static class b<O> {
    final b<O> a;
    
    final a<?, O> b;
    
    b(b<O> param1b, a<?, O> param1a) {
      this.a = param1b;
      this.b = param1a;
    }
  }
  
  private static class c {
    final g a;
    
    private final ArrayList<h> b;
    
    void a() {
      for (h h : this.b)
        this.a.b((i)h); 
      this.b.clear();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/activity/result/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */