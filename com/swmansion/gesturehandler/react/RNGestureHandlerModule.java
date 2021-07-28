package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.q;
import e.e.o.d0.a.a;
import e.h.a.k;
import e.h.a.n;
import e.h.a.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@a(name = "RNGestureHandlerModule")
public class RNGestureHandlerModule extends ReactContextBaseJavaModule {
  private static final String KEY_DIRECTION = "direction";
  
  private static final String KEY_ENABLED = "enabled";
  
  private static final String KEY_HIT_SLOP = "hitSlop";
  
  private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
  
  private static final String KEY_HIT_SLOP_HEIGHT = "height";
  
  private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
  
  private static final String KEY_HIT_SLOP_LEFT = "left";
  
  private static final String KEY_HIT_SLOP_RIGHT = "right";
  
  private static final String KEY_HIT_SLOP_TOP = "top";
  
  private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
  
  private static final String KEY_HIT_SLOP_WIDTH = "width";
  
  private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
  
  private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
  
  private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
  
  private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
  
  private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
  
  private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
  
  private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
  
  private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
  
  private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
  
  private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
  
  private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
  
  private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
  
  private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
  
  private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
  
  private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
  
  private static final String KEY_PAN_MIN_DIST = "minDist";
  
  private static final String KEY_PAN_MIN_POINTERS = "minPointers";
  
  private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
  
  private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
  
  private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
  
  private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
  
  private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
  
  private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
  
  private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
  
  private static final String KEY_TAP_MAX_DIST = "maxDist";
  
  private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
  
  private static final String KEY_TAP_MIN_POINTERS = "minPointers";
  
  private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
  
  public static final String MODULE_NAME = "RNGestureHandlerModule";
  
  private List<Integer> mEnqueuedRootViewInit = new ArrayList<Integer>();
  
  private e.h.a.i mEventListener = new a(this);
  
  private d[] mHandlerFactories = new d[] { new f(null), new j(null), new e(null), new g(null), new h(null), new i(null), new c(null) };
  
  private d mInteractionManager = new d();
  
  private final f mRegistry = new f();
  
  private List<g> mRoots = new ArrayList<g>();
  
  public RNGestureHandlerModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  private d findFactoryForHandler(e.h.a.b paramb) {
    int j = 0;
    while (true) {
      d[] arrayOfD = this.mHandlerFactories;
      if (j < arrayOfD.length) {
        d d1 = arrayOfD[j];
        if (d1.b().equals(paramb.getClass()))
          return d1; 
        j++;
        continue;
      } 
      return null;
    } 
  }
  
  private g findRootHelperForViewAncestor(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getReactApplicationContext : ()Lcom/facebook/react/bridge/ReactApplicationContext;
    //   4: ldc com/facebook/react/uimanager/UIManagerModule
    //   6: invokevirtual getNativeModule : (Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;
    //   9: checkcast com/facebook/react/uimanager/UIManagerModule
    //   12: iload_1
    //   13: invokevirtual resolveRootTagFromReactTag : (I)I
    //   16: istore_2
    //   17: iload_2
    //   18: iconst_1
    //   19: if_icmpge -> 24
    //   22: aconst_null
    //   23: areturn
    //   24: aload_0
    //   25: getfield mRoots : Ljava/util/List;
    //   28: astore_3
    //   29: aload_3
    //   30: monitorenter
    //   31: iconst_0
    //   32: istore_1
    //   33: iload_1
    //   34: aload_0
    //   35: getfield mRoots : Ljava/util/List;
    //   38: invokeinterface size : ()I
    //   43: if_icmpge -> 93
    //   46: aload_0
    //   47: getfield mRoots : Ljava/util/List;
    //   50: iload_1
    //   51: invokeinterface get : (I)Ljava/lang/Object;
    //   56: checkcast com/swmansion/gesturehandler/react/g
    //   59: astore #4
    //   61: aload #4
    //   63: invokevirtual a : ()Landroid/view/ViewGroup;
    //   66: astore #5
    //   68: aload #5
    //   70: instanceof e/e/o/y
    //   73: ifeq -> 110
    //   76: aload #5
    //   78: checkcast e/e/o/y
    //   81: invokevirtual getRootViewTag : ()I
    //   84: iload_2
    //   85: if_icmpne -> 110
    //   88: aload_3
    //   89: monitorexit
    //   90: aload #4
    //   92: areturn
    //   93: aload_3
    //   94: monitorexit
    //   95: aconst_null
    //   96: areturn
    //   97: astore #4
    //   99: aload_3
    //   100: monitorexit
    //   101: goto -> 107
    //   104: aload #4
    //   106: athrow
    //   107: goto -> 104
    //   110: iload_1
    //   111: iconst_1
    //   112: iadd
    //   113: istore_1
    //   114: goto -> 33
    // Exception table:
    //   from	to	target	type
    //   33	90	97	finally
    //   93	95	97	finally
    //   99	101	97	finally
  }
  
  private static void handleHitSlopProperty(e.h.a.b paramb, ReadableMap paramReadableMap) {
    float f1;
    float f2;
    float f3;
    float f4;
    float f5;
    float f6;
    if (paramReadableMap.getType("hitSlop") == ReadableType.Number) {
      f1 = q.a(paramReadableMap.getDouble("hitSlop"));
      paramb.a(f1, f1, f1, f1, Float.NaN, Float.NaN);
      return;
    } 
    paramReadableMap = paramReadableMap.getMap("hitSlop");
    if (paramReadableMap.hasKey("horizontal")) {
      f3 = q.a(paramReadableMap.getDouble("horizontal"));
      f1 = f3;
    } else {
      f3 = Float.NaN;
      f1 = Float.NaN;
    } 
    if (paramReadableMap.hasKey("vertical")) {
      f2 = q.a(paramReadableMap.getDouble("vertical"));
      f4 = f2;
    } else {
      f2 = Float.NaN;
      f4 = Float.NaN;
    } 
    if (paramReadableMap.hasKey("left"))
      f3 = q.a(paramReadableMap.getDouble("left")); 
    if (paramReadableMap.hasKey("top"))
      f4 = q.a(paramReadableMap.getDouble("top")); 
    if (paramReadableMap.hasKey("right"))
      f1 = q.a(paramReadableMap.getDouble("right")); 
    if (paramReadableMap.hasKey("bottom"))
      f2 = q.a(paramReadableMap.getDouble("bottom")); 
    if (paramReadableMap.hasKey("width")) {
      f5 = q.a(paramReadableMap.getDouble("width"));
    } else {
      f5 = Float.NaN;
    } 
    if (paramReadableMap.hasKey("height")) {
      f6 = q.a(paramReadableMap.getDouble("height"));
    } else {
      f6 = Float.NaN;
    } 
    paramb.a(f3, f4, f1, f2, f5, f6);
  }
  
  private void onStateChange(e.h.a.b paramb, int paramInt1, int paramInt2) {
    if (paramb.m() < 0)
      return; 
    d d1 = findFactoryForHandler(paramb);
    ((UIManagerModule)getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().a(i.b(paramb, paramInt1, paramInt2, d1));
  }
  
  private void onTouchEvent(e.h.a.b paramb, MotionEvent paramMotionEvent) {
    if (paramb.m() < 0)
      return; 
    if (paramb.l() == 4) {
      d d1 = findFactoryForHandler(paramb);
      ((UIManagerModule)getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().a(b.b(paramb, d1));
    } 
  }
  
  private void tryInitializeHandlerForReactRootView(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getReactApplicationContext : ()Lcom/facebook/react/bridge/ReactApplicationContext;
    //   4: ldc com/facebook/react/uimanager/UIManagerModule
    //   6: invokevirtual getNativeModule : (Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;
    //   9: checkcast com/facebook/react/uimanager/UIManagerModule
    //   12: astore_3
    //   13: aload_3
    //   14: iload_1
    //   15: invokevirtual resolveRootTagFromReactTag : (I)I
    //   18: istore_2
    //   19: iload_2
    //   20: iconst_1
    //   21: if_icmplt -> 165
    //   24: aload_0
    //   25: getfield mRoots : Ljava/util/List;
    //   28: astore #4
    //   30: aload #4
    //   32: monitorenter
    //   33: iconst_0
    //   34: istore_1
    //   35: iload_1
    //   36: aload_0
    //   37: getfield mRoots : Ljava/util/List;
    //   40: invokeinterface size : ()I
    //   45: if_icmpge -> 90
    //   48: aload_0
    //   49: getfield mRoots : Ljava/util/List;
    //   52: iload_1
    //   53: invokeinterface get : (I)Ljava/lang/Object;
    //   58: checkcast com/swmansion/gesturehandler/react/g
    //   61: invokevirtual a : ()Landroid/view/ViewGroup;
    //   64: astore #5
    //   66: aload #5
    //   68: instanceof e/e/o/y
    //   71: ifeq -> 207
    //   74: aload #5
    //   76: checkcast e/e/o/y
    //   79: invokevirtual getRootViewTag : ()I
    //   82: iload_2
    //   83: if_icmpne -> 207
    //   86: aload #4
    //   88: monitorexit
    //   89: return
    //   90: aload #4
    //   92: monitorexit
    //   93: aload_0
    //   94: getfield mEnqueuedRootViewInit : Ljava/util/List;
    //   97: astore #4
    //   99: aload #4
    //   101: monitorenter
    //   102: aload_0
    //   103: getfield mEnqueuedRootViewInit : Ljava/util/List;
    //   106: iload_2
    //   107: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   110: invokeinterface contains : (Ljava/lang/Object;)Z
    //   115: ifeq -> 122
    //   118: aload #4
    //   120: monitorexit
    //   121: return
    //   122: aload_0
    //   123: getfield mEnqueuedRootViewInit : Ljava/util/List;
    //   126: iload_2
    //   127: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   130: invokeinterface add : (Ljava/lang/Object;)Z
    //   135: pop
    //   136: aload #4
    //   138: monitorexit
    //   139: aload_3
    //   140: new com/swmansion/gesturehandler/react/RNGestureHandlerModule$b
    //   143: dup
    //   144: aload_0
    //   145: iload_2
    //   146: invokespecial <init> : (Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;I)V
    //   149: invokevirtual addUIBlock : (Lcom/facebook/react/uimanager/n0;)V
    //   152: return
    //   153: astore_3
    //   154: aload #4
    //   156: monitorexit
    //   157: aload_3
    //   158: athrow
    //   159: astore_3
    //   160: aload #4
    //   162: monitorexit
    //   163: aload_3
    //   164: athrow
    //   165: new java/lang/StringBuilder
    //   168: dup
    //   169: invokespecial <init> : ()V
    //   172: astore_3
    //   173: aload_3
    //   174: ldc_w 'Could find root view for a given ancestor with tag '
    //   177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: pop
    //   181: aload_3
    //   182: iload_1
    //   183: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: new com/facebook/react/bridge/JSApplicationIllegalArgumentException
    //   190: dup
    //   191: aload_3
    //   192: invokevirtual toString : ()Ljava/lang/String;
    //   195: invokespecial <init> : (Ljava/lang/String;)V
    //   198: astore_3
    //   199: goto -> 204
    //   202: aload_3
    //   203: athrow
    //   204: goto -> 202
    //   207: iload_1
    //   208: iconst_1
    //   209: iadd
    //   210: istore_1
    //   211: goto -> 35
    // Exception table:
    //   from	to	target	type
    //   35	89	159	finally
    //   90	93	159	finally
    //   102	121	153	finally
    //   122	139	153	finally
    //   154	157	153	finally
    //   160	163	159	finally
  }
  
  @ReactMethod
  public void attachGestureHandler(int paramInt1, int paramInt2) {
    tryInitializeHandlerForReactRootView(paramInt2);
    if (this.mRegistry.a(paramInt1, paramInt2))
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Handler with tag ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" does not exists");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  @ReactMethod
  public void createGestureHandler(String paramString, int paramInt, ReadableMap paramReadableMap) {
    int j = 0;
    while (true) {
      d[] arrayOfD = this.mHandlerFactories;
      if (j < arrayOfD.length) {
        d<String> d1 = arrayOfD[j];
        if (d1.a().equals(paramString)) {
          paramString = d1.a((Context)getReactApplicationContext());
          paramString.a(paramInt);
          paramString.a(this.mEventListener);
          this.mRegistry.a((e.h.a.b)paramString);
          this.mInteractionManager.a((e.h.a.b)paramString, paramReadableMap);
          d1.a(paramString, paramReadableMap);
          return;
        } 
        j++;
        continue;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid handler name ");
      stringBuilder.append(paramString);
      JSApplicationIllegalArgumentException jSApplicationIllegalArgumentException = new JSApplicationIllegalArgumentException(stringBuilder.toString());
      throw jSApplicationIllegalArgumentException;
    } 
  }
  
  @ReactMethod
  public void dropGestureHandler(int paramInt) {
    this.mInteractionManager.a(paramInt);
    this.mRegistry.a(paramInt);
  }
  
  public Map getConstants() {
    Integer integer1 = Integer.valueOf(2);
    Integer integer2 = Integer.valueOf(4);
    Integer integer3 = Integer.valueOf(1);
    return com.facebook.react.common.f.a("State", com.facebook.react.common.f.a("UNDETERMINED", Integer.valueOf(0), "BEGAN", integer1, "ACTIVE", integer2, "CANCELLED", Integer.valueOf(3), "FAILED", integer3, "END", Integer.valueOf(5)), "Direction", com.facebook.react.common.f.a("RIGHT", integer3, "LEFT", integer1, "UP", integer2, "DOWN", Integer.valueOf(8)));
  }
  
  public String getName() {
    return "RNGestureHandlerModule";
  }
  
  public f getRegistry() {
    return this.mRegistry;
  }
  
  @ReactMethod
  public void handleClearJSResponder() {}
  
  @ReactMethod
  public void handleSetJSResponder(int paramInt, boolean paramBoolean) {
    if (this.mRegistry != null) {
      g g = findRootHelperForViewAncestor(paramInt);
      if (g != null)
        g.a(paramInt, paramBoolean); 
    } 
  }
  
  public void onCatalystInstanceDestroy() {
    this.mRegistry.a();
    this.mInteractionManager.a();
    synchronized (this.mRoots) {
      while (!this.mRoots.isEmpty()) {
        int j = this.mRoots.size();
        g g = this.mRoots.get(0);
        ViewGroup viewGroup = g.a();
        if (viewGroup instanceof a) {
          ((a)viewGroup).e();
        } else {
          g.b();
        } 
        if (this.mRoots.size() < j)
          continue; 
        throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
      } 
      super.onCatalystInstanceDestroy();
      return;
    } 
  }
  
  public void registerRootHelper(g paramg) {
    synchronized (this.mRoots) {
      if (!this.mRoots.contains(paramg)) {
        this.mRoots.add(paramg);
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Root helper");
      stringBuilder.append(paramg);
      stringBuilder.append(" already registered");
      throw new IllegalStateException(stringBuilder.toString());
    } 
  }
  
  public void unregisterRootHelper(g paramg) {
    synchronized (this.mRoots) {
      this.mRoots.remove(paramg);
      return;
    } 
  }
  
  @ReactMethod
  public void updateGestureHandler(int paramInt, ReadableMap paramReadableMap) {
    e.h.a.b b = this.mRegistry.b(paramInt);
    if (b != null) {
      d<e.h.a.b> d1 = findFactoryForHandler(b);
      if (d1 != null) {
        this.mInteractionManager.a(paramInt);
        this.mInteractionManager.a(b, paramReadableMap);
        d1.a(b, paramReadableMap);
      } 
    } 
  }
  
  class a implements e.h.a.i {
    a(RNGestureHandlerModule this$0) {}
    
    public void a(e.h.a.b param1b, int param1Int1, int param1Int2) {
      this.a.onStateChange(param1b, param1Int1, param1Int2);
    }
    
    public void a(e.h.a.b param1b, MotionEvent param1MotionEvent) {
      this.a.onTouchEvent(param1b, param1MotionEvent);
    }
  }
  
  class b implements n0 {
    b(RNGestureHandlerModule this$0, int param1Int) {}
    
    public void a(m param1m) {
      View view = param1m.b(this.a);
      if (view instanceof a)
        ((a)view).d(); 
      synchronized (this.b.mEnqueuedRootViewInit) {
        this.b.mEnqueuedRootViewInit.remove(new Integer(this.a));
        return;
      } 
    }
  }
  
  private static class c extends d<e.h.a.a> {
    private c() {
      super(null);
    }
    
    public e.h.a.a a(Context param1Context) {
      return new e.h.a.a();
    }
    
    public String a() {
      return "FlingGestureHandler";
    }
    
    public void a(e.h.a.a param1a, ReadableMap param1ReadableMap) {
      super.a(param1a, param1ReadableMap);
      if (param1ReadableMap.hasKey("numberOfPointers"))
        param1a.e(param1ReadableMap.getInt("numberOfPointers")); 
      if (param1ReadableMap.hasKey("direction"))
        param1a.d(param1ReadableMap.getInt("direction")); 
    }
    
    public void a(e.h.a.a param1a, WritableMap param1WritableMap) {
      super.a(param1a, param1WritableMap);
      param1WritableMap.putDouble("x", q.a(param1a.i()));
      param1WritableMap.putDouble("y", q.a(param1a.j()));
      param1WritableMap.putDouble("absoluteX", q.a(param1a.g()));
      param1WritableMap.putDouble("absoluteY", q.a(param1a.h()));
    }
    
    public Class<e.h.a.a> b() {
      return e.h.a.a.class;
    }
  }
  
  private static abstract class d<T extends e.h.a.b> implements c<T> {
    private d() {}
    
    public abstract T a(Context param1Context);
    
    public abstract String a();
    
    public void a(T param1T, ReadableMap param1ReadableMap) {
      if (param1ReadableMap.hasKey("shouldCancelWhenOutside"))
        param1T.b(param1ReadableMap.getBoolean("shouldCancelWhenOutside")); 
      if (param1ReadableMap.hasKey("enabled"))
        param1T.a(param1ReadableMap.getBoolean("enabled")); 
      if (param1ReadableMap.hasKey("hitSlop"))
        RNGestureHandlerModule.handleHitSlopProperty((e.h.a.b)param1T, param1ReadableMap); 
    }
    
    public void a(T param1T, WritableMap param1WritableMap) {
      param1WritableMap.putDouble("numberOfPointers", param1T.k());
    }
    
    public abstract Class<T> b();
  }
  
  private static class e extends d<e.h.a.g> {
    private e() {
      super(null);
    }
    
    public e.h.a.g a(Context param1Context) {
      return new e.h.a.g(param1Context);
    }
    
    public String a() {
      return "LongPressGestureHandler";
    }
    
    public void a(e.h.a.g param1g, ReadableMap param1ReadableMap) {
      super.a(param1g, param1ReadableMap);
      if (param1ReadableMap.hasKey("minDurationMs"))
        param1g.a(param1ReadableMap.getInt("minDurationMs")); 
      if (param1ReadableMap.hasKey("maxDist"))
        param1g.a(q.a(param1ReadableMap.getDouble("maxDist"))); 
    }
    
    public void a(e.h.a.g param1g, WritableMap param1WritableMap) {
      super.a(param1g, param1WritableMap);
      param1WritableMap.putDouble("x", q.a(param1g.i()));
      param1WritableMap.putDouble("y", q.a(param1g.j()));
      param1WritableMap.putDouble("absoluteX", q.a(param1g.g()));
      param1WritableMap.putDouble("absoluteY", q.a(param1g.h()));
    }
    
    public Class<e.h.a.g> b() {
      return e.h.a.g.class;
    }
  }
  
  private static class f extends d<e.h.a.h> {
    private f() {
      super(null);
    }
    
    public e.h.a.h a(Context param1Context) {
      return new e.h.a.h();
    }
    
    public String a() {
      return "NativeViewGestureHandler";
    }
    
    public void a(e.h.a.h param1h, ReadableMap param1ReadableMap) {
      super.a(param1h, param1ReadableMap);
      if (param1ReadableMap.hasKey("shouldActivateOnStart"))
        param1h.d(param1ReadableMap.getBoolean("shouldActivateOnStart")); 
      if (param1ReadableMap.hasKey("disallowInterruption"))
        param1h.c(param1ReadableMap.getBoolean("disallowInterruption")); 
    }
    
    public void a(e.h.a.h param1h, WritableMap param1WritableMap) {
      super.a(param1h, param1WritableMap);
      param1WritableMap.putBoolean("pointerInside", param1h.p());
    }
    
    public Class<e.h.a.h> b() {
      return e.h.a.h.class;
    }
  }
  
  private static class g extends d<e.h.a.j> {
    private g() {
      super(null);
    }
    
    public e.h.a.j a(Context param1Context) {
      return new e.h.a.j(param1Context);
    }
    
    public String a() {
      return "PanGestureHandler";
    }
    
    public void a(e.h.a.j param1j, ReadableMap param1ReadableMap) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: aload_2
      //   3: invokespecial a : (Le/h/a/b;Lcom/facebook/react/bridge/ReadableMap;)V
      //   6: aload_2
      //   7: ldc 'activeOffsetXStart'
      //   9: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   14: ifeq -> 39
      //   17: aload_1
      //   18: aload_2
      //   19: ldc 'activeOffsetXStart'
      //   21: invokeinterface getDouble : (Ljava/lang/String;)D
      //   26: invokestatic a : (D)F
      //   29: invokevirtual b : (F)Le/h/a/j;
      //   32: pop
      //   33: iconst_1
      //   34: istore #4
      //   36: goto -> 42
      //   39: iconst_0
      //   40: istore #4
      //   42: aload_2
      //   43: ldc 'activeOffsetXEnd'
      //   45: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   50: ifeq -> 72
      //   53: aload_1
      //   54: aload_2
      //   55: ldc 'activeOffsetXEnd'
      //   57: invokeinterface getDouble : (Ljava/lang/String;)D
      //   62: invokestatic a : (D)F
      //   65: invokevirtual a : (F)Le/h/a/j;
      //   68: pop
      //   69: iconst_1
      //   70: istore #4
      //   72: aload_2
      //   73: ldc 'failOffsetXStart'
      //   75: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   80: ifeq -> 102
      //   83: aload_1
      //   84: aload_2
      //   85: ldc 'failOffsetXStart'
      //   87: invokeinterface getDouble : (Ljava/lang/String;)D
      //   92: invokestatic a : (D)F
      //   95: invokevirtual f : (F)Le/h/a/j;
      //   98: pop
      //   99: iconst_1
      //   100: istore #4
      //   102: aload_2
      //   103: ldc 'failOffsetXEnd'
      //   105: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   110: ifeq -> 132
      //   113: aload_1
      //   114: aload_2
      //   115: ldc 'failOffsetXEnd'
      //   117: invokeinterface getDouble : (Ljava/lang/String;)D
      //   122: invokestatic a : (D)F
      //   125: invokevirtual e : (F)Le/h/a/j;
      //   128: pop
      //   129: iconst_1
      //   130: istore #4
      //   132: aload_2
      //   133: ldc 'activeOffsetYStart'
      //   135: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   140: ifeq -> 162
      //   143: aload_1
      //   144: aload_2
      //   145: ldc 'activeOffsetYStart'
      //   147: invokeinterface getDouble : (Ljava/lang/String;)D
      //   152: invokestatic a : (D)F
      //   155: invokevirtual d : (F)Le/h/a/j;
      //   158: pop
      //   159: iconst_1
      //   160: istore #4
      //   162: aload_2
      //   163: ldc 'activeOffsetYEnd'
      //   165: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   170: ifeq -> 192
      //   173: aload_1
      //   174: aload_2
      //   175: ldc 'activeOffsetYEnd'
      //   177: invokeinterface getDouble : (Ljava/lang/String;)D
      //   182: invokestatic a : (D)F
      //   185: invokevirtual c : (F)Le/h/a/j;
      //   188: pop
      //   189: iconst_1
      //   190: istore #4
      //   192: aload_2
      //   193: ldc 'failOffsetYStart'
      //   195: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   200: ifeq -> 222
      //   203: aload_1
      //   204: aload_2
      //   205: ldc 'failOffsetYStart'
      //   207: invokeinterface getDouble : (Ljava/lang/String;)D
      //   212: invokestatic a : (D)F
      //   215: invokevirtual h : (F)Le/h/a/j;
      //   218: pop
      //   219: iconst_1
      //   220: istore #4
      //   222: aload_2
      //   223: ldc 'failOffsetYEnd'
      //   225: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   230: ifeq -> 252
      //   233: aload_1
      //   234: aload_2
      //   235: ldc 'failOffsetYEnd'
      //   237: invokeinterface getDouble : (Ljava/lang/String;)D
      //   242: invokestatic a : (D)F
      //   245: invokevirtual g : (F)Le/h/a/j;
      //   248: pop
      //   249: iconst_1
      //   250: istore #4
      //   252: aload_2
      //   253: ldc 'minVelocity'
      //   255: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   260: ifeq -> 282
      //   263: aload_1
      //   264: aload_2
      //   265: ldc 'minVelocity'
      //   267: invokeinterface getDouble : (Ljava/lang/String;)D
      //   272: invokestatic a : (D)F
      //   275: invokevirtual j : (F)Le/h/a/j;
      //   278: pop
      //   279: iconst_1
      //   280: istore #4
      //   282: aload_2
      //   283: ldc 'minVelocityX'
      //   285: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   290: ifeq -> 312
      //   293: aload_1
      //   294: aload_2
      //   295: ldc 'minVelocityX'
      //   297: invokeinterface getDouble : (Ljava/lang/String;)D
      //   302: invokestatic a : (D)F
      //   305: invokevirtual k : (F)Le/h/a/j;
      //   308: pop
      //   309: iconst_1
      //   310: istore #4
      //   312: aload_2
      //   313: ldc 'minVelocityY'
      //   315: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   320: ifeq -> 342
      //   323: aload_1
      //   324: aload_2
      //   325: ldc 'minVelocityY'
      //   327: invokeinterface getDouble : (Ljava/lang/String;)D
      //   332: invokestatic a : (D)F
      //   335: invokevirtual l : (F)Le/h/a/j;
      //   338: pop
      //   339: iconst_1
      //   340: istore #4
      //   342: aload_2
      //   343: ldc 'minDist'
      //   345: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   350: ifeq -> 374
      //   353: aload_2
      //   354: ldc 'minDist'
      //   356: invokeinterface getDouble : (Ljava/lang/String;)D
      //   361: invokestatic a : (D)F
      //   364: fstore_3
      //   365: aload_1
      //   366: fload_3
      //   367: invokevirtual i : (F)Le/h/a/j;
      //   370: pop
      //   371: goto -> 385
      //   374: iload #4
      //   376: ifeq -> 385
      //   379: ldc 3.4028235E38
      //   381: fstore_3
      //   382: goto -> 365
      //   385: aload_2
      //   386: ldc 'minPointers'
      //   388: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   393: ifeq -> 409
      //   396: aload_1
      //   397: aload_2
      //   398: ldc 'minPointers'
      //   400: invokeinterface getInt : (Ljava/lang/String;)I
      //   405: invokevirtual e : (I)Le/h/a/j;
      //   408: pop
      //   409: aload_2
      //   410: ldc 'maxPointers'
      //   412: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   417: ifeq -> 433
      //   420: aload_1
      //   421: aload_2
      //   422: ldc 'maxPointers'
      //   424: invokeinterface getInt : (Ljava/lang/String;)I
      //   429: invokevirtual d : (I)Le/h/a/j;
      //   432: pop
      //   433: aload_2
      //   434: ldc 'avgTouches'
      //   436: invokeinterface hasKey : (Ljava/lang/String;)Z
      //   441: ifeq -> 457
      //   444: aload_1
      //   445: aload_2
      //   446: ldc 'avgTouches'
      //   448: invokeinterface getBoolean : (Ljava/lang/String;)Z
      //   453: invokevirtual c : (Z)Le/h/a/j;
      //   456: pop
      //   457: return
    }
    
    public void a(e.h.a.j param1j, WritableMap param1WritableMap) {
      super.a(param1j, param1WritableMap);
      param1WritableMap.putDouble("x", q.a(param1j.i()));
      param1WritableMap.putDouble("y", q.a(param1j.j()));
      param1WritableMap.putDouble("absoluteX", q.a(param1j.g()));
      param1WritableMap.putDouble("absoluteY", q.a(param1j.h()));
      param1WritableMap.putDouble("translationX", q.a(param1j.u()));
      param1WritableMap.putDouble("translationY", q.a(param1j.v()));
      param1WritableMap.putDouble("velocityX", q.a(param1j.w()));
      param1WritableMap.putDouble("velocityY", q.a(param1j.x()));
    }
    
    public Class<e.h.a.j> b() {
      return e.h.a.j.class;
    }
  }
  
  private static class h extends d<k> {
    private h() {
      super(null);
    }
    
    public k a(Context param1Context) {
      return new k();
    }
    
    public String a() {
      return "PinchGestureHandler";
    }
    
    public void a(k param1k, WritableMap param1WritableMap) {
      super.a(param1k, param1WritableMap);
      param1WritableMap.putDouble("scale", param1k.w());
      param1WritableMap.putDouble("focalX", q.a(param1k.u()));
      param1WritableMap.putDouble("focalY", q.a(param1k.v()));
      param1WritableMap.putDouble("velocity", param1k.x());
    }
    
    public Class<k> b() {
      return k.class;
    }
  }
  
  private static class i extends d<n> {
    private i() {
      super(null);
    }
    
    public n a(Context param1Context) {
      return new n();
    }
    
    public String a() {
      return "RotationGestureHandler";
    }
    
    public void a(n param1n, WritableMap param1WritableMap) {
      super.a(param1n, param1WritableMap);
      param1WritableMap.putDouble("rotation", param1n.w());
      param1WritableMap.putDouble("anchorX", q.a(param1n.u()));
      param1WritableMap.putDouble("anchorY", q.a(param1n.v()));
      param1WritableMap.putDouble("velocity", param1n.x());
    }
    
    public Class<n> b() {
      return n.class;
    }
  }
  
  private static class j extends d<o> {
    private j() {
      super(null);
    }
    
    public o a(Context param1Context) {
      return new o();
    }
    
    public String a() {
      return "TapGestureHandler";
    }
    
    public void a(o param1o, ReadableMap param1ReadableMap) {
      super.a(param1o, param1ReadableMap);
      if (param1ReadableMap.hasKey("numberOfTaps"))
        param1o.e(param1ReadableMap.getInt("numberOfTaps")); 
      if (param1ReadableMap.hasKey("maxDurationMs"))
        param1o.b(param1ReadableMap.getInt("maxDurationMs")); 
      if (param1ReadableMap.hasKey("maxDelayMs"))
        param1o.a(param1ReadableMap.getInt("maxDelayMs")); 
      if (param1ReadableMap.hasKey("maxDeltaX"))
        param1o.b(q.a(param1ReadableMap.getDouble("maxDeltaX"))); 
      if (param1ReadableMap.hasKey("maxDeltaY"))
        param1o.c(q.a(param1ReadableMap.getDouble("maxDeltaY"))); 
      if (param1ReadableMap.hasKey("maxDist"))
        param1o.a(q.a(param1ReadableMap.getDouble("maxDist"))); 
      if (param1ReadableMap.hasKey("minPointers"))
        param1o.d(param1ReadableMap.getInt("minPointers")); 
    }
    
    public void a(o param1o, WritableMap param1WritableMap) {
      super.a(param1o, param1WritableMap);
      param1WritableMap.putDouble("x", q.a(param1o.i()));
      param1WritableMap.putDouble("y", q.a(param1o.j()));
      param1WritableMap.putDouble("absoluteX", q.a(param1o.g()));
      param1WritableMap.putDouble("absoluteY", q.a(param1o.h()));
    }
    
    public Class<o> b() {
      return o.class;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/gesturehandler/react/RNGestureHandlerModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */