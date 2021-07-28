package com.facebook.react.views.art;

import android.content.Context;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.k0;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.p;
import e.e.o.d0.a.a;

@a(name = "ARTSurfaceView")
public class ARTSurfaceViewManager extends BaseViewManager<c, d> {
  private static final m MEASURE_FUNCTION = new a();
  
  public static final String REACT_CLASS = "ARTSurfaceView";
  
  public d createShadowNodeInstance() {
    d d = new d();
    d.a(MEASURE_FUNCTION);
    return d;
  }
  
  protected c createViewInstance(k0 paramk0) {
    return new c((Context)paramk0);
  }
  
  public String getName() {
    return "ARTSurfaceView";
  }
  
  public Class<d> getShadowNodeClass() {
    return d.class;
  }
  
  public void setBackgroundColor(c paramc, int paramInt) {}
  
  public void updateExtraData(c paramc, Object paramObject) {
    ((d)paramObject).a(paramc);
  }
  
  static final class a implements m {
    public long a(p param1p, float param1Float1, n param1n1, float param1Float2, n param1n2) {
      throw new IllegalStateException("SurfaceView should have explicit width and height set");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/art/ARTSurfaceViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */