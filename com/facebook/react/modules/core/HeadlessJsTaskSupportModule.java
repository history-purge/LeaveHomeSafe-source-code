package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import e.e.e.e.a;
import e.e.o.c0.b;
import e.e.o.d0.a.a;

@a(name = "HeadlessJsTaskSupport")
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
  public static final String NAME = "HeadlessJsTaskSupport";
  
  public HeadlessJsTaskSupportModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public String getName() {
    return "HeadlessJsTaskSupport";
  }
  
  public void notifyTaskFinished(double paramDouble) {
    int i = (int)paramDouble;
    b b = b.a((ReactContext)getReactApplicationContext());
    if (b.b(i)) {
      b.a(i);
      return;
    } 
    a.c(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", new Object[] { Integer.valueOf(i) });
  }
  
  public void notifyTaskRetry(double paramDouble, Promise paramPromise) {
    Boolean bool;
    int i = (int)paramDouble;
    b b = b.a((ReactContext)getReactApplicationContext());
    if (b.b(i)) {
      bool = Boolean.valueOf(b.c(i));
    } else {
      a.c(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", new Object[] { Integer.valueOf(i) });
      bool = Boolean.valueOf(false);
    } 
    paramPromise.resolve(bool);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/core/HeadlessJsTaskSupportModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */