package io.liteglue;

public class SQLiteNDKNativeDriver {
  public static final int SQLC_API_VERSION = 4;
  
  public static final int SQLC_BLOB = 4;
  
  public static final int SQLC_FLOAT = 2;
  
  public static final int SQLC_INTEGER = 1;
  
  public static final int SQLC_NULL = 5;
  
  public static final int SQLC_OPEN_CREATE = 4;
  
  public static final int SQLC_OPEN_FULLMUTEX = 65536;
  
  public static final int SQLC_OPEN_MEMORY = 128;
  
  public static final int SQLC_OPEN_NOMUTEX = 32768;
  
  public static final int SQLC_OPEN_PRIVATECACHE = 262144;
  
  public static final int SQLC_OPEN_READONLY = 1;
  
  public static final int SQLC_OPEN_READWRITE = 2;
  
  public static final int SQLC_OPEN_SHAREDCACHE = 131072;
  
  public static final int SQLC_OPEN_URI = 64;
  
  public static final int SQLC_RESULT_ABORT = 4;
  
  public static final int SQLC_RESULT_CONSTRAINT = 19;
  
  public static final int SQLC_RESULT_DONE = 101;
  
  public static final int SQLC_RESULT_ERROR = 1;
  
  public static final int SQLC_RESULT_INTERNAL = 2;
  
  public static final int SQLC_RESULT_MISMATCH = 20;
  
  public static final int SQLC_RESULT_MISUSE = 21;
  
  public static final int SQLC_RESULT_OK = 0;
  
  public static final int SQLC_RESULT_PERM = 3;
  
  public static final int SQLC_RESULT_ROW = 100;
  
  public static final int SQLC_TEXT = 3;
  
  public static native long sqlc_api_db_open(int paramInt1, String paramString, int paramInt2);
  
  public static native int sqlc_api_version_check(int paramInt);
  
  public static native int sqlc_db_close(long paramLong);
  
  public static native int sqlc_db_errcode(long paramLong);
  
  public static native String sqlc_db_errmsg_native(long paramLong);
  
  public static native long sqlc_db_last_insert_rowid(long paramLong);
  
  public static native SQLiteNativeResponse sqlc_db_open(String paramString, int paramInt);
  
  public static native SQLiteNativeResponse sqlc_db_prepare_st(long paramLong, String paramString);
  
  public static native int sqlc_db_total_changes(long paramLong);
  
  public static native String sqlc_errstr_native(int paramInt);
  
  public static native int sqlc_st_bind_double(long paramLong, int paramInt, double paramDouble);
  
  public static native int sqlc_st_bind_int(long paramLong, int paramInt1, int paramInt2);
  
  public static native int sqlc_st_bind_long(long paramLong1, int paramInt, long paramLong2);
  
  public static native int sqlc_st_bind_null(long paramLong, int paramInt);
  
  public static native int sqlc_st_bind_text_native(long paramLong, int paramInt, String paramString);
  
  public static native int sqlc_st_column_count(long paramLong);
  
  public static native double sqlc_st_column_double(long paramLong, int paramInt);
  
  public static native int sqlc_st_column_int(long paramLong, int paramInt);
  
  public static native long sqlc_st_column_long(long paramLong, int paramInt);
  
  public static native String sqlc_st_column_name(long paramLong, int paramInt);
  
  public static native String sqlc_st_column_text_native(long paramLong, int paramInt);
  
  public static native int sqlc_st_column_type(long paramLong, int paramInt);
  
  public static native int sqlc_st_finish(long paramLong);
  
  public static native int sqlc_st_step(long paramLong);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/liteglue/SQLiteNDKNativeDriver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */