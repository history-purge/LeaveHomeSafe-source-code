package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import b.a.g;
import java.util.ArrayList;

public class e implements n, AdapterView.OnItemClickListener {
  Context c;
  
  LayoutInflater d;
  
  g e;
  
  ExpandedMenuView f;
  
  int g;
  
  int h;
  
  int i;
  
  private n.a j;
  
  a k;
  
  public e(int paramInt1, int paramInt2) {
    this.i = paramInt1;
    this.h = paramInt2;
  }
  
  public e(Context paramContext, int paramInt) {
    this(paramInt, 0);
    this.c = paramContext;
    this.d = LayoutInflater.from(this.c);
  }
  
  public o a(ViewGroup paramViewGroup) {
    if (this.f == null) {
      this.f = (ExpandedMenuView)this.d.inflate(g.abc_expanded_menu_layout, paramViewGroup, false);
      if (this.k == null)
        this.k = new a(this); 
      this.f.setAdapter((ListAdapter)this.k);
      this.f.setOnItemClickListener(this);
    } 
    return this.f;
  }
  
  public void a(Context paramContext, g paramg) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : I
    //   4: istore_3
    //   5: iload_3
    //   6: ifeq -> 36
    //   9: aload_0
    //   10: new android/view/ContextThemeWrapper
    //   13: dup
    //   14: aload_1
    //   15: iload_3
    //   16: invokespecial <init> : (Landroid/content/Context;I)V
    //   19: putfield c : Landroid/content/Context;
    //   22: aload_0
    //   23: aload_0
    //   24: getfield c : Landroid/content/Context;
    //   27: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   30: putfield d : Landroid/view/LayoutInflater;
    //   33: goto -> 58
    //   36: aload_0
    //   37: getfield c : Landroid/content/Context;
    //   40: ifnull -> 58
    //   43: aload_0
    //   44: aload_1
    //   45: putfield c : Landroid/content/Context;
    //   48: aload_0
    //   49: getfield d : Landroid/view/LayoutInflater;
    //   52: ifnonnull -> 58
    //   55: goto -> 22
    //   58: aload_0
    //   59: aload_2
    //   60: putfield e : Landroidx/appcompat/view/menu/g;
    //   63: aload_0
    //   64: getfield k : Landroidx/appcompat/view/menu/e$a;
    //   67: astore_1
    //   68: aload_1
    //   69: ifnull -> 76
    //   72: aload_1
    //   73: invokevirtual notifyDataSetChanged : ()V
    //   76: return
  }
  
  public void a(g paramg, boolean paramBoolean) {
    n.a a1 = this.j;
    if (a1 != null)
      a1.a(paramg, paramBoolean); 
  }
  
  public void a(n.a parama) {
    this.j = parama;
  }
  
  public void a(boolean paramBoolean) {
    a a1 = this.k;
    if (a1 != null)
      a1.notifyDataSetChanged(); 
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean a(g paramg, j paramj) {
    return false;
  }
  
  public boolean a(s params) {
    if (!params.hasVisibleItems())
      return false; 
    (new h(params)).a((IBinder)null);
    n.a a1 = this.j;
    if (a1 != null)
      a1.a(params); 
    return true;
  }
  
  public ListAdapter b() {
    if (this.k == null)
      this.k = new a(this); 
    return (ListAdapter)this.k;
  }
  
  public boolean b(g paramg, j paramj) {
    return false;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
    this.e.a((MenuItem)this.k.getItem(paramInt), this, 0);
  }
  
  private class a extends BaseAdapter {
    private int c = -1;
    
    public a(e this$0) {
      a();
    }
    
    void a() {
      j j = this.d.e.f();
      if (j != null) {
        ArrayList<j> arrayList = this.d.e.j();
        int k = arrayList.size();
        for (int i = 0; i < k; i++) {
          if ((j)arrayList.get(i) == j) {
            this.c = i;
            return;
          } 
        } 
      } 
      this.c = -1;
    }
    
    public int getCount() {
      int i = this.d.e.j().size() - this.d.g;
      return (this.c < 0) ? i : (i - 1);
    }
    
    public j getItem(int param1Int) {
      ArrayList<j> arrayList = this.d.e.j();
      int i = param1Int + this.d.g;
      int j = this.c;
      param1Int = i;
      if (j >= 0) {
        param1Int = i;
        if (i >= j)
          param1Int = i + 1; 
      } 
      return arrayList.get(param1Int);
    }
    
    public long getItemId(int param1Int) {
      return param1Int;
    }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      View view = param1View;
      if (param1View == null) {
        e e1 = this.d;
        view = e1.d.inflate(e1.i, param1ViewGroup, false);
      } 
      ((o.a)view).a(getItem(param1Int), 0);
      return view;
    }
    
    public void notifyDataSetChanged() {
      a();
      super.notifyDataSetChanged();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */