package e.e.o.h0;

import android.view.View;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;

public class m<T extends View, U extends b<T> & n<T>> extends a<T, U> {
  public m(U paramU) {
    super((b)paramU);
  }
  
  public void a(T paramT, String paramString, Object paramObject) {
    int i = paramString.hashCode();
    boolean bool = true;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    switch (i) {
      default:
        i = -1;
        break;
      case 1919780198:
        if (paramString.equals("peekEnabled")) {
          i = 2;
          break;
        } 
      case 1233251315:
        if (paramString.equals("initialPage")) {
          i = 0;
          break;
        } 
      case 1097821469:
        if (paramString.equals("pageMargin")) {
          i = 1;
          break;
        } 
      case -764307226:
        if (paramString.equals("keyboardDismissMode")) {
          i = 3;
          break;
        } 
      case -1151046732:
        if (paramString.equals("scrollEnabled")) {
          i = 4;
          break;
        } 
    } 
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              super.a((View)paramT, paramString, paramObject);
              return;
            } 
            n<T> n3 = (n)this.a;
            if (paramObject != null)
              bool = ((Boolean)paramObject).booleanValue(); 
            n3.setScrollEnabled(paramT, bool);
            return;
          } 
          ((n<T>)this.a).setKeyboardDismissMode(paramT, (String)paramObject);
          return;
        } 
        n<T> n2 = (n)this.a;
        if (paramObject == null) {
          bool = bool3;
        } else {
          bool = ((Boolean)paramObject).booleanValue();
        } 
        n2.setPeekEnabled(paramT, bool);
        return;
      } 
      n<T> n1 = (n)this.a;
      if (paramObject == null) {
        i = bool1;
      } else {
        i = ((Double)paramObject).intValue();
      } 
      n1.setPageMargin(paramT, i);
      return;
    } 
    n<T> n = (n)this.a;
    if (paramObject == null) {
      i = bool2;
    } else {
      i = ((Double)paramObject).intValue();
    } 
    n.setInitialPage(paramT, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/h0/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */