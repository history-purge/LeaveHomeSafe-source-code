package com.facebook.react.views.swiperefresh;

import android.view.View;
import b.p.a.c;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.b;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.y0;
import e.e.o.d0.a.a;
import e.e.o.h0.i;
import e.e.o.h0.j;
import java.util.Map;

@a(name = "AndroidSwipeRefreshLayout")
public class SwipeRefreshLayoutManager extends ViewGroupManager<a> implements j<a> {
  public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
  
  private final y0<a> mDelegate = (y0<a>)new i((b)this);
  
  protected void addEventEmitters(k0 paramk0, a parama) {
    parama.setOnRefreshListener(new a(this, paramk0, parama));
  }
  
  protected a createViewInstance(k0 paramk0) {
    return new a((ReactContext)paramk0);
  }
  
  protected y0<a> getDelegate() {
    return this.mDelegate;
  }
  
  public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
    f.b b = f.a();
    b.a("topRefresh", f.a("registrationName", "onRefresh"));
    return b.a();
  }
  
  public Map<String, Object> getExportedViewConstants() {
    return f.a("SIZE", f.a("DEFAULT", Integer.valueOf(1), "LARGE", Integer.valueOf(0)));
  }
  
  public String getName() {
    return "AndroidSwipeRefreshLayout";
  }
  
  public void receiveCommand(a parama, String paramString, ReadableArray paramReadableArray) {
    byte b;
    if (paramString.hashCode() == 513968928 && paramString.equals("setNativeRefreshing")) {
      b = 0;
    } else {
      b = -1;
    } 
    if (b != 0)
      return; 
    if (paramReadableArray != null)
      setRefreshing(parama, paramReadableArray.getBoolean(0)); 
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "ColorArray", name = "colors")
  public void setColors(a parama, ReadableArray paramReadableArray) {
    int i = 0;
    if (paramReadableArray != null) {
      int[] arrayOfInt = new int[paramReadableArray.size()];
      while (i < paramReadableArray.size()) {
        if (paramReadableArray.getType(i) == ReadableType.Map) {
          arrayOfInt[i] = ColorPropConverter.getColor(paramReadableArray.getMap(i), parama.getContext()).intValue();
        } else {
          arrayOfInt[i] = paramReadableArray.getInt(i);
        } 
        i++;
      } 
      parama.setColorSchemeColors(arrayOfInt);
      return;
    } 
    parama.setColorSchemeColors(new int[0]);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "enabled")
  public void setEnabled(a parama, boolean paramBoolean) {
    parama.setEnabled(paramBoolean);
  }
  
  public void setNativeRefreshing(a parama, boolean paramBoolean) {}
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "progressBackgroundColor")
  public void setProgressBackgroundColor(a parama, Integer paramInteger) {
    int i;
    if (paramInteger == null) {
      i = 0;
    } else {
      i = paramInteger.intValue();
    } 
    parama.setProgressBackgroundColorSchemeColor(i);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = 0.0F, name = "progressViewOffset")
  public void setProgressViewOffset(a parama, float paramFloat) {
    parama.setProgressViewOffset(paramFloat);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "refreshing")
  public void setRefreshing(a parama, boolean paramBoolean) {
    parama.setRefreshing(paramBoolean);
  }
  
  public void setSize(a parama, int paramInt) {
    parama.setSize(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "size")
  public void setSize(a parama, Dynamic paramDynamic) {
    IllegalArgumentException illegalArgumentException;
    if (!paramDynamic.isNull()) {
      boolean bool;
      if (paramDynamic.getType() == ReadableType.Number) {
        bool = paramDynamic.asInt();
      } else if (paramDynamic.getType() == ReadableType.String) {
        String str = paramDynamic.asString();
        if (str.equals("default")) {
          parama.setSize(1);
          return;
        } 
        if (str.equals("large")) {
          bool = false;
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Size must be 'default' or 'large', received: ");
          stringBuilder.append(str);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        illegalArgumentException = new IllegalArgumentException("Size must be 'default' or 'large'");
        throw illegalArgumentException;
      } 
      illegalArgumentException.setSize(bool);
      return;
    } 
    illegalArgumentException.setSize(1);
  }
  
  class a implements c.j {
    a(SwipeRefreshLayoutManager this$0, k0 param1k0, a param1a) {}
    
    public void a() {
      d d = q0.b((ReactContext)this.a, this.b.getId());
      if (d != null)
        d.a(new b(this.b.getId())); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */