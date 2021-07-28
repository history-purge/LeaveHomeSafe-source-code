package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

public class c1 extends Resources {
  private static boolean b = false;
  
  private final WeakReference<Context> a;
  
  public c1(Context paramContext, Resources paramResources) {
    super(paramResources.getAssets(), paramResources.getDisplayMetrics(), paramResources.getConfiguration());
    this.a = new WeakReference<Context>(paramContext);
  }
  
  public static boolean a() {
    return b;
  }
  
  public static boolean b() {
    return (a() && Build.VERSION.SDK_INT <= 20);
  }
  
  final Drawable a(int paramInt) {
    return super.getDrawable(paramInt);
  }
  
  public Drawable getDrawable(int paramInt) {
    Context context = this.a.get();
    return (context != null) ? m0.a().a(context, this, paramInt) : super.getDrawable(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/c1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */