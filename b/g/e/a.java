package b.g.e;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

public class a {
  private static final Object a = new Object();
  
  private static TypedValue b;
  
  public static int a(Context paramContext, int paramInt) {
    return (Build.VERSION.SDK_INT >= 23) ? paramContext.getColor(paramInt) : paramContext.getResources().getColor(paramInt);
  }
  
  public static int a(Context paramContext, String paramString) {
    if (paramString != null)
      return paramContext.checkPermission(paramString, Process.myPid(), Process.myUid()); 
    throw new IllegalArgumentException("permission is null");
  }
  
  public static Context a(Context paramContext) {
    return (Build.VERSION.SDK_INT >= 24) ? paramContext.createDeviceProtectedStorageContext() : null;
  }
  
  private static File a(File paramFile) {
    // Byte code:
    //   0: ldc b/g/e/a
    //   2: monitorenter
    //   3: aload_0
    //   4: invokevirtual exists : ()Z
    //   7: ifne -> 70
    //   10: aload_0
    //   11: invokevirtual mkdirs : ()Z
    //   14: ifne -> 70
    //   17: aload_0
    //   18: invokevirtual exists : ()Z
    //   21: istore_1
    //   22: iload_1
    //   23: ifeq -> 31
    //   26: ldc b/g/e/a
    //   28: monitorexit
    //   29: aload_0
    //   30: areturn
    //   31: new java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: astore_2
    //   39: aload_2
    //   40: ldc 'Unable to create files subdir '
    //   42: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload_2
    //   47: aload_0
    //   48: invokevirtual getPath : ()Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: ldc 'ContextCompat'
    //   57: aload_2
    //   58: invokevirtual toString : ()Ljava/lang/String;
    //   61: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   64: pop
    //   65: ldc b/g/e/a
    //   67: monitorexit
    //   68: aconst_null
    //   69: areturn
    //   70: ldc b/g/e/a
    //   72: monitorexit
    //   73: aload_0
    //   74: areturn
    //   75: astore_0
    //   76: ldc b/g/e/a
    //   78: monitorexit
    //   79: aload_0
    //   80: athrow
    // Exception table:
    //   from	to	target	type
    //   3	22	75	finally
    //   31	65	75	finally
  }
  
  public static void a(Context paramContext, Intent paramIntent, Bundle paramBundle) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramContext.startActivity(paramIntent, paramBundle);
      return;
    } 
    paramContext.startActivity(paramIntent);
  }
  
  public static boolean a(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramContext.startActivities(paramArrayOfIntent, paramBundle);
    } else {
      paramContext.startActivities(paramArrayOfIntent);
    } 
    return true;
  }
  
  public static ColorStateList b(Context paramContext, int paramInt) {
    return (Build.VERSION.SDK_INT >= 23) ? paramContext.getColorStateList(paramInt) : paramContext.getResources().getColorStateList(paramInt);
  }
  
  public static File[] b(Context paramContext) {
    return (Build.VERSION.SDK_INT >= 19) ? paramContext.getExternalCacheDirs() : new File[] { paramContext.getExternalCacheDir() };
  }
  
  public static File[] b(Context paramContext, String paramString) {
    return (Build.VERSION.SDK_INT >= 19) ? paramContext.getExternalFilesDirs(paramString) : new File[] { paramContext.getExternalFilesDir(paramString) };
  }
  
  public static Drawable c(Context paramContext, int paramInt) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
      return paramContext.getDrawable(paramInt); 
    if (i < 16) {
      Object object = a;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        if (b == null)
          b = new TypedValue(); 
        paramContext.getResources().getValue(paramInt, b, true);
        paramInt = b.resourceId;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      } finally {}
    } 
    return paramContext.getResources().getDrawable(paramInt);
  }
  
  public static File c(Context paramContext) {
    return (Build.VERSION.SDK_INT >= 21) ? paramContext.getNoBackupFilesDir() : a(new File((paramContext.getApplicationInfo()).dataDir, "no_backup"));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */