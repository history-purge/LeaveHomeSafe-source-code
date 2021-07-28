package com.facebook.react.bridge;

public class SoftAssertions {
  public static void assertCondition(boolean paramBoolean, String paramString) {
    if (!paramBoolean)
      ReactSoftException.logSoftException("SoftAssertions", new AssertionException(paramString)); 
  }
  
  public static <T> T assertNotNull(T paramT) {
    if (paramT == null)
      ReactSoftException.logSoftException("SoftAssertions", new AssertionException("Expected object to not be null!")); 
    return paramT;
  }
  
  public static void assertUnreachable(String paramString) {
    ReactSoftException.logSoftException("SoftAssertions", new AssertionException(paramString));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/SoftAssertions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */