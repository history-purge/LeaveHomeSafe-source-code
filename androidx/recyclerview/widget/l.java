package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b.g.m.a;
import b.g.m.e0.c;
import b.g.m.e0.d;
import b.g.m.v;
import java.util.Map;
import java.util.WeakHashMap;

public class l extends a {
  final RecyclerView d;
  
  private final a e;
  
  public l(RecyclerView paramRecyclerView) {
    this.d = paramRecyclerView;
    a a1 = b();
    if (a1 != null && a1 instanceof a) {
      a1 = a1;
    } else {
      a1 = new a(this);
    } 
    this.e = (a)a1;
  }
  
  public void a(View paramView, c paramc) {
    super.a(paramView, paramc);
    if (!c() && this.d.getLayoutManager() != null)
      this.d.getLayoutManager().a(paramc); 
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle) {
    return super.a(paramView, paramInt, paramBundle) ? true : ((!c() && this.d.getLayoutManager() != null) ? this.d.getLayoutManager().a(paramInt, paramBundle) : false);
  }
  
  public a b() {
    return this.e;
  }
  
  public void b(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    super.b(paramView, paramAccessibilityEvent);
    if (paramView instanceof RecyclerView && !c()) {
      RecyclerView recyclerView = (RecyclerView)paramView;
      if (recyclerView.getLayoutManager() != null)
        recyclerView.getLayoutManager().a(paramAccessibilityEvent); 
    } 
  }
  
  boolean c() {
    return this.d.hasPendingAdapterUpdates();
  }
  
  public static class a extends a {
    final l d;
    
    private Map<View, a> e = new WeakHashMap<View, a>();
    
    public a(l param1l) {
      this.d = param1l;
    }
    
    public d a(View param1View) {
      a a1 = this.e.get(param1View);
      return (a1 != null) ? a1.a(param1View) : super.a(param1View);
    }
    
    public void a(View param1View, int param1Int) {
      a a1 = this.e.get(param1View);
      if (a1 != null) {
        a1.a(param1View, param1Int);
        return;
      } 
      super.a(param1View, param1Int);
    }
    
    public void a(View param1View, c param1c) {
      if (!this.d.c() && this.d.d.getLayoutManager() != null) {
        this.d.d.getLayoutManager().a(param1View, param1c);
        a a1 = this.e.get(param1View);
        if (a1 != null) {
          a1.a(param1View, param1c);
          return;
        } 
      } 
      super.a(param1View, param1c);
    }
    
    public boolean a(View param1View, int param1Int, Bundle param1Bundle) {
      if (!this.d.c() && this.d.d.getLayoutManager() != null) {
        a a1 = this.e.get(param1View);
        if (a1 != null) {
          if (a1.a(param1View, param1Int, param1Bundle))
            return true; 
        } else if (super.a(param1View, param1Int, param1Bundle)) {
          return true;
        } 
        return this.d.d.getLayoutManager().a(param1View, param1Int, param1Bundle);
      } 
      return super.a(param1View, param1Int, param1Bundle);
    }
    
    public boolean a(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1View);
      return (a1 != null) ? a1.a(param1View, param1AccessibilityEvent) : super.a(param1View, param1AccessibilityEvent);
    }
    
    public boolean a(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1ViewGroup);
      return (a1 != null) ? a1.a(param1ViewGroup, param1View, param1AccessibilityEvent) : super.a(param1ViewGroup, param1View, param1AccessibilityEvent);
    }
    
    public void b(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1View);
      if (a1 != null) {
        a1.b(param1View, param1AccessibilityEvent);
        return;
      } 
      super.b(param1View, param1AccessibilityEvent);
    }
    
    a c(View param1View) {
      return this.e.remove(param1View);
    }
    
    public void c(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1View);
      if (a1 != null) {
        a1.c(param1View, param1AccessibilityEvent);
        return;
      } 
      super.c(param1View, param1AccessibilityEvent);
    }
    
    void d(View param1View) {
      a a1 = v.b(param1View);
      if (a1 != null && a1 != this)
        this.e.put(param1View, a1); 
    }
    
    public void d(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1View);
      if (a1 != null) {
        a1.d(param1View, param1AccessibilityEvent);
        return;
      } 
      super.d(param1View, param1AccessibilityEvent);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */