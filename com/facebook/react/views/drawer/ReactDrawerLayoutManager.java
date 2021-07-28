package com.facebook.react.views.drawer;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.b;
import com.facebook.react.uimanager.events.c;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.y0;
import com.facebook.react.views.drawer.b.a;
import com.facebook.react.views.drawer.b.b;
import com.facebook.react.views.drawer.b.c;
import com.facebook.react.views.drawer.b.d;
import e.e.o.d0.a.a;
import e.e.o.h0.c;
import e.e.o.h0.d;
import java.util.Map;

@a(name = "AndroidDrawerLayout")
public class ReactDrawerLayoutManager extends ViewGroupManager<a> implements d<a> {
  public static final int CLOSE_DRAWER = 2;
  
  public static final int OPEN_DRAWER = 1;
  
  public static final String REACT_CLASS = "AndroidDrawerLayout";
  
  private final y0<a> mDelegate = (y0<a>)new c((b)this);
  
  private void setDrawerPositionInternal(a parama, String paramString) {
    JSApplicationIllegalArgumentException jSApplicationIllegalArgumentException;
    int i;
    if (paramString.equals("left")) {
      i = 8388611;
    } else if (paramString.equals("right")) {
      i = 8388613;
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("drawerPosition must be 'left' or 'right', received");
      stringBuilder.append(paramString);
      jSApplicationIllegalArgumentException = new JSApplicationIllegalArgumentException(stringBuilder.toString());
      throw jSApplicationIllegalArgumentException;
    } 
    jSApplicationIllegalArgumentException.g(i);
  }
  
  protected void addEventEmitters(k0 paramk0, a parama) {
    parama.a(new a(parama, ((UIManagerModule)paramk0.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
  }
  
  public void addView(a parama, View paramView, int paramInt) {
    if (getChildCount((ViewGroup)parama) < 2) {
      if (paramInt == 0 || paramInt == 1) {
        parama.addView(paramView, paramInt);
        parama.g();
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("The only valid indices for drawer's child are 0 or 1. Got ");
      stringBuilder.append(paramInt);
      stringBuilder.append(" instead.");
      throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    } 
    throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
  }
  
  public void closeDrawer(a parama) {
    parama.e();
  }
  
  protected a createViewInstance(k0 paramk0) {
    return new a((ReactContext)paramk0);
  }
  
  public Map<String, Integer> getCommandsMap() {
    return f.a("openDrawer", Integer.valueOf(1), "closeDrawer", Integer.valueOf(2));
  }
  
  public y0<a> getDelegate() {
    return this.mDelegate;
  }
  
  public Map getExportedCustomDirectEventTypeConstants() {
    return f.a("topDrawerSlide", f.a("registrationName", "onDrawerSlide"), "topDrawerOpen", f.a("registrationName", "onDrawerOpen"), "topDrawerClose", f.a("registrationName", "onDrawerClose"), "topDrawerStateChanged", f.a("registrationName", "onDrawerStateChanged"));
  }
  
  public Map getExportedViewConstants() {
    return f.a("DrawerPosition", f.a("Left", Integer.valueOf(8388611), "Right", Integer.valueOf(8388613)));
  }
  
  public String getName() {
    return "AndroidDrawerLayout";
  }
  
  public boolean needsCustomLayoutForChildren() {
    return true;
  }
  
  public void openDrawer(a parama) {
    parama.f();
  }
  
  public void receiveCommand(a parama, int paramInt, ReadableArray paramReadableArray) {
    if (paramInt != 1) {
      if (paramInt != 2)
        return; 
      parama.e();
      return;
    } 
    parama.f();
  }
  
  public void receiveCommand(a parama, String paramString, ReadableArray paramReadableArray) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual hashCode : ()I
    //   4: istore #4
    //   6: iload #4
    //   8: ldc -258774775
    //   10: if_icmpeq -> 38
    //   13: iload #4
    //   15: ldc -83186725
    //   17: if_icmpeq -> 23
    //   20: goto -> 53
    //   23: aload_2
    //   24: ldc 'openDrawer'
    //   26: invokevirtual equals : (Ljava/lang/Object;)Z
    //   29: ifeq -> 53
    //   32: iconst_0
    //   33: istore #4
    //   35: goto -> 56
    //   38: aload_2
    //   39: ldc 'closeDrawer'
    //   41: invokevirtual equals : (Ljava/lang/Object;)Z
    //   44: ifeq -> 53
    //   47: iconst_1
    //   48: istore #4
    //   50: goto -> 56
    //   53: iconst_m1
    //   54: istore #4
    //   56: iload #4
    //   58: ifeq -> 73
    //   61: iload #4
    //   63: iconst_1
    //   64: if_icmpeq -> 68
    //   67: return
    //   68: aload_1
    //   69: invokevirtual e : ()V
    //   72: return
    //   73: aload_1
    //   74: invokevirtual f : ()V
    //   77: return
  }
  
  public void setDrawerBackgroundColor(a parama, Integer paramInteger) {}
  
  @com.facebook.react.uimanager.e1.a(name = "drawerLockMode")
  public void setDrawerLockMode(a parama, String paramString) {
    StringBuilder stringBuilder;
    byte b;
    if (paramString == null || "unlocked".equals(paramString)) {
      b = 0;
    } else if ("locked-closed".equals(paramString)) {
      b = 1;
    } else if ("locked-open".equals(paramString)) {
      b = 2;
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Unknown drawerLockMode ");
      stringBuilder.append(paramString);
      throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    } 
    stringBuilder.setDrawerLockMode(b);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "drawerPosition")
  public void setDrawerPosition(a parama, Dynamic paramDynamic) {
    StringBuilder stringBuilder;
    if (paramDynamic.isNull()) {
      parama.g(8388611);
      return;
    } 
    if (paramDynamic.getType() == ReadableType.Number) {
      int i = paramDynamic.asInt();
      if (8388611 == i || 8388613 == i) {
        parama.g(i);
        return;
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Unknown drawerPosition ");
      stringBuilder.append(i);
      throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    } 
    if (paramDynamic.getType() == ReadableType.String) {
      setDrawerPositionInternal((a)stringBuilder, paramDynamic.asString());
      return;
    } 
    throw new JSApplicationIllegalArgumentException("drawerPosition must be a string or int");
  }
  
  public void setDrawerPosition(a parama, String paramString) {
    if (paramString == null) {
      parama.g(8388611);
      return;
    } 
    setDrawerPositionInternal(parama, paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = NaNF, name = "drawerWidth")
  public void setDrawerWidth(a parama, float paramFloat) {
    int i;
    if (Float.isNaN(paramFloat)) {
      i = -1;
    } else {
      i = Math.round(q.b(paramFloat));
    } 
    parama.h(i);
  }
  
  public void setDrawerWidth(a parama, Float paramFloat) {
    int i;
    if (paramFloat == null) {
      i = -1;
    } else {
      i = Math.round(q.b(paramFloat.floatValue()));
    } 
    parama.h(i);
  }
  
  public void setElevation(a parama, float paramFloat) {
    parama.setDrawerElevation(q.b(paramFloat));
  }
  
  public void setKeyboardDismissMode(a parama, String paramString) {}
  
  public void setStatusBarBackgroundColor(a parama, Integer paramInteger) {}
  
  public static class a implements b.j.a.a.d {
    private final b.j.a.a a;
    
    private final d b;
    
    public a(b.j.a.a param1a, d param1d) {
      this.a = param1a;
      this.b = param1d;
    }
    
    public void a(int param1Int) {
      this.b.a((c)new d(this.a.getId(), param1Int));
    }
    
    public void a(View param1View) {
      this.b.a((c)new b(this.a.getId()));
    }
    
    public void a(View param1View, float param1Float) {
      this.b.a((c)new c(this.a.getId(), param1Float));
    }
    
    public void b(View param1View) {
      this.b.a((c)new a(this.a.getId()));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/drawer/ReactDrawerLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */