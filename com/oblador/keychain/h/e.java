package com.oblador.keychain.h;

import android.content.Context;
import android.os.Looper;
import androidx.biometric.BiometricPrompt;
import com.facebook.react.bridge.ReactApplicationContext;
import com.oblador.keychain.b;
import com.oblador.keychain.g.f;
import com.oblador.keychain.i.a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class e extends BiometricPrompt.a implements d {
  protected static final String h = "e";
  
  protected com.oblador.keychain.g.e.c a;
  
  protected Throwable b;
  
  protected final ReactApplicationContext c;
  
  protected final f d;
  
  protected final Executor e = Executors.newSingleThreadExecutor();
  
  protected com.oblador.keychain.g.e.b f;
  
  protected BiometricPrompt.d g;
  
  public e(ReactApplicationContext paramReactApplicationContext, com.oblador.keychain.g.e parame, BiometricPrompt.d paramd) {
    this.c = paramReactApplicationContext;
    this.d = (f)parame;
    this.g = paramd;
  }
  
  protected BiometricPrompt a(androidx.fragment.app.e parame) {
    BiometricPrompt biometricPrompt = new BiometricPrompt(parame, this.e, this);
    biometricPrompt.a(this.g);
    return biometricPrompt;
  }
  
  public com.oblador.keychain.g.e.c a() {
    return this.a;
  }
  
  public void a(int paramInt, CharSequence paramCharSequence) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("code: ");
    stringBuilder.append(paramInt);
    stringBuilder.append(", msg: ");
    stringBuilder.append(paramCharSequence);
    a((com.oblador.keychain.g.e.c)null, (Throwable)new a(stringBuilder.toString()));
  }
  
  public void a(BiometricPrompt.b paramb) {
    try {
      if (this.f != null)
        return; 
      throw new NullPointerException("Decrypt context is not assigned yet.");
    } finally {
      paramb = null;
      a((com.oblador.keychain.g.e.c)null, (Throwable)paramb);
    } 
  }
  
  public void a(com.oblador.keychain.g.e.b paramb) {
    this.f = paramb;
    if (!b.d((Context)this.c)) {
      a((com.oblador.keychain.g.e.c)null, (Throwable)new a("Could not start fingerprint Authentication. No permissions granted."));
      return;
    } 
    e();
  }
  
  public void a(com.oblador.keychain.g.e.c paramc, Throwable paramThrowable) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield a : Lcom/oblador/keychain/g/e$c;
    //   5: aload_0
    //   6: aload_2
    //   7: putfield b : Ljava/lang/Throwable;
    //   10: aload_0
    //   11: monitorenter
    //   12: aload_0
    //   13: invokevirtual notifyAll : ()V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   12	18	19	finally
    //   20	22	19	finally
  }
  
  public Throwable b() {
    return this.b;
  }
  
  protected androidx.fragment.app.e d() {
    androidx.fragment.app.e e1 = (androidx.fragment.app.e)this.c.getCurrentActivity();
    if (e1 != null)
      return e1; 
    throw new NullPointerException("Not assigned current activity");
  }
  
  public void e() {
    androidx.fragment.app.e e1 = d();
    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
      e1.runOnUiThread(new b(this));
      f();
      return;
    } 
    a(e1);
  }
  
  public void f() {
    // Byte code:
    //   0: invokestatic currentThread : ()Ljava/lang/Thread;
    //   3: invokestatic getMainLooper : ()Landroid/os/Looper;
    //   6: invokevirtual getThread : ()Ljava/lang/Thread;
    //   9: if_acmpeq -> 47
    //   12: getstatic com/oblador/keychain/h/e.h : Ljava/lang/String;
    //   15: ldc 'blocking thread. waiting for done UI operation.'
    //   17: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   20: pop
    //   21: aload_0
    //   22: monitorenter
    //   23: aload_0
    //   24: invokevirtual wait : ()V
    //   27: aload_0
    //   28: monitorexit
    //   29: goto -> 37
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    //   37: getstatic com/oblador/keychain/h/e.h : Ljava/lang/String;
    //   40: ldc 'unblocking thread.'
    //   42: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   45: pop
    //   46: return
    //   47: new com/facebook/react/bridge/AssertionException
    //   50: dup
    //   51: ldc 'method should not be executed from MAIN thread'
    //   53: invokespecial <init> : (Ljava/lang/String;)V
    //   56: athrow
    //   57: astore_1
    //   58: goto -> 37
    // Exception table:
    //   from	to	target	type
    //   21	23	57	java/lang/InterruptedException
    //   23	29	32	finally
    //   33	35	32	finally
    //   35	37	57	java/lang/InterruptedException
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/h/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */