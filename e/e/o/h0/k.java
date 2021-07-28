package e.e.o.h0;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;

public class k<T extends View, U extends b<T> & l<T>> extends a<T, U> {
  public k(U paramU) {
    super((b)paramU);
  }
  
  public void a(T paramT, String paramString, Object paramObject) {
    int i = paramString.hashCode();
    boolean bool1 = true;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool2 = false;
    switch (i) {
      default:
        i = -1;
        break;
      case 2113632767:
        if (paramString.equals("trackColorForTrue")) {
          i = 4;
          break;
        } 
      case 1912319986:
        if (paramString.equals("thumbTintColor")) {
          i = 7;
          break;
        } 
      case 1084662482:
        if (paramString.equals("trackColorForFalse")) {
          i = 3;
          break;
        } 
      case 270940796:
        if (paramString.equals("disabled")) {
          i = 0;
          break;
        } 
      case 111972721:
        if (paramString.equals("value")) {
          i = 5;
          break;
        } 
      case 3551:
        if (paramString.equals("on")) {
          i = 6;
          break;
        } 
      case -287374307:
        if (paramString.equals("trackTintColor")) {
          i = 8;
          break;
        } 
      case -1609594047:
        if (paramString.equals("enabled")) {
          i = 1;
          break;
        } 
      case -1742453971:
        if (paramString.equals("thumbColor")) {
          i = 2;
          break;
        } 
    } 
    switch (i) {
      default:
        super.a((View)paramT, paramString, paramObject);
        return;
      case 8:
        ((l<T>)this.a).setTrackTintColor(paramT, ColorPropConverter.getColor(paramObject, paramT.getContext()));
        return;
      case 7:
        ((l<T>)this.a).setThumbTintColor(paramT, ColorPropConverter.getColor(paramObject, paramT.getContext()));
        return;
      case 6:
        l = (l)this.a;
        if (paramObject == null) {
          bool1 = bool2;
        } else {
          bool1 = ((Boolean)paramObject).booleanValue();
        } 
        l.setOn(paramT, bool1);
        return;
      case 5:
        l = (l<T>)this.a;
        if (paramObject == null) {
          bool1 = bool3;
        } else {
          bool1 = ((Boolean)paramObject).booleanValue();
        } 
        l.setValue(paramT, bool1);
        return;
      case 4:
        ((l<T>)this.a).setTrackColorForTrue(paramT, ColorPropConverter.getColor(paramObject, paramT.getContext()));
        return;
      case 3:
        ((l<T>)this.a).setTrackColorForFalse(paramT, ColorPropConverter.getColor(paramObject, paramT.getContext()));
        return;
      case 2:
        ((l<T>)this.a).setThumbColor(paramT, ColorPropConverter.getColor(paramObject, paramT.getContext()));
        return;
      case 1:
        l = (l<T>)this.a;
        if (paramObject != null)
          bool1 = ((Boolean)paramObject).booleanValue(); 
        l.setEnabled(paramT, bool1);
        return;
      case 0:
        break;
    } 
    l<T> l = (l<T>)this.a;
    if (paramObject == null) {
      bool1 = bool4;
    } else {
      bool1 = ((Boolean)paramObject).booleanValue();
    } 
    l.setDisabled(paramT, bool1);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/h0/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */