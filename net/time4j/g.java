package net.time4j;

import net.time4j.d1.l0;

public enum g implements v {
  c {
    public char a() {
      return 'H';
    }
    
    public double b() {
      return 3600.0D;
    }
  },
  d {
    public char a() {
      return 'M';
    }
    
    public double b() {
      return 60.0D;
    }
  },
  e {
    public char a() {
      return 'S';
    }
    
    public double b() {
      return 1.0D;
    }
  },
  f {
    public char a() {
      return '3';
    }
    
    public double b() {
      return 0.001D;
    }
  },
  g {
    public char a() {
      return '6';
    }
    
    public double b() {
      return 1.0E-6D;
    }
  },
  h {
    public char a() {
      return '9';
    }
    
    public double b() {
      return 1.0E-9D;
    }
  };
  
  public <T extends l0<? super g, T>> long a(T paramT1, T paramT2) {
    return paramT1.a((l0)paramT2, this);
  }
  
  public boolean c() {
    return false;
  }
  
  enum a {
    public char a() {
      return 'H';
    }
    
    public double b() {
      return 3600.0D;
    }
  }
  
  enum b {
    public char a() {
      return 'M';
    }
    
    public double b() {
      return 60.0D;
    }
  }
  
  enum c {
    public char a() {
      return 'S';
    }
    
    public double b() {
      return 1.0D;
    }
  }
  
  enum d {
    public char a() {
      return '3';
    }
    
    public double b() {
      return 0.001D;
    }
  }
  
  enum e {
    public char a() {
      return '6';
    }
    
    public double b() {
      return 1.0E-6D;
    }
  }
  
  enum f {
    public char a() {
      return '9';
    }
    
    public double b() {
      return 1.0E-9D;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */