package com.facebook.react.bridge;

import e.e.e.e.a;
import e.e.n.a.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Deprecated
@a
public class ReactSoftException {
  private static final List<ReactSoftExceptionListener> sListeners = new CopyOnWriteArrayList<ReactSoftExceptionListener>();
  
  @a
  public static void addListener(ReactSoftExceptionListener paramReactSoftExceptionListener) {
    if (!sListeners.contains(paramReactSoftExceptionListener))
      sListeners.add(paramReactSoftExceptionListener); 
  }
  
  @a
  public static void clearListeners() {
    sListeners.clear();
  }
  
  @a
  public static void logSoftException(String paramString, Throwable paramThrowable) {
    if (sListeners.size() > 0) {
      Iterator<ReactSoftExceptionListener> iterator = sListeners.iterator();
      while (iterator.hasNext())
        ((ReactSoftExceptionListener)iterator.next()).logSoftException(paramString, paramThrowable); 
    } else {
      a.b(paramString, "Unhandled SoftException", paramThrowable);
    } 
  }
  
  @a
  public static void removeListener(ReactSoftExceptionListener paramReactSoftExceptionListener) {
    sListeners.remove(paramReactSoftExceptionListener);
  }
  
  public static interface ReactSoftExceptionListener {
    void logSoftException(String param1String, Throwable param1Throwable);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/ReactSoftException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */