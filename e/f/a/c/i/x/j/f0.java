package e.f.a.c.i.x.j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import e.f.a.c.i.h;
import e.f.a.c.i.i;
import e.f.a.c.i.n;
import e.f.a.c.i.y.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class f0 implements y, b {
  private static final e.f.a.c.b g = e.f.a.c.b.a("proto");
  
  private final h0 c;
  
  private final e.f.a.c.i.z.a d;
  
  private final e.f.a.c.i.z.a e;
  
  private final z f;
  
  f0(e.f.a.c.i.z.a parama1, e.f.a.c.i.z.a parama2, z paramz, h0 paramh0) {
    this.c = paramh0;
    this.d = parama1;
    this.e = parama2;
    this.f = paramz;
  }
  
  private long a(SQLiteDatabase paramSQLiteDatabase, n paramn) {
    Long long_ = b(paramSQLiteDatabase, paramn);
    if (long_ != null)
      return long_.longValue(); 
    ContentValues contentValues = new ContentValues();
    contentValues.put("backend_name", paramn.a());
    contentValues.put("priority", Integer.valueOf(e.f.a.c.i.a0.a.a(paramn.c())));
    contentValues.put("next_request_ms", Integer.valueOf(0));
    if (paramn.b() != null)
      contentValues.put("extras", Base64.encodeToString(paramn.b(), 0)); 
    return paramSQLiteDatabase.insert("transport_contexts", null, contentValues);
  }
  
  static <T> T a(Cursor paramCursor, b<Cursor, T> paramb) {
    try {
      paramb = (b<Cursor, T>)paramb.a(paramCursor);
      return (T)paramb;
    } finally {
      paramCursor.close();
    } 
  }
  
  private <T> T a(d<T> paramd, b<Throwable, T> paramb) {
    long l = this.e.a();
    while (true) {
      try {
        return paramd.a();
      } catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
        if (this.e.a() >= this.f.a() + l)
          return paramb.a(sQLiteDatabaseLockedException); 
        SystemClock.sleep(50L);
      } 
    } 
  }
  
  private List<e0> a(List<e0> paramList, Map<Long, Set<c>> paramMap) {
    ListIterator<e0> listIterator = paramList.listIterator();
    while (listIterator.hasNext()) {
      e0 e0 = listIterator.next();
      if (!paramMap.containsKey(Long.valueOf(e0.b())))
        continue; 
      i.a a1 = e0.a().h();
      for (c c : paramMap.get(Long.valueOf(e0.b())))
        a1.a(c.a, c.b); 
      listIterator.set(e0.a(e0.b(), e0.c(), a1.a()));
    } 
    return paramList;
  }
  
  private Map<Long, Set<c>> a(SQLiteDatabase paramSQLiteDatabase, List<e0> paramList) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    StringBuilder stringBuilder = new StringBuilder("event_id IN (");
    for (int i = 0; i < paramList.size(); i++) {
      stringBuilder.append(((e0)paramList.get(i)).b());
      if (i < paramList.size() - 1)
        stringBuilder.append(','); 
    } 
    stringBuilder.append(')');
    String str = stringBuilder.toString();
    a(paramSQLiteDatabase.query("event_metadata", new String[] { "event_id", "name", "value" }, str, null, null, null, null), new h(hashMap));
    return (Map)hashMap;
  }
  
  private void a(SQLiteDatabase paramSQLiteDatabase) {
    a(new a(paramSQLiteDatabase), j.a);
  }
  
  private byte[] a(long paramLong) {
    return a(a().query("event_payloads", new String[] { "bytes" }, "event_id = ?", new String[] { String.valueOf(paramLong) }, null, null, "sequence_num"), f.a);
  }
  
  private static byte[] a(String paramString) {
    return (paramString == null) ? null : Base64.decode(paramString, 0);
  }
  
  private long b() {
    return a().compileStatement("PRAGMA page_count").simpleQueryForLong();
  }
  
  private static e.f.a.c.b b(String paramString) {
    return (paramString == null) ? g : e.f.a.c.b.a(paramString);
  }
  
  private Long b(SQLiteDatabase paramSQLiteDatabase, n paramn) {
    StringBuilder stringBuilder = new StringBuilder("backend_name = ? and priority = ?");
    ArrayList<String> arrayList = new ArrayList(Arrays.asList((Object[])new String[] { paramn.a(), String.valueOf(e.f.a.c.i.a0.a.a(paramn.c())) }));
    if (paramn.b() != null) {
      stringBuilder.append(" and extras = ?");
      arrayList.add(Base64.encodeToString(paramn.b(), 0));
    } else {
      stringBuilder.append(" and extras is null");
    } 
    String str = stringBuilder.toString();
    String[] arrayOfString = arrayList.<String>toArray(new String[0]);
    return a(paramSQLiteDatabase.query("transport_contexts", new String[] { "_id" }, str, arrayOfString, null, null, null), m.a);
  }
  
  private long c() {
    return a().compileStatement("PRAGMA page_size").simpleQueryForLong();
  }
  
  private static String c(Iterable<e0> paramIterable) {
    StringBuilder stringBuilder = new StringBuilder("(");
    Iterator<e0> iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(((e0)iterator.next()).b());
      if (iterator.hasNext())
        stringBuilder.append(','); 
    } 
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
  
  private List<e0> c(SQLiteDatabase paramSQLiteDatabase, n paramn) {
    ArrayList<e0> arrayList = new ArrayList();
    Long long_ = b(paramSQLiteDatabase, paramn);
    if (long_ == null)
      return arrayList; 
    String str = long_.toString();
    int i = this.f.c();
    a(paramSQLiteDatabase.query("events", new String[] { "_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline" }, "context_id = ?", new String[] { str }, null, null, null, String.valueOf(i)), new d(this, arrayList, paramn));
    return arrayList;
  }
  
  private boolean d() {
    return (b() * c() >= this.f.e());
  }
  
  SQLiteDatabase a() {
    h0 h01 = this.c;
    h01.getClass();
    return a(new u(h01), p.a);
  }
  
  public e0 a(n paramn, i parami) {
    e.f.a.c.i.v.a.a("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", new Object[] { paramn.c(), parami.f(), paramn.a() });
    long l = ((Long)a(new i(this, paramn, parami))).longValue();
    return (l < 1L) ? null : e0.a(l, paramn, parami);
  }
  
  public Iterable<e0> a(n paramn) {
    return a(new k(this, paramn));
  }
  
  <T> T a(b<SQLiteDatabase, T> paramb) {
    SQLiteDatabase sQLiteDatabase = a();
    sQLiteDatabase.beginTransaction();
    try {
      paramb = (b<SQLiteDatabase, T>)paramb.a(sQLiteDatabase);
      sQLiteDatabase.setTransactionSuccessful();
      return (T)paramb;
    } finally {
      sQLiteDatabase.endTransaction();
    } 
  }
  
  public <T> T a(b.a<T> parama) {
    SQLiteDatabase sQLiteDatabase = a();
    a(sQLiteDatabase);
    try {
      Object object = parama.execute();
      sQLiteDatabase.setTransactionSuccessful();
      return (T)object;
    } finally {
      sQLiteDatabase.endTransaction();
    } 
  }
  
  public void a(n paramn, long paramLong) {
    a(new n(paramLong, paramn));
  }
  
  public void a(Iterable<e0> paramIterable) {
    if (!paramIterable.iterator().hasNext())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("DELETE FROM events WHERE _id in ");
    stringBuilder.append(c(paramIterable));
    String str = stringBuilder.toString();
    a().compileStatement(str).execute();
  }
  
  public long b(n paramn) {
    return ((Long)a(a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[] { paramn.a(), String.valueOf(e.f.a.c.i.a0.a.a(paramn.c())) }), b.a)).longValue();
  }
  
  public void b(Iterable<e0> paramIterable) {
    if (!paramIterable.iterator().hasNext())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
    stringBuilder.append(c(paramIterable));
    a(new e(stringBuilder.toString()));
  }
  
  public boolean c(n paramn) {
    return ((Boolean)a(new g(this, paramn))).booleanValue();
  }
  
  public void close() {
    this.c.close();
  }
  
  public int s() {
    return ((Integer)a(new c(this.d.a() - this.f.b()))).intValue();
  }
  
  public Iterable<n> w() {
    return a(o.a);
  }
  
  static interface b<T, U> {
    U a(T param1T);
  }
  
  private static class c {
    final String a;
    
    final String b;
    
    private c(String param1String1, String param1String2) {
      this.a = param1String1;
      this.b = param1String2;
    }
  }
  
  static interface d<T> {
    T a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/x/j/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */