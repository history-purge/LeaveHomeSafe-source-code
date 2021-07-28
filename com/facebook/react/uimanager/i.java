package com.facebook.react.uimanager;

import android.content.Context;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.e1.b;
import com.facebook.yoga.k;
import com.facebook.yoga.l;
import com.facebook.yoga.s;
import com.facebook.yoga.t;
import com.facebook.yoga.u;
import com.facebook.yoga.w;

public class i extends b0 {
  private final b A = new b(null);
  
  private int h(int paramInt) {
    return !com.facebook.react.modules.i18nmanager.a.a().a((Context)h()) ? paramInt : ((paramInt != 0) ? ((paramInt != 2) ? paramInt : 5) : 4);
  }
  
  @a(name = "alignContent")
  public void setAlignContent(String paramString) {
    StringBuilder stringBuilder;
    if (y())
      return; 
    if (paramString == null);
    byte b1 = -1;
    switch (paramString.hashCode()) {
      case 1937124468:
        if (paramString.equals("space-around"))
          b1 = 7; 
        break;
      case 1742952711:
        if (paramString.equals("flex-end"))
          b1 = 3; 
        break;
      case 441309761:
        if (paramString.equals("space-between"))
          b1 = 6; 
        break;
      case 3005871:
        if (paramString.equals("auto"))
          b1 = 0; 
        break;
      case -46581362:
        if (paramString.equals("flex-start"))
          b1 = 1; 
        break;
      case -1364013995:
        if (paramString.equals("center"))
          b1 = 2; 
        break;
      case -1720785339:
        if (paramString.equals("baseline"))
          b1 = 5; 
        break;
      case -1881872635:
        if (paramString.equals("stretch"))
          b1 = 4; 
        break;
    } 
    switch (b1) {
      case 1:
        a = com.facebook.yoga.a.d;
        a(a);
        return;
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("invalid value for alignContent: ");
        stringBuilder.append((String)a);
        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
      case 7:
        a = com.facebook.yoga.a.j;
        a(a);
        return;
      case 6:
        a = com.facebook.yoga.a.i;
        a(a);
        return;
      case 5:
        a = com.facebook.yoga.a.h;
        a(a);
        return;
      case 4:
        a = com.facebook.yoga.a.g;
        a(a);
        return;
      case 3:
        a = com.facebook.yoga.a.f;
        a(a);
        return;
      case 2:
        a = com.facebook.yoga.a.e;
        a(a);
        return;
      case 0:
        break;
    } 
    com.facebook.yoga.a a = com.facebook.yoga.a.c;
    a(a);
  }
  
  @a(name = "alignItems")
  public void setAlignItems(String paramString) {
    StringBuilder stringBuilder;
    if (y())
      return; 
    if (paramString == null);
    byte b1 = -1;
    switch (paramString.hashCode()) {
      case 1937124468:
        if (paramString.equals("space-around"))
          b1 = 7; 
        break;
      case 1742952711:
        if (paramString.equals("flex-end"))
          b1 = 3; 
        break;
      case 441309761:
        if (paramString.equals("space-between"))
          b1 = 6; 
        break;
      case 3005871:
        if (paramString.equals("auto"))
          b1 = 0; 
        break;
      case -46581362:
        if (paramString.equals("flex-start"))
          b1 = 1; 
        break;
      case -1364013995:
        if (paramString.equals("center"))
          b1 = 2; 
        break;
      case -1720785339:
        if (paramString.equals("baseline"))
          b1 = 5; 
        break;
      case -1881872635:
        if (paramString.equals("stretch"))
          b1 = 4; 
        break;
    } 
    switch (b1) {
      case 4:
        a = com.facebook.yoga.a.g;
        b(a);
        return;
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("invalid value for alignItems: ");
        stringBuilder.append((String)a);
        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
      case 7:
        a = com.facebook.yoga.a.j;
        b(a);
        return;
      case 6:
        a = com.facebook.yoga.a.i;
        b(a);
        return;
      case 5:
        a = com.facebook.yoga.a.h;
        b(a);
        return;
      case 3:
        a = com.facebook.yoga.a.f;
        b(a);
        return;
      case 2:
        a = com.facebook.yoga.a.e;
        b(a);
        return;
      case 1:
        a = com.facebook.yoga.a.d;
        b(a);
        return;
      case 0:
        break;
    } 
    com.facebook.yoga.a a = com.facebook.yoga.a.c;
    b(a);
  }
  
  @a(name = "alignSelf")
  public void setAlignSelf(String paramString) {
    StringBuilder stringBuilder;
    if (y())
      return; 
    if (paramString == null);
    byte b1 = -1;
    switch (paramString.hashCode()) {
      case 1937124468:
        if (paramString.equals("space-around"))
          b1 = 7; 
        break;
      case 1742952711:
        if (paramString.equals("flex-end"))
          b1 = 3; 
        break;
      case 441309761:
        if (paramString.equals("space-between"))
          b1 = 6; 
        break;
      case 3005871:
        if (paramString.equals("auto"))
          b1 = 0; 
        break;
      case -46581362:
        if (paramString.equals("flex-start"))
          b1 = 1; 
        break;
      case -1364013995:
        if (paramString.equals("center"))
          b1 = 2; 
        break;
      case -1720785339:
        if (paramString.equals("baseline"))
          b1 = 5; 
        break;
      case -1881872635:
        if (paramString.equals("stretch"))
          b1 = 4; 
        break;
    } 
    switch (b1) {
      case 0:
        a = com.facebook.yoga.a.c;
        c(a);
        return;
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("invalid value for alignSelf: ");
        stringBuilder.append((String)a);
        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
      case 7:
        a = com.facebook.yoga.a.j;
        c(a);
        return;
      case 6:
        a = com.facebook.yoga.a.i;
        c(a);
        return;
      case 5:
        a = com.facebook.yoga.a.h;
        c(a);
        return;
      case 4:
        a = com.facebook.yoga.a.g;
        c(a);
        return;
      case 3:
        a = com.facebook.yoga.a.f;
        c(a);
        return;
      case 2:
        a = com.facebook.yoga.a.e;
        c(a);
        return;
      case 1:
        break;
    } 
    com.facebook.yoga.a a = com.facebook.yoga.a.d;
    c(a);
  }
  
  @a(defaultFloat = NaNF, name = "aspectRatio")
  public void setAspectRatio(float paramFloat) {
    e(paramFloat);
  }
  
  @b(defaultFloat = NaNF, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
  public void setBorderWidths(int paramInt, float paramFloat) {
    if (y())
      return; 
    a(h(c1.a[paramInt]), q.b(paramFloat));
  }
  
  @a(name = "collapsable")
  public void setCollapsable(boolean paramBoolean) {}
  
  @a(name = "display")
  public void setDisplay(String paramString) {
    com.facebook.yoga.i i1;
    if (y())
      return; 
    if (paramString == null) {
      a(com.facebook.yoga.i.c);
      return;
    } 
    byte b1 = -1;
    int j = paramString.hashCode();
    if (j != 3145721) {
      if (j == 3387192 && paramString.equals("none"))
        b1 = 1; 
    } else if (paramString.equals("flex")) {
      b1 = 0;
    } 
    if (b1 != 0) {
      if (b1 == 1) {
        i1 = com.facebook.yoga.i.d;
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("invalid value for display: ");
        stringBuilder.append((String)i1);
        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
      } 
    } else {
      i1 = com.facebook.yoga.i.c;
    } 
    a(i1);
  }
  
  @a(defaultFloat = 0.0F, name = "flex")
  public void setFlex(float paramFloat) {
    if (y())
      return; 
    super.setFlex(paramFloat);
  }
  
  @a(name = "flexBasis")
  public void setFlexBasis(Dynamic paramDynamic) {
    if (y())
      return; 
    this.A.a(paramDynamic);
    int j = a.a[this.A.b.ordinal()];
    if (j != 1 && j != 2) {
      if (j != 3) {
        if (j == 4)
          d(this.A.a); 
      } else {
        N();
      } 
    } else {
      c(this.A.a);
    } 
    paramDynamic.recycle();
  }
  
  @a(name = "flexDirection")
  public void setFlexDirection(String paramString) {
    k k;
    if (y())
      return; 
    if (paramString == null) {
      a(k.c);
      return;
    } 
    byte b1 = -1;
    switch (paramString.hashCode()) {
      case 1272730475:
        if (paramString.equals("column-reverse"))
          b1 = 1; 
        break;
      case 113114:
        if (paramString.equals("row"))
          b1 = 2; 
        break;
      case -1354837162:
        if (paramString.equals("column"))
          b1 = 0; 
        break;
      case -1448970769:
        if (paramString.equals("row-reverse"))
          b1 = 3; 
        break;
    } 
    if (b1 != 0) {
      if (b1 != 1) {
        if (b1 != 2) {
          if (b1 == 3) {
            k = k.f;
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid value for flexDirection: ");
            stringBuilder.append((String)k);
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
          } 
        } else {
          k = k.e;
        } 
      } else {
        k = k.d;
      } 
    } else {
      k = k.c;
    } 
    a(k);
  }
  
  @a(defaultFloat = 0.0F, name = "flexGrow")
  public void setFlexGrow(float paramFloat) {
    if (y())
      return; 
    super.setFlexGrow(paramFloat);
  }
  
  @a(defaultFloat = 0.0F, name = "flexShrink")
  public void setFlexShrink(float paramFloat) {
    if (y())
      return; 
    super.setFlexShrink(paramFloat);
  }
  
  @a(name = "flexWrap")
  public void setFlexWrap(String paramString) {
    w w;
    if (y())
      return; 
    if (paramString == null) {
      a(w.c);
      return;
    } 
    byte b1 = -1;
    int j = paramString.hashCode();
    if (j != -1039592053) {
      if (j != -749527969) {
        if (j == 3657802 && paramString.equals("wrap"))
          b1 = 1; 
      } else if (paramString.equals("wrap-reverse")) {
        b1 = 2;
      } 
    } else if (paramString.equals("nowrap")) {
      b1 = 0;
    } 
    if (b1 != 0) {
      if (b1 != 1) {
        if (b1 == 2) {
          w = w.e;
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("invalid value for flexWrap: ");
          stringBuilder.append((String)w);
          throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        w = w.d;
      } 
    } else {
      w = w.c;
    } 
    a(w);
  }
  
  @a(name = "height")
  public void setHeight(Dynamic paramDynamic) {
    if (y())
      return; 
    this.A.a(paramDynamic);
    int j = a.a[this.A.b.ordinal()];
    if (j != 1 && j != 2) {
      if (j != 3) {
        if (j == 4)
          f(this.A.a); 
      } else {
        O();
      } 
    } else {
      a(this.A.a);
    } 
    paramDynamic.recycle();
  }
  
  @a(name = "justifyContent")
  public void setJustifyContent(String paramString) {
    l l;
    if (y())
      return; 
    if (paramString == null) {
      a(l.c);
      return;
    } 
    byte b1 = -1;
    switch (paramString.hashCode()) {
      case 2055030478:
        if (paramString.equals("space-evenly"))
          b1 = 5; 
        break;
      case 1937124468:
        if (paramString.equals("space-around"))
          b1 = 4; 
        break;
      case 1742952711:
        if (paramString.equals("flex-end"))
          b1 = 2; 
        break;
      case 441309761:
        if (paramString.equals("space-between"))
          b1 = 3; 
        break;
      case -46581362:
        if (paramString.equals("flex-start"))
          b1 = 0; 
        break;
      case -1364013995:
        if (paramString.equals("center"))
          b1 = 1; 
        break;
    } 
    if (b1 != 0) {
      if (b1 != 1) {
        if (b1 != 2) {
          if (b1 != 3) {
            if (b1 != 4) {
              if (b1 == 5) {
                l = l.h;
              } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("invalid value for justifyContent: ");
                stringBuilder.append((String)l);
                throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
              } 
            } else {
              l = l.g;
            } 
          } else {
            l = l.f;
          } 
        } else {
          l = l.e;
        } 
      } else {
        l = l.d;
      } 
    } else {
      l = l.c;
    } 
    a(l);
  }
  
  @b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
  public void setMargins(int paramInt, Dynamic paramDynamic) {
    if (y())
      return; 
    paramInt = h(c1.b[paramInt]);
    this.A.a(paramDynamic);
    int j = a.a[this.A.b.ordinal()];
    if (j != 1 && j != 2) {
      if (j != 3) {
        if (j == 4)
          d(paramInt, this.A.a); 
      } else {
        g(paramInt);
      } 
    } else {
      c(paramInt, this.A.a);
    } 
    paramDynamic.recycle();
  }
  
  @a(name = "maxHeight")
  public void setMaxHeight(Dynamic paramDynamic) {
    if (y())
      return; 
    this.A.a(paramDynamic);
    int j = a.a[this.A.b.ordinal()];
    if (j != 1 && j != 2) {
      if (j == 4)
        h(this.A.a); 
    } else {
      g(this.A.a);
    } 
    paramDynamic.recycle();
  }
  
  @a(name = "maxWidth")
  public void setMaxWidth(Dynamic paramDynamic) {
    if (y())
      return; 
    this.A.a(paramDynamic);
    int j = a.a[this.A.b.ordinal()];
    if (j != 1 && j != 2) {
      if (j == 4)
        j(this.A.a); 
    } else {
      i(this.A.a);
    } 
    paramDynamic.recycle();
  }
  
  @a(name = "minHeight")
  public void setMinHeight(Dynamic paramDynamic) {
    if (y())
      return; 
    this.A.a(paramDynamic);
    int j = a.a[this.A.b.ordinal()];
    if (j != 1 && j != 2) {
      if (j == 4)
        l(this.A.a); 
    } else {
      k(this.A.a);
    } 
    paramDynamic.recycle();
  }
  
  @a(name = "minWidth")
  public void setMinWidth(Dynamic paramDynamic) {
    if (y())
      return; 
    this.A.a(paramDynamic);
    int j = a.a[this.A.b.ordinal()];
    if (j != 1 && j != 2) {
      if (j == 4)
        n(this.A.a); 
    } else {
      m(this.A.a);
    } 
    paramDynamic.recycle();
  }
  
  @a(name = "overflow")
  public void setOverflow(String paramString) {
    s s;
    if (y())
      return; 
    if (paramString == null) {
      a(s.c);
      return;
    } 
    byte b1 = -1;
    int j = paramString.hashCode();
    if (j != -1217487446) {
      if (j != -907680051) {
        if (j == 466743410 && paramString.equals("visible"))
          b1 = 0; 
      } else if (paramString.equals("scroll")) {
        b1 = 2;
      } 
    } else if (paramString.equals("hidden")) {
      b1 = 1;
    } 
    if (b1 != 0) {
      if (b1 != 1) {
        if (b1 == 2) {
          s = s.e;
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("invalid value for overflow: ");
          stringBuilder.append((String)s);
          throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        s = s.d;
      } 
    } else {
      s = s.c;
    } 
    a(s);
  }
  
  @b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
  public void setPaddings(int paramInt, Dynamic paramDynamic) {
    if (y())
      return; 
    paramInt = h(c1.b[paramInt]);
    this.A.a(paramDynamic);
    int j = a.a[this.A.b.ordinal()];
    if (j != 1 && j != 2) {
      if (j == 4)
        f(paramInt, this.A.a); 
    } else {
      e(paramInt, this.A.a);
    } 
    paramDynamic.recycle();
  }
  
  @a(name = "position")
  public void setPosition(String paramString) {
    t t;
    if (y())
      return; 
    if (paramString == null) {
      a(t.c);
      return;
    } 
    byte b1 = -1;
    int j = paramString.hashCode();
    if (j != -554435892) {
      if (j == 1728122231 && paramString.equals("absolute"))
        b1 = 1; 
    } else if (paramString.equals("relative")) {
      b1 = 0;
    } 
    if (b1 != 0) {
      if (b1 == 1) {
        t = t.d;
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("invalid value for position: ");
        stringBuilder.append((String)t);
        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
      } 
    } else {
      t = t.c;
    } 
    a(t);
  }
  
  @b(names = {"start", "end", "left", "right", "top", "bottom"})
  public void setPositionValues(int paramInt, Dynamic paramDynamic) {
    if (y())
      return; 
    (new int[6])[0] = 4;
    (new int[6])[1] = 5;
    (new int[6])[2] = 0;
    (new int[6])[3] = 2;
    (new int[6])[4] = 1;
    (new int[6])[5] = 3;
    paramInt = h((new int[6])[paramInt]);
    this.A.a(paramDynamic);
    int j = a.a[this.A.b.ordinal()];
    if (j != 1 && j != 2) {
      if (j == 4)
        h(paramInt, this.A.a); 
    } else {
      g(paramInt, this.A.a);
    } 
    paramDynamic.recycle();
  }
  
  @a(name = "onLayout")
  public void setShouldNotifyOnLayout(boolean paramBoolean) {
    super.setShouldNotifyOnLayout(paramBoolean);
  }
  
  @a(name = "width")
  public void setWidth(Dynamic paramDynamic) {
    if (y())
      return; 
    this.A.a(paramDynamic);
    int j = a.a[this.A.b.ordinal()];
    if (j != 1 && j != 2) {
      if (j != 3) {
        if (j == 4)
          o(this.A.a); 
      } else {
        P();
      } 
    } else {
      b(this.A.a);
    } 
    paramDynamic.recycle();
  }
  
  private static class b {
    float a;
    
    u b;
    
    private b() {}
    
    void a(Dynamic param1Dynamic) {
      u u1;
      if (param1Dynamic.isNull()) {
        u1 = u.c;
      } else if (u1.getType() == ReadableType.String) {
        String str = u1.asString();
        if (str.equals("auto")) {
          u1 = u.f;
        } else {
          float f;
          if (u1.endsWith("%")) {
            this.b = u.e;
            f = Float.parseFloat(u1.substring(0, u1.length() - 1));
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown value: ");
            stringBuilder.append((String)u1);
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
          this.a = f;
        } 
      } else {
        this.b = u.d;
        float f = q.a(u1.asDouble());
        this.a = f;
      } 
      this.b = u1;
      this.a = Float.NaN;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */