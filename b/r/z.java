package b.r;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import b.g.m.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class z {
  private static x a = new b();
  
  private static ThreadLocal<WeakReference<b.d.a<ViewGroup, ArrayList<x>>>> b = new ThreadLocal<WeakReference<b.d.a<ViewGroup, ArrayList<x>>>>();
  
  static ArrayList<ViewGroup> c = new ArrayList<ViewGroup>();
  
  static b.d.a<ViewGroup, ArrayList<x>> a() {
    WeakReference<b.d.a> weakReference1 = (WeakReference)b.get();
    if (weakReference1 != null) {
      b.d.a<ViewGroup, ArrayList<x>> a1 = weakReference1.get();
      if (a1 != null)
        return a1; 
    } 
    b.d.a<ViewGroup, ArrayList<x>> a = new b.d.a();
    WeakReference<b.d.a> weakReference2 = new WeakReference<b.d.a>(a);
    b.set(weakReference2);
    return a;
  }
  
  public static void a(ViewGroup paramViewGroup, x paramx) {
    if (!c.contains(paramViewGroup) && v.I((View)paramViewGroup)) {
      c.add(paramViewGroup);
      x x1 = paramx;
      if (paramx == null)
        x1 = a; 
      paramx = x1.clone();
      c(paramViewGroup, paramx);
      u.a(paramViewGroup, null);
      b(paramViewGroup, paramx);
    } 
  }
  
  private static void b(ViewGroup paramViewGroup, x paramx) {
    if (paramx != null && paramViewGroup != null) {
      a a = new a(paramx, paramViewGroup);
      paramViewGroup.addOnAttachStateChangeListener(a);
      paramViewGroup.getViewTreeObserver().addOnPreDrawListener(a);
    } 
  }
  
  private static void c(ViewGroup paramViewGroup, x paramx) {
    ArrayList arrayList = (ArrayList)a().get(paramViewGroup);
    if (arrayList != null && arrayList.size() > 0) {
      Iterator<x> iterator = arrayList.iterator();
      while (iterator.hasNext())
        ((x)iterator.next()).c((View)paramViewGroup); 
    } 
    if (paramx != null)
      paramx.a(paramViewGroup, true); 
    u u = u.a(paramViewGroup);
    if (u != null)
      u.a(); 
  }
  
  private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    x c;
    
    ViewGroup d;
    
    a(x param1x, ViewGroup param1ViewGroup) {
      this.c = param1x;
      this.d = param1ViewGroup;
    }
    
    private void a() {
      this.d.getViewTreeObserver().removeOnPreDrawListener(this);
      this.d.removeOnAttachStateChangeListener(this);
    }
    
    public boolean onPreDraw() {
      ArrayList<?> arrayList1;
      a();
      if (!z.c.remove(this.d))
        return true; 
      b.d.a<ViewGroup, ArrayList<x>> a1 = z.a();
      ArrayList<?> arrayList2 = (ArrayList)a1.get(this.d);
      ArrayList arrayList = null;
      if (arrayList2 == null) {
        arrayList1 = new ArrayList();
        a1.put(this.d, arrayList1);
      } else {
        arrayList1 = arrayList2;
        if (arrayList2.size() > 0) {
          arrayList = new ArrayList(arrayList2);
          arrayList1 = arrayList2;
        } 
      } 
      arrayList1.add(this.c);
      this.c.a(new a(this, a1));
      this.c.a(this.d, false);
      if (arrayList != null) {
        Iterator<x> iterator = arrayList.iterator();
        while (iterator.hasNext())
          ((x)iterator.next()).e((View)this.d); 
      } 
      this.c.a(this.d);
      return true;
    }
    
    public void onViewAttachedToWindow(View param1View) {}
    
    public void onViewDetachedFromWindow(View param1View) {
      a();
      z.c.remove(this.d);
      ArrayList arrayList = (ArrayList)z.a().get(this.d);
      if (arrayList != null && arrayList.size() > 0) {
        Iterator<x> iterator = arrayList.iterator();
        while (iterator.hasNext())
          ((x)iterator.next()).e((View)this.d); 
      } 
      this.c.a(true);
    }
    
    class a extends y {
      a(z.a this$0, b.d.a param2a) {}
      
      public void e(x param2x) {
        ((ArrayList)this.a.get(this.b.d)).remove(param2x);
        param2x.b(this);
      }
    }
  }
  
  class a extends y {
    a(z this$0, b.d.a param1a) {}
    
    public void e(x param1x) {
      ((ArrayList)this.a.get(this.b.d)).remove(param1x);
      param1x.b(this);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */