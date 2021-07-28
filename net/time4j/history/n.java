package net.time4j.history;

public enum n {
  c {
    int a(o param1o, h param1h) {
      return param1h.c();
    }
    
    h a(j param1j, int param1Int) {
      return h.a(param1j, param1Int, 1, 1);
    }
  },
  d {
    h a(j param1j, int param1Int) {
      return h.a(param1j, param1Int, 3, 1);
    }
  },
  e {
    int a(o param1o, h param1h) {
      j j1 = param1h.b();
      int i = param1h.c();
      int j = i + 1;
      if (param1h.a(param1o.a(j1, j)) >= 0)
        i = j; 
      return i;
    }
    
    h a(j param1j, int param1Int) {
      return h.a(param1j, param1Int - 1, 9, 1);
    }
  },
  f {
    int a(o param1o, h param1h) {
      int i = param1h.c();
      j j1 = param1h.b();
      int j = i + 1;
      if (param1h.a(param1o.a(j1, j)) >= 0)
        i = j; 
      return i;
    }
    
    h a(j param1j, int param1Int) {
      return h.a(param1j, param1Int - 1, 12, 25);
    }
  },
  g {
    h a(j param1j, int param1Int) {
      byte b;
      int i = param1j.f(param1Int);
      i = e.d.f(i) - 1;
      if (i > 31) {
        b = 4;
        i -= 31;
      } else {
        b = 3;
      } 
      return h.a(param1j, param1Int, b, i);
    }
  },
  h {
    h a(j param1j, int param1Int) {
      byte b;
      int i = param1j.f(param1Int);
      i = e.d.f(i) - 2;
      if (i > 31) {
        b = 4;
        i -= 31;
      } else {
        b = 3;
      } 
      return h.a(param1j, param1Int, b, i);
    }
  },
  i {
    h a(j param1j, int param1Int) {
      return h.a(param1j, param1Int, 3, 25);
    }
  },
  j {
    int a(o param1o, h param1h) {
      int j = param1h.c() - 1;
      int i = j;
      if (param1h.a(a(param1h.b(), j)) < 0)
        i = j - 1; 
      return i;
    }
    
    int a(boolean param1Boolean, o param1o, j param1j, int param1Int1, int param1Int2, int param1Int3) {
      return n.i.a(param1Boolean, param1o, param1j, param1Int1 + 1, param1Int2, param1Int3);
    }
    
    h a(j param1j, int param1Int) {
      return n.i.a(param1j, param1Int + 1);
    }
  },
  k {
    h a(j param1j, int param1Int) {
      return h.a(param1j, param1Int, 1, 6);
    }
  };
  
  int a(o paramo, h paramh) {
    int j = paramh.c();
    int i = j;
    if (paramh.a(a(paramh.b(), j)) < 0)
      i = j - 1; 
    return i;
  }
  
  int a(boolean paramBoolean, o paramo, j paramj, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload #5
    //   2: iconst_5
    //   3: if_icmplt -> 16
    //   6: iload #5
    //   8: bipush #8
    //   10: if_icmpgt -> 16
    //   13: iload #4
    //   15: ireturn
    //   16: aload_0
    //   17: aload_3
    //   18: iload #4
    //   20: invokevirtual a : (Lnet/time4j/history/j;I)Lnet/time4j/history/h;
    //   23: astore #9
    //   25: iload #4
    //   27: iconst_1
    //   28: iadd
    //   29: istore #7
    //   31: aload_2
    //   32: aload_3
    //   33: iload #7
    //   35: invokevirtual a : (Lnet/time4j/history/j;I)Lnet/time4j/history/h;
    //   38: astore #10
    //   40: aload_3
    //   41: iload #4
    //   43: iload #5
    //   45: iload #6
    //   47: invokestatic a : (Lnet/time4j/history/j;III)Lnet/time4j/history/h;
    //   50: astore_2
    //   51: iload #5
    //   53: iconst_4
    //   54: if_icmpgt -> 119
    //   57: aload_3
    //   58: iload #7
    //   60: iload #5
    //   62: iload #6
    //   64: invokestatic a : (Lnet/time4j/history/j;III)Lnet/time4j/history/h;
    //   67: astore_3
    //   68: aload_2
    //   69: aload #9
    //   71: invokevirtual a : (Lnet/time4j/history/h;)I
    //   74: iflt -> 84
    //   77: iload #4
    //   79: istore #5
    //   81: goto -> 88
    //   84: iload #7
    //   86: istore #5
    //   88: iload #5
    //   90: istore #6
    //   92: aload_3
    //   93: aload #10
    //   95: invokevirtual a : (Lnet/time4j/history/h;)I
    //   98: iflt -> 112
    //   101: iload #4
    //   103: istore #7
    //   105: iload #5
    //   107: istore #4
    //   109: goto -> 182
    //   112: iload #6
    //   114: istore #4
    //   116: goto -> 182
    //   119: iload #4
    //   121: iconst_1
    //   122: isub
    //   123: istore #8
    //   125: aload_3
    //   126: iload #8
    //   128: iload #5
    //   130: iload #6
    //   132: invokestatic a : (Lnet/time4j/history/j;III)Lnet/time4j/history/h;
    //   135: aload #9
    //   137: invokevirtual a : (Lnet/time4j/history/h;)I
    //   140: iflt -> 150
    //   143: iload #8
    //   145: istore #5
    //   147: goto -> 154
    //   150: iload #4
    //   152: istore #5
    //   154: iload #4
    //   156: istore #7
    //   158: iload #5
    //   160: istore #4
    //   162: aload_2
    //   163: aload #10
    //   165: invokevirtual a : (Lnet/time4j/history/h;)I
    //   168: iflt -> 182
    //   171: iload #8
    //   173: istore #7
    //   175: iload #5
    //   177: istore #6
    //   179: goto -> 112
    //   182: iload #4
    //   184: iload #7
    //   186: if_icmpgt -> 200
    //   189: iload_1
    //   190: ifeq -> 197
    //   193: iload #4
    //   195: istore #7
    //   197: iload #7
    //   199: ireturn
    //   200: new java/lang/StringBuilder
    //   203: dup
    //   204: invokespecial <init> : ()V
    //   207: astore_3
    //   208: aload_3
    //   209: ldc 'Invalid date due to changing new year rule (year too short to cover month and day-of-month): '
    //   211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: pop
    //   215: aload_3
    //   216: aload_2
    //   217: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   220: pop
    //   221: new java/lang/IllegalArgumentException
    //   224: dup
    //   225: aload_3
    //   226: invokevirtual toString : ()Ljava/lang/String;
    //   229: invokespecial <init> : (Ljava/lang/String;)V
    //   232: astore_2
    //   233: goto -> 238
    //   236: aload_2
    //   237: athrow
    //   238: goto -> 236
  }
  
  abstract h a(j paramj, int paramInt);
  
  public o f(int paramInt) {
    if (paramInt > 567) {
      o o2 = new o(this, paramInt);
      n n1 = c;
      o o1 = o2;
      if (this != n1)
        o1 = (new o(n1, 567)).a(o2); 
      return o1;
    } 
    throw new IllegalArgumentException("Defining New-Year-strategy is not supported before Council of Tours in AD 567.");
  }
  
  enum a {
    int a(o param1o, h param1h) {
      return param1h.c();
    }
    
    h a(j param1j, int param1Int) {
      return h.a(param1j, param1Int, 1, 1);
    }
  }
  
  enum b {
    h a(j param1j, int param1Int) {
      return h.a(param1j, param1Int, 3, 1);
    }
  }
  
  enum c {
    int a(o param1o, h param1h) {
      j j1 = param1h.b();
      int i = param1h.c();
      int j = i + 1;
      if (param1h.a(param1o.a(j1, j)) >= 0)
        i = j; 
      return i;
    }
    
    h a(j param1j, int param1Int) {
      return h.a(param1j, param1Int - 1, 9, 1);
    }
  }
  
  enum d {
    int a(o param1o, h param1h) {
      int i = param1h.c();
      j j1 = param1h.b();
      int j = i + 1;
      if (param1h.a(param1o.a(j1, j)) >= 0)
        i = j; 
      return i;
    }
    
    h a(j param1j, int param1Int) {
      return h.a(param1j, param1Int - 1, 12, 25);
    }
  }
  
  enum e {
    h a(j param1j, int param1Int) {
      byte b;
      int i = param1j.f(param1Int);
      i = e.d.f(i) - 1;
      if (i > 31) {
        b = 4;
        i -= 31;
      } else {
        b = 3;
      } 
      return h.a(param1j, param1Int, b, i);
    }
  }
  
  enum f {
    h a(j param1j, int param1Int) {
      byte b;
      int i = param1j.f(param1Int);
      i = e.d.f(i) - 2;
      if (i > 31) {
        b = 4;
        i -= 31;
      } else {
        b = 3;
      } 
      return h.a(param1j, param1Int, b, i);
    }
  }
  
  enum g {
    h a(j param1j, int param1Int) {
      return h.a(param1j, param1Int, 3, 25);
    }
  }
  
  enum h {
    int a(o param1o, h param1h) {
      int j = param1h.c() - 1;
      int i = j;
      if (param1h.a(a(param1h.b(), j)) < 0)
        i = j - 1; 
      return i;
    }
    
    int a(boolean param1Boolean, o param1o, j param1j, int param1Int1, int param1Int2, int param1Int3) {
      return n.i.a(param1Boolean, param1o, param1j, param1Int1 + 1, param1Int2, param1Int3);
    }
    
    h a(j param1j, int param1Int) {
      return n.i.a(param1j, param1Int + 1);
    }
  }
  
  enum i {
    h a(j param1j, int param1Int) {
      return h.a(param1j, param1Int, 1, 6);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */