package net.time4j.history;

enum c implements b {
  c {
    public h a(long param1Long) {
      j j1;
      param1Long = net.time4j.c1.b.d(param1Long);
      int j = net.time4j.c1.b.c(param1Long);
      int k = net.time4j.c1.b.b(param1Long);
      int m = net.time4j.c1.b.a(param1Long);
      if (j <= 0) {
        j1 = j.c;
      } else {
        j1 = j.d;
      } 
      int i = j;
      if (j <= 0)
        i = 1 - j; 
      return new h(j1, i, k, m);
    }
    
    public boolean a(h param1h) {
      return net.time4j.c1.b.c(d(param1h), param1h.getMonth(), param1h.a());
    }
    
    public long b(h param1h) {
      return net.time4j.c1.b.d(d(param1h), param1h.getMonth(), param1h.a());
    }
    
    public int c(h param1h) {
      return net.time4j.c1.b.a(d(param1h), param1h.getMonth());
    }
  },
  d {
    public h a(long param1Long) {
      j j1;
      param1Long = m.d(param1Long);
      int j = m.c(param1Long);
      int k = m.b(param1Long);
      int m = m.a(param1Long);
      if (j <= 0) {
        j1 = j.c;
      } else {
        j1 = j.d;
      } 
      int i = j;
      if (j <= 0)
        i = 1 - j; 
      return new h(j1, i, k, m);
    }
    
    public boolean a(h param1h) {
      return m.b(d(param1h), param1h.getMonth(), param1h.a());
    }
    
    public long b(h param1h) {
      return m.c(d(param1h), param1h.getMonth(), param1h.a());
    }
    
    public int c(h param1h) {
      return m.a(d(param1h), param1h.getMonth());
    }
  },
  e {
    public h a(long param1Long) {
      return (param1Long == -53576L) ? new h(j.d, 1712, 2, 30) : c.d.a(param1Long + 1L);
    }
    
    public boolean a(h param1h) {
      int i = d(param1h);
      return (param1h.a() == 30 && param1h.getMonth() == 2 && i == 1712) ? true : m.b(i, param1h.getMonth(), param1h.a());
    }
    
    public long b(h param1h) {
      int i = d(param1h);
      return (param1h.a() == 30 && param1h.getMonth() == 2 && i == 1712) ? -53576L : (m.c(i, param1h.getMonth(), param1h.a()) - 1L);
    }
    
    public int c(h param1h) {
      int i = d(param1h);
      return (param1h.getMonth() == 2 && i == 1712) ? 30 : m.a(i, param1h.getMonth());
    }
  };
  
  private static int e(h paramh) {
    return paramh.b().f(paramh.c());
  }
  
  enum a {
    public h a(long param1Long) {
      j j1;
      param1Long = net.time4j.c1.b.d(param1Long);
      int j = net.time4j.c1.b.c(param1Long);
      int k = net.time4j.c1.b.b(param1Long);
      int m = net.time4j.c1.b.a(param1Long);
      if (j <= 0) {
        j1 = j.c;
      } else {
        j1 = j.d;
      } 
      int i = j;
      if (j <= 0)
        i = 1 - j; 
      return new h(j1, i, k, m);
    }
    
    public boolean a(h param1h) {
      return net.time4j.c1.b.c(c.d(param1h), param1h.getMonth(), param1h.a());
    }
    
    public long b(h param1h) {
      return net.time4j.c1.b.d(c.d(param1h), param1h.getMonth(), param1h.a());
    }
    
    public int c(h param1h) {
      return net.time4j.c1.b.a(c.d(param1h), param1h.getMonth());
    }
  }
  
  enum b {
    public h a(long param1Long) {
      j j1;
      param1Long = m.d(param1Long);
      int j = m.c(param1Long);
      int k = m.b(param1Long);
      int m = m.a(param1Long);
      if (j <= 0) {
        j1 = j.c;
      } else {
        j1 = j.d;
      } 
      int i = j;
      if (j <= 0)
        i = 1 - j; 
      return new h(j1, i, k, m);
    }
    
    public boolean a(h param1h) {
      return m.b(c.d(param1h), param1h.getMonth(), param1h.a());
    }
    
    public long b(h param1h) {
      return m.c(c.d(param1h), param1h.getMonth(), param1h.a());
    }
    
    public int c(h param1h) {
      return m.a(c.d(param1h), param1h.getMonth());
    }
  }
  
  enum c {
    public h a(long param1Long) {
      return (param1Long == -53576L) ? new h(j.d, 1712, 2, 30) : c.d.a(param1Long + 1L);
    }
    
    public boolean a(h param1h) {
      int i = c.d(param1h);
      return (param1h.a() == 30 && param1h.getMonth() == 2 && i == 1712) ? true : m.b(i, param1h.getMonth(), param1h.a());
    }
    
    public long b(h param1h) {
      int i = c.d(param1h);
      return (param1h.a() == 30 && param1h.getMonth() == 2 && i == 1712) ? -53576L : (m.c(i, param1h.getMonth(), param1h.a()) - 1L);
    }
    
    public int c(h param1h) {
      int i = c.d(param1h);
      return (param1h.getMonth() == 2 && i == 1712) ? 30 : m.a(i, param1h.getMonth());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */