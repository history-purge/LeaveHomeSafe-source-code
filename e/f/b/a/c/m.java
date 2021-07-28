package e.f.b.a.c;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RecentlyNonNull;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.u;

public class m {
  @RecentlyNonNull
  public static final n<?> b;
  
  private final Context a;
  
  static {
    n.b b = n.a(m.class);
    b.a(u.c(i.class));
    b.a(u.c(Context.class));
    b.a(b0.a);
    b = b.b();
  }
  
  private m(Context paramContext) {
    this.a = paramContext;
  }
  
  private final SharedPreferences b() {
    return this.a.getSharedPreferences("com.google.mlkit.internal", 0);
  }
  
  @RecentlyNonNull
  public String a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial b : ()Landroid/content/SharedPreferences;
    //   6: ldc 'ml_sdk_instance_id'
    //   8: aconst_null
    //   9: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   14: astore_1
    //   15: aload_1
    //   16: ifnull -> 23
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_1
    //   22: areturn
    //   23: invokestatic randomUUID : ()Ljava/util/UUID;
    //   26: invokevirtual toString : ()Ljava/lang/String;
    //   29: astore_1
    //   30: aload_0
    //   31: invokespecial b : ()Landroid/content/SharedPreferences;
    //   34: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   39: ldc 'ml_sdk_instance_id'
    //   41: aload_1
    //   42: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   47: invokeinterface apply : ()V
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: areturn
    //   56: astore_1
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_1
    //   60: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	56	finally
    //   23	52	56	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/a/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */