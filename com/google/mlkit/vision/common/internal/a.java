package com.google.mlkit.vision.common.internal;

public class a {
  public static int a(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 90) {
        if (paramInt != 180) {
          if (paramInt == 270)
            return 3; 
          StringBuilder stringBuilder = new StringBuilder(29);
          stringBuilder.append("Invalid rotation: ");
          stringBuilder.append(paramInt);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        return 2;
      } 
      return 1;
    } 
    return 0;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/mlkit/vision/common/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */