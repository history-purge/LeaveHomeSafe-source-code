package b.a.l.a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

@SuppressLint({"RestrictedAPI"})
class d extends b {
  private a o;
  
  private boolean p;
  
  d(a parama) {
    if (parama != null)
      a(parama); 
  }
  
  d(a parama, Resources paramResources) {
    a(new a(parama, this, paramResources));
    onStateChange(getState());
  }
  
  a a() {
    return new a(this.o, this, null);
  }
  
  void a(b.c paramc) {
    super.a(paramc);
    if (paramc instanceof a)
      this.o = (a)paramc; 
  }
  
  int[] a(AttributeSet paramAttributeSet) {
    int k = paramAttributeSet.getAttributeCount();
    int[] arrayOfInt = new int[k];
    int i = 0;
    int j;
    for (j = 0; i < k; j = m) {
      int n = paramAttributeSet.getAttributeNameResource(i);
      int m = j;
      if (n != 0) {
        m = j;
        if (n != 16842960) {
          m = j;
          if (n != 16843161) {
            if (paramAttributeSet.getAttributeBooleanValue(i, false)) {
              m = n;
            } else {
              m = -n;
            } 
            arrayOfInt[j] = m;
            m = j + 1;
          } 
        } 
      } 
      i++;
    } 
    return StateSet.trimStateSet(arrayOfInt, j);
  }
  
  public void applyTheme(Resources.Theme paramTheme) {
    super.applyTheme(paramTheme);
    onStateChange(getState());
  }
  
  public boolean isStateful() {
    return true;
  }
  
  public Drawable mutate() {
    if (!this.p) {
      super.mutate();
      this.o.m();
      this.p = true;
    } 
    return this;
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    boolean bool = super.onStateChange(paramArrayOfint);
    int j = this.o.a(paramArrayOfint);
    int i = j;
    if (j < 0)
      i = this.o.a(StateSet.WILD_CARD); 
    return (a(i) || bool);
  }
  
  static class a extends b.c {
    int[][] J;
    
    a(a param1a, d param1d, Resources param1Resources) {
      super(param1a, param1d, param1Resources);
      if (param1a != null) {
        this.J = param1a.J;
        return;
      } 
      this.J = new int[c()][];
    }
    
    int a(int[] param1ArrayOfint) {
      int[][] arrayOfInt = this.J;
      int j = d();
      for (int i = 0; i < j; i++) {
        if (StateSet.stateSetMatches(arrayOfInt[i], param1ArrayOfint))
          return i; 
      } 
      return -1;
    }
    
    int a(int[] param1ArrayOfint, Drawable param1Drawable) {
      int i = a(param1Drawable);
      this.J[i] = param1ArrayOfint;
      return i;
    }
    
    public void a(int param1Int1, int param1Int2) {
      super.a(param1Int1, param1Int2);
      int[][] arrayOfInt = new int[param1Int2][];
      System.arraycopy(this.J, 0, arrayOfInt, 0, param1Int1);
      this.J = arrayOfInt;
    }
    
    void m() {
      int[][] arrayOfInt1 = this.J;
      int[][] arrayOfInt2 = new int[arrayOfInt1.length][];
      for (int i = arrayOfInt1.length - 1; i >= 0; i--) {
        arrayOfInt1 = this.J;
        if (arrayOfInt1[i] != null) {
          int[] arrayOfInt = (int[])arrayOfInt1[i].clone();
        } else {
          arrayOfInt1 = null;
        } 
        arrayOfInt2[i] = (int[])arrayOfInt1;
      } 
      this.J = arrayOfInt2;
    }
    
    public Drawable newDrawable() {
      return new d(this, null);
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      return new d(this, param1Resources);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/a/l/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */