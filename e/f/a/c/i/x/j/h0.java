package e.f.a.c.i.x.j;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

final class h0 extends SQLiteOpenHelper {
  static int e = 4;
  
  private static final a f = s.a;
  
  private static final a g = t.a;
  
  private static final a h = r.a;
  
  private static final a i = q.a;
  
  private static final List<a> j = Arrays.asList(new a[] { f, g, h, i });
  
  private final int c;
  
  private boolean d = false;
  
  h0(Context paramContext, String paramString, int paramInt) {
    super(paramContext, paramString, null, paramInt);
    this.c = paramInt;
  }
  
  private void a(SQLiteDatabase paramSQLiteDatabase) {
    if (!this.d)
      onConfigure(paramSQLiteDatabase); 
  }
  
  private void a(SQLiteDatabase paramSQLiteDatabase, int paramInt) {
    a(paramSQLiteDatabase);
    a(paramSQLiteDatabase, 0, paramInt);
  }
  
  private void a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    if (paramInt2 <= j.size()) {
      while (paramInt1 < paramInt2) {
        ((a)j.get(paramInt1)).a(paramSQLiteDatabase);
        paramInt1++;
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Migration from ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" to ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" was requested, but cannot be performed. Only ");
    stringBuilder.append(j.size());
    stringBuilder.append(" migrations are provided");
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  public void onConfigure(SQLiteDatabase paramSQLiteDatabase) {
    this.d = true;
    paramSQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
    if (Build.VERSION.SDK_INT >= 16)
      paramSQLiteDatabase.setForeignKeyConstraintsEnabled(true); 
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase) {
    a(paramSQLiteDatabase, this.c);
  }
  
  public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    paramSQLiteDatabase.execSQL("DROP TABLE events");
    paramSQLiteDatabase.execSQL("DROP TABLE event_metadata");
    paramSQLiteDatabase.execSQL("DROP TABLE transport_contexts");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
    a(paramSQLiteDatabase, paramInt2);
  }
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase) {
    a(paramSQLiteDatabase);
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    a(paramSQLiteDatabase);
    a(paramSQLiteDatabase, paramInt1, paramInt2);
  }
  
  public static interface a {
    void a(SQLiteDatabase param1SQLiteDatabase);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/x/j/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */