package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class u0 extends ContextWrapper {
  private static final Object c = new Object();
  
  private static ArrayList<WeakReference<u0>> d;
  
  private final Resources a;
  
  private final Resources.Theme b;
  
  private u0(Context paramContext) {
    super(paramContext);
    if (c1.b()) {
      this.a = new c1((Context)this, paramContext.getResources());
      this.b = this.a.newTheme();
      this.b.setTo(paramContext.getTheme());
      return;
    } 
    this.a = new w0((Context)this, paramContext.getResources());
    this.b = null;
  }
  
  private static boolean a(Context paramContext) {
    boolean bool1 = paramContext instanceof u0;
    boolean bool = false;
    null = bool;
    if (!bool1) {
      null = bool;
      if (!(paramContext.getResources() instanceof w0)) {
        if (paramContext.getResources() instanceof c1)
          return false; 
        if (Build.VERSION.SDK_INT >= 21) {
          null = bool;
          return c1.b() ? true : null;
        } 
      } else {
        return null;
      } 
    } else {
      return null;
    } 
    return true;
  }
  
  public static Context b(Context paramContext) {
    if (a(paramContext))
      synchronized (c) {
        if (d == null) {
          d = new ArrayList<WeakReference<u0>>();
        } else {
          for (int i = d.size() - 1;; i--) {
            if (i >= 0) {
              WeakReference weakReference = d.get(i);
              if (weakReference == null || weakReference.get() == null)
                d.remove(i); 
            } else {
              for (i = d.size() - 1;; i--) {
                if (i >= 0) {
                  WeakReference<u0> weakReference = d.get(i);
                  if (weakReference != null) {
                    u0 u02 = weakReference.get();
                  } else {
                    weakReference = null;
                  } 
                  if (weakReference != null && weakReference.getBaseContext() == paramContext)
                    return (Context)weakReference; 
                } else {
                  u01 = new u0(paramContext);
                  d.add(new WeakReference<u0>(u01));
                  return (Context)u01;
                } 
              } 
            } 
          } 
          i--;
        } 
        u0 u01 = new u0((Context)u01);
        d.add(new WeakReference<u0>(u01));
        return (Context)u01;
      }  
    return paramContext;
  }
  
  public AssetManager getAssets() {
    return this.a.getAssets();
  }
  
  public Resources getResources() {
    return this.a;
  }
  
  public Resources.Theme getTheme() {
    Resources.Theme theme2 = this.b;
    Resources.Theme theme1 = theme2;
    if (theme2 == null)
      theme1 = super.getTheme(); 
    return theme1;
  }
  
  public void setTheme(int paramInt) {
    Resources.Theme theme = this.b;
    if (theme == null) {
      super.setTheme(paramInt);
      return;
    } 
    theme.applyStyle(paramInt, true);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/u0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */