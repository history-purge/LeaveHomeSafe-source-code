package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b.e.b.k.e;
import b.e.b.k.h;

public class a extends c {
  private int j;
  
  private int k;
  
  private b.e.b.k.a l;
  
  public a(Context paramContext) {
    super(paramContext);
    setVisibility(8);
  }
  
  private void a(e parame, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: putfield k : I
    //   5: getstatic android/os/Build$VERSION.SDK_INT : I
    //   8: bipush #17
    //   10: if_icmpge -> 40
    //   13: aload_0
    //   14: getfield j : I
    //   17: istore_2
    //   18: iload_2
    //   19: iconst_5
    //   20: if_icmpne -> 31
    //   23: aload_0
    //   24: iconst_0
    //   25: putfield k : I
    //   28: goto -> 88
    //   31: iload_2
    //   32: bipush #6
    //   34: if_icmpne -> 88
    //   37: goto -> 54
    //   40: aload_0
    //   41: getfield j : I
    //   44: istore_2
    //   45: iload_3
    //   46: ifeq -> 71
    //   49: iload_2
    //   50: iconst_5
    //   51: if_icmpne -> 62
    //   54: aload_0
    //   55: iconst_1
    //   56: putfield k : I
    //   59: goto -> 88
    //   62: iload_2
    //   63: bipush #6
    //   65: if_icmpne -> 88
    //   68: goto -> 23
    //   71: iload_2
    //   72: iconst_5
    //   73: if_icmpne -> 79
    //   76: goto -> 23
    //   79: iload_2
    //   80: bipush #6
    //   82: if_icmpne -> 88
    //   85: goto -> 37
    //   88: aload_1
    //   89: instanceof b/e/b/k/a
    //   92: ifeq -> 106
    //   95: aload_1
    //   96: checkcast b/e/b/k/a
    //   99: aload_0
    //   100: getfield k : I
    //   103: invokevirtual s : (I)V
    //   106: return
  }
  
  protected void a(AttributeSet paramAttributeSet) {
    super.a(paramAttributeSet);
    this.l = new b.e.b.k.a();
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, k.ConstraintLayout_Layout);
      int j = typedArray.getIndexCount();
      for (int i = 0; i < j; i++) {
        int k = typedArray.getIndex(i);
        if (k == k.ConstraintLayout_Layout_barrierDirection) {
          setType(typedArray.getInt(k, 0));
        } else if (k == k.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
          this.l.d(typedArray.getBoolean(k, true));
        } else if (k == k.ConstraintLayout_Layout_barrierMargin) {
          k = typedArray.getDimensionPixelSize(k, 0);
          this.l.t(k);
        } 
      } 
    } 
    this.f = (h)this.l;
    b();
  }
  
  public void a(e parame, boolean paramBoolean) {
    a(parame, this.j, paramBoolean);
  }
  
  public boolean c() {
    return this.l.H();
  }
  
  public int getMargin() {
    return this.l.J();
  }
  
  public int getType() {
    return this.j;
  }
  
  public void setAllowsGoneWidget(boolean paramBoolean) {
    this.l.d(paramBoolean);
  }
  
  public void setDpMargin(int paramInt) {
    float f = (getResources().getDisplayMetrics()).density;
    paramInt = (int)(paramInt * f + 0.5F);
    this.l.t(paramInt);
  }
  
  public void setMargin(int paramInt) {
    this.l.t(paramInt);
  }
  
  public void setType(int paramInt) {
    this.j = paramInt;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/constraintlayout/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */