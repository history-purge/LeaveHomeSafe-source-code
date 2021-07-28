package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class e extends SQLiteOpenHelper {
  private static e f;
  
  private Context c;
  
  private SQLiteDatabase d;
  
  private long e = d.a.longValue() * 1024L * 1024L;
  
  private e(Context paramContext) {
    super(paramContext, "RKStorage", null, 1);
    this.c = paramContext;
  }
  
  public static e a(Context paramContext) {
    if (f == null)
      f = new e(paramContext.getApplicationContext()); 
    return f;
  }
  
  private void e() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Landroid/database/sqlite/SQLiteDatabase;
    //   6: ifnull -> 31
    //   9: aload_0
    //   10: getfield d : Landroid/database/sqlite/SQLiteDatabase;
    //   13: invokevirtual isOpen : ()Z
    //   16: ifeq -> 31
    //   19: aload_0
    //   20: getfield d : Landroid/database/sqlite/SQLiteDatabase;
    //   23: invokevirtual close : ()V
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield d : Landroid/database/sqlite/SQLiteDatabase;
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   2	31	34	finally
  }
  
  private boolean r() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial e : ()V
    //   6: aload_0
    //   7: getfield c : Landroid/content/Context;
    //   10: ldc 'RKStorage'
    //   12: invokevirtual deleteDatabase : (Ljava/lang/String;)Z
    //   15: istore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: iload_1
    //   19: ireturn
    //   20: astore_2
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_2
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	20	finally
  }
  
  void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual d : ()Landroid/database/sqlite/SQLiteDatabase;
    //   6: ldc 'catalystLocalStorage'
    //   8: aconst_null
    //   9: aconst_null
    //   10: invokevirtual delete : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   13: pop
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally
  }
  
  public void b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual a : ()V
    //   6: aload_0
    //   7: invokespecial e : ()V
    //   10: ldc 'ReactNative'
    //   12: ldc 'Cleaned RKStorage'
    //   14: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: astore_1
    //   21: goto -> 51
    //   24: aload_0
    //   25: invokespecial r : ()Z
    //   28: ifeq -> 41
    //   31: ldc 'ReactNative'
    //   33: ldc 'Deleted Local Database RKStorage'
    //   35: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   38: aload_0
    //   39: monitorexit
    //   40: return
    //   41: new java/lang/RuntimeException
    //   44: dup
    //   45: ldc 'Clearing and deleting database RKStorage failed'
    //   47: invokespecial <init> : (Ljava/lang/String;)V
    //   50: athrow
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    //   55: astore_1
    //   56: goto -> 24
    // Exception table:
    //   from	to	target	type
    //   2	17	55	java/lang/Exception
    //   2	17	20	finally
    //   24	38	20	finally
    //   41	51	20	finally
  }
  
  boolean c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Landroid/database/sqlite/SQLiteDatabase;
    //   6: ifnull -> 25
    //   9: aload_0
    //   10: getfield d : Landroid/database/sqlite/SQLiteDatabase;
    //   13: invokevirtual isOpen : ()Z
    //   16: istore_2
    //   17: iload_2
    //   18: ifeq -> 25
    //   21: aload_0
    //   22: monitorexit
    //   23: iconst_1
    //   24: ireturn
    //   25: aconst_null
    //   26: astore_3
    //   27: iconst_0
    //   28: istore_1
    //   29: iload_1
    //   30: iconst_2
    //   31: if_icmpge -> 73
    //   34: iload_1
    //   35: ifle -> 43
    //   38: aload_0
    //   39: invokespecial r : ()Z
    //   42: pop
    //   43: aload_0
    //   44: aload_0
    //   45: invokevirtual getWritableDatabase : ()Landroid/database/sqlite/SQLiteDatabase;
    //   48: putfield d : Landroid/database/sqlite/SQLiteDatabase;
    //   51: goto -> 73
    //   54: astore_3
    //   55: ldc2_w 30
    //   58: invokestatic sleep : (J)V
    //   61: goto -> 114
    //   64: invokestatic currentThread : ()Ljava/lang/Thread;
    //   67: invokevirtual interrupt : ()V
    //   70: goto -> 114
    //   73: aload_0
    //   74: getfield d : Landroid/database/sqlite/SQLiteDatabase;
    //   77: ifnull -> 96
    //   80: aload_0
    //   81: getfield d : Landroid/database/sqlite/SQLiteDatabase;
    //   84: aload_0
    //   85: getfield e : J
    //   88: invokevirtual setMaximumSize : (J)J
    //   91: pop2
    //   92: aload_0
    //   93: monitorexit
    //   94: iconst_1
    //   95: ireturn
    //   96: aload_3
    //   97: athrow
    //   98: astore_3
    //   99: aload_0
    //   100: monitorexit
    //   101: goto -> 106
    //   104: aload_3
    //   105: athrow
    //   106: goto -> 104
    //   109: astore #4
    //   111: goto -> 64
    //   114: iload_1
    //   115: iconst_1
    //   116: iadd
    //   117: istore_1
    //   118: goto -> 29
    // Exception table:
    //   from	to	target	type
    //   2	17	98	finally
    //   38	43	54	android/database/sqlite/SQLiteException
    //   38	43	98	finally
    //   43	51	54	android/database/sqlite/SQLiteException
    //   43	51	98	finally
    //   55	61	109	java/lang/InterruptedException
    //   55	61	98	finally
    //   64	70	98	finally
    //   73	92	98	finally
    //   96	98	98	finally
  }
  
  public SQLiteDatabase d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual c : ()Z
    //   6: pop
    //   7: aload_0
    //   8: getfield d : Landroid/database/sqlite/SQLiteDatabase;
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	16	finally
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase) {
    paramSQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    if (paramInt1 != paramInt2) {
      r();
      onCreate(paramSQLiteDatabase);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/reactnativecommunity/asyncstorage/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */