package io.liteglue;

interface SQLStatementHandle {
  int bindDouble(int paramInt, double paramDouble);
  
  int bindInteger(int paramInt1, int paramInt2);
  
  int bindLong(int paramInt, long paramLong);
  
  int bindNull(int paramInt);
  
  int bindTextNativeString(int paramInt, String paramString);
  
  int finish();
  
  int getColumnCount();
  
  double getColumnDouble(int paramInt);
  
  int getColumnInteger(int paramInt);
  
  long getColumnLong(int paramInt);
  
  String getColumnName(int paramInt);
  
  String getColumnTextNativeString(int paramInt);
  
  int getColumnType(int paramInt);
  
  int prepare();
  
  int step();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/liteglue/SQLStatementHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */