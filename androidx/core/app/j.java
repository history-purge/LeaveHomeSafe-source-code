package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class j implements h {
  private final Notification.Builder a;
  
  private final i.e b;
  
  private RemoteViews c;
  
  private RemoteViews d;
  
  private final List<Bundle> e;
  
  private final Bundle f;
  
  private int g;
  
  private RemoteViews h;
  
  j(i.e parame) {
    boolean bool;
    this.e = new ArrayList<Bundle>();
    this.f = new Bundle();
    this.b = parame;
    if (Build.VERSION.SDK_INT >= 26) {
      builder = new Notification.Builder(parame.a, parame.I);
    } else {
      builder = new Notification.Builder(parame.a);
    } 
    this.a = builder;
    Notification notification = parame.P;
    Notification.Builder builder = this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, parame.h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
    if ((notification.flags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    builder = builder.setOngoing(bool);
    if ((notification.flags & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    builder = builder.setOnlyAlertOnce(bool);
    if ((notification.flags & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    builder = builder.setAutoCancel(bool).setDefaults(notification.defaults).setContentTitle(parame.d).setContentText(parame.e).setContentInfo(parame.j).setContentIntent(parame.f).setDeleteIntent(notification.deleteIntent);
    PendingIntent pendingIntent = parame.g;
    if ((notification.flags & 0x80) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    builder.setFullScreenIntent(pendingIntent, bool).setLargeIcon(parame.i).setNumber(parame.k).setProgress(parame.r, parame.s, parame.t);
    if (Build.VERSION.SDK_INT < 21)
      this.a.setSound(notification.sound, notification.audioStreamType); 
    if (Build.VERSION.SDK_INT >= 16) {
      this.a.setSubText(parame.p).setUsesChronometer(parame.n).setPriority(parame.l);
      Iterator<i.a> iterator = parame.b.iterator();
      while (iterator.hasNext())
        a(iterator.next()); 
      Bundle bundle = parame.B;
      if (bundle != null)
        this.f.putAll(bundle); 
      if (Build.VERSION.SDK_INT < 20) {
        if (parame.x)
          this.f.putBoolean("android.support.localOnly", true); 
        String str = parame.u;
        if (str != null) {
          Bundle bundle1;
          String str1;
          this.f.putString("android.support.groupKey", str);
          if (parame.v) {
            bundle1 = this.f;
            str1 = "android.support.isGroupSummary";
          } else {
            bundle1 = this.f;
            str1 = "android.support.useSideChannel";
          } 
          bundle1.putBoolean(str1, true);
        } 
        str = parame.w;
        if (str != null)
          this.f.putString("android.support.sortKey", str); 
      } 
      this.c = parame.F;
      this.d = parame.G;
    } 
    if (Build.VERSION.SDK_INT >= 19) {
      this.a.setShowWhen(parame.m);
      if (Build.VERSION.SDK_INT < 21) {
        ArrayList<String> arrayList = parame.R;
        if (arrayList != null && !arrayList.isEmpty()) {
          Bundle bundle = this.f;
          ArrayList<String> arrayList1 = parame.R;
          bundle.putStringArray("android.people", arrayList1.<String>toArray(new String[arrayList1.size()]));
        } 
      } 
    } 
    if (Build.VERSION.SDK_INT >= 20) {
      this.a.setLocalOnly(parame.x).setGroup(parame.u).setGroupSummary(parame.v).setSortKey(parame.w);
      this.g = parame.M;
    } 
    if (Build.VERSION.SDK_INT >= 21) {
      this.a.setCategory(parame.A).setColor(parame.C).setVisibility(parame.D).setPublicVersion(parame.E).setSound(notification.sound, notification.audioAttributes);
      for (String str : parame.R)
        this.a.addPerson(str); 
      this.h = parame.H;
      if (parame.c.size() > 0) {
        Bundle bundle2 = parame.b().getBundle("android.car.EXTENSIONS");
        Bundle bundle1 = bundle2;
        if (bundle2 == null)
          bundle1 = new Bundle(); 
        bundle2 = new Bundle();
        for (int i = 0; i < parame.c.size(); i++)
          bundle2.putBundle(Integer.toString(i), k.a(parame.c.get(i))); 
        bundle1.putBundle("invisible_actions", bundle2);
        parame.b().putBundle("android.car.EXTENSIONS", bundle1);
        this.f.putBundle("android.car.EXTENSIONS", bundle1);
      } 
    } 
    if (Build.VERSION.SDK_INT >= 24) {
      this.a.setExtras(parame.B).setRemoteInputHistory(parame.q);
      RemoteViews remoteViews = parame.F;
      if (remoteViews != null)
        this.a.setCustomContentView(remoteViews); 
      remoteViews = parame.G;
      if (remoteViews != null)
        this.a.setCustomBigContentView(remoteViews); 
      remoteViews = parame.H;
      if (remoteViews != null)
        this.a.setCustomHeadsUpContentView(remoteViews); 
    } 
    if (Build.VERSION.SDK_INT >= 26) {
      this.a.setBadgeIconType(parame.J).setShortcutId(parame.K).setTimeoutAfter(parame.L).setGroupAlertBehavior(parame.M);
      if (parame.z)
        this.a.setColorized(parame.y); 
      if (!TextUtils.isEmpty(parame.I))
        this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null); 
    } 
    if (Build.VERSION.SDK_INT >= 29) {
      this.a.setAllowSystemGeneratedContextualActions(parame.N);
      this.a.setBubbleMetadata(i.d.a(parame.O));
    } 
    if (parame.Q) {
      if (this.b.v) {
        this.g = 2;
      } else {
        this.g = 1;
      } 
      this.a.setVibrate(null);
      this.a.setSound(null);
      notification.defaults &= 0xFFFFFFFE;
      notification.defaults &= 0xFFFFFFFD;
      this.a.setDefaults(notification.defaults);
      if (Build.VERSION.SDK_INT >= 26) {
        if (TextUtils.isEmpty(this.b.u))
          this.a.setGroup("silent"); 
        this.a.setGroupAlertBehavior(this.g);
      } 
    } 
  }
  
  private void a(Notification paramNotification) {
    paramNotification.sound = null;
    paramNotification.vibrate = null;
    paramNotification.defaults &= 0xFFFFFFFE;
    paramNotification.defaults &= 0xFFFFFFFD;
  }
  
  private void a(i.a parama) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 20) {
      Notification.Action.Builder builder;
      Bundle bundle;
      IconCompat iconCompat = parama.e();
      i = Build.VERSION.SDK_INT;
      boolean bool = false;
      if (i >= 23) {
        if (iconCompat != null) {
          Icon icon = iconCompat.f();
        } else {
          iconCompat = null;
        } 
        builder = new Notification.Action.Builder((Icon)iconCompat, parama.i(), parama.a());
      } else {
        if (builder != null) {
          i = builder.a();
        } else {
          i = 0;
        } 
        builder = new Notification.Action.Builder(i, parama.i(), parama.a());
      } 
      if (parama.f() != null) {
        RemoteInput[] arrayOfRemoteInput = m.a(parama.f());
        int k = arrayOfRemoteInput.length;
        for (i = bool; i < k; i++)
          builder.addRemoteInput(arrayOfRemoteInput[i]); 
      } 
      if (parama.d() != null) {
        bundle = new Bundle(parama.d());
      } else {
        bundle = new Bundle();
      } 
      bundle.putBoolean("android.support.allowGeneratedReplies", parama.b());
      if (Build.VERSION.SDK_INT >= 24)
        builder.setAllowGeneratedReplies(parama.b()); 
      bundle.putInt("android.support.action.semanticAction", parama.g());
      if (Build.VERSION.SDK_INT >= 28)
        builder.setSemanticAction(parama.g()); 
      if (Build.VERSION.SDK_INT >= 29)
        builder.setContextual(parama.j()); 
      bundle.putBoolean("android.support.action.showsUserInterface", parama.h());
      builder.addExtras(bundle);
      this.a.addAction(builder.build());
      return;
    } 
    if (i >= 16)
      this.e.add(k.a(this.a, parama)); 
  }
  
  public Notification.Builder a() {
    return this.a;
  }
  
  public Notification b() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroidx/core/app/i$e;
    //   4: getfield o : Landroidx/core/app/i$f;
    //   7: astore_2
    //   8: aload_2
    //   9: ifnull -> 17
    //   12: aload_2
    //   13: aload_0
    //   14: invokevirtual a : (Landroidx/core/app/h;)V
    //   17: aload_2
    //   18: ifnull -> 30
    //   21: aload_2
    //   22: aload_0
    //   23: invokevirtual c : (Landroidx/core/app/h;)Landroid/widget/RemoteViews;
    //   26: astore_1
    //   27: goto -> 32
    //   30: aconst_null
    //   31: astore_1
    //   32: aload_0
    //   33: invokevirtual c : ()Landroid/app/Notification;
    //   36: astore_3
    //   37: aload_1
    //   38: ifnull -> 49
    //   41: aload_3
    //   42: aload_1
    //   43: putfield contentView : Landroid/widget/RemoteViews;
    //   46: goto -> 64
    //   49: aload_0
    //   50: getfield b : Landroidx/core/app/i$e;
    //   53: getfield F : Landroid/widget/RemoteViews;
    //   56: astore_1
    //   57: aload_1
    //   58: ifnull -> 64
    //   61: goto -> 41
    //   64: getstatic android/os/Build$VERSION.SDK_INT : I
    //   67: bipush #16
    //   69: if_icmplt -> 91
    //   72: aload_2
    //   73: ifnull -> 91
    //   76: aload_2
    //   77: aload_0
    //   78: invokevirtual b : (Landroidx/core/app/h;)Landroid/widget/RemoteViews;
    //   81: astore_1
    //   82: aload_1
    //   83: ifnull -> 91
    //   86: aload_3
    //   87: aload_1
    //   88: putfield bigContentView : Landroid/widget/RemoteViews;
    //   91: getstatic android/os/Build$VERSION.SDK_INT : I
    //   94: bipush #21
    //   96: if_icmplt -> 124
    //   99: aload_2
    //   100: ifnull -> 124
    //   103: aload_0
    //   104: getfield b : Landroidx/core/app/i$e;
    //   107: getfield o : Landroidx/core/app/i$f;
    //   110: aload_0
    //   111: invokevirtual d : (Landroidx/core/app/h;)Landroid/widget/RemoteViews;
    //   114: astore_1
    //   115: aload_1
    //   116: ifnull -> 124
    //   119: aload_3
    //   120: aload_1
    //   121: putfield headsUpContentView : Landroid/widget/RemoteViews;
    //   124: getstatic android/os/Build$VERSION.SDK_INT : I
    //   127: bipush #16
    //   129: if_icmplt -> 150
    //   132: aload_2
    //   133: ifnull -> 150
    //   136: aload_3
    //   137: invokestatic a : (Landroid/app/Notification;)Landroid/os/Bundle;
    //   140: astore_1
    //   141: aload_1
    //   142: ifnull -> 150
    //   145: aload_2
    //   146: aload_1
    //   147: invokevirtual a : (Landroid/os/Bundle;)V
    //   150: aload_3
    //   151: areturn
  }
  
  protected Notification c() {
    int i = Build.VERSION.SDK_INT;
    if (i >= 26)
      return this.a.build(); 
    if (i >= 24) {
      Notification notification = this.a.build();
      if (this.g != 0) {
        if (notification.getGroup() != null && (notification.flags & 0x200) != 0 && this.g == 2)
          a(notification); 
        if (notification.getGroup() != null && (notification.flags & 0x200) == 0 && this.g == 1)
          a(notification); 
      } 
      return notification;
    } 
    if (i >= 21) {
      this.a.setExtras(this.f);
      Notification notification = this.a.build();
      RemoteViews remoteViews = this.c;
      if (remoteViews != null)
        notification.contentView = remoteViews; 
      remoteViews = this.d;
      if (remoteViews != null)
        notification.bigContentView = remoteViews; 
      remoteViews = this.h;
      if (remoteViews != null)
        notification.headsUpContentView = remoteViews; 
      if (this.g != 0) {
        if (notification.getGroup() != null && (notification.flags & 0x200) != 0 && this.g == 2)
          a(notification); 
        if (notification.getGroup() != null && (notification.flags & 0x200) == 0 && this.g == 1)
          a(notification); 
      } 
      return notification;
    } 
    if (i >= 20) {
      this.a.setExtras(this.f);
      Notification notification = this.a.build();
      RemoteViews remoteViews = this.c;
      if (remoteViews != null)
        notification.contentView = remoteViews; 
      remoteViews = this.d;
      if (remoteViews != null)
        notification.bigContentView = remoteViews; 
      if (this.g != 0) {
        if (notification.getGroup() != null && (notification.flags & 0x200) != 0 && this.g == 2)
          a(notification); 
        if (notification.getGroup() != null && (notification.flags & 0x200) == 0 && this.g == 1)
          a(notification); 
      } 
      return notification;
    } 
    if (i >= 19) {
      SparseArray<Bundle> sparseArray = k.a(this.e);
      if (sparseArray != null)
        this.f.putSparseParcelableArray("android.support.actionExtras", sparseArray); 
      this.a.setExtras(this.f);
      Notification notification = this.a.build();
      RemoteViews remoteViews = this.c;
      if (remoteViews != null)
        notification.contentView = remoteViews; 
      remoteViews = this.d;
      if (remoteViews != null)
        notification.bigContentView = remoteViews; 
      return notification;
    } 
    if (i >= 16) {
      Notification notification = this.a.build();
      Bundle bundle1 = i.a(notification);
      Bundle bundle2 = new Bundle(this.f);
      for (String str : this.f.keySet()) {
        if (bundle1.containsKey(str))
          bundle2.remove(str); 
      } 
      bundle1.putAll(bundle2);
      SparseArray<Bundle> sparseArray = k.a(this.e);
      if (sparseArray != null)
        i.a(notification).putSparseParcelableArray("android.support.actionExtras", sparseArray); 
      RemoteViews remoteViews = this.c;
      if (remoteViews != null)
        notification.contentView = remoteViews; 
      remoteViews = this.d;
      if (remoteViews != null)
        notification.bigContentView = remoteViews; 
      return notification;
    } 
    return this.a.getNotification();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/app/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */