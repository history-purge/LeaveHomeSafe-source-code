package e.d.c.y.g;

import e.d.b.o;

public class b {
  public long a;
  
  public String b;
  
  public String c;
  
  public b(o paramo) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual i : ()J
    //   9: putfield a : J
    //   12: aload_0
    //   13: aload_1
    //   14: iconst_4
    //   15: invokevirtual c : (I)Ljava/lang/String;
    //   18: putfield b : Ljava/lang/String;
    //   21: aload_0
    //   22: getfield a : J
    //   25: lstore_2
    //   26: lload_2
    //   27: lconst_1
    //   28: lcmp
    //   29: ifne -> 45
    //   32: aload_1
    //   33: invokevirtual e : ()J
    //   36: lstore_2
    //   37: aload_0
    //   38: lload_2
    //   39: putfield a : J
    //   42: goto -> 58
    //   45: lload_2
    //   46: lconst_0
    //   47: lcmp
    //   48: ifne -> 58
    //   51: ldc2_w -1
    //   54: lstore_2
    //   55: goto -> 37
    //   58: aload_0
    //   59: getfield b : Ljava/lang/String;
    //   62: ldc 'uuid'
    //   64: invokevirtual equals : (Ljava/lang/Object;)Z
    //   67: ifeq -> 80
    //   70: aload_0
    //   71: aload_1
    //   72: bipush #16
    //   74: invokevirtual c : (I)Ljava/lang/String;
    //   77: putfield c : Ljava/lang/String;
    //   80: return
  }
  
  public b(b paramb) {
    this.a = paramb.a;
    this.b = paramb.b;
    this.c = paramb.c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/y/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */