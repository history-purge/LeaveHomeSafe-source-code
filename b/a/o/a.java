package b.a.o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import b.a.b;
import b.a.d;
import b.a.j;

public class a {
  private Context a;
  
  private a(Context paramContext) {
    this.a = paramContext;
  }
  
  public static a a(Context paramContext) {
    return new a(paramContext);
  }
  
  public boolean a() {
    return ((this.a.getApplicationInfo()).targetSdkVersion < 14);
  }
  
  public int b() {
    return (this.a.getResources().getDisplayMetrics()).widthPixels / 2;
  }
  
  public int c() {
    Configuration configuration = this.a.getResources().getConfiguration();
    int i = configuration.screenWidthDp;
    int j = configuration.screenHeightDp;
    return (configuration.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && j > 720) || (i > 720 && j > 960)) ? 5 : ((i >= 500 || (i > 640 && j > 480) || (i > 480 && j > 640)) ? 4 : ((i >= 360) ? 3 : 2));
  }
  
  public int d() {
    return this.a.getResources().getDimensionPixelSize(d.abc_action_bar_stacked_tab_max_width);
  }
  
  public int e() {
    TypedArray typedArray = this.a.obtainStyledAttributes(null, j.ActionBar, b.a.a.actionBarStyle, 0);
    int j = typedArray.getLayoutDimension(j.ActionBar_height, 0);
    Resources resources = this.a.getResources();
    int i = j;
    if (!f())
      i = Math.min(j, resources.getDimensionPixelSize(d.abc_action_bar_stacked_max_height)); 
    typedArray.recycle();
    return i;
  }
  
  public boolean f() {
    return this.a.getResources().getBoolean(b.abc_action_bar_embed_tabs);
  }
  
  public boolean g() {
    return (Build.VERSION.SDK_INT >= 19) ? true : (ViewConfiguration.get(this.a).hasPermanentMenuKey() ^ true);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/a/o/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */