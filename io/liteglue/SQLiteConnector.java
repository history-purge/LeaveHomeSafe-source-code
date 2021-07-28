package io.liteglue;

public class SQLiteConnector implements SQLiteConnectionFactory {
  static boolean isLibLoaded = false;
  
  public SQLiteConnector() {
    if (!isLibLoaded) {
      System.loadLibrary("sqlc-ndk-native-driver");
      if (SQLiteNDKNativeDriver.sqlc_api_version_check(4) == 0) {
        isLibLoaded = true;
        return;
      } 
      throw new RuntimeException("native library version mismatch");
    } 
  }
  
  public SQLiteConnection newSQLiteConnection(String paramString, int paramInt) {
    return new SQLiteGlueConnection(paramString, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/liteglue/SQLiteConnector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */