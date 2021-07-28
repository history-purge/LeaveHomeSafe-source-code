package com.facebook.soloader;

class h {
  static void a(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown library: ");
    stringBuilder.append(paramString);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  static String b(String paramString) {
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/soloader/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */