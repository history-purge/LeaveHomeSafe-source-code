package e.e.o.h0;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;

public class q<T extends View, U extends b<T> & r<T>> extends a<T, U> {
  public q(U paramU) {
    super((b)paramU);
  }
  
  public void a(T paramT, String paramString, Object paramObject) {
    r<T> r2;
    String str;
    r<T> r3;
    int i = paramString.hashCode();
    boolean bool1 = false;
    boolean bool2 = true;
    switch (i) {
      default:
        i = -1;
        break;
      case 1912319986:
        if (paramString.equals("thumbTintColor")) {
          i = 11;
          break;
        } 
      case 1333596542:
        if (paramString.equals("minimumTrackImage")) {
          i = 5;
          break;
        } 
      case 1192487427:
        if (paramString.equals("minimumValue")) {
          i = 7;
          break;
        } 
      case 1139400400:
        if (paramString.equals("trackImage")) {
          i = 12;
          break;
        } 
      case 718061361:
        if (paramString.equals("maximumValue")) {
          i = 4;
          break;
        } 
      case 270940796:
        if (paramString.equals("disabled")) {
          i = 0;
          break;
        } 
      case 111972721:
        if (paramString.equals("value")) {
          i = 13;
          break;
        } 
      case 3540684:
        if (paramString.equals("step")) {
          i = 8;
          break;
        } 
      case -877170387:
        if (paramString.equals("testID")) {
          i = 9;
          break;
        } 
      case -981448432:
        if (paramString.equals("maximumTrackImage")) {
          i = 2;
          break;
        } 
      case -1021497397:
        if (paramString.equals("minimumTrackTintColor")) {
          i = 6;
          break;
        } 
      case -1609594047:
        if (paramString.equals("enabled")) {
          i = 1;
          break;
        } 
      case -1736983259:
        if (paramString.equals("thumbImage")) {
          i = 10;
          break;
        } 
      case -1900655011:
        if (paramString.equals("maximumTrackTintColor")) {
          i = 3;
          break;
        } 
    } 
    double d = 0.0D;
    switch (i) {
      default:
        super.a((View)paramT, paramString, paramObject);
        return;
      case 13:
        r2 = (r)this.a;
        if (paramObject != null)
          d = ((Double)paramObject).doubleValue(); 
        r2.setValue(paramT, d);
        return;
      case 12:
        ((r<T>)this.a).setTrackImage(paramT, (ReadableMap)paramObject);
        return;
      case 11:
        ((r<T>)this.a).setThumbTintColor(paramT, ColorPropConverter.getColor(paramObject, paramT.getContext()));
        return;
      case 10:
        ((r<T>)this.a).setThumbImage(paramT, (ReadableMap)paramObject);
        return;
      case 9:
        r3 = (r)this.a;
        if (paramObject == null) {
          str = "";
        } else {
          str = (String)paramObject;
        } 
        r3.setTestID(paramT, str);
        return;
      case 8:
        r1 = (r)this.a;
        if (paramObject != null)
          d = ((Double)paramObject).doubleValue(); 
        r1.setStep(paramT, d);
        return;
      case 7:
        r1 = (r<T>)this.a;
        if (paramObject != null)
          d = ((Double)paramObject).doubleValue(); 
        r1.setMinimumValue(paramT, d);
        return;
      case 6:
        ((r<T>)this.a).setMinimumTrackTintColor(paramT, ColorPropConverter.getColor(paramObject, paramT.getContext()));
        return;
      case 5:
        ((r<T>)this.a).setMinimumTrackImage(paramT, (ReadableMap)paramObject);
        return;
      case 4:
        r1 = (r<T>)this.a;
        if (paramObject == null) {
          d = 1.0D;
        } else {
          d = ((Double)paramObject).doubleValue();
        } 
        r1.setMaximumValue(paramT, d);
        return;
      case 3:
        ((r<T>)this.a).setMaximumTrackTintColor(paramT, ColorPropConverter.getColor(paramObject, paramT.getContext()));
        return;
      case 2:
        ((r<T>)this.a).setMaximumTrackImage(paramT, (ReadableMap)paramObject);
        return;
      case 1:
        r1 = (r<T>)this.a;
        if (paramObject == null) {
          bool1 = bool2;
        } else {
          bool1 = ((Boolean)paramObject).booleanValue();
        } 
        r1.setEnabled(paramT, bool1);
        return;
      case 0:
        break;
    } 
    r<T> r1 = (r<T>)this.a;
    if (paramObject != null)
      bool1 = ((Boolean)paramObject).booleanValue(); 
    r1.setDisabled(paramT, bool1);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/h0/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */