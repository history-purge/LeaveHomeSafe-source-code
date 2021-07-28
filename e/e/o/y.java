package e.e.o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.g;
import com.facebook.react.uimanager.h;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.y;

public class y extends FrameLayout implements f0, y {
  private r c;
  
  private String d;
  
  private Bundle e;
  
  private String f;
  
  private a g;
  
  private b h;
  
  private int i;
  
  private boolean j;
  
  private boolean k;
  
  private h l;
  
  private final o m = new o(this);
  
  private boolean n = false;
  
  private int o = View.MeasureSpec.makeMeasureSpec(0, 0);
  
  private int p = View.MeasureSpec.makeMeasureSpec(0, 0);
  
  private int q = 0;
  
  private int r = 0;
  
  private int s = 1;
  
  private final boolean t = false;
  
  public y(Context paramContext) {
    super(paramContext);
    e();
  }
  
  private void a(int paramInt1, int paramInt2) {
    r r1 = this.c;
    if (r1 == null) {
      e.e.e.e.a.e("ReactRootView", "Unable to update root layout specs for uninitialized ReactInstanceManager");
      return;
    } 
    ReactContext reactContext = r1.b();
    if (reactContext != null) {
      UIManager uIManager = q0.c(reactContext, getUIManagerType());
      if (uIManager != null)
        uIManager.updateRootLayoutSpecs(getRootViewTag(), paramInt1, paramInt2); 
    } 
  }
  
  private void b(MotionEvent paramMotionEvent) {
    r r1 = this.c;
    if (r1 == null || !this.j || r1.b() == null) {
      e.e.e.e.a.e("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
      return;
    } 
    if (this.l == null) {
      e.e.e.e.a.e("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
      return;
    } 
    d d = ((UIManagerModule)this.c.b().getNativeModule(UIManagerModule.class)).getEventDispatcher();
    this.l.a(paramMotionEvent, d);
  }
  
  private void d() {
    com.facebook.systrace.a.a(0L, "attachToReactInstanceManager");
    if (this.j)
      return; 
    try {
      this.j = true;
      r r1 = this.c;
      e.e.m.a.a.a(r1);
      r1.a(this);
      getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
      return;
    } finally {
      com.facebook.systrace.a.a(0L);
    } 
  }
  
  private void e() {
    setClipChildren(false);
  }
  
  private void f() {
    getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
  }
  
  private a getCustomGlobalLayoutListener() {
    if (this.g == null)
      this.g = new a(this); 
    return this.g;
  }
  
  public void a() {
    com.facebook.systrace.a.a(0L, "ReactRootView.runApplication");
    try {
      if (this.c == null || !this.j)
        return; 
      ReactContext reactContext = this.c.b();
      if (reactContext == null)
        return; 
      CatalystInstance catalystInstance = reactContext.getCatalystInstance();
      String str = getJSModuleName();
      if (!this.t) {
        if (this.n)
          a(this.o, this.p); 
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("rootTag", getRootViewTag());
        Bundle bundle = getAppProperties();
        if (bundle != null)
          writableNativeMap.putMap("initialProps", (ReadableMap)Arguments.fromBundle(bundle)); 
        this.k = true;
        e.e.e.e.a.b("ReactRootView", "runApplication: call AppRegistry.runApplication");
        ((AppRegistry)catalystInstance.getJSModule(AppRegistry.class)).runApplication(str, (WritableMap)writableNativeMap);
      } 
      return;
    } finally {
      com.facebook.systrace.a.a(0L);
    } 
  }
  
  public void a(int paramInt) {
    if (paramInt != 101)
      return; 
    b();
  }
  
  public void a(MotionEvent paramMotionEvent) {
    r r1 = this.c;
    if (r1 == null || !this.j || r1.b() == null) {
      e.e.e.e.a.e("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
      return;
    } 
    if (this.l == null) {
      e.e.e.e.a.e("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
      return;
    } 
    d d = ((UIManagerModule)this.c.b().getNativeModule(UIManagerModule.class)).getEventDispatcher();
    this.l.b(paramMotionEvent, d);
  }
  
  public void a(r paramr, String paramString, Bundle paramBundle) {
    a(paramr, paramString, paramBundle, null);
  }
  
  public void a(r paramr, String paramString1, Bundle paramBundle, String paramString2) {
    com.facebook.systrace.a.a(0L, "startReactApplication");
  }
  
  void a(String paramString, WritableMap paramWritableMap) {
    r r1 = this.c;
    if (r1 != null)
      ((DeviceEventManagerModule.RCTDeviceEventEmitter)r1.b().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(paramString, paramWritableMap); 
  }
  
  public void a(Throwable paramThrowable) {
    g g;
    r r1 = this.c;
    if (r1 != null && r1.b() != null) {
      g = new g(paramThrowable.getMessage(), (View)this, paramThrowable);
      this.c.b().handleException((Exception)g);
      return;
    } 
    throw new RuntimeException(g);
  }
  
  public void b() {
    this.l = new h((ViewGroup)this);
    b b1 = this.h;
    if (b1 != null)
      b1.a(this); 
  }
  
  public void c() {
    UiThreadUtil.assertOnUiThread();
    r r1 = this.c;
    if (r1 != null && this.j) {
      r1.b(this);
      this.j = false;
    } 
    this.c = null;
    this.k = false;
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {
    try {
      super.dispatchDraw(paramCanvas);
      return;
    } catch (StackOverflowError stackOverflowError) {
      a(stackOverflowError);
      return;
    } 
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    r r1 = this.c;
    if (r1 == null || !this.j || r1.b() == null) {
      e.e.e.e.a.e("ReactRootView", "Unable to handle key event as the catalyst instance has not been attached");
      return super.dispatchKeyEvent(paramKeyEvent);
    } 
    this.m.a(paramKeyEvent);
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  protected void finalize() {
    super.finalize();
    e.e.m.a.a.a(this.j ^ true, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
  }
  
  public Bundle getAppProperties() {
    return this.e;
  }
  
  public int getHeightMeasureSpec() {
    return this.p;
  }
  
  public String getInitialUITemplate() {
    return this.f;
  }
  
  public String getJSModuleName() {
    String str = this.d;
    e.e.m.a.a.a(str);
    return str;
  }
  
  public r getReactInstanceManager() {
    return this.c;
  }
  
  public ViewGroup getRootViewGroup() {
    return (ViewGroup)this;
  }
  
  public int getRootViewTag() {
    return this.i;
  }
  
  public String getSurfaceID() {
    Bundle bundle = getAppProperties();
    return (bundle != null) ? bundle.getString("surfaceID") : null;
  }
  
  public int getUIManagerType() {
    return this.s;
  }
  
  public int getWidthMeasureSpec() {
    return this.o;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.j) {
      f();
      getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    } 
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if (this.j)
      f(); 
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect) {
    r r1 = this.c;
    if (r1 == null || !this.j || r1.b() == null) {
      e.e.e.e.a.e("ReactRootView", "Unable to handle focus changed event as the catalyst instance has not been attached");
    } else {
      this.m.a();
    } 
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    b(paramMotionEvent);
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.t)
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (this.t) {
      super.onMeasure(paramInt1, paramInt2);
      return;
    } 
    com.facebook.systrace.a.a(0L, "ReactRootView.onMeasure");
    try {
      int i = this.o;
      int k = 0;
      if (paramInt1 != i || paramInt2 != this.p) {
        i = 1;
      } else {
        i = 0;
      } 
      this.o = paramInt1;
      this.p = paramInt2;
      int j = View.MeasureSpec.getMode(paramInt1);
      if (j == Integer.MIN_VALUE || j == 0) {
        j = 0;
        paramInt1 = 0;
        while (j < getChildCount()) {
          View view = getChildAt(j);
          paramInt1 = Math.max(paramInt1, view.getLeft() + view.getMeasuredWidth() + view.getPaddingLeft() + view.getPaddingRight());
          j++;
        } 
        j = paramInt1;
      } else {
        j = View.MeasureSpec.getSize(paramInt1);
      } 
      paramInt1 = View.MeasureSpec.getMode(paramInt2);
      if (paramInt1 == Integer.MIN_VALUE || paramInt1 == 0) {
        paramInt1 = 0;
        paramInt2 = k;
        while (true) {
          k = paramInt1;
          if (paramInt2 < getChildCount()) {
            View view = getChildAt(paramInt2);
            paramInt1 = Math.max(paramInt1, view.getTop() + view.getMeasuredHeight() + view.getPaddingTop() + view.getPaddingBottom());
            paramInt2++;
            continue;
          } 
          break;
        } 
      } else {
        k = View.MeasureSpec.getSize(paramInt2);
      } 
      setMeasuredDimension(j, k);
      this.n = true;
      if (this.c != null && !this.j) {
        d();
      } else if (i != 0 || this.q != j || this.r != k) {
        a(this.o, this.p);
      } 
      this.q = j;
      this.r = k;
      return;
    } finally {
      com.facebook.systrace.a.a(0L);
    } 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    b(paramMotionEvent);
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void onViewAdded(View paramView) {
    super.onViewAdded(paramView);
    if (this.k) {
      this.k = false;
      String str = this.d;
      if (str != null)
        ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, str, this.i); 
    } 
  }
  
  public void requestChildFocus(View paramView1, View paramView2) {
    r r1 = this.c;
    if (r1 == null || !this.j || r1.b() == null) {
      e.e.e.e.a.e("ReactRootView", "Unable to handle child focus changed event as the catalyst instance has not been attached");
    } else {
      this.m.a(paramView2);
    } 
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    if (getParent() != null)
      getParent().requestDisallowInterceptTouchEvent(paramBoolean); 
  }
  
  public void setAppProperties(Bundle paramBundle) {
    UiThreadUtil.assertOnUiThread();
    this.e = paramBundle;
    if (getRootViewTag() != 0)
      a(); 
  }
  
  public void setEventListener(b paramb) {
    this.h = paramb;
  }
  
  public void setIsFabric(boolean paramBoolean) {
    boolean bool;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = true;
    } 
    this.s = bool;
  }
  
  public void setRootViewTag(int paramInt) {
    this.i = paramInt;
  }
  
  public void setShouldLogContentAppeared(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  private class a implements ViewTreeObserver.OnGlobalLayoutListener {
    private final Rect c;
    
    private final int d;
    
    private int e = 0;
    
    private int f = 0;
    
    a(y this$0) {
      c.b(this$0.getContext().getApplicationContext());
      this.c = new Rect();
      this.d = (int)q.b(60.0F);
    }
    
    private WritableMap a(double param1Double1, double param1Double2, double param1Double3, double param1Double4) {
      WritableMap writableMap1 = Arguments.createMap();
      WritableMap writableMap2 = Arguments.createMap();
      writableMap2.putDouble("height", param1Double4);
      writableMap2.putDouble("screenX", param1Double2);
      writableMap2.putDouble("width", param1Double3);
      writableMap2.putDouble("screenY", param1Double1);
      writableMap1.putMap("endCoordinates", (ReadableMap)writableMap2);
      writableMap1.putString("easing", "keyboard");
      writableMap1.putDouble("duration", 0.0D);
      return writableMap1;
    }
    
    private void a() {
      d();
    }
    
    private void a(int param1Int) {
      double d;
      String str;
      boolean bool = true;
      if (param1Int != 0) {
        if (param1Int != 1) {
          if (param1Int != 2) {
            if (param1Int != 3)
              return; 
            d = 90.0D;
            str = "landscape-secondary";
          } else {
            d = 180.0D;
            str = "portrait-secondary";
            bool = false;
          } 
        } else {
          d = -90.0D;
          str = "landscape-primary";
        } 
      } else {
        d = 0.0D;
        str = "portrait-primary";
        bool = false;
      } 
      WritableMap writableMap = Arguments.createMap();
      writableMap.putString("name", str);
      writableMap.putDouble("rotationDegrees", d);
      writableMap.putBoolean("isLandscape", bool);
      this.g.a("namedOrientationDidChange", writableMap);
    }
    
    private void b() {
      int i = ((WindowManager)this.g.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
      if (this.f == i)
        return; 
      this.f = i;
      a(i);
    }
    
    private void c() {
      this.g.getRootView().getWindowVisibleDisplayFrame(this.c);
      int j = (c.b()).heightPixels - this.c.bottom;
      int i = this.e;
      boolean bool = true;
      if (i != j && j > this.d) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i != 0) {
        this.e = j;
        this.g.a("keyboardDidShow", a(q.a(this.c.bottom), q.a(this.c.left), q.a(this.c.width()), q.a(this.e)));
        return;
      } 
      if (this.e != 0 && j <= this.d) {
        i = bool;
      } else {
        i = 0;
      } 
      if (i != 0) {
        this.e = 0;
        this.g.a("keyboardDidHide", a(q.a(this.c.height()), 0.0D, q.a(this.c.width()), 0.0D));
      } 
    }
    
    private void d() {
      ((DeviceInfoModule)y.a(this.g).b().getNativeModule(DeviceInfoModule.class)).emitUpdateDimensionsEvent();
    }
    
    public void onGlobalLayout() {
      if (y.a(this.g) != null && y.b(this.g)) {
        if (y.a(this.g).b() == null)
          return; 
        c();
        b();
        a();
      } 
    }
  }
  
  public static interface b {
    void a(y param1y);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */