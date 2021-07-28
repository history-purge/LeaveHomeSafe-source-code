package e.f.b.b.b;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a {
  private final List<d> a = new ArrayList<d>();
  
  public a(@RecentlyNonNull SparseArray<e.f.a.e.n.f.d> paramSparseArray) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < paramSparseArray.size(); i++) {
      e.f.a.e.n.f.d d = (e.f.a.e.n.f.d)paramSparseArray.get(paramSparseArray.keyAt(i));
      if (d != null) {
        d d1 = new d(d);
        this.a.add(d1);
        if (stringBuilder.length() != 0)
          stringBuilder.append("\n"); 
        if (d.getValue() != null)
          stringBuilder.append(d1.e()); 
      } 
    } 
    stringBuilder.toString();
  }
  
  public List<d> a() {
    return Collections.unmodifiableList(this.a);
  }
  
  public static class a extends c {
    a(e.f.a.e.n.f.a param1a) {
      super((e.f.a.e.n.f.c)param1a);
    }
    
    public String d() {
      return c();
    }
  }
  
  public static class b extends c {
    private final List<a.a> d = new ArrayList<a.a>();
    
    b(e.f.a.e.n.f.b param1b) {
      super((e.f.a.e.n.f.c)param1b);
      for (e.f.a.e.n.f.c c1 : param1b.getComponents()) {
        if (c1 instanceof e.f.a.e.n.f.a) {
          this.d.add(new a.a((e.f.a.e.n.f.a)c1));
          continue;
        } 
        Log.e("Text", "A subcomponent of line is should be an element!");
      } 
    }
    
    public List<a.a> d() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield d : Ljava/util/List;
      //   6: astore_1
      //   7: aload_0
      //   8: monitorexit
      //   9: aload_1
      //   10: areturn
      //   11: astore_1
      //   12: aload_0
      //   13: monitorexit
      //   14: aload_1
      //   15: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	11	finally
    }
    
    public String e() {
      return c();
    }
  }
  
  static class c {
    private final String a;
    
    private final Rect b;
    
    private final Point[] c;
    
    c(e.f.a.e.n.f.c param1c) {
      q.a(param1c, "Text to construct Text classes can't be null");
      this.a = param1c.getValue();
      this.b = param1c.a();
      this.c = param1c.b();
      param1c.c();
    }
    
    public Rect a() {
      return this.b;
    }
    
    public Point[] b() {
      return this.c;
    }
    
    protected final String c() {
      String str2 = this.a;
      String str1 = str2;
      if (str2 == null)
        str1 = ""; 
      return str1;
    }
  }
  
  public static class d extends c {
    private final List<a.b> d = new ArrayList<a.b>();
    
    d(e.f.a.e.n.f.d param1d) {
      super((e.f.a.e.n.f.c)param1d);
      for (e.f.a.e.n.f.c c1 : param1d.getComponents()) {
        if (c1 instanceof e.f.a.e.n.f.b) {
          this.d.add(new a.b((e.f.a.e.n.f.b)c1));
          continue;
        } 
        Log.e("Text", "A subcomponent of textblock is should be a line!");
      } 
    }
    
    public List<a.b> d() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield d : Ljava/util/List;
      //   6: astore_1
      //   7: aload_0
      //   8: monitorexit
      //   9: aload_1
      //   10: areturn
      //   11: astore_1
      //   12: aload_0
      //   13: monitorexit
      //   14: aload_1
      //   15: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	11	finally
    }
    
    public String e() {
      return c();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/b/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */