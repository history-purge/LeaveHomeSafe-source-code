package io.liteglue;

public interface SQLiteStatement {
  void bindDouble(int paramInt, double paramDouble);
  
  void bindInteger(int paramInt1, int paramInt2);
  
  void bindLong(int paramInt, long paramLong);
  
  void bindNull(int paramInt);
  
  void bindTextNativeString(int paramInt, String paramString);
  
  void dispose();
  
  int getColumnCount();
  
  double getColumnDouble(int paramInt);
  
  int getColumnInteger(int paramInt);
  
  long getColumnLong(int paramInt);
  
  String getColumnName(int paramInt);
  
  String getColumnTextNativeString(int paramInt);
  
  int getColumnType(int paramInt);
  
  boolean step();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/liteglue/SQLiteStatement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */