package b.n.b;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class b<D> {
  int a;
  
  b<D> b;
  
  a<D> c;
  
  boolean d = false;
  
  boolean e = false;
  
  boolean f = true;
  
  boolean g = false;
  
  boolean h = false;
  
  public b(Context paramContext) {
    paramContext.getApplicationContext();
  }
  
  public String a(D paramD) {
    StringBuilder stringBuilder = new StringBuilder(64);
    androidx.core.util.a.a(paramD, stringBuilder);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public void a() {
    this.e = true;
    g();
  }
  
  public void a(int paramInt, b<D> paramb) {
    if (this.b == null) {
      this.b = paramb;
      this.a = paramInt;
      return;
    } 
    throw new IllegalStateException("There is already a listener registered");
  }
  
  public void a(b<D> paramb) {
    b<D> b1 = this.b;
    if (b1 != null) {
      if (b1 == paramb) {
        this.b = null;
        return;
      } 
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    } 
    throw new IllegalStateException("No listener register");
  }
  
  @Deprecated
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.a);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(this.b);
    if (this.d || this.g || this.h) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.d);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(this.g);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(this.h);
    } 
    if (this.e || this.f) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(this.e);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(this.f);
    } 
  }
  
  public void b(D paramD) {
    b<D> b1 = this.b;
    if (b1 != null)
      b1.a(this, paramD); 
  }
  
  public boolean b() {
    return h();
  }
  
  public void c() {
    this.h = false;
  }
  
  public void d() {
    a<D> a1 = this.c;
    if (a1 != null)
      a1.a(this); 
  }
  
  public void e() {
    j();
  }
  
  public boolean f() {
    return this.e;
  }
  
  protected void g() {}
  
  protected boolean h() {
    throw null;
  }
  
  public void i() {
    if (this.d) {
      e();
      return;
    } 
    this.g = true;
  }
  
  protected void j() {}
  
  protected void k() {}
  
  protected void l() {
    throw null;
  }
  
  protected void m() {}
  
  public void n() {
    k();
    this.f = true;
    this.d = false;
    this.e = false;
    this.g = false;
    this.h = false;
  }
  
  public void o() {
    if (this.h)
      i(); 
  }
  
  public final void p() {
    this.d = true;
    this.f = false;
    this.e = false;
    l();
  }
  
  public void q() {
    this.d = false;
    m();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    androidx.core.util.a.a(this, stringBuilder);
    stringBuilder.append(" id=");
    stringBuilder.append(this.a);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public static interface a<D> {
    void a(b<D> param1b);
  }
  
  public static interface b<D> {
    void a(b<D> param1b, D param1D);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/n/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */