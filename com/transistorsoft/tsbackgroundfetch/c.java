package com.transistorsoft.tsbackgroundfetch;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
  static int b = 999;
  
  private b a;
  
  private c(b paramb) {
    this.a = paramb;
    if (b.a(this.a) == null) {
      if (!b.g(this.a)) {
        Log.w("TSBackgroundFetch", "- Configuration error:  In order to use stopOnTerminate: false, you must set enableHeadless: true");
        this.a.i(true);
      } 
      if (b.h(this.a)) {
        Log.w("TSBackgroundFetch", "- Configuration error:  In order to use startOnBoot: true, you must enableHeadless: true");
        this.a.h(false);
      } 
    } 
  }
  
  static void a(Context paramContext, c paramc) {
    b.e().execute(new a(paramContext, paramc));
  }
  
  public long a() {
    return b.f(this.a);
  }
  
  void a(Context paramContext) {
    SharedPreferences sharedPreferences = paramContext.getSharedPreferences("TSBackgroundFetch", 0);
    Set<?> set2 = sharedPreferences.getStringSet("tasks", new HashSet());
    Set<?> set1 = set2;
    if (set2 == null)
      set1 = new HashSet(); 
    if (set1.contains(b.i(this.a))) {
      set1 = new HashSet(set1);
      set1.remove(b.i(this.a));
      SharedPreferences.Editor editor = sharedPreferences.edit();
      editor.putStringSet("tasks", set1);
      editor.apply();
    } 
    if (!b.j(this.a)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("TSBackgroundFetch:");
      stringBuilder.append(b.i(this.a));
      SharedPreferences.Editor editor = paramContext.getSharedPreferences(stringBuilder.toString(), 0).edit();
      editor.clear();
      editor.apply();
    } 
  }
  
  void b(Context paramContext) {
    SharedPreferences sharedPreferences = paramContext.getSharedPreferences("TSBackgroundFetch", 0);
    Set<?> set2 = sharedPreferences.getStringSet("tasks", new HashSet());
    Set<?> set1 = set2;
    if (set2 == null)
      set1 = new HashSet(); 
    if (!set1.contains(b.i(this.a))) {
      set1 = new HashSet(set1);
      set1.add(b.i(this.a));
      SharedPreferences.Editor editor1 = sharedPreferences.edit();
      editor1.putStringSet("tasks", set1);
      editor1.apply();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("TSBackgroundFetch:");
    stringBuilder.append(b.i(this.a));
    SharedPreferences.Editor editor = paramContext.getSharedPreferences(stringBuilder.toString(), 0).edit();
    editor.putString("taskId", b.i(this.a));
    editor.putBoolean("isFetchTask", b.j(this.a));
    editor.putInt("minimumFetchInterval", b.k(this.a));
    editor.putBoolean("stopOnTerminate", b.g(this.a));
    editor.putBoolean("startOnBoot", b.h(this.a));
    editor.putInt("requiredNetworkType", b.l(this.a));
    editor.putBoolean("requiresBatteryNotLow", b.m(this.a));
    editor.putBoolean("requiresCharging", b.n(this.a));
    editor.putBoolean("requiresDeviceIdle", b.b(this.a));
    editor.putBoolean("requiresStorageNotLow", b.c(this.a));
    editor.putString("jobService", b.a(this.a));
    editor.putBoolean("forceAlarmManager", b.d(this.a));
    editor.putBoolean("periodic", b.e(this.a));
    editor.putLong("delay", b.f(this.a));
    editor.apply();
  }
  
  public boolean b() {
    return b.d(this.a);
  }
  
  int c() {
    return b.d(this.a) ? 0 : (o() ? b : b.i(this.a).hashCode());
  }
  
  public String d() {
    return b.a(this.a);
  }
  
  public int e() {
    return b.k(this.a);
  }
  
  public boolean f() {
    return (b.e(this.a) || o());
  }
  
  public int g() {
    return b.l(this.a);
  }
  
  public boolean h() {
    return b.m(this.a);
  }
  
  public boolean i() {
    return b.n(this.a);
  }
  
  public boolean j() {
    return b.b(this.a);
  }
  
  public boolean k() {
    return b.c(this.a);
  }
  
  public boolean l() {
    return b.h(this.a);
  }
  
  public boolean m() {
    return b.g(this.a);
  }
  
  public String n() {
    return b.i(this.a);
  }
  
  boolean o() {
    return b.j(this.a);
  }
  
  public String toString() {
    JSONObject jSONObject = new JSONObject();
    try {
      jSONObject.put("taskId", b.i(this.a));
      jSONObject.put("isFetchTask", b.j(this.a));
      jSONObject.put("minimumFetchInterval", b.k(this.a));
      jSONObject.put("stopOnTerminate", b.g(this.a));
      jSONObject.put("requiredNetworkType", b.l(this.a));
      jSONObject.put("requiresBatteryNotLow", b.m(this.a));
      jSONObject.put("requiresCharging", b.n(this.a));
      jSONObject.put("requiresDeviceIdle", b.b(this.a));
      jSONObject.put("requiresStorageNotLow", b.c(this.a));
      jSONObject.put("startOnBoot", b.h(this.a));
      jSONObject.put("jobService", b.a(this.a));
      jSONObject.put("forceAlarmManager", b.d(this.a));
      jSONObject.put("periodic", f());
      jSONObject.put("delay", b.f(this.a));
      return jSONObject.toString(2);
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      return jSONObject.toString();
    } 
  }
  
  static final class a implements Runnable {
    a(Context param1Context, c.c param1c) {}
    
    public void run() {
      ArrayList<c> arrayList = new ArrayList();
      Set set = this.c.getSharedPreferences("TSBackgroundFetch", 0).getStringSet("tasks", new HashSet());
      if (set != null)
        for (String str : set)
          arrayList.add((new c.b()).a(this.c, str));  
      b.f().post(new a(this, arrayList));
    }
    
    class a implements Runnable {
      a(c.a this$0, List param2List) {}
      
      public void run() {
        this.d.d.a(this.c);
      }
    }
  }
  
  class a implements Runnable {
    a(c this$0, List param1List) {}
    
    public void run() {
      this.d.d.a(this.c);
    }
  }
  
  public static class b {
    private String a;
    
    private int b = 15;
    
    private long c = -1L;
    
    private boolean d = false;
    
    private boolean e = false;
    
    private boolean f = true;
    
    private boolean g = false;
    
    private int h = 0;
    
    private boolean i = false;
    
    private boolean j = false;
    
    private boolean k = false;
    
    private boolean l = false;
    
    private boolean m = false;
    
    private String n = null;
    
    public b a(int param1Int) {
      if (param1Int >= 1)
        this.b = param1Int; 
      return this;
    }
    
    public b a(long param1Long) {
      this.c = param1Long;
      return this;
    }
    
    public b a(String param1String) {
      this.n = param1String;
      return this;
    }
    
    public b a(boolean param1Boolean) {
      this.e = param1Boolean;
      return this;
    }
    
    public c a() {
      return new c(this, null);
    }
    
    public c a(Context param1Context, String param1String) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("TSBackgroundFetch:");
      stringBuilder.append(param1String);
      SharedPreferences sharedPreferences = param1Context.getSharedPreferences(stringBuilder.toString(), 0);
      if (sharedPreferences.contains("taskId"))
        b(sharedPreferences.getString("taskId", param1String)); 
      if (sharedPreferences.contains("isFetchTask"))
        b(sharedPreferences.getBoolean("isFetchTask", this.m)); 
      if (sharedPreferences.contains("minimumFetchInterval"))
        a(sharedPreferences.getInt("minimumFetchInterval", this.b)); 
      if (sharedPreferences.contains("stopOnTerminate"))
        i(sharedPreferences.getBoolean("stopOnTerminate", this.f)); 
      if (sharedPreferences.contains("requiredNetworkType"))
        b(sharedPreferences.getInt("requiredNetworkType", this.h)); 
      if (sharedPreferences.contains("requiresBatteryNotLow"))
        d(sharedPreferences.getBoolean("requiresBatteryNotLow", this.i)); 
      if (sharedPreferences.contains("requiresCharging"))
        e(sharedPreferences.getBoolean("requiresCharging", this.j)); 
      if (sharedPreferences.contains("requiresDeviceIdle"))
        f(sharedPreferences.getBoolean("requiresDeviceIdle", this.k)); 
      if (sharedPreferences.contains("requiresStorageNotLow"))
        g(sharedPreferences.getBoolean("requiresStorageNotLow", this.l)); 
      if (sharedPreferences.contains("startOnBoot"))
        h(sharedPreferences.getBoolean("startOnBoot", this.g)); 
      if (sharedPreferences.contains("jobService"))
        a(sharedPreferences.getString("jobService", null)); 
      if (sharedPreferences.contains("forceAlarmManager"))
        a(sharedPreferences.getBoolean("forceAlarmManager", this.e)); 
      if (sharedPreferences.contains("periodic"))
        c(sharedPreferences.getBoolean("periodic", this.d)); 
      if (sharedPreferences.contains("delay"))
        a(sharedPreferences.getLong("delay", this.c)); 
      return new c(this, null);
    }
    
    public b b(int param1Int) {
      if (Build.VERSION.SDK_INT >= 22) {
        int i = param1Int;
        if (param1Int != 1) {
          i = param1Int;
          if (param1Int != 4) {
            i = param1Int;
            if (param1Int != 0) {
              i = param1Int;
              if (param1Int != 3) {
                i = param1Int;
                if (param1Int != 2) {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append("[ERROR] Invalid requiredNetworkType: ");
                  stringBuilder.append(param1Int);
                  stringBuilder.append("; Defaulting to NETWORK_TYPE_NONE");
                  Log.e("TSBackgroundFetch", stringBuilder.toString());
                  i = 0;
                } 
              } 
            } 
          } 
        } 
        this.h = i;
      } 
      return this;
    }
    
    public b b(String param1String) {
      this.a = param1String;
      return this;
    }
    
    public b b(boolean param1Boolean) {
      this.m = param1Boolean;
      return this;
    }
    
    public b c(boolean param1Boolean) {
      this.d = param1Boolean;
      return this;
    }
    
    public b d(boolean param1Boolean) {
      this.i = param1Boolean;
      return this;
    }
    
    public b e(boolean param1Boolean) {
      this.j = param1Boolean;
      return this;
    }
    
    public b f(boolean param1Boolean) {
      this.k = param1Boolean;
      return this;
    }
    
    public b g(boolean param1Boolean) {
      this.l = param1Boolean;
      return this;
    }
    
    public b h(boolean param1Boolean) {
      this.g = param1Boolean;
      return this;
    }
    
    public b i(boolean param1Boolean) {
      this.f = param1Boolean;
      return this;
    }
  }
  
  static interface c {
    void a(List<c> param1List);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/transistorsoft/tsbackgroundfetch/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */