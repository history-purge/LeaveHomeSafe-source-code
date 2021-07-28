package com.facebook.react.bridge;

public class JSIModuleHolder {
  private JSIModule mModule;
  
  private final JSIModuleSpec mSpec;
  
  public JSIModuleHolder(JSIModuleSpec paramJSIModuleSpec) {
    this.mSpec = paramJSIModuleSpec;
  }
  
  public JSIModule getJSIModule() {
    // Byte code:
    //   0: aload_0
    //   1: getfield mModule : Lcom/facebook/react/bridge/JSIModule;
    //   4: ifnonnull -> 62
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield mModule : Lcom/facebook/react/bridge/JSIModule;
    //   13: ifnull -> 25
    //   16: aload_0
    //   17: getfield mModule : Lcom/facebook/react/bridge/JSIModule;
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: areturn
    //   25: aload_0
    //   26: aload_0
    //   27: getfield mSpec : Lcom/facebook/react/bridge/JSIModuleSpec;
    //   30: invokeinterface getJSIModuleProvider : ()Lcom/facebook/react/bridge/JSIModuleProvider;
    //   35: invokeinterface get : ()Lcom/facebook/react/bridge/JSIModule;
    //   40: putfield mModule : Lcom/facebook/react/bridge/JSIModule;
    //   43: aload_0
    //   44: getfield mModule : Lcom/facebook/react/bridge/JSIModule;
    //   47: invokeinterface initialize : ()V
    //   52: aload_0
    //   53: monitorexit
    //   54: goto -> 62
    //   57: astore_1
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    //   62: aload_0
    //   63: getfield mModule : Lcom/facebook/react/bridge/JSIModule;
    //   66: areturn
    // Exception table:
    //   from	to	target	type
    //   9	23	57	finally
    //   25	54	57	finally
    //   58	60	57	finally
  }
  
  public void notifyJSInstanceDestroy() {
    JSIModule jSIModule = this.mModule;
    if (jSIModule != null)
      jSIModule.onCatalystInstanceDestroy(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/JSIModuleHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */