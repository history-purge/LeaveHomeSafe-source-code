package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b.g.m.s;
import b.g.m.v;
import b.g.m.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
public abstract class a0 {
  static String a(Map<String, String> paramMap, String paramString) {
    for (Map.Entry<String, String> entry : paramMap.entrySet()) {
      if (paramString.equals(entry.getValue()))
        return (String)entry.getKey(); 
    } 
    return null;
  }
  
  protected static void a(List<View> paramList, View paramView) {
    int j = paramList.size();
    if (a(paramList, paramView, j))
      return; 
    paramList.add(paramView);
    for (int i = j; i < paramList.size(); i++) {
      paramView = paramList.get(i);
      if (paramView instanceof ViewGroup) {
        ViewGroup viewGroup = (ViewGroup)paramView;
        int m = viewGroup.getChildCount();
        for (int k = 0; k < m; k++) {
          View view = viewGroup.getChildAt(k);
          if (!a(paramList, view, j))
            paramList.add(view); 
        } 
      } 
    } 
  }
  
  protected static boolean a(List paramList) {
    return (paramList == null || paramList.isEmpty());
  }
  
  private static boolean a(List<View> paramList, View paramView, int paramInt) {
    for (int i = 0; i < paramInt; i++) {
      if (paramList.get(i) == paramView)
        return true; 
    } 
    return false;
  }
  
  public abstract Object a(Object paramObject1, Object paramObject2, Object paramObject3);
  
  ArrayList<String> a(ArrayList<View> paramArrayList) {
    ArrayList<String> arrayList = new ArrayList();
    int j = paramArrayList.size();
    for (int i = 0; i < j; i++) {
      View view = paramArrayList.get(i);
      arrayList.add(v.x(view));
      v.a(view, null);
    } 
    return arrayList;
  }
  
  protected void a(View paramView, Rect paramRect) {
    if (!v.G(paramView))
      return; 
    RectF rectF = new RectF();
    rectF.set(0.0F, 0.0F, paramView.getWidth(), paramView.getHeight());
    paramView.getMatrix().mapRect(rectF);
    rectF.offset(paramView.getLeft(), paramView.getTop());
    ViewParent viewParent = paramView.getParent();
    while (viewParent instanceof View) {
      View view = (View)viewParent;
      rectF.offset(-view.getScrollX(), -view.getScrollY());
      view.getMatrix().mapRect(rectF);
      rectF.offset(view.getLeft(), view.getTop());
      ViewParent viewParent1 = view.getParent();
    } 
    int[] arrayOfInt = new int[2];
    paramView.getRootView().getLocationOnScreen(arrayOfInt);
    rectF.offset(arrayOfInt[0], arrayOfInt[1]);
    paramRect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
  }
  
  void a(View paramView, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2, ArrayList<String> paramArrayList, Map<String, String> paramMap) {
    int j = paramArrayList2.size();
    ArrayList<String> arrayList = new ArrayList();
    int i;
    for (i = 0; i < j; i++) {
      View view = paramArrayList1.get(i);
      String str = v.x(view);
      arrayList.add(str);
      if (str != null) {
        v.a(view, null);
        String str1 = paramMap.get(str);
        int k;
        for (k = 0; k < j; k++) {
          if (str1.equals(paramArrayList.get(k))) {
            v.a(paramArrayList2.get(k), str);
            break;
          } 
        } 
      } 
    } 
    s.a(paramView, new a(this, j, paramArrayList2, paramArrayList, paramArrayList1, arrayList));
  }
  
  void a(View paramView, ArrayList<View> paramArrayList, Map<String, String> paramMap) {
    s.a(paramView, new b(this, paramArrayList, paramMap));
  }
  
  public abstract void a(ViewGroup paramViewGroup, Object paramObject);
  
  void a(ViewGroup paramViewGroup, ArrayList<View> paramArrayList, Map<String, String> paramMap) {
    s.a((View)paramViewGroup, new c(this, paramArrayList, paramMap));
  }
  
  public void a(Fragment paramFragment, Object paramObject, b.g.j.a parama, Runnable paramRunnable) {
    paramRunnable.run();
  }
  
  public abstract void a(Object paramObject, Rect paramRect);
  
  public abstract void a(Object paramObject, View paramView);
  
  public abstract void a(Object paramObject, View paramView, ArrayList<View> paramArrayList);
  
  public abstract void a(Object paramObject1, Object paramObject2, ArrayList<View> paramArrayList1, Object paramObject3, ArrayList<View> paramArrayList2, Object paramObject4, ArrayList<View> paramArrayList3);
  
  public abstract void a(Object paramObject, ArrayList<View> paramArrayList);
  
  public abstract void a(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2);
  
  void a(ArrayList<View> paramArrayList, View paramView) {
    ViewGroup viewGroup;
    if (paramView.getVisibility() == 0) {
      View view = paramView;
      if (paramView instanceof ViewGroup) {
        viewGroup = (ViewGroup)paramView;
        if (x.a(viewGroup)) {
          paramArrayList.add(viewGroup);
          return;
        } 
        int j = viewGroup.getChildCount();
        for (int i = 0; i < j; i++)
          a(paramArrayList, viewGroup.getChildAt(i)); 
        return;
      } 
    } else {
      return;
    } 
    paramArrayList.add(viewGroup);
  }
  
  void a(Map<String, View> paramMap, View paramView) {
    if (paramView.getVisibility() == 0) {
      String str = v.x(paramView);
      if (str != null)
        paramMap.put(str, paramView); 
      if (paramView instanceof ViewGroup) {
        ViewGroup viewGroup = (ViewGroup)paramView;
        int j = viewGroup.getChildCount();
        for (int i = 0; i < j; i++)
          a(paramMap, viewGroup.getChildAt(i)); 
      } 
    } 
  }
  
  public abstract boolean a(Object paramObject);
  
  public abstract Object b(Object paramObject);
  
  public abstract Object b(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public abstract void b(Object paramObject, View paramView);
  
  public abstract void b(Object paramObject, View paramView, ArrayList<View> paramArrayList);
  
  public abstract void b(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2);
  
  public abstract Object c(Object paramObject);
  
  public abstract void c(Object paramObject, View paramView);
  
  class a implements Runnable {
    a(a0 this$0, int param1Int, ArrayList param1ArrayList1, ArrayList param1ArrayList2, ArrayList param1ArrayList3, ArrayList param1ArrayList4) {}
    
    public void run() {
      for (int i = 0; i < this.c; i++) {
        v.a(this.d.get(i), this.e.get(i));
        v.a(this.f.get(i), this.g.get(i));
      } 
    }
  }
  
  class b implements Runnable {
    b(a0 this$0, ArrayList param1ArrayList, Map param1Map) {}
    
    public void run() {
      int j = this.c.size();
      for (int i = 0; i < j; i++) {
        View view = this.c.get(i);
        String str = v.x(view);
        if (str != null)
          v.a(view, a0.a(this.d, str)); 
      } 
    }
  }
  
  class c implements Runnable {
    c(a0 this$0, ArrayList param1ArrayList, Map param1Map) {}
    
    public void run() {
      int j = this.c.size();
      for (int i = 0; i < j; i++) {
        View view = this.c.get(i);
        String str = v.x(view);
        v.a(view, (String)this.d.get(str));
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */