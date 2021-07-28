package e.f.c.y.b;

enum c {
  c {
    boolean a(int param1Int1, int param1Int2) {
      return ((param1Int1 + param1Int2 & 0x1) == 0);
    }
  },
  d {
    boolean a(int param1Int1, int param1Int2) {
      return ((param1Int1 & 0x1) == 0);
    }
  },
  e {
    boolean a(int param1Int1, int param1Int2) {
      return (param1Int2 % 3 == 0);
    }
  },
  f {
    boolean a(int param1Int1, int param1Int2) {
      return ((param1Int1 + param1Int2) % 3 == 0);
    }
  },
  g {
    boolean a(int param1Int1, int param1Int2) {
      return ((param1Int1 / 2 + param1Int2 / 3 & 0x1) == 0);
    }
  },
  h {
    boolean a(int param1Int1, int param1Int2) {
      return (param1Int1 * param1Int2 % 6 == 0);
    }
  },
  i {
    boolean a(int param1Int1, int param1Int2) {
      return (param1Int1 * param1Int2 % 6 < 3);
    }
  },
  j {
    boolean a(int param1Int1, int param1Int2) {
      return ((param1Int1 + param1Int2 + param1Int1 * param1Int2 % 3 & 0x1) == 0);
    }
  };
  
  final void a(e.f.c.s.b paramb, int paramInt) {
    for (int i = 0; i < paramInt; i++) {
      int j;
      for (j = 0; j < paramInt; j++) {
        if (a(i, j))
          paramb.a(j, i); 
      } 
    } 
  }
  
  abstract boolean a(int paramInt1, int paramInt2);
  
  enum a {
    boolean a(int param1Int1, int param1Int2) {
      return ((param1Int1 + param1Int2 & 0x1) == 0);
    }
  }
  
  enum b {
    boolean a(int param1Int1, int param1Int2) {
      return ((param1Int1 & 0x1) == 0);
    }
  }
  
  enum c {
    boolean a(int param1Int1, int param1Int2) {
      return (param1Int2 % 3 == 0);
    }
  }
  
  enum d {
    boolean a(int param1Int1, int param1Int2) {
      return ((param1Int1 + param1Int2) % 3 == 0);
    }
  }
  
  enum e {
    boolean a(int param1Int1, int param1Int2) {
      return ((param1Int1 / 2 + param1Int2 / 3 & 0x1) == 0);
    }
  }
  
  enum f {
    boolean a(int param1Int1, int param1Int2) {
      return (param1Int1 * param1Int2 % 6 == 0);
    }
  }
  
  enum g {
    boolean a(int param1Int1, int param1Int2) {
      return (param1Int1 * param1Int2 % 6 < 3);
    }
  }
  
  enum h {
    boolean a(int param1Int1, int param1Int2) {
      return ((param1Int1 + param1Int2 + param1Int1 * param1Int2 % 3 & 0x1) == 0);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */