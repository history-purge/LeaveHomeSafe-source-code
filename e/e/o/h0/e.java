package e.e.o.h0;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;

public class e<T extends View, U extends b<T> & f<T>> extends a<T, U> {
  public e(U paramU) {
    super((b)paramU);
  }
  
  public void a(T paramT, String paramString, Object paramObject) {
    Integer integer;
    int i = paramString.hashCode();
    boolean bool = false;
    boolean bool1 = true;
    switch (i) {
      default:
        i = -1;
        break;
      case 1191572123:
        if (paramString.equals("selected")) {
          i = 4;
          break;
        } 
      case 100526016:
        if (paramString.equals("items")) {
          i = 2;
          break;
        } 
      case 94842723:
        if (paramString.equals("color")) {
          i = 0;
          break;
        } 
      case -979805852:
        if (paramString.equals("prompt")) {
          i = 3;
          break;
        } 
      case -1609594047:
        if (paramString.equals("enabled")) {
          i = 1;
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
            f<T> f3 = (f)this.a;
            if (paramObject == null) {
              i = bool;
            } else {
              i = ((Double)paramObject).intValue();
            } 
            f3.setSelected(paramT, i);
            return;
          } 
          f<T> f2 = (f)this.a;
          if (paramObject == null) {
            paramString = "";
          } else {
            paramString = (String)paramObject;
          } 
          f2.setPrompt(paramT, paramString);
          return;
        } 
        ((f<T>)this.a).setItems(paramT, (ReadableArray)paramObject);
        return;
      } 
      f<T> f1 = (f)this.a;
      if (paramObject != null)
        bool1 = ((Boolean)paramObject).booleanValue(); 
      f1.setEnabled(paramT, bool1);
      return;
    } 
    f<T> f = (f)this.a;
    if (paramObject == null) {
      paramString = null;
    } else {
      integer = Integer.valueOf(((Double)paramObject).intValue());
    } 
    f.setColor(paramT, integer);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/h0/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */