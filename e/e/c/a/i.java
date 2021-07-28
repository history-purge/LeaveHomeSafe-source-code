package e.e.c.a;

import android.net.Uri;

public class i implements d {
  final String a;
  
  public i(String paramString) {
    e.e.e.d.i.a(paramString);
    this.a = paramString;
  }
  
  public String a() {
    return this.a;
  }
  
  public boolean a(Uri paramUri) {
    return this.a.contains(paramUri.toString());
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof i) {
      paramObject = paramObject;
      return this.a.equals(((i)paramObject).a);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public String toString() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/c/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */