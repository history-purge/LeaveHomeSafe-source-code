package net.time4j.history;

import java.util.Arrays;

public final class a {
  private static final int[] c = new int[] { 
      42, 39, 36, 33, 30, 27, 24, 21, 18, 15, 
      12, 9 };
  
  private static final h d = h.a(j.d, 8, 1, 1);
  
  private static final h e = h.a(j.c, 45, 1, 1);
  
  public static final a f = new a(c);
  
  private final int[] a;
  
  private final b b;
  
  private a(int... paramVarArgs) {
    int[] arrayOfInt = new int[paramVarArgs.length];
    int i = 0;
    while (true) {
      int k = paramVarArgs.length;
      int j = 1;
      if (i < k) {
        arrayOfInt[i] = 1 - paramVarArgs[i];
        i++;
        continue;
      } 
      Arrays.sort(arrayOfInt);
      this.a = arrayOfInt;
      int[] arrayOfInt1 = this.a;
      if (arrayOfInt1.length != 0) {
        if (arrayOfInt1[0] >= -44 && arrayOfInt1[arrayOfInt1.length - 1] < 8) {
          k = arrayOfInt[0];
          i = j;
          j = k;
          while (i < paramVarArgs.length) {
            if (arrayOfInt[i] != j) {
              j = arrayOfInt[i];
              i++;
              continue;
            } 
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("Contains duplicates: ");
            stringBuilder1.append(Arrays.toString(paramVarArgs));
            throw new IllegalArgumentException(stringBuilder1.toString());
          } 
          this.b = new a(this);
          return;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Out of range: ");
        stringBuilder.append(Arrays.toString(paramVarArgs));
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing leap years.");
      throw illegalArgumentException;
    } 
  }
  
  public static a a(int... paramVarArgs) {
    return Arrays.equals(paramVarArgs, c) ? f : new a(paramVarArgs);
  }
  
  b a() {
    return this.b;
  }
  
  int[] b() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof a) {
      paramObject = paramObject;
      return (this.a == ((a)paramObject).a);
    } 
    return false;
  }
  
  public int hashCode() {
    return Arrays.hashCode(this.a);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < this.a.length; i++) {
      if (i > 0)
        stringBuilder.append(", "); 
      int j = 1 - this.a[i];
      if (j > 0) {
        stringBuilder.append("BC ");
      } else {
        stringBuilder.append("AD ");
        j = this.a[i];
      } 
      stringBuilder.append(j);
    } 
    return stringBuilder.toString();
  }
  
  class a implements b {
    a(a this$0) {}
    
    private int a(int param1Int1, int param1Int2) {
      StringBuilder stringBuilder;
      switch (param1Int2) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid month: ");
          stringBuilder.append(param1Int2);
          throw new IllegalArgumentException(stringBuilder.toString());
        case 4:
        case 6:
        case 9:
        case 11:
          return 30;
        case 2:
          return a(param1Int1) ? 29 : 28;
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          break;
      } 
      return 31;
    }
    
    private boolean a(int param1Int) {
      return (Arrays.binarySearch(a.a(this.c), param1Int) >= 0);
    }
    
    private int d(h param1h) {
      return param1h.b().f(param1h.c());
    }
    
    public h a(long param1Long) {
      long l = -676021L;
      if (param1Long >= -676021L)
        return c.d.a(param1Long); 
      for (int i = 7; i >= -44; i--) {
        if (a(i)) {
          l1 = 366L;
        } else {
          l1 = 365L;
        } 
        long l1 = l - l1;
        l = l1;
        if (l1 <= param1Long) {
          l = l1;
          int j = 1;
          while (j <= 12) {
            l1 = a(i, j) + l;
            if (l1 > param1Long) {
              j j1;
              if (i <= 0) {
                j1 = j.c;
              } else {
                j1 = j.d;
              } 
              int k = i;
              if (i <= 0)
                k = 1 - i; 
              return h.a(j1, k, j, (int)(param1Long - l + 1L));
            } 
            j++;
            l = l1;
          } 
        } 
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Not valid before 45 BC: ");
      stringBuilder.append(param1Long);
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
      throw illegalArgumentException;
    }
    
    public boolean a(h param1h) {
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (param1h != null) {
        int i = d(param1h);
        bool1 = bool2;
        if (i >= -44) {
          if (i >= 8)
            return c.d.a(param1h); 
          bool1 = bool2;
          if (param1h.a() <= a(i, param1h.getMonth()))
            bool1 = true; 
        } 
      } 
      return bool1;
    }
    
    public long b(h param1h) {
      if (param1h.a(a.c()) >= 0)
        return c.d.b(param1h); 
      if (param1h.a(a.d()) >= 0) {
        long l = -676021L;
        int j = d(param1h);
        int i;
        for (i = 7; i >= j; i--) {
          long l1;
          if (a(i)) {
            l1 = 366L;
          } else {
            l1 = 365L;
          } 
          l -= l1;
        } 
        for (i = 1; i < param1h.getMonth(); i++)
          l += a(j, i); 
        return l + param1h.a() - 1L;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Not valid before 45 BC: ");
      stringBuilder.append(param1h);
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
      throw illegalArgumentException;
    }
    
    public int c(h param1h) {
      if (param1h.a(a.c()) >= 0)
        return c.d.c(param1h); 
      if (param1h.a(a.d()) >= 0)
        return a(d(param1h), param1h.getMonth()); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Not valid before 45 BC: ");
      stringBuilder.append(param1h);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */