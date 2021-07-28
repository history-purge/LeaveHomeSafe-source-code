package b.n.a;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import b.d.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class b extends a {
  static boolean c = false;
  
  private final j a;
  
  private final c b;
  
  b(j paramj, w paramw) {
    this.a = paramj;
    this.b = c.a(paramw);
  }
  
  private <D> b.n.b.b<D> a(int paramInt, Bundle paramBundle, a.a<D> parama, b.n.b.b<D> paramb) {
    try {
      this.b.f();
      b.n.b.b<D> b1 = parama.a(paramInt, paramBundle);
      if (b1 != null) {
        if (!b1.getClass().isMemberClass() || Modifier.isStatic(b1.getClass().getModifiers())) {
          a<D> a1 = new a<D>(paramInt, paramBundle, b1, paramb);
          if (c) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("  Created new loader ");
            stringBuilder1.append(a1);
            Log.v("LoaderManager", stringBuilder1.toString());
          } 
          this.b.a(paramInt, a1);
          return a1.a(this.a, parama);
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
        stringBuilder.append(b1);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
    } finally {
      this.b.c();
    } 
  }
  
  public <D> b.n.b.b<D> a(int paramInt, Bundle paramBundle, a.a<D> parama) {
    if (!this.b.d()) {
      if (Looper.getMainLooper() == Looper.myLooper()) {
        a<?> a1 = this.b.a(paramInt);
        if (c) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("initLoader in ");
          stringBuilder.append(this);
          stringBuilder.append(": args=");
          stringBuilder.append(paramBundle);
          Log.v("LoaderManager", stringBuilder.toString());
        } 
        if (a1 == null)
          return a(paramInt, paramBundle, parama, (b.n.b.b<D>)null); 
        if (c) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("  Re-using existing loader ");
          stringBuilder.append(a1);
          Log.v("LoaderManager", stringBuilder.toString());
        } 
        return (b.n.b.b)a1.a(this.a, parama);
      } 
      throw new IllegalStateException("initLoader must be called on the main thread");
    } 
    throw new IllegalStateException("Called while creating a loader");
  }
  
  public void a() {
    this.b.e();
  }
  
  @Deprecated
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    this.b.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("LoaderManager{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" in ");
    androidx.core.util.a.a(this.a, stringBuilder);
    stringBuilder.append("}}");
    return stringBuilder.toString();
  }
  
  public static class a<D> extends o<D> implements b.n.b.b.b<D> {
    private final int l;
    
    private final Bundle m;
    
    private final b.n.b.b<D> n;
    
    private j o;
    
    private b.b<D> p;
    
    private b.n.b.b<D> q;
    
    a(int param1Int, Bundle param1Bundle, b.n.b.b<D> param1b1, b.n.b.b<D> param1b2) {
      this.l = param1Int;
      this.m = param1Bundle;
      this.n = param1b1;
      this.q = param1b2;
      this.n.a(param1Int, this);
    }
    
    b.n.b.b<D> a(j param1j, a.a<D> param1a) {
      b.b<D> b1 = new b.b<D>(this.n, param1a);
      a(param1j, b1);
      b.b<D> b2 = this.p;
      if (b2 != null)
        b(b2); 
      this.o = param1j;
      this.p = b1;
      return this.n;
    }
    
    b.n.b.b<D> a(boolean param1Boolean) {
      if (b.c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  Destroying: ");
        stringBuilder.append(this);
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      this.n.b();
      this.n.a();
      b.b<D> b1 = this.p;
      if (b1 != null) {
        b(b1);
        if (param1Boolean)
          b1.b(); 
      } 
      this.n.a(this);
      if ((b1 != null && !b1.a()) || param1Boolean) {
        this.n.n();
        return this.q;
      } 
      return this.n;
    }
    
    public void a(b.n.b.b<D> param1b, D param1D) {
      if (b.c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onLoadComplete: ");
        stringBuilder.append(this);
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      if (Looper.myLooper() == Looper.getMainLooper()) {
        b(param1D);
        return;
      } 
      if (b.c)
        Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread"); 
      a(param1D);
    }
    
    public void a(String param1String, FileDescriptor param1FileDescriptor, PrintWriter param1PrintWriter, String[] param1ArrayOfString) {
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mId=");
      param1PrintWriter.print(this.l);
      param1PrintWriter.print(" mArgs=");
      param1PrintWriter.println(this.m);
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mLoader=");
      param1PrintWriter.println(this.n);
      b.n.b.b<D> b1 = this.n;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(param1String);
      stringBuilder.append("  ");
      b1.a(stringBuilder.toString(), param1FileDescriptor, param1PrintWriter, param1ArrayOfString);
      if (this.p != null) {
        param1PrintWriter.print(param1String);
        param1PrintWriter.print("mCallbacks=");
        param1PrintWriter.println(this.p);
        b.b<D> b2 = this.p;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(param1String);
        stringBuilder1.append("  ");
        b2.a(stringBuilder1.toString(), param1PrintWriter);
      } 
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mData=");
      param1PrintWriter.println(e().a(a()));
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mStarted=");
      param1PrintWriter.println(b());
    }
    
    public void b(p<? super D> param1p) {
      super.b(param1p);
      this.o = null;
      this.p = null;
    }
    
    public void b(D param1D) {
      super.b(param1D);
      b.n.b.b<D> b1 = this.q;
      if (b1 != null) {
        b1.n();
        this.q = null;
      } 
    }
    
    protected void c() {
      if (b.c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  Starting: ");
        stringBuilder.append(this);
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      this.n.p();
    }
    
    protected void d() {
      if (b.c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  Stopping: ");
        stringBuilder.append(this);
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      this.n.q();
    }
    
    b.n.b.b<D> e() {
      return this.n;
    }
    
    void f() {
      j j1 = this.o;
      b.b<D> b1 = this.p;
      if (j1 != null && b1 != null) {
        super.b(b1);
        a(j1, b1);
      } 
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder(64);
      stringBuilder.append("LoaderInfo{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" #");
      stringBuilder.append(this.l);
      stringBuilder.append(" : ");
      androidx.core.util.a.a(this.n, stringBuilder);
      stringBuilder.append("}}");
      return stringBuilder.toString();
    }
  }
  
  static class b<D> implements p<D> {
    private final b.n.b.b<D> a;
    
    private final a.a<D> b;
    
    private boolean c = false;
    
    b(b.n.b.b<D> param1b, a.a<D> param1a) {
      this.a = param1b;
      this.b = param1a;
    }
    
    public void a(D param1D) {
      if (b.c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  onLoadFinished in ");
        stringBuilder.append(this.a);
        stringBuilder.append(": ");
        stringBuilder.append(this.a.a(param1D));
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      this.b.a(this.a, param1D);
      this.c = true;
    }
    
    public void a(String param1String, PrintWriter param1PrintWriter) {
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mDeliveredData=");
      param1PrintWriter.println(this.c);
    }
    
    boolean a() {
      return this.c;
    }
    
    void b() {
      if (this.c) {
        if (b.c) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("  Resetting: ");
          stringBuilder.append(this.a);
          Log.v("LoaderManager", stringBuilder.toString());
        } 
        this.b.a(this.a);
      } 
    }
    
    public String toString() {
      return this.b.toString();
    }
  }
  
  static class c extends u {
    private static final v.b e = new a();
    
    private h<b.a> c = new h();
    
    private boolean d = false;
    
    static c a(w param1w) {
      return (c)(new v(param1w, e)).a(c.class);
    }
    
    <D> b.a<D> a(int param1Int) {
      return (b.a<D>)this.c.a(param1Int);
    }
    
    void a(int param1Int, b.a param1a) {
      this.c.c(param1Int, param1a);
    }
    
    public void a(String param1String, FileDescriptor param1FileDescriptor, PrintWriter param1PrintWriter, String[] param1ArrayOfString) {
      if (this.c.b() > 0) {
        param1PrintWriter.print(param1String);
        param1PrintWriter.println("Loaders:");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1String);
        stringBuilder.append("    ");
        String str = stringBuilder.toString();
        int i;
        for (i = 0; i < this.c.b(); i++) {
          b.a a = (b.a)this.c.c(i);
          param1PrintWriter.print(param1String);
          param1PrintWriter.print("  #");
          param1PrintWriter.print(this.c.b(i));
          param1PrintWriter.print(": ");
          param1PrintWriter.println(a.toString());
          a.a(str, param1FileDescriptor, param1PrintWriter, param1ArrayOfString);
        } 
      } 
    }
    
    protected void b() {
      super.b();
      int j = this.c.b();
      for (int i = 0; i < j; i++)
        ((b.a)this.c.c(i)).a(true); 
      this.c.a();
    }
    
    void c() {
      this.d = false;
    }
    
    boolean d() {
      return this.d;
    }
    
    void e() {
      int j = this.c.b();
      for (int i = 0; i < j; i++)
        ((b.a)this.c.c(i)).f(); 
    }
    
    void f() {
      this.d = true;
    }
    
    static final class a implements v.b {
      public <T extends u> T a(Class<T> param2Class) {
        return (T)new b.c();
      }
    }
  }
  
  static final class a implements v.b {
    public <T extends u> T a(Class<T> param1Class) {
      return (T)new b.c();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/n/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */