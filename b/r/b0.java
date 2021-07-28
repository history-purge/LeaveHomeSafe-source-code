package b.r;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class b0 extends x {
  private ArrayList<x> L = new ArrayList<x>();
  
  private boolean M = true;
  
  int N;
  
  boolean O = false;
  
  private int P = 0;
  
  private void b(x paramx) {
    this.L.add(paramx);
    paramx.t = this;
  }
  
  private void w() {
    b b = new b(this);
    Iterator<x> iterator = this.L.iterator();
    while (iterator.hasNext())
      ((x)iterator.next()).a(b); 
    this.N = this.L.size();
  }
  
  public b0 a(long paramLong) {
    super.a(paramLong);
    if (this.e >= 0L) {
      ArrayList<x> arrayList = this.L;
      if (arrayList != null) {
        int j = arrayList.size();
        for (int i = 0; i < j; i++)
          ((x)this.L.get(i)).a(paramLong); 
      } 
    } 
    return this;
  }
  
  public b0 a(TimeInterpolator paramTimeInterpolator) {
    this.P |= 0x1;
    ArrayList<x> arrayList = this.L;
    if (arrayList != null) {
      int j = arrayList.size();
      for (int i = 0; i < j; i++)
        ((x)this.L.get(i)).a(paramTimeInterpolator); 
    } 
    super.a(paramTimeInterpolator);
    return this;
  }
  
  public b0 a(View paramView) {
    for (int i = 0; i < this.L.size(); i++)
      ((x)this.L.get(i)).a(paramView); 
    super.a(paramView);
    return this;
  }
  
  public b0 a(x.f paramf) {
    super.a(paramf);
    return this;
  }
  
  public b0 a(x paramx) {
    b(paramx);
    long l = this.e;
    if (l >= 0L)
      paramx.a(l); 
    if ((this.P & 0x1) != 0)
      paramx.a(f()); 
    if ((this.P & 0x2) != 0)
      paramx.a(i()); 
    if ((this.P & 0x4) != 0)
      paramx.a(h()); 
    if ((this.P & 0x8) != 0)
      paramx.a(d()); 
    return this;
  }
  
  public x a(int paramInt) {
    return (paramInt < 0 || paramInt >= this.L.size()) ? null : this.L.get(paramInt);
  }
  
  String a(String paramString) {
    String str = super.a(paramString);
    for (int i = 0; i < this.L.size(); i++) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str);
      stringBuilder1.append("\n");
      x x1 = this.L.get(i);
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append(paramString);
      stringBuilder2.append("  ");
      stringBuilder1.append(x1.a(stringBuilder2.toString()));
      str = stringBuilder1.toString();
    } 
    return str;
  }
  
  protected void a(ViewGroup paramViewGroup, e0 parame01, e0 parame02, ArrayList<d0> paramArrayList1, ArrayList<d0> paramArrayList2) {
    long l = j();
    int j = this.L.size();
    int i;
    for (i = 0; i < j; i++) {
      x x1 = this.L.get(i);
      if (l > 0L && (this.M || i == 0)) {
        long l1 = x1.j();
        if (l1 > 0L) {
          x1.b(l1 + l);
        } else {
          x1.b(l);
        } 
      } 
      x1.a(paramViewGroup, parame01, parame02, paramArrayList1, paramArrayList2);
    } 
  }
  
  public void a(a0 parama0) {
    super.a(parama0);
    this.P |= 0x2;
    int j = this.L.size();
    for (int i = 0; i < j; i++)
      ((x)this.L.get(i)).a(parama0); 
  }
  
  public void a(d0 paramd0) {
    if (b(paramd0.b))
      for (x x1 : this.L) {
        if (x1.b(paramd0.b)) {
          x1.a(paramd0);
          paramd0.c.add(x1);
        } 
      }  
  }
  
  public void a(p paramp) {
    super.a(paramp);
    this.P |= 0x4;
    if (this.L != null)
      for (int i = 0; i < this.L.size(); i++)
        ((x)this.L.get(i)).a(paramp);  
  }
  
  public void a(x.e parame) {
    super.a(parame);
    this.P |= 0x8;
    int j = this.L.size();
    for (int i = 0; i < j; i++)
      ((x)this.L.get(i)).a(parame); 
  }
  
  public b0 b(int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1) {
        this.M = false;
        return this;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid parameter for TransitionSet ordering: ");
      stringBuilder.append(paramInt);
      throw new AndroidRuntimeException(stringBuilder.toString());
    } 
    this.M = true;
    return this;
  }
  
  public b0 b(long paramLong) {
    super.b(paramLong);
    return this;
  }
  
  public b0 b(x.f paramf) {
    super.b(paramf);
    return this;
  }
  
  void b(d0 paramd0) {
    super.b(paramd0);
    int j = this.L.size();
    for (int i = 0; i < j; i++)
      ((x)this.L.get(i)).b(paramd0); 
  }
  
  public void c(View paramView) {
    super.c(paramView);
    int j = this.L.size();
    for (int i = 0; i < j; i++)
      ((x)this.L.get(i)).c(paramView); 
  }
  
  public void c(d0 paramd0) {
    if (b(paramd0.b))
      for (x x1 : this.L) {
        if (x1.b(paramd0.b)) {
          x1.c(paramd0);
          paramd0.c.add(x1);
        } 
      }  
  }
  
  public x clone() {
    b0 b01 = (b0)super.clone();
    b01.L = new ArrayList<x>();
    int j = this.L.size();
    for (int i = 0; i < j; i++)
      b01.b(((x)this.L.get(i)).clone()); 
    return b01;
  }
  
  public b0 d(View paramView) {
    for (int i = 0; i < this.L.size(); i++)
      ((x)this.L.get(i)).d(paramView); 
    super.d(paramView);
    return this;
  }
  
  public void e(View paramView) {
    super.e(paramView);
    int j = this.L.size();
    for (int i = 0; i < j; i++)
      ((x)this.L.get(i)).e(paramView); 
  }
  
  protected void p() {
    if (this.L.isEmpty()) {
      q();
      a();
      return;
    } 
    w();
    if (!this.M) {
      for (int i = 1; i < this.L.size(); i++)
        ((x)this.L.get(i - 1)).a(new a(this, this.L.get(i))); 
      x x1 = this.L.get(0);
      if (x1 != null) {
        x1.p();
        return;
      } 
    } else {
      Iterator<x> iterator = this.L.iterator();
      while (iterator.hasNext())
        ((x)iterator.next()).p(); 
    } 
  }
  
  public int s() {
    return this.L.size();
  }
  
  class a extends y {
    a(b0 this$0, x param1x) {}
    
    public void e(x param1x) {
      this.a.p();
      param1x.b(this);
    }
  }
  
  static class b extends y {
    b0 a;
    
    b(b0 param1b0) {
      this.a = param1b0;
    }
    
    public void a(x param1x) {
      param1x = this.a;
      if (!((b0)param1x).O) {
        param1x.q();
        this.a.O = true;
      } 
    }
    
    public void e(x param1x) {
      b0 b01 = this.a;
      b01.N--;
      if (b01.N == 0) {
        b01.O = false;
        b01.a();
      } 
      param1x.b(this);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */