package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class b implements n {
  protected Context c;
  
  protected Context d;
  
  protected g e;
  
  protected LayoutInflater f;
  
  private n.a g;
  
  private int h;
  
  private int i;
  
  protected o j;
  
  public b(Context paramContext, int paramInt1, int paramInt2) {
    this.c = paramContext;
    this.f = LayoutInflater.from(paramContext);
    this.h = paramInt1;
    this.i = paramInt2;
  }
  
  public View a(j paramj, View paramView, ViewGroup paramViewGroup) {
    o.a a1;
    if (paramView instanceof o.a) {
      a1 = (o.a)paramView;
    } else {
      a1 = a(paramViewGroup);
    } 
    a(paramj, a1);
    return (View)a1;
  }
  
  public o.a a(ViewGroup paramViewGroup) {
    return (o.a)this.f.inflate(this.i, paramViewGroup, false);
  }
  
  public void a(int paramInt) {}
  
  public void a(Context paramContext, g paramg) {
    this.d = paramContext;
    LayoutInflater.from(this.d);
    this.e = paramg;
  }
  
  protected void a(View paramView, int paramInt) {
    ViewGroup viewGroup = (ViewGroup)paramView.getParent();
    if (viewGroup != null)
      viewGroup.removeView(paramView); 
    ((ViewGroup)this.j).addView(paramView, paramInt);
  }
  
  public void a(g paramg, boolean paramBoolean) {
    n.a a1 = this.g;
    if (a1 != null)
      a1.a(paramg, paramBoolean); 
  }
  
  public abstract void a(j paramj, o.a parama);
  
  public void a(n.a parama) {
    this.g = parama;
  }
  
  public void a(boolean paramBoolean) {
    ViewGroup viewGroup = (ViewGroup)this.j;
    if (viewGroup == null)
      return; 
    g g1 = this.e;
    int i = 0;
    if (g1 != null) {
      g1.b();
      ArrayList<j> arrayList = this.e.n();
      int k = arrayList.size();
      int j = 0;
      for (i = 0; j < k; i = m) {
        j j1 = arrayList.get(j);
        int m = i;
        if (a(i, j1)) {
          View view1 = viewGroup.getChildAt(i);
          if (view1 instanceof o.a) {
            j j2 = ((o.a)view1).getItemData();
          } else {
            g1 = null;
          } 
          View view2 = a(j1, view1, viewGroup);
          if (j1 != g1) {
            view2.setPressed(false);
            view2.jumpDrawablesToCurrentState();
          } 
          if (view2 != view1)
            a(view2, i); 
          m = i + 1;
        } 
        j++;
      } 
    } 
    while (i < viewGroup.getChildCount()) {
      if (!a(viewGroup, i))
        i++; 
    } 
  }
  
  public abstract boolean a(int paramInt, j paramj);
  
  protected boolean a(ViewGroup paramViewGroup, int paramInt) {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }
  
  public boolean a(g paramg, j paramj) {
    return false;
  }
  
  public boolean a(s params) {
    n.a a1 = this.g;
    if (a1 != null) {
      g g1;
      if (params == null)
        g1 = this.e; 
      return a1.a(g1);
    } 
    return false;
  }
  
  public n.a b() {
    return this.g;
  }
  
  public o b(ViewGroup paramViewGroup) {
    if (this.j == null) {
      this.j = (o)this.f.inflate(this.h, paramViewGroup, false);
      this.j.a(this.e);
      a(true);
    } 
    return this.j;
  }
  
  public boolean b(g paramg, j paramj) {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */