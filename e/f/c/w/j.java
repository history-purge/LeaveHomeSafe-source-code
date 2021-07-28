package e.f.c.w;

import e.f.c.a;
import e.f.c.e;
import e.f.c.m;
import e.f.c.n;
import e.f.c.s.a;
import java.util.Collection;
import java.util.Map;

public final class j extends k {
  private final p[] a;
  
  public j(Map<e, ?> paramMap) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_1
    //   5: ifnonnull -> 13
    //   8: aconst_null
    //   9: astore_1
    //   10: goto -> 26
    //   13: aload_1
    //   14: getstatic e/f/c/e.e : Le/f/c/e;
    //   17: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   22: checkcast java/util/Collection
    //   25: astore_1
    //   26: new java/util/ArrayList
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: astore_3
    //   34: aload_1
    //   35: ifnull -> 144
    //   38: aload_1
    //   39: getstatic e/f/c/a.j : Le/f/c/a;
    //   42: invokeinterface contains : (Ljava/lang/Object;)Z
    //   47: ifeq -> 69
    //   50: new e/f/c/w/e
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: astore_2
    //   58: aload_3
    //   59: aload_2
    //   60: invokeinterface add : (Ljava/lang/Object;)Z
    //   65: pop
    //   66: goto -> 92
    //   69: aload_1
    //   70: getstatic e/f/c/a.q : Le/f/c/a;
    //   73: invokeinterface contains : (Ljava/lang/Object;)Z
    //   78: ifeq -> 92
    //   81: new e/f/c/w/l
    //   84: dup
    //   85: invokespecial <init> : ()V
    //   88: astore_2
    //   89: goto -> 58
    //   92: aload_1
    //   93: getstatic e/f/c/a.i : Le/f/c/a;
    //   96: invokeinterface contains : (Ljava/lang/Object;)Z
    //   101: ifeq -> 118
    //   104: aload_3
    //   105: new e/f/c/w/f
    //   108: dup
    //   109: invokespecial <init> : ()V
    //   112: invokeinterface add : (Ljava/lang/Object;)Z
    //   117: pop
    //   118: aload_1
    //   119: getstatic e/f/c/a.r : Le/f/c/a;
    //   122: invokeinterface contains : (Ljava/lang/Object;)Z
    //   127: ifeq -> 144
    //   130: aload_3
    //   131: new e/f/c/w/q
    //   134: dup
    //   135: invokespecial <init> : ()V
    //   138: invokeinterface add : (Ljava/lang/Object;)Z
    //   143: pop
    //   144: aload_3
    //   145: invokeinterface isEmpty : ()Z
    //   150: ifeq -> 195
    //   153: aload_3
    //   154: new e/f/c/w/e
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: invokeinterface add : (Ljava/lang/Object;)Z
    //   166: pop
    //   167: aload_3
    //   168: new e/f/c/w/f
    //   171: dup
    //   172: invokespecial <init> : ()V
    //   175: invokeinterface add : (Ljava/lang/Object;)Z
    //   180: pop
    //   181: aload_3
    //   182: new e/f/c/w/q
    //   185: dup
    //   186: invokespecial <init> : ()V
    //   189: invokeinterface add : (Ljava/lang/Object;)Z
    //   194: pop
    //   195: aload_0
    //   196: aload_3
    //   197: aload_3
    //   198: invokeinterface size : ()I
    //   203: anewarray e/f/c/w/p
    //   206: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   211: checkcast [Le/f/c/w/p;
    //   214: putfield a : [Le/f/c/w/p;
    //   217: return
  }
  
  public n a(int paramInt, a parama, Map<e, ?> paramMap) {
    boolean bool1;
    boolean bool2;
    Collection collection;
    n n;
    int[] arrayOfInt = p.a(parama);
    p[] arrayOfP = this.a;
    int m = arrayOfP.length;
    int i = 0;
    while (true) {
      if (i < m) {
        p p1 = arrayOfP[i];
        try {
          n = p1.a(paramInt, parama, arrayOfInt, paramMap);
          if (n.a() == a.j && n.e().charAt(0) == '0') {
            boolean bool = true;
            break;
          } 
        } catch (m m1) {
          i++;
          continue;
        } 
      } else {
        e.f.c.j j1 = e.f.c.j.a();
        throw j1;
      } 
      bool1 = false;
      break;
    } 
    if (paramMap == null) {
      collection = null;
    } else {
      collection = (Collection)paramMap.get(e.e);
    } 
    if (collection == null || collection.contains(a.q)) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (bool1 && bool2) {
      n n1 = new n(n.e().substring(1), n.b(), n.d(), a.q);
      n1.a(n.c());
      return n1;
    } 
    return n;
  }
  
  public void a() {
    p[] arrayOfP = this.a;
    int m = arrayOfP.length;
    for (int i = 0; i < m; i++)
      arrayOfP[i].a(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */