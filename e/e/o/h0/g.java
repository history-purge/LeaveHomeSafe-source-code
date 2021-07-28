package e.e.o.h0;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;

public class g<T extends View, U extends b<T> & h<T>> extends a<T, U> {
  public g(U paramU) {
    super((b)paramU);
  }
  
  public void a(T paramT, String paramString, Object paramObject) {
    h<T> h1;
    String str;
    double d;
    int i = paramString.hashCode();
    boolean bool1 = false;
    boolean bool2 = true;
    switch (i) {
      default:
        i = -1;
        break;
      case 1804741442:
        if (paramString.equals("styleAttr")) {
          i = 0;
          break;
        } 
      case 1118509918:
        if (paramString.equals("animating")) {
          i = 4;
          break;
        } 
      case 633138363:
        if (paramString.equals("indeterminate")) {
          i = 2;
          break;
        } 
      case 94842723:
        if (paramString.equals("color")) {
          i = 5;
          break;
        } 
      case -676876213:
        if (paramString.equals("typeAttr")) {
          i = 1;
          break;
        } 
      case -877170387:
        if (paramString.equals("testID")) {
          i = 6;
          break;
        } 
      case -1001078227:
        if (paramString.equals("progress")) {
          i = 3;
          break;
        } 
    } 
    h<T> h3 = null;
    h<T> h2 = null;
    switch (i) {
      default:
        super.a((View)paramT, paramString, paramObject);
        return;
      case 6:
        h2 = (h)this.a;
        if (paramObject == null) {
          paramString = "";
        } else {
          paramString = (String)paramObject;
        } 
        h2.setTestID(paramT, paramString);
        return;
      case 5:
        ((h<T>)this.a).setColor(paramT, ColorPropConverter.getColor(paramObject, paramT.getContext()));
        return;
      case 4:
        h1 = (h)this.a;
        if (paramObject == null) {
          bool1 = bool2;
        } else {
          bool1 = ((Boolean)paramObject).booleanValue();
        } 
        h1.setAnimating(paramT, bool1);
        return;
      case 3:
        h1 = (h<T>)this.a;
        if (paramObject == null) {
          d = 0.0D;
        } else {
          d = ((Double)paramObject).doubleValue();
        } 
        h1.setProgress(paramT, d);
        return;
      case 2:
        h1 = (h<T>)this.a;
        if (paramObject != null)
          bool1 = ((Boolean)paramObject).booleanValue(); 
        h1.setIndeterminate(paramT, bool1);
        return;
      case 1:
        h3 = (h)this.a;
        if (paramObject == null) {
          h1 = h2;
        } else {
          str = (String)paramObject;
        } 
        h3.setTypeAttr(paramT, str);
        return;
      case 0:
        break;
    } 
    h2 = (h<T>)this.a;
    if (paramObject == null) {
      h<T> h = h3;
    } else {
      str = (String)paramObject;
    } 
    h2.setStyleAttr(paramT, str);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/h0/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */