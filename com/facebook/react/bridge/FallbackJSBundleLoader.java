package com.facebook.react.bridge;

import e.e.e.e.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public final class FallbackJSBundleLoader extends JSBundleLoader {
  static final String RECOVERABLE = "facebook::react::Recoverable";
  
  static final String TAG = "FallbackJSBundleLoader";
  
  private Stack<JSBundleLoader> mLoaders = new Stack<JSBundleLoader>();
  
  private final ArrayList<Exception> mRecoveredErrors = new ArrayList<Exception>();
  
  public FallbackJSBundleLoader(List<JSBundleLoader> paramList) {
    ListIterator<JSBundleLoader> listIterator = paramList.listIterator(paramList.size());
    while (listIterator.hasPrevious())
      this.mLoaders.push(listIterator.previous()); 
  }
  
  private JSBundleLoader getDelegateLoader() {
    if (!this.mLoaders.empty())
      return this.mLoaders.peek(); 
    RuntimeException runtimeException2 = new RuntimeException("No fallback options available");
    Iterator<Exception> iterator = this.mRecoveredErrors.iterator();
    RuntimeException runtimeException1 = runtimeException2;
    label15: while (iterator.hasNext()) {
      runtimeException1.initCause(iterator.next());
      RuntimeException runtimeException = runtimeException1;
      while (true) {
        runtimeException1 = runtimeException;
        if (runtimeException.getCause() != null) {
          Throwable throwable = runtimeException.getCause();
          continue;
        } 
        continue label15;
      } 
    } 
    throw runtimeException2;
  }
  
  public String loadScript(JSBundleLoaderDelegate paramJSBundleLoaderDelegate) {
    while (true) {
      try {
        return getDelegateLoader().loadScript(paramJSBundleLoaderDelegate);
      } catch (Exception exception) {
        if (exception.getMessage() != null && exception.getMessage().startsWith("facebook::react::Recoverable")) {
          this.mLoaders.pop();
          this.mRecoveredErrors.add(exception);
          a.d("FallbackJSBundleLoader", "Falling back from recoverable error", exception);
          continue;
        } 
        break;
      } 
    } 
    throw exception;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/FallbackJSBundleLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */