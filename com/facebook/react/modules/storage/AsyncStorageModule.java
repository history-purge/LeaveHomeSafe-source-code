package com.facebook.react.modules.storage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.fbreact.specs.NativeAsyncStorageSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import e.e.o.d0.a.a;
import e.e.o.e0.a.a;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.concurrent.Executor;

@a(name = "AsyncSQLiteDBStorage")
public final class AsyncStorageModule extends NativeAsyncStorageSpec implements a {
  private static final int MAX_SQL_KEYS = 999;
  
  public static final String NAME = "AsyncSQLiteDBStorage";
  
  private final g executor;
  
  private c mReactDatabaseSupplier;
  
  private boolean mShuttingDown = false;
  
  public AsyncStorageModule(ReactApplicationContext paramReactApplicationContext) {
    this(paramReactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
  }
  
  AsyncStorageModule(ReactApplicationContext paramReactApplicationContext, Executor paramExecutor) {
    super(paramReactApplicationContext);
    this.executor = new g(this, paramExecutor);
    this.mReactDatabaseSupplier = c.a((Context)paramReactApplicationContext);
  }
  
  private boolean ensureDatabase() {
    return (!this.mShuttingDown && this.mReactDatabaseSupplier.c());
  }
  
  public void clear(Callback paramCallback) {
    (new e(this, (ReactContext)getReactApplicationContext(), paramCallback)).executeOnExecutor(this.executor, (Object[])new Void[0]);
  }
  
  public void clearSensitiveData() {
    this.mReactDatabaseSupplier.b();
  }
  
  public void getAllKeys(Callback paramCallback) {
    (new f(this, (ReactContext)getReactApplicationContext(), paramCallback)).executeOnExecutor(this.executor, (Object[])new Void[0]);
  }
  
  public String getName() {
    return "AsyncSQLiteDBStorage";
  }
  
  public void initialize() {
    super.initialize();
    this.mShuttingDown = false;
  }
  
  public void multiGet(ReadableArray paramReadableArray, Callback paramCallback) {
    if (paramReadableArray == null) {
      paramCallback.invoke(new Object[] { b.b(null), null });
      return;
    } 
    (new a(this, (ReactContext)getReactApplicationContext(), paramCallback, paramReadableArray)).executeOnExecutor(this.executor, (Object[])new Void[0]);
  }
  
  public void multiMerge(ReadableArray paramReadableArray, Callback paramCallback) {
    (new d(this, (ReactContext)getReactApplicationContext(), paramCallback, paramReadableArray)).executeOnExecutor(this.executor, (Object[])new Void[0]);
  }
  
  public void multiRemove(ReadableArray paramReadableArray, Callback paramCallback) {
    if (paramReadableArray.size() == 0) {
      paramCallback.invoke(new Object[] { b.b(null) });
      return;
    } 
    (new c(this, (ReactContext)getReactApplicationContext(), paramCallback, paramReadableArray)).executeOnExecutor(this.executor, (Object[])new Void[0]);
  }
  
  public void multiSet(ReadableArray paramReadableArray, Callback paramCallback) {
    if (paramReadableArray.size() == 0) {
      paramCallback.invoke(new Object[] { b.b(null) });
      return;
    } 
    (new b(this, (ReactContext)getReactApplicationContext(), paramCallback, paramReadableArray)).executeOnExecutor(this.executor, (Object[])new Void[0]);
  }
  
  public void onCatalystInstanceDestroy() {
    this.mShuttingDown = true;
  }
  
  class a extends GuardedAsyncTask<Void, Void> {
    a(AsyncStorageModule this$0, ReactContext param1ReactContext, Callback param1Callback, ReadableArray param1ReadableArray) {
      super(param1ReactContext);
    }
    
    protected void a(Void... param1VarArgs) {
      if (!this.c.ensureDatabase()) {
        this.a.invoke(new Object[] { b.a(null), null });
        return;
      } 
      HashSet<String> hashSet = new HashSet();
      WritableArray writableArray = Arguments.createArray();
      int i = 0;
      while (i < this.b.size()) {
        int j = Math.min(this.b.size() - i, 999);
        SQLiteDatabase sQLiteDatabase = this.c.mReactDatabaseSupplier.d();
        str = a.a(j);
        String[] arrayOfString = a.a(this.b, i, j);
        Cursor cursor = sQLiteDatabase.query("catalystLocalStorage", new String[] { "key", "value" }, str, arrayOfString, null, null, null);
        hashSet.clear();
        try {
          if (cursor.getCount() != this.b.size())
            for (int k = i; k < i + j; k++)
              hashSet.add(this.b.getString(k));  
          if (cursor.moveToFirst()) {
            boolean bool;
            do {
              WritableArray writableArray1 = Arguments.createArray();
              writableArray1.pushString(cursor.getString(0));
              writableArray1.pushString(cursor.getString(1));
              writableArray.pushArray((ReadableArray)writableArray1);
              hashSet.remove(cursor.getString(0));
              bool = cursor.moveToNext();
            } while (bool);
          } 
          cursor.close();
          for (String str : hashSet) {
            WritableArray writableArray1 = Arguments.createArray();
            writableArray1.pushString(str);
            writableArray1.pushNull();
            writableArray.pushArray((ReadableArray)writableArray1);
          } 
          hashSet.clear();
          i += 999;
          continue;
        } catch (Exception exception) {
          e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
          this.a.invoke(new Object[] { b.a(null, exception.getMessage()), null });
          cursor.close();
          return;
        } finally {}
        cursor.close();
        throw hashSet;
      } 
      this.a.invoke(new Object[] { null, writableArray });
    }
  }
  
  class b extends GuardedAsyncTask<Void, Void> {
    b(AsyncStorageModule this$0, ReactContext param1ReactContext, Callback param1Callback, ReadableArray param1ReadableArray) {
      super(param1ReactContext);
    }
    
    protected void a(Void... param1VarArgs) {
      boolean bool = this.c.ensureDatabase();
      param1VarArgs = null;
      if (!bool) {
        this.a.invoke(new Object[] { b.a(null) });
        return;
      } 
      SQLiteStatement sQLiteStatement = this.c.mReactDatabaseSupplier.d().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
      try {
        this.c.mReactDatabaseSupplier.d().beginTransaction();
        for (int i = 0; i < this.b.size(); i++) {
          if (this.b.getArray(i).size() != 2) {
            WritableMap writableMap = b.c(null);
            try {
              this.c.mReactDatabaseSupplier.d().endTransaction();
              return;
            } catch (Exception null) {
              e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
              if (writableMap == null)
                b.a(null, exception.getMessage()); 
              return;
            } 
          } 
          if (this.b.getArray(i).getString(0) == null) {
            WritableMap writableMap = b.b(null);
            try {
              this.c.mReactDatabaseSupplier.d().endTransaction();
              return;
            } catch (Exception null) {
              e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
              if (writableMap == null)
                b.a(null, exception.getMessage()); 
              return;
            } 
          } 
          if (this.b.getArray(i).getString(1) == null) {
            WritableMap writableMap = b.c(null);
            try {
              this.c.mReactDatabaseSupplier.d().endTransaction();
              return;
            } catch (Exception exception) {
              e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
              if (writableMap == null)
                b.a(null, exception.getMessage()); 
              return;
            } 
          } 
          exception.clearBindings();
          exception.bindString(1, this.b.getArray(i).getString(0));
          exception.bindString(2, this.b.getArray(i).getString(1));
          exception.execute();
        } 
        this.c.mReactDatabaseSupplier.d().setTransactionSuccessful();
        try {
          this.c.mReactDatabaseSupplier.d().endTransaction();
        } catch (Exception exception) {
          e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
          WritableMap writableMap = b.a(null, exception.getMessage());
        } 
      } catch (Exception exception) {
        e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
        WritableMap writableMap = b.a(null, exception.getMessage());
        try {
          this.c.mReactDatabaseSupplier.d().endTransaction();
        } catch (Exception exception1) {
          e.e.e.e.a.c("ReactNative", exception1.getMessage(), exception1);
          if (writableMap == null)
            writableMap = b.a(null, exception1.getMessage()); 
        } 
      } finally {}
      Callback callback = this.a;
      if (param1VarArgs != null) {
        callback.invoke(new Object[] { param1VarArgs });
        return;
      } 
      callback.invoke(new Object[0]);
    }
  }
  
  class c extends GuardedAsyncTask<Void, Void> {
    c(AsyncStorageModule this$0, ReactContext param1ReactContext, Callback param1Callback, ReadableArray param1ReadableArray) {
      super(param1ReactContext);
    }
    
    protected void a(Void... param1VarArgs) {
      boolean bool = this.c.ensureDatabase();
      param1VarArgs = null;
      if (!bool) {
        this.a.invoke(new Object[] { b.a(null) });
        return;
      } 
      try {
        this.c.mReactDatabaseSupplier.d().beginTransaction();
        for (int i = 0; i < this.b.size(); i += 999) {
          int j = Math.min(this.b.size() - i, 999);
          this.c.mReactDatabaseSupplier.d().delete("catalystLocalStorage", a.a(j), a.a(this.b, i, j));
        } 
        this.c.mReactDatabaseSupplier.d().setTransactionSuccessful();
        try {
          this.c.mReactDatabaseSupplier.d().endTransaction();
        } catch (Exception exception) {
          e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
          WritableMap writableMap = b.a(null, exception.getMessage());
        } 
      } catch (Exception exception) {
        e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
        WritableMap writableMap = b.a(null, exception.getMessage());
        try {
          this.c.mReactDatabaseSupplier.d().endTransaction();
        } catch (Exception exception1) {
          e.e.e.e.a.c("ReactNative", exception1.getMessage(), exception1);
          if (writableMap == null)
            writableMap = b.a(null, exception1.getMessage()); 
        } 
      } finally {}
      Callback callback = this.a;
      if (param1VarArgs != null) {
        callback.invoke(new Object[] { param1VarArgs });
        return;
      } 
      callback.invoke(new Object[0]);
    }
  }
  
  class d extends GuardedAsyncTask<Void, Void> {
    d(AsyncStorageModule this$0, ReactContext param1ReactContext, Callback param1Callback, ReadableArray param1ReadableArray) {
      super(param1ReactContext);
    }
    
    protected void a(Void... param1VarArgs) {
      boolean bool = this.c.ensureDatabase();
      param1VarArgs = null;
      if (!bool) {
        this.a.invoke(new Object[] { b.a(null) });
        return;
      } 
      try {
        this.c.mReactDatabaseSupplier.d().beginTransaction();
        for (int i = 0; i < this.b.size(); i++) {
          if (this.b.getArray(i).size() != 2) {
            WritableMap writableMap = b.c(null);
            try {
              this.c.mReactDatabaseSupplier.d().endTransaction();
              return;
            } catch (Exception exception) {
              e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
              if (writableMap == null)
                b.a(null, exception.getMessage()); 
              return;
            } 
          } 
          if (this.b.getArray(i).getString(0) == null) {
            WritableMap writableMap = b.b(null);
            try {
              this.c.mReactDatabaseSupplier.d().endTransaction();
              return;
            } catch (Exception exception) {
              e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
              if (writableMap == null)
                b.a(null, exception.getMessage()); 
              return;
            } 
          } 
          if (this.b.getArray(i).getString(1) == null) {
            WritableMap writableMap = b.c(null);
            try {
              this.c.mReactDatabaseSupplier.d().endTransaction();
              return;
            } catch (Exception exception) {
              e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
              if (writableMap == null)
                b.a(null, exception.getMessage()); 
              return;
            } 
          } 
          if (!a.a(this.c.mReactDatabaseSupplier.d(), this.b.getArray(i).getString(0), this.b.getArray(i).getString(1))) {
            WritableMap writableMap = b.a(null);
            try {
              this.c.mReactDatabaseSupplier.d().endTransaction();
              return;
            } catch (Exception exception) {
              e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
              if (writableMap == null)
                b.a(null, exception.getMessage()); 
              return;
            } 
          } 
        } 
        this.c.mReactDatabaseSupplier.d().setTransactionSuccessful();
        try {
          this.c.mReactDatabaseSupplier.d().endTransaction();
        } catch (Exception exception) {
          e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
          WritableMap writableMap = b.a(null, exception.getMessage());
        } 
      } catch (Exception exception) {
        e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
        WritableMap writableMap = b.a(null, exception.getMessage());
        try {
          this.c.mReactDatabaseSupplier.d().endTransaction();
        } catch (Exception exception1) {
          e.e.e.e.a.c("ReactNative", exception1.getMessage(), exception1);
          if (writableMap == null)
            writableMap = b.a(null, exception1.getMessage()); 
        } 
      } finally {}
      Callback callback = this.a;
      if (param1VarArgs != null) {
        callback.invoke(new Object[] { param1VarArgs });
        return;
      } 
      callback.invoke(new Object[0]);
    }
  }
  
  class e extends GuardedAsyncTask<Void, Void> {
    e(AsyncStorageModule this$0, ReactContext param1ReactContext, Callback param1Callback) {
      super(param1ReactContext);
    }
    
    protected void a(Void... param1VarArgs) {
      if (!this.b.mReactDatabaseSupplier.c()) {
        this.a.invoke(new Object[] { b.a(null) });
        return;
      } 
      try {
        this.b.mReactDatabaseSupplier.a();
        this.a.invoke(new Object[0]);
        return;
      } catch (Exception exception) {
        e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
        this.a.invoke(new Object[] { b.a(null, exception.getMessage()) });
        return;
      } 
    }
  }
  
  class f extends GuardedAsyncTask<Void, Void> {
    f(AsyncStorageModule this$0, ReactContext param1ReactContext, Callback param1Callback) {
      super(param1ReactContext);
    }
    
    protected void a(Void... param1VarArgs) {
      if (!this.b.ensureDatabase()) {
        this.a.invoke(new Object[] { b.a(null), null });
        return;
      } 
      WritableArray writableArray = Arguments.createArray();
      Cursor cursor = this.b.mReactDatabaseSupplier.d().query("catalystLocalStorage", new String[] { "key" }, null, null, null, null, null);
      try {
        if (cursor.moveToFirst()) {
          boolean bool;
          do {
            writableArray.pushString(cursor.getString(0));
            bool = cursor.moveToNext();
          } while (bool);
        } 
        cursor.close();
        this.a.invoke(new Object[] { null, writableArray });
        return;
      } catch (Exception exception) {
        e.e.e.e.a.c("ReactNative", exception.getMessage(), exception);
        this.a.invoke(new Object[] { b.a(null, exception.getMessage()), null });
        cursor.close();
        return;
      } finally {}
      cursor.close();
      throw writableArray;
    }
  }
  
  private class g implements Executor {
    private final ArrayDeque<Runnable> c = new ArrayDeque<Runnable>();
    
    private Runnable d;
    
    private final Executor e;
    
    g(AsyncStorageModule this$0, Executor param1Executor) {
      this.e = param1Executor;
    }
    
    void a() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield c : Ljava/util/ArrayDeque;
      //   6: invokevirtual poll : ()Ljava/lang/Object;
      //   9: checkcast java/lang/Runnable
      //   12: astore_1
      //   13: aload_0
      //   14: aload_1
      //   15: putfield d : Ljava/lang/Runnable;
      //   18: aload_1
      //   19: ifnull -> 35
      //   22: aload_0
      //   23: getfield e : Ljava/util/concurrent/Executor;
      //   26: aload_0
      //   27: getfield d : Ljava/lang/Runnable;
      //   30: invokeinterface execute : (Ljava/lang/Runnable;)V
      //   35: aload_0
      //   36: monitorexit
      //   37: return
      //   38: astore_1
      //   39: aload_0
      //   40: monitorexit
      //   41: aload_1
      //   42: athrow
      // Exception table:
      //   from	to	target	type
      //   2	18	38	finally
      //   22	35	38	finally
    }
    
    public void execute(Runnable param1Runnable) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield c : Ljava/util/ArrayDeque;
      //   6: new com/facebook/react/modules/storage/AsyncStorageModule$g$a
      //   9: dup
      //   10: aload_0
      //   11: aload_1
      //   12: invokespecial <init> : (Lcom/facebook/react/modules/storage/AsyncStorageModule$g;Ljava/lang/Runnable;)V
      //   15: invokevirtual offer : (Ljava/lang/Object;)Z
      //   18: pop
      //   19: aload_0
      //   20: getfield d : Ljava/lang/Runnable;
      //   23: ifnonnull -> 30
      //   26: aload_0
      //   27: invokevirtual a : ()V
      //   30: aload_0
      //   31: monitorexit
      //   32: return
      //   33: astore_1
      //   34: aload_0
      //   35: monitorexit
      //   36: aload_1
      //   37: athrow
      // Exception table:
      //   from	to	target	type
      //   2	30	33	finally
    }
    
    class a implements Runnable {
      a(AsyncStorageModule.g this$0, Runnable param2Runnable) {}
      
      public void run() {
        try {
          this.c.run();
          return;
        } finally {
          this.d.a();
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(AsyncStorageModule this$0, Runnable param1Runnable) {}
    
    public void run() {
      try {
        this.c.run();
        return;
      } finally {
        this.d.a();
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/storage/AsyncStorageModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */