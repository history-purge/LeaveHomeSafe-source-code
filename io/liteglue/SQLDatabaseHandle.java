package io.liteglue;

interface SQLDatabaseHandle {
  int close();
  
  String getLastErrorMessage();
  
  long getLastInsertRowid();
  
  int getTotalChanges();
  
  boolean isOpen();
  
  SQLStatementHandle newStatementHandle(String paramString);
  
  int open();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/liteglue/SQLDatabaseHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */