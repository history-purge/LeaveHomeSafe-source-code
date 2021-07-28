package com.facebook.react.views.image;

import android.graphics.Bitmap;
import e.e.c.a.d;
import e.e.c.a.f;
import e.e.e.h.a;
import e.e.l.c.f;
import e.e.l.o.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class e implements e {
  private final List<e> a;
  
  private e(List<e> paramList) {
    this.a = new LinkedList<e>(paramList);
  }
  
  public static e a(List<e> paramList) {
    int i = paramList.size();
    return (i != 0) ? ((i != 1) ? new e(paramList) : paramList.get(0)) : null;
  }
  
  public d a() {
    LinkedList<d> linkedList = new LinkedList();
    Iterator<e> iterator = this.a.iterator();
    while (iterator.hasNext())
      linkedList.push(((e)iterator.next()).a()); 
    return (d)new f(linkedList);
  }
  
  public a<Bitmap> a(Bitmap paramBitmap, f paramf) {
    a a1 = null;
    a a2 = null;
    try {
      Iterator<e> iterator = this.a.iterator();
      a a = null;
      while (true) {
        a1 = a2;
        if (iterator.hasNext()) {
          Bitmap bitmap;
          a1 = a2;
          e e1 = iterator.next();
          if (a != null) {
            a1 = a2;
            bitmap = (Bitmap)a.b();
          } else {
            bitmap = paramBitmap;
          } 
          a1 = a2;
          a2 = e1.a(bitmap, paramf);
          a1 = a2;
          a.b(a);
          a1 = a2;
          a = a2.clone();
          continue;
        } 
        a1 = a2;
        return a2.clone();
      } 
    } finally {
      a.b(a1);
    } 
  }
  
  public String getName() {
    StringBuilder stringBuilder = new StringBuilder();
    for (e e1 : this.a) {
      if (stringBuilder.length() > 0)
        stringBuilder.append(","); 
      stringBuilder.append(e1.getName());
    } 
    stringBuilder.insert(0, "MultiPostProcessor (");
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/image/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */