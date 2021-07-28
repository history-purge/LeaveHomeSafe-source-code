package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public final class t extends v.c {
  private static final Class<?>[] f = new Class[] { Application.class, s.class };
  
  private static final Class<?>[] g = new Class[] { s.class };
  
  private final Application a;
  
  private final v.b b;
  
  private final Bundle c;
  
  private final g d;
  
  private final SavedStateRegistry e;
  
  @SuppressLint({"LambdaLast"})
  public t(Application paramApplication, c paramc, Bundle paramBundle) {
    v.d d;
    this.e = paramc.c();
    this.d = paramc.a();
    this.c = paramBundle;
    this.a = paramApplication;
    if (paramApplication != null) {
      d = v.a.a(paramApplication);
    } else {
      d = v.d.a();
    } 
    this.b = d;
  }
  
  private static <T> Constructor<T> a(Class<T> paramClass, Class<?>[] paramArrayOfClass) {
    for (Constructor<T> constructor : paramClass.getConstructors()) {
      if (Arrays.equals((Object[])paramArrayOfClass, (Object[])constructor.getParameterTypes()))
        return constructor; 
    } 
    return null;
  }
  
  public <T extends u> T a(Class<T> paramClass) {
    String str = paramClass.getCanonicalName();
    if (str != null)
      return a(str, paramClass); 
    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
  }
  
  public <T extends u> T a(String paramString, Class<T> paramClass) {
    // Byte code:
    //   0: ldc androidx/lifecycle/a
    //   2: aload_2
    //   3: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq -> 30
    //   11: aload_0
    //   12: getfield a : Landroid/app/Application;
    //   15: ifnull -> 30
    //   18: aload_2
    //   19: getstatic androidx/lifecycle/t.f : [Ljava/lang/Class;
    //   22: invokestatic a : (Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   25: astore #4
    //   27: goto -> 39
    //   30: aload_2
    //   31: getstatic androidx/lifecycle/t.g : [Ljava/lang/Class;
    //   34: invokestatic a : (Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   37: astore #4
    //   39: aload #4
    //   41: ifnonnull -> 55
    //   44: aload_0
    //   45: getfield b : Landroidx/lifecycle/v$b;
    //   48: aload_2
    //   49: invokeinterface a : (Ljava/lang/Class;)Landroidx/lifecycle/u;
    //   54: areturn
    //   55: aload_0
    //   56: getfield e : Landroidx/savedstate/SavedStateRegistry;
    //   59: aload_0
    //   60: getfield d : Landroidx/lifecycle/g;
    //   63: aload_1
    //   64: aload_0
    //   65: getfield c : Landroid/os/Bundle;
    //   68: invokestatic a : (Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/g;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/SavedStateHandleController;
    //   71: astore #5
    //   73: iload_3
    //   74: ifeq -> 117
    //   77: aload_0
    //   78: getfield a : Landroid/app/Application;
    //   81: ifnull -> 117
    //   84: aload #4
    //   86: iconst_2
    //   87: anewarray java/lang/Object
    //   90: dup
    //   91: iconst_0
    //   92: aload_0
    //   93: getfield a : Landroid/app/Application;
    //   96: aastore
    //   97: dup
    //   98: iconst_1
    //   99: aload #5
    //   101: invokevirtual a : ()Landroidx/lifecycle/s;
    //   104: aastore
    //   105: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   108: astore_1
    //   109: aload_1
    //   110: checkcast androidx/lifecycle/u
    //   113: astore_1
    //   114: goto -> 138
    //   117: aload #4
    //   119: iconst_1
    //   120: anewarray java/lang/Object
    //   123: dup
    //   124: iconst_0
    //   125: aload #5
    //   127: invokevirtual a : ()Landroidx/lifecycle/s;
    //   130: aastore
    //   131: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   134: astore_1
    //   135: goto -> 109
    //   138: aload_1
    //   139: ldc 'androidx.lifecycle.savedstate.vm.tag'
    //   141: aload #5
    //   143: invokevirtual a : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   146: pop
    //   147: aload_1
    //   148: areturn
    //   149: astore_1
    //   150: new java/lang/StringBuilder
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: astore #4
    //   159: aload #4
    //   161: ldc 'An exception happened in constructor of '
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: pop
    //   167: aload #4
    //   169: aload_2
    //   170: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: new java/lang/RuntimeException
    //   177: dup
    //   178: aload #4
    //   180: invokevirtual toString : ()Ljava/lang/String;
    //   183: aload_1
    //   184: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   187: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   190: athrow
    //   191: astore_1
    //   192: new java/lang/StringBuilder
    //   195: dup
    //   196: invokespecial <init> : ()V
    //   199: astore #4
    //   201: aload #4
    //   203: ldc 'A '
    //   205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: pop
    //   209: aload #4
    //   211: aload_2
    //   212: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: aload #4
    //   218: ldc ' cannot be instantiated.'
    //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: new java/lang/RuntimeException
    //   227: dup
    //   228: aload #4
    //   230: invokevirtual toString : ()Ljava/lang/String;
    //   233: aload_1
    //   234: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   237: athrow
    //   238: astore_1
    //   239: new java/lang/StringBuilder
    //   242: dup
    //   243: invokespecial <init> : ()V
    //   246: astore #4
    //   248: aload #4
    //   250: ldc 'Failed to access '
    //   252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: aload #4
    //   258: aload_2
    //   259: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   262: pop
    //   263: new java/lang/RuntimeException
    //   266: dup
    //   267: aload #4
    //   269: invokevirtual toString : ()Ljava/lang/String;
    //   272: aload_1
    //   273: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   276: astore_1
    //   277: goto -> 282
    //   280: aload_1
    //   281: athrow
    //   282: goto -> 280
    // Exception table:
    //   from	to	target	type
    //   77	109	238	java/lang/IllegalAccessException
    //   77	109	191	java/lang/InstantiationException
    //   77	109	149	java/lang/reflect/InvocationTargetException
    //   109	114	238	java/lang/IllegalAccessException
    //   109	114	191	java/lang/InstantiationException
    //   109	114	149	java/lang/reflect/InvocationTargetException
    //   117	135	238	java/lang/IllegalAccessException
    //   117	135	191	java/lang/InstantiationException
    //   117	135	149	java/lang/reflect/InvocationTargetException
    //   138	147	238	java/lang/IllegalAccessException
    //   138	147	191	java/lang/InstantiationException
    //   138	147	149	java/lang/reflect/InvocationTargetException
  }
  
  void a(u paramu) {
    SavedStateHandleController.a(paramu, this.e, this.d);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/lifecycle/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */