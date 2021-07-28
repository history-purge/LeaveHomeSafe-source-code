package com.horcrux.svg;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import e.e.o.v;
import java.util.Arrays;
import java.util.List;

public class e0 implements v {
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    return Arrays.asList(new NativeModule[] { (NativeModule)new SvgViewModule(paramReactApplicationContext), (NativeModule)new RNSVGRenderableManager(paramReactApplicationContext) });
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    return Arrays.asList(new ViewManager[] { 
          (ViewManager)new RenderableViewManager.GroupViewManager(), (ViewManager)new RenderableViewManager.PathViewManager(), (ViewManager)new RenderableViewManager.CircleViewManager(), (ViewManager)new RenderableViewManager.EllipseViewManager(), (ViewManager)new RenderableViewManager.LineViewManager(), (ViewManager)new RenderableViewManager.RectViewManager(), (ViewManager)new RenderableViewManager.TextViewManager(), (ViewManager)new RenderableViewManager.TSpanViewManager(), (ViewManager)new RenderableViewManager.TextPathViewManager(), (ViewManager)new RenderableViewManager.ImageViewManager(), 
          (ViewManager)new RenderableViewManager.ClipPathViewManager(), (ViewManager)new RenderableViewManager.DefsViewManager(), (ViewManager)new RenderableViewManager.UseViewManager(), (ViewManager)new RenderableViewManager.SymbolManager(), (ViewManager)new RenderableViewManager.LinearGradientManager(), (ViewManager)new RenderableViewManager.RadialGradientManager(), (ViewManager)new RenderableViewManager.PatternManager(), (ViewManager)new RenderableViewManager.MaskManager(), (ViewManager)new RenderableViewManager.ForeignObjectManager(), (ViewManager)new RenderableViewManager.MarkerManager(), 
          (ViewManager)new SvgViewManager() });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */