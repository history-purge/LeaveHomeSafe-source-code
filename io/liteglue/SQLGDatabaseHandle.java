package io.liteglue;

class SQLGDatabaseHandle implements SQLDatabaseHandle {
  String dbfilename = null;
  
  private long dbhandle = 0L;
  
  int openflags = 0;
  
  public SQLGDatabaseHandle(String paramString, int paramInt) {
    this.dbfilename = paramString;
    this.openflags = paramInt;
  }
  
  public int close() {
    long l = this.dbhandle;
    return (l == 0L) ? 21 : SQLiteNDKNativeDriver.sqlc_db_close(l);
  }
  
  public String getLastErrorMessage() {
    long l = this.dbhandle;
    return (l == 0L) ? null : SQLiteNDKNativeDriver.sqlc_db_errmsg_native(l);
  }
  
  public long getLastInsertRowid() {
    long l = this.dbhandle;
    return (l == 0L) ? -1L : SQLiteNDKNativeDriver.sqlc_db_last_insert_rowid(l);
  }
  
  public int getTotalChanges() {
    long l = this.dbhandle;
    return (l == 0L) ? -1 : SQLiteNDKNativeDriver.sqlc_db_total_changes(l);
  }
  
  public boolean isOpen() {
    return (this.dbhandle != 0L);
  }
  
  public SQLStatementHandle newStatementHandle(String paramString) {
    return (this.dbhandle == 0L) ? null : new SQLGStatementHandle(paramString);
  }
  
  public int open() {
    String str = this.dbfilename;
    if (str == null || this.dbhandle != 0L)
      return 21; 
    SQLiteNativeResponse sQLiteNativeResponse = SQLiteNDKNativeDriver.sqlc_db_open(str, this.openflags);
    if (sQLiteNativeResponse.getResult() != 0)
      return -sQLiteNativeResponse.getResult(); 
    this.dbhandle = sQLiteNativeResponse.getHandle();
    return 0;
  }
  
  private class SQLGStatementHandle implements SQLStatementHandle {
    String sql = null;
    
    private long sthandle = 0L;
    
    private SQLGStatementHandle(String param1String) {
      this.sql = param1String;
    }
    
    public int bindDouble(int param1Int, double param1Double) {
      long l = this.sthandle;
      return (l == 0L) ? 21 : SQLiteNDKNativeDriver.sqlc_st_bind_double(l, param1Int, param1Double);
    }
    
    public int bindInteger(int param1Int1, int param1Int2) {
      long l = this.sthandle;
      return (l == 0L) ? 21 : SQLiteNDKNativeDriver.sqlc_st_bind_int(l, param1Int1, param1Int2);
    }
    
    public int bindLong(int param1Int, long param1Long) {
      long l = this.sthandle;
      return (l == 0L) ? 21 : SQLiteNDKNativeDriver.sqlc_st_bind_long(l, param1Int, param1Long);
    }
    
    public int bindNull(int param1Int) {
      long l = this.sthandle;
      return (l == 0L) ? 21 : SQLiteNDKNativeDriver.sqlc_st_bind_null(l, param1Int);
    }
    
    public int bindTextNativeString(int param1Int, String param1String) {
      long l = this.sthandle;
      return (l == 0L) ? 21 : SQLiteNDKNativeDriver.sqlc_st_bind_text_native(l, param1Int, param1String);
    }
    
    public int finish() {
      long l = this.sthandle;
      if (l == 0L)
        return 21; 
      this.sql = null;
      this.sthandle = 0L;
      return SQLiteNDKNativeDriver.sqlc_st_finish(l);
    }
    
    public int getColumnCount() {
      long l = this.sthandle;
      return (l == 0L) ? -1 : SQLiteNDKNativeDriver.sqlc_st_column_count(l);
    }
    
    public double getColumnDouble(int param1Int) {
      long l = this.sthandle;
      return (l == 0L) ? -1.0D : SQLiteNDKNativeDriver.sqlc_st_column_double(l, param1Int);
    }
    
    public int getColumnInteger(int param1Int) {
      long l = this.sthandle;
      return (l == 0L) ? -1 : SQLiteNDKNativeDriver.sqlc_st_column_int(l, param1Int);
    }
    
    public long getColumnLong(int param1Int) {
      long l = this.sthandle;
      return (l == 0L) ? -1L : SQLiteNDKNativeDriver.sqlc_st_column_long(l, param1Int);
    }
    
    public String getColumnName(int param1Int) {
      long l = this.sthandle;
      return (l == 0L) ? null : SQLiteNDKNativeDriver.sqlc_st_column_name(l, param1Int);
    }
    
    public String getColumnTextNativeString(int param1Int) {
      long l = this.sthandle;
      return (l == 0L) ? null : SQLiteNDKNativeDriver.sqlc_st_column_text_native(l, param1Int);
    }
    
    public int getColumnType(int param1Int) {
      long l = this.sthandle;
      return (l == 0L) ? -1 : SQLiteNDKNativeDriver.sqlc_st_column_type(l, param1Int);
    }
    
    public int prepare() {
      if (this.sql == null || this.sthandle != 0L)
        return 21; 
      SQLiteNativeResponse sQLiteNativeResponse = SQLiteNDKNativeDriver.sqlc_db_prepare_st(SQLGDatabaseHandle.this.dbhandle, this.sql);
      if (sQLiteNativeResponse.getResult() != 0)
        return -sQLiteNativeResponse.getResult(); 
      this.sthandle = sQLiteNativeResponse.getHandle();
      return 0;
    }
    
    public int step() {
      long l = this.sthandle;
      return (l == 0L) ? 21 : SQLiteNDKNativeDriver.sqlc_st_step(l);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/liteglue/SQLGDatabaseHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */