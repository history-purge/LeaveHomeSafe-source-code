package com.facebook.react.devsupport;

import android.view.View;
import com.facebook.fbreact.specs.NativeJSDevSupportSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import e.e.o.d0.a.a;
import java.util.HashMap;
import java.util.Map;

@a(name = "JSDevSupport")
public class JSDevSupport extends NativeJSDevSupportSpec {
  public static final int ERROR_CODE_EXCEPTION = 0;
  
  public static final int ERROR_CODE_VIEW_NOT_FOUND = 1;
  
  public static final String MODULE_NAME = "JSDevSupport";
  
  private volatile a mCurrentCallback = null;
  
  public JSDevSupport(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public void computeDeepestJSHierarchy(View paramView, a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokestatic a : (Landroid/view/View;)Landroid/util/Pair;
    //   7: getfield first : Ljava/lang/Object;
    //   10: checkcast android/view/View
    //   13: invokevirtual getId : ()I
    //   16: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   19: invokevirtual intValue : ()I
    //   22: aload_2
    //   23: invokevirtual getJSHierarchy : (ILcom/facebook/react/devsupport/JSDevSupport$a;)V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: astore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_1
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	29	finally
  }
  
  public void getJSHierarchy(int paramInt, a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual getReactApplicationContextIfActiveOrWarn : ()Lcom/facebook/react/bridge/ReactApplicationContext;
    //   6: astore #4
    //   8: aconst_null
    //   9: astore_3
    //   10: aload #4
    //   12: ifnull -> 26
    //   15: aload #4
    //   17: ldc com/facebook/react/devsupport/JSDevSupport$JSDevSupportModule
    //   19: invokevirtual getJSModule : (Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;
    //   22: checkcast com/facebook/react/devsupport/JSDevSupport$JSDevSupportModule
    //   25: astore_3
    //   26: aload_3
    //   27: ifnonnull -> 49
    //   30: aload_2
    //   31: iconst_0
    //   32: new com/facebook/react/devsupport/JSCHeapCapture$b
    //   35: dup
    //   36: ldc 'JSDevSupport module not registered.'
    //   38: invokespecial <init> : (Ljava/lang/String;)V
    //   41: invokeinterface a : (ILjava/lang/Exception;)V
    //   46: aload_0
    //   47: monitorexit
    //   48: return
    //   49: aload_0
    //   50: aload_2
    //   51: putfield mCurrentCallback : Lcom/facebook/react/devsupport/JSDevSupport$a;
    //   54: aload_3
    //   55: iload_1
    //   56: invokeinterface getJSHierarchy : (I)V
    //   61: aload_0
    //   62: monitorexit
    //   63: return
    //   64: astore_2
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_2
    //   68: athrow
    // Exception table:
    //   from	to	target	type
    //   2	8	64	finally
    //   15	26	64	finally
    //   30	46	64	finally
    //   49	61	64	finally
  }
  
  public String getName() {
    return "JSDevSupport";
  }
  
  public Map<String, Object> getTypedExportedConstants() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("ERROR_CODE_EXCEPTION", Integer.valueOf(0));
    hashMap.put("ERROR_CODE_VIEW_NOT_FOUND", Integer.valueOf(1));
    return (Map)hashMap;
  }
  
  public void onFailure(double paramDouble, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: dload_1
    //   3: d2i
    //   4: istore #4
    //   6: aload_0
    //   7: getfield mCurrentCallback : Lcom/facebook/react/devsupport/JSDevSupport$a;
    //   10: ifnull -> 32
    //   13: aload_0
    //   14: getfield mCurrentCallback : Lcom/facebook/react/devsupport/JSDevSupport$a;
    //   17: iload #4
    //   19: new java/lang/RuntimeException
    //   22: dup
    //   23: aload_3
    //   24: invokespecial <init> : (Ljava/lang/String;)V
    //   27: invokeinterface a : (ILjava/lang/Exception;)V
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: astore_3
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_3
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   6	32	35	finally
  }
  
  public void onSuccess(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield mCurrentCallback : Lcom/facebook/react/devsupport/JSDevSupport$a;
    //   6: ifnull -> 19
    //   9: aload_0
    //   10: getfield mCurrentCallback : Lcom/facebook/react/devsupport/JSDevSupport$a;
    //   13: aload_1
    //   14: invokeinterface a : (Ljava/lang/String;)V
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	22	finally
  }
  
  public static interface JSDevSupportModule extends JavaScriptModule {
    void getJSHierarchy(int param1Int);
  }
  
  public static interface a {
    void a(int param1Int, Exception param1Exception);
    
    void a(String param1String);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/devsupport/JSDevSupport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */