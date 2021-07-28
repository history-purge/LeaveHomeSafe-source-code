package io.liteglue;

public interface SQLiteConnection {
  void dispose();
  
  long getLastInsertRowid();
  
  int getTotalChanges();
  
  SQLiteStatement prepareStatement(String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/liteglue/SQLiteConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */