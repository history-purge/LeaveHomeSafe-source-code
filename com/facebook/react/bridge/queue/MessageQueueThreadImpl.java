package com.facebook.react.bridge.queue;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.futures.SimpleSettableFuture;
import e.e.e.e.a;
import e.e.n.a.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@a
public class MessageQueueThreadImpl implements MessageQueueThread {
  private final String mAssertionErrorMessage;
  
  private final MessageQueueThreadHandler mHandler;
  
  private volatile boolean mIsFinished = false;
  
  private final Looper mLooper;
  
  private final String mName;
  
  private MessageQueueThreadPerfStats mPerfStats;
  
  private MessageQueueThreadImpl(String paramString, Looper paramLooper, QueueThreadExceptionHandler paramQueueThreadExceptionHandler) {
    this(paramString, paramLooper, paramQueueThreadExceptionHandler, null);
  }
  
  private MessageQueueThreadImpl(String paramString, Looper paramLooper, QueueThreadExceptionHandler paramQueueThreadExceptionHandler, MessageQueueThreadPerfStats paramMessageQueueThreadPerfStats) {
    this.mName = paramString;
    this.mLooper = paramLooper;
    this.mHandler = new MessageQueueThreadHandler(paramLooper, paramQueueThreadExceptionHandler);
    this.mPerfStats = paramMessageQueueThreadPerfStats;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Expected to be called from the '");
    stringBuilder.append(getName());
    stringBuilder.append("' thread!");
    this.mAssertionErrorMessage = stringBuilder.toString();
  }
  
  private static void assignToPerfStats(MessageQueueThreadPerfStats paramMessageQueueThreadPerfStats, long paramLong1, long paramLong2) {
    paramMessageQueueThreadPerfStats.wallTime = paramLong1;
    paramMessageQueueThreadPerfStats.cpuTime = paramLong2;
  }
  
  public static MessageQueueThreadImpl create(MessageQueueThreadSpec paramMessageQueueThreadSpec, QueueThreadExceptionHandler paramQueueThreadExceptionHandler) {
    StringBuilder stringBuilder;
    int i = null.$SwitchMap$com$facebook$react$bridge$queue$MessageQueueThreadSpec$ThreadType[paramMessageQueueThreadSpec.getThreadType().ordinal()];
    if (i != 1) {
      if (i == 2)
        return startNewBackgroundThread(paramMessageQueueThreadSpec.getName(), paramMessageQueueThreadSpec.getStackSize(), paramQueueThreadExceptionHandler); 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Unknown thread type: ");
      stringBuilder.append(paramMessageQueueThreadSpec.getThreadType());
      throw new RuntimeException(stringBuilder.toString());
    } 
    return createForMainThread(paramMessageQueueThreadSpec.getName(), (QueueThreadExceptionHandler)stringBuilder);
  }
  
  private static MessageQueueThreadImpl createForMainThread(String paramString, QueueThreadExceptionHandler paramQueueThreadExceptionHandler) {
    MessageQueueThreadImpl messageQueueThreadImpl = new MessageQueueThreadImpl(paramString, Looper.getMainLooper(), paramQueueThreadExceptionHandler);
    if (UiThreadUtil.isOnUiThread()) {
      Process.setThreadPriority(-4);
      return messageQueueThreadImpl;
    } 
    UiThreadUtil.runOnUiThread(new Runnable() {
          public void run() {
            Process.setThreadPriority(-4);
          }
        });
    return messageQueueThreadImpl;
  }
  
  private static MessageQueueThreadImpl startNewBackgroundThread(String paramString, long paramLong, QueueThreadExceptionHandler paramQueueThreadExceptionHandler) {
    final SimpleSettableFuture dataFuture = new SimpleSettableFuture();
    Runnable runnable = new Runnable() {
        public void run() {
          Process.setThreadPriority(-4);
          Looper.prepare();
          MessageQueueThreadPerfStats messageQueueThreadPerfStats = new MessageQueueThreadPerfStats();
          MessageQueueThreadImpl.assignToPerfStats(messageQueueThreadPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
          dataFuture.a(new Pair(Looper.myLooper(), messageQueueThreadPerfStats));
          Looper.loop();
        }
      };
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("mqt_");
    stringBuilder.append(paramString);
    (new Thread(null, runnable, stringBuilder.toString(), paramLong)).start();
    Pair pair = (Pair)simpleSettableFuture.a();
    return new MessageQueueThreadImpl(paramString, (Looper)pair.first, paramQueueThreadExceptionHandler, (MessageQueueThreadPerfStats)pair.second);
  }
  
  @a
  public void assertIsOnThread() {
    SoftAssertions.assertCondition(isOnThread(), this.mAssertionErrorMessage);
  }
  
  @a
  public void assertIsOnThread(String paramString) {
    boolean bool = isOnThread();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.mAssertionErrorMessage);
    stringBuilder.append(" ");
    stringBuilder.append(paramString);
    SoftAssertions.assertCondition(bool, stringBuilder.toString());
  }
  
  @a
  public <T> Future<T> callOnQueue(final Callable<T> callable) {
    final SimpleSettableFuture future = new SimpleSettableFuture();
    runOnQueue(new Runnable() {
          public void run() {
            try {
              future.a(callable.call());
              return;
            } catch (Exception exception) {
              future.a(exception);
              return;
            } 
          }
        });
    return (Future<T>)simpleSettableFuture;
  }
  
  public Looper getLooper() {
    return this.mLooper;
  }
  
  public String getName() {
    return this.mName;
  }
  
  @a
  public MessageQueueThreadPerfStats getPerfStats() {
    return this.mPerfStats;
  }
  
  @a
  public boolean isOnThread() {
    return (this.mLooper.getThread() == Thread.currentThread());
  }
  
  @a
  public void quitSynchronous() {
    this.mIsFinished = true;
    this.mLooper.quit();
    if (this.mLooper.getThread() != Thread.currentThread())
      try {
        this.mLooper.getThread().join();
        return;
      } catch (InterruptedException interruptedException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Got interrupted waiting to join thread ");
        stringBuilder.append(this.mName);
        throw new RuntimeException(stringBuilder.toString());
      }  
  }
  
  @a
  public void resetPerfStats() {
    assignToPerfStats(this.mPerfStats, -1L, -1L);
    runOnQueue(new Runnable() {
          public void run() {
            long l1 = SystemClock.uptimeMillis();
            long l2 = SystemClock.currentThreadTimeMillis();
            MessageQueueThreadImpl.assignToPerfStats(MessageQueueThreadImpl.this.mPerfStats, l1, l2);
          }
        });
  }
  
  @a
  public void runOnQueue(Runnable paramRunnable) {
    if (this.mIsFinished) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Tried to enqueue runnable on already finished thread: '");
      stringBuilder.append(getName());
      stringBuilder.append("... dropping Runnable.");
      a.e("ReactNative", stringBuilder.toString());
    } 
    this.mHandler.post(paramRunnable);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/queue/MessageQueueThreadImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */