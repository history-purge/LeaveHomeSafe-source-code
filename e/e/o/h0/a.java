package e.e.o.h0;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;

public class a<T extends View, U extends b<T> & b<T>> extends a<T, U> {
  public a(U paramU) {
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
      case 1287124693:
        if (paramString.equals("backgroundColor")) {
          i = 1;
          break;
        } 
      case 1191572123:
        if (paramString.equals("selected")) {
          i = 5;
          break;
        } 
      case 100526016:
        if (paramString.equals("items")) {
          i = 3;
          break;
        } 
      case 94842723:
        if (paramString.equals("color")) {
          i = 0;
          break;
        } 
      case -979805852:
        if (paramString.equals("prompt")) {
          i = 4;
          break;
        } 
      case -1609594047:
        if (paramString.equals("enabled")) {
          i = 2;
          break;
        } 
    } 
    b<T> b2 = null;
    b<T> b1 = null;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i != 5) {
                super.a((View)paramT, paramString, paramObject);
                return;
              } 
              b<T> b3 = (b)this.a;
              if (paramObject == null) {
                i = bool;
              } else {
                i = ((Double)paramObject).intValue();
              } 
              b3.setSelected(paramT, i);
              return;
            } 
            b1 = (b)this.a;
            if (paramObject == null) {
              paramString = "";
            } else {
              paramString = (String)paramObject;
            } 
            b1.setPrompt(paramT, paramString);
            return;
          } 
          ((b<T>)this.a).setItems(paramT, (ReadableArray)paramObject);
          return;
        } 
        b<T> b = (b)this.a;
        if (paramObject != null)
          bool1 = ((Boolean)paramObject).booleanValue(); 
        b.setEnabled(paramT, bool1);
        return;
      } 
      b2 = (b)this.a;
      if (paramObject == null) {
        b<T> b = b1;
      } else {
        integer = Integer.valueOf(((Double)paramObject).intValue());
      } 
      b2.setBackgroundColor(paramT, integer);
      return;
    } 
    b1 = (b<T>)this.a;
    if (paramObject == null) {
      b<T> b = b2;
    } else {
      integer = Integer.valueOf(((Double)paramObject).intValue());
    } 
    b1.setColor(paramT, integer);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/h0/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */