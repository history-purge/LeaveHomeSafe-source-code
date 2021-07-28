package e.f.a.b;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.OrientationEventListener;

abstract class h {
  static final SparseIntArray e = new SparseIntArray();
  
  private final OrientationEventListener a;
  
  Display b;
  
  private int c = 0;
  
  private int d = 0;
  
  static {
    e.put(0, 0);
    e.put(1, 90);
    e.put(2, 180);
    e.put(3, 270);
  }
  
  public h(Context paramContext) {
    this.a = new a(this, paramContext);
  }
  
  public void a() {
    this.a.disable();
    this.b = null;
  }
  
  void a(int paramInt) {
    this.c = paramInt;
    a(paramInt, this.d);
  }
  
  public abstract void a(int paramInt1, int paramInt2);
  
  public void a(Display paramDisplay) {
    this.b = paramDisplay;
    this.a.enable();
    a(e.get(paramDisplay.getRotation()));
  }
  
  public int b() {
    return this.c;
  }
  
  class a extends OrientationEventListener {
    private int a = -1;
    
    a(h this$0, Context param1Context) {
      super(param1Context);
    }
    
    public void onOrientationChanged(int param1Int) {
      // Byte code:
      //   0: iload_1
      //   1: iconst_m1
      //   2: if_icmpeq -> 163
      //   5: aload_0
      //   6: getfield b : Le/f/a/b/h;
      //   9: getfield b : Landroid/view/Display;
      //   12: ifnonnull -> 16
      //   15: return
      //   16: iconst_0
      //   17: istore_2
      //   18: iload_1
      //   19: sipush #315
      //   22: if_icmpgt -> 95
      //   25: iload_1
      //   26: bipush #45
      //   28: if_icmpge -> 34
      //   31: goto -> 95
      //   34: iload_1
      //   35: bipush #45
      //   37: if_icmple -> 53
      //   40: iload_1
      //   41: sipush #135
      //   44: if_icmpge -> 53
      //   47: bipush #90
      //   49: istore_1
      //   50: goto -> 97
      //   53: iload_1
      //   54: sipush #135
      //   57: if_icmple -> 74
      //   60: iload_1
      //   61: sipush #225
      //   64: if_icmpge -> 74
      //   67: sipush #180
      //   70: istore_1
      //   71: goto -> 97
      //   74: iload_1
      //   75: sipush #225
      //   78: if_icmple -> 95
      //   81: iload_1
      //   82: sipush #315
      //   85: if_icmpge -> 95
      //   88: sipush #270
      //   91: istore_1
      //   92: goto -> 97
      //   95: iconst_0
      //   96: istore_1
      //   97: aload_0
      //   98: getfield b : Le/f/a/b/h;
      //   101: invokestatic a : (Le/f/a/b/h;)I
      //   104: iload_1
      //   105: if_icmpeq -> 119
      //   108: aload_0
      //   109: getfield b : Le/f/a/b/h;
      //   112: iload_1
      //   113: invokestatic a : (Le/f/a/b/h;I)I
      //   116: pop
      //   117: iconst_1
      //   118: istore_2
      //   119: aload_0
      //   120: getfield b : Le/f/a/b/h;
      //   123: getfield b : Landroid/view/Display;
      //   126: invokevirtual getRotation : ()I
      //   129: istore_1
      //   130: aload_0
      //   131: getfield a : I
      //   134: iload_1
      //   135: if_icmpeq -> 145
      //   138: aload_0
      //   139: iload_1
      //   140: putfield a : I
      //   143: iconst_1
      //   144: istore_2
      //   145: iload_2
      //   146: ifeq -> 163
      //   149: aload_0
      //   150: getfield b : Le/f/a/b/h;
      //   153: getstatic e/f/a/b/h.e : Landroid/util/SparseIntArray;
      //   156: iload_1
      //   157: invokevirtual get : (I)I
      //   160: invokevirtual a : (I)V
      //   163: return
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */