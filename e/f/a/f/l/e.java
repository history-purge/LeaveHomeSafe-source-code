package e.f.a.f.l;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

public class e extends Property<Drawable, Integer> {
  public static final Property<Drawable, Integer> b = new e();
  
  private final WeakHashMap<Drawable, Integer> a = new WeakHashMap<Drawable, Integer>();
  
  private e() {
    super(Integer.class, "drawableAlphaCompat");
  }
  
  public Integer a(Drawable paramDrawable) {
    return (Build.VERSION.SDK_INT >= 19) ? Integer.valueOf(paramDrawable.getAlpha()) : (this.a.containsKey(paramDrawable) ? this.a.get(paramDrawable) : Integer.valueOf(255));
  }
  
  public void a(Drawable paramDrawable, Integer paramInteger) {
    if (Build.VERSION.SDK_INT < 19)
      this.a.put(paramDrawable, paramInteger); 
    paramDrawable.setAlpha(paramInteger.intValue());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/l/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */