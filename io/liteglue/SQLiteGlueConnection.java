package io.liteglue;

import java.sql.SQLException;

class SQLiteGlueConnection implements SQLiteConnection {
  private SQLDatabaseHandle db = null;
  
  public SQLiteGlueConnection(String paramString, int paramInt) {
    if (paramString != null) {
      SQLGDatabaseHandle sQLGDatabaseHandle = new SQLGDatabaseHandle(paramString, paramInt);
      paramInt = sQLGDatabaseHandle.open();
      if (paramInt == 0) {
        this.db = sQLGDatabaseHandle;
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("sqlite3_open_v2 failure: ");
      stringBuilder.append(sQLGDatabaseHandle.getLastErrorMessage());
      throw new SQLException(stringBuilder.toString(), "failure", paramInt);
    } 
    throw new SQLException("null argument", "failed", 21);
  }
  
  public void dispose() {
    SQLDatabaseHandle sQLDatabaseHandle = this.db;
    if (sQLDatabaseHandle != null) {
      int i = sQLDatabaseHandle.close();
      if (i == 0) {
        this.db = null;
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("sqlite3_close failure: ");
      stringBuilder.append(this.db.getLastErrorMessage());
      throw new SQLException(stringBuilder.toString(), "failure", i);
    } 
    throw new SQLException("already disposed", "failed", 21);
  }
  
  public long getLastInsertRowid() {
    SQLDatabaseHandle sQLDatabaseHandle = this.db;
    if (sQLDatabaseHandle != null)
      return sQLDatabaseHandle.getLastInsertRowid(); 
    throw new SQLException("already disposed", "failed", 21);
  }
  
  public int getTotalChanges() {
    SQLDatabaseHandle sQLDatabaseHandle = this.db;
    if (sQLDatabaseHandle != null)
      return sQLDatabaseHandle.getTotalChanges(); 
    throw new SQLException("already disposed", "failed", 21);
  }
  
  public SQLiteStatement prepareStatement(String paramString) {
    if (this.db != null) {
      if (paramString != null) {
        SQLGStatement sQLGStatement = new SQLGStatement(paramString);
        int i = sQLGStatement.prepare();
        if (i == 0)
          return sQLGStatement; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sqlite3_prepare_v2 failure: ");
        stringBuilder.append(this.db.getLastErrorMessage());
        throw new SQLException(stringBuilder.toString(), "failure", i);
      } 
      throw new SQLException("null argument", "failed", 21);
    } 
    throw new SQLException("already disposed", "failed", 21);
  }
  
  private class SQLGStatement implements SQLiteStatement {
    private int columnCount = 0;
    
    private boolean hasRow = false;
    
    private String sql = null;
    
    private SQLStatementHandle sthandle = null;
    
    SQLGStatement(String param1String) {
      this.sql = param1String;
      this.sthandle = SQLiteGlueConnection.this.db.newStatementHandle(param1String);
    }
    
    public void bindDouble(int param1Int, double param1Double) {
      SQLStatementHandle sQLStatementHandle = this.sthandle;
      if (sQLStatementHandle != null) {
        param1Int = sQLStatementHandle.bindDouble(param1Int, param1Double);
        if (param1Int == 0)
          return; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sqlite3_bind_double failure: ");
        stringBuilder.append(SQLiteGlueConnection.this.db.getLastErrorMessage());
        throw new SQLException(stringBuilder.toString(), "failure", param1Int);
      } 
      throw new SQLException("already disposed", "failed", 21);
    }
    
    public void bindInteger(int param1Int1, int param1Int2) {
      SQLStatementHandle sQLStatementHandle = this.sthandle;
      if (sQLStatementHandle != null) {
        param1Int1 = sQLStatementHandle.bindInteger(param1Int1, param1Int2);
        if (param1Int1 == 0)
          return; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sqlite3_bind_int failure: ");
        stringBuilder.append(SQLiteGlueConnection.this.db.getLastErrorMessage());
        throw new SQLException(stringBuilder.toString(), "failure", param1Int1);
      } 
      throw new SQLException("already disposed", "failed", 21);
    }
    
    public void bindLong(int param1Int, long param1Long) {
      SQLStatementHandle sQLStatementHandle = this.sthandle;
      if (sQLStatementHandle != null) {
        param1Int = sQLStatementHandle.bindLong(param1Int, param1Long);
        if (param1Int == 0)
          return; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sqlite3_bind_int64 (long) failure: ");
        stringBuilder.append(SQLiteGlueConnection.this.db.getLastErrorMessage());
        throw new SQLException(stringBuilder.toString(), "failure", param1Int);
      } 
      throw new SQLException("already disposed", "failed", 21);
    }
    
    public void bindNull(int param1Int) {
      SQLStatementHandle sQLStatementHandle = this.sthandle;
      if (sQLStatementHandle != null) {
        param1Int = sQLStatementHandle.bindNull(param1Int);
        if (param1Int == 0)
          return; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sqlite3_bind_null failure: ");
        stringBuilder.append(SQLiteGlueConnection.this.db.getLastErrorMessage());
        throw new SQLException(stringBuilder.toString(), "failure", param1Int);
      } 
      throw new SQLException("already disposed", "failed", 21);
    }
    
    public void bindTextNativeString(int param1Int, String param1String) {
      SQLStatementHandle sQLStatementHandle = this.sthandle;
      if (sQLStatementHandle != null) {
        if (param1String != null) {
          param1Int = sQLStatementHandle.bindTextNativeString(param1Int, param1String);
          if (param1Int == 0)
            return; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("sqlite3_bind_text failure: ");
          stringBuilder.append(SQLiteGlueConnection.this.db.getLastErrorMessage());
          throw new SQLException(stringBuilder.toString(), "failure", param1Int);
        } 
        throw new SQLException("null argument", "failed", 21);
      } 
      throw new SQLException("already disposed", "failed", 21);
    }
    
    public void dispose() {
      SQLStatementHandle sQLStatementHandle = this.sthandle;
      if (sQLStatementHandle != null) {
        sQLStatementHandle.finish();
        this.sthandle = null;
        return;
      } 
      throw new SQLException("already disposed", "failed", 21);
    }
    
    public int getColumnCount() {
      if (this.sthandle != null) {
        if (this.hasRow)
          return this.columnCount; 
        throw new SQLException("no result available", "failed", 21);
      } 
      throw new SQLException("already disposed", "failed", 21);
    }
    
    public double getColumnDouble(int param1Int) {
      SQLStatementHandle sQLStatementHandle = this.sthandle;
      if (sQLStatementHandle != null) {
        if (this.hasRow) {
          if (param1Int >= 0 && param1Int < this.columnCount)
            return sQLStatementHandle.getColumnDouble(param1Int); 
          throw new SQLException("no result available", "failed", 21);
        } 
        throw new SQLException("no result available", "failed", 21);
      } 
      throw new SQLException("already disposed", "failed", 21);
    }
    
    public int getColumnInteger(int param1Int) {
      SQLStatementHandle sQLStatementHandle = this.sthandle;
      if (sQLStatementHandle != null) {
        if (this.hasRow) {
          if (param1Int >= 0 && param1Int < this.columnCount)
            return sQLStatementHandle.getColumnInteger(param1Int); 
          throw new SQLException("no result available", "failed", 21);
        } 
        throw new SQLException("no result available", "failed", 21);
      } 
      throw new SQLException("already disposed", "failed", 21);
    }
    
    public long getColumnLong(int param1Int) {
      SQLStatementHandle sQLStatementHandle = this.sthandle;
      if (sQLStatementHandle != null) {
        if (this.hasRow) {
          if (param1Int >= 0 && param1Int < this.columnCount)
            return sQLStatementHandle.getColumnLong(param1Int); 
          throw new SQLException("no result available", "failed", 21);
        } 
        throw new SQLException("no result available", "failed", 21);
      } 
      throw new SQLException("already disposed", "failed", 21);
    }
    
    public String getColumnName(int param1Int) {
      SQLStatementHandle sQLStatementHandle = this.sthandle;
      if (sQLStatementHandle != null) {
        if (this.hasRow) {
          if (param1Int >= 0 && param1Int < this.columnCount)
            return sQLStatementHandle.getColumnName(param1Int); 
          throw new SQLException("no result available", "failed", 21);
        } 
        throw new SQLException("no result available", "failed", 21);
      } 
      throw new SQLException("already disposed", "failed", 21);
    }
    
    public String getColumnTextNativeString(int param1Int) {
      SQLStatementHandle sQLStatementHandle = this.sthandle;
      if (sQLStatementHandle != null) {
        if (this.hasRow) {
          if (param1Int >= 0 && param1Int < this.columnCount)
            return sQLStatementHandle.getColumnTextNativeString(param1Int); 
          throw new SQLException("no result available", "failed", 21);
        } 
        throw new SQLException("no result available", "failed", 21);
      } 
      throw new SQLException("already disposed", "failed", 21);
    }
    
    public int getColumnType(int param1Int) {
      SQLStatementHandle sQLStatementHandle = this.sthandle;
      if (sQLStatementHandle != null) {
        if (this.hasRow) {
          if (param1Int >= 0 && param1Int < this.columnCount)
            return sQLStatementHandle.getColumnType(param1Int); 
          throw new SQLException("no result available", "failed", 21);
        } 
        throw new SQLException("no result available", "failed", 21);
      } 
      throw new SQLException("already disposed", "failed", 21);
    }
    
    int prepare() {
      return this.sthandle.prepare();
    }
    
    public boolean step() {
      SQLStatementHandle sQLStatementHandle = this.sthandle;
      if (sQLStatementHandle != null) {
        int i = sQLStatementHandle.step();
        if (i == 0 || i == 100 || i == 101) {
          boolean bool;
          if (i == 100) {
            bool = true;
          } else {
            bool = false;
          } 
          this.hasRow = bool;
          if (this.hasRow) {
            this.columnCount = this.sthandle.getColumnCount();
          } else {
            this.columnCount = 0;
          } 
          return this.hasRow;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sqlite3_step failure: ");
        stringBuilder.append(SQLiteGlueConnection.this.db.getLastErrorMessage());
        throw new SQLException(stringBuilder.toString(), "failure", i);
      } 
      throw new SQLException("already disposed", "failed", 21);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/liteglue/SQLiteGlueConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */