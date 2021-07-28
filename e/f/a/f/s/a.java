package e.f.a.f.s;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

public final class a {
  public static PorterDuffColorFilter a(Drawable paramDrawable, ColorStateList paramColorStateList, PorterDuff.Mode paramMode) {
    return (paramColorStateList == null || paramMode == null) ? null : new PorterDuffColorFilter(paramColorStateList.getColorForState(paramDrawable.getState(), 0), paramMode);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/s/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */