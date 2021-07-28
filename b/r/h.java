package b.r;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a0;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
public class h extends a0 {
  private static boolean a(x paramx) {
    return (!a0.a(paramx.k()) || !a0.a(paramx.l()) || !a0.a(paramx.m()));
  }
  
  public Object a(Object paramObject1, Object paramObject2, Object paramObject3) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    x x = (x)paramObject3;
    if (paramObject1 != null && paramObject2 != null) {
      paramObject3 = new b0();
      paramObject3.a((x)paramObject1);
      paramObject3.a((x)paramObject2);
      paramObject3.b(1);
      paramObject1 = paramObject3;
    } else if (paramObject1 == null) {
      if (paramObject2 != null) {
        paramObject1 = paramObject2;
      } else {
        paramObject1 = null;
      } 
    } 
    if (x != null) {
      paramObject2 = new b0();
      if (paramObject1 != null)
        paramObject2.a((x)paramObject1); 
      paramObject2.a(x);
      return paramObject2;
    } 
    return paramObject1;
  }
  
  public void a(ViewGroup paramViewGroup, Object paramObject) {
    z.a(paramViewGroup, (x)paramObject);
  }
  
  public void a(Object paramObject, Rect paramRect) {
    if (paramObject != null)
      ((x)paramObject).a(new d(this, paramRect)); 
  }
  
  public void a(Object paramObject, View paramView) {
    if (paramObject != null)
      ((x)paramObject).a(paramView); 
  }
  
  public void a(Object paramObject, View paramView, ArrayList<View> paramArrayList) {
    ((x)paramObject).a(new b(this, paramView, paramArrayList));
  }
  
  public void a(Object paramObject1, Object paramObject2, ArrayList<View> paramArrayList1, Object paramObject3, ArrayList<View> paramArrayList2, Object paramObject4, ArrayList<View> paramArrayList3) {
    ((x)paramObject1).a(new c(this, paramObject2, paramArrayList1, paramObject3, paramArrayList2, paramObject4, paramArrayList3));
  }
  
  public void a(Object paramObject, ArrayList<View> paramArrayList) {
    paramObject = paramObject;
    if (paramObject == null)
      return; 
    boolean bool = paramObject instanceof b0;
    int j = 0;
    int i = 0;
    if (bool) {
      paramObject = paramObject;
      j = paramObject.s();
      while (i < j) {
        a(paramObject.a(i), paramArrayList);
        i++;
      } 
    } else if (!a((x)paramObject) && a0.a(paramObject.n())) {
      int k = paramArrayList.size();
      for (i = j; i < k; i++)
        paramObject.a(paramArrayList.get(i)); 
    } 
  }
  
  public void a(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2) {
    paramObject = paramObject;
    boolean bool = paramObject instanceof b0;
    int j = 0;
    int i = 0;
    if (bool) {
      paramObject = paramObject;
      j = paramObject.s();
      while (i < j) {
        a(paramObject.a(i), paramArrayList1, paramArrayList2);
        i++;
      } 
    } else if (!a((x)paramObject)) {
      List<View> list = paramObject.n();
      if (list.size() == paramArrayList1.size() && list.containsAll(paramArrayList1)) {
        if (paramArrayList2 == null) {
          i = 0;
        } else {
          i = paramArrayList2.size();
        } 
        while (j < i) {
          paramObject.a(paramArrayList2.get(j));
          j++;
        } 
        for (i = paramArrayList1.size() - 1; i >= 0; i--)
          paramObject.d(paramArrayList1.get(i)); 
      } 
    } 
  }
  
  public boolean a(Object paramObject) {
    return paramObject instanceof x;
  }
  
  public Object b(Object paramObject) {
    return (paramObject != null) ? ((x)paramObject).clone() : null;
  }
  
  public Object b(Object paramObject1, Object paramObject2, Object paramObject3) {
    b0 b0 = new b0();
    if (paramObject1 != null)
      b0.a((x)paramObject1); 
    if (paramObject2 != null)
      b0.a((x)paramObject2); 
    if (paramObject3 != null)
      b0.a((x)paramObject3); 
    return b0;
  }
  
  public void b(Object paramObject, View paramView) {
    if (paramObject != null)
      ((x)paramObject).d(paramView); 
  }
  
  public void b(Object paramObject, View paramView, ArrayList<View> paramArrayList) {
    paramObject = paramObject;
    List<View> list = paramObject.n();
    list.clear();
    int j = paramArrayList.size();
    int i;
    for (i = 0; i < j; i++)
      a0.a(list, paramArrayList.get(i)); 
    list.add(paramView);
    paramArrayList.add(paramView);
    a(paramObject, paramArrayList);
  }
  
  public void b(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2) {
    paramObject = paramObject;
    if (paramObject != null) {
      paramObject.n().clear();
      paramObject.n().addAll(paramArrayList2);
      a(paramObject, paramArrayList1, paramArrayList2);
    } 
  }
  
  public Object c(Object paramObject) {
    if (paramObject == null)
      return null; 
    b0 b0 = new b0();
    b0.a((x)paramObject);
    return b0;
  }
  
  public void c(Object paramObject, View paramView) {
    if (paramView != null) {
      paramObject = paramObject;
      Rect rect = new Rect();
      a(paramView, rect);
      paramObject.a(new a(this, rect));
    } 
  }
  
  class a extends x.e {
    a(h this$0, Rect param1Rect) {}
    
    public Rect a(x param1x) {
      return this.a;
    }
  }
  
  class b implements x.f {
    b(h this$0, View param1View, ArrayList param1ArrayList) {}
    
    public void a(x param1x) {}
    
    public void b(x param1x) {}
    
    public void c(x param1x) {}
    
    public void d(x param1x) {}
    
    public void e(x param1x) {
      param1x.b(this);
      this.a.setVisibility(8);
      int j = this.b.size();
      for (int i = 0; i < j; i++)
        ((View)this.b.get(i)).setVisibility(0); 
    }
  }
  
  class c extends y {
    c(h this$0, Object param1Object1, ArrayList param1ArrayList1, Object param1Object2, ArrayList param1ArrayList2, Object param1Object3, ArrayList param1ArrayList3) {}
    
    public void a(x param1x) {
      Object object = this.a;
      if (object != null)
        this.g.a(object, this.b, (ArrayList<View>)null); 
      object = this.c;
      if (object != null)
        this.g.a(object, this.d, (ArrayList<View>)null); 
      object = this.e;
      if (object != null)
        this.g.a(object, this.f, (ArrayList<View>)null); 
    }
    
    public void e(x param1x) {
      param1x.b(this);
    }
  }
  
  class d extends x.e {
    d(h this$0, Rect param1Rect) {}
    
    public Rect a(x param1x) {
      Rect rect = this.a;
      return (rect == null || rect.isEmpty()) ? null : this.a;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */