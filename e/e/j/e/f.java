package e.e.j.e;

import android.graphics.drawable.Drawable;

public class f {
  public static int a(int paramInt) {
    paramInt >>>= 24;
    return (paramInt == 255) ? -1 : ((paramInt == 0) ? -2 : -3);
  }
  
  public static int a(int paramInt1, int paramInt2) {
    return (paramInt2 == 255) ? paramInt1 : ((paramInt2 == 0) ? (paramInt1 & 0xFFFFFF) : (paramInt1 & 0xFFFFFF | (paramInt1 >>> 24) * (paramInt2 + (paramInt2 >> 7)) >> 8 << 24));
  }
  
  public static void a(Drawable paramDrawable, Drawable.Callback paramCallback, t paramt) {
    if (paramDrawable != null) {
      paramDrawable.setCallback(paramCallback);
      if (paramDrawable instanceof s)
        ((s)paramDrawable).a(paramt); 
    } 
  }
  
  public static void a(Drawable paramDrawable1, Drawable paramDrawable2) {
    if (paramDrawable2 != null && paramDrawable1 != null) {
      if (paramDrawable1 == paramDrawable2)
        return; 
      paramDrawable1.setBounds(paramDrawable2.getBounds());
      paramDrawable1.setChangingConfigurations(paramDrawable2.getChangingConfigurations());
      paramDrawable1.setLevel(paramDrawable2.getLevel());
      paramDrawable1.setVisible(paramDrawable2.isVisible(), false);
      paramDrawable1.setState(paramDrawable2.getState());
    } 
  }
  
  public static void a(Drawable paramDrawable, e parame) {
    if (paramDrawable != null) {
      if (parame == null)
        return; 
      parame.a(paramDrawable);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */