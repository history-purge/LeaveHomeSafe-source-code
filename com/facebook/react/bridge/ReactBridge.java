package com.facebook.react.bridge;

public class ReactBridge {
  private static volatile boolean sDidInit = false;
  
  private static volatile long sLoadEndTime;
  
  private static volatile long sLoadStartTime;
  
  public static long getLoadEndTime() {
    return sLoadEndTime;
  }
  
  public static long getLoadStartTime() {
    return sLoadStartTime;
  }
  
  public static boolean isInitialized() {
    return sDidInit;
  }
  
  public static void staticInit() {
    // Byte code:
    //   0: ldc com/facebook/react/bridge/ReactBridge
    //   2: monitorenter
    //   3: getstatic com/facebook/react/bridge/ReactBridge.sDidInit : Z
    //   6: istore_0
    //   7: iload_0
    //   8: ifeq -> 15
    //   11: ldc com/facebook/react/bridge/ReactBridge
    //   13: monitorexit
    //   14: return
    //   15: invokestatic uptimeMillis : ()J
    //   18: putstatic com/facebook/react/bridge/ReactBridge.sLoadStartTime : J
    //   21: lconst_0
    //   22: ldc 'ReactBridge.staticInit::load:reactnativejni'
    //   24: invokestatic a : (JLjava/lang/String;)V
    //   27: getstatic com/facebook/react/bridge/ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START : Lcom/facebook/react/bridge/ReactMarkerConstants;
    //   30: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;)V
    //   33: ldc 'reactnativejni'
    //   35: invokestatic a : (Ljava/lang/String;)Z
    //   38: pop
    //   39: getstatic com/facebook/react/bridge/ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END : Lcom/facebook/react/bridge/ReactMarkerConstants;
    //   42: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;)V
    //   45: lconst_0
    //   46: invokestatic a : (J)V
    //   49: invokestatic uptimeMillis : ()J
    //   52: putstatic com/facebook/react/bridge/ReactBridge.sLoadEndTime : J
    //   55: iconst_1
    //   56: putstatic com/facebook/react/bridge/ReactBridge.sDidInit : Z
    //   59: ldc com/facebook/react/bridge/ReactBridge
    //   61: monitorexit
    //   62: return
    //   63: astore_1
    //   64: ldc com/facebook/react/bridge/ReactBridge
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    // Exception table:
    //   from	to	target	type
    //   3	7	63	finally
    //   15	59	63	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/ReactBridge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */