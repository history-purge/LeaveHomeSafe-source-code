package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

class z extends a0 {
  private static boolean a(Transition paramTransition) {
    return (!a0.a(paramTransition.getTargetIds()) || !a0.a(paramTransition.getTargetNames()) || !a0.a(paramTransition.getTargetTypes()));
  }
  
  public Object a(Object paramObject1, Object paramObject2, Object paramObject3) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    paramObject3 = paramObject3;
    if (paramObject1 != null && paramObject2 != null) {
      paramObject1 = (new TransitionSet()).addTransition((Transition)paramObject1).addTransition((Transition)paramObject2).setOrdering(1);
    } else if (paramObject1 == null) {
      if (paramObject2 != null) {
        paramObject1 = paramObject2;
      } else {
        paramObject1 = null;
      } 
    } 
    if (paramObject3 != null) {
      paramObject2 = new TransitionSet();
      if (paramObject1 != null)
        paramObject2.addTransition((Transition)paramObject1); 
      paramObject2.addTransition((Transition)paramObject3);
      return paramObject2;
    } 
    return paramObject1;
  }
  
  public void a(ViewGroup paramViewGroup, Object paramObject) {
    TransitionManager.beginDelayedTransition(paramViewGroup, (Transition)paramObject);
  }
  
  public void a(Fragment paramFragment, Object paramObject, b.g.j.a parama, Runnable paramRunnable) {
    ((Transition)paramObject).addListener(new d(this, paramRunnable));
  }
  
  public void a(Object paramObject, Rect paramRect) {
    if (paramObject != null)
      ((Transition)paramObject).setEpicenterCallback(new e(this, paramRect)); 
  }
  
  public void a(Object paramObject, View paramView) {
    if (paramObject != null)
      ((Transition)paramObject).addTarget(paramView); 
  }
  
  public void a(Object paramObject, View paramView, ArrayList<View> paramArrayList) {
    ((Transition)paramObject).addListener(new b(this, paramView, paramArrayList));
  }
  
  public void a(Object paramObject1, Object paramObject2, ArrayList<View> paramArrayList1, Object paramObject3, ArrayList<View> paramArrayList2, Object paramObject4, ArrayList<View> paramArrayList3) {
    ((Transition)paramObject1).addListener(new c(this, paramObject2, paramArrayList1, paramObject3, paramArrayList2, paramObject4, paramArrayList3));
  }
  
  public void a(Object paramObject, ArrayList<View> paramArrayList) {
    paramObject = paramObject;
    if (paramObject == null)
      return; 
    boolean bool = paramObject instanceof TransitionSet;
    int j = 0;
    int i = 0;
    if (bool) {
      paramObject = paramObject;
      j = paramObject.getTransitionCount();
      while (i < j) {
        a(paramObject.getTransitionAt(i), paramArrayList);
        i++;
      } 
    } else if (!a((Transition)paramObject) && a0.a(paramObject.getTargets())) {
      int k = paramArrayList.size();
      for (i = j; i < k; i++)
        paramObject.addTarget(paramArrayList.get(i)); 
    } 
  }
  
  public void a(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2) {
    paramObject = paramObject;
    boolean bool = paramObject instanceof TransitionSet;
    int j = 0;
    int i = 0;
    if (bool) {
      paramObject = paramObject;
      j = paramObject.getTransitionCount();
      while (i < j) {
        a(paramObject.getTransitionAt(i), paramArrayList1, paramArrayList2);
        i++;
      } 
    } else if (!a((Transition)paramObject)) {
      List list = paramObject.getTargets();
      if (list != null && list.size() == paramArrayList1.size() && list.containsAll(paramArrayList1)) {
        if (paramArrayList2 == null) {
          i = 0;
        } else {
          i = paramArrayList2.size();
        } 
        while (j < i) {
          paramObject.addTarget(paramArrayList2.get(j));
          j++;
        } 
        for (i = paramArrayList1.size() - 1; i >= 0; i--)
          paramObject.removeTarget(paramArrayList1.get(i)); 
      } 
    } 
  }
  
  public boolean a(Object paramObject) {
    return paramObject instanceof Transition;
  }
  
  public Object b(Object paramObject) {
    return (paramObject != null) ? ((Transition)paramObject).clone() : null;
  }
  
  public Object b(Object paramObject1, Object paramObject2, Object paramObject3) {
    TransitionSet transitionSet = new TransitionSet();
    if (paramObject1 != null)
      transitionSet.addTransition((Transition)paramObject1); 
    if (paramObject2 != null)
      transitionSet.addTransition((Transition)paramObject2); 
    if (paramObject3 != null)
      transitionSet.addTransition((Transition)paramObject3); 
    return transitionSet;
  }
  
  public void b(Object paramObject, View paramView) {
    if (paramObject != null)
      ((Transition)paramObject).removeTarget(paramView); 
  }
  
  public void b(Object paramObject, View paramView, ArrayList<View> paramArrayList) {
    paramObject = paramObject;
    List<View> list = paramObject.getTargets();
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
      paramObject.getTargets().clear();
      paramObject.getTargets().addAll(paramArrayList2);
      a(paramObject, paramArrayList1, paramArrayList2);
    } 
  }
  
  public Object c(Object paramObject) {
    if (paramObject == null)
      return null; 
    TransitionSet transitionSet = new TransitionSet();
    transitionSet.addTransition((Transition)paramObject);
    return transitionSet;
  }
  
  public void c(Object paramObject, View paramView) {
    if (paramView != null) {
      paramObject = paramObject;
      Rect rect = new Rect();
      a(paramView, rect);
      paramObject.setEpicenterCallback(new a(this, rect));
    } 
  }
  
  class a extends Transition.EpicenterCallback {
    a(z this$0, Rect param1Rect) {}
    
    public Rect onGetEpicenter(Transition param1Transition) {
      return this.a;
    }
  }
  
  class b implements Transition.TransitionListener {
    b(z this$0, View param1View, ArrayList param1ArrayList) {}
    
    public void onTransitionCancel(Transition param1Transition) {}
    
    public void onTransitionEnd(Transition param1Transition) {
      param1Transition.removeListener(this);
      this.a.setVisibility(8);
      int j = this.b.size();
      for (int i = 0; i < j; i++)
        ((View)this.b.get(i)).setVisibility(0); 
    }
    
    public void onTransitionPause(Transition param1Transition) {}
    
    public void onTransitionResume(Transition param1Transition) {}
    
    public void onTransitionStart(Transition param1Transition) {
      param1Transition.removeListener(this);
      param1Transition.addListener(this);
    }
  }
  
  class c implements Transition.TransitionListener {
    c(z this$0, Object param1Object1, ArrayList param1ArrayList1, Object param1Object2, ArrayList param1ArrayList2, Object param1Object3, ArrayList param1ArrayList3) {}
    
    public void onTransitionCancel(Transition param1Transition) {}
    
    public void onTransitionEnd(Transition param1Transition) {
      param1Transition.removeListener(this);
    }
    
    public void onTransitionPause(Transition param1Transition) {}
    
    public void onTransitionResume(Transition param1Transition) {}
    
    public void onTransitionStart(Transition param1Transition) {
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
  }
  
  class d implements Transition.TransitionListener {
    d(z this$0, Runnable param1Runnable) {}
    
    public void onTransitionCancel(Transition param1Transition) {}
    
    public void onTransitionEnd(Transition param1Transition) {
      this.a.run();
    }
    
    public void onTransitionPause(Transition param1Transition) {}
    
    public void onTransitionResume(Transition param1Transition) {}
    
    public void onTransitionStart(Transition param1Transition) {}
  }
  
  class e extends Transition.EpicenterCallback {
    e(z this$0, Rect param1Rect) {}
    
    public Rect onGetEpicenter(Transition param1Transition) {
      Rect rect = this.a;
      return (rect == null || rect.isEmpty()) ? null : this.a;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */