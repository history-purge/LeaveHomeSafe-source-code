package com.lwansbrough.RCTCamera;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.List;

public class d extends ViewGroup {
  private final OrientationEventListener c;
  
  private final Context d;
  
  private e e = null;
  
  private int f = -1;
  
  private int g = 1;
  
  private int h = -1;
  
  private int i = -1;
  
  private int j = 0;
  
  private boolean k = false;
  
  public d(Context paramContext) {
    super(paramContext);
    this.d = paramContext;
    b.k(a(paramContext));
    this.c = new a(this, paramContext, 3);
    if (this.c.canDetectOrientation()) {
      this.c.enable();
      return;
    } 
    this.c.disable();
  }
  
  private int a(Context paramContext) {
    return ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getOrientation();
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Lcom/lwansbrough/RCTCamera/e;
    //   4: astore #15
    //   6: aload #15
    //   8: ifnonnull -> 12
    //   11: return
    //   12: iload_3
    //   13: iload_1
    //   14: isub
    //   15: i2f
    //   16: fstore #13
    //   18: iload #4
    //   20: iload_2
    //   21: isub
    //   22: i2f
    //   23: fstore #14
    //   25: aload_0
    //   26: getfield g : I
    //   29: istore_1
    //   30: iload_1
    //   31: ifeq -> 99
    //   34: iload_1
    //   35: iconst_1
    //   36: if_icmpeq -> 50
    //   39: fload #13
    //   41: f2i
    //   42: istore_1
    //   43: fload #14
    //   45: f2i
    //   46: istore_2
    //   47: goto -> 172
    //   50: aload #15
    //   52: invokevirtual b : ()D
    //   55: dstore #7
    //   57: fload #14
    //   59: f2d
    //   60: dstore #5
    //   62: dload #5
    //   64: invokestatic isNaN : (D)Z
    //   67: pop
    //   68: dload #5
    //   70: dload #7
    //   72: dmul
    //   73: dstore #9
    //   75: fload #13
    //   77: f2d
    //   78: dstore #11
    //   80: dload #9
    //   82: dstore #5
    //   84: dload #9
    //   86: dload #11
    //   88: dcmpl
    //   89: ifle -> 165
    //   92: dload #11
    //   94: dstore #5
    //   96: goto -> 145
    //   99: aload #15
    //   101: invokevirtual b : ()D
    //   104: dstore #7
    //   106: fload #14
    //   108: f2d
    //   109: dstore #5
    //   111: dload #5
    //   113: invokestatic isNaN : (D)Z
    //   116: pop
    //   117: dload #5
    //   119: dload #7
    //   121: dmul
    //   122: dstore #11
    //   124: fload #13
    //   126: f2d
    //   127: dstore #9
    //   129: dload #11
    //   131: dstore #5
    //   133: dload #11
    //   135: dload #9
    //   137: dcmpg
    //   138: ifge -> 165
    //   141: dload #9
    //   143: dstore #5
    //   145: dload #5
    //   147: invokestatic isNaN : (D)Z
    //   150: pop
    //   151: dload #5
    //   153: dload #7
    //   155: ddiv
    //   156: d2i
    //   157: istore_2
    //   158: fload #13
    //   160: f2i
    //   161: istore_1
    //   162: goto -> 172
    //   165: dload #5
    //   167: d2i
    //   168: istore_1
    //   169: goto -> 43
    //   172: fload #13
    //   174: iload_1
    //   175: i2f
    //   176: fsub
    //   177: fconst_2
    //   178: fdiv
    //   179: f2i
    //   180: istore_3
    //   181: fload #14
    //   183: iload_2
    //   184: i2f
    //   185: fsub
    //   186: fconst_2
    //   187: fdiv
    //   188: f2i
    //   189: istore #4
    //   191: invokestatic d : ()Lcom/lwansbrough/RCTCamera/b;
    //   194: aload_0
    //   195: getfield e : Lcom/lwansbrough/RCTCamera/e;
    //   198: invokevirtual a : ()I
    //   201: fload #13
    //   203: f2i
    //   204: fload #14
    //   206: f2i
    //   207: invokevirtual a : (III)V
    //   210: aload_0
    //   211: getfield e : Lcom/lwansbrough/RCTCamera/e;
    //   214: iload_3
    //   215: iload #4
    //   217: iload_1
    //   218: iload_3
    //   219: iadd
    //   220: iload_2
    //   221: iload #4
    //   223: iadd
    //   224: invokevirtual layout : (IIII)V
    //   227: aload_0
    //   228: aload_0
    //   229: invokevirtual getLeft : ()I
    //   232: aload_0
    //   233: invokevirtual getTop : ()I
    //   236: aload_0
    //   237: invokevirtual getRight : ()I
    //   240: aload_0
    //   241: invokevirtual getBottom : ()I
    //   244: invokevirtual postInvalidate : (IIII)V
    //   247: return
  }
  
  private boolean b(Context paramContext) {
    int i = a(paramContext);
    if (this.f != i) {
      this.f = i;
      b.d().h(this.f);
      return true;
    } 
    return false;
  }
  
  private void c() {
    a(getLeft(), getTop(), getRight(), getBottom());
  }
  
  public void a() {
    e e1 = this.e;
    if (e1 == null)
      return; 
    e1.c();
  }
  
  public void b() {
    e e1 = this.e;
    if (e1 == null)
      return; 
    e1.d();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void onViewAdded(View paramView) {
    e e1 = this.e;
    if (e1 == paramView)
      return; 
    removeView((View)e1);
    addView((View)this.e, 0);
  }
  
  public void setAspect(int paramInt) {
    this.g = paramInt;
    c();
  }
  
  public void setBarCodeTypes(List<String> paramList) {
    b.d().a(paramList);
  }
  
  public void setBarcodeScannerEnabled(boolean paramBoolean) {
    b.d().a(paramBoolean);
  }
  
  public void setCameraType(int paramInt) {
    e e1 = this.e;
    if (e1 != null) {
      e1.a(paramInt);
      b.d().b(paramInt);
      return;
    } 
    this.e = new e(this.d, paramInt);
    paramInt = this.i;
    if (-1 != paramInt)
      this.e.c(paramInt); 
    paramInt = this.h;
    if (-1 != paramInt)
      this.e.d(paramInt); 
    paramInt = this.j;
    if (paramInt != 0)
      this.e.e(paramInt); 
    this.e.a(this.k);
    addView((View)this.e);
  }
  
  public void setCaptureMode(int paramInt) {
    e e1 = this.e;
    if (e1 != null)
      e1.b(paramInt); 
  }
  
  public void setCaptureQuality(String paramString) {
    e e1 = this.e;
    if (e1 != null)
      e1.a(paramString); 
  }
  
  public void setClearWindowBackground(boolean paramBoolean) {
    this.k = paramBoolean;
    e e1 = this.e;
    if (e1 != null)
      e1.a(paramBoolean); 
  }
  
  public void setFlashMode(int paramInt) {
    this.i = paramInt;
    e e1 = this.e;
    if (e1 != null)
      e1.c(paramInt); 
  }
  
  public void setOrientation(int paramInt) {
    b.d().j(paramInt);
    if (this.e != null)
      c(); 
  }
  
  public void setTorchMode(int paramInt) {
    this.h = paramInt;
    e e1 = this.e;
    if (e1 != null)
      e1.d(paramInt); 
  }
  
  public void setZoom(int paramInt) {
    this.j = paramInt;
    e e1 = this.e;
    if (e1 != null)
      e1.e(paramInt); 
  }
  
  class a extends OrientationEventListener {
    a(d this$0, Context param1Context, int param1Int) {
      super(param1Context, param1Int);
    }
    
    public void onOrientationChanged(int param1Int) {
      d d1 = this.a;
      if (d.a(d1, d.a(d1)))
        d.b(this.a); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/lwansbrough/RCTCamera/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */