package net.time4j.history;

public enum e {
  c, d;
  
  int f(int paramInt) {
    if (paramInt >= 532) {
      int j = paramInt / 100;
      int i = 0;
      if (this == c && paramInt > 1582) {
        i = (j * 3 + 3) / 4;
        j = i + 15 - (j * 8 + 13) / 25;
        i = 2 - i;
      } else {
        j = 15;
      } 
      int k = paramInt % 19;
      j = (k * 19 + j) % 30;
      int m = j / 29;
      j = j + 21 - m + (j / 28 - m) * k / 11;
      return j + 7 - (j - 7 - (paramInt + paramInt / 4 + i) % 7) % 7;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Out of range: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */