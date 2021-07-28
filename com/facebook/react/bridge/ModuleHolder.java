package com.facebook.react.bridge;

import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.a;
import e.e.h.b.c;
import e.e.h.c.a;
import e.e.n.a.a;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;

@a
public class ModuleHolder {
  private static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);
  
  private boolean mInitializable;
  
  private final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
  
  private boolean mIsCreating;
  
  private boolean mIsInitializing;
  
  private NativeModule mModule;
  
  private final String mName;
  
  private Provider<? extends NativeModule> mProvider;
  
  private final ReactModuleInfo mReactModuleInfo;
  
  public ModuleHolder(NativeModule paramNativeModule) {
    this.mName = paramNativeModule.getName();
    this.mReactModuleInfo = new ReactModuleInfo(paramNativeModule.getName(), paramNativeModule.getClass().getSimpleName(), paramNativeModule.canOverrideExistingModule(), true, true, CxxModuleWrapper.class.isAssignableFrom(paramNativeModule.getClass()), a.class.isAssignableFrom(paramNativeModule.getClass()));
    this.mModule = paramNativeModule;
    c.a().a(a.c, "NativeModule init: %s", new Object[] { this.mName });
  }
  
  public ModuleHolder(ReactModuleInfo paramReactModuleInfo, Provider<? extends NativeModule> paramProvider) {
    this.mName = paramReactModuleInfo.f();
    this.mProvider = paramProvider;
    this.mReactModuleInfo = paramReactModuleInfo;
    if (paramReactModuleInfo.g())
      this.mModule = create(); 
  }
  
  private NativeModule create() {
    // Byte code:
    //   0: aload_0
    //   1: getfield mModule : Lcom/facebook/react/bridge/NativeModule;
    //   4: astore_3
    //   5: iconst_1
    //   6: istore_1
    //   7: aload_3
    //   8: ifnonnull -> 16
    //   11: iconst_1
    //   12: istore_2
    //   13: goto -> 18
    //   16: iconst_0
    //   17: istore_2
    //   18: iload_2
    //   19: ldc 'Creating an already created module.'
    //   21: invokestatic assertCondition : (ZLjava/lang/String;)V
    //   24: getstatic com/facebook/react/bridge/ReactMarkerConstants.CREATE_MODULE_START : Lcom/facebook/react/bridge/ReactMarkerConstants;
    //   27: aload_0
    //   28: getfield mName : Ljava/lang/String;
    //   31: aload_0
    //   32: getfield mInstanceKey : I
    //   35: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    //   38: lconst_0
    //   39: ldc 'ModuleHolder.createModule'
    //   41: invokestatic a : (JLjava/lang/String;)Lcom/facebook/systrace/b$b;
    //   44: astore_3
    //   45: aload_3
    //   46: ldc 'name'
    //   48: aload_0
    //   49: getfield mName : Ljava/lang/String;
    //   52: invokevirtual a : (Ljava/lang/String;Ljava/lang/Object;)Lcom/facebook/systrace/b$b;
    //   55: pop
    //   56: aload_3
    //   57: invokevirtual a : ()V
    //   60: invokestatic a : ()Le/e/h/b/b;
    //   63: getstatic e/e/h/c/a.c : Le/e/h/a/a/a;
    //   66: ldc 'NativeModule init: %s'
    //   68: iconst_1
    //   69: anewarray java/lang/Object
    //   72: dup
    //   73: iconst_0
    //   74: aload_0
    //   75: getfield mName : Ljava/lang/String;
    //   78: aastore
    //   79: invokeinterface a : (Le/e/h/a/a/a;Ljava/lang/String;[Ljava/lang/Object;)V
    //   84: aload_0
    //   85: getfield mProvider : Ljavax/inject/Provider;
    //   88: astore_3
    //   89: aload_3
    //   90: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   93: pop
    //   94: aload_3
    //   95: checkcast javax/inject/Provider
    //   98: invokeinterface get : ()Ljava/lang/Object;
    //   103: checkcast com/facebook/react/bridge/NativeModule
    //   106: astore_3
    //   107: aload_0
    //   108: aconst_null
    //   109: putfield mProvider : Ljavax/inject/Provider;
    //   112: aload_0
    //   113: monitorenter
    //   114: aload_0
    //   115: aload_3
    //   116: putfield mModule : Lcom/facebook/react/bridge/NativeModule;
    //   119: aload_0
    //   120: getfield mInitializable : Z
    //   123: ifeq -> 248
    //   126: aload_0
    //   127: getfield mIsInitializing : Z
    //   130: ifne -> 248
    //   133: goto -> 136
    //   136: aload_0
    //   137: monitorexit
    //   138: iload_1
    //   139: ifeq -> 147
    //   142: aload_0
    //   143: aload_3
    //   144: invokespecial doInitialize : (Lcom/facebook/react/bridge/NativeModule;)V
    //   147: getstatic com/facebook/react/bridge/ReactMarkerConstants.CREATE_MODULE_END : Lcom/facebook/react/bridge/ReactMarkerConstants;
    //   150: aload_0
    //   151: getfield mName : Ljava/lang/String;
    //   154: aload_0
    //   155: getfield mInstanceKey : I
    //   158: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    //   161: lconst_0
    //   162: invokestatic a : (J)Lcom/facebook/systrace/b$b;
    //   165: invokevirtual a : ()V
    //   168: aload_3
    //   169: areturn
    //   170: astore_3
    //   171: aload_0
    //   172: monitorexit
    //   173: aload_3
    //   174: athrow
    //   175: astore_3
    //   176: new java/lang/StringBuilder
    //   179: dup
    //   180: invokespecial <init> : ()V
    //   183: astore #4
    //   185: aload #4
    //   187: ldc 'Failed to create NativeModule "'
    //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: pop
    //   193: aload #4
    //   195: aload_0
    //   196: invokevirtual getName : ()Ljava/lang/String;
    //   199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: pop
    //   203: aload #4
    //   205: ldc '"'
    //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: pop
    //   211: ldc 'NativeModuleInitError'
    //   213: aload #4
    //   215: invokevirtual toString : ()Ljava/lang/String;
    //   218: aload_3
    //   219: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   222: aload_3
    //   223: athrow
    //   224: astore_3
    //   225: getstatic com/facebook/react/bridge/ReactMarkerConstants.CREATE_MODULE_END : Lcom/facebook/react/bridge/ReactMarkerConstants;
    //   228: aload_0
    //   229: getfield mName : Ljava/lang/String;
    //   232: aload_0
    //   233: getfield mInstanceKey : I
    //   236: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    //   239: lconst_0
    //   240: invokestatic a : (J)Lcom/facebook/systrace/b$b;
    //   243: invokevirtual a : ()V
    //   246: aload_3
    //   247: athrow
    //   248: iconst_0
    //   249: istore_1
    //   250: goto -> 136
    // Exception table:
    //   from	to	target	type
    //   84	114	175	finally
    //   114	133	170	finally
    //   136	138	170	finally
    //   142	147	175	finally
    //   171	173	170	finally
    //   173	175	175	finally
    //   176	224	224	finally
  }
  
  private void doInitialize(NativeModule paramNativeModule) {
    // Byte code:
    //   0: lconst_0
    //   1: ldc 'ModuleHolder.initialize'
    //   3: invokestatic a : (JLjava/lang/String;)Lcom/facebook/systrace/b$b;
    //   6: astore #4
    //   8: aload #4
    //   10: ldc 'name'
    //   12: aload_0
    //   13: getfield mName : Ljava/lang/String;
    //   16: invokevirtual a : (Ljava/lang/String;Ljava/lang/Object;)Lcom/facebook/systrace/b$b;
    //   19: pop
    //   20: aload #4
    //   22: invokevirtual a : ()V
    //   25: getstatic com/facebook/react/bridge/ReactMarkerConstants.INITIALIZE_MODULE_START : Lcom/facebook/react/bridge/ReactMarkerConstants;
    //   28: aload_0
    //   29: getfield mName : Ljava/lang/String;
    //   32: aload_0
    //   33: getfield mInstanceKey : I
    //   36: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    //   39: aload_0
    //   40: monitorenter
    //   41: aload_0
    //   42: getfield mInitializable : Z
    //   45: istore_3
    //   46: iconst_1
    //   47: istore_2
    //   48: iload_3
    //   49: ifeq -> 147
    //   52: aload_0
    //   53: getfield mIsInitializing : Z
    //   56: ifne -> 147
    //   59: aload_0
    //   60: iconst_1
    //   61: putfield mIsInitializing : Z
    //   64: goto -> 67
    //   67: aload_0
    //   68: monitorexit
    //   69: iload_2
    //   70: ifeq -> 96
    //   73: aload_1
    //   74: invokeinterface initialize : ()V
    //   79: aload_0
    //   80: monitorenter
    //   81: aload_0
    //   82: iconst_0
    //   83: putfield mIsInitializing : Z
    //   86: aload_0
    //   87: monitorexit
    //   88: goto -> 96
    //   91: astore_1
    //   92: aload_0
    //   93: monitorexit
    //   94: aload_1
    //   95: athrow
    //   96: getstatic com/facebook/react/bridge/ReactMarkerConstants.INITIALIZE_MODULE_END : Lcom/facebook/react/bridge/ReactMarkerConstants;
    //   99: aload_0
    //   100: getfield mName : Ljava/lang/String;
    //   103: aload_0
    //   104: getfield mInstanceKey : I
    //   107: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    //   110: lconst_0
    //   111: invokestatic a : (J)Lcom/facebook/systrace/b$b;
    //   114: invokevirtual a : ()V
    //   117: return
    //   118: astore_1
    //   119: aload_0
    //   120: monitorexit
    //   121: aload_1
    //   122: athrow
    //   123: astore_1
    //   124: getstatic com/facebook/react/bridge/ReactMarkerConstants.INITIALIZE_MODULE_END : Lcom/facebook/react/bridge/ReactMarkerConstants;
    //   127: aload_0
    //   128: getfield mName : Ljava/lang/String;
    //   131: aload_0
    //   132: getfield mInstanceKey : I
    //   135: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    //   138: lconst_0
    //   139: invokestatic a : (J)Lcom/facebook/systrace/b$b;
    //   142: invokevirtual a : ()V
    //   145: aload_1
    //   146: athrow
    //   147: iconst_0
    //   148: istore_2
    //   149: goto -> 67
    // Exception table:
    //   from	to	target	type
    //   39	41	123	finally
    //   41	46	118	finally
    //   52	64	118	finally
    //   67	69	118	finally
    //   73	81	123	finally
    //   81	88	91	finally
    //   92	94	91	finally
    //   94	96	123	finally
    //   119	121	118	finally
    //   121	123	123	finally
  }
  
  public void destroy() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield mModule : Lcom/facebook/react/bridge/NativeModule;
    //   6: ifnull -> 18
    //   9: aload_0
    //   10: getfield mModule : Lcom/facebook/react/bridge/NativeModule;
    //   13: invokeinterface onCatalystInstanceDestroy : ()V
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	21	finally
  }
  
  public boolean getCanOverrideExistingModule() {
    return this.mReactModuleInfo.a();
  }
  
  public String getClassName() {
    return this.mReactModuleInfo.b();
  }
  
  public boolean getHasConstants() {
    return this.mReactModuleInfo.c();
  }
  
  @a
  public NativeModule getModule() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield mModule : Lcom/facebook/react/bridge/NativeModule;
    //   6: ifnull -> 18
    //   9: aload_0
    //   10: getfield mModule : Lcom/facebook/react/bridge/NativeModule;
    //   13: astore_3
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_3
    //   17: areturn
    //   18: aload_0
    //   19: getfield mIsCreating : Z
    //   22: istore_2
    //   23: iconst_1
    //   24: istore_1
    //   25: iload_2
    //   26: ifne -> 132
    //   29: aload_0
    //   30: iconst_1
    //   31: putfield mIsCreating : Z
    //   34: goto -> 37
    //   37: aload_0
    //   38: monitorexit
    //   39: iload_1
    //   40: ifeq -> 68
    //   43: aload_0
    //   44: invokespecial create : ()Lcom/facebook/react/bridge/NativeModule;
    //   47: astore_3
    //   48: aload_0
    //   49: monitorenter
    //   50: aload_0
    //   51: iconst_0
    //   52: putfield mIsCreating : Z
    //   55: aload_0
    //   56: invokevirtual notifyAll : ()V
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_3
    //   62: areturn
    //   63: astore_3
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_3
    //   67: athrow
    //   68: aload_0
    //   69: monitorenter
    //   70: aload_0
    //   71: getfield mModule : Lcom/facebook/react/bridge/NativeModule;
    //   74: ifnonnull -> 93
    //   77: aload_0
    //   78: getfield mIsCreating : Z
    //   81: istore_2
    //   82: iload_2
    //   83: ifeq -> 93
    //   86: aload_0
    //   87: invokevirtual wait : ()V
    //   90: goto -> 70
    //   93: aload_0
    //   94: getfield mModule : Lcom/facebook/react/bridge/NativeModule;
    //   97: astore_3
    //   98: aload_3
    //   99: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   102: pop
    //   103: aload_3
    //   104: checkcast com/facebook/react/bridge/NativeModule
    //   107: astore_3
    //   108: aload_0
    //   109: monitorexit
    //   110: aload_3
    //   111: areturn
    //   112: astore_3
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_3
    //   116: athrow
    //   117: astore_3
    //   118: aload_0
    //   119: monitorexit
    //   120: goto -> 125
    //   123: aload_3
    //   124: athrow
    //   125: goto -> 123
    //   128: astore_3
    //   129: goto -> 70
    //   132: iconst_0
    //   133: istore_1
    //   134: goto -> 37
    // Exception table:
    //   from	to	target	type
    //   2	16	117	finally
    //   18	23	117	finally
    //   29	34	117	finally
    //   37	39	117	finally
    //   50	61	63	finally
    //   64	66	63	finally
    //   70	82	112	finally
    //   86	90	128	java/lang/InterruptedException
    //   86	90	112	finally
    //   93	110	112	finally
    //   113	115	112	finally
    //   118	120	117	finally
  }
  
  @a
  public String getName() {
    return this.mName;
  }
  
  boolean hasInstance() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield mModule : Lcom/facebook/react/bridge/NativeModule;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull -> 16
    //   11: iconst_1
    //   12: istore_1
    //   13: goto -> 18
    //   16: iconst_0
    //   17: istore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: iload_1
    //   21: ireturn
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public boolean isCxxModule() {
    return this.mReactModuleInfo.d();
  }
  
  public boolean isTurboModule() {
    return this.mReactModuleInfo.e();
  }
  
  void markInitializable() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_1
    //   3: istore_1
    //   4: aload_0
    //   5: iconst_1
    //   6: putfield mInitializable : Z
    //   9: aload_0
    //   10: getfield mModule : Lcom/facebook/react/bridge/NativeModule;
    //   13: astore_3
    //   14: iconst_0
    //   15: istore_2
    //   16: aload_3
    //   17: ifnull -> 58
    //   20: aload_0
    //   21: getfield mIsInitializing : Z
    //   24: ifne -> 29
    //   27: iconst_1
    //   28: istore_2
    //   29: iload_2
    //   30: invokestatic a : (Z)V
    //   33: aload_0
    //   34: getfield mModule : Lcom/facebook/react/bridge/NativeModule;
    //   37: astore_3
    //   38: goto -> 41
    //   41: aload_0
    //   42: monitorexit
    //   43: iload_1
    //   44: ifeq -> 52
    //   47: aload_0
    //   48: aload_3
    //   49: invokespecial doInitialize : (Lcom/facebook/react/bridge/NativeModule;)V
    //   52: return
    //   53: astore_3
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_3
    //   57: athrow
    //   58: aconst_null
    //   59: astore_3
    //   60: iconst_0
    //   61: istore_1
    //   62: goto -> 41
    // Exception table:
    //   from	to	target	type
    //   4	14	53	finally
    //   20	27	53	finally
    //   29	38	53	finally
    //   41	43	53	finally
    //   54	56	53	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/ModuleHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */