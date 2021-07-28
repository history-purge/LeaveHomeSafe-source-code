package e.f.c.w.r.g;

import java.util.List;

final class a {
  static e.f.c.s.a a(List<b> paramList) {
    int j = (paramList.size() << 1) - 1;
    int i = j;
    if (((b)paramList.get(paramList.size() - 1)).c() == null)
      i = j - 1; 
    e.f.c.s.a a1 = new e.f.c.s.a(i * 12);
    int k = ((b)paramList.get(0)).c().b();
    j = 11;
    i = 0;
    while (j >= 0) {
      if ((1 << j & k) != 0)
        a1.d(i); 
      i++;
      j--;
    } 
    for (k = 1; k < paramList.size(); k++) {
      b b = paramList.get(k);
      int m = b.b().b();
      for (j = 11; j >= 0; j--) {
        if ((1 << j & m) != 0)
          a1.d(i); 
        i++;
      } 
      j = i;
      if (b.c() != null) {
        int n = b.c().b();
        m = 11;
        while (true) {
          j = i;
          if (m >= 0) {
            if ((1 << m & n) != 0)
              a1.d(i); 
            i++;
            m--;
            continue;
          } 
          break;
        } 
      } 
      i = j;
    } 
    return a1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */