package e.e.o.h0;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;

public class i<T extends View, U extends b<T> & j<T>> extends a<T, U> {
  public i(U paramU) {
    super((b)paramU);
  }
  
  public void a(T paramT, String paramString, Object paramObject) {
    int k = paramString.hashCode();
    boolean bool = false;
    boolean bool2 = true;
    boolean bool1 = true;
    switch (k) {
      default:
        k = -1;
        break;
      case 3530753:
        if (paramString.equals("size")) {
          k = 3;
          break;
        } 
      case -321826009:
        if (paramString.equals("refreshing")) {
          k = 5;
          break;
        } 
      case -416037467:
        if (paramString.equals("progressViewOffset")) {
          k = 4;
          break;
        } 
      case -885150488:
        if (paramString.equals("progressBackgroundColor")) {
          k = 2;
          break;
        } 
      case -1354842768:
        if (paramString.equals("colors")) {
          k = 1;
          break;
        } 
      case -1609594047:
        if (paramString.equals("enabled")) {
          k = 0;
          break;
        } 
    } 
    if (k != 0) {
      if (k != 1) {
        if (k != 2) {
          if (k != 3) {
            float f;
            if (k != 4) {
              if (k != 5) {
                super.a((View)paramT, paramString, paramObject);
                return;
              } 
              j<T> j3 = (j)this.a;
              if (paramObject != null)
                bool = ((Boolean)paramObject).booleanValue(); 
              j3.setRefreshing(paramT, bool);
              return;
            } 
            j<T> j2 = (j)this.a;
            if (paramObject == null) {
              f = 0.0F;
            } else {
              f = ((Double)paramObject).floatValue();
            } 
            j2.setProgressViewOffset(paramT, f);
            return;
          } 
          j<T> j1 = (j)this.a;
          if (paramObject == null) {
            k = bool1;
          } else {
            k = ((Double)paramObject).intValue();
          } 
          j1.setSize(paramT, k);
          return;
        } 
        ((j<T>)this.a).setProgressBackgroundColor(paramT, ColorPropConverter.getColor(paramObject, paramT.getContext()));
        return;
      } 
      ((j<T>)this.a).setColors(paramT, (ReadableArray)paramObject);
      return;
    } 
    j<T> j = (j)this.a;
    if (paramObject == null) {
      bool = bool2;
    } else {
      bool = ((Boolean)paramObject).booleanValue();
    } 
    j.setEnabled(paramT, bool);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/h0/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */