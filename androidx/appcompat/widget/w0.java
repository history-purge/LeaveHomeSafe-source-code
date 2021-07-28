package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class w0 extends n0 {
  private final WeakReference<Context> b;
  
  public w0(Context paramContext, Resources paramResources) {
    super(paramResources);
    this.b = new WeakReference<Context>(paramContext);
  }
  
  public Drawable getDrawable(int paramInt) {
    Drawable drawable = super.getDrawable(paramInt);
    Context context = this.b.get();
    if (drawable != null && context != null)
      m0.a().a(context, paramInt, drawable); 
    return drawable;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/w0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */