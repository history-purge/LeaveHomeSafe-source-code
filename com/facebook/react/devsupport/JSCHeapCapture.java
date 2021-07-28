package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import e.e.o.d0.a.a;
import java.io.File;

@a(name = "JSCHeapCapture", needsEagerInit = true)
public class JSCHeapCapture extends NativeJSCHeapCaptureSpec {
  public static final String TAG = "JSCHeapCapture";
  
  private a mCaptureInProgress = null;
  
  public JSCHeapCapture(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public void captureComplete(String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield mCaptureInProgress : Lcom/facebook/react/devsupport/JSCHeapCapture$a;
    //   6: ifnull -> 55
    //   9: aload_2
    //   10: ifnonnull -> 33
    //   13: aload_0
    //   14: getfield mCaptureInProgress : Lcom/facebook/react/devsupport/JSCHeapCapture$a;
    //   17: new java/io/File
    //   20: dup
    //   21: aload_1
    //   22: invokespecial <init> : (Ljava/lang/String;)V
    //   25: invokeinterface a : (Ljava/io/File;)V
    //   30: goto -> 50
    //   33: aload_0
    //   34: getfield mCaptureInProgress : Lcom/facebook/react/devsupport/JSCHeapCapture$a;
    //   37: new com/facebook/react/devsupport/JSCHeapCapture$b
    //   40: dup
    //   41: aload_2
    //   42: invokespecial <init> : (Ljava/lang/String;)V
    //   45: invokeinterface a : (Lcom/facebook/react/devsupport/JSCHeapCapture$b;)V
    //   50: aload_0
    //   51: aconst_null
    //   52: putfield mCaptureInProgress : Lcom/facebook/react/devsupport/JSCHeapCapture$a;
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	58	finally
    //   13	30	58	finally
    //   33	50	58	finally
    //   50	55	58	finally
  }
  
  public void captureHeap(String paramString, a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield mCaptureInProgress : Lcom/facebook/react/devsupport/JSCHeapCapture$a;
    //   6: ifnull -> 27
    //   9: aload_2
    //   10: new com/facebook/react/devsupport/JSCHeapCapture$b
    //   13: dup
    //   14: ldc 'Heap capture already in progress.'
    //   16: invokespecial <init> : (Ljava/lang/String;)V
    //   19: invokeinterface a : (Lcom/facebook/react/devsupport/JSCHeapCapture$b;)V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: new java/lang/StringBuilder
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: astore_3
    //   35: aload_3
    //   36: aload_1
    //   37: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: pop
    //   41: aload_3
    //   42: ldc '/capture.json'
    //   44: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: new java/io/File
    //   51: dup
    //   52: aload_3
    //   53: invokevirtual toString : ()Ljava/lang/String;
    //   56: invokespecial <init> : (Ljava/lang/String;)V
    //   59: astore_1
    //   60: aload_1
    //   61: invokevirtual delete : ()Z
    //   64: pop
    //   65: aload_0
    //   66: invokevirtual getReactApplicationContextIfActiveOrWarn : ()Lcom/facebook/react/bridge/ReactApplicationContext;
    //   69: astore_3
    //   70: aload_3
    //   71: ifnull -> 121
    //   74: aload_3
    //   75: ldc com/facebook/react/devsupport/JSCHeapCapture$HeapCapture
    //   77: invokevirtual getJSModule : (Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;
    //   80: checkcast com/facebook/react/devsupport/JSCHeapCapture$HeapCapture
    //   83: astore_3
    //   84: aload_3
    //   85: ifnonnull -> 106
    //   88: aload_2
    //   89: new com/facebook/react/devsupport/JSCHeapCapture$b
    //   92: dup
    //   93: ldc 'Heap capture js module not registered.'
    //   95: invokespecial <init> : (Ljava/lang/String;)V
    //   98: invokeinterface a : (Lcom/facebook/react/devsupport/JSCHeapCapture$b;)V
    //   103: aload_0
    //   104: monitorexit
    //   105: return
    //   106: aload_0
    //   107: aload_2
    //   108: putfield mCaptureInProgress : Lcom/facebook/react/devsupport/JSCHeapCapture$a;
    //   111: aload_3
    //   112: aload_1
    //   113: invokevirtual getPath : ()Ljava/lang/String;
    //   116: invokeinterface captureHeap : (Ljava/lang/String;)V
    //   121: aload_0
    //   122: monitorexit
    //   123: return
    //   124: astore_1
    //   125: aload_0
    //   126: monitorexit
    //   127: aload_1
    //   128: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	124	finally
    //   27	70	124	finally
    //   74	84	124	finally
    //   88	103	124	finally
    //   106	121	124	finally
  }
  
  public String getName() {
    return "JSCHeapCapture";
  }
  
  public static interface HeapCapture extends JavaScriptModule {
    void captureHeap(String param1String);
  }
  
  public static interface a {
    void a(JSCHeapCapture.b param1b);
    
    void a(File param1File);
  }
  
  public static class b extends Exception {
    b(String param1String) {
      super(param1String);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/devsupport/JSCHeapCapture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */