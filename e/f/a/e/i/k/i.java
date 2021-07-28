package e.f.a.e.i.k;

final class i {
  static int a(Object paramObject, int paramInt) {
    return (paramObject instanceof byte[]) ? (((byte[])paramObject)[paramInt] & 0xFF) : ((paramObject instanceof short[]) ? (char)((short[])paramObject)[paramInt] : ((int[])paramObject)[paramInt]);
  }
  
  static int a(Object paramObject1, Object paramObject2, int paramInt, Object paramObject3, int[] paramArrayOfint, Object[] paramArrayOfObject1, Object[] paramArrayOfObject2) {
    int m = j.a(paramObject1);
    int k = m & paramInt;
    int j = a(paramObject3, k);
    if (j != 0) {
      int i1 = paramInt ^ 0xFFFFFFFF;
      int n = -1;
      while (true) {
        int i2 = paramArrayOfint[--j];
        if ((i2 & i1) == (m & i1) && a0.a(paramObject1, paramArrayOfObject1[j]) && (paramArrayOfObject2 == null || a0.a(paramObject2, paramArrayOfObject2[j]))) {
          i2 &= paramInt;
          if (n == -1) {
            a(paramObject3, k, i2);
            return j;
          } 
          paramArrayOfint[n] = i2 & paramInt | paramArrayOfint[n] & i1;
          return j;
        } 
        i2 &= paramInt;
        if (i2 != 0) {
          n = j;
          j = i2;
          continue;
        } 
        break;
      } 
    } 
    return -1;
  }
  
  static Object a(int paramInt) {
    if (paramInt >= 2 && paramInt <= 1073741824 && Integer.highestOneBit(paramInt) == paramInt)
      return (paramInt <= 256) ? new byte[paramInt] : ((paramInt <= 65536) ? new short[paramInt] : new int[paramInt]); 
    StringBuilder stringBuilder = new StringBuilder(52);
    stringBuilder.append("must be power of 2 between 2^1 and 2^30: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  static void a(Object paramObject, int paramInt1, int paramInt2) {
    if (paramObject instanceof byte[]) {
      ((byte[])paramObject)[paramInt1] = (byte)paramInt2;
      return;
    } 
    if (paramObject instanceof short[]) {
      ((short[])paramObject)[paramInt1] = (short)paramInt2;
      return;
    } 
    ((int[])paramObject)[paramInt1] = paramInt2;
  }
  
  static int b(int paramInt) {
    byte b;
    if (paramInt < 32) {
      b = 4;
    } else {
      b = 2;
    } 
    return b * (paramInt + 1);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */