package e.e.o;

import android.app.Application;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.f;
import com.facebook.react.uimanager.p0;
import e.e.m.a.a;
import java.util.Iterator;
import java.util.List;

public abstract class u {
  private final Application a;
  
  private r b;
  
  protected u(Application paramApplication) {
    this.a = paramApplication;
  }
  
  protected r a() {
    ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
    s s = r.j();
    s.a(this.a);
    s.c(e());
    s.a(k());
    s.a(i());
    s.a(f());
    s.a(j());
    s.a(d());
    s.a(LifecycleState.c);
    Iterator<v> iterator = g().iterator();
    while (iterator.hasNext())
      s.a(iterator.next()); 
    String str = c();
    if (str != null) {
      s.b(str);
    } else {
      str = b();
      a.a(str);
      s.a(str);
    } 
    r r1 = s.a();
    ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
    return r1;
  }
  
  protected String b() {
    return "index.android.bundle";
  }
  
  protected String c() {
    return null;
  }
  
  protected JSIModulePackage d() {
    return null;
  }
  
  protected abstract String e();
  
  protected JavaScriptExecutorFactory f() {
    return null;
  }
  
  protected abstract List<v> g();
  
  public r h() {
    if (this.b == null) {
      ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
      this.b = a();
      ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
    } 
    return this.b;
  }
  
  protected f i() {
    return null;
  }
  
  protected p0 j() {
    return new p0();
  }
  
  public abstract boolean k();
  
  public boolean l() {
    return (this.b != null);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */