package b.g.k;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import b.g.f.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class b {
  static final b.d.e<String, Typeface> a = new b.d.e(16);
  
  private static final c b = new c("fonts", 10, 10000);
  
  static final Object c = new Object();
  
  static final b.d.g<String, ArrayList<c.d<g>>> d = new b.d.g();
  
  private static final Comparator<byte[]> e = new d();
  
  public static ProviderInfo a(PackageManager paramPackageManager, a parama, Resources paramResources) {
    String str = parama.d();
    int i = 0;
    ProviderInfo providerInfo = paramPackageManager.resolveContentProvider(str, 0);
    if (providerInfo != null) {
      List<List<byte[]>> list;
      if (providerInfo.packageName.equals(parama.e())) {
        List<byte[]> list1 = a((paramPackageManager.getPackageInfo(providerInfo.packageName, 64)).signatures);
        Collections.sort((List)list1, (Comparator)e);
        list = a(parama, paramResources);
        while (i < list.size()) {
          ArrayList<byte> arrayList = new ArrayList(list.get(i));
          Collections.sort(arrayList, (Comparator)e);
          if (a(list1, (List)arrayList))
            return providerInfo; 
          i++;
        } 
        return null;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Found content provider ");
      stringBuilder1.append(str);
      stringBuilder1.append(", but package was not ");
      stringBuilder1.append(list.e());
      throw new PackageManager.NameNotFoundException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No package found for authority: ");
    stringBuilder.append(str);
    PackageManager.NameNotFoundException nameNotFoundException = new PackageManager.NameNotFoundException(stringBuilder.toString());
    throw nameNotFoundException;
  }
  
  public static Typeface a(Context paramContext, a parama, b.g.e.d.f.a parama1, Handler paramHandler, boolean paramBoolean, int paramInt1, int paramInt2) {
    g g1;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(parama.c());
    stringBuilder.append("-");
    stringBuilder.append(paramInt2);
    String str = stringBuilder.toString();
    Typeface typeface = (Typeface)a.b(str);
    if (typeface != null) {
      if (parama1 != null)
        parama1.a(typeface); 
      return typeface;
    } 
    if (paramBoolean && paramInt1 == -1) {
      g1 = a(paramContext, parama, paramInt2);
      if (parama1 != null) {
        paramInt1 = g1.b;
        if (paramInt1 == 0) {
          parama1.a(g1.a, paramHandler);
        } else {
          parama1.a(paramInt1, paramHandler);
        } 
      } 
      return g1.a;
    } 
    a a1 = new a((Context)g1, parama, paramInt2, str);
    if (paramBoolean)
      try {
        return ((g)b.a(a1, paramInt1)).a;
      } catch (InterruptedException interruptedException) {
        return null;
      }  
    if (parama1 == null) {
      g1 = null;
    } else {
      null = new b(parama1, paramHandler);
    } 
    synchronized (c) {
      ArrayList<b> arrayList = (ArrayList)d.get(str);
      if (arrayList != null) {
        if (null != null)
          arrayList.add(null); 
        return null;
      } 
      if (null != null) {
        arrayList = new ArrayList<b>();
        arrayList.add(null);
        d.put(str, arrayList);
      } 
      b.a(a1, new c(str));
      return null;
    } 
  }
  
  public static e a(Context paramContext, CancellationSignal paramCancellationSignal, a parama) {
    ProviderInfo providerInfo = a(paramContext.getPackageManager(), parama, paramContext.getResources());
    return (providerInfo == null) ? new e(1, null) : new e(0, a(paramContext, parama, providerInfo.authority, paramCancellationSignal));
  }
  
  static g a(Context paramContext, a parama, int paramInt) {
    try {
      e e1 = a(paramContext, (CancellationSignal)null, parama);
      int i = e1.b();
      byte b1 = -3;
      if (i == 0) {
        Typeface typeface = b.g.f.d.a(paramContext, null, e1.a(), paramInt);
        if (typeface != null)
          b1 = 0; 
        return new g(typeface, b1);
      } 
      if (e1.b() == 1)
        b1 = -2; 
      return new g(null, b1);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      return new g(null, -1);
    } 
  }
  
  private static List<List<byte[]>> a(a parama, Resources paramResources) {
    return (parama.a() != null) ? parama.a() : b.g.e.d.c.a(paramResources, parama.b());
  }
  
  private static List<byte[]> a(Signature[] paramArrayOfSignature) {
    ArrayList<byte[]> arrayList = new ArrayList();
    for (int i = 0; i < paramArrayOfSignature.length; i++)
      arrayList.add(paramArrayOfSignature[i].toByteArray()); 
    return (List<byte[]>)arrayList;
  }
  
  public static Map<Uri, ByteBuffer> a(Context paramContext, f[] paramArrayOff, CancellationSignal paramCancellationSignal) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    int j = paramArrayOff.length;
    for (int i = 0; i < j; i++) {
      f f1 = paramArrayOff[i];
      if (f1.a() == 0) {
        Uri uri = f1.c();
        if (!hashMap.containsKey(uri))
          hashMap.put(uri, k.a(paramContext, paramCancellationSignal, uri)); 
      } 
    } 
    return (Map)Collections.unmodifiableMap(hashMap);
  }
  
  private static boolean a(List<byte[]> paramList1, List<byte[]> paramList2) {
    if (paramList1.size() != paramList2.size())
      return false; 
    for (int i = 0; i < paramList1.size(); i++) {
      if (!Arrays.equals(paramList1.get(i), paramList2.get(i)))
        return false; 
    } 
    return true;
  }
  
  static f[] a(Context paramContext, a parama, String paramString, CancellationSignal paramCancellationSignal) {
    ArrayList arrayList = new ArrayList();
    Uri uri1 = (new Uri.Builder()).scheme("content").authority(paramString).build();
    Uri uri2 = (new Uri.Builder()).scheme("content").authority(paramString).appendPath("file").build();
    try {
      Cursor cursor;
      String str;
      int i = Build.VERSION.SDK_INT;
      if (i > 16) {
        ContentResolver contentResolver = paramContext.getContentResolver();
        str = parama.f();
        cursor = contentResolver.query(uri1, new String[] { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" }, "query = ?", new String[] { str }, null, paramCancellationSignal);
      } else {
        ContentResolver contentResolver = cursor.getContentResolver();
        str = str.f();
        cursor = contentResolver.query(uri1, new String[] { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" }, "query = ?", new String[] { str }, null);
      } 
      if (cursor != null)
        try {
          if (cursor.getCount() > 0) {
            int j = cursor.getColumnIndex("result_code");
            ArrayList<f> arrayList2 = new ArrayList();
            int k = cursor.getColumnIndex("_id");
            int m = cursor.getColumnIndex("file_id");
            int n = cursor.getColumnIndex("font_ttc_index");
            int i1 = cursor.getColumnIndex("font_weight");
            int i2 = cursor.getColumnIndex("font_italic");
            while (true) {
              ArrayList<f> arrayList3 = arrayList2;
              return (f[])uri.toArray((Object[])new f[0]);
            } 
          } 
        } finally {} 
      return (f[])arrayList1.toArray((Object[])new f[0]);
    } finally {
      paramContext = null;
      if (paramContext != null)
        paramContext.close(); 
    } 
  }
  
  class a implements Callable<g> {
    a(b this$0, a param1a, int param1Int, String param1String) {}
    
    public b.g call() {
      b.g g = b.a(this.a, this.b, this.c);
      Typeface typeface = g.a;
      if (typeface != null)
        b.a.a(this.d, typeface); 
      return g;
    }
  }
  
  class b implements c.d<g> {
    b(b this$0, Handler param1Handler) {}
    
    public void a(b.g param1g) {
      b.g.e.d.f.a a1;
      int i;
      if (param1g == null) {
        a1 = this.a;
        i = 1;
      } else {
        i = ((b.g)a1).b;
        if (i == 0) {
          this.a.a(((b.g)a1).a, this.b);
          return;
        } 
        a1 = this.a;
      } 
      a1.a(i, this.b);
    }
  }
  
  class c implements c.d<g> {
    c(b this$0) {}
    
    public void a(b.g param1g) {
      synchronized (b.c) {
        ArrayList<c.d<b.g>> arrayList = (ArrayList)b.d.get(this.a);
        if (arrayList == null)
          return; 
        b.d.remove(this.a);
        for (int i = 0; i < arrayList.size(); i++)
          ((c.d<b.g>)arrayList.get(i)).a(param1g); 
        return;
      } 
    }
  }
  
  class d implements Comparator<byte[]> {
    public int a(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      if (param1ArrayOfbyte1.length != param1ArrayOfbyte2.length) {
        int j = param1ArrayOfbyte1.length;
        int k = param1ArrayOfbyte2.length;
        return j - k;
      } 
      for (int i = 0; i < param1ArrayOfbyte1.length; i++) {
        if (param1ArrayOfbyte1[i] != param1ArrayOfbyte2[i]) {
          byte b1 = param1ArrayOfbyte1[i];
          byte b2 = param1ArrayOfbyte2[i];
          i = b1;
          b1 = b2;
          return i - b1;
        } 
      } 
      return 0;
    }
  }
  
  public static class e {
    private final int a;
    
    private final b.f[] b;
    
    public e(int param1Int, b.f[] param1ArrayOff) {
      this.a = param1Int;
      this.b = param1ArrayOff;
    }
    
    public b.f[] a() {
      return this.b;
    }
    
    public int b() {
      return this.a;
    }
  }
  
  public static class f {
    private final Uri a;
    
    private final int b;
    
    private final int c;
    
    private final boolean d;
    
    private final int e;
    
    public f(Uri param1Uri, int param1Int1, int param1Int2, boolean param1Boolean, int param1Int3) {
      androidx.core.util.f.a(param1Uri);
      this.a = param1Uri;
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Boolean;
      this.e = param1Int3;
    }
    
    public int a() {
      return this.e;
    }
    
    public int b() {
      return this.b;
    }
    
    public Uri c() {
      return this.a;
    }
    
    public int d() {
      return this.c;
    }
    
    public boolean e() {
      return this.d;
    }
  }
  
  private static final class g {
    final Typeface a;
    
    final int b;
    
    g(Typeface param1Typeface, int param1Int) {
      this.a = param1Typeface;
      this.b = param1Int;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/k/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */