package net.time4j;

import net.time4j.d1.g;
import net.time4j.d1.l0;
import net.time4j.d1.n0;
import net.time4j.d1.q;

public enum f implements u {
  c {
    public char a() {
      return 'I';
    }
    
    public double b() {
      return 3.1556952E10D;
    }
  },
  d {
    public char a() {
      return 'C';
    }
    
    public double b() {
      return 3.1556952E9D;
    }
  },
  e {
    public char a() {
      return 'E';
    }
    
    public double b() {
      return 3.1556952E8D;
    }
  },
  f {
    public char a() {
      return 'Y';
    }
    
    public double b() {
      return 3.1556952E7D;
    }
  },
  g {
    public char a() {
      return 'Q';
    }
    
    public double b() {
      return 7889238.0D;
    }
  },
  h {
    public char a() {
      return 'M';
    }
    
    public double b() {
      return 2629746.0D;
    }
  },
  i {
    public char a() {
      return 'W';
    }
    
    public double b() {
      return 604800.0D;
    }
  },
  j {
    public char a() {
      return 'D';
    }
    
    public double b() {
      return 86400.0D;
    }
  };
  
  private final u co = new e0(this, 3);
  
  private final u eof = new e0(this, 2);
  
  private final u joda = new e0(this, 6);
  
  private final u kld = new e0(this, 5);
  
  private final u nvd = new e0(this, 1);
  
  private final u ui = new e0(this, 4);
  
  public static u d() {
    return v0.c;
  }
  
  public <T extends l0<? super f, T>> long a(T paramT1, T paramT2) {
    return paramT1.a((l0)paramT2, this);
  }
  
  public boolean c() {
    return true;
  }
  
  enum a {
    public char a() {
      return 'I';
    }
    
    public double b() {
      return 3.1556952E10D;
    }
  }
  
  enum b {
    public char a() {
      return 'C';
    }
    
    public double b() {
      return 3.1556952E9D;
    }
  }
  
  enum c {
    public char a() {
      return 'E';
    }
    
    public double b() {
      return 3.1556952E8D;
    }
  }
  
  enum d {
    public char a() {
      return 'Y';
    }
    
    public double b() {
      return 3.1556952E7D;
    }
  }
  
  enum e {
    public char a() {
      return 'Q';
    }
    
    public double b() {
      return 7889238.0D;
    }
  }
  
  enum f {
    public char a() {
      return 'M';
    }
    
    public double b() {
      return 2629746.0D;
    }
  }
  
  enum g {
    public char a() {
      return 'W';
    }
    
    public double b() {
      return 604800.0D;
    }
  }
  
  enum h {
    public char a() {
      return 'D';
    }
    
    public double b() {
      return 86400.0D;
    }
  }
  
  static class j<T extends q<T>> implements n0<T> {
    private final f a;
    
    private final int b;
    
    j(f param1f) {
      this(param1f, 0);
    }
    
    j(f param1f, int param1Int) {
      this.a = param1f;
      this.b = param1Int;
    }
    
    private static long a(f0 param1f01, f0 param1f02) {
      return (param1f01.getYear() == param1f02.getYear()) ? (param1f02.x() - param1f01.x()) : (param1f02.y() - param1f01.y());
    }
    
    private long b(f0 param1f01, f0 param1f02) {
      long l = param1f02.z() - param1f01.z();
      int i = this.b;
      if (i == 5 || i == 2 || i == 6) {
        f f1 = f.h;
        return (l > 0L && f0.a(f1, param1f01, l, this.b).b((g)param1f02)) ? (l - 1L) : ((l < 0L && f0.a(f1, param1f01, l, this.b).c((g)param1f02)) ? (l + 1L) : l);
      } 
      return (l > 0L && param1f02.r() < param1f01.r()) ? (l - 1L) : ((l < 0L && param1f02.r() > param1f01.r()) ? (l + 1L) : l);
    }
    
    public long a(T param1T1, T param1T2) {
      long l1;
      f0 f01 = (f0)param1T1.e(f0.p);
      f0 f02 = (f0)param1T2.e(f0.p);
      switch (f.i.a[this.a.ordinal()]) {
        default:
          throw new UnsupportedOperationException(this.a.name());
        case 8:
          l1 = b(f01, f02);
          break;
        case 7:
          l1 = b(f01, f02);
          l2 = 3L;
          l1 /= l2;
          break;
        case 6:
          l1 = b(f01, f02);
          l2 = 12L;
          l1 /= l2;
          break;
        case 5:
          l1 = b(f01, f02);
          l2 = 120L;
          l1 /= l2;
          break;
        case 4:
          l1 = b(f01, f02);
          l2 = 1200L;
          l1 /= l2;
          break;
        case 3:
          l1 = b(f01, f02);
          l2 = 12000L;
          l1 /= l2;
          break;
        case 2:
          l1 = a(f01, f02);
          break;
        case 1:
          l1 = a(f01, f02);
          l2 = 7L;
          l1 /= l2;
          break;
      } 
      long l2 = l1;
      if (l1 != 0L) {
        l2 = l1;
        if (param1T1.c(g0.q)) {
          l2 = l1;
          if (param1T2.c(g0.q)) {
            f f1 = this.a;
            f f2 = f.j;
            boolean bool = true;
            if (f1 != f2 && ((f0)f01.b(l1, f1)).a((g)f02) != 0)
              bool = false; 
            l2 = l1;
            if (bool) {
              g0 g01 = (g0)param1T1.e(g0.q);
              g0 g02 = (g0)param1T2.e(g0.q);
              if (l1 > 0L && g01.b(g02))
                return l1 - 1L; 
              l2 = l1;
              if (l1 < 0L) {
                l2 = l1;
                if (g01.c(g02))
                  l2 = l1 + 1L; 
              } 
            } 
          } 
        } 
      } 
      return l2;
    }
    
    public T a(T param1T, long param1Long) {
      f0 f0 = (f0)param1T.e(f0.p);
      f0 = f0.a(this.a, f0, param1Long, this.b);
      return (T)param1T.b(f0.p, f0);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */