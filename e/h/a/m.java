package e.h.a;

import android.view.MotionEvent;

public class m {
  private long a;
  
  private long b;
  
  private double c;
  
  private double d;
  
  private float e;
  
  private float f;
  
  private boolean g;
  
  private int[] h = new int[2];
  
  private a i;
  
  public m(a parama) {
    this.i = parama;
  }
  
  private void b(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield a : J
    //   5: putfield b : J
    //   8: aload_0
    //   9: aload_1
    //   10: invokevirtual getEventTime : ()J
    //   13: putfield a : J
    //   16: aload_1
    //   17: aload_0
    //   18: getfield h : [I
    //   21: iconst_0
    //   22: iaload
    //   23: invokevirtual findPointerIndex : (I)I
    //   26: istore #10
    //   28: aload_1
    //   29: aload_0
    //   30: getfield h : [I
    //   33: iconst_1
    //   34: iaload
    //   35: invokevirtual findPointerIndex : (I)I
    //   38: istore #11
    //   40: aload_1
    //   41: iload #10
    //   43: invokevirtual getX : (I)F
    //   46: fstore #6
    //   48: aload_1
    //   49: iload #10
    //   51: invokevirtual getY : (I)F
    //   54: fstore #7
    //   56: aload_1
    //   57: iload #11
    //   59: invokevirtual getX : (I)F
    //   62: fstore #8
    //   64: aload_1
    //   65: iload #11
    //   67: invokevirtual getY : (I)F
    //   70: fstore #9
    //   72: aload_0
    //   73: fload #6
    //   75: fload #8
    //   77: fadd
    //   78: ldc 0.5
    //   80: fmul
    //   81: putfield e : F
    //   84: aload_0
    //   85: fload #7
    //   87: fload #9
    //   89: fadd
    //   90: ldc 0.5
    //   92: fmul
    //   93: putfield f : F
    //   96: fload #9
    //   98: fload #7
    //   100: fsub
    //   101: f2d
    //   102: fload #8
    //   104: fload #6
    //   106: fsub
    //   107: f2d
    //   108: invokestatic atan2 : (DD)D
    //   111: dneg
    //   112: dstore #4
    //   114: aload_0
    //   115: getfield c : D
    //   118: invokestatic isNaN : (D)Z
    //   121: ifeq -> 129
    //   124: dconst_0
    //   125: dstore_2
    //   126: goto -> 137
    //   129: aload_0
    //   130: getfield c : D
    //   133: dload #4
    //   135: dsub
    //   136: dstore_2
    //   137: aload_0
    //   138: dload_2
    //   139: putfield d : D
    //   142: aload_0
    //   143: dload #4
    //   145: putfield c : D
    //   148: aload_0
    //   149: getfield d : D
    //   152: dstore_2
    //   153: dload_2
    //   154: ldc2_w 3.141592653589793
    //   157: dcmpl
    //   158: ifle -> 175
    //   161: dload_2
    //   162: ldc2_w 3.141592653589793
    //   165: dsub
    //   166: dstore_2
    //   167: aload_0
    //   168: dload_2
    //   169: putfield d : D
    //   172: goto -> 192
    //   175: dload_2
    //   176: ldc2_w -3.141592653589793
    //   179: dcmpg
    //   180: ifge -> 192
    //   183: dload_2
    //   184: ldc2_w 3.141592653589793
    //   187: dadd
    //   188: dstore_2
    //   189: goto -> 167
    //   192: aload_0
    //   193: getfield d : D
    //   196: dstore_2
    //   197: dload_2
    //   198: ldc2_w 1.5707963267948966
    //   201: dcmpl
    //   202: ifle -> 217
    //   205: dload_2
    //   206: ldc2_w 3.141592653589793
    //   209: dsub
    //   210: dstore_2
    //   211: aload_0
    //   212: dload_2
    //   213: putfield d : D
    //   216: return
    //   217: dload_2
    //   218: ldc2_w -1.5707963267948966
    //   221: dcmpg
    //   222: ifge -> 234
    //   225: dload_2
    //   226: ldc2_w 3.141592653589793
    //   229: dadd
    //   230: dstore_2
    //   231: goto -> 211
    //   234: return
  }
  
  private void e() {
    if (this.g) {
      this.g = false;
      a a1 = this.i;
      if (a1 != null)
        a1.b(this); 
    } 
  }
  
  public float a() {
    return this.e;
  }
  
  public boolean a(MotionEvent paramMotionEvent) {
    a a1;
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          int[] arrayOfInt;
          if (i != 5) {
            if (i != 6)
              return true; 
            if (this.g) {
              i = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
              arrayOfInt = this.h;
              if (i == arrayOfInt[0] || i == arrayOfInt[1]) {
                e();
                return true;
              } 
            } 
          } else if (!this.g) {
            this.h[1] = arrayOfInt.getPointerId(arrayOfInt.getActionIndex());
            this.g = true;
            this.b = arrayOfInt.getEventTime();
            this.c = Double.NaN;
            b((MotionEvent)arrayOfInt);
            a1 = this.i;
            if (a1 != null) {
              a1.c(this);
              return true;
            } 
          } 
        } else if (this.g) {
          b((MotionEvent)a1);
          a1 = this.i;
          if (a1 != null) {
            a1.a(this);
            return true;
          } 
        } 
      } else {
        e();
        return true;
      } 
    } else {
      this.g = false;
      this.h[0] = a1.getPointerId(a1.getActionIndex());
      this.h[1] = -1;
    } 
    return true;
  }
  
  public float b() {
    return this.f;
  }
  
  public double c() {
    return this.d;
  }
  
  public long d() {
    return this.a - this.b;
  }
  
  public static interface a {
    boolean a(m param1m);
    
    void b(m param1m);
    
    boolean c(m param1m);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/h/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */