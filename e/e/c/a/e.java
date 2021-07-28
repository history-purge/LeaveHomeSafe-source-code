package e.e.c.a;

import e.e.e.k.c;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public final class e {
  public static String a(d paramd) {
    try {
      return (paramd instanceof f) ? c(((f)paramd).b().get(0)) : c(paramd);
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new RuntimeException(unsupportedEncodingException);
    } 
  }
  
  public static List<String> b(d paramd) {
    try {
      ArrayList<String> arrayList;
      if (paramd instanceof f) {
        List<d> list = ((f)paramd).b();
        ArrayList<String> arrayList1 = new ArrayList(list.size());
        int i = 0;
        while (true) {
          arrayList = arrayList1;
          if (i < list.size()) {
            arrayList1.add(c(list.get(i)));
            i++;
            continue;
          } 
          break;
        } 
      } else {
        ArrayList<String> arrayList1 = new ArrayList(1);
        arrayList1.add(c((d)arrayList));
        arrayList = arrayList1;
      } 
      return arrayList;
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      RuntimeException runtimeException = new RuntimeException(unsupportedEncodingException);
      throw runtimeException;
    } 
  }
  
  private static String c(d paramd) {
    return c.a(paramd.a().getBytes("UTF-8"));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/c/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */