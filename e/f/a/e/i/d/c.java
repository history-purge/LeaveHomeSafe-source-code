package e.f.a.e.i.d;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c {
  private static final ConcurrentHashMap<Uri, c> h = new ConcurrentHashMap<Uri, c>();
  
  private static final String[] i = new String[] { "key", "value" };
  
  private final ContentResolver a;
  
  private final Uri b;
  
  private final ContentObserver c;
  
  private final Object d = new Object();
  
  private volatile Map<String, String> e;
  
  private final Object f = new Object();
  
  private final List<e> g = new ArrayList<e>();
  
  private c(ContentResolver paramContentResolver, Uri paramUri) {
    this.a = paramContentResolver;
    this.b = paramUri;
    this.c = new d(this, null);
  }
  
  public static c a(ContentResolver paramContentResolver, Uri paramUri) {
    c c2 = h.get(paramUri);
    c c1 = c2;
    if (c2 == null) {
      c c3 = new c(paramContentResolver, paramUri);
      c1 = h.putIfAbsent(paramUri, c3);
      if (c1 == null) {
        c3.a.registerContentObserver(c3.b, false, c3.c);
        return c3;
      } 
    } 
    return c1;
  }
  
  private final Map<String, String> c() {
    try {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      Cursor cursor = this.a.query(this.b, i, null, null, null);
      if (cursor != null)
        try {
          while (cursor.moveToNext())
            hashMap.put(cursor.getString(0), cursor.getString(1)); 
          return (Map)hashMap;
        } finally {
          cursor.close();
        }  
      return (Map)hashMap;
    } catch (SecurityException|android.database.sqlite.SQLiteException securityException) {
      Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
      return null;
    } 
  }
  
  private final void d() {
    synchronized (this.f) {
      Iterator<e> iterator = this.g.iterator();
      while (iterator.hasNext())
        ((e)iterator.next()).d(); 
      return;
    } 
  }
  
  public final Map<String, String> a() {
    Map<String, String> map1;
    if (f.a("gms:phenotype:phenotype_flag:debug_disable_caching", false)) {
      map1 = c();
    } else {
      map1 = this.e;
    } 
    Map<String, String> map2 = map1;
    if (map1 == null)
      synchronized (this.d) {
        map2 = this.e;
        map1 = map2;
        if (map2 == null) {
          map1 = c();
          this.e = map1;
        } 
        map2 = map1;
      }  
    return (map2 != null) ? map2 : Collections.emptyMap();
  }
  
  public final void b() {
    synchronized (this.d) {
      this.e = null;
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */