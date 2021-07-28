package com.oblador.keychain.i;

import java.security.GeneralSecurityException;

public class a extends GeneralSecurityException {
  public a(String paramString) {
    super(paramString);
  }
  
  public a(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public static void a(Throwable paramThrowable) {
    if (paramThrowable == null)
      return; 
    if (paramThrowable instanceof a)
      throw (a)paramThrowable; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Wrapped error: ");
    stringBuilder.append(paramThrowable.getMessage());
    throw new a(stringBuilder.toString(), paramThrowable);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */