package e.f.c.s.n;

final class b {
  private final a a;
  
  private final int[] b;
  
  b(a parama, int[] paramArrayOfint) {
    if (paramArrayOfint.length != 0) {
      this.a = parama;
      int i = paramArrayOfint.length;
      if (i > 1 && paramArrayOfint[0] == 0) {
        int j;
        for (j = 1; j < i && paramArrayOfint[j] == 0; j++);
        if (j == i) {
          this.b = new int[] { 0 };
          return;
        } 
        this.b = new int[i - j];
        int[] arrayOfInt = this.b;
        System.arraycopy(paramArrayOfint, j, arrayOfInt, 0, arrayOfInt.length);
        return;
      } 
      this.b = paramArrayOfint;
      return;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    throw illegalArgumentException;
  }
  
  int a() {
    return this.b.length - 1;
  }
  
  int a(int paramInt) {
    int j = 0;
    if (paramInt == 0)
      return b(0); 
    int i = 1;
    if (paramInt == 1) {
      int[] arrayOfInt1 = this.b;
      int m = arrayOfInt1.length;
      i = 0;
      for (paramInt = j; paramInt < m; paramInt++)
        i = a.c(i, arrayOfInt1[paramInt]); 
      return i;
    } 
    int[] arrayOfInt = this.b;
    j = arrayOfInt[0];
    int k = arrayOfInt.length;
    while (i < k) {
      j = a.c(this.a.b(paramInt, j), this.b[i]);
      i++;
    } 
    return j;
  }
  
  b a(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0) {
      if (paramInt2 == 0)
        return this.a.d(); 
      int i = this.b.length;
      int[] arrayOfInt = new int[paramInt1 + i];
      for (paramInt1 = 0; paramInt1 < i; paramInt1++)
        arrayOfInt[paramInt1] = this.a.b(this.b[paramInt1], paramInt2); 
      return new b(this.a, arrayOfInt);
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    throw illegalArgumentException;
  }
  
  b a(b paramb) {
    if (this.a.equals(paramb.a)) {
      if (b())
        return paramb; 
      if (paramb.b())
        return this; 
      int[] arrayOfInt2 = this.b;
      int[] arrayOfInt4 = paramb.b;
      int[] arrayOfInt3 = arrayOfInt2;
      int[] arrayOfInt1 = arrayOfInt4;
      if (arrayOfInt2.length > arrayOfInt4.length) {
        arrayOfInt3 = arrayOfInt4;
        arrayOfInt1 = arrayOfInt2;
      } 
      arrayOfInt2 = new int[arrayOfInt1.length];
      int j = arrayOfInt1.length - arrayOfInt3.length;
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, j);
      for (int i = j; i < arrayOfInt1.length; i++)
        arrayOfInt2[i] = a.c(arrayOfInt3[i - j], arrayOfInt1[i]); 
      return new b(this.a, arrayOfInt2);
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    throw illegalArgumentException;
  }
  
  int b(int paramInt) {
    int[] arrayOfInt = this.b;
    return arrayOfInt[arrayOfInt.length - 1 - paramInt];
  }
  
  b b(b paramb) {
    if (this.a.equals(paramb.a)) {
      if (b() || paramb.b())
        return this.a.d(); 
      int[] arrayOfInt2 = this.b;
      int j = arrayOfInt2.length;
      int[] arrayOfInt1 = paramb.b;
      int k = arrayOfInt1.length;
      int[] arrayOfInt3 = new int[j + k - 1];
      for (int i = 0; i < j; i++) {
        int n = arrayOfInt2[i];
        for (int m = 0; m < k; m++) {
          int i1 = i + m;
          arrayOfInt3[i1] = a.c(arrayOfInt3[i1], this.a.b(n, arrayOfInt1[m]));
        } 
      } 
      return new b(this.a, arrayOfInt3);
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    throw illegalArgumentException;
  }
  
  boolean b() {
    return (this.b[0] == 0);
  }
  
  b c(int paramInt) {
    if (paramInt == 0)
      return this.a.d(); 
    if (paramInt == 1)
      return this; 
    int j = this.b.length;
    int[] arrayOfInt = new int[j];
    for (int i = 0; i < j; i++)
      arrayOfInt[i] = this.a.b(this.b[i], paramInt); 
    return new b(this.a, arrayOfInt);
  }
  
  public String toString() {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: aload_0
    //   5: invokevirtual a : ()I
    //   8: bipush #8
    //   10: imul
    //   11: invokespecial <init> : (I)V
    //   14: astore #5
    //   16: aload_0
    //   17: invokevirtual a : ()I
    //   20: istore_2
    //   21: iload_2
    //   22: iflt -> 182
    //   25: aload_0
    //   26: iload_2
    //   27: invokevirtual b : (I)I
    //   30: istore #4
    //   32: iload #4
    //   34: ifeq -> 175
    //   37: iload #4
    //   39: ifge -> 57
    //   42: aload #5
    //   44: ldc ' - '
    //   46: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: pop
    //   50: iload #4
    //   52: ineg
    //   53: istore_3
    //   54: goto -> 79
    //   57: iload #4
    //   59: istore_3
    //   60: aload #5
    //   62: invokevirtual length : ()I
    //   65: ifle -> 79
    //   68: aload #5
    //   70: ldc ' + '
    //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: iload #4
    //   78: istore_3
    //   79: iload_2
    //   80: ifeq -> 88
    //   83: iload_3
    //   84: iconst_1
    //   85: if_icmpeq -> 140
    //   88: aload_0
    //   89: getfield a : Le/f/c/s/n/a;
    //   92: iload_3
    //   93: invokevirtual c : (I)I
    //   96: istore_3
    //   97: iload_3
    //   98: ifne -> 114
    //   101: bipush #49
    //   103: istore_1
    //   104: aload #5
    //   106: iload_1
    //   107: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: goto -> 140
    //   114: iload_3
    //   115: iconst_1
    //   116: if_icmpne -> 125
    //   119: bipush #97
    //   121: istore_1
    //   122: goto -> 104
    //   125: aload #5
    //   127: ldc 'a^'
    //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: aload #5
    //   135: iload_3
    //   136: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   139: pop
    //   140: iload_2
    //   141: ifeq -> 175
    //   144: iload_2
    //   145: iconst_1
    //   146: if_icmpne -> 160
    //   149: aload #5
    //   151: bipush #120
    //   153: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: goto -> 175
    //   160: aload #5
    //   162: ldc 'x^'
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: aload #5
    //   170: iload_2
    //   171: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: iload_2
    //   176: iconst_1
    //   177: isub
    //   178: istore_2
    //   179: goto -> 21
    //   182: aload #5
    //   184: invokevirtual toString : ()Ljava/lang/String;
    //   187: areturn
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/s/n/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */