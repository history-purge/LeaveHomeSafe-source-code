package e.e.c.a;

import android.net.Uri;
import e.e.e.d.i;
import java.util.List;

public class f implements d {
  final List<d> a;
  
  public f(List<d> paramList) {
    i.a(paramList);
    this.a = paramList;
  }
  
  public String a() {
    return ((d)this.a.get(0)).a();
  }
  
  public boolean a(Uri paramUri) {
    for (int i = 0; i < this.a.size(); i++) {
      if (((d)this.a.get(i)).a(paramUri))
        return true; 
    } 
    return false;
  }
  
  public List<d> b() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof f) {
      paramObject = paramObject;
      return this.a.equals(((f)paramObject).a);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("MultiCacheKey:");
    stringBuilder.append(this.a.toString());
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/c/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */