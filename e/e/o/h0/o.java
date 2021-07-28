package e.e.o.h0;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;

public class o<T extends View, U extends b<T> & p<T>> extends a<T, U> {
  public o(U paramU) {
    super((b)paramU);
  }
  
  public void a(T paramT, String paramString, Object paramObject) {
    p<T> p;
    int i = paramString.hashCode();
    boolean bool = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool1 = false;
    switch (i) {
      default:
        i = -1;
        break;
      case 2031205598:
        if (paramString.equals("animationType")) {
          i = 0;
          break;
        } 
      case 1195991583:
        if (paramString.equals("hardwareAccelerated")) {
          i = 4;
          break;
        } 
      case -795203165:
        if (paramString.equals("animated")) {
          i = 5;
          break;
        } 
      case -1156137512:
        if (paramString.equals("statusBarTranslucent")) {
          i = 3;
          break;
        } 
      case -1618432855:
        if (paramString.equals("identifier")) {
          i = 7;
          break;
        } 
      case -1726194350:
        if (paramString.equals("transparent")) {
          i = 2;
          break;
        } 
      case -1850124175:
        if (paramString.equals("supportedOrientations")) {
          i = 6;
          break;
        } 
      case -1851617609:
        if (paramString.equals("presentationStyle")) {
          i = 1;
          break;
        } 
    } 
    switch (i) {
      default:
        super.a((View)paramT, paramString, paramObject);
        return;
      case 7:
        p = (p)this.a;
        if (paramObject == null) {
          i = bool1;
        } else {
          i = ((Double)paramObject).intValue();
        } 
        p.setIdentifier(paramT, i);
        return;
      case 6:
        ((p<T>)this.a).setSupportedOrientations(paramT, (ReadableArray)paramObject);
        return;
      case 5:
        p = (p<T>)this.a;
        if (paramObject != null)
          bool = ((Boolean)paramObject).booleanValue(); 
        p.setAnimated(paramT, bool);
        return;
      case 4:
        p = (p<T>)this.a;
        if (paramObject == null) {
          bool = bool2;
        } else {
          bool = ((Boolean)paramObject).booleanValue();
        } 
        p.setHardwareAccelerated(paramT, bool);
        return;
      case 3:
        p = (p<T>)this.a;
        if (paramObject == null) {
          bool = bool3;
        } else {
          bool = ((Boolean)paramObject).booleanValue();
        } 
        p.setStatusBarTranslucent(paramT, bool);
        return;
      case 2:
        p = (p<T>)this.a;
        if (paramObject == null) {
          bool = bool4;
        } else {
          bool = ((Boolean)paramObject).booleanValue();
        } 
        p.setTransparent(paramT, bool);
        return;
      case 1:
        ((p<T>)this.a).setPresentationStyle(paramT, (String)paramObject);
        return;
      case 0:
        break;
    } 
    ((p<T>)this.a).setAnimationType(paramT, (String)paramObject);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/h0/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */