package b.g.m.e0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

public class d {
  private final Object a;
  
  public d() {
    Object object;
    int i = Build.VERSION.SDK_INT;
    if (i >= 19) {
      object = new b(this);
    } else if (i >= 16) {
      object = new a(this);
    } else {
      object = null;
    } 
    this.a = object;
  }
  
  public d(Object paramObject) {
    this.a = paramObject;
  }
  
  public c a(int paramInt) {
    return null;
  }
  
  public Object a() {
    return this.a;
  }
  
  public List<c> a(String paramString, int paramInt) {
    return null;
  }
  
  public boolean a(int paramInt1, int paramInt2, Bundle paramBundle) {
    return false;
  }
  
  public c b(int paramInt) {
    return null;
  }
  
  static class a extends AccessibilityNodeProvider {
    final d a;
    
    a(d param1d) {
      this.a = param1d;
    }
    
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int param1Int) {
      c c = this.a.a(param1Int);
      return (c == null) ? null : c.x();
    }
    
    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String param1String, int param1Int) {
      List<c> list = this.a.a(param1String, param1Int);
      if (list == null)
        return null; 
      ArrayList<AccessibilityNodeInfo> arrayList = new ArrayList();
      int i = list.size();
      for (param1Int = 0; param1Int < i; param1Int++)
        arrayList.add(((c)list.get(param1Int)).x()); 
      return arrayList;
    }
    
    public boolean performAction(int param1Int1, int param1Int2, Bundle param1Bundle) {
      return this.a.a(param1Int1, param1Int2, param1Bundle);
    }
  }
  
  static class b extends a {
    b(d param1d) {
      super(param1d);
    }
    
    public AccessibilityNodeInfo findFocus(int param1Int) {
      c c = this.a.b(param1Int);
      return (c == null) ? null : c.x();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/m/e0/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */