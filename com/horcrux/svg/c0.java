package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

class c0 {
  final double a = 0.0D;
  
  final b b = b.c;
  
  private c0() {}
  
  c0(double paramDouble) {}
  
  private c0(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_1
    //   5: invokevirtual trim : ()Ljava/lang/String;
    //   8: astore #7
    //   10: aload #7
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: iload #5
    //   19: iconst_1
    //   20: isub
    //   21: istore #4
    //   23: iload #5
    //   25: ifeq -> 445
    //   28: aload #7
    //   30: ldc 'normal'
    //   32: invokevirtual equals : (Ljava/lang/Object;)Z
    //   35: ifeq -> 41
    //   38: goto -> 445
    //   41: aload #7
    //   43: iload #4
    //   45: invokevirtual codePointAt : (I)I
    //   48: bipush #37
    //   50: if_icmpne -> 80
    //   53: aload_0
    //   54: getstatic com/horcrux/svg/c0$b.e : Lcom/horcrux/svg/c0$b;
    //   57: putfield b : Lcom/horcrux/svg/c0$b;
    //   60: aload #7
    //   62: iconst_0
    //   63: iload #4
    //   65: invokevirtual substring : (II)Ljava/lang/String;
    //   68: astore_1
    //   69: aload_1
    //   70: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Double;
    //   73: invokevirtual doubleValue : ()D
    //   76: dstore_2
    //   77: goto -> 454
    //   80: iload #5
    //   82: iconst_2
    //   83: isub
    //   84: istore #6
    //   86: iload #6
    //   88: ifle -> 432
    //   91: aload #7
    //   93: iload #6
    //   95: invokevirtual substring : (I)Ljava/lang/String;
    //   98: astore_1
    //   99: aload_1
    //   100: invokevirtual hashCode : ()I
    //   103: istore #4
    //   105: iload #4
    //   107: sipush #3178
    //   110: if_icmpeq -> 278
    //   113: iload #4
    //   115: sipush #3240
    //   118: if_icmpeq -> 263
    //   121: iload #4
    //   123: sipush #3251
    //   126: if_icmpeq -> 248
    //   129: iload #4
    //   131: sipush #3365
    //   134: if_icmpeq -> 232
    //   137: iload #4
    //   139: sipush #3488
    //   142: if_icmpeq -> 217
    //   145: iload #4
    //   147: sipush #3571
    //   150: if_icmpeq -> 202
    //   153: iload #4
    //   155: sipush #3588
    //   158: if_icmpeq -> 187
    //   161: iload #4
    //   163: sipush #3592
    //   166: if_icmpeq -> 172
    //   169: goto -> 294
    //   172: aload_1
    //   173: ldc 'px'
    //   175: invokevirtual equals : (Ljava/lang/Object;)Z
    //   178: ifeq -> 294
    //   181: iconst_0
    //   182: istore #4
    //   184: goto -> 297
    //   187: aload_1
    //   188: ldc 'pt'
    //   190: invokevirtual equals : (Ljava/lang/Object;)Z
    //   193: ifeq -> 294
    //   196: iconst_3
    //   197: istore #4
    //   199: goto -> 297
    //   202: aload_1
    //   203: ldc 'pc'
    //   205: invokevirtual equals : (Ljava/lang/Object;)Z
    //   208: ifeq -> 294
    //   211: iconst_4
    //   212: istore #4
    //   214: goto -> 297
    //   217: aload_1
    //   218: ldc 'mm'
    //   220: invokevirtual equals : (Ljava/lang/Object;)Z
    //   223: ifeq -> 294
    //   226: iconst_5
    //   227: istore #4
    //   229: goto -> 297
    //   232: aload_1
    //   233: ldc 'in'
    //   235: invokevirtual equals : (Ljava/lang/Object;)Z
    //   238: ifeq -> 294
    //   241: bipush #7
    //   243: istore #4
    //   245: goto -> 297
    //   248: aload_1
    //   249: ldc 'ex'
    //   251: invokevirtual equals : (Ljava/lang/Object;)Z
    //   254: ifeq -> 294
    //   257: iconst_2
    //   258: istore #4
    //   260: goto -> 297
    //   263: aload_1
    //   264: ldc 'em'
    //   266: invokevirtual equals : (Ljava/lang/Object;)Z
    //   269: ifeq -> 294
    //   272: iconst_1
    //   273: istore #4
    //   275: goto -> 297
    //   278: aload_1
    //   279: ldc 'cm'
    //   281: invokevirtual equals : (Ljava/lang/Object;)Z
    //   284: ifeq -> 294
    //   287: bipush #6
    //   289: istore #4
    //   291: goto -> 297
    //   294: iconst_m1
    //   295: istore #4
    //   297: iload #4
    //   299: tableswitch default -> 344, 0 -> 407, 1 -> 400, 2 -> 393, 3 -> 386, 4 -> 379, 5 -> 372, 6 -> 365, 7 -> 358
    //   344: aload_0
    //   345: getstatic com/horcrux/svg/c0$b.d : Lcom/horcrux/svg/c0$b;
    //   348: putfield b : Lcom/horcrux/svg/c0$b;
    //   351: iload #5
    //   353: istore #4
    //   355: goto -> 420
    //   358: getstatic com/horcrux/svg/c0$b.k : Lcom/horcrux/svg/c0$b;
    //   361: astore_1
    //   362: goto -> 411
    //   365: getstatic com/horcrux/svg/c0$b.i : Lcom/horcrux/svg/c0$b;
    //   368: astore_1
    //   369: goto -> 411
    //   372: getstatic com/horcrux/svg/c0$b.j : Lcom/horcrux/svg/c0$b;
    //   375: astore_1
    //   376: goto -> 411
    //   379: getstatic com/horcrux/svg/c0$b.m : Lcom/horcrux/svg/c0$b;
    //   382: astore_1
    //   383: goto -> 411
    //   386: getstatic com/horcrux/svg/c0$b.l : Lcom/horcrux/svg/c0$b;
    //   389: astore_1
    //   390: goto -> 411
    //   393: getstatic com/horcrux/svg/c0$b.g : Lcom/horcrux/svg/c0$b;
    //   396: astore_1
    //   397: goto -> 411
    //   400: getstatic com/horcrux/svg/c0$b.f : Lcom/horcrux/svg/c0$b;
    //   403: astore_1
    //   404: goto -> 411
    //   407: getstatic com/horcrux/svg/c0$b.d : Lcom/horcrux/svg/c0$b;
    //   410: astore_1
    //   411: aload_0
    //   412: aload_1
    //   413: putfield b : Lcom/horcrux/svg/c0$b;
    //   416: iload #6
    //   418: istore #4
    //   420: aload #7
    //   422: iconst_0
    //   423: iload #4
    //   425: invokevirtual substring : (II)Ljava/lang/String;
    //   428: astore_1
    //   429: goto -> 69
    //   432: aload_0
    //   433: getstatic com/horcrux/svg/c0$b.d : Lcom/horcrux/svg/c0$b;
    //   436: putfield b : Lcom/horcrux/svg/c0$b;
    //   439: aload #7
    //   441: astore_1
    //   442: goto -> 69
    //   445: aload_0
    //   446: getstatic com/horcrux/svg/c0$b.c : Lcom/horcrux/svg/c0$b;
    //   449: putfield b : Lcom/horcrux/svg/c0$b;
    //   452: dconst_0
    //   453: dstore_2
    //   454: aload_0
    //   455: dload_2
    //   456: putfield a : D
    //   459: return
  }
  
  static ArrayList<c0> a(Dynamic paramDynamic) {
    int i = a.a[paramDynamic.getType().ordinal()];
    if (i != 1) {
      ReadableArray readableArray;
      if (i != 2) {
        if (i != 3)
          return null; 
        readableArray = paramDynamic.asArray();
        int j = readableArray.size();
        ArrayList<c0> arrayList3 = new ArrayList(j);
        for (i = 0; i < j; i++)
          arrayList3.add(b(readableArray.getDynamic(i))); 
        return arrayList3;
      } 
      ArrayList<c0> arrayList = new ArrayList(1);
      c0 c03 = new c0(readableArray.asString());
      arrayList1 = arrayList;
      arrayList1.add(c03);
      return arrayList1;
    } 
    ArrayList<c0> arrayList2 = new ArrayList(1);
    c0 c02 = new c0(arrayList1.asDouble());
    ArrayList<c0> arrayList1 = arrayList2;
    c0 c01 = c02;
    arrayList1.add(c01);
    return arrayList1;
  }
  
  static c0 b(Dynamic paramDynamic) {
    int i = a.a[paramDynamic.getType().ordinal()];
    return (i != 1) ? ((i != 2) ? new c0() : new c0(paramDynamic.asString())) : new c0(paramDynamic.asDouble());
  }
  
  static String c(Dynamic paramDynamic) {
    int i = a.a[paramDynamic.getType().ordinal()];
    return (i != 1) ? ((i != 2) ? null : paramDynamic.asString()) : String.valueOf(paramDynamic.asDouble());
  }
  
  public enum b {
    c, d, e, f, g, h, i, j, k, l, m;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */