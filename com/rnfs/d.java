package com.rnfs;

class d extends Exception {
  private String code;
  
  public d(String paramString1, String paramString2) {
    super(paramString2);
    this.code = paramString1;
  }
  
  public String a() {
    return this.code;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/rnfs/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */