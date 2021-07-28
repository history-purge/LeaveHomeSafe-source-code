package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.yoga.n;
import e.e.o.g0.a;
import e.e.o.g0.b;
import e.e.o.g0.d;
import java.util.Map;

public abstract class ViewManager<T extends View, C extends a0> extends BaseJavaModule {
  private final T createView(k0 paramk0, a parama) {
    return createView(paramk0, null, null, parama);
  }
  
  protected void addEventEmitters(k0 paramk0, T paramT) {}
  
  public C createShadowNodeInstance() {
    throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
  }
  
  public C createShadowNodeInstance(ReactApplicationContext paramReactApplicationContext) {
    return createShadowNodeInstance();
  }
  
  public T createView(k0 paramk0, c0 paramc0, j0 paramj0, a parama) {
    paramk0 = (k0)createViewInstance(paramk0, paramc0, paramj0);
    if (paramk0 instanceof d)
      ((d)paramk0).setOnInterceptTouchEventListener((b)parama); 
    return (T)paramk0;
  }
  
  protected abstract T createViewInstance(k0 paramk0);
  
  protected T createViewInstance(k0 paramk0, c0 paramc0, j0 paramj0) {
    T t = createViewInstance(paramk0);
    addEventEmitters(paramk0, t);
    if (paramc0 != null)
      updateProperties(t, paramc0); 
    if (paramj0 != null) {
      Object object = updateState(t, paramc0, paramj0);
      if (object != null)
        updateExtraData(t, object); 
    } 
    return t;
  }
  
  public Map<String, Integer> getCommandsMap() {
    return null;
  }
  
  protected y0<T> getDelegate() {
    return null;
  }
  
  public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
    return null;
  }
  
  public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
    return null;
  }
  
  public Map<String, Object> getExportedViewConstants() {
    return null;
  }
  
  public abstract String getName();
  
  public Map<String, String> getNativeProps() {
    return z0.a((Class)getClass(), getShadowNodeClass());
  }
  
  public abstract Class<? extends C> getShadowNodeClass();
  
  public long measure(Context paramContext, ReadableMap paramReadableMap1, ReadableMap paramReadableMap2, ReadableMap paramReadableMap3, float paramFloat1, n paramn1, float paramFloat2, n paramn2, int[] paramArrayOfint) {
    return 0L;
  }
  
  protected void onAfterUpdateTransaction(T paramT) {}
  
  public void onDropViewInstance(T paramT) {}
  
  @Deprecated
  public void receiveCommand(T paramT, int paramInt, ReadableArray paramReadableArray) {}
  
  public void receiveCommand(T paramT, String paramString, ReadableArray paramReadableArray) {}
  
  public void setPadding(T paramT, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public abstract void updateExtraData(T paramT, Object paramObject);
  
  public Object updateLocalData(T paramT, c0 paramc01, c0 paramc02) {
    return null;
  }
  
  public void updateProperties(T paramT, c0 paramc0) {
    // Byte code:
    //   0: getstatic e/e/o/b0/a.c : Z
    //   3: ifeq -> 24
    //   6: aload_0
    //   7: invokevirtual getDelegate : ()Lcom/facebook/react/uimanager/y0;
    //   10: astore_3
    //   11: aload_3
    //   12: ifnull -> 24
    //   15: aload_3
    //   16: aload_1
    //   17: aload_2
    //   18: invokestatic a : (Lcom/facebook/react/uimanager/y0;Landroid/view/View;Lcom/facebook/react/uimanager/c0;)V
    //   21: goto -> 30
    //   24: aload_0
    //   25: aload_1
    //   26: aload_2
    //   27: invokestatic a : (Lcom/facebook/react/uimanager/ViewManager;Landroid/view/View;Lcom/facebook/react/uimanager/c0;)V
    //   30: aload_0
    //   31: aload_1
    //   32: invokevirtual onAfterUpdateTransaction : (Landroid/view/View;)V
    //   35: return
  }
  
  public Object updateState(T paramT, c0 paramc0, j0 paramj0) {
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/ViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */