package e.f.c.w.r.g.e;

import e.f.c.f;
import e.f.c.s.a;

final class s {
  private final a a;
  
  private final m b = new m();
  
  private final StringBuilder c = new StringBuilder();
  
  s(a parama) {
    this.a = parama;
  }
  
  static int a(a parama, int paramInt1, int paramInt2) {
    int i = 0;
    int j;
    for (j = 0; i < paramInt2; j = k) {
      int k = j;
      if (parama.a(paramInt1 + i))
        k = j | 1 << paramInt2 - i - 1; 
      i++;
    } 
    return j;
  }
  
  private l a() {
    while (g(this.b.a())) {
      n n = a(this.b.a());
      this.b.b(n.a());
      if (n.c())
        return new l(new o(this.b.a(), this.c.toString()), true); 
      this.c.append(n.b());
    } 
    if (d(this.b.a())) {
      this.b.a(3);
      this.b.f();
    } else if (e(this.b.a())) {
      if (this.b.a() + 5 < this.a.c()) {
        this.b.a(5);
      } else {
        this.b.b(this.a.c());
      } 
      this.b.e();
    } 
    return new l(false);
  }
  
  private n a(int paramInt) {
    int i = a(paramInt, 5);
    if (i == 15)
      return new n(paramInt + 5, '$'); 
    if (i >= 5 && i < 15)
      return new n(paramInt + 5, (char)(i + 48 - 5)); 
    i = a(paramInt, 6);
    if (i >= 32 && i < 58)
      return new n(paramInt + 6, (char)(i + 33)); 
    switch (i) {
      default:
        throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(i)));
      case 62:
        b = 47;
        return new n(paramInt + 6, b);
      case 61:
        b = 46;
        return new n(paramInt + 6, b);
      case 60:
        b = 45;
        return new n(paramInt + 6, b);
      case 59:
        b = 44;
        return new n(paramInt + 6, b);
      case 58:
        break;
    } 
    byte b = 42;
    return new n(paramInt + 6, b);
  }
  
  private n b(int paramInt) {
    int i = a(paramInt, 5);
    if (i == 15)
      return new n(paramInt + 5, '$'); 
    if (i >= 5 && i < 15)
      return new n(paramInt + 5, (char)(i + 48 - 5)); 
    i = a(paramInt, 7);
    if (i >= 64 && i < 90)
      return new n(paramInt + 7, (char)(i + 1)); 
    if (i >= 90 && i < 116)
      return new n(paramInt + 7, (char)(i + 7)); 
    switch (a(paramInt, 8)) {
      default:
        throw f.a();
      case 252:
        b = 32;
        return new n(paramInt + 8, b);
      case 251:
        b = 95;
        return new n(paramInt + 8, b);
      case 250:
        b = 63;
        return new n(paramInt + 8, b);
      case 249:
        b = 62;
        return new n(paramInt + 8, b);
      case 248:
        b = 61;
        return new n(paramInt + 8, b);
      case 247:
        b = 60;
        return new n(paramInt + 8, b);
      case 246:
        b = 59;
        return new n(paramInt + 8, b);
      case 245:
        b = 58;
        return new n(paramInt + 8, b);
      case 244:
        b = 47;
        return new n(paramInt + 8, b);
      case 243:
        b = 46;
        return new n(paramInt + 8, b);
      case 242:
        b = 45;
        return new n(paramInt + 8, b);
      case 241:
        b = 44;
        return new n(paramInt + 8, b);
      case 240:
        b = 43;
        return new n(paramInt + 8, b);
      case 239:
        b = 42;
        return new n(paramInt + 8, b);
      case 238:
        b = 41;
        return new n(paramInt + 8, b);
      case 237:
        b = 40;
        return new n(paramInt + 8, b);
      case 236:
        b = 39;
        return new n(paramInt + 8, b);
      case 235:
        b = 38;
        return new n(paramInt + 8, b);
      case 234:
        b = 37;
        return new n(paramInt + 8, b);
      case 233:
        b = 34;
        return new n(paramInt + 8, b);
      case 232:
        break;
    } 
    byte b = 33;
    return new n(paramInt + 8, b);
  }
  
  private o b() {
    int i;
    boolean bool;
    l l;
    do {
      i = this.b.a();
      if (this.b.b()) {
        l = a();
      } else if (this.b.c()) {
        l = c();
      } else {
        l = d();
      } 
      bool = l.b();
      if (i != this.b.a()) {
        i = 1;
      } else {
        i = 0;
      } 
    } while ((i != 0 || bool) && !bool);
    return l.a();
  }
  
  private l c() {
    while (h(this.b.a())) {
      n n = b(this.b.a());
      this.b.b(n.a());
      if (n.c())
        return new l(new o(this.b.a(), this.c.toString()), true); 
      this.c.append(n.b());
    } 
    if (d(this.b.a())) {
      this.b.a(3);
      this.b.f();
    } else if (e(this.b.a())) {
      if (this.b.a() + 5 < this.a.c()) {
        this.b.a(5);
      } else {
        this.b.b(this.a.c());
      } 
      this.b.d();
    } 
    return new l(false);
  }
  
  private p c(int paramInt) {
    int i = paramInt + 7;
    if (i > this.a.c()) {
      paramInt = a(paramInt, 4);
      return (paramInt == 0) ? new p(this.a.c(), 10, 10) : new p(this.a.c(), paramInt - 1, 10);
    } 
    paramInt = a(paramInt, 7) - 8;
    return new p(i, paramInt / 11, paramInt % 11);
  }
  
  private l d() {
    while (i(this.b.a())) {
      o o;
      p p = c(this.b.a());
      this.b.b(p.a());
      if (p.d()) {
        if (p.e()) {
          o = new o(this.b.a(), this.c.toString());
        } else {
          o = new o(this.b.a(), this.c.toString(), o.c());
        } 
        return new l(o, true);
      } 
      this.c.append(o.b());
      if (o.e())
        return new l(new o(this.b.a(), this.c.toString()), true); 
      this.c.append(o.c());
    } 
    if (f(this.b.a())) {
      this.b.d();
      this.b.a(4);
    } 
    return new l(false);
  }
  
  private boolean d(int paramInt) {
    int i = paramInt + 3;
    if (i > this.a.c())
      return false; 
    while (paramInt < i) {
      if (this.a.a(paramInt))
        return false; 
      paramInt++;
    } 
    return true;
  }
  
  private boolean e(int paramInt) {
    if (paramInt + 1 > this.a.c())
      return false; 
    int i = 0;
    while (i < 5) {
      int j = i + paramInt;
      if (j < this.a.c()) {
        if (i == 2) {
          if (!this.a.a(paramInt + 2))
            return false; 
        } else if (this.a.a(j)) {
          return false;
        } 
        i++;
      } 
    } 
    return true;
  }
  
  private boolean f(int paramInt) {
    if (paramInt + 1 > this.a.c())
      return false; 
    int i = 0;
    while (i < 4) {
      int j = i + paramInt;
      if (j < this.a.c()) {
        if (this.a.a(j))
          return false; 
        i++;
      } 
    } 
    return true;
  }
  
  private boolean g(int paramInt) {
    if (paramInt + 5 > this.a.c())
      return false; 
    int i = a(paramInt, 5);
    if (i >= 5 && i < 16)
      return true; 
    if (paramInt + 6 > this.a.c())
      return false; 
    paramInt = a(paramInt, 6);
    return (paramInt >= 16 && paramInt < 63);
  }
  
  private boolean h(int paramInt) {
    if (paramInt + 5 > this.a.c())
      return false; 
    int i = a(paramInt, 5);
    if (i >= 5 && i < 16)
      return true; 
    if (paramInt + 7 > this.a.c())
      return false; 
    i = a(paramInt, 7);
    if (i >= 64 && i < 116)
      return true; 
    if (paramInt + 8 > this.a.c())
      return false; 
    paramInt = a(paramInt, 8);
    return (paramInt >= 232 && paramInt < 253);
  }
  
  private boolean i(int paramInt) {
    if (paramInt + 7 > this.a.c())
      return (paramInt + 4 <= this.a.c()); 
    int i = paramInt;
    while (true) {
      int j = paramInt + 3;
      if (i < j) {
        if (this.a.a(i))
          return true; 
        i++;
        continue;
      } 
      return this.a.a(j);
    } 
  }
  
  int a(int paramInt1, int paramInt2) {
    return a(this.a, paramInt1, paramInt2);
  }
  
  o a(int paramInt, String paramString) {
    this.c.setLength(0);
    if (paramString != null)
      this.c.append(paramString); 
    this.b.b(paramInt);
    o o = b();
    return (o != null && o.d()) ? new o(this.b.a(), this.c.toString(), o.c()) : new o(this.b.a(), this.c.toString());
  }
  
  String a(StringBuilder paramStringBuilder, int paramInt) {
    String str = null;
    while (true) {
      o o = a(paramInt, str);
      str = r.a(o.b());
      if (str != null)
        paramStringBuilder.append(str); 
      if (o.d()) {
        str = String.valueOf(o.c());
      } else {
        str = null;
      } 
      if (paramInt != o.a()) {
        paramInt = o.a();
        continue;
      } 
      return paramStringBuilder.toString();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/g/e/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */