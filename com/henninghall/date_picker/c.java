package com.henninghall.date_picker;

import android.util.Log;
import com.henninghall.date_picker.k.a;
import com.henninghall.date_picker.k.b;
import com.henninghall.date_picker.k.c;
import com.henninghall.date_picker.k.d;
import java.util.ArrayList;
import java.util.Arrays;

public class c {
  private final i a;
  
  c(i parami) {
    this.a = parami;
  }
  
  private ArrayList<d> h() {
    String str = e.b(this.a.g()).replaceAll("\\('(.+?)'\\)", "\\${$1}").replaceAll("'.+?'", "").replaceAll("\\$\\{(.+?)\\}", "('$1')");
    ArrayList arrayList = new ArrayList(Arrays.asList((Object[])d.values()));
    ArrayList<d> arrayList1 = new ArrayList();
    arrayList.remove(d.c);
    arrayList1.add(d.c);
    char[] arrayOfChar = str.toCharArray();
    int k = arrayOfChar.length;
    int j = 0;
    while (true) {
      if (j < k) {
        char c1 = arrayOfChar[j];
        try {
          d d = j.a(c1);
          if (arrayList.contains(d)) {
            arrayList.remove(d);
            arrayList1.add(d);
          } 
        } catch (Exception exception) {}
        j++;
        continue;
      } 
      if (arrayList.contains(d.i)) {
        arrayList.remove(d.i);
        arrayList1.add(d.i);
      } 
      if (!arrayList.isEmpty()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(arrayList.size());
        stringBuilder.append(" wheel types cannot be ordered. Wheel type 0: ");
        stringBuilder.append(arrayList.get(0));
        Log.e("RNDatePicker", stringBuilder.toString());
      } 
      return arrayList1;
    } 
  }
  
  public ArrayList<d> a() {
    ArrayList<d> arrayList3 = h();
    ArrayList<d> arrayList1 = d();
    ArrayList<d> arrayList2 = new ArrayList();
    for (d d : arrayList3) {
      if (arrayList1.contains(d))
        arrayList2.add(d); 
    } 
    return arrayList2;
  }
  
  public int b() {
    int j = a.b[this.a.o().ordinal()];
    return (j != 1) ? ((j != 2) ? h.ios_clone : h.ios_clone) : h.native_picker;
  }
  
  public int c() {
    int k = this.a.e().intValue() / 35;
    int j = k;
    if (k % 2 == 0)
      j = k + 1; 
    return j;
  }
  
  public ArrayList<d> d() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: aload_0
    //   9: getfield a : Lcom/henninghall/date_picker/i;
    //   12: invokevirtual l : ()Lcom/henninghall/date_picker/k/b;
    //   15: astore #4
    //   17: getstatic com/henninghall/date_picker/c$a.a : [I
    //   20: aload #4
    //   22: invokevirtual ordinal : ()I
    //   25: iaload
    //   26: istore_1
    //   27: iload_1
    //   28: iconst_1
    //   29: if_icmpeq -> 68
    //   32: iload_1
    //   33: iconst_2
    //   34: if_icmpeq -> 76
    //   37: iload_1
    //   38: iconst_3
    //   39: if_icmpeq -> 45
    //   42: goto -> 94
    //   45: aload_3
    //   46: getstatic com/henninghall/date_picker/k/d.f : Lcom/henninghall/date_picker/k/d;
    //   49: invokevirtual add : (Ljava/lang/Object;)Z
    //   52: pop
    //   53: aload_3
    //   54: getstatic com/henninghall/date_picker/k/d.e : Lcom/henninghall/date_picker/k/d;
    //   57: invokevirtual add : (Ljava/lang/Object;)Z
    //   60: pop
    //   61: getstatic com/henninghall/date_picker/k/d.d : Lcom/henninghall/date_picker/k/d;
    //   64: astore_2
    //   65: goto -> 88
    //   68: aload_3
    //   69: getstatic com/henninghall/date_picker/k/d.c : Lcom/henninghall/date_picker/k/d;
    //   72: invokevirtual add : (Ljava/lang/Object;)Z
    //   75: pop
    //   76: aload_3
    //   77: getstatic com/henninghall/date_picker/k/d.g : Lcom/henninghall/date_picker/k/d;
    //   80: invokevirtual add : (Ljava/lang/Object;)Z
    //   83: pop
    //   84: getstatic com/henninghall/date_picker/k/d.h : Lcom/henninghall/date_picker/k/d;
    //   87: astore_2
    //   88: aload_3
    //   89: aload_2
    //   90: invokevirtual add : (Ljava/lang/Object;)Z
    //   93: pop
    //   94: aload #4
    //   96: getstatic com/henninghall/date_picker/k/b.d : Lcom/henninghall/date_picker/k/b;
    //   99: if_acmpeq -> 110
    //   102: aload #4
    //   104: getstatic com/henninghall/date_picker/k/b.e : Lcom/henninghall/date_picker/k/b;
    //   107: if_acmpne -> 131
    //   110: aload_0
    //   111: getfield a : Lcom/henninghall/date_picker/i;
    //   114: getfield o : Lcom/henninghall/date_picker/c;
    //   117: invokevirtual g : ()Z
    //   120: ifeq -> 131
    //   123: aload_3
    //   124: getstatic com/henninghall/date_picker/k/d.i : Lcom/henninghall/date_picker/k/d;
    //   127: invokevirtual add : (Ljava/lang/Object;)Z
    //   130: pop
    //   131: aload_3
    //   132: areturn
  }
  
  public boolean e() {
    return (this.a.o() == c.d);
  }
  
  public boolean f() {
    return (this.a.l() == b.d && !g());
  }
  
  public boolean g() {
    return (this.a.f() == a.d) ? e.c(this.a.g()) : j.a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */