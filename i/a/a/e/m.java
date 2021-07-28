package i.a.a.e;

import java.util.TimeZone;

public class m implements Cloneable {
  private int c = 8;
  
  private int d;
  
  private boolean e = false;
  
  private int f = -1;
  
  private boolean g = true;
  
  private char[] h;
  
  private int i = -1;
  
  private boolean j = true;
  
  private String k;
  
  private TimeZone l = TimeZone.getDefault();
  
  private int m;
  
  private String n;
  
  private String o;
  
  private boolean p;
  
  public int a() {
    return this.i;
  }
  
  public void a(int paramInt) {
    this.i = paramInt;
  }
  
  public void a(String paramString) {
    this.n = paramString;
  }
  
  public void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public void a(char[] paramArrayOfchar) {
    this.h = paramArrayOfchar;
  }
  
  public int b() {
    return this.d;
  }
  
  public void b(int paramInt) {
    this.d = paramInt;
  }
  
  public void b(String paramString) {
    if (paramString == null)
      return; 
    a(paramString.toCharArray());
  }
  
  public int c() {
    return this.c;
  }
  
  public void c(int paramInt) {
    this.c = paramInt;
  }
  
  public Object clone() {
    return super.clone();
  }
  
  public String d() {
    return this.n;
  }
  
  public void d(int paramInt) {
    this.f = paramInt;
  }
  
  public void e(int paramInt) {
    this.m = paramInt;
  }
  
  public int f() {
    return this.f;
  }
  
  public String g() {
    return this.o;
  }
  
  public char[] h() {
    return this.h;
  }
  
  public String i() {
    return this.k;
  }
  
  public int j() {
    return this.m;
  }
  
  public TimeZone k() {
    return this.l;
  }
  
  public boolean l() {
    return this.e;
  }
  
  public boolean m() {
    return this.j;
  }
  
  public boolean n() {
    return this.g;
  }
  
  public boolean o() {
    return this.p;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/e/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */