package e.f.a.e.e;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.z;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.v;
import e.f.a.e.m.l;
import e.f.a.e.m.o;

public class d extends e {
  private static final Object c = new Object();
  
  private static final d d = new d();
  
  @RecentlyNonNull
  public static final int e = e.a;
  
  private String b;
  
  @RecentlyNonNull
  public static Dialog a(@RecentlyNonNull Activity paramActivity, @RecentlyNonNull DialogInterface.OnCancelListener paramOnCancelListener) {
    ProgressBar progressBar = new ProgressBar((Context)paramActivity, null, 16842874);
    progressBar.setIndeterminate(true);
    progressBar.setVisibility(0);
    AlertDialog.Builder builder = new AlertDialog.Builder((Context)paramActivity);
    builder.setView((View)progressBar);
    builder.setMessage(v.c((Context)paramActivity, 18));
    builder.setPositiveButton("", null);
    AlertDialog alertDialog = builder.create();
    a(paramActivity, (Dialog)alertDialog, "GooglePlayServicesUpdatingDialog", paramOnCancelListener);
    return (Dialog)alertDialog;
  }
  
  static Dialog a(Context paramContext, int paramInt, u paramu, DialogInterface.OnCancelListener paramOnCancelListener) {
    AlertDialog.Builder builder1 = null;
    if (paramInt == 0)
      return null; 
    TypedValue typedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(16843529, typedValue, true);
    if ("Theme.Dialog.Alert".equals(paramContext.getResources().getResourceEntryName(typedValue.resourceId)))
      builder1 = new AlertDialog.Builder(paramContext, 5); 
    AlertDialog.Builder builder2 = builder1;
    if (builder1 == null)
      builder2 = new AlertDialog.Builder(paramContext); 
    builder2.setMessage(v.c(paramContext, paramInt));
    if (paramOnCancelListener != null)
      builder2.setOnCancelListener(paramOnCancelListener); 
    String str2 = v.e(paramContext, paramInt);
    if (str2 != null)
      builder2.setPositiveButton(str2, (DialogInterface.OnClickListener)paramu); 
    String str1 = v.a(paramContext, paramInt);
    if (str1 != null)
      builder2.setTitle(str1); 
    Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[] { Integer.valueOf(paramInt) }), new IllegalArgumentException());
    return (Dialog)builder2.create();
  }
  
  public static d a() {
    return d;
  }
  
  static void a(Activity paramActivity, Dialog paramDialog, String paramString, DialogInterface.OnCancelListener paramOnCancelListener) {
    n n;
    if (paramActivity instanceof e) {
      n = ((e)paramActivity).k();
      j.a(paramDialog, paramOnCancelListener).a(n, paramString);
      return;
    } 
    FragmentManager fragmentManager = n.getFragmentManager();
    b.a(paramDialog, paramOnCancelListener).show(fragmentManager, paramString);
  }
  
  @TargetApi(20)
  private final void a(Context paramContext, int paramInt, String paramString, PendingIntent paramPendingIntent) {
    // Byte code:
    //   0: ldc 'GoogleApiAvailability'
    //   2: ldc 'GMS core API Availability. ConnectionResult=%s, tag=%s'
    //   4: iconst_2
    //   5: anewarray java/lang/Object
    //   8: dup
    //   9: iconst_0
    //   10: iload_2
    //   11: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14: aastore
    //   15: dup
    //   16: iconst_1
    //   17: aconst_null
    //   18: aastore
    //   19: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   22: new java/lang/IllegalArgumentException
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   32: pop
    //   33: iload_2
    //   34: bipush #18
    //   36: if_icmpne -> 45
    //   39: aload_0
    //   40: aload_1
    //   41: invokevirtual b : (Landroid/content/Context;)V
    //   44: return
    //   45: aload #4
    //   47: ifnonnull -> 65
    //   50: iload_2
    //   51: bipush #6
    //   53: if_icmpne -> 64
    //   56: ldc 'GoogleApiAvailability'
    //   58: ldc 'Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.'
    //   60: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   63: pop
    //   64: return
    //   65: aload_1
    //   66: iload_2
    //   67: invokestatic b : (Landroid/content/Context;I)Ljava/lang/String;
    //   70: astore #8
    //   72: aload_1
    //   73: iload_2
    //   74: invokestatic d : (Landroid/content/Context;I)Ljava/lang/String;
    //   77: astore_3
    //   78: aload_1
    //   79: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   82: astore #5
    //   84: aload_1
    //   85: ldc 'notification'
    //   87: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   90: astore #6
    //   92: aload #6
    //   94: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   97: pop
    //   98: aload #6
    //   100: checkcast android/app/NotificationManager
    //   103: astore #6
    //   105: new androidx/core/app/i$e
    //   108: dup
    //   109: aload_1
    //   110: invokespecial <init> : (Landroid/content/Context;)V
    //   113: astore #7
    //   115: aload #7
    //   117: iconst_1
    //   118: invokevirtual c : (Z)Landroidx/core/app/i$e;
    //   121: pop
    //   122: aload #7
    //   124: iconst_1
    //   125: invokevirtual a : (Z)Landroidx/core/app/i$e;
    //   128: pop
    //   129: aload #7
    //   131: aload #8
    //   133: invokevirtual b : (Ljava/lang/CharSequence;)Landroidx/core/app/i$e;
    //   136: pop
    //   137: new androidx/core/app/i$c
    //   140: dup
    //   141: invokespecial <init> : ()V
    //   144: astore #8
    //   146: aload #8
    //   148: aload_3
    //   149: invokevirtual a : (Ljava/lang/CharSequence;)Landroidx/core/app/i$c;
    //   152: pop
    //   153: aload #7
    //   155: aload #8
    //   157: invokevirtual a : (Landroidx/core/app/i$f;)Landroidx/core/app/i$e;
    //   160: pop
    //   161: aload_1
    //   162: invokestatic b : (Landroid/content/Context;)Z
    //   165: ifeq -> 234
    //   168: invokestatic e : ()Z
    //   171: invokestatic b : (Z)V
    //   174: aload #7
    //   176: aload_1
    //   177: invokevirtual getApplicationInfo : ()Landroid/content/pm/ApplicationInfo;
    //   180: getfield icon : I
    //   183: invokevirtual e : (I)Landroidx/core/app/i$e;
    //   186: pop
    //   187: aload #7
    //   189: iconst_2
    //   190: invokevirtual d : (I)Landroidx/core/app/i$e;
    //   193: pop
    //   194: aload_1
    //   195: invokestatic c : (Landroid/content/Context;)Z
    //   198: ifeq -> 223
    //   201: aload #7
    //   203: getstatic e/f/a/e/b/a.common_full_open_on_phone : I
    //   206: aload #5
    //   208: getstatic e/f/a/e/b/b.common_open_on_phone : I
    //   211: invokevirtual getString : (I)Ljava/lang/String;
    //   214: aload #4
    //   216: invokevirtual a : (ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/i$e;
    //   219: pop
    //   220: goto -> 281
    //   223: aload #7
    //   225: aload #4
    //   227: invokevirtual a : (Landroid/app/PendingIntent;)Landroidx/core/app/i$e;
    //   230: pop
    //   231: goto -> 281
    //   234: aload #7
    //   236: ldc_w 17301642
    //   239: invokevirtual e : (I)Landroidx/core/app/i$e;
    //   242: pop
    //   243: aload #7
    //   245: aload #5
    //   247: getstatic e/f/a/e/b/b.common_google_play_services_notification_ticker : I
    //   250: invokevirtual getString : (I)Ljava/lang/String;
    //   253: invokevirtual d : (Ljava/lang/CharSequence;)Landroidx/core/app/i$e;
    //   256: pop
    //   257: aload #7
    //   259: invokestatic currentTimeMillis : ()J
    //   262: invokevirtual b : (J)Landroidx/core/app/i$e;
    //   265: pop
    //   266: aload #7
    //   268: aload #4
    //   270: invokevirtual a : (Landroid/app/PendingIntent;)Landroidx/core/app/i$e;
    //   273: pop
    //   274: aload #7
    //   276: aload_3
    //   277: invokevirtual a : (Ljava/lang/CharSequence;)Landroidx/core/app/i$e;
    //   280: pop
    //   281: invokestatic h : ()Z
    //   284: ifeq -> 391
    //   287: invokestatic h : ()Z
    //   290: invokestatic b : (Z)V
    //   293: aload_0
    //   294: invokespecial b : ()Ljava/lang/String;
    //   297: astore #4
    //   299: aload #4
    //   301: astore_3
    //   302: aload #4
    //   304: ifnonnull -> 384
    //   307: ldc_w 'com.google.android.gms.availability'
    //   310: astore #4
    //   312: aload #6
    //   314: ldc_w 'com.google.android.gms.availability'
    //   317: invokevirtual getNotificationChannel : (Ljava/lang/String;)Landroid/app/NotificationChannel;
    //   320: astore #5
    //   322: aload_1
    //   323: invokestatic a : (Landroid/content/Context;)Ljava/lang/String;
    //   326: astore_1
    //   327: aload #5
    //   329: ifnonnull -> 357
    //   332: new android/app/NotificationChannel
    //   335: dup
    //   336: ldc_w 'com.google.android.gms.availability'
    //   339: aload_1
    //   340: iconst_4
    //   341: invokespecial <init> : (Ljava/lang/String;Ljava/lang/CharSequence;I)V
    //   344: astore_1
    //   345: aload #6
    //   347: aload_1
    //   348: invokevirtual createNotificationChannel : (Landroid/app/NotificationChannel;)V
    //   351: aload #4
    //   353: astore_3
    //   354: goto -> 384
    //   357: aload #4
    //   359: astore_3
    //   360: aload_1
    //   361: aload #5
    //   363: invokevirtual getName : ()Ljava/lang/CharSequence;
    //   366: invokevirtual contentEquals : (Ljava/lang/CharSequence;)Z
    //   369: ifne -> 384
    //   372: aload #5
    //   374: aload_1
    //   375: invokevirtual setName : (Ljava/lang/CharSequence;)V
    //   378: aload #5
    //   380: astore_1
    //   381: goto -> 345
    //   384: aload #7
    //   386: aload_3
    //   387: invokevirtual b : (Ljava/lang/String;)Landroidx/core/app/i$e;
    //   390: pop
    //   391: aload #7
    //   393: invokevirtual a : ()Landroid/app/Notification;
    //   396: astore_1
    //   397: iload_2
    //   398: iconst_1
    //   399: if_icmpeq -> 419
    //   402: iload_2
    //   403: iconst_2
    //   404: if_icmpeq -> 419
    //   407: iload_2
    //   408: iconst_3
    //   409: if_icmpeq -> 419
    //   412: ldc_w 39789
    //   415: istore_2
    //   416: goto -> 430
    //   419: sipush #10436
    //   422: istore_2
    //   423: getstatic e/f/a/e/e/g.d : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   426: iconst_0
    //   427: invokevirtual set : (Z)V
    //   430: aload #6
    //   432: iload_2
    //   433: aload_1
    //   434: invokevirtual notify : (ILandroid/app/Notification;)V
    //   437: return
  }
  
  private final String b() {
    synchronized (c) {
      return this.b;
    } 
  }
  
  @RecentlyNonNull
  public int a(@RecentlyNonNull Context paramContext) {
    return super.a(paramContext);
  }
  
  @RecentlyNonNull
  public int a(@RecentlyNonNull Context paramContext, @RecentlyNonNull int paramInt) {
    return super.a(paramContext, paramInt);
  }
  
  @RecentlyNullable
  public Dialog a(@RecentlyNonNull Activity paramActivity, @RecentlyNonNull int paramInt1, @RecentlyNonNull int paramInt2) {
    return a(paramActivity, paramInt1, paramInt2, (DialogInterface.OnCancelListener)null);
  }
  
  @RecentlyNullable
  public Dialog a(@RecentlyNonNull Activity paramActivity, @RecentlyNonNull int paramInt1, @RecentlyNonNull int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener) {
    return a((Context)paramActivity, paramInt1, u.a(paramActivity, a((Context)paramActivity, paramInt1, "d"), paramInt2), paramOnCancelListener);
  }
  
  @RecentlyNullable
  public PendingIntent a(@RecentlyNonNull Context paramContext, @RecentlyNonNull int paramInt1, @RecentlyNonNull int paramInt2) {
    return super.a(paramContext, paramInt1, paramInt2);
  }
  
  @RecentlyNullable
  public PendingIntent a(@RecentlyNonNull Context paramContext, @RecentlyNonNull a parama) {
    return parama.e() ? parama.d() : a(paramContext, parama.b(), 0);
  }
  
  @RecentlyNullable
  public Intent a(Context paramContext, @RecentlyNonNull int paramInt, String paramString) {
    return super.a(paramContext, paramInt, paramString);
  }
  
  public final z a(Context paramContext, b0 paramb0) {
    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
    intentFilter.addDataScheme("package");
    z z = new z(paramb0);
    paramContext.registerReceiver((BroadcastReceiver)z, intentFilter);
    z.a(paramContext);
    if (!a(paramContext, "com.google.android.gms")) {
      paramb0.a();
      z.a();
      return null;
    } 
    return z;
  }
  
  public l<Void> a(@RecentlyNonNull Activity paramActivity) {
    int i = e;
    q.a("makeGooglePlayServicesAvailable must be called from the main thread");
    i = a((Context)paramActivity, i);
    if (i == 0)
      return o.a(null); 
    c0 c0 = c0.b(paramActivity);
    c0.b(new a(i, null), 0);
    return c0.h();
  }
  
  public final String a(@RecentlyNonNull int paramInt) {
    return super.a(paramInt);
  }
  
  @RecentlyNonNull
  public final boolean a(@RecentlyNonNull Activity paramActivity, @RecentlyNonNull i parami, @RecentlyNonNull int paramInt1, @RecentlyNonNull int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener) {
    Dialog dialog = a((Context)paramActivity, paramInt1, u.a(parami, a((Context)paramActivity, paramInt1, "d"), 2), paramOnCancelListener);
    if (dialog == null)
      return false; 
    a(paramActivity, dialog, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  @RecentlyNonNull
  public final boolean a(@RecentlyNonNull Context paramContext, @RecentlyNonNull a parama, @RecentlyNonNull int paramInt) {
    PendingIntent pendingIntent = a(paramContext, parama);
    if (pendingIntent != null) {
      a(paramContext, parama.b(), (String)null, GoogleApiActivity.a(paramContext, pendingIntent, paramInt));
      return true;
    } 
    return false;
  }
  
  final void b(Context paramContext) {
    (new a(this, paramContext)).sendEmptyMessageDelayed(1, 120000L);
  }
  
  public void b(@RecentlyNonNull Context paramContext, @RecentlyNonNull int paramInt) {
    a(paramContext, paramInt, (String)null, a(paramContext, paramInt, 0, "n"));
  }
  
  @RecentlyNonNull
  public final boolean b(@RecentlyNonNull int paramInt) {
    return super.b(paramInt);
  }
  
  @RecentlyNonNull
  public boolean b(@RecentlyNonNull Activity paramActivity, @RecentlyNonNull int paramInt1, @RecentlyNonNull int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener) {
    Dialog dialog = a(paramActivity, paramInt1, paramInt2, paramOnCancelListener);
    if (dialog == null)
      return false; 
    a(paramActivity, dialog, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  @SuppressLint({"HandlerLeak"})
  private final class a extends e.f.a.e.i.c.d {
    private final Context a;
    
    public a(d this$0, Context param1Context) {
      super(looper);
      Looper looper;
      this.a = param1Context.getApplicationContext();
    }
    
    public final void handleMessage(Message param1Message) {
      int i = param1Message.what;
      if (i != 1) {
        StringBuilder stringBuilder = new StringBuilder(50);
        stringBuilder.append("Don't know how to handle this message: ");
        stringBuilder.append(i);
        Log.w("GoogleApiAvailability", stringBuilder.toString());
        return;
      } 
      i = this.b.a(this.a);
      if (this.b.b(i))
        this.b.b(this.a, i); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */