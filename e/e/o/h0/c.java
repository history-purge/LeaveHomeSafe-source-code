package e.e.o.h0;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;

public class c<T extends View, U extends b<T> & d<T>> extends a<T, U> {
  public c(U paramU) {
    super((b)paramU);
  }
  
  public void a(T paramT, String paramString, Object paramObject) {
    byte b;
    switch (paramString.hashCode()) {
      default:
        b = -1;
        break;
      case 1857208703:
        if (paramString.equals("drawerLockMode")) {
          b = 4;
          break;
        } 
      case 695891258:
        if (paramString.equals("drawerPosition")) {
          b = 2;
          break;
        } 
      case 268251989:
        if (paramString.equals("drawerWidth")) {
          b = 3;
          break;
        } 
      case -764307226:
        if (paramString.equals("keyboardDismissMode")) {
          b = 0;
          break;
        } 
      case -1233873500:
        if (paramString.equals("drawerBackgroundColor")) {
          b = 1;
          break;
        } 
      case -2082382380:
        if (paramString.equals("statusBarBackgroundColor")) {
          b = 5;
          break;
        } 
    } 
    if (b != 0) {
      if (b != 1) {
        if (b != 2) {
          Float float_;
          if (b != 3) {
            if (b != 4) {
              if (b != 5) {
                super.a((View)paramT, paramString, paramObject);
                return;
              } 
              ((d<T>)this.a).setStatusBarBackgroundColor(paramT, ColorPropConverter.getColor(paramObject, paramT.getContext()));
              return;
            } 
            ((d<T>)this.a).setDrawerLockMode(paramT, (String)paramObject);
            return;
          } 
          d<T> d = (d)this.a;
          if (paramObject == null) {
            paramString = null;
          } else {
            float_ = Float.valueOf(((Double)paramObject).floatValue());
          } 
          d.setDrawerWidth(paramT, float_);
          return;
        } 
        ((d<T>)this.a).setDrawerPosition(paramT, (String)paramObject);
        return;
      } 
      ((d<T>)this.a).setDrawerBackgroundColor(paramT, ColorPropConverter.getColor(paramObject, paramT.getContext()));
      return;
    } 
    ((d<T>)this.a).setKeyboardDismissMode(paramT, (String)paramObject);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/h0/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */