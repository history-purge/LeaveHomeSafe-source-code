package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SimpleSettableFuture<T> implements Future<T> {
  private final CountDownLatch c = new CountDownLatch(1);
  
  private T d;
  
  private Exception e;
  
  private void b() {
    if (this.c.getCount() != 0L)
      return; 
    throw new RuntimeException("Result has already been set!");
  }
  
  public T a() {
    try {
      return get();
    } catch (InterruptedException interruptedException) {
    
    } catch (ExecutionException executionException) {}
    throw new RuntimeException(executionException);
  }
  
  public void a(Exception paramException) {
    b();
    this.e = paramException;
    this.c.countDown();
  }
  
  public void a(T paramT) {
    b();
    this.d = paramT;
    this.c.countDown();
  }
  
  public boolean cancel(boolean paramBoolean) {
    throw new UnsupportedOperationException();
  }
  
  public T get() {
    this.c.await();
    Exception exception = this.e;
    if (exception == null)
      return this.d; 
    throw new ExecutionException(exception);
  }
  
  public T get(long paramLong, TimeUnit paramTimeUnit) {
    if (this.c.await(paramLong, paramTimeUnit)) {
      Exception exception = this.e;
      if (exception == null)
        return this.d; 
      throw new ExecutionException(exception);
    } 
    throw new TimeoutException("Timed out waiting for result");
  }
  
  public boolean isCancelled() {
    return false;
  }
  
  public boolean isDone() {
    return (this.c.getCount() == 0L);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/common/futures/SimpleSettableFuture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */