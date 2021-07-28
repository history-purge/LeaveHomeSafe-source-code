package e.f.a.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.util.Size;

@TargetApi(23)
class d extends c {
  d(f.a parama, i parami, Context paramContext, Handler paramHandler) {
    super(parama, parami, paramContext, paramHandler);
  }
  
  protected void a(k paramk, StreamConfigurationMap paramStreamConfigurationMap) {
    if (paramStreamConfigurationMap.getHighResolutionOutputSizes(256) != null)
      for (Size size : paramStreamConfigurationMap.getHighResolutionOutputSizes(256))
        paramk.a(new j(size.getWidth(), size.getHeight()));  
    if (paramk.b())
      super.a(paramk, paramStreamConfigurationMap); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */