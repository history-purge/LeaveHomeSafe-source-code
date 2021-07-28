package io.liteglue;

public class SQLiteNativeResponse {
  private long handle;
  
  private int result;
  
  public SQLiteNativeResponse(int paramInt, long paramLong) {
    this.result = paramInt;
    this.handle = paramLong;
  }
  
  public long getHandle() {
    return this.handle;
  }
  
  public int getResult() {
    return this.result;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/liteglue/SQLiteNativeResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */