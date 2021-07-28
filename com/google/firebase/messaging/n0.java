package com.google.firebase.messaging;

import java.util.Locale;

public final class n0 extends Exception {
  private final int errorCode;
  
  n0(String paramString) {
    super(paramString);
    this.errorCode = a(paramString);
  }
  
  private int a(String paramString) {
    byte b;
    if (paramString == null)
      return 0; 
    paramString = paramString.toLowerCase(Locale.US);
    switch (paramString.hashCode()) {
      default:
        b = -1;
        break;
      case -95047692:
        if (paramString.equals("missing_to")) {
          b = 1;
          break;
        } 
      case -617027085:
        if (paramString.equals("messagetoobig")) {
          b = 2;
          break;
        } 
      case -920906446:
        if (paramString.equals("invalid_parameters")) {
          b = 0;
          break;
        } 
      case -1290953729:
        if (paramString.equals("toomanymessages")) {
          b = 4;
          break;
        } 
      case -1743242157:
        if (paramString.equals("service_not_available")) {
          b = 3;
          break;
        } 
    } 
    return (b != 0 && b != 1) ? ((b != 2) ? ((b != 3) ? ((b != 4) ? 0 : 4) : 3) : 2) : 1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/n0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */