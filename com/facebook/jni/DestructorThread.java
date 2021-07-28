package com.facebook.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;

public class DestructorThread {
  private static final DestructorList sDestructorList;
  
  private static final DestructorStack sDestructorStack = new DestructorStack();
  
  private static final ReferenceQueue sReferenceQueue = new ReferenceQueue();
  
  private static final Thread sThread;
  
  static {
    sDestructorList = new DestructorList();
    sThread = new Thread("HybridData DestructorThread") {
        public void run() {
          while (true) {
            try {
              DestructorThread.Destructor destructor = (DestructorThread.Destructor)DestructorThread.sReferenceQueue.remove();
              destructor.destruct();
              if (destructor.previous == null)
                DestructorThread.sDestructorStack.transferAllToList(); 
              DestructorThread.DestructorList.drop(destructor);
            } catch (InterruptedException interruptedException) {}
          } 
        }
      };
    sThread.start();
  }
  
  public static abstract class Destructor extends PhantomReference<Object> {
    private Destructor next;
    
    private Destructor previous;
    
    private Destructor() {
      super(null, DestructorThread.sReferenceQueue);
    }
    
    public Destructor(Object param1Object) {
      super(param1Object, DestructorThread.sReferenceQueue);
      DestructorThread.sDestructorStack.push(this);
    }
    
    protected abstract void destruct();
  }
  
  private static class DestructorList {
    private final DestructorThread.Destructor mHead = new DestructorThread.Terminus();
    
    public DestructorList() {
      DestructorThread.Destructor.access$602(this.mHead, new DestructorThread.Terminus());
      DestructorThread.Destructor.access$302(this.mHead.next, this.mHead);
    }
    
    private static void drop(DestructorThread.Destructor param1Destructor) {
      DestructorThread.Destructor.access$302(param1Destructor.next, param1Destructor.previous);
      DestructorThread.Destructor.access$602(param1Destructor.previous, param1Destructor.next);
    }
    
    public void enqueue(DestructorThread.Destructor param1Destructor) {
      DestructorThread.Destructor.access$602(param1Destructor, this.mHead.next);
      DestructorThread.Destructor.access$602(this.mHead, param1Destructor);
      DestructorThread.Destructor.access$302(param1Destructor.next, param1Destructor);
      DestructorThread.Destructor.access$302(param1Destructor, this.mHead);
    }
  }
  
  private static class DestructorStack {
    private final AtomicReference<DestructorThread.Destructor> mHead = new AtomicReference<DestructorThread.Destructor>();
    
    private DestructorStack() {}
    
    public void push(DestructorThread.Destructor param1Destructor) {
      DestructorThread.Destructor destructor;
      do {
        destructor = this.mHead.get();
        DestructorThread.Destructor.access$602(param1Destructor, destructor);
      } while (!this.mHead.compareAndSet(destructor, param1Destructor));
    }
    
    public void transferAllToList() {
      for (DestructorThread.Destructor destructor = this.mHead.getAndSet(null); destructor != null; destructor = destructor1) {
        DestructorThread.Destructor destructor1 = destructor.next;
        DestructorThread.sDestructorList.enqueue(destructor);
      } 
    }
  }
  
  private static class Terminus extends Destructor {
    private Terminus() {}
    
    protected void destruct() {
      throw new IllegalStateException("Cannot destroy Terminus Destructor.");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/jni/DestructorThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */