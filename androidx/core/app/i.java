package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;

public class i {
  public static Bundle a(Notification paramNotification) {
    int j = Build.VERSION.SDK_INT;
    return (j >= 19) ? paramNotification.extras : ((j >= 16) ? k.a(paramNotification) : null);
  }
  
  public static class a {
    final Bundle a;
    
    private IconCompat b;
    
    private final m[] c;
    
    private final m[] d;
    
    private boolean e;
    
    boolean f = true;
    
    private final int g;
    
    private final boolean h;
    
    @Deprecated
    public int i;
    
    public CharSequence j;
    
    public PendingIntent k;
    
    public a(int param1Int, CharSequence param1CharSequence, PendingIntent param1PendingIntent) {
      this(iconCompat, param1CharSequence, param1PendingIntent);
    }
    
    public a(IconCompat param1IconCompat, CharSequence param1CharSequence, PendingIntent param1PendingIntent) {
      this(param1IconCompat, param1CharSequence, param1PendingIntent, new Bundle(), null, null, true, 0, true, false);
    }
    
    a(IconCompat param1IconCompat, CharSequence param1CharSequence, PendingIntent param1PendingIntent, Bundle param1Bundle, m[] param1ArrayOfm1, m[] param1ArrayOfm2, boolean param1Boolean1, int param1Int, boolean param1Boolean2, boolean param1Boolean3) {
      this.b = param1IconCompat;
      if (param1IconCompat != null && param1IconCompat.c() == 2)
        this.i = param1IconCompat.a(); 
      this.j = i.e.e(param1CharSequence);
      this.k = param1PendingIntent;
      if (param1Bundle == null)
        param1Bundle = new Bundle(); 
      this.a = param1Bundle;
      this.c = param1ArrayOfm1;
      this.d = param1ArrayOfm2;
      this.e = param1Boolean1;
      this.g = param1Int;
      this.f = param1Boolean2;
      this.h = param1Boolean3;
    }
    
    public PendingIntent a() {
      return this.k;
    }
    
    public boolean b() {
      return this.e;
    }
    
    public m[] c() {
      return this.d;
    }
    
    public Bundle d() {
      return this.a;
    }
    
    public IconCompat e() {
      if (this.b == null) {
        int i = this.i;
        if (i != 0)
          this.b = IconCompat.a(null, "", i); 
      } 
      return this.b;
    }
    
    public m[] f() {
      return this.c;
    }
    
    public int g() {
      return this.g;
    }
    
    public boolean h() {
      return this.f;
    }
    
    public CharSequence i() {
      return this.j;
    }
    
    public boolean j() {
      return this.h;
    }
    
    public static final class a {
      private final IconCompat a;
      
      private final CharSequence b;
      
      private final PendingIntent c;
      
      private boolean d;
      
      private final Bundle e;
      
      private ArrayList<m> f;
      
      private int g;
      
      private boolean h;
      
      private boolean i;
      
      public a(int param2Int, CharSequence param2CharSequence, PendingIntent param2PendingIntent) {
        this(iconCompat, param2CharSequence, param2PendingIntent, new Bundle(), null, true, 0, true, false);
      }
      
      private a(IconCompat param2IconCompat, CharSequence param2CharSequence, PendingIntent param2PendingIntent, Bundle param2Bundle, m[] param2ArrayOfm, boolean param2Boolean1, int param2Int, boolean param2Boolean2, boolean param2Boolean3) {
        ArrayList<m> arrayList;
        this.d = true;
        this.h = true;
        this.a = param2IconCompat;
        this.b = i.e.e(param2CharSequence);
        this.c = param2PendingIntent;
        this.e = param2Bundle;
        if (param2ArrayOfm == null) {
          param2IconCompat = null;
        } else {
          arrayList = new ArrayList(Arrays.asList((Object[])param2ArrayOfm));
        } 
        this.f = arrayList;
        this.d = param2Boolean1;
        this.g = param2Int;
        this.h = param2Boolean2;
        this.i = param2Boolean3;
      }
      
      private void b() {
        if (!this.i)
          return; 
        if (this.c != null)
          return; 
        throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
      }
      
      public i.a a() {
        m[] arrayOfM1;
        m[] arrayOfM2;
        b();
        ArrayList<m> arrayList1 = new ArrayList();
        ArrayList<m> arrayList3 = new ArrayList();
        ArrayList<m> arrayList2 = this.f;
        if (arrayList2 != null)
          for (m m : arrayList2) {
            if (m.h()) {
              arrayList1.add(m);
              continue;
            } 
            arrayList3.add(m);
          }  
        boolean bool = arrayList1.isEmpty();
        arrayList2 = null;
        if (bool) {
          arrayList1 = null;
        } else {
          arrayOfM1 = arrayList1.<m>toArray(new m[arrayList1.size()]);
        } 
        if (!arrayList3.isEmpty())
          arrayOfM2 = arrayList3.<m>toArray(new m[arrayList3.size()]); 
        return new i.a(this.a, this.b, this.c, this.e, arrayOfM2, arrayOfM1, this.d, this.g, this.h, this.i);
      }
    }
  }
  
  public static final class a {
    private final IconCompat a;
    
    private final CharSequence b;
    
    private final PendingIntent c;
    
    private boolean d;
    
    private final Bundle e;
    
    private ArrayList<m> f;
    
    private int g;
    
    private boolean h;
    
    private boolean i;
    
    public a(int param1Int, CharSequence param1CharSequence, PendingIntent param1PendingIntent) {
      this(iconCompat, param1CharSequence, param1PendingIntent, new Bundle(), null, true, 0, true, false);
    }
    
    private a(IconCompat param1IconCompat, CharSequence param1CharSequence, PendingIntent param1PendingIntent, Bundle param1Bundle, m[] param1ArrayOfm, boolean param1Boolean1, int param1Int, boolean param1Boolean2, boolean param1Boolean3) {
      ArrayList<m> arrayList;
      this.d = true;
      this.h = true;
      this.a = param1IconCompat;
      this.b = i.e.e(param1CharSequence);
      this.c = param1PendingIntent;
      this.e = param1Bundle;
      if (param1ArrayOfm == null) {
        param1IconCompat = null;
      } else {
        arrayList = new ArrayList(Arrays.asList((Object[])param1ArrayOfm));
      } 
      this.f = arrayList;
      this.d = param1Boolean1;
      this.g = param1Int;
      this.h = param1Boolean2;
      this.i = param1Boolean3;
    }
    
    private void b() {
      if (!this.i)
        return; 
      if (this.c != null)
        return; 
      throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
    }
    
    public i.a a() {
      m[] arrayOfM1;
      m[] arrayOfM2;
      b();
      ArrayList<m> arrayList1 = new ArrayList();
      ArrayList<m> arrayList3 = new ArrayList();
      ArrayList<m> arrayList2 = this.f;
      if (arrayList2 != null)
        for (m m : arrayList2) {
          if (m.h()) {
            arrayList1.add(m);
            continue;
          } 
          arrayList3.add(m);
        }  
      boolean bool = arrayList1.isEmpty();
      arrayList2 = null;
      if (bool) {
        arrayList1 = null;
      } else {
        arrayOfM1 = arrayList1.<m>toArray(new m[arrayList1.size()]);
      } 
      if (!arrayList3.isEmpty())
        arrayOfM2 = arrayList3.<m>toArray(new m[arrayList3.size()]); 
      return new i.a(this.a, this.b, this.c, this.e, arrayOfM2, arrayOfM1, this.d, this.g, this.h, this.i);
    }
  }
  
  public static class b extends f {
    private Bitmap e;
    
    private Bitmap f;
    
    private boolean g;
    
    public b a(Bitmap param1Bitmap) {
      this.f = param1Bitmap;
      this.g = true;
      return this;
    }
    
    public b a(CharSequence param1CharSequence) {
      this.b = i.e.e(param1CharSequence);
      return this;
    }
    
    public void a(h param1h) {
      if (Build.VERSION.SDK_INT >= 16) {
        Notification.BigPictureStyle bigPictureStyle = (new Notification.BigPictureStyle(param1h.a())).setBigContentTitle(this.b).bigPicture(this.e);
        if (this.g)
          bigPictureStyle.bigLargeIcon(this.f); 
        if (this.d)
          bigPictureStyle.setSummaryText(this.c); 
      } 
    }
    
    public b b(Bitmap param1Bitmap) {
      this.e = param1Bitmap;
      return this;
    }
    
    public b b(CharSequence param1CharSequence) {
      this.c = i.e.e(param1CharSequence);
      this.d = true;
      return this;
    }
  }
  
  public static class c extends f {
    private CharSequence e;
    
    public c a(CharSequence param1CharSequence) {
      this.e = i.e.e(param1CharSequence);
      return this;
    }
    
    public void a(h param1h) {
      if (Build.VERSION.SDK_INT >= 16) {
        Notification.BigTextStyle bigTextStyle = (new Notification.BigTextStyle(param1h.a())).setBigContentTitle(this.b).bigText(this.e);
        if (this.d)
          bigTextStyle.setSummaryText(this.c); 
      } 
    }
  }
  
  public static final class d {
    public static Notification.BubbleMetadata a(d param1d) {
      if (param1d == null)
        return null; 
      new Notification.BubbleMetadata.Builder();
      param1d.a();
      throw null;
    }
    
    public boolean a() {
      throw null;
    }
  }
  
  public static class e {
    String A;
    
    Bundle B;
    
    int C = 0;
    
    int D = 0;
    
    Notification E;
    
    RemoteViews F;
    
    RemoteViews G;
    
    RemoteViews H;
    
    String I;
    
    int J = 0;
    
    String K;
    
    long L;
    
    int M = 0;
    
    boolean N;
    
    i.d O;
    
    Notification P = new Notification();
    
    boolean Q;
    
    @Deprecated
    public ArrayList<String> R;
    
    public Context a;
    
    public ArrayList<i.a> b = new ArrayList<i.a>();
    
    ArrayList<i.a> c = new ArrayList<i.a>();
    
    CharSequence d;
    
    CharSequence e;
    
    PendingIntent f;
    
    PendingIntent g;
    
    RemoteViews h;
    
    Bitmap i;
    
    CharSequence j;
    
    int k;
    
    int l;
    
    boolean m = true;
    
    boolean n;
    
    i.f o;
    
    CharSequence p;
    
    CharSequence[] q;
    
    int r;
    
    int s;
    
    boolean t;
    
    String u;
    
    boolean v;
    
    String w;
    
    boolean x = false;
    
    boolean y;
    
    boolean z;
    
    @Deprecated
    public e(Context param1Context) {
      this(param1Context, null);
    }
    
    public e(Context param1Context, String param1String) {
      this.a = param1Context;
      this.I = param1String;
      this.P.when = System.currentTimeMillis();
      this.P.audioStreamType = -1;
      this.l = 0;
      this.R = new ArrayList<String>();
      this.N = true;
    }
    
    private void a(int param1Int, boolean param1Boolean) {
      Notification notification;
      if (param1Boolean) {
        notification = this.P;
        param1Int |= notification.flags;
      } else {
        notification = this.P;
        param1Int = (param1Int ^ 0xFFFFFFFF) & notification.flags;
      } 
      notification.flags = param1Int;
    }
    
    private Bitmap b(Bitmap param1Bitmap) {
      Bitmap bitmap = param1Bitmap;
      if (param1Bitmap != null) {
        if (Build.VERSION.SDK_INT >= 27)
          return param1Bitmap; 
        Resources resources = this.a.getResources();
        int i = resources.getDimensionPixelSize(b.g.b.compat_notification_large_icon_max_width);
        int j = resources.getDimensionPixelSize(b.g.b.compat_notification_large_icon_max_height);
        if (param1Bitmap.getWidth() <= i && param1Bitmap.getHeight() <= j)
          return param1Bitmap; 
        double d1 = i;
        double d2 = Math.max(1, param1Bitmap.getWidth());
        Double.isNaN(d1);
        Double.isNaN(d2);
        d1 /= d2;
        d2 = j;
        double d3 = Math.max(1, param1Bitmap.getHeight());
        Double.isNaN(d2);
        Double.isNaN(d3);
        d1 = Math.min(d1, d2 / d3);
        d2 = param1Bitmap.getWidth();
        Double.isNaN(d2);
        i = (int)Math.ceil(d2 * d1);
        d2 = param1Bitmap.getHeight();
        Double.isNaN(d2);
        bitmap = Bitmap.createScaledBitmap(param1Bitmap, i, (int)Math.ceil(d2 * d1), true);
      } 
      return bitmap;
    }
    
    protected static CharSequence e(CharSequence param1CharSequence) {
      if (param1CharSequence == null)
        return param1CharSequence; 
      CharSequence charSequence = param1CharSequence;
      if (param1CharSequence.length() > 5120)
        charSequence = param1CharSequence.subSequence(0, 5120); 
      return charSequence;
    }
    
    public Notification a() {
      return (new j(this)).b();
    }
    
    public e a(int param1Int) {
      this.C = param1Int;
      return this;
    }
    
    public e a(int param1Int1, int param1Int2, int param1Int3) {
      Notification notification = this.P;
      notification.ledARGB = param1Int1;
      notification.ledOnMS = param1Int2;
      notification.ledOffMS = param1Int3;
      if (notification.ledOnMS != 0 && notification.ledOffMS != 0) {
        param1Int1 = 1;
      } else {
        param1Int1 = 0;
      } 
      notification = this.P;
      notification.flags = param1Int1 | notification.flags & 0xFFFFFFFE;
      return this;
    }
    
    public e a(int param1Int, CharSequence param1CharSequence, PendingIntent param1PendingIntent) {
      this.b.add(new i.a(param1Int, param1CharSequence, param1PendingIntent));
      return this;
    }
    
    public e a(long param1Long) {
      this.L = param1Long;
      return this;
    }
    
    public e a(PendingIntent param1PendingIntent) {
      this.f = param1PendingIntent;
      return this;
    }
    
    public e a(Bitmap param1Bitmap) {
      this.i = b(param1Bitmap);
      return this;
    }
    
    public e a(Uri param1Uri) {
      Notification notification = this.P;
      notification.sound = param1Uri;
      notification.audioStreamType = -1;
      if (Build.VERSION.SDK_INT >= 21)
        notification.audioAttributes = (new AudioAttributes.Builder()).setContentType(4).setUsage(5).build(); 
      return this;
    }
    
    public e a(i.a param1a) {
      this.b.add(param1a);
      return this;
    }
    
    public e a(i.f param1f) {
      if (this.o != param1f) {
        this.o = param1f;
        param1f = this.o;
        if (param1f != null)
          param1f.a(this); 
      } 
      return this;
    }
    
    public e a(CharSequence param1CharSequence) {
      this.e = e(param1CharSequence);
      return this;
    }
    
    public e a(String param1String) {
      this.A = param1String;
      return this;
    }
    
    public e a(boolean param1Boolean) {
      a(16, param1Boolean);
      return this;
    }
    
    public e a(long[] param1ArrayOflong) {
      this.P.vibrate = param1ArrayOflong;
      return this;
    }
    
    public Bundle b() {
      if (this.B == null)
        this.B = new Bundle(); 
      return this.B;
    }
    
    public e b(int param1Int) {
      Notification notification = this.P;
      notification.defaults = param1Int;
      if ((param1Int & 0x4) != 0)
        notification.flags |= 0x1; 
      return this;
    }
    
    public e b(long param1Long) {
      this.P.when = param1Long;
      return this;
    }
    
    public e b(PendingIntent param1PendingIntent) {
      this.P.deleteIntent = param1PendingIntent;
      return this;
    }
    
    public e b(CharSequence param1CharSequence) {
      this.d = e(param1CharSequence);
      return this;
    }
    
    public e b(String param1String) {
      this.I = param1String;
      return this;
    }
    
    public e b(boolean param1Boolean) {
      this.v = param1Boolean;
      return this;
    }
    
    public e c(int param1Int) {
      this.k = param1Int;
      return this;
    }
    
    public e c(CharSequence param1CharSequence) {
      this.p = e(param1CharSequence);
      return this;
    }
    
    public e c(String param1String) {
      this.u = param1String;
      return this;
    }
    
    public e c(boolean param1Boolean) {
      this.x = param1Boolean;
      return this;
    }
    
    public e d(int param1Int) {
      this.l = param1Int;
      return this;
    }
    
    public e d(CharSequence param1CharSequence) {
      this.P.tickerText = e(param1CharSequence);
      return this;
    }
    
    public e d(String param1String) {
      this.K = param1String;
      return this;
    }
    
    public e d(boolean param1Boolean) {
      a(2, param1Boolean);
      return this;
    }
    
    public e e(int param1Int) {
      this.P.icon = param1Int;
      return this;
    }
    
    public e e(boolean param1Boolean) {
      a(8, param1Boolean);
      return this;
    }
    
    public e f(int param1Int) {
      this.D = param1Int;
      return this;
    }
    
    public e f(boolean param1Boolean) {
      this.m = param1Boolean;
      return this;
    }
    
    public e g(boolean param1Boolean) {
      this.n = param1Boolean;
      return this;
    }
  }
  
  public static abstract class f {
    protected i.e a;
    
    CharSequence b;
    
    CharSequence c;
    
    boolean d = false;
    
    public void a(Bundle param1Bundle) {}
    
    public abstract void a(h param1h);
    
    public void a(i.e param1e) {
      if (this.a != param1e) {
        this.a = param1e;
        param1e = this.a;
        if (param1e != null)
          param1e.a(this); 
      } 
    }
    
    public RemoteViews b(h param1h) {
      return null;
    }
    
    public RemoteViews c(h param1h) {
      return null;
    }
    
    public RemoteViews d(h param1h) {
      return null;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/app/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */