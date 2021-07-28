package j;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class a extends u {
  private static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60L);
  
  private static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
  
  private static final int TIMEOUT_WRITE_SIZE = 65536;
  
  static a head;
  
  private boolean inQueue;
  
  private a next;
  
  private long timeoutAt;
  
  static a awaitTimeout() {
    a a1 = head.next;
    a a2 = null;
    long l = System.nanoTime();
    if (a1 == null) {
      a.class.wait(IDLE_TIMEOUT_MILLIS);
      a1 = a2;
      if (head.next == null) {
        a1 = a2;
        if (System.nanoTime() - l >= IDLE_TIMEOUT_NANOS)
          a1 = head; 
      } 
      return a1;
    } 
    l = a1.remainingNanos(l);
    if (l > 0L) {
      long l1 = l / 1000000L;
      a.class.wait(l1, (int)(l - 1000000L * l1));
      return null;
    } 
    head.next = a1.next;
    a1.next = null;
    return a1;
  }
  
  private static boolean cancelScheduledTimeout(a parama) {
    // Byte code:
    //   0: ldc j/a
    //   2: monitorenter
    //   3: getstatic j/a.head : Lj/a;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull -> 47
    //   11: aload_2
    //   12: getfield next : Lj/a;
    //   15: aload_0
    //   16: if_acmpne -> 39
    //   19: aload_2
    //   20: aload_0
    //   21: getfield next : Lj/a;
    //   24: putfield next : Lj/a;
    //   27: aload_0
    //   28: aconst_null
    //   29: putfield next : Lj/a;
    //   32: iconst_0
    //   33: istore_1
    //   34: ldc j/a
    //   36: monitorexit
    //   37: iload_1
    //   38: ireturn
    //   39: aload_2
    //   40: getfield next : Lj/a;
    //   43: astore_2
    //   44: goto -> 7
    //   47: iconst_1
    //   48: istore_1
    //   49: goto -> 34
    //   52: astore_0
    //   53: ldc j/a
    //   55: monitorexit
    //   56: goto -> 61
    //   59: aload_0
    //   60: athrow
    //   61: goto -> 59
    // Exception table:
    //   from	to	target	type
    //   3	7	52	finally
    //   11	32	52	finally
    //   39	44	52	finally
  }
  
  private long remainingNanos(long paramLong) {
    return this.timeoutAt - paramLong;
  }
  
  private static void scheduleTimeout(a parama, long paramLong, boolean paramBoolean) {
    // Byte code:
    //   0: ldc j/a
    //   2: monitorenter
    //   3: getstatic j/a.head : Lj/a;
    //   6: ifnonnull -> 29
    //   9: new j/a
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic j/a.head : Lj/a;
    //   19: new j/a$c
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: invokevirtual start : ()V
    //   29: invokestatic nanoTime : ()J
    //   32: lstore #4
    //   34: lload_1
    //   35: lconst_0
    //   36: lcmp
    //   37: ifeq -> 179
    //   40: iload_3
    //   41: ifeq -> 179
    //   44: lload_1
    //   45: aload_0
    //   46: invokevirtual deadlineNanoTime : ()J
    //   49: lload #4
    //   51: lsub
    //   52: invokestatic min : (JJ)J
    //   55: lstore_1
    //   56: aload_0
    //   57: lload_1
    //   58: lload #4
    //   60: ladd
    //   61: putfield timeoutAt : J
    //   64: goto -> 79
    //   67: iload_3
    //   68: ifeq -> 159
    //   71: aload_0
    //   72: aload_0
    //   73: invokevirtual deadlineNanoTime : ()J
    //   76: putfield timeoutAt : J
    //   79: aload_0
    //   80: lload #4
    //   82: invokespecial remainingNanos : (J)J
    //   85: lstore_1
    //   86: getstatic j/a.head : Lj/a;
    //   89: astore #6
    //   91: aload #6
    //   93: getfield next : Lj/a;
    //   96: ifnull -> 127
    //   99: lload_1
    //   100: aload #6
    //   102: getfield next : Lj/a;
    //   105: lload #4
    //   107: invokespecial remainingNanos : (J)J
    //   110: lcmp
    //   111: ifge -> 117
    //   114: goto -> 127
    //   117: aload #6
    //   119: getfield next : Lj/a;
    //   122: astore #6
    //   124: goto -> 91
    //   127: aload_0
    //   128: aload #6
    //   130: getfield next : Lj/a;
    //   133: putfield next : Lj/a;
    //   136: aload #6
    //   138: aload_0
    //   139: putfield next : Lj/a;
    //   142: aload #6
    //   144: getstatic j/a.head : Lj/a;
    //   147: if_acmpne -> 155
    //   150: ldc j/a
    //   152: invokevirtual notify : ()V
    //   155: ldc j/a
    //   157: monitorexit
    //   158: return
    //   159: new java/lang/AssertionError
    //   162: dup
    //   163: invokespecial <init> : ()V
    //   166: athrow
    //   167: astore_0
    //   168: ldc j/a
    //   170: monitorexit
    //   171: goto -> 176
    //   174: aload_0
    //   175: athrow
    //   176: goto -> 174
    //   179: lload_1
    //   180: lconst_0
    //   181: lcmp
    //   182: ifeq -> 67
    //   185: goto -> 56
    // Exception table:
    //   from	to	target	type
    //   3	29	167	finally
    //   29	34	167	finally
    //   44	56	167	finally
    //   56	64	167	finally
    //   71	79	167	finally
    //   79	91	167	finally
    //   91	114	167	finally
    //   117	124	167	finally
    //   127	155	167	finally
    //   159	167	167	finally
  }
  
  public final void enter() {
    if (!this.inQueue) {
      long l = timeoutNanos();
      boolean bool = hasDeadline();
      if (l == 0L && !bool)
        return; 
      this.inQueue = true;
      scheduleTimeout(this, l, bool);
      return;
    } 
    throw new IllegalStateException("Unbalanced enter/exit");
  }
  
  final IOException exit(IOException paramIOException) {
    return !exit() ? paramIOException : newTimeoutException(paramIOException);
  }
  
  final void exit(boolean paramBoolean) {
    if (exit()) {
      if (!paramBoolean)
        return; 
      throw newTimeoutException(null);
    } 
  }
  
  public final boolean exit() {
    if (!this.inQueue)
      return false; 
    this.inQueue = false;
    return cancelScheduledTimeout(this);
  }
  
  protected IOException newTimeoutException(IOException paramIOException) {
    InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
    if (paramIOException != null)
      interruptedIOException.initCause(paramIOException); 
    return interruptedIOException;
  }
  
  public final s sink(s params) {
    return new a(this, params);
  }
  
  public final t source(t paramt) {
    return new b(this, paramt);
  }
  
  protected void timedOut() {}
  
  class a implements s {
    a(a this$0, s param1s) {}
    
    public void close() {
      Exception exception;
      this.d.enter();
      try {
        this.c.close();
        this.d.exit(true);
        return;
      } catch (IOException null) {
        throw this.d.exit(exception);
      } finally {}
      this.d.exit(false);
      throw exception;
    }
    
    public void flush() {
      Exception exception;
      this.d.enter();
      try {
        this.c.flush();
        this.d.exit(true);
        return;
      } catch (IOException null) {
        throw this.d.exit(exception);
      } finally {}
      this.d.exit(false);
      throw exception;
    }
    
    public u timeout() {
      return this.d;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("AsyncTimeout.sink(");
      stringBuilder.append(this.c);
      stringBuilder.append(")");
      return stringBuilder.toString();
    }
    
    public void write(c param1c, long param1Long) {
      v.a(param1c.d, 0L, param1Long);
      while (true) {
        long l = 0L;
        if (param1Long > 0L) {
          long l1;
          p p = param1c.c;
          while (true) {
            l1 = l;
            if (l < 65536L) {
              l += (p.c - p.b);
              if (l >= param1Long) {
                l1 = param1Long;
                break;
              } 
              p = p.f;
              continue;
            } 
            break;
          } 
          this.d.enter();
          try {
            this.c.write(param1c, l1);
            param1Long -= l1;
            this.d.exit(true);
            continue;
          } catch (IOException iOException) {
            throw this.d.exit(iOException);
          } finally {}
          this.d.exit(false);
          throw param1c;
        } 
        break;
      } 
    }
  }
  
  class b implements t {
    b(a this$0, t param1t) {}
    
    public void close() {
      Exception exception;
      try {
        this.c.close();
        this.d.exit(true);
        return;
      } catch (IOException null) {
        throw this.d.exit(exception);
      } finally {}
      this.d.exit(false);
      throw exception;
    }
    
    public long read(c param1c, long param1Long) {
      this.d.enter();
      try {
        param1Long = this.c.read(param1c, param1Long);
        this.d.exit(true);
        return param1Long;
      } catch (IOException iOException) {
        throw this.d.exit(iOException);
      } finally {}
      this.d.exit(false);
      throw param1c;
    }
    
    public u timeout() {
      return this.d;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("AsyncTimeout.source(");
      stringBuilder.append(this.c);
      stringBuilder.append(")");
      return stringBuilder.toString();
    }
  }
  
  private static final class c extends Thread {
    c() {
      super("Okio Watchdog");
      setDaemon(true);
    }
    
    public void run() {
      // Byte code:
      //   0: ldc j/a
      //   2: monitorenter
      //   3: invokestatic awaitTimeout : ()Lj/a;
      //   6: astore_1
      //   7: aload_1
      //   8: ifnonnull -> 17
      //   11: ldc j/a
      //   13: monitorexit
      //   14: goto -> 0
      //   17: aload_1
      //   18: getstatic j/a.head : Lj/a;
      //   21: if_acmpne -> 32
      //   24: aconst_null
      //   25: putstatic j/a.head : Lj/a;
      //   28: ldc j/a
      //   30: monitorexit
      //   31: return
      //   32: ldc j/a
      //   34: monitorexit
      //   35: aload_1
      //   36: invokevirtual timedOut : ()V
      //   39: goto -> 0
      //   42: astore_1
      //   43: ldc j/a
      //   45: monitorexit
      //   46: goto -> 51
      //   49: aload_1
      //   50: athrow
      //   51: goto -> 49
      //   54: astore_1
      //   55: goto -> 0
      // Exception table:
      //   from	to	target	type
      //   0	3	54	java/lang/InterruptedException
      //   3	7	42	finally
      //   11	14	42	finally
      //   17	31	42	finally
      //   32	35	42	finally
      //   35	39	54	java/lang/InterruptedException
      //   43	46	42	finally
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */