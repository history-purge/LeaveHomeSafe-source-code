package com.facebook.react.modules.image;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import e.e.g.e;
import e.e.l.f.h;
import e.e.o.d0.a.a;
import java.util.concurrent.Executor;

@a(name = "ImageLoader")
public class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
  private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
  
  private static final String ERROR_INVALID_URI = "E_INVALID_URI";
  
  private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
  
  public static final String NAME = "ImageLoader";
  
  private final Object mCallerContext = this;
  
  private final Object mEnqueuedRequestMonitor = new Object();
  
  private final SparseArray<e.e.g.c<Void>> mEnqueuedRequests = new SparseArray();
  
  public ImageLoaderModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public ImageLoaderModule(ReactApplicationContext paramReactApplicationContext, Object paramObject) {
    super(paramReactApplicationContext);
  }
  
  private void registerRequest(int paramInt, e.e.g.c<Void> paramc) {
    synchronized (this.mEnqueuedRequestMonitor) {
      this.mEnqueuedRequests.put(paramInt, paramc);
      return;
    } 
  }
  
  private e.e.g.c<Void> removeRequest(int paramInt) {
    synchronized (this.mEnqueuedRequestMonitor) {
      e.e.g.c<Void> c = (e.e.g.c)this.mEnqueuedRequests.get(paramInt);
      this.mEnqueuedRequests.remove(paramInt);
      return c;
    } 
  }
  
  public void abortRequest(double paramDouble) {
    e.e.g.c<Void> c = removeRequest((int)paramDouble);
    if (c != null)
      c.close(); 
  }
  
  public String getName() {
    return "ImageLoader";
  }
  
  @ReactMethod
  public void getSize(String paramString, Promise paramPromise) {
    if (paramString == null || paramString.isEmpty()) {
      paramPromise.reject("E_INVALID_URI", "Cannot get the size of an image for an empty URI");
      return;
    } 
    e.e.l.o.c c = e.e.l.o.d.b((new e.e.o.i0.b.a((Context)getReactApplicationContext(), paramString)).c()).a();
    e.e.j.a.a.c.a().a(c, this.mCallerContext).a((e)new a(this, paramPromise), (Executor)e.e.e.b.a.a());
  }
  
  @ReactMethod
  public void getSizeWithHeaders(String paramString, ReadableMap paramReadableMap, Promise paramPromise) {
    if (paramString == null || paramString.isEmpty()) {
      paramPromise.reject("E_INVALID_URI", "Cannot get the size of an image for an empty URI");
      return;
    } 
    com.facebook.react.modules.fresco.a a = com.facebook.react.modules.fresco.a.a(e.e.l.o.d.b((new e.e.o.i0.b.a((Context)getReactApplicationContext(), paramString)).c()), paramReadableMap);
    e.e.j.a.a.c.a().a((e.e.l.o.c)a, this.mCallerContext).a((e)new b(this, paramPromise), (Executor)e.e.e.b.a.a());
  }
  
  public void onHostDestroy() {
    // Byte code:
    //   0: aload_0
    //   1: getfield mEnqueuedRequestMonitor : Ljava/lang/Object;
    //   4: astore_3
    //   5: aload_3
    //   6: monitorenter
    //   7: iconst_0
    //   8: istore_1
    //   9: aload_0
    //   10: getfield mEnqueuedRequests : Landroid/util/SparseArray;
    //   13: invokevirtual size : ()I
    //   16: istore_2
    //   17: iload_1
    //   18: iload_2
    //   19: if_icmpge -> 51
    //   22: aload_0
    //   23: getfield mEnqueuedRequests : Landroid/util/SparseArray;
    //   26: iload_1
    //   27: invokevirtual valueAt : (I)Ljava/lang/Object;
    //   30: checkcast e/e/g/c
    //   33: astore #4
    //   35: aload #4
    //   37: ifnull -> 74
    //   40: aload #4
    //   42: invokeinterface close : ()Z
    //   47: pop
    //   48: goto -> 74
    //   51: aload_0
    //   52: getfield mEnqueuedRequests : Landroid/util/SparseArray;
    //   55: invokevirtual clear : ()V
    //   58: aload_3
    //   59: monitorexit
    //   60: return
    //   61: astore #4
    //   63: aload_3
    //   64: monitorexit
    //   65: goto -> 71
    //   68: aload #4
    //   70: athrow
    //   71: goto -> 68
    //   74: iload_1
    //   75: iconst_1
    //   76: iadd
    //   77: istore_1
    //   78: goto -> 17
    // Exception table:
    //   from	to	target	type
    //   9	17	61	finally
    //   22	35	61	finally
    //   40	48	61	finally
    //   51	60	61	finally
    //   63	65	61	finally
  }
  
  public void onHostPause() {}
  
  public void onHostResume() {}
  
  public void prefetchImage(String paramString, double paramDouble, Promise paramPromise) {
    int i = (int)paramDouble;
    if (paramString == null || paramString.isEmpty()) {
      paramPromise.reject("E_INVALID_URI", "Cannot prefetch an image for an empty URI");
      return;
    } 
    e.e.l.o.c c1 = e.e.l.o.d.b(Uri.parse(paramString)).a();
    e.e.g.c<Void> c = e.e.j.a.a.c.a().c(c1, this.mCallerContext);
    c c2 = new c(this, i, paramPromise);
    registerRequest(i, c);
    c.a((e)c2, (Executor)e.e.e.b.a.a());
  }
  
  @ReactMethod
  public void queryCache(ReadableArray paramReadableArray, Promise paramPromise) {
    (new d(this, (ReactContext)getReactApplicationContext(), paramReadableArray, paramPromise)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
  }
  
  class a extends e.e.g.b<e.e.e.h.a<e.e.l.k.b>> {
    a(ImageLoaderModule this$0, Promise param1Promise) {}
    
    protected void e(e.e.g.c<e.e.e.h.a<e.e.l.k.b>> param1c) {
      this.a.reject("E_GET_SIZE_FAILURE", param1c.e());
    }
    
    protected void f(e.e.g.c<e.e.e.h.a<e.e.l.k.b>> param1c) {
      if (!param1c.d())
        return; 
      e.e.e.h.a a1 = (e.e.e.h.a)param1c.a();
      if (a1 != null) {
        try {
          e.e.l.k.b b1 = (e.e.l.k.b)a1.b();
          WritableMap writableMap = Arguments.createMap();
          writableMap.putInt("width", b1.b());
          writableMap.putInt("height", b1.a());
          this.a.resolve(writableMap);
        } catch (Exception exception) {
          this.a.reject("E_GET_SIZE_FAILURE", exception);
        } finally {
          Exception exception;
        } 
        e.e.e.h.a.b(a1);
        return;
      } 
      this.a.reject("E_GET_SIZE_FAILURE");
    }
  }
  
  class b extends e.e.g.b<e.e.e.h.a<e.e.l.k.b>> {
    b(ImageLoaderModule this$0, Promise param1Promise) {}
    
    protected void e(e.e.g.c<e.e.e.h.a<e.e.l.k.b>> param1c) {
      this.a.reject("E_GET_SIZE_FAILURE", param1c.e());
    }
    
    protected void f(e.e.g.c<e.e.e.h.a<e.e.l.k.b>> param1c) {
      if (!param1c.d())
        return; 
      e.e.e.h.a a = (e.e.e.h.a)param1c.a();
      if (a != null) {
        try {
          e.e.l.k.b b1 = (e.e.l.k.b)a.b();
          WritableMap writableMap = Arguments.createMap();
          writableMap.putInt("width", b1.b());
          writableMap.putInt("height", b1.a());
          this.a.resolve(writableMap);
        } catch (Exception exception) {
          this.a.reject("E_GET_SIZE_FAILURE", exception);
        } finally {
          Exception exception;
        } 
        e.e.e.h.a.b(a);
        return;
      } 
      this.a.reject("E_GET_SIZE_FAILURE");
    }
  }
  
  class c extends e.e.g.b<Void> {
    c(ImageLoaderModule this$0, int param1Int, Promise param1Promise) {}
    
    protected void e(e.e.g.c<Void> param1c) {
      try {
        this.c.removeRequest(this.a);
        this.b.reject("E_PREFETCH_FAILURE", param1c.e());
        return;
      } finally {
        param1c.close();
      } 
    }
    
    protected void f(e.e.g.c<Void> param1c) {
      if (!param1c.d())
        return; 
      try {
        this.c.removeRequest(this.a);
        this.b.resolve(Boolean.valueOf(true));
        return;
      } finally {
        param1c.close();
      } 
    }
  }
  
  class d extends GuardedAsyncTask<Void, Void> {
    d(ImageLoaderModule this$0, ReactContext param1ReactContext, ReadableArray param1ReadableArray, Promise param1Promise) {
      super(param1ReactContext);
    }
    
    protected void a(Void... param1VarArgs) {
      WritableMap writableMap = Arguments.createMap();
      h h = e.e.j.a.a.c.a();
      for (int i = 0; i < this.a.size(); i++) {
        String str1;
        String str2 = this.a.getString(i);
        Uri uri = Uri.parse(str2);
        if (h.a(uri)) {
          str1 = "memory";
        } else if (h.b((Uri)str1)) {
          str1 = "disk";
        } else {
          continue;
        } 
        writableMap.putString(str2, str1);
        continue;
      } 
      this.b.resolve(writableMap);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/image/ImageLoaderModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */