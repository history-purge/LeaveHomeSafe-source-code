package b.g.m;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import b.g.c;
import b.g.m.e0.c;
import b.g.m.e0.d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class a {
  private static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
  
  private final View.AccessibilityDelegate a;
  
  private final View.AccessibilityDelegate b;
  
  public a() {
    this(c);
  }
  
  public a(View.AccessibilityDelegate paramAccessibilityDelegate) {
    this.a = paramAccessibilityDelegate;
    this.b = new a(this);
  }
  
  private boolean a(int paramInt, View paramView) {
    SparseArray sparseArray = (SparseArray)paramView.getTag(c.tag_accessibility_clickable_spans);
    if (sparseArray != null) {
      WeakReference<ClickableSpan> weakReference = (WeakReference)sparseArray.get(paramInt);
      if (weakReference != null) {
        ClickableSpan clickableSpan = weakReference.get();
        if (a(clickableSpan, paramView)) {
          clickableSpan.onClick(paramView);
          return true;
        } 
      } 
    } 
    return false;
  }
  
  private boolean a(ClickableSpan paramClickableSpan, View paramView) {
    if (paramClickableSpan != null) {
      ClickableSpan[] arrayOfClickableSpan = c.i(paramView.createAccessibilityNodeInfo().getText());
      for (int i = 0; arrayOfClickableSpan != null && i < arrayOfClickableSpan.length; i++) {
        if (paramClickableSpan.equals(arrayOfClickableSpan[i]))
          return true; 
      } 
    } 
    return false;
  }
  
  static List<c.a> b(View paramView) {
    List<?> list2 = (List)paramView.getTag(c.tag_accessibility_actions);
    List<?> list1 = list2;
    if (list2 == null)
      list1 = Collections.emptyList(); 
    return (List)list1;
  }
  
  View.AccessibilityDelegate a() {
    return this.b;
  }
  
  public d a(View paramView) {
    if (Build.VERSION.SDK_INT >= 16) {
      AccessibilityNodeProvider accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(paramView);
      if (accessibilityNodeProvider != null)
        return new d(accessibilityNodeProvider); 
    } 
    return null;
  }
  
  public void a(View paramView, int paramInt) {
    this.a.sendAccessibilityEvent(paramView, paramInt);
  }
  
  public void a(View paramView, c paramc) {
    this.a.onInitializeAccessibilityNodeInfo(paramView, paramc.x());
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle) {
    List<c.a> list = b(paramView);
    boolean bool2 = false;
    int i = 0;
    while (true) {
      bool1 = bool2;
      if (i < list.size()) {
        c.a a1 = list.get(i);
        if (a1.a() == paramInt) {
          bool1 = a1.a(paramView, paramBundle);
          break;
        } 
        i++;
        continue;
      } 
      break;
    } 
    bool2 = bool1;
    if (!bool1) {
      bool2 = bool1;
      if (Build.VERSION.SDK_INT >= 16)
        bool2 = this.a.performAccessibilityAction(paramView, paramInt, paramBundle); 
    } 
    boolean bool1 = bool2;
    if (!bool2) {
      bool1 = bool2;
      if (paramInt == c.accessibility_action_clickable_span)
        bool1 = a(paramBundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), paramView); 
    } 
    return bool1;
  }
  
  public boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    return this.a.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent) {
    return this.a.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public void b(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
  
  static final class a extends View.AccessibilityDelegate {
    final a a;
    
    a(a param1a) {
      this.a = param1a;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      return this.a.a(param1View, param1AccessibilityEvent);
    }
    
    public AccessibilityNodeProvider getAccessibilityNodeProvider(View param1View) {
      d d = this.a.a(param1View);
      return (d != null) ? (AccessibilityNodeProvider)d.a() : null;
    }
    
    public void onInitializeAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      this.a.b(param1View, param1AccessibilityEvent);
    }
    
    public void onInitializeAccessibilityNodeInfo(View param1View, AccessibilityNodeInfo param1AccessibilityNodeInfo) {
      c c = c.a(param1AccessibilityNodeInfo);
      c.k(v.L(param1View));
      c.i(v.F(param1View));
      c.f(v.f(param1View));
      this.a.a(param1View, c);
      c.a(param1AccessibilityNodeInfo.getText(), param1View);
      List<c.a> list = a.b(param1View);
      for (int i = 0; i < list.size(); i++)
        c.a(list.get(i)); 
    }
    
    public void onPopulateAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      this.a.c(param1View, param1AccessibilityEvent);
    }
    
    public boolean onRequestSendAccessibilityEvent(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) {
      return this.a.a(param1ViewGroup, param1View, param1AccessibilityEvent);
    }
    
    public boolean performAccessibilityAction(View param1View, int param1Int, Bundle param1Bundle) {
      return this.a.a(param1View, param1Int, param1Bundle);
    }
    
    public void sendAccessibilityEvent(View param1View, int param1Int) {
      this.a.a(param1View, param1Int);
    }
    
    public void sendAccessibilityEventUnchecked(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      this.a.d(param1View, param1AccessibilityEvent);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/m/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */